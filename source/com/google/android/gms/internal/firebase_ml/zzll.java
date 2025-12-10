package com.google.android.gms.internal.firebase_ml;

/* loaded from: classes3.dex */
public final class zzll extends zzhy {
    @zzjg
    private zzkp boundingBox;
    @zzjg
    private Float confidence;
    @zzjg
    private zzln property;
    @zzjg
    private String text;

    @Override // com.google.android.gms.internal.firebase_ml.zzhy, com.google.android.gms.internal.firebase_ml.zzjf, java.util.AbstractMap
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzll) super.clone();
    }

    public final Float getConfidence() {
        return this.confidence;
    }

    public final String getText() {
        return this.text;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhy
    public final /* synthetic */ zzhy zza(String str, Object obj) {
        return (zzll) zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhy, com.google.android.gms.internal.firebase_ml.zzjf
    public final /* synthetic */ zzjf zzb(String str, Object obj) {
        return (zzll) super.zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhy
    public final /* synthetic */ zzhy zzfi() {
        return (zzll) clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhy, com.google.android.gms.internal.firebase_ml.zzjf
    public final /* synthetic */ zzjf zzfj() {
        return (zzll) clone();
    }

    public final zzkp zzir() {
        return this.boundingBox;
    }

    public final zzln zzis() {
        return this.property;
    }
}
