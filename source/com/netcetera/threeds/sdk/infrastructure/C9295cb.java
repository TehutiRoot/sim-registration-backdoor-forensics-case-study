package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cb */
/* loaded from: classes5.dex */
public class C9295cb {
    private static int getSDKInfo = 1;
    private static int initialize;
    private final setWidth ThreeDS2Service;
    private final com.netcetera.threeds.sdk.api.p018ui.ProgressView ThreeDS2ServiceInstance;
    private final InterfaceC9515js get;
    private final InterfaceC9588me<Activity> getWarnings;
    private final InterfaceC9401fy valueOf;
    private final Activity values;

    public C9295cb(InterfaceC9515js interfaceC9515js, Activity activity, setWidth setwidth, InterfaceC9401fy interfaceC9401fy, com.netcetera.threeds.sdk.api.p018ui.ProgressView progressView, InterfaceC9588me<Activity> interfaceC9588me) {
        this.get = interfaceC9515js;
        this.values = activity;
        this.ThreeDS2Service = setwidth;
        this.valueOf = interfaceC9401fy;
        this.ThreeDS2ServiceInstance = progressView;
        this.getWarnings = interfaceC9588me;
    }

    public getProperty valueOf(InterfaceC9751size interfaceC9751size) {
        Handler handler = new Handler(Looper.getMainLooper());
        C9305ck values = C9305ck.values(this.get, this.ThreeDS2Service, this.valueOf, this.ThreeDS2ServiceInstance);
        this.getWarnings.ThreeDS2ServiceInstance(this.values, values);
        C9302ch c9302ch = new C9302ch(interfaceC9751size, values, handler);
        int i = getSDKInfo;
        int i2 = (i & (-8)) | ((~i) & 7);
        int i3 = -(-((i & 7) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        initialize = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return c9302ch;
    }
}
