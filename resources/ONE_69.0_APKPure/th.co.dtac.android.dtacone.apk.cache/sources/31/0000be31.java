package com.netcetera.threeds.sdk.infrastructure;

import android.util.Range;

/* loaded from: classes5.dex */
public class setFindListener {
    private static int getSDKInfo = 0;
    private static int getWarnings = 1;
    public static final Range<Integer> values = Range.create(200, 299);
    public static final Integer ThreeDS2Service = 304;
    public static final Integer get = 401;
    public static final Integer valueOf = 403;
    public static final Range<Integer> ThreeDS2ServiceInstance = Range.create(500, 599);

    static {
        int i = getSDKInfo;
        getWarnings = (((i ^ 92) + ((i & 92) << 1)) - 1) % 128;
    }
}