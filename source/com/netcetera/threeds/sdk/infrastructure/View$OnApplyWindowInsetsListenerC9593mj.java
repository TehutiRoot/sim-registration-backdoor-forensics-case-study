package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mj */
/* loaded from: classes5.dex */
class View$OnApplyWindowInsetsListenerC9593mj implements View.OnApplyWindowInsetsListener {
    private final C9597mn ThreeDS2Service;
    private final C9597mn ThreeDS2ServiceInstance;
    private final C9597mn get;
    private final C9597mn values;

    public View$OnApplyWindowInsetsListenerC9593mj(C9597mn c9597mn, C9597mn c9597mn2, C9597mn c9597mn3, C9597mn c9597mn4) {
        this.ThreeDS2Service = c9597mn;
        this.ThreeDS2ServiceInstance = c9597mn2;
        this.values = c9597mn3;
        this.get = c9597mn4;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        windowInsets2 = C9592mi.get(this.ThreeDS2Service, this.ThreeDS2ServiceInstance, this.values, this.get, view, windowInsets);
        return windowInsets2;
    }
}
