package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.ao */
/* loaded from: classes5.dex */
public class View$OnClickListenerC9249ao implements View.OnClickListener {
    private final C9252ar values;

    public View$OnClickListenerC9249ao(C9252ar c9252ar) {
        this.values = c9252ar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C9252ar.valueOf(this.values, view);
    }
}
