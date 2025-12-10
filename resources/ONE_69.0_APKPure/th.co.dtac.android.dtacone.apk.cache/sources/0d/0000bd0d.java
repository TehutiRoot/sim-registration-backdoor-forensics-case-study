package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.my */
/* loaded from: classes5.dex */
public final class C9597my {
    private static int get = 1;
    private static int values;

    public static Drawable ThreeDS2ServiceInstance(int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setStroke(i2, i3);
        int i4 = values + 90;
        get = ((~i4) + (i4 << 1)) % 128;
        return gradientDrawable;
    }
}