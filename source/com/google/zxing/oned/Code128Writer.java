package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {

    /* loaded from: classes5.dex */
    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: b */
    public static int m34060b(CharSequence charSequence, int i, int i2) {
        CType cType;
        CType m34059c;
        CType m34059c2 = m34059c(charSequence, i);
        CType cType2 = CType.UNCODABLE;
        if (m34059c2 != cType2 && m34059c2 != (cType = CType.ONE_DIGIT)) {
            if (i2 == 99) {
                return i2;
            }
            if (i2 == 100) {
                CType cType3 = CType.FNC_1;
                if (m34059c2 == cType3) {
                    return i2;
                }
                CType m34059c3 = m34059c(charSequence, i + 2);
                if (m34059c3 != cType2 && m34059c3 != cType) {
                    if (m34059c3 == cType3) {
                        if (m34059c(charSequence, i + 3) != CType.TWO_DIGITS) {
                            return 100;
                        }
                        return 99;
                    }
                    int i3 = i + 4;
                    while (true) {
                        m34059c = m34059c(charSequence, i3);
                        if (m34059c != CType.TWO_DIGITS) {
                            break;
                        }
                        i3 += 2;
                    }
                    if (m34059c == CType.ONE_DIGIT) {
                        return 100;
                    }
                    return 99;
                }
                return i2;
            }
            if (m34059c2 == CType.FNC_1) {
                m34059c2 = m34059c(charSequence, i + 1);
            }
            if (m34059c2 == CType.TWO_DIGITS) {
                return 99;
            }
        }
        return 100;
    }

    /* renamed from: c */
    public static CType m34059c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt >= '0' && charAt <= '9') {
            int i2 = i + 1;
            if (i2 >= length) {
                return CType.ONE_DIGIT;
            }
            char charAt2 = charSequence.charAt(i2);
            if (charAt2 >= '0' && charAt2 <= '9') {
                return CType.TWO_DIGITS;
            }
            return CType.ONE_DIGIT;
        }
        return CType.UNCODABLE;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.encode(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got " + barcodeFormat);
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length > 0 && length <= 80) {
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt < ' ' || charAt > '~') {
                    switch (charAt) {
                        case 241:
                        case 242:
                        case 243:
                        case 244:
                            break;
                        default:
                            throw new IllegalArgumentException("Bad character in input: " + charAt);
                    }
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 1;
            while (i3 < length) {
                int m34060b = m34060b(str, i3, i5);
                int i7 = 100;
                if (m34060b == i5) {
                    switch (str.charAt(i3)) {
                        case 241:
                            i7 = 102;
                            break;
                        case 242:
                            i7 = 97;
                            break;
                        case 243:
                            i7 = 96;
                            break;
                        case 244:
                            break;
                        default:
                            if (i5 != 100) {
                                i7 = Integer.parseInt(str.substring(i3, i3 + 2));
                                i3++;
                                break;
                            } else {
                                i7 = str.charAt(i3) - ' ';
                                break;
                            }
                    }
                    i3++;
                } else {
                    i7 = i5 == 0 ? m34060b == 100 ? 104 : 105 : m34060b;
                    i5 = m34060b;
                }
                arrayList.add(Code128Reader.f57855a[i7]);
                i4 += i7 * i6;
                if (i3 != 0) {
                    i6++;
                }
            }
            int[][] iArr = Code128Reader.f57855a;
            arrayList.add(iArr[i4 % 103]);
            arrayList.add(iArr[106]);
            int i8 = 0;
            for (int[] iArr2 : arrayList) {
                for (int i9 : iArr2) {
                    i8 += i9;
                }
            }
            boolean[] zArr = new boolean[i8];
            for (int[] iArr3 : arrayList) {
                i += OneDimensionalCodeWriter.appendPattern(zArr, i, iArr3, true);
            }
            return zArr;
        }
        throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got " + length);
    }
}
