package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.dl */
/* loaded from: classes5.dex */
class C9336dl implements forEach {
    private final C9338dn ThreeDS2Service;
    private final Context values;

    public C9336dl(C9338dn c9338dn, Context context) {
        this.ThreeDS2Service = c9338dn;
        this.values = context;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.forEach
    public void ThreeDS2ServiceInstance(isEmpty isempty) {
        this.ThreeDS2Service.valueOf(this.values, isempty);
    }
}
