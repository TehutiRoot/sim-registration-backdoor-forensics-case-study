package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes6.dex */
public class SRP6VerifierGenerator {

    /* renamed from: N */
    protected BigInteger f74785N;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f74786g;

    public BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f74786g.modPow(SRP6Util.calculateX(this.digest, this.f74785N, bArr, bArr2, bArr3), this.f74785N);
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest) {
        this.f74785N = bigInteger;
        this.f74786g = bigInteger2;
        this.digest = digest;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest) {
        this.f74785N = sRP6GroupParameters.getN();
        this.f74786g = sRP6GroupParameters.getG();
        this.digest = digest;
    }
}
