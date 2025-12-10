package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.hu */
/* loaded from: classes5.dex */
public class C9455hu implements InterfaceC9383fr {
    public static final C9455hu valueOf = new C9455hu();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9383fr
    public AbstractC9227ae ThreeDS2Service(Context context) {
        return new C9256bd(context);
    }
}