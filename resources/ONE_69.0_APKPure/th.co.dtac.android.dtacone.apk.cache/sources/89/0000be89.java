package com.netcetera.threeds.sdk.infrastructure;

import android.net.wifi.WifiInfo;
import com.netcetera.threeds.sdk.infrastructure.setBackgroundTintMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setKeepScreenOn implements setBackgroundTintMode.ThreeDS2ServiceInstance {
    public static final setKeepScreenOn valueOf = new setKeepScreenOn();

    @Override // com.netcetera.threeds.sdk.infrastructure.setBackgroundTintMode.ThreeDS2ServiceInstance
    public String valueOf(WifiInfo wifiInfo) {
        String passpointProviderFriendlyName;
        passpointProviderFriendlyName = wifiInfo.getPasspointProviderFriendlyName();
        return passpointProviderFriendlyName;
    }
}