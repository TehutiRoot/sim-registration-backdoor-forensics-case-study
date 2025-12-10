package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class zzgq implements zzgt {

    /* renamed from: a */
    public zzgz f45795a;

    /* renamed from: b */
    public long f45796b;

    public zzgq(String str) {
        this(str == null ? null : new zzgz(str));
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgt
    public final long getLength() throws IOException {
        if (this.f45796b == -1) {
            this.f45796b = zzjh.zzb(this);
        }
        return this.f45796b;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgt
    public final String getType() {
        zzgz zzgzVar = this.f45795a;
        if (zzgzVar == null) {
            return null;
        }
        return zzgzVar.zzfz();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgt
    public final boolean zzfx() {
        return true;
    }

    public final Charset zzfy() {
        zzgz zzgzVar = this.f45795a;
        if (zzgzVar != null && zzgzVar.zzga() != null) {
            return this.f45795a.zzga();
        }
        return zziw.UTF_8;
    }

    public zzgq(zzgz zzgzVar) {
        this.f45796b = -1L;
        this.f45795a = zzgzVar;
    }
}