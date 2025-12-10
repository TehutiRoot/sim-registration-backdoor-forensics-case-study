package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* loaded from: classes5.dex */
public class setHeaderDividersEnabled {
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance;

    public static setDividerHeight valueOf(Context context, setBaselineAlignedChildIndex setbaselinealignedchildindex) {
        try {
            setBaselineAligned setbaselinealigned = (setBaselineAligned) ((Class) get3DSServerTransactionID.ThreeDS2Service((ViewConfiguration.getEdgeSlop() >> 16) + 1938, TextUtils.lastIndexOf("", '0') + 64, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 38197))).getMethod("values", Context.class).invoke(null, context);
            try {
                setDividerHeight setdividerheight = (setDividerHeight) ((Class) get3DSServerTransactionID.ThreeDS2Service(2001 - TextUtils.indexOf("", ""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 58, (char) (22578 - TextUtils.lastIndexOf("", '0')))).getMethod("values", Context.class, setBaselineAligned.class, setBaselineAlignedChildIndex.class).invoke(null, context, setbaselinealigned, setbaselinealignedchildindex);
                setIndeterminateTintList setindeterminatetintlist = new setIndeterminateTintList(setbaselinealigned, setdividerheight, setIndeterminate.valueOf(setdividerheight));
                int i = ThreeDS2ServiceInstance;
                int i2 = i & 23;
                int i3 = (i ^ 23) | i2;
                int i4 = (i2 & i3) + (i3 | i2);
                ThreeDS2Service = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 61 / 0;
                }
                return setindeterminatetintlist;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th3;
        }
    }
}