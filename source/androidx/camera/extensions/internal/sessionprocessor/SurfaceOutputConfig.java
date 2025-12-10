package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.List;

@AutoValue
@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class SurfaceOutputConfig implements InterfaceC0757Ki {
    /* renamed from: a */
    public static SurfaceOutputConfig m62571a(int i, int i2, String str, List list, Surface surface) {
        return new C5425c9(i, i2, str, list, surface);
    }

    /* renamed from: b */
    public static SurfaceOutputConfig m62570b(int i, Surface surface) {
        return m62571a(i, -1, null, Collections.emptyList(), surface);
    }

    /* renamed from: c */
    public abstract Surface mo51705c();

    @Override // p000.InterfaceC0757Ki
    public abstract /* synthetic */ int getId();

    @Override // p000.InterfaceC0757Ki
    @Nullable
    public abstract /* synthetic */ String getPhysicalCameraId();

    @Override // p000.InterfaceC0757Ki
    public abstract /* synthetic */ int getSurfaceGroupId();

    @Override // p000.InterfaceC0757Ki
    @NonNull
    public abstract /* synthetic */ List getSurfaceSharingOutputConfigs();
}
