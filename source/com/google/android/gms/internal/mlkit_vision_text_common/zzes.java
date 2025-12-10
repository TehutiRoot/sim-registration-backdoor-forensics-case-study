package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzes {

    /* renamed from: a */
    public final zzou f47315a;

    /* renamed from: c */
    public final Boolean f47317c;

    /* renamed from: e */
    public final zzsd f47319e;

    /* renamed from: b */
    public final Boolean f47316b = null;

    /* renamed from: d */
    public final zzod f47318d = null;

    public /* synthetic */ zzes(zzeq zzeqVar, zzer zzerVar) {
        zzou zzouVar;
        Boolean bool;
        zzsd zzsdVar;
        zzouVar = zzeqVar.f47312a;
        this.f47315a = zzouVar;
        this.f47316b = null;
        bool = zzeqVar.f47313b;
        this.f47317c = bool;
        this.f47318d = null;
        zzsdVar = zzeqVar.f47314c;
        this.f47319e = zzsdVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzes)) {
            return false;
        }
        zzes zzesVar = (zzes) obj;
        if (Objects.equal(this.f47315a, zzesVar.f47315a) && Objects.equal(null, null) && Objects.equal(this.f47317c, zzesVar.f47317c) && Objects.equal(null, null) && Objects.equal(this.f47319e, zzesVar.f47319e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f47315a, null, this.f47317c, null, this.f47319e);
    }

    @Nullable
    @zzcx(zza = 1)
    public final zzou zza() {
        return this.f47315a;
    }

    @Nullable
    @zzcx(zza = 5)
    public final zzsd zzb() {
        return this.f47319e;
    }

    @Nullable
    @zzcx(zza = 3)
    public final Boolean zzc() {
        return this.f47317c;
    }
}
