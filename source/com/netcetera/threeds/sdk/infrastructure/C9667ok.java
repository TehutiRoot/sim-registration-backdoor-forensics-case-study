package com.netcetera.threeds.sdk.infrastructure;

import java.util.Calendar;
import java.util.Date;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ok */
/* loaded from: classes5.dex */
public class C9667ok {
    private static Date ThreeDS2Service(Date date, int i, int i2) {
        ThreeDS2ServiceInstance(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(i, i2);
        return calendar.getTime();
    }

    private static void ThreeDS2ServiceInstance(Date date) {
        boolean z;
        if (date != null) {
            z = true;
        } else {
            z = false;
        }
        C9666oj.valueOf(z, "The date must not be null", new Object[0]);
    }

    public static Date values(Date date, int i) {
        return ThreeDS2Service(date, 5, i);
    }
}
