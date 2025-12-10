package androidx.camera.core.processing;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceProcessor;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.SurfaceProcessorWithExecutor;
import androidx.core.util.Consumer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class SurfaceProcessorWithExecutor implements SurfaceProcessorInternal {

    /* renamed from: a */
    public final SurfaceProcessor f11441a;

    /* renamed from: b */
    public final Executor f11442b;

    /* renamed from: c */
    public final Consumer f11443c;

    public SurfaceProcessorWithExecutor(@NonNull CameraEffect cameraEffect) {
        SurfaceProcessor surfaceProcessor = cameraEffect.getSurfaceProcessor();
        Objects.requireNonNull(surfaceProcessor);
        this.f11441a = surfaceProcessor;
        this.f11442b = cameraEffect.getExecutor();
        this.f11443c = cameraEffect.getErrorListener();
    }

    /* renamed from: a */
    public static /* synthetic */ void m62668a(SurfaceProcessorWithExecutor surfaceProcessorWithExecutor, SurfaceOutput surfaceOutput) {
        surfaceProcessorWithExecutor.m62665d(surfaceOutput);
    }

    /* renamed from: c */
    public final /* synthetic */ void m62666c(SurfaceRequest surfaceRequest) {
        try {
            this.f11441a.onInputSurface(surfaceRequest);
        } catch (ProcessingException e) {
            Logger.m63227e("SurfaceProcessor", "Failed to setup SurfaceProcessor input.", e);
            this.f11443c.accept(e);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m62665d(SurfaceOutput surfaceOutput) {
        try {
            this.f11441a.onOutputSurface(surfaceOutput);
        } catch (ProcessingException e) {
            Logger.m63227e("SurfaceProcessor", "Failed to setup SurfaceProcessor output.", e);
            this.f11443c.accept(e);
        }
    }

    @NonNull
    @VisibleForTesting
    public Executor getExecutor() {
        return this.f11442b;
    }

    @NonNull
    @VisibleForTesting
    public SurfaceProcessor getProcessor() {
        return this.f11441a;
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(@NonNull final SurfaceRequest surfaceRequest) {
        this.f11442b.execute(new Runnable() { // from class: yP1
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceProcessorWithExecutor.this.m62666c(surfaceRequest);
            }
        });
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(@NonNull final SurfaceOutput surfaceOutput) {
        this.f11442b.execute(new Runnable() { // from class: zP1
            {
                SurfaceProcessorWithExecutor.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SurfaceProcessorWithExecutor.m62668a(SurfaceProcessorWithExecutor.this, surfaceOutput);
            }
        });
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    @NonNull
    public ListenableFuture<Void> snapshot(@IntRange(from = 0, m64742to = 100) int i, @IntRange(from = 0, m64742to = 359) int i2) {
        return Futures.immediateFailedFuture(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }
}
