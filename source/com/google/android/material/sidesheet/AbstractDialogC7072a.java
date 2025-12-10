package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.sidesheet.AbstractDialogC7072a;

/* renamed from: com.google.android.material.sidesheet.a */
/* loaded from: classes4.dex */
public abstract class AbstractDialogC7072a extends AppCompatDialog {

    /* renamed from: m */
    public static final int f50789m = R.id.coordinator;

    /* renamed from: n */
    public static final int f50790n = R.id.touch_outside;

    /* renamed from: f */
    public Sheet f50791f;

    /* renamed from: g */
    public FrameLayout f50792g;

    /* renamed from: h */
    public FrameLayout f50793h;

    /* renamed from: i */
    public boolean f50794i;

    /* renamed from: j */
    public boolean f50795j;

    /* renamed from: k */
    public boolean f50796k;

    /* renamed from: l */
    public boolean f50797l;

    /* renamed from: com.google.android.material.sidesheet.a$a */
    /* loaded from: classes4.dex */
    public class C7073a extends AccessibilityDelegateCompat {
        public C7073a() {
            AbstractDialogC7072a.this = r1;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (AbstractDialogC7072a.this.f50795j) {
                accessibilityNodeInfoCompat.addAction(1048576);
                accessibilityNodeInfoCompat.setDismissable(true);
                return;
            }
            accessibilityNodeInfoCompat.setDismissable(false);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                AbstractDialogC7072a abstractDialogC7072a = AbstractDialogC7072a.this;
                if (abstractDialogC7072a.f50795j) {
                    abstractDialogC7072a.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    public AbstractDialogC7072a(Context context, int i, int i2, int i3) {
        super(context, m44055o(context, i, i2, i3));
        this.f50795j = true;
        this.f50796k = true;
        supportRequestWindowFeature(1);
    }

    /* renamed from: f */
    public static /* synthetic */ void m44064f(AbstractDialogC7072a abstractDialogC7072a, View view) {
        abstractDialogC7072a.m44054p(view);
    }

    /* renamed from: o */
    public static int m44055o(Context context, int i, int i2, int i3) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
                return typedValue.resourceId;
            }
            return i3;
        }
        return i;
    }

    /* renamed from: q */
    private boolean m44053q() {
        if (!this.f50797l) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f50796k = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f50797l = true;
        }
        return this.f50796k;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        Sheet behavior = getBehavior();
        if (this.f50794i && behavior.getState() != 5) {
            behavior.setState(5);
        } else {
            super.cancel();
        }
    }

    /* renamed from: g */
    public abstract void mo44063g(Sheet sheet);

    public Sheet getBehavior() {
        if (this.f50791f == null) {
            m44062h();
        }
        return this.f50791f;
    }

    /* renamed from: h */
    public final void m44062h() {
        if (this.f50792g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), mo44058l(), null);
            this.f50792g = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(mo44059k());
            this.f50793h = frameLayout2;
            Sheet mo44061i = mo44061i(frameLayout2);
            this.f50791f = mo44061i;
            mo44063g(mo44061i);
        }
    }

    /* renamed from: i */
    public abstract Sheet mo44061i(FrameLayout frameLayout);

    public boolean isDismissWithSheetAnimationEnabled() {
        return this.f50794i;
    }

    /* renamed from: j */
    public final FrameLayout m44060j() {
        if (this.f50792g == null) {
            m44062h();
        }
        return this.f50792g;
    }

    /* renamed from: k */
    public abstract int mo44059k();

    /* renamed from: l */
    public abstract int mo44058l();

    /* renamed from: m */
    public final FrameLayout m44057m() {
        if (this.f50793h == null) {
            m44062h();
        }
        return this.f50793h;
    }

    /* renamed from: n */
    public abstract int mo44056n();

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (i < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        Sheet sheet = this.f50791f;
        if (sheet != null && sheet.getState() == 5) {
            this.f50791f.setState(mo44056n());
        }
    }

    /* renamed from: p */
    public final /* synthetic */ void m44054p(View view) {
        if (this.f50795j && isShowing() && m44053q()) {
            cancel();
        }
    }

    /* renamed from: r */
    public final View m44052r(int i, View view, ViewGroup.LayoutParams layoutParams) {
        m44062h();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) m44060j().findViewById(f50789m);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout m44057m = m44057m();
        m44057m.removeAllViews();
        if (layoutParams == null) {
            m44057m.addView(view);
        } else {
            m44057m.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(f50790n).setOnClickListener(new View.OnClickListener() { // from class: VG1
            {
                AbstractDialogC7072a.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractDialogC7072a.m44064f(AbstractDialogC7072a.this, view2);
            }
        });
        ViewCompat.setAccessibilityDelegate(m44057m(), new C7073a());
        return this.f50792g;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f50795j != z) {
            this.f50795j = z;
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f50795j) {
            this.f50795j = true;
        }
        this.f50796k = z;
        this.f50797l = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(m44052r(i, null, null));
    }

    public void setDismissWithSheetAnimationEnabled(boolean z) {
        this.f50794i = z;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m44052r(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m44052r(0, view, layoutParams));
    }
}
