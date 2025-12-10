package com.google.android.gms.internal.firebase_ml;

import com.google.api.client.json.Json;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class zzhw extends zzgq {

    /* renamed from: c */
    public final Object f45853c;

    /* renamed from: d */
    public final zzhx f45854d;

    /* renamed from: e */
    public String f45855e;

    public zzhw(zzhx zzhxVar, Object obj) {
        super(Json.MEDIA_TYPE);
        this.f45854d = (zzhx) zzml.checkNotNull(zzhxVar);
        this.f45853c = zzml.checkNotNull(obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjq
    public final void writeTo(OutputStream outputStream) throws IOException {
        zzia zza = this.f45854d.zza(outputStream, zzfy());
        if (this.f45855e != null) {
            zza.zzhd();
            zza.zzan(this.f45855e);
        }
        zza.zzd(this.f45853c);
        if (this.f45855e != null) {
            zza.zzhe();
        }
        zza.flush();
    }

    public final zzhw zzal(String str) {
        this.f45855e = str;
        return this;
    }
}
