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
public final class ProcessingCaptureSession implements InterfaceC0760Kl {

    /* renamed from: q */
    public static List f10418q = new ArrayList();

    /* renamed from: r */
    public static int f10419r = 0;

    /* renamed from: a */
    public final SessionProcessor f10420a;

    /* renamed from: b */
    public final Camera2CameraInfoImpl f10421b;

    /* renamed from: c */
    public final Executor f10422c;

    /* renamed from: d */
    public final ScheduledExecutorService f10423d;

    /* renamed from: e */
    public final CaptureSession f10424e;

    /* renamed from: g */
    public SessionConfig f10426g;

    /* renamed from: h */
    public Camera2RequestProcessor f10427h;

    /* renamed from: i */
    public SessionConfig f10428i;

    /* renamed from: p */
    public int f10435p;

    /* renamed from: f */
    public List f10425f = new ArrayList();

    /* renamed from: k */
    public volatile List f10430k = null;

    /* renamed from: l */
    public volatile boolean f10431l = false;

    /* renamed from: n */
    public CaptureRequestOptions f10433n = new CaptureRequestOptions.Builder().build();

    /* renamed from: o */
    public CaptureRequestOptions f10434o = new CaptureRequestOptions.Builder().build();

    /* renamed from: j */
    public ProcessorState f10429j = ProcessorState.UNINITIALIZED;

