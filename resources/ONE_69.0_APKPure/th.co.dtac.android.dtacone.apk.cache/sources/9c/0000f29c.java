package org.apache.http.impl.p029io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p030io.SessionOutputBuffer;
import org.apache.http.util.Args;

/* renamed from: org.apache.http.impl.io.ContentLengthOutputStream */
/* loaded from: classes6.dex */
public class ContentLengthOutputStream extends OutputStream {

    /* renamed from: a */
    public final SessionOutputBuffer f74565a;

    /* renamed from: b */
    public final long f74566b;

    /* renamed from: c */
    public long f74567c;

    /* renamed from: d */
    public boolean f74568d;

    public ContentLengthOutputStream(SessionOutputBuffer sessionOutputBuffer, long j) {
        this.f74565a = (SessionOutputBuffer) Args.notNull(sessionOutputBuffer, "Session output buffer");
        this.f74566b = Args.notNegative(j, "Content length");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f74568d) {
            this.f74568d = true;
            this.f74565a.flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f74565a.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f74568d) {
            long j = this.f74567c;
            long j2 = this.f74566b;
            if (j < j2) {
                long j3 = j2 - j;
                if (i2 > j3) {
                    i2 = (int) j3;
                }
                this.f74565a.write(bArr, i, i2);
                this.f74567c += i2;
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
        if (!this.f74568d) {
            if (this.f74567c < this.f74566b) {
                this.f74565a.write(i);
                this.f74567c++;
                return;
            }
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}