package com.google.android.gms.vision.text;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.vision.zzah;
import com.google.android.gms.internal.vision.zzaj;
import com.google.android.gms.internal.vision.zzam;
import com.google.android.gms.internal.vision.zzan;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.internal.vision.zzw;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class TextRecognizer extends Detector<TextBlock> {

    /* renamed from: c */
    public final zzan f48709c;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public Context f48710a;

        /* renamed from: b */
        public zzam f48711b = new zzam();

        public Builder(@RecentlyNonNull Context context) {
            this.f48710a = context;
        }

        @RecentlyNonNull
        public TextRecognizer build() {
            return new TextRecognizer(new zzan(this.f48710a, this.f48711b));
        }
    }

    public TextRecognizer(zzan zzanVar) {
        this.f48709c = zzanVar;
    }

    @Override // com.google.android.gms.vision.Detector
    @RecentlyNonNull
    public final SparseArray<TextBlock> detect(@RecentlyNonNull Frame frame) {
        byte[] bArr;
        Bitmap decodeByteArray;
        zzaj zzajVar = new zzaj(new Rect());
        if (frame != null) {
            zzs zza = zzs.zza(frame);
            if (frame.getBitmap() != null) {
                decodeByteArray = frame.getBitmap();
            } else {
                Frame.Metadata metadata = frame.getMetadata();
                ByteBuffer byteBuffer = (ByteBuffer) Preconditions.checkNotNull(frame.getGrayscaleImageData());
                int format = metadata.getFormat();
                int i = zza.zza;
                int i2 = zza.zzb;
                if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
                    bArr = byteBuffer.array();
                } else {
                    byte[] bArr2 = new byte[byteBuffer.capacity()];
                    byteBuffer.get(bArr2);
                    bArr = bArr2;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new YuvImage(bArr, format, i, i2, null).compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            }
            Bitmap zza2 = zzw.zza((Bitmap) Preconditions.checkNotNull(decodeByteArray), zza);
            if (!zzajVar.zza.isEmpty()) {
                Rect rect = zzajVar.zza;
                int width = frame.getMetadata().getWidth();
                int height = frame.getMetadata().getHeight();
                int i3 = zza.zze;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            rect = new Rect(rect.top, width - rect.right, rect.bottom, width - rect.left);
                        }
                    } else {
                        rect = new Rect(width - rect.right, height - rect.bottom, width - rect.left, height - rect.top);
                    }
                } else {
                    rect = new Rect(height - rect.bottom, rect.left, height - rect.top, rect.right);
                }
                zzajVar.zza.set(rect);
            }
            zza.zze = 0;
            zzah[] zza3 = this.f48709c.zza(zza2, zza, zzajVar);
            SparseArray sparseArray = new SparseArray();
            for (zzah zzahVar : zza3) {
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzahVar.zzf);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.append(zzahVar.zzf, sparseArray2);
                }
                sparseArray2.append(zzahVar.zzg, zzahVar);
            }
            SparseArray<TextBlock> sparseArray3 = new SparseArray<>(sparseArray.size());
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                sparseArray3.append(sparseArray.keyAt(i4), new TextBlock((SparseArray) sparseArray.valueAt(i4)));
            }
            return sparseArray3;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }

    @Override // com.google.android.gms.vision.Detector
    public final boolean isOperational() {
        return this.f48709c.zzb();
    }

    @Override // com.google.android.gms.vision.Detector
    public final void release() {
        super.release();
        this.f48709c.zzc();
    }
}
