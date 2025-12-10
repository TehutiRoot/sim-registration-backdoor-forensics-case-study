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
public final class MaterialTimePicker extends DialogFragment implements TimePickerView.InterfaceC7134d {
    public static final int INPUT_MODE_CLOCK = 0;
    public static final int INPUT_MODE_KEYBOARD = 1;

    /* renamed from: e */
    public TimePickerView f51173e;

    /* renamed from: f */
    public ViewStub f51174f;

    /* renamed from: g */
    public C7138b f51175g;

    /* renamed from: h */
    public C7142d f51176h;

    /* renamed from: i */
    public InterfaceC20904lT1 f51177i;

    /* renamed from: j */
    public int f51178j;

    /* renamed from: k */
    public int f51179k;

    /* renamed from: m */
    public CharSequence f51181m;

    /* renamed from: o */
    public CharSequence f51183o;

    /* renamed from: q */
    public CharSequence f51185q;

    /* renamed from: r */
    public MaterialButton f51186r;

    /* renamed from: s */
    public Button f51187s;

    /* renamed from: u */
    public C20044gT1 f51189u;

    /* renamed from: a */
    public final Set f51169a = new LinkedHashSet();

    /* renamed from: b */
    public final Set f51170b = new LinkedHashSet();

    /* renamed from: c */
    public final Set f51171c = new LinkedHashSet();

    /* renamed from: d */
    public final Set f51172d = new LinkedHashSet();

    /* renamed from: l */
    public int f51180l = 0;

    /* renamed from: n */
    public int f51182n = 0;

    /* renamed from: p */
    public int f51184p = 0;

    /* renamed from: t */
    public int f51188t = 0;

    /* renamed from: v */
    public int f51190v = 0;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: b */
        public Integer f51192b;

        /* renamed from: d */
        public CharSequence f51194d;

        /* renamed from: f */
        public CharSequence f51196f;

        /* renamed from: h */
        public CharSequence f51198h;

        /* renamed from: a */
        public C20044gT1 f51191a = new C20044gT1();

        /* renamed from: c */
        public int f51193c = 0;

        /* renamed from: e */
        public int f51195e = 0;

        /* renamed from: g */
        public int f51197g = 0;

        /* renamed from: i */
        public int f51199i = 0;

