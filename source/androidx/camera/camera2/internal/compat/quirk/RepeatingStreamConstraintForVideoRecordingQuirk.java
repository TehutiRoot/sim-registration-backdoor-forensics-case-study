package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class RepeatingStreamConstraintForVideoRecordingQuirk implements Quirk {
    /* renamed from: a */
    public static boolean m63586a() {
        return isHuaweiMate9();
    }

    public static boolean isHuaweiMate9() {
        if ("Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }
}
