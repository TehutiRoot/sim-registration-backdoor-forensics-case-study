package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ke */
/* loaded from: classes5.dex */
public final class C9529ke implements InterfaceC9515js {
    private static int cleanup = 0;
    private static int getWarnings = 1;
    private final InterfaceC9512jp ThreeDS2Service;
    private final InterfaceC9507jk ThreeDS2ServiceInstance;
    private final InterfaceC9511jo get;
    private final InterfaceC9520jw getSDKVersion;
    private final InterfaceC9513jq valueOf;
    private final Map<String, InterfaceC9507jk> values;

    public C9529ke(Map<String, InterfaceC9507jk> map, InterfaceC9512jp interfaceC9512jp, InterfaceC9513jq interfaceC9513jq, InterfaceC9511jo interfaceC9511jo, InterfaceC9507jk interfaceC9507jk, InterfaceC9520jw interfaceC9520jw) {
        this.values = map;
        this.ThreeDS2Service = interfaceC9512jp;
        this.valueOf = interfaceC9513jq;
        this.get = interfaceC9511jo;
        this.ThreeDS2ServiceInstance = interfaceC9507jk;
        this.getSDKVersion = interfaceC9520jw;
    }

    public static InterfaceC9515js valueOf() {
        HashMap hashMap = new HashMap();
        C9530kf c9530kf = new C9530kf();
        C9528kd c9528kd = new C9528kd();
        C9532kh c9532kh = new C9532kh();
        InterfaceC9507jk ConfigParameters = C9531kg.ConfigParameters();
        InterfaceC9507jk cleanup2 = C9531kg.cleanup();
        InterfaceC9507jk sDKInfo = C9531kg.getSDKInfo();
        InterfaceC9507jk initialize = C9531kg.initialize();
        InterfaceC9507jk warnings = C9531kg.getWarnings();
        InterfaceC9507jk sDKVersion = C9531kg.getSDKVersion();
        InterfaceC9507jk onError = C9531kg.onError();
        InterfaceC9507jk createTransaction = C9531kg.createTransaction();
        hashMap.put(UiCustomization.ButtonType.SUBMIT.name(), cleanup2);
        hashMap.put(UiCustomization.ButtonType.CONTINUE.name(), sDKInfo);
        hashMap.put(UiCustomization.ButtonType.NEXT.name(), initialize);
        hashMap.put(UiCustomization.ButtonType.RESEND.name(), warnings);
        hashMap.put(UiCustomization.ButtonType.CANCEL.name(), sDKVersion);
        hashMap.put(UiCustomization.ButtonType.OPEN_OOB_APP.name(), onError);
        hashMap.put(UiCustomization.ButtonType.ADD_CH.name(), createTransaction);
        C9529ke c9529ke = new C9529ke(hashMap, c9530kf, c9528kd, c9532kh, ConfigParameters, new C9540km());
        int i = cleanup;
        int i2 = (i & (-58)) | ((~i) & 57);
        int i3 = -(-((i & 57) << 1));
        getWarnings = ((i2 & i3) + (i3 | i2)) % 128;
        return c9529ke;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
    public InterfaceC9511jo ThreeDS2Service() {
        int i = getWarnings;
        int i2 = (((((i ^ 47) | (i & 47)) << 1) - (~(-(((~i) & 47) | (i & (-48)))))) - 1) % 128;
        cleanup = i2;
        InterfaceC9511jo interfaceC9511jo = this.get;
        int i3 = ((i2 ^ 109) | (i2 & 109)) << 1;
        int i4 = -(((~i2) & 109) | (i2 & (-110)));
        getWarnings = ((i3 & i4) + (i4 | i3)) % 128;
        return interfaceC9511jo;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
    public InterfaceC9512jp ThreeDS2ServiceInstance() {
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

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
    public InterfaceC9520jw get() {
        int i = getWarnings;
        InterfaceC9520jw interfaceC9520jw = this.getSDKVersion;
        cleanup = (((i ^ 26) + ((i & 26) << 1)) - 1) % 128;
        return interfaceC9520jw;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
    public InterfaceC9513jq values() {
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

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
    public InterfaceC9507jk ThreeDS2ServiceInstance(UiCustomization.ButtonType buttonType) {
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
        InterfaceC9507jk valueOf = valueOf(str);
        int i9 = cleanup;
        getWarnings = (((i9 & 14) + (i9 | 14)) - 1) % 128;
        return valueOf;
    }

    public InterfaceC9507jk valueOf(String str) {
        int i = getWarnings + 51;
        cleanup = i % 128;
        if (i % 2 != 0) {
            int i2 = 70 / 0;
            return (InterfaceC9507jk) C9664oh.ThreeDS2Service(this.values.get(str), this.ThreeDS2ServiceInstance);
        }
        return (InterfaceC9507jk) C9664oh.ThreeDS2Service(this.values.get(str), this.ThreeDS2ServiceInstance);
    }
}
