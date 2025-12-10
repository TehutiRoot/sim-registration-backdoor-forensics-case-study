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
    public static final double f50602q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public final Paint f50603a;

    /* renamed from: b */
    public final Paint f50604b;

    /* renamed from: c */
    public final RectF f50605c;

    /* renamed from: d */
    public float f50606d;

    /* renamed from: e */
    public Path f50607e;

    /* renamed from: f */
    public float f50608f;

    /* renamed from: g */
    public float f50609g;

    /* renamed from: h */
    public float f50610h;

    /* renamed from: i */
    public float f50611i;

    /* renamed from: j */
    public boolean f50612j;

    /* renamed from: k */
    public final int f50613k;

    /* renamed from: l */
    public final int f50614l;

    /* renamed from: m */
    public final int f50615m;

    /* renamed from: n */
    public boolean f50616n;

    /* renamed from: o */
    public float f50617o;

    /* renamed from: p */
    public boolean f50618p;

    public ShadowDrawableWrapper(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f50612j = true;
        this.f50616n = true;
        this.f50618p = false;
        this.f50613k = ContextCompat.getColor(context, R.color.design_fab_shadow_start_color);
        this.f50614l = ContextCompat.getColor(context, R.color.design_fab_shadow_mid_color);
        this.f50615m = ContextCompat.getColor(context, R.color.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.f50603a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f50606d = Math.round(f);
        this.f50605c = new RectF();
        Paint paint2 = new Paint(paint);
        this.f50604b = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f2, f3);
    }

    public static float calculateHorizontalPadding(float f, float f2, boolean z) {
        if (z) {
            return (float) (f + ((1.0d - f50602q) * f2));
        }
        return f;
    }

    public static float calculateVerticalPadding(float f, float f2, boolean z) {
        if (z) {
            return (float) ((f * 1.5f) + ((1.0d - f50602q) * f2));
        }
        return f * 1.5f;
    }

    /* renamed from: d */
    public static int m44221d(float f) {
        int round = Math.round(f);
        if (round % 2 == 1) {
            return round - 1;
        }
        return round;
    }

    /* renamed from: a */
    public final void m44224a(Rect rect) {
        float f = this.f50609g;
        float f2 = 1.5f * f;
        this.f50605c.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        Drawable wrappedDrawable = getWrappedDrawable();
        RectF rectF = this.f50605c;
        wrappedDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        m44223b();
    }

    /* renamed from: b */
    public final void m44223b() {
        float f = this.f50606d;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f50610h;
        rectF2.inset(-f2, -f2);
        Path path = this.f50607e;
        if (path == null) {
            this.f50607e = new Path();
        } else {
            path.reset();
        }
        this.f50607e.setFillType(Path.FillType.EVEN_ODD);
        this.f50607e.moveTo(-this.f50606d, 0.0f);
        this.f50607e.rLineTo(-this.f50610h, 0.0f);
        this.f50607e.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f50607e.arcTo(rectF, 270.0f, -90.0f, false);
        this.f50607e.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.f50606d / f3;
            this.f50603a.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.f50613k, this.f50614l, this.f50615m}, new float[]{0.0f, f4, ((1.0f - f4) / 2.0f) + f4, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f50604b.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f50613k, this.f50614l, this.f50615m}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f50604b.setAntiAlias(false);
    }

    /* renamed from: c */
    public final void m44222c(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        float f4;
        int save = canvas.save();
        canvas.rotate(this.f50617o, this.f50605c.centerX(), this.f50605c.centerY());
        float f5 = this.f50606d;
        float f6 = (-f5) - this.f50610h;
        float f7 = f5 * 2.0f;
        if (this.f50605c.width() - f7 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.f50605c.height() - f7 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f8 = this.f50611i;
        float f9 = f5 / ((f8 - (0.5f * f8)) + f5);
        float f10 = f5 / ((f8 - (0.25f * f8)) + f5);
        float f11 = f5 / ((f8 - (f8 * 1.0f)) + f5);
        int save2 = canvas.save();
        RectF rectF = this.f50605c;
        canvas.translate(rectF.left + f5, rectF.top + f5);
        canvas.scale(f9, f10);
        canvas.drawPath(this.f50607e, this.f50603a);
        if (z) {
            canvas.scale(1.0f / f9, 1.0f);
            i = save2;
            f = f11;
            i2 = save;
            f2 = f10;
            canvas.drawRect(0.0f, f6, this.f50605c.width() - f7, -this.f50606d, this.f50604b);
        } else {
            i = save2;
            f = f11;
            i2 = save;
            f2 = f10;
        }
        canvas.restoreToCount(i);
        int save3 = canvas.save();
        RectF rectF2 = this.f50605c;
        canvas.translate(rectF2.right - f5, rectF2.bottom - f5);
        float f12 = f;
        canvas.scale(f9, f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f50607e, this.f50603a);
        if (z) {
            canvas.scale(1.0f / f9, 1.0f);
            f3 = f2;
            f4 = f12;
            canvas.drawRect(0.0f, f6, this.f50605c.width() - f7, (-this.f50606d) + this.f50610h, this.f50604b);
        } else {
            f3 = f2;
            f4 = f12;
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.f50605c;
        canvas.translate(rectF3.left + f5, rectF3.bottom - f5);
        canvas.scale(f9, f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f50607e, this.f50603a);
        if (z2) {
            canvas.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f6, this.f50605c.height() - f7, -this.f50606d, this.f50604b);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.f50605c;
        canvas.translate(rectF4.right - f5, rectF4.top + f5);
        float f13 = f3;
        canvas.scale(f9, f13);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f50607e, this.f50603a);
        if (z2) {
            canvas.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f6, this.f50605c.height() - f7, -this.f50606d, this.f50604b);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(i2);
    }

    public void draw(@NonNull Canvas canvas) {
        if (this.f50612j) {
            m44224a(getBounds());
            this.f50612j = false;
        }
        m44222c(canvas);
        super.draw(canvas);
    }

    public float getCornerRadius() {
        return this.f50606d;
    }

    public float getMaxShadowSize() {
        return this.f50609g;
    }

    public float getMinHeight() {
        float f = this.f50609g;
        return (Math.max(f, this.f50606d + ((f * 1.5f) / 2.0f)) * 2.0f) + (this.f50609g * 1.5f * 2.0f);
    }

    public float getMinWidth() {
        float f = this.f50609g;
        return (Math.max(f, this.f50606d + (f / 2.0f)) * 2.0f) + (this.f50609g * 2.0f);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(@NonNull Rect rect) {
        int ceil = (int) Math.ceil(calculateVerticalPadding(this.f50609g, this.f50606d, this.f50616n));
        int ceil2 = (int) Math.ceil(calculateHorizontalPadding(this.f50609g, this.f50606d, this.f50616n));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float getShadowSize() {
        return this.f50611i;
    }

    public void onBoundsChange(Rect rect) {
        this.f50612j = true;
    }

    public void setAddPaddingForCorners(boolean z) {
        this.f50616n = z;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f50603a.setAlpha(i);
        this.f50604b.setAlpha(i);
    }

    public void setCornerRadius(float f) {
        float round = Math.round(f);
        if (this.f50606d == round) {
            return;
        }
        this.f50606d = round;
        this.f50612j = true;
        invalidateSelf();
    }

    public void setMaxShadowSize(float f) {
        setShadowSize(this.f50611i, f);
    }

    public final void setRotation(float f) {
        if (this.f50617o != f) {
            this.f50617o = f;
            invalidateSelf();
        }
    }

    public void setShadowSize(float f, float f2) {
        if (f >= 0.0f && f2 >= 0.0f) {
            float m44221d = m44221d(f);
            float m44221d2 = m44221d(f2);
            if (m44221d > m44221d2) {
                if (!this.f50618p) {
                    this.f50618p = true;
                }
                m44221d = m44221d2;
            }
            if (this.f50611i == m44221d && this.f50609g == m44221d2) {
                return;
            }
            this.f50611i = m44221d;
            this.f50609g = m44221d2;
            this.f50610h = Math.round(m44221d * 1.5f);
            this.f50608f = m44221d2;
            this.f50612j = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("invalid shadow size");
    }

    public void setShadowSize(float f) {
        setShadowSize(f, this.f50609g);
    }
}