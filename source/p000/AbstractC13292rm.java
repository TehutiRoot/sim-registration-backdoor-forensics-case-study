package p000;

import com.google.android.material.internal.ViewUtils;
import p000.C11511j7;

/* renamed from: rm */
/* loaded from: classes3.dex */
public abstract class AbstractC13292rm {

    /* renamed from: a */
    public static byte[] f77399a = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4};

    /* renamed from: b */
    public static int[] f77400b = {372, 372, 558, 744, 1116, 1488, 1860, -1, -1, 512, ViewUtils.EDGE_TO_EDGE_FLAGS, 1024, 1536, 2048, -1, -1};

    /* renamed from: c */
    public static int[] f77401c = {-1, 1, 2, 4, 8, 16, -1, -1, 512, ViewUtils.EDGE_TO_EDGE_FLAGS, 1024, 1536, 2048, -1, -1};

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
        r2 = r10.f67167f[0][3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
        if (r2.f67173b == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
        r10.f67165d = r2.f67172a & 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
        r10.f67165d = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
        if (r2 <= r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
        r5 = r10.f67167f[r2][0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
        if (r5.f67173b == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
        r10.f67171j = r5.f67172a & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
        if (r2 <= r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
        r10.f67171j = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
        r3 = r3 + 1;
        java.lang.System.arraycopy(r0, r3, r10.f67169h, 0, r10.f67170i);
        r3 = r3 + r10.f67170i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
        if (r3 >= r9) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e0, code lost:
        r8 = new byte[r9 - r3];
        r10.f67168g = r8;
        java.lang.System.arraycopy(r0, r3, r8, 0, r8.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e9, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ea, code lost:
        r10.f67168g = null;
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
    public static int m23275a(byte[] r8, int r9, p000.C11511j7 r10) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC13292rm.m23275a(byte[], int, j7):int");
    }

    /* renamed from: b */
    public static byte m23274b(byte b, byte b2) {
        int[] iArr = f77401c;
        int[] iArr2 = f77400b;
        if (iArr[b & 15] / iArr2[(b >> 4) & 15] <= iArr[b2 & 15] / iArr2[(b2 >> 4) & 15]) {
            return b;
        }
        return b2;
    }

    /* renamed from: c */
    public static int m23273c(C11511j7 c11511j7) {
        return c11511j7.f67171j;
    }

    /* renamed from: d */
    public static byte[] m23272d(C11511j7 c11511j7) {
        if (1 == m23271e(c11511j7)) {
            byte[] bArr = {17, 16, 0, 77, 0, 32};
            C11511j7.C11512a c11512a = c11511j7.f67167f[0][0];
            if (c11512a.f67173b) {
                bArr[0] = m23274b((byte) 17, c11512a.f67172a);
            }
            C11511j7.C11512a[][] c11512aArr = c11511j7.f67167f;
            C11511j7.C11512a[] c11512aArr2 = c11512aArr[2];
            C11511j7.C11512a c11512a2 = c11512aArr2[0];
            if (c11512a2.f67173b) {
                bArr[5] = c11512a2.f67172a;
            }
            C11511j7.C11512a c11512a3 = c11512aArr2[1];
            if (c11512a3.f67173b) {
                bArr[3] = c11512a3.f67172a;
            }
            C11511j7.C11512a c11512a4 = c11512aArr[0][2];
            if (c11512a4.f67173b) {
                bArr[2] = c11512a4.f67172a;
            }
            if (bArr[0] > -106) {
                bArr[0] = -106;
            }
            return bArr;
        } else if (m23271e(c11511j7) == 0) {
            byte[] bArr2 = {17, 0, 0, 10};
            C11511j7.C11512a c11512a5 = c11511j7.f67167f[0][0];
            if (c11512a5.f67173b) {
                bArr2[0] = m23274b((byte) 17, c11512a5.f67172a);
            }
            return bArr2;
        } else {
            return null;
        }
    }

    /* renamed from: e */
    public static int m23271e(C11511j7 c11511j7) {
        return c11511j7.f67165d;
    }
}
