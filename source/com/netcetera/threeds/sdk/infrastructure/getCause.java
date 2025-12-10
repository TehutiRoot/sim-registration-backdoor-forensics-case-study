package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public final class getCause {
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance;

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Enum<TT;>;:Lcom/netcetera/threeds/sdk/infrastructure/printStackTrace;>(Ljava/lang/Class<TT;>;Ljava/lang/String;)TT; */
    public static Enum ThreeDS2ServiceInstance(Class cls, String str) {
        int i = ThreeDS2ServiceInstance;
        int i2 = (i & 52) + (i | 52);
        ThreeDS2Service = ((~i2) + (i2 << 1)) % 128;
        if (str == null) {
            int i3 = (i + 25) % 128;
            ThreeDS2Service = i3;
            int i4 = ((i3 ^ 27) | (i3 & 27)) << 1;
            int i5 = -((i3 & (-28)) | ((~i3) & 27));
            int i6 = (i4 & i5) + (i4 | i5);
            ThreeDS2ServiceInstance = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            throw null;
        }
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int length = enumArr.length - 1;
        int i7 = ThreeDS2Service;
        int i8 = i7 & 113;
        ThreeDS2ServiceInstance = (((i7 | 113) & (~i8)) + (i8 << 1)) % 128;
        while (length >= 0) {
            int i9 = ThreeDS2ServiceInstance;
            ThreeDS2Service = ((((i9 ^ 95) | (i9 & 95)) << 1) - (((~i9) & 95) | (i9 & (-96)))) % 128;
            Enum r2 = enumArr[length];
            if (C9615nd.values(str, ((printStackTrace) r2).ThreeDS2Service())) {
                int i10 = ThreeDS2ServiceInstance;
                int i11 = i10 & 45;
                int i12 = ((i10 ^ 45) | i11) << 1;
                int i13 = -((i10 | 45) & (~i11));
                int i14 = ((i12 & i13) + (i13 | i12)) % 128;
                ThreeDS2Service = i14;
                int i15 = i14 & 85;
                int i16 = ((i14 ^ 85) | i15) << 1;
                int i17 = -((~i15) & (i14 | 85));
                int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                ThreeDS2ServiceInstance = i18 % 128;
                if (i18 % 2 == 0) {
                    return r2;
                }
                throw null;
            }
            int i19 = length & (-97);
            int i20 = ((length ^ (-97)) | i19) << 1;
            int i21 = -((length | (-97)) & (~i19));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            int i23 = (i22 & (-97)) | ((~i22) & 96);
            int i24 = -(-((i22 & 96) << 1));
            length = (i23 | i24) + (i23 & i24);
            int i25 = ThreeDS2Service;
            ThreeDS2ServiceInstance = (((i25 ^ 117) - (~(-(-((i25 & 117) << 1))))) - 1) % 128;
        }
        int i26 = ThreeDS2ServiceInstance;
        int i27 = (i26 & 105) + (i26 | 105);
        ThreeDS2Service = i27 % 128;
        if (i27 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
