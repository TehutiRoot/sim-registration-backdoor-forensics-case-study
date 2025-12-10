package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.R;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;

/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes4.dex */
public class C7138b implements ClockHandView.OnRotateListener, TimePickerView.InterfaceC7136f, TimePickerView.InterfaceC7135e, ClockHandView.OnActionUpListener, InterfaceC20904lT1 {

    /* renamed from: f */
    public static final String[] f51217f = {"12", "1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", "10", "11"};

    /* renamed from: g */
    public static final String[] f51218g = {"00", "1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};

    /* renamed from: h */
    public static final String[] f51219h = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* renamed from: a */
    public final TimePickerView f51220a;

    /* renamed from: b */
    public final C20044gT1 f51221b;

    /* renamed from: c */
    public float f51222c;

    /* renamed from: d */
    public float f51223d;

    /* renamed from: e */
    public boolean f51224e = false;

    /* renamed from: com.google.android.material.timepicker.b$a */
    /* loaded from: classes4.dex */
    public class C7139a extends AbstractC1635Wp {
        public C7139a(Context context, int i) {
            super(context, i);
        }

        @Override // p000.AbstractC1635Wp, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(C7138b.this.f51221b.m31123c(), String.valueOf(C7138b.this.f51221b.m31122d())));
        }
    }

    /* renamed from: com.google.android.material.timepicker.b$b */
    /* loaded from: classes4.dex */
    public class C7140b extends AbstractC1635Wp {
        public C7140b(Context context, int i) {
            super(context, i);
        }

        @Override // p000.AbstractC1635Wp, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(C7138b.this.f51221b.f62178e)));
        }
    }

    public C7138b(TimePickerView timePickerView, C20044gT1 c20044gT1) {
        this.f51220a = timePickerView;
        this.f51221b = c20044gT1;
        m43597f();
    }

    @Override // com.google.android.material.timepicker.TimePickerView.InterfaceC7135e
    /* renamed from: a */
    public void mo43601a(int i) {
        this.f51221b.m31115k(i);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.InterfaceC7136f
    /* renamed from: b */
    public void mo43584b(int i) {
        m43595h(i, true);
    }

    /* renamed from: d */
    public final String[] m43599d() {
        if (this.f51221b.f62176c == 1) {
            return f51218g;
        }
        return f51217f;
    }

    /* renamed from: e */
    public final int m43598e() {
        return (this.f51221b.m31122d() * 30) % 360;
    }

    /* renamed from: f */
    public void m43597f() {
        if (this.f51221b.f62176c == 0) {
            this.f51220a.m43622B();
        }
        this.f51220a.m43616l(this);
        this.f51220a.m43604x(this);
        this.f51220a.m43605w(this);
        this.f51220a.m43607u(this);
        m43592k();
        invalidate();
    }

    /* renamed from: g */
    public final void m43596g(int i, int i2) {
        C20044gT1 c20044gT1 = this.f51221b;
        if (c20044gT1.f62178e != i2 || c20044gT1.f62177d != i) {
            this.f51220a.performHapticFeedback(4);
        }
    }

    /* renamed from: h */
    public void m43595h(int i, boolean z) {
        boolean z2;
        String[] m43599d;
        int m31123c;
        float f;
        if (i == 12) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f51220a.m43612p(z2);
        this.f51221b.f62179f = i;
        TimePickerView timePickerView = this.f51220a;
        if (z2) {
            m43599d = f51219h;
        } else {
            m43599d = m43599d();
        }
        if (z2) {
            m31123c = R.string.material_minute_suffix;
        } else {
            m31123c = this.f51221b.m31123c();
        }
        timePickerView.m43602z(m43599d, m31123c);
        m43594i();
        TimePickerView timePickerView2 = this.f51220a;
        if (z2) {
            f = this.f51222c;
        } else {
            f = this.f51223d;
        }
        timePickerView2.m43610r(f, z);
        this.f51220a.m43613o(i);
        this.f51220a.m43608t(new C7139a(this.f51220a.getContext(), R.string.material_hour_selection));
        this.f51220a.m43609s(new C7140b(this.f51220a.getContext(), R.string.material_minute_selection));
    }

    @Override // p000.InterfaceC20904lT1
    public void hide() {
        this.f51220a.setVisibility(8);
    }

    /* renamed from: i */
    public final void m43594i() {
        C20044gT1 c20044gT1 = this.f51221b;
        int i = 1;
        if (c20044gT1.f62179f == 10 && c20044gT1.f62176c == 1 && c20044gT1.f62177d >= 12) {
            i = 2;
        }
        this.f51220a.m43611q(i);
    }

    @Override // p000.InterfaceC20904lT1
    public void invalidate() {
        this.f51223d = m43598e();
        C20044gT1 c20044gT1 = this.f51221b;
        this.f51222c = c20044gT1.f62178e * 6;
        m43595h(c20044gT1.f62179f, false);
        m43593j();
    }

    /* renamed from: j */
    public final void m43593j() {
        TimePickerView timePickerView = this.f51220a;
        C20044gT1 c20044gT1 = this.f51221b;
        timePickerView.m43620D(c20044gT1.f62180g, c20044gT1.m31122d(), this.f51221b.f62178e);
    }

    /* renamed from: k */
    public final void m43592k() {
        m43591l(f51217f, "%d");
        m43591l(f51219h, "%02d");
    }

    /* renamed from: l */
    public final void m43591l(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = C20044gT1.m31124b(this.f51220a.getResources(), strArr[i], str);
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    public void onActionUp(float f, boolean z) {
        this.f51224e = true;
        C20044gT1 c20044gT1 = this.f51221b;
        int i = c20044gT1.f62178e;
        int i2 = c20044gT1.f62177d;
        if (c20044gT1.f62179f == 10) {
            this.f51220a.m43610r(this.f51223d, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(this.f51220a.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                m43595h(12, true);
            }
        } else {
            int round = Math.round(f);
            if (!z) {
                this.f51221b.m31116j(((round + 15) / 30) * 5);
                this.f51222c = this.f51221b.f62178e * 6;
            }
            this.f51220a.m43610r(this.f51222c, z);
        }
        this.f51224e = false;
        m43593j();
        m43596g(i2, i);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f, boolean z) {
        if (this.f51224e) {
            return;
        }
        C20044gT1 c20044gT1 = this.f51221b;
        int i = c20044gT1.f62177d;
        int i2 = c20044gT1.f62178e;
        int round = Math.round(f);
        C20044gT1 c20044gT12 = this.f51221b;
        if (c20044gT12.f62179f == 12) {
            c20044gT12.m31116j((round + 3) / 6);
            this.f51222c = (float) Math.floor(this.f51221b.f62178e * 6);
        } else {
            int i3 = (round + 15) / 30;
            if (c20044gT12.f62176c == 1) {
                i3 %= 12;
                if (this.f51220a.m43615m() == 2) {
                    i3 += 12;
                }
            }
            this.f51221b.m31118h(i3);
            this.f51223d = m43598e();
        }
        if (!z) {
            m43593j();
            m43596g(i, i2);
        }
    }

    @Override // p000.InterfaceC20904lT1
    public void show() {
        this.f51220a.setVisibility(0);
    }
}
