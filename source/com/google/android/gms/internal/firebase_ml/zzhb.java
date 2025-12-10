package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzhb {

    /* renamed from: a */
    public final zzhh f45802a;

    /* renamed from: b */
    public final zzhe f45803b;

    public zzhb(zzhh zzhhVar, zzhe zzheVar) {
        this.f45802a = zzhhVar;
        this.f45803b = zzheVar;
    }

    public final zzhc zza(String str, zzgu zzguVar, zzgt zzgtVar) throws IOException {
        zzhc zzhcVar = new zzhc(this.f45802a, null);
        zzhe zzheVar = this.f45803b;
        if (zzheVar != null) {
            zzheVar.zza(zzhcVar);
        }
        zzhcVar.zzaf(str);
        zzhcVar.zza(zzguVar);
        if (zzgtVar != null) {
            zzhcVar.zza(zzgtVar);
        }
        return zzhcVar;
    }
}
