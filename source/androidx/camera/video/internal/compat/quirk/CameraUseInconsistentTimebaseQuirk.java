package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class CameraUseInconsistentTimebaseQuirk implements Quirk {

    /* renamed from: a */
    public static final Set f11946a = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));

    /* renamed from: b */
    public static final Set f11947b = new HashSet(Arrays.asList("sm4350", "sm6375"));

    /* renamed from: c */
    public static final Set f11948c = new HashSet(Arrays.asList("m2007j20cg", "m2007j20ct"));

    /* renamed from: a */
    private static boolean m62119a() {
        return f11948c.contains(Build.MODEL.toLowerCase());
    }

    /* renamed from: b */
    public static boolean m62118b() {
        if ("SAMSUNG".equalsIgnoreCase(Build.BRAND) && f11946a.contains(Build.HARDWARE.toLowerCase())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m62117c() {
        if (!m62116d() && !m62118b() && !m62119a()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m62116d() {
        String str;
        if (Build.VERSION.SDK_INT >= 31) {
            Set set = f11947b;
            str = Build.SOC_MODEL;
            if (set.contains(str.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
