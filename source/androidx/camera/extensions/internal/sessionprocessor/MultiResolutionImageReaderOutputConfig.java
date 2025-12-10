package androidx.camera.extensions.internal.sessionprocessor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class MultiResolutionImageReaderOutputConfig implements InterfaceC0757Ki {
    /* renamed from: a */
    public static MultiResolutionImageReaderOutputConfig m62577a(int i, int i2, String str, List list, int i3, int i4) {
        return new C0505H8(i, i2, str, list, i3, i4);
    }

    /* renamed from: b */
    public abstract int mo62576b();

    /* renamed from: c */
    public abstract int mo62575c();

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
