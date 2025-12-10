package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.an */
/* loaded from: classes5.dex */
public class C9237an extends AbstractC9748x {
    private static int ThreeDS2ServiceInstance = 1;
    private static int values;

    public C9237an(Context context, AbstractC9747w abstractC9747w, AbstractC9747w abstractC9747w2) {
        super(context, abstractC9747w, abstractC9747w2);
    }

    public boolean ThreeDS2ServiceInstance() {
        boolean z;
        int i = values;
        int i2 = i & 1;
        int i3 = (((i | 1) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 == 0) {
            z = get(this.get);
            int i4 = 13 / 0;
        } else {
            z = get(this.get);
        }
        int i5 = ThreeDS2ServiceInstance;
        int i6 = i5 & 109;
        int i7 = -(-((i5 ^ 109) | i6));
        int i8 = (i6 & i7) + (i7 | i6);
        values = i8 % 128;
        if (i8 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public void get(boolean z) {
        int i;
        int i2 = values;
        int i3 = ((i2 ^ 61) + ((i2 & 61) << 1)) % 128;
        ThreeDS2ServiceInstance = i3;
        if (z) {
            int i4 = i3 & 19;
            int i5 = (~i4) & (i3 | 19);
            int i6 = i4 << 1;
            values = ((i5 & i6) + (i6 | i5)) % 128;
            i = 0;
        } else {
            ThreeDS2ServiceInstance = ((((i2 | 20) << 1) - (i2 ^ 20)) - 1) % 128;
            i = 8;
        }
        ThreeDS2Service().getChildAt(0).setVisibility(i);
        int i7 = ThreeDS2ServiceInstance;
        int i8 = i7 & 53;
        int i9 = (((i7 | 53) & (~i8)) - (~(i8 << 1))) - 1;
        values = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        throw null;
    }

    public boolean valueOf() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i | 55;
        int i3 = i2 << 1;
        int i4 = -((~(i & 55)) & i2);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        values = i5 % 128;
        int i6 = i5 % 2;
        AbstractC9747w<View> abstractC9747w = this.valueOf;
        if (i6 == 0) {
            return get(abstractC9747w);
        }
        get(abstractC9747w);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9748x
    public LinearLayout values(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        linearLayout.setLayoutParams(layoutParams);
        int i = values;
        int i2 = i & 3;
        int i3 = ((i | 3) & (~i2)) + (i2 << 1);
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 25 / 0;
        }
        return linearLayout;
    }

    public void ThreeDS2ServiceInstance(boolean z) {
        int i;
        int i2 = values;
        int i3 = i2 | 95;
        int i4 = i3 << 1;
        int i5 = -(i3 & (~(i2 & 95)));
        ThreeDS2ServiceInstance = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
        if (!z) {
            int i6 = i2 & 97;
            ThreeDS2ServiceInstance = (i6 + ((i2 ^ 97) | i6)) % 128;
            i = 8;
        } else {
            int i7 = (i2 ^ 92) + ((i2 & 92) << 1);
            int i8 = (~i7) + (i7 << 1);
            int i9 = i8 % 128;
            ThreeDS2ServiceInstance = i9;
            int i10 = i8 % 2 == 0 ? 1 : 0;
            values = (((i9 & (-86)) | ((~i9) & 85)) + ((i9 & 85) << 1)) % 128;
            i = i10;
        }
        ThreeDS2Service().getChildAt(1).setVisibility(i);
        int i11 = values;
        int i12 = i11 & 31;
        ThreeDS2ServiceInstance = (((i11 | 31) & (~i12)) + (i12 << 1)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9748x
    public LinearLayout ThreeDS2ServiceInstance(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        int i = values;
        int i2 = (i & 65) + (i | 65);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return linearLayout;
        }
        throw null;
    }
}