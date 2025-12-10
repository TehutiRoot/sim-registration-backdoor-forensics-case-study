package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes6.dex */
public class SRP6Server {

    /* renamed from: A */
    protected BigInteger f74775A;

    /* renamed from: B */
    protected BigInteger f74776B;
    protected BigInteger Key;

    /* renamed from: M1 */
    protected BigInteger f74777M1;

    /* renamed from: M2 */
    protected BigInteger f74778M2;

    /* renamed from: N */
    protected BigInteger f74779N;

    /* renamed from: S */
    protected BigInteger f74780S;

    /* renamed from: b */
    protected BigInteger f74781b;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f74782g;
    protected SecureRandom random;

    /* renamed from: u */
    protected BigInteger f74783u;

    /* renamed from: v */
    protected BigInteger f74784v;

    private BigInteger calculateS() {
        return this.f74784v.modPow(this.f74783u, this.f74779N).multiply(this.f74775A).mod(this.f74779N).modPow(this.f74781b, this.f74779N);
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger validatePublicValue = SRP6Util.validatePublicValue(this.f74779N, bigInteger);
        this.f74775A = validatePublicValue;
        this.f74783u = SRP6Util.calculateU(this.digest, this.f74779N, validatePublicValue, this.f74776B);
        BigInteger calculateS = calculateS();
        this.f74780S = calculateS;
        return calculateS;
    }

    public BigInteger calculateServerEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f74775A;
        if (bigInteger3 == null || (bigInteger = this.f74777M1) == null || (bigInteger2 = this.f74780S) == null) {
            throw new CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        BigInteger calculateM2 = SRP6Util.calculateM2(this.digest, this.f74779N, bigInteger3, bigInteger, bigInteger2);
        this.f74778M2 = calculateM2;
        return calculateM2;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f74780S;
        if (bigInteger == null || this.f74777M1 == null || this.f74778M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger calculateKey = SRP6Util.calculateKey(this.digest, this.f74779N, bigInteger);
        this.Key = calculateKey;
        return calculateKey;
    }

    public BigInteger generateServerCredentials() {
        BigInteger calculateK = SRP6Util.calculateK(this.digest, this.f74779N, this.f74782g);
        this.f74781b = selectPrivateValue();
        BigInteger mod = calculateK.multiply(this.f74784v).mod(this.f74779N).add(this.f74782g.modPow(this.f74781b, this.f74779N)).mod(this.f74779N);
        this.f74776B = mod;
        return mod;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest, SecureRandom secureRandom) {
        this.f74779N = bigInteger;
        this.f74782g = bigInteger2;
        this.f74784v = bigInteger3;
        this.random = secureRandom;
        this.digest = digest;
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f74779N, this.f74782g, this.random);
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f74775A;
        if (bigInteger4 == null || (bigInteger2 = this.f74776B) == null || (bigInteger3 = this.f74780S) == null) {
            throw new CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        }
        if (SRP6Util.calculateM1(this.digest, this.f74779N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            this.f74777M1 = bigInteger;
            return true;
        }
        return false;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, BigInteger bigInteger, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), bigInteger, digest, secureRandom);
    }
}
