package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bc */
/* loaded from: classes5.dex */
public class C9266bc extends AbstractC9758w<View> implements containsValue {
    private static int get = 1;
    private static int valueOf;
    private boolean ThreeDS2Service;
    private final containsKey ThreeDS2ServiceInstance;

    public C9266bc(containsKey containskey, Context context) {
        super(context);
        this.ThreeDS2ServiceInstance = containskey;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9758w
    public View get(Context context) {
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        view.setVisibility(8);
        int i = get;
        int i2 = i & 83;
        int i3 = (i ^ 83) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return view;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        int i = (-2) - (~(get + 48));
        valueOf = i % 128;
        if (i % 2 != 0) {
            int i2 = 34 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void values(getServices getservices) {
        int i = get;
        int i2 = i & 67;
        int i3 = -(-((i ^ 67) | i2));
        valueOf = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        if (this.ThreeDS2Service) {
            valueOf = (((i | 83) << 1) - (i ^ 83)) % 128;
            this.ThreeDS2ServiceInstance.get(getservices);
            int i4 = get;
            int i5 = i4 ^ 5;
            int i6 = (i4 & 5) << 1;
            valueOf = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
        }
        int i7 = get;
        valueOf = (((i7 | 85) << 1) - (i7 ^ 85)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void valueOf() {
        int i = get + 87;
        valueOf = i % 128;
        this.ThreeDS2Service = i % 2 == 0;
    }
}
