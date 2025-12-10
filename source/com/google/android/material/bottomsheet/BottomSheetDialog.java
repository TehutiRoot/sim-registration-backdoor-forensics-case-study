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
    public BottomSheetBehavior f49282f;

    /* renamed from: g */
    public FrameLayout f49283g;

    /* renamed from: h */
    public CoordinatorLayout f49284h;

    /* renamed from: i */
    public FrameLayout f49285i;

    /* renamed from: j */
    public boolean f49286j;

    /* renamed from: k */
    public boolean f49287k;

    /* renamed from: l */
    public boolean f49288l;

    /* renamed from: m */
    public boolean f49289m;

    /* renamed from: n */
    public C6845f f49290n;

    /* renamed from: o */
    public boolean f49291o;

    /* renamed from: p */
    public BottomSheetBehavior.BottomSheetCallback f49292p;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$a */
    /* loaded from: classes4.dex */
    public class C6840a implements OnApplyWindowInsetsListener {
        public C6840a() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            if (BottomSheetDialog.this.f49290n != null) {
                BottomSheetDialog.this.f49282f.removeBottomSheetCallback(BottomSheetDialog.this.f49290n);
            }
            if (windowInsetsCompat != null) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                bottomSheetDialog.f49290n = new C6845f(bottomSheetDialog.f49285i, windowInsetsCompat, null);
                BottomSheetDialog.this.f49290n.m45598c(BottomSheetDialog.this.getWindow());
                BottomSheetDialog.this.f49282f.addBottomSheetCallback(BottomSheetDialog.this.f49290n);
            }
            return windowInsetsCompat;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$b */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC6841b implements View.OnClickListener {
        public View$OnClickListenerC6841b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
            if (bottomSheetDialog.f49287k && bottomSheetDialog.isShowing() && BottomSheetDialog.this.m45602l()) {
                BottomSheetDialog.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$c */
    /* loaded from: classes4.dex */
    public class C6842c extends AccessibilityDelegateCompat {
        public C6842c() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (BottomSheetDialog.this.f49287k) {
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
                if (bottomSheetDialog.f49287k) {
                    bottomSheetDialog.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$d */
    /* loaded from: classes4.dex */
    public class View$OnTouchListenerC6843d implements View.OnTouchListener {
        public View$OnTouchListenerC6843d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$e */
    /* loaded from: classes4.dex */
    public class C6844e extends BottomSheetBehavior.BottomSheetCallback {
        public C6844e() {
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
    public static class C6845f extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: a */
        public final Boolean f49298a;

        /* renamed from: b */
        public final WindowInsetsCompat f49299b;

        /* renamed from: c */
        public Window f49300c;

        /* renamed from: d */
        public boolean f49301d;

        public /* synthetic */ C6845f(View view, WindowInsetsCompat windowInsetsCompat, C6840a c6840a) {
            this(view, windowInsetsCompat);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        /* renamed from: a */
        public void mo45600a(View view) {
            m45599b(view);
        }

        /* renamed from: b */
        public final void m45599b(View view) {
            boolean booleanValue;
            if (view.getTop() < this.f49299b.getSystemWindowInsetTop()) {
                Window window = this.f49300c;
                if (window != null) {
                    Boolean bool = this.f49298a;
                    if (bool == null) {
                        booleanValue = this.f49301d;
                    } else {
                        booleanValue = bool.booleanValue();
                    }
                    EdgeToEdgeUtils.setLightStatusBar(window, booleanValue);
                }
                view.setPadding(view.getPaddingLeft(), this.f49299b.getSystemWindowInsetTop() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                Window window2 = this.f49300c;
                if (window2 != null) {
                    EdgeToEdgeUtils.setLightStatusBar(window2, this.f49301d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        /* renamed from: c */
        public void m45598c(Window window) {
            if (this.f49300c == window) {
                return;
            }
            this.f49300c = window;
            if (window != null) {
                this.f49301d = WindowCompat.getInsetsController(window, window.getDecorView()).isAppearanceLightStatusBars();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
            m45599b(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
            m45599b(view);
        }

        public C6845f(View view, WindowInsetsCompat windowInsetsCompat) {
            ColorStateList backgroundTintList;
            this.f49299b = windowInsetsCompat;
            MaterialShapeDrawable m45662G = BottomSheetBehavior.from(view).m45662G();
            if (m45662G != null) {
                backgroundTintList = m45662G.getFillColor();
            } else {
                backgroundTintList = ViewCompat.getBackgroundTintList(view);
            }
            if (backgroundTintList != null) {
                this.f49298a = Boolean.valueOf(MaterialColors.isColorLight(backgroundTintList.getDefaultColor()));
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f49298a = Boolean.valueOf(MaterialColors.isColorLight(((ColorDrawable) view.getBackground()).getColor()));
            } else {
                this.f49298a = null;
            }
        }
    }

    public BottomSheetDialog(@NonNull Context context) {
        this(context, 0);
        this.f49291o = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    /* renamed from: d */
    public static int m45609d(Context context, int i) {
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
        if (this.f49286j && behavior.getState() != 5) {
            behavior.setState(5);
        } else {
            super.cancel();
        }
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.f49282f == null) {
            m45604j();
        }
        return this.f49282f;
    }

    public boolean getDismissWithAnimation() {
        return this.f49286j;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.f49291o;
    }

    /* renamed from: j */
    public final FrameLayout m45604j() {
        if (this.f49283g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f49283g = frameLayout;
            this.f49284h = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f49283g.findViewById(R.id.design_bottom_sheet);
            this.f49285i = frameLayout2;
            BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout2);
            this.f49282f = from;
            from.addBottomSheetCallback(this.f49292p);
            this.f49282f.setHideable(this.f49287k);
        }
        return this.f49283g;
    }

    /* renamed from: k */
    public void m45603k() {
        this.f49282f.removeBottomSheetCallback(this.f49292p);
    }

    /* renamed from: l */
    public boolean m45602l() {
        if (!this.f49289m) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f49288l = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f49289m = true;
        }
        return this.f49288l;
    }

    /* renamed from: m */
    public final View m45601m(int i, View view, ViewGroup.LayoutParams layoutParams) {
        m45604j();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f49283g.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f49291o) {
            ViewCompat.setOnApplyWindowInsetsListener(this.f49285i, new C6840a());
        }
        this.f49285i.removeAllViews();
        if (layoutParams == null) {
            this.f49285i.addView(view);
        } else {
            this.f49285i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new View$OnClickListenerC6841b());
        ViewCompat.setAccessibilityDelegate(this.f49285i, new C6842c());
        this.f49285i.setOnTouchListener(new View$OnTouchListenerC6843d());
        return this.f49283g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.f49291o && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            } else {
                z = false;
            }
            FrameLayout frameLayout = this.f49283g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f49284h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            WindowCompat.setDecorFitsSystemWindows(window, !z);
            C6845f c6845f = this.f49290n;
            if (c6845f != null) {
                c6845f.m45598c(window);
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
        C6845f c6845f = this.f49290n;
        if (c6845f != null) {
            c6845f.m45598c(null);
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f49282f;
        if (bottomSheetBehavior != null && bottomSheetBehavior.getState() == 5) {
            this.f49282f.setState(4);
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f49287k != z) {
            this.f49287k = z;
            BottomSheetBehavior bottomSheetBehavior = this.f49282f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f49287k) {
            this.f49287k = true;
        }
        this.f49288l = z;
        this.f49289m = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        super.setContentView(m45601m(i, null, null));
    }

    public void setDismissWithAnimation(boolean z) {
        this.f49286j = z;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m45601m(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m45601m(0, view, layoutParams));
    }

    public BottomSheetDialog(@NonNull Context context, @StyleRes int i) {
        super(context, m45609d(context, i));
        this.f49287k = true;
        this.f49288l = true;
        this.f49292p = new C6844e();
        supportRequestWindowFeature(1);
        this.f49291o = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public BottomSheetDialog(@NonNull Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.f49287k = true;
        this.f49288l = true;
        this.f49292p = new C6844e();
        supportRequestWindowFeature(1);
        this.f49287k = z;
        this.f49291o = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }
}
