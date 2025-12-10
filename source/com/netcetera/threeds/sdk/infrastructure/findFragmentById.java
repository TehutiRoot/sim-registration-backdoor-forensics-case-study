package com.netcetera.threeds.sdk.infrastructure;

import java.util.Iterator;

/* loaded from: classes5.dex */
public class findFragmentById {
    private static int ThreeDS2Service = 0;
    private static int get = 1;
    private final C9613nb ThreeDS2ServiceInstance;
    private final equals valueOf;

    public findFragmentById(equals equalsVar, C9613nb c9613nb) {
        this.valueOf = equalsVar;
        this.ThreeDS2ServiceInstance = c9613nb;
    }

    public C9612name values(C9651nr c9651nr) {
        int i = get;
        ThreeDS2Service = ((i & 97) + (i | 97)) % 128;
        C9612name valueOf = C9612name.valueOf();
        Iterator<setContentInsetEndWithActions> it = this.valueOf.ThreeDS2Service().iterator();
        get = (ThreeDS2Service + 121) % 128;
        while (!(!it.hasNext())) {
            int i2 = ThreeDS2Service;
            int i3 = (-2) - (~((i2 ^ 116) + ((i2 & 116) << 1)));
            get = i3 % 128;
            if (i3 % 2 != 0) {
                valueOf.values(it.next().valueOf(c9651nr, this.ThreeDS2ServiceInstance.get()));
                int i4 = get;
                int i5 = i4 & 109;
                int i6 = ((i4 ^ 109) | i5) << 1;
                int i7 = -((i4 | 109) & (~i5));
                ThreeDS2Service = ((i6 & i7) + (i7 | i6)) % 128;
            } else {
                valueOf.values(it.next().valueOf(c9651nr, this.ThreeDS2ServiceInstance.get()));
                throw null;
            }
        }
        int i8 = get;
        int i9 = (((i8 | 122) << 1) - (i8 ^ 122)) - 1;
        ThreeDS2Service = i9 % 128;
        if (i9 % 2 == 0) {
            return valueOf;
        }
        throw null;
    }
}
