package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.concurrent.Executor;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class CameraDeviceCompat {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int SESSION_OPERATION_MODE_CONSTRAINED_HIGH_SPEED = 1;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int SESSION_OPERATION_MODE_NORMAL = 0;

    /* renamed from: a */
    public final InterfaceC2377a f10466a;

    /* renamed from: androidx.camera.camera2.internal.compat.CameraDeviceCompat$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2377a {
        /* renamed from: a */
        void mo63675a(SessionConfigurationCompat sessionConfigurationCompat);

        CameraDevice unwrap();
    }

    /* renamed from: androidx.camera.camera2.internal.compat.CameraDeviceCompat$b */
    /* loaded from: classes.dex */
    public static final class C2378b extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final CameraDevice.StateCallback f10467a;

        /* renamed from: b */
        public final Executor f10468b;

        public C2378b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f10468b = executor;
            this.f10467a = stateCallback;
        }

        /* renamed from: a */
        public static /* synthetic */ void m63694a(C2378b c2378b, CameraDevice cameraDevice) {
            c2378b.m63689f(cameraDevice);
        }

        /* renamed from: b */
        public static /* synthetic */ void m63693b(C2378b c2378b, CameraDevice cameraDevice, int i) {
            c2378b.m63688g(cameraDevice, i);
        }

        /* renamed from: c */
        public static /* synthetic */ void m63692c(C2378b c2378b, CameraDevice cameraDevice) {
            c2378b.m63690e(cameraDevice);
        }

        /* renamed from: d */
        public static /* synthetic */ void m63691d(C2378b c2378b, CameraDevice cameraDevice) {
            c2378b.m63687h(cameraDevice);
        }

        /* renamed from: e */
        public final /* synthetic */ void m63690e(CameraDevice cameraDevice) {
            this.f10467a.onClosed(cameraDevice);
        }

        /* renamed from: f */
        public final /* synthetic */ void m63689f(CameraDevice cameraDevice) {
            this.f10467a.onDisconnected(cameraDevice);
        }

        /* renamed from: g */
        public final /* synthetic */ void m63688g(CameraDevice cameraDevice, int i) {
            this.f10467a.onError(cameraDevice, i);
        }

        /* renamed from: h */
        public final /* synthetic */ void m63687h(CameraDevice cameraDevice) {
            this.f10467a.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f10468b.execute(new Runnable() { // from class: yj
                {
                    CameraDeviceCompat.C2378b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraDeviceCompat.C2378b.m63692c(CameraDeviceCompat.C2378b.this, cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f10468b.execute(new Runnable() { // from class: Aj
                {
                    CameraDeviceCompat.C2378b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraDeviceCompat.C2378b.m63694a(CameraDeviceCompat.C2378b.this, cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i) {
            this.f10468b.execute(new Runnable() { // from class: zj
                {
                    CameraDeviceCompat.C2378b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraDeviceCompat.C2378b.m63693b(CameraDeviceCompat.C2378b.this, cameraDevice, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f10468b.execute(new Runnable() { // from class: Bj
                {
                    CameraDeviceCompat.C2378b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraDeviceCompat.C2378b.m63691d(CameraDeviceCompat.C2378b.this, cameraDevice);
                }
            });
        }
    }

    public CameraDeviceCompat(CameraDevice cameraDevice, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f10466a = new C0203Cj(cameraDevice);
        } else if (i >= 24) {
            this.f10466a = C2385d.m63676h(cameraDevice, handler);
        } else if (i >= 23) {
            this.f10466a = C2384c.m63677g(cameraDevice, handler);
        } else {
            this.f10466a = C2386e.m63672d(cameraDevice, handler);
        }
    }

    @NonNull
    public static CameraDeviceCompat toCameraDeviceCompat(@NonNull CameraDevice cameraDevice) {
        return toCameraDeviceCompat(cameraDevice, MainThreadAsyncHandler.getInstance());
    }

    public void createCaptureSession(@NonNull SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat {
        this.f10466a.mo63675a(sessionConfigurationCompat);
    }

    @NonNull
    public CameraDevice toCameraDevice() {
        return this.f10466a.unwrap();
    }

    @NonNull
    public static CameraDeviceCompat toCameraDeviceCompat(@NonNull CameraDevice cameraDevice, @NonNull Handler handler) {
        return new CameraDeviceCompat(cameraDevice, handler);
    }
}
