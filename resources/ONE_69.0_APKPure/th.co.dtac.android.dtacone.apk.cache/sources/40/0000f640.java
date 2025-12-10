package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
public class SHA512Digest extends LongDigest {
    private static final int DIGEST_LENGTH = 64;

    public SHA512Digest() {
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA512Digest(this);
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
        Pack.longToBigEndian(this.f74913H7, bArr, i + 48);
        Pack.longToBigEndian(this.f74914H8, bArr, i + 56);
        reset();
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-512";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
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
        this.f74907H1 = 7640891576956012808L;
        this.f74908H2 = -4942790177534073029L;
        this.f74909H3 = 4354685564936845355L;
        this.f74910H4 = -6534734903238641935L;
        this.f74911H5 = 5840696475078001361L;
        this.f74912H6 = -7276294671716946913L;
        this.f74913H7 = 2270897969802886507L;
        this.f74914H8 = 6620516959819538809L;
    }

    public SHA512Digest(SHA512Digest sHA512Digest) {
        super(sHA512Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((SHA512Digest) memoable);
    }

    public SHA512Digest(byte[] bArr) {
        restoreState(bArr);
    }
}