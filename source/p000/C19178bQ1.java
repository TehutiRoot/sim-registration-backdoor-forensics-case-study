package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.C2419f;
import androidx.camera.camera2.internal.C2432k;
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

/* renamed from: bQ1 */
/* loaded from: classes.dex */
public class C19178bQ1 extends C2432k {

    /* renamed from: o */
    public final Object f39030o;

    /* renamed from: p */
    public List f39031p;

    /* renamed from: q */
    public ListenableFuture f39032q;

    /* renamed from: r */
    public final ForceCloseDeferrableSurface f39033r;

    /* renamed from: s */
    public final WaitForRepeatingRequestStart f39034s;

    /* renamed from: t */
    public final ForceCloseCaptureSession f39035t;

    public C19178bQ1(Quirks quirks, Quirks quirks2, C2419f c2419f, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(c2419f, executor, scheduledExecutorService, handler);
        this.f39030o = new Object();
        this.f39033r = new ForceCloseDeferrableSurface(quirks, quirks2);
        this.f39034s = new WaitForRepeatingRequestStart(quirks);
        this.f39035t = new ForceCloseCaptureSession(quirks2);
    }

    /* renamed from: A */
    public static /* synthetic */ int m52023A(C19178bQ1 c19178bQ1, CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return c19178bQ1.m52018F(captureRequest, captureCallback);
    }

    /* renamed from: x */
    public static /* synthetic */ void m52014x(C19178bQ1 c19178bQ1, SynchronizedCaptureSession synchronizedCaptureSession) {
        c19178bQ1.m52020D(synchronizedCaptureSession);
    }

    /* renamed from: y */
    public static /* synthetic */ void m52013y(C19178bQ1 c19178bQ1) {
        c19178bQ1.m52021C();
    }

    /* renamed from: z */
    public static /* synthetic */ ListenableFuture m52012z(C19178bQ1 c19178bQ1, CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        return c19178bQ1.m52019E(cameraDevice, sessionConfigurationCompat, list);
    }

    /* renamed from: B */
    public void m52022B(String str) {
        Logger.m63230d("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    /* renamed from: C */
    public final /* synthetic */ void m52021C() {
        m52022B("Session call super.close()");
        super.close();
    }

    /* renamed from: D */
    public final /* synthetic */ void m52020D(SynchronizedCaptureSession synchronizedCaptureSession) {
        super.mo52015f(synchronizedCaptureSession);
    }

    /* renamed from: E */
    public final /* synthetic */ ListenableFuture m52019E(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        return super.mo52017a(cameraDevice, sessionConfigurationCompat, list);
    }

    /* renamed from: F */
    public final /* synthetic */ int m52018F(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.setSingleRepeatingRequest(captureRequest, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.C2432k, androidx.camera.camera2.internal.C2436l.InterfaceC2438b
    /* renamed from: a */
    public ListenableFuture mo52017a(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        ListenableFuture nonCancellationPropagating;
        synchronized (this.f39030o) {
            ListenableFuture<Void> openCaptureSession = this.f39034s.openCaptureSession(cameraDevice, sessionConfigurationCompat, list, this.f10692b.m63509e(), new WaitForRepeatingRequestStart.OpenCaptureSession() { // from class: aQ1
                @Override // androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart.OpenCaptureSession
                public final ListenableFuture run(CameraDevice cameraDevice2, SessionConfigurationCompat sessionConfigurationCompat2, List list2) {
                    return C19178bQ1.m52012z(C19178bQ1.this, cameraDevice2, sessionConfigurationCompat2, list2);
                }
            });
            this.f39032q = openCaptureSession;
            nonCancellationPropagating = Futures.nonCancellationPropagating(openCaptureSession);
        }
        return nonCancellationPropagating;
    }

    @Override // androidx.camera.camera2.internal.C2432k, androidx.camera.camera2.internal.C2436l.InterfaceC2438b
    /* renamed from: c */
    public ListenableFuture mo52016c(List list, long j) {
        ListenableFuture mo52016c;
        synchronized (this.f39030o) {
            this.f39031p = list;
            mo52016c = super.mo52016c(list, j);
        }
        return mo52016c;
    }

    @Override // androidx.camera.camera2.internal.C2432k, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
        m52022B("Session call close()");
        this.f39034s.onSessionEnd();
        this.f39034s.getStartStreamFuture().addListener(new Runnable() { // from class: YP1
            {
                C19178bQ1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19178bQ1.m52013y(C19178bQ1.this);
            }
        }, getExecutor());
    }

    @Override // androidx.camera.camera2.internal.C2432k, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: f */
    public void mo52015f(SynchronizedCaptureSession synchronizedCaptureSession) {
        m52022B("Session onConfigured()");
        this.f39035t.onSessionConfigured(synchronizedCaptureSession, this.f10692b.m63508f(), this.f10692b.m63510d(), new ForceCloseCaptureSession.OnConfigured() { // from class: ZP1
            @Override // androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession.OnConfigured
            public final void run(SynchronizedCaptureSession synchronizedCaptureSession2) {
                C19178bQ1.m52014x(C19178bQ1.this, synchronizedCaptureSession2);
            }
        });
    }

    @Override // androidx.camera.camera2.internal.C2432k, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public ListenableFuture getOpeningBlocker() {
        return this.f39034s.getStartStreamFuture();
    }

    @Override // androidx.camera.camera2.internal.C2432k, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.f39030o) {
            this.f39033r.onSessionEnd(this.f39031p);
        }
        m52022B("onClosed()");
        super.onClosed(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.C2432k, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f39034s.setSingleRepeatingRequest(captureRequest, captureCallback, new WaitForRepeatingRequestStart.SingleRepeatingRequest() { // from class: XP1
            @Override // androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart.SingleRepeatingRequest
            public final int run(CaptureRequest captureRequest2, CameraCaptureSession.CaptureCallback captureCallback2) {
                return C19178bQ1.m52023A(C19178bQ1.this, captureRequest2, captureCallback2);
            }
        });
    }

    @Override // androidx.camera.camera2.internal.C2432k, androidx.camera.camera2.internal.C2436l.InterfaceC2438b
    public boolean stop() {
        boolean stop;
        synchronized (this.f39030o) {
            try {
                if (m63384q()) {
                    this.f39033r.onSessionEnd(this.f39031p);
                } else {
                    ListenableFuture listenableFuture = this.f39032q;
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
