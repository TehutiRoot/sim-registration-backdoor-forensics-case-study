package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.CameraEventCallbacks;
import androidx.camera.camera2.internal.C2417e;
import androidx.camera.camera2.internal.C2439m;
import androidx.camera.camera2.internal.CaptureSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.params.DynamicRangeConversions;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.params.InputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow;
import androidx.camera.camera2.internal.compat.workaround.TorchStateReset;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class CaptureSession implements InterfaceC0760Kl {

    /* renamed from: e */
    public C2436l f10384e;

    /* renamed from: f */
    public SynchronizedCaptureSession f10385f;

    /* renamed from: g */
    public SessionConfig f10386g;

    /* renamed from: l */
    public State f10391l;

    /* renamed from: m */
    public ListenableFuture f10392m;

    /* renamed from: n */
    public CallbackToFutureAdapter.Completer f10393n;

    /* renamed from: r */
    public final DynamicRangesCompat f10397r;

    /* renamed from: a */
    public final Object f10380a = new Object();

    /* renamed from: b */
    public final List f10381b = new ArrayList();

    /* renamed from: c */
    public final CameraCaptureSession.CaptureCallback f10382c = new C2360a();

    /* renamed from: h */
    public Config f10387h = OptionsBundle.emptyBundle();

    /* renamed from: i */
    public CameraEventCallbacks f10388i = CameraEventCallbacks.createEmptyCallback();

    /* renamed from: j */
    public final Map f10389j = new HashMap();

    /* renamed from: k */
    public List f10390k = Collections.emptyList();

    /* renamed from: o */
    public Map f10394o = new HashMap();

    /* renamed from: p */
    public final StillCaptureFlow f10395p = new StillCaptureFlow();

    /* renamed from: q */
    public final TorchStateReset f10396q = new TorchStateReset();

    /* renamed from: d */
    public final C2364e f10383d = new C2364e();

    /* loaded from: classes.dex */
    public enum State {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$a */
    /* loaded from: classes.dex */
    public class C2360a extends CameraCaptureSession.CaptureCallback {
        public C2360a() {
            CaptureSession.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$b */
    /* loaded from: classes.dex */
    public class C2361b implements FutureCallback {
        public C2361b() {
            CaptureSession.this = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            synchronized (CaptureSession.this.f10380a) {
                try {
                    CaptureSession.this.f10384e.m63371e();
                    int i = C2363d.f10401a[CaptureSession.this.f10391l.ordinal()];
                    if ((i == 4 || i == 6 || i == 7) && !(th2 instanceof CancellationException)) {
                        Logger.m63222w("CaptureSession", "Opening session with fail " + CaptureSession.this.f10391l, th2);
                        CaptureSession.this.m63798m();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$c */
    /* loaded from: classes.dex */
    public class C2362c extends CameraCaptureSession.CaptureCallback {
        public C2362c() {
            CaptureSession.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (CaptureSession.this.f10380a) {
                try {
                    SessionConfig sessionConfig = CaptureSession.this.f10386g;
                    if (sessionConfig == null) {
                        return;
                    }
                    CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
                    Logger.m63230d("CaptureSession", "Submit FLASH_MODE_OFF request");
                    CaptureSession captureSession = CaptureSession.this;
                    captureSession.mo63765c(Collections.singletonList(captureSession.f10396q.createTorchResetRequest(repeatingCaptureConfig)));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$d */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2363d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10401a;

        static {
            int[] iArr = new int[State.values().length];
            f10401a = iArr;
            try {
                iArr[State.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10401a[State.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10401a[State.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10401a[State.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10401a[State.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10401a[State.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10401a[State.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10401a[State.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$e */
    /* loaded from: classes.dex */
    public final class C2364e extends SynchronizedCaptureSession.StateCallback {
        public C2364e() {
            CaptureSession.this = r1;
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: f */
        public void mo52015f(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.f10380a) {
                try {
                    switch (C2363d.f10401a[CaptureSession.this.f10391l.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 8:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + CaptureSession.this.f10391l);
                        case 4:
                            CaptureSession captureSession = CaptureSession.this;
                            captureSession.f10391l = State.OPENED;
                            captureSession.f10385f = synchronizedCaptureSession;
                            if (captureSession.f10386g != null) {
                                List<CaptureConfig> onEnableSession = captureSession.f10388i.createComboCallback().onEnableSession();
                                if (!onEnableSession.isEmpty()) {
                                    CaptureSession captureSession2 = CaptureSession.this;
                                    captureSession2.m63795p(captureSession2.m63787x(onEnableSession));
                                }
                            }
                            Logger.m63230d("CaptureSession", "Attempting to send capture request onConfigured");
                            CaptureSession captureSession3 = CaptureSession.this;
                            captureSession3.m63793r(captureSession3.f10386g);
                            CaptureSession.this.m63794q();
                            break;
                        case 6:
                            CaptureSession.this.f10385f = synchronizedCaptureSession;
                            break;
                        case 7:
                            synchronizedCaptureSession.close();
                            break;
                    }
                    Logger.m63230d("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.f10391l);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: g */
        public void mo63365g(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.f10380a) {
                try {
                    if (C2363d.f10401a[CaptureSession.this.f10391l.ordinal()] != 1) {
                        Logger.m63230d("CaptureSession", "CameraCaptureSession.onReady() " + CaptureSession.this.f10391l);
                    } else {
                        throw new IllegalStateException("onReady() should not be possible in state: " + CaptureSession.this.f10391l);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: h */
        public void mo63364h(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.f10380a) {
                try {
                    if (CaptureSession.this.f10391l != State.UNINITIALIZED) {
                        Logger.m63230d("CaptureSession", "onSessionFinished()");
                        CaptureSession.this.m63798m();
                    } else {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + CaptureSession.this.f10391l);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.f10380a) {
                try {
                    switch (C2363d.f10401a[CaptureSession.this.f10391l.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + CaptureSession.this.f10391l);
                        case 4:
                        case 6:
                        case 7:
                            CaptureSession.this.m63798m();
                            break;
                        case 8:
                            Logger.m63230d("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    Logger.m63228e("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + CaptureSession.this.f10391l);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public CaptureSession(DynamicRangesCompat dynamicRangesCompat) {
        this.f10391l = State.UNINITIALIZED;
        this.f10391l = State.INITIALIZED;
        this.f10397r = dynamicRangesCompat;
    }

    /* renamed from: h */
    public static /* synthetic */ Object m63803h(CaptureSession captureSession, CallbackToFutureAdapter.Completer completer) {
        return captureSession.m63790u(completer);
    }

    /* renamed from: i */
    public static /* synthetic */ void m63802i(CaptureSession captureSession, CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        captureSession.m63792s(cameraCaptureSession, i, z);
    }

    /* renamed from: j */
    public static /* synthetic */ ListenableFuture m63801j(CaptureSession captureSession, SessionConfig sessionConfig, CameraDevice cameraDevice, List list) {
        return captureSession.m63791t(sessionConfig, cameraDevice, list);
    }

    /* renamed from: v */
    public static Config m63789v(List list) {
        MutableOptionsBundle create = MutableOptionsBundle.create();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Config implementationOptions = ((CaptureConfig) it.next()).getImplementationOptions();
            for (Config.Option<?> option : implementationOptions.listOptions()) {
                Object retrieveOption = implementationOptions.retrieveOption(option, null);
                if (create.containsOption(option)) {
                    Object retrieveOption2 = create.retrieveOption(option, null);
                    if (!Objects.equals(retrieveOption2, retrieveOption)) {
                        Logger.m63230d("CaptureSession", "Detect conflicting option " + option.getId() + " : " + retrieveOption + " != " + retrieveOption2);
                    }
                } else {
                    create.insertOption(option, retrieveOption);
                }
            }
        }
        return create;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0059 A[Catch: all -> 0x001c, TryCatch #1 {, blocks: (B:42:0x0003, B:43:0x000d, B:66:0x0091, B:45:0x0012, B:48:0x0018, B:54:0x0027, B:53:0x0020, B:55:0x002c, B:57:0x0059, B:58:0x005d, B:60:0x0061, B:61:0x006c, B:62:0x006e, B:64:0x0070, B:65:0x008d, B:69:0x0098, B:70:0x00b1), top: B:75:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0061 A[Catch: all -> 0x001c, TryCatch #1 {, blocks: (B:42:0x0003, B:43:0x000d, B:66:0x0091, B:45:0x0012, B:48:0x0018, B:54:0x0027, B:53:0x0020, B:55:0x002c, B:57:0x0059, B:58:0x005d, B:60:0x0061, B:61:0x006c, B:62:0x006e, B:64:0x0070, B:65:0x008d, B:69:0x0098, B:70:0x00b1), top: B:75:0x0003, inners: #0 }] */
    @Override // p000.InterfaceC0760Kl
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.ListenableFuture mo63767a(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f10380a
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.CaptureSession.C2363d.f10401a     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.f10391l     // Catch: java.lang.Throwable -> L1c
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L1c
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L1c
            switch(r1) {
                case 1: goto L98;
                case 2: goto L8d;
                case 3: goto L70;
                case 4: goto L2c;
                case 5: goto L12;
                case 6: goto L12;
                case 7: goto L5d;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> L1c
        L10:
            goto L91
        L12:
            androidx.camera.camera2.internal.SynchronizedCaptureSession r1 = r3.f10385f     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L2c
            if (r4 == 0) goto L27
            r1.abortCaptures()     // Catch: java.lang.Throwable -> L1c android.hardware.camera2.CameraAccessException -> L1f
            goto L27
        L1c:
            r4 = move-exception
            goto Lb2
        L1f:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            androidx.camera.core.Logger.m63227e(r1, r2, r4)     // Catch: java.lang.Throwable -> L1c
        L27:
            androidx.camera.camera2.internal.SynchronizedCaptureSession r4 = r3.f10385f     // Catch: java.lang.Throwable -> L1c
            r4.close()     // Catch: java.lang.Throwable -> L1c
        L2c:
            androidx.camera.camera2.impl.CameraEventCallbacks r4 = r3.f10388i     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.impl.CameraEventCallbacks$ComboCameraEventCallback r4 = r4.createComboCallback()     // Catch: java.lang.Throwable -> L1c
            r4.onDeInitSession()     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.CaptureSession$State r4 = androidx.camera.camera2.internal.CaptureSession.State.RELEASING     // Catch: java.lang.Throwable -> L1c
            r3.f10391l = r4     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.l r4 = r3.f10384e     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.f10391l     // Catch: java.lang.Throwable -> L1c
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1c
            androidx.core.util.Preconditions.checkNotNull(r4, r1)     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.l r4 = r3.f10384e     // Catch: java.lang.Throwable -> L1c
            boolean r4 = r4.m63371e()     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L5d
            r3.m63798m()     // Catch: java.lang.Throwable -> L1c
            goto L91
        L5d:
            com.google.common.util.concurrent.ListenableFuture r4 = r3.f10392m     // Catch: java.lang.Throwable -> L1c
            if (r4 != 0) goto L6c
            Il r4 = new Il     // Catch: java.lang.Throwable -> L1c
            r4.<init>()     // Catch: java.lang.Throwable -> L1c
            com.google.common.util.concurrent.ListenableFuture r4 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r4)     // Catch: java.lang.Throwable -> L1c
            r3.f10392m = r4     // Catch: java.lang.Throwable -> L1c
        L6c:
            com.google.common.util.concurrent.ListenableFuture r4 = r3.f10392m     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r4
        L70:
            androidx.camera.camera2.internal.l r4 = r3.f10384e     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.f10391l     // Catch: java.lang.Throwable -> L1c
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1c
            androidx.core.util.Preconditions.checkNotNull(r4, r1)     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.l r4 = r3.f10384e     // Catch: java.lang.Throwable -> L1c
            r4.m63371e()     // Catch: java.lang.Throwable -> L1c
        L8d:
            androidx.camera.camera2.internal.CaptureSession$State r4 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED     // Catch: java.lang.Throwable -> L1c
            r3.f10391l = r4     // Catch: java.lang.Throwable -> L1c
        L91:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            r4 = 0
            com.google.common.util.concurrent.ListenableFuture r4 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r4)
            return r4
        L98:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.f10391l     // Catch: java.lang.Throwable -> L1c
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        Lb2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.mo63767a(boolean):com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // p000.InterfaceC0760Kl
    /* renamed from: b */
    public void mo63766b(SessionConfig sessionConfig) {
        synchronized (this.f10380a) {
            try {
                switch (C2363d.f10401a[this.f10391l.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f10391l);
                    case 2:
                    case 3:
                    case 4:
                        this.f10386g = sessionConfig;
                        break;
                    case 5:
                        this.f10386g = sessionConfig;
                        if (sessionConfig == null) {
                            return;
                        }
                        if (!this.f10389j.keySet().containsAll(sessionConfig.getSurfaces())) {
                            Logger.m63228e("CaptureSession", "Does not have the proper configured lists");
                            return;
                        }
                        Logger.m63230d("CaptureSession", "Attempting to submit CaptureRequest after setting");
                        m63793r(this.f10386g);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // p000.InterfaceC0760Kl
    /* renamed from: c */
    public void mo63765c(List list) {
        synchronized (this.f10380a) {
            try {
                switch (C2363d.f10401a[this.f10391l.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f10391l);
                    case 2:
                    case 3:
                    case 4:
                        this.f10381b.addAll(list);
                        break;
                    case 5:
                        this.f10381b.addAll(list);
                        m63794q();
                        break;
                    case 6:
                    case 7:
                    case 8:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // p000.InterfaceC0760Kl
    public void close() {
        synchronized (this.f10380a) {
            int i = C2363d.f10401a[this.f10391l.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (this.f10386g != null) {
                                    List<CaptureConfig> onDisableSession = this.f10388i.createComboCallback().onDisableSession();
                                    if (!onDisableSession.isEmpty()) {
                                        try {
                                            mo63765c(m63787x(onDisableSession));
                                        } catch (IllegalStateException e) {
                                            Logger.m63227e("CaptureSession", "Unable to issue the request before close the capture session", e);
                                        }
                                    }
                                }
                            }
                        }
                        C2436l c2436l = this.f10384e;
                        Preconditions.checkNotNull(c2436l, "The Opener shouldn't null in state:" + this.f10391l);
                        this.f10384e.m63371e();
                        this.f10391l = State.CLOSED;
                        this.f10386g = null;
                    } else {
                        C2436l c2436l2 = this.f10384e;
                        Preconditions.checkNotNull(c2436l2, "The Opener shouldn't null in state:" + this.f10391l);
                        this.f10384e.m63371e();
                    }
                }
                this.f10391l = State.RELEASED;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + this.f10391l);
            }
        }
    }

    @Override // p000.InterfaceC0760Kl
    /* renamed from: d */
    public void mo63764d() {
        ArrayList<CaptureConfig> arrayList;
        synchronized (this.f10380a) {
            try {
                if (!this.f10381b.isEmpty()) {
                    arrayList = new ArrayList(this.f10381b);
                    this.f10381b.clear();
                } else {
                    arrayList = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            for (CaptureConfig captureConfig : arrayList) {
                for (CameraCaptureCallback cameraCaptureCallback : captureConfig.getCameraCaptureCallbacks()) {
                    cameraCaptureCallback.onCaptureCancelled();
                }
            }
        }
    }

    @Override // p000.InterfaceC0760Kl
    /* renamed from: e */
    public List mo63763e() {
        List unmodifiableList;
        synchronized (this.f10380a) {
            unmodifiableList = Collections.unmodifiableList(this.f10381b);
        }
        return unmodifiableList;
    }

    @Override // p000.InterfaceC0760Kl
    /* renamed from: f */
    public ListenableFuture mo63762f(final SessionConfig sessionConfig, final CameraDevice cameraDevice, C2436l c2436l) {
        synchronized (this.f10380a) {
            try {
                if (C2363d.f10401a[this.f10391l.ordinal()] != 2) {
                    Logger.m63228e("CaptureSession", "Open not allowed in state: " + this.f10391l);
                    return Futures.immediateFailedFuture(new IllegalStateException("open() should not allow the state: " + this.f10391l));
                }
                this.f10391l = State.GET_SURFACE;
                ArrayList arrayList = new ArrayList(sessionConfig.getSurfaces());
                this.f10390k = arrayList;
                this.f10384e = c2436l;
                FutureChain transformAsync = FutureChain.from(c2436l.m63372d(arrayList, CoroutineLiveDataKt.DEFAULT_TIMEOUT)).transformAsync(new AsyncFunction() { // from class: Jl
                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        return CaptureSession.m63801j(CaptureSession.this, sessionConfig, cameraDevice, (List) obj);
                    }
                }, this.f10384e.m63374b());
                Futures.addCallback(transformAsync, new C2361b(), this.f10384e.m63374b());
                return Futures.nonCancellationPropagating(transformAsync);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC0760Kl
    /* renamed from: g */
    public void mo63761g(Map map) {
        synchronized (this.f10380a) {
            this.f10394o = map;
        }
    }

    @Override // p000.InterfaceC0760Kl
    public SessionConfig getSessionConfig() {
        SessionConfig sessionConfig;
        synchronized (this.f10380a) {
            sessionConfig = this.f10386g;
        }
        return sessionConfig;
    }

    /* renamed from: k */
    public void m63800k() {
        synchronized (this.f10380a) {
            if (this.f10391l != State.OPENED) {
                Logger.m63228e("CaptureSession", "Unable to abort captures. Incorrect state:" + this.f10391l);
                return;
            }
            try {
                this.f10385f.abortCaptures();
            } catch (CameraAccessException e) {
                Logger.m63227e("CaptureSession", "Unable to abort captures.", e);
            }
        }
    }

    /* renamed from: l */
    public final CameraCaptureSession.CaptureCallback m63799l(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0129Bl.m68879a((CameraCaptureCallback) it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return Camera2CaptureCallbacks.m63812a(arrayList);
    }

    /* renamed from: m */
    public void m63798m() {
        State state = this.f10391l;
        State state2 = State.RELEASED;
        if (state == state2) {
            Logger.m63230d("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f10391l = state2;
        this.f10385f = null;
        CallbackToFutureAdapter.Completer completer = this.f10393n;
        if (completer != null) {
            completer.set(null);
            this.f10393n = null;
        }
    }

    /* renamed from: n */
    public final OutputConfigurationCompat m63797n(SessionConfig.OutputConfig outputConfig, Map map, String str) {
        long j;
        DynamicRangeProfiles dynamicRangeProfiles;
        Surface surface = (Surface) map.get(outputConfig.getSurface());
        Preconditions.checkNotNull(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        OutputConfigurationCompat outputConfigurationCompat = new OutputConfigurationCompat(outputConfig.getSurfaceGroupId(), surface);
        if (str != null) {
            outputConfigurationCompat.setPhysicalCameraId(str);
        } else {
            outputConfigurationCompat.setPhysicalCameraId(outputConfig.getPhysicalCameraId());
        }
        if (!outputConfig.getSharedSurfaces().isEmpty()) {
            outputConfigurationCompat.enableSurfaceSharing();
            for (DeferrableSurface deferrableSurface : outputConfig.getSharedSurfaces()) {
                Surface surface2 = (Surface) map.get(deferrableSurface);
                Preconditions.checkNotNull(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                outputConfigurationCompat.addSurface(surface2);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && (dynamicRangeProfiles = this.f10397r.toDynamicRangeProfiles()) != null) {
            DynamicRange dynamicRange = outputConfig.getDynamicRange();
            Long dynamicRangeToFirstSupportedProfile = DynamicRangeConversions.dynamicRangeToFirstSupportedProfile(dynamicRange, dynamicRangeProfiles);
            if (dynamicRangeToFirstSupportedProfile == null) {
                Logger.m63228e("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + dynamicRange);
            } else {
                j = dynamicRangeToFirstSupportedProfile.longValue();
                outputConfigurationCompat.setDynamicRangeProfile(j);
                return outputConfigurationCompat;
            }
        }
        j = 1;
        outputConfigurationCompat.setDynamicRangeProfile(j);
        return outputConfigurationCompat;
    }

    /* renamed from: o */
    public final List m63796o(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OutputConfigurationCompat outputConfigurationCompat = (OutputConfigurationCompat) it.next();
            if (!arrayList.contains(outputConfigurationCompat.getSurface())) {
                arrayList.add(outputConfigurationCompat.getSurface());
                arrayList2.add(outputConfigurationCompat);
            }
        }
        return arrayList2;
    }

    /* renamed from: p */
    public int m63795p(List list) {
        C2417e c2417e;
        ArrayList arrayList;
        boolean z;
        synchronized (this.f10380a) {
            try {
                if (this.f10391l != State.OPENED) {
                    Logger.m63230d("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                } else if (list.isEmpty()) {
                    return -1;
                } else {
                    try {
                        c2417e = new C2417e();
                        arrayList = new ArrayList();
                        Logger.m63230d("CaptureSession", "Issuing capture request.");
                        Iterator it = list.iterator();
                        z = false;
                        while (it.hasNext()) {
                            CaptureConfig captureConfig = (CaptureConfig) it.next();
                            if (captureConfig.getSurfaces().isEmpty()) {
                                Logger.m63230d("CaptureSession", "Skipping issuing empty capture request.");
                            } else {
                                Iterator<DeferrableSurface> it2 = captureConfig.getSurfaces().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        DeferrableSurface next = it2.next();
                                        if (!this.f10389j.containsKey(next)) {
                                            Logger.m63230d("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                            break;
                                        }
                                    } else {
                                        if (captureConfig.getTemplateType() == 2) {
                                            z = true;
                                        }
                                        CaptureConfig.Builder from = CaptureConfig.Builder.from(captureConfig);
                                        if (captureConfig.getTemplateType() == 5 && captureConfig.getCameraCaptureResult() != null) {
                                            from.setCameraCaptureResult(captureConfig.getCameraCaptureResult());
                                        }
                                        SessionConfig sessionConfig = this.f10386g;
                                        if (sessionConfig != null) {
                                            from.addImplementationOptions(sessionConfig.getRepeatingCaptureConfig().getImplementationOptions());
                                        }
                                        from.addImplementationOptions(this.f10387h);
                                        from.addImplementationOptions(captureConfig.getImplementationOptions());
                                        CaptureRequest m68216c = AbstractC0473Gi.m68216c(from.build(), this.f10385f.getDevice(), this.f10389j);
                                        if (m68216c == null) {
                                            Logger.m63230d("CaptureSession", "Skipping issuing request without surface.");
                                            return -1;
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        for (CameraCaptureCallback cameraCaptureCallback : captureConfig.getCameraCaptureCallbacks()) {
                                            AbstractC0129Bl.m68878b(cameraCaptureCallback, arrayList2);
                                        }
                                        c2417e.m63517a(m68216c, arrayList2);
                                        arrayList.add(m68216c);
                                    }
                                }
                            }
                        }
                    } catch (CameraAccessException e) {
                        Logger.m63228e("CaptureSession", "Unable to access camera: " + e.getMessage());
                        Thread.dumpStack();
                    }
                    if (!arrayList.isEmpty()) {
                        if (this.f10395p.shouldStopRepeatingBeforeCapture(arrayList, z)) {
                            this.f10385f.stopRepeating();
                            c2417e.m63515c(new C2417e.InterfaceC2418a() { // from class: Hl
                                {
                                    CaptureSession.this = this;
                                }

                                @Override // androidx.camera.camera2.internal.C2417e.InterfaceC2418a
                                /* renamed from: a */
                                public final void mo63514a(CameraCaptureSession cameraCaptureSession, int i, boolean z2) {
                                    CaptureSession.m63802i(CaptureSession.this, cameraCaptureSession, i, z2);
                                }
                            });
                        }
                        if (this.f10396q.isTorchResetRequired(arrayList, z)) {
                            c2417e.m63517a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new C2362c()));
                        }
                        return this.f10385f.captureBurstRequests(arrayList, c2417e);
                    }
                    Logger.m63230d("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                    return -1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: q */
    public void m63794q() {
        if (this.f10381b.isEmpty()) {
            return;
        }
        try {
            m63795p(this.f10381b);
        } finally {
            this.f10381b.clear();
        }
    }

    /* renamed from: r */
    public int m63793r(SessionConfig sessionConfig) {
        synchronized (this.f10380a) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
            if (sessionConfig == null) {
                Logger.m63230d("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            } else if (this.f10391l != State.OPENED) {
                Logger.m63230d("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            } else {
                CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
                if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
                    Logger.m63230d("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                    try {
                        this.f10385f.stopRepeating();
                    } catch (CameraAccessException e) {
                        Logger.m63228e("CaptureSession", "Unable to access camera: " + e.getMessage());
                        Thread.dumpStack();
                    }
                    return -1;
                }
                try {
                    Logger.m63230d("CaptureSession", "Issuing request for session.");
                    CaptureConfig.Builder from = CaptureConfig.Builder.from(repeatingCaptureConfig);
                    Config m63789v = m63789v(this.f10388i.createComboCallback().onRepeating());
                    this.f10387h = m63789v;
                    from.addImplementationOptions(m63789v);
                    CaptureRequest m68216c = AbstractC0473Gi.m68216c(from.build(), this.f10385f.getDevice(), this.f10389j);
                    if (m68216c == null) {
                        Logger.m63230d("CaptureSession", "Skipping issuing empty request for session.");
                        return -1;
                    }
                    return this.f10385f.setSingleRepeatingRequest(m68216c, m63799l(repeatingCaptureConfig.getCameraCaptureCallbacks(), this.f10382c));
                } catch (CameraAccessException e2) {
                    Logger.m63228e("CaptureSession", "Unable to access camera: " + e2.getMessage());
                    Thread.dumpStack();
                    return -1;
                }
                throw th2;
            }
        }
    }

    /* renamed from: s */
    public final /* synthetic */ void m63792s(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        synchronized (this.f10380a) {
            try {
                if (this.f10391l == State.OPENED) {
                    m63793r(this.f10386g);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: u */
    public final /* synthetic */ Object m63790u(CallbackToFutureAdapter.Completer completer) {
        boolean z;
        String str;
        synchronized (this.f10380a) {
            if (this.f10393n == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Release completer expected to be null");
            this.f10393n = completer;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    /* renamed from: w */
    public final ListenableFuture m63791t(List list, SessionConfig sessionConfig, CameraDevice cameraDevice) {
        synchronized (this.f10380a) {
            try {
                int i = C2363d.f10401a[this.f10391l.ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            return Futures.immediateFailedFuture(new CancellationException("openCaptureSession() not execute in state: " + this.f10391l));
                        }
                    } else {
                        this.f10389j.clear();
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            this.f10389j.put((DeferrableSurface) this.f10390k.get(i2), (Surface) list.get(i2));
                        }
                        this.f10391l = State.OPENING;
                        Logger.m63230d("CaptureSession", "Opening capture session.");
                        SynchronizedCaptureSession.StateCallback m63368j = C2439m.m63368j(this.f10383d, new C2439m.C2440a(sessionConfig.getSessionStateCallbacks()));
                        Camera2ImplConfig camera2ImplConfig = new Camera2ImplConfig(sessionConfig.getImplementationOptions());
                        CameraEventCallbacks cameraEventCallback = camera2ImplConfig.getCameraEventCallback(CameraEventCallbacks.createEmptyCallback());
                        this.f10388i = cameraEventCallback;
                        List<CaptureConfig> onInitSession = cameraEventCallback.createComboCallback().onInitSession();
                        CaptureConfig.Builder from = CaptureConfig.Builder.from(sessionConfig.getRepeatingCaptureConfig());
                        for (CaptureConfig captureConfig : onInitSession) {
                            from.addImplementationOptions(captureConfig.getImplementationOptions());
                        }
                        ArrayList arrayList = new ArrayList();
                        String physicalCameraId = camera2ImplConfig.getPhysicalCameraId(null);
                        for (SessionConfig.OutputConfig outputConfig : sessionConfig.getOutputConfigs()) {
                            OutputConfigurationCompat m63797n = m63797n(outputConfig, this.f10389j, physicalCameraId);
                            if (this.f10394o.containsKey(outputConfig.getSurface())) {
                                m63797n.setStreamUseCase(((Long) this.f10394o.get(outputConfig.getSurface())).longValue());
                            }
                            arrayList.add(m63797n);
                        }
                        SessionConfigurationCompat m63375a = this.f10384e.m63375a(0, m63796o(arrayList), m63368j);
                        if (sessionConfig.getTemplateType() == 5 && sessionConfig.getInputConfiguration() != null) {
                            m63375a.setInputConfiguration(InputConfigurationCompat.wrap(sessionConfig.getInputConfiguration()));
                        }
                        try {
                            CaptureRequest m68215d = AbstractC0473Gi.m68215d(from.build(), cameraDevice);
                            if (m68215d != null) {
                                m63375a.setSessionParameters(m68215d);
                            }
                            return this.f10384e.m63373c(cameraDevice, m63375a, this.f10390k);
                        } catch (CameraAccessException e) {
                            return Futures.immediateFailedFuture(e);
                        }
                    }
                }
                return Futures.immediateFailedFuture(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f10391l));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: x */
    public List m63787x(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CaptureConfig.Builder from = CaptureConfig.Builder.from((CaptureConfig) it.next());
            from.setTemplateType(1);
            for (DeferrableSurface deferrableSurface : this.f10386g.getRepeatingCaptureConfig().getSurfaces()) {
                from.addSurface(deferrableSurface);
            }
            arrayList.add(from.build());
        }
        return arrayList;
    }

    /* renamed from: y */
    public void m63786y() {
        synchronized (this.f10380a) {
            if (this.f10391l != State.OPENED) {
                Logger.m63228e("CaptureSession", "Unable to stop repeating. Incorrect state:" + this.f10391l);
                return;
            }
            try {
                this.f10385f.stopRepeating();
            } catch (CameraAccessException e) {
                Logger.m63227e("CaptureSession", "Unable to stop repeating.", e);
            }
        }
    }
}
