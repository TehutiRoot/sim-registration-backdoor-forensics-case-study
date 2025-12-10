package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class PreviewDelayWhenVideoCaptureIsBoundQuirk implements Quirk {

    /* renamed from: a */
    public static final Set f11952a = new HashSet(Arrays.asList("HWELE", "HW-02L", "HWVOG", "HWYAL", "HWLYA", "HWCOL", "HWPAR"));

    /* renamed from: b */
    public static final Set f11953b = new HashSet(Arrays.asList("ELS-AN00", "ELS-TN00", "ELS-NX9", "ELS-N04"));

    /* renamed from: a */
    public static boolean m62088a() {
        if ("Huawei".equalsIgnoreCase(Build.MANUFACTURER)) {
            Set set = f11952a;
            String str = Build.DEVICE;
            Locale locale = Locale.US;
            if (set.contains(str.toUpperCase(locale)) || f11953b.contains(Build.MODEL.toUpperCase(locale))) {
                return true;
            }
        }
        return false;
    }
}
