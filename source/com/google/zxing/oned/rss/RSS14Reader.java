package com.google.zxing.oned.rss;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.p026ws.WebSocketProtocol;

/* loaded from: classes5.dex */
public final class RSS14Reader extends AbstractRSSReader {

    /* renamed from: i */
    public static final int[] f57904i = {1, 10, 34, 70, WebSocketProtocol.PAYLOAD_SHORT};

    /* renamed from: j */
    public static final int[] f57905j = {4, 20, 48, 81};

    /* renamed from: k */
    public static final int[] f57906k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    public static final int[] f57907l = {0, 336, 1036, 1516};

    /* renamed from: m */
    public static final int[] f57908m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    public static final int[] f57909n = {2, 4, 6, 8};

    /* renamed from: o */
    public static final int[][] f57910o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    public final List f57911g = new ArrayList();

    /* renamed from: h */
    public final List f57912h = new ArrayList();

    /* renamed from: b */
    public static void m34026b(Collection collection, C17539Eh1 c17539Eh1) {
        if (c17539Eh1 == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C17539Eh1 c17539Eh12 = (C17539Eh1) it.next();
            if (c17539Eh12.getValue() == c17539Eh1.getValue()) {
                c17539Eh12.m68471c();
                return;
            }
        }
        collection.add(c17539Eh1);
    }

