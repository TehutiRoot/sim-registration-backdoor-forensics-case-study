package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ExtensionDisabledQuirk implements Quirk {
    /* renamed from: a */
    public static boolean m62599a() {
        if (ExtensionVersion.isMinimumCompatibleVersion(Version.VERSION_1_2) && ExtensionVersion.isAdvancedExtenderSupported()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m62598b() {
        return "motorola".equalsIgnoreCase(Build.BRAND);
    }

    /* renamed from: c */
    public static boolean m62597c() {
        if ("google".equalsIgnoreCase(Build.BRAND) && "redfin".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m62596d() {
        if (!m62597c() && !m62598b()) {
            return false;
        }
        return true;
    }

    public boolean shouldDisableExtension() {
        if (m62597c() && !m62599a()) {
            return true;
        }
        if (m62598b() && ExtensionVersion.isMaximumCompatibleVersion(Version.VERSION_1_1)) {
            return true;
        }
        return false;
    }
}
