package androidx.camera.core.streamsharing;

import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: androidx.camera.core.streamsharing.a */
/* loaded from: classes.dex */
public class C2548a implements CameraInternal {

    /* renamed from: a */
    public final Set f11572a;

    /* renamed from: d */
    public final UseCaseConfigFactory f11575d;

    /* renamed from: e */
    public final CameraInternal f11576e;

    /* renamed from: g */
    public final VirtualCameraControl f11578g;

    /* renamed from: b */
    public final Map f11573b = new HashMap();

    /* renamed from: c */
    public final Map f11574c = new HashMap();

    /* renamed from: f */
    public final CameraCaptureCallback f11577f = m62590b();

    /* renamed from: androidx.camera.core.streamsharing.a$a */
    /* loaded from: classes.dex */
    public class C2549a extends CameraCaptureCallback {
        public C2549a() {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
            super.onCaptureCompleted(cameraCaptureResult);
            for (UseCase useCase : C2548a.this.f11572a) {
                C2548a.m62574r(cameraCaptureResult, useCase.getSessionConfig());
            }
        }
    }

    public C2548a(CameraInternal cameraInternal, Set set, UseCaseConfigFactory useCaseConfigFactory, StreamSharing.InterfaceC2547a interfaceC2547a) {
        this.f11576e = cameraInternal;
        this.f11575d = useCaseConfigFactory;
        this.f11572a = set;
        this.f11578g = new VirtualCameraControl(cameraInternal.getCameraControlInternal(), interfaceC2547a);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f11574c.put((UseCase) it.next(), Boolean.FALSE);
        }
    }

    /* renamed from: d */
    public static int m62588d(UseCase useCase) {
        if (useCase instanceof ImageCapture) {
            return 256;
        }
        return 34;
    }

    /* renamed from: f */
    public static DeferrableSurface m62586f(UseCase useCase) {
        List<DeferrableSurface> surfaces;
        boolean z;
        if (useCase instanceof ImageCapture) {
            surfaces = useCase.getSessionConfig().getSurfaces();
        } else {
            surfaces = useCase.getSessionConfig().getRepeatingCaptureConfig().getSurfaces();
        }
        if (surfaces.size() <= 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (surfaces.size() == 1) {
            return surfaces.get(0);
        }
        return null;
    }

    /* renamed from: g */
    public static int m62585g(UseCase useCase) {
        if (useCase instanceof Preview) {
            return 1;
        }
        if (useCase instanceof ImageCapture) {
            return 4;
        }
        return 2;
    }

    /* renamed from: j */
    public static int m62582j(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = Math.max(i, ((UseCaseConfig) it.next()).getSurfaceOccupancyPriority());
        }
        return i;
    }

    /* renamed from: r */
    public static void m62574r(CameraCaptureResult cameraCaptureResult, SessionConfig sessionConfig) {
        for (CameraCaptureCallback cameraCaptureCallback : sessionConfig.getRepeatingCameraCaptureCallbacks()) {
            cameraCaptureCallback.onCaptureCompleted(new VirtualCameraCaptureResult(sessionConfig.getRepeatingCaptureConfig().getTagBundle(), cameraCaptureResult));
        }
    }

    /* renamed from: a */
    public void m62591a() {
        for (UseCase useCase : this.f11572a) {
            useCase.bindToCamera(this, null, useCase.getDefaultConfig(true, this.f11575d));
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    /* renamed from: b */
    public CameraCaptureCallback m62590b() {
        return new C2549a();
    }

    /* renamed from: c */
    public final void m62589c(SurfaceEdge surfaceEdge, DeferrableSurface deferrableSurface, SessionConfig sessionConfig) {
        surfaceEdge.invalidate();
        try {
            surfaceEdge.setProvider(deferrableSurface);
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            for (SessionConfig.ErrorListener errorListener : sessionConfig.getErrorListeners()) {
                errorListener.onError(sessionConfig, SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void close() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    /* renamed from: e */
    public final int m62587e(UseCase useCase) {
        if (useCase instanceof Preview) {
            return this.f11576e.getCameraInfo().getSensorRotationDegrees(((Preview) useCase).getTargetRotation());
        }
        return 0;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ CameraControl getCameraControl() {
        return AbstractC1620Wj.m65670a(this);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public CameraControlInternal getCameraControlInternal() {
        return this.f11578g;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ CameraInfo getCameraInfo() {
        return AbstractC1620Wj.m65669b(this);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public CameraInfoInternal getCameraInfoInternal() {
        return this.f11576e.getCameraInfoInternal();
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ LinkedHashSet getCameraInternals() {
        return AbstractC1620Wj.m65668c(this);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public Observable getCameraState() {
        return this.f11576e.getCameraState();
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ CameraConfig getExtendedConfig() {
        return AbstractC1620Wj.m65667d(this);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public boolean getHasTransform() {
        return false;
    }

    /* renamed from: h */
    public Set m62584h() {
        return this.f11572a;
    }

    /* renamed from: i */
    public Map m62583i(SurfaceEdge surfaceEdge) {
        HashMap hashMap = new HashMap();
        for (UseCase useCase : this.f11572a) {
            int m62587e = m62587e(useCase);
            hashMap.put(useCase, SurfaceProcessorNode.OutConfig.m62619of(m62585g(useCase), m62588d(useCase), surfaceEdge.getCropRect(), TransformUtils.getRotatedSize(surfaceEdge.getCropRect(), m62587e), m62587e, useCase.isMirroringRequired(this)));
        }
        return hashMap;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public /* synthetic */ boolean isFrontFacing() {
        return AbstractC1620Wj.m65665f(this);
    }

    @Override // androidx.camera.core.Camera
    public /* synthetic */ boolean isUseCasesCombinationSupported(UseCase... useCaseArr) {
        return AbstractC14006th.m22569a(this, useCaseArr);
    }

    /* renamed from: k */
    public CameraCaptureCallback m62581k() {
        return this.f11577f;
    }

    /* renamed from: l */
    public final SurfaceEdge m62580l(UseCase useCase) {
        SurfaceEdge surfaceEdge = (SurfaceEdge) this.f11573b.get(useCase);
        Objects.requireNonNull(surfaceEdge);
        return surfaceEdge;
    }

    /* renamed from: m */
    public final boolean m62579m(UseCase useCase) {
        Boolean bool = (Boolean) this.f11574c.get(useCase);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    /* renamed from: n */
    public void m62578n(MutableConfig mutableConfig) {
        HashSet hashSet = new HashSet();
        for (UseCase useCase : this.f11572a) {
            hashSet.add(useCase.mergeConfigs(this.f11576e.getCameraInfoInternal(), null, useCase.getDefaultConfig(true, this.f11575d)));
        }
        mutableConfig.insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, AbstractC22951wy1.m616a(new ArrayList(this.f11576e.getCameraInfoInternal().getSupportedResolutions(34)), TransformUtils.rectToSize(this.f11576e.getCameraControlInternal().getSensorRect()), hashSet));
        mutableConfig.insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(m62582j(hashSet)));
    }

    /* renamed from: o */
    public void m62577o() {
        for (UseCase useCase : this.f11572a) {
            useCase.onStateAttached();
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(UseCase useCase) {
        Threads.checkMainThread();
        if (m62579m(useCase)) {
            return;
        }
        this.f11574c.put(useCase, Boolean.TRUE);
        DeferrableSurface m62586f = m62586f(useCase);
        if (m62586f != null) {
            m62589c(m62580l(useCase), m62586f, useCase.getSessionConfig());
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(UseCase useCase) {
        Threads.checkMainThread();
        if (!m62579m(useCase)) {
            return;
        }
        this.f11574c.put(useCase, Boolean.FALSE);
        m62580l(useCase).disconnect();
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(UseCase useCase) {
        DeferrableSurface m62586f;
        Threads.checkMainThread();
        SurfaceEdge m62580l = m62580l(useCase);
        m62580l.invalidate();
        if (m62579m(useCase) && (m62586f = m62586f(useCase)) != null) {
            m62589c(m62580l, m62586f, useCase.getSessionConfig());
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(UseCase useCase) {
        Threads.checkMainThread();
        if (!m62579m(useCase)) {
            return;
        }
        SurfaceEdge m62580l = m62580l(useCase);
        DeferrableSurface m62586f = m62586f(useCase);
        if (m62586f != null) {
            m62589c(m62580l, m62586f, useCase.getSessionConfig());
        } else {
            m62580l.disconnect();
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    /* renamed from: p */
    public void m62576p() {
        for (UseCase useCase : this.f11572a) {
            useCase.onStateDetached();
        }
    }

    /* renamed from: q */
    public void m62575q() {
        Threads.checkMainThread();
        for (UseCase useCase : this.f11572a) {
            onUseCaseReset(useCase);
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public ListenableFuture release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    /* renamed from: s */
    public void m62573s(Map map) {
        this.f11573b.clear();
        this.f11573b.putAll(map);
        for (Map.Entry entry : this.f11573b.entrySet()) {
            UseCase useCase = (UseCase) entry.getKey();
            SurfaceEdge surfaceEdge = (SurfaceEdge) entry.getValue();
            useCase.setViewPortCropRect(surfaceEdge.getCropRect());
            useCase.setSensorToBufferTransformMatrix(surfaceEdge.getSensorToBufferTransform());
            useCase.updateSuggestedStreamSpec(surfaceEdge.getStreamSpec());
            useCase.notifyState();
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public /* synthetic */ void setActiveResumingMode(boolean z) {
        AbstractC1620Wj.m65664g(this, z);
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ void setExtendedConfig(CameraConfig cameraConfig) {
        AbstractC1620Wj.m65663h(this, cameraConfig);
    }

    /* renamed from: t */
    public void m62572t() {
        for (UseCase useCase : this.f11572a) {
            useCase.unbindFromCamera(this);
        }
    }
}