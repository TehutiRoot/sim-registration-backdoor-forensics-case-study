package androidx.camera.video;

import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@AutoValue
@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class AudioStats {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final double AUDIO_AMPLITUDE_NONE = 0.0d;
    public static final int AUDIO_STATE_ACTIVE = 0;
    public static final int AUDIO_STATE_DISABLED = 1;
    public static final int AUDIO_STATE_ENCODER_ERROR = 3;
    public static final int AUDIO_STATE_MUTED = 5;
    public static final int AUDIO_STATE_SOURCE_ERROR = 4;
    public static final int AUDIO_STATE_SOURCE_SILENCED = 2;

    /* renamed from: a */
    public static final Set f11614a = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface AudioState {
    }

    /* renamed from: b */
    public static AudioStats m62528b(int i, Throwable th2, double d) {
        return new C10445i8(i, d, th2);
    }

    /* renamed from: a */
    public abstract double mo30663a();

    @OptIn(markerClass = {ExperimentalAudioApi.class})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public double getAudioAmplitude() {
        if (getAudioState() == 1) {
            return 0.0d;
        }
        return mo30663a();
    }

    public abstract int getAudioState();

    @Nullable
    public abstract Throwable getErrorCause();

    public boolean hasAudio() {
        if (getAudioState() == 0) {
            return true;
        }
        return false;
    }

    public boolean hasError() {
        return f11614a.contains(Integer.valueOf(getAudioState()));
    }
}
