package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class SurfaceProcessorNode implements Node<AbstractC2559In, Out> {

    /* renamed from: a */
    public final SurfaceProcessorInternal f11436a;

    /* renamed from: b */
    public final CameraInternal f11437b;

    /* renamed from: c */
    public Out f11438c;

    /* renamed from: d */
    public AbstractC2559In f11439d;

    @AutoValue
    /* renamed from: androidx.camera.core.processing.SurfaceProcessorNode$In */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2559In {
        @NonNull
        /* renamed from: of */
        public static AbstractC2559In m62672of(@NonNull SurfaceEdge surfaceEdge, @NonNull List<OutConfig> list) {
            return new C2563c(surfaceEdge, list);
        }

        @NonNull
        public abstract List<OutConfig> getOutConfigs();

        @NonNull
        public abstract SurfaceEdge getSurfaceEdge();
    }

    /* loaded from: classes.dex */
    public static class Out extends HashMap<OutConfig, SurfaceEdge> {
    }

    /* renamed from: androidx.camera.core.processing.SurfaceProcessorNode$a */
    /* loaded from: classes.dex */
    public class C2560a implements FutureCallback {
        public C2560a() {
            SurfaceProcessorNode.this = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(SurfaceOutput surfaceOutput) {
            Preconditions.checkNotNull(surfaceOutput);
            try {
                SurfaceProcessorNode.this.f11436a.onOutputSurface(surfaceOutput);
            } catch (ProcessingException e) {
                Logger.m63227e("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            Logger.m63222w("SurfaceProcessorNode", "Downstream node failed to provide Surface.", th2);
        }
    }

    public SurfaceProcessorNode(@NonNull CameraInternal cameraInternal, @NonNull SurfaceProcessorInternal surfaceProcessorInternal) {
        this.f11437b = cameraInternal;
        this.f11436a = surfaceProcessorInternal;
    }

    /* renamed from: c */
    public static /* synthetic */ void m62681c(SurfaceProcessorNode surfaceProcessorNode) {
        surfaceProcessorNode.m62679e();
    }

    /* renamed from: g */
    public static /* synthetic */ void m62677g(Map map, SurfaceRequest.TransformationInfo transformationInfo) {
        for (Map.Entry entry : map.entrySet()) {
            int rotationDegrees = transformationInfo.getRotationDegrees() - ((OutConfig) entry.getKey()).getRotationDegrees();
            if (((OutConfig) entry.getKey()).getMirroring()) {
                rotationDegrees = -rotationDegrees;
            }
            ((SurfaceEdge) entry.getValue()).updateTransformation(TransformUtils.within360(rotationDegrees), -1);
        }
    }

    /* renamed from: d */
    public final void m62678f(SurfaceEdge surfaceEdge, Map.Entry entry) {
        CameraInternal cameraInternal;
        SurfaceEdge surfaceEdge2 = (SurfaceEdge) entry.getValue();
        Size resolution = surfaceEdge.getStreamSpec().getResolution();
        int format = ((OutConfig) entry.getKey()).getFormat();
        Rect cropRect = ((OutConfig) entry.getKey()).getCropRect();
        int rotationDegrees = ((OutConfig) entry.getKey()).getRotationDegrees();
        boolean mirroring = ((OutConfig) entry.getKey()).getMirroring();
        if (surfaceEdge.hasCameraTransform()) {
            cameraInternal = this.f11437b;
        } else {
            cameraInternal = null;
        }
        Futures.addCallback(surfaceEdge2.createSurfaceOutputFuture(resolution, format, cropRect, rotationDegrees, mirroring, cameraInternal), new C2560a(), CameraXExecutors.mainThreadExecutor());
    }

    /* renamed from: e */
    public final /* synthetic */ void m62679e() {
        Out out = this.f11438c;
        if (out != null) {
            for (SurfaceEdge surfaceEdge : out.values()) {
                surfaceEdge.close();
            }
        }
    }

    @NonNull
    public SurfaceProcessorInternal getSurfaceProcessor() {
        return this.f11436a;
    }

    /* renamed from: h */
    public final void m62676h(final SurfaceEdge surfaceEdge, Map map) {
        for (final Map.Entry entry : map.entrySet()) {
            m62678f(surfaceEdge, entry);
            ((SurfaceEdge) entry.getValue()).addOnInvalidatedListener(new Runnable() { // from class: vP1
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceProcessorNode.this.m62678f(surfaceEdge, entry);
                }
            });
        }
    }

    /* renamed from: i */
    public final void m62675i(SurfaceEdge surfaceEdge, Map map) {
        SurfaceRequest createSurfaceRequest = surfaceEdge.createSurfaceRequest(this.f11437b);
        m62674j(createSurfaceRequest, map);
        try {
            this.f11436a.onInputSurface(createSurfaceRequest);
        } catch (ProcessingException e) {
            Logger.m63227e("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
    }

    /* renamed from: j */
    public void m62674j(SurfaceRequest surfaceRequest, final Map map) {
        surfaceRequest.setTransformationInfoListener(CameraXExecutors.mainThreadExecutor(), new SurfaceRequest.TransformationInfoListener() { // from class: xP1
            @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
            public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                SurfaceProcessorNode.m62677g(map, transformationInfo);
            }
        });
    }

    /* renamed from: k */
    public final SurfaceEdge m62673k(SurfaceEdge surfaceEdge, OutConfig outConfig) {
        boolean z;
        Rect cropRect = outConfig.getCropRect();
        int rotationDegrees = outConfig.getRotationDegrees();
        boolean mirroring = outConfig.getMirroring();
        Matrix matrix = new Matrix(surfaceEdge.getSensorToBufferTransform());
        matrix.postConcat(TransformUtils.getRectToRect(new RectF(cropRect), TransformUtils.sizeToRectF(outConfig.getSize()), rotationDegrees, mirroring));
        Preconditions.checkArgument(TransformUtils.isAspectRatioMatchingWithRoundingError(TransformUtils.getRotatedSize(cropRect, rotationDegrees), outConfig.getSize()));
        StreamSpec build = surfaceEdge.getStreamSpec().toBuilder().setResolution(outConfig.getSize()).build();
        int targets = outConfig.getTargets();
        int format = outConfig.getFormat();
        Rect sizeToRect = TransformUtils.sizeToRect(outConfig.getSize());
        int rotationDegrees2 = surfaceEdge.getRotationDegrees() - rotationDegrees;
        if (surfaceEdge.getMirroring() != mirroring) {
            z = true;
        } else {
            z = false;
        }
        return new SurfaceEdge(targets, format, build, matrix, false, sizeToRect, rotationDegrees2, -1, z);
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        this.f11436a.release();
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: wP1
            {
                SurfaceProcessorNode.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SurfaceProcessorNode.m62681c(SurfaceProcessorNode.this);
            }
        });
    }

    @Override // androidx.camera.core.processing.Node
    @NonNull
    @MainThread
    public Out transform(@NonNull AbstractC2559In abstractC2559In) {
        Threads.checkMainThread();
        this.f11439d = abstractC2559In;
        this.f11438c = new Out();
        SurfaceEdge surfaceEdge = abstractC2559In.getSurfaceEdge();
        for (OutConfig outConfig : abstractC2559In.getOutConfigs()) {
            this.f11438c.put(outConfig, m62673k(surfaceEdge, outConfig));
        }
        m62675i(surfaceEdge, this.f11438c);
        m62676h(surfaceEdge, this.f11438c);
        return this.f11438c;
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class OutConfig {
        @NonNull
        /* renamed from: of */
        public static OutConfig m62670of(@NonNull SurfaceEdge surfaceEdge) {
            return m62671of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), surfaceEdge.getCropRect(), TransformUtils.getRotatedSize(surfaceEdge.getCropRect(), surfaceEdge.getRotationDegrees()), surfaceEdge.getRotationDegrees(), surfaceEdge.getMirroring());
        }

        /* renamed from: a */
        public abstract UUID mo62657a();

        @NonNull
        public abstract Rect getCropRect();

        public abstract int getFormat();

        public abstract boolean getMirroring();

        public abstract int getRotationDegrees();

        @NonNull
        public abstract Size getSize();

        public abstract int getTargets();

        @NonNull
        /* renamed from: of */
        public static OutConfig m62671of(int i, int i2, @NonNull Rect rect, @NonNull Size size, int i3, boolean z) {
            return new C2564d(UUID.randomUUID(), i, i2, rect, size, i3, z);
        }
    }
}
