package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.hs */
/* loaded from: classes5.dex */
public class C9453hs implements InterfaceC9379fn {
    public static final C9453hs get = new C9453hs();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9379fn
    public C9252ba valueOf(Context context, setLinksClickable setlinksclickable) {
        return C9252ba.ThreeDS2Service(context, setlinksclickable);
    }
}