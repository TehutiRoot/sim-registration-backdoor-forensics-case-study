package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzsd {

    /* renamed from: a */
    public final zzsb f47373a;

    /* renamed from: b */
    public final Boolean f47374b;

    /* renamed from: c */
    public final String f47375c;

    public /* synthetic */ zzsd(zzsa zzsaVar, zzsc zzscVar) {
        zzsb zzsbVar;
        zzsbVar = zzsaVar.f47372a;
        this.f47373a = zzsbVar;
        this.f47374b = null;
        this.f47375c = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzsd) && Objects.equal(this.f47373a, ((zzsd) obj).f47373a) && Objects.equal(null, null) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f47373a, null, null);
    }

    @Nullable
    @zzcx(zza = 3)
    public final zzsb zza() {
        return this.f47373a;
    }
}
