package com.netcetera.threeds.sdk.infrastructure;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
class setAutoSizeTextTypeWithDefaults implements Callable {
    private final String ThreeDS2Service;
    private final setScrollingCacheEnabled ThreeDS2ServiceInstance;
    private final String get;
    private final String getWarnings;
    private final String valueOf;
    private final setAutoSizeTextTypeUniformWithConfiguration values;

    public setAutoSizeTextTypeWithDefaults(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration, setScrollingCacheEnabled setscrollingcacheenabled, String str, String str2, String str3, String str4) {
        this.values = setautosizetexttypeuniformwithconfiguration;
        this.ThreeDS2ServiceInstance = setscrollingcacheenabled;
        this.get = str;
        this.ThreeDS2Service = str2;
        this.valueOf = str3;
        this.getWarnings = str4;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return setAutoSizeTextTypeUniformWithConfiguration.values(this.values, this.ThreeDS2ServiceInstance, this.get, this.ThreeDS2Service, this.valueOf, this.getWarnings);
    }
}