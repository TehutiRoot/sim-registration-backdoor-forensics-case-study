package androidx.camera.core.internal.compat.workaround;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import androidx.camera.core.internal.compat.workaround.SurfaceSorter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class SurfaceSorter {

    /* renamed from: a */
    public final boolean f11461a;

    public SurfaceSorter() {
        boolean z;
        if (DeviceQuirks.get(SurfaceOrderQuirk.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f11461a = z;
    }

    /* renamed from: a */
    public static /* synthetic */ int m62728a(SurfaceSorter surfaceSorter, SessionConfig.OutputConfig outputConfig, SessionConfig.OutputConfig outputConfig2) {
        return surfaceSorter.m62726c(outputConfig, outputConfig2);
    }

    /* renamed from: b */
    public final int m62727b(DeferrableSurface deferrableSurface) {
        if (deferrableSurface.getContainerClass() == MediaCodec.class) {
            return 2;
        }
        if (deferrableSurface.getContainerClass() == Preview.class) {
            return 0;
        }
        return 1;
    }

    /* renamed from: c */
    public final /* synthetic */ int m62726c(SessionConfig.OutputConfig outputConfig, SessionConfig.OutputConfig outputConfig2) {
        return m62727b(outputConfig.getSurface()) - m62727b(outputConfig2.getSurface());
    }

    public void sort(@NonNull List<SessionConfig.OutputConfig> list) {
        if (!this.f11461a) {
            return;
        }
        Collections.sort(list, new Comparator() { // from class: GQ1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SurfaceSorter.m62728a(SurfaceSorter.this, (SessionConfig.OutputConfig) obj, (SessionConfig.OutputConfig) obj2);
            }
        });
    }
}