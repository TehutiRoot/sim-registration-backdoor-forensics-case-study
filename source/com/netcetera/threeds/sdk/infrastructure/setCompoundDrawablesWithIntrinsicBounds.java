package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* loaded from: classes5.dex */
public class setCompoundDrawablesWithIntrinsicBounds implements setSelected.ThreeDS2Service {
    private final String ThreeDS2Service;
    private final com.netcetera.threeds.sdk.api.configparameters.ConfigParameters ThreeDS2ServiceInstance;
    private final Context get;
    private final com.netcetera.threeds.sdk.api.ThreeDS2Service valueOf$7e09f6;
    private final com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization values;

    public setCompoundDrawablesWithIntrinsicBounds(com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service, Context context, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization uiCustomization) {
        this.valueOf$7e09f6 = threeDS2Service;
        this.get = context;
        this.ThreeDS2ServiceInstance = configParameters;
        this.ThreeDS2Service = str;
        this.values = uiCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ((Process.getThreadPriority(0) + 20) >> 6) + 59)).getDeclaredMethod("get", (Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 60 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Context.class, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters.class, String.class, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization.class).invoke(null, this.valueOf$7e09f6, this.get, this.ThreeDS2ServiceInstance, this.ThreeDS2Service, this.values);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
