package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ForceCloseDeferrableSurface {

    /* renamed from: a */
    public final boolean f10550a;

    /* renamed from: b */
    public final boolean f10551b;

    /* renamed from: c */
    public final boolean f10552c;

    public ForceCloseDeferrableSurface(@NonNull Quirks quirks, @NonNull Quirks quirks2) {
        this.f10550a = quirks2.contains(TextureViewIsClosedQuirk.class);
        this.f10551b = quirks.contains(PreviewOrientationIncorrectQuirk.class);
        this.f10552c = quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public void onSessionEnd(@Nullable List<DeferrableSurface> list) {
        if (shouldForceClose() && list != null) {
            for (DeferrableSurface deferrableSurface : list) {
                deferrableSurface.close();
            }
            Logger.m63230d("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }

    public boolean shouldForceClose() {
        if (!this.f10550a && !this.f10551b && !this.f10552c) {
            return false;
        }
        return true;
    }
}
