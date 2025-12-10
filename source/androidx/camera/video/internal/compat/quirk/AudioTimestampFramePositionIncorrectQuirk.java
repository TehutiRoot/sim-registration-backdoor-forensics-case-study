package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class AudioTimestampFramePositionIncorrectQuirk implements Quirk {
    /* renamed from: a */
    public static boolean m62121a() {
        if ("Xiaomi".equalsIgnoreCase(Build.BRAND) && "Redmi 6A".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m62120b() {
        return m62121a();
    }
}
