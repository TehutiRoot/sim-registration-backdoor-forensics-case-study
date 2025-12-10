package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cj */
/* loaded from: classes5.dex */
public class C9293cj extends AbstractC9274bt<LinearLayout> {
    private static int ThreeDS2ServiceInstance = 1;
    private static int valueOf;
    private final C9275bu ThreeDS2Service;
    final C9288ce get;
    private final C9302cq values;

    public C9293cj(C9288ce c9288ce, C9275bu c9275bu, C9302cq c9302cq) {
        this.get = c9288ce;
        this.ThreeDS2Service = c9275bu;
        this.values = c9302cq;
    }

    public static C9293cj get(C9286cd c9286cd, InterfaceC9504js interfaceC9504js, InterfaceC9390fy interfaceC9390fy) {
        C9302cq c9302cq = new C9302cq();
        InterfaceC9580mh interfaceC9580mh = C9585mm.get();
        C9293cj c9293cj = new C9293cj(new C9288ce(c9286cd, c9302cq, interfaceC9504js, interfaceC9580mh), new C9275bu(interfaceC9504js, c9302cq, interfaceC9580mh, interfaceC9390fy), c9302cq);
        int i = valueOf;
        ThreeDS2ServiceInstance = ((((i ^ 97) | (i & 97)) << 1) - (((~i) & 97) | (i & (-98)))) % 128;
        return c9293cj;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9272br
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

    public void ThreeDS2ServiceInstance(InterfaceC9300compute interfaceC9300compute) {
        int i = ThreeDS2ServiceInstance;
        valueOf = ((-2) - (~((i ^ 88) + ((i & 88) << 1)))) % 128;
        this.values.get(interfaceC9300compute);
        int i2 = ThreeDS2ServiceInstance;
        valueOf = ((i2 ^ 81) + ((i2 & 81) << 1)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9274bt
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

    public void ThreeDS2Service(InterfaceC9359eo interfaceC9359eo) {
        int i = valueOf;
        ThreeDS2ServiceInstance = ((i & 37) + (i | 37)) % 128;
        this.get.ThreeDS2Service(interfaceC9359eo);
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

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9272br
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

    public void get(InterfaceC9362er interfaceC9362er) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i ^ 37;
        int i3 = ((i & 37) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        valueOf = i5 % 128;
        int i6 = i5 % 2;
        this.get.values(interfaceC9362er);
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