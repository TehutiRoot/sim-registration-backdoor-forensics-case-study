package com.netcetera.threeds.sdk.infrastructure;

import android.net.wifi.WifiInfo;
import com.netcetera.threeds.sdk.infrastructure.setBackgroundTintMode;

/* loaded from: classes5.dex */
class setNextFocusDownId implements setBackgroundTintMode.ThreeDS2ServiceInstance {
    public static final setNextFocusDownId ThreeDS2ServiceInstance = new setNextFocusDownId();

    @Override // com.netcetera.threeds.sdk.infrastructure.setBackgroundTintMode.ThreeDS2ServiceInstance
    public String valueOf(WifiInfo wifiInfo) {
        return wifiInfo.getSSID();
    }
}
