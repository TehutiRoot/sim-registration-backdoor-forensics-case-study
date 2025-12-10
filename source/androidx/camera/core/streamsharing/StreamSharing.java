package androidx.camera.core.streamsharing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class StreamSharing extends UseCase {

    /* renamed from: n */
    public final StreamSharingConfig f11471n;

    /* renamed from: o */
    public final C2566a f11472o;

    /* renamed from: p */
    public SurfaceProcessorNode f11473p;

    /* renamed from: q */
    public SurfaceProcessorNode f11474q;

    /* renamed from: r */
    public SurfaceEdge f11475r;

    /* renamed from: s */
    public SurfaceEdge f11476s;

    /* renamed from: t */
    public SessionConfig.Builder f11477t;

    /* renamed from: androidx.camera.core.streamsharing.StreamSharing$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2565a {
        /* renamed from: a */
        ListenableFuture mo62646a(int i, int i2);
    }

    public StreamSharing(@NonNull CameraInternal cameraInternal, @NonNull Set<UseCase> set, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        super(m62650i(set));
        this.f11471n = m62650i(set);
        this.f11472o = new C2566a(cameraInternal, set, useCaseConfigFactory, new InterfaceC2565a() { // from class: DM1
            {
                StreamSharing.this = this;
            }

            @Override // androidx.camera.core.streamsharing.StreamSharing.InterfaceC2565a
            /* renamed from: a */
            public final ListenableFuture mo62646a(int i, int i2) {
                return StreamSharing.m62655d(StreamSharing.this, i, i2);
            }
        });
    }

    /* renamed from: c */
    public static /* synthetic */ void m62656c(StreamSharing streamSharing, String str, UseCaseConfig useCaseConfig, StreamSpec streamSpec, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        streamSharing.m62648k(str, useCaseConfig, streamSpec, sessionConfig, sessionError);
    }

    /* renamed from: d */
    public static /* synthetic */ ListenableFuture m62655d(StreamSharing streamSharing, int i, int i2) {
        return streamSharing.m62647l(i, i2);
    }

    /* renamed from: f */
    private void m62653f() {
        SurfaceEdge surfaceEdge = this.f11475r;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.f11475r = null;
        }
        SurfaceEdge surfaceEdge2 = this.f11476s;
        if (surfaceEdge2 != null) {
            surfaceEdge2.close();
            this.f11476s = null;
        }
        SurfaceProcessorNode surfaceProcessorNode = this.f11474q;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.release();
            this.f11474q = null;
        }
        SurfaceProcessorNode surfaceProcessorNode2 = this.f11473p;
        if (surfaceProcessorNode2 != null) {
            surfaceProcessorNode2.release();
            this.f11473p = null;
        }
    }

    /* renamed from: h */
    private Rect m62651h(Size size) {
        if (getViewPortCropRect() != null) {
            return getViewPortCropRect();
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    /* renamed from: i */
    public static StreamSharingConfig m62650i(Set set) {
        MutableConfig mutableConfig = new EM1().getMutableConfig();
        mutableConfig.insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 34);
        mutableConfig.insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, UseCaseConfigFactory.CaptureType.STREAM_SHARING);
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            if (useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE)) {
                arrayList.add(useCase.getCurrentConfig().getCaptureType());
            }
        }
        mutableConfig.insertOption(StreamSharingConfig.f11478b, arrayList);
        mutableConfig.insertOption(ImageOutputConfig.OPTION_MIRROR_MODE, 2);
        return new StreamSharingConfig(OptionsBundle.from(mutableConfig));
    }

    /* renamed from: e */
    public final void m62654e(SessionConfig.Builder builder, final String str, final UseCaseConfig useCaseConfig, final StreamSpec streamSpec) {
        builder.addErrorListener(new SessionConfig.ErrorListener() { // from class: CM1
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                StreamSharing.m62656c(StreamSharing.this, str, useCaseConfig, streamSpec, sessionConfig, sessionError);
            }
        });
    }

    /* renamed from: g */
    public final SessionConfig m62652g(String str, UseCaseConfig useCaseConfig, StreamSpec streamSpec) {
        Threads.checkMainThread();
        CameraInternal cameraInternal = (CameraInternal) Preconditions.checkNotNull(getCamera());
        Matrix sensorToBufferTransformMatrix = getSensorToBufferTransformMatrix();
        boolean hasTransform = cameraInternal.getHasTransform();
        Rect m62651h = m62651h(streamSpec.getResolution());
        Objects.requireNonNull(m62651h);
        SurfaceEdge surfaceEdge = new SurfaceEdge(3, 34, streamSpec, sensorToBufferTransformMatrix, hasTransform, m62651h, getRelativeRotation(cameraInternal), -1, isMirroringRequired(cameraInternal));
        this.f11475r = surfaceEdge;
        this.f11476s = m62649j(surfaceEdge, cameraInternal);
        this.f11474q = new SurfaceProcessorNode(cameraInternal, DefaultSurfaceProcessor.Factory.newInstance(streamSpec.getDynamicRange()));
        Map m62635i = this.f11472o.m62635i(this.f11476s);
        SurfaceProcessorNode.Out transform = this.f11474q.transform(SurfaceProcessorNode.AbstractC2559In.m62672of(this.f11476s, new ArrayList(m62635i.values())));
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : m62635i.entrySet()) {
            hashMap.put((UseCase) entry.getKey(), transform.get(entry.getValue()));
        }
        this.f11472o.m62625s(hashMap);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(useCaseConfig, streamSpec.getResolution());
        createFrom.addSurface(this.f11475r.getDeferrableSurface());
        createFrom.addRepeatingCameraCaptureCallback(this.f11472o.m62633k());
        if (streamSpec.getImplementationOptions() != null) {
            createFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        m62654e(createFrom, str, useCaseConfig, streamSpec);
        this.f11477t = createFrom;
        return createFrom.build();
    }

    @NonNull
    public Set<UseCase> getChildren() {
        return this.f11472o.m62636h();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    @Nullable
    public UseCaseConfig<?> getDefaultConfig(boolean z, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        Config config = useCaseConfigFactory.getConfig(this.f11471n.getCaptureType(), 1);
        if (z) {
            config = AbstractC12183kw.m26583b(config, this.f11471n.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    public Set<Integer> getSupportedEffectTargets() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(@NonNull Config config) {
        return new EM1(MutableOptionsBundle.from(config));
    }

    /* renamed from: j */
    public final SurfaceEdge m62649j(SurfaceEdge surfaceEdge, CameraInternal cameraInternal) {
        if (getEffect() == null) {
            return surfaceEdge;
        }
        this.f11473p = new SurfaceProcessorNode(cameraInternal, getEffect().createSurfaceProcessorInternal());
        SurfaceProcessorNode.OutConfig m62671of = SurfaceProcessorNode.OutConfig.m62671of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), surfaceEdge.getCropRect(), TransformUtils.getRotatedSize(surfaceEdge.getCropRect(), 0), 0, false);
        SurfaceEdge surfaceEdge2 = this.f11473p.transform(SurfaceProcessorNode.AbstractC2559In.m62672of(surfaceEdge, Collections.singletonList(m62671of))).get(m62671of);
        Objects.requireNonNull(surfaceEdge2);
        return surfaceEdge2;
    }

    /* renamed from: k */
    public final /* synthetic */ void m62648k(String str, UseCaseConfig useCaseConfig, StreamSpec streamSpec, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        m62653f();
        if (isCurrentCamera(str)) {
            updateSessionConfig(m62652g(str, useCaseConfig, streamSpec));
            notifyReset();
            this.f11472o.m62627q();
        }
    }

    /* renamed from: l */
    public final /* synthetic */ ListenableFuture m62647l(int i, int i2) {
        SurfaceProcessorNode surfaceProcessorNode = this.f11474q;
        if (surfaceProcessorNode != null) {
            return surfaceProcessorNode.getSurfaceProcessor().snapshot(i, i2);
        }
        return Futures.immediateFailedFuture(new Exception("Failed to take picture: pipeline is not ready."));
    }

    @Override // androidx.camera.core.UseCase
    public void onBind() {
        super.onBind();
        this.f11472o.m62643a();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // androidx.camera.core.UseCase
    @NonNull
    public UseCaseConfig<?> onMergeConfig(@NonNull CameraInfoInternal cameraInfoInternal, @NonNull UseCaseConfig.Builder<?, ?, ?> builder) {
        this.f11472o.m62630n(builder.getMutableConfig());
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public void onStateAttached() {
        super.onStateAttached();
        this.f11472o.m62629o();
    }

    @Override // androidx.camera.core.UseCase
    public void onStateDetached() {
        super.onStateDetached();
        this.f11472o.m62628p();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(@NonNull Config config) {
        this.f11477t.addImplementationOptions(config);
        updateSessionConfig(this.f11477t.build());
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    public StreamSpec onSuggestedStreamSpecUpdated(@NonNull StreamSpec streamSpec) {
        updateSessionConfig(m62652g(getCameraId(), getCurrentConfig(), streamSpec));
        notifyActive();
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public void onUnbind() {
        super.onUnbind();
        m62653f();
        this.f11472o.m62624t();
    }
}
