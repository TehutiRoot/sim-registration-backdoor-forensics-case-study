package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.fa */
/* loaded from: classes5.dex */
public class C9369fa implements setSelected.valueOf {
    private final com.netcetera.threeds.sdk.api.transaction.Transaction ThreeDS2ServiceInstance;

    public C9369fa(com.netcetera.threeds.sdk.api.transaction.Transaction transaction) {
        this.ThreeDS2ServiceInstance = transaction;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.valueOf
    public Object ThreeDS2ServiceInstance() {
        return this.ThreeDS2ServiceInstance.getAuthenticationRequestParameters();
    }
}