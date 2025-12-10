package com.google.firebase.p015ml.vision.barcode;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzto;
import com.google.android.gms.internal.firebase_ml.zzvp;
import com.google.android.gms.internal.firebase_ml.zzxh;
import com.google.firebase.p015ml.vision.barcode.FirebaseVisionBarcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcodeDetectorOptions */
/* loaded from: classes4.dex */
public class FirebaseVisionBarcodeDetectorOptions {

    /* renamed from: b */
    public static final Map f55895b;

    /* renamed from: a */
    public final int f55896a;

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcodeDetectorOptions$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public int f55897a = 0;

        @NonNull
        public FirebaseVisionBarcodeDetectorOptions build() {
            return new FirebaseVisionBarcodeDetectorOptions(this.f55897a);
        }

        @NonNull
        public Builder setBarcodeFormats(@FirebaseVisionBarcode.BarcodeFormat int i, @NonNull @FirebaseVisionBarcode.BarcodeFormat int... iArr) {
            this.f55897a = i;
            if (iArr != null) {
                for (int i2 : iArr) {
                    this.f55897a = i2 | this.f55897a;
                }
            }
            return this;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f55895b = hashMap;
        hashMap.put(1, zzvp.CODE_128);
        hashMap.put(2, zzvp.CODE_39);
        hashMap.put(4, zzvp.CODE_93);
        hashMap.put(8, zzvp.CODABAR);
        hashMap.put(16, zzvp.DATA_MATRIX);
        hashMap.put(32, zzvp.EAN_13);
        hashMap.put(64, zzvp.EAN_8);
        hashMap.put(128, zzvp.ITF);
        hashMap.put(256, zzvp.QR_CODE);
        hashMap.put(512, zzvp.UPC_A);
        hashMap.put(1024, zzvp.UPC_E);
        hashMap.put(2048, zzvp.PDF417);
        hashMap.put(4096, zzvp.AZTEC);
    }

    public FirebaseVisionBarcodeDetectorOptions(int i) {
        this.f55896a = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof FirebaseVisionBarcodeDetectorOptions) && this.f55896a == ((FirebaseVisionBarcodeDetectorOptions) obj).f55896a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f55896a));
    }

    public final int zzqs() {
        return this.f55896a;
    }

    public final zzto.zza zzqt() {
        ArrayList arrayList = new ArrayList();
        if (this.f55896a == 0) {
            arrayList.addAll(f55895b.values());
        } else {
            for (Map.Entry entry : f55895b.entrySet()) {
                if ((this.f55896a & ((Integer) entry.getKey()).intValue()) != 0) {
                    arrayList.add((zzvp) entry.getValue());
                }
            }
        }
        return (zzto.zza) ((zzxh) zzto.zza.zzsb().zzz(arrayList).zzvn());
    }
}
