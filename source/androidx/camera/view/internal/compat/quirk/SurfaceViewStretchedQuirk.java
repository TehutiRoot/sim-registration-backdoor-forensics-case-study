package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class SurfaceViewStretchedQuirk implements Quirk {
    /* renamed from: a */
    public static boolean m61789a() {
        if ("LENOVO".equalsIgnoreCase(Build.MANUFACTURER) && "Q706F".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m61788b() {
        if ("OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m61787c() {
        if ("SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.DEVICE;
            if ("F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m61786d() {
        if (Build.VERSION.SDK_INT < 33 && (m61787c() || m61788b() || m61789a())) {
            return true;
        }
        return false;
    }
}
