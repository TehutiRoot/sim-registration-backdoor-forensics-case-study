package p000;

import com.google.android.material.internal.ViewUtils;
import p000.C11498j7;

/* renamed from: rm */
/* loaded from: classes3.dex */
public abstract class AbstractC13293rm {

    /* renamed from: a */
    public static byte[] f77616a = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4};

    /* renamed from: b */
    public static int[] f77617b = {372, 372, 558, 744, 1116, 1488, 1860, -1, -1, 512, ViewUtils.EDGE_TO_EDGE_FLAGS, 1024, 1536, 2048, -1, -1};

    /* renamed from: c */
    public static int[] f77618c = {-1, 1, 2, 4, 8, 16, -1, -1, 512, ViewUtils.EDGE_TO_EDGE_FLAGS, 1024, 1536, 2048, -1, -1};

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
        r2 = r10.f67223f[0][3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
        if (r2.f67229b == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
        r10.f67221d = r2.f67228a & 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
        r10.f67221d = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
        if (r2 <= r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
        r5 = r10.f67223f[r2][0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
        if (r5.f67229b == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
        r10.f67227j = r5.f67228a & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
        if (r2 <= r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
        r10.f67227j = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
        r3 = r3 + 1;
        java.lang.System.arraycopy(r0, r3, r10.f67225h, 0, r10.f67226i);
        r3 = r3 + r10.f67226i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
        if (r3 >= r9) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e0, code lost:
        r8 = new byte[r9 - r3];
        r10.f67224g = r8;
        java.lang.System.arraycopy(r0, r3, r8, 0, r8.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e9, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ea, code lost:
        r10.f67224g = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ee, code lost:
        r2 = r2 + 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m23442a(byte[] r8, int r9, p000.C11498j7 r10) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC13293rm.m23442a(byte[], int, j7):int");
    }

    /* renamed from: b */
    public static byte m23441b(byte b, byte b2) {
        int[] iArr = f77618c;
        int[] iArr2 = f77617b;
        if (iArr[b & 15] / iArr2[(b >> 4) & 15] <= iArr[b2 & 15] / iArr2[(b2 >> 4) & 15]) {
            return b;
        }
        return b2;
    }

    /* renamed from: c */
    public static int m23440c(C11498j7 c11498j7) {
        return c11498j7.f67227j;
    }

    /* renamed from: d */
    public static byte[] m23439d(C11498j7 c11498j7) {
        if (1 == m23438e(c11498j7)) {
            byte[] bArr = {17, 16, 0, 77, 0, 32};
            C11498j7.C11499a c11499a = c11498j7.f67223f[0][0];
            if (c11499a.f67229b) {
                bArr[0] = m23441b((byte) 17, c11499a.f67228a);
            }
            C11498j7.C11499a[][] c11499aArr = c11498j7.f67223f;
            C11498j7.C11499a[] c11499aArr2 = c11499aArr[2];
            C11498j7.C11499a c11499a2 = c11499aArr2[0];
            if (c11499a2.f67229b) {
                bArr[5] = c11499a2.f67228a;
            }
            C11498j7.C11499a c11499a3 = c11499aArr2[1];
            if (c11499a3.f67229b) {
                bArr[3] = c11499a3.f67228a;
            }
            C11498j7.C11499a c11499a4 = c11499aArr[0][2];
            if (c11499a4.f67229b) {
                bArr[2] = c11499a4.f67228a;
            }
            if (bArr[0] > -106) {
                bArr[0] = -106;
            }
            return bArr;
        } else if (m23438e(c11498j7) == 0) {
            byte[] bArr2 = {17, 0, 0, 10};
            C11498j7.C11499a c11499a5 = c11498j7.f67223f[0][0];
            if (c11499a5.f67229b) {
                bArr2[0] = m23441b((byte) 17, c11499a5.f67228a);
            }
            return bArr2;
        } else {
            return null;
        }
    }

    /* renamed from: e */
    public static int m23438e(C11498j7 c11498j7) {
        return c11498j7.f67221d;
    }
}