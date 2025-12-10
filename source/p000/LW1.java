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

/* renamed from: LW1 */
/* loaded from: classes5.dex */
public final class LW1 {

    /* renamed from: a */
    public final int[] f3483a = new int[4];

    /* renamed from: b */
    public final StringBuilder f3484b = new StringBuilder();

    /* renamed from: c */
    public static Map m67511c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put((EnumMap) ResultMetadataType.ISSUE_NUMBER, (ResultMetadataType) Integer.valueOf(str));
        return enumMap;
    }

    /* renamed from: a */
    public final int m67513a(BitArray bitArray, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f3483a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < size; i3++) {
            int m34032c = UPCEANReader.m34032c(bitArray, iArr2, i, UPCEANReader.f57885h);
            sb.append((char) ((m34032c % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m34032c >= 10) {
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
    public Result m67512b(int i, BitArray bitArray, int[] iArr) {
        StringBuilder sb = this.f3484b;
        sb.setLength(0);
        int m67513a = m67513a(bitArray, iArr, sb);
        String sb2 = sb.toString();
        Map<ResultMetadataType, Object> m67511c = m67511c(sb2);
        float f = i;
        Result result = new Result(sb2, null, new ResultPoint[]{new ResultPoint((iArr[0] + iArr[1]) / 2.0f, f), new ResultPoint(m67513a, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (m67511c != null) {
            result.putAllMetadata(m67511c);
        }
        return result;
    }
}
