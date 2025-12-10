package com.netcetera.threeds.sdk.infrastructure;

import android.widget.CompoundButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class loadFromXML implements CompoundButton.OnCheckedChangeListener {
    private final storeToXML ThreeDS2ServiceInstance;

    public loadFromXML(storeToXML storetoxml) {
        this.ThreeDS2ServiceInstance = storetoxml;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.ThreeDS2ServiceInstance.valueOf(compoundButton, z);
    }
}