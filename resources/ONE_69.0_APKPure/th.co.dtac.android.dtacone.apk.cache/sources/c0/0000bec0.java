package com.netcetera.threeds.sdk.infrastructure;

import android.net.wifi.WifiInfo;
import com.netcetera.threeds.sdk.infrastructure.setBackgroundTintMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setNextFocusForwardId implements setBackgroundTintMode.ThreeDS2ServiceInstance {
    public static final setNextFocusForwardId get = new setNextFocusForwardId();

    @Override // com.netcetera.threeds.sdk.infrastructure.setBackgroundTintMode.ThreeDS2ServiceInstance
    public String valueOf(WifiInfo wifiInfo) {
        return wifiInfo.getBSSID();
    }
}