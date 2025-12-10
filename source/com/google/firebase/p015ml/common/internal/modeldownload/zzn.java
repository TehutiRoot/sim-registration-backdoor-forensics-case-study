package com.google.firebase.p015ml.common.internal.modeldownload;

import com.google.android.gms.internal.firebase_ml.zznq;

/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzn */
/* loaded from: classes4.dex */
public enum zzn {
    UNKNOWN,
    BASE,
    AUTOML,
    CUSTOM,
    TRANSLATE;

    public final zznq.zzal.zza zzph() {
        int i = HI2.f2191a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return zznq.zzal.zza.TYPE_UNKNOWN;
                }
                return zznq.zzal.zza.AUTOML_IMAGE_LABELING;
            }
            return zznq.zzal.zza.CUSTOM;
        }
        return zznq.zzal.zza.BASE_TRANSLATE;
    }
}
