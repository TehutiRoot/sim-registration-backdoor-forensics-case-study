package org.apache.http.impl.p029io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p030io.SessionOutputBuffer;

/* renamed from: org.apache.http.impl.io.ChunkedOutputStream */
/* loaded from: classes6.dex */
public class ChunkedOutputStream extends OutputStream {

    /* renamed from: a */
    public final SessionOutputBuffer f74556a;

    /* renamed from: b */
    public final byte[] f74557b;

    /* renamed from: c */
    public int f74558c;

    /* renamed from: d */
    public boolean f74559d;

    /* renamed from: e */
    public boolean f74560e;

    @Deprecated
    public ChunkedOutputStream(SessionOutputBuffer sessionOutputBuffer, int i) throws IOException {
        this(i, sessionOutputBuffer);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f74560e) {
            this.f74560e = true;
            finish();
            this.f74556a.flush();
        }
    }

    public void finish() throws IOException {
        if (!this.f74559d) {
            flushCache();
            writeClosingChunk();
            this.f74559d = true;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        flushCache();
        this.f74556a.flush();
    }

    public void flushCache() throws IOException {
        int i = this.f74558c;
        if (i > 0) {
            this.f74556a.writeLine(Integer.toHexString(i));
            this.f74556a.write(this.f74557b, 0, this.f74558c);
            this.f74556a.writeLine("");
            this.f74558c = 0;
        }
    }

    public void flushCacheWithAppend(byte[] bArr, int i, int i2) throws IOException {
        this.f74556a.writeLine(Integer.toHexString(this.f74558c + i2));
        this.f74556a.write(this.f74557b, 0, this.f74558c);
        this.f74556a.write(bArr, i, i2);
        this.f74556a.writeLine("");
        this.f74558c = 0;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (!this.f74560e) {
            byte[] bArr = this.f74557b;
            int i2 = this.f74558c;
            bArr[i2] = (byte) i;
            int i3 = i2 + 1;
            this.f74558c = i3;
            if (i3 == bArr.length) {
                flushCache();
                return;
            }
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    public void writeClosingChunk() throws IOException {
        this.f74556a.writeLine("0");
        this.f74556a.writeLine("");
    }

    @Deprecated
    public ChunkedOutputStream(SessionOutputBuffer sessionOutputBuffer) throws IOException {
        this(2048, sessionOutputBuffer);
    }

    public ChunkedOutputStream(int i, SessionOutputBuffer sessionOutputBuffer) {
        this.f74558c = 0;
        this.f74559d = false;
        this.f74560e = false;
        this.f74557b = new byte[i];
        this.f74556a = sessionOutputBuffer;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f74560e) {
            byte[] bArr2 = this.f74557b;
            int length = bArr2.length;
            int i3 = this.f74558c;
            if (i2 >= length - i3) {
                flushCacheWithAppend(bArr, i, i2);
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f74558c += i2;
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}