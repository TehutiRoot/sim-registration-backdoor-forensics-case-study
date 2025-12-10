package com.netcetera.threeds.sdk.infrastructure;

import android.view.MotionEvent;
import com.netcetera.threeds.sdk.infrastructure.setLineSpacing;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.dy */
/* loaded from: classes5.dex */
public class C9338dy implements keys {
    private static int ThreeDS2ServiceInstance = 0;
    private static int valueOf = 1;
    public static long values = -531189799005164623L;
    private final InterfaceC9641ns ThreeDS2Service = C9642nt.ThreeDS2ServiceInstance(C9338dy.class);
    private final computeIfAbsent get;

    public C9338dy(computeIfAbsent computeifabsent) {
        this.get = computeifabsent;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.keys
    public void valueOf(setLineSpacing.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        valueOf = (ThreeDS2ServiceInstance + 103) % 128;
        MotionEvent.axisFromString("");
        threeDS2ServiceInstance.get(this.get);
        int i = valueOf + 9;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }
}