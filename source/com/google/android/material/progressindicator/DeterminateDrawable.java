package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: classes4.dex */
public final class DeterminateDrawable<S extends BaseProgressIndicatorSpec> extends AbstractC7028a {

    /* renamed from: u */
    public static final FloatPropertyCompat f50444u = new C7027a("indicatorLevel");

    /* renamed from: p */
    public AbstractC17040xK f50445p;

    /* renamed from: q */
    public final SpringForce f50446q;

    /* renamed from: r */
    public final SpringAnimation f50447r;

    /* renamed from: s */
    public float f50448s;

    /* renamed from: t */
    public boolean f50449t;

    /* renamed from: com.google.android.material.progressindicator.DeterminateDrawable$a */
    /* loaded from: classes4.dex */
    public class C7027a extends FloatPropertyCompat {
        public C7027a(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a */
        public float getValue(DeterminateDrawable determinateDrawable) {
            return determinateDrawable.m44430q() * 10000.0f;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b */
        public void setValue(DeterminateDrawable determinateDrawable, float f) {
            determinateDrawable.m44428s(f / 10000.0f);
        }
    }

    public DeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, AbstractC17040xK abstractC17040xK) {
        super(context, baseProgressIndicatorSpec);
        this.f50449t = false;
        m44429r(abstractC17040xK);
        SpringForce springForce = new SpringForce();
        this.f50446q = springForce;
        springForce.setDampingRatio(1.0f);
        springForce.setStiffness(50.0f);
        SpringAnimation springAnimation = new SpringAnimation(this, f50444u);
        this.f50447r = springAnimation;
        springAnimation.setSpring(springForce);
        m44407j(1.0f);
    }

    @NonNull
    public static DeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new DeterminateDrawable<>(context, circularProgressIndicatorSpec, new C0056Ap(circularProgressIndicatorSpec));
    }

    @NonNull
    public static DeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new DeterminateDrawable<>(context, linearProgressIndicatorSpec, new C18885Zi0(linearProgressIndicatorSpec));
    }

    public void addSpringAnimationEndListener(@NonNull DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        this.f50447r.addEndListener(onAnimationEndListener);
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f50445p.m534g(canvas, getBounds(), m44409h());
            this.f50445p.mo538c(canvas, this.f50466m);
            this.f50445p.mo539b(canvas, this.f50466m, 0.0f, m44430q(), MaterialColors.compositeARGBWithAlpha(this.f50455b.indicatorColors[0], getAlpha()));
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f50445p.mo537d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f50445p.mo536e();
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f50447r.skipToEnd();
        m44428s(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a
    /* renamed from: m */
    public boolean mo44404m(boolean z, boolean z2, boolean z3) {
        boolean mo44404m = super.mo44404m(z, z2, z3);
        float systemAnimatorDurationScale = this.f50456c.getSystemAnimatorDurationScale(this.f50454a.getContentResolver());
        if (systemAnimatorDurationScale == 0.0f) {
            this.f50449t = true;
        } else {
            this.f50449t = false;
            this.f50446q.setStiffness(50.0f / systemAnimatorDurationScale);
        }
        return mo44404m;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        if (this.f50449t) {
            this.f50447r.skipToEnd();
            m44428s(i / 10000.0f);
            return true;
        }
        this.f50447r.setStartValue(m44430q() * 10000.0f);
        this.f50447r.animateToFinalPosition(i);
        return true;
    }

    /* renamed from: p */
    public AbstractC17040xK m44431p() {
        return this.f50445p;
    }

    /* renamed from: q */
    public final float m44430q() {
        return this.f50448s;
    }

    /* renamed from: r */
    public void m44429r(AbstractC17040xK abstractC17040xK) {
        this.f50445p = abstractC17040xK;
        abstractC17040xK.m535f(this);
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        super.registerAnimationCallback(animationCallback);
    }

    public void removeSpringAnimationEndListener(@NonNull DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        this.f50447r.removeEndListener(onAnimationEndListener);
    }

    /* renamed from: s */
    public final void m44428s(float f) {
        this.f50448s = f;
        invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    /* renamed from: t */
    public void m44427t(float f) {
        setLevel((int) (f * 10000.0f));
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        return super.unregisterAnimationCallback(animationCallback);
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        return super.setVisible(z, z2, z3);
    }
}
