package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.do */
/* loaded from: classes5.dex */
class C9339do implements containsKey {
    private final C9338dn ThreeDS2Service;

    public C9339do(C9338dn c9338dn) {
        this.ThreeDS2Service = c9338dn;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsKey
    public void get(getServices getservices) {
        this.ThreeDS2Service.ThreeDS2ServiceInstance(getservices);
    }
}
