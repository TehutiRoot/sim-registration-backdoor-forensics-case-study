package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.core.impl.Quirks;

@RequiresApi(21)
/* loaded from: classes.dex */
public class OverrideAeModeForStillCapture {

    /* renamed from: a */
    public final boolean f10558a;

    /* renamed from: b */
    public boolean f10559b = false;

    public OverrideAeModeForStillCapture(@NonNull Quirks quirks) {
        this.f10558a = quirks.get(AutoFlashUnderExposedQuirk.class) != null;
    }

    public void onAePrecaptureFinished() {
        this.f10559b = false;
    }

    public void onAePrecaptureStarted() {
        this.f10559b = true;
    }

    public boolean shouldSetAeModeAlwaysFlash(int i) {
        if (this.f10559b && i == 0 && this.f10558a) {
            return true;
        }
        return false;
    }
}
