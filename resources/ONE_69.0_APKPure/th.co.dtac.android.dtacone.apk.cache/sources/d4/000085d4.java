package com.fasterxml.jackson.core.p011io;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fasterxml.jackson.core.io.MergedStream */
/* loaded from: classes3.dex */
public final class MergedStream extends InputStream {

    /* renamed from: a */
    public final IOContext f43128a;

    /* renamed from: b */
    public final InputStream f43129b;

    /* renamed from: c */
    public byte[] f43130c;

    /* renamed from: d */
    public int f43131d;

    /* renamed from: e */
    public final int f43132e;

    public MergedStream(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.f43128a = iOContext;
        this.f43129b = inputStream;
        this.f43130c = bArr;
        this.f43131d = i;
        this.f43132e = i2;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f43130c != null) {
            return this.f43132e - this.f43131d;
        }
        return this.f43129b.available();
    }

    /* renamed from: b */
    public final void m49761b() {
        byte[] bArr = this.f43130c;
        if (bArr != null) {
            this.f43130c = null;
            IOContext iOContext = this.f43128a;
            if (iOContext != null) {
                iOContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m49761b();
        this.f43129b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        if (this.f43130c == null) {
            this.f43129b.mark(i);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        if (this.f43130c == null && this.f43129b.markSupported()) {
            return true;
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f43130c;
        if (bArr != null) {
            int i = this.f43131d;
            int i2 = i + 1;
            this.f43131d = i2;
            int i3 = bArr[i] & 255;
            if (i2 >= this.f43132e) {
                m49761b();
            }
            return i3;
        }
        return this.f43129b.read();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        if (this.f43130c == null) {
            this.f43129b.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2;
        if (this.f43130c != null) {
            int i = this.f43132e;
            int i2 = this.f43131d;
            j2 = i - i2;
            if (j2 > j) {
                this.f43131d = i2 + ((int) j);
                return j;
            }
            m49761b();
            j -= j2;
        } else {
            j2 = 0;
        }
        if (j > 0) {
            return j2 + this.f43129b.skip(j);
        }
        return j2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.f43130c;
        if (bArr2 != null) {
            int i3 = this.f43132e;
            int i4 = this.f43131d;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i4, bArr, i, i2);
            int i6 = this.f43131d + i2;
            this.f43131d = i6;
            if (i6 >= this.f43132e) {
                m49761b();
            }
            return i2;
        }
        return this.f43129b.read(bArr, i, i2);
    }
}