package com.google.android.gms.internal.firebase_ml;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class zzig extends zzhx {
    public static zzig zzhz() {
        return AbstractC22020rx2.f79524a;
    }

    /* renamed from: b */
    public final zzib m47896b(Reader reader) {
        return new Dx2(this, new zzth(reader));
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhx
    public final zzib zza(InputStream inputStream) {
        return m47896b(new InputStreamReader(inputStream, zziw.UTF_8));
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhx
    public final zzib zzam(String str) {
        return m47896b(new StringReader(str));
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhx
    public final zzib zza(InputStream inputStream, Charset charset) {
        if (charset == null) {
            return zza(inputStream);
        }
        return m47896b(new InputStreamReader(inputStream, charset));
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhx
    public final zzia zza(OutputStream outputStream, Charset charset) {
        return new C20988lx2(this, new zztm(new OutputStreamWriter(outputStream, charset)));
    }
}
