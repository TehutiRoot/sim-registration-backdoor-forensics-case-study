package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class AudioEncoderIgnoresInputTimestampQuirk implements Quirk {
    /* renamed from: a */
    public static boolean m62071a() {
        if ("Sony".equalsIgnoreCase(Build.BRAND) && "G3125".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m62070b() {
        return m62071a();
    }
}