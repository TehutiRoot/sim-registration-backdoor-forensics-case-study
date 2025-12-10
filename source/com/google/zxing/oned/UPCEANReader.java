package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class UPCEANReader extends OneDReader {

    /* renamed from: d */
    public static final int[] f57881d = {1, 1, 1};

    /* renamed from: e */
    public static final int[] f57882e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    public static final int[] f57883f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g */
    public static final int[][] f57884g;

    /* renamed from: h */
    public static final int[][] f57885h;

    /* renamed from: a */
    public final StringBuilder f57886a = new StringBuilder(20);

    /* renamed from: b */
    public final NW1 f57887b = new NW1();

    /* renamed from: c */
    public final C0798LL f57888c = new C0798LL();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f57884g = iArr;
        int[][] iArr2 = new int[20];
        f57885h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f57884g[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f57885h[i] = iArr4;
        }
    }

    /* renamed from: b */
    public static boolean m34033b(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt >= 0 && charAt <= 9) {
                i += charAt;
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 >= 0 && charAt2 <= 9) {
                i3 += charAt2;
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (i3 % 10 != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static int m34032c(BitArray bitArray, int[] iArr, int i, int[][] iArr2) {
        OneDReader.recordPattern(bitArray, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float patternMatchVariance = OneDReader.patternMatchVariance(iArr, iArr2[i3], 0.7f);
            if (patternMatchVariance < f) {
                i2 = i3;
                f = patternMatchVariance;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: d */
    public static int[] m34031d(BitArray bitArray, int i, boolean z, int[] iArr) {
        return m34030e(bitArray, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: e */
    public static int[] m34030e(BitArray bitArray, int i, boolean z, int[] iArr, int[] iArr2) {
        int nextSet;
        int size = bitArray.getSize();
        if (z) {
            nextSet = bitArray.getNextUnset(i);
        } else {
            nextSet = bitArray.getNextSet(i);
        }
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = nextSet;
        while (nextSet < size) {
            if (bitArray.get(nextSet) ^ z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                int i4 = length - 1;
                if (i2 == i4) {
                    if (OneDReader.patternMatchVariance(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i3, nextSet};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i2--;
                } else {
                    i2++;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: f */
    public static int[] m34029f(BitArray bitArray) {
        int[] iArr = new int[f57881d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            int[] iArr3 = f57881d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m34030e(bitArray, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = bitArray.isRange(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    public boolean checkChecksum(String str) {
        return m34033b(str);
    }

    public int[] decodeEnd(BitArray bitArray, int i) {
        return m34031d(bitArray, i, false, f57881d);
    }

    public abstract int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb) throws NotFoundException;

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return decodeRow(i, bitArray, m34029f(bitArray), map);
    }

    /* renamed from: g */
    public abstract BarcodeFormat mo34028g();

    public Result decodeRow(int i, BitArray bitArray, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int i2;
        String m67528c;
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb = this.f57886a;
        sb.setLength(0);
        int decodeMiddle = decodeMiddle(bitArray, iArr, sb);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint(decodeMiddle, i));
        }
        int[] decodeEnd = decodeEnd(bitArray, decodeMiddle);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((decodeEnd[0] + decodeEnd[1]) / 2.0f, i));
        }
        int i3 = decodeEnd[1];
        int i4 = (i3 - decodeEnd[0]) + i3;
        if (i4 < bitArray.getSize() && bitArray.isRange(i3, i4, false)) {
            String sb2 = sb.toString();
            if (sb2.length() >= 8) {
                if (checkChecksum(sb2)) {
                    BarcodeFormat mo34028g = mo34028g();
                    float f = i;
                    Result result = new Result(sb2, null, new ResultPoint[]{new ResultPoint((iArr[1] + iArr[0]) / 2.0f, f), new ResultPoint((decodeEnd[1] + decodeEnd[0]) / 2.0f, f)}, mo34028g);
                    try {
                        Result m67209a = this.f57887b.m67209a(i, bitArray, decodeEnd[1]);
                        result.putMetadata(ResultMetadataType.UPC_EAN_EXTENSION, m67209a.getText());
                        result.putAllMetadata(m67209a.getResultMetadata());
                        result.addResultPoints(m67209a.getResultPoints());
                        i2 = m67209a.getText().length();
                    } catch (ReaderException unused) {
                        i2 = 0;
                    }
                    int[] iArr2 = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS) : null;
                    if (iArr2 != null) {
                        for (int i5 : iArr2) {
                            if (i2 != i5) {
                            }
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if ((mo34028g == BarcodeFormat.EAN_13 || mo34028g == BarcodeFormat.UPC_A) && (m67528c = this.f57888c.m67528c(sb2)) != null) {
                        result.putMetadata(ResultMetadataType.POSSIBLE_COUNTRY, m67528c);
                    }
                    return result;
                }
                throw ChecksumException.getChecksumInstance();
            }
            throw FormatException.getFormatInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
