package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes6.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: c */
    private BigInteger f75177c;

    /* renamed from: d */
    private BigInteger f75178d;

    /* renamed from: h */
    private BigInteger f75179h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f75177c = bigInteger;
        this.f75178d = bigInteger2;
        this.f75179h = bigInteger3;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (obj instanceof CramerShoupPublicKeyParameters) {
            CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
            return cramerShoupPublicKeyParameters.getC().equals(this.f75177c) && cramerShoupPublicKeyParameters.getD().equals(this.f75178d) && cramerShoupPublicKeyParameters.getH().equals(this.f75179h) && super.equals(obj);
        }
        return false;
    }

    public BigInteger getC() {
        return this.f75177c;
    }

    public BigInteger getD() {
        return this.f75178d;
    }

    public BigInteger getH() {
        return this.f75179h;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f75177c.hashCode() ^ this.f75178d.hashCode()) ^ this.f75179h.hashCode()) ^ super.hashCode();
    }
}
