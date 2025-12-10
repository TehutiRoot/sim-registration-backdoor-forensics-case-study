package p000;

import java.io.IOException;
import java.io.InputStream;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p023io.encoding.Base64;
import kotlin.p023io.encoding.Base64Kt;

/* renamed from: gE */
/* loaded from: classes5.dex */
public final class C10277gE extends InputStream {

    /* renamed from: a */
    public final InputStream f62103a;

    /* renamed from: b */
    public final Base64 f62104b;

    /* renamed from: c */
    public boolean f62105c;

    /* renamed from: d */
    public boolean f62106d;

    /* renamed from: e */
    public final byte[] f62107e;

    /* renamed from: f */
    public final byte[] f62108f;

    /* renamed from: g */
    public final byte[] f62109g;

    /* renamed from: h */
    public int f62110h;

    /* renamed from: i */
    public int f62111i;

    public C10277gE(InputStream input, Base64 base64) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.f62103a = input;
        this.f62104b = base64;
        this.f62107e = new byte[1];
        this.f62108f = new byte[1024];
        this.f62109g = new byte[1024];
    }

    /* renamed from: b */
    public final void m31429b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f62109g;
        int i3 = this.f62110h;
        ArraysKt___ArraysJvmKt.copyInto(bArr2, bArr, i, i3, i3 + i2);
        this.f62110h += i2;
        m31424k();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f62105c) {
            this.f62105c = true;
            this.f62103a.close();
        }
    }

    /* renamed from: d */
    public final int m31428d(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.f62111i;
        this.f62111i = i4 + this.f62104b.decodeIntoByteArray(this.f62108f, this.f62109g, i4, 0, i3);
        int min = Math.min(m31427g(), i2 - i);
        m31429b(bArr, i, min);
        m31423l();
        return min;
    }

    /* renamed from: g */
    public final int m31427g() {
        return this.f62111i - this.f62110h;
    }

    /* renamed from: i */
    public final int m31426i(int i) {
        this.f62108f[i] = Base64.padSymbol;
        if ((i & 3) == 2) {
            int m31425j = m31425j();
            if (m31425j >= 0) {
                this.f62108f[i + 1] = (byte) m31425j;
            }
            return i + 2;
        }
        return i + 1;
    }

    /* renamed from: j */
    public final int m31425j() {
        int read;
        if (!this.f62104b.isMimeScheme$kotlin_stdlib()) {
            return this.f62103a.read();
        }
        do {
            read = this.f62103a.read();
            if (read == -1) {
                break;
            }
        } while (!Base64Kt.isInMimeAlphabet(read));
        return read;
    }

    /* renamed from: k */
    public final void m31424k() {
        if (this.f62110h == this.f62111i) {
            this.f62110h = 0;
            this.f62111i = 0;
        }
    }

    /* renamed from: l */
    public final void m31423l() {
        byte[] bArr = this.f62109g;
        int length = bArr.length;
        int i = this.f62111i;
        if ((this.f62108f.length / 4) * 3 > length - i) {
            ArraysKt___ArraysJvmKt.copyInto(bArr, bArr, 0, this.f62110h, i);
            this.f62111i -= this.f62110h;
            this.f62110h = 0;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        int i = this.f62110h;
        if (i < this.f62111i) {
            int i2 = this.f62109g[i] & 255;
            this.f62110h = i + 1;
            m31424k();
            return i2;
        }
        int read = read(this.f62107e, 0, 1);
        if (read != -1) {
            if (read == 1) {
                return this.f62107e[0] & 255;
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
            if (!this.f62105c) {
                if (this.f62106d) {
                    return -1;
                }
                if (i2 == 0) {
                    return 0;
                }
                if (m31427g() >= i2) {
                    m31429b(destination, i, i2);
                    return i2;
                }
                int m31427g = (((i2 - m31427g()) + 2) / 3) * 4;
                int i4 = i;
                while (true) {
                    z = this.f62106d;
                    if (z || m31427g <= 0) {
                        break;
                    }
                    int min = Math.min(this.f62108f.length, m31427g);
                    int i5 = 0;
                    while (true) {
                        z2 = this.f62106d;
                        if (z2 || i5 >= min) {
                            break;
                        }
                        int m31425j = m31425j();
                        if (m31425j == -1) {
                            this.f62106d = true;
                        } else if (m31425j != 61) {
                            this.f62108f[i5] = (byte) m31425j;
                            i5++;
                        } else {
                            i5 = m31426i(i5);
                            this.f62106d = true;
                        }
                    }
                    if (!z2 && i5 != min) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    m31427g -= i5;
                    i4 += m31428d(destination, i4, i3, i5);
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