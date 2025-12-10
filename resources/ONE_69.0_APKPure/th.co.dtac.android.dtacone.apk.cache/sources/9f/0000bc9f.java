package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;
import okhttp3.internal.p026ws.WebSocketProtocol;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.jm */
/* loaded from: classes5.dex */
public class C9498jm implements InterfaceC9504js {
    private static int ThreeDS2Service = 1;
    private static int values;
    private final InterfaceC9504js ThreeDS2ServiceInstance;
    private final InterfaceC9504js get;
    private final C9571lz valueOf;

    public C9498jm(InterfaceC9504js interfaceC9504js, InterfaceC9504js interfaceC9504js2, C9571lz c9571lz) {
        this.ThreeDS2ServiceInstance = interfaceC9504js;
        this.get = interfaceC9504js2;
        this.valueOf = c9571lz;
    }

    private InterfaceC9504js valueOf() {
        int i = values;
        ThreeDS2Service = (((i & 117) - (~(i | 117))) - 1) % 128;
        if (!this.valueOf.get()) {
            InterfaceC9504js interfaceC9504js = this.ThreeDS2ServiceInstance;
            int i2 = values;
            int i3 = i2 & 121;
            int i4 = (i2 | 121) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 & i5) + (i5 | i4);
            ThreeDS2Service = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 7 / 0;
            }
            return interfaceC9504js;
        }
        int i8 = ThreeDS2Service;
        int i9 = i8 & 113;
        int i10 = -(-((i8 ^ 113) | i9));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        values = i11 % 128;
        if (i11 % 2 == 0) {
            return this.get;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9504js
    public InterfaceC9500jo ThreeDS2Service() {
        int i = values + 61;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            int i2 = 56 / 0;
            return valueOf().ThreeDS2Service();
        }
        return valueOf().ThreeDS2Service();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9504js
    public InterfaceC9501jp ThreeDS2ServiceInstance() {
        InterfaceC9501jp ThreeDS2ServiceInstance;
        int i = ThreeDS2Service + CameraActivity.REQUEST_CODE;
        values = i % 128;
        if (i % 2 != 0) {
            ThreeDS2ServiceInstance = valueOf().ThreeDS2ServiceInstance();
            int i2 = 62 / 0;
        } else {
            ThreeDS2ServiceInstance = valueOf().ThreeDS2ServiceInstance();
        }
        int i3 = ThreeDS2Service;
        values = ((((i3 & (-32)) | ((~i3) & 31)) - (~(-(-((i3 & 31) << 1))))) - 1) % 128;
        return ThreeDS2ServiceInstance;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9504js
    public InterfaceC9509jw get() {
        int i = values;
        int i2 = (i ^ 30) + ((i & 30) << 1);
        ThreeDS2Service = ((~i2) + (i2 << 1)) % 128;
        InterfaceC9509jw interfaceC9509jw = valueOf().get();
        int i3 = values;
        int i4 = i3 & 35;
        int i5 = -(-(i3 | 35));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        ThreeDS2Service = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 23 / 0;
        }
        return interfaceC9509jw;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9504js
    public InterfaceC9502jq values() {
        int i = values;
        int i2 = i & 81;
        int i3 = ((i ^ 81) | i2) << 1;
        int i4 = -((i | 81) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        ThreeDS2Service = i5 % 128;
        int i6 = i5 % 2;
        InterfaceC9504js valueOf = valueOf();
        if (i6 != 0) {
            return valueOf.values();
        }
        valueOf.values();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9504js
    public InterfaceC9496jk ThreeDS2ServiceInstance(UiCustomization.ButtonType buttonType) {
        int i = ThreeDS2Service;
        int i2 = ((i | WebSocketProtocol.PAYLOAD_SHORT) << 1) - (i ^ WebSocketProtocol.PAYLOAD_SHORT);
        values = ((~i2) + (i2 << 1)) % 128;
        InterfaceC9496jk ThreeDS2ServiceInstance = valueOf().ThreeDS2ServiceInstance(buttonType);
        int i3 = values;
        int i4 = i3 & 51;
        ThreeDS2Service = ((((i3 | 51) & (~i4)) - (~(i4 << 1))) - 1) % 128;
        return ThreeDS2ServiceInstance;
    }
}