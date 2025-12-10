package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.Camera2CaptureCallbacks;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class WaitForRepeatingRequestStart {

    /* renamed from: a */
    public final boolean f10567a;

    /* renamed from: c */
    public final ListenableFuture f10569c;

    /* renamed from: d */
    public CallbackToFutureAdapter.Completer f10570d;

    /* renamed from: e */
    public boolean f10571e;

    /* renamed from: b */
    public final Object f10568b = new Object();

    /* renamed from: f */
    public final CameraCaptureSession.CaptureCallback f10572f = new C2406a();

    @FunctionalInterface
    /* loaded from: classes.dex */
    public interface OpenCaptureSession {
        @NonNull
        ListenableFuture<Void> run(@NonNull CameraDevice cameraDevice, @NonNull SessionConfigurationCompat sessionConfigurationCompat, @NonNull List<DeferrableSurface> list);
    }

    @FunctionalInterface
    /* loaded from: classes.dex */
    public interface SingleRepeatingRequest {
        int run(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    /* renamed from: androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart$a */
    /* loaded from: classes.dex */
    public class C2406a extends CameraCaptureSession.CaptureCallback {
        public C2406a() {
            WaitForRepeatingRequestStart.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            CallbackToFutureAdapter.Completer completer = WaitForRepeatingRequestStart.this.f10570d;
            if (completer != null) {
                completer.setCancelled();
                WaitForRepeatingRequestStart.this.f10570d = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            CallbackToFutureAdapter.Completer completer = WaitForRepeatingRequestStart.this.f10570d;
            if (completer != null) {
                completer.set(null);
                WaitForRepeatingRequestStart.this.f10570d = null;
            }
        }
    }

    public WaitForRepeatingRequestStart(@NonNull Quirks quirks) {
        this.f10567a = quirks.contains(CaptureSessionStuckQuirk.class);
        if (shouldWaitRepeatingSubmit()) {
            this.f10569c = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: H32
                {
                    WaitForRepeatingRequestStart.this = this;
                }

                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return WaitForRepeatingRequestStart.m63566b(WaitForRepeatingRequestStart.this, completer);
                }
            });
        } else {
            this.f10569c = Futures.immediateFuture(null);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ ListenableFuture m63567a(OpenCaptureSession openCaptureSession, CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list, List list2) {
        return openCaptureSession.run(cameraDevice, sessionConfigurationCompat, list);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m63566b(WaitForRepeatingRequestStart waitForRepeatingRequestStart, CallbackToFutureAdapter.Completer completer) {
        return waitForRepeatingRequestStart.m63565c(completer);
    }

    /* renamed from: c */
    public final /* synthetic */ Object m63565c(CallbackToFutureAdapter.Completer completer) {
        this.f10570d = completer;
        return "WaitForRepeatingRequestStart[" + this + "]";
    }

    @NonNull
    public ListenableFuture<Void> getStartStreamFuture() {
        return Futures.nonCancellationPropagating(this.f10569c);
    }

    public void onSessionEnd() {
        synchronized (this.f10568b) {
            try {
                if (shouldWaitRepeatingSubmit() && !this.f10571e) {
                    this.f10569c.cancel(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public ListenableFuture<Void> openCaptureSession(@NonNull final CameraDevice cameraDevice, @NonNull final SessionConfigurationCompat sessionConfigurationCompat, @NonNull final List<DeferrableSurface> list, @NonNull List<SynchronizedCaptureSession> list2, @NonNull final OpenCaptureSession openCaptureSession) {
        ArrayList arrayList = new ArrayList();
        for (SynchronizedCaptureSession synchronizedCaptureSession : list2) {
            arrayList.add(synchronizedCaptureSession.getOpeningBlocker());
        }
        return FutureChain.from(Futures.successfulAsList(arrayList)).transformAsync(new AsyncFunction() { // from class: I32
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return WaitForRepeatingRequestStart.m63567a(WaitForRepeatingRequestStart.OpenCaptureSession.this, cameraDevice, sessionConfigurationCompat, list, (List) obj);
            }
        }, CameraXExecutors.directExecutor());
    }

    public int setSingleRepeatingRequest(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback, @NonNull SingleRepeatingRequest singleRepeatingRequest) throws CameraAccessException {
        int run;
        synchronized (this.f10568b) {
            try {
                if (shouldWaitRepeatingSubmit()) {
                    captureCallback = Camera2CaptureCallbacks.createComboCallback(this.f10572f, captureCallback);
                    this.f10571e = true;
                }
                run = singleRepeatingRequest.run(captureRequest, captureCallback);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return run;
    }

    public boolean shouldWaitRepeatingSubmit() {
        return this.f10567a;
    }
}
