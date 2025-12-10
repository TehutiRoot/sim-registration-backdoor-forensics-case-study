package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cb */
/* loaded from: classes5.dex */
public class C9284cb {
    private static int getSDKInfo = 1;
    private static int initialize;
    private final setWidth ThreeDS2Service;
    private final com.netcetera.threeds.sdk.api.p018ui.ProgressView ThreeDS2ServiceInstance;
    private final InterfaceC9504js get;
    private final InterfaceC9577me<Activity> getWarnings;
    private final InterfaceC9390fy valueOf;
    private final Activity values;

    public C9284cb(InterfaceC9504js interfaceC9504js, Activity activity, setWidth setwidth, InterfaceC9390fy interfaceC9390fy, com.netcetera.threeds.sdk.api.p018ui.ProgressView progressView, InterfaceC9577me<Activity> interfaceC9577me) {
        this.get = interfaceC9504js;
        this.values = activity;
        this.ThreeDS2Service = setwidth;
        this.valueOf = interfaceC9390fy;
        this.ThreeDS2ServiceInstance = progressView;
        this.getWarnings = interfaceC9577me;
    }

    public getProperty valueOf(InterfaceC9740size interfaceC9740size) {
        Handler handler = new Handler(Looper.getMainLooper());
        C9294ck values = C9294ck.values(this.get, this.ThreeDS2Service, this.valueOf, this.ThreeDS2ServiceInstance);
        this.getWarnings.ThreeDS2ServiceInstance(this.values, values);
        C9291ch c9291ch = new C9291ch(interfaceC9740size, values, handler);
        int i = getSDKInfo;
        int i2 = (i & (-8)) | ((~i) & 7);
        int i3 = -(-((i & 7) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        initialize = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return c9291ch;
    }
}