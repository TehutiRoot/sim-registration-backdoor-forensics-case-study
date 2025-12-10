package org.bouncycastle.crypto.digests;

import com.google.common.base.Ascii;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 20;

    /* renamed from: Y1 */
    private static final int f74877Y1 = 1518500249;

    /* renamed from: Y2 */
    private static final int f74878Y2 = 1859775393;

    /* renamed from: Y3 */
    private static final int f74879Y3 = -1894007588;

    /* renamed from: Y4 */
    private static final int f74880Y4 = -899497514;

    /* renamed from: H1 */
    private int f74881H1;

    /* renamed from: H2 */
    private int f74882H2;

    /* renamed from: H3 */
    private int f74883H3;

    /* renamed from: H4 */
    private int f74884H4;

    /* renamed from: H5 */
    private int f74885H5;

    /* renamed from: X */
    private int[] f74886X;
    private int xOff;

    public SHA1Digest() {
        this.f74886X = new int[80];
        reset();
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.f74881H1 = sHA1Digest.f74881H1;
        this.f74882H2 = sHA1Digest.f74882H2;
        this.f74883H3 = sHA1Digest.f74883H3;
        this.f74884H4 = sHA1Digest.f74884H4;
        this.f74885H5 = sHA1Digest.f74885H5;
        int[] iArr = sHA1Digest.f74886X;
        System.arraycopy(iArr, 0, this.f74886X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    /* renamed from: f */
    private int m24491f(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: g */
    private int m24490g(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    /* renamed from: h */
    private int m24489h(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.f74881H1, bArr, i);
        Pack.intToBigEndian(this.f74882H2, bArr, i + 4);
        Pack.intToBigEndian(this.f74883H3, bArr, i + 8);
        Pack.intToBigEndian(this.f74884H4, bArr, i + 12);
        Pack.intToBigEndian(this.f74885H5, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.xOff * 4) + 40];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f74881H1, bArr, 16);
        Pack.intToBigEndian(this.f74882H2, bArr, 20);
        Pack.intToBigEndian(this.f74883H3, bArr, 24);
        Pack.intToBigEndian(this.f74884H4, bArr, 28);
        Pack.intToBigEndian(this.f74885H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            Pack.intToBigEndian(this.f74886X[i], bArr, (i * 4) + 40);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.f74886X;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int i3 = this.f74881H1;
        int i4 = this.f74882H2;
        int i5 = this.f74883H3;
        int i6 = this.f74884H4;
        int i7 = this.f74885H5;
        int i8 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            int m24491f = i7 + ((i3 << 5) | (i3 >>> 27)) + m24491f(i4, i5, i6) + this.f74886X[i8] + f74877Y1;
            int i10 = (i4 >>> 2) | (i4 << 30);
            int m24491f2 = i6 + ((m24491f << 5) | (m24491f >>> 27)) + m24491f(i3, i10, i5) + this.f74886X[i8 + 1] + f74877Y1;
            int i11 = (i3 >>> 2) | (i3 << 30);
            int m24491f3 = i5 + ((m24491f2 << 5) | (m24491f2 >>> 27)) + m24491f(m24491f, i11, i10) + this.f74886X[i8 + 2] + f74877Y1;
            i7 = (m24491f >>> 2) | (m24491f << 30);
            int i12 = i8 + 4;
            i4 = i10 + ((m24491f3 << 5) | (m24491f3 >>> 27)) + m24491f(m24491f2, i7, i11) + this.f74886X[i8 + 3] + f74877Y1;
            i6 = (m24491f2 >>> 2) | (m24491f2 << 30);
            i8 += 5;
            i3 = i11 + ((i4 << 5) | (i4 >>> 27)) + m24491f(m24491f3, i6, i7) + this.f74886X[i12] + f74877Y1;
            i5 = (m24491f3 >>> 2) | (m24491f3 << 30);
        }
        for (int i13 = 0; i13 < 4; i13++) {
            int m24489h = i7 + ((i3 << 5) | (i3 >>> 27)) + m24489h(i4, i5, i6) + this.f74886X[i8] + f74878Y2;
            int i14 = (i4 >>> 2) | (i4 << 30);
            int m24489h2 = i6 + ((m24489h << 5) | (m24489h >>> 27)) + m24489h(i3, i14, i5) + this.f74886X[i8 + 1] + f74878Y2;
            int i15 = (i3 >>> 2) | (i3 << 30);
            int m24489h3 = i5 + ((m24489h2 << 5) | (m24489h2 >>> 27)) + m24489h(m24489h, i15, i14) + this.f74886X[i8 + 2] + f74878Y2;
            i7 = (m24489h >>> 2) | (m24489h << 30);
            int i16 = i8 + 4;
            i4 = i14 + ((m24489h3 << 5) | (m24489h3 >>> 27)) + m24489h(m24489h2, i7, i15) + this.f74886X[i8 + 3] + f74878Y2;
            i6 = (m24489h2 >>> 2) | (m24489h2 << 30);
            i8 += 5;
            i3 = i15 + ((i4 << 5) | (i4 >>> 27)) + m24489h(m24489h3, i6, i7) + this.f74886X[i16] + f74878Y2;
            i5 = (m24489h3 >>> 2) | (m24489h3 << 30);
        }
        for (int i17 = 0; i17 < 4; i17++) {
            int m24490g = i7 + ((i3 << 5) | (i3 >>> 27)) + m24490g(i4, i5, i6) + this.f74886X[i8] + f74879Y3;
            int i18 = (i4 >>> 2) | (i4 << 30);
            int m24490g2 = i6 + ((m24490g << 5) | (m24490g >>> 27)) + m24490g(i3, i18, i5) + this.f74886X[i8 + 1] + f74879Y3;
            int i19 = (i3 >>> 2) | (i3 << 30);
            int m24490g3 = i5 + ((m24490g2 << 5) | (m24490g2 >>> 27)) + m24490g(m24490g, i19, i18) + this.f74886X[i8 + 2] + f74879Y3;
            i7 = (m24490g >>> 2) | (m24490g << 30);
            int i20 = i8 + 4;
            i4 = i18 + ((m24490g3 << 5) | (m24490g3 >>> 27)) + m24490g(m24490g2, i7, i19) + this.f74886X[i8 + 3] + f74879Y3;
            i6 = (m24490g2 >>> 2) | (m24490g2 << 30);
            i8 += 5;
            i3 = i19 + ((i4 << 5) | (i4 >>> 27)) + m24490g(m24490g3, i6, i7) + this.f74886X[i20] + f74879Y3;
            i5 = (m24490g3 >>> 2) | (m24490g3 << 30);
        }
        for (int i21 = 0; i21 <= 3; i21++) {
            int m24489h4 = i7 + ((i3 << 5) | (i3 >>> 27)) + m24489h(i4, i5, i6) + this.f74886X[i8] + f74880Y4;
            int i22 = (i4 >>> 2) | (i4 << 30);
            int m24489h5 = i6 + ((m24489h4 << 5) | (m24489h4 >>> 27)) + m24489h(i3, i22, i5) + this.f74886X[i8 + 1] + f74880Y4;
            int i23 = (i3 >>> 2) | (i3 << 30);
            int m24489h6 = i5 + ((m24489h5 << 5) | (m24489h5 >>> 27)) + m24489h(m24489h4, i23, i22) + this.f74886X[i8 + 2] + f74880Y4;
            i7 = (m24489h4 >>> 2) | (m24489h4 << 30);
            int i24 = i8 + 4;
            i4 = i22 + ((m24489h6 << 5) | (m24489h6 >>> 27)) + m24489h(m24489h5, i7, i23) + this.f74886X[i8 + 3] + f74880Y4;
            i6 = (m24489h5 >>> 2) | (m24489h5 << 30);
            i8 += 5;
            i3 = i23 + ((i4 << 5) | (i4 >>> 27)) + m24489h(m24489h6, i6, i7) + this.f74886X[i24] + f74880Y4;
            i5 = (m24489h6 >>> 2) | (m24489h6 << 30);
        }
        this.f74881H1 += i3;
        this.f74882H2 += i4;
        this.f74883H3 += i5;
        this.f74884H4 += i6;
        this.f74885H5 += i7;
        this.xOff = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            this.f74886X[i25] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f74886X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << Ascii.CAN) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.f74886X;
        int i3 = this.xOff;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.xOff = i4;
        if (i4 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f74881H1 = 1732584193;
        this.f74882H2 = -271733879;
        this.f74883H3 = -1732584194;
        this.f74884H4 = 271733878;
        this.f74885H5 = -1009589776;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f74886X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.f74886X = new int[80];
        copyIn(sHA1Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.f74886X = new int[80];
        this.f74881H1 = Pack.bigEndianToInt(bArr, 16);
        this.f74882H2 = Pack.bigEndianToInt(bArr, 20);
        this.f74883H3 = Pack.bigEndianToInt(bArr, 24);
        this.f74884H4 = Pack.bigEndianToInt(bArr, 28);
        this.f74885H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            this.f74886X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 40);
        }
    }
}
