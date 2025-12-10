package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class setIndeterminateDrawable implements Runnable {
    private final String ThreeDS2Service;
    private final setIndeterminate valueOf;
    private final setScrollingCacheEnabled values;

    public setIndeterminateDrawable(setIndeterminate setindeterminate, setScrollingCacheEnabled setscrollingcacheenabled, String str) {
        this.valueOf = setindeterminate;
        this.values = setscrollingcacheenabled;
        this.ThreeDS2Service = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        setIndeterminate.valueOf(this.valueOf, this.values, this.ThreeDS2Service);
    }
}