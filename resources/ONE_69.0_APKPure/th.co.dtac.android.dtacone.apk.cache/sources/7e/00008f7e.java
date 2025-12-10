package com.google.android.gms.internal.firebase_ml;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class zzjl extends FilterOutputStream {

    /* renamed from: a */
    public final zzjj f45944a;

    public zzjl(OutputStream outputStream, Logger logger, Level level, int i) {
        super(outputStream);
        this.f45944a = new zzjj(logger, level, i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f45944a.close();
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        this.f45944a.write(i);
    }

    public final zzjj zzil() {
        return this.f45944a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f45944a.write(bArr, i, i2);
    }
}