package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;
import com.netcetera.threeds.sdk.infrastructure.setLineSpacing;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bz */
/* loaded from: classes5.dex */
public class C9292bz implements keys {
    private static int ThreeDS2ServiceInstance = 0;
    public static long get = 5746619265619421183L;
    private static int values = 1;
    private final InterfaceC9652ns ThreeDS2Service = C9653nt.ThreeDS2ServiceInstance(C9292bz.class);
    private final getStackTrace valueOf;

    public C9292bz(getStackTrace getstacktrace) {
        this.valueOf = getstacktrace;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.keys
    public void valueOf(setLineSpacing.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        values = (ThreeDS2ServiceInstance + 29) % 128;
        View.resolveSizeAndState(0, 0, 0);
        threeDS2ServiceInstance.get(this.valueOf);
        ThreeDS2ServiceInstance = (values + 45) % 128;
    }
}
