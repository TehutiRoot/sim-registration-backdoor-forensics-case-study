package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.C2401f;
import androidx.camera.camera2.internal.C2414k;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface;
import androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: YQ1 */
/* loaded from: classes.dex */
public class YQ1 extends C2414k {

    /* renamed from: o */
    public final Object f7862o;

    /* renamed from: p */
    public List f7863p;

    /* renamed from: q */
    public ListenableFuture f7864q;

    /* renamed from: r */
    public final ForceCloseDeferrableSurface f7865r;

    /* renamed from: s */
    public final WaitForRepeatingRequestStart f7866s;

    /* renamed from: t */
    public final ForceCloseCaptureSession f7867t;

    public YQ1(Quirks quirks, Quirks quirks2, C2401f c2401f, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(c2401f, executor, scheduledExecutorService, handler);
        this.f7862o = new Object();
        this.f7865r = new ForceCloseDeferrableSurface(quirks, quirks2);
        this.f7866s = new WaitForRepeatingRequestStart(quirks);
        this.f7867t = new ForceCloseCaptureSession(quirks2);
    }

    /* renamed from: A */
    public static /* synthetic */ int m65466A(YQ1 yq1, CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return yq1.m65461F(captureRequest, captureCallback);
    }

    /* renamed from: x */
    public static /* synthetic */ void m65460x(YQ1 yq1, SynchronizedCaptureSession synchronizedCaptureSession) {
        yq1.m65463D(synchronizedCaptureSession);
    }

    /* renamed from: y */
    public static /* synthetic */ void m65459y(YQ1 yq1) {
        yq1.m65464C();
    }

    /* renamed from: z */
    public static /* synthetic */ ListenableFuture m65458z(YQ1 yq1, CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        return yq1.m65462E(cameraDevice, sessionConfigurationCompat, list);
    }

    /* renamed from: B */
    public void m65465B(String str) {
        Logger.m63178d("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    /* renamed from: C */
    public final /* synthetic */ void m65464C() {
        m65465B("Session call super.close()");
        super.close();
    }

    /* renamed from: D */
    public final /* synthetic */ void m65463D(SynchronizedCaptureSession synchronizedCaptureSession) {
        super.mo63314f(synchronizedCaptureSession);
    }

    /* renamed from: E */
    public final /* synthetic */ ListenableFuture m65462E(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        return super.mo63320a(cameraDevice, sessionConfigurationCompat, list);
    }

    /* renamed from: F */
    public final /* synthetic */ int m65461F(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.setSingleRepeatingRequest(captureRequest, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.C2414k, androidx.camera.camera2.internal.C2418l.InterfaceC2420b
    /* renamed from: a */
    public ListenableFuture mo63320a(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        ListenableFuture nonCancellationPropagating;
        synchronized (this.f7862o) {
            ListenableFuture<Void> openCaptureSession = this.f7866s.openCaptureSession(cameraDevice, sessionConfigurationCompat, list, this.f10780b.m63460e(), new WaitForRepeatingRequestStart.OpenCaptureSession() { // from class: XQ1
                @Override // androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart.OpenCaptureSession
                public final ListenableFuture run(CameraDevice cameraDevice2, SessionConfigurationCompat sessionConfigurationCompat2, List list2) {
                    return YQ1.m65458z(YQ1.this, cameraDevice2, sessionConfigurationCompat2, list2);
                }
            });
            this.f7864q = openCaptureSession;
            nonCancellationPropagating = Futures.nonCancellationPropagating(openCaptureSession);
        }
        return nonCancellationPropagating;
    }

    @Override // androidx.camera.camera2.internal.C2414k, androidx.camera.camera2.internal.C2418l.InterfaceC2420b
    /* renamed from: c */
    public ListenableFuture mo63318c(List list, long j) {
        ListenableFuture mo63318c;
        synchronized (this.f7862o) {
            this.f7863p = list;
            mo63318c = super.mo63318c(list, j);
        }
        return mo63318c;
    }

    @Override // androidx.camera.camera2.internal.C2414k, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
        m65465B("Session call close()");
        this.f7866s.onSessionEnd();
        this.f7866s.getStartStreamFuture().addListener(new Runnable() { // from class: VQ1
            @Override // java.lang.Runnable
            public final void run() {
                YQ1.m65459y(YQ1.this);
            }
        }, getExecutor());
    }

    @Override // androidx.camera.camera2.internal.C2414k, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: f */
    public void mo63314f(SynchronizedCaptureSession synchronizedCaptureSession) {
        m65465B("Session onConfigured()");
        this.f7867t.onSessionConfigured(synchronizedCaptureSession, this.f10780b.m63459f(), this.f10780b.m63461d(), new ForceCloseCaptureSession.OnConfigured() { // from class: WQ1
            @Override // androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession.OnConfigured
            public final void run(SynchronizedCaptureSession synchronizedCaptureSession2) {
                YQ1.m65460x(YQ1.this, synchronizedCaptureSession2);
            }
        });
    }

    @Override // androidx.camera.camera2.internal.C2414k, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public ListenableFuture getOpeningBlocker() {
        return this.f7866s.getStartStreamFuture();
    }

    @Override // androidx.camera.camera2.internal.C2414k, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.f7862o) {
            this.f7865r.onSessionEnd(this.f7863p);
        }
        m65465B("onClosed()");
        super.onClosed(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.C2414k, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f7866s.setSingleRepeatingRequest(captureRequest, captureCallback, new WaitForRepeatingRequestStart.SingleRepeatingRequest() { // from class: UQ1
            @Override // androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart.SingleRepeatingRequest
            public final int run(CaptureRequest captureRequest2, CameraCaptureSession.CaptureCallback captureCallback2) {
                return YQ1.m65466A(YQ1.this, captureRequest2, captureCallback2);
            }
        });
    }

    @Override // androidx.camera.camera2.internal.C2414k, androidx.camera.camera2.internal.C2418l.InterfaceC2420b
    public boolean stop() {
        boolean stop;
        synchronized (this.f7862o) {
            try {
                if (m63335q()) {
                    this.f7865r.onSessionEnd(this.f7863p);
                } else {
                    ListenableFuture listenableFuture = this.f7864q;
                    if (listenableFuture != null) {
                        listenableFuture.cancel(true);
                    }
                }
                stop = super.stop();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return stop;
    }
}