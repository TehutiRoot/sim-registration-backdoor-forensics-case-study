package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.EdgeToEdgeUtils;
import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: classes4.dex */
public class BottomSheetDialog extends AppCompatDialog {

    /* renamed from: f */
    public BottomSheetBehavior f49294f;

    /* renamed from: g */
    public FrameLayout f49295g;

    /* renamed from: h */
    public CoordinatorLayout f49296h;

    /* renamed from: i */
    public FrameLayout f49297i;

    /* renamed from: j */
    public boolean f49298j;

    /* renamed from: k */
    public boolean f49299k;

    /* renamed from: l */
    public boolean f49300l;

    /* renamed from: m */
    public boolean f49301m;

    /* renamed from: n */
    public C6834f f49302n;

    /* renamed from: o */
    public boolean f49303o;

    /* renamed from: p */
    public BottomSheetBehavior.BottomSheetCallback f49304p;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$a */
    /* loaded from: classes4.dex */
    public class C6829a implements OnApplyWindowInsetsListener {
        public C6829a() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            if (BottomSheetDialog.this.f49302n != null) {
                BottomSheetDialog.this.f49294f.removeBottomSheetCallback(BottomSheetDialog.this.f49302n);
            }
            if (windowInsetsCompat != null) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                bottomSheetDialog.f49302n = new C6834f(bottomSheetDialog.f49297i, windowInsetsCompat, null);
                BottomSheetDialog.this.f49302n.m45574c(BottomSheetDialog.this.getWindow());
                BottomSheetDialog.this.f49294f.addBottomSheetCallback(BottomSheetDialog.this.f49302n);
            }
            return windowInsetsCompat;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$b */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC6830b implements View.OnClickListener {
        public View$OnClickListenerC6830b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
            if (bottomSheetDialog.f49299k && bottomSheetDialog.isShowing() && BottomSheetDialog.this.m45578l()) {
                BottomSheetDialog.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$c */
    /* loaded from: classes4.dex */
    public class C6831c extends AccessibilityDelegateCompat {
        public C6831c() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (BottomSheetDialog.this.f49299k) {
                accessibilityNodeInfoCompat.addAction(1048576);
                accessibilityNodeInfoCompat.setDismissable(true);
                return;
            }
            accessibilityNodeInfoCompat.setDismissable(false);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.f49299k) {
                    bottomSheetDialog.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$d */
    /* loaded from: classes4.dex */
    public class View$OnTouchListenerC6832d implements View.OnTouchListener {
        public View$OnTouchListenerC6832d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$e */
    /* loaded from: classes4.dex */
    public class C6833e extends BottomSheetBehavior.BottomSheetCallback {
        public C6833e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
            if (i == 5) {
                BottomSheetDialog.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$f */
    /* loaded from: classes4.dex */
    public static class C6834f extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: a */
        public final Boolean f49310a;

        /* renamed from: b */
        public final WindowInsetsCompat f49311b;

        /* renamed from: c */
        public Window f49312c;

        /* renamed from: d */
        public boolean f49313d;

        public /* synthetic */ C6834f(View view, WindowInsetsCompat windowInsetsCompat, C6829a c6829a) {
            this(view, windowInsetsCompat);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        /* renamed from: a */
        public void mo45576a(View view) {
            m45575b(view);
        }

        /* renamed from: b */
        public final void m45575b(View view) {
            boolean booleanValue;
            if (view.getTop() < this.f49311b.getSystemWindowInsetTop()) {
                Window window = this.f49312c;
                if (window != null) {
                    Boolean bool = this.f49310a;
                    if (bool == null) {
                        booleanValue = this.f49313d;
                    } else {
                        booleanValue = bool.booleanValue();
                    }
                    EdgeToEdgeUtils.setLightStatusBar(window, booleanValue);
                }
                view.setPadding(view.getPaddingLeft(), this.f49311b.getSystemWindowInsetTop() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                Window window2 = this.f49312c;
                if (window2 != null) {
                    EdgeToEdgeUtils.setLightStatusBar(window2, this.f49313d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        /* renamed from: c */
        public void m45574c(Window window) {
            if (this.f49312c == window) {
                return;
            }
            this.f49312c = window;
            if (window != null) {
                this.f49313d = WindowCompat.getInsetsController(window, window.getDecorView()).isAppearanceLightStatusBars();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
            m45575b(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
            m45575b(view);
        }

        public C6834f(View view, WindowInsetsCompat windowInsetsCompat) {
            ColorStateList backgroundTintList;
            this.f49311b = windowInsetsCompat;
            MaterialShapeDrawable m45638G = BottomSheetBehavior.from(view).m45638G();
            if (m45638G != null) {
                backgroundTintList = m45638G.getFillColor();
            } else {
                backgroundTintList = ViewCompat.getBackgroundTintList(view);
            }
            if (backgroundTintList != null) {
                this.f49310a = Boolean.valueOf(MaterialColors.isColorLight(backgroundTintList.getDefaultColor()));
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f49310a = Boolean.valueOf(MaterialColors.isColorLight(((ColorDrawable) view.getBackground()).getColor()));
            } else {
                this.f49310a = null;
            }
        }
    }

    public BottomSheetDialog(@NonNull Context context) {
        this(context, 0);
        this.f49303o = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    /* renamed from: d */
    public static int m45585d(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
                return typedValue.resourceId;
            }
            return R.style.Theme_Design_Light_BottomSheetDialog;
        }
        return i;
    }

    @Deprecated
    public static void setLightStatusBar(@NonNull View view, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility | 8192;
            } else {
                i = systemUiVisibility & (-8193);
            }
            view.setSystemUiVisibility(i);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (this.f49298j && behavior.getState() != 5) {
            behavior.setState(5);
        } else {
            super.cancel();
        }
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.f49294f == null) {
            m45580j();
        }
        return this.f49294f;
    }

    public boolean getDismissWithAnimation() {
        return this.f49298j;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.f49303o;
    }

    /* renamed from: j */
    public final FrameLayout m45580j() {
        if (this.f49295g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f49295g = frameLayout;
            this.f49296h = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f49295g.findViewById(R.id.design_bottom_sheet);
            this.f49297i = frameLayout2;
            BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout2);
            this.f49294f = from;
            from.addBottomSheetCallback(this.f49304p);
            this.f49294f.setHideable(this.f49299k);
        }
        return this.f49295g;
    }

    /* renamed from: k */
    public void m45579k() {
        this.f49294f.removeBottomSheetCallback(this.f49304p);
    }

    /* renamed from: l */
    public boolean m45578l() {
        if (!this.f49301m) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f49300l = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f49301m = true;
        }
        return this.f49300l;
    }

    /* renamed from: m */
    public final View m45577m(int i, View view, ViewGroup.LayoutParams layoutParams) {
        m45580j();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f49295g.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f49303o) {
            ViewCompat.setOnApplyWindowInsetsListener(this.f49297i, new C6829a());
        }
        this.f49297i.removeAllViews();
        if (layoutParams == null) {
            this.f49297i.addView(view);
        } else {
            this.f49297i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new View$OnClickListenerC6830b());
        ViewCompat.setAccessibilityDelegate(this.f49297i, new C6831c());
        this.f49297i.setOnTouchListener(new View$OnTouchListenerC6832d());
        return this.f49295g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.f49303o && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            } else {
                z = false;
            }
            FrameLayout frameLayout = this.f49295g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f49296h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            WindowCompat.setDecorFitsSystemWindows(window, !z);
            C6834f c6834f = this.f49302n;
            if (c6834f != null) {
                c6834f.m45574c(window);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
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

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        C6834f c6834f = this.f49302n;
        if (c6834f != null) {
            c6834f.m45574c(null);
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f49294f;
        if (bottomSheetBehavior != null && bottomSheetBehavior.getState() == 5) {
            this.f49294f.setState(4);
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f49299k != z) {
            this.f49299k = z;
            BottomSheetBehavior bottomSheetBehavior = this.f49294f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f49299k) {
            this.f49299k = true;
        }
        this.f49300l = z;
        this.f49301m = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        super.setContentView(m45577m(i, null, null));
    }

    public void setDismissWithAnimation(boolean z) {
        this.f49298j = z;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m45577m(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m45577m(0, view, layoutParams));
    }

    public BottomSheetDialog(@NonNull Context context, @StyleRes int i) {
        super(context, m45585d(context, i));
        this.f49299k = true;
        this.f49300l = true;
        this.f49304p = new C6833e();
        supportRequestWindowFeature(1);
        this.f49303o = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public BottomSheetDialog(@NonNull Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.f49299k = true;
        this.f49300l = true;
        this.f49304p = new C6833e();
        supportRequestWindowFeature(1);
        this.f49299k = z;
        this.f49303o = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }
}