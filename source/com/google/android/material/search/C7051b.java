package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.RectEvaluator;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.C7051b;
import com.google.android.material.search.SearchView;
import java.util.Objects;

/* renamed from: com.google.android.material.search.b */
/* loaded from: classes4.dex */
public class C7051b {

    /* renamed from: a */
    public final SearchView f50571a;

    /* renamed from: b */
    public final View f50572b;

    /* renamed from: c */
    public final ClippableRoundedCornerLayout f50573c;

    /* renamed from: d */
    public final FrameLayout f50574d;

    /* renamed from: e */
    public final FrameLayout f50575e;

    /* renamed from: f */
    public final Toolbar f50576f;

    /* renamed from: g */
    public final Toolbar f50577g;

    /* renamed from: h */
    public final TextView f50578h;

    /* renamed from: i */
    public final EditText f50579i;

    /* renamed from: j */
    public final ImageButton f50580j;

    /* renamed from: k */
    public final View f50581k;

    /* renamed from: l */
    public final TouchObserverFrameLayout f50582l;

    /* renamed from: m */
    public SearchBar f50583m;

    /* renamed from: com.google.android.material.search.b$a */
    /* loaded from: classes4.dex */
    public class C7052a extends AnimatorListenerAdapter {
        public C7052a() {
            C7051b.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!C7051b.this.f50571a.m44346k()) {
                C7051b.this.f50571a.m44334w();
            }
            C7051b.this.f50571a.setTransitionState(SearchView.TransitionState.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C7051b.this.f50573c.setVisibility(0);
            C7051b.this.f50583m.stopOnLoadAnimation();
        }
    }

