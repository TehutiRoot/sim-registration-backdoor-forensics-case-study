package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bd */
/* loaded from: classes5.dex */
public class C9267bd extends AbstractC9238ae {
    private static int ThreeDS2Service = 0;
    private static int values = 1;

    public C9267bd(Context context) {
        super(context);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9238ae
    public Drawable ThreeDS2ServiceInstance() {
        int i = ThreeDS2Service;
        int i2 = (i & 3) + (i | 3);
        int i3 = i2 % 128;
        values = i3;
        if (i2 % 2 != 0) {
            ThreeDS2Service = ((i3 ^ 59) + ((i3 & 59) << 1)) % 128;
            return null;
        }
        throw null;
    }
}
