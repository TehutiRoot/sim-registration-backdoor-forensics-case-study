package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzfv {

    /* renamed from: a */
    public final zzpj f46605a;

    /* renamed from: c */
    public final Boolean f46607c;

    /* renamed from: e */
    public final zzth f46609e;

    /* renamed from: f */
    public final zzcv f46610f;

    /* renamed from: g */
    public final zzcv f46611g;

    /* renamed from: b */
    public final Boolean f46606b = null;

    /* renamed from: d */
    public final zzos f46608d = null;

    public /* synthetic */ zzfv(zzft zzftVar, zzfu zzfuVar) {
        this.f46605a = zzft.m47040c(zzftVar);
        this.f46607c = zzft.m47038e(zzftVar);
        this.f46609e = zzft.m47039d(zzftVar);
        this.f46610f = zzft.m47042a(zzftVar);
        this.f46611g = zzft.m47041b(zzftVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfv)) {
            return false;
        }
        zzfv zzfvVar = (zzfv) obj;
        if (Objects.equal(this.f46605a, zzfvVar.f46605a) && Objects.equal(null, null) && Objects.equal(this.f46607c, zzfvVar.f46607c) && Objects.equal(null, null) && Objects.equal(this.f46609e, zzfvVar.f46609e) && Objects.equal(this.f46610f, zzfvVar.f46610f) && Objects.equal(this.f46611g, zzfvVar.f46611g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f46605a, null, this.f46607c, null, this.f46609e, this.f46610f, this.f46611g);
    }

    @Nullable
    @zzfg(zza = 6)
    public final zzcv zza() {
        return this.f46610f;
    }

    @Nullable
    @zzfg(zza = 7)
    public final zzcv zzb() {
        return this.f46611g;
    }

    @Nullable
    @zzfg(zza = 1)
    public final zzpj zzc() {
        return this.f46605a;
    }

    @Nullable
    @zzfg(zza = 5)
    public final zzth zzd() {
        return this.f46609e;
    }

    @Nullable
    @zzfg(zza = 3)
    public final Boolean zze() {
        return this.f46607c;
    }
}
