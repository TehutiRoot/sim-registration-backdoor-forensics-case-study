package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ds */
/* loaded from: classes5.dex */
class C9343ds implements forEach {
    private final Context ThreeDS2Service;
    private final C9342dr values;

    public C9343ds(C9342dr c9342dr, Context context) {
        this.values = c9342dr;
        this.ThreeDS2Service = context;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.forEach
    public void ThreeDS2ServiceInstance(isEmpty isempty) {
        this.values.get(this.ThreeDS2Service, isempty);
    }
}
