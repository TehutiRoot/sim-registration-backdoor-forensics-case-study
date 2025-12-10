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
    public final InterfaceC2359a f10554a;

    /* renamed from: androidx.camera.camera2.internal.compat.CameraDeviceCompat$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2359a {
        /* renamed from: a */
        void mo63626a(SessionConfigurationCompat sessionConfigurationCompat);

        CameraDevice unwrap();
    }

    /* renamed from: androidx.camera.camera2.internal.compat.CameraDeviceCompat$b */
    /* loaded from: classes.dex */
    public static final class C2360b extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final CameraDevice.StateCallback f10555a;

        /* renamed from: b */
        public final Executor f10556b;

        public C2360b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f10556b = executor;
            this.f10555a = stateCallback;
        }

        /* renamed from: a */
        public static /* synthetic */ void m63645a(C2360b c2360b, CameraDevice cameraDevice) {
            c2360b.m63640f(cameraDevice);
        }

        /* renamed from: b */
        public static /* synthetic */ void m63644b(C2360b c2360b, CameraDevice cameraDevice, int i) {
            c2360b.m63639g(cameraDevice, i);
        }

        /* renamed from: c */
        public static /* synthetic */ void m63643c(C2360b c2360b, CameraDevice cameraDevice) {
            c2360b.m63641e(cameraDevice);
        }

        /* renamed from: d */
        public static /* synthetic */ void m63642d(C2360b c2360b, CameraDevice cameraDevice) {
            c2360b.m63638h(cameraDevice);
        }

        /* renamed from: e */
        public final /* synthetic */ void m63641e(CameraDevice cameraDevice) {
            this.f10555a.onClosed(cameraDevice);
        }

        /* renamed from: f */
        public final /* synthetic */ void m63640f(CameraDevice cameraDevice) {
            this.f10555a.onDisconnected(cameraDevice);
        }

        /* renamed from: g */
        public final /* synthetic */ void m63639g(CameraDevice cameraDevice, int i) {
            this.f10555a.onError(cameraDevice, i);
        }

        /* renamed from: h */
        public final /* synthetic */ void m63638h(CameraDevice cameraDevice) {
            this.f10555a.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f10556b.execute(new Runnable() { // from class: yj
                @Override // java.lang.Runnable
                public final void run() {
                    CameraDeviceCompat.C2360b.m63643c(CameraDeviceCompat.C2360b.this, cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f10556b.execute(new Runnable() { // from class: Aj
                @Override // java.lang.Runnable
                public final void run() {
                    CameraDeviceCompat.C2360b.m63645a(CameraDeviceCompat.C2360b.this, cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i) {
            this.f10556b.execute(new Runnable() { // from class: zj
                @Override // java.lang.Runnable
                public final void run() {
                    CameraDeviceCompat.C2360b.m63644b(CameraDeviceCompat.C2360b.this, cameraDevice, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f10556b.execute(new Runnable() { // from class: Bj
                @Override // java.lang.Runnable
                public final void run() {
                    CameraDeviceCompat.C2360b.m63642d(CameraDeviceCompat.C2360b.this, cameraDevice);
                }
            });
        }
    }

    public CameraDeviceCompat(CameraDevice cameraDevice, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f10554a = new C0197Cj(cameraDevice);
        } else if (i >= 24) {
            this.f10554a = C2367d.m63627h(cameraDevice, handler);
        } else if (i >= 23) {
            this.f10554a = C2366c.m63628g(cameraDevice, handler);
        } else {
            this.f10554a = C2368e.m63623d(cameraDevice, handler);
        }
    }

    @NonNull
    public static CameraDeviceCompat toCameraDeviceCompat(@NonNull CameraDevice cameraDevice) {
        return toCameraDeviceCompat(cameraDevice, MainThreadAsyncHandler.getInstance());
    }

    public void createCaptureSession(@NonNull SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat {
        this.f10554a.mo63626a(sessionConfigurationCompat);
    }

    @NonNull
    public CameraDevice toCameraDevice() {
        return this.f10554a.unwrap();
    }

    @NonNull
    public static CameraDeviceCompat toCameraDeviceCompat(@NonNull CameraDevice cameraDevice, @NonNull Handler handler) {
        return new CameraDeviceCompat(cameraDevice, handler);
    }
}