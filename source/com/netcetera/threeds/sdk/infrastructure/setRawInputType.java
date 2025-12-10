package com.netcetera.threeds.sdk.infrastructure;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setRawInputType implements Callable {
    private final setHint ThreeDS2ServiceInstance;
    private final String values;

    public setRawInputType(setHint sethint, String str) {
        this.ThreeDS2ServiceInstance = sethint;
        this.values = str;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return setHint.ThreeDS2ServiceInstance(this.ThreeDS2ServiceInstance, this.values);
    }
}
