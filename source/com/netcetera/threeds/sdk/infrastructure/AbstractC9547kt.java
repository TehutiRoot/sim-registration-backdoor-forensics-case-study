package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.kt */
/* loaded from: classes5.dex */
abstract class AbstractC9547kt {
    private static int ThreeDS2ServiceInstance = 0;
    private static int values = 1;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.kt$ThreeDS2ServiceInstance */
    /* loaded from: classes5.dex */
    public interface ThreeDS2ServiceInstance<O, C extends InterfaceC9514jr> {
        O values(C c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <O, C extends InterfaceC9514jr> O ThreeDS2Service(C c, C c2, ThreeDS2ServiceInstance<O, C> threeDS2ServiceInstance) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 43;
        values = ((((i ^ 43) | i2) << 1) - ((i | 43) & (~i2))) % 128;
        O o = (O) C9664oh.ThreeDS2Service(threeDS2ServiceInstance.values((InterfaceC9514jr) C9664oh.ThreeDS2Service(c, c2)), threeDS2ServiceInstance.values(c2));
        int i3 = ThreeDS2ServiceInstance + 119;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 67 / 0;
        }
        return o;
    }

    public static <O extends Integer, C extends InterfaceC9514jr> O values(C c, C c2, ThreeDS2ServiceInstance<O, C> threeDS2ServiceInstance) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 119;
        int i3 = ((i ^ 119) | i2) << 1;
        int i4 = -((i | 119) & (~i2));
        values = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        O o = (O) ThreeDS2Service(c, c2, threeDS2ServiceInstance);
        if (o.intValue() > 0) {
            int i5 = ThreeDS2ServiceInstance;
            int i6 = ((i5 | 59) << 1) - (i5 ^ 59);
            int i7 = i6 % 128;
            values = i7;
            if (i6 % 2 == 0) {
                int i8 = 23 / 0;
            }
            int i9 = (i7 & (-18)) | ((~i7) & 17);
            int i10 = (i7 & 17) << 1;
            ThreeDS2ServiceInstance = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
        } else {
            o = threeDS2ServiceInstance.values(c2);
            int i11 = ThreeDS2ServiceInstance;
            int i12 = i11 & 113;
            values = ((i12 - (~((i11 ^ 113) | i12))) - 1) % 128;
        }
        int i13 = ThreeDS2ServiceInstance;
        int i14 = i13 & 121;
        int i15 = -(-((i13 ^ 121) | i14));
        values = ((i14 & i15) + (i15 | i14)) % 128;
        return o;
    }
}
