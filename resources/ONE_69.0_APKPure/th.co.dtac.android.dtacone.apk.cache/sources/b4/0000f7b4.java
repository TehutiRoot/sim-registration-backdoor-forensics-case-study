package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes6.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {

    /* renamed from: dP */
    private BigInteger f75309dP;

    /* renamed from: dQ */
    private BigInteger f75310dQ;

    /* renamed from: e */
    private BigInteger f75311e;

    /* renamed from: p */
    private BigInteger f75312p;

    /* renamed from: q */
    private BigInteger f75313q;
    private BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.f75311e = bigInteger2;
        this.f75312p = bigInteger4;
        this.f75313q = bigInteger5;
        this.f75309dP = bigInteger6;
        this.f75310dQ = bigInteger7;
        this.qInv = bigInteger8;
    }

    public BigInteger getDP() {
        return this.f75309dP;
    }

    public BigInteger getDQ() {
        return this.f75310dQ;
    }

    public BigInteger getP() {
        return this.f75312p;
    }

    public BigInteger getPublicExponent() {
        return this.f75311e;
    }

    public BigInteger getQ() {
        return this.f75313q;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }
}