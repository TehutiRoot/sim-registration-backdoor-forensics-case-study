package com.netcetera.threeds.sdk.infrastructure;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.v */
/* loaded from: classes5.dex */
public class C9757v implements InterfaceC9625nn {
    private final InterfaceC9370eo ThreeDS2ServiceInstance;

    public C9757v(InterfaceC9370eo interfaceC9370eo) {
        this.ThreeDS2ServiceInstance = interfaceC9370eo;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9625nn
    public void values(Object obj) {
        AbstractC9759x.ThreeDS2Service(this.ThreeDS2ServiceInstance, (save) obj);
    }
}
