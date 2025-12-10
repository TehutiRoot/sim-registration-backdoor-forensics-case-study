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
    public final ValueAnimator.AnimatorUpdateListener f43071a = new C5991a();

    /* renamed from: b */
    public final Paint f43072b;

    /* renamed from: c */
    public final Rect f43073c;

    /* renamed from: d */
    public final Matrix f43074d;

    /* renamed from: e */
    public ValueAnimator f43075e;

    /* renamed from: f */
    public Shimmer f43076f;

    /* renamed from: com.facebook.shimmer.ShimmerDrawable$a */
    /* loaded from: classes3.dex */
    public class C5991a implements ValueAnimator.AnimatorUpdateListener {
        public C5991a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShimmerDrawable.this.invalidateSelf();
        }
    }

    public ShimmerDrawable() {
        Paint paint = new Paint();
        this.f43072b = paint;
        this.f43073c = new Rect();
        this.f43074d = new Matrix();
        paint.setAntiAlias(true);
    }

    /* renamed from: a */
    public void m49822a() {
        Shimmer shimmer;
        ValueAnimator valueAnimator = this.f43075e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (shimmer = this.f43076f) != null && shimmer.f43064p && getCallback() != null) {
            this.f43075e.start();
        }
    }

    /* renamed from: b */
    public final float m49821b(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: c */
    public final void m49820c() {
        Shimmer shimmer;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (shimmer = this.f43076f) != null) {
            int m49826d = shimmer.m49826d(width);
            int m49829a = this.f43076f.m49829a(height);
            Shimmer shimmer2 = this.f43076f;
            boolean z = true;
            if (shimmer2.f43055g != 1) {
                int i = shimmer2.f43052d;
                if (i != 1 && i != 3) {
                    z = false;
                }
                if (z) {
                    m49826d = 0;
                }
                if (!z) {
                    m49829a = 0;
                }
                float f = m49829a;
                Shimmer shimmer3 = this.f43076f;
                radialGradient = new LinearGradient(0.0f, 0.0f, m49826d, f, shimmer3.f43050b, shimmer3.f43049a, Shader.TileMode.CLAMP);
            } else {
                float f2 = m49829a / 2.0f;
                float max = (float) (Math.max(m49826d, m49829a) / Math.sqrt(2.0d));
                Shimmer shimmer4 = this.f43076f;
                radialGradient = new RadialGradient(m49826d / 2.0f, f2, max, shimmer4.f43050b, shimmer4.f43049a, Shader.TileMode.CLAMP);
            }
            this.f43072b.setShader(radialGradient);
        }
    }

    /* renamed from: d */
    public final void m49819d() {
        boolean z;
        if (this.f43076f == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f43075e;
        if (valueAnimator != null) {
            z = valueAnimator.isStarted();
            this.f43075e.cancel();
            this.f43075e.removeAllUpdateListeners();
        } else {
            z = false;
        }
        Shimmer shimmer = this.f43076f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (shimmer.f43069u / shimmer.f43068t)) + 1.0f);
        this.f43075e = ofFloat;
        ofFloat.setRepeatMode(this.f43076f.f43067s);
        this.f43075e.setRepeatCount(this.f43076f.f43066r);
        ValueAnimator valueAnimator2 = this.f43075e;
        Shimmer shimmer2 = this.f43076f;
        valueAnimator2.setDuration(shimmer2.f43068t + shimmer2.f43069u);
        this.f43075e.addUpdateListener(this.f43071a);
        if (z) {
            this.f43075e.start();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        float f;
        float m49821b;
        float m49821b2;
        if (this.f43076f != null && this.f43072b.getShader() != null) {
            float tan = (float) Math.tan(Math.toRadians(this.f43076f.f43062n));
            float height = this.f43073c.height() + (this.f43073c.width() * tan);
            float width = this.f43073c.width() + (tan * this.f43073c.height());
            ValueAnimator valueAnimator = this.f43075e;
            float f2 = 0.0f;
            if (valueAnimator != null) {
                f = valueAnimator.getAnimatedFraction();
            } else {
                f = 0.0f;
            }
            int i = this.f43076f.f43052d;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        m49821b2 = m49821b(-width, width, f);
                    } else {
                        m49821b = m49821b(height, -height, f);
                    }
                } else {
                    m49821b2 = m49821b(width, -width, f);
                }
                f2 = m49821b2;
                m49821b = 0.0f;
            } else {
                m49821b = m49821b(-height, height, f);
            }
            this.f43074d.reset();
            this.f43074d.setRotate(this.f43076f.f43062n, this.f43073c.width() / 2.0f, this.f43073c.height() / 2.0f);
            this.f43074d.postTranslate(f2, m49821b);
            this.f43072b.getShader().setLocalMatrix(this.f43074d);
            canvas.drawRect(this.f43073c, this.f43072b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Shimmer shimmer = this.f43076f;
        if (shimmer != null && (shimmer.f43063o || shimmer.f43065q)) {
            return -3;
        }
        return -1;
    }

    public boolean isShimmerStarted() {
        ValueAnimator valueAnimator = this.f43075e;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f43073c.set(0, 0, rect.width(), rect.height());
        m49820c();
        m49822a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public void setShimmer(@Nullable Shimmer shimmer) {
        PorterDuff.Mode mode;
        this.f43076f = shimmer;
        if (shimmer != null) {
            Paint paint = this.f43072b;
            if (this.f43076f.f43065q) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        m49820c();
        m49819d();
        invalidateSelf();
    }

    public void startShimmer() {
        if (this.f43075e != null && !isShimmerStarted() && getCallback() != null) {
            this.f43075e.start();
        }
    }

    public void stopShimmer() {
        if (this.f43075e != null && isShimmerStarted()) {
            this.f43075e.cancel();
        }
    }
}
