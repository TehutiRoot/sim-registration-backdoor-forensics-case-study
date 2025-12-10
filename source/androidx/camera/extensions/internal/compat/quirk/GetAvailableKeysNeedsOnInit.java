package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class GetAvailableKeysNeedsOnInit implements Quirk {
    /* renamed from: a */
    public static boolean m62593a() {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG");
    }
}
