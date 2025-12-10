package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.SurfaceProcessorWithExecutor;
import androidx.camera.core.processing.TargetUtils;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class CameraEffect {
    public static final int IMAGE_CAPTURE = 4;
    public static final int PREVIEW = 1;
    public static final int VIDEO_CAPTURE = 2;

    /* renamed from: f */
    public static final List f10832f = Arrays.asList(1, 2, 3, 7);

    /* renamed from: a */
    public final int f10833a;

    /* renamed from: b */
    public final Executor f10834b;

    /* renamed from: c */
    public final SurfaceProcessor f10835c;

    /* renamed from: d */
    public final ImageProcessor f10836d;

    /* renamed from: e */
    public final Consumer f10837e;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface Formats {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface Targets {
    }

    public CameraEffect(int i, @NonNull Executor executor, @NonNull ImageProcessor imageProcessor, @NonNull Consumer<Throwable> consumer) {
        Preconditions.checkArgument(i == 4, "Currently ImageProcessor can only target IMAGE_CAPTURE.");
        this.f10833a = i;
        this.f10834b = executor;
        this.f10835c = null;
        this.f10836d = imageProcessor;
        this.f10837e = consumer;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SurfaceProcessorInternal createSurfaceProcessorInternal() {
        return new SurfaceProcessorWithExecutor(this);
    }

    @NonNull
    public Consumer<Throwable> getErrorListener() {
        return this.f10837e;
    }

    @NonNull
    public Executor getExecutor() {
        return this.f10834b;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ImageProcessor getImageProcessor() {
        return this.f10836d;
    }

    @Nullable
    public SurfaceProcessor getSurfaceProcessor() {
        return this.f10835c;
    }

    public int getTargets() {
        return this.f10833a;
    }

    public CameraEffect(int i, @NonNull Executor executor, @NonNull SurfaceProcessor surfaceProcessor, @NonNull Consumer<Throwable> consumer) {
        TargetUtils.checkSupportedTargets(f10832f, i);
        this.f10833a = i;
        this.f10834b = executor;
        this.f10835c = surfaceProcessor;
        this.f10836d = null;
        this.f10837e = consumer;
    }
}