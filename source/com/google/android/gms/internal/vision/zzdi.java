package com.google.android.gms.internal.vision;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class zzdi {
    public static <T> zzdf<T> zza(zzdf<T> zzdfVar) {
        if ((zzdfVar instanceof C18055Mi2) || (zzdfVar instanceof zzdh)) {
            return zzdfVar;
        }
        if (zzdfVar instanceof Serializable) {
            return new zzdh(zzdfVar);
        }
        return new C18055Mi2(zzdfVar);
    }

    public static <T> zzdf<T> zza(@NullableDecl T t) {
        return new zzdj(t);
    }
}
