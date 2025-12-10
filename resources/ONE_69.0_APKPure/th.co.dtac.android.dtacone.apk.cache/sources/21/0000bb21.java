package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.AbstractC9749y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.bb */
/* loaded from: classes5.dex */
public class C9254bb implements AbstractC9749y.values {
    private final AbstractC9249ay ThreeDS2ServiceInstance;

    public C9254bb(AbstractC9249ay abstractC9249ay) {
        this.ThreeDS2ServiceInstance = abstractC9249ay;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9749y.values
    public void values(String str) {
        AbstractC9249ay.values(this.ThreeDS2ServiceInstance, str);
    }
}