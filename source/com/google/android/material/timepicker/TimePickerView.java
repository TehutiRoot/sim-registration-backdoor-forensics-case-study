package com.google.android.material.timepicker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.Nullable;
import androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;

/* loaded from: classes4.dex */
public class TimePickerView extends ConstraintLayout {

    /* renamed from: A */
    public final ClockFaceView f51203A;

    /* renamed from: B */
    public final MaterialButtonToggleGroup f51204B;

    /* renamed from: C */
    public final View.OnClickListener f51205C;

    /* renamed from: D */
    public InterfaceC7135e f51206D;

    /* renamed from: E */
    public InterfaceC7136f f51207E;

    /* renamed from: F */
    public InterfaceC7134d f51208F;

    /* renamed from: x */
    public final Chip f51209x;

    /* renamed from: y */
    public final Chip f51210y;

    /* renamed from: z */
    public final ClockHandView f51211z;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC7131a implements View.OnClickListener {
        public View$OnClickListenerC7131a() {
            TimePickerView.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.f51207E != null) {
                TimePickerView.this.f51207E.mo43584b(((Integer) view.getTag(R.id.selection_type)).intValue());
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    /* loaded from: classes4.dex */
    public class C7132b extends GestureDetector.SimpleOnGestureListener {
        public C7132b() {
            TimePickerView.this = r1;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            InterfaceC7134d interfaceC7134d = TimePickerView.this.f51208F;
            if (interfaceC7134d != null) {
                interfaceC7134d.onDoubleTap();
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    /* loaded from: classes4.dex */
    public class View$OnTouchListenerC7133c implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ GestureDetector f51214a;

        public View$OnTouchListenerC7133c(GestureDetector gestureDetector) {
            TimePickerView.this = r1;
            this.f51214a = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f51214a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    /* loaded from: classes4.dex */
    public interface InterfaceC7134d {
        void onDoubleTap();
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    /* loaded from: classes4.dex */
    public interface InterfaceC7135e {
        /* renamed from: a */
        void mo43601a(int i);
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$f */
    /* loaded from: classes4.dex */
    public interface InterfaceC7136f {
        /* renamed from: b */
        void mo43584b(int i);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: i */
    public static /* synthetic */ void m43619i(TimePickerView timePickerView, MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        timePickerView.m43614n(materialButtonToggleGroup, i, z);
    }

    /* renamed from: A */
    public final void m43623A() {
        View$OnTouchListenerC7133c view$OnTouchListenerC7133c = new View$OnTouchListenerC7133c(new GestureDetector(getContext(), new C7132b()));
        this.f51209x.setOnTouchListener(view$OnTouchListenerC7133c);
        this.f51210y.setOnTouchListener(view$OnTouchListenerC7133c);
    }

    /* renamed from: B */
    public void m43622B() {
        this.f51204B.setVisibility(0);
    }

    /* renamed from: C */
    public final void m43621C(Chip chip, boolean z) {
        int i;
        chip.setChecked(z);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        ViewCompat.setAccessibilityLiveRegion(chip, i);
    }

    /* renamed from: D */
    public void m43620D(int i, int i2, int i3) {
        int i4;
        if (i == 1) {
            i4 = R.id.material_clock_period_pm_button;
        } else {
            i4 = R.id.material_clock_period_am_button;
        }
        this.f51204B.check(i4);
        Locale locale = getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(i3));
        String format2 = String.format(locale, "%02d", Integer.valueOf(i2));
        if (!TextUtils.equals(this.f51209x.getText(), format)) {
            this.f51209x.setText(format);
        }
        if (!TextUtils.equals(this.f51210y.getText(), format2)) {
            this.f51210y.setText(format2);
        }
    }

    /* renamed from: l */
    public void m43616l(ClockHandView.OnRotateListener onRotateListener) {
        this.f51211z.m43668b(onRotateListener);
    }

    /* renamed from: m */
    public int m43615m() {
        return this.f51203A.m43674v();
    }

    /* renamed from: n */
    public final /* synthetic */ void m43614n(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        InterfaceC7135e interfaceC7135e;
        int i2;
        if (z && (interfaceC7135e = this.f51206D) != null) {
            if (i == R.id.material_clock_period_pm_button) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            interfaceC7135e.mo43601a(i2);
        }
    }

    /* renamed from: o */
    public void m43613o(int i) {
        boolean z;
        Chip chip = this.f51209x;
        boolean z2 = false;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        m43621C(chip, z);
        Chip chip2 = this.f51210y;
        if (i == 10) {
            z2 = true;
        }
        m43621C(chip2, z2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f51210y.sendAccessibilityEvent(8);
        }
    }

    /* renamed from: p */
    public void m43612p(boolean z) {
        this.f51211z.m43656n(z);
    }

    /* renamed from: q */
    public void m43611q(int i) {
        this.f51203A.m43670z(i);
    }

    /* renamed from: r */
    public void m43610r(float f, boolean z) {
        this.f51211z.m43652r(f, z);
    }

    /* renamed from: s */
    public void m43609s(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f51209x, accessibilityDelegateCompat);
    }

    /* renamed from: t */
    public void m43608t(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f51210y, accessibilityDelegateCompat);
    }

    /* renamed from: u */
    public void m43607u(ClockHandView.OnActionUpListener onActionUpListener) {
        this.f51211z.m43649u(onActionUpListener);
    }

    /* renamed from: v */
    public void m43606v(InterfaceC7134d interfaceC7134d) {
        this.f51208F = interfaceC7134d;
    }

    /* renamed from: w */
    public void m43605w(InterfaceC7135e interfaceC7135e) {
        this.f51206D = interfaceC7135e;
    }

    /* renamed from: x */
    public void m43604x(InterfaceC7136f interfaceC7136f) {
        this.f51207E = interfaceC7136f;
    }

    /* renamed from: y */
    public final void m43603y() {
        this.f51209x.setTag(R.id.selection_type, 12);
        this.f51210y.setTag(R.id.selection_type, 10);
        this.f51209x.setOnClickListener(this.f51205C);
        this.f51210y.setOnClickListener(this.f51205C);
        this.f51209x.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        this.f51210y.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
    }

    /* renamed from: z */
    public void m43602z(String[] strArr, int i) {
        this.f51203A.m43681A(strArr, i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51205C = new View$OnClickListenerC7131a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.f51203A = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f51204B = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() { // from class: com.google.android.material.timepicker.e
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
            public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup2, int i2, boolean z) {
                TimePickerView.m43619i(TimePickerView.this, materialButtonToggleGroup2, i2, z);
            }
        });
        this.f51209x = (Chip) findViewById(R.id.material_minute_tv);
        this.f51210y = (Chip) findViewById(R.id.material_hour_tv);
        this.f51211z = (ClockHandView) findViewById(R.id.material_clock_hand);
        m43623A();
        m43603y();
    }
}
