package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class stringPropertyNames implements View.OnClickListener {
    private final C9752store valueOf;

    public stringPropertyNames(C9752store c9752store) {
        this.valueOf = c9752store;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C9752store.ThreeDS2ServiceInstance(this.valueOf, view);
    }
}
