package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.Locale;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ZslDisablerQuirk implements Quirk {
    /* renamed from: a */
    public static boolean m63577a() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && Build.MODEL.toUpperCase(Locale.US).startsWith("SM-F936")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m63576b() {
        if ("xiaomi".equalsIgnoreCase(Build.BRAND) && Build.MODEL.toUpperCase(Locale.US).startsWith("MI 8")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m63575c() {
        if (!m63577a() && !m63576b()) {
            return false;
        }
        return true;
    }
}
