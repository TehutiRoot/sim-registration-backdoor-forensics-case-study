package com.netcetera.threeds.sdk.infrastructure;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qm */
/* loaded from: classes5.dex */
public class C9701qm extends AbstractC9700ql {
    public C9701qm(RSAPublicKey rSAPublicKey) {
        super(rSAPublicKey);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9700ql
    public void ThreeDS2Service(Map<String, Object> map) {
        RSAPrivateKey valueOf = valueOf();
        if (valueOf != null) {
            get(map, "d", valueOf.getPrivateExponent());
            if (valueOf instanceof RSAPrivateCrtKey) {
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) valueOf;
                get(map, "p", rSAPrivateCrtKey.getPrimeP());
                get(map, OperatorName.SAVE, rSAPrivateCrtKey.getPrimeQ());
                get(map, "dp", rSAPrivateCrtKey.getPrimeExponentP());
                get(map, "dq", rSAPrivateCrtKey.getPrimeExponentQ());
                get(map, "qi", rSAPrivateCrtKey.getCrtCoefficient());
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9696qh
    public String ThreeDS2ServiceInstance() {
        return "RSA";
    }

    public RSAPrivateKey valueOf() {
        return (RSAPrivateKey) ((AbstractC9700ql) this).valueOf;
    }

    public RSAPublicKey values() {
        return (RSAPublicKey) this.ThreeDS2ServiceInstance;
    }

    public C9701qm(Map<String, Object> map) throws C9727rl {
        this(map, null);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9700ql
    public void valueOf(Map<String, Object> map) {
        RSAPublicKey values = values();
        get(map, OperatorName.ENDPATH, values.getModulus());
        get(map, "e", values.getPublicExponent());
    }

    public C9701qm(Map<String, Object> map, String str) throws C9727rl {
        super(map, str);
        BigInteger values = values(map, OperatorName.ENDPATH, true);
        BigInteger values2 = values(map, "e", true);
        C9719rd c9719rd = new C9719rd(str, null);
        this.ThreeDS2ServiceInstance = c9719rd.ThreeDS2ServiceInstance(values, values2);
        onCompleted();
        if (map.containsKey("d")) {
            BigInteger values3 = values(map, "d", false);
            if (map.containsKey("p")) {
                ((AbstractC9700ql) this).valueOf = c9719rd.ThreeDS2ServiceInstance(values, values2, values3, values(map, "p", false), values(map, OperatorName.SAVE, false), values(map, "dp", false), values(map, "dq", false), values(map, "qi", false));
            } else {
                ((AbstractC9700ql) this).valueOf = c9719rd.valueOf(values, values3);
            }
        }
        valueOf(OperatorName.ENDPATH, "e", "d", "p", OperatorName.SAVE, "dp", "dq", "qi");
    }
}
