package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzkd {

    /* renamed from: a */
    public final zzka f47143a;

    /* renamed from: b */
    public final zzjy f47144b;

    /* renamed from: c */
    public final zzkb f47145c;

    /* renamed from: d */
    public final zzjz f47146d;

    /* renamed from: e */
    public final Boolean f47147e;

    /* renamed from: f */
    public final Float f47148f;

    public /* synthetic */ zzkd(zzjx zzjxVar, zzkc zzkcVar) {
        zzka zzkaVar;
        zzjy zzjyVar;
        zzkb zzkbVar;
        zzjz zzjzVar;
        Boolean bool;
        Float f;
        zzkaVar = zzjxVar.f47137a;
        this.f47143a = zzkaVar;
        zzjyVar = zzjxVar.f47138b;
        this.f47144b = zzjyVar;
        zzkbVar = zzjxVar.f47139c;
        this.f47145c = zzkbVar;
        zzjzVar = zzjxVar.f47140d;
        this.f47146d = zzjzVar;
        bool = zzjxVar.f47141e;
        this.f47147e = bool;
        f = zzjxVar.f47142f;
        this.f47148f = f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkd)) {
            return false;
        }
        zzkd zzkdVar = (zzkd) obj;
        if (Objects.equal(this.f47143a, zzkdVar.f47143a) && Objects.equal(this.f47144b, zzkdVar.f47144b) && Objects.equal(this.f47145c, zzkdVar.f47145c) && Objects.equal(this.f47146d, zzkdVar.f47146d) && Objects.equal(this.f47147e, zzkdVar.f47147e) && Objects.equal(this.f47148f, zzkdVar.f47148f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f47143a, this.f47144b, this.f47145c, this.f47146d, this.f47147e, this.f47148f);
    }

    @Nullable
    @zzcu(zza = 2)
    public final zzjy zza() {
        return this.f47144b;
    }

    @Nullable
    @zzcu(zza = 4)
    public final zzjz zzb() {
        return this.f47146d;
    }

    @Nullable
    @zzcu(zza = 1)
    public final zzka zzc() {
        return this.f47143a;
    }

    @Nullable
    @zzcu(zza = 3)
    public final zzkb zzd() {
        return this.f47145c;
    }

    @Nullable
    @zzcu(zza = 5)
    public final Boolean zze() {
        return this.f47147e;
    }

    @Nullable
    @zzcu(zza = 6)
    public final Float zzf() {
        return this.f47148f;
    }
}
