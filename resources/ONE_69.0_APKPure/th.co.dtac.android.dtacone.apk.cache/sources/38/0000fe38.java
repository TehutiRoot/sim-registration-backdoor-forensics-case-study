package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes6.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* renamed from: a */
    private BigInteger f75407a;

    /* renamed from: p */
    private BigInteger f75408p;

    /* renamed from: q */
    private BigInteger f75409q;

    /* renamed from: y */
    private BigInteger f75410y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f75410y = bigInteger;
        this.f75408p = bigInteger2;
        this.f75409q = bigInteger3;
        this.f75407a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f75407a;
    }

    public BigInteger getP() {
        return this.f75408p;
    }

    public BigInteger getQ() {
        return this.f75409q;
    }

    public BigInteger getY() {
        return this.f75410y;
    }
}