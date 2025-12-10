package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class FinderPatternFinder {
    protected static final int MAX_MODULES = 57;
    protected static final int MIN_SKIP = 3;

    /* renamed from: a */
    public final BitMatrix f57997a;

    /* renamed from: b */
    public final List f57998b;

    /* renamed from: c */
    public boolean f57999c;

    /* renamed from: d */
    public final int[] f58000d;

    /* renamed from: e */
    public final ResultPointCallback f58001e;

    /* loaded from: classes5.dex */
    public static final class CenterComparator implements Serializable, Comparator<FinderPattern> {
        private final float average;

        private CenterComparator(float f) {
            this.average = f;
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            if (finderPattern2.m33901d() == finderPattern.m33901d()) {
                float abs = Math.abs(finderPattern2.getEstimatedModuleSize() - this.average);
                float abs2 = Math.abs(finderPattern.getEstimatedModuleSize() - this.average);
                if (abs < abs2) {
                    return 1;
                }
                return abs == abs2 ? 0 : -1;
            }
            return finderPattern2.m33901d() - finderPattern.m33901d();
        }
    }

    /* loaded from: classes5.dex */
    public static final class FurthestFromAverageComparator implements Serializable, Comparator<FinderPattern> {
        private final float average;

        private FurthestFromAverageComparator(float f) {
            this.average = f;
        }

        @Override // java.util.Comparator
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            float abs = Math.abs(finderPattern2.getEstimatedModuleSize() - this.average);
            float abs2 = Math.abs(finderPattern.getEstimatedModuleSize() - this.average);
            if (abs < abs2) {
                return -1;
            }
            return abs == abs2 ? 0 : 1;
        }
    }

    public FinderPatternFinder(BitMatrix bitMatrix) {
        this(bitMatrix, null);
    }

    /* renamed from: a */
    public static float m33900a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean foundPatternCross(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - iArr[0]) >= f2 || Math.abs(f - iArr[1]) >= f2 || Math.abs((f * 3.0f) - iArr[2]) >= 3.0f * f2 || Math.abs(f - iArr[3]) >= f2 || Math.abs(f - iArr[4]) >= f2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r18 >= r6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r17 < r6) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r18 < r6) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r16.f57997a.get(r18 - r6, r17 - r6) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        r9 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r9 > r19) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        r4[1] = r9 + 1;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r17 < r6) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r18 < r6) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r4[1] <= r19) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r17 < r6) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r18 < r6) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (r16.f57997a.get(r18 - r6, r17 - r6) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
        r9 = r4[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
        if (r9 > r19) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
        r4[0] = r9 + 1;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
        if (r4[0] <= r19) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
        r6 = r16.f57997a.getHeight();
        r9 = r16.f57997a.getWidth();
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        r11 = r17 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
        if (r11 >= r6) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
        r12 = r18 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
        if (r12 >= r9) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
        if (r16.f57997a.get(r12, r11) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0090, code lost:
        r4[2] = r4[2] + 1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
        if (r11 >= r6) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
        if ((r18 + r10) < r9) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
        r11 = r17 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
        if (r11 >= r6) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
        r13 = r18 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
        if (r13 >= r9) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ae, code lost:
        if (r16.f57997a.get(r13, r11) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b0, code lost:
        r13 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
        if (r13 >= r19) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b4, code lost:
        r4[3] = r13 + 1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bb, code lost:
        if (r11 >= r6) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bf, code lost:
        if ((r18 + r10) >= r9) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c3, code lost:
        if (r4[3] < r19) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c6, code lost:
        r11 = r17 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c9, code lost:
        if (r11 >= r6) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cb, code lost:
        r14 = r18 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cd, code lost:
        if (r14 >= r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d5, code lost:
        if (r16.f57997a.get(r14, r11) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d7, code lost:
        r11 = r4[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d9, code lost:
        if (r11 >= r19) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00db, code lost:
        r4[4] = r11 + 1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e2, code lost:
        r1 = r4[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e4, code lost:
        if (r1 < r19) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e6, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fb, code lost:
        if (java.lang.Math.abs(((((r4[0] + r4[1]) + r4[2]) + r4[3]) + r1) - r20) >= (r20 * 2)) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0101, code lost:
        if (foundPatternCross(r4) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0103, code lost:
        return true;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m33899b(int r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.detector.FinderPatternFinder.m33899b(int, int, int, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (r2[3] < r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
        if (r11 >= r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
        if (r0.get(r11, r12) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
        if (r9 >= r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r12 < r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b1, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < r14) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b3, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b8, code lost:
        if (foundPatternCross(r2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00be, code lost:
        return m33900a(r2, r11);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m33898c(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            com.google.zxing.common.BitMatrix r0 = r10.f57997a
            int r1 = r0.getWidth()
            int[] r2 = r10.m33894g()
            r3 = r11
        Lb:
            r4 = 2
            r5 = 1
            if (r3 < 0) goto L1d
            boolean r6 = r0.get(r3, r12)
            if (r6 == 0) goto L1d
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r3 = r3 + (-1)
            goto Lb
        L1d:
            r6 = 2143289344(0x7fc00000, float:NaN)
            if (r3 >= 0) goto L22
            return r6
        L22:
            if (r3 < 0) goto L35
            boolean r7 = r0.get(r3, r12)
            if (r7 != 0) goto L35
            r7 = r2[r5]
            if (r7 > r13) goto L35
            int r7 = r7 + 1
            r2[r5] = r7
            int r3 = r3 + (-1)
            goto L22
        L35:
            if (r3 < 0) goto Lbf
            r7 = r2[r5]
            if (r7 <= r13) goto L3d
            goto Lbf
        L3d:
            r7 = 0
            if (r3 < 0) goto L51
            boolean r8 = r0.get(r3, r12)
            if (r8 == 0) goto L51
            r8 = r2[r7]
            if (r8 > r13) goto L51
            int r8 = r8 + 1
            r2[r7] = r8
            int r3 = r3 + (-1)
            goto L3d
        L51:
            r3 = r2[r7]
            if (r3 <= r13) goto L56
            return r6
        L56:
            int r11 = r11 + r5
        L57:
            if (r11 >= r1) goto L67
            boolean r3 = r0.get(r11, r12)
            if (r3 == 0) goto L67
            r3 = r2[r4]
            int r3 = r3 + r5
            r2[r4] = r3
            int r11 = r11 + 1
            goto L57
        L67:
            if (r11 != r1) goto L6a
            return r6
        L6a:
            r3 = 3
            if (r11 >= r1) goto L7e
            boolean r8 = r0.get(r11, r12)
            if (r8 != 0) goto L7e
            r8 = r2[r3]
            if (r8 >= r13) goto L7e
            int r8 = r8 + 1
            r2[r3] = r8
            int r11 = r11 + 1
            goto L6a
        L7e:
            if (r11 == r1) goto Lbf
            r8 = r2[r3]
            if (r8 < r13) goto L85
            goto Lbf
        L85:
            r8 = 4
            if (r11 >= r1) goto L99
            boolean r9 = r0.get(r11, r12)
            if (r9 == 0) goto L99
            r9 = r2[r8]
            if (r9 >= r13) goto L99
            int r9 = r9 + 1
            r2[r8] = r9
            int r11 = r11 + 1
            goto L85
        L99:
            r12 = r2[r8]
            if (r12 < r13) goto L9e
            return r6
        L9e:
            r13 = r2[r7]
            r0 = r2[r5]
            int r13 = r13 + r0
            r0 = r2[r4]
            int r13 = r13 + r0
            r0 = r2[r3]
            int r13 = r13 + r0
            int r13 = r13 + r12
            int r13 = r13 - r14
            int r12 = java.lang.Math.abs(r13)
            int r12 = r12 * 5
            if (r12 < r14) goto Lb4
            return r6
        Lb4:
            boolean r12 = foundPatternCross(r2)
            if (r12 == 0) goto Lbf
            float r11 = m33900a(r2, r11)
            return r11
        Lbf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.detector.FinderPatternFinder.m33898c(int, int, int, int):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (r2[3] < r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
        if (r11 >= r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
        if (r0.get(r12, r11) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
        if (r9 >= r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r12 < r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b3, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < (r14 * 2)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b5, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ba, code lost:
        if (foundPatternCross(r2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c0, code lost:
        return m33900a(r2, r11);
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m33897d(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            com.google.zxing.common.BitMatrix r0 = r10.f57997a
            int r1 = r0.getHeight()
            int[] r2 = r10.m33894g()
            r3 = r11
        Lb:
            r4 = 2
            r5 = 1
            if (r3 < 0) goto L1d
            boolean r6 = r0.get(r12, r3)
            if (r6 == 0) goto L1d
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r3 = r3 + (-1)
            goto Lb
        L1d:
            r6 = 2143289344(0x7fc00000, float:NaN)
            if (r3 >= 0) goto L22
            return r6
        L22:
            if (r3 < 0) goto L35
            boolean r7 = r0.get(r12, r3)
            if (r7 != 0) goto L35
            r7 = r2[r5]
            if (r7 > r13) goto L35
            int r7 = r7 + 1
            r2[r5] = r7
            int r3 = r3 + (-1)
            goto L22
        L35:
            if (r3 < 0) goto Lc1
            r7 = r2[r5]
            if (r7 <= r13) goto L3d
            goto Lc1
        L3d:
            r7 = 0
            if (r3 < 0) goto L51
            boolean r8 = r0.get(r12, r3)
            if (r8 == 0) goto L51
            r8 = r2[r7]
            if (r8 > r13) goto L51
            int r8 = r8 + 1
            r2[r7] = r8
            int r3 = r3 + (-1)
            goto L3d
        L51:
            r3 = r2[r7]
            if (r3 <= r13) goto L56
            return r6
        L56:
            int r11 = r11 + r5
        L57:
            if (r11 >= r1) goto L67
            boolean r3 = r0.get(r12, r11)
            if (r3 == 0) goto L67
            r3 = r2[r4]
            int r3 = r3 + r5
            r2[r4] = r3
            int r11 = r11 + 1
            goto L57
        L67:
            if (r11 != r1) goto L6a
            return r6
        L6a:
            r3 = 3
            if (r11 >= r1) goto L7e
            boolean r8 = r0.get(r12, r11)
            if (r8 != 0) goto L7e
            r8 = r2[r3]
            if (r8 >= r13) goto L7e
            int r8 = r8 + 1
            r2[r3] = r8
            int r11 = r11 + 1
            goto L6a
        L7e:
            if (r11 == r1) goto Lc1
            r8 = r2[r3]
            if (r8 < r13) goto L85
            goto Lc1
        L85:
            r8 = 4
            if (r11 >= r1) goto L99
            boolean r9 = r0.get(r12, r11)
            if (r9 == 0) goto L99
            r9 = r2[r8]
            if (r9 >= r13) goto L99
            int r9 = r9 + 1
            r2[r8] = r9
            int r11 = r11 + 1
            goto L85
        L99:
            r12 = r2[r8]
            if (r12 < r13) goto L9e
            return r6
        L9e:
            r13 = r2[r7]
            r0 = r2[r5]
            int r13 = r13 + r0
            r0 = r2[r4]
            int r13 = r13 + r0
            r0 = r2[r3]
            int r13 = r13 + r0
            int r13 = r13 + r12
            int r13 = r13 - r14
            int r12 = java.lang.Math.abs(r13)
            int r12 = r12 * 5
            int r14 = r14 * 2
            if (r12 < r14) goto Lb6
            return r6
        Lb6:
            boolean r12 = foundPatternCross(r2)
            if (r12 == 0) goto Lc1
            float r11 = m33900a(r2, r11)
            return r11
        Lc1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.detector.FinderPatternFinder.m33897d(int, int, int, int):float");
    }

    /* renamed from: e */
    public final FinderPatternInfo m33896e(Map map) {
        boolean z;
        boolean z2;
        if (map != null && map.containsKey(DecodeHintType.TRY_HARDER)) {
            z = true;
        } else {
            z = false;
        }
        if (map != null && map.containsKey(DecodeHintType.PURE_BARCODE)) {
            z2 = true;
        } else {
            z2 = false;
        }
        int height = this.f57997a.getHeight();
        int width = this.f57997a.getWidth();
        int i = ((height * 3) / 228 < 3 || z) ? 3 : 3;
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z3 = false;
        while (i2 < height && !z3) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            int i3 = 0;
            int i4 = 0;
            while (i3 < width) {
                if (this.f57997a.get(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) == 0) {
                    if (i4 == 4) {
                        if (foundPatternCross(iArr)) {
                            if (handlePossibleCenter(iArr, i2, i3, z2)) {
                                if (this.f57999c) {
                                    z3 = m33893h();
                                } else {
                                    int m33895f = m33895f();
                                    int i5 = iArr[2];
                                    if (m33895f > i5) {
                                        i2 += (m33895f - i5) - 2;
                                        i3 = width - 1;
                                    }
                                }
                                iArr[0] = 0;
                                iArr[1] = 0;
                                iArr[2] = 0;
                                iArr[3] = 0;
                                iArr[4] = 0;
                                i = 2;
                                i4 = 0;
                            } else {
                                iArr[0] = iArr[2];
                                iArr[1] = iArr[3];
                                iArr[2] = iArr[4];
                                iArr[3] = 1;
                                iArr[4] = 0;
                            }
                        } else {
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        }
                        i4 = 3;
                    } else {
                        i4++;
                        iArr[i4] = iArr[i4] + 1;
                    }
                } else {
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i2, width, z2)) {
                i = iArr[0];
                if (this.f57999c) {
                    z3 = m33893h();
                }
            }
            i2 += i;
        }
        FinderPattern[] m33892i = m33892i();
        ResultPoint.orderBestPatterns(m33892i);
        return new FinderPatternInfo(m33892i);
    }

    /* renamed from: f */
    public final int m33895f() {
        if (this.f57998b.size() <= 1) {
            return 0;
        }
        FinderPattern finderPattern = null;
        for (FinderPattern finderPattern2 : this.f57998b) {
            if (finderPattern2.m33901d() >= 2) {
                if (finderPattern == null) {
                    finderPattern = finderPattern2;
                } else {
                    this.f57999c = true;
                    return ((int) (Math.abs(finderPattern.getX() - finderPattern2.getX()) - Math.abs(finderPattern.getY() - finderPattern2.getY()))) / 2;
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    public final int[] m33894g() {
        int[] iArr = this.f58000d;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        return iArr;
    }

    public final BitMatrix getImage() {
        return this.f57997a;
    }

    public final List<FinderPattern> getPossibleCenters() {
        return this.f57998b;
    }

    /* renamed from: h */
    public final boolean m33893h() {
        int size = this.f57998b.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (FinderPattern finderPattern : this.f57998b) {
            if (finderPattern.m33901d() >= 2) {
                i++;
                f2 += finderPattern.getEstimatedModuleSize();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / size;
        for (FinderPattern finderPattern2 : this.f57998b) {
            f += Math.abs(finderPattern2.getEstimatedModuleSize() - f3);
        }
        if (f > f2 * 0.05f) {
            return false;
        }
        return true;
    }

    public final boolean handlePossibleCenter(int[] iArr, int i, int i2, boolean z) {
        int i3 = 0;
        int i4 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int m33900a = (int) m33900a(iArr, i2);
        float m33897d = m33897d(i, m33900a, iArr[2], i4);
        if (!Float.isNaN(m33897d)) {
            int i5 = (int) m33897d;
            float m33898c = m33898c(m33900a, i5, iArr[2], i4);
            if (!Float.isNaN(m33898c) && (!z || m33899b(i5, (int) m33898c, iArr[2], i4))) {
                float f = i4 / 7.0f;
                while (true) {
                    if (i3 < this.f57998b.size()) {
                        FinderPattern finderPattern = (FinderPattern) this.f57998b.get(i3);
                        if (finderPattern.m33903b(f, m33897d, m33898c)) {
                            this.f57998b.set(i3, finderPattern.m33902c(m33897d, m33898c, f));
                            break;
                        }
                        i3++;
                    } else {
                        FinderPattern finderPattern2 = new FinderPattern(m33898c, m33897d, f);
                        this.f57998b.add(finderPattern2);
                        ResultPointCallback resultPointCallback = this.f58001e;
                        if (resultPointCallback != null) {
                            resultPointCallback.foundPossibleResultPoint(finderPattern2);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final FinderPattern[] m33892i() {
        float f;
        int size = this.f57998b.size();
        if (size >= 3) {
            float f2 = 0.0f;
            if (size > 3) {
                float f3 = 0.0f;
                float f4 = 0.0f;
                for (FinderPattern finderPattern : this.f57998b) {
                    float estimatedModuleSize = finderPattern.getEstimatedModuleSize();
                    f3 += estimatedModuleSize;
                    f4 += estimatedModuleSize * estimatedModuleSize;
                }
                float f5 = f3 / size;
                float sqrt = (float) Math.sqrt((f4 / f) - (f5 * f5));
                Collections.sort(this.f57998b, new FurthestFromAverageComparator(f5));
                float max = Math.max(0.2f * f5, sqrt);
                int i = 0;
                while (i < this.f57998b.size() && this.f57998b.size() > 3) {
                    if (Math.abs(((FinderPattern) this.f57998b.get(i)).getEstimatedModuleSize() - f5) > max) {
                        this.f57998b.remove(i);
                        i--;
                    }
                    i++;
                }
            }
            if (this.f57998b.size() > 3) {
                for (FinderPattern finderPattern2 : this.f57998b) {
                    f2 += finderPattern2.getEstimatedModuleSize();
                }
                Collections.sort(this.f57998b, new CenterComparator(f2 / this.f57998b.size()));
                List list = this.f57998b;
                list.subList(3, list.size()).clear();
            }
            return new FinderPattern[]{(FinderPattern) this.f57998b.get(0), (FinderPattern) this.f57998b.get(1), (FinderPattern) this.f57998b.get(2)};
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public FinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        this.f57997a = bitMatrix;
        this.f57998b = new ArrayList();
        this.f58000d = new int[5];
        this.f58001e = resultPointCallback;
    }
}
