package org.apache.http.impl.p029io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p030io.SessionOutputBuffer;
import org.apache.http.util.Args;

/* renamed from: org.apache.http.impl.io.ContentLengthOutputStream */
/* loaded from: classes6.dex */
public class ContentLengthOutputStream extends OutputStream {

    /* renamed from: a */
    public final SessionOutputBuffer f74481a;

    /* renamed from: b */
    public final long f74482b;

    /* renamed from: c */
    public long f74483c;

    /* renamed from: d */
    public boolean f74484d;

    public ContentLengthOutputStream(SessionOutputBuffer sessionOutputBuffer, long j) {
        this.f74481a = (SessionOutputBuffer) Args.notNull(sessionOutputBuffer, "Session output buffer");
        this.f74482b = Args.notNegative(j, "Content length");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f74484d) {
            this.f74484d = true;
            this.f74481a.flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f74481a.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f74484d) {
            long j = this.f74483c;
            long j2 = this.f74482b;
            if (j < j2) {
                long j3 = j2 - j;
                if (i2 > j3) {
                    i2 = (int) j3;
                }
                this.f74481a.write(bArr, i, i2);
                this.f74483c += i2;
                return;
            }
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
        if (!this.f74484d) {
            if (this.f74483c < this.f74482b) {
                this.f74481a.write(i);
                this.f74483c++;
                return;
            }
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
