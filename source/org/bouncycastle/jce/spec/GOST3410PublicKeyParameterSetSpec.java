package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes6.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* renamed from: a */
    private BigInteger f75320a;

    /* renamed from: p */
    private BigInteger f75321p;

    /* renamed from: q */
    private BigInteger f75322q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f75321p = bigInteger;
        this.f75322q = bigInteger2;
        this.f75320a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            return this.f75320a.equals(gOST3410PublicKeyParameterSetSpec.f75320a) && this.f75321p.equals(gOST3410PublicKeyParameterSetSpec.f75321p) && this.f75322q.equals(gOST3410PublicKeyParameterSetSpec.f75322q);
        }
        return false;
    }

    public BigInteger getA() {
        return this.f75320a;
    }

    public BigInteger getP() {
        return this.f75321p;
    }

    public BigInteger getQ() {
        return this.f75322q;
    }

    public int hashCode() {
        return (this.f75320a.hashCode() ^ this.f75321p.hashCode()) ^ this.f75322q.hashCode();
    }
}
