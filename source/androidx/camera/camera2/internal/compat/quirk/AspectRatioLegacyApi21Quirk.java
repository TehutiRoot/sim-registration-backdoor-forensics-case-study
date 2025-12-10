package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.impl.Quirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class AspectRatioLegacyApi21Quirk implements Quirk {
    /* renamed from: a */
    public static boolean m63641a(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2 && Build.VERSION.SDK_INT == 21) {
            return true;
        }
        return false;
    }

    public int getCorrectedAspectRatio() {
        return 2;
    }
}
