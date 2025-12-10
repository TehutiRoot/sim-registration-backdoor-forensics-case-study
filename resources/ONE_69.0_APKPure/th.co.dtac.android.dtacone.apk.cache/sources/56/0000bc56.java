package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.gz */
/* loaded from: classes5.dex */
public class C9433gz implements InterfaceC9387fv {
    public static final C9433gz ThreeDS2ServiceInstance = new C9433gz();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9387fv
    public setFastScrollEnabled.valueOf ThreeDS2Service() {
        setFastScrollEnabled.valueOf sDKInfo;
        sDKInfo = C9426gs.getSDKInfo();
        return sDKInfo;
    }
}