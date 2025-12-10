package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements Quirk {

    /* renamed from: a */
    public static final Set f10533a = new HashSet();

    static {
        m63606a("sprd", "lemp");
        m63606a("sprd", "DM20C");
    }

    /* renamed from: a */
    public static void m63606a(String str, String str2) {
        Set set = f10533a;
        Locale locale = Locale.US;
        set.add(new Pair(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    /* renamed from: b */
    public static boolean m63605b() {
        Set set = f10533a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
