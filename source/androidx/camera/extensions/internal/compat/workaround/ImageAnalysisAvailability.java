package androidx.camera.extensions.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;
import androidx.camera.extensions.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.extensions.internal.compat.quirk.ImageAnalysisUnavailableQuirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ImageAnalysisAvailability {

    /* renamed from: a */
    public ImageAnalysisUnavailableQuirk f11533a = (ImageAnalysisUnavailableQuirk) DeviceQuirks.get(ImageAnalysisUnavailableQuirk.class);

    /* renamed from: b */
    public ExtraSupportedSurfaceCombinationsQuirk f11534b = (ExtraSupportedSurfaceCombinationsQuirk) DeviceQuirks.get(ExtraSupportedSurfaceCombinationsQuirk.class);

    public boolean isAvailable(@NonNull String str, int i, int i2, boolean z, boolean z2) {
        ImageAnalysisUnavailableQuirk imageAnalysisUnavailableQuirk = this.f11533a;
        if (imageAnalysisUnavailableQuirk != null && imageAnalysisUnavailableQuirk.isUnavailable(str, i2)) {
            return false;
        }
        if (this.f11534b != null) {
            return true;
        }
        if (!z && !z2) {
            return true;
        }
        if (z && !z2) {
            if (i != 0 && i != 1 && i != 3) {
                return false;
            }
            return true;
        } else if (i != 1 && i != 3) {
            return false;
        } else {
            return true;
        }
    }
}
