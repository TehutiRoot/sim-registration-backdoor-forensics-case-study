package com.netcetera.threeds.sdk.infrastructure;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
class setSecondaryProgressTintBlendMode implements Callable {
    private final setProgressTintMode values;

    public setSecondaryProgressTintBlendMode(setProgressTintMode setprogresstintmode) {
        this.values = setprogresstintmode;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return setProgressTintMode.ThreeDS2ServiceInstance(this.values);
    }
}
