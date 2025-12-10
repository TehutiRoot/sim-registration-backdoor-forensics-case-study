package androidx.camera.core.impl.utils;

import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class CameraOrientationUtil {
    public static int degreesToSurfaceRotation(int i) {
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i == 270) {
                        return 3;
                    }
                    throw new IllegalStateException("Invalid sensor rotation: " + i);
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static int getRelativeImageRotation(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = ((i2 - i) + 360) % 360;
        } else {
            i3 = (i2 + i) % 360;
        }
        if (Logger.isDebugEnabled("CameraOrientationUtil")) {
            Logger.m63230d("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3)));
        }
        return i3;
    }

    public static int surfaceRotationToDegrees(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return BitmapUtil.IMAGE_270_DEGREE;
                    }
                    throw new IllegalArgumentException("Unsupported surface rotation: " + i);
                }
                return BitmapUtil.IMAGE_180_DEGREE;
            }
            return 90;
        }
        return 0;
    }
}
