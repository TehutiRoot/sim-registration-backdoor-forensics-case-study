package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzos {

    /* renamed from: a */
    public final zzoq f46631a;

    /* renamed from: b */
    public final Integer f46632b;

    /* renamed from: c */
    public final Integer f46633c;

    /* renamed from: d */
    public final Boolean f46634d;

    public /* synthetic */ zzos(zzop zzopVar, zzor zzorVar) {
        zzoq zzoqVar;
        Integer num;
        zzoqVar = zzopVar.f46629a;
        this.f46631a = zzoqVar;
        num = zzopVar.f46630b;
        this.f46632b = num;
        this.f46633c = null;
        this.f46634d = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzos)) {
            return false;
        }
        zzos zzosVar = (zzos) obj;
        if (Objects.equal(this.f46631a, zzosVar.f46631a) && Objects.equal(this.f46632b, zzosVar.f46632b) && Objects.equal(null, null) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f46631a, this.f46632b, null, null);
    }

    @Nullable
    @zzfg(zza = 1)
    public final zzoq zza() {
        return this.f46631a;
    }

    @Nullable
    @zzfg(zza = 2)
    public final Integer zzb() {
        return this.f46632b;
    }
}
