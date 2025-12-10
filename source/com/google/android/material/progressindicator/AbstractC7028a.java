package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.progressindicator.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7028a extends Drawable implements Animatable2Compat {

    /* renamed from: o */
    public static final Property f50453o = new C7031c(Float.class, "growFraction");

    /* renamed from: a */
    public final Context f50454a;

    /* renamed from: b */
    public final BaseProgressIndicatorSpec f50455b;

    /* renamed from: d */
    public ValueAnimator f50457d;

    /* renamed from: e */
    public ValueAnimator f50458e;

    /* renamed from: f */
    public boolean f50459f;

    /* renamed from: g */
    public boolean f50460g;

    /* renamed from: h */
    public float f50461h;

    /* renamed from: i */
    public List f50462i;

    /* renamed from: j */
    public Animatable2Compat.AnimationCallback f50463j;

    /* renamed from: k */
    public boolean f50464k;

    /* renamed from: l */
    public float f50465l;

    /* renamed from: n */
    public int f50467n;

    /* renamed from: m */
    public final Paint f50466m = new Paint();

    /* renamed from: c */
    public AnimatorDurationScaleProvider f50456c = new AnimatorDurationScaleProvider();

    /* renamed from: com.google.android.material.progressindicator.a$a */
    /* loaded from: classes4.dex */
    public class C7029a extends AnimatorListenerAdapter {
        public C7029a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            AbstractC7028a.this.m44411f();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.a$b */
    /* loaded from: classes4.dex */
    public class C7030b extends AnimatorListenerAdapter {
        public C7030b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AbstractC7028a.super.setVisible(false, false);
            AbstractC7028a.this.m44412e();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.a$c */
    /* loaded from: classes4.dex */
    public class C7031c extends Property {
        public C7031c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(AbstractC7028a abstractC7028a) {
            return Float.valueOf(abstractC7028a.m44409h());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(AbstractC7028a abstractC7028a, Float f) {
            abstractC7028a.m44407j(f.floatValue());
        }
    }

    public AbstractC7028a(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.f50454a = context;
        this.f50455b = baseProgressIndicatorSpec;
        setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m44412e() {
        Animatable2Compat.AnimationCallback animationCallback = this.f50463j;
        if (animationCallback != null) {
            animationCallback.onAnimationEnd(this);
        }
        List<Animatable2Compat.AnimationCallback> list = this.f50462i;
        if (list != null && !this.f50464k) {
            for (Animatable2Compat.AnimationCallback animationCallback2 : list) {
                animationCallback2.onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m44411f() {
        Animatable2Compat.AnimationCallback animationCallback = this.f50463j;
        if (animationCallback != null) {
            animationCallback.onAnimationStart(this);
        }
        List<Animatable2Compat.AnimationCallback> list = this.f50462i;
        if (list != null && !this.f50464k) {
            for (Animatable2Compat.AnimationCallback animationCallback2 : list) {
                animationCallback2.onAnimationStart(this);
            }
        }
    }

    public void clearAnimationCallbacks() {
        this.f50462i.clear();
        this.f50462i = null;
    }

    /* renamed from: d */
    public final void m44413d(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f50464k;
        this.f50464k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f50464k = z;
    }

    /* renamed from: g */
    public final void m44410g(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f50464k;
        this.f50464k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f50464k = z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f50467n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public float m44409h() {
        if (!this.f50455b.isShowAnimationEnabled() && !this.f50455b.isHideAnimationEnabled()) {
            return 1.0f;
        }
        if (!this.f50460g && !this.f50459f) {
            return this.f50465l;
        }
        return this.f50461h;
    }

    public boolean hideNow() {
        return setVisible(false, false, false);
    }

    /* renamed from: i */
    public final void m44408i() {
        if (this.f50457d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f50453o, 0.0f, 1.0f);
            this.f50457d = ofFloat;
            ofFloat.setDuration(500L);
            this.f50457d.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            m44405l(this.f50457d);
        }
        if (this.f50458e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f50453o, 1.0f, 0.0f);
            this.f50458e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f50458e.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            m44406k(this.f50458e);
        }
    }

    public boolean isHiding() {
        ValueAnimator valueAnimator = this.f50458e;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.f50460g) {
            return true;
        }
        return false;
    }

    public boolean isRunning() {
        if (!isShowing() && !isHiding()) {
            return false;
        }
        return true;
    }

    public boolean isShowing() {
        ValueAnimator valueAnimator = this.f50457d;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.f50459f) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m44407j(float f) {
        if (this.f50465l != f) {
            this.f50465l = f;
            invalidateSelf();
        }
    }

    /* renamed from: k */
    public final void m44406k(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f50458e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f50458e = valueAnimator;
        valueAnimator.addListener(new C7030b());
    }

    /* renamed from: l */
    public final void m44405l(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f50457d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f50457d = valueAnimator;
        valueAnimator.addListener(new C7029a());
    }

    /* renamed from: m */
    public boolean mo44404m(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z4;
        boolean isHideAnimationEnabled;
        m44408i();
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.f50457d;
        } else {
            valueAnimator = this.f50458e;
        }
        if (z) {
            valueAnimator2 = this.f50458e;
        } else {
            valueAnimator2 = this.f50457d;
        }
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                m44413d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m44410g(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator.isRunning()) {
            return false;
        } else {
            if (z && !super.setVisible(z, false)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z) {
                isHideAnimationEnabled = this.f50455b.isShowAnimationEnabled();
            } else {
                isHideAnimationEnabled = this.f50455b.isHideAnimationEnabled();
            }
            if (!isHideAnimationEnabled) {
                m44410g(valueAnimator);
                return z4;
            }
            if (!z2 && valueAnimator.isPaused()) {
                valueAnimator.resume();
            } else {
                valueAnimator.start();
            }
            return z4;
        }
    }

    public void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (this.f50462i == null) {
            this.f50462i = new ArrayList();
        }
        if (!this.f50462i.contains(animationCallback)) {
            this.f50462i.add(animationCallback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f50467n = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f50466m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return setVisible(z, z2, true);
    }

    public void start() {
        mo44404m(true, true, false);
    }

    public void stop() {
        mo44404m(false, true, false);
    }

    public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        List list = this.f50462i;
        if (list != null && list.contains(animationCallback)) {
            this.f50462i.remove(animationCallback);
            if (this.f50462i.isEmpty()) {
                this.f50462i = null;
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean setVisible(boolean z, boolean z2, boolean z3) {
        return mo44404m(z, z2, z3 && this.f50456c.getSystemAnimatorDurationScale(this.f50454a.getContentResolver()) > 0.0f);
    }
}
