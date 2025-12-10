package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes6.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: g */
    private BigInteger f75396g;

    /* renamed from: p */
    private BigInteger f75397p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f75397p = bigInteger;
        this.f75396g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f75396g;
    }

    public BigInteger getP() {
        return this.f75397p;
    }
}