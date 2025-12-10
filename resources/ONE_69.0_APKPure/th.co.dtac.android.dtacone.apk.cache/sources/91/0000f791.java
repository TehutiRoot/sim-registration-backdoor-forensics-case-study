package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes6.dex */
public class ElGamalParameters implements CipherParameters {

    /* renamed from: g */
    private BigInteger f75284g;

    /* renamed from: l */
    private int f75285l;

    /* renamed from: p */
    private BigInteger f75286p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ElGamalParameters) {
            ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
            return elGamalParameters.getP().equals(this.f75286p) && elGamalParameters.getG().equals(this.f75284g) && elGamalParameters.getL() == this.f75285l;
        }
        return false;
    }

    public BigInteger getG() {
        return this.f75284g;
    }

    public int getL() {
        return this.f75285l;
    }

    public BigInteger getP() {
        return this.f75286p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f75285l;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f75284g = bigInteger2;
        this.f75286p = bigInteger;
        this.f75285l = i;
    }
}