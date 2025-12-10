package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bm */
/* loaded from: classes5.dex */
public class C9278bm extends AbstractC9759x {
    private static int ThreeDS2Service = 1;
    private static int values;

    public C9278bm(Context context, AbstractC9758w abstractC9758w, AbstractC9758w abstractC9758w2) {
        super(context, abstractC9758w, abstractC9758w2);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9759x
    public LinearLayout ThreeDS2ServiceInstance(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = C9375et.values;
        layoutParams.setMargins(0, i, 0, i);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        int i2 = values;
        ThreeDS2Service = ((i2 ^ 53) + ((i2 & 53) << 1)) % 128;
        return linearLayout;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9759x
    public LinearLayout values(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i = ThreeDS2Service;
        int i2 = i & 43;
        int i3 = (i | 43) & (~i2);
        int i4 = -(-(i2 << 1));
        values = ((i3 & i4) + (i3 | i4)) % 128;
        return linearLayout;
    }
}
