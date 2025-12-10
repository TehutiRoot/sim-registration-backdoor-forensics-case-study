package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.core.util.Preconditions;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.compat.a */
/* loaded from: classes.dex */
public class C2381a implements CameraCaptureSessionCompat.InterfaceC2374a {

    /* renamed from: a */
    public final CameraCaptureSession f10480a;

    /* renamed from: b */
    public final Object f10481b;

    /* renamed from: androidx.camera.camera2.internal.compat.a$a */
    /* loaded from: classes.dex */
    public static class C2382a {

        /* renamed from: a */
        public final Handler f10482a;

        public C2382a(Handler handler) {
            this.f10482a = handler;
        }
    }

    public C2381a(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f10480a = (CameraCaptureSession) Preconditions.checkNotNull(cameraCaptureSession);
        this.f10481b = obj;
    }

    /* renamed from: a */
    public static CameraCaptureSessionCompat.InterfaceC2374a m63678a(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C2381a(cameraCaptureSession, new C2382a(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2374a
    public int captureBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10480a.captureBurst(list, new CameraCaptureSessionCompat.C2375b(executor, captureCallback), ((C2382a) this.f10481b).f10482a);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2374a
    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10480a.capture(captureRequest, new CameraCaptureSessionCompat.C2375b(executor, captureCallback), ((C2382a) this.f10481b).f10482a);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2374a
    public int setRepeatingBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10480a.setRepeatingBurst(list, new CameraCaptureSessionCompat.C2375b(executor, captureCallback), ((C2382a) this.f10481b).f10482a);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2374a
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10480a.setRepeatingRequest(captureRequest, new CameraCaptureSessionCompat.C2375b(executor, captureCallback), ((C2382a) this.f10481b).f10482a);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2374a
    public CameraCaptureSession unwrap() {
        return this.f10480a;
    }
}
