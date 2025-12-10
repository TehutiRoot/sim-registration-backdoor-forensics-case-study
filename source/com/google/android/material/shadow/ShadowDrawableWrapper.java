package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import androidx.core.content.ContextCompat;
import com.google.android.material.R;

@Deprecated
/* loaded from: classes4.dex */
public class ShadowDrawableWrapper extends DrawableWrapper {

    /* renamed from: q */
    public static final double f50590q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public final Paint f50591a;

    /* renamed from: b */
    public final Paint f50592b;

    /* renamed from: c */
    public final RectF f50593c;

    /* renamed from: d */
    public float f50594d;

    /* renamed from: e */
    public Path f50595e;

    /* renamed from: f */
    public float f50596f;

    /* renamed from: g */
    public float f50597g;

    /* renamed from: h */
    public float f50598h;

    /* renamed from: i */
    public float f50599i;

    /* renamed from: j */
    public boolean f50600j;

    /* renamed from: k */
    public final int f50601k;

    /* renamed from: l */
    public final int f50602l;

    /* renamed from: m */
    public final int f50603m;

    /* renamed from: n */
    public boolean f50604n;

    /* renamed from: o */
    public float f50605o;

    /* renamed from: p */
    public boolean f50606p;

    public ShadowDrawableWrapper(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f50600j = true;
        this.f50604n = true;
        this.f50606p = false;
        this.f50601k = ContextCompat.getColor(context, R.color.design_fab_shadow_start_color);
        this.f50602l = ContextCompat.getColor(context, R.color.design_fab_shadow_mid_color);
        this.f50603m = ContextCompat.getColor(context, R.color.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.f50591a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f50594d = Math.round(f);
        this.f50593c = new RectF();
        Paint paint2 = new Paint(paint);
        this.f50592b = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f2, f3);
    }

    public static float calculateHorizontalPadding(float f, float f2, boolean z) {
        if (z) {
            return (float) (f + ((1.0d - f50590q) * f2));
        }
        return f;
    }

    public static float calculateVerticalPadding(float f, float f2, boolean z) {
        if (z) {
            return (float) ((f * 1.5f) + ((1.0d - f50590q) * f2));
        }
        return f * 1.5f;
    }

    /* renamed from: d */
    public static int m44234d(float f) {
        int round = Math.round(f);
        if (round % 2 == 1) {
            return round - 1;
        }
        return round;
    }

    /* renamed from: a */
    public final void m44237a(Rect rect) {
        float f = this.f50597g;
        float f2 = 1.5f * f;
        this.f50593c.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        Drawable wrappedDrawable = getWrappedDrawable();
        RectF rectF = this.f50593c;
        wrappedDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        m44236b();
    }

