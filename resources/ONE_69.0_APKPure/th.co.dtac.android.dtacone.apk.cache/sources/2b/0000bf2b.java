package com.netcetera.threeds.sdk.infrastructure;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
class setSmoothScrollingEnabled implements Callable {
    private final setAutoSizeTextTypeUniformWithConfiguration ThreeDS2ServiceInstance;

    public setSmoothScrollingEnabled(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        this.ThreeDS2ServiceInstance = setautosizetexttypeuniformwithconfiguration;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return setAutoSizeTextTypeUniformWithConfiguration.valueOf(this.ThreeDS2ServiceInstance);
    }
}