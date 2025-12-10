package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;

    /* renamed from: j */
    public static final int f49104j = R.attr.motionDurationLong2;

    /* renamed from: k */
    public static final int f49105k = R.attr.motionDurationMedium4;

    /* renamed from: l */
    public static final int f49106l = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: a */
    public final LinkedHashSet f49107a;

    /* renamed from: b */
    public int f49108b;

    /* renamed from: c */
    public int f49109c;

    /* renamed from: d */
    public TimeInterpolator f49110d;

    /* renamed from: e */
    public TimeInterpolator f49111e;

    /* renamed from: f */
    public int f49112f;

    /* renamed from: g */
    public int f49113g;

    /* renamed from: h */
    public int f49114h;

    /* renamed from: i */
    public ViewPropertyAnimator f49115i;

    /* loaded from: classes4.dex */
    public interface OnScrollStateChangedListener {
        void onStateChanged(@NonNull View view, @ScrollState int i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface ScrollState {
    }

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    /* loaded from: classes4.dex */
    public class C6814a extends AnimatorListenerAdapter {
        public C6814a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f49115i = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f49107a = new LinkedHashSet();
        this.f49112f = 0;
        this.f49113g = 2;
        this.f49114h = 0;
    }

    public void addOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.f49107a.add(onScrollStateChangedListener);
    }

    /* renamed from: b */
    public final void m45753b(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.f49115i = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C6814a());
    }

    /* renamed from: c */
    public final void m45752c(View view, int i) {
        this.f49113g = i;
        Iterator it = this.f49107a.iterator();
        while (it.hasNext()) {
            ((OnScrollStateChangedListener) it.next()).onStateChanged(view, this.f49113g);
        }
    }

    public void clearOnScrollStateChangedListeners() {
        this.f49107a.clear();
    }

    public boolean isScrolledDown() {
        if (this.f49113g == 1) {
            return true;
        }
        return false;
    }

    public boolean isScrolledUp() {
        if (this.f49113g == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        this.f49112f = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.f49108b = MotionUtils.resolveThemeDuration(v.getContext(), f49104j, 225);
        this.f49109c = MotionUtils.resolveThemeDuration(v.getContext(), f49105k, 175);
        Context context = v.getContext();
        int i2 = f49106l;
        this.f49110d = MotionUtils.resolveThemeInterpolator(context, i2, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.f49111e = MotionUtils.resolveThemeInterpolator(v.getContext(), i2, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        if (i2 > 0) {
            slideDown(v);
        } else if (i2 < 0) {
            slideUp(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        return i == 2;
    }

    public void removeOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.f49107a.remove(onScrollStateChangedListener);
    }

    public void setAdditionalHiddenOffsetY(@NonNull V v, @Dimension int i) {
        this.f49114h = i;
        if (this.f49113g == 1) {
            v.setTranslationY(this.f49112f + i);
        }
    }

    public void slideDown(@NonNull V v) {
        slideDown(v, true);
    }

    public void slideUp(@NonNull V v) {
        slideUp(v, true);
    }

    public void slideDown(@NonNull V v, boolean z) {
        if (isScrolledDown()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f49115i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        m45752c(v, 1);
        int i = this.f49112f + this.f49114h;
        if (z) {
            m45753b(v, i, this.f49109c, this.f49111e);
        } else {
            v.setTranslationY(i);
        }
    }

    public void slideUp(@NonNull V v, boolean z) {
        if (isScrolledUp()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f49115i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        m45752c(v, 2);
        if (z) {
            m45753b(v, 0, this.f49108b, this.f49110d);
        } else {
            v.setTranslationY(0);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49107a = new LinkedHashSet();
        this.f49112f = 0;
        this.f49113g = 2;
        this.f49114h = 0;
    }
}
