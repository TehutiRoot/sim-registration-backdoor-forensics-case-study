package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setWebViewClient;

/* loaded from: classes5.dex */
class setWebContentsDebuggingEnabled implements Runnable {
    private final setCustomInsertionActionModeCallback ThreeDS2ServiceInstance;
    private final setWebViewClient.ThreeDS2ServiceInstance get;

    public setWebContentsDebuggingEnabled(setWebViewClient.ThreeDS2ServiceInstance threeDS2ServiceInstance, setCustomInsertionActionModeCallback setcustominsertionactionmodecallback) {
        this.get = threeDS2ServiceInstance;
        this.ThreeDS2ServiceInstance = setcustominsertionactionmodecallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.get.values(this.ThreeDS2ServiceInstance);
    }
}
