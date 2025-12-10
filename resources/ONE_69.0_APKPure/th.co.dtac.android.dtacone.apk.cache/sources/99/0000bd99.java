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
public class C9701qx extends AbstractC9710rf {
    public C9701qx() {
        this(null, null);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9710rf
    public String ThreeDS2Service() {
        return "EC";
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9710rf
    public /* bridge */ /* synthetic */ boolean ThreeDS2ServiceInstance() {
        return super.ThreeDS2ServiceInstance();
    }

    public ECPublicKey valueOf(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) throws C9716rl {
        try {
            return (ECPublicKey) values().generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, bigInteger2), eCParameterSpec));
        } catch (InvalidKeySpecException e) {
            throw new C9716rl("Invalid key spec: " + e, e);
        }
    }

    public ECPrivateKey values(BigInteger bigInteger, ECParameterSpec eCParameterSpec) throws C9716rl {
        try {
            return (ECPrivateKey) values().generatePrivate(new ECPrivateKeySpec(bigInteger, eCParameterSpec));
        } catch (InvalidKeySpecException e) {
            throw new C9716rl("Invalid key spec: " + e, e);
        }
    }

    public C9701qx(String str, SecureRandom secureRandom) {
        super(str, secureRandom);
    }

    public KeyPair values(ECParameterSpec eCParameterSpec) throws C9716rl {
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
            throw new C9716rl("Unable to create EC key pair with spec " + eCParameterSpec, e);
        }
    }
}