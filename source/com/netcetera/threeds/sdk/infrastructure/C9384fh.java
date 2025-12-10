package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.fh */
/* loaded from: classes5.dex */
public class C9384fh implements setSelected.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.transaction.Transaction get;

    public C9384fh(com.netcetera.threeds.sdk.api.transaction.Transaction transaction) {
        this.get = transaction;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        this.get.close();
    }
}
