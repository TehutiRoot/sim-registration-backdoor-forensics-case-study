package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.animation.ChildrenAlphaProperty;
import com.google.android.material.animation.DrawableAlphaProperty;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.animation.Positioning;
import com.google.android.material.circularreveal.CircularRevealCompat;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.math.MathUtils;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes4.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f51276c;

    /* renamed from: d */
    public final RectF f51277d;

    /* renamed from: e */
    public final RectF f51278e;

    /* renamed from: f */
    public final int[] f51279f;

    /* renamed from: g */
    public float f51280g;

    /* renamed from: h */
    public float f51281h;

    /* loaded from: classes4.dex */
    public static class FabTransformationSpec {
        public Positioning positioning;
        @Nullable
        public MotionSpec timings;
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    /* loaded from: classes4.dex */
    public class C7152a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f51282a;

        /* renamed from: b */
        public final /* synthetic */ View f51283b;

        /* renamed from: c */
        public final /* synthetic */ View f51284c;

        public C7152a(boolean z, View view, View view2) {
            this.f51282a = z;
            this.f51283b = view;
            this.f51284c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f51282a) {
                this.f51283b.setVisibility(4);
                this.f51284c.setAlpha(1.0f);
                this.f51284c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f51282a) {
                this.f51283b.setVisibility(0);
                this.f51284c.setAlpha(0.0f);
                this.f51284c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    /* loaded from: classes4.dex */
    public class C7153b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f51286a;

        public C7153b(View view) {
            this.f51286a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f51286a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    /* loaded from: classes4.dex */
    public class C7154c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ CircularRevealWidget f51288a;

        /* renamed from: b */
        public final /* synthetic */ Drawable f51289b;

        public C7154c(CircularRevealWidget circularRevealWidget, Drawable drawable) {
            this.f51288a = circularRevealWidget;
            this.f51289b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51288a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f51288a.setCircularRevealOverlayDrawable(this.f51289b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    /* loaded from: classes4.dex */
    public class C7155d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ CircularRevealWidget f51291a;

        public C7155d(CircularRevealWidget circularRevealWidget) {
            this.f51291a = circularRevealWidget;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CircularRevealWidget.RevealInfo revealInfo = this.f51291a.getRevealInfo();
            revealInfo.radius = Float.MAX_VALUE;
            this.f51291a.setRevealInfo(revealInfo);
        }
    }

    public FabTransformationBehavior() {
        this.f51276c = new Rect();
        this.f51277d = new RectF();
        this.f51278e = new RectF();
        this.f51279f = new int[2];
    }

    /* renamed from: d */
    public final ViewGroup m43561d(View view) {
        View findViewById = view.findViewById(R.id.mtrl_child_content_container);
        if (findViewById != null) {
            return m43541x(findViewById);
        }
        if (!(view instanceof TransformationChildLayout) && !(view instanceof TransformationChildCard)) {
            return m43541x(view);
        }
        return m43541x(((ViewGroup) view).getChildAt(0));
    }

    /* renamed from: e */
    public final void m43560e(View view, FabTransformationSpec fabTransformationSpec, MotionTiming motionTiming, MotionTiming motionTiming2, float f, float f2, float f3, float f4, RectF rectF) {
        float m43553l = m43553l(fabTransformationSpec, motionTiming, f, f3);
        float m43553l2 = m43553l(fabTransformationSpec, motionTiming2, f2, f4);
        Rect rect = this.f51276c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f51277d;
        rectF2.set(rect);
        RectF rectF3 = this.f51278e;
        m43552m(view, rectF3);
        rectF3.offset(m43553l, m43553l2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: f */
    public final void m43559f(View view, RectF rectF) {
        m43552m(view, rectF);
        rectF.offset(this.f51280g, this.f51281h);
    }

    /* renamed from: g */
    public final Pair m43558g(float f, float f2, boolean z, FabTransformationSpec fabTransformationSpec) {
        MotionTiming timing;
        MotionTiming timing2;
        int i;
        if (f != 0.0f && f2 != 0.0f) {
            if ((z && f2 < 0.0f) || (!z && i > 0)) {
                timing = fabTransformationSpec.timings.getTiming("translationXCurveUpwards");
                timing2 = fabTransformationSpec.timings.getTiming("translationYCurveUpwards");
            } else {
                timing = fabTransformationSpec.timings.getTiming("translationXCurveDownwards");
                timing2 = fabTransformationSpec.timings.getTiming("translationYCurveDownwards");
            }
        } else {
            timing = fabTransformationSpec.timings.getTiming("translationXLinear");
            timing2 = fabTransformationSpec.timings.getTiming("translationYLinear");
        }
        return new Pair(timing, timing2);
    }

    /* renamed from: h */
    public final float m43557h(View view, View view2, Positioning positioning) {
        RectF rectF = this.f51277d;
        RectF rectF2 = this.f51278e;
        m43559f(view, rectF);
        m43552m(view2, rectF2);
        rectF2.offset(-m43555j(view, view2, positioning), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: i */
    public final float m43556i(View view, View view2, Positioning positioning) {
        RectF rectF = this.f51277d;
        RectF rectF2 = this.f51278e;
        m43559f(view, rectF);
        m43552m(view2, rectF2);
        rectF2.offset(0.0f, -m43554k(view, view2, positioning));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: j */
    public final float m43555j(View view, View view2, Positioning positioning) {
        float centerX;
        float centerX2;
        float f;
        RectF rectF = this.f51277d;
        RectF rectF2 = this.f51278e;
        m43559f(view, rectF);
        m43552m(view2, rectF2);
        int i = positioning.gravity & 7;
        if (i != 1) {
            if (i != 3) {
                if (i != 5) {
                    f = 0.0f;
                    return f + positioning.xAdjustment;
                }
                centerX = rectF2.right;
                centerX2 = rectF.right;
            } else {
                centerX = rectF2.left;
                centerX2 = rectF.left;
            }
        } else {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        }
        f = centerX - centerX2;
        return f + positioning.xAdjustment;
    }

    /* renamed from: k */
    public final float m43554k(View view, View view2, Positioning positioning) {
        float centerY;
        float centerY2;
        float f;
        RectF rectF = this.f51277d;
        RectF rectF2 = this.f51278e;
        m43559f(view, rectF);
        m43552m(view2, rectF2);
        int i = positioning.gravity & 112;
        if (i != 16) {
            if (i != 48) {
                if (i != 80) {
                    f = 0.0f;
                    return f + positioning.yAdjustment;
                }
                centerY = rectF2.bottom;
                centerY2 = rectF.bottom;
            } else {
                centerY = rectF2.top;
                centerY2 = rectF.top;
            }
        } else {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        }
        f = centerY - centerY2;
        return f + positioning.yAdjustment;
    }

    /* renamed from: l */
    public final float m43553l(FabTransformationSpec fabTransformationSpec, MotionTiming motionTiming, float f, float f2) {
        long delay = motionTiming.getDelay();
        long duration = motionTiming.getDuration();
        MotionTiming timing = fabTransformationSpec.timings.getTiming("expansion");
        return AnimationUtils.lerp(f, f2, motionTiming.getInterpolator().getInterpolation(((float) (((timing.getDelay() + timing.getDuration()) + 17) - delay)) / ((float) duration)));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint != 0 && expandedComponentIdHint != view.getId()) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    /* renamed from: m */
    public final void m43552m(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f51279f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: n */
    public final void m43551n(View view, View view2, boolean z, boolean z2, FabTransformationSpec fabTransformationSpec, List list, List list2) {
        ViewGroup m43561d;
        ObjectAnimator ofFloat;
        if (!(view2 instanceof ViewGroup)) {
            return;
        }
        if (((view2 instanceof CircularRevealWidget) && CircularRevealHelper.STRATEGY == 0) || (m43561d = m43561d(view2)) == null) {
            return;
        }
        if (z) {
            if (!z2) {
                ChildrenAlphaProperty.CHILDREN_ALPHA.set(m43561d, Float.valueOf(0.0f));
            }
            ofFloat = ObjectAnimator.ofFloat(m43561d, ChildrenAlphaProperty.CHILDREN_ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(m43561d, ChildrenAlphaProperty.CHILDREN_ALPHA, 0.0f);
        }
        fabTransformationSpec.timings.getTiming("contentFade").apply(ofFloat);
        list.add(ofFloat);
    }

    /* renamed from: o */
    public final void m43550o(View view, View view2, boolean z, boolean z2, FabTransformationSpec fabTransformationSpec, List list, List list2) {
        ObjectAnimator ofInt;
        if (!(view2 instanceof CircularRevealWidget)) {
            return;
        }
        CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
        int m43542w = m43542w(view);
        int i = 16777215 & m43542w;
        if (z) {
            if (!z2) {
                circularRevealWidget.setCircularRevealScrimColor(m43542w);
            }
            ofInt = ObjectAnimator.ofInt(circularRevealWidget, CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, i);
        } else {
            ofInt = ObjectAnimator.ofInt(circularRevealWidget, CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, m43542w);
        }
        ofInt.setEvaluator(ArgbEvaluatorCompat.getInstance());
        fabTransformationSpec.timings.getTiming(TypedValues.Custom.S_COLOR).apply(ofInt);
        list.add(ofInt);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public AnimatorSet onCreateExpandedStateChangeAnimation(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        FabTransformationSpec onCreateMotionSpec = onCreateMotionSpec(view2.getContext(), z);
        if (z) {
            this.f51280g = view.getTranslationX();
            this.f51281h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m43548q(view, view2, z, z2, onCreateMotionSpec, arrayList, arrayList2);
        RectF rectF = this.f51277d;
        m43543v(view, view2, z, z2, onCreateMotionSpec, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m43549p(view, view2, z, onCreateMotionSpec, arrayList);
        m43546s(view, view2, z, z2, onCreateMotionSpec, arrayList, arrayList2);
        m43547r(view, view2, z, z2, onCreateMotionSpec, width, height, arrayList, arrayList2);
        m43550o(view, view2, z, z2, onCreateMotionSpec, arrayList, arrayList2);
        m43551n(view, view2, z, z2, onCreateMotionSpec, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.addListener(new C7152a(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    public abstract FabTransformationSpec onCreateMotionSpec(Context context, boolean z);

    /* renamed from: p */
    public final void m43549p(View view, View view2, boolean z, FabTransformationSpec fabTransformationSpec, List list) {
        float m43555j = m43555j(view, view2, fabTransformationSpec.positioning);
        float m43554k = m43554k(view, view2, fabTransformationSpec.positioning);
        Pair m43558g = m43558g(m43555j, m43554k, z, fabTransformationSpec);
        MotionTiming motionTiming = (MotionTiming) m43558g.first;
        MotionTiming motionTiming2 = (MotionTiming) m43558g.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            m43555j = this.f51280g;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, m43555j);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            m43554k = this.f51281h;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, m43554k);
        motionTiming.apply(ofFloat);
        motionTiming2.apply(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: q */
    public final void m43548q(View view, View view2, boolean z, boolean z2, FabTransformationSpec fabTransformationSpec, List list, List list2) {
        ObjectAnimator ofFloat;
        float elevation = ViewCompat.getElevation(view2) - ViewCompat.getElevation(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -elevation);
        }
        fabTransformationSpec.timings.getTiming("elevation").apply(ofFloat);
        list.add(ofFloat);
    }

    /* renamed from: r */
    public final void m43547r(View view, View view2, boolean z, boolean z2, FabTransformationSpec fabTransformationSpec, float f, float f2, List list, List list2) {
        Animator animator;
        if (!(view2 instanceof CircularRevealWidget)) {
            return;
        }
        CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
        float m43557h = m43557h(view, view2, fabTransformationSpec.positioning);
        float m43556i = m43556i(view, view2, fabTransformationSpec.positioning);
        ((FloatingActionButton) view).getContentRect(this.f51276c);
        float width = this.f51276c.width() / 2.0f;
        MotionTiming timing = fabTransformationSpec.timings.getTiming("expansion");
        if (z) {
            if (!z2) {
                circularRevealWidget.setRevealInfo(new CircularRevealWidget.RevealInfo(m43557h, m43556i, width));
            }
            if (z2) {
                width = circularRevealWidget.getRevealInfo().radius;
            }
            animator = CircularRevealCompat.createCircularReveal(circularRevealWidget, m43557h, m43556i, MathUtils.distanceToFurthestCorner(m43557h, m43556i, 0.0f, 0.0f, f, f2));
            animator.addListener(new C7155d(circularRevealWidget));
            m43544u(view2, timing.getDelay(), (int) m43557h, (int) m43556i, width, list);
        } else {
            float f3 = circularRevealWidget.getRevealInfo().radius;
            Animator createCircularReveal = CircularRevealCompat.createCircularReveal(circularRevealWidget, m43557h, m43556i, width);
            int i = (int) m43557h;
            int i2 = (int) m43556i;
            m43544u(view2, timing.getDelay(), i, i2, f3, list);
            m43545t(view2, timing.getDelay(), timing.getDuration(), fabTransformationSpec.timings.getTotalDuration(), i, i2, width, list);
            animator = createCircularReveal;
        }
        timing.apply(animator);
        list.add(animator);
        list2.add(CircularRevealCompat.createCircularRevealListener(circularRevealWidget));
    }

    /* renamed from: s */
    public final void m43546s(View view, View view2, boolean z, boolean z2, FabTransformationSpec fabTransformationSpec, List list, List list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof CircularRevealWidget) && (view instanceof ImageView)) {
            CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 255);
            }
            ofInt.addUpdateListener(new C7153b(view2));
            fabTransformationSpec.timings.getTiming("iconFade").apply(ofInt);
            list.add(ofInt);
            list2.add(new C7154c(circularRevealWidget, drawable));
        }
    }

    /* renamed from: t */
    public final void m43545t(View view, long j, long j2, long j3, int i, int i2, float f, List list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: u */
    public final void m43544u(View view, long j, int i, int i2, float f, List list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: v */
    public final void m43543v(View view, View view2, boolean z, boolean z2, FabTransformationSpec fabTransformationSpec, List list, List list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float m43555j = m43555j(view, view2, fabTransformationSpec.positioning);
        float m43554k = m43554k(view, view2, fabTransformationSpec.positioning);
        Pair m43558g = m43558g(m43555j, m43554k, z, fabTransformationSpec);
        MotionTiming motionTiming = (MotionTiming) m43558g.first;
        MotionTiming motionTiming2 = (MotionTiming) m43558g.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-m43555j);
                view2.setTranslationY(-m43554k);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            m43560e(view2, fabTransformationSpec, motionTiming, motionTiming2, -m43555j, -m43554k, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -m43555j);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -m43554k);
        }
        motionTiming.apply(ofFloat);
        motionTiming2.apply(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: w */
    public final int m43542w(View view) {
        ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(view);
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: x */
    public final ViewGroup m43541x(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51276c = new Rect();
        this.f51277d = new RectF();
        this.f51278e = new RectF();
        this.f51279f = new int[2];
    }
}
