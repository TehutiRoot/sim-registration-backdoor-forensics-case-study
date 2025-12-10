package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.ViewPort;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.RestrictedCameraControl;
import androidx.camera.core.impl.RestrictedCameraInfo;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.processing.TargetUtils;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class CameraUseCaseAdapter implements Camera {

    /* renamed from: a */
    public final CameraInternal f11344a;

    /* renamed from: b */
    public final LinkedHashSet f11345b;

    /* renamed from: c */
    public final CameraDeviceSurfaceManager f11346c;

    /* renamed from: d */
    public final UseCaseConfigFactory f11347d;

    /* renamed from: e */
    public final CameraId f11348e;

    /* renamed from: h */
    public final CameraCoordinator f11351h;

    /* renamed from: i */
    public ViewPort f11352i;

    /* renamed from: o */
    public UseCase f11358o;

    /* renamed from: p */
    public StreamSharing f11359p;

    /* renamed from: q */
    public final RestrictedCameraControl f11360q;

    /* renamed from: r */
    public final RestrictedCameraInfo f11361r;

    /* renamed from: f */
    public final List f11349f = new ArrayList();

    /* renamed from: g */
    public final List f11350g = new ArrayList();

    /* renamed from: j */
    public List f11353j = Collections.emptyList();

    /* renamed from: k */
    public CameraConfig f11354k = CameraConfigs.emptyConfig();

    /* renamed from: l */
    public final Object f11355l = new Object();

    /* renamed from: m */
    public boolean f11356m = true;

    /* renamed from: n */
    public Config f11357n = null;

    /* loaded from: classes.dex */
    public static final class CameraException extends Exception {
        public CameraException() {
        }

        public CameraException(@NonNull String str) {
            super(str);
        }

        public CameraException(@NonNull Throwable th2) {
            super(th2);
        }
    }

    /* loaded from: classes.dex */
    public static final class CameraId {

        /* renamed from: a */
        public final List f11362a = new ArrayList();

        public CameraId(LinkedHashSet linkedHashSet) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f11362a.add(((CameraInternal) it.next()).getCameraInfoInternal().getCameraId());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof CameraId) {
                return this.f11362a.equals(((CameraId) obj).f11362a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11362a.hashCode() * 53;
        }
    }

    /* renamed from: androidx.camera.core.internal.CameraUseCaseAdapter$a */
    /* loaded from: classes.dex */
    public static class C2554a {

        /* renamed from: a */
        public UseCaseConfig f11363a;

        /* renamed from: b */
        public UseCaseConfig f11364b;

        public C2554a(UseCaseConfig useCaseConfig, UseCaseConfig useCaseConfig2) {
            this.f11363a = useCaseConfig;
            this.f11364b = useCaseConfig2;
        }
    }

    public CameraUseCaseAdapter(@NonNull LinkedHashSet<CameraInternal> linkedHashSet, @NonNull CameraCoordinator cameraCoordinator, @NonNull CameraDeviceSurfaceManager cameraDeviceSurfaceManager, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        CameraInternal next = linkedHashSet.iterator().next();
        this.f11344a = next;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashSet);
        this.f11345b = linkedHashSet2;
        this.f11348e = new CameraId(linkedHashSet2);
        this.f11351h = cameraCoordinator;
        this.f11346c = cameraDeviceSurfaceManager;
        this.f11347d = useCaseConfigFactory;
        RestrictedCameraControl restrictedCameraControl = new RestrictedCameraControl(next.getCameraControlInternal());
        this.f11360q = restrictedCameraControl;
        this.f11361r = new RestrictedCameraInfo(next.getCameraInfoInternal(), restrictedCameraControl);
    }

    /* renamed from: B */
    public static List m62831B(List list, Collection collection) {
        boolean z;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            useCase.setEffect(null);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                CameraEffect cameraEffect = (CameraEffect) it2.next();
                if (useCase.isEffectTargetsSupported(cameraEffect.getTargets())) {
                    if (useCase.getEffect() == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Preconditions.checkState(z, useCase + " already has effect" + useCase.getEffect());
                    useCase.setEffect(cameraEffect);
                    arrayList.remove(cameraEffect);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: C */
    public static void m62830C(List list, Collection collection, Collection collection2) {
        List m62831B = m62831B(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List m62831B2 = m62831B(m62831B, arrayList);
        if (m62831B2.size() > 0) {
            Logger.m63223w("CameraUseCaseAdapter", "Unused effects: " + m62831B2);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m62825b(Surface surface, SurfaceTexture surfaceTexture, SurfaceRequest.Result result) {
        m62802y(surface, surfaceTexture, result);
    }

    /* renamed from: d */
    public static Collection m62823d(Collection collection, UseCase useCase, StreamSharing streamSharing) {
        ArrayList arrayList = new ArrayList(collection);
        if (useCase != null) {
            arrayList.add(useCase);
        }
        if (streamSharing != null) {
            arrayList.add(streamSharing);
            arrayList.removeAll(streamSharing.getChildren());
        }
        return arrayList;
    }

    /* renamed from: f */
    public static Matrix m62821f(Rect rect, Size size) {
        boolean z;
        if (rect.width() > 0 && rect.height() > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    @NonNull
    public static CameraId generateCameraId(@NonNull LinkedHashSet<CameraInternal> linkedHashSet) {
        return new CameraId(linkedHashSet);
    }

    /* renamed from: l */
    public static List m62815l(UseCase useCase) {
        ArrayList arrayList = new ArrayList();
        if (m62804w(useCase)) {
            for (UseCase useCase2 : ((StreamSharing) useCase).getChildren()) {
                arrayList.add(useCase2.getCurrentConfig().getCaptureType());
            }
        } else {
            arrayList.add(useCase.getCurrentConfig().getCaptureType());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m62811p(androidx.camera.core.impl.StreamSpec r4, androidx.camera.core.impl.SessionConfig r5) {
        /*
            androidx.camera.core.impl.Config r4 = r4.getImplementationOptions()
            androidx.camera.core.impl.Config r0 = r5.getImplementationOptions()
            java.util.Set r1 = r4.listOptions()
            int r1 = r1.size()
            androidx.camera.core.impl.Config r5 = r5.getImplementationOptions()
            java.util.Set r5 = r5.listOptions()
            int r5 = r5.size()
            r2 = 1
            if (r1 == r5) goto L20
            return r2
        L20:
            java.util.Set r5 = r4.listOptions()
            java.util.Iterator r5 = r5.iterator()
        L28:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r5.next()
            androidx.camera.core.impl.Config$Option r1 = (androidx.camera.core.impl.Config.Option) r1
            boolean r3 = r0.containsOption(r1)
            if (r3 == 0) goto L48
            java.lang.Object r3 = r0.retrieveOption(r1)
            java.lang.Object r1 = r4.retrieveOption(r1)
            boolean r1 = java.util.Objects.equals(r3, r1)
            if (r1 != 0) goto L28
        L48:
            return r2
        L49:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.CameraUseCaseAdapter.m62811p(androidx.camera.core.impl.StreamSpec, androidx.camera.core.impl.SessionConfig):boolean");
    }

    /* renamed from: u */
    public static boolean m62806u(UseCase useCase) {
        return useCase instanceof ImageCapture;
    }

    /* renamed from: v */
    public static boolean m62805v(UseCase useCase) {
        return useCase instanceof Preview;
    }

    /* renamed from: w */
    public static boolean m62804w(UseCase useCase) {
        return useCase instanceof StreamSharing;
    }

    /* renamed from: x */
    public static boolean m62803x(Collection collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (useCase.isEffectTargetsSupported(i2)) {
                    if (hashSet.contains(Integer.valueOf(i2))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i2));
                }
            }
        }
        return true;
    }

    /* renamed from: y */
    public static /* synthetic */ void m62802y(Surface surface, SurfaceTexture surfaceTexture, SurfaceRequest.Result result) {
        surface.release();
        surfaceTexture.release();
    }

    /* renamed from: z */
    public static /* synthetic */ void m62801z(SurfaceRequest surfaceRequest) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, CameraXExecutors.directExecutor(), new Consumer() { // from class: nk
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                CameraUseCaseAdapter.m62825b(surface, surfaceTexture, (SurfaceRequest.Result) obj);
            }
        });
    }

    /* renamed from: A */
    public final void m62832A() {
        synchronized (this.f11355l) {
            try {
                if (this.f11357n != null) {
                    this.f11344a.getCameraControlInternal().addInteropConfig(this.f11357n);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: D */
    public void m62829D(Collection collection) {
        m62828E(collection, false);
    }

    /* renamed from: E */
    public void m62828E(Collection collection, boolean z) {
        StreamSpec streamSpec;
        Config implementationOptions;
        synchronized (this.f11355l) {
            try {
                UseCase m62822e = m62822e(collection);
                StreamSharing m62817j = m62817j(collection, z);
                Collection m62823d = m62823d(collection, m62822e, m62817j);
                ArrayList<UseCase> arrayList = new ArrayList(m62823d);
                arrayList.removeAll(this.f11350g);
                ArrayList<UseCase> arrayList2 = new ArrayList(m62823d);
                arrayList2.retainAll(this.f11350g);
                ArrayList<UseCase> arrayList3 = new ArrayList(this.f11350g);
                arrayList3.removeAll(m62823d);
                Map m62814m = m62814m(arrayList, this.f11354k.getUseCaseConfigFactory(), this.f11347d);
                try {
                    Map m62820g = m62820g(m62816k(), this.f11344a.getCameraInfoInternal(), arrayList, arrayList2, m62814m);
                    m62827F(m62820g, m62823d);
                    m62830C(this.f11353j, m62823d, collection);
                    for (UseCase useCase : arrayList3) {
                        useCase.unbindFromCamera(this.f11344a);
                    }
                    this.f11344a.detachUseCases(arrayList3);
                    if (!arrayList3.isEmpty()) {
                        for (UseCase useCase2 : arrayList2) {
                            if (m62820g.containsKey(useCase2) && (implementationOptions = (streamSpec = (StreamSpec) m62820g.get(useCase2)).getImplementationOptions()) != null && m62811p(streamSpec, useCase2.getSessionConfig())) {
                                useCase2.updateSuggestedStreamSpecImplementationOptions(implementationOptions);
                            }
                        }
                    }
                    for (UseCase useCase3 : arrayList) {
                        C2554a c2554a = (C2554a) m62814m.get(useCase3);
                        Objects.requireNonNull(c2554a);
                        useCase3.bindToCamera(this.f11344a, c2554a.f11363a, c2554a.f11364b);
                        useCase3.updateSuggestedStreamSpec((StreamSpec) Preconditions.checkNotNull((StreamSpec) m62820g.get(useCase3)));
                    }
                    if (this.f11356m) {
                        this.f11344a.attachUseCases(arrayList);
                    }
                    for (UseCase useCase4 : arrayList) {
                        useCase4.notifyState();
                    }
                    this.f11349f.clear();
                    this.f11349f.addAll(collection);
                    this.f11350g.clear();
                    this.f11350g.addAll(m62823d);
                    this.f11358o = m62822e;
                    this.f11359p = m62817j;
                } catch (IllegalArgumentException e) {
                    if (!z && m62810q() && this.f11351h.getCameraOperatingMode() != 2) {
                        m62828E(collection, true);
                        return;
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: F */
    public final void m62827F(Map map, Collection collection) {
        boolean z;
        synchronized (this.f11355l) {
            try {
                if (this.f11352i != null) {
                    if (this.f11344a.getCameraInfoInternal().getLensFacing() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Map<UseCase, Rect> calculateViewPortRects = ViewPorts.calculateViewPortRects(this.f11344a.getCameraControlInternal().getSensorRect(), z, this.f11352i.getAspectRatio(), this.f11344a.getCameraInfoInternal().getSensorRotationDegrees(this.f11352i.getRotation()), this.f11352i.getScaleType(), this.f11352i.getLayoutDirection(), map);
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        UseCase useCase = (UseCase) it.next();
                        useCase.setViewPortCropRect((Rect) Preconditions.checkNotNull(calculateViewPortRects.get(useCase)));
                        useCase.setSensorToBufferTransformMatrix(m62821f(this.f11344a.getCameraControlInternal().getSensorRect(), ((StreamSpec) Preconditions.checkNotNull((StreamSpec) map.get(useCase))).getResolution()));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addUseCases(@NonNull Collection<UseCase> collection) throws CameraException {
        synchronized (this.f11355l) {
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f11349f);
                linkedHashSet.addAll(collection);
                try {
                    m62829D(linkedHashSet);
                } catch (IllegalArgumentException e) {
                    throw new CameraException(e.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void attachUseCases() {
        synchronized (this.f11355l) {
            try {
                if (!this.f11356m) {
                    this.f11344a.attachUseCases(this.f11350g);
                    m62832A();
                    for (UseCase useCase : this.f11350g) {
                        useCase.notifyState();
                    }
                    this.f11356m = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final void m62824c() {
        synchronized (this.f11355l) {
            CameraControlInternal cameraControlInternal = this.f11344a.getCameraControlInternal();
            this.f11357n = cameraControlInternal.getInteropConfig();
            cameraControlInternal.clearInteropConfig();
        }
    }

    public void detachUseCases() {
        synchronized (this.f11355l) {
            try {
                if (this.f11356m) {
                    this.f11344a.detachUseCases(new ArrayList(this.f11350g));
                    m62824c();
                    this.f11356m = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public UseCase m62822e(Collection collection) {
        UseCase useCase;
        synchronized (this.f11355l) {
            try {
                if (m62809r()) {
                    if (m62807t(collection)) {
                        if (m62805v(this.f11358o)) {
                            useCase = this.f11358o;
                        } else {
                            useCase = m62818i();
                        }
                    } else if (m62808s(collection)) {
                        if (m62806u(this.f11358o)) {
                            useCase = this.f11358o;
                        } else {
                            useCase = m62819h();
                        }
                    }
                }
                useCase = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return useCase;
    }

    /* renamed from: g */
    public final Map m62820g(int i, CameraInfoInternal cameraInfoInternal, Collection collection, Collection collection2, Map map) {
        Size size;
        Rect rect;
        ArrayList arrayList = new ArrayList();
        String cameraId = cameraInfoInternal.getCameraId();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = collection2.iterator();
        while (true) {
            size = null;
            if (!it.hasNext()) {
                break;
            }
            UseCase useCase = (UseCase) it.next();
            AttachedSurfaceInfo create = AttachedSurfaceInfo.create(this.f11346c.transformSurfaceConfig(i, cameraId, useCase.getImageFormat(), useCase.getAttachedSurfaceResolution()), useCase.getImageFormat(), useCase.getAttachedSurfaceResolution(), ((StreamSpec) Preconditions.checkNotNull(useCase.getAttachedStreamSpec())).getDynamicRange(), m62815l(useCase), useCase.getAttachedStreamSpec().getImplementationOptions(), useCase.getCurrentConfig().getTargetFrameRate(null));
            arrayList.add(create);
            hashMap2.put(create, useCase);
            hashMap.put(useCase, useCase.getAttachedStreamSpec());
        }
        if (!collection.isEmpty()) {
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            try {
                rect = this.f11344a.getCameraControlInternal().getSensorRect();
            } catch (NullPointerException unused) {
                rect = null;
            }
            if (rect != null) {
                size = TransformUtils.rectToSize(rect);
            }
            C19692eP1 c19692eP1 = new C19692eP1(cameraInfoInternal, size);
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                UseCase useCase2 = (UseCase) it2.next();
                C2554a c2554a = (C2554a) map.get(useCase2);
                UseCaseConfig<?> mergeConfigs = useCase2.mergeConfigs(cameraInfoInternal, c2554a.f11363a, c2554a.f11364b);
                hashMap3.put(mergeConfigs, useCase2);
                hashMap4.put(mergeConfigs, c19692eP1.m31552m(mergeConfigs));
            }
            Pair<Map<UseCaseConfig<?>, StreamSpec>, Map<AttachedSurfaceInfo, StreamSpec>> suggestedStreamSpecs = this.f11346c.getSuggestedStreamSpecs(i, cameraId, arrayList, hashMap4);
            for (Map.Entry entry : hashMap3.entrySet()) {
                hashMap.put((UseCase) entry.getValue(), (StreamSpec) ((Map) suggestedStreamSpecs.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) suggestedStreamSpecs.second).entrySet()) {
                if (hashMap2.containsKey(entry2.getKey())) {
                    hashMap.put((UseCase) hashMap2.get(entry2.getKey()), (StreamSpec) entry2.getValue());
                }
            }
        }
        return hashMap;
    }

    @Override // androidx.camera.core.Camera
    @NonNull
    public CameraControl getCameraControl() {
        return this.f11360q;
    }

    @NonNull
    public CameraId getCameraId() {
        return this.f11348e;
    }

    @Override // androidx.camera.core.Camera
    @NonNull
    public CameraInfo getCameraInfo() {
        return this.f11361r;
    }

    @Override // androidx.camera.core.Camera
    @NonNull
    public LinkedHashSet<CameraInternal> getCameraInternals() {
        return this.f11345b;
    }

    @Override // androidx.camera.core.Camera
    @NonNull
    public CameraConfig getExtendedConfig() {
        CameraConfig cameraConfig;
        synchronized (this.f11355l) {
            cameraConfig = this.f11354k;
        }
        return cameraConfig;
    }

    @NonNull
    public List<UseCase> getUseCases() {
        ArrayList arrayList;
        synchronized (this.f11355l) {
            arrayList = new ArrayList(this.f11349f);
        }
        return arrayList;
    }

    /* renamed from: h */
    public final ImageCapture m62819h() {
        return new ImageCapture.Builder().setTargetName("ImageCapture-Extra").build();
    }

    /* renamed from: i */
    public final Preview m62818i() {
        Preview build = new Preview.Builder().setTargetName("Preview-Extra").build();
        build.setSurfaceProvider(new Preview.SurfaceProvider() { // from class: mk
            @Override // androidx.camera.core.Preview.SurfaceProvider
            public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
                CameraUseCaseAdapter.m62801z(surfaceRequest);
            }
        });
        return build;
    }

    public boolean isEquivalent(@NonNull CameraUseCaseAdapter cameraUseCaseAdapter) {
        return this.f11348e.equals(cameraUseCaseAdapter.getCameraId());
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupported(@NonNull UseCase... useCaseArr) {
        synchronized (this.f11355l) {
            try {
                try {
                    m62820g(m62816k(), this.f11344a.getCameraInfoInternal(), Arrays.asList(useCaseArr), Collections.emptyList(), m62814m(Arrays.asList(useCaseArr), this.f11354k.getUseCaseConfigFactory(), this.f11347d));
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final StreamSharing m62817j(Collection collection, boolean z) {
        synchronized (this.f11355l) {
            try {
                Set m62812o = m62812o(collection, z);
                if (m62812o.size() < 2) {
                    return null;
                }
                StreamSharing streamSharing = this.f11359p;
                if (streamSharing != null && streamSharing.getChildren().equals(m62812o)) {
                    StreamSharing streamSharing2 = this.f11359p;
                    Objects.requireNonNull(streamSharing2);
                    return streamSharing2;
                } else if (!m62803x(m62812o)) {
                    return null;
                } else {
                    return new StreamSharing(this.f11344a, m62812o, this.f11347d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public final int m62816k() {
        synchronized (this.f11355l) {
            try {
                if (this.f11351h.getCameraOperatingMode() == 2) {
                    return 1;
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public final Map m62814m(Collection collection, UseCaseConfigFactory useCaseConfigFactory, UseCaseConfigFactory useCaseConfigFactory2) {
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            hashMap.put(useCase, new C2554a(useCase.getDefaultConfig(false, useCaseConfigFactory), useCase.getDefaultConfig(true, useCaseConfigFactory2)));
        }
        return hashMap;
    }

    /* renamed from: n */
    public final int m62813n(boolean z) {
        int i;
        synchronized (this.f11355l) {
            try {
                Iterator it = this.f11353j.iterator();
                CameraEffect cameraEffect = null;
                while (true) {
                    i = 0;
                    boolean z2 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    CameraEffect cameraEffect2 = (CameraEffect) it.next();
                    if (TargetUtils.getNumberOfTargets(cameraEffect2.getTargets()) > 1) {
                        if (cameraEffect == null) {
                            z2 = true;
                        }
                        Preconditions.checkState(z2, "Can only have one sharing effect.");
                        cameraEffect = cameraEffect2;
                    }
                }
                if (cameraEffect != null) {
                    i = cameraEffect.getTargets();
                }
                if (z) {
                    i |= 3;
                }
            } finally {
            }
        }
        return i;
    }

    /* renamed from: o */
    public final Set m62812o(Collection collection, boolean z) {
        HashSet hashSet = new HashSet();
        int m62813n = m62813n(z);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            Preconditions.checkArgument(!m62804w(useCase), "Only support one level of sharing for now.");
            if (useCase.isEffectTargetsSupported(m62813n)) {
                hashSet.add(useCase);
            }
        }
        return hashSet;
    }

    /* renamed from: q */
    public final boolean m62810q() {
        boolean z;
        synchronized (this.f11355l) {
            if (this.f11354k == CameraConfigs.emptyConfig()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: r */
    public final boolean m62809r() {
        boolean z;
        synchronized (this.f11355l) {
            z = true;
            if (this.f11354k.getUseCaseCombinationRequiredRule() != 1) {
                z = false;
            }
        }
        return z;
    }

    public void removeUseCases(@NonNull Collection<UseCase> collection) {
        synchronized (this.f11355l) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f11349f);
            linkedHashSet.removeAll(collection);
            m62829D(linkedHashSet);
        }
    }

    /* renamed from: s */
    public final boolean m62808s(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            if (m62805v(useCase)) {
                z = true;
            } else if (m62806u(useCase)) {
                z2 = true;
            }
        }
        if (!z || z2) {
            return false;
        }
        return true;
    }

    public void setActiveResumingMode(boolean z) {
        this.f11344a.setActiveResumingMode(z);
    }

    public void setEffects(@Nullable List<CameraEffect> list) {
        synchronized (this.f11355l) {
            this.f11353j = list;
        }
    }

    @Override // androidx.camera.core.Camera
    public void setExtendedConfig(@Nullable CameraConfig cameraConfig) {
        synchronized (this.f11355l) {
            if (cameraConfig == null) {
                try {
                    cameraConfig = CameraConfigs.emptyConfig();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!this.f11349f.isEmpty() && !this.f11354k.getCompatibilityId().equals(cameraConfig.getCompatibilityId())) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            this.f11354k = cameraConfig;
            SessionProcessor sessionProcessor = cameraConfig.getSessionProcessor(null);
            if (sessionProcessor != null) {
                this.f11360q.enableRestrictedOperations(true, sessionProcessor.getSupportedCameraOperations());
            } else {
                this.f11360q.enableRestrictedOperations(false, null);
            }
            this.f11344a.setExtendedConfig(this.f11354k);
        }
    }

    public void setViewPort(@Nullable ViewPort viewPort) {
        synchronized (this.f11355l) {
            this.f11352i = viewPort;
        }
    }

    /* renamed from: t */
    public final boolean m62807t(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            if (m62805v(useCase)) {
                z2 = true;
            } else if (m62806u(useCase)) {
                z = true;
            }
        }
        if (!z || z2) {
            return false;
        }
        return true;
    }
}
