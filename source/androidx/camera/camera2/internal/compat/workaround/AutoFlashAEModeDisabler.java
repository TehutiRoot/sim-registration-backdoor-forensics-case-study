package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.core.impl.Quirks;

@RequiresApi(21)
/* loaded from: classes.dex */
public class AutoFlashAEModeDisabler {

    /* renamed from: a */
    public final boolean f10544a;

    /* renamed from: b */
    public final boolean f10545b;

    public AutoFlashAEModeDisabler(@NonNull Quirks quirks) {
        boolean z;
        this.f10544a = quirks.contains(ImageCaptureFailWithAutoFlashQuirk.class);
        if (DeviceQuirks.get(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f10545b = z;
    }

    public int getCorrectedAeMode(int i) {
        if ((this.f10544a || this.f10545b) && i == 2) {
            return 1;
        }
        return i;
    }
}
