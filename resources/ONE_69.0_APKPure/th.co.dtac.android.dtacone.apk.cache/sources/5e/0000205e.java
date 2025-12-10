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
    public static boolean m62547a() {
        if (ExtensionVersion.isMinimumCompatibleVersion(Version.VERSION_1_2) && ExtensionVersion.isAdvancedExtenderSupported()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m62546b() {
        return "motorola".equalsIgnoreCase(Build.BRAND);
    }

    /* renamed from: c */
    public static boolean m62545c() {
        if ("google".equalsIgnoreCase(Build.BRAND) && "redfin".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m62544d() {
        if (!m62545c() && !m62546b()) {
            return false;
        }
        return true;
    }

    public boolean shouldDisableExtension() {
        if (m62545c() && !m62547a()) {
            return true;
        }
        if (m62546b() && ExtensionVersion.isMaximumCompatibleVersion(Version.VERSION_1_1)) {
            return true;
        }
        return false;
    }
}