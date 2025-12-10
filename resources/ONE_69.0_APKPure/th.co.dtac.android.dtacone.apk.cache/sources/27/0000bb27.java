package com.netcetera.threeds.sdk.infrastructure;

import android.widget.CompoundButton;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bg */
/* loaded from: classes5.dex */
class C9260bg implements CompoundButton.OnCheckedChangeListener {
    private final C9258bf ThreeDS2ServiceInstance;
    private final String[] get;
    private final int valueOf;
    private final String[] values;

    public C9260bg(C9258bf c9258bf, String[] strArr, int i, String[] strArr2) {
        this.ThreeDS2ServiceInstance = c9258bf;
        this.values = strArr;
        this.valueOf = i;
        this.get = strArr2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9258bf.ThreeDS2Service(this.ThreeDS2ServiceInstance, this.values, this.valueOf, this.get, compoundButton, z);
    }
}