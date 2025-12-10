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
public class C2363a implements CameraCaptureSessionCompat.InterfaceC2356a {

    /* renamed from: a */
    public final CameraCaptureSession f10568a;

    /* renamed from: b */
    public final Object f10569b;

    /* renamed from: androidx.camera.camera2.internal.compat.a$a */
    /* loaded from: classes.dex */
    public static class C2364a {

        /* renamed from: a */
        public final Handler f10570a;

        public C2364a(Handler handler) {
            this.f10570a = handler;
        }
    }

    public C2363a(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f10568a = (CameraCaptureSession) Preconditions.checkNotNull(cameraCaptureSession);
        this.f10569b = obj;
    }

    /* renamed from: a */
    public static CameraCaptureSessionCompat.InterfaceC2356a m63629a(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C2363a(cameraCaptureSession, new C2364a(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2356a
    public int captureBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10568a.captureBurst(list, new CameraCaptureSessionCompat.C2357b(executor, captureCallback), ((C2364a) this.f10569b).f10570a);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2356a
    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10568a.capture(captureRequest, new CameraCaptureSessionCompat.C2357b(executor, captureCallback), ((C2364a) this.f10569b).f10570a);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2356a
    public int setRepeatingBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10568a.setRepeatingBurst(list, new CameraCaptureSessionCompat.C2357b(executor, captureCallback), ((C2364a) this.f10569b).f10570a);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2356a
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f10568a.setRepeatingRequest(captureRequest, new CameraCaptureSessionCompat.C2357b(executor, captureCallback), ((C2364a) this.f10569b).f10570a);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.InterfaceC2356a
    public CameraCaptureSession unwrap() {
        return this.f10568a;
    }
}