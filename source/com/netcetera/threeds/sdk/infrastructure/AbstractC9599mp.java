package com.netcetera.threeds.sdk.infrastructure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mp */
/* loaded from: classes5.dex */
public abstract class AbstractC9599mp implements InterfaceC9602ms {
    private static int ThreeDS2Service = 0;
    private static int valueOf = 1;
    private InterfaceC9516jt ThreeDS2ServiceInstance;

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public void ThreeDS2ServiceInstance(boolean z) {
        int i = ThreeDS2Service;
        int i2 = ((i ^ 86) + ((i & 86) << 1)) - 1;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 26 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public void get(Bundle bundle, boolean z) {
        int i = ThreeDS2Service + 49;
        valueOf = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public InterfaceC9516jt getSDKInfo() {
        int i = valueOf;
        int i2 = ((i ^ 98) + ((i & 98) << 1)) - 1;
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC9516jt interfaceC9516jt = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return interfaceC9516jt;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public void valueOf(boolean z) {
        int i = valueOf;
        int i2 = (i & (-8)) | ((~i) & 7);
        int i3 = (i & 7) << 1;
        ThreeDS2Service = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public void values(Bundle bundle, boolean z) {
        int i = ThreeDS2Service;
        int i2 = i & 109;
        int i3 = -(-(i | 109));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public void ThreeDS2ServiceInstance(InterfaceC9516jt interfaceC9516jt) {
        int i = valueOf;
        int i2 = ((i | 90) << 1) - (i ^ 90);
        int i3 = ((~i2) + (i2 << 1)) % 128;
        ThreeDS2Service = i3;
        this.ThreeDS2ServiceInstance = interfaceC9516jt;
        int i4 = i3 & 115;
        int i5 = -(-((i3 ^ 115) | i4));
        valueOf = (((i4 | i5) << 1) - (i4 ^ i5)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public void get(boolean z) {
        int i = valueOf;
        int i2 = (((i ^ 81) | (i & 81)) << 1) - (((~i) & 81) | (i & (-82)));
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public void values(boolean z) {
        int i = ThreeDS2Service;
        int i2 = i & 109;
        int i3 = -(-((i ^ 109) | i2));
        valueOf = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9602ms
    public View get(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, boolean z) {
        int i = ThreeDS2Service;
        int i2 = ((i & (-122)) | ((~i) & 121)) + ((i & 121) << 1);
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
            return null;
        }
        return null;
    }
}
