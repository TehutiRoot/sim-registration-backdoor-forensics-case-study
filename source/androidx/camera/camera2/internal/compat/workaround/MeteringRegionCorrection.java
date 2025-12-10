package androidx.camera.camera2.internal.compat.workaround;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.impl.Quirks;

@RequiresApi(21)
/* loaded from: classes.dex */
public class MeteringRegionCorrection {

    /* renamed from: a */
    public final Quirks f10554a;

    public MeteringRegionCorrection(@NonNull Quirks quirks) {
        this.f10554a = quirks;
    }

    @NonNull
    public PointF getCorrectedPoint(@NonNull MeteringPoint meteringPoint, int i) {
        if (i == 1 && this.f10554a.contains(AfRegionFlipHorizontallyQuirk.class)) {
            return new PointF(1.0f - meteringPoint.getX(), meteringPoint.getY());
        }
        return new PointF(meteringPoint.getX(), meteringPoint.getY());
    }
}
