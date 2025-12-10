package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes6.dex */
public class GOST3410Parameters implements CipherParameters {

    /* renamed from: a */
    private BigInteger f75205a;

    /* renamed from: p */
    private BigInteger f75206p;

    /* renamed from: q */
    private BigInteger f75207q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f75206p = bigInteger;
        this.f75207q = bigInteger2;
        this.f75205a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410Parameters) {
            GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
            return gOST3410Parameters.getP().equals(this.f75206p) && gOST3410Parameters.getQ().equals(this.f75207q) && gOST3410Parameters.getA().equals(this.f75205a);
        }
        return false;
    }

    public BigInteger getA() {
        return this.f75205a;
    }

    public BigInteger getP() {
        return this.f75206p;
    }

    public BigInteger getQ() {
        return this.f75207q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f75206p.hashCode() ^ this.f75207q.hashCode()) ^ this.f75205a.hashCode();
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f75205a = bigInteger3;
        this.f75206p = bigInteger;
        this.f75207q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }
}
