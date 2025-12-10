package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.EdgeToEdgeUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class MaterialDatePicker<S> extends DialogFragment {

    /* renamed from: A */
    public static final Object f49766A = "CONFIRM_BUTTON_TAG";

    /* renamed from: B */
    public static final Object f49767B = "CANCEL_BUTTON_TAG";

    /* renamed from: C */
    public static final Object f49768C = "TOGGLE_BUTTON_TAG";
    public static final int INPUT_MODE_CALENDAR = 0;
    public static final int INPUT_MODE_TEXT = 1;

    /* renamed from: a */
    public final LinkedHashSet f49769a = new LinkedHashSet();

    /* renamed from: b */
    public final LinkedHashSet f49770b = new LinkedHashSet();

    /* renamed from: c */
    public final LinkedHashSet f49771c = new LinkedHashSet();

    /* renamed from: d */
    public final LinkedHashSet f49772d = new LinkedHashSet();

    /* renamed from: e */
    public int f49773e;

    /* renamed from: f */
    public DateSelector f49774f;

    /* renamed from: g */
    public AbstractC6935c f49775g;

    /* renamed from: h */
    public CalendarConstraints f49776h;

    /* renamed from: i */
    public DayViewDecorator f49777i;

    /* renamed from: j */
    public MaterialCalendar f49778j;

    /* renamed from: k */
    public int f49779k;

    /* renamed from: l */
    public CharSequence f49780l;

    /* renamed from: m */
    public boolean f49781m;

    /* renamed from: n */
    public int f49782n;

    /* renamed from: o */
    public int f49783o;

    /* renamed from: p */
    public CharSequence f49784p;

    /* renamed from: q */
    public int f49785q;

    /* renamed from: r */
    public CharSequence f49786r;

    /* renamed from: s */
    public TextView f49787s;

    /* renamed from: t */
    public TextView f49788t;

    /* renamed from: u */
    public CheckableImageButton f49789u;

    /* renamed from: v */
    public MaterialShapeDrawable f49790v;

    /* renamed from: w */
    public Button f49791w;

    /* renamed from: x */
    public boolean f49792x;

    /* renamed from: y */
    public CharSequence f49793y;

    /* renamed from: z */
    public CharSequence f49794z;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface InputMode {
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$a */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC6919a implements View.OnClickListener {
        public View$OnClickListenerC6919a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f49769a.iterator();
            while (it.hasNext()) {
                ((MaterialPickerOnPositiveButtonClickListener) it.next()).onPositiveButtonClick(MaterialDatePicker.this.getSelection());
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$b */
    /* loaded from: classes4.dex */
    public class C6920b extends AccessibilityDelegateCompat {
        public C6920b() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(MaterialDatePicker.this.getDateSelector().getError() + ", " + ((Object) accessibilityNodeInfoCompat.getText()));
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$c */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC6921c implements View.OnClickListener {
        public View$OnClickListenerC6921c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f49770b.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$d */
    /* loaded from: classes4.dex */
    public class C6922d implements OnApplyWindowInsetsListener {

        /* renamed from: a */
        public final /* synthetic */ int f49810a;

        /* renamed from: b */
        public final /* synthetic */ View f49811b;

        /* renamed from: c */
        public final /* synthetic */ int f49812c;

        public C6922d(int i, View view, int i2) {
            this.f49810a = i;
            this.f49811b = view;
            this.f49812c = i2;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top;
            if (this.f49810a >= 0) {
                this.f49811b.getLayoutParams().height = this.f49810a + i;
                View view2 = this.f49811b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f49811b;
            view3.setPadding(view3.getPaddingLeft(), this.f49812c + i, this.f49811b.getPaddingRight(), this.f49811b.getPaddingBottom());
            return windowInsetsCompat;
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$e */
    /* loaded from: classes4.dex */
    public class C6923e extends OnSelectionChangedListener {
        public C6923e() {
        }

        @Override // com.google.android.material.datepicker.OnSelectionChangedListener
        public void onIncompleteSelectionChanged() {
            MaterialDatePicker.this.f49791w.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.OnSelectionChangedListener
        public void onSelectionChanged(Object obj) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.m44881H(materialDatePicker.getHeaderText());
            MaterialDatePicker.this.f49791w.setEnabled(MaterialDatePicker.this.getDateSelector().isSelectionComplete());
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$f */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC6924f implements View.OnClickListener {
        public View$OnClickListenerC6924f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialDatePicker.this.f49791w.setEnabled(MaterialDatePicker.this.getDateSelector().isSelectionComplete());
            MaterialDatePicker.this.f49789u.toggle();
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.m44879J(materialDatePicker.f49789u);
            MaterialDatePicker.this.m44882G();
        }
    }

    /* renamed from: B */
    public static boolean m44887B(Context context) {
        return m44883F(context, 16843277);
    }

    /* renamed from: D */
    public static boolean m44885D(Context context) {
        return m44883F(context, R.attr.nestedScrollable);
    }

    /* renamed from: E */
    public static MaterialDatePicker m44884E(Builder builder) {
        MaterialDatePicker materialDatePicker = new MaterialDatePicker();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", builder.f49796b);
        bundle.putParcelable("DATE_SELECTOR_KEY", builder.f49795a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", builder.f49797c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", builder.f49798d);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", builder.f49799e);
        bundle.putCharSequence("TITLE_TEXT_KEY", builder.f49800f);
        bundle.putInt("INPUT_MODE_KEY", builder.f49806l);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", builder.f49801g);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", builder.f49802h);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", builder.f49803i);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", builder.f49804j);
        materialDatePicker.setArguments(bundle);
        return materialDatePicker;
    }

    /* renamed from: F */
    public static boolean m44883F(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.resolveOrThrow(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DateSelector getDateSelector() {
        if (this.f49774f == null) {
            this.f49774f = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f49774f;
    }

    public static long thisMonthInUtcMilliseconds() {
        return C21662pt0.m23564d().f76799f;
    }

    public static long todayInUtcMilliseconds() {
        return AbstractC22545v02.m1135o().getTimeInMillis();
    }

    /* renamed from: u */
    public static Drawable m44871u(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, AppCompatResources.getDrawable(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AppCompatResources.getDrawable(context, R.drawable.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: w */
    public static CharSequence m44869w(CharSequence charSequence) {
        if (charSequence != null) {
            String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                return split[0];
            }
            return charSequence;
        }
        return null;
    }

    /* renamed from: y */
    public static int m44867y(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        int i = C21662pt0.m23564d().f76797d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: A */
    public final void m44888A(Context context) {
        boolean z;
        this.f49789u.setTag(f49768C);
        this.f49789u.setImageDrawable(m44871u(context));
        CheckableImageButton checkableImageButton = this.f49789u;
        if (this.f49782n != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton.setChecked(z);
        ViewCompat.setAccessibilityDelegate(this.f49789u, null);
        m44879J(this.f49789u);
        this.f49789u.setOnClickListener(new View$OnClickListenerC6924f());
    }

    /* renamed from: C */
    public final boolean m44886C() {
        if (getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public final void m44882G() {
        AbstractC6935c abstractC6935c;
        int m44866z = m44866z(requireContext());
        this.f49778j = MaterialCalendar.newInstance(getDateSelector(), m44866z, this.f49776h, this.f49777i);
        boolean isChecked = this.f49789u.isChecked();
        if (isChecked) {
            abstractC6935c = MaterialTextInputPicker.m44863m(getDateSelector(), m44866z, this.f49776h);
        } else {
            abstractC6935c = this.f49778j;
        }
        this.f49775g = abstractC6935c;
        m44880I(isChecked);
        m44881H(getHeaderText());
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.mtrl_calendar_frame, this.f49775g);
        beginTransaction.commitNow();
        this.f49775g.addOnSelectionChangedListener(new C6923e());
    }

    /* renamed from: H */
    public void m44881H(String str) {
        this.f49788t.setContentDescription(m44868x());
        this.f49788t.setText(str);
    }

    /* renamed from: I */
    public final void m44880I(boolean z) {
        CharSequence charSequence;
        TextView textView = this.f49787s;
        if (z && m44886C()) {
            charSequence = this.f49794z;
        } else {
            charSequence = this.f49793y;
        }
        textView.setText(charSequence);
    }

    /* renamed from: J */
    public final void m44879J(CheckableImageButton checkableImageButton) {
        String string;
        if (this.f49789u.isChecked()) {
            string = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f49789u.setContentDescription(string);
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.f49771c.add(onCancelListener);
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.f49772d.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.f49770b.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener<? super S> materialPickerOnPositiveButtonClickListener) {
        return this.f49769a.add(materialPickerOnPositiveButtonClickListener);
    }

    public void clearOnCancelListeners() {
        this.f49771c.clear();
    }

    public void clearOnDismissListeners() {
        this.f49772d.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.f49770b.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.f49769a.clear();
    }

    public String getHeaderText() {
        return getDateSelector().getSelectionDisplayString(getContext());
    }

    @Nullable
    public final S getSelection() {
        return (S) getDateSelector().getSelection();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator it = this.f49771c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f49773e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f49774f = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f49776h = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f49777i = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f49779k = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f49780l = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f49782n = bundle.getInt("INPUT_MODE_KEY");
        this.f49783o = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f49784p = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f49785q = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f49786r = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.f49780l;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f49779k);
        }
        this.f49793y = charSequence;
        this.f49794z = m44869w(charSequence);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m44866z(requireContext()));
        Context context = dialog.getContext();
        this.f49781m = m44887B(context);
        int resolveOrThrow = MaterialAttributes.resolveOrThrow(context, R.attr.colorSurface, MaterialDatePicker.class.getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.f49790v = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        this.f49790v.setFillColor(ColorStateList.valueOf(resolveOrThrow));
        this.f49790v.setElevation(ViewCompat.getElevation(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        if (this.f49781m) {
            i = R.layout.mtrl_picker_fullscreen;
        } else {
            i = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        DayViewDecorator dayViewDecorator = this.f49777i;
        if (dayViewDecorator != null) {
            dayViewDecorator.initialize(context);
        }
        if (this.f49781m) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m44867y(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m44867y(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f49788t = textView;
        ViewCompat.setAccessibilityLiveRegion(textView, 1);
        this.f49789u = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f49787s = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        m44888A(context);
        this.f49791w = (Button) inflate.findViewById(R.id.confirm_button);
        if (getDateSelector().isSelectionComplete()) {
            this.f49791w.setEnabled(true);
        } else {
            this.f49791w.setEnabled(false);
        }
        this.f49791w.setTag(f49766A);
        CharSequence charSequence = this.f49784p;
        if (charSequence != null) {
            this.f49791w.setText(charSequence);
        } else {
            int i2 = this.f49783o;
            if (i2 != 0) {
                this.f49791w.setText(i2);
            }
        }
        this.f49791w.setOnClickListener(new View$OnClickListenerC6919a());
        ViewCompat.setAccessibilityDelegate(this.f49791w, new C6920b());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag(f49767B);
        CharSequence charSequence2 = this.f49786r;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i3 = this.f49785q;
            if (i3 != 0) {
                button.setText(i3);
            }
        }
        button.setOnClickListener(new View$OnClickListenerC6921c());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator it = this.f49772d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        C21662pt0 m44897x;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f49773e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f49774f);
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder(this.f49776h);
        MaterialCalendar materialCalendar = this.f49778j;
        if (materialCalendar == null) {
            m44897x = null;
        } else {
            m44897x = materialCalendar.m44897x();
        }
        if (m44897x != null) {
            builder.setOpenAt(m44897x.f76799f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", builder.build());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f49777i);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f49779k);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f49780l);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f49783o);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f49784p);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f49785q);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f49786r);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f49781m) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f49790v);
            m44870v(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f49790v, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(requireDialog(), rect));
        }
        m44882G();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.f49775g.m44805l();
        super.onStop();
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.f49771c.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.f49772d.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.f49770b.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener<? super S> materialPickerOnPositiveButtonClickListener) {
        return this.f49769a.remove(materialPickerOnPositiveButtonClickListener);
    }

    /* renamed from: v */
    public final void m44870v(Window window) {
        if (this.f49792x) {
            return;
        }
        View findViewById = requireView().findViewById(R.id.fullscreen_header);
        EdgeToEdgeUtils.applyEdgeToEdge(window, true, ViewUtils.getBackgroundColor(findViewById), null);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById, new C6922d(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.f49792x = true;
    }

    /* renamed from: x */
    public final String m44868x() {
        return getDateSelector().getSelectionContentDescription(requireContext());
    }

    /* renamed from: z */
    public final int m44866z(Context context) {
        int i = this.f49773e;
        if (i != 0) {
            return i;
        }
        return getDateSelector().getDefaultThemeResId(context);
    }

    /* loaded from: classes4.dex */
    public static final class Builder<S> {

        /* renamed from: a */
        public final DateSelector f49795a;

        /* renamed from: c */
        public CalendarConstraints f49797c;

        /* renamed from: d */
        public DayViewDecorator f49798d;

        /* renamed from: b */
        public int f49796b = 0;

        /* renamed from: e */
        public int f49799e = 0;

        /* renamed from: f */
        public CharSequence f49800f = null;

        /* renamed from: g */
        public int f49801g = 0;

        /* renamed from: h */
        public CharSequence f49802h = null;

        /* renamed from: i */
        public int f49803i = 0;

        /* renamed from: j */
        public CharSequence f49804j = null;

        /* renamed from: k */
        public Object f49805k = null;

        /* renamed from: l */
        public int f49806l = 0;

        public Builder(DateSelector dateSelector) {
            this.f49795a = dateSelector;
        }

        /* renamed from: b */
        public static boolean m44864b(C21662pt0 c21662pt0, CalendarConstraints calendarConstraints) {
            if (c21662pt0.compareTo(calendarConstraints.m44929k()) >= 0 && c21662pt0.compareTo(calendarConstraints.m44933g()) <= 0) {
                return true;
            }
            return false;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static <S> Builder<S> customDatePicker(@NonNull DateSelector<S> dateSelector) {
            return new Builder<>(dateSelector);
        }

        @NonNull
        public static Builder<Long> datePicker() {
            return new Builder<>(new SingleDateSelector());
        }

        @NonNull
        public static Builder<Pair<Long, Long>> dateRangePicker() {
            return new Builder<>(new RangeDateSelector());
        }

        /* renamed from: a */
        public final C21662pt0 m44865a() {
            if (!this.f49795a.getSelectedDays().isEmpty()) {
                C21662pt0 m23565c = C21662pt0.m23565c(this.f49795a.getSelectedDays().iterator().next().longValue());
                if (m44864b(m23565c, this.f49797c)) {
                    return m23565c;
                }
            }
            C21662pt0 m23564d = C21662pt0.m23564d();
            if (!m44864b(m23564d, this.f49797c)) {
                return this.f49797c.m44929k();
            }
            return m23564d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public MaterialDatePicker<S> build() {
            if (this.f49797c == null) {
                this.f49797c = new CalendarConstraints.Builder().build();
            }
            if (this.f49799e == 0) {
                this.f49799e = this.f49795a.getDefaultTitleResId();
            }
            Object obj = this.f49805k;
            if (obj != null) {
                this.f49795a.setSelection(obj);
            }
            if (this.f49797c.m44930j() == null) {
                this.f49797c.m44926n(m44865a());
            }
            return MaterialDatePicker.m44884E(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setCalendarConstraints(CalendarConstraints calendarConstraints) {
            this.f49797c = calendarConstraints;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setDayViewDecorator(@Nullable DayViewDecorator dayViewDecorator) {
            this.f49798d = dayViewDecorator;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setInputMode(int i) {
            this.f49806l = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setNegativeButtonText(@StringRes int i) {
            this.f49803i = i;
            this.f49804j = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setPositiveButtonText(@StringRes int i) {
            this.f49801g = i;
            this.f49802h = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setSelection(S s) {
            this.f49805k = s;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat) {
            this.f49795a.setTextInputFormat(simpleDateFormat);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setTheme(@StyleRes int i) {
            this.f49796b = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setTitleText(@StringRes int i) {
            this.f49799e = i;
            this.f49800f = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setNegativeButtonText(@Nullable CharSequence charSequence) {
            this.f49804j = charSequence;
            this.f49803i = 0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setPositiveButtonText(@Nullable CharSequence charSequence) {
            this.f49802h = charSequence;
            this.f49801g = 0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setTitleText(@Nullable CharSequence charSequence) {
            this.f49800f = charSequence;
            this.f49799e = 0;
            return this;
        }
    }
}
