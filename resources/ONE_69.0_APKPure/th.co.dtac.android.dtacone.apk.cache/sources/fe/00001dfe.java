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
    public static final List f10626a = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    /* renamed from: a */
    public static boolean m63548a() {
        if (!m63543f() && !m63544e()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m63547b() {
        if (m63546c() && m63548a()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m63546c() {
        return f10626a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    /* renamed from: d */
    public static boolean m63545d() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && m63543f()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m63544e() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("td1a");
    }

    /* renamed from: f */
    public static boolean m63543f() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }

    /* renamed from: g */
    public static boolean m63542g() {
        if (!m63545d() && !m63547b()) {
            return false;
        }
        return true;
    }
}