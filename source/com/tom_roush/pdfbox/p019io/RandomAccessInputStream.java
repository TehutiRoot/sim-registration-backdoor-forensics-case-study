package com.tom_roush.pdfbox.p019io;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.tom_roush.pdfbox.io.RandomAccessInputStream */
/* loaded from: classes5.dex */
public class RandomAccessInputStream extends InputStream {

    /* renamed from: a */
    public final RandomAccessRead f59917a;

    /* renamed from: b */
    public long f59918b = 0;

    public RandomAccessInputStream(RandomAccessRead randomAccessRead) {
        this.f59917a = randomAccessRead;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        m32756b();
        long length = this.f59917a.length() - this.f59917a.getPosition();
        if (length > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) length;
    }

    /* renamed from: b */
    public void m32756b() {
        this.f59917a.seek(this.f59918b);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        m32756b();
        if (this.f59917a.isEOF()) {
            return -1;
        }
        int read = this.f59917a.read();
        if (read != -1) {
            this.f59918b++;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("read() returns -1, assumed position: ");
            sb.append(this.f59918b);
            sb.append(", actual position: ");
            sb.append(this.f59917a.getPosition());
        }
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        m32756b();
        this.f59917a.seek(this.f59918b + j);
        this.f59918b += j;
        return j;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        m32756b();
        if (this.f59917a.isEOF()) {
            return -1;
        }
        int read = this.f59917a.read(bArr, i, i2);
        if (read != -1) {
            this.f59918b += read;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("read() returns -1, assumed position: ");
            sb.append(this.f59918b);
            sb.append(", actual position: ");
            sb.append(this.f59917a.getPosition());
        }
        return read;
    }
}
