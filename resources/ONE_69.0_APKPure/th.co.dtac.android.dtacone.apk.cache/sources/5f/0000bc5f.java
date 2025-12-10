package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.hf */
/* loaded from: classes5.dex */
public class C9440hf implements InterfaceC9383fr {
    public static final C9440hf valueOf = new C9440hf();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9383fr
    public AbstractC9227ae ThreeDS2Service(Context context) {
        return new C9257be(context);
    }
}