package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mo */
/* loaded from: classes5.dex */
class View$OnApplyWindowInsetsListenerC9598mo implements View.OnApplyWindowInsetsListener {
    private final C9597mn ThreeDS2Service;
    private final C9597mn ThreeDS2ServiceInstance;
    private final C9597mn get;
    private final C9597mn values;

    public View$OnApplyWindowInsetsListenerC9598mo(C9597mn c9597mn, C9597mn c9597mn2, C9597mn c9597mn3, C9597mn c9597mn4) {
        this.values = c9597mn;
        this.ThreeDS2ServiceInstance = c9597mn2;
        this.get = c9597mn3;
        this.ThreeDS2Service = c9597mn4;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets values;
        values = C9594mk.values(this.values, this.ThreeDS2ServiceInstance, this.get, this.ThreeDS2Service, view, windowInsets);
        return values;
    }
}
