package com.google.android.gms.internal.firebase_ml;

import com.google.api.client.json.Json;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class zzhw extends zzgq {

    /* renamed from: c */
    public final Object f45865c;

    /* renamed from: d */
    public final zzhx f45866d;

    /* renamed from: e */
    public String f45867e;

    public zzhw(zzhx zzhxVar, Object obj) {
        super(Json.MEDIA_TYPE);
        this.f45866d = (zzhx) zzml.checkNotNull(zzhxVar);
        this.f45865c = zzml.checkNotNull(obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjq
    public final void writeTo(OutputStream outputStream) throws IOException {
        zzia zza = this.f45866d.zza(outputStream, zzfy());
        if (this.f45867e != null) {
            zza.zzhd();
            zza.zzan(this.f45867e);
        }
        zza.zzd(this.f45865c);
        if (this.f45867e != null) {
            zza.zzhe();
        }
        zza.flush();
    }

    public final zzhw zzal(String str) {
        this.f45867e = str;
        return this;
    }
}