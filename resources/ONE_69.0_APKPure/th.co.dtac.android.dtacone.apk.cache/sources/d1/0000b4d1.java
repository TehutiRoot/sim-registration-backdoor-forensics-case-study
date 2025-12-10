package com.google.mlkit.vision.barcode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes4.dex */
public class ZoomSuggestionOptions {

    /* renamed from: a */
    public final ZoomCallback f57011a;

    /* renamed from: b */
    public final float f57012b;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final ZoomCallback f57013a;

        /* renamed from: b */
        public float f57014b;

        public Builder(@NonNull ZoomCallback zoomCallback) {
            this.f57013a = zoomCallback;
        }

        @NonNull
        public ZoomSuggestionOptions build() {
            return new ZoomSuggestionOptions(this.f57013a, this.f57014b, null);
        }

        @NonNull
        public Builder setMaxSupportedZoomRatio(float f) {
            this.f57014b = f;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public interface ZoomCallback {
        boolean setZoom(float f);
    }

    public /* synthetic */ ZoomSuggestionOptions(ZoomCallback zoomCallback, float f, zzb zzbVar) {
        this.f57011a = zoomCallback;
        this.f57012b = f;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZoomSuggestionOptions)) {
            return false;
        }
        ZoomSuggestionOptions zoomSuggestionOptions = (ZoomSuggestionOptions) obj;
        if (Objects.equal(this.f57011a, zoomSuggestionOptions.f57011a) && this.f57012b == zoomSuggestionOptions.f57012b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f57011a, Float.valueOf(this.f57012b));
    }

    public final float zza() {
        return this.f57012b;
    }

    @NonNull
    public final ZoomCallback zzb() {
        return this.f57011a;
    }
}