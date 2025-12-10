package org.brotli.dec;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class BrotliInputStream extends InputStream {
    public static final int DEFAULT_INTERNAL_BUFFER_SIZE = 16384;

    /* renamed from: a */
    public byte[] f75604a;

    /* renamed from: b */
    public int f75605b;

    /* renamed from: c */
    public int f75606c;

    /* renamed from: d */
    public final C12896c f75607d;

    public BrotliInputStream(InputStream inputStream) throws IOException {
        this(inputStream, 16384, null);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C12896c.m24382a(this.f75607d);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f75606c >= this.f75605b) {
            byte[] bArr = this.f75604a;
            int read = read(bArr, 0, bArr.length);
            this.f75605b = read;
            this.f75606c = 0;
            if (read == -1) {
                return -1;
            }
        }
        byte[] bArr2 = this.f75604a;
        int i = this.f75606c;
        this.f75606c = i + 1;
        return bArr2[i] & 255;
    }

    public BrotliInputStream(InputStream inputStream, int i) throws IOException {
        this(inputStream, i, null);
    }

    public BrotliInputStream(InputStream inputStream, int i, byte[] bArr) throws IOException {
        C12896c c12896c = new C12896c();
        this.f75607d = c12896c;
        if (i <= 0) {
            throw new IllegalArgumentException("Bad buffer size:" + i);
        } else if (inputStream != null) {
            this.f75604a = new byte[i];
            this.f75605b = 0;
            this.f75606c = 0;
            try {
                C12896c.m24380c(c12896c, inputStream);
                if (bArr != null) {
                    AbstractC12895b.m24385s(c12896c, bArr);
                }
            } catch (BrotliRuntimeException e) {
                throw new IOException("Brotli decoder initialization failed", e);
            }
        } else {
            throw new IllegalArgumentException("source is null");
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Bad offset: " + i);
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > bArr.length) {
                throw new IllegalArgumentException("Buffer overflow: " + i3 + " > " + bArr.length);
            } else if (i2 == 0) {
                return 0;
            } else {
                int max = Math.max(this.f75605b - this.f75606c, 0);
                if (max != 0) {
                    max = Math.min(max, i2);
                    System.arraycopy(this.f75604a, this.f75606c, bArr, i, max);
                    this.f75606c += max;
                    i += max;
                    i2 -= max;
                    if (i2 == 0) {
                        return max;
                    }
                }
                try {
                    C12896c c12896c = this.f75607d;
                    c12896c.f75646Z = bArr;
                    c12896c.f75641U = i;
                    c12896c.f75642V = i2;
                    c12896c.f75643W = 0;
                    AbstractC12895b.m24395i(c12896c);
                    int i4 = this.f75607d.f75643W;
                    if (i4 == 0) {
                        return -1;
                    }
                    return i4 + max;
                } catch (BrotliRuntimeException e) {
                    throw new IOException("Brotli stream decoding failed", e);
                }
            }
        } else {
            throw new IllegalArgumentException("Bad length: " + i2);
        }
    }
}
