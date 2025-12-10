package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.et */
/* loaded from: classes5.dex */
public final class C9375et {
    public static final int get;
    public static final int getSDKInfo;
    private static int getSDKVersion = 0;
    public static final int getWarnings;
    private static int initialize = 1;
    public static final int valueOf;
    public static final int ThreeDS2Service = C9624nm.valueOf(4);
    public static final int ThreeDS2ServiceInstance = C9624nm.valueOf(8);
    public static final int values = C9624nm.valueOf(16);

    static {
        int valueOf2 = C9624nm.valueOf(24);
        valueOf = valueOf2;
        get = C9624nm.valueOf(32);
        getSDKInfo = C9624nm.valueOf(48);
        getWarnings = valueOf2;
        int i = getSDKVersion;
        int i2 = (((i | 28) << 1) - (i ^ 28)) - 1;
        initialize = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        throw null;
    }
}
