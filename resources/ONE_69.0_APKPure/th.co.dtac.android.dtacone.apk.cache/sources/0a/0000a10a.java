package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.InterfaceC2037Px;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    public static final int FAB_ANCHOR_MODE_CRADLE = 1;
    public static final int FAB_ANCHOR_MODE_EMBED = 0;
    public static final int FAB_ANIMATION_MODE_SCALE = 0;
    public static final int FAB_ANIMATION_MODE_SLIDE = 1;
    public static final int MENU_ALIGNMENT_MODE_AUTO = 0;
    public static final int MENU_ALIGNMENT_MODE_START = 1;

    /* renamed from: x0 */
    public static final int f49147x0 = R.style.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: y0 */
    public static final int f49148y0 = R.attr.motionDurationLong2;

    /* renamed from: z0 */
    public static final int f49149z0 = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: U */
    public Integer f49150U;

    /* renamed from: V */
    public final MaterialShapeDrawable f49151V;

    /* renamed from: W */
    public Animator f49152W;

    /* renamed from: a0 */
    public Animator f49153a0;

    /* renamed from: b0 */
    public int f49154b0;

    /* renamed from: c0 */
    public int f49155c0;

    /* renamed from: d0 */
    public int f49156d0;

    /* renamed from: e0 */
    public final int f49157e0;

    /* renamed from: f0 */
    public int f49158f0;

    /* renamed from: g0 */
    public int f49159g0;

    /* renamed from: h0 */
    public final boolean f49160h0;

    /* renamed from: i0 */
    public boolean f49161i0;

    /* renamed from: j0 */
    public final boolean f49162j0;

    /* renamed from: k0 */
    public final boolean f49163k0;

    /* renamed from: l0 */
    public final boolean f49164l0;

    /* renamed from: m0 */
    public int f49165m0;

    /* renamed from: n0 */
    public ArrayList f49166n0;

    /* renamed from: o0 */
    public int f49167o0;

    /* renamed from: p0 */
    public boolean f49168p0;

    /* renamed from: q0 */
    public boolean f49169q0;

    /* renamed from: r0 */
    public Behavior f49170r0;

    /* renamed from: s0 */
    public int f49171s0;

    /* renamed from: t0 */
    public int f49172t0;

    /* renamed from: u0 */
    public int f49173u0;

    /* renamed from: v0 */
    public AnimatorListenerAdapter f49174v0;

    /* renamed from: w0 */
    public TransformationCallback f49175w0;

    /* loaded from: classes4.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: m */
        public final Rect f49176m;

        /* renamed from: n */
        public WeakReference f49177n;

        /* renamed from: o */
        public int f49178o;

        /* renamed from: p */
        public final View.OnLayoutChangeListener f49179p;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        /* loaded from: classes4.dex */
        public class View$OnLayoutChangeListenerC6807a implements View.OnLayoutChangeListener {
            public View$OnLayoutChangeListenerC6807a() {
                Behavior.this = r1;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f49177n.get();
                if (bottomAppBar != null && ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        floatingActionButton.getMeasuredContentRect(Behavior.this.f49176m);
                        int height2 = Behavior.this.f49176m.height();
                        bottomAppBar.m45717B0(height2);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().getTopLeftCornerSize().getCornerSize(new RectF(Behavior.this.f49176m)));
                        height = height2;
                    }
                    CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                    if (Behavior.this.f49178o == 0) {
                        if (bottomAppBar.f49156d0 == 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                        if (ViewUtils.isLayoutRtl(view)) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin += bottomAppBar.f49157e0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin += bottomAppBar.f49157e0;
                        }
                    }
                    bottomAppBar.m45719A0();
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f49179p = new View$OnLayoutChangeListenerC6807a();
            this.f49176m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, int i) {
            this.f49177n = new WeakReference(bottomAppBar);
            View m45671s0 = bottomAppBar.m45671s0();
            if (m45671s0 != null && !ViewCompat.isLaidOut(m45671s0)) {
                BottomAppBar.m45711E0(bottomAppBar, m45671s0);
                this.f49178o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) m45671s0.getLayoutParams())).bottomMargin;
                if (m45671s0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) m45671s0;
                    if (bottomAppBar.f49156d0 == 0 && bottomAppBar.f49160h0) {
                        ViewCompat.setElevation(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                    }
                    bottomAppBar.m45678l0(floatingActionButton);
                }
                m45671s0.addOnLayoutChangeListener(this.f49179p);
                bottomAppBar.m45719A0();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f49179p = new View$OnLayoutChangeListenerC6807a();
            this.f49176m = new Rect();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface FabAlignmentMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface FabAnchorMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface FabAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface MenuAlignmentMode {
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    /* loaded from: classes4.dex */
    public class C6808a extends AnimatorListenerAdapter {
        public C6808a() {
            BottomAppBar.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!BottomAppBar.this.f49168p0) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.m45667w0(bottomAppBar.f49154b0, BottomAppBar.this.f49169q0);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    /* loaded from: classes4.dex */
    public class C6809b implements TransformationCallback {
        public C6809b() {
            BottomAppBar.this = r1;
        }

        @Override // com.google.android.material.animation.TransformationCallback
        /* renamed from: a */
        public void onScaleChanged(FloatingActionButton floatingActionButton) {
            float f;
            MaterialShapeDrawable materialShapeDrawable = BottomAppBar.this.f49151V;
            if (floatingActionButton.getVisibility() == 0 && BottomAppBar.this.f49156d0 == 1) {
                f = floatingActionButton.getScaleY();
            } else {
                f = 0.0f;
            }
            materialShapeDrawable.setInterpolation(f);
        }

        @Override // com.google.android.material.animation.TransformationCallback
        /* renamed from: b */
        public void onTranslationChanged(FloatingActionButton floatingActionButton) {
            if (BottomAppBar.this.f49156d0 != 1) {
                return;
            }
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().getHorizontalOffset() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().m45649h(translationX);
                BottomAppBar.this.f49151V.invalidateSelf();
            }
            float f = 0.0f;
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().m45655b() != max) {
                BottomAppBar.this.getTopEdgeTreatment().m45652e(max);
                BottomAppBar.this.f49151V.invalidateSelf();
            }
            MaterialShapeDrawable materialShapeDrawable = BottomAppBar.this.f49151V;
            if (floatingActionButton.getVisibility() == 0) {
                f = floatingActionButton.getScaleY();
            }
            materialShapeDrawable.setInterpolation(f);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    /* loaded from: classes4.dex */
    public class C6810c implements ViewUtils.OnApplyWindowInsetsListener {
        public C6810c() {
            BottomAppBar.this = r1;
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
            boolean z;
            if (BottomAppBar.this.f49162j0) {
                BottomAppBar.this.f49171s0 = windowInsetsCompat.getSystemWindowInsetBottom();
            }
            boolean z2 = true;
            boolean z3 = false;
            if (BottomAppBar.this.f49163k0) {
                if (BottomAppBar.this.f49173u0 != windowInsetsCompat.getSystemWindowInsetLeft()) {
                    z = true;
                } else {
                    z = false;
                }
                BottomAppBar.this.f49173u0 = windowInsetsCompat.getSystemWindowInsetLeft();
            } else {
                z = false;
            }
            if (BottomAppBar.this.f49164l0) {
                if (BottomAppBar.this.f49172t0 == windowInsetsCompat.getSystemWindowInsetRight()) {
                    z2 = false;
                }
                BottomAppBar.this.f49172t0 = windowInsetsCompat.getSystemWindowInsetRight();
                z3 = z2;
            }
            if (z || z3) {
                BottomAppBar.this.m45677m0();
                BottomAppBar.this.m45719A0();
                BottomAppBar.this.m45664z0();
            }
            return windowInsetsCompat;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    /* loaded from: classes4.dex */
    public class C6811d extends AnimatorListenerAdapter {
        public C6811d() {
            BottomAppBar.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m45674p0();
            BottomAppBar.this.f49152W = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m45673q0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    /* loaded from: classes4.dex */
    public class C6812e extends FloatingActionButton.OnVisibilityChangedListener {

        /* renamed from: a */
        public final /* synthetic */ int f49185a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e$a */
        /* loaded from: classes4.dex */
        public class C6813a extends FloatingActionButton.OnVisibilityChangedListener {
            public C6813a() {
                C6812e.this = r1;
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
            public void onShown(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m45674p0();
            }
        }

        public C6812e(int i) {
            BottomAppBar.this = r1;
            this.f49185a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
        public void onHidden(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m45670t0(this.f49185a));
            floatingActionButton.show(new C6813a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    /* loaded from: classes4.dex */
    public class C6814f extends AnimatorListenerAdapter {
        public C6814f() {
            BottomAppBar.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m45674p0();
            BottomAppBar.this.f49168p0 = false;
            BottomAppBar.this.f49153a0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m45673q0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    /* loaded from: classes4.dex */
    public class C6815g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f49189a;

        /* renamed from: b */
        public final /* synthetic */ ActionMenuView f49190b;

        /* renamed from: c */
        public final /* synthetic */ int f49191c;

        /* renamed from: d */
        public final /* synthetic */ boolean f49192d;

        public C6815g(ActionMenuView actionMenuView, int i, boolean z) {
            BottomAppBar.this = r1;
            this.f49190b = actionMenuView;
            this.f49191c = i;
            this.f49192d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f49189a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z;
            if (!this.f49189a) {
                if (BottomAppBar.this.f49167o0 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.replaceMenu(bottomAppBar.f49167o0);
                BottomAppBar.this.m45713D0(this.f49190b, this.f49191c, this.f49192d, z);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    /* loaded from: classes4.dex */
    public class RunnableC6816h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ActionMenuView f49194a;

        /* renamed from: b */
        public final /* synthetic */ int f49195b;

        /* renamed from: c */
        public final /* synthetic */ boolean f49196c;

        public RunnableC6816h(ActionMenuView actionMenuView, int i, boolean z) {
            BottomAppBar.this = r1;
            this.f49194a = actionMenuView;
            this.f49195b = i;
            this.f49196c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f49194a;
            actionMenuView.setTranslationX(BottomAppBar.this.getActionMenuViewTranslationX(actionMenuView, this.f49195b, this.f49196c));
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$i */
    /* loaded from: classes4.dex */
    public class C6817i extends AnimatorListenerAdapter {
        public C6817i() {
            BottomAppBar.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f49174v0.onAnimationStart(animator);
            FloatingActionButton m45672r0 = BottomAppBar.this.m45672r0();
            if (m45672r0 != null) {
                m45672r0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$j */
    /* loaded from: classes4.dex */
    public static class C6818j extends AbsSavedState {
        public static final Parcelable.Creator<C6818j> CREATOR = new C6819a();

        /* renamed from: b */
        public int f49199b;

        /* renamed from: c */
        public boolean f49200c;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$j$a */
        /* loaded from: classes4.dex */
        public class C6819a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C6818j createFromParcel(Parcel parcel) {
                return new C6818j(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C6818j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C6818j(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C6818j[] newArray(int i) {
                return new C6818j[i];
            }
        }

        public C6818j(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f49199b);
            parcel.writeInt(this.f49200c ? 1 : 0);
        }

        public C6818j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f49199b = parcel.readInt();
            this.f49200c = parcel.readInt() != 0;
        }
    }

    public BottomAppBar(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: A */
    public static /* synthetic */ void m45720A(View view) {
        view.requestLayout();
    }

    /* renamed from: E0 */
    public static void m45711E0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        layoutParams.anchorGravity = 17;
        int i = bottomAppBar.f49156d0;
        if (i == 1) {
            layoutParams.anchorGravity = 17 | 48;
        }
        if (i == 0) {
            layoutParams.anchorGravity |= 80;
        }
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public int getBottomInset() {
        return this.f49171s0;
    }

    private int getFabAlignmentAnimationDuration() {
        return MotionUtils.resolveThemeDuration(getContext(), f49148y0, 300);
    }

    public float getFabTranslationX() {
        return m45670t0(this.f49154b0);
    }

    private float getFabTranslationY() {
        int i;
        if (this.f49156d0 == 1) {
            return -getTopEdgeTreatment().m45655b();
        }
        View m45671s0 = m45671s0();
        if (m45671s0 != null) {
            i = (-((getMeasuredHeight() + getBottomInset()) - m45671s0.getMeasuredHeight())) / 2;
        } else {
            i = 0;
        }
        return i;
    }

    public int getLeftInset() {
        return this.f49173u0;
    }

    public int getRightInset() {
        return this.f49172t0;
    }

    @NonNull
    public BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        return (BottomAppBarTopEdgeTreatment) this.f49151V.getShapeAppearanceModel().getTopEdge();
    }

    /* renamed from: y0 */
    private Drawable m45665y0(Drawable drawable) {
        if (drawable != null && this.f49150U != null) {
            Drawable wrap = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTint(wrap, this.f49150U.intValue());
            return wrap;
        }
        return drawable;
    }

    /* renamed from: A0 */
    public final void m45719A0() {
        float f;
        getTopEdgeTreatment().m45649h(getFabTranslationX());
        MaterialShapeDrawable materialShapeDrawable = this.f49151V;
        if (this.f49169q0 && m45669u0() && this.f49156d0 == 1) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        materialShapeDrawable.setInterpolation(f);
        View m45671s0 = m45671s0();
        if (m45671s0 != null) {
            m45671s0.setTranslationY(getFabTranslationY());
            m45671s0.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: B0 */
    public boolean m45717B0(int i) {
        float f = i;
        if (f != getTopEdgeTreatment().getFabDiameter()) {
            getTopEdgeTreatment().setFabDiameter(f);
            this.f49151V.invalidateSelf();
            return true;
        }
        return false;
    }

    /* renamed from: C0 */
    public final void m45715C0(ActionMenuView actionMenuView, int i, boolean z) {
        m45713D0(actionMenuView, i, z, false);
    }

    /* renamed from: D0 */
    public final void m45713D0(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        RunnableC6816h runnableC6816h = new RunnableC6816h(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(runnableC6816h);
        } else {
            runnableC6816h.run();
        }
    }

    public void addOnScrollStateChangedListener(@NonNull HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        getBehavior().addOnScrollStateChangedListener(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        getBehavior().clearOnScrollStateChangedListeners();
    }

    public void createFabDefaultXAnimation(int i, List<Animator> list) {
        FloatingActionButton m45672r0 = m45672r0();
        if (m45672r0 != null && !m45672r0.isOrWillBeHidden()) {
            m45673q0();
            m45672r0.hide(new C6812e(i));
        }
    }

    public int getActionMenuViewTranslationX(@NonNull ActionMenuView actionMenuView, int i, boolean z) {
        int i2;
        int left;
        int i3;
        int i4 = 0;
        if (this.f49159g0 != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        if (isLayoutRtl) {
            i2 = getMeasuredWidth();
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388611) {
                if (isLayoutRtl) {
                    i2 = Math.min(i2, childAt.getLeft());
                } else {
                    i2 = Math.max(i2, childAt.getRight());
                }
            }
        }
        if (isLayoutRtl) {
            left = actionMenuView.getRight();
        } else {
            left = actionMenuView.getLeft();
        }
        if (isLayoutRtl) {
            i3 = this.f49172t0;
        } else {
            i3 = -this.f49173u0;
        }
        if (getNavigationIcon() == null) {
            i4 = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!isLayoutRtl) {
                i4 = -i4;
            }
        }
        return i2 - ((left + i3) + i4);
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.f49151V.getTintList();
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().m45655b();
    }

    public int getFabAlignmentMode() {
        return this.f49154b0;
    }

    @InterfaceC2037Px
    public int getFabAlignmentModeEndMargin() {
        return this.f49158f0;
    }

    public int getFabAnchorMode() {
        return this.f49156d0;
    }

    public int getFabAnimationMode() {
        return this.f49155c0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().m45654c();
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().m45653d();
    }

    public boolean getHideOnScroll() {
        return this.f49161i0;
    }

    public int getMenuAlignmentMode() {
        return this.f49159g0;
    }

    public boolean isScrolledDown() {
        return getBehavior().isScrolledDown();
    }

    public boolean isScrolledUp() {
        return getBehavior().isScrolledUp();
    }

    /* renamed from: l0 */
    public final void m45678l0(FloatingActionButton floatingActionButton) {
        floatingActionButton.addOnHideAnimationListener(this.f49174v0);
        floatingActionButton.addOnShowAnimationListener(new C6817i());
        floatingActionButton.addTransformationCallback(this.f49175w0);
    }

    /* renamed from: m0 */
    public final void m45677m0() {
        Animator animator = this.f49153a0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f49152W;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: n0 */
    public final void m45676n0(int i, List list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m45672r0(), "translationX", m45670t0(i));
        ofFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(ofFloat);
    }

    /* renamed from: o0 */
    public final void m45675o0(int i, boolean z, List list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        ofFloat.setDuration(0.8f * fabAlignmentAnimationDuration);
        if (Math.abs(actionMenuView.getTranslationX() - getActionMenuViewTranslationX(actionMenuView, i, z)) > 1.0f) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.setDuration(fabAlignmentAnimationDuration * 0.2f);
            ofFloat2.addListener(new C6815g(actionMenuView, i, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        } else if (actionMenuView.getAlpha() < 1.0f) {
            list.add(ofFloat);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.f49151V);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m45677m0();
            m45719A0();
            final View m45671s0 = m45671s0();
            if (m45671s0 != null && ViewCompat.isLaidOut(m45671s0)) {
                m45671s0.post(new Runnable() { // from class: nc
                    @Override // java.lang.Runnable
                    public final void run() {
                        BottomAppBar.m45720A(m45671s0);
                    }
                });
            }
        }
        m45664z0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C6818j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C6818j c6818j = (C6818j) parcelable;
        super.onRestoreInstanceState(c6818j.getSuperState());
        this.f49154b0 = c6818j.f49199b;
        this.f49169q0 = c6818j.f49200c;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        C6818j c6818j = new C6818j(super.onSaveInstanceState());
        c6818j.f49199b = this.f49154b0;
        c6818j.f49200c = this.f49169q0;
        return c6818j;
    }

    /* renamed from: p0 */
    public final void m45674p0() {
        ArrayList arrayList;
        int i = this.f49165m0 - 1;
        this.f49165m0 = i;
        if (i == 0 && (arrayList = this.f49166n0) != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                AbstractC22045rk2.m23445a(it.next());
                throw null;
            }
        }
    }

    public void performHide() {
        performHide(true);
    }

    public void performShow() {
        performShow(true);
    }

    /* renamed from: q0 */
    public final void m45673q0() {
        ArrayList arrayList;
        int i = this.f49165m0;
        this.f49165m0 = i + 1;
        if (i == 0 && (arrayList = this.f49166n0) != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                AbstractC22045rk2.m23445a(it.next());
                throw null;
            }
        }
    }

    /* renamed from: r0 */
    public final FloatingActionButton m45672r0() {
        View m45671s0 = m45671s0();
        if (m45671s0 instanceof FloatingActionButton) {
            return (FloatingActionButton) m45671s0;
        }
        return null;
    }

    public void removeOnScrollStateChangedListener(@NonNull HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        getBehavior().removeOnScrollStateChangedListener(onScrollStateChangedListener);
    }

    public void replaceMenu(@MenuRes int i) {
        if (i != 0) {
            this.f49167o0 = 0;
            getMenu().clear();
            inflateMenu(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x001e  */
    /* renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m45671s0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.getDependents(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m45671s0():android.view.View");
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        DrawableCompat.setTintList(this.f49151V, colorStateList);
    }

    public void setCradleVerticalOffset(@Dimension float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m45652e(f);
            this.f49151V.invalidateSelf();
            m45719A0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.f49151V.setElevation(f);
        getBehavior().setAdditionalHiddenOffsetY(this, this.f49151V.getShadowRadius() - this.f49151V.getShadowOffsetY());
    }

    public void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i, @MenuRes int i2) {
        this.f49167o0 = i2;
        this.f49168p0 = true;
        m45667w0(i, this.f49169q0);
        m45666x0(i);
        this.f49154b0 = i;
    }

    public void setFabAlignmentModeEndMargin(@InterfaceC2037Px int i) {
        if (this.f49158f0 != i) {
            this.f49158f0 = i;
            m45719A0();
        }
    }

    public void setFabAnchorMode(int i) {
        this.f49156d0 = i;
        m45719A0();
        View m45671s0 = m45671s0();
        if (m45671s0 != null) {
            m45711E0(this, m45671s0);
            m45671s0.requestLayout();
            this.f49151V.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.f49155c0 = i;
    }

    public void setFabCornerSize(@Dimension float f) {
        if (f != getTopEdgeTreatment().getFabCornerRadius()) {
            getTopEdgeTreatment().setFabCornerSize(f);
            this.f49151V.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@Dimension float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().m45651f(f);
            this.f49151V.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m45650g(f);
            this.f49151V.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f49161i0 = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.f49159g0 != i) {
            this.f49159g0 = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                m45715C0(actionMenuView, this.f49154b0, m45669u0());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(m45665y0(drawable));
    }

    public void setNavigationIconTint(@ColorInt int i) {
        this.f49150U = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: t0 */
    public final float m45670t0(int i) {
        int i2;
        int i3;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i4 = 1;
        if (i == 1) {
            View m45671s0 = m45671s0();
            if (isLayoutRtl) {
                i2 = this.f49173u0;
            } else {
                i2 = this.f49172t0;
            }
            if (this.f49158f0 != -1 && m45671s0 != null) {
                i3 = (m45671s0.getMeasuredWidth() / 2) + this.f49158f0;
            } else {
                i3 = this.f49157e0;
            }
            int measuredWidth = (getMeasuredWidth() / 2) - (i2 + i3);
            if (isLayoutRtl) {
                i4 = -1;
            }
            return measuredWidth * i4;
        }
        return 0.0f;
    }

    /* renamed from: u0 */
    public final boolean m45669u0() {
        FloatingActionButton m45672r0 = m45672r0();
        if (m45672r0 != null && m45672r0.isOrWillBeShown()) {
            return true;
        }
        return false;
    }

    /* renamed from: w0 */
    public final void m45667w0(int i, boolean z) {
        if (!ViewCompat.isLaidOut(this)) {
            this.f49168p0 = false;
            replaceMenu(this.f49167o0);
            return;
        }
        Animator animator = this.f49153a0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m45669u0()) {
            i = 0;
            z = false;
        }
        m45675o0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f49153a0 = animatorSet;
        animatorSet.addListener(new C6814f());
        this.f49153a0.start();
    }

    /* renamed from: x0 */
    public final void m45666x0(int i) {
        if (this.f49154b0 != i && ViewCompat.isLaidOut(this)) {
            Animator animator = this.f49152W;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f49155c0 == 1) {
                m45676n0(i, arrayList);
            } else {
                createFabDefaultXAnimation(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), f49149z0, AnimationUtils.LINEAR_INTERPOLATOR));
            this.f49152W = animatorSet;
            animatorSet.addListener(new C6811d());
            this.f49152W.start();
        }
    }

    /* renamed from: z0 */
    public final void m45664z0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f49153a0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!m45669u0()) {
                m45715C0(actionMenuView, 0, false);
            } else {
                m45715C0(actionMenuView, this.f49154b0, this.f49169q0);
            }
        }
    }

    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        if (this.f49170r0 == null) {
            this.f49170r0 = new Behavior();
        }
        return this.f49170r0;
    }

    public void performHide(boolean z) {
        getBehavior().slideDown(this, z);
    }

    public void performShow(boolean z) {
        getBehavior().slideUp(this, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BottomAppBar(@androidx.annotation.NonNull android.content.Context r13, @androidx.annotation.Nullable android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}