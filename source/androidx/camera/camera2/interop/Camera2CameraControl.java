package androidx.camera.camera2.interop;

import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

@RequiresApi(21)
@ExperimentalCamera2Interop
/* loaded from: classes.dex */
public final class Camera2CameraControl {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String TAG_KEY = "Camera2CameraControl";

    /* renamed from: c */
    public final Camera2CameraControlImpl f10734c;

    /* renamed from: d */
    public final Executor f10735d;

    /* renamed from: g */
    public CallbackToFutureAdapter.Completer f10738g;

    /* renamed from: a */
    public boolean f10732a = false;

    /* renamed from: b */
    public boolean f10733b = false;

    /* renamed from: e */
    public final Object f10736e = new Object();

    /* renamed from: f */
    public Camera2ImplConfig.Builder f10737f = new Camera2ImplConfig.Builder();

    /* renamed from: h */
    public final Camera2CameraControlImpl.CaptureResultListener f10739h = new Camera2CameraControlImpl.CaptureResultListener() { // from class: Bh
        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            boolean m63311o;
            m63311o = Camera2CameraControl.this.m63311o(totalCaptureResult);
            return m63311o;
        }
    };

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Camera2CameraControl(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, @NonNull Executor executor) {
        this.f10734c = camera2CameraControlImpl;
        this.f10735d = executor;
    }

    /* renamed from: a */
    public static /* synthetic */ void m63325a(Camera2CameraControl camera2CameraControl, boolean z) {
        camera2CameraControl.m63310p(z);
    }

    /* renamed from: b */
    public static /* synthetic */ void m63324b(Camera2CameraControl camera2CameraControl, CallbackToFutureAdapter.Completer completer) {
        camera2CameraControl.m63313m(completer);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m63323c(Camera2CameraControl camera2CameraControl, CallbackToFutureAdapter.Completer completer) {
        return camera2CameraControl.m63314l(completer);
    }

    /* renamed from: d */
    public static /* synthetic */ void m63322d(Camera2CameraControl camera2CameraControl, CallbackToFutureAdapter.Completer completer) {
        camera2CameraControl.m63315k(completer);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m63320f(Camera2CameraControl camera2CameraControl, CallbackToFutureAdapter.Completer completer) {
        return camera2CameraControl.m63308r(completer);
    }

    @NonNull
    public static Camera2CameraControl from(@NonNull CameraControl cameraControl) {
        CameraControlInternal implementation = ((CameraControlInternal) cameraControl).getImplementation();
        Preconditions.checkArgument(implementation instanceof Camera2CameraControlImpl, "CameraControl doesn't contain Camera2 implementation.");
        return ((Camera2CameraControlImpl) implementation).getCamera2CameraControl();
    }

    /* renamed from: g */
    public static /* synthetic */ void m63319g(Camera2CameraControl camera2CameraControl, CallbackToFutureAdapter.Completer completer) {
        camera2CameraControl.m63309q(completer);
    }

    /* renamed from: h */
    public static /* synthetic */ Object m63318h(Camera2CameraControl camera2CameraControl, CallbackToFutureAdapter.Completer completer) {
        return camera2CameraControl.m63312n(completer);
    }

    @NonNull
    public ListenableFuture<Void> addCaptureRequestOptions(@NonNull CaptureRequestOptions captureRequestOptions) {
        m63317i(captureRequestOptions);
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: yh
            {
                Camera2CameraControl.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControl.m63323c(Camera2CameraControl.this, completer);
            }
        }));
    }

    @NonNull
    public ListenableFuture<Void> clearCaptureRequestOptions() {
        m63316j();
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Ch
            {
                Camera2CameraControl.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControl.m63318h(Camera2CameraControl.this, completer);
            }
        }));
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Camera2ImplConfig getCamera2ImplConfig() {
        Camera2ImplConfig build;
        synchronized (this.f10736e) {
            try {
                if (this.f10738g != null) {
                    this.f10737f.getMutableConfig().insertOption(Camera2ImplConfig.CAPTURE_REQUEST_TAG_OPTION, Integer.valueOf(this.f10738g.hashCode()));
                }
                build = this.f10737f.build();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return build;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Camera2CameraControlImpl.CaptureResultListener getCaptureRequestListener() {
        return this.f10739h;
    }

    @NonNull
    public CaptureRequestOptions getCaptureRequestOptions() {
        CaptureRequestOptions build;
        synchronized (this.f10736e) {
            build = CaptureRequestOptions.Builder.from(this.f10737f.build()).build();
        }
        return build;
    }

    /* renamed from: i */
    public final void m63317i(CaptureRequestOptions captureRequestOptions) {
        synchronized (this.f10736e) {
            try {
                for (Config.Option option : captureRequestOptions.listOptions()) {
                    this.f10737f.getMutableConfig().insertOption(option, captureRequestOptions.retrieveOption(option));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public final void m63316j() {
        synchronized (this.f10736e) {
            this.f10737f = new Camera2ImplConfig.Builder();
        }
    }

    /* renamed from: l */
    public final /* synthetic */ Object m63314l(final CallbackToFutureAdapter.Completer completer) {
        this.f10735d.execute(new Runnable() { // from class: Dh
            {
                Camera2CameraControl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControl.m63322d(Camera2CameraControl.this, completer);
            }
        });
        return "addCaptureRequestOptions";
    }

    /* renamed from: n */
    public final /* synthetic */ Object m63312n(final CallbackToFutureAdapter.Completer completer) {
        this.f10735d.execute(new Runnable() { // from class: Fh
            {
                Camera2CameraControl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControl.m63324b(Camera2CameraControl.this, completer);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ boolean m63311o(android.hardware.camera2.TotalCaptureResult r3) {
        /*
            r2 = this;
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r0 = r2.f10738g
            r1 = 0
            if (r0 == 0) goto L32
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            java.lang.Object r3 = r3.getTag()
            boolean r0 = r3 instanceof androidx.camera.core.impl.TagBundle
            if (r0 == 0) goto L32
            androidx.camera.core.impl.TagBundle r3 = (androidx.camera.core.impl.TagBundle) r3
            java.lang.String r0 = "Camera2CameraControl"
            java.lang.Object r3 = r3.getTag(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L32
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r0 = r2.f10738g
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r3 = r2.f10738g
            r2.f10738g = r1
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 == 0) goto L38
            r3.set(r1)
        L38:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.interop.Camera2CameraControl.m63311o(android.hardware.camera2.TotalCaptureResult):boolean");
    }

    /* renamed from: r */
    public final /* synthetic */ Object m63308r(final CallbackToFutureAdapter.Completer completer) {
        this.f10735d.execute(new Runnable() { // from class: Eh
            {
                Camera2CameraControl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControl.m63319g(Camera2CameraControl.this, completer);
            }
        });
        return "setCaptureRequestOptions";
    }

    /* renamed from: s */
    public final void m63310p(boolean z) {
        if (this.f10732a == z) {
            return;
        }
        this.f10732a = z;
        if (z) {
            if (this.f10733b) {
                m63305u();
                return;
            }
            return;
        }
        CallbackToFutureAdapter.Completer completer = this.f10738g;
        if (completer != null) {
            completer.setException(new CameraControl.OperationCanceledException("The camera control has became inactive."));
            this.f10738g = null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setActive(final boolean z) {
        this.f10735d.execute(new Runnable() { // from class: zh
            {
                Camera2CameraControl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControl.m63325a(Camera2CameraControl.this, z);
            }
        });
    }

    @NonNull
    public ListenableFuture<Void> setCaptureRequestOptions(@NonNull CaptureRequestOptions captureRequestOptions) {
        m63316j();
        m63317i(captureRequestOptions);
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Ah
            {
                Camera2CameraControl.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControl.m63320f(Camera2CameraControl.this, completer);
            }
        }));
    }

    /* renamed from: t */
    public final void m63309q(CallbackToFutureAdapter.Completer completer) {
        this.f10733b = true;
        CallbackToFutureAdapter.Completer completer2 = this.f10738g;
        if (completer2 == null) {
            completer2 = null;
        }
        this.f10738g = completer;
        if (this.f10732a) {
            m63305u();
        }
        if (completer2 != null) {
            completer2.setException(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        }
    }

    /* renamed from: u */
    public final void m63305u() {
        this.f10734c.updateSessionConfig();
        this.f10733b = false;
    }
}
