package com.netcetera.threeds.sdk.infrastructure;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
class setAutoSizeTextTypeUniformWithPresetSizes implements Callable {
    private final setScrollingCacheEnabled ThreeDS2ServiceInstance;
    private final String get;
    private final setAutoSizeTextTypeUniformWithConfiguration values;

    public setAutoSizeTextTypeUniformWithPresetSizes(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration, setScrollingCacheEnabled setscrollingcacheenabled, String str) {
        this.values = setautosizetexttypeuniformwithconfiguration;
        this.ThreeDS2ServiceInstance = setscrollingcacheenabled;
        this.get = str;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return setAutoSizeTextTypeUniformWithConfiguration.ThreeDS2ServiceInstance(this.values, this.ThreeDS2ServiceInstance, this.get);
    }
}