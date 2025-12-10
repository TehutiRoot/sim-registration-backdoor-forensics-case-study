package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;

/* loaded from: classes6.dex */
public class RIPEMD256Digest extends GeneralDigest {
    private static final int DIGEST_LENGTH = 32;

    /* renamed from: H0 */
    private int f74857H0;

    /* renamed from: H1 */
    private int f74858H1;

    /* renamed from: H2 */
    private int f74859H2;

    /* renamed from: H3 */
    private int f74860H3;

    /* renamed from: H4 */
    private int f74861H4;

    /* renamed from: H5 */
    private int f74862H5;

    /* renamed from: H6 */
    private int f74863H6;

    /* renamed from: H7 */
    private int f74864H7;

    /* renamed from: X */
    private int[] f74865X;
    private int xOff;

    public RIPEMD256Digest() {
        this.f74865X = new int[16];
        reset();
    }

    /* renamed from: F1 */
    private int m24506F1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24502RL(i + m24501f1(i2, i3, i4) + i5, i6);
    }

    /* renamed from: F2 */
    private int m24505F2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24502RL(i + m24500f2(i2, i3, i4) + i5 + 1518500249, i6);
    }

    /* renamed from: F3 */
    private int m24504F3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24502RL(i + m24499f3(i2, i3, i4) + i5 + 1859775393, i6);
    }

    /* renamed from: F4 */
    private int m24503F4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24502RL(((i + m24498f4(i2, i3, i4)) + i5) - 1894007588, i6);
    }

    private int FF1(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24502RL(i + m24501f1(i2, i3, i4) + i5, i6);
    }

    private int FF2(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24502RL(i + m24500f2(i2, i3, i4) + i5 + 1836072691, i6);
    }

    private int FF3(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24502RL(i + m24499f3(i2, i3, i4) + i5 + 1548603684, i6);
    }

    private int FF4(int i, int i2, int i3, int i4, int i5, int i6) {
        return m24502RL(i + m24498f4(i2, i3, i4) + i5 + 1352829926, i6);
    }

    /* renamed from: RL */
    private int m24502RL(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void copyIn(RIPEMD256Digest rIPEMD256Digest) {
        super.copyIn((GeneralDigest) rIPEMD256Digest);
        this.f74857H0 = rIPEMD256Digest.f74857H0;
        this.f74858H1 = rIPEMD256Digest.f74858H1;
        this.f74859H2 = rIPEMD256Digest.f74859H2;
        this.f74860H3 = rIPEMD256Digest.f74860H3;
        this.f74861H4 = rIPEMD256Digest.f74861H4;
        this.f74862H5 = rIPEMD256Digest.f74862H5;
        this.f74863H6 = rIPEMD256Digest.f74863H6;
        this.f74864H7 = rIPEMD256Digest.f74864H7;
        int[] iArr = rIPEMD256Digest.f74865X;
        System.arraycopy(iArr, 0, this.f74865X, 0, iArr.length);
        this.xOff = rIPEMD256Digest.xOff;
    }

    /* renamed from: f1 */
    private int m24501f1(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* renamed from: f2 */
    private int m24500f2(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: f3 */
    private int m24499f3(int i, int i2, int i3) {
        return (i | (~i2)) ^ i3;
    }

    /* renamed from: f4 */
    private int m24498f4(int i, int i2, int i3) {
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
        return new RIPEMD256Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        unpackWord(this.f74857H0, bArr, i);
        unpackWord(this.f74858H1, bArr, i + 4);
        unpackWord(this.f74859H2, bArr, i + 8);
        unpackWord(this.f74860H3, bArr, i + 12);
        unpackWord(this.f74861H4, bArr, i + 16);
        unpackWord(this.f74862H5, bArr, i + 20);
        unpackWord(this.f74863H6, bArr, i + 24);
        unpackWord(this.f74864H7, bArr, i + 28);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "RIPEMD256";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i = this.f74857H0;
        int i2 = this.f74858H1;
        int i3 = this.f74859H2;
        int i4 = this.f74860H3;
        int i5 = this.f74861H4;
        int i6 = this.f74862H5;
        int i7 = this.f74863H6;
        int i8 = this.f74864H7;
        int m24506F1 = m24506F1(i, i2, i3, i4, this.f74865X[0], 11);
        int m24506F12 = m24506F1(i4, m24506F1, i2, i3, this.f74865X[1], 14);
        int m24506F13 = m24506F1(i3, m24506F12, m24506F1, i2, this.f74865X[2], 15);
        int m24506F14 = m24506F1(i2, m24506F13, m24506F12, m24506F1, this.f74865X[3], 12);
        int m24506F15 = m24506F1(m24506F1, m24506F14, m24506F13, m24506F12, this.f74865X[4], 5);
        int m24506F16 = m24506F1(m24506F12, m24506F15, m24506F14, m24506F13, this.f74865X[5], 8);
        int m24506F17 = m24506F1(m24506F13, m24506F16, m24506F15, m24506F14, this.f74865X[6], 7);
        int m24506F18 = m24506F1(m24506F14, m24506F17, m24506F16, m24506F15, this.f74865X[7], 9);
        int m24506F19 = m24506F1(m24506F15, m24506F18, m24506F17, m24506F16, this.f74865X[8], 11);
        int m24506F110 = m24506F1(m24506F16, m24506F19, m24506F18, m24506F17, this.f74865X[9], 13);
        int m24506F111 = m24506F1(m24506F17, m24506F110, m24506F19, m24506F18, this.f74865X[10], 14);
        int m24506F112 = m24506F1(m24506F18, m24506F111, m24506F110, m24506F19, this.f74865X[11], 15);
        int m24506F113 = m24506F1(m24506F19, m24506F112, m24506F111, m24506F110, this.f74865X[12], 6);
        int m24506F114 = m24506F1(m24506F110, m24506F113, m24506F112, m24506F111, this.f74865X[13], 7);
        int m24506F115 = m24506F1(m24506F111, m24506F114, m24506F113, m24506F112, this.f74865X[14], 9);
        int m24506F116 = m24506F1(m24506F112, m24506F115, m24506F114, m24506F113, this.f74865X[15], 8);
        int FF4 = FF4(i5, i6, i7, i8, this.f74865X[5], 8);
        int FF42 = FF4(i8, FF4, i6, i7, this.f74865X[14], 9);
        int FF43 = FF4(i7, FF42, FF4, i6, this.f74865X[7], 9);
        int FF44 = FF4(i6, FF43, FF42, FF4, this.f74865X[0], 11);
        int FF45 = FF4(FF4, FF44, FF43, FF42, this.f74865X[9], 13);
        int FF46 = FF4(FF42, FF45, FF44, FF43, this.f74865X[2], 15);
        int FF47 = FF4(FF43, FF46, FF45, FF44, this.f74865X[11], 15);
        int FF48 = FF4(FF44, FF47, FF46, FF45, this.f74865X[4], 5);
        int FF49 = FF4(FF45, FF48, FF47, FF46, this.f74865X[13], 7);
        int FF410 = FF4(FF46, FF49, FF48, FF47, this.f74865X[6], 7);
        int FF411 = FF4(FF47, FF410, FF49, FF48, this.f74865X[15], 8);
        int FF412 = FF4(FF48, FF411, FF410, FF49, this.f74865X[8], 11);
        int FF413 = FF4(FF49, FF412, FF411, FF410, this.f74865X[1], 14);
        int FF414 = FF4(FF410, FF413, FF412, FF411, this.f74865X[10], 14);
        int FF415 = FF4(FF411, FF414, FF413, FF412, this.f74865X[3], 12);
        int FF416 = FF4(FF412, FF415, FF414, FF413, this.f74865X[12], 6);
        int m24505F2 = m24505F2(FF413, m24506F116, m24506F115, m24506F114, this.f74865X[7], 7);
        int m24505F22 = m24505F2(m24506F114, m24505F2, m24506F116, m24506F115, this.f74865X[4], 6);
        int m24505F23 = m24505F2(m24506F115, m24505F22, m24505F2, m24506F116, this.f74865X[13], 8);
        int m24505F24 = m24505F2(m24506F116, m24505F23, m24505F22, m24505F2, this.f74865X[1], 13);
        int m24505F25 = m24505F2(m24505F2, m24505F24, m24505F23, m24505F22, this.f74865X[10], 11);
        int m24505F26 = m24505F2(m24505F22, m24505F25, m24505F24, m24505F23, this.f74865X[6], 9);
        int m24505F27 = m24505F2(m24505F23, m24505F26, m24505F25, m24505F24, this.f74865X[15], 7);
        int m24505F28 = m24505F2(m24505F24, m24505F27, m24505F26, m24505F25, this.f74865X[3], 15);
        int m24505F29 = m24505F2(m24505F25, m24505F28, m24505F27, m24505F26, this.f74865X[12], 7);
        int m24505F210 = m24505F2(m24505F26, m24505F29, m24505F28, m24505F27, this.f74865X[0], 12);
        int m24505F211 = m24505F2(m24505F27, m24505F210, m24505F29, m24505F28, this.f74865X[9], 15);
        int m24505F212 = m24505F2(m24505F28, m24505F211, m24505F210, m24505F29, this.f74865X[5], 9);
        int m24505F213 = m24505F2(m24505F29, m24505F212, m24505F211, m24505F210, this.f74865X[2], 11);
        int m24505F214 = m24505F2(m24505F210, m24505F213, m24505F212, m24505F211, this.f74865X[14], 7);
        int m24505F215 = m24505F2(m24505F211, m24505F214, m24505F213, m24505F212, this.f74865X[11], 13);
        int m24505F216 = m24505F2(m24505F212, m24505F215, m24505F214, m24505F213, this.f74865X[8], 12);
        int FF3 = FF3(m24506F113, FF416, FF415, FF414, this.f74865X[6], 9);
        int FF32 = FF3(FF414, FF3, FF416, FF415, this.f74865X[11], 13);
        int FF33 = FF3(FF415, FF32, FF3, FF416, this.f74865X[3], 15);
        int FF34 = FF3(FF416, FF33, FF32, FF3, this.f74865X[7], 7);
        int FF35 = FF3(FF3, FF34, FF33, FF32, this.f74865X[0], 12);
        int FF36 = FF3(FF32, FF35, FF34, FF33, this.f74865X[13], 8);
        int FF37 = FF3(FF33, FF36, FF35, FF34, this.f74865X[5], 9);
        int FF38 = FF3(FF34, FF37, FF36, FF35, this.f74865X[10], 11);
        int FF39 = FF3(FF35, FF38, FF37, FF36, this.f74865X[14], 7);
        int FF310 = FF3(FF36, FF39, FF38, FF37, this.f74865X[15], 7);
        int FF311 = FF3(FF37, FF310, FF39, FF38, this.f74865X[8], 12);
        int FF312 = FF3(FF38, FF311, FF310, FF39, this.f74865X[12], 7);
        int FF313 = FF3(FF39, FF312, FF311, FF310, this.f74865X[4], 6);
        int FF314 = FF3(FF310, FF313, FF312, FF311, this.f74865X[9], 15);
        int FF315 = FF3(FF311, FF314, FF313, FF312, this.f74865X[1], 13);
        int FF316 = FF3(FF312, FF315, FF314, FF313, this.f74865X[2], 11);
        int m24504F3 = m24504F3(m24505F213, FF316, m24505F215, m24505F214, this.f74865X[3], 11);
        int m24504F32 = m24504F3(m24505F214, m24504F3, FF316, m24505F215, this.f74865X[10], 13);
        int m24504F33 = m24504F3(m24505F215, m24504F32, m24504F3, FF316, this.f74865X[14], 6);
        int m24504F34 = m24504F3(FF316, m24504F33, m24504F32, m24504F3, this.f74865X[4], 7);
        int m24504F35 = m24504F3(m24504F3, m24504F34, m24504F33, m24504F32, this.f74865X[9], 14);
        int m24504F36 = m24504F3(m24504F32, m24504F35, m24504F34, m24504F33, this.f74865X[15], 9);
        int m24504F37 = m24504F3(m24504F33, m24504F36, m24504F35, m24504F34, this.f74865X[8], 13);
        int m24504F38 = m24504F3(m24504F34, m24504F37, m24504F36, m24504F35, this.f74865X[1], 15);
        int m24504F39 = m24504F3(m24504F35, m24504F38, m24504F37, m24504F36, this.f74865X[2], 14);
        int m24504F310 = m24504F3(m24504F36, m24504F39, m24504F38, m24504F37, this.f74865X[7], 8);
        int m24504F311 = m24504F3(m24504F37, m24504F310, m24504F39, m24504F38, this.f74865X[0], 13);
        int m24504F312 = m24504F3(m24504F38, m24504F311, m24504F310, m24504F39, this.f74865X[6], 6);
        int m24504F313 = m24504F3(m24504F39, m24504F312, m24504F311, m24504F310, this.f74865X[13], 5);
        int m24504F314 = m24504F3(m24504F310, m24504F313, m24504F312, m24504F311, this.f74865X[11], 12);
        int m24504F315 = m24504F3(m24504F311, m24504F314, m24504F313, m24504F312, this.f74865X[5], 7);
        int m24504F316 = m24504F3(m24504F312, m24504F315, m24504F314, m24504F313, this.f74865X[12], 5);
        int FF2 = FF2(FF313, m24505F216, FF315, FF314, this.f74865X[15], 9);
        int FF22 = FF2(FF314, FF2, m24505F216, FF315, this.f74865X[5], 7);
        int FF23 = FF2(FF315, FF22, FF2, m24505F216, this.f74865X[1], 15);
        int FF24 = FF2(m24505F216, FF23, FF22, FF2, this.f74865X[3], 11);
        int FF25 = FF2(FF2, FF24, FF23, FF22, this.f74865X[7], 8);
        int FF26 = FF2(FF22, FF25, FF24, FF23, this.f74865X[14], 6);
        int FF27 = FF2(FF23, FF26, FF25, FF24, this.f74865X[6], 6);
        int FF28 = FF2(FF24, FF27, FF26, FF25, this.f74865X[9], 14);
        int FF29 = FF2(FF25, FF28, FF27, FF26, this.f74865X[11], 12);
        int FF210 = FF2(FF26, FF29, FF28, FF27, this.f74865X[8], 13);
        int FF211 = FF2(FF27, FF210, FF29, FF28, this.f74865X[12], 5);
        int FF212 = FF2(FF28, FF211, FF210, FF29, this.f74865X[2], 14);
        int FF213 = FF2(FF29, FF212, FF211, FF210, this.f74865X[10], 13);
        int FF214 = FF2(FF210, FF213, FF212, FF211, this.f74865X[0], 13);
        int FF215 = FF2(FF211, FF214, FF213, FF212, this.f74865X[4], 7);
        int FF216 = FF2(FF212, FF215, FF214, FF213, this.f74865X[13], 5);
        int m24503F4 = m24503F4(m24504F313, m24504F316, FF215, m24504F314, this.f74865X[1], 11);
        int m24503F42 = m24503F4(m24504F314, m24503F4, m24504F316, FF215, this.f74865X[9], 12);
        int m24503F43 = m24503F4(FF215, m24503F42, m24503F4, m24504F316, this.f74865X[11], 14);
        int m24503F44 = m24503F4(m24504F316, m24503F43, m24503F42, m24503F4, this.f74865X[10], 15);
        int m24503F45 = m24503F4(m24503F4, m24503F44, m24503F43, m24503F42, this.f74865X[0], 14);
        int m24503F46 = m24503F4(m24503F42, m24503F45, m24503F44, m24503F43, this.f74865X[8], 15);
        int m24503F47 = m24503F4(m24503F43, m24503F46, m24503F45, m24503F44, this.f74865X[12], 9);
        int m24503F48 = m24503F4(m24503F44, m24503F47, m24503F46, m24503F45, this.f74865X[4], 8);
        int m24503F49 = m24503F4(m24503F45, m24503F48, m24503F47, m24503F46, this.f74865X[13], 9);
        int m24503F410 = m24503F4(m24503F46, m24503F49, m24503F48, m24503F47, this.f74865X[3], 14);
        int m24503F411 = m24503F4(m24503F47, m24503F410, m24503F49, m24503F48, this.f74865X[7], 5);
        int m24503F412 = m24503F4(m24503F48, m24503F411, m24503F410, m24503F49, this.f74865X[15], 6);
        int m24503F413 = m24503F4(m24503F49, m24503F412, m24503F411, m24503F410, this.f74865X[14], 8);
        int m24503F414 = m24503F4(m24503F410, m24503F413, m24503F412, m24503F411, this.f74865X[5], 6);
        int m24503F415 = m24503F4(m24503F411, m24503F414, m24503F413, m24503F412, this.f74865X[6], 5);
        int m24503F416 = m24503F4(m24503F412, m24503F415, m24503F414, m24503F413, this.f74865X[2], 12);
        int FF1 = FF1(FF213, FF216, m24504F315, FF214, this.f74865X[8], 15);
        int FF12 = FF1(FF214, FF1, FF216, m24504F315, this.f74865X[6], 5);
        int FF13 = FF1(m24504F315, FF12, FF1, FF216, this.f74865X[4], 8);
        int FF14 = FF1(FF216, FF13, FF12, FF1, this.f74865X[1], 11);
        int FF15 = FF1(FF1, FF14, FF13, FF12, this.f74865X[3], 14);
        int FF16 = FF1(FF12, FF15, FF14, FF13, this.f74865X[11], 14);
        int FF17 = FF1(FF13, FF16, FF15, FF14, this.f74865X[15], 6);
        int FF18 = FF1(FF14, FF17, FF16, FF15, this.f74865X[0], 14);
        int FF19 = FF1(FF15, FF18, FF17, FF16, this.f74865X[5], 6);
        int FF110 = FF1(FF16, FF19, FF18, FF17, this.f74865X[12], 9);
        int FF111 = FF1(FF17, FF110, FF19, FF18, this.f74865X[2], 12);
        int FF112 = FF1(FF18, FF111, FF110, FF19, this.f74865X[13], 9);
        int FF113 = FF1(FF19, FF112, FF111, FF110, this.f74865X[9], 12);
        int FF114 = FF1(FF110, FF113, FF112, FF111, this.f74865X[7], 5);
        int FF115 = FF1(FF111, FF114, FF113, FF112, this.f74865X[10], 15);
        int FF116 = FF1(FF112, FF115, FF114, FF113, this.f74865X[14], 8);
        this.f74857H0 += m24503F413;
        this.f74858H1 += m24503F416;
        this.f74859H2 += m24503F415;
        this.f74860H3 += FF114;
        this.f74861H4 += FF113;
        this.f74862H5 += FF116;
        this.f74863H6 += FF115;
        this.f74864H7 += m24503F414;
        this.xOff = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f74865X;
            if (i9 == iArr.length) {
                return;
            }
            iArr[i9] = 0;
            i9++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.f74865X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f74865X;
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
        this.f74857H0 = 1732584193;
        this.f74858H1 = -271733879;
        this.f74859H2 = -1732584194;
        this.f74860H3 = 271733878;
        this.f74861H4 = 1985229328;
        this.f74862H5 = -19088744;
        this.f74863H6 = -1985229329;
        this.f74864H7 = 19088743;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f74865X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public RIPEMD256Digest(RIPEMD256Digest rIPEMD256Digest) {
        super(rIPEMD256Digest);
        this.f74865X = new int[16];
        copyIn(rIPEMD256Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((RIPEMD256Digest) memoable);
    }
}
