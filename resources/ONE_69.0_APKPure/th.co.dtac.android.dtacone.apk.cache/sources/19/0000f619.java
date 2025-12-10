package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes6.dex */
public class SRP6Client {

    /* renamed from: A */
    protected BigInteger f74849A;

    /* renamed from: B */
    protected BigInteger f74850B;
    protected BigInteger Key;

    /* renamed from: M1 */
    protected BigInteger f74851M1;

    /* renamed from: M2 */
    protected BigInteger f74852M2;

    /* renamed from: N */
    protected BigInteger f74853N;

    /* renamed from: S */
    protected BigInteger f74854S;

    /* renamed from: a */
    protected BigInteger f74855a;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f74856g;
    protected SecureRandom random;

    /* renamed from: u */
    protected BigInteger f74857u;

    /* renamed from: x */
    protected BigInteger f74858x;

    private BigInteger calculateS() {
        BigInteger calculateK = SRP6Util.calculateK(this.digest, this.f74853N, this.f74856g);
        return this.f74850B.subtract(this.f74856g.modPow(this.f74858x, this.f74853N).multiply(calculateK).mod(this.f74853N)).mod(this.f74853N).modPow(this.f74857u.multiply(this.f74858x).add(this.f74855a), this.f74853N);
    }

    public BigInteger calculateClientEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f74849A;
        if (bigInteger3 == null || (bigInteger = this.f74850B) == null || (bigInteger2 = this.f74854S) == null) {
            throw new CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        BigInteger calculateM1 = SRP6Util.calculateM1(this.digest, this.f74853N, bigInteger3, bigInteger, bigInteger2);
        this.f74851M1 = calculateM1;
        return calculateM1;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger validatePublicValue = SRP6Util.validatePublicValue(this.f74853N, bigInteger);
        this.f74850B = validatePublicValue;
        this.f74857u = SRP6Util.calculateU(this.digest, this.f74853N, this.f74849A, validatePublicValue);
        BigInteger calculateS = calculateS();
        this.f74854S = calculateS;
        return calculateS;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f74854S;
        if (bigInteger == null || this.f74851M1 == null || this.f74852M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger calculateKey = SRP6Util.calculateKey(this.digest, this.f74853N, bigInteger);
        this.Key = calculateKey;
        return calculateKey;
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f74858x = SRP6Util.calculateX(this.digest, this.f74853N, bArr, bArr2, bArr3);
        BigInteger selectPrivateValue = selectPrivateValue();
        this.f74855a = selectPrivateValue;
        BigInteger modPow = this.f74856g.modPow(selectPrivateValue, this.f74853N);
        this.f74849A = modPow;
        return modPow;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest, SecureRandom secureRandom) {
        this.f74853N = bigInteger;
        this.f74856g = bigInteger2;
        this.digest = digest;
        this.random = secureRandom;
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f74853N, this.f74856g, this.random);
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f74849A;
        if (bigInteger4 == null || (bigInteger2 = this.f74851M1) == null || (bigInteger3 = this.f74854S) == null) {
            throw new CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        }
        if (SRP6Util.calculateM2(this.digest, this.f74853N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            this.f74852M2 = bigInteger;
            return true;
        }
        return false;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), digest, secureRandom);
    }
}