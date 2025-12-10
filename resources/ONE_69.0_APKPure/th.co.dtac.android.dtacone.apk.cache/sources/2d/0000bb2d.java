package com.netcetera.threeds.sdk.infrastructure;

import android.widget.CompoundButton;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bk */
/* loaded from: classes5.dex */
class C9265bk implements CompoundButton.OnCheckedChangeListener {
    private final C9263bj ThreeDS2Service;
    private final setCursorVisible ThreeDS2ServiceInstance;

    public C9265bk(C9263bj c9263bj, setCursorVisible setcursorvisible) {
        this.ThreeDS2Service = c9263bj;
        this.ThreeDS2ServiceInstance = setcursorvisible;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9263bj.valueOf(this.ThreeDS2Service, this.ThreeDS2ServiceInstance, compoundButton, z);
    }
}