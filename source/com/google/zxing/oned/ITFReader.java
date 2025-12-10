package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ITFReader extends OneDReader {

    /* renamed from: b */
    public static final int[] f57870b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    public static final int[] f57871c = {1, 1, 1, 1};

    /* renamed from: d */
    public static final int[] f57872d = {1, 1, 3};

    /* renamed from: e */
    public static final int[][] f57873e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    public int f57874a = -1;

    /* renamed from: b */
    public static int m34044b(int[] iArr) {
        int length = f57873e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float patternMatchVariance = OneDReader.patternMatchVariance(iArr, f57873e[i2], 0.78f);
            if (patternMatchVariance < f) {
                i = i2;
                f = patternMatchVariance;
            }
        }
        if (i >= 0) {
            return i;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: d */
    public static void m34042d(BitArray bitArray, int i, int i2, StringBuilder sb) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            OneDReader.recordPattern(bitArray, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m34044b(iArr2) + 48));
            sb.append((char) (m34044b(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: f */
    public static int[] m34040f(BitArray bitArray, int i, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int size = bitArray.getSize();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < size) {
            if (bitArray.get(i) ^ z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                int i4 = length - 1;
                if (i3 == i4) {
                    if (OneDReader.patternMatchVariance(iArr2, iArr, 0.78f) < 0.38f) {
                        return new int[]{i2, i};
                    }
                    i2 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i3--;
                } else {
                    i3++;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: g */
    public static int m34039g(BitArray bitArray) {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        if (nextSet != size) {
            return nextSet;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: c */
    public final int[] m34043c(BitArray bitArray) {
        bitArray.reverse();
        try {
            int[] m34040f = m34040f(bitArray, m34039g(bitArray), f57872d);
            m34038h(bitArray, m34040f[0]);
            int i = m34040f[0];
            m34040f[0] = bitArray.getSize() - m34040f[1];
            m34040f[1] = bitArray.getSize() - i;
            return m34040f;
        } finally {
            bitArray.reverse();
        }
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws FormatException, NotFoundException {
        int[] iArr;
        boolean z;
        int[] m34041e = m34041e(bitArray);
        int[] m34043c = m34043c(bitArray);
        StringBuilder sb = new StringBuilder(20);
        m34042d(bitArray, m34041e[1], m34043c[0], sb);
        String sb2 = sb.toString();
        if (map != null) {
            iArr = (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS);
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = f57870b;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < length2) {
                int i4 = iArr[i2];
                if (length == i4) {
                    z = true;
                    break;
                }
                if (i4 > i3) {
                    i3 = i4;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (!z && length > i3) {
            z = true;
        }
        if (z) {
            float f = i;
            return new Result(sb2, null, new ResultPoint[]{new ResultPoint(m34041e[1], f), new ResultPoint(m34043c[0], f)}, BarcodeFormat.ITF);
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: e */
    public final int[] m34041e(BitArray bitArray) {
        int[] m34040f = m34040f(bitArray, m34039g(bitArray), f57871c);
        int i = m34040f[1];
        int i2 = m34040f[0];
        this.f57874a = (i - i2) / 4;
        m34038h(bitArray, i2);
        return m34040f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
        return;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m34038h(com.google.zxing.common.BitArray r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.f57874a
            int r0 = r0 * 10
            if (r0 >= r4) goto L7
            goto L8
        L7:
            r0 = r4
        L8:
            int r4 = r4 + (-1)
        La:
            if (r0 <= 0) goto L19
            if (r4 < 0) goto L19
            boolean r1 = r3.get(r4)
            if (r1 != 0) goto L19
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto La
        L19:
            if (r0 != 0) goto L1c
            return
        L1c:
            com.google.zxing.NotFoundException r3 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.ITFReader.m34038h(com.google.zxing.common.BitArray, int):void");
    }
}
