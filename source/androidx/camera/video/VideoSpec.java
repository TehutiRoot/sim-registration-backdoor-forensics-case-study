package androidx.camera.video;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.video.C2680j;
import com.google.auto.value.AutoValue;
import java.util.Arrays;

@AutoValue
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public abstract class VideoSpec {
    @NonNull
    public static final QualitySelector QUALITY_SELECTOR_AUTO;
    @NonNull
    public static final Range<Integer> FRAME_RATE_RANGE_AUTO = new Range<>(0, Integer.MAX_VALUE);
    @NonNull
    public static final Range<Integer> BITRATE_RANGE_AUTO = new Range<>(0, Integer.MAX_VALUE);

    @AutoValue.Builder
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static abstract class Builder {
        /* renamed from: a */
        public abstract Builder mo61932a(int i);

        @NonNull
        public abstract VideoSpec build();

        @NonNull
        public abstract Builder setBitrate(@NonNull Range<Integer> range);

        @NonNull
        public abstract Builder setFrameRate(@NonNull Range<Integer> range);

        @NonNull
        public abstract Builder setQualitySelector(@NonNull QualitySelector qualitySelector);
    }

    static {
        Quality quality = Quality.FHD;
        QUALITY_SELECTOR_AUTO = QualitySelector.fromOrderedList(Arrays.asList(quality, Quality.f11631HD, Quality.f11632SD), FallbackStrategy.higherQualityOrLowerThan(quality));
    }

    @NonNull
    public static Builder builder() {
        return new C2680j.C2682b().setQualitySelector(QUALITY_SELECTOR_AUTO).setFrameRate(FRAME_RATE_RANGE_AUTO).setBitrate(BITRATE_RANGE_AUTO).mo61932a(-1);
    }

    /* renamed from: a */
    public abstract int mo61933a();

    @NonNull
    public abstract Range<Integer> getBitrate();

    @NonNull
    public abstract Range<Integer> getFrameRate();

    @NonNull
    public abstract QualitySelector getQualitySelector();

    @NonNull
    public abstract Builder toBuilder();
}
