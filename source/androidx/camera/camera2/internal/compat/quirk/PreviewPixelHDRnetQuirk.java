package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@RequiresApi(21)
/* loaded from: classes.dex */
public class PreviewPixelHDRnetQuirk implements Quirk {

    /* renamed from: a */
    public static final List f10541a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    /* renamed from: a */
    public static boolean m63587a() {
        if ("Google".equals(Build.MANUFACTURER) && f10541a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()))) {
            return true;
        }
        return false;
    }
}
