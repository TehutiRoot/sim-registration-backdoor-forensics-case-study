package com.netcetera.threeds.sdk.infrastructure;

import android.widget.LinearLayout;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ex */
/* loaded from: classes5.dex */
public final class C9367ex {
    private static int valueOf = 1;
    private static int values;

    public static LinearLayout.LayoutParams valueOf() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = C9364et.valueOf;
        int i = values;
        valueOf = (((i | 63) << 1) - (i ^ 63)) % 128;
        return layoutParams;
    }
}