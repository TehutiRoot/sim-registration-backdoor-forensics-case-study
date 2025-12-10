package org.apache.commons.codec.binary;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import org.apache.commons.codec.binary.BaseNCodec;

/* loaded from: classes6.dex */
public class BaseNCodecInputStream extends FilterInputStream {

    /* renamed from: a */
    public final BaseNCodec f73053a;

    /* renamed from: b */
    public final boolean f73054b;

    /* renamed from: c */
    public final byte[] f73055c;

    /* renamed from: d */
    public final byte[] f73056d;

    /* renamed from: e */
    public final BaseNCodec.C12485a f73057e;

    public BaseNCodecInputStream(InputStream inputStream, BaseNCodec baseNCodec, boolean z) {
        super(inputStream);
        int i;
        this.f73055c = new byte[1];
        this.f73057e = new BaseNCodec.C12485a();
        this.f73054b = z;
        this.f73053a = baseNCodec;
        if (z) {
            i = 4096;
        } else {
            i = 8192;
        }
        this.f73056d = new byte[i];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return !this.f73057e.f73050f ? 1 : 0;
    }

    public boolean isStrictDecoding() {
        return this.f73053a.isStrictDecoding();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = read(this.f73055c, 0, 1);
        while (read == 0) {
            read = read(this.f73055c, 0, 1);
        }
        if (read > 0) {
            byte b = this.f73055c[0];
            return b < 0 ? b + 256 : b;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        int read;
        if (j >= 0) {
            byte[] bArr = new byte[512];
            long j2 = j;
            while (j2 > 0 && (read = read(bArr, 0, (int) Math.min(512, j2))) != -1) {
                j2 -= read;
            }
            return j - j2;
        }
        throw new IllegalArgumentException("Negative skip length: " + j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(bArr, "array");
        if (i >= 0 && i2 >= 0) {
            if (i > bArr.length || i + i2 > bArr.length) {
                throw new IndexOutOfBoundsException();
            }
            if (i2 == 0) {
                return 0;
            }
            int i3 = 0;
            while (i3 < i2) {
                if (!this.f73053a.m25670e(this.f73057e)) {
                    int read = ((FilterInputStream) this).in.read(this.f73056d);
                    if (this.f73054b) {
                        this.f73053a.mo25671d(this.f73056d, 0, read, this.f73057e);
                    } else {
                        this.f73053a.mo25672c(this.f73056d, 0, read, this.f73057e);
                    }
                }
                int m25669f = this.f73053a.m25669f(bArr, i + i3, i2 - i3, this.f73057e);
                if (m25669f < 0) {
                    if (i3 != 0) {
                        return i3;
                    }
                    return -1;
                }
                i3 += m25669f;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException();
    }
}
