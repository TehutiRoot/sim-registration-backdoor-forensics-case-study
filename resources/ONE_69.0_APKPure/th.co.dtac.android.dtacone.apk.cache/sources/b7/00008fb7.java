package com.google.android.gms.internal.firebase_ml;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class zzmf<T> implements Serializable {
    public static <T> zzmf<T> zzj(T t) {
        return new zzmk(zzml.checkNotNull(t));
    }

    public static <T> zzmf<T> zzjl() {
        return zzls.zzakp;
    }

    public abstract T get();

    public abstract boolean isPresent();
}