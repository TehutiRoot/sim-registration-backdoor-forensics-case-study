package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.AbstractC9689ql;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.ECParameterSpec;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qj */
/* loaded from: classes5.dex */
public class C9687qj {
    public static C9688qk ThreeDS2ServiceInstance(ECParameterSpec eCParameterSpec, String str, SecureRandom secureRandom) throws C9716rl {
        KeyPair values = new C9701qx(str, secureRandom).values(eCParameterSpec);
        C9688qk c9688qk = (C9688qk) AbstractC9689ql.valueOf.values(values.getPublic());
        c9688qk.ThreeDS2ServiceInstance(values.getPrivate());
        return c9688qk;
    }

    public static C9688qk get(ECParameterSpec eCParameterSpec) throws C9716rl {
        return ThreeDS2ServiceInstance(eCParameterSpec, null, null);
    }
}