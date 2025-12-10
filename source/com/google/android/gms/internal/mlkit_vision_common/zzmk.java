package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class zzmk implements zzmb {

    /* renamed from: a */
    public final zziw f47056a;

    /* renamed from: b */
    public zzky f47057b = new zzky();

    public zzmk(zziw zziwVar, int i) {
        this.f47056a = zziwVar;
        zzmw.zza();
    }

    public static zzmb zze(zziw zziwVar) {
        return new zzmk(zziwVar, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zza(zziv zzivVar) {
        this.f47056a.zzc(zzivVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zzb(zzky zzkyVar) {
        this.f47057b = zzkyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final String zzc() {
        zzla zzc = this.f47056a.zzf().zzc();
        if (zzc != null && !zzg.zzb(zzc.zzk())) {
            return (String) Preconditions.checkNotNull(zzc.zzk());
        }
        return "NA";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final byte[] zzd(int i, boolean z) {
        boolean z2;
        int i2 = i ^ 1;
        zzky zzkyVar = this.f47057b;
        if (1 != i2) {
            z2 = false;
        } else {
            z2 = true;
        }
        zzkyVar.zzf(Boolean.valueOf(z2));
        this.f47057b.zze(Boolean.FALSE);
        this.f47056a.zze(this.f47057b.zzm());
        try {
            zzmw.zza();
            if (i == 0) {
                return new JsonDataEncoderBuilder().configureWith(zzhe.zza).ignoreNullValues(true).build().encode(this.f47056a.zzf()).getBytes("utf-8");
            }
            zziy zzf = this.f47056a.zzf();
            zzam zzamVar = new zzam();
            zzhe.zza.configure(zzamVar);
            return zzamVar.zza().zza(zzf);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
