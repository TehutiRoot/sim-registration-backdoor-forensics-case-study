package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ResolutionCorrector {

    /* renamed from: a */
    public final ExtraCroppingQuirk f10560a;

    public ResolutionCorrector() {
        this((ExtraCroppingQuirk) DeviceQuirks.get(ExtraCroppingQuirk.class));
    }

    @NonNull
    public List<Size> insertOrPrioritize(@NonNull SurfaceConfig.ConfigType configType, @NonNull List<Size> list) {
        ExtraCroppingQuirk extraCroppingQuirk = this.f10560a;
        if (extraCroppingQuirk == null) {
            return list;
        }
        Size verifiedResolution = extraCroppingQuirk.getVerifiedResolution(configType);
        if (verifiedResolution == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(verifiedResolution);
        for (Size size : list) {
            if (!size.equals(verifiedResolution)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public ResolutionCorrector(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f10560a = extraCroppingQuirk;
    }
}
