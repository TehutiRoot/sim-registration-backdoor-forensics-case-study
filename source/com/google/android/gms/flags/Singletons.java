package com.google.android.gms.flags;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes3.dex */
public final class Singletons {

    /* renamed from: c */
    public static Singletons f45389c;

    /* renamed from: a */
    public final FlagRegistry f45390a = new FlagRegistry();

    /* renamed from: b */
    public final zzb f45391b = new zzb();

    static {
        Singletons singletons = new Singletons();
        synchronized (Singletons.class) {
            f45389c = singletons;
        }
    }

    /* renamed from: a */
    public static Singletons m48304a() {
        Singletons singletons;
        synchronized (Singletons.class) {
            singletons = f45389c;
        }
        return singletons;
    }

    @KeepForSdk
    public static FlagRegistry flagRegistry() {
        return m48304a().f45390a;
    }

    public static zzb zzd() {
        return m48304a().f45391b;
    }
}
