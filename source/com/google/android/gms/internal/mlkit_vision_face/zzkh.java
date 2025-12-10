package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzkh {

    /* renamed from: a */
    public final zzkf f47151a;

    /* renamed from: b */
    public final Integer f47152b;

    /* renamed from: c */
    public final Integer f47153c;

    /* renamed from: d */
    public final Boolean f47154d;

    public /* synthetic */ zzkh(zzke zzkeVar, zzkg zzkgVar) {
        zzkf zzkfVar;
        Integer num;
        zzkfVar = zzkeVar.f47149a;
        this.f47151a = zzkfVar;
        num = zzkeVar.f47150b;
        this.f47152b = num;
        this.f47153c = null;
        this.f47154d = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkh)) {
            return false;
        }
        zzkh zzkhVar = (zzkh) obj;
        if (Objects.equal(this.f47151a, zzkhVar.f47151a) && Objects.equal(this.f47152b, zzkhVar.f47152b) && Objects.equal(null, null) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f47151a, this.f47152b, null, null);
    }

    @Nullable
    @zzcu(zza = 1)
    public final zzkf zza() {
        return this.f47151a;
    }

    @Nullable
    @zzcu(zza = 2)
    public final Integer zzb() {
        return this.f47152b;
    }
}
