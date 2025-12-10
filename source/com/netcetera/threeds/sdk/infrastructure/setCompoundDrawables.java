package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setSelected;
import java.util.Map;

/* loaded from: classes5.dex */
public class setCompoundDrawables implements setSelected.ThreeDS2Service {
    private final Map ThreeDS2Service;
    private final com.netcetera.threeds.sdk.api.ThreeDS2Service ThreeDS2ServiceInstance$7e09f6;
    private final String get;
    private final Context valueOf;
    private final com.netcetera.threeds.sdk.api.configparameters.ConfigParameters values;

    public setCompoundDrawables(com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service, Context context, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str, Map map) {
        this.ThreeDS2ServiceInstance$7e09f6 = threeDS2Service;
        this.valueOf = context;
        this.values = configParameters;
        this.get = str;
        this.ThreeDS2Service = map;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance((-1) - ExpandableListView.getPackedPositionChild(0L), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 59 - (ViewConfiguration.getJumpTapTimeout() >> 16))).getDeclaredMethod("get", (Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) ((-16777216) - Color.rgb(0, 0, 0)), 59 - Color.green(0)), Context.class, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters.class, String.class, Map.class).invoke(null, this.ThreeDS2ServiceInstance$7e09f6, this.valueOf, this.values, this.get, this.ThreeDS2Service);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
