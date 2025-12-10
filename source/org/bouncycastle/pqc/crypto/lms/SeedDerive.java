package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes6.dex */
class SeedDerive {

    /* renamed from: I */
    private final byte[] f75515I;
    private final Digest digest;

    /* renamed from: j */
    private int f75516j;
    private final byte[] masterSeed;

    /* renamed from: q */
    private int f75517q;

    public SeedDerive(byte[] bArr, byte[] bArr2, Digest digest) {
        this.f75515I = bArr;
        this.masterSeed = bArr2;
        this.digest = digest;
    }

    public void deriveSeed(byte[] bArr, boolean z) {
        deriveSeed(bArr, z, 0);
    }

    public byte[] getI() {
        return this.f75515I;
    }

    public int getJ() {
        return this.f75516j;
    }

    public byte[] getMasterSeed() {
        return this.masterSeed;
    }

    public int getQ() {
        return this.f75517q;
    }

    public void setJ(int i) {
        this.f75516j = i;
    }

    public void setQ(int i) {
        this.f75517q = i;
    }

    public void deriveSeed(byte[] bArr, boolean z, int i) {
        deriveSeed(bArr, i);
        if (z) {
            this.f75516j++;
        }
    }

    public byte[] deriveSeed(byte[] bArr, int i) {
        if (bArr.length >= this.digest.getDigestSize()) {
            Digest digest = this.digest;
            byte[] bArr2 = this.f75515I;
            digest.update(bArr2, 0, bArr2.length);
            this.digest.update((byte) (this.f75517q >>> 24));
            this.digest.update((byte) (this.f75517q >>> 16));
            this.digest.update((byte) (this.f75517q >>> 8));
            this.digest.update((byte) this.f75517q);
            this.digest.update((byte) (this.f75516j >>> 8));
            this.digest.update((byte) this.f75516j);
            this.digest.update((byte) -1);
            Digest digest2 = this.digest;
            byte[] bArr3 = this.masterSeed;
            digest2.update(bArr3, 0, bArr3.length);
            this.digest.doFinal(bArr, i);
            return bArr;
        }
        throw new IllegalArgumentException("target length is less than digest size.");
    }
}
