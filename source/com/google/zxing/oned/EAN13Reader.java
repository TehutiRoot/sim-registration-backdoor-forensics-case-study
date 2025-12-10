package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* loaded from: classes5.dex */
public final class EAN13Reader extends UPCEANReader {

    /* renamed from: j */
    public static final int[] f57867j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i */
    public final int[] f57868i = new int[4];

    /* renamed from: h */
    public static void m34045h(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f57867j[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f57868i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < size; i3++) {
            int m34032c = UPCEANReader.m34032c(bitArray, iArr2, i, UPCEANReader.f57885h);
            sb.append((char) ((m34032c % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m34032c >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m34045h(sb, i2);
        int i5 = UPCEANReader.m34031d(bitArray, i, true, UPCEANReader.f57882e)[1];
        for (int i6 = 0; i6 < 6 && i5 < size; i6++) {
            sb.append((char) (UPCEANReader.m34032c(bitArray, iArr2, i5, UPCEANReader.f57884g) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    @Override // com.google.zxing.oned.UPCEANReader
    /* renamed from: g */
    public BarcodeFormat mo34028g() {
        return BarcodeFormat.EAN_13;
    }
}
