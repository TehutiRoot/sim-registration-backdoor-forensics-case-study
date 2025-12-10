package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* loaded from: classes5.dex */
public class setCompoundDrawablesRelative implements setSelected.valueOf {
    private final String ThreeDS2Service;
    private final com.netcetera.threeds.sdk.api.ThreeDS2Service ThreeDS2ServiceInstance$7e09f6;
    private final String get;

    public setCompoundDrawablesRelative(com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service, String str, String str2) {
        this.ThreeDS2ServiceInstance$7e09f6 = threeDS2Service;
        this.ThreeDS2Service = str;
        this.get = str2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.valueOf
    public Object ThreeDS2ServiceInstance() {
        try {
            return ((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance((-1) - MotionEvent.axisFromString(""), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 59)).getDeclaredMethod(CoreConstants.VALUE_OF, (Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(Process.myTid() >> 22, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 59 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), String.class, String.class).invoke(null, this.ThreeDS2ServiceInstance$7e09f6, this.ThreeDS2Service, this.get);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}