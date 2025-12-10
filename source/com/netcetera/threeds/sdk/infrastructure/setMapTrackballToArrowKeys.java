package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class setMapTrackballToArrowKeys implements Runnable {
    private final setCustomInsertionActionModeCallback ThreeDS2Service;
    private final setWebViewClient get;
    private final setMotionEventSplittingEnabled values;

    public setMapTrackballToArrowKeys(setWebViewClient setwebviewclient, setCustomInsertionActionModeCallback setcustominsertionactionmodecallback, setMotionEventSplittingEnabled setmotioneventsplittingenabled) {
        this.get = setwebviewclient;
        this.ThreeDS2Service = setcustominsertionactionmodecallback;
        this.values = setmotioneventsplittingenabled;
    }

    @Override // java.lang.Runnable
    public void run() {
        setWebViewClient.valueOf(this.get, this.ThreeDS2Service, this.values);
    }
}
