package androidx.camera.core.impl.utils;

import android.opengl.Matrix;
import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes.dex */
public final class MatrixExt {

    /* renamed from: a */
    public static final float[] f11404a = new float[16];

    /* renamed from: a */
    public static void m62800a(float[] fArr, float f, float f2) {
        Matrix.translateM(fArr, 0, -f, -f2, 0.0f);
    }

    /* renamed from: b */
    public static void m62799b(float[] fArr, float f, float f2) {
        Matrix.translateM(fArr, 0, f, f2, 0.0f);
    }

    public static void postRotate(@NonNull float[] fArr, float f, float f2, float f3) {
        float[] fArr2 = f11404a;
        synchronized (fArr2) {
            Matrix.setIdentityM(fArr2, 0);
            m62799b(fArr2, f2, f3);
            Matrix.rotateM(fArr2, 0, f, 0.0f, 0.0f, 1.0f);
            m62800a(fArr2, f2, f3);
            Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        }
    }

    public static void preRotate(@NonNull float[] fArr, float f, float f2, float f3) {
        m62799b(fArr, f2, f3);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        m62800a(fArr, f2, f3);
    }

    public static void preVerticalFlip(@NonNull float[] fArr, float f) {
        m62799b(fArr, 0.0f, f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        m62800a(fArr, 0.0f, f);
    }

    public static void setRotate(@NonNull float[] fArr, float f, float f2, float f3) {
        Matrix.setIdentityM(fArr, 0);
        preRotate(fArr, f, f2, f3);
    }

    @NonNull
    public static String toString(@NonNull float[] fArr, int i) {
        return String.format(Locale.US, "Matrix:\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f", Float.valueOf(fArr[i]), Float.valueOf(fArr[i + 4]), Float.valueOf(fArr[i + 8]), Float.valueOf(fArr[i + 12]), Float.valueOf(fArr[i + 1]), Float.valueOf(fArr[i + 5]), Float.valueOf(fArr[i + 9]), Float.valueOf(fArr[i + 13]), Float.valueOf(fArr[i + 2]), Float.valueOf(fArr[i + 6]), Float.valueOf(fArr[i + 10]), Float.valueOf(fArr[i + 14]), Float.valueOf(fArr[i + 3]), Float.valueOf(fArr[i + 7]), Float.valueOf(fArr[i + 11]), Float.valueOf(fArr[i + 15]));
    }
}