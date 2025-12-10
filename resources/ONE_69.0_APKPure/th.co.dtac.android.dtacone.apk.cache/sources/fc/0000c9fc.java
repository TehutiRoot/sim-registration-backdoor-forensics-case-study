package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.C2363a;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ij */
/* loaded from: classes.dex */
public class C10473ij extends C2363a {
    public C10473ij(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // androidx.camera.camera2.internal.compat.C2363a, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2356a
    public int captureBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10568a.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.C2363a, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2356a
    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10568a.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.C2363a, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2356a
    public int setRepeatingBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10568a.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.C2363a, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2356a
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10568a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}