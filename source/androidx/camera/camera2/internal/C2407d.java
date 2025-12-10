package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.C2407d;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture;
import androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.camera2.internal.d */
/* loaded from: classes.dex */
public class C2407d {

    /* renamed from: h */
    public static final Set f10580h = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AfState.PASSIVE_FOCUSED, CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED, CameraCaptureMetaData.AfState.LOCKED_FOCUSED, CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED));

    /* renamed from: i */
    public static final Set f10581i = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AwbState.CONVERGED, CameraCaptureMetaData.AwbState.UNKNOWN));

    /* renamed from: j */
    public static final Set f10582j;

    /* renamed from: k */
    public static final Set f10583k;

    /* renamed from: a */
    public final Camera2CameraControlImpl f10584a;

    /* renamed from: b */
    public final UseTorchAsFlash f10585b;

    /* renamed from: c */
    public final boolean f10586c;

    /* renamed from: d */
    public final Quirks f10587d;

    /* renamed from: e */
    public final Executor f10588e;

    /* renamed from: f */
    public final boolean f10589f;

    /* renamed from: g */
    public int f10590g = 1;

    /* renamed from: androidx.camera.camera2.internal.d$a */
    /* loaded from: classes.dex */
    public static class C2408a implements InterfaceC2413d {

        /* renamed from: a */
        public final Camera2CameraControlImpl f10591a;

        /* renamed from: b */
        public final OverrideAeModeForStillCapture f10592b;

        /* renamed from: c */
        public final int f10593c;

        /* renamed from: d */
        public boolean f10594d = false;

        public C2408a(Camera2CameraControlImpl camera2CameraControlImpl, int i, OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.f10591a = camera2CameraControlImpl;
            this.f10593c = i;
            this.f10592b = overrideAeModeForStillCapture;
        }

        /* renamed from: d */
        public static /* synthetic */ Boolean m63553d(Void r0) {
            return Boolean.TRUE;
        }

        /* renamed from: e */
        public static /* synthetic */ Object m63552e(C2408a c2408a, CallbackToFutureAdapter.Completer completer) {
            return c2408a.m63551f(completer);
        }

        @Override // androidx.camera.camera2.internal.C2407d.InterfaceC2413d
        /* renamed from: a */
        public ListenableFuture mo63528a(TotalCaptureResult totalCaptureResult) {
            if (C2407d.m63558b(this.f10593c, totalCaptureResult)) {
                Logger.m63230d("Camera2CapturePipeline", "Trigger AE");
                this.f10594d = true;
                return FutureChain.from(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: si
                    {
                        C2407d.C2408a.this = this;
                    }

                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return C2407d.C2408a.m63552e(C2407d.C2408a.this, completer);
                    }
                })).transform(new Function() { // from class: ti
                    @Override // androidx.arch.core.util.Function
                    public final Object apply(Object obj) {
                        return C2407d.C2408a.m63553d((Void) obj);
                    }
                }, CameraXExecutors.directExecutor());
            }
            return Futures.immediateFuture(Boolean.FALSE);
        }

        @Override // androidx.camera.camera2.internal.C2407d.InterfaceC2413d
        /* renamed from: b */
        public boolean mo63527b() {
            if (this.f10593c == 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.camera.camera2.internal.C2407d.InterfaceC2413d
        /* renamed from: c */
        public void mo63526c() {
            if (this.f10594d) {
                Logger.m63230d("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f10591a.getFocusMeteringControl().m63460l(false, true);
                this.f10592b.onAePrecaptureFinished();
            }
        }

        /* renamed from: f */
        public final /* synthetic */ Object m63551f(CallbackToFutureAdapter.Completer completer) {
            this.f10591a.getFocusMeteringControl().m63473W(completer);
            this.f10592b.onAePrecaptureStarted();
            return "AePreCapture";
        }
    }

    /* renamed from: androidx.camera.camera2.internal.d$b */
    /* loaded from: classes.dex */
    public static class C2409b implements InterfaceC2413d {

        /* renamed from: a */
        public final Camera2CameraControlImpl f10595a;

        /* renamed from: b */
        public boolean f10596b = false;

        public C2409b(Camera2CameraControlImpl camera2CameraControlImpl) {
            this.f10595a = camera2CameraControlImpl;
        }

        @Override // androidx.camera.camera2.internal.C2407d.InterfaceC2413d
        /* renamed from: a */
        public ListenableFuture mo63528a(TotalCaptureResult totalCaptureResult) {
            ListenableFuture immediateFuture = Futures.immediateFuture(Boolean.TRUE);
            if (totalCaptureResult == null) {
                return immediateFuture;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
            if (num == null) {
                return immediateFuture;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                Logger.m63230d("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    Logger.m63230d("Camera2CapturePipeline", "Trigger AF");
                    this.f10596b = true;
                    this.f10595a.getFocusMeteringControl().m63472X(null, false);
                }
            }
            return immediateFuture;
        }

        @Override // androidx.camera.camera2.internal.C2407d.InterfaceC2413d
        /* renamed from: b */
        public boolean mo63527b() {
            return true;
        }

        @Override // androidx.camera.camera2.internal.C2407d.InterfaceC2413d
        /* renamed from: c */
        public void mo63526c() {
            if (this.f10596b) {
                Logger.m63230d("Camera2CapturePipeline", "cancel TriggerAF");
                this.f10595a.getFocusMeteringControl().m63460l(true, false);
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.d$c */
    /* loaded from: classes.dex */
    public static class C2410c {

        /* renamed from: i */
        public static final long f10597i;

        /* renamed from: j */
        public static final long f10598j;

        /* renamed from: a */
        public final int f10599a;

        /* renamed from: b */
        public final Executor f10600b;

        /* renamed from: c */
        public final Camera2CameraControlImpl f10601c;

        /* renamed from: d */
        public final OverrideAeModeForStillCapture f10602d;

        /* renamed from: e */
        public final boolean f10603e;

        /* renamed from: f */
        public long f10604f = f10597i;

        /* renamed from: g */
        public final List f10605g = new ArrayList();

        /* renamed from: h */
        public final InterfaceC2413d f10606h = new C2411a();

        /* renamed from: androidx.camera.camera2.internal.d$c$a */
        /* loaded from: classes.dex */
        public class C2411a implements InterfaceC2413d {
            public C2411a() {
                C2410c.this = r1;
            }

            /* renamed from: d */
            public static /* synthetic */ Boolean m63533d(List list) {
                return m63532e(list);
            }

            /* renamed from: e */
            public static /* synthetic */ Boolean m63532e(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override // androidx.camera.camera2.internal.C2407d.InterfaceC2413d
            /* renamed from: a */
            public ListenableFuture mo63528a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC2413d interfaceC2413d : C2410c.this.f10605g) {
                    arrayList.add(interfaceC2413d.mo63528a(totalCaptureResult));
                }
                return Futures.transform(Futures.allAsList(arrayList), new Function() { // from class: Ai
                    @Override // androidx.arch.core.util.Function
                    public final Object apply(Object obj) {
                        return C2407d.C2410c.C2411a.m63533d((List) obj);
                    }
                }, CameraXExecutors.directExecutor());
            }

            @Override // androidx.camera.camera2.internal.C2407d.InterfaceC2413d
            /* renamed from: b */
            public boolean mo63527b() {
                for (InterfaceC2413d interfaceC2413d : C2410c.this.f10605g) {
                    if (interfaceC2413d.mo63527b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.camera.camera2.internal.C2407d.InterfaceC2413d
            /* renamed from: c */
            public void mo63526c() {
                for (InterfaceC2413d interfaceC2413d : C2410c.this.f10605g) {
                    interfaceC2413d.mo63526c();
                }
            }
        }

        /* renamed from: androidx.camera.camera2.internal.d$c$b */
        /* loaded from: classes.dex */
        public class C2412b extends CameraCaptureCallback {

            /* renamed from: a */
            public final /* synthetic */ CallbackToFutureAdapter.Completer f10608a;

            public C2412b(CallbackToFutureAdapter.Completer completer) {
                C2410c.this = r1;
                this.f10608a = completer;
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCancelled() {
                this.f10608a.setException(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
                this.f10608a.set(null);
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
                this.f10608a.setException(new ImageCaptureException(2, "Capture request failed with reason " + cameraCaptureFailure.getReason(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f10597i = timeUnit.toNanos(1L);
            f10598j = timeUnit.toNanos(5L);
        }

        public C2410c(int i, Executor executor, Camera2CameraControlImpl camera2CameraControlImpl, boolean z, OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.f10599a = i;
            this.f10600b = executor;
            this.f10601c = camera2CameraControlImpl;
            this.f10603e = z;
            this.f10602d = overrideAeModeForStillCapture;
        }

        /* renamed from: a */
        public static /* synthetic */ ListenableFuture m63549a(C2410c c2410c, int i, TotalCaptureResult totalCaptureResult) {
            return c2410c.m63540j(i, totalCaptureResult);
        }

        /* renamed from: b */
        public static /* synthetic */ ListenableFuture m63548b(C2410c c2410c, Boolean bool) {
            return c2410c.m63538l(bool);
        }

        /* renamed from: c */
        public static /* synthetic */ ListenableFuture m63547c(C2410c c2410c, List list, int i, TotalCaptureResult totalCaptureResult) {
            return c2410c.m63537m(list, i, totalCaptureResult);
        }

        /* renamed from: d */
        public static /* synthetic */ Object m63546d(C2410c c2410c, CaptureConfig.Builder builder, CallbackToFutureAdapter.Completer completer) {
            return c2410c.m63536n(builder, completer);
        }

        /* renamed from: e */
        public static /* synthetic */ boolean m63545e(TotalCaptureResult totalCaptureResult) {
            return C2407d.m63559a(totalCaptureResult, false);
        }

        /* renamed from: f */
        public void m63544f(InterfaceC2413d interfaceC2413d) {
            this.f10605g.add(interfaceC2413d);
        }

        /* renamed from: g */
        public final void m63543g(CaptureConfig.Builder builder) {
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, 3);
            builder.addImplementationOptions(builder2.build());
        }

        /* renamed from: h */
        public final void m63542h(CaptureConfig.Builder builder, CaptureConfig captureConfig) {
            int i;
            if (this.f10599a == 3 && !this.f10603e) {
                i = 4;
            } else if (captureConfig.getTemplateType() != -1 && captureConfig.getTemplateType() != 5) {
                i = -1;
            } else {
                i = 2;
            }
            if (i != -1) {
                builder.setTemplateType(i);
            }
        }

        /* renamed from: i */
        public ListenableFuture m63541i(final List list, final int i) {
            ListenableFuture immediateFuture;
            ListenableFuture immediateFuture2 = Futures.immediateFuture(null);
            if (!this.f10605g.isEmpty()) {
                if (this.f10606h.mo63527b()) {
                    immediateFuture = C2407d.m63554f(0L, this.f10601c, null);
                } else {
                    immediateFuture = Futures.immediateFuture(null);
                }
                immediateFuture2 = FutureChain.from(immediateFuture).transformAsync(new AsyncFunction() { // from class: ui
                    {
                        C2407d.C2410c.this = this;
                    }

                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        return C2407d.C2410c.m63549a(C2407d.C2410c.this, i, (TotalCaptureResult) obj);
                    }
                }, this.f10600b).transformAsync(new AsyncFunction() { // from class: vi
                    {
                        C2407d.C2410c.this = this;
                    }

                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        return C2407d.C2410c.m63548b(C2407d.C2410c.this, (Boolean) obj);
                    }
                }, this.f10600b);
            }
            FutureChain transformAsync = FutureChain.from(immediateFuture2).transformAsync(new AsyncFunction() { // from class: wi
                {
                    C2407d.C2410c.this = this;
                }

                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return C2407d.C2410c.m63547c(C2407d.C2410c.this, list, i, (TotalCaptureResult) obj);
                }
            }, this.f10600b);
            final InterfaceC2413d interfaceC2413d = this.f10606h;
            Objects.requireNonNull(interfaceC2413d);
            transformAsync.addListener(new Runnable() { // from class: xi
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC2413d.mo63526c();
                }
            }, this.f10600b);
            return transformAsync;
        }

        /* renamed from: j */
        public final /* synthetic */ ListenableFuture m63540j(int i, TotalCaptureResult totalCaptureResult) {
            if (C2407d.m63558b(i, totalCaptureResult)) {
                m63535o(f10598j);
            }
            return this.f10606h.mo63528a(totalCaptureResult);
        }

        /* renamed from: l */
        public final /* synthetic */ ListenableFuture m63538l(Boolean bool) {
            if (Boolean.TRUE.equals(bool)) {
                return C2407d.m63554f(this.f10604f, this.f10601c, new C2414e.InterfaceC2415a() { // from class: yi
                    @Override // androidx.camera.camera2.internal.C2407d.C2414e.InterfaceC2415a
                    /* renamed from: a */
                    public final boolean mo207a(TotalCaptureResult totalCaptureResult) {
                        return C2407d.C2410c.m63545e(totalCaptureResult);
                    }
                });
            }
            return Futures.immediateFuture(null);
        }

        /* renamed from: m */
        public final /* synthetic */ ListenableFuture m63537m(List list, int i, TotalCaptureResult totalCaptureResult) {
            return m63534p(list, i);
        }

        /* renamed from: n */
        public final /* synthetic */ Object m63536n(CaptureConfig.Builder builder, CallbackToFutureAdapter.Completer completer) {
            builder.addCameraCaptureCallback(new C2412b(completer));
            return "submitStillCapture";
        }

        /* renamed from: o */
        public final void m63535o(long j) {
            this.f10604f = j;
        }

        /* renamed from: p */
        public ListenableFuture m63534p(List list, int i) {
            CameraCaptureResult cameraCaptureResult;
            ImageProxy dequeueImageFromBuffer;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CaptureConfig captureConfig = (CaptureConfig) it.next();
                final CaptureConfig.Builder from = CaptureConfig.Builder.from(captureConfig);
                if (captureConfig.getTemplateType() == 5 && !this.f10601c.getZslControl().isZslDisabledByFlashMode() && !this.f10601c.getZslControl().isZslDisabledByUserCaseConfig() && (dequeueImageFromBuffer = this.f10601c.getZslControl().dequeueImageFromBuffer()) != null && this.f10601c.getZslControl().enqueueImageToImageWriter(dequeueImageFromBuffer)) {
                    cameraCaptureResult = CameraCaptureResults.retrieveCameraCaptureResult(dequeueImageFromBuffer.getImageInfo());
                } else {
                    cameraCaptureResult = null;
                }
                if (cameraCaptureResult != null) {
                    from.setCameraCaptureResult(cameraCaptureResult);
                } else {
                    m63542h(from, captureConfig);
                }
                if (this.f10602d.shouldSetAeModeAlwaysFlash(i)) {
                    m63543g(from);
                }
                arrayList.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: zi
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return C2407d.C2410c.m63546d(C2407d.C2410c.this, from, completer);
                    }
                }));
                arrayList2.add(from.build());
            }
            this.f10601c.m63959R(arrayList2);
            return Futures.allAsList(arrayList);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.d$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2413d {
        /* renamed from: a */
        ListenableFuture mo63528a(TotalCaptureResult totalCaptureResult);

        /* renamed from: b */
        boolean mo63527b();

        /* renamed from: c */
        void mo63526c();
    }

    /* renamed from: androidx.camera.camera2.internal.d$e */
    /* loaded from: classes.dex */
    public static class C2414e implements Camera2CameraControlImpl.CaptureResultListener {

        /* renamed from: a */
        public CallbackToFutureAdapter.Completer f10610a;

        /* renamed from: c */
        public final long f10612c;

        /* renamed from: d */
        public final InterfaceC2415a f10613d;

        /* renamed from: b */
        public final ListenableFuture f10611b = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Bi
            {
                C2407d.C2414e.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return C2407d.C2414e.m63531a(C2407d.C2414e.this, completer);
            }
        });

        /* renamed from: e */
        public volatile Long f10614e = null;

        /* renamed from: androidx.camera.camera2.internal.d$e$a */
        /* loaded from: classes.dex */
        public interface InterfaceC2415a {
            /* renamed from: a */
            boolean mo207a(TotalCaptureResult totalCaptureResult);
        }

        public C2414e(long j, InterfaceC2415a interfaceC2415a) {
            this.f10612c = j;
            this.f10613d = interfaceC2415a;
        }

        /* renamed from: a */
        public static /* synthetic */ Object m63531a(C2414e c2414e, CallbackToFutureAdapter.Completer completer) {
            return c2414e.m63529c(completer);
        }

        /* renamed from: b */
        public ListenableFuture m63530b() {
            return this.f10611b;
        }

        /* renamed from: c */
        public final /* synthetic */ Object m63529c(CallbackToFutureAdapter.Completer completer) {
            this.f10610a = completer;
            return "waitFor3AResult";
        }

        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && this.f10614e == null) {
                this.f10614e = l;
            }
            Long l2 = this.f10614e;
            if (0 != this.f10612c && l2 != null && l != null && l.longValue() - l2.longValue() > this.f10612c) {
                this.f10610a.set(null);
                Logger.m63230d("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l + " first: " + l2);
                return true;
            }
            InterfaceC2415a interfaceC2415a = this.f10613d;
            if (interfaceC2415a != null && !interfaceC2415a.mo207a(totalCaptureResult)) {
                return false;
            }
            this.f10610a.set(totalCaptureResult);
            return true;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.d$f */
    /* loaded from: classes.dex */
    public static class C2416f implements InterfaceC2413d {

        /* renamed from: e */
        public static final long f10615e = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a */
        public final Camera2CameraControlImpl f10616a;

        /* renamed from: b */
        public final int f10617b;

        /* renamed from: c */
        public boolean f10618c = false;

        /* renamed from: d */
        public final Executor f10619d;

        public C2416f(Camera2CameraControlImpl camera2CameraControlImpl, int i, Executor executor) {
            this.f10616a = camera2CameraControlImpl;
            this.f10617b = i;
            this.f10619d = executor;
        }

        /* renamed from: d */
        public static /* synthetic */ ListenableFuture m63525d(C2416f c2416f, Void r1) {
            return c2416f.m63519j(r1);
        }

        /* renamed from: e */
        public static /* synthetic */ Object m63524e(C2416f c2416f, CallbackToFutureAdapter.Completer completer) {
            return c2416f.m63521h(completer);
        }

        /* renamed from: f */
        public static /* synthetic */ boolean m63523f(TotalCaptureResult totalCaptureResult) {
            return C2407d.m63559a(totalCaptureResult, true);
        }

        /* renamed from: g */
        public static /* synthetic */ Boolean m63522g(TotalCaptureResult totalCaptureResult) {
            return Boolean.FALSE;
        }

        /* renamed from: h */
        public /* synthetic */ Object m63521h(CallbackToFutureAdapter.Completer completer) {
            this.f10616a.getTorchControl().m63356g(completer, true);
            return "TorchOn";
        }

        @Override // androidx.camera.camera2.internal.C2407d.InterfaceC2413d
        /* renamed from: a */
        public ListenableFuture mo63528a(TotalCaptureResult totalCaptureResult) {
            if (C2407d.m63558b(this.f10617b, totalCaptureResult)) {
                if (this.f10616a.m63975B()) {
                    Logger.m63230d("Camera2CapturePipeline", "Torch already on, not turn on");
                } else {
                    Logger.m63230d("Camera2CapturePipeline", "Turn on torch");
                    this.f10618c = true;
                    return FutureChain.from(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Ci
                        {
                            C2407d.C2416f.this = this;
                        }

                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                            return C2407d.C2416f.m63524e(C2407d.C2416f.this, completer);
                        }
                    })).transformAsync(new AsyncFunction() { // from class: Di
                        {
                            C2407d.C2416f.this = this;
                        }

                        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                        public final ListenableFuture apply(Object obj) {
                            return C2407d.C2416f.m63525d(C2407d.C2416f.this, (Void) obj);
                        }
                    }, this.f10619d).transform(new Function() { // from class: Ei
                        @Override // androidx.arch.core.util.Function
                        public final Object apply(Object obj) {
                            return C2407d.C2416f.m63522g((TotalCaptureResult) obj);
                        }
                    }, CameraXExecutors.directExecutor());
                }
            }
            return Futures.immediateFuture(Boolean.FALSE);
        }

        @Override // androidx.camera.camera2.internal.C2407d.InterfaceC2413d
        /* renamed from: b */
        public boolean mo63527b() {
            if (this.f10617b == 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.camera.camera2.internal.C2407d.InterfaceC2413d
        /* renamed from: c */
        public void mo63526c() {
            if (this.f10618c) {
                this.f10616a.getTorchControl().m63356g(null, false);
                Logger.m63230d("Camera2CapturePipeline", "Turn off torch");
            }
        }

        /* renamed from: j */
        public final /* synthetic */ ListenableFuture m63519j(Void r4) {
            return C2407d.m63554f(f10615e, this.f10616a, new C2414e.InterfaceC2415a() { // from class: Fi
                @Override // androidx.camera.camera2.internal.C2407d.C2414e.InterfaceC2415a
                /* renamed from: a */
                public final boolean mo207a(TotalCaptureResult totalCaptureResult) {
                    return C2407d.C2416f.m63523f(totalCaptureResult);
                }
            });
        }
    }

    static {
        CameraCaptureMetaData.AeState aeState = CameraCaptureMetaData.AeState.CONVERGED;
        CameraCaptureMetaData.AeState aeState2 = CameraCaptureMetaData.AeState.FLASH_REQUIRED;
        CameraCaptureMetaData.AeState aeState3 = CameraCaptureMetaData.AeState.UNKNOWN;
        Set unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(aeState, aeState2, aeState3));
        f10582j = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(aeState2);
        copyOf.remove(aeState3);
        f10583k = Collections.unmodifiableSet(copyOf);
    }

    public C2407d(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Quirks quirks, Executor executor) {
        boolean z = true;
        this.f10584a = camera2CameraControlImpl;
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f10589f = (num == null || num.intValue() != 2) ? false : false;
        this.f10588e = executor;
        this.f10587d = quirks;
        this.f10585b = new UseTorchAsFlash(quirks);
        this.f10586c = FlashAvailabilityChecker.isFlashAvailable(new C13107pi(cameraCharacteristicsCompat));
    }

    /* renamed from: a */
    public static boolean m63559a(TotalCaptureResult totalCaptureResult, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (totalCaptureResult == null) {
            return false;
        }
        Camera2CameraCaptureResult camera2CameraCaptureResult = new Camera2CameraCaptureResult(totalCaptureResult);
        if (camera2CameraCaptureResult.getAfMode() != CameraCaptureMetaData.AfMode.OFF && camera2CameraCaptureResult.getAfMode() != CameraCaptureMetaData.AfMode.UNKNOWN && !f10580h.contains(camera2CameraCaptureResult.getAfState())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z ? !(z3 || f10582j.contains(camera2CameraCaptureResult.getAeState())) : !(z3 || f10583k.contains(camera2CameraCaptureResult.getAeState()))) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue() == 0 || f10581i.contains(camera2CameraCaptureResult.getAwbState())) {
            z5 = true;
        } else {
            z5 = false;
        }
        Logger.m63230d("Camera2CapturePipeline", "checkCaptureResult, AE=" + camera2CameraCaptureResult.getAeState() + " AF =" + camera2CameraCaptureResult.getAfState() + " AWB=" + camera2CameraCaptureResult.getAwbState());
        if (!z2 || !z4 || !z5) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m63558b(int i, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new AssertionError(i);
        }
        if (totalCaptureResult != null) {
            num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        } else {
            num = null;
        }
        if (num == null || num.intValue() != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static ListenableFuture m63554f(long j, Camera2CameraControlImpl camera2CameraControlImpl, C2414e.InterfaceC2415a interfaceC2415a) {
        C2414e c2414e = new C2414e(j, interfaceC2415a);
        camera2CameraControlImpl.m63945k(c2414e);
        return c2414e.m63530b();
    }

    /* renamed from: c */
    public final boolean m63557c(int i) {
        if (this.f10585b.shouldUseTorchAsFlash() || this.f10590g == 3 || i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void m63556d(int i) {
        this.f10590g = i;
    }

    /* renamed from: e */
    public ListenableFuture m63555e(List list, int i, int i2, int i3) {
        OverrideAeModeForStillCapture overrideAeModeForStillCapture = new OverrideAeModeForStillCapture(this.f10587d);
        C2410c c2410c = new C2410c(this.f10590g, this.f10588e, this.f10584a, this.f10589f, overrideAeModeForStillCapture);
        if (i == 0) {
            c2410c.m63544f(new C2409b(this.f10584a));
        }
        if (this.f10586c) {
            if (m63557c(i3)) {
                c2410c.m63544f(new C2416f(this.f10584a, i2, this.f10588e));
            } else {
                c2410c.m63544f(new C2408a(this.f10584a, i2, overrideAeModeForStillCapture));
            }
        }
        return Futures.nonCancellationPropagating(c2410c.m63541i(list, i2));
    }
}
