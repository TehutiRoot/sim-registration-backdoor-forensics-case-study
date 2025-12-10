package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.C9650np;
import org.slf4j.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.ny */
/* loaded from: classes5.dex */
public class C9658ny implements C9650np.get {
    private final Logger get;

    public C9658ny(Logger logger) {
        this.get = logger;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.C9650np.get
    public void valueOf(String str) {
        this.get.error(str);
    }
}
