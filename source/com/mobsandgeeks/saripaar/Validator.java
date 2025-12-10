package com.mobsandgeeks.saripaar;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.mobsandgeeks.saripaar.adapter.CheckBoxBooleanAdapter;
import com.mobsandgeeks.saripaar.adapter.RadioButtonBooleanAdapter;
import com.mobsandgeeks.saripaar.adapter.RadioGroupBooleanAdapter;
import com.mobsandgeeks.saripaar.adapter.SpinnerIndexAdapter;
import com.mobsandgeeks.saripaar.adapter.ViewDataAdapter;
import com.mobsandgeeks.saripaar.annotation.AssertFalse;
import com.mobsandgeeks.saripaar.annotation.AssertTrue;
import com.mobsandgeeks.saripaar.annotation.Checked;
import com.mobsandgeeks.saripaar.annotation.ConfirmEmail;
import com.mobsandgeeks.saripaar.annotation.ConfirmPassword;
import com.mobsandgeeks.saripaar.annotation.CreditCard;
import com.mobsandgeeks.saripaar.annotation.DecimalMax;
import com.mobsandgeeks.saripaar.annotation.DecimalMin;
import com.mobsandgeeks.saripaar.annotation.Digits;
import com.mobsandgeeks.saripaar.annotation.Domain;
import com.mobsandgeeks.saripaar.annotation.Email;
import com.mobsandgeeks.saripaar.annotation.Future;
import com.mobsandgeeks.saripaar.annotation.IpAddress;
import com.mobsandgeeks.saripaar.annotation.Isbn;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.Max;
import com.mobsandgeeks.saripaar.annotation.Min;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import com.mobsandgeeks.saripaar.annotation.Password;
import com.mobsandgeeks.saripaar.annotation.Past;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import com.mobsandgeeks.saripaar.annotation.Select;
import com.mobsandgeeks.saripaar.annotation.Url;
import com.mobsandgeeks.saripaar.annotation.ValidateUsing;
import com.mobsandgeeks.saripaar.exception.ConversionException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class Validator {
    private static final Registry SARIPAAR_REGISTRY;
    private AsyncValidationTask mAsyncValidationTask;
    private Object mController;
    private boolean mOrderedFields;
    private final Map<Class<? extends View>, HashMap<Class<?>, ViewDataAdapter>> mRegisteredAdaptersMap = new HashMap();
    private SequenceComparator mSequenceComparator;
    private ValidationContext mValidationContext;
    private ValidationListener mValidationListener;
    private Mode mValidationMode;
    private Map<View, ArrayList<Pair<Rule, ViewDataAdapter>>> mViewRulesMap;
    private ViewValidatedAction mViewValidatedAction;
    private Handler mViewValidatedActionHandler;

    /* loaded from: classes5.dex */
    public class AsyncValidationTask extends AsyncTask<Void, Void, ValidationReport> {
        private boolean mOrderedRules;
        private String mReasonSuffix;
        private View mView;

        public AsyncValidationTask(View view, boolean z, String str) {
            this.mView = view;
            this.mOrderedRules = z;
            this.mReasonSuffix = str;
        }

        @Override // android.os.AsyncTask
        public ValidationReport doInBackground(Void... voidArr) {
            return Validator.this.validateTill(this.mView, this.mOrderedRules, this.mReasonSuffix);
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(ValidationReport validationReport) {
            Validator.this.triggerValidationListenerCallback(validationReport);
        }
    }

    /* loaded from: classes5.dex */
    public enum Mode {
        BURST,
        IMMEDIATE
    }

    /* loaded from: classes5.dex */
    public interface ValidationListener {
        void onValidationFailed(List<ValidationError> list);

        void onValidationSucceeded();
    }

    /* loaded from: classes5.dex */
    public static class ValidationReport {
        List<ValidationError> errors;
        boolean hasMoreErrors;

        public ValidationReport(List<ValidationError> list, boolean z) {
            this.errors = list;
            this.hasMoreErrors = z;
        }
    }

    /* loaded from: classes5.dex */
    public interface ViewValidatedAction {
        void onAllRulesPassed(View view);
    }

    static {
        Registry registry = new Registry();
        SARIPAAR_REGISTRY = registry;
        registry.register(CheckBox.class, Boolean.class, new CheckBoxBooleanAdapter(), AssertFalse.class, AssertTrue.class, Checked.class);
        registry.register(RadioGroup.class, Boolean.class, new RadioGroupBooleanAdapter(), Checked.class);
        registry.register(RadioButton.class, Boolean.class, new RadioButtonBooleanAdapter(), AssertFalse.class, AssertTrue.class, Checked.class);
        registry.register(Spinner.class, Integer.class, new SpinnerIndexAdapter(), Select.class);
        registry.register(DecimalMax.class, DecimalMin.class);
        registry.register(Max.class, Min.class);
        registry.register(ConfirmEmail.class, ConfirmPassword.class, CreditCard.class, Digits.class, Domain.class, Email.class, Future.class, IpAddress.class, Isbn.class, Length.class, NotEmpty.class, Password.class, Past.class, Pattern.class, Url.class);
    }

    public Validator(Object obj) {
        assertNotNull(obj, "controller");
        this.mController = obj;
        this.mValidationMode = Mode.BURST;
        this.mSequenceComparator = new SequenceComparator();
        this.mViewValidatedAction = new DefaultViewValidatedAction();
        if (obj instanceof Activity) {
            this.mValidationContext = new ValidationContext((Activity) obj);
        } else if (obj instanceof Fragment) {
            this.mValidationContext = new ValidationContext(((Fragment) obj).getActivity());
        }
    }

    private static void assertNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException(String.format("'%s' cannot be null.", str));
    }

    private void assertOrderedFields(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalStateException("Rules are unordered, all view fields should be ordered using the '@Order' annotation " + str);
    }

    private Map<View, ArrayList<Pair<Rule, ViewDataAdapter>>> createRules(List<Field> list) {
        Annotation[] annotations;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Field field : list) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : field.getAnnotations()) {
                if (isSaripaarAnnotation(annotation.annotationType())) {
                    arrayList.add(getRuleAdapterPair(annotation, field));
                }
            }
            Collections.sort(arrayList, this.mSequenceComparator);
            linkedHashMap.put(getView(field), arrayList);
        }
        return linkedHashMap;
    }

    private void createRulesSafelyAndLazily(boolean z) {
        if (this.mViewRulesMap == null) {
            Map<View, ArrayList<Pair<Rule, ViewDataAdapter>>> createRules = createRules(getSaripaarAnnotatedFields(this.mController.getClass()));
            this.mViewRulesMap = createRules;
            this.mValidationContext.setViewRulesMap(createRules);
        }
        if (!z && this.mViewRulesMap.size() == 0) {
            throw new IllegalStateException("No rules found. You must have at least one rule to validate. If you are using custom annotations, make sure that you have registered them using the 'Validator.register()' method.");
        }
    }

    private Context getContext(Field field) {
        try {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return ((View) field.get(this.mController)).getContext();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<Field> getControllerViewFields(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getViewFields(cls));
        for (Class<? super Object> superclass = cls.getSuperclass(); !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            List<Field> viewFields = getViewFields(superclass);
            if (viewFields.size() > 0) {
                arrayList.addAll(viewFields);
            }
        }
        return arrayList;
    }

    private ViewDataAdapter getDataAdapter(Class<? extends Annotation> cls, Class<?> cls2, Class<?> cls3) {
        ViewDataAdapter dataAdapter = SARIPAAR_REGISTRY.getDataAdapter(cls, cls2);
        if (dataAdapter == null) {
            HashMap<Class<?>, ViewDataAdapter> hashMap = this.mRegisteredAdaptersMap.get(cls2);
            if (hashMap != null) {
                return hashMap.get(cls3);
            }
            return null;
        }
        return dataAdapter;
    }

    private View getLastView() {
        Iterator<View> it = this.mViewRulesMap.keySet().iterator();
        View view = null;
        while (it.hasNext()) {
            view = it.next();
        }
        return view;
    }

    private Pair<Rule, ViewDataAdapter> getRuleAdapterPair(Annotation annotation, Field field) {
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Class<?> type = field.getType();
        Class<?> ruleDataType = Reflector.getRuleDataType(annotation);
        ViewDataAdapter dataAdapter = getDataAdapter(annotationType, type, ruleDataType);
        if (dataAdapter != null) {
            if (this.mValidationContext == null) {
                this.mValidationContext = new ValidationContext(getContext(field));
            }
            return new Pair<>(Reflector.instantiateRule(getRuleType(annotation), annotation, this.mValidationContext), dataAdapter);
        }
        String name = type.getName();
        throw new UnsupportedOperationException(String.format("To use '%s' on '%s', register a '%s' that returns a '%s' from the '%s'.", annotationType.getName(), name, ViewDataAdapter.class.getName(), ruleDataType.getName(), name));
    }

    private Class<? extends AnnotationRule> getRuleType(Annotation annotation) {
        ValidateUsing validateUsing = (ValidateUsing) annotation.annotationType().getAnnotation(ValidateUsing.class);
        if (validateUsing != null) {
            return validateUsing.value();
        }
        return null;
    }

    private List<Field> getSaripaarAnnotatedFields(Class<?> cls) {
        Set<Class<? extends Annotation>> registeredAnnotations = SARIPAAR_REGISTRY.getRegisteredAnnotations();
        ArrayList arrayList = new ArrayList();
        for (Field field : getControllerViewFields(cls)) {
            if (isSaripaarAnnotatedField(field, registeredAnnotations)) {
                arrayList.add(field);
            }
        }
        SaripaarFieldsComparator saripaarFieldsComparator = new SaripaarFieldsComparator();
        Collections.sort(arrayList, saripaarFieldsComparator);
        boolean z = false;
        if (arrayList.size() != 1 ? !(arrayList.size() == 0 || !saripaarFieldsComparator.areOrderedFields()) : ((Field) arrayList.get(0)).getAnnotation(Order.class) != null) {
            z = true;
        }
        this.mOrderedFields = z;
        return arrayList;
    }

    private ValidationReport getValidationReport(View view, Map<View, ArrayList<Pair<Rule, ViewDataAdapter>>> map, Mode mode) {
        boolean z;
        ViewValidatedAction viewValidatedAction;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Set<View> keySet = map.keySet();
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = false;
        loop0: for (View view2 : keySet) {
            ArrayList<Pair<Rule, ViewDataAdapter>> arrayList2 = map.get(view2);
            int size = arrayList2.size();
            ArrayList arrayList3 = null;
            for (int i = 0; i < size; i++) {
                if (view2.isShown() && view2.isEnabled()) {
                    Pair<Rule, ViewDataAdapter> pair = arrayList2.get(i);
                    Rule validateViewWithRule = validateViewWithRule(view2, (Rule) pair.first, (ViewDataAdapter) pair.second);
                    if (size == i + 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (validateViewWithRule != null) {
                        if (z) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                arrayList.add(new ValidationError(view2, arrayList3));
                            }
                            arrayList3.add(validateViewWithRule);
                        } else {
                            z3 = true;
                        }
                        if (Mode.IMMEDIATE.equals(mode) && z2) {
                            break loop0;
                        }
                    }
                    if (view2.equals(view) && z2) {
                        z = false;
                    }
                }
            }
            if (arrayList3 == null || arrayList3.size() == 0) {
                if (!z3 && (viewValidatedAction = this.mViewValidatedAction) != null) {
                    triggerViewValidatedCallback(viewValidatedAction, view2);
                }
            }
        }
        return new ValidationReport(arrayList, z3);
    }

    private View getView(Field field) {
        View view = null;
        try {
            field.setAccessible(true);
            View view2 = (View) field.get(this.mController);
            if (view2 == null) {
                try {
                    throw new IllegalStateException(String.format("'%s %s' is null.", field.getType().getSimpleName(), field.getName()));
                } catch (IllegalAccessException e) {
                    e = e;
                    view = view2;
                    e.printStackTrace();
                    return view;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    view = view2;
                    e.printStackTrace();
                    return view;
                }
            }
            return view2;
        } catch (IllegalAccessException e3) {
            e = e3;
        } catch (IllegalArgumentException e4) {
            e = e4;
        }
    }

    private View getViewBefore(View view) {
        ArrayList arrayList = new ArrayList(this.mViewRulesMap.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((View) arrayList.get(i)) == view) {
                if (i <= 0) {
                    return null;
                }
                return (View) arrayList.get(i - 1);
            }
        }
        return null;
    }

    private List<Field> getViewFields(Class<?> cls) {
        Field[] declaredFields;
        ArrayList arrayList = new ArrayList();
        for (Field field : cls.getDeclaredFields()) {
            if (View.class.isAssignableFrom(field.getType())) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    private boolean isSaripaarAnnotatedField(Field field, Set<Class<? extends Annotation>> set) {
        boolean z;
        boolean z2;
        if (field.getAnnotation(Order.class) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            z2 = false;
            for (Annotation annotation : field.getAnnotations()) {
                z2 = set.contains(annotation.annotationType());
                if (z2) {
                    break;
                }
            }
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    public static boolean isSaripaarAnnotation(Class<? extends Annotation> cls) {
        return SARIPAAR_REGISTRY.getRegisteredAnnotations().contains(cls);
    }

    public static void registerAnnotation(Class<? extends Annotation> cls) {
        SARIPAAR_REGISTRY.register(cls);
    }

    private void runOnMainThread(Runnable runnable) {
        if (this.mViewValidatedActionHandler == null) {
            this.mViewValidatedActionHandler = new Handler(Looper.getMainLooper());
        }
        this.mViewValidatedActionHandler.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void triggerValidationListenerCallback(ValidationReport validationReport) {
        List<ValidationError> list = validationReport.errors;
        if (list.size() == 0 && !validationReport.hasMoreErrors) {
            this.mValidationListener.onValidationSucceeded();
        } else {
            this.mValidationListener.onValidationFailed(list);
        }
    }

    private void triggerViewValidatedCallback(final ViewValidatedAction viewValidatedAction, final View view) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            viewValidatedAction.onAllRulesPassed(view);
        } else {
            runOnMainThread(new Runnable() { // from class: com.mobsandgeeks.saripaar.Validator.1
                @Override // java.lang.Runnable
                public void run() {
                    viewValidatedAction.onAllRulesPassed(view);
                }
            });
        }
    }

    private void validateFieldsWithCallbackTill(View view, boolean z, String str, boolean z2) {
        createRulesSafelyAndLazily(false);
        if (z2) {
            AsyncValidationTask asyncValidationTask = this.mAsyncValidationTask;
            if (asyncValidationTask != null) {
                asyncValidationTask.cancel(true);
            }
            AsyncValidationTask asyncValidationTask2 = new AsyncValidationTask(view, z, str);
            this.mAsyncValidationTask = asyncValidationTask2;
            asyncValidationTask2.execute((Object[]) null);
            return;
        }
        triggerValidationListenerCallback(validateTill(view, z, str));
    }

    private void validateOrderedFieldsWithCallbackTill(View view, String str, boolean z) {
        validateFieldsWithCallbackTill(view, true, str, z);
    }

    private void validateUnorderedFieldsWithCallbackTill(View view, boolean z) {
        validateFieldsWithCallbackTill(view, false, null, z);
    }

    private Rule validateViewWithRule(View view, Rule rule, ViewDataAdapter viewDataAdapter) {
        boolean z = false;
        if (rule instanceof AnnotationRule) {
            try {
                z = rule.isValid(viewDataAdapter.getData(view));
            } catch (ConversionException e) {
                e.printStackTrace();
            }
        } else if (rule instanceof QuickRule) {
            z = rule.isValid(view);
        }
        if (z) {
            return null;
        }
        return rule;
    }

    public boolean cancelAsync() {
        AsyncValidationTask asyncValidationTask = this.mAsyncValidationTask;
        if (asyncValidationTask != null) {
            boolean cancel = asyncValidationTask.cancel(true);
            this.mAsyncValidationTask = null;
            return cancel;
        }
        return false;
    }

    public Mode getValidationMode() {
        return this.mValidationMode;
    }

    public boolean isValidating() {
        AsyncValidationTask asyncValidationTask = this.mAsyncValidationTask;
        if (asyncValidationTask != null && asyncValidationTask.getStatus() != AsyncTask.Status.FINISHED) {
            return true;
        }
        return false;
    }

    public <VIEW extends View> void put(VIEW view, QuickRule<VIEW>... quickRuleArr) {
        assertNotNull(view, Promotion.ACTION_VIEW);
        assertNotNull(quickRuleArr, "quickRules");
        if (quickRuleArr.length != 0) {
            if (this.mValidationContext == null) {
                this.mValidationContext = new ValidationContext(view.getContext());
            }
            createRulesSafelyAndLazily(true);
            if (this.mOrderedFields && !this.mViewRulesMap.containsKey(view)) {
                throw new IllegalStateException(String.format("All fields are ordered, so this `%s` should be ordered too, declare the view as a field and add the `@Order` annotation.", view.getClass().getName()));
            }
            ArrayList<Pair<Rule, ViewDataAdapter>> arrayList = this.mViewRulesMap.get(view);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            for (QuickRule<VIEW> quickRule : quickRuleArr) {
                if (quickRule != null) {
                    arrayList.add(new Pair<>(quickRule, null));
                }
            }
            Collections.sort(arrayList, this.mSequenceComparator);
            this.mViewRulesMap.put(view, arrayList);
            return;
        }
        throw new IllegalArgumentException("'quickRules' cannot be empty.");
    }

    public <VIEW extends View, DATA_TYPE> void registerAdapter(Class<VIEW> cls, ViewDataAdapter<VIEW, DATA_TYPE> viewDataAdapter) {
        assertNotNull(cls, "viewType");
        assertNotNull(viewDataAdapter, "viewDataAdapter");
        HashMap<Class<?>, ViewDataAdapter> hashMap = this.mRegisteredAdaptersMap.get(cls);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.mRegisteredAdaptersMap.put(cls, hashMap);
        }
        hashMap.put(Reflector.findGetDataMethod(viewDataAdapter.getClass()).getReturnType(), viewDataAdapter);
    }

    public void removeRules(View view) {
        assertNotNull(view, Promotion.ACTION_VIEW);
        if (this.mViewRulesMap == null) {
            createRulesSafelyAndLazily(false);
        }
        this.mViewRulesMap.remove(view);
    }

    public void setValidationListener(ValidationListener validationListener) {
        assertNotNull(validationListener, "validationListener");
        this.mValidationListener = validationListener;
    }

    public void setValidationMode(Mode mode) {
        assertNotNull(mode, "validationMode");
        this.mValidationMode = mode;
    }

    public void setViewValidatedAction(ViewValidatedAction viewValidatedAction) {
        this.mViewValidatedAction = viewValidatedAction;
    }

    public void validate() {
        validate(false);
    }

    public void validateBefore(View view) {
        validateBefore(view, false);
    }

    public void validateTill(View view) {
        validateTill(view, false);
    }

    public static <VIEW extends View> void registerAnnotation(Class<? extends Annotation> cls, Class<VIEW> cls2, ViewDataAdapter<VIEW, ?> viewDataAdapter) {
        SARIPAAR_REGISTRY.register(cls2, Reflector.getRuleDataType((ValidateUsing) cls.getAnnotation(ValidateUsing.class)), viewDataAdapter, cls);
    }

    public void validate(boolean z) {
        createRulesSafelyAndLazily(false);
        View lastView = getLastView();
        if (Mode.BURST.equals(this.mValidationMode)) {
            validateUnorderedFieldsWithCallbackTill(lastView, z);
            return;
        }
        Mode mode = Mode.IMMEDIATE;
        if (mode.equals(this.mValidationMode)) {
            validateOrderedFieldsWithCallbackTill(lastView, String.format("in %s mode.", mode.toString()), z);
            return;
        }
        throw new RuntimeException("This should never happen!");
    }

    public void validateBefore(View view, boolean z) {
        createRulesSafelyAndLazily(false);
        validateOrderedFieldsWithCallbackTill(getViewBefore(view), "when using 'validateBefore(View)'.", z);
    }

    public void validateTill(View view, boolean z) {
        validateOrderedFieldsWithCallbackTill(view, "when using 'validateTill(View)'.", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized ValidationReport validateTill(View view, boolean z, String str) {
        if (z) {
            try {
                assertOrderedFields(this.mOrderedFields, str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        assertNotNull(this.mValidationListener, "validationListener");
        return getValidationReport(view, this.mViewRulesMap, this.mValidationMode);
    }
}
