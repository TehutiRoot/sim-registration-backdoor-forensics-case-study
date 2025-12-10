package androidx.camera.video.internal.encoder;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.video.internal.BufferProvider;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface Encoder {
    public static final long NO_TIMESTAMP = -1;

    /* loaded from: classes.dex */
    public interface ByteBufferInput extends EncoderInput, BufferProvider<InputBuffer> {
    }

    /* loaded from: classes.dex */
    public interface EncoderInput {
    }

    /* loaded from: classes.dex */
    public interface SurfaceInput extends EncoderInput {

        /* loaded from: classes.dex */
        public interface OnSurfaceUpdateListener {
            void onSurfaceUpdate(@NonNull Surface surface);
        }

        void setOnSurfaceUpdateListener(@NonNull Executor executor, @NonNull OnSurfaceUpdateListener onSurfaceUpdateListener);
    }

    int getConfiguredBitrate();

    @NonNull
    EncoderInfo getEncoderInfo();

    @NonNull
    EncoderInput getInput();

    @NonNull
    ListenableFuture<Void> getReleasedFuture();

    void pause();

    void release();

    void requestKeyFrame();

    void setEncoderCallback(@NonNull EncoderCallback encoderCallback, @NonNull Executor executor);

    void start();

    void stop();

    void stop(long j);
}
