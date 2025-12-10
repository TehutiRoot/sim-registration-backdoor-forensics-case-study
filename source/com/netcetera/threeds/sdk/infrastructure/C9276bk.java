package com.netcetera.threeds.sdk.infrastructure;

import android.widget.CompoundButton;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bk */
/* loaded from: classes5.dex */
class C9276bk implements CompoundButton.OnCheckedChangeListener {
    private final C9274bj ThreeDS2Service;
    private final setCursorVisible ThreeDS2ServiceInstance;

    public C9276bk(C9274bj c9274bj, setCursorVisible setcursorvisible) {
        this.ThreeDS2Service = c9274bj;
        this.ThreeDS2ServiceInstance = setcursorvisible;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9274bj.valueOf(this.ThreeDS2Service, this.ThreeDS2ServiceInstance, compoundButton, z);
    }
}
