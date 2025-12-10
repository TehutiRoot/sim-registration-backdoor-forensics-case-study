package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public class Fade extends Visibility {

    /* renamed from: IN */
    public static final int f37705IN = 1;
    public static final int OUT = 2;

    /* renamed from: androidx.transition.Fade$a */
    /* loaded from: classes2.dex */
    public class C5087a extends TransitionListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f37706a;

        public C5087a(View view) {
            this.f37706a = view;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            AbstractC22210t32.m22523h(this.f37706a, 1.0f);
            AbstractC22210t32.m22530a(this.f37706a);
            transition.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.Fade$b */
    /* loaded from: classes2.dex */
    public static class C5088b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f37708a;

        /* renamed from: b */
        public boolean f37709b = false;

        public C5088b(View view) {
            this.f37708a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC22210t32.m22523h(this.f37708a, 1.0f);
            if (this.f37709b) {
                this.f37708a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (ViewCompat.hasOverlappingRendering(this.f37708a) && this.f37708a.getLayerType() == 0) {
                this.f37709b = true;
                this.f37708a.setLayerType(2, null);
            }
        }
    }

    public Fade(int i) {
        setMode(i);
    }

    /* renamed from: F */
    public static float m52663F(TransitionValues transitionValues, float f) {
        Float f2;
        if (transitionValues != null && (f2 = (Float) transitionValues.values.get("android:fade:transitionAlpha")) != null) {
            return f2.floatValue();
        }
        return f;
    }

    /* renamed from: E */
    public final Animator m52664E(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC22210t32.m22523h(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, AbstractC22210t32.f79982b, f2);
        ofFloat.addListener(new C5088b(view));
        addListener(new C5087a(view));
        return ofFloat;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        transitionValues.values.put("android:fade:transitionAlpha", Float.valueOf(AbstractC22210t32.m22528c(transitionValues.view)));
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        float f = 0.0f;
        float m52663F = m52663F(transitionValues, 0.0f);
        if (m52663F != 1.0f) {
            f = m52663F;
        }
        return m52664E(view, f, 1.0f);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        AbstractC22210t32.m22526e(view);
        return m52664E(view, m52663F(transitionValues, 1.0f), 0.0f);
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC20550jO1.f67270f);
        setMode(TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        obtainStyledAttributes.recycle();
    }
}
