package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.List;
import java.util.concurrent.Executor;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class CameraCaptureSessionCompat {

    /* renamed from: a */
    public final InterfaceC2374a f10457a;

    /* renamed from: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2374a {
        int captureBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int setRepeatingBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        CameraCaptureSession unwrap();
    }

    /* renamed from: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$b */
    /* loaded from: classes.dex */
    public static final class C2375b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final CameraCaptureSession.CaptureCallback f10458a;

        /* renamed from: b */
        public final Executor f10459b;

        public C2375b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f10459b = executor;
            this.f10458a = captureCallback;
        }

        /* renamed from: h */
        public final /* synthetic */ void m63716h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            ApiCompat.Api24Impl.onCaptureBufferLost(this.f10458a, cameraCaptureSession, captureRequest, surface, j);
        }

        /* renamed from: i */
        public final /* synthetic */ void m63715i(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f10458a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        /* renamed from: j */
        public final /* synthetic */ void m63714j(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f10458a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        /* renamed from: k */
        public final /* synthetic */ void m63713k(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f10458a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        /* renamed from: l */
        public final /* synthetic */ void m63712l(CameraCaptureSession cameraCaptureSession, int i) {
            this.f10458a.onCaptureSequenceAborted(cameraCaptureSession, i);
        }

        /* renamed from: m */
        public final /* synthetic */ void m63711m(CameraCaptureSession cameraCaptureSession, int i, long j) {
            this.f10458a.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }

        /* renamed from: n */
        public final /* synthetic */ void m63710n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.f10458a.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j) {
            this.f10459b.execute(new Runnable() { // from class: Zi
                {
                    CameraCaptureSessionCompat.C2375b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraCaptureSessionCompat.C2375b.this.m63716h(cameraCaptureSession, captureRequest, surface, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f10459b.execute(new Runnable() { // from class: Vi
                {
                    CameraCaptureSessionCompat.C2375b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraCaptureSessionCompat.C2375b.this.m63715i(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f10459b.execute(new Runnable() { // from class: Yi
                {
                    CameraCaptureSessionCompat.C2375b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraCaptureSessionCompat.C2375b.this.m63714j(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f10459b.execute(new Runnable() { // from class: Wi
                {
                    CameraCaptureSessionCompat.C2375b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraCaptureSessionCompat.C2375b.this.m63713k(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i) {
            this.f10459b.execute(new Runnable() { // from class: aj
                {
                    CameraCaptureSessionCompat.C2375b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraCaptureSessionCompat.C2375b.this.m63712l(cameraCaptureSession, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i, final long j) {
            this.f10459b.execute(new Runnable() { // from class: Xi
                {
                    CameraCaptureSessionCompat.C2375b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraCaptureSessionCompat.C2375b.this.m63711m(cameraCaptureSession, i, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j, final long j2) {
            this.f10459b.execute(new Runnable() { // from class: Ui
                {
                    CameraCaptureSessionCompat.C2375b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraCaptureSessionCompat.C2375b.this.m63710n(cameraCaptureSession, captureRequest, j, j2);
                }
            });
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$c */
    /* loaded from: classes.dex */
    public static final class C2376c extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        public final CameraCaptureSession.StateCallback f10460a;

        /* renamed from: b */
        public final Executor f10461b;

        public C2376c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f10461b = executor;
            this.f10460a = stateCallback;
        }

        /* renamed from: h */
        public final /* synthetic */ void m63702h(CameraCaptureSession cameraCaptureSession) {
            this.f10460a.onActive(cameraCaptureSession);
        }

        /* renamed from: i */
        public final /* synthetic */ void m63701i(CameraCaptureSession cameraCaptureSession) {
            ApiCompat.Api26Impl.onCaptureQueueEmpty(this.f10460a, cameraCaptureSession);
        }

        /* renamed from: j */
        public final /* synthetic */ void m63700j(CameraCaptureSession cameraCaptureSession) {
            this.f10460a.onClosed(cameraCaptureSession);
        }

        /* renamed from: k */
        public final /* synthetic */ void m63699k(CameraCaptureSession cameraCaptureSession) {
            this.f10460a.onConfigureFailed(cameraCaptureSession);
        }

        /* renamed from: l */
        public final /* synthetic */ void m63698l(CameraCaptureSession cameraCaptureSession) {
            this.f10460a.onConfigured(cameraCaptureSession);
        }

        /* renamed from: m */
        public final /* synthetic */ void m63697m(CameraCaptureSession cameraCaptureSession) {
            this.f10460a.onReady(cameraCaptureSession);
        }

        /* renamed from: n */
        public final /* synthetic */ void m63696n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            ApiCompat.Api23Impl.onSurfacePrepared(this.f10460a, cameraCaptureSession, surface);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f10461b.execute(new Runnable() { // from class: bj
                {
                    CameraCaptureSessionCompat.C2376c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraCaptureSessionCompat.C2376c.this.m63702h(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f10461b.execute(new Runnable() { // from class: ej
                {
                    CameraCaptureSessionCompat.C2376c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraCaptureSessionCompat.C2376c.this.m63701i(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f10461b.execute(new Runnable() { // from class: cj
                {
                    CameraCaptureSessionCompat.C2376c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraCaptureSessionCompat.C2376c.this.m63700j(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f10461b.execute(new Runnable() { // from class: hj
                {
                    CameraCaptureSessionCompat.C2376c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraCaptureSessionCompat.C2376c.this.m63699k(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f10461b.execute(new Runnable() { // from class: fj
                {
                    CameraCaptureSessionCompat.C2376c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraCaptureSessionCompat.C2376c.this.m63698l(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f10461b.execute(new Runnable() { // from class: gj
                {
                    CameraCaptureSessionCompat.C2376c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraCaptureSessionCompat.C2376c.this.m63697m(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f10461b.execute(new Runnable() { // from class: dj
                {
                    CameraCaptureSessionCompat.C2376c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CameraCaptureSessionCompat.C2376c.this.m63696n(cameraCaptureSession, surface);
                }
            });
        }
    }

    public CameraCaptureSessionCompat(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f10457a = new C10486ij(cameraCaptureSession);
        } else {
            this.f10457a = C2381a.m63678a(cameraCaptureSession, handler);
        }
    }

    @NonNull
    public static CameraCaptureSessionCompat toCameraCaptureSessionCompat(@NonNull CameraCaptureSession cameraCaptureSession) {
        return toCameraCaptureSessionCompat(cameraCaptureSession, MainThreadAsyncHandler.getInstance());
    }

    public int captureBurstRequests(@NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f10457a.captureBurstRequests(list, executor, captureCallback);
    }

    public int captureSingleRequest(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f10457a.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    public int setRepeatingBurstRequests(@NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f10457a.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    public int setSingleRepeatingRequest(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f10457a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    @NonNull
    public CameraCaptureSession toCameraCaptureSession() {
        return this.f10457a.unwrap();
    }

    @NonNull
    public static CameraCaptureSessionCompat toCameraCaptureSessionCompat(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Handler handler) {
        return new CameraCaptureSessionCompat(cameraCaptureSession, handler);
    }
}
