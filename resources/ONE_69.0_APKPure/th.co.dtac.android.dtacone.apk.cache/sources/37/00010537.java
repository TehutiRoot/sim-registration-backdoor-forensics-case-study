package p000;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: os1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C21549os1 {

    /* renamed from: a */
    public final int[] f76498a = new int[256];

    /* renamed from: b */
    public int f76499b;

    /* renamed from: c */
    public int f76500c;

    /* renamed from: a */
    public static int m23938a(byte b) {
        if (b < 0) {
            return b + 256;
        }
        return b;
    }

    /* renamed from: c */
    public static void m23936c(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    /* renamed from: b */
    public void m23937b(byte[] bArr) {
        this.f76499b = 0;
        this.f76500c = 0;
        if (bArr.length >= 1 && bArr.length <= 32) {
            int i = 0;
            while (true) {
                int[] iArr = this.f76498a;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = i;
                i++;
            }
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f76498a.length; i4++) {
                int m23938a = m23938a(bArr[i2]);
                int[] iArr2 = this.f76498a;
                i3 = ((m23938a + iArr2[i4]) + i3) % 256;
                m23936c(iArr2, i4, i3);
                i2 = (i2 + 1) % bArr.length;
            }
            return;
        }
        throw new IllegalArgumentException("number of bytes must be between 1 and 32");
    }

    /* renamed from: d */
    public void m23935d(byte b, OutputStream outputStream) {
        int i = (this.f76499b + 1) % 256;
        this.f76499b = i;
        int[] iArr = this.f76498a;
        int i2 = (iArr[i] + this.f76500c) % 256;
        this.f76500c = i2;
        m23936c(iArr, i, i2);
        int[] iArr2 = this.f76498a;
        outputStream.write(b ^ ((byte) iArr2[(iArr2[this.f76499b] + iArr2[this.f76500c]) % 256]));
    }

    /* renamed from: e */
    public void m23934e(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                m23933f(bArr, 0, read, outputStream);
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public void m23933f(byte[] bArr, int i, int i2, OutputStream outputStream) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m23935d(bArr[i3], outputStream);
        }
    }

    /* renamed from: g */
    public void m23932g(byte[] bArr, OutputStream outputStream) {
        for (byte b : bArr) {
            m23935d(b, outputStream);
        }
    }
}