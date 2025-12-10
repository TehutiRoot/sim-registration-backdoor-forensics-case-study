package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes6.dex */
public class SRP6GroupParameters {

    /* renamed from: N */
    private BigInteger f75314N;

    /* renamed from: g */
    private BigInteger f75315g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f75314N = bigInteger;
        this.f75315g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f75315g;
    }

    public BigInteger getN() {
        return this.f75314N;
    }
}