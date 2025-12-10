package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setWebViewClient;

/* loaded from: classes5.dex */
class setWebChromeClient implements Runnable {
    private final setWebViewClient.ThreeDS2ServiceInstance ThreeDS2ServiceInstance;
    private final setPopupTheme values;

    public setWebChromeClient(setWebViewClient.ThreeDS2ServiceInstance threeDS2ServiceInstance, setPopupTheme setpopuptheme) {
        this.ThreeDS2ServiceInstance = threeDS2ServiceInstance;
        this.values = setpopuptheme;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(this.values);
    }
}