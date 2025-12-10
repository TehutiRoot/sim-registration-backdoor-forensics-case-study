package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.camera.camera2.internal.C2432k;
import androidx.camera.camera2.internal.C2436l;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.camera2.internal.k */
/* loaded from: classes.dex */
public class C2432k extends SynchronizedCaptureSession.StateCallback implements SynchronizedCaptureSession, C2436l.InterfaceC2438b {

    /* renamed from: b */
    public final C2419f f10692b;

    /* renamed from: c */
    public final Handler f10693c;

    /* renamed from: d */
    public final Executor f10694d;

    /* renamed from: e */
    public final ScheduledExecutorService f10695e;

    /* renamed from: f */
    public SynchronizedCaptureSession.StateCallback f10696f;

    /* renamed from: g */
    public CameraCaptureSessionCompat f10697g;

    /* renamed from: h */
    public ListenableFuture f10698h;

    /* renamed from: i */
    public CallbackToFutureAdapter.Completer f10699i;

    /* renamed from: j */
    public ListenableFuture f10700j;

    /* renamed from: a */
    public final Object f10691a = new Object();

    /* renamed from: k */
    public List f10701k = null;

    /* renamed from: l */
    public boolean f10702l = false;

    /* renamed from: m */
    public boolean f10703m = false;

    /* renamed from: n */
    public boolean f10704n = false;

