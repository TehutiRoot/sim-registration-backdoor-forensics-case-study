package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;

/* loaded from: classes6.dex */
public class RIPEMD128Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 16;

    /* renamed from: H0 */
    private int f74846H0;

    /* renamed from: H1 */
    private int f74847H1;

    /* renamed from: H2 */
    private int f74848H2;

    /* renamed from: H3 */
    private int f74849H3;

    /* renamed from: X */
    private int[] f74850X;
    private int xOff;

    public RIPEMD128Digest() {
        this.f74850X = new int[16];
        reset();
    }

    /* renamed from: F1 */
    private int m24521F1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24517RL(i + m24516f1(i2, i3, i4) + i5, i6);
    }

    /* renamed from: F2 */
    private int m24520F2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24517RL(i + m24515f2(i2, i3, i4) + i5 + 1518500249, i6);
    }

    /* renamed from: F3 */
    private int m24519F3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24517RL(i + m24514f3(i2, i3, i4) + i5 + 1859775393, i6);
    }

    /* renamed from: F4 */
    private int m24518F4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24517RL(((i + m24513f4(i2, i3, i4)) + i5) - 1894007588, i6);
    }

    private int FF1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24517RL(i + m24516f1(i2, i3, i4) + i5, i6);
    }

    private int FF2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24517RL(i + m24515f2(i2, i3, i4) + i5 + 1836072691, i6);
    }

    private int FF3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24517RL(i + m24514f3(i2, i3, i4) + i5 + 1548603684, i6);
    }

    private int FF4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24517RL(i + m24513f4(i2, i3, i4) + i5 + 1352829926, i6);
    }

    /* renamed from: RL */
    private int m24517RL(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void copyIn(RIPEMD128Digest rIPEMD128Digest) {
        super.copyIn((GeneralDigest) rIPEMD128Digest);
        this.f74846H0 = rIPEMD128Digest.f74846H0;
        this.f74847H1 = rIPEMD128Digest.f74847H1;
        this.f74848H2 = rIPEMD128Digest.f74848H2;
        this.f74849H3 = rIPEMD128Digest.f74849H3;
        int[] iArr = rIPEMD128Digest.f74850X;
        System.arraycopy(iArr, 0, this.f74850X, 0, iArr.length);
        this.xOff = rIPEMD128Digest.xOff;
    }

    /* renamed from: f1 */
    private int m24516f1(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* renamed from: f2 */
    private int m24515f2(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: f3 */
    private int m24514f3(int i, int i2, int i3) {
        return (i | (~i2)) ^ i3;
    }

    /* renamed from: f4 */
    private int m24513f4(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    private void unpackWord(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new RIPEMD128Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        unpackWord(this.f74846H0, bArr, i);
        unpackWord(this.f74847H1, bArr, i + 4);
        unpackWord(this.f74848H2, bArr, i + 8);
        unpackWord(this.f74849H3, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "RIPEMD128";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i = this.f74846H0;
        int i2 = this.f74847H1;
        int i3 = this.f74848H2;
        int i4 = this.f74849H3;
        int m24521F1 = m24521F1(i, i2, i3, i4, this.f74850X[0], 11);
        int m24521F12 = m24521F1(i4, m24521F1, i2, i3, this.f74850X[1], 14);
        int m24521F13 = m24521F1(i3, m24521F12, m24521F1, i2, this.f74850X[2], 15);
        int m24521F14 = m24521F1(i2, m24521F13, m24521F12, m24521F1, this.f74850X[3], 12);
        int m24521F15 = m24521F1(m24521F1, m24521F14, m24521F13, m24521F12, this.f74850X[4], 5);
        int m24521F16 = m24521F1(m24521F12, m24521F15, m24521F14, m24521F13, this.f74850X[5], 8);
        int m24521F17 = m24521F1(m24521F13, m24521F16, m24521F15, m24521F14, this.f74850X[6], 7);
        int m24521F18 = m24521F1(m24521F14, m24521F17, m24521F16, m24521F15, this.f74850X[7], 9);
        int m24521F19 = m24521F1(m24521F15, m24521F18, m24521F17, m24521F16, this.f74850X[8], 11);
        int m24521F110 = m24521F1(m24521F16, m24521F19, m24521F18, m24521F17, this.f74850X[9], 13);
        int m24521F111 = m24521F1(m24521F17, m24521F110, m24521F19, m24521F18, this.f74850X[10], 14);
        int m24521F112 = m24521F1(m24521F18, m24521F111, m24521F110, m24521F19, this.f74850X[11], 15);
        int m24521F113 = m24521F1(m24521F19, m24521F112, m24521F111, m24521F110, this.f74850X[12], 6);
        int m24521F114 = m24521F1(m24521F110, m24521F113, m24521F112, m24521F111, this.f74850X[13], 7);
        int m24521F115 = m24521F1(m24521F111, m24521F114, m24521F113, m24521F112, this.f74850X[14], 9);
        int m24521F116 = m24521F1(m24521F112, m24521F115, m24521F114, m24521F113, this.f74850X[15], 8);
        int m24520F2 = m24520F2(m24521F113, m24521F116, m24521F115, m24521F114, this.f74850X[7], 7);
        int m24520F22 = m24520F2(m24521F114, m24520F2, m24521F116, m24521F115, this.f74850X[4], 6);
        int m24520F23 = m24520F2(m24521F115, m24520F22, m24520F2, m24521F116, this.f74850X[13], 8);
        int m24520F24 = m24520F2(m24521F116, m24520F23, m24520F22, m24520F2, this.f74850X[1], 13);
        int m24520F25 = m24520F2(m24520F2, m24520F24, m24520F23, m24520F22, this.f74850X[10], 11);
        int m24520F26 = m24520F2(m24520F22, m24520F25, m24520F24, m24520F23, this.f74850X[6], 9);
        int m24520F27 = m24520F2(m24520F23, m24520F26, m24520F25, m24520F24, this.f74850X[15], 7);
        int m24520F28 = m24520F2(m24520F24, m24520F27, m24520F26, m24520F25, this.f74850X[3], 15);
        int m24520F29 = m24520F2(m24520F25, m24520F28, m24520F27, m24520F26, this.f74850X[12], 7);
        int m24520F210 = m24520F2(m24520F26, m24520F29, m24520F28, m24520F27, this.f74850X[0], 12);
        int m24520F211 = m24520F2(m24520F27, m24520F210, m24520F29, m24520F28, this.f74850X[9], 15);
        int m24520F212 = m24520F2(m24520F28, m24520F211, m24520F210, m24520F29, this.f74850X[5], 9);
        int m24520F213 = m24520F2(m24520F29, m24520F212, m24520F211, m24520F210, this.f74850X[2], 11);
        int m24520F214 = m24520F2(m24520F210, m24520F213, m24520F212, m24520F211, this.f74850X[14], 7);
        int m24520F215 = m24520F2(m24520F211, m24520F214, m24520F213, m24520F212, this.f74850X[11], 13);
        int m24520F216 = m24520F2(m24520F212, m24520F215, m24520F214, m24520F213, this.f74850X[8], 12);
        int m24519F3 = m24519F3(m24520F213, m24520F216, m24520F215, m24520F214, this.f74850X[3], 11);
        int m24519F32 = m24519F3(m24520F214, m24519F3, m24520F216, m24520F215, this.f74850X[10], 13);
        int m24519F33 = m24519F3(m24520F215, m24519F32, m24519F3, m24520F216, this.f74850X[14], 6);
        int m24519F34 = m24519F3(m24520F216, m24519F33, m24519F32, m24519F3, this.f74850X[4], 7);
        int m24519F35 = m24519F3(m24519F3, m24519F34, m24519F33, m24519F32, this.f74850X[9], 14);
        int m24519F36 = m24519F3(m24519F32, m24519F35, m24519F34, m24519F33, this.f74850X[15], 9);
        int m24519F37 = m24519F3(m24519F33, m24519F36, m24519F35, m24519F34, this.f74850X[8], 13);
        int m24519F38 = m24519F3(m24519F34, m24519F37, m24519F36, m24519F35, this.f74850X[1], 15);
        int m24519F39 = m24519F3(m24519F35, m24519F38, m24519F37, m24519F36, this.f74850X[2], 14);
        int m24519F310 = m24519F3(m24519F36, m24519F39, m24519F38, m24519F37, this.f74850X[7], 8);
        int m24519F311 = m24519F3(m24519F37, m24519F310, m24519F39, m24519F38, this.f74850X[0], 13);
        int m24519F312 = m24519F3(m24519F38, m24519F311, m24519F310, m24519F39, this.f74850X[6], 6);
        int m24519F313 = m24519F3(m24519F39, m24519F312, m24519F311, m24519F310, this.f74850X[13], 5);
        int m24519F314 = m24519F3(m24519F310, m24519F313, m24519F312, m24519F311, this.f74850X[11], 12);
        int m24519F315 = m24519F3(m24519F311, m24519F314, m24519F313, m24519F312, this.f74850X[5], 7);
        int m24519F316 = m24519F3(m24519F312, m24519F315, m24519F314, m24519F313, this.f74850X[12], 5);
        int m24518F4 = m24518F4(m24519F313, m24519F316, m24519F315, m24519F314, this.f74850X[1], 11);
        int m24518F42 = m24518F4(m24519F314, m24518F4, m24519F316, m24519F315, this.f74850X[9], 12);
        int m24518F43 = m24518F4(m24519F315, m24518F42, m24518F4, m24519F316, this.f74850X[11], 14);
        int m24518F44 = m24518F4(m24519F316, m24518F43, m24518F42, m24518F4, this.f74850X[10], 15);
        int m24518F45 = m24518F4(m24518F4, m24518F44, m24518F43, m24518F42, this.f74850X[0], 14);
        int m24518F46 = m24518F4(m24518F42, m24518F45, m24518F44, m24518F43, this.f74850X[8], 15);
        int m24518F47 = m24518F4(m24518F43, m24518F46, m24518F45, m24518F44, this.f74850X[12], 9);
        int m24518F48 = m24518F4(m24518F44, m24518F47, m24518F46, m24518F45, this.f74850X[4], 8);
        int m24518F49 = m24518F4(m24518F45, m24518F48, m24518F47, m24518F46, this.f74850X[13], 9);
        int m24518F410 = m24518F4(m24518F46, m24518F49, m24518F48, m24518F47, this.f74850X[3], 14);
        int m24518F411 = m24518F4(m24518F47, m24518F410, m24518F49, m24518F48, this.f74850X[7], 5);
        int m24518F412 = m24518F4(m24518F48, m24518F411, m24518F410, m24518F49, this.f74850X[15], 6);
        int m24518F413 = m24518F4(m24518F49, m24518F412, m24518F411, m24518F410, this.f74850X[14], 8);
        int m24518F414 = m24518F4(m24518F410, m24518F413, m24518F412, m24518F411, this.f74850X[5], 6);
        int m24518F415 = m24518F4(m24518F411, m24518F414, m24518F413, m24518F412, this.f74850X[6], 5);
        int m24518F416 = m24518F4(m24518F412, m24518F415, m24518F414, m24518F413, this.f74850X[2], 12);
        int FF4 = FF4(i, i2, i3, i4, this.f74850X[5], 8);
        int FF42 = FF4(i4, FF4, i2, i3, this.f74850X[14], 9);
        int FF43 = FF4(i3, FF42, FF4, i2, this.f74850X[7], 9);
        int FF44 = FF4(i2, FF43, FF42, FF4, this.f74850X[0], 11);
        int FF45 = FF4(FF4, FF44, FF43, FF42, this.f74850X[9], 13);
        int FF46 = FF4(FF42, FF45, FF44, FF43, this.f74850X[2], 15);
        int FF47 = FF4(FF43, FF46, FF45, FF44, this.f74850X[11], 15);
        int FF48 = FF4(FF44, FF47, FF46, FF45, this.f74850X[4], 5);
        int FF49 = FF4(FF45, FF48, FF47, FF46, this.f74850X[13], 7);
        int FF410 = FF4(FF46, FF49, FF48, FF47, this.f74850X[6], 7);
        int FF411 = FF4(FF47, FF410, FF49, FF48, this.f74850X[15], 8);
        int FF412 = FF4(FF48, FF411, FF410, FF49, this.f74850X[8], 11);
        int FF413 = FF4(FF49, FF412, FF411, FF410, this.f74850X[1], 14);
        int FF414 = FF4(FF410, FF413, FF412, FF411, this.f74850X[10], 14);
        int FF415 = FF4(FF411, FF414, FF413, FF412, this.f74850X[3], 12);
        int FF416 = FF4(FF412, FF415, FF414, FF413, this.f74850X[12], 6);
        int FF3 = FF3(FF413, FF416, FF415, FF414, this.f74850X[6], 9);
        int FF32 = FF3(FF414, FF3, FF416, FF415, this.f74850X[11], 13);
        int FF33 = FF3(FF415, FF32, FF3, FF416, this.f74850X[3], 15);
        int FF34 = FF3(FF416, FF33, FF32, FF3, this.f74850X[7], 7);
        int FF35 = FF3(FF3, FF34, FF33, FF32, this.f74850X[0], 12);
        int FF36 = FF3(FF32, FF35, FF34, FF33, this.f74850X[13], 8);
        int FF37 = FF3(FF33, FF36, FF35, FF34, this.f74850X[5], 9);
        int FF38 = FF3(FF34, FF37, FF36, FF35, this.f74850X[10], 11);
        int FF39 = FF3(FF35, FF38, FF37, FF36, this.f74850X[14], 7);
        int FF310 = FF3(FF36, FF39, FF38, FF37, this.f74850X[15], 7);
        int FF311 = FF3(FF37, FF310, FF39, FF38, this.f74850X[8], 12);
        int FF312 = FF3(FF38, FF311, FF310, FF39, this.f74850X[12], 7);
        int FF313 = FF3(FF39, FF312, FF311, FF310, this.f74850X[4], 6);
        int FF314 = FF3(FF310, FF313, FF312, FF311, this.f74850X[9], 15);
        int FF315 = FF3(FF311, FF314, FF313, FF312, this.f74850X[1], 13);
        int FF316 = FF3(FF312, FF315, FF314, FF313, this.f74850X[2], 11);
        int FF2 = FF2(FF313, FF316, FF315, FF314, this.f74850X[15], 9);
        int FF22 = FF2(FF314, FF2, FF316, FF315, this.f74850X[5], 7);
        int FF23 = FF2(FF315, FF22, FF2, FF316, this.f74850X[1], 15);
        int FF24 = FF2(FF316, FF23, FF22, FF2, this.f74850X[3], 11);
        int FF25 = FF2(FF2, FF24, FF23, FF22, this.f74850X[7], 8);
        int FF26 = FF2(FF22, FF25, FF24, FF23, this.f74850X[14], 6);
        int FF27 = FF2(FF23, FF26, FF25, FF24, this.f74850X[6], 6);
        int FF28 = FF2(FF24, FF27, FF26, FF25, this.f74850X[9], 14);
        int FF29 = FF2(FF25, FF28, FF27, FF26, this.f74850X[11], 12);
        int FF210 = FF2(FF26, FF29, FF28, FF27, this.f74850X[8], 13);
        int FF211 = FF2(FF27, FF210, FF29, FF28, this.f74850X[12], 5);
        int FF212 = FF2(FF28, FF211, FF210, FF29, this.f74850X[2], 14);
        int FF213 = FF2(FF29, FF212, FF211, FF210, this.f74850X[10], 13);
        int FF214 = FF2(FF210, FF213, FF212, FF211, this.f74850X[0], 13);
        int FF215 = FF2(FF211, FF214, FF213, FF212, this.f74850X[4], 7);
        int FF216 = FF2(FF212, FF215, FF214, FF213, this.f74850X[13], 5);
        int FF1 = FF1(FF213, FF216, FF215, FF214, this.f74850X[8], 15);
        int FF12 = FF1(FF214, FF1, FF216, FF215, this.f74850X[6], 5);
        int FF13 = FF1(FF215, FF12, FF1, FF216, this.f74850X[4], 8);
        int FF14 = FF1(FF216, FF13, FF12, FF1, this.f74850X[1], 11);
        int FF15 = FF1(FF1, FF14, FF13, FF12, this.f74850X[3], 14);
        int FF16 = FF1(FF12, FF15, FF14, FF13, this.f74850X[11], 14);
        int FF17 = FF1(FF13, FF16, FF15, FF14, this.f74850X[15], 6);
        int FF18 = FF1(FF14, FF17, FF16, FF15, this.f74850X[0], 14);
        int FF19 = FF1(FF15, FF18, FF17, FF16, this.f74850X[5], 6);
        int FF110 = FF1(FF16, FF19, FF18, FF17, this.f74850X[12], 9);
        int FF111 = FF1(FF17, FF110, FF19, FF18, this.f74850X[2], 12);
        int FF112 = FF1(FF18, FF111, FF110, FF19, this.f74850X[13], 9);
        int FF113 = FF1(FF19, FF112, FF111, FF110, this.f74850X[9], 12);
        int FF114 = FF1(FF110, FF113, FF112, FF111, this.f74850X[7], 5);
        int FF115 = FF1(FF111, FF114, FF113, FF112, this.f74850X[10], 15);
        int FF116 = FF1(FF112, FF115, FF114, FF113, this.f74850X[14], 8);
        this.f74847H1 = this.f74848H2 + m24518F414 + FF113;
        this.f74848H2 = this.f74849H3 + m24518F413 + FF116;
        this.f74849H3 = this.f74846H0 + m24518F416 + FF115;
        this.f74846H0 = FF114 + m24518F415 + this.f74847H1;
        this.xOff = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f74850X;
            if (i5 == iArr.length) {
                return;
            }
            iArr[i5] = 0;
            i5++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f74850X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f74850X;
        int i2 = this.xOff;
        int i3 = i2 + 1;
        this.xOff = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f74846H0 = 1732584193;
        this.f74847H1 = -271733879;
        this.f74848H2 = -1732584194;
        this.f74849H3 = 271733878;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f74850X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public RIPEMD128Digest(RIPEMD128Digest rIPEMD128Digest) {
        super(rIPEMD128Digest);
        this.f74850X = new int[16];
        copyIn(rIPEMD128Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((RIPEMD128Digest) memoable);
    }
}
