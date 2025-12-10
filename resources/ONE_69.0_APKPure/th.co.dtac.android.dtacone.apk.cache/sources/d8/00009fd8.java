package com.google.android.gms.vision.barcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class BarcodeDetector extends Detector<Barcode> {

    /* renamed from: c */
    public final com.google.android.gms.internal.vision.zzm f48666c;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public Context f48667a;

        /* renamed from: b */
        public com.google.android.gms.internal.vision.zzk f48668b = new com.google.android.gms.internal.vision.zzk();

        public Builder(@RecentlyNonNull Context context) {
            this.f48667a = context;
        }

        @RecentlyNonNull
        public BarcodeDetector build() {
            return new BarcodeDetector(new com.google.android.gms.internal.vision.zzm(this.f48667a, this.f48668b));
        }

        @RecentlyNonNull
        public Builder setBarcodeFormats(int i) {
            this.f48668b.zza = i;
            return this;
        }
    }

    public BarcodeDetector(com.google.android.gms.internal.vision.zzm zzmVar) {
        this.f48666c = zzmVar;
    }

    @Override // com.google.android.gms.vision.Detector
    @RecentlyNonNull
    public final SparseArray<Barcode> detect(@RecentlyNonNull Frame frame) {
        Barcode[] zza;
        if (frame != null) {
            zzs zza2 = zzs.zza(frame);
            if (frame.getBitmap() != null) {
                zza = this.f48666c.zza((Bitmap) Preconditions.checkNotNull(frame.getBitmap()), zza2);
                if (zza == null) {
                    throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
                }
            } else if (frame.getPlanes() != null) {
                zza = this.f48666c.zza((ByteBuffer) Preconditions.checkNotNull(((Image.Plane[]) Preconditions.checkNotNull(frame.getPlanes()))[0].getBuffer()), new zzs(((Image.Plane[]) Preconditions.checkNotNull(frame.getPlanes()))[0].getRowStride(), zza2.zzb, zza2.zzc, zza2.zzd, zza2.zze));
            } else {
                zza = this.f48666c.zza((ByteBuffer) Preconditions.checkNotNull(frame.getGrayscaleImageData()), zza2);
            }
            SparseArray<Barcode> sparseArray = new SparseArray<>(zza.length);
            for (Barcode barcode : zza) {
                sparseArray.append(barcode.rawValue.hashCode(), barcode);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }

    @Override // com.google.android.gms.vision.Detector
    public final boolean isOperational() {
        return this.f48666c.zzb();
    }

    @Override // com.google.android.gms.vision.Detector
    public final void release() {
        super.release();
        this.f48666c.zzc();
    }
}