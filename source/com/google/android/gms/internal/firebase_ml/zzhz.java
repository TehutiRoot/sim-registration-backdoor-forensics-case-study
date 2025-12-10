package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzhz implements zzjm {

    /* renamed from: a */
    public final zzhx f45857a;

    /* renamed from: b */
    public final Set f45858b;

    public zzhz(zzic zzicVar) {
        this.f45857a = zzicVar.f45861a;
        this.f45858b = new HashSet(zzicVar.f45862b);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjm
    public final <T> T zza(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        boolean z;
        zzib zza = this.f45857a.zza(inputStream, charset);
        if (!this.f45858b.isEmpty()) {
            try {
                if (zza.zza(this.f45858b) != null && zza.zzhj() != zzih.END_OBJECT) {
                    z = true;
                } else {
                    z = false;
                }
                Object[] objArr = {this.f45858b};
                if (!z) {
                    throw new IllegalArgumentException(zzmt.zzb("wrapper key(s) not found: %s", objArr));
                }
            } catch (Throwable th2) {
                zza.close();
                throw th2;
            }
        }
        return (T) zza.zza(cls, true, null);
    }

    public final zzhx zzfv() {
        return this.f45857a;
    }

    public final Set<String> zzha() {
        return Collections.unmodifiableSet(this.f45858b);
    }
}
