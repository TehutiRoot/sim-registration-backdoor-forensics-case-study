package com.netcetera.threeds.sdk.infrastructure;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.rd */
/* loaded from: classes5.dex */
public class C9708rd extends AbstractC9710rf {
    public C9708rd() {
        this(null, null);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9710rf
    public String ThreeDS2Service() {
        return "RSA";
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9710rf
    public /* bridge */ /* synthetic */ boolean ThreeDS2ServiceInstance() {
        return super.ThreeDS2ServiceInstance();
    }

    public RSAPrivateKey valueOf(BigInteger bigInteger, BigInteger bigInteger2) throws C9716rl {
        return ThreeDS2ServiceInstance(new RSAPrivateKeySpec(bigInteger, bigInteger2));
    }

    public C9708rd(String str, SecureRandom secureRandom) {
        super(str, secureRandom);
    }

    public RSAPublicKey ThreeDS2ServiceInstance(BigInteger bigInteger, BigInteger bigInteger2) throws C9716rl {
        try {
            return (RSAPublicKey) values().generatePublic(new RSAPublicKeySpec(bigInteger, bigInteger2));
        } catch (InvalidKeySpecException e) {
            throw new C9716rl("Invalid key spec: " + e, e);
        }
    }

    public RSAPrivateKey ThreeDS2ServiceInstance(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) throws C9716rl {
        return ThreeDS2ServiceInstance(new RSAPrivateCrtKeySpec(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8));
    }

    public RSAPrivateKey ThreeDS2ServiceInstance(RSAPrivateKeySpec rSAPrivateKeySpec) throws C9716rl {
        try {
            return (RSAPrivateKey) values().generatePrivate(rSAPrivateKeySpec);
        } catch (InvalidKeySpecException e) {
            throw new C9716rl("Invalid key spec: " + e, e);
        }
    }
}