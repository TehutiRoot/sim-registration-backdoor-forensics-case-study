package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.List;

@AutoValue
@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class ImageReaderOutputConfig implements InterfaceC0747Ki {
    /* renamed from: a */
    public static ImageReaderOutputConfig m62527a(int i, int i2, String str, List list, Size size, int i3, int i4) {
        return new C16958w8(i, i2, str, list, size, i3, i4);
    }

    /* renamed from: b */
    public static ImageReaderOutputConfig m62526b(int i, Size size, int i2, int i3) {
        return new C16958w8(i, -1, null, Collections.emptyList(), size, i2, i3);
    }

    /* renamed from: c */
    public abstract int mo797c();

    /* renamed from: d */
    public abstract int mo796d();

    /* renamed from: e */
    public abstract Size mo795e();

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