package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ds */
/* loaded from: classes5.dex */
class C9332ds implements forEach {
    private final Context ThreeDS2Service;
    private final C9331dr values;

    public C9332ds(C9331dr c9331dr, Context context) {
        this.values = c9331dr;
        this.ThreeDS2Service = context;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.forEach
    public void ThreeDS2ServiceInstance(isEmpty isempty) {
        this.values.get(this.ThreeDS2Service, isempty);
    }
}