        @NonNull
        public MaterialTimePicker build() {
            return MaterialTimePicker.m43633z(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setHour(@IntRange(from = 0, m64742to = 23) int i) {
            this.f51191a.m31117i(i);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setInputMode(int i) {
            this.f51192b = Integer.valueOf(i);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setMinute(@IntRange(from = 0, m64742to = 59) int i) {
            this.f51191a.m31116j(i);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@StringRes int i) {
            this.f51197g = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@StringRes int i) {
            this.f51195e = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTheme(@StyleRes int i) {
            this.f51199i = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTimeFormat(int i) {
            C20044gT1 c20044gT1 = this.f51191a;
            int i2 = c20044gT1.f62177d;
            int i3 = c20044gT1.f62178e;
            C20044gT1 c20044gT12 = new C20044gT1(i);
            this.f51191a = c20044gT12;
            c20044gT12.m31116j(i3);
            this.f51191a.m31117i(i2);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTitleText(@StringRes int i) {
            this.f51193c = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@Nullable CharSequence charSequence) {
            this.f51198h = charSequence;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@Nullable CharSequence charSequence) {
            this.f51196f = charSequence;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTitleText(@Nullable CharSequence charSequence) {
            this.f51194d = charSequence;
            return this;
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$a */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC7128a implements View.OnClickListener {
        public View$OnClickListenerC7128a() {
            MaterialTimePicker.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (View.OnClickListener onClickListener : MaterialTimePicker.this.f51169a) {
                onClickListener.onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$b */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC7129b implements View.OnClickListener {
        public View$OnClickListenerC7129b() {
            MaterialTimePicker.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (View.OnClickListener onClickListener : MaterialTimePicker.this.f51170b) {
                onClickListener.onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$c */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC7130c implements View.OnClickListener {
        public View$OnClickListenerC7130c() {
            MaterialTimePicker.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i;
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            if (materialTimePicker.f51188t == 0) {
                i = 1;
            } else {
                i = 0;
            }
            materialTimePicker.f51188t = i;
            MaterialTimePicker materialTimePicker2 = MaterialTimePicker.this;
            materialTimePicker2.m43646C(materialTimePicker2.f51186r);
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m43645n(MaterialTimePicker materialTimePicker) {
        materialTimePicker.m43634y();
    }

    /* renamed from: z */
    public static MaterialTimePicker m43633z(Builder builder) {
        MaterialTimePicker materialTimePicker = new MaterialTimePicker();
        Bundle bundle = new Bundle();
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", builder.f51191a);
        if (builder.f51192b != null) {
            bundle.putInt("TIME_PICKER_INPUT_MODE", builder.f51192b.intValue());
        }
        bundle.putInt("TIME_PICKER_TITLE_RES", builder.f51193c);
        if (builder.f51194d != null) {
            bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", builder.f51194d);
        }
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", builder.f51195e);
        if (builder.f51196f != null) {
            bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", builder.f51196f);
        }
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", builder.f51197g);
        if (builder.f51198h != null) {
            bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", builder.f51198h);
        }
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", builder.f51199i);
        materialTimePicker.setArguments(bundle);
        return materialTimePicker;
    }

    /* renamed from: A */
    public final void m43648A(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        C20044gT1 c20044gT1 = (C20044gT1) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.f51189u = c20044gT1;
        if (c20044gT1 == null) {
            this.f51189u = new C20044gT1();
        }
        int i = 1;
        if (this.f51189u.f62176c != 1) {
            i = 0;
        }
        this.f51188t = bundle.getInt("TIME_PICKER_INPUT_MODE", i);
        this.f51180l = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.f51181m = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.f51182n = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.f51183o = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.f51184p = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.f51185q = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.f51190v = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    /* renamed from: B */
    public final void m43647B() {
        int i;
        Button button = this.f51187s;
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
    public final void m43646C(MaterialButton materialButton) {
        if (materialButton != null && this.f51173e != null && this.f51174f != null) {
            InterfaceC20904lT1 interfaceC20904lT1 = this.f51177i;
            if (interfaceC20904lT1 != null) {
                interfaceC20904lT1.hide();
            }
            InterfaceC20904lT1 m43635x = m43635x(this.f51188t, this.f51173e, this.f51174f);
            this.f51177i = m43635x;
            m43635x.show();
            this.f51177i.invalidate();
            Pair m43637v = m43637v(this.f51188t);
            materialButton.setIconResource(((Integer) m43637v.first).intValue());
            materialButton.setContentDescription(getResources().getString(((Integer) m43637v.second).intValue()));
            materialButton.sendAccessibilityEvent(4);
        }
    }

    public boolean addOnCancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.f51171c.add(onCancelListener);
    }

    public boolean addOnDismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.f51172d.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f51170b.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f51169a.add(onClickListener);
    }

    public void clearOnCancelListeners() {
        this.f51171c.clear();
    }

    public void clearOnDismissListeners() {
        this.f51172d.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.f51170b.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.f51169a.clear();
    }

    @IntRange(from = 0, m64742to = 23)
    public int getHour() {
        return this.f51189u.f62177d % 24;
    }

    public int getInputMode() {
        return this.f51188t;
    }

    @IntRange(from = 0, m64742to = 59)
    public int getMinute() {
        return this.f51189u.f62178e;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancelListener : this.f51171c) {
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
        m43648A(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m43636w());
        Context context = dialog.getContext();
        int resolveOrThrow = MaterialAttributes.resolveOrThrow(context, R.attr.colorSurface, MaterialTimePicker.class.getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.MaterialTimePicker, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        this.f51179k = obtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_clockIcon, 0);
        this.f51178j = obtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_keyboardIcon, 0);
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
        this.f51173e = timePickerView;
        timePickerView.m43606v(this);
        this.f51174f = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.f51186r = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i = this.f51180l;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.f51181m)) {
            textView.setText(this.f51181m);
        }
        m43646C(this.f51186r);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new View$OnClickListenerC7128a());
        int i2 = this.f51182n;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.f51183o)) {
            button.setText(this.f51183o);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.f51187s = button2;
        button2.setOnClickListener(new View$OnClickListenerC7129b());
        int i3 = this.f51184p;
        if (i3 != 0) {
            this.f51187s.setText(i3);
        } else if (!TextUtils.isEmpty(this.f51185q)) {
            this.f51187s.setText(this.f51185q);
        }
        m43647B();
        this.f51186r.setOnClickListener(new View$OnClickListenerC7130c());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f51177i = null;
        this.f51175g = null;
        this.f51176h = null;
        TimePickerView timePickerView = this.f51173e;
        if (timePickerView != null) {
            timePickerView.m43606v(null);
            this.f51173e = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismissListener : this.f51172d) {
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.InterfaceC7134d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onDoubleTap() {
        this.f51188t = 1;
        m43646C(this.f51186r);
        this.f51176h.m43577i();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.f51189u);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.f51188t);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f51180l);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f51181m);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f51182n);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.f51183o);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f51184p);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.f51185q);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.f51190v);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f51177i instanceof C7142d) {
            view.postDelayed(new Runnable() { // from class: ir0
                {
                    MaterialTimePicker.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MaterialTimePicker.m43645n(MaterialTimePicker.this);
                }
            }, 100L);
        }
    }

    public boolean removeOnCancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.f51171c.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.f51172d.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f51170b.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f51169a.remove(onClickListener);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        m43647B();
    }

    public void setHour(@IntRange(from = 0, m64742to = 23) int i) {
        this.f51189u.m31118h(i);
        InterfaceC20904lT1 interfaceC20904lT1 = this.f51177i;
        if (interfaceC20904lT1 != null) {
            interfaceC20904lT1.invalidate();
        }
    }

    public void setMinute(@IntRange(from = 0, m64742to = 59) int i) {
        this.f51189u.m31116j(i);
        InterfaceC20904lT1 interfaceC20904lT1 = this.f51177i;
        if (interfaceC20904lT1 != null) {
            interfaceC20904lT1.invalidate();
        }
    }

    /* renamed from: v */
    public final Pair m43637v(int i) {
        if (i != 0) {
            if (i == 1) {
                return new Pair(Integer.valueOf(this.f51179k), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
            }
            throw new IllegalArgumentException("no icon for mode: " + i);
        }
        return new Pair(Integer.valueOf(this.f51178j), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
    }

    /* renamed from: w */
    public final int m43636w() {
        int i = this.f51190v;
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
    public final InterfaceC20904lT1 m43635x(int i, TimePickerView timePickerView, ViewStub viewStub) {
        if (i == 0) {
            C7138b c7138b = this.f51175g;
            if (c7138b == null) {
                c7138b = new C7138b(timePickerView, this.f51189u);
            }
            this.f51175g = c7138b;
            return c7138b;
        }
        if (this.f51176h == null) {
            this.f51176h = new C7142d((LinearLayout) viewStub.inflate(), this.f51189u);
        }
        this.f51176h.m43581e();
        return this.f51176h;
    }

    /* renamed from: y */
    public final /* synthetic */ void m43634y() {
        InterfaceC20904lT1 interfaceC20904lT1 = this.f51177i;
        if (interfaceC20904lT1 instanceof C7142d) {
            ((C7142d) interfaceC20904lT1).m43577i();
        }
    }
}
