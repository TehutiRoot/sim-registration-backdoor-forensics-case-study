package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.C9650np;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.nx */
/* loaded from: classes5.dex */
class C9657nx implements C9650np.get {
    private final C9650np ThreeDS2ServiceInstance;

    public C9657nx(C9650np c9650np) {
        this.ThreeDS2ServiceInstance = c9650np;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.C9650np.get
    public void valueOf(String str) {
        this.ThreeDS2ServiceInstance.valueOf(str);
    }
}
