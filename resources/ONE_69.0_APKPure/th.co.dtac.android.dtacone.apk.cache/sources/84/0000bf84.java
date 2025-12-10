package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class stringPropertyNames implements View.OnClickListener {
    private final C9741store valueOf;

    public stringPropertyNames(C9741store c9741store) {
        this.valueOf = c9741store;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C9741store.ThreeDS2ServiceInstance(this.valueOf, view);
    }
}