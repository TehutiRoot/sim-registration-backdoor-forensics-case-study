package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.Locale;

@RequiresApi(21)
/* loaded from: classes.dex */
public class StillCaptureFlashStopRepeatingQuirk implements Quirk {
    /* renamed from: a */
    public static boolean m63584a() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        if ("SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716")) {
            return true;
        }
        return false;
    }
}
