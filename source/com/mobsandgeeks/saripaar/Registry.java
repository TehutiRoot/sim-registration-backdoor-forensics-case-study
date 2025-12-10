package com.mobsandgeeks.saripaar;

import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import com.mobsandgeeks.saripaar.adapter.CheckBoxBooleanAdapter;
import com.mobsandgeeks.saripaar.adapter.RadioButtonBooleanAdapter;
import com.mobsandgeeks.saripaar.adapter.RadioGroupBooleanAdapter;
import com.mobsandgeeks.saripaar.adapter.SpinnerIndexAdapter;
import com.mobsandgeeks.saripaar.adapter.TextViewDoubleAdapter;
import com.mobsandgeeks.saripaar.adapter.TextViewFloatAdapter;
import com.mobsandgeeks.saripaar.adapter.TextViewIntegerAdapter;
import com.mobsandgeeks.saripaar.adapter.TextViewStringAdapter;
import com.mobsandgeeks.saripaar.adapter.ViewDataAdapter;
import com.mobsandgeeks.saripaar.annotation.ValidateUsing;
import com.mobsandgeeks.saripaar.exception.SaripaarViolationException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Registry {
    private static final Map<Class<? extends View>, HashMap<Class<?>, ViewDataAdapter>> STOCK_ADAPTERS;
    public static final String TAG = "Registry";
    private Map<Class<? extends Annotation>, HashMap<Class<? extends View>, ViewDataAdapter>> mMappings = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        STOCK_ADAPTERS = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Boolean.class, new CheckBoxBooleanAdapter());
        hashMap.put(CheckBox.class, hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(Boolean.class, new RadioButtonBooleanAdapter());
        hashMap.put(RadioButton.class, hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(Boolean.class, new RadioGroupBooleanAdapter());
        hashMap.put(RadioGroup.class, hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(Integer.class, new SpinnerIndexAdapter());
        hashMap.put(Spinner.class, hashMap5);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(String.class, new TextViewStringAdapter());
        hashMap6.put(Integer.class, new TextViewIntegerAdapter());
        hashMap6.put(Float.class, new TextViewFloatAdapter());
        hashMap6.put(Double.class, new TextViewDoubleAdapter());
        hashMap.put(TextView.class, hashMap6);
    }

    private void assertAttribute(Class<? extends Annotation> cls, String str, Class<?> cls2) {
        Method attributeMethod = Reflector.getAttributeMethod(cls, str);
        if (attributeMethod != null) {
            Class<?> returnType = attributeMethod.getReturnType();
            if (cls2.equals(returnType)) {
                return;
            }
            throw new SaripaarViolationException(String.format("'%s' in '%s' should be of type '%s', but was '%s'.", str, cls.getName(), cls2.getName(), returnType.getName()));
        }
        throw new SaripaarViolationException(String.format("'%s' requires the '%s' attribute.", cls.getName(), str));
    }

    private <DATA_TYPE, VIEW extends View> void assertCompatibleReturnType(Class<DATA_TYPE> cls, ViewDataAdapter<VIEW, DATA_TYPE> viewDataAdapter) {
        Class<?> returnType = Reflector.findGetDataMethod(viewDataAdapter.getClass()).getReturnType();
        if (cls.equals(returnType)) {
            return;
        }
        throw new IllegalArgumentException(String.format("'%s' returns '%s', but expecting '%s'.", viewDataAdapter.getClass().getName(), returnType.getName(), cls.getName()));
    }

    private void assertIsValidRuleAnnotation(Class<? extends Annotation> cls) {
        if (Reflector.isAnnotated(cls, ValidateUsing.class)) {
            Class<?> cls2 = Integer.TYPE;
            assertAttribute(cls, "sequence", cls2);
            assertAttribute(cls, "message", String.class);
            assertAttribute(cls, "messageResId", cls2);
            return;
        }
        throw new IllegalArgumentException(String.format("'%s' is not annotated with '%s'.", cls.getName(), ValidateUsing.class.getName()));
    }

    private <VIEW extends View> ViewDataAdapter getCompatibleViewDataAdapter(HashMap<Class<? extends View>, ViewDataAdapter> hashMap, Class<VIEW> cls) {
        ViewDataAdapter viewDataAdapter = null;
        for (Class<? extends View> cls2 : hashMap.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                viewDataAdapter = hashMap.get(cls2);
            }
        }
        return viewDataAdapter;
    }

    public <VIEW extends View> ViewDataAdapter<VIEW, ?> getDataAdapter(Class<? extends Annotation> cls, Class<VIEW> cls2) {
        HashMap<Class<? extends View>, ViewDataAdapter> hashMap = this.mMappings.get(cls);
        if (hashMap != null) {
            ViewDataAdapter<VIEW, ?> viewDataAdapter = hashMap.get(cls2);
            if (viewDataAdapter == null) {
                return getCompatibleViewDataAdapter(hashMap, cls2);
            }
            return viewDataAdapter;
        }
        return null;
    }

    public Set<Class<? extends Annotation>> getRegisteredAnnotations() {
        return this.mMappings.keySet();
    }

    public void register(Class<? extends Annotation>... clsArr) {
        for (Class<? extends Annotation> cls : clsArr) {
            assertIsValidRuleAnnotation(cls);
            Class<?> ruleDataType = Reflector.getRuleDataType((ValidateUsing) cls.getAnnotation(ValidateUsing.class));
            HashMap<Class<?>, ViewDataAdapter> hashMap = STOCK_ADAPTERS.get(TextView.class);
            if (hashMap != null) {
                ViewDataAdapter viewDataAdapter = hashMap.get(ruleDataType);
                if (viewDataAdapter != null) {
                    register(TextView.class, ruleDataType, viewDataAdapter, cls);
                } else {
                    throw new SaripaarViolationException(String.format("Unable to find a matching adapter for `%s`, that returns a `%s`.", cls.getName(), ruleDataType.getName()));
                }
            }
        }
    }

    public <VIEW extends View, DATA_TYPE> void register(Class<VIEW> cls, Class<DATA_TYPE> cls2, ViewDataAdapter<VIEW, DATA_TYPE> viewDataAdapter, Class<? extends Annotation>... clsArr) {
        if (clsArr == null || clsArr.length <= 0) {
            return;
        }
        for (Class<? extends Annotation> cls3 : clsArr) {
            register(cls3, cls2, cls, viewDataAdapter);
        }
    }

    private <VIEW extends View, DATA_TYPE> void register(Class<? extends Annotation> cls, Class<DATA_TYPE> cls2, Class<VIEW> cls3, ViewDataAdapter<VIEW, DATA_TYPE> viewDataAdapter) {
        HashMap<Class<? extends View>, ViewDataAdapter> hashMap;
        assertIsValidRuleAnnotation(cls);
        assertCompatibleReturnType(cls2, viewDataAdapter);
        if (this.mMappings.containsKey(cls)) {
            hashMap = this.mMappings.get(cls);
        } else {
            hashMap = new HashMap<>();
            this.mMappings.put(cls, hashMap);
        }
        if (hashMap.containsKey(cls3)) {
            Log.w(TAG, String.format("A '%s' for '%s' has already been registered.", cls.getName(), cls3.getName()));
        } else {
            hashMap.put(cls3, viewDataAdapter);
        }
    }
}
