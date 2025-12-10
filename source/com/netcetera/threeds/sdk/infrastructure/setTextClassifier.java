package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setWebViewClient;

/* loaded from: classes5.dex */
class setTextClassifier implements Runnable {
    private final setWebViewClient.ThreeDS2ServiceInstance ThreeDS2ServiceInstance;
    private final setId valueOf;

    public setTextClassifier(setWebViewClient.ThreeDS2ServiceInstance threeDS2ServiceInstance, setId setid) {
        this.ThreeDS2ServiceInstance = threeDS2ServiceInstance;
        this.valueOf = setid;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.ThreeDS2ServiceInstance.initialize(this.valueOf);
    }
}
