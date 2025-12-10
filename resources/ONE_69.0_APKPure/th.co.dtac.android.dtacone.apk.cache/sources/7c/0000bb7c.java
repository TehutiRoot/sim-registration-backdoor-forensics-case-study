package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setLinksClickable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.dm */
/* loaded from: classes5.dex */
public class C9326dm implements setLinksClickable.valueOf {
    private final C9327dn ThreeDS2Service;

    public C9326dm(C9327dn c9327dn) {
        this.ThreeDS2Service = c9327dn;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLinksClickable.valueOf
    public void get() {
        this.ThreeDS2Service.valueOf();
    }
}