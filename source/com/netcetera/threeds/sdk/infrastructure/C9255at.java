package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setLinksClickable;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.at */
/* loaded from: classes5.dex */
class C9255at implements setLinksClickable.valueOf {
    private final String valueOf;
    private final C9256au values;

    public C9255at(C9256au c9256au, String str) {
        this.values = c9256au;
        this.valueOf = str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLinksClickable.valueOf
    public void get() {
        C9256au.get(this.values, this.valueOf);
    }
}
