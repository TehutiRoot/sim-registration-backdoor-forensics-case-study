package org.apache.http.client.entity;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* loaded from: classes6.dex */
public class DeflateInputStream extends InputStream {

    /* renamed from: a */
    public final InputStream f73680a;

    /* renamed from: org.apache.http.client.entity.DeflateInputStream$a */
    /* loaded from: classes6.dex */
    public static class C12558a extends InflaterInputStream {

        /* renamed from: a */
        public boolean f73681a;

        public C12558a(InputStream inputStream, Inflater inflater) {
            super(inputStream, inflater);
            this.f73681a = false;
        }

        @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f73681a) {
                return;
            }
            this.f73681a = true;
            ((InflaterInputStream) this).inf.end();
            super.close();
        }
    }

    public DeflateInputStream(InputStream inputStream) throws IOException {
        boolean z;
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 2);
        int read = pushbackInputStream.read();
        int read2 = pushbackInputStream.read();
        if (read != -1 && read2 != -1) {
            pushbackInputStream.unread(read2);
            pushbackInputStream.unread(read);
            int i = read & 255;
            int i2 = (i >> 4) & 15;
            int i3 = read2 & 255;
            if ((read & 15) == 8 && i2 <= 7 && ((i << 8) | i3) % 31 == 0) {
                z = false;
            } else {
                z = true;
            }
            this.f73680a = new C12558a(pushbackInputStream, new Inflater(z));
            return;
        }
        throw new ZipException("Unexpected end of stream");
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f73680a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73680a.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f73680a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f73680a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.f73680a.read();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.f73680a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return this.f73680a.skip(j);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return this.f73680a.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f73680a.read(bArr, i, i2);
    }
}
