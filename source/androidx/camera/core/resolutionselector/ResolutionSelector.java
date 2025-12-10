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
    public final AspectRatioStrategy f11461a;

    /* renamed from: b */
    public final ResolutionStrategy f11462b;

    /* renamed from: c */
    public final ResolutionFilter f11463c;

    /* renamed from: d */
    public final int f11464d;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface AllowedResolutionMode {
    }

    public ResolutionSelector(AspectRatioStrategy aspectRatioStrategy, ResolutionStrategy resolutionStrategy, ResolutionFilter resolutionFilter, int i) {
        this.f11461a = aspectRatioStrategy;
        this.f11462b = resolutionStrategy;
        this.f11463c = resolutionFilter;
        this.f11464d = i;
    }

    public int getAllowedResolutionMode() {
        return this.f11464d;
    }

    @NonNull
    public AspectRatioStrategy getAspectRatioStrategy() {
        return this.f11461a;
    }

    @Nullable
    public ResolutionFilter getResolutionFilter() {
        return this.f11463c;
    }

    @Nullable
    public ResolutionStrategy getResolutionStrategy() {
        return this.f11462b;
    }

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a */
        public AspectRatioStrategy f11465a;

        /* renamed from: b */
        public ResolutionStrategy f11466b;

        /* renamed from: c */
        public ResolutionFilter f11467c;

        /* renamed from: d */
        public int f11468d;

        public Builder() {
            this.f11465a = AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY;
            this.f11466b = null;
            this.f11467c = null;
            this.f11468d = 0;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Builder fromResolutionSelector(@NonNull ResolutionSelector resolutionSelector) {
            return new Builder(resolutionSelector);
        }

        @NonNull
        public ResolutionSelector build() {
            return new ResolutionSelector(this.f11465a, this.f11466b, this.f11467c, this.f11468d);
        }

        @NonNull
        public Builder setAllowedResolutionMode(int i) {
            this.f11468d = i;
            return this;
        }

        @NonNull
        public Builder setAspectRatioStrategy(@NonNull AspectRatioStrategy aspectRatioStrategy) {
            this.f11465a = aspectRatioStrategy;
            return this;
        }

        @NonNull
        public Builder setResolutionFilter(@NonNull ResolutionFilter resolutionFilter) {
            this.f11467c = resolutionFilter;
            return this;
        }

        @NonNull
        public Builder setResolutionStrategy(@NonNull ResolutionStrategy resolutionStrategy) {
            this.f11466b = resolutionStrategy;
            return this;
        }

        public Builder(ResolutionSelector resolutionSelector) {
            this.f11465a = AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY;
            this.f11466b = null;
            this.f11467c = null;
            this.f11468d = 0;
            this.f11465a = resolutionSelector.getAspectRatioStrategy();
            this.f11466b = resolutionSelector.getResolutionStrategy();
            this.f11467c = resolutionSelector.getResolutionFilter();
            this.f11468d = resolutionSelector.getAllowedResolutionMode();
        }
    }
}
