package com.netcetera.threeds.sdk.infrastructure;

import org.slf4j.LoggerFactory;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.nt */
/* loaded from: classes5.dex */
public final class C9653nt {
    private static int ThreeDS2ServiceInstance = 1;
    private static int values;

    public static InterfaceC9652ns ThreeDS2ServiceInstance(Class<?> cls) {
        C9650np c9650np = new C9650np(LoggerFactory.getLogger(cls));
        int i = values;
        int i2 = i ^ 87;
        int i3 = (((i & 87) | i2) << 1) - i2;
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 != 0) {
            return c9650np;
        }
        throw null;
    }
}
