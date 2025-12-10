package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzdn {

    /* renamed from: a */
    public final zzks f47116a;

    /* renamed from: b */
    public final Boolean f47117b;

    /* renamed from: c */
    public final zzkh f47118c = null;

    /* renamed from: d */
    public final zzkd f47119d;

    /* renamed from: e */
    public final Integer f47120e;

    /* renamed from: f */
    public final Integer f47121f;

    public /* synthetic */ zzdn(zzdl zzdlVar, zzdm zzdmVar) {
        this.f47116a = zzdl.m46781b(zzdlVar);
        this.f47117b = zzdl.m46780c(zzdlVar);
        this.f47119d = zzdl.m46782a(zzdlVar);
        this.f47120e = zzdl.m46779d(zzdlVar);
        this.f47121f = zzdl.m46778e(zzdlVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdn)) {
            return false;
        }
        zzdn zzdnVar = (zzdn) obj;
        if (Objects.equal(this.f47116a, zzdnVar.f47116a) && Objects.equal(this.f47117b, zzdnVar.f47117b) && Objects.equal(null, null) && Objects.equal(this.f47119d, zzdnVar.f47119d) && Objects.equal(this.f47120e, zzdnVar.f47120e) && Objects.equal(this.f47121f, zzdnVar.f47121f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f47116a, this.f47117b, null, this.f47119d, this.f47120e, this.f47121f);
    }

    @Nullable
    @zzcu(zza = 4)
    public final zzkd zza() {
        return this.f47119d;
    }

    @Nullable
    @zzcu(zza = 1)
    public final zzks zzb() {
        return this.f47116a;
    }

    @Nullable
    @zzcu(zza = 2)
    public final Boolean zzc() {
        return this.f47117b;
    }

    @Nullable
    @zzcu(zza = 5)
    public final Integer zzd() {
        return this.f47120e;
    }

    @Nullable
    @zzcu(zza = 6)
    public final Integer zze() {
        return this.f47121f;
    }
}
