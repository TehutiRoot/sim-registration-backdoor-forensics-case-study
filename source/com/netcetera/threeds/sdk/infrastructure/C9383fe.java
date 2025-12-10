package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.fe */
/* loaded from: classes5.dex */
public class C9383fe implements setSelected.valueOf {
    private final Activity ThreeDS2Service;
    private final com.netcetera.threeds.sdk.api.transaction.Transaction values$5f2d72c8;

    public C9383fe(com.netcetera.threeds.sdk.api.transaction.Transaction transaction, Activity activity) {
        this.values$5f2d72c8 = transaction;
        this.ThreeDS2Service = activity;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.valueOf
    public Object ThreeDS2ServiceInstance() {
        try {
            return ((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance((ViewConfiguration.getPressedStateDuration() >> 16) + 375, (char) (KeyEvent.getDeadChar(0, 0) + 54750), TextUtils.indexOf((CharSequence) "", '0', 0) + 49)).getDeclaredMethod("ThreeDS2Service", (Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(375 - Color.red(0), (char) (54750 - (ViewConfiguration.getPressedStateDuration() >> 16)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 47), Activity.class).invoke(null, this.values$5f2d72c8, this.ThreeDS2Service);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}
