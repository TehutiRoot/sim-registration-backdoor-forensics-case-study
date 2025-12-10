package com.netcetera.threeds.sdk.infrastructure;

import android.net.wifi.WifiInfo;
import com.netcetera.threeds.sdk.infrastructure.setBackgroundTintMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setNextClusterForwardId implements setBackgroundTintMode.ThreeDS2ServiceInstance {
    public static final setNextClusterForwardId values = new setNextClusterForwardId();

    @Override // com.netcetera.threeds.sdk.infrastructure.setBackgroundTintMode.ThreeDS2ServiceInstance
    public String valueOf(WifiInfo wifiInfo) {
        return wifiInfo.getMacAddress();
    }
}