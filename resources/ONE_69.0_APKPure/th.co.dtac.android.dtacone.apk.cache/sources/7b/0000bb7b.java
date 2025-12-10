package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.dl */
/* loaded from: classes5.dex */
class C9325dl implements forEach {
    private final C9327dn ThreeDS2Service;
    private final Context values;

    public C9325dl(C9327dn c9327dn, Context context) {
        this.ThreeDS2Service = c9327dn;
        this.values = context;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.forEach
    public void ThreeDS2ServiceInstance(isEmpty isempty) {
        this.ThreeDS2Service.valueOf(this.values, isempty);
    }
}