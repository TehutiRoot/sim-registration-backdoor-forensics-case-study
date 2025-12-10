package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes.dex */
public class FallbackStrategy {

    /* renamed from: a */
    public static final FallbackStrategy f11703a = new C2612b(Quality.f11721a, 0);

    /* renamed from: androidx.camera.video.FallbackStrategy$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2576b extends FallbackStrategy {
        public AbstractC2576b() {
            super();
        }

        /* renamed from: a */
        public abstract Quality mo62216a();

        /* renamed from: b */
        public abstract int mo62215b();
    }

    @NonNull
    public static FallbackStrategy higherQualityOrLowerThan(@NonNull Quality quality) {
        return new C2612b(quality, 1);
    }

    @NonNull
    public static FallbackStrategy higherQualityThan(@NonNull Quality quality) {
        return new C2612b(quality, 2);
    }

    @NonNull
    public static FallbackStrategy lowerQualityOrHigherThan(@NonNull Quality quality) {
        return new C2612b(quality, 3);
    }

    @NonNull
    public static FallbackStrategy lowerQualityThan(@NonNull Quality quality) {
        return new C2612b(quality, 4);
    }

    public FallbackStrategy() {
    }
}