package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.api.ThreeDS2Service;
import com.netcetera.threeds.sdk.infrastructure.setSelected;
import java.util.Map;

/* loaded from: classes5.dex */
public class setMovementMethod implements setSelected.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.ThreeDS2Service ThreeDS2Service$7e09f6;
    private final Context ThreeDS2ServiceInstance;
    private final String get;
    private final ThreeDS2Service.InitializationCallback getWarnings;
    private final com.netcetera.threeds.sdk.api.configparameters.ConfigParameters valueOf;
    private final Map values;

    public setMovementMethod(com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service, Context context, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str, Map map, ThreeDS2Service.InitializationCallback initializationCallback) {
        this.ThreeDS2Service$7e09f6 = threeDS2Service;
        this.ThreeDS2ServiceInstance = context;
        this.valueOf = configParameters;
        this.get = str;
        this.values = map;
        this.getWarnings = initializationCallback;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance('0' - AndroidCharacter.getMirror('0'), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0, 0) + 59)).getDeclaredMethod("get", (Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 59), Context.class, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters.class, String.class, Map.class, ThreeDS2Service.InitializationCallback.class).invoke(null, this.ThreeDS2Service$7e09f6, this.ThreeDS2ServiceInstance, this.valueOf, this.get, this.values, this.getWarnings);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
