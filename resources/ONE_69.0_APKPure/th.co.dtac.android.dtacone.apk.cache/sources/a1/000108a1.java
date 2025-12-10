package p000;

import android.graphics.Color;
import androidx.core.graphics.ColorUtils;

/* renamed from: rh */
/* loaded from: classes2.dex */
public abstract class AbstractC13285rh {

    /* renamed from: a */
    public static final float[][] f77594a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b */
    public static final float[][] f77595b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c */
    public static final float[] f77596c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d */
    public static final float[][] f77597d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: a */
    public static int m23466a(float f) {
        float f2;
        boolean z;
        float f3;
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f4 = (f + 16.0f) / 116.0f;
        if (f > 8.0f) {
            f2 = f4 * f4 * f4;
        } else {
            f2 = f / 903.2963f;
        }
        float f5 = f4 * f4 * f4;
        if (f5 > 0.008856452f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f3 = f5;
        } else {
            f3 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z) {
            f5 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f77596c;
        return ColorUtils.XYZToColor(f3 * fArr[0], f2 * fArr[1], f5 * fArr[2]);
    }

    /* renamed from: b */
    public static float m23465b(int i) {
        return m23464c(m23460g(i));
    }

    /* renamed from: c */
    public static float m23464c(float f) {
        float f2 = f / 100.0f;
        if (f2 <= 0.008856452f) {
            return f2 * 903.2963f;
        }
        return (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    /* renamed from: d */
    public static float m23463d(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: e */
    public static float m23462e(int i) {
        float pow;
        float f = i / 255.0f;
        if (f <= 0.04045f) {
            pow = f / 12.92f;
        } else {
            pow = (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    /* renamed from: f */
    public static float[] m23461f(int i) {
        float m23462e = m23462e(Color.red(i));
        float m23462e2 = m23462e(Color.green(i));
        float m23462e3 = m23462e(Color.blue(i));
        float[][] fArr = f77597d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[0] * m23462e) + (fArr2[1] * m23462e2) + (fArr2[2] * m23462e3);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[0] * m23462e) + (fArr3[1] * m23462e2) + (fArr3[2] * m23462e3);
        float[] fArr4 = fArr[2];
        return new float[]{f, f2, (m23462e * fArr4[0]) + (m23462e2 * fArr4[1]) + (m23462e3 * fArr4[2])};
    }

    /* renamed from: g */
    public static float m23460g(int i) {
        float m23462e = m23462e(Color.red(i));
        float m23462e2 = m23462e(Color.green(i));
        float m23462e3 = m23462e(Color.blue(i));
        float[] fArr = f77597d[1];
        return (m23462e * fArr[0]) + (m23462e2 * fArr[1]) + (m23462e3 * fArr[2]);
    }

    /* renamed from: h */
    public static float m23459h(float f) {
        float f2;
        if (f > 8.0f) {
            f2 = (float) Math.pow((f + 16.0d) / 116.0d, 3.0d);
        } else {
            f2 = f / 903.2963f;
        }
        return f2 * 100.0f;
    }
}