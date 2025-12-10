package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
public class SHA384Digest extends LongDigest {
    private static final int DIGEST_LENGTH = 48;

    public SHA384Digest() {
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA384Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.longToBigEndian(this.f74907H1, bArr, i);
        Pack.longToBigEndian(this.f74908H2, bArr, i + 8);
        Pack.longToBigEndian(this.f74909H3, bArr, i + 16);
        Pack.longToBigEndian(this.f74910H4, bArr, i + 24);
        Pack.longToBigEndian(this.f74911H5, bArr, i + 32);
        Pack.longToBigEndian(this.f74912H6, bArr, i + 40);
        reset();
        return 48;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-384";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 48;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[getEncodedStateSize()];
        super.populateState(bArr);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.LongDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f74907H1 = -3766243637369397544L;
        this.f74908H2 = 7105036623409894663L;
        this.f74909H3 = -7973340178411365097L;
        this.f74910H4 = 1526699215303891257L;
        this.f74911H5 = 7436329637833083697L;
        this.f74912H6 = -8163818279084223215L;
        this.f74913H7 = -2662702644619276377L;
        this.f74914H8 = 5167115440072839076L;
    }

    public SHA384Digest(SHA384Digest sHA384Digest) {
        super(sHA384Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        super.copyIn((SHA384Digest) memoable);
    }

    public SHA384Digest(byte[] bArr) {
        restoreState(bArr);
    }
}