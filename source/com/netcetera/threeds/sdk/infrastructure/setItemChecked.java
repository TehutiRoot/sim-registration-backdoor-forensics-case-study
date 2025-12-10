package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setWebViewClient;

/* loaded from: classes5.dex */
class setItemChecked implements Runnable {
    private final setWebViewClient.valueOf ThreeDS2ServiceInstance;
    private final setId values;

    public setItemChecked(setWebViewClient.valueOf valueof, setId setid) {
        this.ThreeDS2ServiceInstance = valueof;
        this.values = setid;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.ThreeDS2ServiceInstance.ThreeDS2Service(this.values);
    }
}
