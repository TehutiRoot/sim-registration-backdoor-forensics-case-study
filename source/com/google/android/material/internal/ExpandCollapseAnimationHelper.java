package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class ExpandCollapseAnimationHelper {

    /* renamed from: a */
    public final View f50161a;

    /* renamed from: b */
    public final View f50162b;

    /* renamed from: c */
    public final List f50163c = new ArrayList();

    /* renamed from: d */
    public final List f50164d = new ArrayList();

    /* renamed from: e */
    public ValueAnimator.AnimatorUpdateListener f50165e;

    /* renamed from: f */
    public long f50166f;

    /* renamed from: g */
    public int f50167g;

    /* renamed from: h */
    public int f50168h;

    /* renamed from: com.google.android.material.internal.ExpandCollapseAnimationHelper$a */
    /* loaded from: classes4.dex */
    public class C6976a extends AnimatorListenerAdapter {
        public C6976a() {
            ExpandCollapseAnimationHelper.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ExpandCollapseAnimationHelper.this.f50162b.setVisibility(0);
        }
    }

    /* renamed from: com.google.android.material.internal.ExpandCollapseAnimationHelper$b */
    /* loaded from: classes4.dex */
    public class C6977b extends AnimatorListenerAdapter {
        public C6977b() {
            ExpandCollapseAnimationHelper.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandCollapseAnimationHelper.this.f50162b.setVisibility(8);
        }
    }

    public ExpandCollapseAnimationHelper(@NonNull View view, @NonNull View view2) {
        this.f50161a = view;
        this.f50162b = view2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m44608a(ExpandCollapseAnimationHelper expandCollapseAnimationHelper, Rect rect, ValueAnimator valueAnimator) {
        expandCollapseAnimationHelper.m44601h(rect, valueAnimator);
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addEndAnchoredViews(@NonNull View... viewArr) {
        Collections.addAll(this.f50164d, viewArr);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f50163c.add(animatorListenerAdapter);
        return this;
    }

    /* renamed from: c */
    public final void m44606c(Animator animator, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            animator.addListener((AnimatorListenerAdapter) it.next());
        }
    }

    /* renamed from: d */
    public final AnimatorSet m44605d(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m44603f(z), m44602g(z), m44604e(z));
        return animatorSet;
    }

    /* renamed from: e */
    public final Animator m44604e(boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat((this.f50162b.getLeft() - this.f50161a.getLeft()) + (this.f50161a.getRight() - this.f50162b.getRight()), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(this.f50164d));
        ofFloat.setDuration(this.f50166f);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.m44560of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return ofFloat;
    }

    /* renamed from: f */
    public final Animator m44603f(boolean z) {
        Rect calculateRectFromBounds = ViewUtils.calculateRectFromBounds(this.f50161a, this.f50167g);
        Rect calculateRectFromBounds2 = ViewUtils.calculateRectFromBounds(this.f50162b, this.f50168h);
        final Rect rect = new Rect(calculateRectFromBounds);
        ValueAnimator ofObject = ValueAnimator.ofObject(new RectEvaluator(rect), calculateRectFromBounds, calculateRectFromBounds2);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zT
            {
                ExpandCollapseAnimationHelper.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandCollapseAnimationHelper.m44608a(ExpandCollapseAnimationHelper.this, rect, valueAnimator);
            }
        });
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f50165e;
        if (animatorUpdateListener != null) {
            ofObject.addUpdateListener(animatorUpdateListener);
        }
        ofObject.setDuration(this.f50166f);
        ofObject.setInterpolator(ReversableAnimatedValueInterpolator.m44560of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return ofObject;
    }

    /* renamed from: g */
    public final Animator m44602g(boolean z) {
        List<View> children = ViewUtils.getChildren(this.f50162b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(children));
        ofFloat.setDuration(this.f50166f);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.m44560of(z, AnimationUtils.LINEAR_INTERPOLATOR));
        return ofFloat;
    }

    @NonNull
    public Animator getCollapseAnimator() {
        AnimatorSet m44605d = m44605d(false);
        m44605d.addListener(new C6977b());
        m44606c(m44605d, this.f50163c);
        return m44605d;
    }

    @NonNull
    public Animator getExpandAnimator() {
        AnimatorSet m44605d = m44605d(true);
        m44605d.addListener(new C6976a());
        m44606c(m44605d, this.f50163c);
        return m44605d;
    }

    /* renamed from: h */
    public final /* synthetic */ void m44601h(Rect rect, ValueAnimator valueAnimator) {
        ViewUtils.setBoundsFromRect(this.f50162b, rect);
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setAdditionalUpdateListener(@Nullable ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f50165e = animatorUpdateListener;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setCollapsedViewOffsetY(int i) {
        this.f50167g = i;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setDuration(long j) {
        this.f50166f = j;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setExpandedViewOffsetY(int i) {
        this.f50168h = i;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addEndAnchoredViews(@NonNull Collection<View> collection) {
        this.f50164d.addAll(collection);
        return this;
    }
}