    /* renamed from: m */
    public final C2369e f10432m = new C2369e();

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
    public class C2365a implements FutureCallback {
        public C2365a() {
            ProcessingCaptureSession.this = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            Logger.m63227e("ProcessingCaptureSession", "open session failed ", th2);
            ProcessingCaptureSession.this.close();
            ProcessingCaptureSession.this.mo63767a(false);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$b */
    /* loaded from: classes.dex */
    public class C2366b implements SessionProcessor.CaptureCallback {

        /* renamed from: a */
        public final /* synthetic */ CaptureConfig f10437a;

        public C2366b(CaptureConfig captureConfig) {
            ProcessingCaptureSession.this = r1;
            this.f10437a = captureConfig;
        }

        /* renamed from: a */
        public static /* synthetic */ void m63742a(CaptureConfig captureConfig) {
            m63739d(captureConfig);
        }

        /* renamed from: b */
        public static /* synthetic */ void m63741b(CaptureConfig captureConfig) {
            m63740c(captureConfig);
        }

        /* renamed from: c */
        public static /* synthetic */ void m63740c(CaptureConfig captureConfig) {
            for (CameraCaptureCallback cameraCaptureCallback : captureConfig.getCameraCaptureCallbacks()) {
                cameraCaptureCallback.onCaptureFailed(new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
            }
        }

        /* renamed from: d */
        public static /* synthetic */ void m63739d(CaptureConfig captureConfig) {
            for (CameraCaptureCallback cameraCaptureCallback : captureConfig.getCameraCaptureCallbacks()) {
                cameraCaptureCallback.onCaptureCompleted(new CameraCaptureResult.EmptyCameraCaptureResult());
            }
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureCompleted(long j, int i, Map map) {
            AbstractC20872lG1.m26534a(this, j, i, map);
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureFailed(int i) {
            Executor executor = ProcessingCaptureSession.this.f10422c;
            final CaptureConfig captureConfig = this.f10437a;
            executor.execute(new Runnable() { // from class: eo1
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessingCaptureSession.C2366b.m63741b(CaptureConfig.this);
                }
            });
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureProcessStarted(int i) {
            AbstractC20872lG1.m26532c(this, i);
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureSequenceAborted(int i) {
            AbstractC20872lG1.m26531d(this, i);
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceCompleted(int i) {
            Executor executor = ProcessingCaptureSession.this.f10422c;
            final CaptureConfig captureConfig = this.f10437a;
            executor.execute(new Runnable() { // from class: do1
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessingCaptureSession.C2366b.m63742a(CaptureConfig.this);
                }
            });
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureStarted(int i, long j) {
            AbstractC20872lG1.m26529f(this, i, j);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$c */
    /* loaded from: classes.dex */
    public class C2367c implements SessionProcessor.CaptureCallback {

        /* renamed from: a */
        public final /* synthetic */ CaptureConfig f10439a;

        public C2367c(CaptureConfig captureConfig) {
            ProcessingCaptureSession.this = r1;
            this.f10439a = captureConfig;
        }

        /* renamed from: a */
        public static /* synthetic */ void m63738a(CaptureConfig captureConfig) {
            m63735d(captureConfig);
        }

        /* renamed from: b */
        public static /* synthetic */ void m63737b(CaptureConfig captureConfig) {
            m63736c(captureConfig);
        }

        /* renamed from: c */
        public static /* synthetic */ void m63736c(CaptureConfig captureConfig) {
            for (CameraCaptureCallback cameraCaptureCallback : captureConfig.getCameraCaptureCallbacks()) {
                cameraCaptureCallback.onCaptureFailed(new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
            }
        }

        /* renamed from: d */
        public static /* synthetic */ void m63735d(CaptureConfig captureConfig) {
            for (CameraCaptureCallback cameraCaptureCallback : captureConfig.getCameraCaptureCallbacks()) {
                cameraCaptureCallback.onCaptureCompleted(new CameraCaptureResult.EmptyCameraCaptureResult());
            }
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureCompleted(long j, int i, Map map) {
            AbstractC20872lG1.m26534a(this, j, i, map);
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureFailed(int i) {
            Executor executor = ProcessingCaptureSession.this.f10422c;
            final CaptureConfig captureConfig = this.f10439a;
            executor.execute(new Runnable() { // from class: go1
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessingCaptureSession.C2367c.m63737b(CaptureConfig.this);
                }
            });
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureProcessStarted(int i) {
            AbstractC20872lG1.m26532c(this, i);
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureSequenceAborted(int i) {
            AbstractC20872lG1.m26531d(this, i);
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceCompleted(int i) {
            Executor executor = ProcessingCaptureSession.this.f10422c;
            final CaptureConfig captureConfig = this.f10439a;
            executor.execute(new Runnable() { // from class: fo1
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessingCaptureSession.C2367c.m63738a(CaptureConfig.this);
                }
            });
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public /* synthetic */ void onCaptureStarted(int i, long j) {
            AbstractC20872lG1.m26529f(this, i, j);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$d */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2368d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10441a;

        static {
            int[] iArr = new int[ProcessorState.values().length];
            f10441a = iArr;
            try {
                iArr[ProcessorState.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10441a[ProcessorState.SESSION_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10441a[ProcessorState.ON_CAPTURE_SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10441a[ProcessorState.ON_CAPTURE_SESSION_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10441a[ProcessorState.DE_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$e */
    /* loaded from: classes.dex */
    public static class C2369e implements SessionProcessor.CaptureCallback {
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
        this.f10435p = 0;
        this.f10424e = new CaptureSession(dynamicRangesCompat);
        this.f10420a = sessionProcessor;
        this.f10421b = camera2CameraInfoImpl;
        this.f10422c = executor;
        this.f10423d = scheduledExecutorService;
        int i = f10419r;
        f10419r = i + 1;
        this.f10435p = i;
        Logger.m63230d("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f10435p + ")");
    }

    /* renamed from: h */
    public static /* synthetic */ Void m63760h(ProcessingCaptureSession processingCaptureSession, Void r1) {
        return processingCaptureSession.m63747u(r1);
    }

    /* renamed from: i */
    public static /* synthetic */ void m63759i(DeferrableSurface deferrableSurface) {
        m63749s(deferrableSurface);
    }

    /* renamed from: j */
    public static /* synthetic */ ListenableFuture m63758j(ProcessingCaptureSession processingCaptureSession, SessionConfig sessionConfig, CameraDevice cameraDevice, C2436l c2436l, List list) {
        return processingCaptureSession.m63748t(sessionConfig, cameraDevice, c2436l, list);
    }

    /* renamed from: k */
    public static /* synthetic */ void m63757k(ProcessingCaptureSession processingCaptureSession) {
        processingCaptureSession.m63750r();
    }

    /* renamed from: l */
    public static /* synthetic */ void m63756l(ProcessingCaptureSession processingCaptureSession) {
        processingCaptureSession.m63746v();
    }

    /* renamed from: m */
    public static void m63755m(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (CameraCaptureCallback cameraCaptureCallback : ((CaptureConfig) it.next()).getCameraCaptureCallbacks()) {
                cameraCaptureCallback.onCaptureCancelled();
            }
        }
    }

    /* renamed from: n */
    public static List m63754n(List list) {
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
    public static /* synthetic */ void m63749s(DeferrableSurface deferrableSurface) {
        f10418q.remove(deferrableSurface);
    }

    @Override // p000.InterfaceC0760Kl
    /* renamed from: a */
    public ListenableFuture mo63767a(boolean z) {
        Logger.m63230d("ProcessingCaptureSession", "release (id=" + this.f10435p + ") mProcessorState=" + this.f10429j);
        ListenableFuture mo63767a = this.f10424e.mo63767a(z);
        int i = C2368d.f10441a[this.f10429j.ordinal()];
        if (i == 2 || i == 4) {
            mo63767a.addListener(new Runnable() { // from class: ao1
                {
                    ProcessingCaptureSession.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ProcessingCaptureSession.m63756l(ProcessingCaptureSession.this);
                }
            }, CameraXExecutors.directExecutor());
        }
        this.f10429j = ProcessorState.DE_INITIALIZED;
        return mo63767a;
    }

    @Override // p000.InterfaceC0760Kl
    /* renamed from: b */
    public void mo63766b(SessionConfig sessionConfig) {
        Logger.m63230d("ProcessingCaptureSession", "setSessionConfig (id=" + this.f10435p + ")");
        this.f10426g = sessionConfig;
        if (sessionConfig == null) {
            return;
        }
        Camera2RequestProcessor camera2RequestProcessor = this.f10427h;
        if (camera2RequestProcessor != null) {
            camera2RequestProcessor.updateSessionConfig(sessionConfig);
        }
        if (this.f10429j == ProcessorState.ON_CAPTURE_SESSION_STARTED) {
            CaptureRequestOptions build = CaptureRequestOptions.Builder.from(sessionConfig.getImplementationOptions()).build();
            this.f10433n = build;
            m63744x(build, this.f10434o);
            if (!m63753o(sessionConfig.getRepeatingCaptureConfig())) {
                this.f10420a.stopRepeating();
            } else {
                this.f10420a.startRepeating(this.f10432m);
            }
        }
    }

    @Override // p000.InterfaceC0760Kl
    /* renamed from: c */
    public void mo63765c(List list) {
        if (list.isEmpty()) {
            return;
        }
        Logger.m63230d("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f10435p + ") + state =" + this.f10429j);
        int i = C2368d.f10441a[this.f10429j.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4 || i == 5) {
                    Logger.m63230d("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f10429j);
                    m63755m(list);
                    return;
                }
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CaptureConfig captureConfig = (CaptureConfig) it.next();
                if (captureConfig.getTemplateType() == 2) {
                    m63752p(captureConfig);
                } else {
                    m63751q(captureConfig);
                }
            }
            return;
        }
        this.f10430k = list;
    }

    @Override // p000.InterfaceC0760Kl
    public void close() {
        Logger.m63230d("ProcessingCaptureSession", "close (id=" + this.f10435p + ") state=" + this.f10429j);
        if (this.f10429j == ProcessorState.ON_CAPTURE_SESSION_STARTED) {
            Logger.m63230d("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.f10435p + ")");
            this.f10420a.onCaptureSessionEnd();
            Camera2RequestProcessor camera2RequestProcessor = this.f10427h;
            if (camera2RequestProcessor != null) {
                camera2RequestProcessor.close();
            }
            this.f10429j = ProcessorState.ON_CAPTURE_SESSION_ENDED;
        }
        this.f10424e.close();
    }

    @Override // p000.InterfaceC0760Kl
    /* renamed from: d */
    public void mo63764d() {
        Logger.m63230d("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f10435p + ")");
        if (this.f10430k != null) {
            for (CaptureConfig captureConfig : this.f10430k) {
                for (CameraCaptureCallback cameraCaptureCallback : captureConfig.getCameraCaptureCallbacks()) {
                    cameraCaptureCallback.onCaptureCancelled();
                }
            }
            this.f10430k = null;
        }
    }

    @Override // p000.InterfaceC0760Kl
    /* renamed from: e */
    public List mo63763e() {
        if (this.f10430k != null) {
            return this.f10430k;
        }
        return Collections.emptyList();
    }

    @Override // p000.InterfaceC0760Kl
    /* renamed from: f */
    public ListenableFuture mo63762f(final SessionConfig sessionConfig, final CameraDevice cameraDevice, final C2436l c2436l) {
        boolean z;
        if (this.f10429j == ProcessorState.UNINITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid state state:" + this.f10429j);
        Preconditions.checkArgument(sessionConfig.getSurfaces().isEmpty() ^ true, "SessionConfig contains no surfaces");
        Logger.m63230d("ProcessingCaptureSession", "open (id=" + this.f10435p + ")");
        List<DeferrableSurface> surfaces = sessionConfig.getSurfaces();
        this.f10425f = surfaces;
        return FutureChain.from(DeferrableSurfaces.surfaceListWithTimeout(surfaces, false, CoroutineLiveDataKt.DEFAULT_TIMEOUT, this.f10422c, this.f10423d)).transformAsync(new AsyncFunction() { // from class: Yn1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return ProcessingCaptureSession.m63758j(ProcessingCaptureSession.this, sessionConfig, cameraDevice, c2436l, (List) obj);
            }
        }, this.f10422c).transform(new Function() { // from class: Zn1
            {
                ProcessingCaptureSession.this = this;
            }

            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ProcessingCaptureSession.m63760h(ProcessingCaptureSession.this, (Void) obj);
            }
        }, this.f10422c);
    }

    @Override // p000.InterfaceC0760Kl
    /* renamed from: g */
    public void mo63761g(Map map) {
    }

    @Override // p000.InterfaceC0760Kl
    public SessionConfig getSessionConfig() {
        return this.f10426g;
    }

    /* renamed from: o */
    public final boolean m63753o(CaptureConfig captureConfig) {
        for (DeferrableSurface deferrableSurface : captureConfig.getSurfaces()) {
            if (Objects.equals(deferrableSurface.getContainerClass(), Preview.class)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public void m63752p(CaptureConfig captureConfig) {
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
        this.f10434o = build;
        m63744x(this.f10433n, build);
        this.f10420a.startCapture(new C2367c(captureConfig));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0022  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m63751q(androidx.camera.core.impl.CaptureConfig r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ProcessingCaptureSession"
            java.lang.String r1 = "issueTriggerRequest"
            androidx.camera.core.Logger.m63230d(r0, r1)
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
            androidx.camera.core.impl.SessionProcessor r1 = r4.f10420a
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
            m63755m(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.ProcessingCaptureSession.m63751q(androidx.camera.core.impl.CaptureConfig):void");
    }

    /* renamed from: r */
    public final /* synthetic */ void m63750r() {
        DeferrableSurfaces.decrementAll(this.f10425f);
    }

    /* renamed from: t */
    public final /* synthetic */ ListenableFuture m63748t(SessionConfig sessionConfig, CameraDevice cameraDevice, C2436l c2436l, List list) {
        Logger.m63230d("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f10435p + ")");
        if (this.f10429j == ProcessorState.DE_INITIALIZED) {
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
        this.f10429j = ProcessorState.SESSION_INITIALIZED;
        try {
            DeferrableSurfaces.incrementAll(this.f10425f);
            Logger.m63223w("ProcessingCaptureSession", "== initSession (id=" + this.f10435p + ")");
            try {
                SessionConfig initSession = this.f10420a.initSession(this.f10421b, outputSurface, outputSurface2, outputSurface3);
                this.f10428i = initSession;
                initSession.getSurfaces().get(0).getTerminationFuture().addListener(new Runnable() { // from class: bo1
                    {
                        ProcessingCaptureSession.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ProcessingCaptureSession.m63757k(ProcessingCaptureSession.this);
                    }
                }, CameraXExecutors.directExecutor());
                for (final DeferrableSurface deferrableSurface2 : this.f10428i.getSurfaces()) {
                    f10418q.add(deferrableSurface2);
                    deferrableSurface2.getTerminationFuture().addListener(new Runnable() { // from class: co1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProcessingCaptureSession.m63759i(DeferrableSurface.this);
                        }
                    }, this.f10422c);
                }
                SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
                validatingBuilder.add(sessionConfig);
                validatingBuilder.clearSurfaces();
                validatingBuilder.add(this.f10428i);
                Preconditions.checkArgument(validatingBuilder.isValid(), "Cannot transform the SessionConfig");
                ListenableFuture mo63762f = this.f10424e.mo63762f(validatingBuilder.build(), (CameraDevice) Preconditions.checkNotNull(cameraDevice), c2436l);
                Futures.addCallback(mo63762f, new C2365a(), this.f10422c);
                return mo63762f;
            } catch (Throwable th2) {
                DeferrableSurfaces.decrementAll(this.f10425f);
                throw th2;
            }
        } catch (DeferrableSurface.SurfaceClosedException e) {
            return Futures.immediateFailedFuture(e);
        }
    }

    /* renamed from: u */
    public final /* synthetic */ Void m63747u(Void r1) {
        m63745w(this.f10424e);
        return null;
    }

    /* renamed from: v */
    public final /* synthetic */ void m63746v() {
        Logger.m63230d("ProcessingCaptureSession", "== deInitSession (id=" + this.f10435p + ")");
        this.f10420a.deInitSession();
    }

    /* renamed from: w */
    public void m63745w(CaptureSession captureSession) {
        boolean z;
        if (this.f10429j == ProcessorState.SESSION_INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid state state:" + this.f10429j);
        this.f10427h = new Camera2RequestProcessor(captureSession, m63754n(this.f10428i.getSurfaces()));
        Logger.m63230d("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + this.f10435p + ")");
        this.f10420a.onCaptureSessionStart(this.f10427h);
        this.f10429j = ProcessorState.ON_CAPTURE_SESSION_STARTED;
        SessionConfig sessionConfig = this.f10426g;
        if (sessionConfig != null) {
            mo63766b(sessionConfig);
        }
        if (this.f10430k != null) {
            mo63765c(this.f10430k);
            this.f10430k = null;
        }
    }

    /* renamed from: x */
    public final void m63744x(CaptureRequestOptions captureRequestOptions, CaptureRequestOptions captureRequestOptions2) {
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        builder.insertAllOptions(captureRequestOptions);
        builder.insertAllOptions(captureRequestOptions2);
        this.f10420a.setParameters(builder.build());
    }
}
