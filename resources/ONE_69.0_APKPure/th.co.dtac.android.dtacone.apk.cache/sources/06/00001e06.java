package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class TextureViewIsClosedQuirk implements Quirk {
    /* renamed from: a */
    public static boolean m63534a() {
        if (Build.VERSION.SDK_INT <= 23) {
            return true;
        }
        return false;
    }
}