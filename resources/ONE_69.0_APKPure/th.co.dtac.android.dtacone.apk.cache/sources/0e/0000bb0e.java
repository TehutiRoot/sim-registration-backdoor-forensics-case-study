package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.ao */
/* loaded from: classes5.dex */
public class View$OnClickListenerC9238ao implements View.OnClickListener {
    private final C9241ar values;

    public View$OnClickListenerC9238ao(C9241ar c9241ar) {
        this.values = c9241ar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C9241ar.valueOf(this.values, view);
    }
}