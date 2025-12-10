package com.netcetera.threeds.sdk.infrastructure;

import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.jj */
/* loaded from: classes5.dex */
public class C9506jj implements com.netcetera.threeds.sdk.api.p018ui.ProgressView {
    private static int ThreeDS2Service = 1;
    private static int valueOf;
    private final C9611na get;
    private final com.netcetera.threeds.sdk.api.p018ui.ProgressView values;

    public C9506jj(com.netcetera.threeds.sdk.api.p018ui.ProgressView progressView, C9611na c9611na) {
        this.values = progressView;
        this.get = c9611na;
    }

    @Override // com.netcetera.threeds.sdk.api.p018ui.ProgressView
    public void hideProgress() {
        valueOf = (ThreeDS2Service + 81) % 128;
        if (!this.get.valueOf()) {
            int i = ThreeDS2Service;
            int i2 = ((i ^ 62) + ((i & 62) << 1)) - 1;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            this.values.hideProgress();
            if (i3 == 0) {
                int i4 = valueOf;
                int i5 = i4 & 121;
                int i6 = -(-(i4 | 121));
                ThreeDS2Service = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
            } else {
                throw null;
            }
        }
        int i7 = valueOf;
        int i8 = (i7 ^ CameraActivity.REQUEST_CODE) + ((i7 & CameraActivity.REQUEST_CODE) << 1);
        ThreeDS2Service = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.p018ui.ProgressView
    public boolean isProgressShown() {
        int i = valueOf;
        int i2 = i & 75;
        int i3 = ((i ^ 75) | i2) << 1;
        int i4 = -((i | 75) & (~i2));
        ThreeDS2Service = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        boolean isProgressShown = this.values.isProgressShown();
        int i5 = valueOf;
        ThreeDS2Service = (((i5 | 11) << 1) - (((~i5) & 11) | (i5 & (-12)))) % 128;
        return isProgressShown;
    }

    @Override // com.netcetera.threeds.sdk.api.p018ui.ProgressView
    public void showProgress() {
        int i = ThreeDS2Service;
        int i2 = (i ^ 63) + ((i & 63) << 1);
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            if (!this.get.valueOf()) {
                int i3 = ThreeDS2Service;
                valueOf = (((i3 & 74) + (i3 | 74)) - 1) % 128;
                this.values.showProgress();
                int i4 = valueOf;
                int i5 = (i4 | 43) << 1;
                int i6 = -(i4 ^ 43);
                ThreeDS2Service = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
            }
            int i7 = valueOf;
            int i8 = ((i7 ^ 76) + ((i7 & 76) << 1)) - 1;
            ThreeDS2Service = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 99 / 0;
                return;
            }
            return;
        }
        this.get.valueOf();
        throw null;
    }
}
