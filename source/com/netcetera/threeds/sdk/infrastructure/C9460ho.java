package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.ho */
/* loaded from: classes5.dex */
public class C9460ho implements InterfaceC9398fv {
    public static final C9460ho valueOf = new C9460ho();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9398fv
    public setFastScrollEnabled.valueOf ThreeDS2Service() {
        setFastScrollEnabled.valueOf sDKVersion;
        sDKVersion = C9457hl.getSDKVersion();
        return sDKVersion;
    }
}
