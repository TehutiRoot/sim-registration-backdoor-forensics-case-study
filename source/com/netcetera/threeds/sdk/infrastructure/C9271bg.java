package com.netcetera.threeds.sdk.infrastructure;

import android.widget.CompoundButton;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bg */
/* loaded from: classes5.dex */
class C9271bg implements CompoundButton.OnCheckedChangeListener {
    private final C9269bf ThreeDS2ServiceInstance;
    private final String[] get;
    private final int valueOf;
    private final String[] values;

    public C9271bg(C9269bf c9269bf, String[] strArr, int i, String[] strArr2) {
        this.ThreeDS2ServiceInstance = c9269bf;
        this.values = strArr;
        this.valueOf = i;
        this.get = strArr2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9269bf.ThreeDS2Service(this.ThreeDS2ServiceInstance, this.values, this.valueOf, this.get, compoundButton, z);
    }
}
