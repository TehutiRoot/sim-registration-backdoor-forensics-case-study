package kotlin.p023io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.io.encoding.a */
/* loaded from: classes5.dex */
public final class C11709a extends OutputStream {

    /* renamed from: a */
    public final OutputStream f68243a;

    /* renamed from: b */
    public final Base64 f68244b;

    /* renamed from: c */
    public boolean f68245c;

    /* renamed from: d */
    public int f68246d;

    /* renamed from: e */
    public final byte[] f68247e;

    /* renamed from: f */
    public final byte[] f68248f;

    /* renamed from: g */
    public int f68249g;

    public C11709a(OutputStream output, Base64 base64) {
        int i;
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.f68243a = output;
        this.f68244b = base64;
        if (base64.isMimeScheme$kotlin_stdlib()) {
            i = 76;
        } else {
            i = -1;
        }
        this.f68246d = i;
        this.f68247e = new byte[1024];
        this.f68248f = new byte[3];
    }

    /* renamed from: b */
    public final void m28760b() {
        if (!this.f68245c) {
            return;
        }
        throw new IOException("The output stream is closed.");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f68245c) {
            this.f68245c = true;
            if (this.f68249g != 0) {
                m28758g();
            }
            this.f68243a.close();
        }
    }

    /* renamed from: d */
    public final int m28759d(byte[] bArr, int i, int i2) {
        int min = Math.min(3 - this.f68249g, i2 - i);
        ArraysKt___ArraysJvmKt.copyInto(bArr, this.f68248f, this.f68249g, i, i + min);
        int i3 = this.f68249g + min;
        this.f68249g = i3;
        if (i3 == 3) {
            m28758g();
        }
        return min;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        m28760b();
        this.f68243a.flush();
    }

    /* renamed from: g */
    public final void m28758g() {
        if (m28757i(this.f68248f, 0, this.f68249g) == 4) {
            this.f68249g = 0;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: i */
    public final int m28757i(byte[] bArr, int i, int i2) {
        int encodeIntoByteArray = this.f68244b.encodeIntoByteArray(bArr, this.f68247e, 0, i, i2);
        if (this.f68246d == 0) {
            this.f68243a.write(Base64.Default.getMimeLineSeparatorSymbols$kotlin_stdlib());
            this.f68246d = 76;
            if (encodeIntoByteArray > 76) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        this.f68243a.write(this.f68247e, 0, encodeIntoByteArray);
        this.f68246d -= encodeIntoByteArray;
        return encodeIntoByteArray;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        m28760b();
        byte[] bArr = this.f68248f;
        int i2 = this.f68249g;
        int i3 = i2 + 1;
        this.f68249g = i3;
        bArr[i2] = (byte) i;
        if (i3 == 3) {
            m28758g();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] source, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(source, "source");
        m28760b();
        if (i < 0 || i2 < 0 || (i3 = i + i2) > source.length) {
            throw new IndexOutOfBoundsException("offset: " + i + ", length: " + i2 + ", source size: " + source.length);
        } else if (i2 == 0) {
        } else {
            int i4 = this.f68249g;
            if (i4 < 3) {
                if (i4 != 0) {
                    i += m28759d(source, i, i3);
                    if (this.f68249g != 0) {
                        return;
                    }
                }
                while (i + 3 <= i3) {
                    int min = Math.min((this.f68244b.isMimeScheme$kotlin_stdlib() ? this.f68246d : this.f68247e.length) / 4, (i3 - i) / 3);
                    int i5 = (min * 3) + i;
                    if (m28757i(source, i, i5) != min * 4) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    i = i5;
                }
                ArraysKt___ArraysJvmKt.copyInto(source, this.f68248f, 0, i, i3);
                this.f68249g = i3 - i;
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
