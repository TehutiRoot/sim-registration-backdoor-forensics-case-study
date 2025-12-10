package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes6.dex */
public class DSAParameters implements CipherParameters {

    /* renamed from: g */
    private BigInteger f75274g;

    /* renamed from: p */
    private BigInteger f75275p;

    /* renamed from: q */
    private BigInteger f75276q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f75274g = bigInteger3;
        this.f75275p = bigInteger;
        this.f75276q = bigInteger2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DSAParameters) {
            DSAParameters dSAParameters = (DSAParameters) obj;
            return dSAParameters.getP().equals(this.f75275p) && dSAParameters.getQ().equals(this.f75276q) && dSAParameters.getG().equals(this.f75274g);
        }
        return false;
    }

    public BigInteger getG() {
        return this.f75274g;
    }

    public BigInteger getP() {
        return this.f75275p;
    }

    public BigInteger getQ() {
        return this.f75276q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f75274g = bigInteger3;
        this.f75275p = bigInteger;
        this.f75276q = bigInteger2;
        this.validation = dSAValidationParameters;
    }
}