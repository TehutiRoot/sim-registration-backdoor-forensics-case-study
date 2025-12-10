package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.dx */
/* loaded from: classes5.dex */
public class C9337dx extends AbstractC9272br<View> {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;
    private final com.netcetera.threeds.sdk.api.p018ui.ProgressView get;
    private final C9334du valueOf;
    private boolean values;

    public C9337dx(com.netcetera.threeds.sdk.api.p018ui.ProgressView progressView, C9334du c9334du) {
        this.get = progressView;
        this.valueOf = c9334du;
    }

    public static C9337dx get(com.netcetera.threeds.sdk.api.p018ui.ProgressView progressView) {
        C9337dx c9337dx = new C9337dx(progressView, new C9334du(false));
        int i = ThreeDS2Service;
        int i2 = i & 83;
        int i3 = (i | 83) & (~i2);
        int i4 = -(-(i2 << 1));
        ThreeDS2ServiceInstance = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        return c9337dx;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9272br
    public View ThreeDS2Service(Context context) {
        C9574mb valueOf;
        int i = ThreeDS2ServiceInstance;
        int i2 = (i ^ 34) + ((i & 34) << 1);
        int i3 = (~i2) + (i2 << 1);
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 != 0) {
            valueOf = this.valueOf.valueOf(context);
            int i4 = 96 / 0;
        } else {
            valueOf = this.valueOf.valueOf(context);
        }
        int i5 = ThreeDS2Service;
        int i6 = ((i5 & 28) + (i5 | 28)) - 1;
        ThreeDS2ServiceInstance = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 45 / 0;
        }
        return valueOf;
    }

    public void ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInstance;
        ThreeDS2Service = (((i ^ 94) + ((i & 94) << 1)) - 1) % 128;
        if (!this.values) {
            this.get.showProgress();
            int i2 = ThreeDS2ServiceInstance;
            ThreeDS2Service = ((i2 ^ 71) + ((i2 & 71) << 1)) % 128;
        } else {
            int i3 = (((i | 102) << 1) - (i ^ 102)) - 1;
            ThreeDS2Service = i3 % 128;
            if (i3 % 2 != 0) {
                this.valueOf.ThreeDS2ServiceInstance();
                int i4 = 68 / 0;
            } else {
                this.valueOf.ThreeDS2ServiceInstance();
            }
            int i5 = ThreeDS2ServiceInstance;
            int i6 = i5 & 77;
            int i7 = -(-(i5 | 77));
            ThreeDS2Service = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
        }
        int i8 = ThreeDS2ServiceInstance;
        int i9 = (-2) - (((i8 & 60) + (i8 | 60)) ^ (-1));
        ThreeDS2Service = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9272br
    public void ThreeDS2Service() {
        int i = ThreeDS2ServiceInstance;
        ThreeDS2Service = (((i ^ 61) - (~((i & 61) << 1))) - 1) % 128;
        this.valueOf.values();
        int i2 = ThreeDS2ServiceInstance;
        int i3 = i2 & 27;
        int i4 = i3 + ((i2 ^ 27) | i3);
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void get() {
        int i = ThreeDS2Service;
        int i2 = i & 1;
        int i3 = (((i ^ 1) | i2) << 1) - ((~i2) & (i | 1));
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 != 0) {
            if (!this.values) {
                this.get.hideProgress();
                int i4 = ThreeDS2Service;
                int i5 = i4 & 51;
                int i6 = (i4 | 51) & (~i5);
                int i7 = i5 << 1;
                ThreeDS2ServiceInstance = ((i6 ^ i7) + ((i6 & i7) << 1)) % 128;
            } else {
                int i8 = ((i & 31) - (~(i | 31))) - 1;
                ThreeDS2ServiceInstance = i8 % 128;
                if (i8 % 2 != 0) {
                    this.valueOf.get();
                } else {
                    this.valueOf.get();
                    throw null;
                }
            }
            this.values = true;
            int i9 = ThreeDS2Service;
            int i10 = i9 | 105;
            int i11 = i10 << 1;
            int i12 = -((~(i9 & 105)) & i10);
            int i13 = (i11 & i12) + (i12 | i11);
            ThreeDS2ServiceInstance = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 3 / 0;
                return;
            }
            return;
        }
        throw null;
    }
}