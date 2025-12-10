package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public abstract class finalize {
    private static int ThreeDS2Service = 1;
    private static int valueOf;

    public C9651nr ThreeDS2Service(C9651nr c9651nr, String str, boolean z) {
        int i = ((-2) - (~(ThreeDS2Service + 26))) % 128;
        valueOf = i;
        int i2 = (i ^ 96) + ((i & 96) << 1);
        int i3 = (~i2) + (i2 << 1);
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 != 0) {
            return c9651nr;
        }
        throw null;
    }

    public abstract C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z);

    public finalize get(final finalize finalizeVar) {
        finalize finalizeVar2 = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.finalize.3
            private static int ThreeDS2Service = 1;
            private static int valueOf;

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9651nr ThreeDS2Service(C9651nr c9651nr, String str, boolean z) {
                int i = valueOf;
                ThreeDS2Service = ((-2) - (~((i ^ 44) + ((i & 44) << 1)))) % 128;
                C9651nr ThreeDS2Service2 = finalize.this.ThreeDS2Service(finalizeVar.ThreeDS2Service(c9651nr, str, z), str, z);
                int i2 = valueOf;
                int i3 = (i2 & 41) + (i2 | 41);
                ThreeDS2Service = i3 % 128;
                if (i3 % 2 != 0) {
                    return ThreeDS2Service2;
                }
                throw null;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                ThreeDS2Service = (valueOf + 31) % 128;
                C9612name ThreeDS2ServiceInstance = finalize.this.ThreeDS2ServiceInstance(c9651nr, str, z);
                if (ThreeDS2ServiceInstance.values()) {
                    int i = ThreeDS2Service;
                    int i2 = (i & (-88)) | ((~i) & 87);
                    int i3 = -(-((i & 87) << 1));
                    valueOf = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
                    C9612name ThreeDS2ServiceInstance2 = finalizeVar.ThreeDS2ServiceInstance(c9651nr, str, z);
                    int i4 = valueOf;
                    int i5 = i4 & 51;
                    int i6 = (i4 | 51) & (~i5);
                    int i7 = -(-(i5 << 1));
                    ThreeDS2Service = ((i6 ^ i7) + ((i6 & i7) << 1)) % 128;
                    return ThreeDS2ServiceInstance2;
                }
                int i8 = ThreeDS2Service;
                int i9 = ((i8 | 111) << 1) - (i8 ^ 111);
                valueOf = i9 % 128;
                if (i9 % 2 == 0) {
                    return ThreeDS2ServiceInstance;
                }
                throw null;
            }
        };
        int i = valueOf;
        int i2 = i & 83;
        int i3 = -(-((i ^ 83) | i2));
        ThreeDS2Service = ((i2 & i3) + (i3 | i2)) % 128;
        return finalizeVar2;
    }
}
