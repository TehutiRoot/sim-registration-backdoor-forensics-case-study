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
    public final StreamSharing.InterfaceC2565a f11483b;

    public VirtualCameraControl(CameraControlInternal cameraControlInternal, StreamSharing.InterfaceC2565a interfaceC2565a) {
        super(cameraControlInternal);
        this.f11483b = interfaceC2565a;
    }

    /* renamed from: a */
    public final int m62645a(CaptureConfig captureConfig) {
        Integer num = (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_JPEG_QUALITY, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* renamed from: b */
    public final int m62644b(CaptureConfig captureConfig) {
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
        return Futures.allAsList(Collections.singletonList(this.f11483b.mo62646a(m62645a(list.get(0)), m62644b(list.get(0)))));
    }
}
