package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes6.dex */
public class DSAParameters implements CipherParameters {

    /* renamed from: g */
    private BigInteger f75190g;

    /* renamed from: p */
    private BigInteger f75191p;

    /* renamed from: q */
    private BigInteger f75192q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f75190g = bigInteger3;
        this.f75191p = bigInteger;
        this.f75192q = bigInteger2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DSAParameters) {
            DSAParameters dSAParameters = (DSAParameters) obj;
            return dSAParameters.getP().equals(this.f75191p) && dSAParameters.getQ().equals(this.f75192q) && dSAParameters.getG().equals(this.f75190g);
        }
        return false;
    }

    public BigInteger getG() {
        return this.f75190g;
    }

    public BigInteger getP() {
        return this.f75191p;
    }

    public BigInteger getQ() {
        return this.f75192q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f75190g = bigInteger3;
        this.f75191p = bigInteger;
        this.f75192q = bigInteger2;
        this.validation = dSAValidationParameters;
    }
}
