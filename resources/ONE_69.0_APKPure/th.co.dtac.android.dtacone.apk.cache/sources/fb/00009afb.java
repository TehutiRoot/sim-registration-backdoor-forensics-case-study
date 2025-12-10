package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class zzuf implements zztr {

    /* renamed from: a */
    public final zzow f47425a;

    /* renamed from: b */
    public zzsr f47426b = new zzsr();

    /* renamed from: c */
    public final int f47427c;

    public zzuf(zzow zzowVar, int i) {
        this.f47425a = zzowVar;
        zzuo.zza();
        this.f47427c = i;
    }

    public static zztr zzf(zzow zzowVar) {
        return new zzuf(zzowVar, 0);
    }

    public static zztr zzg(zzow zzowVar, int i) {
        return new zzuf(zzowVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final int zza() {
        return this.f47427c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final zztr zzb(zzov zzovVar) {
        this.f47425a.zzf(zzovVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final zztr zzc(zzsr zzsrVar) {
        this.f47426b = zzsrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final String zzd() {
        zzst zzf = this.f47425a.zzj().zzf();
        if (zzf != null && !zzy.zzb(zzf.zzk())) {
            return (String) Preconditions.checkNotNull(zzf.zzk());
        }
        return "NA";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final byte[] zze(int i, boolean z) {
        boolean z2;
        int i2 = i ^ 1;
        zzsr zzsrVar = this.f47426b;
        if (1 != i2) {
            z2 = false;
        } else {
            z2 = true;
        }
        zzsrVar.zzf(Boolean.valueOf(z2));
        this.f47426b.zze(Boolean.FALSE);
        this.f47425a.zzi(this.f47426b.zzm());
        try {
            zzuo.zza();
            if (i == 0) {
                return new JsonDataEncoderBuilder().configureWith(zzmq.zza).ignoreNullValues(true).build().encode(this.f47425a.zzj()).getBytes("utf-8");
            }
            zzoy zzj = this.f47425a.zzj();
            zzdb zzdbVar = new zzdb();
            zzmq.zza.configure(zzdbVar);
            return zzdbVar.zza().zza(zzj);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}