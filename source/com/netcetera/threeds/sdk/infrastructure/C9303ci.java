package com.netcetera.threeds.sdk.infrastructure;

import android.view.KeyEvent;
import com.netcetera.threeds.sdk.infrastructure.setLineSpacing;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ci */
/* loaded from: classes5.dex */
public class C9303ci implements keys {
    public static int ThreeDS2ServiceInstance = 133;
    private static int cleanup = 0;
    public static char[] get = {206, 243, 251, 244, 240, 238, 236, 165, 201, 234, 232, 199, 233, 213, 230, 247, 242, 249, 203, 241, 252, 237, 191, 202, 254, 256, 258};
    private static int getSDKInfo = 1;
    public static boolean valueOf = true;
    public static boolean values = true;
    private final InterfaceC9652ns ThreeDS2Service = C9653nt.ThreeDS2ServiceInstance(C9303ci.class);
    private final keys getSDKVersion;
    private final putAll getWarnings;

    public C9303ci(keys keysVar, putAll putall) {
        this.getSDKVersion = keysVar;
        this.getWarnings = putall;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.keys
    public void valueOf(setLineSpacing.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        getSDKInfo = (cleanup + 107) % 128;
        KeyEvent.getMaxKeyCode();
        threeDS2ServiceInstance.values(this.getWarnings);
        this.getSDKVersion.valueOf(threeDS2ServiceInstance);
        cleanup = (getSDKInfo + 63) % 128;
    }
}
