package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.gz */
/* loaded from: classes5.dex */
public class C9444gz implements InterfaceC9398fv {
    public static final C9444gz ThreeDS2ServiceInstance = new C9444gz();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9398fv
    public setFastScrollEnabled.valueOf ThreeDS2Service() {
        setFastScrollEnabled.valueOf sDKInfo;
        sDKInfo = C9437gs.getSDKInfo();
        return sDKInfo;
    }
}