    /* renamed from: d */
    public static boolean m34024d(C17539Eh1 c17539Eh1, C17539Eh1 c17539Eh12) {
        int checksumPortion = (c17539Eh1.getChecksumPortion() + (c17539Eh12.getChecksumPortion() * 16)) % 79;
        int value = (c17539Eh1.m68472b().getValue() * 9) + c17539Eh12.m68472b().getValue();
        if (value > 72) {
            value--;
        }
        if (value > 8) {
            value--;
        }
        if (checksumPortion == value) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static Result m34023e(C17539Eh1 c17539Eh1, C17539Eh1 c17539Eh12) {
        String valueOf = String.valueOf((c17539Eh1.getValue() * 4537077) + c17539Eh12.getValue());
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        ResultPoint[] resultPoints = c17539Eh1.m68472b().getResultPoints();
        ResultPoint[] resultPoints2 = c17539Eh12.m68472b().getResultPoints();
        return new Result(String.valueOf(sb.toString()), null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r1 < 4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
        if (r1 < 4) goto L68;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m34025c(boolean r10, int r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.RSS14Reader.m34025c(boolean, int):void");
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        m34026b(this.f57911g, m34021g(bitArray, false, i, map));
        bitArray.reverse();
        m34026b(this.f57912h, m34021g(bitArray, true, i, map));
        bitArray.reverse();
        for (C17539Eh1 c17539Eh1 : this.f57911g) {
            if (c17539Eh1.m68473a() > 1) {
                for (C17539Eh1 c17539Eh12 : this.f57912h) {
                    if (c17539Eh12.m68473a() > 1 && m34024d(c17539Eh1, c17539Eh12)) {
                        return m34023e(c17539Eh1, c17539Eh12);
                    }
                }
                continue;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: f */
    public final DataCharacter m34022f(BitArray bitArray, FinderPattern finderPattern, boolean z) {
        int i;
        int[] dataCharacterCounters = getDataCharacterCounters();
        dataCharacterCounters[0] = 0;
        dataCharacterCounters[1] = 0;
        dataCharacterCounters[2] = 0;
        dataCharacterCounters[3] = 0;
        dataCharacterCounters[4] = 0;
        dataCharacterCounters[5] = 0;
        dataCharacterCounters[6] = 0;
        dataCharacterCounters[7] = 0;
        if (z) {
            OneDReader.recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            OneDReader.recordPattern(bitArray, finderPattern.getStartEnd()[1] + 1, dataCharacterCounters);
            int i2 = 0;
            for (int length = dataCharacterCounters.length - 1; i2 < length; length--) {
                int i3 = dataCharacterCounters[i2];
                dataCharacterCounters[i2] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i3;
                i2++;
            }
        }
        if (z) {
            i = 16;
        } else {
            i = 15;
        }
        float sum = MathUtils.sum(dataCharacterCounters) / i;
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i4 = 0; i4 < dataCharacterCounters.length; i4++) {
            float f = dataCharacterCounters[i4] / sum;
            int i5 = (int) (0.5f + f);
            if (i5 <= 0) {
                i5 = 1;
            } else if (i5 > 8) {
                i5 = 8;
            }
            int i6 = i4 / 2;
            if ((i4 & 1) == 0) {
                oddCounts[i6] = i5;
                oddRoundingErrors[i6] = f - i5;
            } else {
                evenCounts[i6] = i5;
                evenRoundingErrors[i6] = f - i5;
            }
        }
        m34025c(z, i);
        int i7 = 0;
        int i8 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            int i9 = oddCounts[length2];
            i7 = (i7 * 9) + i9;
            i8 += i9;
        }
        int i10 = 0;
        int i11 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            int i12 = evenCounts[length3];
            i10 = (i10 * 9) + i12;
            i11 += i12;
        }
        int i13 = i7 + (i10 * 3);
        if (z) {
            if ((i8 & 1) == 0 && i8 <= 12 && i8 >= 4) {
                int i14 = (12 - i8) / 2;
                int i15 = f57908m[i14];
                int i16 = 9 - i15;
                return new DataCharacter((RSSUtils.getRSSvalue(oddCounts, i15, false) * f57904i[i14]) + RSSUtils.getRSSvalue(evenCounts, i16, true) + f57906k[i14], i13);
            }
            throw NotFoundException.getNotFoundInstance();
        } else if ((i11 & 1) == 0 && i11 <= 10 && i11 >= 4) {
            int i17 = (10 - i11) / 2;
            int i18 = f57909n[i17];
            return new DataCharacter((RSSUtils.getRSSvalue(evenCounts, 9 - i18, false) * f57905j[i17]) + RSSUtils.getRSSvalue(oddCounts, i18, true) + f57907l[i17], i13);
        } else {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    /* renamed from: g */
    public final C17539Eh1 m34021g(BitArray bitArray, boolean z, int i, Map map) {
        int[] m34020h;
        ResultPointCallback resultPointCallback;
        try {
            FinderPattern m34019i = m34019i(bitArray, i, z, m34020h(bitArray, 0, z));
            if (map == null) {
                resultPointCallback = null;
            } else {
                resultPointCallback = (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            }
            if (resultPointCallback != null) {
                float f = (m34020h[0] + m34020h[1]) / 2.0f;
                if (z) {
                    f = (bitArray.getSize() - 1) - f;
                }
                resultPointCallback.foundPossibleResultPoint(new ResultPoint(f, i));
            }
            DataCharacter m34022f = m34022f(bitArray, m34019i, true);
            DataCharacter m34022f2 = m34022f(bitArray, m34019i, false);
            return new C17539Eh1((m34022f.getValue() * 1597) + m34022f2.getValue(), m34022f.getChecksumPortion() + (m34022f2.getChecksumPortion() * 4), m34019i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public final int[] m34020h(BitArray bitArray, int i, boolean z) {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        boolean z2 = false;
        while (i < size) {
            z2 = !bitArray.get(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = i;
        int i3 = 0;
        while (i < size) {
            if (bitArray.get(i) ^ z2) {
                decodeFinderCounters[i3] = decodeFinderCounters[i3] + 1;
            } else {
                if (i3 == 3) {
                    if (AbstractRSSReader.isFinderPattern(decodeFinderCounters)) {
                        return new int[]{i2, i};
                    }
                    i2 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i3--;
                } else {
                    i3++;
                }
                decodeFinderCounters[i3] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: i */
    public final FinderPattern m34019i(BitArray bitArray, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        boolean z2 = bitArray.get(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && (bitArray.get(i4) ^ z2)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = iArr[0] - i5;
        int parseFinderValue = AbstractRSSReader.parseFinderValue(decodeFinderCounters, f57910o);
        int i6 = iArr[1];
        if (z) {
            i2 = (bitArray.getSize() - 1) - i6;
            i3 = (bitArray.getSize() - 1) - i5;
        } else {
            i2 = i6;
            i3 = i5;
        }
        return new FinderPattern(parseFinderValue, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.f57911g.clear();
        this.f57912h.clear();
    }
}
