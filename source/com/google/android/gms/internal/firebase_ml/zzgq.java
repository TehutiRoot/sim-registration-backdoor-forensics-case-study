package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class zzgq implements zzgt {

    /* renamed from: a */
    public zzgz f45783a;

    /* renamed from: b */
    public long f45784b;

    public zzgq(String str) {
        this(str == null ? null : new zzgz(str));
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgt
    public final long getLength() throws IOException {
        if (this.f45784b == -1) {
            this.f45784b = zzjh.zzb(this);
        }
        return this.f45784b;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgt
    public final String getType() {
        zzgz zzgzVar = this.f45783a;
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
        zzgz zzgzVar = this.f45783a;
        if (zzgzVar != null && zzgzVar.zzga() != null) {
            return this.f45783a.zzga();
        }
        return zziw.UTF_8;
    }

    public zzgq(zzgz zzgzVar) {
        this.f45784b = -1L;
        this.f45783a = zzgzVar;
    }
}
