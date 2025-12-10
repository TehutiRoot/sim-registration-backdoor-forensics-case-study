package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ak */
/* loaded from: classes5.dex */
public class C9233ak extends AbstractC9747w<View> {
    private static final int ThreeDS2ServiceInstance = C9613nm.valueOf(32);
    private static int valueOf = 1;
    private static int values;

    static {
        int i = values;
        int i2 = i & 95;
        int i3 = (i | 95) & (~i2);
        int i4 = -(-(i2 << 1));
        valueOf = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
    }

    public C9233ak(Context context) {
        super(context);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9747w
    public View get(Context context) {
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, ThreeDS2ServiceInstance));
        int i = values;
        valueOf = ((i & 89) + (i | 89)) % 128;
        return view;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        int i = values;
        int i2 = (i & (-36)) | ((~i) & 35);
        int i3 = -(-((i & 35) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}