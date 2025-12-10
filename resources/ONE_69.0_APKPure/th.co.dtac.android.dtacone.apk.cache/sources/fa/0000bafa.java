package com.netcetera.threeds.sdk.infrastructure;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.ac */
/* loaded from: classes5.dex */
public class C9225ac implements InterfaceC9614nn {
    private final InterfaceC9359eo valueOf;

    public C9225ac(InterfaceC9359eo interfaceC9359eo) {
        this.valueOf = interfaceC9359eo;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9614nn
    public void values(Object obj) {
        AbstractC9748x.ThreeDS2ServiceInstance(this.valueOf, (save) obj);
    }
}