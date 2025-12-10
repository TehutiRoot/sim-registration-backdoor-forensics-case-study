package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.C2381a;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ij */
/* loaded from: classes.dex */
public class C10486ij extends C2381a {
    public C10486ij(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // androidx.camera.camera2.internal.compat.C2381a, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2374a
    public int captureBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10480a.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.C2381a, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2374a
    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10480a.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.C2381a, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2374a
    public int setRepeatingBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10480a.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.C2381a, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2374a
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10480a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
