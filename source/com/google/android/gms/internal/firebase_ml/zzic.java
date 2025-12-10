package com.google.android.gms.internal.firebase_ml;

import java.util.Collection;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class zzic {

    /* renamed from: a */
    public final zzhx f45861a;

    /* renamed from: b */
    public Collection f45862b = new HashSet();

    public zzic(zzhx zzhxVar) {
        this.f45861a = (zzhx) zzml.checkNotNull(zzhxVar);
    }

    public final zzic zza(Collection<String> collection) {
        this.f45862b = collection;
        return this;
    }

    public final zzhz zzhv() {
        return new zzhz(this);
    }
}
