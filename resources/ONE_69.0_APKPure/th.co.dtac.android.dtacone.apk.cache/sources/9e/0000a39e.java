package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimePickerView;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class MaterialTimePicker extends DialogFragment implements TimePickerView.InterfaceC7123d {
    public static final int INPUT_MODE_CLOCK = 0;
    public static final int INPUT_MODE_KEYBOARD = 1;

    /* renamed from: e */
    public TimePickerView f51185e;

    /* renamed from: f */
    public ViewStub f51186f;

    /* renamed from: g */
    public C7127b f51187g;

    /* renamed from: h */
    public C7131d f51188h;

    /* renamed from: i */
    public InterfaceC20445iU1 f51189i;

    /* renamed from: j */
    public int f51190j;

    /* renamed from: k */
    public int f51191k;

    /* renamed from: m */
    public CharSequence f51193m;

    /* renamed from: o */
    public CharSequence f51195o;

    /* renamed from: q */
    public CharSequence f51197q;

    /* renamed from: r */
    public MaterialButton f51198r;

    /* renamed from: s */
    public Button f51199s;

    /* renamed from: u */
    public C19580dU1 f51201u;

    /* renamed from: a */
    public final Set f51181a = new LinkedHashSet();

    /* renamed from: b */
    public final Set f51182b = new LinkedHashSet();

    /* renamed from: c */
    public final Set f51183c = new LinkedHashSet();

    /* renamed from: d */
    public final Set f51184d = new LinkedHashSet();

    /* renamed from: l */
    public int f51192l = 0;

    /* renamed from: n */
    public int f51194n = 0;

    /* renamed from: p */
    public int f51196p = 0;

    /* renamed from: t */
    public int f51200t = 0;

    /* renamed from: v */
    public int f51202v = 0;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: b */
        public Integer f51204b;

        /* renamed from: d */
        public CharSequence f51206d;

        /* renamed from: f */
        public CharSequence f51208f;

        /* renamed from: h */
        public CharSequence f51210h;

        /* renamed from: a */
        public C19580dU1 f51203a = new C19580dU1();

        /* renamed from: c */
        public int f51205c = 0;

        /* renamed from: e */
        public int f51207e = 0;

        /* renamed from: g */
        public int f51209g = 0;

        /* renamed from: i */
        public int f51211i = 0;

        @NonNull
        public MaterialTimePicker build() {
            return MaterialTimePicker.m43620z(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setHour(@IntRange(from = 0, m64693to = 23) int i) {
            this.f51203a.m31819i(i);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setInputMode(int i) {
            this.f51204b = Integer.valueOf(i);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setMinute(@IntRange(from = 0, m64693to = 59) int i) {
            this.f51203a.m31818j(i);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@StringRes int i) {
            this.f51209g = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@StringRes int i) {
            this.f51207e = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTheme(@StyleRes int i) {
            this.f51211i = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTimeFormat(int i) {
            C19580dU1 c19580dU1 = this.f51203a;
            int i2 = c19580dU1.f61253d;
            int i3 = c19580dU1.f61254e;
            C19580dU1 c19580dU12 = new C19580dU1(i);
            this.f51203a = c19580dU12;
            c19580dU12.m31818j(i3);
            this.f51203a.m31819i(i2);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTitleText(@StringRes int i) {
            this.f51205c = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@Nullable CharSequence charSequence) {
            this.f51210h = charSequence;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@Nullable CharSequence charSequence) {
            this.f51208f = charSequence;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTitleText(@Nullable CharSequence charSequence) {
            this.f51206d = charSequence;
            return this;
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$a */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC7117a implements View.OnClickListener {
        public View$OnClickListenerC7117a() {
            MaterialTimePicker.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (View.OnClickListener onClickListener : MaterialTimePicker.this.f51181a) {
                onClickListener.onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$b */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC7118b implements View.OnClickListener {
        public View$OnClickListenerC7118b() {
            MaterialTimePicker.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (View.OnClickListener onClickListener : MaterialTimePicker.this.f51182b) {
                onClickListener.onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$c */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC7119c implements View.OnClickListener {
        public View$OnClickListenerC7119c() {
            MaterialTimePicker.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i;
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            if (materialTimePicker.f51200t == 0) {
                i = 1;
            } else {
                i = 0;
            }
            materialTimePicker.f51200t = i;
            MaterialTimePicker materialTimePicker2 = MaterialTimePicker.this;
            materialTimePicker2.m43633C(materialTimePicker2.f51198r);
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m43632n(MaterialTimePicker materialTimePicker) {
        materialTimePicker.m43621y();
    }

    /* renamed from: z */
    public static MaterialTimePicker m43620z(Builder builder) {
        MaterialTimePicker materialTimePicker = new MaterialTimePicker();
        Bundle bundle = new Bundle();
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", builder.f51203a);
        if (builder.f51204b != null) {
            bundle.putInt("TIME_PICKER_INPUT_MODE", builder.f51204b.intValue());
        }
        bundle.putInt("TIME_PICKER_TITLE_RES", builder.f51205c);
        if (builder.f51206d != null) {
            bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", builder.f51206d);
        }
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", builder.f51207e);
        if (builder.f51208f != null) {
            bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", builder.f51208f);
        }
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", builder.f51209g);
        if (builder.f51210h != null) {
            bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", builder.f51210h);
        }
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", builder.f51211i);
        materialTimePicker.setArguments(bundle);
        return materialTimePicker;
    }

    /* renamed from: A */
    public final void m43635A(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        C19580dU1 c19580dU1 = (C19580dU1) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.f51201u = c19580dU1;
        if (c19580dU1 == null) {
            this.f51201u = new C19580dU1();
        }
        int i = 1;
        if (this.f51201u.f61252c != 1) {
            i = 0;
        }
        this.f51200t = bundle.getInt("TIME_PICKER_INPUT_MODE", i);
        this.f51192l = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.f51193m = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.f51194n = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.f51195o = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.f51196p = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.f51197q = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.f51202v = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    /* renamed from: B */
    public final void m43634B() {
        int i;
        Button button = this.f51199s;
        if (button != null) {
            if (isCancelable()) {
                i = 0;
            } else {
                i = 8;
            }
            button.setVisibility(i);
        }
    }

    /* renamed from: C */
    public final void m43633C(MaterialButton materialButton) {
        if (materialButton != null && this.f51185e != null && this.f51186f != null) {
            InterfaceC20445iU1 interfaceC20445iU1 = this.f51189i;
            if (interfaceC20445iU1 != null) {
                interfaceC20445iU1.hide();
            }
            InterfaceC20445iU1 m43622x = m43622x(this.f51200t, this.f51185e, this.f51186f);
            this.f51189i = m43622x;
            m43622x.show();
            this.f51189i.invalidate();
            Pair m43624v = m43624v(this.f51200t);
            materialButton.setIconResource(((Integer) m43624v.first).intValue());
            materialButton.setContentDescription(getResources().getString(((Integer) m43624v.second).intValue()));
            materialButton.sendAccessibilityEvent(4);
        }
    }

    public boolean addOnCancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.f51183c.add(onCancelListener);
    }

    public boolean addOnDismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.f51184d.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f51182b.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f51181a.add(onClickListener);
    }

    public void clearOnCancelListeners() {
        this.f51183c.clear();
    }

    public void clearOnDismissListeners() {
        this.f51184d.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.f51182b.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.f51181a.clear();
    }

    @IntRange(from = 0, m64693to = 23)
    public int getHour() {
        return this.f51201u.f61253d % 24;
    }

    public int getInputMode() {
        return this.f51200t;
    }

    @IntRange(from = 0, m64693to = 59)
    public int getMinute() {
        return this.f51201u.f61254e;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancelListener : this.f51183c) {
            onCancelListener.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        m43635A(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m43623w());
        Context context = dialog.getContext();
        int resolveOrThrow = MaterialAttributes.resolveOrThrow(context, R.attr.colorSurface, MaterialTimePicker.class.getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.MaterialTimePicker, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        this.f51191k = obtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_clockIcon, 0);
        this.f51190j = obtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_keyboardIcon, 0);
        obtainStyledAttributes.recycle();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(resolveOrThrow));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        materialShapeDrawable.setElevation(ViewCompat.getElevation(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.f51185e = timePickerView;
        timePickerView.m43593v(this);
        this.f51186f = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.f51198r = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i = this.f51192l;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.f51193m)) {
            textView.setText(this.f51193m);
        }
        m43633C(this.f51198r);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new View$OnClickListenerC7117a());
        int i2 = this.f51194n;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.f51195o)) {
            button.setText(this.f51195o);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.f51199s = button2;
        button2.setOnClickListener(new View$OnClickListenerC7118b());
        int i3 = this.f51196p;
        if (i3 != 0) {
            this.f51199s.setText(i3);
        } else if (!TextUtils.isEmpty(this.f51197q)) {
            this.f51199s.setText(this.f51197q);
        }
        m43634B();
        this.f51198r.setOnClickListener(new View$OnClickListenerC7119c());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51189i = null;
        this.f51187g = null;
        this.f51188h = null;
        TimePickerView timePickerView = this.f51185e;
        if (timePickerView != null) {
            timePickerView.m43593v(null);
            this.f51185e = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismissListener : this.f51184d) {
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.InterfaceC7123d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onDoubleTap() {
        this.f51200t = 1;
        m43633C(this.f51198r);
        this.f51188h.m43564i();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.f51201u);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.f51200t);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f51192l);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f51193m);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f51194n);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.f51195o);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f51196p);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.f51197q);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.f51202v);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f51189i instanceof C7131d) {
            view.postDelayed(new Runnable() { // from class: or0
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialTimePicker.m43632n(MaterialTimePicker.this);
                }
            }, 100L);
        }
    }

    public boolean removeOnCancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.f51183c.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.f51184d.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f51182b.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f51181a.remove(onClickListener);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        m43634B();
    }

    public void setHour(@IntRange(from = 0, m64693to = 23) int i) {
        this.f51201u.m31820h(i);
        InterfaceC20445iU1 interfaceC20445iU1 = this.f51189i;
        if (interfaceC20445iU1 != null) {
            interfaceC20445iU1.invalidate();
        }
    }

    public void setMinute(@IntRange(from = 0, m64693to = 59) int i) {
        this.f51201u.m31818j(i);
        InterfaceC20445iU1 interfaceC20445iU1 = this.f51189i;
        if (interfaceC20445iU1 != null) {
            interfaceC20445iU1.invalidate();
        }
    }

    /* renamed from: v */
    public final Pair m43624v(int i) {
        if (i != 0) {
            if (i == 1) {
                return new Pair(Integer.valueOf(this.f51191k), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
            }
            throw new IllegalArgumentException("no icon for mode: " + i);
        }
        return new Pair(Integer.valueOf(this.f51190j), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
    }

    /* renamed from: w */
    public final int m43623w() {
        int i = this.f51202v;
        if (i != 0) {
            return i;
        }
        TypedValue resolve = MaterialAttributes.resolve(requireContext(), R.attr.materialTimePickerTheme);
        if (resolve == null) {
            return 0;
        }
        return resolve.data;
    }

    /* renamed from: x */
    public final InterfaceC20445iU1 m43622x(int i, TimePickerView timePickerView, ViewStub viewStub) {
        if (i == 0) {
            C7127b c7127b = this.f51187g;
            if (c7127b == null) {
                c7127b = new C7127b(timePickerView, this.f51201u);
            }
            this.f51187g = c7127b;
            return c7127b;
        }
        if (this.f51188h == null) {
            this.f51188h = new C7131d((LinearLayout) viewStub.inflate(), this.f51201u);
        }
        this.f51188h.m43568e();
        return this.f51188h;
    }

    /* renamed from: y */
    public final /* synthetic */ void m43621y() {
        InterfaceC20445iU1 interfaceC20445iU1 = this.f51189i;
        if (interfaceC20445iU1 instanceof C7131d) {
            ((C7131d) interfaceC20445iU1).m43564i();
        }
    }
}