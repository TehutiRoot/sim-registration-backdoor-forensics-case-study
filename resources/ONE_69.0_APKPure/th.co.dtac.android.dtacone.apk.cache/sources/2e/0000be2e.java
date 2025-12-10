package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;

/* loaded from: classes5.dex */
public class setFillViewport {
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance;

    public static setMin ThreeDS2ServiceInstance(Context context, setProgress setprogress, setSelectionAfterHeaderView setselectionafterheaderview) {
        int i = ThreeDS2Service;
        int i2 = i & 13;
        int i3 = (i2 - (~((i ^ 13) | i2))) - 1;
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 != 0) {
            try {
                setMin ThreeDS2Service2 = setAutoSizeTextTypeUniformWithConfiguration.ThreeDS2Service((setMin) ((Class) get3DSServerTransactionID.ThreeDS2Service(2133 - Color.red(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 59, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("ThreeDS2ServiceInstance", Context.class, setProgress.class, setSelectionAfterHeaderView.class).invoke(null, context, setprogress, setselectionafterheaderview));
                int i4 = 90 / 0;
                return ThreeDS2Service2;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        try {
            return setAutoSizeTextTypeUniformWithConfiguration.ThreeDS2Service((setMin) ((Class) get3DSServerTransactionID.ThreeDS2Service(Color.rgb(0, 0, 0) + 16779349, Color.blue(0) + 58, (char) KeyEvent.keyCodeFromString(""))).getMethod("ThreeDS2ServiceInstance", Context.class, setProgress.class, setSelectionAfterHeaderView.class).invoke(null, context, setprogress, setselectionafterheaderview));
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th3;
        }
    }
}