package p000;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.UPCEANReader;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: IX1 */
/* loaded from: classes5.dex */
public final class IX1 {

    /* renamed from: a */
    public final int[] f2711a = new int[4];

    /* renamed from: b */
    public final StringBuilder f2712b = new StringBuilder();

    /* renamed from: c */
    public static Map m68005c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put((EnumMap) ResultMetadataType.ISSUE_NUMBER, (ResultMetadataType) Integer.valueOf(str));
        return enumMap;
    }

    /* renamed from: a */
    public final int m68007a(BitArray bitArray, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f2711a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < size; i3++) {
            int m34024c = UPCEANReader.m34024c(bitArray, iArr2, i, UPCEANReader.f57897h);
            sb.append((char) ((m34024c % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m34024c >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = bitArray.getNextUnset(bitArray.getNextSet(i));
            }
        }
        if (sb.length() == 2) {
            if (Integer.parseInt(sb.toString()) % 4 == i2) {
                return i;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: b */
    public Result m68006b(int i, BitArray bitArray, int[] iArr) {
        StringBuilder sb = this.f2712b;
        sb.setLength(0);
        int m68007a = m68007a(bitArray, iArr, sb);
        String sb2 = sb.toString();
        Map<ResultMetadataType, Object> m68005c = m68005c(sb2);
        float f = i;
        Result result = new Result(sb2, null, new ResultPoint[]{new ResultPoint((iArr[0] + iArr[1]) / 2.0f, f), new ResultPoint(m68007a, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (m68005c != null) {
            result.putAllMetadata(m68005c);
        }
        return result;
    }
}