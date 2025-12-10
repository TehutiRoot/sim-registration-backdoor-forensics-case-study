package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ImageCaptureFailWithAutoFlashQuirk implements Quirk {

    /* renamed from: a */
    public static final List f10535a = Arrays.asList("sm-j700f", "sm-j710f");

    /* renamed from: a */
    public static boolean m63602a(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        if (f10535a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return true;
        }
        return false;
    }
}
