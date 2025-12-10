package com.google.firebase.p015ml.vision.cloud.landmark;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzkl;
import com.google.android.gms.internal.firebase_ml.zzkv;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoe;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzqo;
import com.google.android.gms.internal.firebase_ml.zzqp;
import com.google.android.gms.internal.firebase_ml.zzrz;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p015ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.firebase.ml.vision.cloud.landmark.FirebaseVisionCloudLandmarkDetector */
/* loaded from: classes4.dex */
public class FirebaseVisionCloudLandmarkDetector extends zzrz<List<FirebaseVisionCloudLandmark>> {

    /* renamed from: e */
    public static final Map f55917e = new HashMap();

    public FirebaseVisionCloudLandmarkDetector(zzqn zzqnVar, FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        super(zzqnVar, "LANDMARK_DETECTION", firebaseVisionCloudDetectorOptions);
        zzqo.zza(zzqnVar, 1).zza(zznq.zzad.zzmg(), zzoe.CLOUD_LANDMARK_CREATE);
    }

    public static synchronized FirebaseVisionCloudLandmarkDetector zza(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        FirebaseVisionCloudLandmarkDetector firebaseVisionCloudLandmarkDetector;
        synchronized (FirebaseVisionCloudLandmarkDetector.class) {
            Preconditions.checkNotNull(zzqnVar, "MlKitContext must not be null");
            Preconditions.checkNotNull(zzqnVar.getPersistenceKey(), "Firebase app name must not be null");
            Preconditions.checkNotNull(firebaseVisionCloudDetectorOptions, "Options must not be null");
            zzqp zzj = zzqp.zzj(zzqnVar.getPersistenceKey(), firebaseVisionCloudDetectorOptions);
            Map map = f55917e;
            firebaseVisionCloudLandmarkDetector = (FirebaseVisionCloudLandmarkDetector) map.get(zzj);
            if (firebaseVisionCloudLandmarkDetector == null) {
                firebaseVisionCloudLandmarkDetector = new FirebaseVisionCloudLandmarkDetector(zzqnVar, firebaseVisionCloudDetectorOptions);
                map.put(zzj, firebaseVisionCloudLandmarkDetector);
            }
        }
        return firebaseVisionCloudLandmarkDetector;
    }

    @NonNull
    public Task<List<FirebaseVisionCloudLandmark>> detectInImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        zzqo.zza(this.zzbms, 1).zza(zznq.zzad.zzmg(), zzoe.CLOUD_LANDMARK_DETECT);
        return super.zza(firebaseVisionImage);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzrz
    public final int zzqv() {
        return 640;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzrz
    public final int zzqw() {
        return 480;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzrz
    public final /* synthetic */ List<FirebaseVisionCloudLandmark> zza(@NonNull zzkl zzklVar, float f) {
        if (zzklVar.zziq() == null) {
            return new ArrayList();
        }
        float f2 = 1.0f / f;
        List<zzkv> zziq = zzklVar.zziq();
        ArrayList arrayList = new ArrayList();
        for (zzkv zzkvVar : zziq) {
            FirebaseVisionCloudLandmark m38343a = FirebaseVisionCloudLandmark.m38343a(zzkvVar, f2);
            if (m38343a != null) {
                arrayList.add(m38343a);
            }
        }
        return arrayList;
    }
}
