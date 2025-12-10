package org.bouncycastle.crypto.params;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.math.BigInteger;
import org.bouncycastle.asn1.p034x9.X9ECParameters;
import org.bouncycastle.math.p041ec.ECAlgorithms;
import org.bouncycastle.math.p041ec.ECConstants;
import org.bouncycastle.math.p041ec.ECCurve;
import org.bouncycastle.math.p041ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes6.dex */
public class ECDomainParameters implements ECConstants {

    /* renamed from: G */
    private final ECPoint f75195G;
    private final ECCurve curve;

    /* renamed from: h */
    private final BigInteger f75196h;
    private BigInteger hInv;

    /* renamed from: n */
    private final BigInteger f75197n;
    private final byte[] seed;

    public ECDomainParameters(X9ECParameters x9ECParameters) {
        this(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
    }

    public static ECPoint validatePublicPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCPoint != null) {
            ECPoint normalize = ECAlgorithms.importPoint(eCCurve, eCPoint).normalize();
            if (normalize.isInfinity()) {
                throw new IllegalArgumentException("Point at infinity");
            }
            if (normalize.isValid()) {
                return normalize;
            }
            throw new IllegalArgumentException("Point not on curve");
        }
        throw new NullPointerException("Point cannot be null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ECDomainParameters) {
            ECDomainParameters eCDomainParameters = (ECDomainParameters) obj;
            return this.curve.equals(eCDomainParameters.curve) && this.f75195G.equals(eCDomainParameters.f75195G) && this.f75197n.equals(eCDomainParameters.f75197n);
        }
        return false;
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f75195G;
    }

    public BigInteger getH() {
        return this.f75196h;
    }

    public synchronized BigInteger getHInv() {
        try {
            if (this.hInv == null) {
                this.hInv = BigIntegers.modOddInverseVar(this.f75197n, this.f75196h);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.hInv;
    }

    public BigInteger getN() {
        return this.f75197n;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public int hashCode() {
        return ((((this.curve.hashCode() ^ 1028) * 257) ^ this.f75195G.hashCode()) * 257) ^ this.f75197n.hashCode();
    }

    public BigInteger validatePrivateScalar(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.compareTo(ECConstants.ONE) < 0 || bigInteger.compareTo(getN()) >= 0) {
                throw new IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
            }
            return bigInteger;
        }
        throw new NullPointerException("Scalar cannot be null");
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, ECConstants.ONE, null);
    }

    public ECPoint validatePublicPoint(ECPoint eCPoint) {
        return validatePublicPoint(getCurve(), eCPoint);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.hInv = null;
        if (eCCurve == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException(OperatorName.ENDPATH);
        }
        this.curve = eCCurve;
        this.f75195G = validatePublicPoint(eCCurve, eCPoint);
        this.f75197n = bigInteger;
        this.f75196h = bigInteger2;
        this.seed = Arrays.clone(bArr);
    }
}
