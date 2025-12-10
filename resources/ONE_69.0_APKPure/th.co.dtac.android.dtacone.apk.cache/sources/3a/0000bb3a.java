package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import com.netcetera.threeds.sdk.infrastructure.setLineSpacing;
import com.netcetera.threeds.sdk.infrastructure.setTitleMarginEnd;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bw */
/* loaded from: classes5.dex */
public class C9278bw implements keys {
    public static char ThreeDS2Service = 33324;
    public static char ThreeDS2ServiceInstance = 7987;
    public static char get = 8346;
    private static int getSDKInfo = 1;
    private static int getWarnings = 0;
    public static char values = 37871;
    private final getStackTrace getSDKVersion;
    private final InterfaceC9641ns valueOf = C9642nt.ThreeDS2ServiceInstance(C9278bw.class);

    public C9278bw(getStackTrace getstacktrace) {
        this.getSDKVersion = getstacktrace;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.keys
    public void valueOf(setLineSpacing.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        TextUtils.indexOf("", "", 0, 0);
        threeDS2ServiceInstance.get(this.getSDKVersion);
        setTitleMarginEnd settitlemarginend = new setTitleMarginEnd();
        settitlemarginend.ThreeDS2ServiceInstance(new setTitleMarginEnd.valueOf(this.getSDKVersion));
        threeDS2ServiceInstance.valueOf(settitlemarginend);
        getWarnings = (getSDKInfo + 105) % 128;
    }
}