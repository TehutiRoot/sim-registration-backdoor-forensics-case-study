package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.AbstractC9760y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.bb */
/* loaded from: classes5.dex */
public class C9265bb implements AbstractC9760y.values {
    private final AbstractC9260ay ThreeDS2ServiceInstance;

    public C9265bb(AbstractC9260ay abstractC9260ay) {
        this.ThreeDS2ServiceInstance = abstractC9260ay;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9760y.values
    public void values(String str) {
        AbstractC9260ay.values(this.ThreeDS2ServiceInstance, str);
    }
}
