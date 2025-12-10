package androidx.camera.core.streamsharing;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ForwardingCameraControl;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class VirtualCameraControl extends ForwardingCameraControl {

    /* renamed from: b */
    public final StreamSharing.InterfaceC2547a f11571b;

    public VirtualCameraControl(CameraControlInternal cameraControlInternal, StreamSharing.InterfaceC2547a interfaceC2547a) {
        super(cameraControlInternal);
        this.f11571b = interfaceC2547a;
    }

    /* renamed from: a */
    public final int m62593a(CaptureConfig captureConfig) {
        Integer num = (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_JPEG_QUALITY, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* renamed from: b */
    public final int m62592b(CaptureConfig captureConfig) {
        Integer num = (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_ROTATION, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public ListenableFuture<List<Void>> submitStillCaptureRequests(@NonNull List<CaptureConfig> list, int i, int i2) {
        boolean z = true;
        if (list.size() != 1) {
            z = false;
        }
        Preconditions.checkArgument(z, "Only support one capture config.");
        return Futures.allAsList(Collections.singletonList(this.f11571b.mo62594a(m62593a(list.get(0)), m62592b(list.get(0)))));
    }
}