package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class zzgv implements zzjq {

    /* renamed from: a */
    public final zzjq f45792a;

    /* renamed from: b */
    public final zzgw f45793b;

    public zzgv(zzjq zzjqVar, zzgw zzgwVar) {
        this.f45792a = (zzjq) zzml.checkNotNull(zzjqVar);
        this.f45793b = (zzgw) zzml.checkNotNull(zzgwVar);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjq
    public final void writeTo(OutputStream outputStream) throws IOException {
        this.f45793b.zza(this.f45792a, outputStream);
    }
}
