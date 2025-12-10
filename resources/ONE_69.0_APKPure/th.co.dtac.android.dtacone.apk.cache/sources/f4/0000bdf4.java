package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setWebViewClient;

/* loaded from: classes5.dex */
class setChoiceMode implements Runnable {
    private final setWebViewClient.ThreeDS2ServiceInstance ThreeDS2Service;
    private final setId get;

    public setChoiceMode(setWebViewClient.ThreeDS2ServiceInstance threeDS2ServiceInstance, setId setid) {
        this.ThreeDS2Service = threeDS2ServiceInstance;
        this.get = setid;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.ThreeDS2Service.get(this.get);
    }
}