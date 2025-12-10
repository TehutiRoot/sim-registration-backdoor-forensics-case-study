package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes6.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: pk */
    private CramerShoupPublicKeyParameters f75171pk;

    /* renamed from: x1 */
    private BigInteger f75172x1;

    /* renamed from: x2 */
    private BigInteger f75173x2;

    /* renamed from: y1 */
    private BigInteger f75174y1;

    /* renamed from: y2 */
    private BigInteger f75175y2;

    /* renamed from: z */
    private BigInteger f75176z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f75172x1 = bigInteger;
        this.f75173x2 = bigInteger2;
        this.f75174y1 = bigInteger3;
        this.f75175y2 = bigInteger4;
        this.f75176z = bigInteger5;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (obj instanceof CramerShoupPrivateKeyParameters) {
            CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
            return cramerShoupPrivateKeyParameters.getX1().equals(this.f75172x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f75173x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f75174y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f75175y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f75176z) && super.equals(obj);
        }
        return false;
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.f75171pk;
    }

    public BigInteger getX1() {
        return this.f75172x1;
    }

    public BigInteger getX2() {
        return this.f75173x2;
    }

    public BigInteger getY1() {
        return this.f75174y1;
    }

    public BigInteger getY2() {
        return this.f75175y2;
    }

    public BigInteger getZ() {
        return this.f75176z;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.f75172x1.hashCode() ^ this.f75173x2.hashCode()) ^ this.f75174y1.hashCode()) ^ this.f75175y2.hashCode()) ^ this.f75176z.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.f75171pk = cramerShoupPublicKeyParameters;
    }
}
