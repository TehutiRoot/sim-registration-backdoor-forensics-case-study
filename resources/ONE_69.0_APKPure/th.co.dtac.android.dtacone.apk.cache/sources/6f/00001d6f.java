package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.AeFpsRange;
import androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;

@OptIn(markerClass = {ExperimentalCamera2Interop.class})
@RequiresApi(21)
/* loaded from: classes.dex */
public class Camera2CameraControlImpl implements CameraControlInternal {

    /* renamed from: a */
    public final C2321b f10349a;

    /* renamed from: b */
    public final Executor f10350b;

    /* renamed from: c */
    public final Object f10351c = new Object();

    /* renamed from: d */
    public final CameraCharacteristicsCompat f10352d;

    /* renamed from: e */
    public final CameraControlInternal.ControlUpdateCallback f10353e;

    /* renamed from: f */
    public final SessionConfig.Builder f10354f;

    /* renamed from: g */
    public final C2404h f10355g;

    /* renamed from: h */
    public final C2424o f10356h;

    /* renamed from: i */
    public final C2423n f10357i;

    /* renamed from: j */
    public final ExposureControl f10358j;

    /* renamed from: k */
    public L72 f10359k;

    /* renamed from: l */
    public final Camera2CameraControl f10360l;

    /* renamed from: m */
    public final C2389d f10361m;

    /* renamed from: n */
    public int f10362n;

    /* renamed from: o */
    public volatile boolean f10363o;

    /* renamed from: p */
    public volatile int f10364p;

    /* renamed from: q */
    public final AeFpsRange f10365q;

    /* renamed from: r */
    public final AutoFlashAEModeDisabler f10366r;

    /* renamed from: s */
    public final AtomicLong f10367s;

    /* renamed from: t */
    public volatile ListenableFuture f10368t;

    /* renamed from: u */
    public int f10369u;

    /* renamed from: v */
    public long f10370v;

    /* renamed from: w */
    public final C2320a f10371w;

    /* loaded from: classes.dex */
    public interface CaptureResultListener {
        boolean onCaptureResult(@NonNull TotalCaptureResult totalCaptureResult);
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraControlImpl$a */
    /* loaded from: classes.dex */
    public static final class C2320a extends CameraCaptureCallback {

        /* renamed from: a */
        public Set f10372a = new HashSet();

        /* renamed from: b */
        public Map f10373b = new ArrayMap();

        /* renamed from: a */
        public static /* synthetic */ void m63880a(CameraCaptureCallback cameraCaptureCallback) {
            cameraCaptureCallback.onCaptureCancelled();
        }

        /* renamed from: b */
        public static /* synthetic */ void m63879b(CameraCaptureCallback cameraCaptureCallback, CameraCaptureFailure cameraCaptureFailure) {
            cameraCaptureCallback.onCaptureFailed(cameraCaptureFailure);
        }

        /* renamed from: c */
        public static /* synthetic */ void m63878c(CameraCaptureCallback cameraCaptureCallback, CameraCaptureResult cameraCaptureResult) {
            cameraCaptureCallback.onCaptureCompleted(cameraCaptureResult);
        }

        /* renamed from: d */
        public void m63877d(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
            this.f10372a.add(cameraCaptureCallback);
            this.f10373b.put(cameraCaptureCallback, executor);
        }

