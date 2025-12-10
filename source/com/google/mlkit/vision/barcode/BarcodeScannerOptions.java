package com.google.mlkit.vision.barcode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class BarcodeScannerOptions {

    /* renamed from: a */
    public final int f56991a;

    /* renamed from: b */
    public final boolean f56992b;

    /* renamed from: c */
    public final Executor f56993c;

    /* renamed from: d */
    public final ZoomSuggestionOptions f56994d;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public int f56995a = 0;

        /* renamed from: b */
        public boolean f56996b;

        /* renamed from: c */
        public Executor f56997c;

        /* renamed from: d */
        public ZoomSuggestionOptions f56998d;

        @NonNull
        public BarcodeScannerOptions build() {
            return new BarcodeScannerOptions(this.f56995a, this.f56996b, this.f56997c, this.f56998d, null);
        }

        @NonNull
        public Builder enableAllPotentialBarcodes() {
            this.f56996b = true;
            return this;
        }

        @NonNull
        public Builder setBarcodeFormats(@Barcode.BarcodeFormat int i, @NonNull @Barcode.BarcodeFormat int... iArr) {
            this.f56995a = i;
            if (iArr != null) {
                for (int i2 : iArr) {
                    this.f56995a = i2 | this.f56995a;
                }
            }
            return this;
        }

        @NonNull
        public Builder setExecutor(@NonNull Executor executor) {
            this.f56997c = executor;
            return this;
        }

        @NonNull
        public Builder setZoomSuggestionOptions(@NonNull ZoomSuggestionOptions zoomSuggestionOptions) {
            this.f56998d = zoomSuggestionOptions;
            return this;
        }
    }

    public /* synthetic */ BarcodeScannerOptions(int i, boolean z, Executor executor, ZoomSuggestionOptions zoomSuggestionOptions, zza zzaVar) {
        this.f56991a = i;
        this.f56992b = z;
        this.f56993c = executor;
        this.f56994d = zoomSuggestionOptions;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BarcodeScannerOptions)) {
            return false;
        }
        BarcodeScannerOptions barcodeScannerOptions = (BarcodeScannerOptions) obj;
        if (this.f56991a == barcodeScannerOptions.f56991a && this.f56992b == barcodeScannerOptions.f56992b && Objects.equal(this.f56993c, barcodeScannerOptions.f56993c) && Objects.equal(this.f56994d, barcodeScannerOptions.f56994d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f56991a), Boolean.valueOf(this.f56992b), this.f56993c, this.f56994d);
    }

    public final int zza() {
        return this.f56991a;
    }

    @Nullable
    public final ZoomSuggestionOptions zzb() {
        return this.f56994d;
    }

    @Nullable
    public final Executor zzc() {
        return this.f56993c;
    }

    public final boolean zzd() {
        return this.f56992b;
    }
}
