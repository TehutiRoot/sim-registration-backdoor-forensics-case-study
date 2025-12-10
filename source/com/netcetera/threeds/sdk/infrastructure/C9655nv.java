package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.C9650np;
import org.slf4j.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.nv */
/* loaded from: classes5.dex */
public class C9655nv implements C9650np.get {
    private final Logger valueOf;

    public C9655nv(Logger logger) {
        this.valueOf = logger;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.C9650np.get
    public void valueOf(String str) {
        this.valueOf.warn(str);
    }
}
