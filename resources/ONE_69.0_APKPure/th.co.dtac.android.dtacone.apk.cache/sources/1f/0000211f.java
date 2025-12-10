package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class DeactivateEncoderSurfaceBeforeStopEncoderQuirk implements Quirk {
    /* renamed from: a */
    public static boolean m62063a() {
        if (Build.VERSION.SDK_INT <= 22) {
            return true;
        }
        return false;
    }
}