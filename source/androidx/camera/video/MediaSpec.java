package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.C2637e;
import androidx.camera.video.VideoSpec;
import androidx.core.util.Consumer;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

@AutoValue
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public abstract class MediaSpec {
    public static final int OUTPUT_FORMAT_AUTO = -1;
    public static final int OUTPUT_FORMAT_MPEG_4 = 0;
    public static final int OUTPUT_FORMAT_WEBM = 1;

    @AutoValue.Builder
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static abstract class Builder {
        /* renamed from: a */
        public abstract AudioSpec mo62254a();

        /* renamed from: b */
        public abstract VideoSpec mo62253b();

        @NonNull
        public abstract MediaSpec build();

        @NonNull
        public Builder configureAudio(@NonNull Consumer<AudioSpec.Builder> consumer) {
            AudioSpec.Builder builder = mo62254a().toBuilder();
            consumer.accept(builder);
            setAudioSpec(builder.build());
            return this;
        }

        @NonNull
        public Builder configureVideo(@NonNull Consumer<VideoSpec.Builder> consumer) {
            VideoSpec.Builder builder = mo62253b().toBuilder();
            consumer.accept(builder);
            setVideoSpec(builder.build());
            return this;
        }

        @NonNull
        public abstract Builder setAudioSpec(@NonNull AudioSpec audioSpec);

        @NonNull
        public abstract Builder setOutputFormat(int i);

        @NonNull
        public abstract Builder setVideoSpec(@NonNull VideoSpec videoSpec);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface OutputFormat {
    }

    /* renamed from: a */
    public static int m62527a(int i) {
        return i != 1 ? 0 : 1;
    }

    @NonNull
    public static Builder builder() {
        return new C2637e.C2639b().setOutputFormat(-1).setAudioSpec(AudioSpec.builder().build()).setVideoSpec(VideoSpec.builder().build());
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String outputFormatToAudioMime(int i) {
        if (i != 1) {
            return "audio/mp4a-latm";
        }
        return "audio/vorbis";
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static int outputFormatToAudioProfile(int i) {
        if (Objects.equals(outputFormatToAudioMime(i), "audio/mp4a-latm")) {
            return 2;
        }
        return -1;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String outputFormatToVideoMime(int i) {
        if (i != 1) {
            return "video/avc";
        }
        return "video/x-vnd.on2.vp8";
    }

    @NonNull
    public abstract AudioSpec getAudioSpec();

    public abstract int getOutputFormat();

    @NonNull
    public abstract VideoSpec getVideoSpec();

    @NonNull
    public abstract Builder toBuilder();
}
