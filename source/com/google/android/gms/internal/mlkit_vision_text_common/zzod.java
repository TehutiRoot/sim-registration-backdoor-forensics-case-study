package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzod {

    /* renamed from: a */
    public final zzob f47337a;

    /* renamed from: b */
    public final Integer f47338b;

    /* renamed from: c */
    public final Integer f47339c;

    /* renamed from: d */
    public final Boolean f47340d;

    public /* synthetic */ zzod(zzoa zzoaVar, zzoc zzocVar) {
        zzob zzobVar;
        Integer num;
        zzobVar = zzoaVar.f47335a;
        this.f47337a = zzobVar;
        num = zzoaVar.f47336b;
        this.f47338b = num;
        this.f47339c = null;
        this.f47340d = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzod)) {
            return false;
        }
        zzod zzodVar = (zzod) obj;
        if (Objects.equal(this.f47337a, zzodVar.f47337a) && Objects.equal(this.f47338b, zzodVar.f47338b) && Objects.equal(null, null) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f47337a, this.f47338b, null, null);
    }

    @Nullable
    @zzcx(zza = 1)
    public final zzob zza() {
        return this.f47337a;
    }

    @Nullable
    @zzcx(zza = 2)
    public final Integer zzb() {
        return this.f47338b;
    }
}
