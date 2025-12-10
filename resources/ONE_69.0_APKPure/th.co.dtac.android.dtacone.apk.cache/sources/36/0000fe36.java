package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes6.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* renamed from: a */
    private BigInteger f75400a;

    /* renamed from: p */
    private BigInteger f75401p;

    /* renamed from: q */
    private BigInteger f75402q;

    /* renamed from: x */
    private BigInteger f75403x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f75403x = bigInteger;
        this.f75401p = bigInteger2;
        this.f75402q = bigInteger3;
        this.f75400a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f75400a;
    }

    public BigInteger getP() {
        return this.f75401p;
    }

    public BigInteger getQ() {
        return this.f75402q;
    }

    public BigInteger getX() {
        return this.f75403x;
    }
}