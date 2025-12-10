package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.video.internal.audio.C2635b;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@AutoValue
@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class AudioSettings {
    public static final List<Integer> COMMON_SAMPLE_RATES = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class Builder {
        /* renamed from: a */
        public abstract AudioSettings mo62072a();

        @NonNull
        public final AudioSettings build() {
            AudioSettings mo62072a = mo62072a();
            String str = "";
            if (mo62072a.getAudioSource() == -1) {
                str = " audioSource";
            }
            if (mo62072a.getSampleRate() <= 0) {
                str = str + " sampleRate";
            }
            if (mo62072a.getChannelCount() <= 0) {
                str = str + " channelCount";
            }
            if (mo62072a.getAudioFormat() == -1) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return mo62072a;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
        }

        @NonNull
        public abstract Builder setAudioFormat(int i);

        @NonNull
        public abstract Builder setAudioSource(int i);

        @NonNull
        public abstract Builder setChannelCount(@IntRange(from = 1) int i);

        @NonNull
        public abstract Builder setSampleRate(@IntRange(from = 1) int i);
    }

    @NonNull
    @SuppressLint({"Range"})
    public static Builder builder() {
        return new C2635b.C2637b().setAudioSource(-1).setSampleRate(-1).setChannelCount(-1).setAudioFormat(-1);
    }

    public abstract int getAudioFormat();

    public abstract int getAudioSource();

    public int getBytesPerFrame() {
        return AudioUtils.getBytesPerFrame(getAudioFormat(), getChannelCount());
    }

    @IntRange(from = 1)
    public abstract int getChannelCount();

    @IntRange(from = 1)
    public abstract int getSampleRate();

    @NonNull
    public abstract Builder toBuilder();
}