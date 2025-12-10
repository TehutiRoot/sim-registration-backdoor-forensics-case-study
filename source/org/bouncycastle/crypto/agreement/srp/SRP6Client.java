package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes6.dex */
public class SRP6Client {

    /* renamed from: A */
    protected BigInteger f74765A;

    /* renamed from: B */
    protected BigInteger f74766B;
    protected BigInteger Key;

    /* renamed from: M1 */
    protected BigInteger f74767M1;

    /* renamed from: M2 */
    protected BigInteger f74768M2;

    /* renamed from: N */
    protected BigInteger f74769N;

    /* renamed from: S */
    protected BigInteger f74770S;

    /* renamed from: a */
    protected BigInteger f74771a;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f74772g;
    protected SecureRandom random;

    /* renamed from: u */
    protected BigInteger f74773u;

    /* renamed from: x */
    protected BigInteger f74774x;

    private BigInteger calculateS() {
        BigInteger calculateK = SRP6Util.calculateK(this.digest, this.f74769N, this.f74772g);
        return this.f74766B.subtract(this.f74772g.modPow(this.f74774x, this.f74769N).multiply(calculateK).mod(this.f74769N)).mod(this.f74769N).modPow(this.f74773u.multiply(this.f74774x).add(this.f74771a), this.f74769N);
    }

    public BigInteger calculateClientEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f74765A;
        if (bigInteger3 == null || (bigInteger = this.f74766B) == null || (bigInteger2 = this.f74770S) == null) {
            throw new CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        BigInteger calculateM1 = SRP6Util.calculateM1(this.digest, this.f74769N, bigInteger3, bigInteger, bigInteger2);
        this.f74767M1 = calculateM1;
        return calculateM1;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger validatePublicValue = SRP6Util.validatePublicValue(this.f74769N, bigInteger);
        this.f74766B = validatePublicValue;
        this.f74773u = SRP6Util.calculateU(this.digest, this.f74769N, this.f74765A, validatePublicValue);
        BigInteger calculateS = calculateS();
        this.f74770S = calculateS;
        return calculateS;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f74770S;
        if (bigInteger == null || this.f74767M1 == null || this.f74768M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger calculateKey = SRP6Util.calculateKey(this.digest, this.f74769N, bigInteger);
        this.Key = calculateKey;
        return calculateKey;
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f74774x = SRP6Util.calculateX(this.digest, this.f74769N, bArr, bArr2, bArr3);
        BigInteger selectPrivateValue = selectPrivateValue();
        this.f74771a = selectPrivateValue;
        BigInteger modPow = this.f74772g.modPow(selectPrivateValue, this.f74769N);
        this.f74765A = modPow;
        return modPow;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest, SecureRandom secureRandom) {
        this.f74769N = bigInteger;
        this.f74772g = bigInteger2;
        this.digest = digest;
        this.random = secureRandom;
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f74769N, this.f74772g, this.random);
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f74765A;
        if (bigInteger4 == null || (bigInteger2 = this.f74767M1) == null || (bigInteger3 = this.f74770S) == null) {
            throw new CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        }
        if (SRP6Util.calculateM2(this.digest, this.f74769N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            this.f74768M2 = bigInteger;
            return true;
        }
        return false;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), digest, secureRandom);
    }
}
