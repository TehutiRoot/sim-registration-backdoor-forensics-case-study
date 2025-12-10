package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzjq {

    /* renamed from: b */
    public static volatile zzjq f46325b;

    /* renamed from: c */
    public static final zzjq f46326c = new zzjq(true);
    public static final /* synthetic */ int zzb = 0;

    /* renamed from: a */
    public final Map f46327a = Collections.emptyMap();

    public zzjq(boolean z) {
    }

    public static zzjq zza() {
        zzjq zzjqVar = f46325b;
        if (zzjqVar != null) {
            return zzjqVar;
        }
        synchronized (zzjq.class) {
            try {
                zzjq zzjqVar2 = f46325b;
                if (zzjqVar2 != null) {
                    return zzjqVar2;
                }
                zzjq m326a = AbstractC23094yB2.m326a(zzjq.class);
                f46325b = m326a;
                return m326a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzkc zzb(zzll zzllVar, int i) {
        return (zzkc) this.f46327a.get(new EA2(zzllVar, i));
    }
}
