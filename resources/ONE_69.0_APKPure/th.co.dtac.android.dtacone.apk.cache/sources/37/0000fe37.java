package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes6.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* renamed from: a */
    private BigInteger f75404a;

    /* renamed from: p */
    private BigInteger f75405p;

    /* renamed from: q */
    private BigInteger f75406q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f75405p = bigInteger;
        this.f75406q = bigInteger2;
        this.f75404a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            return this.f75404a.equals(gOST3410PublicKeyParameterSetSpec.f75404a) && this.f75405p.equals(gOST3410PublicKeyParameterSetSpec.f75405p) && this.f75406q.equals(gOST3410PublicKeyParameterSetSpec.f75406q);
        }
        return false;
    }

    public BigInteger getA() {
        return this.f75404a;
    }

    public BigInteger getP() {
        return this.f75405p;
    }

    public BigInteger getQ() {
        return this.f75406q;
    }

    public int hashCode() {
        return (this.f75404a.hashCode() ^ this.f75405p.hashCode()) ^ this.f75406q.hashCode();
    }
}