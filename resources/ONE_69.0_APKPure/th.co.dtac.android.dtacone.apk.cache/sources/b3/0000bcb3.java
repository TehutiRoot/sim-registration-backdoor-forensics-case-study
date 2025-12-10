package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ke */
/* loaded from: classes5.dex */
public final class C9518ke implements InterfaceC9504js {
    private static int cleanup = 0;
    private static int getWarnings = 1;
    private final InterfaceC9501jp ThreeDS2Service;
    private final InterfaceC9496jk ThreeDS2ServiceInstance;
    private final InterfaceC9500jo get;
    private final InterfaceC9509jw getSDKVersion;
    private final InterfaceC9502jq valueOf;
    private final Map<String, InterfaceC9496jk> values;

    public C9518ke(Map<String, InterfaceC9496jk> map, InterfaceC9501jp interfaceC9501jp, InterfaceC9502jq interfaceC9502jq, InterfaceC9500jo interfaceC9500jo, InterfaceC9496jk interfaceC9496jk, InterfaceC9509jw interfaceC9509jw) {
        this.values = map;
        this.ThreeDS2Service = interfaceC9501jp;
        this.valueOf = interfaceC9502jq;
        this.get = interfaceC9500jo;
        this.ThreeDS2ServiceInstance = interfaceC9496jk;
        this.getSDKVersion = interfaceC9509jw;
    }

    public static InterfaceC9504js valueOf() {
        HashMap hashMap = new HashMap();
        C9519kf c9519kf = new C9519kf();
        C9517kd c9517kd = new C9517kd();
        C9521kh c9521kh = new C9521kh();
        InterfaceC9496jk ConfigParameters = C9520kg.ConfigParameters();
        InterfaceC9496jk cleanup2 = C9520kg.cleanup();
        InterfaceC9496jk sDKInfo = C9520kg.getSDKInfo();
        InterfaceC9496jk initialize = C9520kg.initialize();
        InterfaceC9496jk warnings = C9520kg.getWarnings();
        InterfaceC9496jk sDKVersion = C9520kg.getSDKVersion();
        InterfaceC9496jk onError = C9520kg.onError();
        InterfaceC9496jk createTransaction = C9520kg.createTransaction();
        hashMap.put(UiCustomization.ButtonType.SUBMIT.name(), cleanup2);
        hashMap.put(UiCustomization.ButtonType.CONTINUE.name(), sDKInfo);
        hashMap.put(UiCustomization.ButtonType.NEXT.name(), initialize);
        hashMap.put(UiCustomization.ButtonType.RESEND.name(), warnings);
        hashMap.put(UiCustomization.ButtonType.CANCEL.name(), sDKVersion);
        hashMap.put(UiCustomization.ButtonType.OPEN_OOB_APP.name(), onError);
        hashMap.put(UiCustomization.ButtonType.ADD_CH.name(), createTransaction);
        C9518ke c9518ke = new C9518ke(hashMap, c9519kf, c9517kd, c9521kh, ConfigParameters, new C9529km());
        int i = cleanup;
        int i2 = (i & (-58)) | ((~i) & 57);
        int i3 = -(-((i & 57) << 1));
        getWarnings = ((i2 & i3) + (i3 | i2)) % 128;
        return c9518ke;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9504js
    public InterfaceC9500jo ThreeDS2Service() {
        int i = getWarnings;
        int i2 = (((((i ^ 47) | (i & 47)) << 1) - (~(-(((~i) & 47) | (i & (-48)))))) - 1) % 128;
        cleanup = i2;
        InterfaceC9500jo interfaceC9500jo = this.get;
        int i3 = ((i2 ^ 109) | (i2 & 109)) << 1;
        int i4 = -(((~i2) & 109) | (i2 & (-110)));
        getWarnings = ((i3 & i4) + (i4 | i3)) % 128;
        return interfaceC9500jo;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9504js
    public InterfaceC9501jp ThreeDS2ServiceInstance() {
        int i = getWarnings;
        int i2 = i ^ 21;
        int i3 = ((i & 21) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        cleanup = i5 % 128;
        if (i5 % 2 == 0) {
            return this.ThreeDS2Service;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9504js
    public InterfaceC9509jw get() {
        int i = getWarnings;
        InterfaceC9509jw interfaceC9509jw = this.getSDKVersion;
        cleanup = (((i ^ 26) + ((i & 26) << 1)) - 1) % 128;
        return interfaceC9509jw;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9504js
    public InterfaceC9502jq values() {
        int i = cleanup;
        int i2 = i & 117;
        int i3 = ((i ^ 117) | i2) << 1;
        int i4 = -((i | 117) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        getWarnings = i5 % 128;
        if (i5 % 2 != 0) {
            return this.valueOf;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9504js
    public InterfaceC9496jk ThreeDS2ServiceInstance(UiCustomization.ButtonType buttonType) {
        int i = getWarnings;
        int i2 = i & 99;
        int i3 = ((i ^ 99) | i2) << 1;
        int i4 = -((~i2) & (i | 99));
        int i5 = ((i3 & i4) + (i3 | i4)) % 128;
        cleanup = i5;
        String str = null;
        if (buttonType != null) {
            int i6 = (i5 ^ 65) + ((i5 & 65) << 1);
            getWarnings = i6 % 128;
            if (i6 % 2 == 0) {
                buttonType.name();
                throw null;
            }
            str = buttonType.name();
        } else {
            int i7 = i & 25;
            int i8 = -(-((i ^ 25) | i7));
            cleanup = ((i7 & i8) + (i7 | i8)) % 128;
        }
        InterfaceC9496jk valueOf = valueOf(str);
        int i9 = cleanup;
        getWarnings = (((i9 & 14) + (i9 | 14)) - 1) % 128;
        return valueOf;
    }

    public InterfaceC9496jk valueOf(String str) {
        int i = getWarnings + 51;
        cleanup = i % 128;
        if (i % 2 != 0) {
            int i2 = 70 / 0;
            return (InterfaceC9496jk) C9653oh.ThreeDS2Service(this.values.get(str), this.ThreeDS2ServiceInstance);
        }
        return (InterfaceC9496jk) C9653oh.ThreeDS2Service(this.values.get(str), this.ThreeDS2ServiceInstance);
    }
}