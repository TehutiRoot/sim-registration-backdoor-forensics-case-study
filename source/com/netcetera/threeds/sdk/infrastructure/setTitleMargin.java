package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public interface setTitleMargin {

    /* loaded from: classes5.dex */
    public interface ThreeDS2Service {
        String ThreeDS2Service();

        String ThreeDS2ServiceInstance();

        String values();
    }

    /* loaded from: classes5.dex */
    public interface ThreeDS2ServiceInstance {
        String getSDKInfo();

        String getWarnings();
    }

    ThreeDS2ServiceInstance get();

    ThreeDS2Service valueOf();
}
