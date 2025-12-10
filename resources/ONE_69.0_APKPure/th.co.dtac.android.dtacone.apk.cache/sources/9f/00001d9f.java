package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.ProcessingCaptureSession;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.SessionProcessorSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Preconditions;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class ProcessingCaptureSession implements InterfaceC0750Kl {

    /* renamed from: q */
    public static List f10506q = new ArrayList();

    /* renamed from: r */
    public static int f10507r = 0;

    /* renamed from: a */
    public final SessionProcessor f10508a;

    /* renamed from: b */
    public final Camera2CameraInfoImpl f10509b;

    /* renamed from: c */
    public final Executor f10510c;

    /* renamed from: d */
    public final ScheduledExecutorService f10511d;

    /* renamed from: e */
    public final CaptureSession f10512e;

    /* renamed from: g */
    public SessionConfig f10514g;

    /* renamed from: h */
    public Camera2RequestProcessor f10515h;

    /* renamed from: i */
    public SessionConfig f10516i;

    /* renamed from: p */
    public int f10523p;

    /* renamed from: f */
    public List f10513f = new ArrayList();

    /* renamed from: k */
    public volatile List f10518k = null;

    /* renamed from: l */
    public volatile boolean f10519l = false;

    /* renamed from: n */
    public CaptureRequestOptions f10521n = new CaptureRequestOptions.Builder().build();

    /* renamed from: o */
    public CaptureRequestOptions f10522o = new CaptureRequestOptions.Builder().build();

    /* renamed from: j */
    public ProcessorState f10517j = ProcessorState.UNINITIALIZED;

    /* renamed from: m */
    public final C2351e f10520m = new C2351e();

    /* loaded from: classes.dex */
    public enum ProcessorState {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$a */
    /* loaded from: classes.dex */
    public class C2347a implements FutureCallback {
        public C2347a() {
            ProcessingCaptureSession.this = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            Logger.m63175e("ProcessingCaptureSession", "open session failed ", th2);
            ProcessingCaptureSession.this.close();
            ProcessingCaptureSession.this.mo63718a(false);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$b */
    /* loaded from: classes.dex */
    public class C2348b implements SessionProcessor.CaptureCallback {

        /* renamed from: a */
        public final /* synthetic */ CaptureConfig f10525a;

        public C2348b(CaptureConfig captureConfig) {
            ProcessingCaptureSession.this = r1;
            this.f10525a = captureConfig;
        }

        /* renamed from: c */
        public static /* synthetic */ void m63691c(CaptureConfig captureConfig) {
            for (CameraCaptureCallback cameraCaptureCallback : captureConfig.getCameraCaptureCallbacks()) {
                cameraCaptureCallback.onCaptureFailed(new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
            }
        }

        /* renamed from: d */
        public static /* synthetic */ void m63690d(CaptureConfig captureConfig) {
            for (CameraCaptureCallback cameraCaptureCallback : captureConfig.getCameraCaptureCallbacks()) {
                cameraCaptureCallback.onCaptureCompleted(new CameraCaptureResult.EmptyCameraCaptureResult());
            }
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureCompleted(long j, int i, Map map) {
            AbstractC20413iH1.m31004a(this, j, i, map);
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureFailed(int i) {
            Executor executor = ProcessingCaptureSession.this.f10510c;
            final CaptureConfig captureConfig = this.f10525a;
            executor.execute(new Runnable() { // from class: bp1
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessingCaptureSession.C2348b.m63691c(CaptureConfig.this);
                }
            });
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureProcessStarted(int i) {
            AbstractC20413iH1.m31002c(this, i);
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureSequenceAborted(int i) {
            AbstractC20413iH1.m31001d(this, i);
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceCompleted(int i) {
            Executor executor = ProcessingCaptureSession.this.f10510c;
            final CaptureConfig captureConfig = this.f10525a;
            executor.execute(new Runnable() { // from class: ap1
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessingCaptureSession.C2348b.m63690d(CaptureConfig.this);
                }
            });
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureStarted(int i, long j) {
            AbstractC20413iH1.m30999f(this, i, j);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$c */
    /* loaded from: classes.dex */
    public class C2349c implements SessionProcessor.CaptureCallback {

        /* renamed from: a */
        public final /* synthetic */ CaptureConfig f10527a;

        public C2349c(CaptureConfig captureConfig) {
            ProcessingCaptureSession.this = r1;
            this.f10527a = captureConfig;
        }

        /* renamed from: c */
        public static /* synthetic */ void m63687c(CaptureConfig captureConfig) {
            for (CameraCaptureCallback cameraCaptureCallback : captureConfig.getCameraCaptureCallbacks()) {
                cameraCaptureCallback.onCaptureFailed(new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
            }
        }

        /* renamed from: d */
        public static /* synthetic */ void m63686d(CaptureConfig captureConfig) {
            for (CameraCaptureCallback cameraCaptureCallback : captureConfig.getCameraCaptureCallbacks()) {
                cameraCaptureCallback.onCaptureCompleted(new CameraCaptureResult.EmptyCameraCaptureResult());
            }
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureCompleted(long j, int i, Map map) {
            AbstractC20413iH1.m31004a(this, j, i, map);
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureFailed(int i) {
            Executor executor = ProcessingCaptureSession.this.f10510c;
            final CaptureConfig captureConfig = this.f10527a;
            executor.execute(new Runnable() { // from class: dp1
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessingCaptureSession.C2349c.m63687c(CaptureConfig.this);
                }
            });
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureProcessStarted(int i) {
            AbstractC20413iH1.m31002c(this, i);
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureSequenceAborted(int i) {
            AbstractC20413iH1.m31001d(this, i);
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceCompleted(int i) {
            Executor executor = ProcessingCaptureSession.this.f10510c;
            final CaptureConfig captureConfig = this.f10527a;
            executor.execute(new Runnable() { // from class: cp1
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessingCaptureSession.C2349c.m63686d(CaptureConfig.this);
                }
            });
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureStarted(int i, long j) {
            AbstractC20413iH1.m30999f(this, i, j);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$d */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2350d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10529a;

        static {
            int[] iArr = new int[ProcessorState.values().length];
            f10529a = iArr;
            try {
                iArr[ProcessorState.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10529a[ProcessorState.SESSION_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10529a[ProcessorState.ON_CAPTURE_SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10529a[ProcessorState.ON_CAPTURE_SESSION_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10529a[ProcessorState.DE_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$e */
    /* loaded from: classes.dex */
    public static class C2351e implements SessionProcessor.CaptureCallback {
        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureCompleted(long j, int i, Map map) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureFailed(int i) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureProcessStarted(int i) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceAborted(int i) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceCompleted(int i) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureStarted(int i, long j) {
        }
    }

    public ProcessingCaptureSession(SessionProcessor sessionProcessor, Camera2CameraInfoImpl camera2CameraInfoImpl, DynamicRangesCompat dynamicRangesCompat, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f10523p = 0;
        this.f10512e = new CaptureSession(dynamicRangesCompat);
        this.f10508a = sessionProcessor;
        this.f10509b = camera2CameraInfoImpl;
        this.f10510c = executor;
        this.f10511d = scheduledExecutorService;
        int i = f10507r;
        f10507r = i + 1;
        this.f10523p = i;
        Logger.m63178d("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f10523p + ")");
    }

    /* renamed from: h */
    public static /* synthetic */ Void m63711h(ProcessingCaptureSession processingCaptureSession, Void r1) {
        return processingCaptureSession.m63698u(r1);
    }

    /* renamed from: i */
    public static /* synthetic */ void m63710i(DeferrableSurface deferrableSurface) {
        m63700s(deferrableSurface);
    }

    /* renamed from: j */
    public static /* synthetic */ ListenableFuture m63709j(ProcessingCaptureSession processingCaptureSession, SessionConfig sessionConfig, CameraDevice cameraDevice, C2418l c2418l, List list) {
        return processingCaptureSession.m63699t(sessionConfig, cameraDevice, c2418l, list);
    }

    /* renamed from: k */
    public static /* synthetic */ void m63708k(ProcessingCaptureSession processingCaptureSession) {
        processingCaptureSession.m63701r();
    }

    /* renamed from: l */
    public static /* synthetic */ void m63707l(ProcessingCaptureSession processingCaptureSession) {
        processingCaptureSession.m63697v();
    }

    /* renamed from: m */
    public static void m63706m(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (CameraCaptureCallback cameraCaptureCallback : ((CaptureConfig) it.next()).getCameraCaptureCallbacks()) {
                cameraCaptureCallback.onCaptureCancelled();
            }
        }
    }

    /* renamed from: n */
    public static List m63705n(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeferrableSurface deferrableSurface = (DeferrableSurface) it.next();
            Preconditions.checkArgument(deferrableSurface instanceof SessionProcessorSurface, "Surface must be SessionProcessorSurface");
            arrayList.add((SessionProcessorSurface) deferrableSurface);
        }
        return arrayList;
    }

    /* renamed from: s */
    public static /* synthetic */ void m63700s(DeferrableSurface deferrableSurface) {
        f10506q.remove(deferrableSurface);
    }

    @Override // p000.InterfaceC0750Kl
    /* renamed from: a */
    public ListenableFuture mo63718a(boolean z) {
        Logger.m63178d("ProcessingCaptureSession", "release (id=" + this.f10523p + ") mProcessorState=" + this.f10517j);
        ListenableFuture mo63718a = this.f10512e.mo63718a(z);
        int i = C2350d.f10529a[this.f10517j.ordinal()];
        if (i == 2 || i == 4) {
            mo63718a.addListener(new Runnable() { // from class: Xo1
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessingCaptureSession.m63707l(ProcessingCaptureSession.this);
                }
            }, CameraXExecutors.directExecutor());
        }
        this.f10517j = ProcessorState.DE_INITIALIZED;
        return mo63718a;
    }

    @Override // p000.InterfaceC0750Kl
    /* renamed from: b */
    public void mo63717b(SessionConfig sessionConfig) {
        Logger.m63178d("ProcessingCaptureSession", "setSessionConfig (id=" + this.f10523p + ")");
        this.f10514g = sessionConfig;
        if (sessionConfig == null) {
            return;
        }
        Camera2RequestProcessor camera2RequestProcessor = this.f10515h;
        if (camera2RequestProcessor != null) {
            camera2RequestProcessor.updateSessionConfig(sessionConfig);
        }
        if (this.f10517j == ProcessorState.ON_CAPTURE_SESSION_STARTED) {
            CaptureRequestOptions build = CaptureRequestOptions.Builder.from(sessionConfig.getImplementationOptions()).build();
            this.f10521n = build;
            m63695x(build, this.f10522o);
            if (!m63704o(sessionConfig.getRepeatingCaptureConfig())) {
                this.f10508a.stopRepeating();
            } else {
                this.f10508a.startRepeating(this.f10520m);
            }
        }
    }

    @Override // p000.InterfaceC0750Kl
    /* renamed from: c */
    public void mo63716c(List list) {
        if (list.isEmpty()) {
            return;
        }
        Logger.m63178d("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f10523p + ") + state =" + this.f10517j);
        int i = C2350d.f10529a[this.f10517j.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4 || i == 5) {
                    Logger.m63178d("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f10517j);
                    m63706m(list);
                    return;
                }
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CaptureConfig captureConfig = (CaptureConfig) it.next();
                if (captureConfig.getTemplateType() == 2) {
                    m63703p(captureConfig);
                } else {
                    m63702q(captureConfig);
                }
            }
            return;
        }
        this.f10518k = list;
    }

    @Override // p000.InterfaceC0750Kl
    public void close() {
        Logger.m63178d("ProcessingCaptureSession", "close (id=" + this.f10523p + ") state=" + this.f10517j);
        if (this.f10517j == ProcessorState.ON_CAPTURE_SESSION_STARTED) {
            Logger.m63178d("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.f10523p + ")");
            this.f10508a.onCaptureSessionEnd();
            Camera2RequestProcessor camera2RequestProcessor = this.f10515h;
            if (camera2RequestProcessor != null) {
                camera2RequestProcessor.close();
            }
            this.f10517j = ProcessorState.ON_CAPTURE_SESSION_ENDED;
        }
        this.f10512e.close();
    }

    @Override // p000.InterfaceC0750Kl
    /* renamed from: d */
    public void mo63715d() {
        Logger.m63178d("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f10523p + ")");
        if (this.f10518k != null) {
            for (CaptureConfig captureConfig : this.f10518k) {
                for (CameraCaptureCallback cameraCaptureCallback : captureConfig.getCameraCaptureCallbacks()) {
                    cameraCaptureCallback.onCaptureCancelled();
                }
            }
            this.f10518k = null;
        }
    }

    @Override // p000.InterfaceC0750Kl
    /* renamed from: e */
    public List mo63714e() {
        if (this.f10518k != null) {
            return this.f10518k;
        }
        return Collections.emptyList();
    }

    @Override // p000.InterfaceC0750Kl
    /* renamed from: f */
    public ListenableFuture mo63713f(final SessionConfig sessionConfig, final CameraDevice cameraDevice, final C2418l c2418l) {
        boolean z;
        if (this.f10517j == ProcessorState.UNINITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid state state:" + this.f10517j);
        Preconditions.checkArgument(sessionConfig.getSurfaces().isEmpty() ^ true, "SessionConfig contains no surfaces");
        Logger.m63178d("ProcessingCaptureSession", "open (id=" + this.f10523p + ")");
        List<DeferrableSurface> surfaces = sessionConfig.getSurfaces();
        this.f10513f = surfaces;
        return FutureChain.from(DeferrableSurfaces.surfaceListWithTimeout(surfaces, false, CoroutineLiveDataKt.DEFAULT_TIMEOUT, this.f10510c, this.f10511d)).transformAsync(new AsyncFunction() { // from class: Vo1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return ProcessingCaptureSession.m63709j(ProcessingCaptureSession.this, sessionConfig, cameraDevice, c2418l, (List) obj);
            }
        }, this.f10510c).transform(new Function() { // from class: Wo1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ProcessingCaptureSession.m63711h(ProcessingCaptureSession.this, (Void) obj);
            }
        }, this.f10510c);
    }

    @Override // p000.InterfaceC0750Kl
    /* renamed from: g */
    public void mo63712g(Map map) {
    }

    @Override // p000.InterfaceC0750Kl
    public SessionConfig getSessionConfig() {
        return this.f10514g;
    }

    /* renamed from: o */
    public final boolean m63704o(CaptureConfig captureConfig) {
        for (DeferrableSurface deferrableSurface : captureConfig.getSurfaces()) {
            if (Objects.equals(deferrableSurface.getContainerClass(), Preview.class)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public void m63703p(CaptureConfig captureConfig) {
        CaptureRequestOptions.Builder from = CaptureRequestOptions.Builder.from(captureConfig.getImplementationOptions());
        Config implementationOptions = captureConfig.getImplementationOptions();
        Config.Option<Integer> option = CaptureConfig.OPTION_ROTATION;
        if (implementationOptions.containsOption(option)) {
            from.setCaptureRequestOption(CaptureRequest.JPEG_ORIENTATION, (Integer) captureConfig.getImplementationOptions().retrieveOption(option));
        }
        Config implementationOptions2 = captureConfig.getImplementationOptions();
        Config.Option<Integer> option2 = CaptureConfig.OPTION_JPEG_QUALITY;
        if (implementationOptions2.containsOption(option2)) {
            from.setCaptureRequestOption(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) captureConfig.getImplementationOptions().retrieveOption(option2)).byteValue()));
        }
        CaptureRequestOptions build = from.build();
        this.f10522o = build;
        m63695x(this.f10521n, build);
        this.f10508a.startCapture(new C2349c(captureConfig));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0022  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m63702q(androidx.camera.core.impl.CaptureConfig r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ProcessingCaptureSession"
            java.lang.String r1 = "issueTriggerRequest"
            androidx.camera.core.Logger.m63178d(r0, r1)
            androidx.camera.core.impl.Config r0 = r5.getImplementationOptions()
            androidx.camera.camera2.interop.CaptureRequestOptions$Builder r0 = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(r0)
            androidx.camera.camera2.interop.CaptureRequestOptions r0 = r0.build()
            java.util.Set r1 = r0.listOptions()
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.Config$Option r2 = (androidx.camera.core.impl.Config.Option) r2
            java.lang.Object r2 = r2.getToken()
            android.hardware.camera2.CaptureRequest$Key r2 = (android.hardware.camera2.CaptureRequest.Key) r2
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L3e
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1c
        L3e:
            androidx.camera.core.impl.SessionProcessor r1 = r4.f10508a
            androidx.camera.camera2.internal.ProcessingCaptureSession$b r2 = new androidx.camera.camera2.internal.ProcessingCaptureSession$b
            r2.<init>(r5)
            r1.startTrigger(r0, r2)
            return
        L49:
            r0 = 1
            androidx.camera.core.impl.CaptureConfig[] r0 = new androidx.camera.core.impl.CaptureConfig[r0]
            r1 = 0
            r0[r1] = r5
            java.util.List r5 = java.util.Arrays.asList(r0)
            m63706m(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.ProcessingCaptureSession.m63702q(androidx.camera.core.impl.CaptureConfig):void");
    }

    /* renamed from: r */
    public final /* synthetic */ void m63701r() {
        DeferrableSurfaces.decrementAll(this.f10513f);
    }

    /* renamed from: t */
    public final /* synthetic */ ListenableFuture m63699t(SessionConfig sessionConfig, CameraDevice cameraDevice, C2418l c2418l, List list) {
        Logger.m63178d("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f10523p + ")");
        if (this.f10517j == ProcessorState.DE_INITIALIZED) {
            return Futures.immediateFailedFuture(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        OutputSurface outputSurface = null;
        if (list.contains(null)) {
            return Futures.immediateFailedFuture(new DeferrableSurface.SurfaceClosedException("Surface closed", sessionConfig.getSurfaces().get(list.indexOf(null))));
        }
        OutputSurface outputSurface2 = null;
        OutputSurface outputSurface3 = null;
        for (int i = 0; i < sessionConfig.getSurfaces().size(); i++) {
            DeferrableSurface deferrableSurface = sessionConfig.getSurfaces().get(i);
            if (Objects.equals(deferrableSurface.getContainerClass(), Preview.class)) {
                outputSurface = OutputSurface.create(deferrableSurface.getSurface().get(), new Size(deferrableSurface.getPrescribedSize().getWidth(), deferrableSurface.getPrescribedSize().getHeight()), deferrableSurface.getPrescribedStreamFormat());
            } else if (Objects.equals(deferrableSurface.getContainerClass(), ImageCapture.class)) {
                outputSurface2 = OutputSurface.create(deferrableSurface.getSurface().get(), new Size(deferrableSurface.getPrescribedSize().getWidth(), deferrableSurface.getPrescribedSize().getHeight()), deferrableSurface.getPrescribedStreamFormat());
            } else if (Objects.equals(deferrableSurface.getContainerClass(), ImageAnalysis.class)) {
                outputSurface3 = OutputSurface.create(deferrableSurface.getSurface().get(), new Size(deferrableSurface.getPrescribedSize().getWidth(), deferrableSurface.getPrescribedSize().getHeight()), deferrableSurface.getPrescribedStreamFormat());
            }
        }
        this.f10517j = ProcessorState.SESSION_INITIALIZED;
        try {
            DeferrableSurfaces.incrementAll(this.f10513f);
            Logger.m63171w("ProcessingCaptureSession", "== initSession (id=" + this.f10523p + ")");
            try {
                SessionConfig initSession = this.f10508a.initSession(this.f10509b, outputSurface, outputSurface2, outputSurface3);
                this.f10516i = initSession;
                initSession.getSurfaces().get(0).getTerminationFuture().addListener(new Runnable() { // from class: Yo1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProcessingCaptureSession.m63708k(ProcessingCaptureSession.this);
                    }
                }, CameraXExecutors.directExecutor());
                for (final DeferrableSurface deferrableSurface2 : this.f10516i.getSurfaces()) {
                    f10506q.add(deferrableSurface2);
                    deferrableSurface2.getTerminationFuture().addListener(new Runnable() { // from class: Zo1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProcessingCaptureSession.m63710i(DeferrableSurface.this);
                        }
                    }, this.f10510c);
                }
                SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
                validatingBuilder.add(sessionConfig);
                validatingBuilder.clearSurfaces();
                validatingBuilder.add(this.f10516i);
                Preconditions.checkArgument(validatingBuilder.isValid(), "Cannot transform the SessionConfig");
                ListenableFuture mo63713f = this.f10512e.mo63713f(validatingBuilder.build(), (CameraDevice) Preconditions.checkNotNull(cameraDevice), c2418l);
                Futures.addCallback(mo63713f, new C2347a(), this.f10510c);
                return mo63713f;
            } catch (Throwable th2) {
                DeferrableSurfaces.decrementAll(this.f10513f);
                throw th2;
            }
        } catch (DeferrableSurface.SurfaceClosedException e) {
            return Futures.immediateFailedFuture(e);
        }
    }

    /* renamed from: u */
    public final /* synthetic */ Void m63698u(Void r1) {
        m63696w(this.f10512e);
        return null;
    }

    /* renamed from: v */
    public final /* synthetic */ void m63697v() {
        Logger.m63178d("ProcessingCaptureSession", "== deInitSession (id=" + this.f10523p + ")");
        this.f10508a.deInitSession();
    }

    /* renamed from: w */
    public void m63696w(CaptureSession captureSession) {
        boolean z;
        if (this.f10517j == ProcessorState.SESSION_INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid state state:" + this.f10517j);
        this.f10515h = new Camera2RequestProcessor(captureSession, m63705n(this.f10516i.getSurfaces()));
        Logger.m63178d("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + this.f10523p + ")");
        this.f10508a.onCaptureSessionStart(this.f10515h);
        this.f10517j = ProcessorState.ON_CAPTURE_SESSION_STARTED;
        SessionConfig sessionConfig = this.f10514g;
        if (sessionConfig != null) {
            mo63717b(sessionConfig);
        }
        if (this.f10518k != null) {
            mo63716c(this.f10518k);
            this.f10518k = null;
        }
    }

    /* renamed from: x */
    public final void m63695x(CaptureRequestOptions captureRequestOptions, CaptureRequestOptions captureRequestOptions2) {
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        builder.insertAllOptions(captureRequestOptions);
        builder.insertAllOptions(captureRequestOptions2);
        this.f10508a.setParameters(builder.build());
    }
}