    /* renamed from: b */
    public final void m44236b() {
        float f = this.f50594d;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f50598h;
        rectF2.inset(-f2, -f2);
        Path path = this.f50595e;
        if (path == null) {
            this.f50595e = new Path();
        } else {
            path.reset();
        }
        this.f50595e.setFillType(Path.FillType.EVEN_ODD);
        this.f50595e.moveTo(-this.f50594d, 0.0f);
        this.f50595e.rLineTo(-this.f50598h, 0.0f);
        this.f50595e.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f50595e.arcTo(rectF, 270.0f, -90.0f, false);
        this.f50595e.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.f50594d / f3;
            this.f50591a.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.f50601k, this.f50602l, this.f50603m}, new float[]{0.0f, f4, ((1.0f - f4) / 2.0f) + f4, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f50592b.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f50601k, this.f50602l, this.f50603m}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f50592b.setAntiAlias(false);
    }

    /* renamed from: c */
    public final void m44235c(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        float f4;
        int save = canvas.save();
        canvas.rotate(this.f50605o, this.f50593c.centerX(), this.f50593c.centerY());
        float f5 = this.f50594d;
        float f6 = (-f5) - this.f50598h;
        float f7 = f5 * 2.0f;
        if (this.f50593c.width() - f7 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.f50593c.height() - f7 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f8 = this.f50599i;
        float f9 = f5 / ((f8 - (0.5f * f8)) + f5);
        float f10 = f5 / ((f8 - (0.25f * f8)) + f5);
        float f11 = f5 / ((f8 - (f8 * 1.0f)) + f5);
        int save2 = canvas.save();
        RectF rectF = this.f50593c;
        canvas.translate(rectF.left + f5, rectF.top + f5);
        canvas.scale(f9, f10);
        canvas.drawPath(this.f50595e, this.f50591a);
        if (z) {
            canvas.scale(1.0f / f9, 1.0f);
            i = save2;
            f = f11;
            i2 = save;
            f2 = f10;
            canvas.drawRect(0.0f, f6, this.f50593c.width() - f7, -this.f50594d, this.f50592b);
        } else {
            i = save2;
            f = f11;
            i2 = save;
            f2 = f10;
        }
        canvas.restoreToCount(i);
        int save3 = canvas.save();
        RectF rectF2 = this.f50593c;
        canvas.translate(rectF2.right - f5, rectF2.bottom - f5);
        float f12 = f;
        canvas.scale(f9, f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f50595e, this.f50591a);
        if (z) {
            canvas.scale(1.0f / f9, 1.0f);
            f3 = f2;
            f4 = f12;
            canvas.drawRect(0.0f, f6, this.f50593c.width() - f7, (-this.f50594d) + this.f50598h, this.f50592b);
        } else {
            f3 = f2;
            f4 = f12;
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.f50593c;
        canvas.translate(rectF3.left + f5, rectF3.bottom - f5);
        canvas.scale(f9, f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f50595e, this.f50591a);
        if (z2) {
            canvas.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f6, this.f50593c.height() - f7, -this.f50594d, this.f50592b);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.f50593c;
        canvas.translate(rectF4.right - f5, rectF4.top + f5);
        float f13 = f3;
        canvas.scale(f9, f13);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f50595e, this.f50591a);
        if (z2) {
            canvas.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f6, this.f50593c.height() - f7, -this.f50594d, this.f50592b);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(i2);
    }

    public void draw(@NonNull Canvas canvas) {
        if (this.f50600j) {
            m44237a(getBounds());
            this.f50600j = false;
        }
        m44235c(canvas);
        super.draw(canvas);
    }

    public float getCornerRadius() {
        return this.f50594d;
    }

    public float getMaxShadowSize() {
        return this.f50597g;
    }

    public float getMinHeight() {
        float f = this.f50597g;
        return (Math.max(f, this.f50594d + ((f * 1.5f) / 2.0f)) * 2.0f) + (this.f50597g * 1.5f * 2.0f);
    }

    public float getMinWidth() {
        float f = this.f50597g;
        return (Math.max(f, this.f50594d + (f / 2.0f)) * 2.0f) + (this.f50597g * 2.0f);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(@NonNull Rect rect) {
        int ceil = (int) Math.ceil(calculateVerticalPadding(this.f50597g, this.f50594d, this.f50604n));
        int ceil2 = (int) Math.ceil(calculateHorizontalPadding(this.f50597g, this.f50594d, this.f50604n));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float getShadowSize() {
        return this.f50599i;
    }

    public void onBoundsChange(Rect rect) {
        this.f50600j = true;
    }

    public void setAddPaddingForCorners(boolean z) {
        this.f50604n = z;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f50591a.setAlpha(i);
        this.f50592b.setAlpha(i);
    }

    public void setCornerRadius(float f) {
        float round = Math.round(f);
        if (this.f50594d == round) {
            return;
        }
        this.f50594d = round;
        this.f50600j = true;
        invalidateSelf();
    }

    public void setMaxShadowSize(float f) {
        setShadowSize(this.f50599i, f);
    }

    public final void setRotation(float f) {
        if (this.f50605o != f) {
            this.f50605o = f;
            invalidateSelf();
        }
    }

    public void setShadowSize(float f, float f2) {
        if (f >= 0.0f && f2 >= 0.0f) {
            float m44234d = m44234d(f);
            float m44234d2 = m44234d(f2);
            if (m44234d > m44234d2) {
                if (!this.f50606p) {
                    this.f50606p = true;
                }
                m44234d = m44234d2;
            }
            if (this.f50599i == m44234d && this.f50597g == m44234d2) {
                return;
            }
            this.f50599i = m44234d;
            this.f50597g = m44234d2;
            this.f50598h = Math.round(m44234d * 1.5f);
            this.f50596f = m44234d2;
            this.f50600j = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("invalid shadow size");
    }

    public void setShadowSize(float f) {
        setShadowSize(f, this.f50597g);
    }
}
