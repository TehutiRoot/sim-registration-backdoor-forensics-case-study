package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class NegativeLatLongSavesIncorrectlyQuirk implements Quirk {
    /* renamed from: a */
    public static boolean m62037a() {
        if (Build.VERSION.SDK_INT < 34) {
            return true;
        }
        return false;
    }
}