package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.kc */
/* loaded from: classes5.dex */
public final class C9527kc implements InterfaceC9515js {
    private static int getSDKInfo = 1;
    private static int initialize;
    private final Map<String, InterfaceC9507jk> ThreeDS2Service;
    private final InterfaceC9507jk ThreeDS2ServiceInstance;
    private final InterfaceC9520jw cleanup;
    private final InterfaceC9512jp get;
    private final InterfaceC9511jo valueOf;
    private final InterfaceC9513jq values;

    private C9527kc(Map<String, InterfaceC9507jk> map, InterfaceC9512jp interfaceC9512jp, InterfaceC9513jq interfaceC9513jq, InterfaceC9511jo interfaceC9511jo, InterfaceC9507jk interfaceC9507jk, InterfaceC9520jw interfaceC9520jw) {
        this.ThreeDS2Service = map;
        this.get = interfaceC9512jp;
        this.values = interfaceC9513jq;
        this.valueOf = interfaceC9511jo;
        this.ThreeDS2ServiceInstance = interfaceC9507jk;
        this.cleanup = interfaceC9520jw;
    }

    public static InterfaceC9515js valueOf() {
        HashMap hashMap = new HashMap();
        C9526kb c9526kb = new C9526kb();
        C9523jz c9523jz = new C9523jz();
        C9522jy c9522jy = new C9522jy();
        InterfaceC9507jk onError = C9519jv.onError();
        InterfaceC9507jk sDKInfo = C9519jv.getSDKInfo();
        InterfaceC9507jk cleanup = C9519jv.cleanup();
        InterfaceC9507jk initialize2 = C9519jv.initialize();
        InterfaceC9507jk warnings = C9519jv.getWarnings();
        InterfaceC9507jk sDKVersion = C9519jv.getSDKVersion();
        InterfaceC9507jk ConfigParameters = C9519jv.ConfigParameters();
        InterfaceC9507jk onCompleted = C9519jv.onCompleted();
        hashMap.put(UiCustomization.ButtonType.SUBMIT.name(), sDKInfo);
        hashMap.put(UiCustomization.ButtonType.CONTINUE.name(), cleanup);
        hashMap.put(UiCustomization.ButtonType.NEXT.name(), initialize2);
        hashMap.put(UiCustomization.ButtonType.RESEND.name(), warnings);
        hashMap.put(UiCustomization.ButtonType.CANCEL.name(), sDKVersion);
        hashMap.put(UiCustomization.ButtonType.OPEN_OOB_APP.name(), ConfigParameters);
        hashMap.put(UiCustomization.ButtonType.ADD_CH.name(), onCompleted);
        C9527kc c9527kc = new C9527kc(hashMap, c9526kb, c9523jz, c9522jy, onError, new C9525ka());
        int i = initialize;
        getSDKInfo = (((i | 79) << 1) - (i ^ 79)) % 128;
        return c9527kc;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
    public InterfaceC9511jo ThreeDS2Service() {
        int i = getSDKInfo;
        InterfaceC9511jo interfaceC9511jo = this.valueOf;
        initialize = ((i ^ 15) + ((i & 15) << 1)) % 128;
        return interfaceC9511jo;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
    public InterfaceC9512jp ThreeDS2ServiceInstance() {
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

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
    public InterfaceC9520jw get() {
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

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
    public InterfaceC9513jq values() {
        int i = getSDKInfo;
        InterfaceC9513jq interfaceC9513jq = this.values;
        int i2 = i + 62;
        initialize = ((~i2) + (i2 << 1)) % 128;
        return interfaceC9513jq;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9515js
    public InterfaceC9507jk ThreeDS2ServiceInstance(UiCustomization.ButtonType buttonType) {
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
        InterfaceC9507jk valueOf = valueOf(str);
        int i9 = getSDKInfo;
        int i10 = (i9 ^ 97) + ((i9 & 97) << 1);
        initialize = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 30 / 0;
        }
        return valueOf;
    }

    public InterfaceC9507jk valueOf(String str) {
        int i = initialize;
        int i2 = i ^ 89;
        getSDKInfo = (((((i & 89) | i2) << 1) - (~(-i2))) - 1) % 128;
        InterfaceC9507jk interfaceC9507jk = (InterfaceC9507jk) C9664oh.ThreeDS2Service(this.ThreeDS2Service.get(str), this.ThreeDS2ServiceInstance);
        int i3 = initialize;
        int i4 = i3 ^ 75;
        int i5 = ((i3 & 75) | i4) << 1;
        int i6 = -i4;
        int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
        getSDKInfo = i7 % 128;
        if (i7 % 2 != 0) {
            return interfaceC9507jk;
        }
        throw null;
    }
}
