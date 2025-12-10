package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class EncoderNotUsePersistentInputSurfaceQuirk implements Quirk {

    /* renamed from: a */
    public static final List f11950a = Arrays.asList("SM-N9208", "SM-G920V");

    /* renamed from: a */
    public static boolean m62113a() {
        if (Build.VERSION.SDK_INT > 22 && !f11950a.contains(Build.MODEL.toUpperCase())) {
            return false;
        }
        return true;
    }
}
