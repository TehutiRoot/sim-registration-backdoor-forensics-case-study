package com.netcetera.threeds.sdk.infrastructure;

import java.math.BigInteger;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qy */
/* loaded from: classes5.dex */
public class C9713qy {
    public static byte[] ThreeDS2Service(BigInteger bigInteger, int i) {
        byte[] bArr = get(bigInteger);
        if (i > bArr.length) {
            return C9725rj.values(new byte[i - bArr.length], bArr);
        }
        return bArr;
    }

    public static BigInteger get(String str) {
        return values(new C9673oq().ThreeDS2ServiceInstance(str));
    }

    public static String valueOf(BigInteger bigInteger) {
        return new C9673oq().ThreeDS2Service(get(bigInteger));
    }

    public static BigInteger values(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static byte[] get(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            byte[] byteArray = bigInteger.toByteArray();
            return (bigInteger.bitLength() % 8 == 0 && byteArray[0] == 0 && byteArray.length > 1) ? C9725rj.values(byteArray, 1, byteArray.length - 1) : byteArray;
        }
        throw new IllegalArgumentException("Cannot convert negative values to an unsigned magnitude byte array: " + bigInteger);
    }

    public static String valueOf(BigInteger bigInteger, int i) {
        return new C9673oq().ThreeDS2Service(ThreeDS2Service(bigInteger, i));
    }
}
