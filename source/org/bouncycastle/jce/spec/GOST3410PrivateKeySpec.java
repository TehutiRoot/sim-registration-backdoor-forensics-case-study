package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes6.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* renamed from: a */
    private BigInteger f75316a;

    /* renamed from: p */
    private BigInteger f75317p;

    /* renamed from: q */
    private BigInteger f75318q;

    /* renamed from: x */
    private BigInteger f75319x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f75319x = bigInteger;
        this.f75317p = bigInteger2;
        this.f75318q = bigInteger3;
        this.f75316a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f75316a;
    }

    public BigInteger getP() {
        return this.f75317p;
    }

    public BigInteger getQ() {
        return this.f75318q;
    }

    public BigInteger getX() {
        return this.f75319x;
    }
}
