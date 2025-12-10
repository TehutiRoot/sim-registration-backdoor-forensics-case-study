package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setWebViewClient;

/* loaded from: classes5.dex */
class setDataDirectorySuffix implements Runnable {
    private final setWebViewClient.ThreeDS2ServiceInstance ThreeDS2Service;
    private final setAllCaps get;

    public setDataDirectorySuffix(setWebViewClient.ThreeDS2ServiceInstance threeDS2ServiceInstance, setAllCaps setallcaps) {
        this.ThreeDS2Service = threeDS2ServiceInstance;
        this.get = setallcaps;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.ThreeDS2Service.get(this.get);
    }
}
