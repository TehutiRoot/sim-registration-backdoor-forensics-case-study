package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zznl {

    /* renamed from: a */
    public final zznh f46461a;

    /* renamed from: b */
    public final zznj f46462b;

    /* renamed from: c */
    public final zznj f46463c;

    /* renamed from: d */
    public final Boolean f46464d;

    public /* synthetic */ zznl(zzni zzniVar, zznk zznkVar) {
        zznh zznhVar;
        zznhVar = zzniVar.f46460a;
        this.f46461a = zznhVar;
        this.f46462b = null;
        this.f46463c = null;
        this.f46464d = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zznl) && Objects.equal(this.f46461a, ((zznl) obj).f46461a) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f46461a, null, null, null);
    }

    @Nullable
    @zzbc(zza = 1)
    public final zznh zza() {
        return this.f46461a;
    }
}
