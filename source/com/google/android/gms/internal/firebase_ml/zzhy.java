package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

/* loaded from: classes3.dex */
public class zzhy extends zzjf implements Cloneable {

    /* renamed from: c */
    public zzhx f45856c;

    @Override // java.util.AbstractMap
    public String toString() {
        zzhx zzhxVar = this.f45856c;
        if (zzhxVar != null) {
            try {
                return zzhxVar.toString(this);
            } catch (IOException e) {
                throw zzms.zza(e);
            }
        }
        return super.toString();
    }

    public final void zza(zzhx zzhxVar) {
        this.f45856c = zzhxVar;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjf, java.util.AbstractMap
    /* renamed from: zzfi */
    public zzhy clone() {
        return (zzhy) super.clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjf
    public /* synthetic */ zzjf zzfj() {
        return (zzhy) clone();
    }

    public final String zzgz() throws IOException {
        zzhx zzhxVar = this.f45856c;
        if (zzhxVar != null) {
            return zzhxVar.zzc(this);
        }
        return super.toString();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjf
    /* renamed from: zza */
    public zzhy zzb(String str, Object obj) {
        return (zzhy) super.zzb(str, obj);
    }
}
