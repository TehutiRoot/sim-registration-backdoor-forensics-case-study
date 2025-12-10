package com.netcetera.threeds.sdk.infrastructure;

import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setTitleMarginStart implements setCustomSelectionActionModeCallback {
    private static int getWarnings = 1;
    private static int valueOf;
    private final Boolean ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final String get;
    private final String values;

    public setTitleMarginStart(Boolean bool, String str, String str2, String str3) {
        this.ThreeDS2Service = bool;
        this.get = str;
        this.ThreeDS2ServiceInstance = str2;
        this.values = str3;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomSelectionActionModeCallback
    public String ThreeDS2Service() {
        int i = valueOf;
        int i2 = (i ^ 85) + ((i & 85) << 1);
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ThreeDS2ServiceInstance;
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomSelectionActionModeCallback
    public Boolean ThreeDS2ServiceInstance() {
        int i = getWarnings;
        int i2 = (((i ^ 40) + ((i & 40) << 1)) - 1) % 128;
        valueOf = i2;
        Boolean bool = this.ThreeDS2Service;
        int i3 = i2 & CameraActivity.REQUEST_CODE;
        int i4 = (i2 | CameraActivity.REQUEST_CODE) & (~i3);
        int i5 = i3 << 1;
        getWarnings = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
        return bool;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomSelectionActionModeCallback
    public String get() {
        int i = getWarnings;
        int i2 = ((((i | 92) << 1) - (i ^ 92)) - 1) % 128;
        valueOf = i2;
        String str = this.get;
        int i3 = i2 & 67;
        getWarnings = (i3 + ((i2 ^ 67) | i3)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomSelectionActionModeCallback
    public String valueOf() {
        int i = valueOf;
        String str = this.values;
        int i2 = (i & 93) + (i | 93);
        getWarnings = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 16 / 0;
        }
        return str;
    }
}