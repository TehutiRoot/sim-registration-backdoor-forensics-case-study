package com.google.android.gms.internal.firebase_ml;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzln extends zzhy {
    @zzjg
    private zzkq detectedBreak;
    @zzjg
    private List<zzkt> detectedLanguages;

    @Override // com.google.android.gms.internal.firebase_ml.zzhy, com.google.android.gms.internal.firebase_ml.zzjf, java.util.AbstractMap
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzln) super.clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhy
    public final /* synthetic */ zzhy zza(String str, Object obj) {
        return (zzln) zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhy, com.google.android.gms.internal.firebase_ml.zzjf
    public final /* synthetic */ zzjf zzb(String str, Object obj) {
        return (zzln) super.zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhy
    public final /* synthetic */ zzhy zzfi() {
        return (zzln) clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhy, com.google.android.gms.internal.firebase_ml.zzjf
    public final /* synthetic */ zzjf zzfj() {
        return (zzln) clone();
    }

    public final zzkq zzjd() {
        return this.detectedBreak;
    }

    public final List<zzkt> zzje() {
        return this.detectedLanguages;
    }
}
