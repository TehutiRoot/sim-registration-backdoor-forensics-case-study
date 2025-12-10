package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import org.bouncycastle.asn1.eac.EACTags;

/* loaded from: classes5.dex */
public final class UPCEReader extends UPCEANReader {

    /* renamed from: j */
    public static final int[] f57889j = {56, 52, 50, 49, 44, 38, 35, 42, 41, 37};

    /* renamed from: k */
    public static final int[] f57890k = {1, 1, 1, 1, 1, 1};

    /* renamed from: l */
    public static final int[][] f57891l = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i */
    public final int[] f57892i = new int[4];

    public static String convertUPCEtoUPCA(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case EACTags.TRANSACTION_DATE /* 51 */:
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        sb.append(str.charAt(7));
        return sb.toString();
    }

    /* renamed from: h */
    public static void m34027h(StringBuilder sb, int i) {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f57891l[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public boolean checkChecksum(String str) throws FormatException {
        return super.checkChecksum(convertUPCEtoUPCA(str));
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public int[] decodeEnd(BitArray bitArray, int i) throws NotFoundException {
        return UPCEANReader.m34031d(bitArray, i, true, f57890k);
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f57892i;
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
        m34027h(sb, i2);
        return i;
    }

    @Override // com.google.zxing.oned.UPCEANReader
    /* renamed from: g */
    public BarcodeFormat mo34028g() {
        return BarcodeFormat.UPC_E;
    }
}
