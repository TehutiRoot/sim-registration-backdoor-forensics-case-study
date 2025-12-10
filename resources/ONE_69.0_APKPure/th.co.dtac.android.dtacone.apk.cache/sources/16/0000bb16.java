package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setLinksClickable;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.at */
/* loaded from: classes5.dex */
class C9244at implements setLinksClickable.valueOf {
    private final String valueOf;
    private final C9245au values;

    public C9244at(C9245au c9245au, String str) {
        this.values = c9245au;
        this.valueOf = str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLinksClickable.valueOf
    public void get() {
        C9245au.get(this.values, this.valueOf);
    }
}