    /* renamed from: com.google.android.material.search.b$b */
    /* loaded from: classes4.dex */
    public class C7053b extends AnimatorListenerAdapter {
        public C7053b() {
            C7051b.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C7051b.this.f50573c.setVisibility(8);
            if (!C7051b.this.f50571a.m44346k()) {
                C7051b.this.f50571a.clearFocusAndHideKeyboard();
            }
            C7051b.this.f50571a.setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C7051b.this.f50571a.setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    /* renamed from: com.google.android.material.search.b$c */
    /* loaded from: classes4.dex */
    public class C7054c extends AnimatorListenerAdapter {
        public C7054c() {
            C7051b.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!C7051b.this.f50571a.m44346k()) {
                C7051b.this.f50571a.m44334w();
            }
            C7051b.this.f50571a.setTransitionState(SearchView.TransitionState.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C7051b.this.f50573c.setVisibility(0);
            C7051b.this.f50571a.setTransitionState(SearchView.TransitionState.SHOWING);
        }
    }

    /* renamed from: com.google.android.material.search.b$d */
    /* loaded from: classes4.dex */
    public class C7055d extends AnimatorListenerAdapter {
        public C7055d() {
            C7051b.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C7051b.this.f50573c.setVisibility(8);
            if (!C7051b.this.f50571a.m44346k()) {
                C7051b.this.f50571a.clearFocusAndHideKeyboard();
            }
            C7051b.this.f50571a.setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C7051b.this.f50571a.setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    /* renamed from: com.google.android.material.search.b$e */
    /* loaded from: classes4.dex */
    public class C7056e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f50588a;

        public C7056e(boolean z) {
            C7051b.this = r1;
            this.f50588a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            float f;
            C7051b c7051b = C7051b.this;
            if (this.f50588a) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            c7051b.m44273Q(f);
            if (this.f50588a) {
                C7051b.this.f50573c.resetClipBoundsAndCornerRadius();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            float f;
            C7051b c7051b = C7051b.this;
            if (this.f50588a) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            c7051b.m44273Q(f);
        }
    }

    public C7051b(SearchView searchView) {
        this.f50571a = searchView;
        this.f50572b = searchView.f50523a;
        this.f50573c = searchView.f50524b;
        this.f50574d = searchView.f50527e;
        this.f50575e = searchView.f50528f;
        this.f50576f = searchView.f50529g;
        this.f50577g = searchView.f50530h;
        this.f50578h = searchView.f50531i;
        this.f50579i = searchView.f50532j;
        this.f50580j = searchView.f50533k;
        this.f50581k = searchView.f50534l;
        this.f50582l = searchView.f50535m;
    }

    /* renamed from: K */
    public static /* synthetic */ void m44279K(DrawerArrowDrawable drawerArrowDrawable, ValueAnimator valueAnimator) {
        drawerArrowDrawable.setProgress(valueAnimator.getAnimatedFraction());
    }

    /* renamed from: L */
    public static /* synthetic */ void m44278L(FadeThroughDrawable fadeThroughDrawable, ValueAnimator valueAnimator) {
        fadeThroughDrawable.setProgress(valueAnimator.getAnimatedFraction());
    }

    /* renamed from: a */
    public static /* synthetic */ void m44263a(C7051b c7051b) {
        c7051b.m44275O();
    }

    /* renamed from: b */
    public static /* synthetic */ void m44262b(C7051b c7051b, float f, Rect rect, ValueAnimator valueAnimator) {
        c7051b.m44277M(f, rect, valueAnimator);
    }

    /* renamed from: c */
    public static /* synthetic */ void m44261c(DrawerArrowDrawable drawerArrowDrawable, ValueAnimator valueAnimator) {
        m44279K(drawerArrowDrawable, valueAnimator);
    }

    /* renamed from: d */
    public static /* synthetic */ void m44260d(C7051b c7051b) {
        c7051b.m44276N();
    }

    /* renamed from: e */
    public static /* synthetic */ void m44259e(FadeThroughDrawable fadeThroughDrawable, ValueAnimator valueAnimator) {
        m44278L(fadeThroughDrawable, valueAnimator);
    }

    /* renamed from: A */
    public final int m44289A(View view) {
        int marginStart = MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        int paddingStart = ViewCompat.getPaddingStart(this.f50583m);
        if (ViewUtils.isLayoutRtl(this.f50583m)) {
            return ((this.f50583m.getWidth() - this.f50583m.getRight()) + marginStart) - paddingStart;
        }
        return (this.f50583m.getLeft() - marginStart) + paddingStart;
    }

    /* renamed from: B */
    public final int m44288B() {
        return ((this.f50583m.getTop() + this.f50583m.getBottom()) / 2) - ((this.f50575e.getTop() + this.f50575e.getBottom()) / 2);
    }

    /* renamed from: C */
    public final Animator m44287C(boolean z) {
        return m44282H(z, false, this.f50574d);
    }

    /* renamed from: D */
    public final Animator m44286D(boolean z) {
        long j;
        Rect calculateRectFromBounds = ViewUtils.calculateRectFromBounds(this.f50571a);
        Rect m44249o = m44249o();
        final Rect rect = new Rect(m44249o);
        final float cornerSize = this.f50583m.getCornerSize();
        ValueAnimator ofObject = ValueAnimator.ofObject(new RectEvaluator(rect), m44249o, calculateRectFromBounds);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cF1
            {
                C7051b.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7051b.m44262b(C7051b.this, cornerSize, rect, valueAnimator);
            }
        });
        if (z) {
            j = 300;
        } else {
            j = 250;
        }
        ofObject.setDuration(j);
        ofObject.setInterpolator(ReversableAnimatedValueInterpolator.m44560of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return ofObject;
    }

    /* renamed from: E */
    public final Animator m44285E(boolean z) {
        TimeInterpolator timeInterpolator;
        long j;
        if (z) {
            timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        } else {
            timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.m44560of(z, timeInterpolator));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.f50572b));
        return ofFloat;
    }

    /* renamed from: F */
    public final Animator m44284F(boolean z) {
        return m44282H(z, true, this.f50578h);
    }

    /* renamed from: G */
    public final AnimatorSet m44283G(boolean z) {
        long j;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m44281I());
        m44253k(animatorSet);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.m44560of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        if (z) {
            j = 350;
        } else {
            j = 300;
        }
        animatorSet.setDuration(j);
        return animatorSet;
    }

