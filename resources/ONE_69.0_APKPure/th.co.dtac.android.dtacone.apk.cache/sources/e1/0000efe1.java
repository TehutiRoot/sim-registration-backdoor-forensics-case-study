package org.apache.commons.p028io.input;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: org.apache.commons.io.input.NullInputStream */
/* loaded from: classes6.dex */
public class NullInputStream extends AbstractInputStream {
    @Deprecated
    public static final NullInputStream INSTANCE = new NullInputStream();

    /* renamed from: b */
    public final long f73469b;

    /* renamed from: c */
    public long f73470c;

    /* renamed from: d */
    public long f73471d;

    /* renamed from: e */
    public long f73472e;

    /* renamed from: f */
    public final boolean f73473f;

    /* renamed from: g */
    public final boolean f73474g;

    public NullInputStream() {
        this(0L, true, false);
    }

    @Override // java.io.InputStream
    public int available() {
        if (isClosed()) {
            return 0;
        }
        long j = this.f73469b - this.f73470c;
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
        this.f73471d = -1L;
    }

    /* renamed from: d */
    public final void m25294d(String str) {
        if (!this.f73473f) {
            return;
        }
        throw new EOFException(str);
    }

    /* renamed from: g */
    public final int m25293g() {
        m25294d("handleEof()");
        return -1;
    }

    public long getPosition() {
        return this.f73470c;
    }

    public long getSize() {
        return this.f73469b;
    }

    public NullInputStream init() {
        setClosed(false);
        this.f73470c = 0L;
        this.f73471d = -1L;
        this.f73472e = 0L;
        return this;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        if (this.f73474g) {
            this.f73471d = this.f73470c;
            this.f73472e = i;
        } else {
            throw AbstractC22704vZ1.m889a();
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f73474g;
    }

    public int processByte() {
        return 0;
    }

    public void processBytes(byte[] bArr, int i, int i2) {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        m25350b();
        long j = this.f73470c;
        if (j == this.f73469b) {
            return m25293g();
        }
        this.f73470c = j + 1;
        return processByte();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f73474g) {
            long j = this.f73471d;
            if (j >= 0) {
                if (this.f73470c <= this.f73472e + j) {
                    this.f73470c = j;
                    setClosed(false);
                } else {
                    throw new IOException("Marked position [" + this.f73471d + "] is no longer valid - passed the read limit [" + this.f73472e + "]");
                }
            } else {
                throw new IOException("No position has been marked");
            }
        } else {
            throw AbstractC22704vZ1.m887c();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (isClosed()) {
            m25294d("skip(long)");
            return -1L;
        }
        long j2 = this.f73470c;
        long j3 = this.f73469b;
        if (j2 == j3) {
            return m25293g();
        }
        long j4 = j2 + j;
        this.f73470c = j4;
        if (j4 > j3) {
            long j5 = j - (j4 - j3);
            this.f73470c = j3;
            return j5;
        }
        return j;
    }

    public NullInputStream(long j) {
        this(j, true, false);
    }

    public NullInputStream(long j, boolean z, boolean z2) {
        this.f73471d = -1L;
        this.f73469b = j;
        this.f73474g = z;
        this.f73473f = z2;
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
        m25350b();
        long j = this.f73470c;
        long j2 = this.f73469b;
        if (j == j2) {
            return m25293g();
        }
        long j3 = j + i2;
        this.f73470c = j3;
        if (j3 > j2) {
            i2 -= (int) (j3 - j2);
            this.f73470c = j2;
        }
        processBytes(bArr, i, i2);
        return i2;
    }
}