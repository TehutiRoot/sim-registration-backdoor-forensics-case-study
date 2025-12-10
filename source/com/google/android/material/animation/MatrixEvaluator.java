package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    public final float[] f48936a = new float[9];

    /* renamed from: b */
    public final float[] f48937b = new float[9];

    /* renamed from: c */
    public final Matrix f48938c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @NonNull
    public Matrix evaluate(float f, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.f48936a);
        matrix2.getValues(this.f48937b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f48937b;
            float f2 = fArr[i];
            float f3 = this.f48936a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f48938c.setValues(this.f48937b);
        return this.f48938c;
    }
}
