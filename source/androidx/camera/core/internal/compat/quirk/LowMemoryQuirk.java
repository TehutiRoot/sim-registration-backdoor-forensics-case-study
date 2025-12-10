package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class LowMemoryQuirk implements Quirk {

    /* renamed from: a */
    public static final Set f11369a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    /* renamed from: a */
    public static boolean m62782a() {
        return f11369a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
