package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes6.dex */
public class SRP6GroupParameters {

    /* renamed from: N */
    private BigInteger f75230N;

    /* renamed from: g */
    private BigInteger f75231g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f75230N = bigInteger;
        this.f75231g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f75231g;
    }

    public BigInteger getN() {
        return this.f75230N;
    }
}
