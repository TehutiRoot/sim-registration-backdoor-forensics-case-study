package androidx.camera.lifecycle;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.ConcurrentCamera;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class ProcessCameraProvider implements CameraProvider {

    /* renamed from: h */
    public static final ProcessCameraProvider f11603h = new ProcessCameraProvider();

    /* renamed from: c */
    public ListenableFuture f11606c;

    /* renamed from: f */
    public CameraX f11609f;

    /* renamed from: g */
    public Context f11610g;

    /* renamed from: a */
    public final Object f11604a = new Object();

    /* renamed from: b */
    public CameraXConfig.Provider f11605b = null;

    /* renamed from: d */
    public ListenableFuture f11607d = Futures.immediateFuture(null);

    /* renamed from: e */
    public final C18053Mi0 f11608e = new C18053Mi0();

    /* renamed from: androidx.camera.lifecycle.ProcessCameraProvider$a */
    /* loaded from: classes.dex */
    public class C2591a implements FutureCallback {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f11611a;

        /* renamed from: b */
        public final /* synthetic */ CameraX f11612b;

        public C2591a(CallbackToFutureAdapter.Completer completer, CameraX cameraX) {
            ProcessCameraProvider.this = r1;
            this.f11611a = completer;
            this.f11612b = cameraX;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(Void r2) {
            this.f11611a.set(this.f11612b);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            this.f11611a.setException(th2);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Object m62549a(ProcessCameraProvider processCameraProvider, CameraX cameraX, CallbackToFutureAdapter.Completer completer) {
        return processCameraProvider.m62535o(cameraX, completer);
    }

    /* renamed from: b */
    public static /* synthetic */ ListenableFuture m62548b(CameraX cameraX, Void r1) {
        return cameraX.getInitializeFuture();
    }

    /* renamed from: c */
    public static /* synthetic */ CameraXConfig m62547c(CameraXConfig cameraXConfig) {
        return m62538l(cameraXConfig);
    }

    @ExperimentalCameraProviderConfiguration
    public static void configureInstance(@NonNull CameraXConfig cameraXConfig) {
        f11603h.m62543g(cameraXConfig);
    }

    /* renamed from: d */
    public static /* synthetic */ void m62546d(ProcessCameraProvider processCameraProvider) {
        processCameraProvider.m62534p();
    }

    /* renamed from: e */
    public static /* synthetic */ ProcessCameraProvider m62545e(Context context, CameraX cameraX) {
        return m62537m(context, cameraX);
    }

    @NonNull
    public static ListenableFuture<ProcessCameraProvider> getInstance(@NonNull final Context context) {
        Preconditions.checkNotNull(context);
        return Futures.transform(f11603h.m62539k(context), new Function() { // from class: Qn1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ProcessCameraProvider.m62545e(context, (CameraX) obj);
            }
        }, CameraXExecutors.directExecutor());
    }

    /* renamed from: l */
    public static /* synthetic */ CameraXConfig m62538l(CameraXConfig cameraXConfig) {
        return cameraXConfig;
    }

    /* renamed from: m */
    public static /* synthetic */ ProcessCameraProvider m62537m(Context context, CameraX cameraX) {
        ProcessCameraProvider processCameraProvider = f11603h;
        processCameraProvider.m62531s(cameraX);
        processCameraProvider.m62530t(ContextUtil.getApplicationContext(context));
        return processCameraProvider;
    }

    @NonNull
    @MainThread
    public Camera bindToLifecycle(@NonNull LifecycleOwner lifecycleOwner, @NonNull CameraSelector cameraSelector, @NonNull UseCase... useCaseArr) {
        if (m62540j() != 2) {
            m62532r(1);
            return m62544f(lifecycleOwner, cameraSelector, null, Collections.emptyList(), useCaseArr);
        }
        throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
    }

    /* renamed from: f */
    public Camera m62544f(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, ViewPort viewPort, List list, UseCase... useCaseArr) {
        CameraConfig cameraConfig;
        CameraConfig config;
        Threads.checkMainThread();
        CameraSelector.Builder fromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
        int length = useCaseArr.length;
        int i = 0;
        while (true) {
            cameraConfig = null;
            if (i >= length) {
                break;
            }
            CameraSelector cameraSelector2 = useCaseArr[i].getCurrentConfig().getCameraSelector(null);
            if (cameraSelector2 != null) {
                Iterator<CameraFilter> it = cameraSelector2.getCameraFilterSet().iterator();
                while (it.hasNext()) {
                    fromSelector.addCameraFilter(it.next());
                }
            }
            i++;
        }
        LinkedHashSet<CameraInternal> filter = fromSelector.build().filter(this.f11609f.getCameraRepository().getCameras());
        if (!filter.isEmpty()) {
            C17989Li0 m67316d = this.f11608e.m67316d(lifecycleOwner, CameraUseCaseAdapter.generateCameraId(filter));
            Collection<C17989Li0> m67314f = this.f11608e.m67314f();
            for (UseCase useCase : useCaseArr) {
                for (C17989Li0 c17989Li0 : m67314f) {
                    if (c17989Li0.m67496e(useCase) && c17989Li0 != m67316d) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", useCase));
                    }
                }
            }
            if (m67316d == null) {
                m67316d = this.f11608e.m67317c(lifecycleOwner, new CameraUseCaseAdapter(filter, this.f11609f.getCameraFactory().getCameraCoordinator(), this.f11609f.getCameraDeviceSurfaceManager(), this.f11609f.getDefaultConfigFactory()));
            }
            Iterator<CameraFilter> it2 = cameraSelector.getCameraFilterSet().iterator();
            while (it2.hasNext()) {
                CameraFilter next = it2.next();
                if (next.getIdentifier() != CameraFilter.DEFAULT_ID && (config = ExtendedCameraConfigProviderStore.getConfigProvider(next.getIdentifier()).getConfig(m67316d.getCameraInfo(), this.f11610g)) != null) {
                    if (cameraConfig == null) {
                        cameraConfig = config;
                    } else {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                }
            }
            m67316d.setExtendedConfig(cameraConfig);
            if (useCaseArr.length == 0) {
                return m67316d;
            }
            this.f11608e.m67319a(m67316d, viewPort, list, Arrays.asList(useCaseArr), this.f11609f.getCameraFactory().getCameraCoordinator());
            return m67316d;
        }
        throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
    }

    /* renamed from: g */
    public final void m62543g(final CameraXConfig cameraXConfig) {
        boolean z;
        synchronized (this.f11604a) {
            Preconditions.checkNotNull(cameraXConfig);
            if (this.f11605b == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
            this.f11605b = new CameraXConfig.Provider() { // from class: On1
                @Override // androidx.camera.core.CameraXConfig.Provider
                public final CameraXConfig getCameraXConfig() {
                    return ProcessCameraProvider.m62547c(CameraXConfig.this);
                }
            };
        }
    }

    @Override // androidx.camera.core.CameraProvider
    @NonNull
    public List<CameraInfo> getAvailableCameraInfos() {
        ArrayList arrayList = new ArrayList();
        for (CameraInternal cameraInternal : this.f11609f.getCameraRepository().getCameras()) {
            arrayList.add(cameraInternal.getCameraInfo());
        }
        return arrayList;
    }

    @NonNull
    public List<List<CameraInfo>> getAvailableConcurrentCameraInfos() {
        Objects.requireNonNull(this.f11609f);
        Objects.requireNonNull(this.f11609f.getCameraFactory().getCameraCoordinator());
        List<List<CameraSelector>> concurrentCameraSelectors = this.f11609f.getCameraFactory().getCameraCoordinator().getConcurrentCameraSelectors();
        List<CameraInfo> availableCameraInfos = getAvailableCameraInfos();
        ArrayList arrayList = new ArrayList();
        for (List<CameraSelector> list : concurrentCameraSelectors) {
            ArrayList arrayList2 = new ArrayList();
            for (CameraSelector cameraSelector : list) {
                CameraInfo m62541i = m62541i(cameraSelector, availableCameraInfos);
                if (m62541i != null) {
                    arrayList2.add(m62541i);
                }
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List m62542h() {
        CameraX cameraX = this.f11609f;
        if (cameraX == null) {
            return new ArrayList();
        }
        return cameraX.getCameraFactory().getCameraCoordinator().getActiveConcurrentCameraInfos();
    }

    @Override // androidx.camera.core.CameraProvider
    public boolean hasCamera(@NonNull CameraSelector cameraSelector) throws CameraInfoUnavailableException {
        try {
            cameraSelector.select(this.f11609f.getCameraRepository().getCameras());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public final CameraInfo m62541i(CameraSelector cameraSelector, List list) {
        List<CameraInfo> filter = cameraSelector.filter(list);
        if (filter.isEmpty()) {
            return null;
        }
        return filter.get(0);
    }

    public boolean isBound(@NonNull UseCase useCase) {
        for (C17989Li0 c17989Li0 : this.f11608e.m67314f()) {
            if (c17989Li0.m67496e(useCase)) {
                return true;
            }
        }
        return false;
    }

    @MainThread
    public boolean isConcurrentCameraModeOn() {
        if (m62540j() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final int m62540j() {
        CameraX cameraX = this.f11609f;
        if (cameraX == null) {
            return 0;
        }
        return cameraX.getCameraFactory().getCameraCoordinator().getCameraOperatingMode();
    }

    /* renamed from: k */
    public final ListenableFuture m62539k(Context context) {
        synchronized (this.f11604a) {
            try {
                ListenableFuture listenableFuture = this.f11606c;
                if (listenableFuture != null) {
                    return listenableFuture;
                }
                final CameraX cameraX = new CameraX(context, this.f11605b);
                ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Rn1
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return ProcessCameraProvider.m62549a(ProcessCameraProvider.this, cameraX, completer);
                    }
                });
                this.f11606c = future;
                return future;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: o */
    public final /* synthetic */ Object m62535o(final CameraX cameraX, CallbackToFutureAdapter.Completer completer) {
        synchronized (this.f11604a) {
            Futures.addCallback(FutureChain.from(this.f11607d).transformAsync(new AsyncFunction() { // from class: Sn1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return ProcessCameraProvider.m62548b(CameraX.this, (Void) obj);
                }
            }, CameraXExecutors.directExecutor()), new C2591a(completer, cameraX), CameraXExecutors.directExecutor());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* renamed from: p */
    public final /* synthetic */ void m62534p() {
        unbindAll();
        this.f11608e.m67318b();
    }

    /* renamed from: q */
    public final void m62533q(List list) {
        CameraX cameraX = this.f11609f;
        if (cameraX == null) {
            return;
        }
        cameraX.getCameraFactory().getCameraCoordinator().setActiveConcurrentCameraInfos(list);
    }

    /* renamed from: r */
    public final void m62532r(int i) {
        CameraX cameraX = this.f11609f;
        if (cameraX == null) {
            return;
        }
        cameraX.getCameraFactory().getCameraCoordinator().setCameraOperatingMode(i);
    }

    /* renamed from: s */
    public final void m62531s(CameraX cameraX) {
        this.f11609f = cameraX;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public ListenableFuture<Void> shutdown() {
        ListenableFuture<Void> immediateFuture;
        Threads.runOnMainSync(new Runnable() { // from class: Pn1
            {
                ProcessCameraProvider.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ProcessCameraProvider.m62546d(ProcessCameraProvider.this);
            }
        });
        CameraX cameraX = this.f11609f;
        if (cameraX != null) {
            cameraX.getCameraFactory().getCameraCoordinator().shutdown();
        }
        CameraX cameraX2 = this.f11609f;
        if (cameraX2 != null) {
            immediateFuture = cameraX2.shutdown();
        } else {
            immediateFuture = Futures.immediateFuture(null);
        }
        synchronized (this.f11604a) {
            this.f11605b = null;
            this.f11606c = null;
            this.f11607d = immediateFuture;
        }
        this.f11609f = null;
        this.f11610g = null;
        return immediateFuture;
    }

    /* renamed from: t */
    public final void m62530t(Context context) {
        this.f11610g = context;
    }

    @MainThread
    public void unbind(@NonNull UseCase... useCaseArr) {
        Threads.checkMainThread();
        if (m62540j() != 2) {
            this.f11608e.m67308l(Arrays.asList(useCaseArr));
            return;
        }
        throw new UnsupportedOperationException("unbind usecase is not supported in concurrent camera mode, call unbindAll() first");
    }

    @MainThread
    public void unbindAll() {
        Threads.checkMainThread();
        m62532r(0);
        this.f11608e.m67307m();
    }

    @NonNull
    @MainThread
    public Camera bindToLifecycle(@NonNull LifecycleOwner lifecycleOwner, @NonNull CameraSelector cameraSelector, @NonNull UseCaseGroup useCaseGroup) {
        if (m62540j() != 2) {
            m62532r(1);
            return m62544f(lifecycleOwner, cameraSelector, useCaseGroup.getViewPort(), useCaseGroup.getEffects(), (UseCase[]) useCaseGroup.getUseCases().toArray(new UseCase[0]));
        }
        throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
    }

    @NonNull
    @MainThread
    public ConcurrentCamera bindToLifecycle(@NonNull List<ConcurrentCamera.SingleCameraConfig> list) {
        if (this.f11610g.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
            if (m62540j() != 1) {
                if (list.size() >= 2) {
                    if (list.size() <= 2) {
                        ArrayList arrayList = new ArrayList();
                        List<CameraInfo> availableCameraInfos = getAvailableCameraInfos();
                        CameraInfo m62541i = m62541i(list.get(0).getCameraSelector(), availableCameraInfos);
                        CameraInfo m62541i2 = m62541i(list.get(1).getCameraSelector(), availableCameraInfos);
                        if (m62541i != null && m62541i2 != null) {
                            arrayList.add(m62541i);
                            arrayList.add(m62541i2);
                            if (!m62542h().isEmpty() && !arrayList.equals(m62542h())) {
                                throw new UnsupportedOperationException("Cameras are already running, call unbindAll() before binding more cameras");
                            }
                            m62532r(2);
                            ArrayList arrayList2 = new ArrayList();
                            for (ConcurrentCamera.SingleCameraConfig singleCameraConfig : list) {
                                arrayList2.add(m62544f(singleCameraConfig.getLifecycleOwner(), singleCameraConfig.getCameraSelector(), singleCameraConfig.getUseCaseGroup().getViewPort(), singleCameraConfig.getUseCaseGroup().getEffects(), (UseCase[]) singleCameraConfig.getUseCaseGroup().getUseCases().toArray(new UseCase[0])));
                            }
                            m62533q(arrayList);
                            return new ConcurrentCamera(arrayList2);
                        }
                        throw new IllegalArgumentException("Invalid camera selectors in camera configs");
                    }
                    throw new IllegalArgumentException("Concurrent camera is only supporting two  cameras at maximum.");
                }
                throw new IllegalArgumentException("Concurrent camera needs two camera configs");
            }
            throw new UnsupportedOperationException("Camera is already running, call unbindAll() before binding more cameras");
        }
        throw new UnsupportedOperationException("Concurrent camera is not supported on the device");
    }
}
