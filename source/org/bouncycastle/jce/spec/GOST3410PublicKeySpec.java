package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes6.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* renamed from: a */
    private BigInteger f75323a;

    /* renamed from: p */
    private BigInteger f75324p;

    /* renamed from: q */
    private BigInteger f75325q;

    /* renamed from: y */
    private BigInteger f75326y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f75326y = bigInteger;
        this.f75324p = bigInteger2;
        this.f75325q = bigInteger3;
        this.f75323a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f75323a;
    }

    public BigInteger getP() {
        return this.f75324p;
    }

    public BigInteger getQ() {
        return this.f75325q;
    }

    public BigInteger getY() {
        return this.f75326y;
    }
}
