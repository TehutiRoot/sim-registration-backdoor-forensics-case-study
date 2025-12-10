package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Memoable;

/* loaded from: classes6.dex */
public class CramerShoupParameters implements CipherParameters {

    /* renamed from: H */
    private Digest f75167H;

    /* renamed from: g1 */
    private BigInteger f75168g1;

    /* renamed from: g2 */
    private BigInteger f75169g2;

    /* renamed from: p */
    private BigInteger f75170p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f75170p = bigInteger;
        this.f75168g1 = bigInteger2;
        this.f75169g2 = bigInteger3;
        Digest digest2 = (Digest) ((Memoable) digest).copy();
        this.f75167H = digest2;
        digest2.reset();
    }

    public boolean equals(Object obj) {
        if (obj instanceof CramerShoupParameters) {
            CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
            return cramerShoupParameters.getP().equals(this.f75170p) && cramerShoupParameters.getG1().equals(this.f75168g1) && cramerShoupParameters.getG2().equals(this.f75169g2);
        }
        return false;
    }

    public BigInteger getG1() {
        return this.f75168g1;
    }

    public BigInteger getG2() {
        return this.f75169g2;
    }

    public Digest getH() {
        return (Digest) ((Memoable) this.f75167H).copy();
    }

    public BigInteger getP() {
        return this.f75170p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG1().hashCode()) ^ getG2().hashCode();
    }
}
