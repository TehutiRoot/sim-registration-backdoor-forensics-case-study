package p000;

import android.animation.TypeEvaluator;

/* renamed from: U20 */
/* loaded from: classes2.dex */
public class U20 implements TypeEvaluator {

    /* renamed from: a */
    public float[] f6503a;

    public U20(float[] fArr) {
        this.f6503a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f6503a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}