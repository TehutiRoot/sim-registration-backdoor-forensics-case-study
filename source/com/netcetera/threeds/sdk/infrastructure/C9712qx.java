package com.netcetera.threeds.sdk.infrastructure;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qx */
/* loaded from: classes5.dex */
public class C9712qx extends AbstractC9721rf {
    public C9712qx() {
        this(null, null);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9721rf
    public String ThreeDS2Service() {
        return "EC";
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9721rf
    public /* bridge */ /* synthetic */ boolean ThreeDS2ServiceInstance() {
        return super.ThreeDS2ServiceInstance();
    }

    public ECPublicKey valueOf(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) throws C9727rl {
        try {
            return (ECPublicKey) values().generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, bigInteger2), eCParameterSpec));
        } catch (InvalidKeySpecException e) {
            throw new C9727rl("Invalid key spec: " + e, e);
        }
    }

    public ECPrivateKey values(BigInteger bigInteger, ECParameterSpec eCParameterSpec) throws C9727rl {
        try {
            return (ECPrivateKey) values().generatePrivate(new ECPrivateKeySpec(bigInteger, eCParameterSpec));
        } catch (InvalidKeySpecException e) {
            throw new C9727rl("Invalid key spec: " + e, e);
        }
    }

    public C9712qx(String str, SecureRandom secureRandom) {
        super(str, secureRandom);
    }

    public KeyPair values(ECParameterSpec eCParameterSpec) throws C9727rl {
        KeyPairGenerator valueOf = valueOf();
        try {
            SecureRandom secureRandom = this.get;
            if (secureRandom == null) {
                valueOf.initialize(eCParameterSpec);
            } else {
                valueOf.initialize(eCParameterSpec, secureRandom);
            }
            return valueOf.generateKeyPair();
        } catch (InvalidAlgorithmParameterException e) {
            throw new C9727rl("Unable to create EC key pair with spec " + eCParameterSpec, e);
        }
    }
}
