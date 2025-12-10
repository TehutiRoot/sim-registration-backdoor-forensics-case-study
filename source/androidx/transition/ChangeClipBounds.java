package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public class ChangeClipBounds extends Transition {

    /* renamed from: K */
    public static final String[] f37663K = {"android:clipBounds:clip"};

    /* renamed from: androidx.transition.ChangeClipBounds$a */
    /* loaded from: classes2.dex */
    public class C5077a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f37664a;

        public C5077a(View view) {
            this.f37664a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewCompat.setClipBounds(this.f37664a, null);
        }
    }

    public ChangeClipBounds() {
    }

    /* renamed from: C */
    private void m52697C(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = ViewCompat.getClipBounds(view);
        transitionValues.values.put("android:clipBounds:clip", clipBounds);
        if (clipBounds == null) {
            transitionValues.values.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        m52697C(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        m52697C(transitionValues);
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(@NonNull ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        boolean z;
        if (transitionValues == null || transitionValues2 == null || !transitionValues.values.containsKey("android:clipBounds:clip") || !transitionValues2.values.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) transitionValues.values.get("android:clipBounds:clip");
        Rect rect2 = (Rect) transitionValues2.values.get("android:clipBounds:clip");
        if (rect2 == null) {
            z = true;
        } else {
            z = false;
        }
        if (rect == null && rect2 == null) {
            return null;
        }
        if (rect == null) {
            rect = (Rect) transitionValues.values.get("android:clipBounds:bounds");
        } else if (rect2 == null) {
            rect2 = (Rect) transitionValues2.values.get("android:clipBounds:bounds");
        }
        if (rect.equals(rect2)) {
            return null;
        }
        ViewCompat.setClipBounds(transitionValues2.view, rect);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(transitionValues2.view, AbstractC22210t32.f79983c, new C18782Xs1(new Rect()), rect, rect2);
        if (z) {
            ofObject.addListener(new C5077a(transitionValues2.view));
        }
        return ofObject;
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return f37663K;
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
