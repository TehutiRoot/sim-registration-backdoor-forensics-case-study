package org.apache.http.impl.p029io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p030io.SessionOutputBuffer;
import org.apache.http.util.Args;

/* renamed from: org.apache.http.impl.io.IdentityOutputStream */
/* loaded from: classes6.dex */
public class IdentityOutputStream extends OutputStream {

    /* renamed from: a */
    public final SessionOutputBuffer f74586a;

    /* renamed from: b */
    public boolean f74587b = false;

    public IdentityOutputStream(SessionOutputBuffer sessionOutputBuffer) {
        this.f74586a = (SessionOutputBuffer) Args.notNull(sessionOutputBuffer, "Session output buffer");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f74587b) {
            this.f74587b = true;
            this.f74586a.flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f74586a.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f74587b) {
            this.f74586a.write(bArr, i, i2);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (!this.f74587b) {
            this.f74586a.write(i);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}