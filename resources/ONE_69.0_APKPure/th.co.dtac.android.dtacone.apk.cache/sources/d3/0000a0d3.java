package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    public final float[] f48948a = new float[9];

    /* renamed from: b */
    public final float[] f48949b = new float[9];

    /* renamed from: c */
    public final Matrix f48950c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @NonNull
    public Matrix evaluate(float f, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.f48948a);
        matrix2.getValues(this.f48949b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f48949b;
            float f2 = fArr[i];
            float f3 = this.f48948a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f48950c.setValues(this.f48949b);
        return this.f48950c;
    }
}