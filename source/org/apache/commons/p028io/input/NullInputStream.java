package org.apache.commons.p028io.input;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: org.apache.commons.io.input.NullInputStream */
/* loaded from: classes6.dex */
public class NullInputStream extends AbstractInputStream {
    @Deprecated
    public static final NullInputStream INSTANCE = new NullInputStream();

    /* renamed from: b */
    public final long f73385b;

    /* renamed from: c */
    public long f73386c;

    /* renamed from: d */
    public long f73387d;

    /* renamed from: e */
    public long f73388e;

    /* renamed from: f */
    public final boolean f73389f;

    /* renamed from: g */
    public final boolean f73390g;

    public NullInputStream() {
        this(0L, true, false);
    }

    @Override // java.io.InputStream
    public int available() {
        if (isClosed()) {
            return 0;
        }
        long j = this.f73385b - this.f73386c;
        if (j <= 0) {
            return 0;
        }
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    @Override // org.apache.commons.p028io.input.AbstractInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f73387d = -1L;
    }

    /* renamed from: d */
    public final void m25104d(String str) {
        if (!this.f73389f) {
            return;
        }
        throw new EOFException(str);
    }

    /* renamed from: g */
    public final int m25103g() {
        m25104d("handleEof()");
        return -1;
    }

    public long getPosition() {
        return this.f73386c;
    }

    public long getSize() {
        return this.f73385b;
    }

    public NullInputStream init() {
        setClosed(false);
        this.f73386c = 0L;
        this.f73387d = -1L;
        this.f73388e = 0L;
        return this;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        if (this.f73390g) {
            this.f73387d = this.f73386c;
            this.f73388e = i;
        } else {
            throw AbstractC23150yY1.m240a();
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f73390g;
    }

    public int processByte() {
        return 0;
    }

    public void processBytes(byte[] bArr, int i, int i2) {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        m25160b();
        long j = this.f73386c;
        if (j == this.f73385b) {
            return m25103g();
        }
        this.f73386c = j + 1;
        return processByte();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f73390g) {
            long j = this.f73387d;
            if (j >= 0) {
                if (this.f73386c <= this.f73388e + j) {
                    this.f73386c = j;
                    setClosed(false);
                } else {
                    throw new IOException("Marked position [" + this.f73387d + "] is no longer valid - passed the read limit [" + this.f73388e + "]");
                }
            } else {
                throw new IOException("No position has been marked");
            }
        } else {
            throw AbstractC23150yY1.m238c();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (isClosed()) {
            m25104d("skip(long)");
            return -1L;
        }
        long j2 = this.f73386c;
        long j3 = this.f73385b;
        if (j2 == j3) {
            return m25103g();
        }
        long j4 = j2 + j;
        this.f73386c = j4;
        if (j4 > j3) {
            long j5 = j - (j4 - j3);
            this.f73386c = j3;
            return j5;
        }
        return j;
    }

    public NullInputStream(long j) {
        this(j, true, false);
    }

    public NullInputStream(long j, boolean z, boolean z2) {
        this.f73387d = -1L;
        this.f73385b = j;
        this.f73390g = z;
        this.f73389f = z2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr.length == 0 || i2 == 0) {
            return 0;
        }
        m25160b();
        long j = this.f73386c;
        long j2 = this.f73385b;
        if (j == j2) {
            return m25103g();
        }
        long j3 = j + i2;
        this.f73386c = j3;
        if (j3 > j2) {
            i2 -= (int) (j3 - j2);
            this.f73386c = j2;
        }
        processBytes(bArr, i, i2);
        return i2;
    }
}
