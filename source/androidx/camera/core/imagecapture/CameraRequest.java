package androidx.camera.core.imagecapture;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CaptureConfig;
import java.util.List;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public final class CameraRequest {

    /* renamed from: a */
    public final List f10999a;

    /* renamed from: b */
    public final QQ1 f11000b;

    public CameraRequest(@NonNull List<CaptureConfig> list, @NonNull QQ1 qq1) {
        this.f10999a = list;
        this.f11000b = qq1;
    }

    /* renamed from: a */
    public List m63122a() {
        return this.f10999a;
    }

    /* renamed from: b */
    public boolean m63121b() {
        return this.f11000b.isAborted();
    }
}
