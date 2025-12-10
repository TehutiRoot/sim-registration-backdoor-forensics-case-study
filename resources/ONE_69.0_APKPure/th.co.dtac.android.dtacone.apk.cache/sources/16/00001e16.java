package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.SurfaceConfig;

@RequiresApi(21)
/* loaded from: classes.dex */
public class MaxPreviewSize {

    /* renamed from: a */
    public final ExtraCroppingQuirk f10641a;

    public MaxPreviewSize() {
        this((ExtraCroppingQuirk) DeviceQuirks.get(ExtraCroppingQuirk.class));
    }

    @NonNull
    public Size getMaxPreviewResolution(@NonNull Size size) {
        ExtraCroppingQuirk extraCroppingQuirk = this.f10641a;
        if (extraCroppingQuirk == null) {
            return size;
        }
        Size verifiedResolution = extraCroppingQuirk.getVerifiedResolution(SurfaceConfig.ConfigType.PRIV);
        if (verifiedResolution == null) {
            return size;
        }
        if (verifiedResolution.getWidth() * verifiedResolution.getHeight() > size.getWidth() * size.getHeight()) {
            return verifiedResolution;
        }
        return size;
    }

    public MaxPreviewSize(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f10641a = extraCroppingQuirk;
    }
}