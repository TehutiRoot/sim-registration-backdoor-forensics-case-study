package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ax */
/* loaded from: classes5.dex */
public class C9248ax extends AbstractC9249ay {
    private static int getWarnings = 1;
    private static int initialize;

    public C9248ax(Context context, C9239ap c9239ap) {
        super(context, c9239ap);
    }

    public static C9248ax ThreeDS2Service(Context context) {
        C9248ax c9248ax = new C9248ax(context, new C9239ap());
        int i = getWarnings;
        int i2 = i & 125;
        initialize = (i2 + ((i ^ 125) | i2)) % 128;
        return c9248ax;
    }
}