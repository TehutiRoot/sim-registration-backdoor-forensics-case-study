package androidx.camera.core.imagecapture;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CaptureConfig;
import java.util.List;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public final class CameraRequest {

    /* renamed from: a */
    public final List f11087a;

    /* renamed from: b */
    public final NR1 f11088b;

    public CameraRequest(@NonNull List<CaptureConfig> list, @NonNull NR1 nr1) {
        this.f11087a = list;
        this.f11088b = nr1;
    }

    /* renamed from: a */
    public List m63070a() {
        return this.f11087a;
    }

    /* renamed from: b */
    public boolean m63069b() {
        return this.f11088b.isAborted();
    }
}