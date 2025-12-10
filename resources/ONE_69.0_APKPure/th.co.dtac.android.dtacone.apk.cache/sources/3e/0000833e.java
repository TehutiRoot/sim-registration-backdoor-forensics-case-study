package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ShimmerDrawable extends Drawable {

    /* renamed from: a */
    public final ValueAnimator.AnimatorUpdateListener f43083a = new C5980a();

    /* renamed from: b */
    public final Paint f43084b;

    /* renamed from: c */
    public final Rect f43085c;

    /* renamed from: d */
    public final Matrix f43086d;

    /* renamed from: e */
    public ValueAnimator f43087e;

    /* renamed from: f */
    public Shimmer f43088f;

    /* renamed from: com.facebook.shimmer.ShimmerDrawable$a */
    /* loaded from: classes3.dex */
    public class C5980a implements ValueAnimator.AnimatorUpdateListener {
        public C5980a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShimmerDrawable.this.invalidateSelf();
        }
    }

    public ShimmerDrawable() {
        Paint paint = new Paint();
        this.f43084b = paint;
        this.f43085c = new Rect();
        this.f43086d = new Matrix();
        paint.setAntiAlias(true);
    }

    /* renamed from: a */
    public void m49819a() {
        Shimmer shimmer;
        ValueAnimator valueAnimator = this.f43087e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (shimmer = this.f43088f) != null && shimmer.f43076p && getCallback() != null) {
            this.f43087e.start();
        }
    }

    /* renamed from: b */
    public final float m49818b(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: c */
    public final void m49817c() {
        Shimmer shimmer;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (shimmer = this.f43088f) != null) {
            int m49823d = shimmer.m49823d(width);
            int m49826a = this.f43088f.m49826a(height);
            Shimmer shimmer2 = this.f43088f;
            boolean z = true;
            if (shimmer2.f43067g != 1) {
                int i = shimmer2.f43064d;
                if (i != 1 && i != 3) {
                    z = false;
                }
                if (z) {
                    m49823d = 0;
                }
                if (!z) {
                    m49826a = 0;
                }
                float f = m49826a;
                Shimmer shimmer3 = this.f43088f;
                radialGradient = new LinearGradient(0.0f, 0.0f, m49823d, f, shimmer3.f43062b, shimmer3.f43061a, Shader.TileMode.CLAMP);
            } else {
                float f2 = m49826a / 2.0f;
                float max = (float) (Math.max(m49823d, m49826a) / Math.sqrt(2.0d));
                Shimmer shimmer4 = this.f43088f;
                radialGradient = new RadialGradient(m49823d / 2.0f, f2, max, shimmer4.f43062b, shimmer4.f43061a, Shader.TileMode.CLAMP);
            }
            this.f43084b.setShader(radialGradient);
        }
    }

    /* renamed from: d */
    public final void m49816d() {
        boolean z;
        if (this.f43088f == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f43087e;
        if (valueAnimator != null) {
            z = valueAnimator.isStarted();
            this.f43087e.cancel();
            this.f43087e.removeAllUpdateListeners();
        } else {
            z = false;
        }
        Shimmer shimmer = this.f43088f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (shimmer.f43081u / shimmer.f43080t)) + 1.0f);
        this.f43087e = ofFloat;
        ofFloat.setRepeatMode(this.f43088f.f43079s);
        this.f43087e.setRepeatCount(this.f43088f.f43078r);
        ValueAnimator valueAnimator2 = this.f43087e;
        Shimmer shimmer2 = this.f43088f;
        valueAnimator2.setDuration(shimmer2.f43080t + shimmer2.f43081u);
        this.f43087e.addUpdateListener(this.f43083a);
        if (z) {
            this.f43087e.start();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        float f;
        float m49818b;
        float m49818b2;
        if (this.f43088f != null && this.f43084b.getShader() != null) {
            float tan = (float) Math.tan(Math.toRadians(this.f43088f.f43074n));
            float height = this.f43085c.height() + (this.f43085c.width() * tan);
            float width = this.f43085c.width() + (tan * this.f43085c.height());
            ValueAnimator valueAnimator = this.f43087e;
            float f2 = 0.0f;
            if (valueAnimator != null) {
                f = valueAnimator.getAnimatedFraction();
            } else {
                f = 0.0f;
            }
            int i = this.f43088f.f43064d;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        m49818b2 = m49818b(-width, width, f);
                    } else {
                        m49818b = m49818b(height, -height, f);
                    }
                } else {
                    m49818b2 = m49818b(width, -width, f);
                }
                f2 = m49818b2;
                m49818b = 0.0f;
            } else {
                m49818b = m49818b(-height, height, f);
            }
            this.f43086d.reset();
            this.f43086d.setRotate(this.f43088f.f43074n, this.f43085c.width() / 2.0f, this.f43085c.height() / 2.0f);
            this.f43086d.postTranslate(f2, m49818b);
            this.f43084b.getShader().setLocalMatrix(this.f43086d);
            canvas.drawRect(this.f43085c, this.f43084b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Shimmer shimmer = this.f43088f;
        if (shimmer != null && (shimmer.f43075o || shimmer.f43077q)) {
            return -3;
        }
        return -1;
    }

    public boolean isShimmerStarted() {
        ValueAnimator valueAnimator = this.f43087e;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f43085c.set(0, 0, rect.width(), rect.height());
        m49817c();
        m49819a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public void setShimmer(@Nullable Shimmer shimmer) {
        PorterDuff.Mode mode;
        this.f43088f = shimmer;
        if (shimmer != null) {
            Paint paint = this.f43084b;
            if (this.f43088f.f43077q) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        m49817c();
        m49816d();
        invalidateSelf();
    }

    public void startShimmer() {
        if (this.f43087e != null && !isShimmerStarted() && getCallback() != null) {
            this.f43087e.start();
        }
    }

    public void stopShimmer() {
        if (this.f43087e != null && isShimmerStarted()) {
            this.f43087e.cancel();
        }
    }
}