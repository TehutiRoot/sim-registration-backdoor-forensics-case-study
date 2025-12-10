package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes6.dex */
public class ElGamalPublicKeySpec extends ElGamalKeySpec {

    /* renamed from: y */
    private BigInteger f75399y;

    public ElGamalPublicKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f75399y = bigInteger;
    }

    public BigInteger getY() {
        return this.f75399y;
    }
}