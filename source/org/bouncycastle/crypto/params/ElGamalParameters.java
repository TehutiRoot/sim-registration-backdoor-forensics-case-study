package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes6.dex */
public class ElGamalParameters implements CipherParameters {

    /* renamed from: g */
    private BigInteger f75200g;

    /* renamed from: l */
    private int f75201l;

    /* renamed from: p */
    private BigInteger f75202p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ElGamalParameters) {
            ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
            return elGamalParameters.getP().equals(this.f75202p) && elGamalParameters.getG().equals(this.f75200g) && elGamalParameters.getL() == this.f75201l;
        }
        return false;
    }

    public BigInteger getG() {
        return this.f75200g;
    }

    public int getL() {
        return this.f75201l;
    }

    public BigInteger getP() {
        return this.f75202p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f75201l;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f75200g = bigInteger2;
        this.f75202p = bigInteger;
        this.f75201l = i;
    }
}
