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
    public final Drawable f50171a;

    /* renamed from: b */
    public final Drawable f50172b;

    /* renamed from: c */
    public final float[] f50173c;

    /* renamed from: d */
    public float f50174d;

    public FadeThroughDrawable(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        this.f50171a = drawable.getConstantState().newDrawable().mutate();
        Drawable mutate = drawable2.getConstantState().newDrawable().mutate();
        this.f50172b = mutate;
        mutate.setAlpha(0);
        this.f50173c = new float[2];
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f50171a.draw(canvas);
        this.f50172b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f50171a.getIntrinsicHeight(), this.f50172b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f50171a.getIntrinsicWidth(), this.f50172b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f50171a.getMinimumHeight(), this.f50172b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f50171a.getMinimumWidth(), this.f50172b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f50171a.isStateful() && !this.f50172b.isStateful()) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f50174d <= 0.5f) {
            this.f50171a.setAlpha(i);
            this.f50172b.setAlpha(0);
        } else {
            this.f50171a.setAlpha(0);
            this.f50172b.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f50171a.setBounds(i, i2, i3, i4);
        this.f50172b.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f50171a.setColorFilter(colorFilter);
        this.f50172b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        if (this.f50174d != f) {
            this.f50174d = f;
            AbstractC1614WV.m65620a(f, this.f50173c);
            this.f50171a.setAlpha((int) (this.f50173c[0] * 255.0f));
            this.f50172b.setAlpha((int) (this.f50173c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.f50171a.setState(iArr);
        boolean state2 = this.f50172b.setState(iArr);
        if (!state && !state2) {
            return false;
        }
        return true;
    }
}
