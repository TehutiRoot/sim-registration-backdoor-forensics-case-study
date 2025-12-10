package com.netcetera.threeds.sdk.infrastructure;

import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

/* loaded from: classes5.dex */
public final class setId extends RuntimeException {
    private static int get = 0;
    private static int values = 1;
    private final setForegroundGravity ThreeDS2ServiceInstance;

    /* loaded from: classes5.dex */
    public static final class get {
        private static int valueOf = 0;
        private static int values = 1;
        private final setForegroundGravity ThreeDS2Service;
        private String ThreeDS2ServiceInstance;
        private Throwable get;

        public get ThreeDS2Service(String str, Object... objArr) {
            int i = valueOf;
            values = ((i & 53) + (i | 53)) % 128;
            if (objArr != null) {
                int i2 = i + 90;
                int i3 = ((~i2) + (i2 << 1)) % 128;
                values = i3;
                if (objArr.length > 0) {
                    int i4 = (i3 & 35) + (i3 | 35);
                    valueOf = i4 % 128;
                    if (i4 % 2 == 0) {
                        get getVar = get(MessageFormatter.arrayFormat(str, objArr).getMessage());
                        int i5 = values;
                        int i6 = i5 & 91;
                        int i7 = (i6 - (~(-(-((i5 ^ 91) | i6))))) - 1;
                        valueOf = i7 % 128;
                        if (i7 % 2 == 0) {
                            return getVar;
                        }
                        throw null;
                    }
                    get(MessageFormatter.arrayFormat(str, objArr).getMessage());
                    throw null;
                }
            }
            get getVar2 = get(str);
            int i8 = values;
            int i9 = i8 & 63;
            int i10 = (i8 ^ 63) | i9;
            valueOf = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
            return getVar2;
        }

        public get get(String str) {
            int i = values + 101;
            valueOf = i % 128;
            if (i % 2 != 0) {
                this.ThreeDS2ServiceInstance = str;
                int i2 = 57 / 0;
            } else {
                this.ThreeDS2ServiceInstance = str;
            }
            return this;
        }

        public setId valueOf() {
            setId setid = new setId(this.ThreeDS2Service, this.ThreeDS2ServiceInstance, this.get);
            int i = valueOf;
            int i2 = (((i | 88) << 1) - (i ^ 88)) - 1;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 49 / 0;
            }
            return setid;
        }

        public get values(Throwable th2) {
            int i = (values + 3) % 128;
            valueOf = i;
            this.get = th2;
            values = ((i ^ 83) + ((i & 83) << 1)) % 128;
            return this;
        }

        private get(setForegroundGravity setforegroundgravity) {
            this.ThreeDS2Service = setforegroundgravity;
        }
    }

    public static get get(setForegroundGravity setforegroundgravity) {
        get getVar = new get(setforegroundgravity);
        int i = get;
        int i2 = (i | 53) << 1;
        int i3 = -(((~i) & 53) | (i & (-54)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        values = i4 % 128;
        if (i4 % 2 != 0) {
            return getVar;
        }
        throw null;
    }

    public setForegroundGravity ThreeDS2Service() {
        int i = values;
        int i2 = (i & (-88)) | ((~i) & 87);
        int i3 = -(-((i & 87) << 1));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        get = i4;
        setForegroundGravity setforegroundgravity = this.ThreeDS2ServiceInstance;
        int i5 = i4 + 6;
        int i6 = (~i5) + (i5 << 1);
        values = i6 % 128;
        if (i6 % 2 != 0) {
            return setforegroundgravity;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        int i = get;
        int i2 = i & 93;
        int i3 = i | 93;
        int i4 = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        values = i4;
        if (this == obj) {
            int i5 = (i + 75) % 128;
            values = i5;
            int i6 = i5 | 31;
            int i7 = i6 << 1;
            int i8 = -(i6 & (~(i5 & 31)));
            get = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
            return true;
        }
        boolean z = false;
        if (obj != null) {
            int i9 = i4 + 32;
            get = ((~i9) + (i9 << 1)) % 128;
            if (setId.class == obj.getClass()) {
                if (this.ThreeDS2ServiceInstance == ((setId) obj).ThreeDS2ServiceInstance) {
                    int i10 = values;
                    int i11 = ((i10 ^ 9) + ((i10 & 9) << 1)) % 128;
                    get = i11;
                    int i12 = i11 & 79;
                    values = (((((i11 ^ 79) | i12) << 1) - (~(-((i11 | 79) & (~i12))))) - 1) % 128;
                    z = true;
                } else {
                    int i13 = values;
                    int i14 = i13 & 85;
                    get = (i14 + ((i13 ^ 85) | i14)) % 128;
                }
                int i15 = get;
                int i16 = ((i15 & (-52)) | ((~i15) & 51)) + ((i15 & 51) << 1);
                values = i16 % 128;
                if (i16 % 2 != 0) {
                    return z;
                }
                throw null;
            }
        }
        int i17 = get;
        values = ((i17 ^ 7) + ((i17 & 7) << 1)) % 128;
        return false;
    }

    public int hashCode() {
        int i = values + 10;
        get = ((~i) + (i << 1)) % 128;
        int hash = Objects.hash(this.ThreeDS2ServiceInstance);
        int i2 = get;
        int i3 = ((((i2 ^ 103) | (i2 & 103)) << 1) - (~(-(((~i2) & 103) | (i2 & (-104)))))) - 1;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return hash;
        }
        throw null;
    }

    private setId(setForegroundGravity setforegroundgravity, String str, Throwable th2) {
        super(str, th2);
        this.ThreeDS2ServiceInstance = (setForegroundGravity) C9664oh.ThreeDS2Service(setforegroundgravity, setForegroundGravity.get);
    }
}
