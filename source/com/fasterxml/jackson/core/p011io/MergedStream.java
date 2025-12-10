package com.fasterxml.jackson.core.p011io;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fasterxml.jackson.core.io.MergedStream */
/* loaded from: classes3.dex */
public final class MergedStream extends InputStream {

    /* renamed from: a */
    public final IOContext f43116a;

    /* renamed from: b */
    public final InputStream f43117b;

    /* renamed from: c */
    public byte[] f43118c;

    /* renamed from: d */
    public int f43119d;

    /* renamed from: e */
    public final int f43120e;

    public MergedStream(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.f43116a = iOContext;
        this.f43117b = inputStream;
        this.f43118c = bArr;
        this.f43119d = i;
        this.f43120e = i2;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f43118c != null) {
            return this.f43120e - this.f43119d;
        }
        return this.f43117b.available();
    }

    /* renamed from: b */
    public final void m49764b() {
        byte[] bArr = this.f43118c;
        if (bArr != null) {
            this.f43118c = null;
            IOContext iOContext = this.f43116a;
            if (iOContext != null) {
                iOContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m49764b();
        this.f43117b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        if (this.f43118c == null) {
            this.f43117b.mark(i);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        if (this.f43118c == null && this.f43117b.markSupported()) {
            return true;
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f43118c;
        if (bArr != null) {
            int i = this.f43119d;
            int i2 = i + 1;
            this.f43119d = i2;
            int i3 = bArr[i] & 255;
            if (i2 >= this.f43120e) {
                m49764b();
            }
            return i3;
        }
        return this.f43117b.read();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        if (this.f43118c == null) {
            this.f43117b.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2;
        if (this.f43118c != null) {
            int i = this.f43120e;
            int i2 = this.f43119d;
            j2 = i - i2;
            if (j2 > j) {
                this.f43119d = i2 + ((int) j);
                return j;
            }
            m49764b();
            j -= j2;
        } else {
            j2 = 0;
        }
        if (j > 0) {
            return j2 + this.f43117b.skip(j);
        }
        return j2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.f43118c;
        if (bArr2 != null) {
            int i3 = this.f43120e;
            int i4 = this.f43119d;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i4, bArr, i, i2);
            int i6 = this.f43119d + i2;
            this.f43119d = i6;
            if (i6 >= this.f43120e) {
                m49764b();
            }
            return i2;
        }
        return this.f43117b.read(bArr, i, i2);
    }
}
