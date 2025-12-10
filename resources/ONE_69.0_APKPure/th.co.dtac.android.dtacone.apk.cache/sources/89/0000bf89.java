package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.u */
/* loaded from: classes5.dex */
public class View$OnClickListenerC9745u implements View.OnClickListener {
    private final C9553list valueOf;

    public View$OnClickListenerC9745u(C9553list c9553list) {
        this.valueOf = c9553list;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C9553list.values(this.valueOf, view);
    }
}