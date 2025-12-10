package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.math.p041ec.ECCurve;
import org.bouncycastle.math.p041ec.ECPoint;

/* loaded from: classes6.dex */
public class ECParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: G */
    private ECPoint f75307G;
    private ECCurve curve;

    /* renamed from: h */
    private BigInteger f75308h;

    /* renamed from: n */
    private BigInteger f75309n;
    private byte[] seed;

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this.curve = eCCurve;
        this.f75307G = eCPoint.normalize();
        this.f75309n = bigInteger;
        this.f75308h = BigInteger.valueOf(1L);
        this.seed = null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
            return getCurve().equals(eCParameterSpec.getCurve()) && getG().equals(eCParameterSpec.getG());
        }
        return false;
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f75307G;
    }

    public BigInteger getH() {
        return this.f75308h;
    }

    public BigInteger getN() {
        return this.f75309n;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public int hashCode() {
        return getCurve().hashCode() ^ getG().hashCode();
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this.curve = eCCurve;
        this.f75307G = eCPoint.normalize();
        this.f75309n = bigInteger;
        this.f75308h = bigInteger2;
        this.seed = null;
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.curve = eCCurve;
        this.f75307G = eCPoint.normalize();
        this.f75309n = bigInteger;
        this.f75308h = bigInteger2;
        this.seed = bArr;
    }
}
