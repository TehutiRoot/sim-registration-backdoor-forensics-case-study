package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: classes4.dex */
public final class IndeterminateDrawable<S extends BaseProgressIndicatorSpec> extends AbstractC7028a {

    /* renamed from: p */
    public AbstractC17040xK f50450p;

    /* renamed from: q */
    public AbstractC18806Yd0 f50451q;

    public IndeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, AbstractC17040xK abstractC17040xK, AbstractC18806Yd0 abstractC18806Yd0) {
        super(context, baseProgressIndicatorSpec);
        m44421q(abstractC17040xK);
        m44422p(abstractC18806Yd0);
    }

    @NonNull
    public static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new IndeterminateDrawable<>(context, circularProgressIndicatorSpec, new C0056Ap(circularProgressIndicatorSpec), new C0133Bp(circularProgressIndicatorSpec));
    }

    @NonNull
    public static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        AbstractC18806Yd0 c19224bj0;
        C18885Zi0 c18885Zi0 = new C18885Zi0(linearProgressIndicatorSpec);
        if (linearProgressIndicatorSpec.indeterminateAnimationType == 0) {
            c19224bj0 = new C19047aj0(linearProgressIndicatorSpec);
        } else {
            c19224bj0 = new C19224bj0(context, linearProgressIndicatorSpec);
        }
        return new IndeterminateDrawable<>(context, linearProgressIndicatorSpec, c18885Zi0, c19224bj0);
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
            this.f50450p.m534g(canvas, getBounds(), m44409h());
            this.f50450p.mo538c(canvas, this.f50466m);
            int i = 0;
            while (true) {
                AbstractC18806Yd0 abstractC18806Yd0 = this.f50451q;
                int[] iArr = abstractC18806Yd0.f7803c;
                if (i < iArr.length) {
                    AbstractC17040xK abstractC17040xK = this.f50450p;
                    Paint paint = this.f50466m;
                    float[] fArr = abstractC18806Yd0.f7802b;
                    int i2 = i * 2;
                    abstractC17040xK.mo539b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f50450p.mo537d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f50450p.mo536e();
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

    @Override // com.google.android.material.progressindicator.AbstractC7028a
    /* renamed from: m */
    public boolean mo44404m(boolean z, boolean z2, boolean z3) {
        boolean mo44404m = super.mo44404m(z, z2, z3);
        if (!isRunning()) {
            this.f50451q.mo51887a();
        }
        float systemAnimatorDurationScale = this.f50456c.getSystemAnimatorDurationScale(this.f50454a.getContentResolver());
        if (z && (z3 || (Build.VERSION.SDK_INT <= 22 && systemAnimatorDurationScale > 0.0f))) {
            this.f50451q.mo51883g();
        }
        return mo44404m;
    }

    /* renamed from: n */
    public AbstractC18806Yd0 m44424n() {
        return this.f50451q;
    }

    /* renamed from: o */
    public AbstractC17040xK m44423o() {
        return this.f50450p;
    }

    /* renamed from: p */
    public void m44422p(AbstractC18806Yd0 abstractC18806Yd0) {
        this.f50451q = abstractC18806Yd0;
        abstractC18806Yd0.m65331e(this);
    }

    /* renamed from: q */
    public void m44421q(AbstractC17040xK abstractC17040xK) {
        this.f50450p = abstractC17040xK;
        abstractC17040xK.m535f(this);
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        super.registerAnimationCallback(animationCallback);
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

    @Override // com.google.android.material.progressindicator.AbstractC7028a, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        return super.unregisterAnimationCallback(animationCallback);
    }

    @Override // com.google.android.material.progressindicator.AbstractC7028a
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        return super.setVisible(z, z2, z3);
    }
}
