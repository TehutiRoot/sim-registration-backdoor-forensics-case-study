package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.gj */
/* loaded from: classes5.dex */
public class C9417gj implements InterfaceC9379fn {
    public static final C9417gj ThreeDS2ServiceInstance = new C9417gj();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9379fn
    public C9252ba valueOf(Context context, setLinksClickable setlinksclickable) {
        return C9252ba.ThreeDS2Service(context, setlinksclickable);
    }
}