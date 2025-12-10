package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public final class zzgs implements zzgw {
    @Override // com.google.android.gms.internal.firebase_ml.zzgw
    public final String getName() {
        return "gzip";
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgw
    public final void zza(zzjq zzjqVar, OutputStream outputStream) throws IOException {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new C19425cs2(this, outputStream));
        zzjqVar.writeTo(gZIPOutputStream);
        gZIPOutputStream.close();
    }
}
