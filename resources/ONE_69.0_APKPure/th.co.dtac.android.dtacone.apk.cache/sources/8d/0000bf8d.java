package com.netcetera.threeds.sdk.infrastructure;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.v */
/* loaded from: classes5.dex */
public class C9746v implements InterfaceC9614nn {
    private final InterfaceC9359eo ThreeDS2ServiceInstance;

    public C9746v(InterfaceC9359eo interfaceC9359eo) {
        this.ThreeDS2ServiceInstance = interfaceC9359eo;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9614nn
    public void values(Object obj) {
        AbstractC9748x.ThreeDS2Service(this.ThreeDS2ServiceInstance, (save) obj);
    }
}