        /* renamed from: h */
        public void m63873h(CameraCaptureCallback cameraCaptureCallback) {
            this.f10372a.remove(cameraCaptureCallback);
            this.f10373b.remove(cameraCaptureCallback);
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled() {
            for (final CameraCaptureCallback cameraCaptureCallback : this.f10372a) {
                try {
                    ((Executor) this.f10373b.get(cameraCaptureCallback)).execute(new Runnable() { // from class: Th
                        @Override // java.lang.Runnable
                        public final void run() {
                            Camera2CameraControlImpl.C2320a.m63880a(CameraCaptureCallback.this);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Logger.m63175e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(final CameraCaptureResult cameraCaptureResult) {
            for (final CameraCaptureCallback cameraCaptureCallback : this.f10372a) {
                try {
                    ((Executor) this.f10373b.get(cameraCaptureCallback)).execute(new Runnable() { // from class: Rh
                        @Override // java.lang.Runnable
                        public final void run() {
                            Camera2CameraControlImpl.C2320a.m63878c(CameraCaptureCallback.this, cameraCaptureResult);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Logger.m63175e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(final CameraCaptureFailure cameraCaptureFailure) {
            for (final CameraCaptureCallback cameraCaptureCallback : this.f10372a) {
                try {
                    ((Executor) this.f10373b.get(cameraCaptureCallback)).execute(new Runnable() { // from class: Sh
                        @Override // java.lang.Runnable
                        public final void run() {
                            Camera2CameraControlImpl.C2320a.m63879b(CameraCaptureCallback.this, cameraCaptureFailure);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Logger.m63175e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraControlImpl$b */
    /* loaded from: classes.dex */
    public static final class C2321b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final Set f10374a = new HashSet();

        /* renamed from: b */
        public final Executor f10375b;

        public C2321b(Executor executor) {
            this.f10375b = executor;
        }

        /* renamed from: a */
        public static /* synthetic */ void m63872a(C2321b c2321b, TotalCaptureResult totalCaptureResult) {
            c2321b.m63870c(totalCaptureResult);
        }

        /* renamed from: b */
        public void m63871b(CaptureResultListener captureResultListener) {
            this.f10374a.add(captureResultListener);
        }

        /* renamed from: c */
        public final /* synthetic */ void m63870c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (CaptureResultListener captureResultListener : this.f10374a) {
                if (captureResultListener.onCaptureResult(totalCaptureResult)) {
                    hashSet.add(captureResultListener);
                }
            }
            if (!hashSet.isEmpty()) {
                this.f10374a.removeAll(hashSet);
            }
        }

        /* renamed from: d */
        public void m63869d(CaptureResultListener captureResultListener) {
            this.f10374a.remove(captureResultListener);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f10375b.execute(new Runnable() { // from class: Uh
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraControlImpl.C2321b.m63872a(Camera2CameraControlImpl.C2321b.this, totalCaptureResult);
                }
            });
        }
    }

    public Camera2CameraControlImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.ControlUpdateCallback controlUpdateCallback, Quirks quirks) {
        SessionConfig.Builder builder = new SessionConfig.Builder();
        this.f10354f = builder;
        this.f10362n = 0;
        this.f10363o = false;
        this.f10364p = 2;
        this.f10367s = new AtomicLong(0L);
        this.f10368t = Futures.immediateFuture(null);
        this.f10369u = 1;
        this.f10370v = 0L;
        C2320a c2320a = new C2320a();
        this.f10371w = c2320a;
        this.f10352d = cameraCharacteristicsCompat;
        this.f10353e = controlUpdateCallback;
        this.f10350b = executor;
        C2321b c2321b = new C2321b(executor);
        this.f10349a = c2321b;
        builder.setTemplateType(this.f10369u);
        builder.addRepeatingCameraCaptureCallback(C0054Al.m69195a(c2321b));
        builder.addRepeatingCameraCaptureCallback(c2320a);
        this.f10358j = new ExposureControl(this, cameraCharacteristicsCompat, executor);
        this.f10355g = new C2404h(this, scheduledExecutorService, executor, quirks);
        this.f10356h = new C2424o(this, cameraCharacteristicsCompat, executor);
        this.f10357i = new C2423n(this, cameraCharacteristicsCompat, executor);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f10359k = new V72(cameraCharacteristicsCompat);
        } else {
            this.f10359k = new ZslControlNoOpImpl();
        }
        this.f10365q = new AeFpsRange(quirks);
        this.f10366r = new AutoFlashAEModeDisabler(quirks);
        this.f10360l = new Camera2CameraControl(this, executor);
        this.f10361m = new C2389d(this, cameraCharacteristicsCompat, quirks, executor);
        executor.execute(new Runnable() { // from class: Oh
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.m63905b(Camera2CameraControlImpl.this);
            }
        });
    }

    /* renamed from: A */
    public static boolean m63927A(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        if (!(tag instanceof TagBundle) || (l = (Long) ((TagBundle) tag).getTag("CameraControlSessionUpdateId")) == null || l.longValue() < j) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public static /* synthetic */ void m63925C() {
    }

    /* renamed from: E */
    public static /* synthetic */ void m63923E() {
    }

    /* renamed from: K */
    public static /* synthetic */ boolean m63917K(long j, CallbackToFutureAdapter.Completer completer, TotalCaptureResult totalCaptureResult) {
        if (m63927A(totalCaptureResult, j)) {
            completer.set(null);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m63906a(Camera2CameraControlImpl camera2CameraControlImpl, long j, CallbackToFutureAdapter.Completer completer) {
        return camera2CameraControlImpl.m63916L(j, completer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m63905b(Camera2CameraControlImpl camera2CameraControlImpl) {
        camera2CameraControlImpl.m63922F();
    }

    /* renamed from: c */
    public static /* synthetic */ void m63904c(Camera2CameraControlImpl camera2CameraControlImpl, CallbackToFutureAdapter.Completer completer) {
        camera2CameraControlImpl.m63919I(completer);
    }

    /* renamed from: d */
    public static /* synthetic */ void m63903d() {
        m63925C();
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m63902e(long j, CallbackToFutureAdapter.Completer completer, TotalCaptureResult totalCaptureResult) {
        return m63917K(j, completer, totalCaptureResult);
    }

    /* renamed from: f */
    public static /* synthetic */ void m63901f(Camera2CameraControlImpl camera2CameraControlImpl, CameraCaptureCallback cameraCaptureCallback) {
        camera2CameraControlImpl.m63921G(cameraCaptureCallback);
    }

    /* renamed from: g */
    public static /* synthetic */ void m63900g() {
        m63923E();
    }

    /* renamed from: h */
    public static /* synthetic */ Object m63899h(Camera2CameraControlImpl camera2CameraControlImpl, CallbackToFutureAdapter.Completer completer) {
        return camera2CameraControlImpl.m63918J(completer);
    }

    /* renamed from: i */
    public static /* synthetic */ void m63898i(Camera2CameraControlImpl camera2CameraControlImpl, Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        camera2CameraControlImpl.m63924D(executor, cameraCaptureCallback);
    }

    /* renamed from: j */
    public static /* synthetic */ ListenableFuture m63897j(Camera2CameraControlImpl camera2CameraControlImpl, List list, int i, int i2, int i3, Void r5) {
        return camera2CameraControlImpl.m63920H(list, i, i2, i3, r5);
    }

    /* renamed from: B */
    public boolean m63926B() {
        return this.f10363o;
    }

    /* renamed from: D */
    public final /* synthetic */ void m63924D(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        this.f10371w.m63877d(executor, cameraCaptureCallback);
    }

    /* renamed from: F */
    public final /* synthetic */ void m63922F() {
        m63896k(this.f10360l.getCaptureRequestListener());
    }

    /* renamed from: G */
    public final /* synthetic */ void m63921G(CameraCaptureCallback cameraCaptureCallback) {
        this.f10371w.m63873h(cameraCaptureCallback);
    }

    /* renamed from: H */
    public final /* synthetic */ ListenableFuture m63920H(List list, int i, int i2, int i3, Void r5) {
        return this.f10361m.m63506e(list, i, i2, i3);
    }

    /* renamed from: I */
    public final /* synthetic */ void m63919I(CallbackToFutureAdapter.Completer completer) {
        Futures.propagate(m63907U(m63908T()), completer);
    }

    /* renamed from: J */
    public final /* synthetic */ Object m63918J(final CallbackToFutureAdapter.Completer completer) {
        this.f10350b.execute(new Runnable() { // from class: Ph
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.m63904c(Camera2CameraControlImpl.this, completer);
            }
        });
        return "updateSessionConfigAsync";
    }

    /* renamed from: L */
    public final /* synthetic */ Object m63916L(final long j, final CallbackToFutureAdapter.Completer completer) {
        m63896k(new CaptureResultListener() { // from class: Hh
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return Camera2CameraControlImpl.m63902e(j, completer, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j;
    }

    /* renamed from: M */
    public void m63915M(CaptureResultListener captureResultListener) {
        this.f10349a.m63869d(captureResultListener);
    }

    /* renamed from: N */
    public void m63914N(final CameraCaptureCallback cameraCaptureCallback) {
        this.f10350b.execute(new Runnable() { // from class: Kh
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.m63901f(Camera2CameraControlImpl.this, cameraCaptureCallback);
            }
        });
    }

    /* renamed from: O */
    public void m63913O() {
        m63911Q(1);
    }

    /* renamed from: P */
    public void m63912P(boolean z) {
        this.f10355g.m63431P(z);
        this.f10356h.m63284p(z);
        this.f10357i.m63301j(z);
        this.f10358j.m63721j(z);
        this.f10360l.setActive(z);
    }

    /* renamed from: Q */
    public void m63911Q(int i) {
        this.f10369u = i;
        this.f10355g.m63429R(i);
        this.f10361m.m63507d(this.f10369u);
    }

    /* renamed from: R */
    public void m63910R(List list) {
        this.f10353e.onCameraControlCaptureRequests(list);
    }

    /* renamed from: S */
    public ListenableFuture m63909S() {
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Lh
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControlImpl.m63899h(Camera2CameraControlImpl.this, completer);
            }
        }));
    }

    /* renamed from: T */
    public long m63908T() {
        this.f10370v = this.f10367s.getAndIncrement();
        this.f10353e.onCameraControlUpdateSessionConfig();
        return this.f10370v;
    }

    /* renamed from: U */
    public final ListenableFuture m63907U(final long j) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Qh
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControlImpl.m63906a(Camera2CameraControlImpl.this, j, completer);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(@NonNull Config config) {
        this.f10360l.addCaptureRequestOptions(CaptureRequestOptions.Builder.from(config).build()).addListener(new Runnable() { // from class: Jh
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.m63903d();
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(@NonNull SessionConfig.Builder builder) {
        this.f10359k.addZslConfig(builder);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> cancelFocusAndMetering() {
        if (!m63882y()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.f10355g.m63410m());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
        this.f10360l.clearCaptureRequestOptions().addListener(new Runnable() { // from class: Nh
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.m63900g();
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> enableTorch(boolean z) {
        if (!m63882y()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.f10357i.m63307d(z));
    }

    @NonNull
    public Camera2CameraControl getCamera2CameraControl() {
        return this.f10360l;
    }

    @NonNull
    public ExposureControl getExposureControl() {
        return this.f10358j;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
        return this.f10364p;
    }

    @NonNull
    public C2404h getFocusMeteringControl() {
        return this.f10355g;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public /* synthetic */ CameraControlInternal getImplementation() {
        return AbstractC12388nj.m26260a(this);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public Config getInteropConfig() {
        return this.f10360l.getCamera2ImplConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public Rect getSensorRect() {
        return (Rect) Preconditions.checkNotNull((Rect) this.f10352d.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public SessionConfig getSessionConfig() {
        this.f10354f.setTemplateType(this.f10369u);
        this.f10354f.setImplementationOptions(m63888s());
        Object captureRequestTag = this.f10360l.getCamera2ImplConfig().getCaptureRequestTag(null);
        if (captureRequestTag != null && (captureRequestTag instanceof Integer)) {
            this.f10354f.addTag(Camera2CameraControl.TAG_KEY, captureRequestTag);
        }
        this.f10354f.addTag("CameraControlSessionUpdateId", Long.valueOf(this.f10370v));
        return this.f10354f.build();
    }

    @NonNull
    public C2423n getTorchControl() {
        return this.f10357i;
    }

    @NonNull
    public C2424o getZoomControl() {
        return this.f10356h;
    }

    @NonNull
    public L72 getZslControl() {
        return this.f10359k;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
        return this.f10359k.isZslDisabledByUserCaseConfig();
    }

    /* renamed from: k */
    public void m63896k(CaptureResultListener captureResultListener) {
        this.f10349a.m63871b(captureResultListener);
    }

    /* renamed from: l */
    public void m63895l(final Executor executor, final CameraCaptureCallback cameraCaptureCallback) {
        this.f10350b.execute(new Runnable() { // from class: Ih
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.m63898i(Camera2CameraControlImpl.this, executor, cameraCaptureCallback);
            }
        });
    }

    /* renamed from: m */
    public void m63894m() {
        synchronized (this.f10351c) {
            try {
                int i = this.f10362n;
                if (i != 0) {
                    this.f10362n = i - 1;
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    public void m63893n(boolean z) {
        this.f10363o = z;
        if (!z) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.f10369u);
            builder.setUseRepeatingSurface(true);
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m63887t(1)));
            builder2.setCaptureRequestOption(CaptureRequest.FLASH_MODE, 0);
            builder.addImplementationOptions(builder2.build());
            m63910R(Collections.singletonList(builder.build()));
        }
        m63908T();
    }

    /* renamed from: o */
    public Rect m63892o() {
        return this.f10356h.m63293g();
    }

    /* renamed from: p */
    public int m63891p() {
        Integer num = (Integer) this.f10352d.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: q */
    public int m63890q() {
        Integer num = (Integer) this.f10352d.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: r */
    public int m63889r() {
        Integer num = (Integer) this.f10352d.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[LOOP:0: B:30:0x006a->B:32:0x0070, LOOP_END] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.camera.core.impl.Config m63888s() {
        /*
            r7 = this;
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r0 = new androidx.camera.camera2.impl.Camera2ImplConfig$Builder
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.setCaptureRequestOption(r1, r3)
            androidx.camera.camera2.internal.h r1 = r7.f10355g
            r1.m63412k(r0)
            androidx.camera.camera2.internal.compat.workaround.AeFpsRange r1 = r7.f10365q
            r1.addAeFpsRangeOptions(r0)
            androidx.camera.camera2.internal.o r1 = r7.f10356h
            r1.m63295e(r0)
            boolean r1 = r7.f10363o
            r3 = 2
            if (r1 == 0) goto L2d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.setCaptureRequestOption(r1, r3)
            goto L33
        L2d:
            int r1 = r7.f10364p
            if (r1 == 0) goto L37
            if (r1 == r2) goto L35
        L33:
            r1 = 1
            goto L3d
        L35:
            r1 = 3
            goto L3d
        L37:
            androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler r1 = r7.f10366r
            int r1 = r1.getCorrectedAeMode(r3)
        L3d:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r1 = r7.m63887t(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setCaptureRequestOption(r3, r1)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            int r2 = r7.m63885v(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.setCaptureRequestOption(r1, r2)
            androidx.camera.camera2.internal.ExposureControl r1 = r7.f10358j
            r1.m63720k(r0)
            androidx.camera.camera2.interop.Camera2CameraControl r1 = r7.f10360l
            androidx.camera.camera2.impl.Camera2ImplConfig r1 = r1.getCamera2ImplConfig()
            java.util.Set r2 = r1.listOptions()
            java.util.Iterator r2 = r2.iterator()
        L6a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.Config$Option r3 = (androidx.camera.core.impl.Config.Option) r3
            androidx.camera.core.impl.MutableConfig r4 = r0.getMutableConfig()
            androidx.camera.core.impl.Config$OptionPriority r5 = androidx.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE
            java.lang.Object r6 = r1.retrieveOption(r3)
            r4.insertOption(r3, r5, r6)
            goto L6a
        L84:
            androidx.camera.camera2.impl.Camera2ImplConfig r0 = r0.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.Camera2CameraControlImpl.m63888s():androidx.camera.core.impl.Config");
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Integer> setExposureCompensationIndex(int i) {
        if (!m63882y()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return this.f10358j.m63719l(i);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i) {
        if (!m63882y()) {
            Logger.m63171w("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f10364p = i;
        L72 l72 = this.f10359k;
        boolean z = true;
        if (this.f10364p != 1 && this.f10364p != 0) {
            z = false;
        }
        l72.setZslDisabledByFlashMode(z);
        this.f10368t = m63909S();
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> setLinearZoom(float f) {
        if (!m63882y()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.f10356h.m63283q(f));
    }

    public void setPreviewAspectRatio(@Nullable Rational rational) {
        this.f10355g.m63430Q(rational);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> setZoomRatio(float f) {
        if (!m63882y()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.f10356h.m63282r(f));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z) {
        this.f10359k.setZslDisabledByUserCaseConfig(z);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<FocusMeteringResult> startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction) {
        if (!m63882y()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.f10355g.m63427T(focusMeteringAction));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public ListenableFuture<List<Void>> submitStillCaptureRequests(@NonNull final List<CaptureConfig> list, final int i, final int i2) {
        if (!m63882y()) {
            Logger.m63171w("Camera2CameraControlImp", "Camera is not active.");
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        final int flashMode = getFlashMode();
        return FutureChain.from(Futures.nonCancellationPropagating(this.f10368t)).transformAsync(new AsyncFunction() { // from class: Gh
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return Camera2CameraControlImpl.m63897j(Camera2CameraControlImpl.this, list, i, flashMode, i2, (Void) obj);
            }
        }, this.f10350b);
    }

    /* renamed from: t */
    public int m63887t(int i) {
        int[] iArr = (int[]) this.f10352d.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m63881z(i, iArr)) {
            return i;
        }
        if (!m63881z(1, iArr)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: u */
    public int m63886u(int i) {
        int[] iArr = (int[]) this.f10352d.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m63881z(i, iArr)) {
            return i;
        }
        if (m63881z(4, iArr)) {
            return 4;
        }
        if (!m63881z(1, iArr)) {
            return 0;
        }
        return 1;
    }

    public void updateSessionConfig() {
        this.f10350b.execute(new Runnable() { // from class: Mh
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.this.m63908T();
            }
        });
    }

    /* renamed from: v */
    public final int m63885v(int i) {
        int[] iArr = (int[]) this.f10352d.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m63881z(i, iArr)) {
            return i;
        }
        if (!m63881z(1, iArr)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: w */
    public int m63884w() {
        int i;
        synchronized (this.f10351c) {
            i = this.f10362n;
        }
        return i;
    }

    /* renamed from: x */
    public void m63883x() {
        synchronized (this.f10351c) {
            this.f10362n++;
        }
    }

    /* renamed from: y */
    public final boolean m63882y() {
        if (m63884w() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public final boolean m63881z(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }
}