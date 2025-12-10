package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzth {

    /* renamed from: a */
    public final zzcv f46716a;

    public /* synthetic */ zzth(zztf zztfVar, zztg zztgVar) {
        zzcv zzcvVar;
        zzcvVar = zztfVar.f46715a;
        this.f46716a = zzcvVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzth)) {
            return false;
        }
        return Objects.equal(this.f46716a, ((zzth) obj).f46716a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f46716a);
    }

    @Nullable
    @zzfg(zza = 1)
    public final zzcv zza() {
        return this.f46716a;
    }
}
