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
    public final View f50173a;

    /* renamed from: b */
    public final View f50174b;

    /* renamed from: c */
    public final List f50175c = new ArrayList();

    /* renamed from: d */
    public final List f50176d = new ArrayList();

    /* renamed from: e */
    public ValueAnimator.AnimatorUpdateListener f50177e;

    /* renamed from: f */
    public long f50178f;

    /* renamed from: g */
    public int f50179g;

    /* renamed from: h */
    public int f50180h;

    /* renamed from: com.google.android.material.internal.ExpandCollapseAnimationHelper$a */
    /* loaded from: classes4.dex */
    public class C6965a extends AnimatorListenerAdapter {
        public C6965a() {
            ExpandCollapseAnimationHelper.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ExpandCollapseAnimationHelper.this.f50174b.setVisibility(0);
        }
    }

    /* renamed from: com.google.android.material.internal.ExpandCollapseAnimationHelper$b */
    /* loaded from: classes4.dex */
    public class C6966b extends AnimatorListenerAdapter {
        public C6966b() {
            ExpandCollapseAnimationHelper.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandCollapseAnimationHelper.this.f50174b.setVisibility(8);
        }
    }

    public ExpandCollapseAnimationHelper(@NonNull View view, @NonNull View view2) {
        this.f50173a = view;
        this.f50174b = view2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m44595a(ExpandCollapseAnimationHelper expandCollapseAnimationHelper, Rect rect, ValueAnimator valueAnimator) {
        expandCollapseAnimationHelper.m44588h(rect, valueAnimator);
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addEndAnchoredViews(@NonNull View... viewArr) {
        Collections.addAll(this.f50176d, viewArr);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f50175c.add(animatorListenerAdapter);
        return this;
    }

    /* renamed from: c */
    public final void m44593c(Animator animator, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            animator.addListener((AnimatorListenerAdapter) it.next());
        }
    }

    /* renamed from: d */
    public final AnimatorSet m44592d(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m44590f(z), m44589g(z), m44591e(z));
        return animatorSet;
    }

    /* renamed from: e */
    public final Animator m44591e(boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat((this.f50174b.getLeft() - this.f50173a.getLeft()) + (this.f50173a.getRight() - this.f50174b.getRight()), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(this.f50176d));
        ofFloat.setDuration(this.f50178f);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.m44547of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return ofFloat;
    }

    /* renamed from: f */
    public final Animator m44590f(boolean z) {
        Rect calculateRectFromBounds = ViewUtils.calculateRectFromBounds(this.f50173a, this.f50179g);
        Rect calculateRectFromBounds2 = ViewUtils.calculateRectFromBounds(this.f50174b, this.f50180h);
        final Rect rect = new Rect(calculateRectFromBounds);
        ValueAnimator ofObject = ValueAnimator.ofObject(new RectEvaluator(rect), calculateRectFromBounds, calculateRectFromBounds2);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: DT
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandCollapseAnimationHelper.m44595a(ExpandCollapseAnimationHelper.this, rect, valueAnimator);
            }
        });
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f50177e;
        if (animatorUpdateListener != null) {
            ofObject.addUpdateListener(animatorUpdateListener);
        }
        ofObject.setDuration(this.f50178f);
        ofObject.setInterpolator(ReversableAnimatedValueInterpolator.m44547of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return ofObject;
    }

    /* renamed from: g */
    public final Animator m44589g(boolean z) {
        List<View> children = ViewUtils.getChildren(this.f50174b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(children));
        ofFloat.setDuration(this.f50178f);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.m44547of(z, AnimationUtils.LINEAR_INTERPOLATOR));
        return ofFloat;
    }

    @NonNull
    public Animator getCollapseAnimator() {
        AnimatorSet m44592d = m44592d(false);
        m44592d.addListener(new C6966b());
        m44593c(m44592d, this.f50175c);
        return m44592d;
    }

    @NonNull
    public Animator getExpandAnimator() {
        AnimatorSet m44592d = m44592d(true);
        m44592d.addListener(new C6965a());
        m44593c(m44592d, this.f50175c);
        return m44592d;
    }

    /* renamed from: h */
    public final /* synthetic */ void m44588h(Rect rect, ValueAnimator valueAnimator) {
        ViewUtils.setBoundsFromRect(this.f50174b, rect);
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setAdditionalUpdateListener(@Nullable ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f50177e = animatorUpdateListener;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setCollapsedViewOffsetY(int i) {
        this.f50179g = i;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setDuration(long j) {
        this.f50178f = j;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setExpandedViewOffsetY(int i) {
        this.f50180h = i;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addEndAnchoredViews(@NonNull Collection<View> collection) {
        this.f50176d.addAll(collection);
        return this;
    }
}