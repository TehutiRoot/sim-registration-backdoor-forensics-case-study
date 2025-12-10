package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.ho */
/* loaded from: classes5.dex */
public class C9449ho implements InterfaceC9387fv {
    public static final C9449ho valueOf = new C9449ho();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9387fv
    public setFastScrollEnabled.valueOf ThreeDS2Service() {
        setFastScrollEnabled.valueOf sDKVersion;
        sDKVersion = C9446hl.getSDKVersion();
        return sDKVersion;
    }
}