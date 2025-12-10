package androidx.camera.core.resolutionselector;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class ResolutionSelector {
    public static final int PREFER_CAPTURE_RATE_OVER_HIGHER_RESOLUTION = 0;
    public static final int PREFER_HIGHER_RESOLUTION_OVER_CAPTURE_RATE = 1;

    /* renamed from: a */
    public final AspectRatioStrategy f11549a;

    /* renamed from: b */
    public final ResolutionStrategy f11550b;

    /* renamed from: c */
    public final ResolutionFilter f11551c;

    /* renamed from: d */
    public final int f11552d;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface AllowedResolutionMode {
    }

    public ResolutionSelector(AspectRatioStrategy aspectRatioStrategy, ResolutionStrategy resolutionStrategy, ResolutionFilter resolutionFilter, int i) {
        this.f11549a = aspectRatioStrategy;
        this.f11550b = resolutionStrategy;
        this.f11551c = resolutionFilter;
        this.f11552d = i;
    }

    public int getAllowedResolutionMode() {
        return this.f11552d;
    }

    @NonNull
    public AspectRatioStrategy getAspectRatioStrategy() {
        return this.f11549a;
    }

    @Nullable
    public ResolutionFilter getResolutionFilter() {
        return this.f11551c;
    }

    @Nullable
    public ResolutionStrategy getResolutionStrategy() {
        return this.f11550b;
    }

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a */
        public AspectRatioStrategy f11553a;

        /* renamed from: b */
        public ResolutionStrategy f11554b;

        /* renamed from: c */
        public ResolutionFilter f11555c;

        /* renamed from: d */
        public int f11556d;

        public Builder() {
            this.f11553a = AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY;
            this.f11554b = null;
            this.f11555c = null;
            this.f11556d = 0;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Builder fromResolutionSelector(@NonNull ResolutionSelector resolutionSelector) {
            return new Builder(resolutionSelector);
        }

        @NonNull
        public ResolutionSelector build() {
            return new ResolutionSelector(this.f11553a, this.f11554b, this.f11555c, this.f11556d);
        }

        @NonNull
        public Builder setAllowedResolutionMode(int i) {
            this.f11556d = i;
            return this;
        }

        @NonNull
        public Builder setAspectRatioStrategy(@NonNull AspectRatioStrategy aspectRatioStrategy) {
            this.f11553a = aspectRatioStrategy;
            return this;
        }

        @NonNull
        public Builder setResolutionFilter(@NonNull ResolutionFilter resolutionFilter) {
            this.f11555c = resolutionFilter;
            return this;
        }

        @NonNull
        public Builder setResolutionStrategy(@NonNull ResolutionStrategy resolutionStrategy) {
            this.f11554b = resolutionStrategy;
            return this;
        }

        public Builder(ResolutionSelector resolutionSelector) {
            this.f11553a = AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY;
            this.f11554b = null;
            this.f11555c = null;
            this.f11556d = 0;
            this.f11553a = resolutionSelector.getAspectRatioStrategy();
            this.f11554b = resolutionSelector.getResolutionStrategy();
            this.f11555c = resolutionSelector.getResolutionFilter();
            this.f11556d = resolutionSelector.getAllowedResolutionMode();
        }
    }
}