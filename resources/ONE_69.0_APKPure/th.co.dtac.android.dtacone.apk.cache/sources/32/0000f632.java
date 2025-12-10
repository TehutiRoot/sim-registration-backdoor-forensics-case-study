package org.bouncycastle.crypto.digests;

import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
public class MD5Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 16;
    private static final int S11 = 7;
    private static final int S12 = 12;
    private static final int S13 = 17;
    private static final int S14 = 22;
    private static final int S21 = 5;
    private static final int S22 = 9;
    private static final int S23 = 14;
    private static final int S24 = 20;
    private static final int S31 = 4;
    private static final int S32 = 11;
    private static final int S33 = 16;
    private static final int S34 = 23;
    private static final int S41 = 6;
    private static final int S42 = 10;
    private static final int S43 = 15;
    private static final int S44 = 21;

    /* renamed from: H1 */
    private int f74925H1;

    /* renamed from: H2 */
    private int f74926H2;

    /* renamed from: H3 */
    private int f74927H3;

    /* renamed from: H4 */
    private int f74928H4;

    /* renamed from: X */
    private int[] f74929X;
    private int xOff;

    public MD5Digest() {
        this.f74929X = new int[16];
        reset();
    }

    /* renamed from: F */
    private int m24715F(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: G */
    private int m24714G(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    /* renamed from: H */
    private int m24713H(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* renamed from: K */
    private int m24712K(int i, int i2, int i3) {
        return (i | (~i3)) ^ i2;
    }

    private void copyIn(MD5Digest mD5Digest) {
        super.copyIn((GeneralDigest) mD5Digest);
        this.f74925H1 = mD5Digest.f74925H1;
        this.f74926H2 = mD5Digest.f74926H2;
        this.f74927H3 = mD5Digest.f74927H3;
        this.f74928H4 = mD5Digest.f74928H4;
        int[] iArr = mD5Digest.f74929X;
        System.arraycopy(iArr, 0, this.f74929X, 0, iArr.length);
        this.xOff = mD5Digest.xOff;
    }

    private int rotateLeft(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void unpackWord(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new MD5Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        unpackWord(this.f74925H1, bArr, i);
        unpackWord(this.f74926H2, bArr, i + 4);
        unpackWord(this.f74927H3, bArr, i + 8);
        unpackWord(this.f74928H4, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return MessageDigestAlgorithms.MD5;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.xOff * 4) + 36];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f74925H1, bArr, 16);
        Pack.intToBigEndian(this.f74926H2, bArr, 20);
        Pack.intToBigEndian(this.f74927H3, bArr, 24);
        Pack.intToBigEndian(this.f74928H4, bArr, 28);
        Pack.intToBigEndian(this.xOff, bArr, 32);
        for (int i = 0; i != this.xOff; i++) {
            Pack.intToBigEndian(this.f74929X[i], bArr, (i * 4) + 36);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i = this.f74925H1;
        int i2 = this.f74926H2;
        int i3 = this.f74927H3;
        int i4 = this.f74928H4;
        int rotateLeft = rotateLeft(((i + m24715F(i2, i3, i4)) + this.f74929X[0]) - 680876936, 7) + i2;
        int rotateLeft2 = rotateLeft(((i4 + m24715F(rotateLeft, i2, i3)) + this.f74929X[1]) - 389564586, 12) + rotateLeft;
        int rotateLeft3 = rotateLeft(i3 + m24715F(rotateLeft2, rotateLeft, i2) + this.f74929X[2] + 606105819, 17) + rotateLeft2;
        int rotateLeft4 = rotateLeft(((i2 + m24715F(rotateLeft3, rotateLeft2, rotateLeft)) + this.f74929X[3]) - 1044525330, 22) + rotateLeft3;
        int rotateLeft5 = rotateLeft(((rotateLeft + m24715F(rotateLeft4, rotateLeft3, rotateLeft2)) + this.f74929X[4]) - 176418897, 7) + rotateLeft4;
        int rotateLeft6 = rotateLeft(rotateLeft2 + m24715F(rotateLeft5, rotateLeft4, rotateLeft3) + this.f74929X[5] + 1200080426, 12) + rotateLeft5;
        int rotateLeft7 = rotateLeft(((rotateLeft3 + m24715F(rotateLeft6, rotateLeft5, rotateLeft4)) + this.f74929X[6]) - 1473231341, 17) + rotateLeft6;
        int rotateLeft8 = rotateLeft(((rotateLeft4 + m24715F(rotateLeft7, rotateLeft6, rotateLeft5)) + this.f74929X[7]) - 45705983, 22) + rotateLeft7;
        int rotateLeft9 = rotateLeft(rotateLeft5 + m24715F(rotateLeft8, rotateLeft7, rotateLeft6) + this.f74929X[8] + 1770035416, 7) + rotateLeft8;
        int rotateLeft10 = rotateLeft(((rotateLeft6 + m24715F(rotateLeft9, rotateLeft8, rotateLeft7)) + this.f74929X[9]) - 1958414417, 12) + rotateLeft9;
        int rotateLeft11 = rotateLeft(((rotateLeft7 + m24715F(rotateLeft10, rotateLeft9, rotateLeft8)) + this.f74929X[10]) - 42063, 17) + rotateLeft10;
        int rotateLeft12 = rotateLeft(((rotateLeft8 + m24715F(rotateLeft11, rotateLeft10, rotateLeft9)) + this.f74929X[11]) - 1990404162, 22) + rotateLeft11;
        int rotateLeft13 = rotateLeft(rotateLeft9 + m24715F(rotateLeft12, rotateLeft11, rotateLeft10) + this.f74929X[12] + 1804603682, 7) + rotateLeft12;
        int rotateLeft14 = rotateLeft(((rotateLeft10 + m24715F(rotateLeft13, rotateLeft12, rotateLeft11)) + this.f74929X[13]) - 40341101, 12) + rotateLeft13;
        int rotateLeft15 = rotateLeft(((rotateLeft11 + m24715F(rotateLeft14, rotateLeft13, rotateLeft12)) + this.f74929X[14]) - 1502002290, 17) + rotateLeft14;
        int rotateLeft16 = rotateLeft(rotateLeft12 + m24715F(rotateLeft15, rotateLeft14, rotateLeft13) + this.f74929X[15] + 1236535329, 22) + rotateLeft15;
        int rotateLeft17 = rotateLeft(((rotateLeft13 + m24714G(rotateLeft16, rotateLeft15, rotateLeft14)) + this.f74929X[1]) - 165796510, 5) + rotateLeft16;
        int rotateLeft18 = rotateLeft(((rotateLeft14 + m24714G(rotateLeft17, rotateLeft16, rotateLeft15)) + this.f74929X[6]) - 1069501632, 9) + rotateLeft17;
        int rotateLeft19 = rotateLeft(rotateLeft15 + m24714G(rotateLeft18, rotateLeft17, rotateLeft16) + this.f74929X[11] + 643717713, 14) + rotateLeft18;
        int rotateLeft20 = rotateLeft(((rotateLeft16 + m24714G(rotateLeft19, rotateLeft18, rotateLeft17)) + this.f74929X[0]) - 373897302, 20) + rotateLeft19;
        int rotateLeft21 = rotateLeft(((rotateLeft17 + m24714G(rotateLeft20, rotateLeft19, rotateLeft18)) + this.f74929X[5]) - 701558691, 5) + rotateLeft20;
        int rotateLeft22 = rotateLeft(rotateLeft18 + m24714G(rotateLeft21, rotateLeft20, rotateLeft19) + this.f74929X[10] + 38016083, 9) + rotateLeft21;
        int rotateLeft23 = rotateLeft(((rotateLeft19 + m24714G(rotateLeft22, rotateLeft21, rotateLeft20)) + this.f74929X[15]) - 660478335, 14) + rotateLeft22;
        int rotateLeft24 = rotateLeft(((rotateLeft20 + m24714G(rotateLeft23, rotateLeft22, rotateLeft21)) + this.f74929X[4]) - 405537848, 20) + rotateLeft23;
        int rotateLeft25 = rotateLeft(rotateLeft21 + m24714G(rotateLeft24, rotateLeft23, rotateLeft22) + this.f74929X[9] + 568446438, 5) + rotateLeft24;
        int rotateLeft26 = rotateLeft(((rotateLeft22 + m24714G(rotateLeft25, rotateLeft24, rotateLeft23)) + this.f74929X[14]) - 1019803690, 9) + rotateLeft25;
        int rotateLeft27 = rotateLeft(((rotateLeft23 + m24714G(rotateLeft26, rotateLeft25, rotateLeft24)) + this.f74929X[3]) - 187363961, 14) + rotateLeft26;
        int rotateLeft28 = rotateLeft(rotateLeft24 + m24714G(rotateLeft27, rotateLeft26, rotateLeft25) + this.f74929X[8] + 1163531501, 20) + rotateLeft27;
        int rotateLeft29 = rotateLeft(((rotateLeft25 + m24714G(rotateLeft28, rotateLeft27, rotateLeft26)) + this.f74929X[13]) - 1444681467, 5) + rotateLeft28;
        int rotateLeft30 = rotateLeft(((rotateLeft26 + m24714G(rotateLeft29, rotateLeft28, rotateLeft27)) + this.f74929X[2]) - 51403784, 9) + rotateLeft29;
        int rotateLeft31 = rotateLeft(rotateLeft27 + m24714G(rotateLeft30, rotateLeft29, rotateLeft28) + this.f74929X[7] + 1735328473, 14) + rotateLeft30;
        int rotateLeft32 = rotateLeft(((rotateLeft28 + m24714G(rotateLeft31, rotateLeft30, rotateLeft29)) + this.f74929X[12]) - 1926607734, 20) + rotateLeft31;
        int rotateLeft33 = rotateLeft(((rotateLeft29 + m24713H(rotateLeft32, rotateLeft31, rotateLeft30)) + this.f74929X[5]) - 378558, 4) + rotateLeft32;
        int rotateLeft34 = rotateLeft(((rotateLeft30 + m24713H(rotateLeft33, rotateLeft32, rotateLeft31)) + this.f74929X[8]) - 2022574463, 11) + rotateLeft33;
        int rotateLeft35 = rotateLeft(rotateLeft31 + m24713H(rotateLeft34, rotateLeft33, rotateLeft32) + this.f74929X[11] + 1839030562, 16) + rotateLeft34;
        int rotateLeft36 = rotateLeft(((rotateLeft32 + m24713H(rotateLeft35, rotateLeft34, rotateLeft33)) + this.f74929X[14]) - 35309556, 23) + rotateLeft35;
        int rotateLeft37 = rotateLeft(((rotateLeft33 + m24713H(rotateLeft36, rotateLeft35, rotateLeft34)) + this.f74929X[1]) - 1530992060, 4) + rotateLeft36;
        int rotateLeft38 = rotateLeft(rotateLeft34 + m24713H(rotateLeft37, rotateLeft36, rotateLeft35) + this.f74929X[4] + 1272893353, 11) + rotateLeft37;
        int rotateLeft39 = rotateLeft(((rotateLeft35 + m24713H(rotateLeft38, rotateLeft37, rotateLeft36)) + this.f74929X[7]) - 155497632, 16) + rotateLeft38;
        int rotateLeft40 = rotateLeft(((rotateLeft36 + m24713H(rotateLeft39, rotateLeft38, rotateLeft37)) + this.f74929X[10]) - 1094730640, 23) + rotateLeft39;
        int rotateLeft41 = rotateLeft(rotateLeft37 + m24713H(rotateLeft40, rotateLeft39, rotateLeft38) + this.f74929X[13] + 681279174, 4) + rotateLeft40;
        int rotateLeft42 = rotateLeft(((rotateLeft38 + m24713H(rotateLeft41, rotateLeft40, rotateLeft39)) + this.f74929X[0]) - 358537222, 11) + rotateLeft41;
        int rotateLeft43 = rotateLeft(((rotateLeft39 + m24713H(rotateLeft42, rotateLeft41, rotateLeft40)) + this.f74929X[3]) - 722521979, 16) + rotateLeft42;
        int rotateLeft44 = rotateLeft(rotateLeft40 + m24713H(rotateLeft43, rotateLeft42, rotateLeft41) + this.f74929X[6] + 76029189, 23) + rotateLeft43;
        int rotateLeft45 = rotateLeft(((rotateLeft41 + m24713H(rotateLeft44, rotateLeft43, rotateLeft42)) + this.f74929X[9]) - 640364487, 4) + rotateLeft44;
        int rotateLeft46 = rotateLeft(((rotateLeft42 + m24713H(rotateLeft45, rotateLeft44, rotateLeft43)) + this.f74929X[12]) - 421815835, 11) + rotateLeft45;
        int rotateLeft47 = rotateLeft(rotateLeft43 + m24713H(rotateLeft46, rotateLeft45, rotateLeft44) + this.f74929X[15] + 530742520, 16) + rotateLeft46;
        int rotateLeft48 = rotateLeft(((rotateLeft44 + m24713H(rotateLeft47, rotateLeft46, rotateLeft45)) + this.f74929X[2]) - 995338651, 23) + rotateLeft47;
        int rotateLeft49 = rotateLeft(((rotateLeft45 + m24712K(rotateLeft48, rotateLeft47, rotateLeft46)) + this.f74929X[0]) - 198630844, 6) + rotateLeft48;
        int rotateLeft50 = rotateLeft(rotateLeft46 + m24712K(rotateLeft49, rotateLeft48, rotateLeft47) + this.f74929X[7] + 1126891415, 10) + rotateLeft49;
        int rotateLeft51 = rotateLeft(((rotateLeft47 + m24712K(rotateLeft50, rotateLeft49, rotateLeft48)) + this.f74929X[14]) - 1416354905, 15) + rotateLeft50;
        int rotateLeft52 = rotateLeft(((rotateLeft48 + m24712K(rotateLeft51, rotateLeft50, rotateLeft49)) + this.f74929X[5]) - 57434055, 21) + rotateLeft51;
        int rotateLeft53 = rotateLeft(rotateLeft49 + m24712K(rotateLeft52, rotateLeft51, rotateLeft50) + this.f74929X[12] + 1700485571, 6) + rotateLeft52;
        int rotateLeft54 = rotateLeft(((rotateLeft50 + m24712K(rotateLeft53, rotateLeft52, rotateLeft51)) + this.f74929X[3]) - 1894986606, 10) + rotateLeft53;
        int rotateLeft55 = rotateLeft(((rotateLeft51 + m24712K(rotateLeft54, rotateLeft53, rotateLeft52)) + this.f74929X[10]) - 1051523, 15) + rotateLeft54;
        int rotateLeft56 = rotateLeft(((rotateLeft52 + m24712K(rotateLeft55, rotateLeft54, rotateLeft53)) + this.f74929X[1]) - 2054922799, 21) + rotateLeft55;
        int rotateLeft57 = rotateLeft(rotateLeft53 + m24712K(rotateLeft56, rotateLeft55, rotateLeft54) + this.f74929X[8] + 1873313359, 6) + rotateLeft56;
        int rotateLeft58 = rotateLeft(((rotateLeft54 + m24712K(rotateLeft57, rotateLeft56, rotateLeft55)) + this.f74929X[15]) - 30611744, 10) + rotateLeft57;
        int rotateLeft59 = rotateLeft(((rotateLeft55 + m24712K(rotateLeft58, rotateLeft57, rotateLeft56)) + this.f74929X[6]) - 1560198380, 15) + rotateLeft58;
        int rotateLeft60 = rotateLeft(rotateLeft56 + m24712K(rotateLeft59, rotateLeft58, rotateLeft57) + this.f74929X[13] + 1309151649, 21) + rotateLeft59;
        int rotateLeft61 = rotateLeft(((rotateLeft57 + m24712K(rotateLeft60, rotateLeft59, rotateLeft58)) + this.f74929X[4]) - 145523070, 6) + rotateLeft60;
        int rotateLeft62 = rotateLeft(((rotateLeft58 + m24712K(rotateLeft61, rotateLeft60, rotateLeft59)) + this.f74929X[11]) - 1120210379, 10) + rotateLeft61;
        int rotateLeft63 = rotateLeft(rotateLeft59 + m24712K(rotateLeft62, rotateLeft61, rotateLeft60) + this.f74929X[2] + 718787259, 15) + rotateLeft62;
        this.f74925H1 += rotateLeft61;
        this.f74926H2 += rotateLeft(((rotateLeft60 + m24712K(rotateLeft63, rotateLeft62, rotateLeft61)) + this.f74929X[9]) - 343485551, 21) + rotateLeft63;
        this.f74927H3 += rotateLeft63;
        this.f74928H4 += rotateLeft62;
        this.xOff = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f74929X;
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
        int[] iArr = this.f74929X;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.f74929X;
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
        this.f74925H1 = 1732584193;
        this.f74926H2 = -271733879;
        this.f74927H3 = -1732584194;
        this.f74928H4 = 271733878;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f74929X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public MD5Digest(MD5Digest mD5Digest) {
        super(mD5Digest);
        this.f74929X = new int[16];
        copyIn(mD5Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((MD5Digest) memoable);
    }

    public MD5Digest(byte[] bArr) {
        super(bArr);
        this.f74929X = new int[16];
        this.f74925H1 = Pack.bigEndianToInt(bArr, 16);
        this.f74926H2 = Pack.bigEndianToInt(bArr, 20);
        this.f74927H3 = Pack.bigEndianToInt(bArr, 24);
        this.f74928H4 = Pack.bigEndianToInt(bArr, 28);
        this.xOff = Pack.bigEndianToInt(bArr, 32);
        for (int i = 0; i != this.xOff; i++) {
            this.f74929X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 36);
        }
    }
}