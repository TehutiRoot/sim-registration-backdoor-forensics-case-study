package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class zzil {
    public static zzih zza(zzih zzihVar) {
        if (!(zzihVar instanceof C20703jy2) && !(zzihVar instanceof zzii)) {
            if (zzihVar instanceof Serializable) {
                return new zzii(zzihVar);
            }
            return new C20703jy2(zzihVar);
        }
        return zzihVar;
    }

    public static zzih zzb(Object obj) {
        return new zzik(obj);
    }
}