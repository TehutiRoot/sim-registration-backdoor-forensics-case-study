package androidx.camera.video.internal.audio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface AudioStream {

    /* loaded from: classes.dex */
    public interface AudioStreamCallback {
        void onSilenceStateChanged(boolean z);
    }

    /* loaded from: classes.dex */
    public static class AudioStreamException extends Exception {
        public AudioStreamException() {
        }

        public AudioStreamException(@NonNull String str) {
            super(str);
        }

        public AudioStreamException(@NonNull String str, @NonNull Throwable th2) {
            super(str, th2);
        }

        public AudioStreamException(@NonNull Throwable th2) {
            super(th2);
        }
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class PacketInfo {
        @NonNull
        /* renamed from: of */
        public static PacketInfo m62161of(int i, long j) {
            return new C2656c(i, j);
        }

        public abstract int getSizeInBytes();

        public abstract long getTimestampNs();
    }

    @NonNull
    PacketInfo read(@NonNull ByteBuffer byteBuffer);

    void release();

    void setCallback(@Nullable AudioStreamCallback audioStreamCallback, @Nullable Executor executor);

    void start() throws AudioStreamException, IllegalStateException;

    void stop() throws IllegalStateException;
}
