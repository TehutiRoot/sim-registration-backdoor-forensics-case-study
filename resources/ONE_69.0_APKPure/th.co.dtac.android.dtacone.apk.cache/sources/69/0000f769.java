package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Memoable;

/* loaded from: classes6.dex */
public class CramerShoupParameters implements CipherParameters {

    /* renamed from: H */
    private Digest f75251H;

    /* renamed from: g1 */
    private BigInteger f75252g1;

    /* renamed from: g2 */
    private BigInteger f75253g2;

    /* renamed from: p */
    private BigInteger f75254p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f75254p = bigInteger;
        this.f75252g1 = bigInteger2;
        this.f75253g2 = bigInteger3;
        Digest digest2 = (Digest) ((Memoable) digest).copy();
        this.f75251H = digest2;
        digest2.reset();
    }

    public boolean equals(Object obj) {
        if (obj instanceof CramerShoupParameters) {
            CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
            return cramerShoupParameters.getP().equals(this.f75254p) && cramerShoupParameters.getG1().equals(this.f75252g1) && cramerShoupParameters.getG2().equals(this.f75253g2);
        }
        return false;
    }

    public BigInteger getG1() {
        return this.f75252g1;
    }

    public BigInteger getG2() {
        return this.f75253g2;
    }

    public Digest getH() {
        return (Digest) ((Memoable) this.f75251H).copy();
    }

    public BigInteger getP() {
        return this.f75254p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG1().hashCode()) ^ getG2().hashCode();
    }
}