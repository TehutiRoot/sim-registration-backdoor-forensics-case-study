package com.p020zl.reik.dilatingdotsprogressbar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.zl.reik.dilatingdotsprogressbar.DilatingDotDrawable */
/* loaded from: classes5.dex */
public class DilatingDotDrawable extends Drawable {

    /* renamed from: b */
    public float f60913b;

    /* renamed from: c */
    public float f60914c;

    /* renamed from: a */
    public Paint f60912a = new Paint(1);

    /* renamed from: d */
    public final Rect f60915d = new Rect(0, 0, 0, 0);

    public DilatingDotDrawable(int i, float f, float f2) {
        this.f60912a.setColor(i);
        this.f60912a.setStyle(Paint.Style.FILL);
        this.f60912a.setStrokeCap(Paint.Cap.ROUND);
        this.f60912a.setStrokeJoin(Paint.Join.ROUND);
        this.f60913b = f;
        setMaxRadius(f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.f60913b - 1.0f, this.f60912a);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f60915d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return ((int) (this.f60914c * 2.0f)) + 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return ((int) (this.f60914c * 2.0f)) + 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float getRadius() {
        return this.f60913b;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f60915d.offsetTo(rect.left, rect.top);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f60912a.getAlpha()) {
            this.f60912a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColor(int i) {
        this.f60912a.setColor(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f60912a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setMaxRadius(float f) {
        this.f60914c = f;
        Rect rect = this.f60915d;
        int i = ((int) (f * 2.0f)) + 2;
        rect.bottom = i;
        rect.right = i;
    }

    public void setRadius(float f) {
        this.f60913b = f;
        invalidateSelf();
    }
}
