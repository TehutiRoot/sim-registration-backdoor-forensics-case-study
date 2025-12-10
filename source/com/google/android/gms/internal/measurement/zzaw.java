package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzaw {

    /* renamed from: a */
    public final List f46241a = new ArrayList();

    /* renamed from: a */
    public final zzap m47341a(String str) {
        if (this.f46241a.contains(zzh.zze(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }

    public abstract zzap zza(String str, zzg zzgVar, List list);
}
