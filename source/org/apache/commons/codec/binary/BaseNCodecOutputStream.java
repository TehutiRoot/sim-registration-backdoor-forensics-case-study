package org.apache.commons.codec.binary;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import org.apache.commons.codec.binary.BaseNCodec;

/* loaded from: classes6.dex */
public class BaseNCodecOutputStream extends FilterOutputStream {

    /* renamed from: a */
    public final boolean f73058a;

    /* renamed from: b */
    public final BaseNCodec f73059b;

    /* renamed from: c */
    public final byte[] f73060c;

    /* renamed from: d */
    public final BaseNCodec.C12485a f73061d;

    public BaseNCodecOutputStream(OutputStream outputStream, BaseNCodec baseNCodec, boolean z) {
        super(outputStream);
        this.f73060c = new byte[1];
        this.f73061d = new BaseNCodec.C12485a();
        this.f73059b = baseNCodec;
        this.f73058a = z;
    }

    /* renamed from: b */
    public final void m25660b(boolean z) {
        byte[] bArr;
        int m25669f;
        int m25674a = this.f73059b.m25674a(this.f73061d);
        if (m25674a > 0 && (m25669f = this.f73059b.m25669f((bArr = new byte[m25674a]), 0, m25674a, this.f73061d)) > 0) {
            ((FilterOutputStream) this).out.write(bArr, 0, m25669f);
        }
        if (z) {
            ((FilterOutputStream) this).out.flush();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        eof();
        flush();
        ((FilterOutputStream) this).out.close();
    }

    public void eof() {
        if (this.f73058a) {
            this.f73059b.mo25671d(this.f73060c, 0, -1, this.f73061d);
        } else {
            this.f73059b.mo25672c(this.f73060c, 0, -1, this.f73061d);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m25660b(true);
    }

    public boolean isStrictDecoding() {
        return this.f73059b.isStrictDecoding();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(bArr, "array");
        if (i >= 0 && i2 >= 0) {
            if (i > bArr.length || i + i2 > bArr.length) {
                throw new IndexOutOfBoundsException();
            }
            if (i2 > 0) {
                if (this.f73058a) {
                    this.f73059b.mo25671d(bArr, i, i2, this.f73061d);
                } else {
                    this.f73059b.mo25672c(bArr, i, i2, this.f73061d);
                }
                m25660b(false);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f73060c;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }
}
