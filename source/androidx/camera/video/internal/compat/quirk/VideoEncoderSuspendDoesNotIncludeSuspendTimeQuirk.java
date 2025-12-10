package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk implements Quirk {
    /* renamed from: a */
    public static boolean m62073a() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT < 29) {
            return true;
        }
        return false;
    }
}
