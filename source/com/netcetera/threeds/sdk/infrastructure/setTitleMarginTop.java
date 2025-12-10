package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Bitmap;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setTitleMarginTop implements setFilters {
    private static int getSDKVersion = 1;
    private static int getWarnings;
    private String ThreeDS2Service;
    private Bitmap ThreeDS2ServiceInstance;
    private String get;
    private final C9582lz valueOf;
    private Bitmap values;

    public setTitleMarginTop(C9582lz c9582lz) {
        this.valueOf = c9582lz;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFilters
    public void ThreeDS2Service(String str) {
        int i = getWarnings;
        this.ThreeDS2Service = str;
        int i2 = i + 11;
        getSDKVersion = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFilters
    public void get(String str) {
        int i = getWarnings;
        int i2 = i ^ 117;
        int i3 = (((((i & 117) | i2) << 1) - (~(-i2))) - 1) % 128;
        getSDKVersion = i3;
        this.get = str;
        int i4 = ((i3 | 104) << 1) - (i3 ^ 104);
        int i5 = (~i4) + (i4 << 1);
        getWarnings = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFilters
    public String valueOf() {
        String str;
        int i = getWarnings;
        int i2 = i + 109;
        getSDKVersion = i2 % 128;
        if (i2 % 2 == 0) {
            str = this.ThreeDS2Service;
            int i3 = 18 / 0;
        } else {
            str = this.ThreeDS2Service;
        }
        int i4 = ((i ^ 69) | (i & 69)) << 1;
        int i5 = -(((~i) & 69) | (i & (-70)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        getSDKVersion = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFilters
    public void values(Bitmap bitmap) {
        int i = getWarnings;
        int i2 = (i & (-108)) | ((~i) & 107);
        int i3 = (i & 107) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        getSDKVersion = i4 % 128;
        int i5 = i4 % 2;
        this.ThreeDS2ServiceInstance = bitmap;
        if (i5 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFilters
    public String ThreeDS2Service() {
        int i = getWarnings;
        int i2 = ((i ^ 105) + ((i & 105) << 1)) % 128;
        getSDKVersion = i2;
        String str = this.get;
        getWarnings = (i2 + 49) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelectAllOnFocus
    public Bitmap values() {
        Bitmap bitmap;
        getWarnings = (getSDKVersion + 79) % 128;
        if (!(!this.valueOf.get())) {
            int i = getWarnings;
            bitmap = this.ThreeDS2ServiceInstance;
            getSDKVersion = ((((i | 46) << 1) - (i ^ 46)) - 1) % 128;
        } else {
            bitmap = this.values;
            int i2 = getSDKVersion;
            getWarnings = ((i2 & 27) + (i2 | 27)) % 128;
        }
        Bitmap bitmap2 = (Bitmap) C9664oh.ThreeDS2Service(bitmap, this.values);
        int i3 = getSDKVersion;
        int i4 = (i3 ^ 105) + ((i3 & 105) << 1);
        getWarnings = i4 % 128;
        if (i4 % 2 == 0) {
            return bitmap2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFilters
    public void ThreeDS2Service(Bitmap bitmap) {
        int i = (getWarnings + CameraActivity.REQUEST_CODE) % 128;
        getSDKVersion = i;
        this.values = bitmap;
        getWarnings = ((i & 109) + (i | 109)) % 128;
    }
}
