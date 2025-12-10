package p000;

import java.io.IOException;
import java.io.InputStream;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p023io.encoding.Base64;
import kotlin.p023io.encoding.Base64Kt;

/* renamed from: fE */
/* loaded from: classes5.dex */
public final class C10211fE extends InputStream {

    /* renamed from: a */
    public final InputStream f61748a;

    /* renamed from: b */
    public final Base64 f61749b;

    /* renamed from: c */
    public boolean f61750c;

    /* renamed from: d */
    public boolean f61751d;

    /* renamed from: e */
    public final byte[] f61752e;

    /* renamed from: f */
    public final byte[] f61753f;

    /* renamed from: g */
    public final byte[] f61754g;

    /* renamed from: h */
    public int f61755h;

    /* renamed from: i */
    public int f61756i;

    public C10211fE(InputStream input, Base64 base64) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.f61748a = input;
        this.f61749b = base64;
        this.f61752e = new byte[1];
        this.f61753f = new byte[1024];
        this.f61754g = new byte[1024];
    }

    /* renamed from: b */
    public final void m31342b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f61754g;
        int i3 = this.f61755h;
        ArraysKt___ArraysJvmKt.copyInto(bArr2, bArr, i, i3, i3 + i2);
        this.f61755h += i2;
        m31337k();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f61750c) {
            this.f61750c = true;
            this.f61748a.close();
        }
    }

    /* renamed from: d */
    public final int m31341d(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.f61756i;
        this.f61756i = i4 + this.f61749b.decodeIntoByteArray(this.f61753f, this.f61754g, i4, 0, i3);
        int min = Math.min(m31340g(), i2 - i);
        m31342b(bArr, i, min);
        m31336l();
        return min;
    }

    /* renamed from: g */
    public final int m31340g() {
        return this.f61756i - this.f61755h;
    }

    /* renamed from: i */
    public final int m31339i(int i) {
        this.f61753f[i] = Base64.padSymbol;
        if ((i & 3) == 2) {
            int m31338j = m31338j();
            if (m31338j >= 0) {
                this.f61753f[i + 1] = (byte) m31338j;
            }
            return i + 2;
        }
        return i + 1;
    }

    /* renamed from: j */
    public final int m31338j() {
        int read;
        if (!this.f61749b.isMimeScheme$kotlin_stdlib()) {
            return this.f61748a.read();
        }
        do {
            read = this.f61748a.read();
            if (read == -1) {
                break;
            }
        } while (!Base64Kt.isInMimeAlphabet(read));
        return read;
    }

    /* renamed from: k */
    public final void m31337k() {
        if (this.f61755h == this.f61756i) {
            this.f61755h = 0;
            this.f61756i = 0;
        }
    }

    /* renamed from: l */
    public final void m31336l() {
        byte[] bArr = this.f61754g;
        int length = bArr.length;
        int i = this.f61756i;
        if ((this.f61753f.length / 4) * 3 > length - i) {
            ArraysKt___ArraysJvmKt.copyInto(bArr, bArr, 0, this.f61755h, i);
            this.f61756i -= this.f61755h;
            this.f61755h = 0;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        int i = this.f61755h;
        if (i < this.f61756i) {
            int i2 = this.f61754g[i] & 255;
            this.f61755h = i + 1;
            m31337k();
            return i2;
        }
        int read = read(this.f61752e, 0, 1);
        if (read != -1) {
            if (read == 1) {
                return this.f61752e[0] & 255;
            }
            throw new IllegalStateException("Unreachable".toString());
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] destination, int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) <= destination.length) {
            if (!this.f61750c) {
                if (this.f61751d) {
                    return -1;
                }
                if (i2 == 0) {
                    return 0;
                }
                if (m31340g() >= i2) {
                    m31342b(destination, i, i2);
                    return i2;
                }
                int m31340g = (((i2 - m31340g()) + 2) / 3) * 4;
                int i4 = i;
                while (true) {
                    z = this.f61751d;
                    if (z || m31340g <= 0) {
                        break;
                    }
                    int min = Math.min(this.f61753f.length, m31340g);
                    int i5 = 0;
                    while (true) {
                        z2 = this.f61751d;
                        if (z2 || i5 >= min) {
                            break;
                        }
                        int m31338j = m31338j();
                        if (m31338j == -1) {
                            this.f61751d = true;
                        } else if (m31338j != 61) {
                            this.f61753f[i5] = (byte) m31338j;
                            i5++;
                        } else {
                            i5 = m31339i(i5);
                            this.f61751d = true;
                        }
                    }
                    if (!z2 && i5 != min) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    m31340g -= i5;
                    i4 += m31341d(destination, i4, i3, i5);
                }
                if (i4 == i && z) {
                    return -1;
                }
                return i4 - i;
            }
            throw new IOException("The input stream is closed.");
        }
        throw new IndexOutOfBoundsException("offset: " + i + ", length: " + i2 + ", buffer size: " + destination.length);
    }
}
