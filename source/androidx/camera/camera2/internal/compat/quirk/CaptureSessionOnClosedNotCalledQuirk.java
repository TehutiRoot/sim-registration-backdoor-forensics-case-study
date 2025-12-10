package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class CaptureSessionOnClosedNotCalledQuirk implements Quirk {
    /* renamed from: a */
    public static boolean m63638a() {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        return false;
    }
}
