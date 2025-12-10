package p000;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: rr1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C22001rr1 {

    /* renamed from: a */
    public final int[] f77428a = new int[256];

    /* renamed from: b */
    public int f77429b;

    /* renamed from: c */
    public int f77430c;

    /* renamed from: a */
    public static int m23260a(byte b) {
        if (b < 0) {
            return b + 256;
        }
        return b;
    }

    /* renamed from: c */
    public static void m23258c(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    /* renamed from: b */
    public void m23259b(byte[] bArr) {
        this.f77429b = 0;
        this.f77430c = 0;
        if (bArr.length >= 1 && bArr.length <= 32) {
            int i = 0;
            while (true) {
                int[] iArr = this.f77428a;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = i;
                i++;
            }
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f77428a.length; i4++) {
                int m23260a = m23260a(bArr[i2]);
                int[] iArr2 = this.f77428a;
                i3 = ((m23260a + iArr2[i4]) + i3) % 256;
                m23258c(iArr2, i4, i3);
                i2 = (i2 + 1) % bArr.length;
            }
            return;
        }
        throw new IllegalArgumentException("number of bytes must be between 1 and 32");
    }

    /* renamed from: d */
    public void m23257d(byte b, OutputStream outputStream) {
        int i = (this.f77429b + 1) % 256;
        this.f77429b = i;
        int[] iArr = this.f77428a;
        int i2 = (iArr[i] + this.f77430c) % 256;
        this.f77430c = i2;
        m23258c(iArr, i, i2);
        int[] iArr2 = this.f77428a;
        outputStream.write(b ^ ((byte) iArr2[(iArr2[this.f77429b] + iArr2[this.f77430c]) % 256]));
    }

    /* renamed from: e */
    public void m23256e(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                m23255f(bArr, 0, read, outputStream);
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public void m23255f(byte[] bArr, int i, int i2, OutputStream outputStream) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m23257d(bArr[i3], outputStream);
        }
    }

    /* renamed from: g */
    public void m23254g(byte[] bArr, OutputStream outputStream) {
        for (byte b : bArr) {
            m23257d(b, outputStream);
        }
    }
}
