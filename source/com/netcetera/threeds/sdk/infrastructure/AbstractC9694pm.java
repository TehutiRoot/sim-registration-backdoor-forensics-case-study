package com.netcetera.threeds.sdk.infrastructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.pm */
/* loaded from: classes5.dex */
public abstract class AbstractC9694pm implements InterfaceC9688pd {
    public final Logger ThreeDS2Service = LoggerFactory.getLogger(getClass());
    private String ThreeDS2ServiceInstance;
    private String get;
    private String valueOf;
    private EnumC9717rb values;

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

    public void ThreeDS2Service(EnumC9717rb enumC9717rb) {
        this.values = enumC9717rb;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9688pd
    public String valueOf() {
        return this.ThreeDS2ServiceInstance;
    }
}
