package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.C9650np;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.nu */
/* loaded from: classes5.dex */
class C9654nu implements C9650np.get {
    private final C9650np ThreeDS2ServiceInstance;

    public C9654nu(C9650np c9650np) {
        this.ThreeDS2ServiceInstance = c9650np;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.C9650np.get
    public void valueOf(String str) {
        this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(str);
    }
}
