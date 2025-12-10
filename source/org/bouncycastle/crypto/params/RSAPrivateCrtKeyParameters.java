package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes6.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {

    /* renamed from: dP */
    private BigInteger f75225dP;

    /* renamed from: dQ */
    private BigInteger f75226dQ;

    /* renamed from: e */
    private BigInteger f75227e;

    /* renamed from: p */
    private BigInteger f75228p;

    /* renamed from: q */
    private BigInteger f75229q;
    private BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.f75227e = bigInteger2;
        this.f75228p = bigInteger4;
        this.f75229q = bigInteger5;
        this.f75225dP = bigInteger6;
        this.f75226dQ = bigInteger7;
        this.qInv = bigInteger8;
    }

    public BigInteger getDP() {
        return this.f75225dP;
    }

    public BigInteger getDQ() {
        return this.f75226dQ;
    }

    public BigInteger getP() {
        return this.f75228p;
    }

    public BigInteger getPublicExponent() {
        return this.f75227e;
    }

    public BigInteger getQ() {
        return this.f75229q;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }
}
