package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zznh {

    /* renamed from: a */
    public final String f46451a;

    /* renamed from: b */
    public final String f46452b;

    /* renamed from: c */
    public final zznf f46453c;

    /* renamed from: d */
    public final String f46454d;

    /* renamed from: e */
    public final String f46455e;

    /* renamed from: f */
    public final zzne f46456f;

    /* renamed from: g */
    public final Long f46457g;

    /* renamed from: h */
    public final Boolean f46458h;

    /* renamed from: i */
    public final Boolean f46459i;

    public /* synthetic */ zznh(zznd zzndVar, zzng zzngVar) {
        String str;
        zznf zznfVar;
        String str2;
        zzne zzneVar;
        str = zzndVar.f46447a;
        this.f46451a = str;
        this.f46452b = null;
        zznfVar = zzndVar.f46448b;
        this.f46453c = zznfVar;
        this.f46454d = null;
        str2 = zzndVar.f46449c;
        this.f46455e = str2;
        zzneVar = zzndVar.f46450d;
        this.f46456f = zzneVar;
        this.f46457g = null;
        this.f46458h = null;
        this.f46459i = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zznh)) {
            return false;
        }
        zznh zznhVar = (zznh) obj;
        if (Objects.equal(this.f46451a, zznhVar.f46451a) && Objects.equal(null, null) && Objects.equal(this.f46453c, zznhVar.f46453c) && Objects.equal(null, null) && Objects.equal(this.f46455e, zznhVar.f46455e) && Objects.equal(this.f46456f, zznhVar.f46456f) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f46451a, null, this.f46453c, null, this.f46455e, this.f46456f, null, null, null);
    }

    @Nullable
    @zzbc(zza = 6)
    public final zzne zza() {
        return this.f46456f;
    }

    @Nullable
    @zzbc(zza = 3)
    public final zznf zzb() {
        return this.f46453c;
    }

    @Nullable
    @zzbc(zza = 5)
    public final String zzc() {
        return this.f46455e;
    }

    @Nullable
    @zzbc(zza = 1)
    public final String zzd() {
        return this.f46451a;
    }
}
