package androidx.camera.core.processing;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.SurfaceProcessor;
import com.google.common.util.concurrent.ListenableFuture;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public interface SurfaceProcessorInternal extends SurfaceProcessor {
    void release();

    @NonNull
    ListenableFuture<Void> snapshot(@IntRange(from = 0, m64742to = 100) int i, @IntRange(from = 0, m64742to = 359) int i2);
}
