package com.netcetera.threeds.sdk.infrastructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.pm */
/* loaded from: classes5.dex */
public abstract class AbstractC9683pm implements InterfaceC9677pd {
    public final Logger ThreeDS2Service = LoggerFactory.getLogger(getClass());
    private String ThreeDS2ServiceInstance;
    private String get;
    private String valueOf;
    private EnumC9706rb values;

    public String ThreeDS2Service() {
        return this.valueOf;
    }

    public void get(String str) {
        this.get = str;
    }

    public void valueOf(String str) {
        this.ThreeDS2ServiceInstance = str;
    }

    public void values(String str) {
        this.valueOf = str;
    }

    public void ThreeDS2Service(EnumC9706rb enumC9706rb) {
        this.values = enumC9706rb;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9677pd
    public String valueOf() {
        return this.ThreeDS2ServiceInstance;
    }
}