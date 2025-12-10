package kotlin.p023io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.io.encoding.a */
/* loaded from: classes5.dex */
public final class C11685a extends OutputStream {

    /* renamed from: a */
    public final OutputStream f68277a;

    /* renamed from: b */
    public final Base64 f68278b;

    /* renamed from: c */
    public boolean f68279c;

    /* renamed from: d */
    public int f68280d;

    /* renamed from: e */
    public final byte[] f68281e;

    /* renamed from: f */
    public final byte[] f68282f;

    /* renamed from: g */
    public int f68283g;

    public C11685a(OutputStream output, Base64 base64) {
        int i;
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.f68277a = output;
        this.f68278b = base64;
        if (base64.isMimeScheme$kotlin_stdlib()) {
            i = 76;
        } else {
            i = -1;
        }
        this.f68280d = i;
        this.f68281e = new byte[1024];
        this.f68282f = new byte[3];
    }

    /* renamed from: b */
    public final void m29052b() {
        if (!this.f68279c) {
            return;
        }
        throw new IOException("The output stream is closed.");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f68279c) {
            this.f68279c = true;
            if (this.f68283g != 0) {
                m29050g();
            }
            this.f68277a.close();
        }
    }

    /* renamed from: d */
    public final int m29051d(byte[] bArr, int i, int i2) {
        int min = Math.min(3 - this.f68283g, i2 - i);
        ArraysKt___ArraysJvmKt.copyInto(bArr, this.f68282f, this.f68283g, i, i + min);
        int i3 = this.f68283g + min;
        this.f68283g = i3;
        if (i3 == 3) {
            m29050g();
        }
        return min;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        m29052b();
        this.f68277a.flush();
    }

    /* renamed from: g */
    public final void m29050g() {
        if (m29049i(this.f68282f, 0, this.f68283g) == 4) {
            this.f68283g = 0;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: i */
    public final int m29049i(byte[] bArr, int i, int i2) {
        int encodeIntoByteArray = this.f68278b.encodeIntoByteArray(bArr, this.f68281e, 0, i, i2);
        if (this.f68280d == 0) {
            this.f68277a.write(Base64.Default.getMimeLineSeparatorSymbols$kotlin_stdlib());
            this.f68280d = 76;
            if (encodeIntoByteArray > 76) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        this.f68277a.write(this.f68281e, 0, encodeIntoByteArray);
        this.f68280d -= encodeIntoByteArray;
        return encodeIntoByteArray;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        m29052b();
        byte[] bArr = this.f68282f;
        int i2 = this.f68283g;
        int i3 = i2 + 1;
        this.f68283g = i3;
        bArr[i2] = (byte) i;
        if (i3 == 3) {
            m29050g();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] source, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(source, "source");
        m29052b();
        if (i < 0 || i2 < 0 || (i3 = i + i2) > source.length) {
            throw new IndexOutOfBoundsException("offset: " + i + ", length: " + i2 + ", source size: " + source.length);
        } else if (i2 == 0) {
        } else {
            int i4 = this.f68283g;
            if (i4 < 3) {
                if (i4 != 0) {
                    i += m29051d(source, i, i3);
                    if (this.f68283g != 0) {
                        return;
                    }
                }
                while (i + 3 <= i3) {
                    int min = Math.min((this.f68278b.isMimeScheme$kotlin_stdlib() ? this.f68280d : this.f68281e.length) / 4, (i3 - i) / 3);
                    int i5 = (min * 3) + i;
                    if (m29049i(source, i, i5) != min * 4) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    i = i5;
                }
                ArraysKt___ArraysJvmKt.copyInto(source, this.f68282f, 0, i, i3);
                this.f68283g = i3 - i;
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}