package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ce */
/* loaded from: classes5.dex */
public class C9299ce extends AbstractC9285bt<FrameLayout> {
    private static int getSDKVersion = 0;
    private static int getWarnings = 1;
    getOrDefault ThreeDS2Service;
    private final InterfaceC9591mh ThreeDS2ServiceInstance;
    private final C9297cd get;
    private final InterfaceC9311compute valueOf;
    private final InterfaceC9515js values;

    public C9299ce(C9297cd c9297cd, InterfaceC9311compute interfaceC9311compute, InterfaceC9515js interfaceC9515js, InterfaceC9591mh interfaceC9591mh) {
        this.get = c9297cd;
        this.valueOf = interfaceC9311compute;
        this.values = interfaceC9515js;
        this.ThreeDS2ServiceInstance = interfaceC9591mh;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9283br
    public /* synthetic */ View ThreeDS2Service(Context context) {
        int i = getWarnings;
        int i2 = i & 109;
        int i3 = -(-((i ^ 109) | i2));
        getSDKVersion = ((i2 & i3) + (i3 | i2)) % 128;
        FrameLayout values = values(context);
        int i4 = getWarnings;
        int i5 = ((i4 ^ 115) | (i4 & 115)) << 1;
        int i6 = -(((~i4) & 115) | (i4 & (-116)));
        getSDKVersion = ((i5 & i6) + (i6 | i5)) % 128;
        return values;
    }

    public void ThreeDS2ServiceInstance(getServices getservices) {
        int i = getWarnings + 109;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        getOrDefault getordefault = this.ThreeDS2Service;
        if (getordefault != null) {
            getordefault.get(getservices);
            int i2 = getSDKVersion;
            getWarnings = (((i2 & 25) - (~(-(-(i2 | 25))))) - 1) % 128;
        }
        int i3 = getWarnings + 71;
        getSDKVersion = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public void get() {
        int i = getSDKVersion;
        getWarnings = (((i | 85) << 1) - (i ^ 85)) % 128;
        getOrDefault getordefault = this.ThreeDS2Service;
        if (getordefault != null) {
            int i2 = i ^ 5;
            int i3 = -(-((i & 5) << 1));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            getWarnings = i4 % 128;
            int i5 = i4 % 2;
            getordefault.values();
            if (i5 == 0) {
                throw null;
            }
        }
        int i6 = getSDKVersion;
        int i7 = ((i6 & (-114)) | ((~i6) & 113)) + ((i6 & 113) << 1);
        getWarnings = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt
    public /* synthetic */ void values(setAllCaps setallcaps, FrameLayout frameLayout) {
        int i = getSDKVersion;
        getWarnings = (((i | 21) << 1) - (i ^ 21)) % 128;
        ThreeDS2Service(setallcaps, frameLayout);
        int i2 = getSDKVersion;
        int i3 = i2 & 31;
        getWarnings = ((((i2 ^ 31) | i3) << 1) - ((i2 | 31) & (~i3))) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9283br
    public void ThreeDS2Service() {
        int i = getWarnings;
        int i2 = (((i | 77) << 1) - (i ^ 77)) % 128;
        getSDKVersion = i2;
        this.ThreeDS2Service = null;
        int i3 = i2 & 61;
        int i4 = (i2 ^ 61) | i3;
        getWarnings = ((i3 & i4) + (i3 | i4)) % 128;
    }

    public void values(InterfaceC9373er interfaceC9373er) {
        int i = getSDKVersion;
        int i2 = i & 13;
        getWarnings = (i2 + ((i ^ 13) | i2)) % 128;
        getOrDefault getordefault = this.ThreeDS2Service;
        if (getordefault != null) {
            getWarnings = (((i & 31) - (~(-(-(i | 31))))) - 1) % 128;
            getordefault.values(interfaceC9373er);
            int i3 = getSDKVersion;
            int i4 = i3 & 101;
            int i5 = -(-((i3 ^ 101) | i4));
            getWarnings = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
        }
        int i6 = getSDKVersion;
        int i7 = (i6 & (-66)) | ((~i6) & 65);
        int i8 = -(-((i6 & 65) << 1));
        getWarnings = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
    }

    public void ThreeDS2Service(InterfaceC9370eo interfaceC9370eo) {
        int i = getWarnings;
        int i2 = (i & 37) + (i | 37);
        getSDKVersion = i2 % 128;
        if (i2 % 2 == 0) {
            getOrDefault getordefault = this.ThreeDS2Service;
            if (getordefault != null) {
                getordefault.ThreeDS2ServiceInstance(interfaceC9370eo);
                int i3 = getWarnings;
                int i4 = i3 & 45;
                getSDKVersion = (((i3 | 45) & (~i4)) + (i4 << 1)) % 128;
            }
            getWarnings = (getSDKVersion + 105) % 128;
            return;
        }
        throw null;
    }

    public FrameLayout values(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(frameLayout, C9597mn.ThreeDS2ServiceInstance(), C9597mn.ThreeDS2ServiceInstance(0), C9597mn.ThreeDS2ServiceInstance(), C9597mn.ThreeDS2ServiceInstance());
        C9377ev.ThreeDS2ServiceInstance(frameLayout, this.values.get().ThreeDS2ServiceInstance());
        int i = getSDKVersion;
        getWarnings = ((i & 73) + (i | 73)) % 128;
        return frameLayout;
    }

    public InterfaceC9367elements ThreeDS2ServiceInstance() {
        int i = getSDKVersion;
        int i2 = ((i ^ 31) | (i & 31)) << 1;
        int i3 = -(((~i) & 31) | (i & (-32)));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        getWarnings = i4;
        getOrDefault getordefault = this.ThreeDS2Service;
        getSDKVersion = (((i4 | 17) << 1) - (i4 ^ 17)) % 128;
        return getordefault;
    }

    public final void ThreeDS2Service(setAllCaps setallcaps, FrameLayout frameLayout) {
        int i = getSDKVersion;
        int i2 = i & 115;
        int i3 = i | 115;
        getWarnings = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        frameLayout.removeAllViews();
        getOrDefault values = this.get.values(setallcaps, frameLayout.getContext());
        this.ThreeDS2Service = values;
        frameLayout.addView(values.ThreeDS2Service());
        this.ThreeDS2Service.valueOf(this.valueOf, setallcaps);
        int i4 = getSDKVersion;
        getWarnings = (((i4 ^ 66) + ((i4 & 66) << 1)) - 1) % 128;
    }
}
