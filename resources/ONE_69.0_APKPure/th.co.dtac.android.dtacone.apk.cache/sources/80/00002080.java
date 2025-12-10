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
public abstract class SurfaceOutputConfig implements InterfaceC0747Ki {
    /* renamed from: a */
    public static SurfaceOutputConfig m62519a(int i, int i2, String str, List list, Surface surface) {
        return new C5411c9(i, i2, str, list, surface);
    }

    /* renamed from: b */
    public static SurfaceOutputConfig m62518b(int i, Surface surface) {
        return m62519a(i, -1, null, Collections.emptyList(), surface);
    }

    /* renamed from: c */
    public abstract Surface mo51722c();

    @Override // p000.InterfaceC0747Ki
    public abstract /* synthetic */ int getId();

    @Override // p000.InterfaceC0747Ki
    @Nullable
    public abstract /* synthetic */ String getPhysicalCameraId();

    @Override // p000.InterfaceC0747Ki
    public abstract /* synthetic */ int getSurfaceGroupId();

    @Override // p000.InterfaceC0747Ki
    @NonNull
    public abstract /* synthetic */ List getSurfaceSharingOutputConfigs();
}