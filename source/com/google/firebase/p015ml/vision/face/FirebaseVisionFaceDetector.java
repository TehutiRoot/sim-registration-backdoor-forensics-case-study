package com.google.firebase.p015ml.vision.face;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoe;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzqo;
import com.google.android.gms.internal.firebase_ml.zzqp;
import com.google.android.gms.internal.firebase_ml.zzsh;
import com.google.android.gms.internal.firebase_ml.zzsp;
import com.google.android.gms.internal.firebase_ml.zzxh;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceDetector */
/* loaded from: classes4.dex */
public class FirebaseVisionFaceDetector extends zzsh<List<FirebaseVisionFace>> implements Closeable {

    /* renamed from: c */
    public static final Map f55967c = new HashMap();

    public FirebaseVisionFaceDetector(zzqn zzqnVar, FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions) {
        super(zzqnVar, new zzsp(zzqnVar, firebaseVisionFaceDetectorOptions));
        zzqo.zza(zzqnVar, 1).zza(zznq.zzad.zzmg().zzb((zznq.zzap) ((zzxh) zznq.zzap.zznd().zzc(firebaseVisionFaceDetectorOptions.zzrd()).zzvn())), zzoe.ON_DEVICE_FACE_CREATE);
    }

    public static synchronized FirebaseVisionFaceDetector zza(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions) {
        FirebaseVisionFaceDetector firebaseVisionFaceDetector;
        synchronized (FirebaseVisionFaceDetector.class) {
            Preconditions.checkNotNull(zzqnVar, "You must provide a valid MlKitContext.");
            Preconditions.checkNotNull(zzqnVar.getPersistenceKey(), "Persistence key must not be null");
            Preconditions.checkNotNull(zzqnVar.getApplicationContext(), "You must provide a valid Context.");
            Preconditions.checkNotNull(firebaseVisionFaceDetectorOptions, "You must provide a valid FirebaseVisionFaceDetectorOptions.");
            zzqp zzj = zzqp.zzj(zzqnVar.getPersistenceKey(), firebaseVisionFaceDetectorOptions);
            Map map = f55967c;
            firebaseVisionFaceDetector = (FirebaseVisionFaceDetector) map.get(zzj);
            if (firebaseVisionFaceDetector == null) {
                firebaseVisionFaceDetector = new FirebaseVisionFaceDetector(zzqnVar, firebaseVisionFaceDetectorOptions);
                map.put(zzj, firebaseVisionFaceDetector);
            }
        }
        return firebaseVisionFaceDetector;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsh, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
    }

    @NonNull
    public Task<List<FirebaseVisionFace>> detectInImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        return super.zza(firebaseVisionImage, false, true);
    }
}
