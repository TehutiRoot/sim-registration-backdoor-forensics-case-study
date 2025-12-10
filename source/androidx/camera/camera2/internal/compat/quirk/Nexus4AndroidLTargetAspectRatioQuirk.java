package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@RequiresApi(21)
/* loaded from: classes.dex */
public class Nexus4AndroidLTargetAspectRatioQuirk implements Quirk {

    /* renamed from: a */
    public static final List f10540a = Arrays.asList("NEXUS 4");

    /* renamed from: a */
    public static boolean m63589a() {
        if ("GOOGLE".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT < 23 && f10540a.contains(Build.MODEL.toUpperCase(Locale.US))) {
            return true;
        }
        return false;
    }

    public int getCorrectedAspectRatio() {
        return 2;
    }
}
