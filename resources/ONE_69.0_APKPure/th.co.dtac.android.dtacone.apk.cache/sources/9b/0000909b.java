package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p015ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p015ml.vision.label.FirebaseVisionImageLabel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzsr extends zzrz<List<FirebaseVisionImageLabel>> {
    public zzsr(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        super(zzqnVar, "LABEL_DETECTION", firebaseVisionCloudDetectorOptions);
        zzqo.zza(zzqnVar, 1).zza(zznq.zzad.zzmg(), zzoe.CLOUD_IMAGE_LABEL_CREATE);
    }

    public final Task<List<FirebaseVisionImageLabel>> detectInImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        zzqo.zza(this.zzbms, 1).zza(zznq.zzad.zzmg(), zzoe.CLOUD_IMAGE_LABEL_DETECT);
        return super.zza(firebaseVisionImage);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzrz
    public final /* synthetic */ List<FirebaseVisionImageLabel> zza(@NonNull zzkl zzklVar, float f) {
        if (zzklVar.zzip() == null) {
            return new ArrayList();
        }
        List<zzkv> zzip = zzklVar.zzip();
        ArrayList arrayList = new ArrayList();
        for (zzkv zzkvVar : zzip) {
            FirebaseVisionImageLabel zza = FirebaseVisionImageLabel.zza(zzkvVar);
            if (zza != null) {
                arrayList.add(zza);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzrz
    public final int zzqv() {
        return 640;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzrz
    public final int zzqw() {
        return 480;
    }
}