package com.tom_roush.pdfbox.p019io;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.tom_roush.pdfbox.io.RandomAccessInputStream */
/* loaded from: classes5.dex */
public class RandomAccessInputStream extends InputStream {

    /* renamed from: a */
    public final RandomAccessRead f59929a;

    /* renamed from: b */
    public long f59930b = 0;

    public RandomAccessInputStream(RandomAccessRead randomAccessRead) {
        this.f59929a = randomAccessRead;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        m32748b();
        long length = this.f59929a.length() - this.f59929a.getPosition();
        if (length > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) length;
    }

    /* renamed from: b */
    public void m32748b() {
        this.f59929a.seek(this.f59930b);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        m32748b();
        if (this.f59929a.isEOF()) {
            return -1;
        }
        int read = this.f59929a.read();
        if (read != -1) {
            this.f59930b++;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("read() returns -1, assumed position: ");
            sb.append(this.f59930b);
            sb.append(", actual position: ");
            sb.append(this.f59929a.getPosition());
        }
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        m32748b();
        this.f59929a.seek(this.f59930b + j);
        this.f59930b += j;
        return j;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        m32748b();
        if (this.f59929a.isEOF()) {
            return -1;
        }
        int read = this.f59929a.read(bArr, i, i2);
        if (read != -1) {
            this.f59930b += read;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("read() returns -1, assumed position: ");
            sb.append(this.f59930b);
            sb.append(", actual position: ");
            sb.append(this.f59929a.getPosition());
        }
        return read;
    }
}