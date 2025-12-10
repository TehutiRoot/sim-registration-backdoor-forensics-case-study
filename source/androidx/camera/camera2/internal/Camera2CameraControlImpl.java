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
    public final C2339b f10261a;

    /* renamed from: b */
    public final Executor f10262b;

    /* renamed from: c */
    public final Object f10263c = new Object();

    /* renamed from: d */
    public final CameraCharacteristicsCompat f10264d;

    /* renamed from: e */
    public final CameraControlInternal.ControlUpdateCallback f10265e;

    /* renamed from: f */
    public final SessionConfig.Builder f10266f;

    /* renamed from: g */
    public final C2422h f10267g;

    /* renamed from: h */
    public final C2442o f10268h;

    /* renamed from: i */
    public final C2441n f10269i;

    /* renamed from: j */
    public final ExposureControl f10270j;

    /* renamed from: k */
    public O62 f10271k;

    /* renamed from: l */
    public final Camera2CameraControl f10272l;

    /* renamed from: m */
    public final C2407d f10273m;

    /* renamed from: n */
    public int f10274n;

    /* renamed from: o */
    public volatile boolean f10275o;

    /* renamed from: p */
    public volatile int f10276p;

    /* renamed from: q */
    public final AeFpsRange f10277q;

    /* renamed from: r */
    public final AutoFlashAEModeDisabler f10278r;

    /* renamed from: s */
    public final AtomicLong f10279s;

    /* renamed from: t */
    public volatile ListenableFuture f10280t;

    /* renamed from: u */
    public int f10281u;

    /* renamed from: v */
    public long f10282v;

    /* renamed from: w */
    public final C2338a f10283w;

    /* loaded from: classes.dex */
    public interface CaptureResultListener {
        boolean onCaptureResult(@NonNull TotalCaptureResult totalCaptureResult);
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraControlImpl$a */
    /* loaded from: classes.dex */
    public static final class C2338a extends CameraCaptureCallback {

        /* renamed from: a */
        public Set f10284a = new HashSet();

        /* renamed from: b */
        public Map f10285b = new ArrayMap();

        /* renamed from: a */
        public static /* synthetic */ void m63929a(CameraCaptureCallback cameraCaptureCallback) {
            cameraCaptureCallback.onCaptureCancelled();
        }

        /* renamed from: b */
        public static /* synthetic */ void m63928b(CameraCaptureCallback cameraCaptureCallback, CameraCaptureFailure cameraCaptureFailure) {
            cameraCaptureCallback.onCaptureFailed(cameraCaptureFailure);
        }

        /* renamed from: c */
        public static /* synthetic */ void m63927c(CameraCaptureCallback cameraCaptureCallback, CameraCaptureResult cameraCaptureResult) {
            cameraCaptureCallback.onCaptureCompleted(cameraCaptureResult);
        }

        /* renamed from: d */
        public void m63926d(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
            this.f10284a.add(cameraCaptureCallback);
            this.f10285b.put(cameraCaptureCallback, executor);
        }

        /* renamed from: h */
        public void m63922h(CameraCaptureCallback cameraCaptureCallback) {
            this.f10284a.remove(cameraCaptureCallback);
            this.f10285b.remove(cameraCaptureCallback);
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled() {
            for (final CameraCaptureCallback cameraCaptureCallback : this.f10284a) {
                try {
                    ((Executor) this.f10285b.get(cameraCaptureCallback)).execute(new Runnable() { // from class: Th
                        @Override // java.lang.Runnable
                        public final void run() {
                            Camera2CameraControlImpl.C2338a.m63929a(cameraCaptureCallback);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Logger.m63227e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(final CameraCaptureResult cameraCaptureResult) {
            for (final CameraCaptureCallback cameraCaptureCallback : this.f10284a) {
                try {
                    ((Executor) this.f10285b.get(cameraCaptureCallback)).execute(new Runnable() { // from class: Rh
                        @Override // java.lang.Runnable
                        public final void run() {
                            Camera2CameraControlImpl.C2338a.m63927c(CameraCaptureCallback.this, cameraCaptureResult);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Logger.m63227e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(final CameraCaptureFailure cameraCaptureFailure) {
            for (final CameraCaptureCallback cameraCaptureCallback : this.f10284a) {
                try {
                    ((Executor) this.f10285b.get(cameraCaptureCallback)).execute(new Runnable() { // from class: Sh
                        @Override // java.lang.Runnable
                        public final void run() {
                            Camera2CameraControlImpl.C2338a.m63928b(cameraCaptureCallback, cameraCaptureFailure);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Logger.m63227e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraControlImpl$b */
    /* loaded from: classes.dex */
    public static final class C2339b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final Set f10286a = new HashSet();

        /* renamed from: b */
        public final Executor f10287b;

        public C2339b(Executor executor) {
            this.f10287b = executor;
        }

        /* renamed from: a */
        public static /* synthetic */ void m63921a(C2339b c2339b, TotalCaptureResult totalCaptureResult) {
            c2339b.m63919c(totalCaptureResult);
        }

        /* renamed from: b */
        public void m63920b(CaptureResultListener captureResultListener) {
            this.f10286a.add(captureResultListener);
        }

        /* renamed from: c */
        public final /* synthetic */ void m63919c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (CaptureResultListener captureResultListener : this.f10286a) {
                if (captureResultListener.onCaptureResult(totalCaptureResult)) {
                    hashSet.add(captureResultListener);
                }
            }
            if (!hashSet.isEmpty()) {
                this.f10286a.removeAll(hashSet);
            }
        }

        /* renamed from: d */
        public void m63918d(CaptureResultListener captureResultListener) {
            this.f10286a.remove(captureResultListener);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f10287b.execute(new Runnable() { // from class: Uh
                {
                    Camera2CameraControlImpl.C2339b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraControlImpl.C2339b.m63921a(Camera2CameraControlImpl.C2339b.this, totalCaptureResult);
                }
            });
        }
    }

    public Camera2CameraControlImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.ControlUpdateCallback controlUpdateCallback, Quirks quirks) {
        SessionConfig.Builder builder = new SessionConfig.Builder();
        this.f10266f = builder;
        this.f10274n = 0;
        this.f10275o = false;
        this.f10276p = 2;
        this.f10279s = new AtomicLong(0L);
        this.f10280t = Futures.immediateFuture(null);
        this.f10281u = 1;
        this.f10282v = 0L;
        C2338a c2338a = new C2338a();
        this.f10283w = c2338a;
        this.f10264d = cameraCharacteristicsCompat;
        this.f10265e = controlUpdateCallback;
        this.f10262b = executor;
        C2339b c2339b = new C2339b(executor);
        this.f10261a = c2339b;
        builder.setTemplateType(this.f10281u);
        builder.addRepeatingCameraCaptureCallback(C0052Al.m69052a(c2339b));
        builder.addRepeatingCameraCaptureCallback(c2338a);
        this.f10270j = new ExposureControl(this, cameraCharacteristicsCompat, executor);
        this.f10267g = new C2422h(this, scheduledExecutorService, executor, quirks);
        this.f10268h = new C2442o(this, cameraCharacteristicsCompat, executor);
        this.f10269i = new C2441n(this, cameraCharacteristicsCompat, executor);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f10271k = new Y62(cameraCharacteristicsCompat);
        } else {
            this.f10271k = new ZslControlNoOpImpl();
        }
        this.f10277q = new AeFpsRange(quirks);
        this.f10278r = new AutoFlashAEModeDisabler(quirks);
        this.f10272l = new Camera2CameraControl(this, executor);
        this.f10273m = new C2407d(this, cameraCharacteristicsCompat, quirks, executor);
        executor.execute(new Runnable() { // from class: Oh
            {
                Camera2CameraControlImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.m63954b(Camera2CameraControlImpl.this);
            }
        });
    }

    /* renamed from: A */
    public static boolean m63976A(TotalCaptureResult totalCaptureResult, long j) {
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
    public static /* synthetic */ void m63974C() {
    }

    /* renamed from: E */
    public static /* synthetic */ void m63972E() {
    }

    /* renamed from: K */
    public static /* synthetic */ boolean m63966K(long j, CallbackToFutureAdapter.Completer completer, TotalCaptureResult totalCaptureResult) {
        if (m63976A(totalCaptureResult, j)) {
            completer.set(null);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m63955a(Camera2CameraControlImpl camera2CameraControlImpl, long j, CallbackToFutureAdapter.Completer completer) {
        return camera2CameraControlImpl.m63965L(j, completer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m63954b(Camera2CameraControlImpl camera2CameraControlImpl) {
        camera2CameraControlImpl.m63971F();
    }

    /* renamed from: c */
    public static /* synthetic */ void m63953c(Camera2CameraControlImpl camera2CameraControlImpl, CallbackToFutureAdapter.Completer completer) {
        camera2CameraControlImpl.m63968I(completer);
    }

    /* renamed from: d */
    public static /* synthetic */ void m63952d() {
        m63974C();
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m63951e(long j, CallbackToFutureAdapter.Completer completer, TotalCaptureResult totalCaptureResult) {
        return m63966K(j, completer, totalCaptureResult);
    }

    /* renamed from: f */
    public static /* synthetic */ void m63950f(Camera2CameraControlImpl camera2CameraControlImpl, CameraCaptureCallback cameraCaptureCallback) {
        camera2CameraControlImpl.m63970G(cameraCaptureCallback);
    }

    /* renamed from: g */
    public static /* synthetic */ void m63949g() {
        m63972E();
    }

    /* renamed from: h */
    public static /* synthetic */ Object m63948h(Camera2CameraControlImpl camera2CameraControlImpl, CallbackToFutureAdapter.Completer completer) {
        return camera2CameraControlImpl.m63967J(completer);
    }

    /* renamed from: i */
    public static /* synthetic */ void m63947i(Camera2CameraControlImpl camera2CameraControlImpl, Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        camera2CameraControlImpl.m63973D(executor, cameraCaptureCallback);
    }

    /* renamed from: j */
    public static /* synthetic */ ListenableFuture m63946j(Camera2CameraControlImpl camera2CameraControlImpl, List list, int i, int i2, int i3, Void r5) {
        return camera2CameraControlImpl.m63969H(list, i, i2, i3, r5);
    }

    /* renamed from: B */
    public boolean m63975B() {
        return this.f10275o;
    }

    /* renamed from: D */
    public final /* synthetic */ void m63973D(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        this.f10283w.m63926d(executor, cameraCaptureCallback);
    }

    /* renamed from: F */
    public final /* synthetic */ void m63971F() {
        m63945k(this.f10272l.getCaptureRequestListener());
    }

    /* renamed from: G */
    public final /* synthetic */ void m63970G(CameraCaptureCallback cameraCaptureCallback) {
        this.f10283w.m63922h(cameraCaptureCallback);
    }

    /* renamed from: H */
    public final /* synthetic */ ListenableFuture m63969H(List list, int i, int i2, int i3, Void r5) {
        return this.f10273m.m63555e(list, i, i2, i3);
    }

    /* renamed from: I */
    public final /* synthetic */ void m63968I(CallbackToFutureAdapter.Completer completer) {
        Futures.propagate(m63956U(m63957T()), completer);
    }

    /* renamed from: J */
    public final /* synthetic */ Object m63967J(final CallbackToFutureAdapter.Completer completer) {
        this.f10262b.execute(new Runnable() { // from class: Ph
            {
                Camera2CameraControlImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.m63953c(Camera2CameraControlImpl.this, completer);
            }
        });
        return "updateSessionConfigAsync";
    }

    /* renamed from: L */
    public final /* synthetic */ Object m63965L(final long j, final CallbackToFutureAdapter.Completer completer) {
        m63945k(new CaptureResultListener() { // from class: Hh
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return Camera2CameraControlImpl.m63951e(j, completer, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j;
    }

    /* renamed from: M */
    public void m63964M(CaptureResultListener captureResultListener) {
        this.f10261a.m63918d(captureResultListener);
    }

    /* renamed from: N */
    public void m63963N(final CameraCaptureCallback cameraCaptureCallback) {
        this.f10262b.execute(new Runnable() { // from class: Kh
            {
                Camera2CameraControlImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.m63950f(Camera2CameraControlImpl.this, cameraCaptureCallback);
            }
        });
    }

    /* renamed from: O */
    public void m63962O() {
        m63960Q(1);
    }

    /* renamed from: P */
    public void m63961P(boolean z) {
        this.f10267g.m63480P(z);
        this.f10268h.m63336p(z);
        this.f10269i.m63353j(z);
        this.f10270j.m63770j(z);
        this.f10272l.setActive(z);
    }

    /* renamed from: Q */
    public void m63960Q(int i) {
        this.f10281u = i;
        this.f10267g.m63478R(i);
        this.f10273m.m63556d(this.f10281u);
    }

    /* renamed from: R */
    public void m63959R(List list) {
        this.f10265e.onCameraControlCaptureRequests(list);
    }

    /* renamed from: S */
    public ListenableFuture m63958S() {
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Lh
            {
                Camera2CameraControlImpl.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControlImpl.m63948h(Camera2CameraControlImpl.this, completer);
            }
        }));
    }

    /* renamed from: T */
    public long m63957T() {
        this.f10282v = this.f10279s.getAndIncrement();
        this.f10265e.onCameraControlUpdateSessionConfig();
        return this.f10282v;
    }

    /* renamed from: U */
    public final ListenableFuture m63956U(final long j) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Qh
            {
                Camera2CameraControlImpl.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControlImpl.m63955a(Camera2CameraControlImpl.this, j, completer);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(@NonNull Config config) {
        this.f10272l.addCaptureRequestOptions(CaptureRequestOptions.Builder.from(config).build()).addListener(new Runnable() { // from class: Jh
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.m63952d();
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(@NonNull SessionConfig.Builder builder) {
        this.f10271k.addZslConfig(builder);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> cancelFocusAndMetering() {
        if (!m63931y()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.f10267g.m63459m());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
        this.f10272l.clearCaptureRequestOptions().addListener(new Runnable() { // from class: Nh
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.m63949g();
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> enableTorch(boolean z) {
        if (!m63931y()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.f10269i.m63359d(z));
    }

    @NonNull
    public Camera2CameraControl getCamera2CameraControl() {
        return this.f10272l;
    }

    @NonNull
    public ExposureControl getExposureControl() {
        return this.f10270j;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
        return this.f10276p;
    }

    @NonNull
    public C2422h getFocusMeteringControl() {
        return this.f10267g;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public /* synthetic */ CameraControlInternal getImplementation() {
        return AbstractC12391nj.m26054a(this);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public Config getInteropConfig() {
        return this.f10272l.getCamera2ImplConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public Rect getSensorRect() {
        return (Rect) Preconditions.checkNotNull((Rect) this.f10264d.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public SessionConfig getSessionConfig() {
        this.f10266f.setTemplateType(this.f10281u);
        this.f10266f.setImplementationOptions(m63937s());
        Object captureRequestTag = this.f10272l.getCamera2ImplConfig().getCaptureRequestTag(null);
        if (captureRequestTag != null && (captureRequestTag instanceof Integer)) {
            this.f10266f.addTag(Camera2CameraControl.TAG_KEY, captureRequestTag);
        }
        this.f10266f.addTag("CameraControlSessionUpdateId", Long.valueOf(this.f10282v));
        return this.f10266f.build();
    }

    @NonNull
    public C2441n getTorchControl() {
        return this.f10269i;
    }

    @NonNull
    public C2442o getZoomControl() {
        return this.f10268h;
    }

    @NonNull
    public O62 getZslControl() {
        return this.f10271k;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
        return this.f10271k.isZslDisabledByUserCaseConfig();
    }

    /* renamed from: k */
    public void m63945k(CaptureResultListener captureResultListener) {
        this.f10261a.m63920b(captureResultListener);
    }

    /* renamed from: l */
    public void m63944l(final Executor executor, final CameraCaptureCallback cameraCaptureCallback) {
        this.f10262b.execute(new Runnable() { // from class: Ih
            {
                Camera2CameraControlImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.m63947i(Camera2CameraControlImpl.this, executor, cameraCaptureCallback);
            }
        });
    }

    /* renamed from: m */
    public void m63943m() {
        synchronized (this.f10263c) {
            try {
                int i = this.f10274n;
                if (i != 0) {
                    this.f10274n = i - 1;
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    public void m63942n(boolean z) {
        this.f10275o = z;
        if (!z) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.f10281u);
            builder.setUseRepeatingSurface(true);
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m63936t(1)));
            builder2.setCaptureRequestOption(CaptureRequest.FLASH_MODE, 0);
            builder.addImplementationOptions(builder2.build());
            m63959R(Collections.singletonList(builder.build()));
        }
        m63957T();
    }

    /* renamed from: o */
    public Rect m63941o() {
        return this.f10268h.m63345g();
    }

    /* renamed from: p */
    public int m63940p() {
        Integer num = (Integer) this.f10264d.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: q */
    public int m63939q() {
        Integer num = (Integer) this.f10264d.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: r */
    public int m63938r() {
        Integer num = (Integer) this.f10264d.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
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
    public androidx.camera.core.impl.Config m63937s() {
        /*
            r7 = this;
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r0 = new androidx.camera.camera2.impl.Camera2ImplConfig$Builder
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.setCaptureRequestOption(r1, r3)
            androidx.camera.camera2.internal.h r1 = r7.f10267g
            r1.m63461k(r0)
            androidx.camera.camera2.internal.compat.workaround.AeFpsRange r1 = r7.f10277q
            r1.addAeFpsRangeOptions(r0)
            androidx.camera.camera2.internal.o r1 = r7.f10268h
            r1.m63347e(r0)
            boolean r1 = r7.f10275o
            r3 = 2
            if (r1 == 0) goto L2d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.setCaptureRequestOption(r1, r3)
            goto L33
        L2d:
            int r1 = r7.f10276p
            if (r1 == 0) goto L37
            if (r1 == r2) goto L35
        L33:
            r1 = 1
            goto L3d
        L35:
            r1 = 3
            goto L3d
        L37:
            androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler r1 = r7.f10278r
            int r1 = r1.getCorrectedAeMode(r3)
        L3d:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r1 = r7.m63936t(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setCaptureRequestOption(r3, r1)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            int r2 = r7.m63934v(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.setCaptureRequestOption(r1, r2)
            androidx.camera.camera2.internal.ExposureControl r1 = r7.f10270j
            r1.m63769k(r0)
            androidx.camera.camera2.interop.Camera2CameraControl r1 = r7.f10272l
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.Camera2CameraControlImpl.m63937s():androidx.camera.core.impl.Config");
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Integer> setExposureCompensationIndex(int i) {
        if (!m63931y()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return this.f10270j.m63768l(i);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i) {
        if (!m63931y()) {
            Logger.m63223w("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f10276p = i;
        O62 o62 = this.f10271k;
        boolean z = true;
        if (this.f10276p != 1 && this.f10276p != 0) {
            z = false;
        }
        o62.setZslDisabledByFlashMode(z);
        this.f10280t = m63958S();
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> setLinearZoom(float f) {
        if (!m63931y()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.f10268h.m63335q(f));
    }

    public void setPreviewAspectRatio(@Nullable Rational rational) {
        this.f10267g.m63479Q(rational);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> setZoomRatio(float f) {
        if (!m63931y()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.f10268h.m63334r(f));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z) {
        this.f10271k.setZslDisabledByUserCaseConfig(z);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<FocusMeteringResult> startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction) {
        if (!m63931y()) {
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return Futures.nonCancellationPropagating(this.f10267g.m63476T(focusMeteringAction));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public ListenableFuture<List<Void>> submitStillCaptureRequests(@NonNull final List<CaptureConfig> list, final int i, final int i2) {
        if (!m63931y()) {
            Logger.m63223w("Camera2CameraControlImp", "Camera is not active.");
            return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        final int flashMode = getFlashMode();
        return FutureChain.from(Futures.nonCancellationPropagating(this.f10280t)).transformAsync(new AsyncFunction() { // from class: Gh
            {
                Camera2CameraControlImpl.this = this;
            }

            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return Camera2CameraControlImpl.m63946j(Camera2CameraControlImpl.this, list, i, flashMode, i2, (Void) obj);
            }
        }, this.f10262b);
    }

    /* renamed from: t */
    public int m63936t(int i) {
        int[] iArr = (int[]) this.f10264d.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m63930z(i, iArr)) {
            return i;
        }
        if (!m63930z(1, iArr)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: u */
    public int m63935u(int i) {
        int[] iArr = (int[]) this.f10264d.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m63930z(i, iArr)) {
            return i;
        }
        if (m63930z(4, iArr)) {
            return 4;
        }
        if (!m63930z(1, iArr)) {
            return 0;
        }
        return 1;
    }

    public void updateSessionConfig() {
        this.f10262b.execute(new Runnable() { // from class: Mh
            {
                Camera2CameraControlImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.this.m63957T();
            }
        });
    }

    /* renamed from: v */
    public final int m63934v(int i) {
        int[] iArr = (int[]) this.f10264d.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m63930z(i, iArr)) {
            return i;
        }
        if (!m63930z(1, iArr)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: w */
    public int m63933w() {
        int i;
        synchronized (this.f10263c) {
            i = this.f10274n;
        }
        return i;
    }

    /* renamed from: x */
    public void m63932x() {
        synchronized (this.f10263c) {
            this.f10274n++;
        }
    }

    /* renamed from: y */
    public final boolean m63931y() {
        if (m63933w() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public final boolean m63930z(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }
}
