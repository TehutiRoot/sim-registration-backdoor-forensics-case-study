package jp.p022co.cyberagent.android.gpuimage.util;

import jp.p022co.cyberagent.android.gpuimage.Rotation;

/* renamed from: jp.co.cyberagent.android.gpuimage.util.TextureRotationUtil */
/* loaded from: classes5.dex */
public class TextureRotationUtil {
    public static final float[] TEXTURE_NO_ROTATION = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public static final float[] TEXTURE_ROTATED_90 = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};
    public static final float[] TEXTURE_ROTATED_180 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    public static final float[] TEXTURE_ROTATED_270 = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: jp.co.cyberagent.android.gpuimage.util.TextureRotationUtil$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11600a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f67696a;

        static {
            int[] iArr = new int[Rotation.values().length];
            f67696a = iArr;
            try {
                iArr[Rotation.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67696a[Rotation.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67696a[Rotation.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67696a[Rotation.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static float m29062a(float f) {
        return f == 0.0f ? 1.0f : 0.0f;
    }

    public static float[] getRotation(Rotation rotation, boolean z, boolean z2) {
        float[] fArr;
        int i = C11600a.f67696a[rotation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    fArr = TEXTURE_NO_ROTATION;
                } else {
                    fArr = TEXTURE_ROTATED_270;
                }
            } else {
                fArr = TEXTURE_ROTATED_180;
            }
        } else {
            fArr = TEXTURE_ROTATED_90;
        }
        if (z) {
            fArr = new float[]{m29062a(fArr[0]), fArr[1], m29062a(fArr[2]), fArr[3], m29062a(fArr[4]), fArr[5], m29062a(fArr[6]), fArr[7]};
        }
        return z2 ? new float[]{fArr[0], m29062a(fArr[1]), fArr[2], m29062a(fArr[3]), fArr[4], m29062a(fArr[5]), fArr[6], m29062a(fArr[7])} : fArr;
    }
}
