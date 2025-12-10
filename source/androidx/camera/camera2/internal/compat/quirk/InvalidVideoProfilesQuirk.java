package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@RequiresApi(21)
/* loaded from: classes.dex */
public class InvalidVideoProfilesQuirk implements Quirk {

    /* renamed from: a */
    public static final List f10538a = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    /* renamed from: a */
    public static boolean m63597a() {
        if (!m63592f() && !m63593e()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m63596b() {
        if (m63595c() && m63597a()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m63595c() {
        return f10538a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    /* renamed from: d */
    public static boolean m63594d() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && m63592f()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m63593e() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("td1a");
    }

    /* renamed from: f */
    public static boolean m63592f() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }

    /* renamed from: g */
    public static boolean m63591g() {
        if (!m63594d() && !m63596b()) {
            return false;
        }
        return true;
    }
}
