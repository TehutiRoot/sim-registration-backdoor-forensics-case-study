package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
public class setProgressBackgroundTintBlendMode {
    private static int ThreeDS2ServiceInstance = 0;
    private static int valueOf = 1;

    public static setProgressTintBlendMode values(Context context, setProgressTintList setprogresstintlist, setSelectionAfterHeaderView setselectionafterheaderview) {
        int i = valueOf + 3;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            setProgressTintBlendMode ThreeDS2Service = setProgressTintMode.ThreeDS2Service(setSecondaryProgressTintList.ThreeDS2ServiceInstance(context, setprogresstintlist, setselectionafterheaderview));
            int i2 = valueOf;
            int i3 = i2 & 55;
            int i4 = (i2 ^ 55) | i3;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            ThreeDS2ServiceInstance = i5 % 128;
            if (i5 % 2 == 0) {
                return ThreeDS2Service;
            }
            throw null;
        }
        setProgressTintMode.ThreeDS2Service(setSecondaryProgressTintList.ThreeDS2ServiceInstance(context, setprogresstintlist, setselectionafterheaderview));
        throw null;
    }
}