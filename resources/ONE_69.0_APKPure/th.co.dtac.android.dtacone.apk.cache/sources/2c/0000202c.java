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
public class SurfaceProcessorNode implements Node<AbstractC2541In, Out> {

    /* renamed from: a */
    public final SurfaceProcessorInternal f11524a;

    /* renamed from: b */
    public final CameraInternal f11525b;

    /* renamed from: c */
    public Out f11526c;

    /* renamed from: d */
    public AbstractC2541In f11527d;

    @AutoValue
    /* renamed from: androidx.camera.core.processing.SurfaceProcessorNode$In */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2541In {
        @NonNull
        /* renamed from: of */
        public static AbstractC2541In m62620of(@NonNull SurfaceEdge surfaceEdge, @NonNull List<OutConfig> list) {
            return new C2545c(surfaceEdge, list);
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
    public class C2542a implements FutureCallback {
        public C2542a() {
            SurfaceProcessorNode.this = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        /* renamed from: a */
        public void onSuccess(SurfaceOutput surfaceOutput) {
            Preconditions.checkNotNull(surfaceOutput);
            try {
                SurfaceProcessorNode.this.f11524a.onOutputSurface(surfaceOutput);
            } catch (ProcessingException e) {
                Logger.m63175e("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th2) {
            Logger.m63170w("SurfaceProcessorNode", "Downstream node failed to provide Surface.", th2);
        }
    }

    public SurfaceProcessorNode(@NonNull CameraInternal cameraInternal, @NonNull SurfaceProcessorInternal surfaceProcessorInternal) {
        this.f11525b = cameraInternal;
        this.f11524a = surfaceProcessorInternal;
    }

    /* renamed from: c */
    public static /* synthetic */ void m62629c(SurfaceProcessorNode surfaceProcessorNode) {
        surfaceProcessorNode.m62627e();
    }

    /* renamed from: g */
    public static /* synthetic */ void m62625g(Map map, SurfaceRequest.TransformationInfo transformationInfo) {
        for (Map.Entry entry : map.entrySet()) {
            int rotationDegrees = transformationInfo.getRotationDegrees() - ((OutConfig) entry.getKey()).getRotationDegrees();
            if (((OutConfig) entry.getKey()).getMirroring()) {
                rotationDegrees = -rotationDegrees;
            }
            ((SurfaceEdge) entry.getValue()).updateTransformation(TransformUtils.within360(rotationDegrees), -1);
        }
    }

    /* renamed from: d */
    public final void m62626f(SurfaceEdge surfaceEdge, Map.Entry entry) {
        CameraInternal cameraInternal;
        SurfaceEdge surfaceEdge2 = (SurfaceEdge) entry.getValue();
        Size resolution = surfaceEdge.getStreamSpec().getResolution();
        int format = ((OutConfig) entry.getKey()).getFormat();
        Rect cropRect = ((OutConfig) entry.getKey()).getCropRect();
        int rotationDegrees = ((OutConfig) entry.getKey()).getRotationDegrees();
        boolean mirroring = ((OutConfig) entry.getKey()).getMirroring();
        if (surfaceEdge.hasCameraTransform()) {
            cameraInternal = this.f11525b;
        } else {
            cameraInternal = null;
        }
        Futures.addCallback(surfaceEdge2.createSurfaceOutputFuture(resolution, format, cropRect, rotationDegrees, mirroring, cameraInternal), new C2542a(), CameraXExecutors.mainThreadExecutor());
    }

    /* renamed from: e */
    public final /* synthetic */ void m62627e() {
        Out out = this.f11526c;
        if (out != null) {
            for (SurfaceEdge surfaceEdge : out.values()) {
                surfaceEdge.close();
            }
        }
    }

    @NonNull
    public SurfaceProcessorInternal getSurfaceProcessor() {
        return this.f11524a;
    }

    /* renamed from: h */
    public final void m62624h(final SurfaceEdge surfaceEdge, Map map) {
        for (final Map.Entry entry : map.entrySet()) {
            m62626f(surfaceEdge, entry);
            ((SurfaceEdge) entry.getValue()).addOnInvalidatedListener(new Runnable() { // from class: sQ1
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceProcessorNode.this.m62626f(surfaceEdge, entry);
                }
            });
        }
    }

    /* renamed from: i */
    public final void m62623i(SurfaceEdge surfaceEdge, Map map) {
        SurfaceRequest createSurfaceRequest = surfaceEdge.createSurfaceRequest(this.f11525b);
        m62622j(createSurfaceRequest, map);
        try {
            this.f11524a.onInputSurface(createSurfaceRequest);
        } catch (ProcessingException e) {
            Logger.m63175e("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
    }

    /* renamed from: j */
    public void m62622j(SurfaceRequest surfaceRequest, final Map map) {
        surfaceRequest.setTransformationInfoListener(CameraXExecutors.mainThreadExecutor(), new SurfaceRequest.TransformationInfoListener() { // from class: uQ1
            @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
            public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                SurfaceProcessorNode.m62625g(map, transformationInfo);
            }
        });
    }

    /* renamed from: k */
    public final SurfaceEdge m62621k(SurfaceEdge surfaceEdge, OutConfig outConfig) {
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
        this.f11524a.release();
        CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: tQ1
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceProcessorNode.m62629c(SurfaceProcessorNode.this);
            }
        });
    }

    @Override // androidx.camera.core.processing.Node
    @NonNull
    @MainThread
    public Out transform(@NonNull AbstractC2541In abstractC2541In) {
        Threads.checkMainThread();
        this.f11527d = abstractC2541In;
        this.f11526c = new Out();
        SurfaceEdge surfaceEdge = abstractC2541In.getSurfaceEdge();
        for (OutConfig outConfig : abstractC2541In.getOutConfigs()) {
            this.f11526c.put(outConfig, m62621k(surfaceEdge, outConfig));
        }
        m62623i(surfaceEdge, this.f11526c);
        m62624h(surfaceEdge, this.f11526c);
        return this.f11526c;
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class OutConfig {
        @NonNull
        /* renamed from: of */
        public static OutConfig m62618of(@NonNull SurfaceEdge surfaceEdge) {
            return m62619of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), surfaceEdge.getCropRect(), TransformUtils.getRotatedSize(surfaceEdge.getCropRect(), surfaceEdge.getRotationDegrees()), surfaceEdge.getRotationDegrees(), surfaceEdge.getMirroring());
        }

        /* renamed from: a */
        public abstract UUID mo62605a();

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
        public static OutConfig m62619of(int i, int i2, @NonNull Rect rect, @NonNull Size size, int i3, boolean z) {
            return new C2546d(UUID.randomUUID(), i, i2, rect, size, i3, z);
        }
    }
}