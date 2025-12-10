package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class zzua implements zztm {

    /* renamed from: a */
    public final zzpl f46732a;

    /* renamed from: b */
    public zzsj f46733b = new zzsj();

    /* renamed from: c */
    public final int f46734c;

    public zzua(zzpl zzplVar, int i) {
        this.f46732a = zzplVar;
        zzuj.zza();
        this.f46734c = i;
    }

    public static zztm zzf(zzpl zzplVar) {
        return new zzua(zzplVar, 0);
    }

    public static zztm zzg(zzpl zzplVar, int i) {
        return new zzua(zzplVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztm
    public final int zza() {
        return this.f46734c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztm
    public final zztm zzb(zzpk zzpkVar) {
        this.f46732a.zzf(zzpkVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztm
    public final zztm zzc(zzsj zzsjVar) {
        this.f46733b = zzsjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztm
    public final String zzd() {
        zzsl zzg = this.f46732a.zzk().zzg();
        if (zzg != null && !zzbd.zzc(zzg.zzk())) {
            return (String) Preconditions.checkNotNull(zzg.zzk());
        }
        return "NA";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztm
    public final byte[] zze(int i, boolean z) {
        boolean z2;
        int i2 = i ^ 1;
        zzsj zzsjVar = this.f46733b;
        if (1 != i2) {
            z2 = false;
        } else {
            z2 = true;
        }
        zzsjVar.zzf(Boolean.valueOf(z2));
        this.f46733b.zze(Boolean.FALSE);
        this.f46732a.zzj(this.f46733b.zzm());
        try {
            zzuj.zza();
            if (i == 0) {
                return new JsonDataEncoderBuilder().configureWith(zznj.zza).ignoreNullValues(true).build().encode(this.f46732a.zzk()).getBytes("utf-8");
            }
            zzpn zzk = this.f46732a.zzk();
            zzfk zzfkVar = new zzfk();
            zznj.zza.configure(zzfkVar);
            return zzfkVar.zza().zza(zzk);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
