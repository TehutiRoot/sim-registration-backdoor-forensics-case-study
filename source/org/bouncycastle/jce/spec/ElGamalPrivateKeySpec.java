package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes6.dex */
public class ElGamalPrivateKeySpec extends ElGamalKeySpec {

    /* renamed from: x */
    private BigInteger f75314x;

    public ElGamalPrivateKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f75314x = bigInteger;
    }

    public BigInteger getX() {
        return this.f75314x;
    }
}
