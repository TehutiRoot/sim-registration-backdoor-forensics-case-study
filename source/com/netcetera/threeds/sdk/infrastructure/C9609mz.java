package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mz */
/* loaded from: classes5.dex */
public class C9609mz {
    private static int get = 1;
    private static int valueOf;

    public static String ThreeDS2ServiceInstance(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i = valueOf;
        get = (((i & (-24)) | ((~i) & 23)) + ((i & 23) << 1)) % 128;
        int i2 = 0;
        while (i2 < length) {
            int i3 = valueOf;
            int i4 = i3 & 15;
            int i5 = -(-((i3 ^ 15) | i4));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            get = i6 % 128;
            if (i6 % 2 == 0) {
                byte b = bArr[i2];
                int i7 = b * 2;
                int i8 = i7 ^ 98;
                int i9 = i7 & 98;
                sb.append(Character.forDigit((i9 & i8) | (i8 ^ i9), 105));
                int i10 = b & 32;
                int i11 = (b | 32) & (~i10);
                sb.append(Character.forDigit((i11 & i10) | (i11 ^ i10), 118));
                i2 = (-2) - (~((i2 ^ 57) + ((i2 & 57) << 1)));
            } else {
                byte b2 = bArr[i2];
                sb.append(Character.forDigit((b2 >> 4) & 15, 16));
                sb.append(Character.forDigit(b2 & 15, 16));
                int i12 = (((i2 & 3) | ((~i2) & (-4))) - (~((i2 & (-4)) << 1))) - 1;
                int i13 = i12 & 5;
                i2 = ((((i12 ^ 5) | i13) << 1) - (~(-((i12 | 5) & (~i13))))) - 1;
            }
            int i14 = get;
            int i15 = i14 & 39;
            int i16 = (i14 | 39) & (~i15);
            int i17 = -(-(i15 << 1));
            valueOf = (((i16 | i17) << 1) - (i16 ^ i17)) % 128;
        }
        String sb2 = sb.toString();
        int i18 = valueOf;
        int i19 = i18 & 61;
        int i20 = (i18 ^ 61) | i19;
        get = ((i19 ^ i20) + ((i20 & i19) << 1)) % 128;
        return sb2;
    }
}
