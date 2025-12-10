package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class setPictureListener implements Runnable {
    private final setTouchscreenBlocksFocus ThreeDS2Service;
    private final setWebViewClient valueOf;
    private final setLineSpacing values;

    public setPictureListener(setWebViewClient setwebviewclient, setLineSpacing setlinespacing, setTouchscreenBlocksFocus settouchscreenblocksfocus) {
        this.valueOf = setwebviewclient;
        this.values = setlinespacing;
        this.ThreeDS2Service = settouchscreenblocksfocus;
    }

    @Override // java.lang.Runnable
    public void run() {
        setWebViewClient.get(this.valueOf, this.values, this.ThreeDS2Service);
    }
}