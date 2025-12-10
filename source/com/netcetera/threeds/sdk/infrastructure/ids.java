package com.netcetera.threeds.sdk.infrastructure;

import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class ids {
    private static int ThreeDS2ServiceInstance = 1;
    private static int values;
    private final int ThreeDS2Service;
    private final int get;

    public ids(int i, int i2) {
        this.ThreeDS2Service = i;
        this.get = i2;
    }

    public int ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInstance;
        int i2 = (i & 77) + (i | 77);
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ThreeDS2Service;
        }
        throw null;
    }

    public int values() {
        int i = values;
        int i2 = (i ^ CameraActivity.REQUEST_CODE) + ((i & CameraActivity.REQUEST_CODE) << 1);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return this.get;
        }
        throw null;
    }
}
