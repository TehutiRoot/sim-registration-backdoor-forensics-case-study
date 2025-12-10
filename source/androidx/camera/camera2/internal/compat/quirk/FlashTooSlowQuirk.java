package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@RequiresApi(21)
/* loaded from: classes.dex */
public class FlashTooSlowQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a */
    public static final List f10534a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL", "PIXEL 4", "PIXEL 5", "SM-A320");

    /* renamed from: a */
    public static boolean m63604a() {
        for (String str : f10534a) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m63603b(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        if (m63604a() && ((Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            return true;
        }
        return false;
    }
}
