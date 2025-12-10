package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class ViewPropertyAnimatorCompat {

    /* renamed from: a */
    public final WeakReference f34314a;

    /* renamed from: b */
    public Runnable f34315b = null;

    /* renamed from: c */
    public Runnable f34316c = null;

    /* renamed from: d */
    public int f34317d = -1;

    /* renamed from: androidx.core.view.ViewPropertyAnimatorCompat$a */
    /* loaded from: classes2.dex */
    public class C4132a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewPropertyAnimatorListener f34318a;

        /* renamed from: b */
        public final /* synthetic */ View f34319b;

        public C4132a(ViewPropertyAnimatorListener viewPropertyAnimatorListener, View view) {
            ViewPropertyAnimatorCompat.this = r1;
            this.f34318a = viewPropertyAnimatorListener;
            this.f34319b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f34318a.onAnimationCancel(this.f34319b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f34318a.onAnimationEnd(this.f34319b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f34318a.onAnimationStart(this.f34319b);
        }
    }

    /* renamed from: androidx.core.view.ViewPropertyAnimatorCompat$b */
    /* loaded from: classes2.dex */
    public static class C4133b {
        @DoNotInline
        /* renamed from: a */
        public static ViewPropertyAnimator m56710a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        @DoNotInline
        /* renamed from: b */
        public static ViewPropertyAnimator m56709b(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        @DoNotInline
        /* renamed from: c */
        public static ViewPropertyAnimator m56708c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    /* renamed from: androidx.core.view.ViewPropertyAnimatorCompat$c */
    /* loaded from: classes2.dex */
    public static class C4134c {
        @DoNotInline
        /* renamed from: a */
        public static Interpolator m56707a(ViewPropertyAnimator viewPropertyAnimator) {
            return (Interpolator) viewPropertyAnimator.getInterpolator();
        }
    }

    /* renamed from: androidx.core.view.ViewPropertyAnimatorCompat$d */
    /* loaded from: classes2.dex */
    public static class C4135d {
        @DoNotInline
        /* renamed from: a */
        public static ViewPropertyAnimator m56706a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* renamed from: androidx.core.view.ViewPropertyAnimatorCompat$e */
    /* loaded from: classes2.dex */
    public static class C4136e {
        @DoNotInline
        /* renamed from: a */
        public static ViewPropertyAnimator m56705a(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZ(f);
        }

        @DoNotInline
        /* renamed from: b */
        public static ViewPropertyAnimator m56704b(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZBy(f);
        }

        @DoNotInline
        /* renamed from: c */
        public static ViewPropertyAnimator m56703c(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.z(f);
        }

        @DoNotInline
        /* renamed from: d */
        public static ViewPropertyAnimator m56702d(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.zBy(f);
        }
    }

    public ViewPropertyAnimatorCompat(View view) {
        this.f34314a = new WeakReference(view);
    }

    /* renamed from: a */
    public static /* synthetic */ void m56716a(ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener, View view, ValueAnimator valueAnimator) {
        viewPropertyAnimatorUpdateListener.onAnimationUpdate(view);
    }

    @NonNull
    public ViewPropertyAnimatorCompat alpha(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat alphaBy(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    /* renamed from: c */
    public final void m56714c(View view, ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new C4132a(viewPropertyAnimatorListener, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public void cancel() {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long getDuration() {
        View view = (View) this.f34314a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @Nullable
    public Interpolator getInterpolator() {
        View view = (View) this.f34314a.get();
        if (view != null) {
            return C4134c.m56707a(view.animate());
        }
        return null;
    }

    public long getStartDelay() {
        View view = (View) this.f34314a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotation(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationBy(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationX(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationXBy(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationY(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationYBy(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleX(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleXBy(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleY(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleYBy(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setDuration(long j) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setInterpolator(@Nullable Interpolator interpolator) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setListener(@Nullable ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            m56714c(view, viewPropertyAnimatorListener);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setStartDelay(long j) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setUpdateListener(@Nullable final ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        final View view = (View) this.f34314a.get();
        if (view != null) {
            if (viewPropertyAnimatorUpdateListener != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: X32
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewPropertyAnimatorCompat.m56716a(ViewPropertyAnimatorUpdateListener.this, view, valueAnimator);
                    }
                };
            } else {
                animatorUpdateListener = null;
            }
            C4135d.m56706a(view.animate(), animatorUpdateListener);
        }
        return this;
    }

    public void start() {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationX(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationXBy(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationY(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationYBy(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationZ(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            C4136e.m56705a(view.animate(), f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationZBy(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            C4136e.m56704b(view.animate(), f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat withEndAction(@NonNull Runnable runnable) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            C4133b.m56710a(view.animate(), runnable);
        }
        return this;
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    public ViewPropertyAnimatorCompat withLayer() {
        View view = (View) this.f34314a.get();
        if (view != null) {
            C4133b.m56709b(view.animate());
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat withStartAction(@NonNull Runnable runnable) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            C4133b.m56708c(view.animate(), runnable);
        }
        return this;
    }

    @NonNull
    /* renamed from: x */
    public ViewPropertyAnimatorCompat m56713x(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat xBy(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    @NonNull
    /* renamed from: y */
    public ViewPropertyAnimatorCompat m56712y(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat yBy(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    @NonNull
    /* renamed from: z */
    public ViewPropertyAnimatorCompat m56711z(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            C4136e.m56703c(view.animate(), f);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat zBy(float f) {
        View view = (View) this.f34314a.get();
        if (view != null) {
            C4136e.m56702d(view.animate(), f);
        }
        return this;
    }
}