package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.u */
/* loaded from: classes5.dex */
public class View$OnClickListenerC9756u implements View.OnClickListener {
    private final C9564list valueOf;

    public View$OnClickListenerC9756u(C9564list c9564list) {
        this.valueOf = c9564list;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C9564list.values(this.valueOf, view);
    }
}
