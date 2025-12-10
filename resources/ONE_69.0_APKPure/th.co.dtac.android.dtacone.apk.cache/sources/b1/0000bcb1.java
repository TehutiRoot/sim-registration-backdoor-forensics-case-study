package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.kc */
/* loaded from: classes5.dex */
public final class C9516kc implements InterfaceC9504js {
    private static int getSDKInfo = 1;
    private static int initialize;
    private final Map<String, InterfaceC9496jk> ThreeDS2Service;
    private final InterfaceC9496jk ThreeDS2ServiceInstance;
    private final InterfaceC9509jw cleanup;
    private final InterfaceC9501jp get;
    private final InterfaceC9500jo valueOf;
    private final InterfaceC9502jq values;

    private C9516kc(Map<String, InterfaceC9496jk> map, InterfaceC9501jp interfaceC9501jp, InterfaceC9502jq interfaceC9502jq, InterfaceC9500jo interfaceC9500jo, InterfaceC9496jk interfaceC9496jk, InterfaceC9509jw interfaceC9509jw) {
        this.ThreeDS2Service = map;
        this.get = interfaceC9501jp;
        this.values = interfaceC9502jq;
        this.valueOf = interfaceC9500jo;
        this.ThreeDS2ServiceInstance = interfaceC9496jk;
        this.cleanup = interfaceC9509jw;
    }

    public static InterfaceC9504js valueOf() {
        HashMap hashMap = new HashMap();
        C9515kb c9515kb = new C9515kb();
        C9512jz c9512jz = new C9512jz();
        C9511jy c9511jy = new C9511jy();
        InterfaceC9496jk onError = C9508jv.onError();
        InterfaceC9496jk sDKInfo = C9508jv.getSDKInfo();
        InterfaceC9496jk cleanup = C9508jv.cleanup();
        InterfaceC9496jk initialize2 = C9508jv.initialize();
        InterfaceC9496jk warnings = C9508jv.getWarnings();
        InterfaceC9496jk sDKVersion = C9508jv.getSDKVersion();
        InterfaceC9496jk ConfigParameters = C9508jv.ConfigParameters();
        InterfaceC9496jk onCompleted = C9508jv.onCompleted();
        hashMap.put(UiCustomization.ButtonType.SUBMIT.name(), sDKInfo);
        hashMap.put(UiCustomization.ButtonType.CONTINUE.name(), cleanup);
        hashMap.put(UiCustomization.ButtonType.NEXT.name(), initialize2);
        hashMap.put(UiCustomization.ButtonType.RESEND.name(), warnings);
        hashMap.put(UiCustomization.ButtonType.CANCEL.name(), sDKVersion);
        hashMap.put(UiCustomization.ButtonType.OPEN_OOB_APP.name(), ConfigParameters);
        hashMap.put(UiCustomization.ButtonType.ADD_CH.name(), onCompleted);
        C9516kc c9516kc = new C9516kc(hashMap, c9515kb, c9512jz, c9511jy, onError, new C9514ka());
        int i = initialize;
        getSDKInfo = (((i | 79) << 1) - (i ^ 79)) % 128;
        return c9516kc;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9504js
    public InterfaceC9500jo ThreeDS2Service() {
        int i = getSDKInfo;
        InterfaceC9500jo interfaceC9500jo = this.valueOf;
        initialize = ((i ^ 15) + ((i & 15) << 1)) % 128;
        return interfaceC9500jo;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9504js
    public InterfaceC9501jp ThreeDS2ServiceInstance() {
        int i = getSDKInfo;
        int i2 = i & 15;
        int i3 = -(-((i ^ 15) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            return this.get;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9504js
    public InterfaceC9509jw get() {
        int i = getSDKInfo;
        int i2 = (i & (-66)) | ((~i) & 65);
        int i3 = (i & 65) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            return this.cleanup;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9504js
    public InterfaceC9502jq values() {
        int i = getSDKInfo;
        InterfaceC9502jq interfaceC9502jq = this.values;
        int i2 = i + 62;
        initialize = ((~i2) + (i2 << 1)) % 128;
        return interfaceC9502jq;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9504js
    public InterfaceC9496jk ThreeDS2ServiceInstance(UiCustomization.ButtonType buttonType) {
        String str;
        int i = getSDKInfo;
        int i2 = (((i | 11) << 1) - (i ^ 11)) % 128;
        initialize = i2;
        if (buttonType != null) {
            int i3 = (i & (-60)) | ((~i) & 59);
            int i4 = (i & 59) << 1;
            initialize = ((i3 & i4) + (i4 | i3)) % 128;
            str = buttonType.name();
            int i5 = initialize;
            int i6 = i5 | 31;
            getSDKInfo = ((i6 << 1) - ((~(i5 & 31)) & i6)) % 128;
        } else {
            int i7 = (i2 & (-96)) | ((~i2) & 95);
            int i8 = -(-((i2 & 95) << 1));
            getSDKInfo = ((i7 ^ i8) + ((i7 & i8) << 1)) % 128;
            str = null;
        }
        InterfaceC9496jk valueOf = valueOf(str);
        int i9 = getSDKInfo;
        int i10 = (i9 ^ 97) + ((i9 & 97) << 1);
        initialize = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 30 / 0;
        }
        return valueOf;
    }

    public InterfaceC9496jk valueOf(String str) {
        int i = initialize;
        int i2 = i ^ 89;
        getSDKInfo = (((((i & 89) | i2) << 1) - (~(-i2))) - 1) % 128;
        InterfaceC9496jk interfaceC9496jk = (InterfaceC9496jk) C9653oh.ThreeDS2Service(this.ThreeDS2Service.get(str), this.ThreeDS2ServiceInstance);
        int i3 = initialize;
        int i4 = i3 ^ 75;
        int i5 = ((i3 & 75) | i4) << 1;
        int i6 = -i4;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        getSDKInfo = i7 % 128;
        if (i7 % 2 != 0) {
            return interfaceC9496jk;
        }
        throw null;
    }
}