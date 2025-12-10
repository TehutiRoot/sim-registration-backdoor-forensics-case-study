package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class FadeThroughDrawable extends Drawable {

    /* renamed from: a */
    public final Drawable f50183a;

    /* renamed from: b */
    public final Drawable f50184b;

    /* renamed from: c */
    public final float[] f50185c;

    /* renamed from: d */
    public float f50186d;

    public FadeThroughDrawable(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        this.f50183a = drawable.getConstantState().newDrawable().mutate();
        Drawable mutate = drawable2.getConstantState().newDrawable().mutate();
        this.f50184b = mutate;
        mutate.setAlpha(0);
        this.f50185c = new float[2];
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f50183a.draw(canvas);
        this.f50184b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f50183a.getIntrinsicHeight(), this.f50184b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f50183a.getIntrinsicWidth(), this.f50184b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f50183a.getMinimumHeight(), this.f50184b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f50183a.getMinimumWidth(), this.f50184b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f50183a.isStateful() && !this.f50184b.isStateful()) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f50186d <= 0.5f) {
            this.f50183a.setAlpha(i);
            this.f50184b.setAlpha(0);
        } else {
            this.f50183a.setAlpha(0);
            this.f50184b.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f50183a.setBounds(i, i2, i3, i4);
        this.f50184b.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f50183a.setColorFilter(colorFilter);
        this.f50184b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
        if (this.f50186d != f) {
            this.f50186d = f;
            AbstractC1881aW.m65118a(f, this.f50185c);
            this.f50183a.setAlpha((int) (this.f50185c[0] * 255.0f));
            this.f50184b.setAlpha((int) (this.f50185c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.f50183a.setState(iArr);
        boolean state2 = this.f50184b.setState(iArr);
        if (!state && !state2) {
            return false;
        }
        return true;
    }
}