package com.netcetera.threeds.sdk.infrastructure;

import io.reactivex.annotations.SchedulerSupport;
import java.security.Key;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qs */
/* loaded from: classes5.dex */
public class C9707qs extends AbstractC9694pm implements InterfaceC9706qr {
    public C9707qs() {
        valueOf(SchedulerSupport.NONE);
        ThreeDS2Service(EnumC9717rb.NONE);
    }

    private void valueOf(Key key) throws C9728rm {
        if (key == null) {
            return;
        }
        throw new C9728rm("JWS Plaintext (alg=none) must not use a key.");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9706qr
    public boolean ThreeDS2Service(byte[] bArr, Key key, byte[] bArr2, C9674or c9674or) throws C9727rl {
        valueOf(key);
        return bArr.length == 0;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9688pd
    public boolean ThreeDS2ServiceInstance() {
        return true;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9706qr
    public void ThreeDS2Service(Key key) throws C9728rm {
        valueOf(key);
    }
}
