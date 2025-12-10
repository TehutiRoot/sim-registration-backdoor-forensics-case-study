package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ax */
/* loaded from: classes5.dex */
public class C9259ax extends AbstractC9260ay {
    private static int getWarnings = 1;
    private static int initialize;

    public C9259ax(Context context, C9250ap c9250ap) {
        super(context, c9250ap);
    }

    public static C9259ax ThreeDS2Service(Context context) {
        C9259ax c9259ax = new C9259ax(context, new C9250ap());
        int i = getWarnings;
        int i2 = i & 125;
        initialize = (i2 + ((i ^ 125) | i2)) % 128;
        return c9259ax;
    }
}
