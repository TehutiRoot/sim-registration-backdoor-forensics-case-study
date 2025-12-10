package jp.p022co.cyberagent.android.gpuimage;

import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* renamed from: jp.co.cyberagent.android.gpuimage.Rotation */
/* loaded from: classes5.dex */
public enum Rotation {
    NORMAL,
    ROTATION_90,
    ROTATION_180,
    ROTATION_270;

    /* renamed from: jp.co.cyberagent.android.gpuimage.Rotation$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11599a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f67695a;

        static {
            int[] iArr = new int[Rotation.values().length];
            f67695a = iArr;
            try {
                iArr[Rotation.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67695a[Rotation.ROTATION_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67695a[Rotation.ROTATION_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67695a[Rotation.ROTATION_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Rotation fromInt(int i) {
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i != 270) {
                        if (i == 360) {
                            return NORMAL;
                        }
                        throw new IllegalStateException(i + " is an unknown rotation. Needs to be either 0, 90, 180 or 270!");
                    }
                    return ROTATION_270;
                }
                return ROTATION_180;
            }
            return ROTATION_90;
        }
        return NORMAL;
    }

    public int asInt() {
        int i = C11599a.f67695a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return BitmapUtil.IMAGE_270_DEGREE;
                    }
                    throw new IllegalStateException("Unknown Rotation!");
                }
                return BitmapUtil.IMAGE_180_DEGREE;
            }
            return 90;
        }
        return 0;
    }
}