    /* renamed from: H */
    public final Animator m44282H(boolean z, boolean z2, View view) {
        int m44238z;
        long j;
        if (z2) {
            m44238z = m44289A(view);
        } else {
            m44238z = m44238z(view);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m44238z, 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(view));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(m44288B(), 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        if (z) {
            j = 300;
        } else {
            j = 250;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.m44560of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    /* renamed from: I */
    public final Animator m44281I() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f50573c.getHeight(), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(this.f50573c));
        return ofFloat;
    }

    /* renamed from: J */
    public void m44280J() {
        if (this.f50583m != null) {
            m44267W();
        } else {
            m44266X();
        }
    }

    /* renamed from: M */
    public final /* synthetic */ void m44277M(float f, Rect rect, ValueAnimator valueAnimator) {
        this.f50573c.updateClipBoundsAndCornerRadius(rect, f * (1.0f - valueAnimator.getAnimatedFraction()));
    }

    /* renamed from: N */
    public final /* synthetic */ void m44276N() {
        AnimatorSet m44239y = m44239y(true);
        m44239y.addListener(new C7052a());
        m44239y.start();
    }

    /* renamed from: O */
    public final /* synthetic */ void m44275O() {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f50573c;
        clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
        AnimatorSet m44283G = m44283G(true);
        m44283G.addListener(new C7054c());
        m44283G.start();
    }

    /* renamed from: P */
    public final void m44274P(float f) {
        ActionMenuView actionMenuView;
        if (this.f50571a.isMenuItemsAnimated() && (actionMenuView = ToolbarUtils.getActionMenuView(this.f50576f)) != null) {
            actionMenuView.setAlpha(f);
        }
    }

    /* renamed from: Q */
    public final void m44273Q(float f) {
        this.f50580j.setAlpha(f);
        this.f50581k.setAlpha(f);
        this.f50582l.setAlpha(f);
        m44274P(f);
    }

    /* renamed from: R */
    public final void m44272R(Drawable drawable) {
        if (drawable instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) drawable).setProgress(1.0f);
        }
        if (drawable instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawable).setProgress(1.0f);
        }
    }

    /* renamed from: S */
    public final void m44271S(Toolbar toolbar) {
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(toolbar);
        if (actionMenuView != null) {
            for (int i = 0; i < actionMenuView.getChildCount(); i++) {
                View childAt = actionMenuView.getChildAt(i);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    /* renamed from: T */
    public void m44270T(SearchBar searchBar) {
        this.f50583m = searchBar;
    }

    /* renamed from: U */
    public final void m44269U() {
        Menu menu = this.f50577g.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.f50583m.getMenuResId() != -1 && this.f50571a.isMenuItemsAnimated()) {
            this.f50577g.inflateMenu(this.f50583m.getMenuResId());
            m44271S(this.f50577g);
            this.f50577g.setVisibility(0);
            return;
        }
        this.f50577g.setVisibility(8);
    }

    /* renamed from: V */
    public void m44268V() {
        if (this.f50583m != null) {
            m44265Y();
        } else {
            m44264Z();
        }
    }

    /* renamed from: W */
    public final void m44267W() {
        if (this.f50571a.m44346k()) {
            this.f50571a.clearFocusAndHideKeyboard();
        }
        AnimatorSet m44239y = m44239y(false);
        m44239y.addListener(new C7053b());
        m44239y.start();
    }

    /* renamed from: X */
    public final void m44266X() {
        if (this.f50571a.m44346k()) {
            this.f50571a.clearFocusAndHideKeyboard();
        }
        AnimatorSet m44283G = m44283G(false);
        m44283G.addListener(new C7055d());
        m44283G.start();
    }

    /* renamed from: Y */
    public final void m44265Y() {
        if (this.f50571a.m44346k()) {
            this.f50571a.m44334w();
        }
        this.f50571a.setTransitionState(SearchView.TransitionState.SHOWING);
        m44269U();
        this.f50579i.setText(this.f50583m.getText());
        EditText editText = this.f50579i;
        editText.setSelection(editText.getText().length());
        this.f50573c.setVisibility(4);
        this.f50573c.post(new Runnable() { // from class: eF1
            {
                C7051b.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7051b.m44260d(C7051b.this);
            }
        });
    }

    /* renamed from: Z */
    public final void m44264Z() {
        if (this.f50571a.m44346k()) {
            final SearchView searchView = this.f50571a;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new Runnable() { // from class: gF1
                @Override // java.lang.Runnable
                public final void run() {
                    SearchView.this.m44334w();
                }
            }, 150L);
        }
        this.f50573c.setVisibility(4);
        this.f50573c.post(new Runnable() { // from class: hF1
            {
                C7051b.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7051b.m44263a(C7051b.this);
            }
        });
    }

    /* renamed from: j */
    public final void m44254j(AnimatorSet animatorSet) {
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(this.f50576f);
        if (actionMenuView == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m44238z(actionMenuView), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(actionMenuView));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(m44288B(), 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(actionMenuView));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    /* renamed from: k */
    public final void m44253k(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.f50576f);
        if (navigationIconButton == null) {
            return;
        }
        Drawable unwrap = DrawableCompat.unwrap(navigationIconButton.getDrawable());
        if (this.f50571a.isAnimatedNavigationIcon()) {
            m44251m(animatorSet, unwrap);
            m44250n(animatorSet, unwrap);
            return;
        }
        m44272R(unwrap);
    }

    /* renamed from: l */
    public final void m44252l(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.f50576f);
        if (navigationIconButton == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m44289A(navigationIconButton), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(navigationIconButton));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(m44288B(), 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(navigationIconButton));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    /* renamed from: m */
    public final void m44251m(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof DrawerArrowDrawable) {
            final DrawerArrowDrawable drawerArrowDrawable = (DrawerArrowDrawable) drawable;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dF1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C7051b.m44261c(drawerArrowDrawable, valueAnimator);
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    /* renamed from: n */
    public final void m44250n(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof FadeThroughDrawable) {
            final FadeThroughDrawable fadeThroughDrawable = (FadeThroughDrawable) drawable;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fF1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C7051b.m44259e(fadeThroughDrawable, valueAnimator);
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    /* renamed from: o */
    public final Rect m44249o() {
        int[] iArr = new int[2];
        this.f50583m.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.f50573c.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, this.f50583m.getWidth() + i3, this.f50583m.getHeight() + i4);
    }

    /* renamed from: p */
    public final Animator m44248p(boolean z) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.m44560of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        if (this.f50571a.isMenuItemsAnimated()) {
            ofFloat.addUpdateListener(new FadeThroughUpdateListener(ToolbarUtils.getActionMenuView(this.f50577g), ToolbarUtils.getActionMenuView(this.f50576f)));
        }
        return ofFloat;
    }

    /* renamed from: q */
    public final Animator m44247q(boolean z) {
        long j;
        AnimatorSet animatorSet = new AnimatorSet();
        m44252l(animatorSet);
        m44253k(animatorSet);
        m44254j(animatorSet);
        if (z) {
            j = 300;
        } else {
            j = 250;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.m44560of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    /* renamed from: r */
    public final Animator m44246r(boolean z) {
        long j;
        long j2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z) {
            j = 50;
        } else {
            j = 42;
        }
        ofFloat.setDuration(j);
        if (z) {
            j2 = 250;
        } else {
            j2 = 0;
        }
        ofFloat.setStartDelay(j2);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.m44560of(z, AnimationUtils.LINEAR_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.f50580j));
        return ofFloat;
    }

    /* renamed from: s */
    public final Animator m44245s(boolean z) {
        long j;
        long j2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z) {
            j = 150;
        } else {
            j = 83;
        }
        ofFloat.setDuration(j);
        if (z) {
            j2 = 75;
        } else {
            j2 = 0;
        }
        ofFloat.setStartDelay(j2);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.m44560of(z, AnimationUtils.LINEAR_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.f50581k, this.f50582l));
        return ofFloat;
    }

    /* renamed from: t */
    public final Animator m44244t(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m44245s(z), m44242v(z), m44243u(z));
        return animatorSet;
    }

    /* renamed from: u */
    public final Animator m44243u(boolean z) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.95f, 1.0f);
        if (z) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.m44560of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.scaleListener(this.f50582l));
        return ofFloat;
    }

    /* renamed from: v */
    public final Animator m44242v(boolean z) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat((this.f50582l.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        if (z) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.m44560of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(this.f50581k));
        return ofFloat;
    }

    /* renamed from: w */
    public final Animator m44241w(boolean z) {
        return m44282H(z, false, this.f50577g);
    }

    /* renamed from: x */
    public final Animator m44240x(boolean z) {
        return m44282H(z, true, this.f50579i);
    }

    /* renamed from: y */
    public final AnimatorSet m44239y(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m44285E(z), m44286D(z), m44246r(z), m44244t(z), m44247q(z), m44287C(z), m44241w(z), m44248p(z), m44240x(z), m44284F(z));
        animatorSet.addListener(new C7056e(z));
        return animatorSet;
    }

    /* renamed from: z */
    public final int m44238z(View view) {
        int marginEnd = MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        if (ViewUtils.isLayoutRtl(this.f50583m)) {
            return this.f50583m.getLeft() - marginEnd;
        }
        return (this.f50583m.getRight() - this.f50571a.getWidth()) + marginEnd;
    }
}
