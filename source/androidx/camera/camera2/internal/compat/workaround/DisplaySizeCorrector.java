package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class DisplaySizeCorrector {

    /* renamed from: a */
    public final SmallDisplaySizeQuirk f10546a = (SmallDisplaySizeQuirk) DeviceQuirks.get(SmallDisplaySizeQuirk.class);

    @Nullable
    public Size getDisplaySize() {
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.f10546a;
        if (smallDisplaySizeQuirk != null) {
            return smallDisplaySizeQuirk.getDisplaySize();
        }
        return null;
    }
}
