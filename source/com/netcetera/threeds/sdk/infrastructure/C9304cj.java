package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cj */
/* loaded from: classes5.dex */
public class C9304cj extends AbstractC9285bt<LinearLayout> {
    private static int ThreeDS2ServiceInstance = 1;
    private static int valueOf;
    private final C9286bu ThreeDS2Service;
    final C9299ce get;
    private final C9313cq values;

    public C9304cj(C9299ce c9299ce, C9286bu c9286bu, C9313cq c9313cq) {
        this.get = c9299ce;
        this.ThreeDS2Service = c9286bu;
        this.values = c9313cq;
    }

    public static C9304cj get(C9297cd c9297cd, InterfaceC9515js interfaceC9515js, InterfaceC9401fy interfaceC9401fy) {
        C9313cq c9313cq = new C9313cq();
        InterfaceC9591mh interfaceC9591mh = C9596mm.get();
        C9304cj c9304cj = new C9304cj(new C9299ce(c9297cd, c9313cq, interfaceC9515js, interfaceC9591mh), new C9286bu(interfaceC9515js, c9313cq, interfaceC9591mh, interfaceC9401fy), c9313cq);
        int i = valueOf;
        ThreeDS2ServiceInstance = ((((i ^ 97) | (i & 97)) << 1) - (((~i) & 97) | (i & (-98)))) % 128;
        return c9304cj;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9283br
    public /* synthetic */ View ThreeDS2Service(Context context) {
        int i = valueOf;
        int i2 = ((i & 88) + (i | 88)) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return get(context);
        }
        get(context);
        throw null;
    }

    public void ThreeDS2ServiceInstance(InterfaceC9311compute interfaceC9311compute) {
        int i = ThreeDS2ServiceInstance;
        valueOf = ((-2) - (~((i ^ 88) + ((i & 88) << 1)))) % 128;
        this.values.get(interfaceC9311compute);
        int i2 = ThreeDS2ServiceInstance;
        valueOf = ((i2 ^ 81) + ((i2 & 81) << 1)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt
    public /* synthetic */ void values(setAllCaps setallcaps, LinearLayout linearLayout) {
        ThreeDS2ServiceInstance = (valueOf + 109) % 128;
        get(setallcaps, linearLayout);
        int i = valueOf;
        int i2 = (i ^ 91) + ((i & 91) << 1);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
    }

    public void ThreeDS2Service(InterfaceC9370eo interfaceC9370eo) {
        int i = valueOf;
        ThreeDS2ServiceInstance = ((i & 37) + (i | 37)) % 128;
        this.get.ThreeDS2Service(interfaceC9370eo);
        int i2 = ThreeDS2ServiceInstance;
        int i3 = (((i2 | 39) << 1) - (~(-(((~i2) & 39) | (i2 & (-40)))))) - 1;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public void ThreeDS2ServiceInstance(getServices getservices) {
        int i = valueOf;
        int i2 = ((i ^ 45) | (i & 45)) << 1;
        int i3 = -(((~i) & 45) | (i & (-46)));
        ThreeDS2ServiceInstance = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        this.get.ThreeDS2ServiceInstance(getservices);
        int i4 = valueOf + 89;
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9283br
    public void ThreeDS2Service() {
        int i = (-2) - (~(valueOf + 16));
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            this.ThreeDS2Service.values();
            this.get.values();
            this.values.values();
            int i2 = valueOf;
            int i3 = i2 & 97;
            int i4 = ((i2 ^ 97) | i3) << 1;
            int i5 = -((i2 | 97) & (~i3));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            ThreeDS2ServiceInstance = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 88 / 0;
                return;
            }
            return;
        }
        this.ThreeDS2Service.values();
        this.get.values();
        this.values.values();
        throw null;
    }

    public void ThreeDS2ServiceInstance() {
        int i = valueOf;
        int i2 = i ^ 115;
        int i3 = ((i & 115) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i3 | i4);
        ThreeDS2ServiceInstance = i5 % 128;
        int i6 = i5 % 2;
        this.get.get();
        if (i6 == 0) {
            int i7 = 82 / 0;
        }
    }

    public LinearLayout get(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.addView(this.ThreeDS2Service.valueOf(context));
        linearLayout.addView(this.get.valueOf(context));
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 39;
        int i3 = ((i ^ 39) | i2) << 1;
        int i4 = -((i | 39) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        valueOf = i5 % 128;
        if (i5 % 2 == 0) {
            return linearLayout;
        }
        throw null;
    }

    public void get(InterfaceC9373er interfaceC9373er) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i ^ 37;
        int i3 = ((i & 37) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        valueOf = i5 % 128;
        int i6 = i5 % 2;
        this.get.values(interfaceC9373er);
        if (i6 != 0) {
            throw null;
        }
    }

    public void get(setAllCaps setallcaps, LinearLayout linearLayout) {
        int i = valueOf;
        int i2 = i & 107;
        int i3 = (i ^ 107) | i2;
        ThreeDS2ServiceInstance = ((i2 & i3) + (i3 | i2)) % 128;
        linearLayout.setVisibility(0);
        this.get.get(setallcaps);
        this.values.ThreeDS2Service(this.get.ThreeDS2ServiceInstance());
        int i4 = valueOf;
        int i5 = ((i4 | 53) << 1) - (i4 ^ 53);
        ThreeDS2ServiceInstance = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
