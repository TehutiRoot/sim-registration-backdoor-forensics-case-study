package com.google.firebase.p015ml.vision.barcode;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoe;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzqo;
import com.google.android.gms.internal.firebase_ml.zzqp;
import com.google.android.gms.internal.firebase_ml.zzsh;
import com.google.android.gms.internal.firebase_ml.zzxh;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p015ml.vision.barcode.internal.zzc;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcodeDetector */
/* loaded from: classes4.dex */
public class FirebaseVisionBarcodeDetector extends zzsh<List<FirebaseVisionBarcode>> implements Closeable {

    /* renamed from: c */
    public static final Map f55894c = new HashMap();

    public FirebaseVisionBarcodeDetector(zzqn zzqnVar, FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions) {
        super(zzqnVar, new zzc(zzqnVar, firebaseVisionBarcodeDetectorOptions));
        zzqo.zza(zzqnVar, 1).zza(zznq.zzad.zzmg().zzb((zznq.zzao) ((zzxh) zznq.zzao.zznb().zzc(firebaseVisionBarcodeDetectorOptions.zzqt()).zzvn())), zzoe.ON_DEVICE_BARCODE_CREATE);
    }

    public static synchronized FirebaseVisionBarcodeDetector zza(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions) {
        FirebaseVisionBarcodeDetector firebaseVisionBarcodeDetector;
        synchronized (FirebaseVisionBarcodeDetector.class) {
            Preconditions.checkNotNull(zzqnVar, "You must provide a valid MlKitContext.");
            Preconditions.checkNotNull(zzqnVar.getPersistenceKey(), "Firebase app name must not be null");
            Preconditions.checkNotNull(zzqnVar.getApplicationContext(), "You must provide a valid Context.");
            Preconditions.checkNotNull(firebaseVisionBarcodeDetectorOptions, "You must provide a valid FirebaseVisionBarcodeDetectorOptions.");
            zzqp zzj = zzqp.zzj(zzqnVar.getPersistenceKey(), firebaseVisionBarcodeDetectorOptions);
            Map map = f55894c;
            firebaseVisionBarcodeDetector = (FirebaseVisionBarcodeDetector) map.get(zzj);
            if (firebaseVisionBarcodeDetector == null) {
                firebaseVisionBarcodeDetector = new FirebaseVisionBarcodeDetector(zzqnVar, firebaseVisionBarcodeDetectorOptions);
                map.put(zzj, firebaseVisionBarcodeDetector);
            }
        }
        return firebaseVisionBarcodeDetector;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsh, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
    }

    @NonNull
    public Task<List<FirebaseVisionBarcode>> detectInImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        return super.zza(firebaseVisionImage, false, false);
    }
}
