package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;
import com.google.firebase.encoders.annotations.Encodable;
import org.bouncycastle.asn1.eac.EACTags;

@Encodable
/* loaded from: classes3.dex */
public final class zzmy {

    /* renamed from: a */
    public final zzqv f46429a;

    /* renamed from: b */
    public final zzmv f46430b;

    /* renamed from: c */
    public final zznc f46431c;

    /* renamed from: d */
    public final zzmj f46432d;

    /* renamed from: e */
    public final zzlo f46433e;

    /* renamed from: f */
    public final zzmp f46434f;

    public /* synthetic */ zzmy(zzmw zzmwVar, zzmx zzmxVar) {
        zzqv zzqvVar;
        zzmv zzmvVar;
        zznc zzncVar;
        zzmj zzmjVar;
        zzlo zzloVar;
        zzmp zzmpVar;
        zzqvVar = zzmwVar.f46423a;
        this.f46429a = zzqvVar;
        zzmvVar = zzmwVar.f46424b;
        this.f46430b = zzmvVar;
        zzncVar = zzmwVar.f46425c;
        this.f46431c = zzncVar;
        zzmjVar = zzmwVar.f46426d;
        this.f46432d = zzmjVar;
        zzloVar = zzmwVar.f46427e;
        this.f46433e = zzloVar;
        zzmpVar = zzmwVar.f46428f;
        this.f46434f = zzmpVar;
    }

    @Nullable
    @zzbc(zza = 40)
    public final zzlo zza() {
        return this.f46433e;
    }

    @Nullable
    @zzbc(zza = 39)
    public final zzmj zzb() {
        return this.f46432d;
    }

    @Nullable
    @zzbc(zza = EACTags.TRANSACTION_DATE)
    public final zzmp zzc() {
        return this.f46434f;
    }

    @Nullable
    @zzbc(zza = 2)
    public final zzmv zzd() {
        return this.f46430b;
    }

    @Nullable
    @zzbc(zza = 3)
    public final zznc zze() {
        return this.f46431c;
    }

    @Nullable
    @zzbc(zza = 1)
    public final zzqv zzf() {
        return this.f46429a;
    }
}
