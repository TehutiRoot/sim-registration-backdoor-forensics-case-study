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
public class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a */
    public static final List f10536a = Arrays.asList("itel w6004");

    /* renamed from: b */
    public static final List f10537b = Arrays.asList("sm-j700f", "sm-j710f");

    /* renamed from: a */
    public static boolean m63601a(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        boolean z;
        List list = f10537b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (list.contains(str.toLowerCase(locale)) && ((Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean contains = f10536a.contains(str.toLowerCase(locale));
        if (!z && !contains) {
            return false;
        }
        return true;
    }
}
