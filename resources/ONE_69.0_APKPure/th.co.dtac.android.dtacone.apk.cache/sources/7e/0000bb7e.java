package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.do */
/* loaded from: classes5.dex */
class C9328do implements containsKey {
    private final C9327dn ThreeDS2Service;

    public C9328do(C9327dn c9327dn) {
        this.ThreeDS2Service = c9327dn;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsKey
    public void get(getServices getservices) {
        this.ThreeDS2Service.ThreeDS2ServiceInstance(getservices);
    }
}