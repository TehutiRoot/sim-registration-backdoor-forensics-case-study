package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.AbstractC9700ql;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.ECParameterSpec;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qj */
/* loaded from: classes5.dex */
public class C9698qj {
    public static C9699qk ThreeDS2ServiceInstance(ECParameterSpec eCParameterSpec, String str, SecureRandom secureRandom) throws C9727rl {
        KeyPair values = new C9712qx(str, secureRandom).values(eCParameterSpec);
        C9699qk c9699qk = (C9699qk) AbstractC9700ql.valueOf.values(values.getPublic());
        c9699qk.ThreeDS2ServiceInstance(values.getPrivate());
        return c9699qk;
    }

    public static C9699qk get(ECParameterSpec eCParameterSpec) throws C9727rl {
        return ThreeDS2ServiceInstance(eCParameterSpec, null, null);
    }
}
