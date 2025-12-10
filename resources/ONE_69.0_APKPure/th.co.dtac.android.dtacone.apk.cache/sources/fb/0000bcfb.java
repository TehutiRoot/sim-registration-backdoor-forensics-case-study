package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mj */
/* loaded from: classes5.dex */
class View$OnApplyWindowInsetsListenerC9582mj implements View.OnApplyWindowInsetsListener {
    private final C9586mn ThreeDS2Service;
    private final C9586mn ThreeDS2ServiceInstance;
    private final C9586mn get;
    private final C9586mn values;

    public View$OnApplyWindowInsetsListenerC9582mj(C9586mn c9586mn, C9586mn c9586mn2, C9586mn c9586mn3, C9586mn c9586mn4) {
        this.ThreeDS2Service = c9586mn;
        this.ThreeDS2ServiceInstance = c9586mn2;
        this.values = c9586mn3;
        this.get = c9586mn4;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        windowInsets2 = C9581mi.get(this.ThreeDS2Service, this.ThreeDS2ServiceInstance, this.values, this.get, view, windowInsets);
        return windowInsets2;
    }
}