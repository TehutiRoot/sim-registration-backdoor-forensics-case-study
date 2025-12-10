package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class zzof implements zznr {

    /* renamed from: a */
    public final zzku f47226a;

    /* renamed from: b */
    public zzmt f47227b = new zzmt();

    /* renamed from: c */
    public final int f47228c;

    public zzof(zzku zzkuVar, int i) {
        this.f47226a = zzkuVar;
        zzoo.zza();
        this.f47228c = i;
    }

    public static zznr zzf(zzku zzkuVar) {
        return new zzof(zzkuVar, 0);
    }

    public static zznr zzg(zzku zzkuVar, int i) {
        return new zzof(zzkuVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final int zza() {
        return this.f47228c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final zznr zzb(zzkt zzktVar) {
        this.f47226a.zzf(zzktVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final zznr zzc(zzmt zzmtVar) {
        this.f47227b = zzmtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final String zzd() {
        zzmv zzf = this.f47226a.zzj().zzf();
        if (zzf != null && !zzac.zzb(zzf.zzk())) {
            return (String) Preconditions.checkNotNull(zzf.zzk());
        }
        return "NA";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final byte[] zze(int i, boolean z) {
        boolean z2;
        zzmt zzmtVar = this.f47227b;
        if (1 != (i ^ 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        zzmtVar.zzf(Boolean.valueOf(z2));
        this.f47227b.zze(Boolean.FALSE);
        this.f47226a.zzi(this.f47227b.zzm());
        try {
            zzoo.zza();
            if (i == 0) {
                return new JsonDataEncoderBuilder().configureWith(zzix.zza).ignoreNullValues(true).build().encode(this.f47226a.zzj()).getBytes("utf-8");
            }
            zzkw zzj = this.f47226a.zzj();
            zzcy zzcyVar = new zzcy();
            zzix.zza.configure(zzcyVar);
            return zzcyVar.zza().zza(zzj);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
