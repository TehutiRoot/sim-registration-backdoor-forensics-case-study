package com.google.mlkit.vision.barcode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes4.dex */
public class ZoomSuggestionOptions {

    /* renamed from: a */
    public final ZoomCallback f56999a;

    /* renamed from: b */
    public final float f57000b;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final ZoomCallback f57001a;

        /* renamed from: b */
        public float f57002b;

        public Builder(@NonNull ZoomCallback zoomCallback) {
            this.f57001a = zoomCallback;
        }

        @NonNull
        public ZoomSuggestionOptions build() {
            return new ZoomSuggestionOptions(this.f57001a, this.f57002b, null);
        }

        @NonNull
        public Builder setMaxSupportedZoomRatio(float f) {
            this.f57002b = f;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public interface ZoomCallback {
        boolean setZoom(float f);
    }

    public /* synthetic */ ZoomSuggestionOptions(ZoomCallback zoomCallback, float f, zzb zzbVar) {
        this.f56999a = zoomCallback;
        this.f57000b = f;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZoomSuggestionOptions)) {
            return false;
        }
        ZoomSuggestionOptions zoomSuggestionOptions = (ZoomSuggestionOptions) obj;
        if (Objects.equal(this.f56999a, zoomSuggestionOptions.f56999a) && this.f57000b == zoomSuggestionOptions.f57000b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f56999a, Float.valueOf(this.f57000b));
    }

    public final float zza() {
        return this.f57000b;
    }

    @NonNull
    public final ZoomCallback zzb() {
        return this.f56999a;
    }
}
