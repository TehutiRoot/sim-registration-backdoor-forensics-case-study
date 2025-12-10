package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setHorizontalGravity {
    private static int ThreeDS2ServiceInstance = 0;
    private static int get = 1;
    private final String ThreeDS2Service;
    private final String valueOf;

    /* loaded from: classes5.dex */
    public static final class ThreeDS2ServiceInstance {
        private static int ThreeDS2Service = 1;
        private static int ThreeDS2ServiceInstance;
        private String valueOf;
        private String values;

        public ThreeDS2ServiceInstance ThreeDS2Service(String str) {
            int i = ThreeDS2Service;
            int i2 = (i | 115) << 1;
            int i3 = -(i ^ 115);
            int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            ThreeDS2ServiceInstance = i4;
            this.values = str;
            int i5 = (i4 ^ 121) + ((i4 & 121) << 1);
            ThreeDS2Service = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public setHorizontalGravity ThreeDS2ServiceInstance() {
            setHorizontalGravity sethorizontalgravity = new setHorizontalGravity(this.values, this.valueOf);
            int i = ThreeDS2ServiceInstance;
            int i2 = ((i | 117) << 1) - (i ^ 117);
            ThreeDS2Service = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 89 / 0;
            }
            return sethorizontalgravity;
        }

        public ThreeDS2ServiceInstance valueOf(String str) {
            int i = ThreeDS2Service;
            int i2 = ((i ^ 61) + ((i & 61) << 1)) % 128;
            ThreeDS2ServiceInstance = i2;
            this.valueOf = str;
            int i3 = i2 & 55;
            ThreeDS2Service = ((i3 - (~((i2 ^ 55) | i3))) - 1) % 128;
            return this;
        }
    }

    public String ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInstance;
        int i2 = ((((i ^ 31) | (i & 31)) << 1) - (((~i) & 31) | (i & (-32)))) % 128;
        get = i2;
        String str = this.valueOf;
        ThreeDS2ServiceInstance = (i2 + 45) % 128;
        return str;
    }

    public String values() {
        int i = get;
        String str = this.ThreeDS2Service;
        int i2 = i & 97;
        int i3 = -(-((i ^ 97) | i2));
        ThreeDS2ServiceInstance = ((i2 & i3) + (i3 | i2)) % 128;
        return str;
    }

    private setHorizontalGravity(String str, String str2) {
        this.valueOf = str;
        this.ThreeDS2Service = str2;
    }
}