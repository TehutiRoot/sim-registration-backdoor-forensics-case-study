package com.netcetera.threeds.sdk.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class getClass {
    private static int get = 0;
    private static int values = 1;
    private final Map<String, setContentInsetEndWithActions> ThreeDS2Service = new HashMap();

    public List<setContentInsetEndWithActions> ThreeDS2Service() {
        List<setContentInsetEndWithActions> unmodifiableList = Collections.unmodifiableList(new ArrayList(this.ThreeDS2Service.values()));
        int i = get;
        values = (((i & 73) - (~(i | 73))) - 1) % 128;
        return unmodifiableList;
    }

    public void valueOf(setContentInsetEndWithActions setcontentinsetendwithactions) {
        int i = get;
        int i2 = i & 99;
        int i3 = (i | 99) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        values = i5 % 128;
        int i6 = i5 % 2;
        this.ThreeDS2Service.put(setcontentinsetendwithactions.valueOf(), setcontentinsetendwithactions);
        if (i6 != 0) {
            return;
        }
        throw null;
    }
}
