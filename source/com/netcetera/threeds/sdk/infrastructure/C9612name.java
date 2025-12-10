package com.netcetera.threeds.sdk.infrastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.name */
/* loaded from: classes5.dex */
public class C9612name {
    private static int get = 1;
    private static int valueOf;
    private final Map<setForegroundGravity, List<setMenuCallbacks>> ThreeDS2Service = new HashMap();

    private C9612name() {
    }

    public static C9612name valueOf() {
        C9612name c9612name = new C9612name();
        int i = valueOf;
        get = (((i | 101) << 1) - (i ^ 101)) % 128;
        return c9612name;
    }

    public Map<setForegroundGravity, List<setMenuCallbacks>> get() {
        int i = get;
        Map<setForegroundGravity, List<setMenuCallbacks>> map = this.ThreeDS2Service;
        int i2 = i & 67;
        int i3 = -(-((i ^ 67) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netcetera.threeds.sdk.infrastructure.C9612name values(com.netcetera.threeds.sdk.infrastructure.C9612name r7) {
        /*
            r6 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9612name.valueOf
            r1 = r0 & 6
            r0 = r0 | 6
            int r1 = r1 + r0
            int r1 = r1 + (-1)
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9612name.get = r1
            java.util.Map r7 = r7.get()
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
            int r1 = com.netcetera.threeds.sdk.infrastructure.C9612name.get
            int r1 = r1 + 53
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9612name.valueOf = r1
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb3
            int r1 = com.netcetera.threeds.sdk.infrastructure.C9612name.valueOf
            r2 = r1 & 100
            r1 = r1 | 100
            int r2 = r2 + r1
            int r2 = r2 + (-1)
            int r2 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.C9612name.get = r2
            java.lang.Object r1 = r0.next()
            com.netcetera.threeds.sdk.infrastructure.setForegroundGravity r1 = (com.netcetera.threeds.sdk.infrastructure.setForegroundGravity) r1
            java.lang.Object r2 = r7.get(r1)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L9b
            int r3 = com.netcetera.threeds.sdk.infrastructure.C9612name.get
            r4 = r3 ^ 39
            r3 = r3 & 39
            int r3 = r3 << 1
            int r4 = r4 + r3
            int r3 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.C9612name.valueOf = r3
            int r4 = r4 % 2
            if (r4 == 0) goto L5e
            int r3 = r2.size()
            r4 = 29
            int r4 = r4 / 0
            if (r3 <= 0) goto L9b
            goto L64
        L5e:
            int r3 = r2.size()
            if (r3 <= 0) goto L9b
        L64:
            java.util.Map<com.netcetera.threeds.sdk.infrastructure.setForegroundGravity, java.util.List<com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks>> r3 = r6.ThreeDS2Service
            java.lang.Object r3 = r3.get(r1)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L82
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = com.netcetera.threeds.sdk.infrastructure.C9612name.get
            r5 = r4 ^ 2
            r4 = r4 & 2
            int r4 = r4 << 1
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            int r5 = r5 % 128
            com.netcetera.threeds.sdk.infrastructure.C9612name.valueOf = r5
        L82:
            r3.addAll(r2)
            java.util.Map<com.netcetera.threeds.sdk.infrastructure.setForegroundGravity, java.util.List<com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks>> r2 = r6.ThreeDS2Service
            r2.put(r1, r3)
            int r1 = com.netcetera.threeds.sdk.infrastructure.C9612name.get
            r2 = r1 & 113(0x71, float:1.58E-43)
            r1 = r1 ^ 113(0x71, float:1.58E-43)
            r1 = r1 | r2
            int r1 = -r1
            int r1 = -r1
            r3 = r2 & r1
            r1 = r1 | r2
            int r3 = r3 + r1
            int r3 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.C9612name.valueOf = r3
        L9b:
            int r1 = com.netcetera.threeds.sdk.infrastructure.C9612name.get
            r2 = r1 ^ 95
            r3 = r1 & 95
            r2 = r2 | r3
            int r2 = r2 << 1
            int r3 = ~r3
            r1 = r1 | 95
            r1 = r1 & r3
            int r1 = -r1
            int r1 = ~r1
            int r2 = r2 - r1
            int r2 = r2 + (-1)
            int r2 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.C9612name.valueOf = r2
            goto L21
        Lb3:
            int r7 = com.netcetera.threeds.sdk.infrastructure.C9612name.get
            r0 = r7 & (-62)
            int r1 = ~r7
            r1 = r1 & 61
            r0 = r0 | r1
            r7 = r7 & 61
            int r7 = r7 << 1
            int r0 = r0 + r7
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9612name.valueOf = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9612name.values(com.netcetera.threeds.sdk.infrastructure.name):com.netcetera.threeds.sdk.infrastructure.name");
    }

    public static C9612name valueOf(setMenuCallbacks... setmenucallbacksArr) {
        setMenuCallbacks setmenucallbacks;
        List<setMenuCallbacks> list;
        C9612name c9612name = new C9612name();
        int length = setmenucallbacksArr.length;
        int i = valueOf;
        get = (((i ^ 47) - (~((i & 47) << 1))) - 1) % 128;
        int i2 = 0;
        while (i2 < length) {
            int i3 = get;
            int i4 = i3 & 43;
            int i5 = i4 + ((i3 ^ 43) | i4);
            valueOf = i5 % 128;
            if (i5 % 2 != 0) {
                setmenucallbacks = setmenucallbacksArr[i2];
                list = c9612name.ThreeDS2Service.get(setmenucallbacks.ThreeDS2ServiceInstance());
                int i6 = 97 / 0;
                if (list != null) {
                    list.add(setmenucallbacks);
                    c9612name.ThreeDS2Service.put(setmenucallbacks.ThreeDS2ServiceInstance(), list);
                    int i7 = (i2 ^ 42) + ((i2 & 42) << 1);
                    i2 = ((i7 | (-41)) << 1) - (i7 ^ (-41));
                    valueOf = (get + 21) % 128;
                }
                list = new ArrayList<>();
                int i8 = valueOf;
                get = (((i8 | 73) << 1) - (i8 ^ 73)) % 128;
                list.add(setmenucallbacks);
                c9612name.ThreeDS2Service.put(setmenucallbacks.ThreeDS2ServiceInstance(), list);
                int i72 = (i2 ^ 42) + ((i2 & 42) << 1);
                i2 = ((i72 | (-41)) << 1) - (i72 ^ (-41));
                valueOf = (get + 21) % 128;
            } else {
                setmenucallbacks = setmenucallbacksArr[i2];
                list = c9612name.ThreeDS2Service.get(setmenucallbacks.ThreeDS2ServiceInstance());
                if (list != null) {
                    list.add(setmenucallbacks);
                    c9612name.ThreeDS2Service.put(setmenucallbacks.ThreeDS2ServiceInstance(), list);
                    int i722 = (i2 ^ 42) + ((i2 & 42) << 1);
                    i2 = ((i722 | (-41)) << 1) - (i722 ^ (-41));
                    valueOf = (get + 21) % 128;
                }
                list = new ArrayList<>();
                int i82 = valueOf;
                get = (((i82 | 73) << 1) - (i82 ^ 73)) % 128;
                list.add(setmenucallbacks);
                c9612name.ThreeDS2Service.put(setmenucallbacks.ThreeDS2ServiceInstance(), list);
                int i7222 = (i2 ^ 42) + ((i2 & 42) << 1);
                i2 = ((i7222 | (-41)) << 1) - (i7222 ^ (-41));
                valueOf = (get + 21) % 128;
            }
        }
        int i9 = get;
        int i10 = i9 & 37;
        int i11 = -(-((i9 ^ 37) | i10));
        int i12 = (i10 & i11) + (i11 | i10);
        valueOf = i12 % 128;
        if (i12 % 2 == 0) {
            return c9612name;
        }
        throw null;
    }

    public boolean values() {
        get = (valueOf + 87) % 128;
        boolean isEmpty = this.ThreeDS2Service.isEmpty();
        int i = valueOf;
        int i2 = (i & 93) + (i | 93);
        get = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 57 / 0;
        }
        return isEmpty;
    }
}
