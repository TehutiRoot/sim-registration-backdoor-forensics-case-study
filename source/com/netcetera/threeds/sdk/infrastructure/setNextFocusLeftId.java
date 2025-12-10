package com.netcetera.threeds.sdk.infrastructure;

import android.net.wifi.WifiInfo;
import com.netcetera.threeds.sdk.infrastructure.setBackgroundTintMode;

/* loaded from: classes5.dex */
class setNextFocusLeftId implements setBackgroundTintMode.ThreeDS2ServiceInstance {
    public static final setNextFocusLeftId ThreeDS2ServiceInstance = new setNextFocusLeftId();

    @Override // com.netcetera.threeds.sdk.infrastructure.setBackgroundTintMode.ThreeDS2ServiceInstance
    public String valueOf(WifiInfo wifiInfo) {
        String passpointFqdn;
        passpointFqdn = wifiInfo.getPasspointFqdn();
        return passpointFqdn;
    }
}
