package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.C2425i;
import androidx.camera.camera2.internal.C2436l;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraState;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseAttachState;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.work.PeriodicWorkRequest;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class Camera2CameraImpl implements CameraInternal {

    /* renamed from: A */
    public CameraConfig f10295A;

    /* renamed from: B */
    public final Object f10296B;

    /* renamed from: C */
    public SessionProcessor f10297C;

    /* renamed from: D */
    public boolean f10298D;

    /* renamed from: E */
    public final DisplayInfoManager f10299E;

    /* renamed from: F */
    public final CameraCharacteristicsCompat f10300F;

    /* renamed from: G */
    public final DynamicRangesCompat f10301G;

    /* renamed from: a */
    public final UseCaseAttachState f10302a;

    /* renamed from: b */
    public final CameraManagerCompat f10303b;

    /* renamed from: c */
    public final Executor f10304c;

    /* renamed from: d */
    public final ScheduledExecutorService f10305d;

    /* renamed from: e */
    public volatile InternalState f10306e = InternalState.INITIALIZED;

    /* renamed from: f */
    public final LiveDataObservable f10307f;

    /* renamed from: g */
    public final C11554jk f10308g;

    /* renamed from: h */
    public final Camera2CameraControlImpl f10309h;

    /* renamed from: i */
    public final C2346g f10310i;

    /* renamed from: j */
    public final Camera2CameraInfoImpl f10311j;

    /* renamed from: k */
    public CameraDevice f10312k;

    /* renamed from: l */
    public int f10313l;

    /* renamed from: m */
    public InterfaceC0760Kl f10314m;

    /* renamed from: n */
    public final AtomicInteger f10315n;

    /* renamed from: o */
    public ListenableFuture f10316o;

    /* renamed from: p */
    public CallbackToFutureAdapter.Completer f10317p;

    /* renamed from: q */
    public final Map f10318q;

    /* renamed from: r */
    public final C2343d f10319r;

    /* renamed from: s */
    public final C2344e f10320s;

    /* renamed from: t */
    public final CameraCoordinator f10321t;

    /* renamed from: u */
    public final CameraStateRegistry f10322u;

    /* renamed from: v */
    public final Set f10323v;

    /* renamed from: w */
    public C2425i f10324w;

    /* renamed from: x */
    public final C2419f f10325x;

    /* renamed from: y */
    public final C2436l.C2437a f10326y;

    /* renamed from: z */
    public final Set f10327z;

    /* loaded from: classes.dex */
    public enum InternalState {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CONFIGURED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$a */
    /* loaded from: classes.dex */
    public class C2340a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0760Kl f10328a;

        public C2340a(InterfaceC0760Kl interfaceC0760Kl) {
            Camera2CameraImpl.this = r1;
            this.f10328a = interfaceC0760Kl;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r2) {
            CameraDevice cameraDevice;
            Camera2CameraImpl.this.f10318q.remove(this.f10328a);
            int i = C2342c.f10331a[Camera2CameraImpl.this.f10306e.ordinal()];
            if (i != 3) {
                if (i != 7) {
                    if (i != 8) {
                        return;
                    }
                } else if (Camera2CameraImpl.this.f10313l == 0) {
                    return;
                }
            }
            if (Camera2CameraImpl.this.m63905J() && (cameraDevice = Camera2CameraImpl.this.f10312k) != null) {
                ApiCompat.Api21Impl.close(cameraDevice);
                Camera2CameraImpl.this.f10312k = null;
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$b */
    /* loaded from: classes.dex */
    public class C2341b implements FutureCallback {
        public C2341b() {
            Camera2CameraImpl.this = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r2) {
            if (Camera2CameraImpl.this.f10321t.getCameraOperatingMode() == 2 && Camera2CameraImpl.this.f10306e == InternalState.OPENED) {
                Camera2CameraImpl.this.m63861n0(InternalState.CONFIGURED);
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            if (th2 instanceof DeferrableSurface.SurfaceClosedException) {
                SessionConfig m63913B = Camera2CameraImpl.this.m63913B(((DeferrableSurface.SurfaceClosedException) th2).getDeferrableSurface());
                if (m63913B != null) {
                    Camera2CameraImpl.this.m63875g0(m63913B);
                }
            } else if (th2 instanceof CancellationException) {
                Camera2CameraImpl.this.m63839z("Unable to configure camera cancelled");
            } else {
                InternalState internalState = Camera2CameraImpl.this.f10306e;
                InternalState internalState2 = InternalState.OPENED;
                if (internalState == internalState2) {
                    Camera2CameraImpl.this.m63859o0(internalState2, CameraState.StateError.create(4, th2));
                }
                if (th2 instanceof CameraAccessException) {
                    Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                    camera2CameraImpl.m63839z("Unable to configure camera due to " + th2.getMessage());
                } else if (th2 instanceof TimeoutException) {
                    Logger.m63228e("Camera2CameraImpl", "Unable to configure camera " + Camera2CameraImpl.this.f10311j.getCameraId() + ", timeout!");
                }
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2342c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10331a;

        static {
            int[] iArr = new int[InternalState.values().length];
            f10331a = iArr;
            try {
                iArr[InternalState.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10331a[InternalState.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10331a[InternalState.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10331a[InternalState.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10331a[InternalState.CONFIGURED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10331a[InternalState.OPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10331a[InternalState.REOPENING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10331a[InternalState.RELEASING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10331a[InternalState.RELEASED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$d */
    /* loaded from: classes.dex */
    public final class C2343d extends CameraManager.AvailabilityCallback implements CameraStateRegistry.OnOpenAvailableListener {

        /* renamed from: a */
        public final String f10332a;

        /* renamed from: b */
        public boolean f10333b = true;

        public C2343d(String str) {
            Camera2CameraImpl.this = r1;
            this.f10332a = str;
        }

        /* renamed from: a */
        public boolean m63836a() {
            return this.f10333b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (!this.f10332a.equals(str)) {
                return;
            }
            this.f10333b = true;
            if (Camera2CameraImpl.this.f10306e == InternalState.PENDING_OPEN) {
                Camera2CameraImpl.this.m63845v0(false);
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (!this.f10332a.equals(str)) {
                return;
            }
            this.f10333b = false;
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener
        public void onOpenAvailable() {
            if (Camera2CameraImpl.this.f10306e == InternalState.PENDING_OPEN) {
                Camera2CameraImpl.this.m63845v0(false);
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$e */
    /* loaded from: classes.dex */
    public final class C2344e implements CameraStateRegistry.OnConfigureAvailableListener {
        public C2344e() {
            Camera2CameraImpl.this = r1;
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener
        public void onConfigureAvailable() {
            if (Camera2CameraImpl.this.f10306e == InternalState.OPENED) {
                Camera2CameraImpl.this.m63879e0();
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$f */
    /* loaded from: classes.dex */
    public final class C2345f implements CameraControlInternal.ControlUpdateCallback {
        public C2345f() {
            Camera2CameraImpl.this = r1;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public void onCameraControlCaptureRequests(List list) {
            Camera2CameraImpl.this.m63855q0((List) Preconditions.checkNotNull(list));
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public void onCameraControlUpdateSessionConfig() {
            Camera2CameraImpl.this.m63843w0();
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$g */
    /* loaded from: classes.dex */
    public final class C2346g extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final Executor f10337a;

        /* renamed from: b */
        public final ScheduledExecutorService f10338b;

        /* renamed from: c */
        public RunnableC2348b f10339c;

        /* renamed from: d */
        public ScheduledFuture f10340d;

        /* renamed from: e */
        public final C2347a f10341e = new C2347a();

        /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$g$a */
        /* loaded from: classes.dex */
        public class C2347a {

            /* renamed from: a */
            public long f10343a = -1;

            public C2347a() {
                C2346g.this = r3;
            }

            /* renamed from: a */
            public boolean m63829a() {
                if (m63828b() >= m63826d()) {
                    m63825e();
                    return false;
                }
                return true;
            }

            /* renamed from: b */
            public long m63828b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f10343a == -1) {
                    this.f10343a = uptimeMillis;
                }
                return uptimeMillis - this.f10343a;
            }

            /* renamed from: c */
            public int m63827c() {
                if (!C2346g.this.m63830f()) {
                    return 700;
                }
                long m63828b = m63828b();
                if (m63828b <= 120000) {
                    return 1000;
                }
                if (m63828b <= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
                    return Constants.MAX_URL_LENGTH;
                }
                return 4000;
            }

            /* renamed from: d */
            public int m63826d() {
                if (!C2346g.this.m63830f()) {
                    return 10000;
                }
                return 1800000;
            }

            /* renamed from: e */
            public void m63825e() {
                this.f10343a = -1L;
            }
        }

        /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$g$b */
        /* loaded from: classes.dex */
        public class RunnableC2348b implements Runnable {

            /* renamed from: a */
            public Executor f10345a;

            /* renamed from: b */
            public boolean f10346b = false;

            public RunnableC2348b(Executor executor) {
                C2346g.this = r1;
                this.f10345a = executor;
            }

            /* renamed from: a */
            public static /* synthetic */ void m63824a(RunnableC2348b runnableC2348b) {
                runnableC2348b.m63822c();
            }

            /* renamed from: b */
            public void m63823b() {
                this.f10346b = true;
            }

            /* renamed from: c */
            public final /* synthetic */ void m63822c() {
                boolean z;
                if (!this.f10346b) {
                    if (Camera2CameraImpl.this.f10306e == InternalState.REOPENING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Preconditions.checkState(z);
                    if (C2346g.this.m63830f()) {
                        Camera2CameraImpl.this.m63847u0(true);
                    } else {
                        Camera2CameraImpl.this.m63845v0(true);
                    }
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f10345a.execute(new Runnable() { // from class: oi
                    {
                        Camera2CameraImpl.C2346g.RunnableC2348b.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Camera2CameraImpl.C2346g.RunnableC2348b.m63824a(Camera2CameraImpl.C2346g.RunnableC2348b.this);
                    }
                });
            }
        }

        public C2346g(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            Camera2CameraImpl.this = r1;
            this.f10337a = executor;
            this.f10338b = scheduledExecutorService;
        }

        /* renamed from: a */
        public boolean m63835a() {
            if (this.f10340d == null) {
                return false;
            }
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.m63839z("Cancelling scheduled re-open: " + this.f10339c);
            this.f10339c.m63823b();
            this.f10339c = null;
            this.f10340d.cancel(false);
            this.f10340d = null;
            return true;
        }

        /* renamed from: b */
        public final void m63834b(CameraDevice cameraDevice, int i) {
            boolean z;
            int i2;
            if (Camera2CameraImpl.this.f10306e != InternalState.OPENING && Camera2CameraImpl.this.f10306e != InternalState.OPENED && Camera2CameraImpl.this.f10306e != InternalState.CONFIGURED && Camera2CameraImpl.this.f10306e != InternalState.REOPENING) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkState(z, "Attempt to handle open error from non open state: " + Camera2CameraImpl.this.f10306e);
            if (i != 1 && i != 2 && i != 4) {
                Logger.m63228e("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + Camera2CameraImpl.m63911D(i) + " closing camera.");
                if (i == 3) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
                Camera2CameraImpl.this.m63859o0(InternalState.CLOSING, CameraState.StateError.create(i2));
                Camera2CameraImpl.this.m63846v(false);
                return;
            }
            Logger.m63230d("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), Camera2CameraImpl.m63911D(i)));
            m63833c(i);
        }

        /* renamed from: c */
        public final void m63833c(int i) {
            boolean z;
            int i2 = 1;
            if (Camera2CameraImpl.this.f10313l != 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i != 1) {
                if (i != 2) {
                    i2 = 3;
                }
            } else {
                i2 = 2;
            }
            Camera2CameraImpl.this.m63859o0(InternalState.REOPENING, CameraState.StateError.create(i2));
            Camera2CameraImpl.this.m63846v(false);
        }

        /* renamed from: d */
        public void m63832d() {
            this.f10341e.m63825e();
        }

        /* renamed from: e */
        public void m63831e() {
            boolean z;
            boolean z2 = true;
            if (this.f10339c == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            if (this.f10340d != null) {
                z2 = false;
            }
            Preconditions.checkState(z2);
            if (this.f10341e.m63829a()) {
                this.f10339c = new RunnableC2348b(this.f10337a);
                Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                camera2CameraImpl.m63839z("Attempting camera re-open in " + this.f10341e.m63827c() + "ms: " + this.f10339c + " activeResuming = " + Camera2CameraImpl.this.f10298D);
                this.f10340d = this.f10338b.schedule(this.f10339c, (long) this.f10341e.m63827c(), TimeUnit.MILLISECONDS);
                return;
            }
            Logger.m63228e("Camera2CameraImpl", "Camera reopening attempted for " + this.f10341e.m63826d() + "ms without success.");
            Camera2CameraImpl.this.m63857p0(InternalState.PENDING_OPEN, null, false);
        }

        /* renamed from: f */
        public boolean m63830f() {
            int i;
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            if (camera2CameraImpl.f10298D && ((i = camera2CameraImpl.f10313l) == 1 || i == 2)) {
                return true;
            }
            return false;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            boolean z;
            Camera2CameraImpl.this.m63839z("CameraDevice.onClosed()");
            if (Camera2CameraImpl.this.f10312k == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i = C2342c.f10331a[Camera2CameraImpl.this.f10306e.ordinal()];
            if (i != 3) {
                if (i != 7) {
                    if (i != 8) {
                        throw new IllegalStateException("Camera closed while in state: " + Camera2CameraImpl.this.f10306e);
                    }
                } else {
                    Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                    if (camera2CameraImpl.f10313l != 0) {
                        camera2CameraImpl.m63839z("Camera closed due to error: " + Camera2CameraImpl.m63911D(Camera2CameraImpl.this.f10313l));
                        m63831e();
                        return;
                    }
                    camera2CameraImpl.m63845v0(false);
                    return;
                }
            }
            Preconditions.checkState(Camera2CameraImpl.this.m63905J());
            Camera2CameraImpl.this.m63912C();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.m63839z("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.f10312k = cameraDevice;
            camera2CameraImpl.f10313l = i;
            switch (C2342c.f10331a[camera2CameraImpl.f10306e.ordinal()]) {
                case 3:
                case 8:
                    Logger.m63228e("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), Camera2CameraImpl.m63911D(i), Camera2CameraImpl.this.f10306e.name()));
                    Camera2CameraImpl.this.m63846v(false);
                    return;
                case 4:
                case 5:
                case 6:
                case 7:
                    Logger.m63230d("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), Camera2CameraImpl.m63911D(i), Camera2CameraImpl.this.f10306e.name()));
                    m63834b(cameraDevice, i);
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: " + Camera2CameraImpl.this.f10306e);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.m63839z("CameraDevice.onOpened()");
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.f10312k = cameraDevice;
            camera2CameraImpl.f10313l = 0;
            m63832d();
            int i = C2342c.f10331a[Camera2CameraImpl.this.f10306e.ordinal()];
            if (i != 3) {
                if (i != 6 && i != 7) {
                    if (i != 8) {
                        throw new IllegalStateException("onOpened() should not be possible from state: " + Camera2CameraImpl.this.f10306e);
                    }
                } else {
                    Camera2CameraImpl.this.m63861n0(InternalState.OPENED);
                    CameraStateRegistry cameraStateRegistry = Camera2CameraImpl.this.f10322u;
                    String id2 = cameraDevice.getId();
                    Camera2CameraImpl camera2CameraImpl2 = Camera2CameraImpl.this;
                    if (cameraStateRegistry.tryOpenCaptureSession(id2, camera2CameraImpl2.f10321t.getPairedConcurrentCameraId(camera2CameraImpl2.f10312k.getId()))) {
                        Camera2CameraImpl.this.m63879e0();
                        return;
                    }
                    return;
                }
            }
            Preconditions.checkState(Camera2CameraImpl.this.m63905J());
            Camera2CameraImpl.this.f10312k.close();
            Camera2CameraImpl.this.f10312k = null;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.Camera2CameraImpl$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2349h {
        /* renamed from: a */
        public static AbstractC2349h m63821a(String str, Class cls, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, Size size) {
            return new C2372b(str, cls, sessionConfig, useCaseConfig, size);
        }

        /* renamed from: b */
        public static AbstractC2349h m63820b(UseCase useCase) {
            return m63821a(Camera2CameraImpl.m63908G(useCase), useCase.getClass(), useCase.getSessionConfig(), useCase.getCurrentConfig(), useCase.getAttachedSurfaceResolution());
        }

        /* renamed from: c */
        public abstract SessionConfig mo63728c();

        /* renamed from: d */
        public abstract Size mo63727d();

        /* renamed from: e */
        public abstract UseCaseConfig mo63726e();

        /* renamed from: f */
        public abstract String mo63725f();

        /* renamed from: g */
        public abstract Class mo63724g();
    }

    public Camera2CameraImpl(CameraManagerCompat cameraManagerCompat, String str, Camera2CameraInfoImpl camera2CameraInfoImpl, CameraCoordinator cameraCoordinator, CameraStateRegistry cameraStateRegistry, Executor executor, Handler handler, DisplayInfoManager displayInfoManager) {
        LiveDataObservable liveDataObservable = new LiveDataObservable();
        this.f10307f = liveDataObservable;
        this.f10313l = 0;
        this.f10315n = new AtomicInteger(0);
        this.f10318q = new LinkedHashMap();
        this.f10323v = new HashSet();
        this.f10327z = new HashSet();
        this.f10295A = CameraConfigs.emptyConfig();
        this.f10296B = new Object();
        this.f10298D = false;
        this.f10303b = cameraManagerCompat;
        this.f10321t = cameraCoordinator;
        this.f10322u = cameraStateRegistry;
        ScheduledExecutorService newHandlerExecutor = CameraXExecutors.newHandlerExecutor(handler);
        this.f10305d = newHandlerExecutor;
        Executor newSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.f10304c = newSequentialExecutor;
        this.f10310i = new C2346g(newSequentialExecutor, newHandlerExecutor);
        this.f10302a = new UseCaseAttachState(str);
        liveDataObservable.postValue(CameraInternal.State.CLOSED);
        C11554jk c11554jk = new C11554jk(cameraStateRegistry);
        this.f10308g = c11554jk;
        C2419f c2419f = new C2419f(newSequentialExecutor);
        this.f10325x = c2419f;
        this.f10299E = displayInfoManager;
        try {
            CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str);
            this.f10300F = cameraCharacteristicsCompat;
            Camera2CameraControlImpl camera2CameraControlImpl = new Camera2CameraControlImpl(cameraCharacteristicsCompat, newHandlerExecutor, newSequentialExecutor, new C2345f(), camera2CameraInfoImpl.getCameraQuirks());
            this.f10309h = camera2CameraControlImpl;
            this.f10311j = camera2CameraInfoImpl;
            camera2CameraInfoImpl.m63817c(camera2CameraControlImpl);
            camera2CameraInfoImpl.m63814f(c11554jk.m29135a());
            this.f10301G = DynamicRangesCompat.fromCameraCharacteristics(cameraCharacteristicsCompat);
            this.f10314m = m63887a0();
            this.f10326y = new C2436l.C2437a(newSequentialExecutor, newHandlerExecutor, handler, c2419f, camera2CameraInfoImpl.getCameraQuirks(), DeviceQuirks.getAll());
            C2343d c2343d = new C2343d(str);
            this.f10319r = c2343d;
            C2344e c2344e = new C2344e();
            this.f10320s = c2344e;
            cameraStateRegistry.registerCamera(this, newSequentialExecutor, c2344e, c2343d);
            cameraManagerCompat.registerAvailabilityCallback(newSequentialExecutor, c2343d);
        } catch (CameraAccessExceptionCompat e) {
            throw CameraUnavailableExceptionHelper.createFrom(e);
        }
    }

    /* renamed from: D */
    public static String m63911D(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return "UNKNOWN ERROR";
                            }
                            return "ERROR_CAMERA_SERVICE";
                        }
                        return "ERROR_CAMERA_DEVICE";
                    }
                    return "ERROR_CAMERA_DISABLED";
                }
                return "ERROR_MAX_CAMERAS_IN_USE";
            }
            return "ERROR_CAMERA_IN_USE";
        }
        return "ERROR_NONE";
    }

    /* renamed from: E */
    public static String m63910E(C2425i c2425i) {
        return c2425i.m63441e() + c2425i.hashCode();
    }

    /* renamed from: G */
    public static String m63908G(UseCase useCase) {
        return useCase.getName() + useCase.hashCode();
    }

    /* renamed from: M */
    public static /* synthetic */ void m63902M(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* renamed from: V */
    public static /* synthetic */ void m63893V(SessionConfig.ErrorListener errorListener, SessionConfig sessionConfig) {
        errorListener.onError(sessionConfig, SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    /* renamed from: a */
    public static /* synthetic */ Object m63888a(Camera2CameraImpl camera2CameraImpl, CallbackToFutureAdapter.Completer completer) {
        return camera2CameraImpl.m63891X(completer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m63886b(SessionConfig.ErrorListener errorListener, SessionConfig sessionConfig) {
        m63893V(errorListener, sessionConfig);
    }

    /* renamed from: c */
    public static /* synthetic */ void m63884c(Camera2CameraImpl camera2CameraImpl, CallbackToFutureAdapter.Completer completer) {
        camera2CameraImpl.m63892W(completer);
    }

    /* renamed from: d */
    public static /* synthetic */ void m63882d(Camera2CameraImpl camera2CameraImpl, boolean z) {
        camera2CameraImpl.m63889Z(z);
    }

    /* renamed from: e */
    public static /* synthetic */ void m63880e(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
        camera2CameraImpl.m63890Y(str, sessionConfig, useCaseConfig);
    }

    /* renamed from: f */
    public static /* synthetic */ void m63878f(Camera2CameraImpl camera2CameraImpl, List list) {
        camera2CameraImpl.m63903L(list);
    }

    /* renamed from: g */
    public static /* synthetic */ void m63876g(Camera2CameraImpl camera2CameraImpl) {
        camera2CameraImpl.m63877f0();
    }

    /* renamed from: h */
    public static /* synthetic */ Object m63874h(Camera2CameraImpl camera2CameraImpl, CallbackToFutureAdapter.Completer completer) {
        return camera2CameraImpl.m63899P(completer);
    }

    /* renamed from: i */
    public static /* synthetic */ void m63872i(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
        camera2CameraImpl.m63894U(str, sessionConfig, useCaseConfig);
    }

    /* renamed from: k */
    public static /* synthetic */ void m63868k(Camera2CameraImpl camera2CameraImpl, CallbackToFutureAdapter.Completer completer) {
        camera2CameraImpl.m63898Q(completer);
    }

    /* renamed from: l */
    public static /* synthetic */ void m63866l(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
        camera2CameraImpl.m63896S(str, sessionConfig, useCaseConfig);
    }

    /* renamed from: m */
    public static /* synthetic */ Object m63864m(Camera2CameraImpl camera2CameraImpl, CallbackToFutureAdapter.Completer completer) {
        return camera2CameraImpl.m63897R(completer);
    }

    /* renamed from: n */
    public static /* synthetic */ void m63862n(Surface surface, SurfaceTexture surfaceTexture) {
        m63902M(surface, surfaceTexture);
    }

    /* renamed from: o */
    public static /* synthetic */ void m63860o(Camera2CameraImpl camera2CameraImpl, List list) {
        camera2CameraImpl.m63900O(list);
    }

    /* renamed from: q */
    public static /* synthetic */ void m63856q(Camera2CameraImpl camera2CameraImpl, String str) {
        camera2CameraImpl.m63895T(str);
    }

    /* renamed from: r */
    public static /* synthetic */ void m63854r(Camera2CameraImpl camera2CameraImpl) {
        camera2CameraImpl.m63844w();
    }

    /* renamed from: A */
    public final void m63914A(String str, Throwable th2) {
        Logger.m63229d("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th2);
    }

    /* renamed from: B */
    public SessionConfig m63913B(DeferrableSurface deferrableSurface) {
        for (SessionConfig sessionConfig : this.f10302a.getAttachedSessionConfigs()) {
            if (sessionConfig.getSurfaces().contains(deferrableSurface)) {
                return sessionConfig;
            }
        }
        return null;
    }

    /* renamed from: C */
    public void m63912C() {
        boolean z;
        if (this.f10306e != InternalState.RELEASING && this.f10306e != InternalState.CLOSING) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkState(z);
        Preconditions.checkState(this.f10318q.isEmpty());
        this.f10312k = null;
        if (this.f10306e == InternalState.CLOSING) {
            m63861n0(InternalState.INITIALIZED);
            return;
        }
        this.f10303b.unregisterAvailabilityCallback(this.f10319r);
        m63861n0(InternalState.RELEASED);
        CallbackToFutureAdapter.Completer completer = this.f10317p;
        if (completer != null) {
            completer.set(null);
            this.f10317p = null;
        }
    }

    /* renamed from: F */
    public final ListenableFuture m63909F() {
        if (this.f10316o == null) {
            if (this.f10306e != InternalState.RELEASED) {
                this.f10316o = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: ci
                    {
                        Camera2CameraImpl.this = this;
                    }

                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return Camera2CameraImpl.m63874h(Camera2CameraImpl.this, completer);
                    }
                });
            } else {
                this.f10316o = Futures.immediateFuture(null);
            }
        }
        return this.f10316o;
    }

    /* renamed from: H */
    public final boolean m63907H() {
        if (((Camera2CameraInfoImpl) getCameraInfoInternal()).m63818b() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public boolean m63906I() {
        try {
            return ((Boolean) CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: di
                {
                    Camera2CameraImpl.this = this;
                }

                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CameraImpl.m63864m(Camera2CameraImpl.this, completer);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
        }
    }

    /* renamed from: J */
    public boolean m63905J() {
        if (this.f10318q.isEmpty() && this.f10323v.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final /* synthetic */ void m63904K() {
        if (!m63906I()) {
            return;
        }
        m63863m0(m63910E(this.f10324w), this.f10324w.m63439g(), this.f10324w.m63438h());
    }

    /* renamed from: L */
    public final /* synthetic */ void m63903L(List list) {
        try {
            m63851s0(list);
        } finally {
            this.f10309h.m63943m();
        }
    }

    /* renamed from: P */
    public final /* synthetic */ Object m63899P(CallbackToFutureAdapter.Completer completer) {
        boolean z;
        if (this.f10317p == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Camera can only be released once, so release completer should be null on creation.");
        this.f10317p = completer;
        return "Release[camera=" + this + "]";
    }

    /* renamed from: Q */
    public final /* synthetic */ void m63898Q(CallbackToFutureAdapter.Completer completer) {
        C2425i c2425i = this.f10324w;
        if (c2425i == null) {
            completer.set(Boolean.FALSE);
            return;
        }
        completer.set(Boolean.valueOf(this.f10302a.isUseCaseAttached(m63910E(c2425i))));
    }

    /* renamed from: R */
    public final /* synthetic */ Object m63897R(final CallbackToFutureAdapter.Completer completer) {
        try {
            this.f10304c.execute(new Runnable() { // from class: ei
                {
                    Camera2CameraImpl.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraImpl.m63868k(Camera2CameraImpl.this, completer);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            completer.setException(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    /* renamed from: S */
    public final /* synthetic */ void m63896S(String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
        m63839z("Use case " + str + " ACTIVE");
        this.f10302a.setUseCaseActive(str, sessionConfig, useCaseConfig);
        this.f10302a.updateUseCase(str, sessionConfig, useCaseConfig);
        m63843w0();
    }

    /* renamed from: T */
    public final /* synthetic */ void m63895T(String str) {
        m63839z("Use case " + str + " INACTIVE");
        this.f10302a.setUseCaseInactive(str);
        m63843w0();
    }

    /* renamed from: U */
    public final /* synthetic */ void m63894U(String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
        m63839z("Use case " + str + " UPDATED");
        this.f10302a.updateUseCase(str, sessionConfig, useCaseConfig);
        m63843w0();
    }

    /* renamed from: W */
    public final /* synthetic */ void m63892W(CallbackToFutureAdapter.Completer completer) {
        Futures.propagate(m63873h0(), completer);
    }

    /* renamed from: X */
    public final /* synthetic */ Object m63891X(final CallbackToFutureAdapter.Completer completer) {
        this.f10304c.execute(new Runnable() { // from class: bi
            {
                Camera2CameraImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m63884c(Camera2CameraImpl.this, completer);
            }
        });
        return "Release[request=" + this.f10315n.getAndIncrement() + "]";
    }

    /* renamed from: Y */
    public final /* synthetic */ void m63890Y(String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
        m63839z("Use case " + str + " RESET");
        this.f10302a.updateUseCase(str, sessionConfig, useCaseConfig);
        m63850t();
        m63865l0(false);
        m63843w0();
        if (this.f10306e == InternalState.OPENED) {
            m63879e0();
        }
    }

    /* renamed from: Z */
    public final /* synthetic */ void m63889Z(boolean z) {
        this.f10298D = z;
        if (z && this.f10306e == InternalState.PENDING_OPEN) {
            m63847u0(false);
        }
    }

    /* renamed from: a0 */
    public final InterfaceC0760Kl m63887a0() {
        synchronized (this.f10296B) {
            try {
                if (this.f10297C == null) {
                    return new CaptureSession(this.f10301G);
                }
                return new ProcessingCaptureSession(this.f10297C, this.f10311j, this.f10301G, this.f10304c, this.f10305d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f10309h.m63932x();
        m63885b0(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(m63853r0(arrayList));
        try {
            this.f10304c.execute(new Runnable() { // from class: ii
                {
                    Camera2CameraImpl.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraImpl.m63878f(Camera2CameraImpl.this, arrayList2);
                }
            });
        } catch (RejectedExecutionException e) {
            m63914A("Unable to attach use cases.", e);
            this.f10309h.m63943m();
        }
    }

    /* renamed from: b0 */
    public final void m63885b0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            String m63908G = m63908G(useCase);
            if (!this.f10327z.contains(m63908G)) {
                this.f10327z.add(m63908G);
                useCase.onStateAttached();
                useCase.onCameraControlReady();
            }
        }
    }

    /* renamed from: c0 */
    public final void m63883c0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            String m63908G = m63908G(useCase);
            if (this.f10327z.contains(m63908G)) {
                useCase.onStateDetached();
                this.f10327z.remove(m63908G);
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void close() {
        this.f10304c.execute(new Runnable() { // from class: fi
            {
                Camera2CameraImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m63854r(Camera2CameraImpl.this);
            }
        });
    }

    /* renamed from: d0 */
    public final void m63881d0(boolean z) {
        if (!z) {
            this.f10310i.m63832d();
        }
        this.f10310i.m63835a();
        m63839z("Opening camera.");
        m63861n0(InternalState.OPENING);
        try {
            this.f10303b.openCamera(this.f10311j.getCameraId(), this.f10304c, m63840y());
        } catch (CameraAccessExceptionCompat e) {
            m63839z("Unable to open camera due to " + e.getMessage());
            if (e.getReason() == 10001) {
                m63859o0(InternalState.INITIALIZED, CameraState.StateError.create(7, e));
            }
        } catch (SecurityException e2) {
            m63839z("Unable to open camera due to " + e2.getMessage());
            m63861n0(InternalState.REOPENING);
            this.f10310i.m63831e();
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(m63853r0(arrayList));
        m63883c0(new ArrayList(arrayList));
        this.f10304c.execute(new Runnable() { // from class: Yh
            {
                Camera2CameraImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m63860o(Camera2CameraImpl.this, arrayList2);
            }
        });
    }

    /* renamed from: e0 */
    public void m63879e0() {
        boolean z;
        if (this.f10306e == InternalState.OPENED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        SessionConfig.ValidatingBuilder attachedBuilder = this.f10302a.getAttachedBuilder();
        if (!attachedBuilder.isValid()) {
            m63839z("Unable to create capture session due to conflicting configurations");
        } else if (!this.f10322u.tryOpenCaptureSession(this.f10312k.getId(), this.f10321t.getPairedConcurrentCameraId(this.f10312k.getId()))) {
            m63839z("Unable to create capture session in camera operating mode = " + this.f10321t.getCameraOperatingMode());
        } else {
            HashMap hashMap = new HashMap();
            StreamUseCaseUtil.populateSurfaceToStreamUseCaseMapping(this.f10302a.getAttachedSessionConfigs(), this.f10302a.getAttachedUseCaseConfigs(), hashMap);
            this.f10314m.mo63761g(hashMap);
            Futures.addCallback(this.f10314m.mo63762f(attachedBuilder.build(), (CameraDevice) Preconditions.checkNotNull(this.f10312k), this.f10326y.m63370a()), new C2341b(), this.f10304c);
        }
    }

    /* renamed from: f0 */
    public final void m63877f0() {
        int i = C2342c.f10331a[this.f10306e.ordinal()];
        boolean z = false;
        if (i != 1 && i != 2) {
            if (i != 3) {
                m63839z("open() ignored due to being in state: " + this.f10306e);
                return;
            }
            m63861n0(InternalState.REOPENING);
            if (!m63905J() && this.f10313l == 0) {
                if (this.f10312k != null) {
                    z = true;
                }
                Preconditions.checkState(z, "Camera Device should be open if session close is not complete");
                m63861n0(InternalState.OPENED);
                m63879e0();
                return;
            }
            return;
        }
        m63847u0(false);
    }

    /* renamed from: g0 */
    public void m63875g0(final SessionConfig sessionConfig) {
        ScheduledExecutorService mainThreadExecutor = CameraXExecutors.mainThreadExecutor();
        List<SessionConfig.ErrorListener> errorListeners = sessionConfig.getErrorListeners();
        if (!errorListeners.isEmpty()) {
            final SessionConfig.ErrorListener errorListener = errorListeners.get(0);
            m63914A("Posting surface closed", new Throwable());
            mainThreadExecutor.execute(new Runnable() { // from class: Xh
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraImpl.m63886b(SessionConfig.ErrorListener.this, sessionConfig);
                }
            });
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ CameraControl getCameraControl() {
        return AbstractC1629Wj.m65576a(this);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public CameraControlInternal getCameraControlInternal() {
        return this.f10309h;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ CameraInfo getCameraInfo() {
        return AbstractC1629Wj.m65575b(this);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public CameraInfoInternal getCameraInfoInternal() {
        return this.f10311j;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ LinkedHashSet getCameraInternals() {
        return AbstractC1629Wj.m65574c(this);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public Observable getCameraState() {
        return this.f10307f;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public CameraConfig getExtendedConfig() {
        return this.f10295A;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public /* synthetic */ boolean getHasTransform() {
        return AbstractC1629Wj.m65572e(this);
    }

    /* renamed from: h0 */
    public final ListenableFuture m63873h0() {
        ListenableFuture m63909F = m63909F();
        boolean z = false;
        switch (C2342c.f10331a[this.f10306e.ordinal()]) {
            case 1:
            case 2:
                if (this.f10312k == null) {
                    z = true;
                }
                Preconditions.checkState(z);
                m63861n0(InternalState.RELEASING);
                Preconditions.checkState(m63905J());
                m63912C();
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                boolean m63835a = this.f10310i.m63835a();
                m63861n0(InternalState.RELEASING);
                if (m63835a) {
                    Preconditions.checkState(m63905J());
                    m63912C();
                    break;
                }
                break;
            case 4:
            case 5:
                m63861n0(InternalState.RELEASING);
                m63846v(false);
                break;
            default:
                m63839z("release() ignored due to being in state: " + this.f10306e);
                break;
        }
        return m63909F;
    }

    /* renamed from: i0 */
    public void m63901N(CaptureSession captureSession, DeferrableSurface deferrableSurface, Runnable runnable) {
        this.f10323v.remove(captureSession);
        ListenableFuture m63869j0 = m63869j0(captureSession, false);
        deferrableSurface.close();
        Futures.successfulAsList(Arrays.asList(m63869j0, deferrableSurface.getTerminationFuture())).addListener(runnable, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public /* synthetic */ boolean isFrontFacing() {
        return AbstractC1629Wj.m65571f(this);
    }

    @Override // androidx.camera.core.Camera
    public /* synthetic */ boolean isUseCasesCombinationSupported(UseCase... useCaseArr) {
        return AbstractC14018th.m22372a(this, useCaseArr);
    }

    /* renamed from: j0 */
    public ListenableFuture m63869j0(InterfaceC0760Kl interfaceC0760Kl, boolean z) {
        interfaceC0760Kl.close();
        ListenableFuture mo63767a = interfaceC0760Kl.mo63767a(z);
        m63839z("Releasing session in state " + this.f10306e.name());
        this.f10318q.put(interfaceC0760Kl, mo63767a);
        Futures.addCallback(mo63767a, new C2340a(interfaceC0760Kl), CameraXExecutors.directExecutor());
        return mo63767a;
    }

    /* renamed from: k0 */
    public final void m63867k0() {
        if (this.f10324w != null) {
            UseCaseAttachState useCaseAttachState = this.f10302a;
            useCaseAttachState.setUseCaseDetached(this.f10324w.m63441e() + this.f10324w.hashCode());
            UseCaseAttachState useCaseAttachState2 = this.f10302a;
            useCaseAttachState2.setUseCaseInactive(this.f10324w.m63441e() + this.f10324w.hashCode());
            this.f10324w.m63443c();
            this.f10324w = null;
        }
    }

    /* renamed from: l0 */
    public void m63865l0(boolean z) {
        boolean z2;
        if (this.f10314m != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z2);
        m63839z("Resetting Capture Session");
        InterfaceC0760Kl interfaceC0760Kl = this.f10314m;
        SessionConfig sessionConfig = interfaceC0760Kl.getSessionConfig();
        List mo63763e = interfaceC0760Kl.mo63763e();
        InterfaceC0760Kl m63887a0 = m63887a0();
        this.f10314m = m63887a0;
        m63887a0.mo63766b(sessionConfig);
        this.f10314m.mo63765c(mo63763e);
        m63869j0(interfaceC0760Kl, z);
    }

    /* renamed from: m0 */
    public final void m63863m0(final String str, final SessionConfig sessionConfig, final UseCaseConfig useCaseConfig) {
        this.f10304c.execute(new Runnable() { // from class: ji
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m63880e(Camera2CameraImpl.this, str, sessionConfig, useCaseConfig);
            }
        });
    }

    /* renamed from: n0 */
    public void m63861n0(InternalState internalState) {
        m63859o0(internalState, null);
    }

    /* renamed from: o0 */
    public void m63859o0(InternalState internalState, CameraState.StateError stateError) {
        m63857p0(internalState, stateError, true);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        final String m63908G = m63908G(useCase);
        final SessionConfig sessionConfig = useCase.getSessionConfig();
        final UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
        this.f10304c.execute(new Runnable() { // from class: mi
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m63866l(Camera2CameraImpl.this, m63908G, sessionConfig, currentConfig);
            }
        });
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        final String m63908G = m63908G(useCase);
        this.f10304c.execute(new Runnable() { // from class: li
            {
                Camera2CameraImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m63856q(Camera2CameraImpl.this, m63908G);
            }
        });
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        m63863m0(m63908G(useCase), useCase.getSessionConfig(), useCase.getCurrentConfig());
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        final String m63908G = m63908G(useCase);
        final SessionConfig sessionConfig = useCase.getSessionConfig();
        final UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
        this.f10304c.execute(new Runnable() { // from class: ki
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m63872i(Camera2CameraImpl.this, m63908G, sessionConfig, currentConfig);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
        this.f10304c.execute(new Runnable() { // from class: Wh
            {
                Camera2CameraImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m63876g(Camera2CameraImpl.this);
            }
        });
    }

    /* renamed from: p0 */
    public void m63857p0(InternalState internalState, CameraState.StateError stateError, boolean z) {
        CameraInternal.State state;
        m63839z("Transitioning camera internal state: " + this.f10306e + " --> " + internalState);
        this.f10306e = internalState;
        switch (C2342c.f10331a[internalState.ordinal()]) {
            case 1:
                state = CameraInternal.State.CLOSED;
                break;
            case 2:
                state = CameraInternal.State.PENDING_OPEN;
                break;
            case 3:
                state = CameraInternal.State.CLOSING;
                break;
            case 4:
                state = CameraInternal.State.OPEN;
                break;
            case 5:
                state = CameraInternal.State.CONFIGURED;
                break;
            case 6:
            case 7:
                state = CameraInternal.State.OPENING;
                break;
            case 8:
                state = CameraInternal.State.RELEASING;
                break;
            case 9:
                state = CameraInternal.State.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + internalState);
        }
        this.f10322u.markCameraState(this, state, z);
        this.f10307f.postValue(state);
        this.f10308g.m29133c(state, stateError);
    }

    /* renamed from: q0 */
    public void m63855q0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CaptureConfig captureConfig = (CaptureConfig) it.next();
            CaptureConfig.Builder from = CaptureConfig.Builder.from(captureConfig);
            if (captureConfig.getTemplateType() == 5 && captureConfig.getCameraCaptureResult() != null) {
                from.setCameraCaptureResult(captureConfig.getCameraCaptureResult());
            }
            if (!captureConfig.getSurfaces().isEmpty() || !captureConfig.isUseRepeatingSurface() || m63848u(from)) {
                arrayList.add(from.build());
            }
        }
        m63839z("Issue capture request");
        this.f10314m.mo63765c(arrayList);
    }

    /* renamed from: r0 */
    public final Collection m63853r0(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2349h.m63820b((UseCase) it.next()));
        }
        return arrayList;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public ListenableFuture release() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: ni
            {
                Camera2CameraImpl.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraImpl.m63888a(Camera2CameraImpl.this, completer);
            }
        });
    }

    /* renamed from: s */
    public final void m63852s() {
        C2425i c2425i = this.f10324w;
        if (c2425i != null) {
            String m63910E = m63910E(c2425i);
            this.f10302a.setUseCaseAttached(m63910E, this.f10324w.m63439g(), this.f10324w.m63438h());
            this.f10302a.setUseCaseActive(m63910E, this.f10324w.m63439g(), this.f10324w.m63438h());
        }
    }

    /* renamed from: s0 */
    public final void m63851s0(Collection collection) {
        Size mo63727d;
        boolean isEmpty = this.f10302a.getAttachedSessionConfigs().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        Rational rational = null;
        while (it.hasNext()) {
            AbstractC2349h abstractC2349h = (AbstractC2349h) it.next();
            if (!this.f10302a.isUseCaseAttached(abstractC2349h.mo63725f())) {
                this.f10302a.setUseCaseAttached(abstractC2349h.mo63725f(), abstractC2349h.mo63728c(), abstractC2349h.mo63726e());
                arrayList.add(abstractC2349h.mo63725f());
                if (abstractC2349h.mo63724g() == Preview.class && (mo63727d = abstractC2349h.mo63727d()) != null) {
                    rational = new Rational(mo63727d.getWidth(), mo63727d.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m63839z("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (isEmpty) {
            this.f10309h.m63961P(true);
            this.f10309h.m63932x();
        }
        m63850t();
        m63841x0();
        m63843w0();
        m63865l0(false);
        if (this.f10306e == InternalState.OPENED) {
            m63879e0();
        } else {
            m63877f0();
        }
        if (rational != null) {
            this.f10309h.setPreviewAspectRatio(rational);
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setActiveResumingMode(final boolean z) {
        this.f10304c.execute(new Runnable() { // from class: Zh
            {
                Camera2CameraImpl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m63882d(Camera2CameraImpl.this, z);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public void setExtendedConfig(CameraConfig cameraConfig) {
        if (cameraConfig == null) {
            cameraConfig = CameraConfigs.emptyConfig();
        }
        SessionProcessor sessionProcessor = cameraConfig.getSessionProcessor(null);
        this.f10295A = cameraConfig;
        synchronized (this.f10296B) {
            this.f10297C = sessionProcessor;
        }
    }

    /* renamed from: t */
    public final void m63850t() {
        SessionConfig build = this.f10302a.getAttachedBuilder().build();
        CaptureConfig repeatingCaptureConfig = build.getRepeatingCaptureConfig();
        int size = repeatingCaptureConfig.getSurfaces().size();
        int size2 = build.getSurfaces().size();
        if (!build.getSurfaces().isEmpty()) {
            if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
                if (this.f10324w == null) {
                    this.f10324w = new C2425i(this.f10311j.getCameraCharacteristicsCompat(), this.f10299E, new C2425i.InterfaceC2428c() { // from class: ai
                        @Override // androidx.camera.camera2.internal.C2425i.InterfaceC2428c
                        /* renamed from: a */
                        public final void mo63434a() {
                            Camera2CameraImpl.this.m63904K();
                        }
                    });
                }
                m63852s();
            } else if (size2 == 1 && size == 1) {
                m63867k0();
            } else if (size >= 2) {
                m63867k0();
            } else {
                Logger.m63230d("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
            }
        }
    }

    /* renamed from: t0 */
    public final void m63900O(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AbstractC2349h abstractC2349h = (AbstractC2349h) it.next();
            if (this.f10302a.isUseCaseAttached(abstractC2349h.mo63725f())) {
                this.f10302a.removeUseCase(abstractC2349h.mo63725f());
                arrayList.add(abstractC2349h.mo63725f());
                if (abstractC2349h.mo63724g() == Preview.class) {
                    z = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m63839z("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z) {
            this.f10309h.setPreviewAspectRatio(null);
        }
        m63850t();
        if (this.f10302a.getAttachedUseCaseConfigs().isEmpty()) {
            this.f10309h.setZslDisabledByUserCaseConfig(false);
        } else {
            m63841x0();
        }
        if (this.f10302a.getAttachedSessionConfigs().isEmpty()) {
            this.f10309h.m63943m();
            m63865l0(false);
            this.f10309h.m63961P(false);
            this.f10314m = m63887a0();
            m63844w();
            return;
        }
        m63843w0();
        m63865l0(false);
        if (this.f10306e == InternalState.OPENED) {
            m63879e0();
        }
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f10311j.getCameraId());
    }

    /* renamed from: u */
    public final boolean m63848u(CaptureConfig.Builder builder) {
        if (!builder.getSurfaces().isEmpty()) {
            Logger.m63223w("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        for (SessionConfig sessionConfig : this.f10302a.getActiveAndAttachedSessionConfigs()) {
            List<DeferrableSurface> surfaces = sessionConfig.getRepeatingCaptureConfig().getSurfaces();
            if (!surfaces.isEmpty()) {
                for (DeferrableSurface deferrableSurface : surfaces) {
                    builder.addSurface(deferrableSurface);
                }
            }
        }
        if (builder.getSurfaces().isEmpty()) {
            Logger.m63223w("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
            return false;
        }
        return true;
    }

    /* renamed from: u0 */
    public void m63847u0(boolean z) {
        m63839z("Attempting to force open the camera.");
        if (!this.f10322u.tryOpenCamera(this)) {
            m63839z("No cameras available. Waiting for available camera before opening camera.");
            m63861n0(InternalState.PENDING_OPEN);
            return;
        }
        m63881d0(z);
    }

    /* renamed from: v */
    public void m63846v(boolean z) {
        boolean z2;
        if (this.f10306e != InternalState.CLOSING && this.f10306e != InternalState.RELEASING && (this.f10306e != InternalState.REOPENING || this.f10313l == 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        Preconditions.checkState(z2, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f10306e + " (error: " + m63911D(this.f10313l) + ")");
        int i = Build.VERSION.SDK_INT;
        if (i > 23 && i < 29 && m63907H() && this.f10313l == 0) {
            m63842x(z);
        } else {
            m63865l0(z);
        }
        this.f10314m.mo63764d();
    }

    /* renamed from: v0 */
    public void m63845v0(boolean z) {
        m63839z("Attempting to open the camera.");
        if (this.f10319r.m63836a() && this.f10322u.tryOpenCamera(this)) {
            m63881d0(z);
            return;
        }
        m63839z("No cameras available. Waiting for available camera before opening camera.");
        m63861n0(InternalState.PENDING_OPEN);
    }

    /* renamed from: w */
    public final void m63844w() {
        m63839z("Closing camera.");
        int i = C2342c.f10331a[this.f10306e.ordinal()];
        boolean z = false;
        if (i != 2) {
            if (i != 4 && i != 5) {
                if (i != 6 && i != 7) {
                    m63839z("close() ignored due to being in state: " + this.f10306e);
                    return;
                }
                boolean m63835a = this.f10310i.m63835a();
                m63861n0(InternalState.CLOSING);
                if (m63835a) {
                    Preconditions.checkState(m63905J());
                    m63912C();
                    return;
                }
                return;
            }
            m63861n0(InternalState.CLOSING);
            m63846v(false);
            return;
        }
        if (this.f10312k == null) {
            z = true;
        }
        Preconditions.checkState(z);
        m63861n0(InternalState.INITIALIZED);
    }

    /* renamed from: w0 */
    public void m63843w0() {
        SessionConfig.ValidatingBuilder activeAndAttachedBuilder = this.f10302a.getActiveAndAttachedBuilder();
        if (activeAndAttachedBuilder.isValid()) {
            this.f10309h.m63960Q(activeAndAttachedBuilder.build().getTemplateType());
            activeAndAttachedBuilder.add(this.f10309h.getSessionConfig());
            this.f10314m.mo63766b(activeAndAttachedBuilder.build());
            return;
        }
        this.f10309h.m63962O();
        this.f10314m.mo63766b(this.f10309h.getSessionConfig());
    }

    /* renamed from: x */
    public final void m63842x(boolean z) {
        final CaptureSession captureSession = new CaptureSession(this.f10301G);
        this.f10323v.add(captureSession);
        m63865l0(z);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final Runnable runnable = new Runnable() { // from class: gi
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.m63862n(surface, surfaceTexture);
            }
        };
        SessionConfig.Builder builder = new SessionConfig.Builder();
        final ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        builder.addNonRepeatingSurface(immediateSurface);
        builder.setTemplateType(1);
        m63839z("Start configAndClose.");
        captureSession.mo63762f(builder.build(), (CameraDevice) Preconditions.checkNotNull(this.f10312k), this.f10326y.m63370a()).addListener(new Runnable() { // from class: hi
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.this.m63901N(captureSession, immediateSurface, runnable);
            }
        }, this.f10304c);
    }

    /* renamed from: x0 */
    public final void m63841x0() {
        boolean z = false;
        for (UseCaseConfig<?> useCaseConfig : this.f10302a.getAttachedUseCaseConfigs()) {
            z |= useCaseConfig.isZslDisabled(false);
        }
        this.f10309h.setZslDisabledByUserCaseConfig(z);
    }

    /* renamed from: y */
    public final CameraDevice.StateCallback m63840y() {
        ArrayList arrayList = new ArrayList(this.f10302a.getAttachedBuilder().build().getDeviceStateCallbacks());
        arrayList.add(this.f10325x.m63511c());
        arrayList.add(this.f10310i);
        return CameraDeviceStateCallbacks.createComboCallback(arrayList);
    }

    /* renamed from: z */
    public void m63839z(String str) {
        m63914A(str, null);
    }
}
