package com.airbnb.lottie.model.content;

import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class GradientColor {

    /* renamed from: a */
    public final float[] f41327a;

    /* renamed from: b */
    public final int[] f41328b;

    public GradientColor(float[] fArr, int[] iArr) {
        this.f41327a = fArr;
        this.f41328b = iArr;
    }

    /* renamed from: a */
    public final int m50793a(float f) {
        int binarySearch = Arrays.binarySearch(this.f41327a, f);
        if (binarySearch >= 0) {
            return this.f41328b[binarySearch];
        }
        int i = -(binarySearch + 1);
        if (i == 0) {
            return this.f41328b[0];
        }
        int[] iArr = this.f41328b;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f41327a;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return GammaEvaluator.evaluate((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }

    public GradientColor copyWithPositions(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = m50793a(fArr[i]);
        }
        return new GradientColor(fArr, iArr);
    }

    public int[] getColors() {
        return this.f41328b;
    }

    public float[] getPositions() {
        return this.f41327a;
    }

    public int getSize() {
        return this.f41328b.length;
    }

    public void lerp(GradientColor gradientColor, GradientColor gradientColor2, float f) {
        if (gradientColor.f41328b.length == gradientColor2.f41328b.length) {
            for (int i = 0; i < gradientColor.f41328b.length; i++) {
                this.f41327a[i] = MiscUtils.lerp(gradientColor.f41327a[i], gradientColor2.f41327a[i], f);
                this.f41328b[i] = GammaEvaluator.evaluate(f, gradientColor.f41328b[i], gradientColor2.f41328b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + gradientColor.f41328b.length + " vs " + gradientColor2.f41328b.length + ")");
    }
}
