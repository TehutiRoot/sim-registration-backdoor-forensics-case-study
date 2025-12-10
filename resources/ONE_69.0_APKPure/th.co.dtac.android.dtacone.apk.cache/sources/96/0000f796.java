package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes6.dex */
public class GOST3410Parameters implements CipherParameters {

    /* renamed from: a */
    private BigInteger f75289a;

    /* renamed from: p */
    private BigInteger f75290p;

    /* renamed from: q */
    private BigInteger f75291q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f75290p = bigInteger;
        this.f75291q = bigInteger2;
        this.f75289a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410Parameters) {
            GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
            return gOST3410Parameters.getP().equals(this.f75290p) && gOST3410Parameters.getQ().equals(this.f75291q) && gOST3410Parameters.getA().equals(this.f75289a);
        }
        return false;
    }

    public BigInteger getA() {
        return this.f75289a;
    }

    public BigInteger getP() {
        return this.f75290p;
    }

    public BigInteger getQ() {
        return this.f75291q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f75290p.hashCode() ^ this.f75291q.hashCode()) ^ this.f75289a.hashCode();
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f75289a = bigInteger3;
        this.f75290p = bigInteger;
        this.f75291q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }
}