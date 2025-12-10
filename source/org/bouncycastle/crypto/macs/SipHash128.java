package org.bouncycastle.crypto.macs;

import org.apache.commons.cli.HelpFormatter;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
public class SipHash128 extends SipHash {
    public SipHash128() {
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        int i2;
        this.f75105m = ((this.f75105m >>> ((7 - this.wordPos) << 3)) >>> 8) | ((((this.wordCount << 3) + i2) & 255) << 56);
        processMessageWord();
        this.f75108v2 ^= 238;
        applySipRounds(this.f75102d);
        long j = this.f75106v0;
        long j2 = this.f75107v1;
        long j3 = ((j ^ j2) ^ this.f75108v2) ^ this.f75109v3;
        this.f75107v1 = j2 ^ 221;
        applySipRounds(this.f75102d);
        reset();
        Pack.longToLittleEndian(j3, bArr, i);
        Pack.longToLittleEndian(((this.f75106v0 ^ this.f75107v1) ^ this.f75108v2) ^ this.f75109v3, bArr, i + 8);
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash128-" + this.f75101c + HelpFormatter.DEFAULT_OPT_PREFIX + this.f75102d;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public void reset() {
        super.reset();
        this.f75107v1 ^= 238;
    }

    public SipHash128(int i, int i2) {
        super(i, i2);
    }

    @Override // org.bouncycastle.crypto.macs.SipHash
    public long doFinal() throws DataLengthException, IllegalStateException {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }
}
