package com.netcetera.threeds.sdk.infrastructure;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class getTextColor {
    private static int ThreeDS2ServiceInstance = 1;
    private static int valueOf;
    private final Map<String, getHeadingTextColor> ThreeDS2Service;
    private final Map<String, getHeadingTextColor> values;

    /* loaded from: classes5.dex */
    public static final class ThreeDS2ServiceInstance {
        private static int get = 0;
        private static int values = 1;
        private final Map<String, getHeadingTextColor> ThreeDS2Service;
        private final Map<String, getHeadingTextColor> ThreeDS2ServiceInstance;

        public static /* synthetic */ Map ThreeDS2ServiceInstance(ThreeDS2ServiceInstance threeDS2ServiceInstance) {
            int i = values;
            get = (((i ^ 118) + ((i & 118) << 1)) - 1) % 128;
            Map<String, getHeadingTextColor> map = threeDS2ServiceInstance.ThreeDS2Service;
            int i2 = (-2) - (~(i + 56));
            get = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 46 / 0;
            }
            return map;
        }

        public static /* synthetic */ Map valueOf(ThreeDS2ServiceInstance threeDS2ServiceInstance) {
            int i = values;
            get = (i + 119) % 128;
            Map<String, getHeadingTextColor> map = threeDS2ServiceInstance.ThreeDS2ServiceInstance;
            int i2 = i & 53;
            int i3 = ((i ^ 53) | i2) << 1;
            int i4 = -((i | 53) & (~i2));
            get = ((i3 & i4) + (i4 | i3)) % 128;
            return map;
        }

        public void values(String str, getHeadingTextColor getheadingtextcolor) {
            values = (get + 35) % 128;
            this.ThreeDS2ServiceInstance.put(str, getheadingtextcolor);
            int i = values;
            int i2 = i ^ 121;
            int i3 = ((i & 121) | i2) << 1;
            int i4 = -i2;
            get = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        }

        private ThreeDS2ServiceInstance() {
            this.ThreeDS2ServiceInstance = new HashMap();
            this.ThreeDS2Service = new HashMap();
        }

        public void ThreeDS2ServiceInstance(String str, getHeadingTextColor getheadingtextcolor) {
            int i = values;
            get = ((i & 37) + (i | 37)) % 128;
            this.ThreeDS2Service.put(str, getheadingtextcolor);
            int i2 = get;
            int i3 = i2 & 99;
            int i4 = -(-((i2 ^ 99) | i3));
            values = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        }

        public getTextColor valueOf() {
            getTextColor gettextcolor = new getTextColor(this);
            int i = get;
            int i2 = i & 31;
            int i3 = (i | 31) & (~i2);
            int i4 = -(-(i2 << 1));
            values = ((i3 & i4) + (i3 | i4)) % 128;
            return gettextcolor;
        }
    }

    public static ThreeDS2ServiceInstance ThreeDS2Service() {
        ThreeDS2ServiceInstance threeDS2ServiceInstance = new ThreeDS2ServiceInstance();
        int i = valueOf;
        int i2 = i & 97;
        int i3 = (i ^ 97) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 != 0) {
            return threeDS2ServiceInstance;
        }
        throw null;
    }

    public Map<String, getHeadingTextColor> ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 21;
        int i3 = ((i | 21) & (~i2)) + (i2 << 1);
        int i4 = i3 % 128;
        valueOf = i4;
        if (i3 % 2 == 0) {
            Map<String, getHeadingTextColor> map = this.values;
            int i5 = ((i4 | 93) << 1) - (i4 ^ 93);
            ThreeDS2ServiceInstance = i5 % 128;
            if (i5 % 2 != 0) {
                return map;
            }
            throw null;
        }
        throw null;
    }

    public Map<String, getHeadingTextColor> values() {
        int i = valueOf;
        int i2 = (((i | 93) << 1) - (i ^ 93)) % 128;
        ThreeDS2ServiceInstance = i2;
        Map<String, getHeadingTextColor> map = this.ThreeDS2Service;
        valueOf = (((i2 | 63) << 1) - (i2 ^ 63)) % 128;
        return map;
    }

    private getTextColor(ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        this.ThreeDS2Service = Collections.unmodifiableMap(ThreeDS2ServiceInstance.valueOf(threeDS2ServiceInstance));
        this.values = Collections.unmodifiableMap(ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(threeDS2ServiceInstance));
    }
}
