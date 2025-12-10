package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.tasks.Task;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p015ml.vision.text.FirebaseVisionCloudTextRecognizerOptions;
import com.google.firebase.p015ml.vision.text.FirebaseVisionText;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzta extends zzrz<FirebaseVisionText> {

    /* renamed from: f */
    public static final Map f46065f = new HashMap();

    /* renamed from: e */
    public final FirebaseVisionCloudTextRecognizerOptions f46066e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzta(com.google.android.gms.internal.firebase_ml.zzqn r5, com.google.firebase.p015ml.vision.text.FirebaseVisionCloudTextRecognizerOptions r6) {
        /*
            r4 = this;
            int r0 = r6.getModelType()
            r1 = 1
            if (r0 != r1) goto La
            java.lang.String r0 = "TEXT_DETECTION"
            goto Lc
        La:
            java.lang.String r0 = "DOCUMENT_TEXT_DETECTION"
        Lc:
            com.google.android.gms.internal.firebase_ml.zzkz r2 = new com.google.android.gms.internal.firebase_ml.zzkz
            r2.<init>()
            boolean r3 = r6.isEnforceCertFingerprintMatch()
            r4.<init>(r5, r0, r2, r3)
            r4.f46066e = r6
            com.google.android.gms.internal.firebase_ml.zzoe r0 = com.google.android.gms.internal.firebase_ml.zzoe.CLOUD_TEXT_CREATE
            int r6 = r6.getModelType()
            r2 = 2
            if (r6 != r2) goto L25
            com.google.android.gms.internal.firebase_ml.zzoe r0 = com.google.android.gms.internal.firebase_ml.zzoe.CLOUD_DOCUMENT_TEXT_CREATE
        L25:
            com.google.android.gms.internal.firebase_ml.zzqo r5 = com.google.android.gms.internal.firebase_ml.zzqo.zza(r5, r1)
            com.google.android.gms.internal.firebase_ml.zznq$zzad$zza r6 = com.google.android.gms.internal.firebase_ml.zznq.zzad.zzmg()
            r5.zza(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzta.<init>(com.google.android.gms.internal.firebase_ml.zzqn, com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions):void");
    }

    public static synchronized zzta zza(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionCloudTextRecognizerOptions firebaseVisionCloudTextRecognizerOptions) {
        zzta zztaVar;
        synchronized (zzta.class) {
            Preconditions.checkNotNull(zzqnVar, "MlKitContext must not be null");
            Preconditions.checkNotNull(zzqnVar.getPersistenceKey(), "Persistence key must not be null");
            Preconditions.checkNotNull(firebaseVisionCloudTextRecognizerOptions, "Options must not be null");
            zzqp zzj = zzqp.zzj(zzqnVar.getPersistenceKey(), firebaseVisionCloudTextRecognizerOptions);
            Map map = f46065f;
            zztaVar = (zzta) map.get(zzj);
            if (zztaVar == null) {
                zztaVar = new zzta(zzqnVar, firebaseVisionCloudTextRecognizerOptions);
                map.put(zzj, zztaVar);
            }
        }
        return zztaVar;
    }

    public final Task<FirebaseVisionText> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        zzoe zzoeVar = zzoe.CLOUD_TEXT_DETECT;
        if (this.f46066e.getModelType() == 2) {
            zzoeVar = zzoe.CLOUD_DOCUMENT_TEXT_DETECT;
        }
        zzqo.zza(this.zzbms, 1).zza(zznq.zzad.zzmg(), zzoeVar);
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
    public final /* synthetic */ FirebaseVisionText zza(@NonNull zzkl zzklVar, float f) {
        return zztg.m47478b(zzklVar.zzio(), 1.0f / f);
    }
}