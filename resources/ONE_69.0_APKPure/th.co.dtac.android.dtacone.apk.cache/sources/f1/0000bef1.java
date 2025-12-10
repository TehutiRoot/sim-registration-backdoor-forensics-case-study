package com.netcetera.threeds.sdk.infrastructure;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
class setProgressBackgroundTintMode implements Callable {
    private final setProgressTintMode ThreeDS2ServiceInstance;
    private final String valueOf;

    public setProgressBackgroundTintMode(setProgressTintMode setprogresstintmode, String str) {
        this.ThreeDS2ServiceInstance = setprogresstintmode;
        this.valueOf = str;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return setProgressTintMode.values(this.ThreeDS2ServiceInstance, this.valueOf);
    }
}