    /* renamed from: androidx.camera.camera2.internal.k$a */
    /* loaded from: classes.dex */
    public class C2433a implements FutureCallback {
        public C2433a() {
            C2432k.this = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            C2432k.this.finishClose();
            C2432k c2432k = C2432k.this;
            c2432k.f10692b.m63504j(c2432k);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.k$b */
    /* loaded from: classes.dex */
    public class C2434b extends CameraCaptureSession.StateCallback {
        public C2434b() {
            C2432k.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            C2432k.this.m63386o(cameraCaptureSession);
            C2432k c2432k = C2432k.this;
            c2432k.mo63367d(c2432k);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            C2432k.this.m63386o(cameraCaptureSession);
            C2432k c2432k = C2432k.this;
            c2432k.mo63366e(c2432k);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            C2432k.this.m63386o(cameraCaptureSession);
            C2432k c2432k = C2432k.this;
            c2432k.onClosed(c2432k);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            CallbackToFutureAdapter.Completer completer;
            try {
                C2432k.this.m63386o(cameraCaptureSession);
                C2432k c2432k = C2432k.this;
                c2432k.onConfigureFailed(c2432k);
                synchronized (C2432k.this.f10691a) {
                    Preconditions.checkNotNull(C2432k.this.f10699i, "OpenCaptureSession completer should not null");
                    C2432k c2432k2 = C2432k.this;
                    completer = c2432k2.f10699i;
                    c2432k2.f10699i = null;
                }
                completer.setException(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th2) {
                synchronized (C2432k.this.f10691a) {
                    Preconditions.checkNotNull(C2432k.this.f10699i, "OpenCaptureSession completer should not null");
                    C2432k c2432k3 = C2432k.this;
                    CallbackToFutureAdapter.Completer completer2 = c2432k3.f10699i;
                    c2432k3.f10699i = null;
                    completer2.setException(new IllegalStateException("onConfigureFailed"));
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            CallbackToFutureAdapter.Completer completer;
            try {
                C2432k.this.m63386o(cameraCaptureSession);
                C2432k c2432k = C2432k.this;
                c2432k.mo52015f(c2432k);
                synchronized (C2432k.this.f10691a) {
                    Preconditions.checkNotNull(C2432k.this.f10699i, "OpenCaptureSession completer should not null");
                    C2432k c2432k2 = C2432k.this;
                    completer = c2432k2.f10699i;
                    c2432k2.f10699i = null;
                }
                completer.set(null);
            } catch (Throwable th2) {
                synchronized (C2432k.this.f10691a) {
                    Preconditions.checkNotNull(C2432k.this.f10699i, "OpenCaptureSession completer should not null");
                    C2432k c2432k3 = C2432k.this;
                    CallbackToFutureAdapter.Completer completer2 = c2432k3.f10699i;
                    c2432k3.f10699i = null;
                    completer2.set(null);
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            C2432k.this.m63386o(cameraCaptureSession);
            C2432k c2432k = C2432k.this;
            c2432k.mo63365g(c2432k);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C2432k.this.m63386o(cameraCaptureSession);
            C2432k c2432k = C2432k.this;
            c2432k.mo63363i(c2432k, surface);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.k$c */
    /* loaded from: classes.dex */
    public static class C2435c {
        @DoNotInline
        /* renamed from: a */
        public static Surface m63376a(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface;
            inputSurface = cameraCaptureSession.getInputSurface();
            return inputSurface;
        }
    }

    public C2432k(C2419f c2419f, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f10692b = c2419f;
        this.f10693c = handler;
        this.f10694d = executor;
        this.f10695e = scheduledExecutorService;
    }

    /* renamed from: j */
    public static /* synthetic */ void m63391j(C2432k c2432k, SynchronizedCaptureSession synchronizedCaptureSession) {
        c2432k.m63382s(synchronizedCaptureSession);
    }

    /* renamed from: k */
    public static /* synthetic */ Object m63390k(C2432k c2432k, List list, CameraDeviceCompat cameraDeviceCompat, SessionConfigurationCompat sessionConfigurationCompat, CallbackToFutureAdapter.Completer completer) {
        return c2432k.m63380u(list, cameraDeviceCompat, sessionConfigurationCompat, completer);
    }

    /* renamed from: l */
    public static /* synthetic */ void m63389l(C2432k c2432k, SynchronizedCaptureSession synchronizedCaptureSession) {
        c2432k.m63381t(synchronizedCaptureSession);
    }

    /* renamed from: m */
    public static /* synthetic */ ListenableFuture m63388m(C2432k c2432k, List list, List list2) {
        return c2432k.m63379v(list, list2);
    }

    /* renamed from: n */
    public static /* synthetic */ void m63387n(C2432k c2432k) {
        c2432k.m63383r();
    }

    @Override // androidx.camera.camera2.internal.C2436l.InterfaceC2438b
    /* renamed from: a */
    public ListenableFuture mo52017a(CameraDevice cameraDevice, final SessionConfigurationCompat sessionConfigurationCompat, final List list) {
        synchronized (this.f10691a) {
            try {
                if (this.f10703m) {
                    return Futures.immediateFailedFuture(new CancellationException("Opener is disabled"));
                }
                this.f10692b.m63502l(this);
                final CameraDeviceCompat cameraDeviceCompat = CameraDeviceCompat.toCameraDeviceCompat(cameraDevice, this.f10693c);
                ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: UP1
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return C2432k.m63390k(C2432k.this, list, cameraDeviceCompat, sessionConfigurationCompat, completer);
                    }
                });
                this.f10698h = future;
                Futures.addCallback(future, new C2433a(), CameraXExecutors.directExecutor());
                return Futures.nonCancellationPropagating(this.f10698h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void abortCaptures() {
        Preconditions.checkNotNull(this.f10697g, "Need to call openCaptureSession before using this API.");
        this.f10697g.toCameraCaptureSession().abortCaptures();
    }

    @Override // androidx.camera.camera2.internal.C2436l.InterfaceC2438b
    /* renamed from: b */
    public SessionConfigurationCompat mo63369b(int i, List list, SynchronizedCaptureSession.StateCallback stateCallback) {
        this.f10696f = stateCallback;
        return new SessionConfigurationCompat(i, list, getExecutor(), new C2434b());
    }

    @Override // androidx.camera.camera2.internal.C2436l.InterfaceC2438b
    /* renamed from: c */
    public ListenableFuture mo52016c(final List list, long j) {
        synchronized (this.f10691a) {
            try {
                if (this.f10703m) {
                    return Futures.immediateFailedFuture(new CancellationException("Opener is disabled"));
                }
                FutureChain transformAsync = FutureChain.from(DeferrableSurfaces.surfaceListWithTimeout(list, false, j, getExecutor(), this.f10695e)).transformAsync(new AsyncFunction() { // from class: VP1
                    {
                        C2432k.this = this;
                    }

                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        return C2432k.m63388m(C2432k.this, list, (List) obj);
                    }
                }, getExecutor());
                this.f10700j = transformAsync;
                return Futures.nonCancellationPropagating(transformAsync);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureBurstRequests(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(this.f10697g, "Need to call openCaptureSession before using this API.");
        return this.f10697g.captureBurstRequests(list, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureSingleRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(this.f10697g, "Need to call openCaptureSession before using this API.");
        return this.f10697g.captureSingleRequest(captureRequest, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
        Preconditions.checkNotNull(this.f10697g, "Need to call openCaptureSession before using this API.");
        this.f10692b.m63505i(this);
        this.f10697g.toCameraCaptureSession().close();
        getExecutor().execute(new Runnable() { // from class: RP1
            {
                C2432k.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2432k.m63387n(C2432k.this);
            }
        });
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: d */
    public void mo63367d(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.f10696f);
        this.f10696f.mo63367d(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: e */
    public void mo63366e(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.f10696f);
        this.f10696f.mo63366e(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: f */
    public void mo52015f(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.f10696f);
        this.f10692b.m63503k(this);
        this.f10696f.mo52015f(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void finishClose() {
        m63378w();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: g */
    public void mo63365g(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.f10696f);
        this.f10696f.mo63365g(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public CameraDevice getDevice() {
        Preconditions.checkNotNull(this.f10697g);
        return this.f10697g.toCameraCaptureSession().getDevice();
    }

    @Override // androidx.camera.camera2.internal.C2436l.InterfaceC2438b
    public Executor getExecutor() {
        return this.f10694d;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public Surface getInputSurface() {
        Preconditions.checkNotNull(this.f10697g);
        if (Build.VERSION.SDK_INT >= 23) {
            return C2435c.m63376a(this.f10697g.toCameraCaptureSession());
        }
        return null;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public ListenableFuture getOpeningBlocker() {
        return Futures.immediateFuture(null);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public SynchronizedCaptureSession.StateCallback getStateCallback() {
        return this;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: h */
    public void mo63364h(final SynchronizedCaptureSession synchronizedCaptureSession) {
        ListenableFuture listenableFuture;
        synchronized (this.f10691a) {
            try {
                if (!this.f10704n) {
                    this.f10704n = true;
                    Preconditions.checkNotNull(this.f10698h, "Need to call openCaptureSession before using this API.");
                    listenableFuture = this.f10698h;
                } else {
                    listenableFuture = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (listenableFuture != null) {
            listenableFuture.addListener(new Runnable() { // from class: TP1
                {
                    C2432k.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2432k.m63389l(C2432k.this, synchronizedCaptureSession);
                }
            }, CameraXExecutors.directExecutor());
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* renamed from: i */
    public void mo63363i(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        Objects.requireNonNull(this.f10696f);
        this.f10696f.mo63363i(synchronizedCaptureSession, surface);
    }

    /* renamed from: o */
    public void m63386o(CameraCaptureSession cameraCaptureSession) {
        if (this.f10697g == null) {
            this.f10697g = CameraCaptureSessionCompat.toCameraCaptureSessionCompat(cameraCaptureSession, this.f10693c);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(final SynchronizedCaptureSession synchronizedCaptureSession) {
        ListenableFuture listenableFuture;
        synchronized (this.f10691a) {
            try {
                if (!this.f10702l) {
                    this.f10702l = true;
                    Preconditions.checkNotNull(this.f10698h, "Need to call openCaptureSession before using this API.");
                    listenableFuture = this.f10698h;
                } else {
                    listenableFuture = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        finishClose();
        if (listenableFuture != null) {
            listenableFuture.addListener(new Runnable() { // from class: SP1
                {
                    C2432k.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2432k.m63391j(C2432k.this, synchronizedCaptureSession);
                }
            }, CameraXExecutors.directExecutor());
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.f10696f);
        finishClose();
        this.f10692b.m63504j(this);
        this.f10696f.onConfigureFailed(synchronizedCaptureSession);
    }

    /* renamed from: p */
    public void m63385p(List list) {
        synchronized (this.f10691a) {
            m63378w();
            DeferrableSurfaces.incrementAll(list);
            this.f10701k = list;
        }
    }

    /* renamed from: q */
    public boolean m63384q() {
        boolean z;
        synchronized (this.f10691a) {
            if (this.f10698h != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: r */
    public final /* synthetic */ void m63383r() {
        mo63364h(this);
    }

    /* renamed from: s */
    public final /* synthetic */ void m63382s(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.f10692b.m63506h(this);
        mo63364h(synchronizedCaptureSession);
        Objects.requireNonNull(this.f10696f);
        this.f10696f.onClosed(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setRepeatingBurstRequests(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(this.f10697g, "Need to call openCaptureSession before using this API.");
        return this.f10697g.setRepeatingBurstRequests(list, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(this.f10697g, "Need to call openCaptureSession before using this API.");
        return this.f10697g.setSingleRepeatingRequest(captureRequest, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.C2436l.InterfaceC2438b
    public boolean stop() {
        boolean z;
        ListenableFuture listenableFuture = null;
        try {
            synchronized (this.f10691a) {
                if (!this.f10703m) {
                    ListenableFuture listenableFuture2 = this.f10700j;
                    if (listenableFuture2 != null) {
                        listenableFuture = listenableFuture2;
                    }
                    this.f10703m = true;
                }
                z = !m63384q();
            }
            return z;
        } finally {
            if (listenableFuture != null) {
                listenableFuture.cancel(true);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void stopRepeating() {
        Preconditions.checkNotNull(this.f10697g, "Need to call openCaptureSession before using this API.");
        this.f10697g.toCameraCaptureSession().stopRepeating();
    }

    /* renamed from: t */
    public final /* synthetic */ void m63381t(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.f10696f);
        this.f10696f.mo63364h(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public CameraCaptureSessionCompat toCameraCaptureSessionCompat() {
        Preconditions.checkNotNull(this.f10697g);
        return this.f10697g;
    }

    /* renamed from: u */
    public final /* synthetic */ Object m63380u(List list, CameraDeviceCompat cameraDeviceCompat, SessionConfigurationCompat sessionConfigurationCompat, CallbackToFutureAdapter.Completer completer) {
        boolean z;
        String str;
        synchronized (this.f10691a) {
            m63385p(list);
            if (this.f10699i == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "The openCaptureSessionCompleter can only set once!");
            this.f10699i = completer;
            cameraDeviceCompat.createCaptureSession(sessionConfigurationCompat);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* renamed from: v */
    public final /* synthetic */ ListenableFuture m63379v(List list, List list2) {
        Logger.m63230d("SyncCaptureSessionBase", "[" + this + "] getSurface...done");
        if (list2.contains(null)) {
            return Futures.immediateFailedFuture(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) list.get(list2.indexOf(null))));
        }
        if (list2.isEmpty()) {
            return Futures.immediateFailedFuture(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return Futures.immediateFuture(list2);
    }

    /* renamed from: w */
    public void m63378w() {
        synchronized (this.f10691a) {
            try {
                List list = this.f10701k;
                if (list != null) {
                    DeferrableSurfaces.decrementAll(list);
                    this.f10701k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(this.f10697g, "Need to call openCaptureSession before using this API.");
        return this.f10697g.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(this.f10697g, "Need to call openCaptureSession before using this API.");
        return this.f10697g.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setRepeatingBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(this.f10697g, "Need to call openCaptureSession before using this API.");
        return this.f10697g.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        Preconditions.checkNotNull(this.f10697g, "Need to call openCaptureSession before using this API.");
        return this.f10697g.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
