package com.google.firebase.p015ml.common.internal.modeldownload;

import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzxh;
import com.google.firebase.p015ml.common.modeldownload.FirebaseRemoteModel;

/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzv */
/* loaded from: classes4.dex */
public final class zzv {
    public static zznq.zzam zza(FirebaseRemoteModel firebaseRemoteModel, zzn zznVar) {
        String modelHash = firebaseRemoteModel.getModelHash();
        zznq.zzal.zza zzph = zznVar.zzph();
        zznq.zzam.zzb zzmv = zznq.zzam.zzmv();
        zznq.zzal.zzb zzb = zznq.zzal.zzmt().zzbf(firebaseRemoteModel.getModelNameForBackend()).zzb(zznq.zzal.zzc.CLOUD);
        if (modelHash == null) {
            modelHash = "";
        }
        return (zznq.zzam) ((zzxh) zzmv.zza(zzb.zzbh(modelHash).zzd(zzph)).zzvn());
    }
}
