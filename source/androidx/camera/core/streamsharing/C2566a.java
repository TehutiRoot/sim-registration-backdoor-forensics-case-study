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
public class C2566a implements CameraInternal {

    /* renamed from: a */
    public final Set f11484a;

    /* renamed from: d */
    public final UseCaseConfigFactory f11487d;

    /* renamed from: e */
    public final CameraInternal f11488e;

    /* renamed from: g */
    public final VirtualCameraControl f11490g;

    /* renamed from: b */
    public final Map f11485b = new HashMap();

    /* renamed from: c */
    public final Map f11486c = new HashMap();

    /* renamed from: f */
    public final CameraCaptureCallback f11489f = m62642b();

    /* renamed from: androidx.camera.core.streamsharing.a$a */
    /* loaded from: classes.dex */
    public class C2567a extends CameraCaptureCallback {
        public C2567a() {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
            super.onCaptureCompleted(cameraCaptureResult);
            for (UseCase useCase : C2566a.this.f11484a) {
                C2566a.m62626r(cameraCaptureResult, useCase.getSessionConfig());
            }
        }
    }

    public C2566a(CameraInternal cameraInternal, Set set, UseCaseConfigFactory useCaseConfigFactory, StreamSharing.InterfaceC2565a interfaceC2565a) {
        this.f11488e = cameraInternal;
        this.f11487d = useCaseConfigFactory;
        this.f11484a = set;
        this.f11490g = new VirtualCameraControl(cameraInternal.getCameraControlInternal(), interfaceC2565a);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f11486c.put((UseCase) it.next(), Boolean.FALSE);
        }
    }

    /* renamed from: d */
    public static int m62640d(UseCase useCase) {
        if (useCase instanceof ImageCapture) {
            return 256;
        }
        return 34;
    }

    /* renamed from: f */
    public static DeferrableSurface m62638f(UseCase useCase) {
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
    public static int m62637g(UseCase useCase) {
        if (useCase instanceof Preview) {
            return 1;
        }
        if (useCase instanceof ImageCapture) {
            return 4;
        }
        return 2;
    }

    /* renamed from: j */
    public static int m62634j(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = Math.max(i, ((UseCaseConfig) it.next()).getSurfaceOccupancyPriority());
        }
        return i;
    }

    /* renamed from: r */
    public static void m62626r(CameraCaptureResult cameraCaptureResult, SessionConfig sessionConfig) {
        for (CameraCaptureCallback cameraCaptureCallback : sessionConfig.getRepeatingCameraCaptureCallbacks()) {
            cameraCaptureCallback.onCaptureCompleted(new VirtualCameraCaptureResult(sessionConfig.getRepeatingCaptureConfig().getTagBundle(), cameraCaptureResult));
        }
    }

    /* renamed from: a */
    public void m62643a() {
        for (UseCase useCase : this.f11484a) {
            useCase.bindToCamera(this, null, useCase.getDefaultConfig(true, this.f11487d));
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    /* renamed from: b */
    public CameraCaptureCallback m62642b() {
        return new C2567a();
    }

    /* renamed from: c */
    public final void m62641c(SurfaceEdge surfaceEdge, DeferrableSurface deferrableSurface, SessionConfig sessionConfig) {
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
    public final int m62639e(UseCase useCase) {
        if (useCase instanceof Preview) {
            return this.f11488e.getCameraInfo().getSensorRotationDegrees(((Preview) useCase).getTargetRotation());
        }
        return 0;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ CameraControl getCameraControl() {
        return AbstractC1629Wj.m65576a(this);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public CameraControlInternal getCameraControlInternal() {
        return this.f11490g;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ CameraInfo getCameraInfo() {
        return AbstractC1629Wj.m65575b(this);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public CameraInfoInternal getCameraInfoInternal() {
        return this.f11488e.getCameraInfoInternal();
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ LinkedHashSet getCameraInternals() {
        return AbstractC1629Wj.m65574c(this);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public Observable getCameraState() {
        return this.f11488e.getCameraState();
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ CameraConfig getExtendedConfig() {
        return AbstractC1629Wj.m65573d(this);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public boolean getHasTransform() {
        return false;
    }

    /* renamed from: h */
    public Set m62636h() {
        return this.f11484a;
    }

    /* renamed from: i */
    public Map m62635i(SurfaceEdge surfaceEdge) {
        HashMap hashMap = new HashMap();
        for (UseCase useCase : this.f11484a) {
            int m62639e = m62639e(useCase);
            hashMap.put(useCase, SurfaceProcessorNode.OutConfig.m62671of(m62637g(useCase), m62640d(useCase), surfaceEdge.getCropRect(), TransformUtils.getRotatedSize(surfaceEdge.getCropRect(), m62639e), m62639e, useCase.isMirroringRequired(this)));
        }
        return hashMap;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public /* synthetic */ boolean isFrontFacing() {
        return AbstractC1629Wj.m65571f(this);
    }

    @Override // androidx.camera.core.Camera
    public /* synthetic */ boolean isUseCasesCombinationSupported(UseCase... useCaseArr) {
        return AbstractC14018th.m22372a(this, useCaseArr);
    }

    /* renamed from: k */
    public CameraCaptureCallback m62633k() {
        return this.f11489f;
    }

    /* renamed from: l */
    public final SurfaceEdge m62632l(UseCase useCase) {
        SurfaceEdge surfaceEdge = (SurfaceEdge) this.f11485b.get(useCase);
        Objects.requireNonNull(surfaceEdge);
        return surfaceEdge;
    }

    /* renamed from: m */
    public final boolean m62631m(UseCase useCase) {
        Boolean bool = (Boolean) this.f11486c.get(useCase);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    /* renamed from: n */
    public void m62630n(MutableConfig mutableConfig) {
        HashSet hashSet = new HashSet();
        for (UseCase useCase : this.f11484a) {
            hashSet.add(useCase.mergeConfigs(this.f11488e.getCameraInfoInternal(), null, useCase.getDefaultConfig(true, this.f11487d)));
        }
        mutableConfig.insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, AbstractC23395zx1.m0a(new ArrayList(this.f11488e.getCameraInfoInternal().getSupportedResolutions(34)), TransformUtils.rectToSize(this.f11488e.getCameraControlInternal().getSensorRect()), hashSet));
        mutableConfig.insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(m62634j(hashSet)));
    }

    /* renamed from: o */
    public void m62629o() {
        for (UseCase useCase : this.f11484a) {
            useCase.onStateAttached();
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(UseCase useCase) {
        Threads.checkMainThread();
        if (m62631m(useCase)) {
            return;
        }
        this.f11486c.put(useCase, Boolean.TRUE);
        DeferrableSurface m62638f = m62638f(useCase);
        if (m62638f != null) {
            m62641c(m62632l(useCase), m62638f, useCase.getSessionConfig());
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(UseCase useCase) {
        Threads.checkMainThread();
        if (!m62631m(useCase)) {
            return;
        }
        this.f11486c.put(useCase, Boolean.FALSE);
        m62632l(useCase).disconnect();
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(UseCase useCase) {
        DeferrableSurface m62638f;
        Threads.checkMainThread();
        SurfaceEdge m62632l = m62632l(useCase);
        m62632l.invalidate();
        if (m62631m(useCase) && (m62638f = m62638f(useCase)) != null) {
            m62641c(m62632l, m62638f, useCase.getSessionConfig());
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(UseCase useCase) {
        Threads.checkMainThread();
        if (!m62631m(useCase)) {
            return;
        }
        SurfaceEdge m62632l = m62632l(useCase);
        DeferrableSurface m62638f = m62638f(useCase);
        if (m62638f != null) {
            m62641c(m62632l, m62638f, useCase.getSessionConfig());
        } else {
            m62632l.disconnect();
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    /* renamed from: p */
    public void m62628p() {
        for (UseCase useCase : this.f11484a) {
            useCase.onStateDetached();
        }
    }

    /* renamed from: q */
    public void m62627q() {
        Threads.checkMainThread();
        for (UseCase useCase : this.f11484a) {
            onUseCaseReset(useCase);
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public ListenableFuture release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    /* renamed from: s */
    public void m62625s(Map map) {
        this.f11485b.clear();
        this.f11485b.putAll(map);
        for (Map.Entry entry : this.f11485b.entrySet()) {
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
        AbstractC1629Wj.m65570g(this, z);
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ void setExtendedConfig(CameraConfig cameraConfig) {
        AbstractC1629Wj.m65569h(this, cameraConfig);
    }

    /* renamed from: t */
    public void m62624t() {
        for (UseCase useCase : this.f11484a) {
            useCase.unbindFromCamera(this);
        }
    }
}
