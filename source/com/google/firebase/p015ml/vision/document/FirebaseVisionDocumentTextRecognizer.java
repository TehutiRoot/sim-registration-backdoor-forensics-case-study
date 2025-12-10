package com.google.firebase.p015ml.vision.document;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzkl;
import com.google.android.gms.internal.firebase_ml.zzkz;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoe;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzqo;
import com.google.android.gms.internal.firebase_ml.zzqp;
import com.google.android.gms.internal.firebase_ml.zzrz;
import com.google.android.gms.tasks.Task;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentTextRecognizer */
/* loaded from: classes4.dex */
public class FirebaseVisionDocumentTextRecognizer extends zzrz<FirebaseVisionDocumentText> {

    /* renamed from: e */
    public static final Map f55955e = new HashMap();

    public FirebaseVisionDocumentTextRecognizer(zzqn zzqnVar, zzkz zzkzVar, boolean z) {
        super(zzqnVar, "DOCUMENT_TEXT_DETECTION", zzkzVar, z);
        zzqo.zza(zzqnVar, 1).zza(zznq.zzad.zzmg(), zzoe.CLOUD_DOCUMENT_TEXT_CREATE);
    }

    public static synchronized FirebaseVisionDocumentTextRecognizer zza(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionCloudDocumentRecognizerOptions firebaseVisionCloudDocumentRecognizerOptions) {
        FirebaseVisionDocumentTextRecognizer firebaseVisionDocumentTextRecognizer;
        synchronized (FirebaseVisionDocumentTextRecognizer.class) {
            Preconditions.checkNotNull(zzqnVar, "MlKitContext must not be null");
            Preconditions.checkNotNull(zzqnVar.getPersistenceKey(), "Persistence key must not be null");
            Preconditions.checkNotNull(firebaseVisionCloudDocumentRecognizerOptions, "Options must not be null");
            zzqp zzj = zzqp.zzj(zzqnVar.getPersistenceKey(), firebaseVisionCloudDocumentRecognizerOptions);
            Map map = f55955e;
            firebaseVisionDocumentTextRecognizer = (FirebaseVisionDocumentTextRecognizer) map.get(zzj);
            if (firebaseVisionDocumentTextRecognizer == null) {
                zzkz zzkzVar = new zzkz();
                zzkzVar.zzd(firebaseVisionCloudDocumentRecognizerOptions.getHintedLanguages());
                FirebaseVisionDocumentTextRecognizer firebaseVisionDocumentTextRecognizer2 = new FirebaseVisionDocumentTextRecognizer(zzqnVar, zzkzVar, firebaseVisionCloudDocumentRecognizerOptions.isEnforceCertFingerprintMatch());
                map.put(zzj, firebaseVisionDocumentTextRecognizer2);
                firebaseVisionDocumentTextRecognizer = firebaseVisionDocumentTextRecognizer2;
            }
        }
        return firebaseVisionDocumentTextRecognizer;
    }

    @NonNull
    public Task<FirebaseVisionDocumentText> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        zzqo.zza(this.zzbms, 1).zza(zznq.zzad.zzmg(), zzoe.CLOUD_DOCUMENT_TEXT_DETECT);
        return super.zza(firebaseVisionImage);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzrz
    public final int zzqv() {
        return 1024;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzrz
    public final int zzqw() {
        return ViewUtils.EDGE_TO_EDGE_FLAGS;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzrz
    public final /* synthetic */ FirebaseVisionDocumentText zza(@NonNull zzkl zzklVar, float f) {
        return FirebaseVisionDocumentText.m38339a(zzklVar.zzio(), 1.0f / f);
    }
}
