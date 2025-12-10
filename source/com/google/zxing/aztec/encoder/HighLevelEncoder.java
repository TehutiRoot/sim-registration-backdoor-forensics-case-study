package com.google.zxing.aztec.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import okhttp3.internal.p026ws.WebSocketProtocol;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public final class HighLevelEncoder {

    /* renamed from: b */
    public static final String[] f57627b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c */
    public static final int[][] f57628c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d */
    public static final int[][] f57629d;

    /* renamed from: e */
    public static final int[][] f57630e;

    /* renamed from: a */
    public final byte[] f57631a;

    /* renamed from: com.google.zxing.aztec.encoder.HighLevelEncoder$a */
    /* loaded from: classes5.dex */
    public class C9012a implements Comparator {
        public C9012a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(QL1 ql1, QL1 ql12) {
            return ql1.m66614d() - ql12.m66614d();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, 5, 256);
        f57629d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f57629d[0][i] = i - 63;
        }
        f57629d[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f57629d[1][i2] = i2 - 95;
        }
        f57629d[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f57629d[2][i3] = i3 - 46;
        }
        int[] iArr2 = f57629d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, WebSocketProtocol.PAYLOAD_SHORT, 127};
        int i4 = 0;
        for (int i5 = 28; i4 < i5; i5 = 28) {
            f57629d[3][iArr3[i4]] = i4;
            i4++;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, CameraActivity.REQUEST_CODE, 125};
        for (int i6 = 0; i6 < 31; i6++) {
            int i7 = iArr4[i6];
            if (i7 > 0) {
                f57629d[4][i7] = i6;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(Integer.TYPE, 6, 6);
        f57630e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f57630e;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public HighLevelEncoder(byte[] bArr) {
        this.f57631a = bArr;
    }

    /* renamed from: a */
    public static Collection m34212a(Iterable iterable) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            QL1 ql1 = (QL1) it.next();
            Iterator it2 = linkedList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    QL1 ql12 = (QL1) it2.next();
                    if (ql12.m66612f(ql1)) {
                        break;
                    } else if (ql1.m66612f(ql12)) {
                        it2.remove();
                    }
                } else {
                    linkedList.add(ql1);
                    break;
                }
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    public static void m34210c(QL1 ql1, int i, int i2, Collection collection) {
        QL1 m66616b = ql1.m66616b(i);
        collection.add(m66616b.m66611g(4, i2));
        if (ql1.m66613e() != 4) {
            collection.add(m66616b.m66610h(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(m66616b.m66611g(2, 16 - i2).m66611g(2, 1));
        }
        if (ql1.m66615c() > 0) {
            collection.add(ql1.m66617a(i).m66617a(i + 1));
        }
    }

    /* renamed from: e */
    public static Collection m34208e(Iterable iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m34210c((QL1) it.next(), i, i2, linkedList);
        }
        return m34212a(linkedList);
    }

    /* renamed from: b */
    public final void m34211b(QL1 ql1, int i, Collection collection) {
        boolean z;
        char c = (char) (this.f57631a[i] & 255);
        if (f57629d[ql1.m66613e()][c] > 0) {
            z = true;
        } else {
            z = false;
        }
        QL1 ql12 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f57629d[i2][c];
            if (i3 > 0) {
                if (ql12 == null) {
                    ql12 = ql1.m66616b(i);
                }
                if (!z || i2 == ql1.m66613e() || i2 == 2) {
                    collection.add(ql12.m66611g(i2, i3));
                }
                if (!z && f57630e[ql1.m66613e()][i2] >= 0) {
                    collection.add(ql12.m66610h(i2, i3));
                }
            }
        }
        if (ql1.m66615c() > 0 || f57629d[ql1.m66613e()][c] == 0) {
            collection.add(ql1.m66617a(i));
        }
    }

    /* renamed from: d */
    public final Collection m34209d(Iterable iterable, int i) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m34211b((QL1) it.next(), i, linkedList);
        }
        return m34212a(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.zxing.common.BitArray encode() {
        /*
            r8 = this;
            QL1 r0 = p000.QL1.f5037e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = 0
        L8:
            byte[] r3 = r8.f57631a
            int r4 = r3.length
            if (r2 >= r4) goto L4c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L15
            r5 = r3[r4]
            goto L16
        L15:
            r5 = 0
        L16:
            r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L38
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L34
            r6 = 46
            if (r3 == r6) goto L30
            r6 = 58
            if (r3 == r6) goto L2c
        L2a:
            r3 = 0
            goto L3d
        L2c:
            if (r5 != r7) goto L2a
            r3 = 5
            goto L3d
        L30:
            if (r5 != r7) goto L2a
            r3 = 3
            goto L3d
        L34:
            if (r5 != r7) goto L2a
            r3 = 4
            goto L3d
        L38:
            r3 = 10
            if (r5 != r3) goto L2a
            r3 = 2
        L3d:
            if (r3 <= 0) goto L45
            java.util.Collection r0 = m34208e(r0, r2, r3)
            r2 = r4
            goto L49
        L45:
            java.util.Collection r0 = r8.m34209d(r0, r2)
        L49:
            int r2 = r2 + 1
            goto L8
        L4c:
            com.google.zxing.aztec.encoder.HighLevelEncoder$a r1 = new com.google.zxing.aztec.encoder.HighLevelEncoder$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            QL1 r0 = (p000.QL1) r0
            byte[] r1 = r8.f57631a
            com.google.zxing.common.BitArray r0 = r0.m66609i(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.aztec.encoder.HighLevelEncoder.encode():com.google.zxing.common.BitArray");
    }
}
