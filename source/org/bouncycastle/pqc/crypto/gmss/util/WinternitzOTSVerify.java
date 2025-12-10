package org.bouncycastle.pqc.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes6.dex */
public class WinternitzOTSVerify {
    private int mdsize;
    private Digest messDigestOTS;

    /* renamed from: w */
    private int f75490w;

    public WinternitzOTSVerify(Digest digest, int i) {
        this.f75490w = i;
        this.messDigestOTS = digest;
        this.mdsize = digest.getDigestSize();
    }

    private void hashSignatureBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 < 1) {
            System.arraycopy(bArr, i, bArr2, i3, this.mdsize);
            return;
        }
        this.messDigestOTS.update(bArr, i, this.mdsize);
        while (true) {
            this.messDigestOTS.doFinal(bArr2, i3);
            i2--;
            if (i2 <= 0) {
                return;
            }
            this.messDigestOTS.update(bArr2, i3, this.mdsize);
        }
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        WinternitzOTSVerify winternitzOTSVerify = this;
        int i3 = winternitzOTSVerify.mdsize;
        byte[] bArr3 = new byte[i3];
        winternitzOTSVerify.messDigestOTS.update(bArr, 0, bArr.length);
        winternitzOTSVerify.messDigestOTS.doFinal(bArr3, 0);
        int i4 = winternitzOTSVerify.f75490w;
        int i5 = ((winternitzOTSVerify.mdsize << 3) + (i4 - 1)) / i4;
        int log = winternitzOTSVerify.getLog((i5 << i4) + 1);
        int i6 = winternitzOTSVerify.f75490w;
        int i7 = winternitzOTSVerify.mdsize;
        int i8 = i7 * ((((log + i6) - 1) / i6) + i5);
        if (i8 != bArr2.length) {
            return null;
        }
        byte[] bArr4 = new byte[i8];
        int i9 = 8;
        if (8 % i6 == 0) {
            int i10 = 8 / i6;
            int i11 = (1 << i6) - 1;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < i3) {
                int i15 = i13;
                int i16 = 0;
                while (i16 < i10) {
                    int i17 = bArr3[i14] & i11;
                    int i18 = i12 + i17;
                    int i19 = winternitzOTSVerify.mdsize;
                    int i20 = i14;
                    hashSignatureBlock(bArr2, i15 * i19, i11 - i17, bArr4, i15 * i19);
                    bArr3[i20] = (byte) (bArr3[i20] >>> winternitzOTSVerify.f75490w);
                    i15++;
                    i16++;
                    i12 = i18;
                    i14 = i20;
                    i10 = i10;
                }
                i14++;
                i13 = i15;
            }
            int i21 = i13;
            int i22 = (i5 << winternitzOTSVerify.f75490w) - i12;
            int i23 = 0;
            while (i23 < log) {
                int i24 = winternitzOTSVerify.mdsize;
                hashSignatureBlock(bArr2, i21 * i24, i11 - (i22 & i11), bArr4, i21 * i24);
                int i25 = winternitzOTSVerify.f75490w;
                i22 >>>= i25;
                i21++;
                i23 += i25;
            }
        } else {
            long j = 0;
            if (i6 < 8) {
                int i26 = i7 / i6;
                int i27 = (1 << i6) - 1;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                while (i31 < i26) {
                    int i32 = i28;
                    long j2 = 0;
                    int i33 = 0;
                    while (i33 < winternitzOTSVerify.f75490w) {
                        j2 ^= (bArr3[i32] & 255) << (i33 << 3);
                        i32++;
                        i33++;
                        log = log;
                    }
                    int i34 = log;
                    int i35 = i30;
                    int i36 = 0;
                    while (i36 < i9) {
                        int i37 = (int) (j2 & i27);
                        int i38 = i29 + i37;
                        int i39 = this.mdsize;
                        winternitzOTSVerify = this;
                        hashSignatureBlock(bArr2, i35 * i39, i27 - i37, bArr4, i35 * i39);
                        j2 >>>= winternitzOTSVerify.f75490w;
                        i35++;
                        i36++;
                        i27 = i27;
                        i31 = i31;
                        i29 = i38;
                        i9 = 8;
                    }
                    i31++;
                    i30 = i35;
                    i28 = i32;
                    log = i34;
                    i9 = 8;
                }
                int i40 = log;
                int i41 = i27;
                int i42 = winternitzOTSVerify.mdsize % winternitzOTSVerify.f75490w;
                int i43 = 0;
                while (i43 < i42) {
                    j ^= (bArr3[i28] & 255) << (i43 << 3);
                    i28++;
                    i43++;
                    i29 = i29;
                    i30 = i30;
                }
                int i44 = i30;
                int i45 = i42 << 3;
                int i46 = 0;
                while (i46 < i45) {
                    int i47 = (int) (j & i41);
                    int i48 = i29 + i47;
                    int i49 = winternitzOTSVerify.mdsize;
                    hashSignatureBlock(bArr2, i44 * i49, i41 - i47, bArr4, i44 * i49);
                    int i50 = winternitzOTSVerify.f75490w;
                    j >>>= i50;
                    i44++;
                    i46 += i50;
                    i29 = i48;
                }
                int i51 = (i5 << winternitzOTSVerify.f75490w) - i29;
                int i52 = 0;
                while (i52 < i40) {
                    int i53 = winternitzOTSVerify.mdsize;
                    hashSignatureBlock(bArr2, i44 * i53, i41 - (i51 & i41), bArr4, i44 * i53);
                    int i54 = winternitzOTSVerify.f75490w;
                    i51 >>>= i54;
                    i44++;
                    i52 += i54;
                }
            } else if (i6 < 57) {
                int i55 = (i7 << 3) - i6;
                int i56 = (1 << i6) - 1;
                byte[] bArr5 = new byte[i7];
                int i57 = 0;
                int i58 = 0;
                int i59 = 0;
                while (i57 <= i55) {
                    int i60 = i57 >>> 3;
                    int i61 = i57 % 8;
                    int i62 = i55;
                    int i63 = i57 + winternitzOTSVerify.f75490w;
                    int i64 = (i63 + 7) >>> 3;
                    long j3 = 0;
                    int i65 = 0;
                    while (i60 < i64) {
                        j3 ^= (bArr3[i60] & 255) << (i65 << 3);
                        i65++;
                        i60++;
                        i64 = i64;
                        i63 = i63;
                    }
                    int i66 = i63;
                    long j4 = j3 >>> i61;
                    int i67 = i8;
                    long j5 = i56;
                    long j6 = j4 & j5;
                    int i68 = i5;
                    i58 = (int) (i58 + j6);
                    int i69 = winternitzOTSVerify.mdsize;
                    System.arraycopy(bArr2, i59 * i69, bArr5, 0, i69);
                    for (long j7 = j6; j7 < j5; j7++) {
                        winternitzOTSVerify.messDigestOTS.update(bArr5, 0, i7);
                        winternitzOTSVerify.messDigestOTS.doFinal(bArr5, 0);
                    }
                    int i70 = winternitzOTSVerify.mdsize;
                    System.arraycopy(bArr5, 0, bArr4, i59 * i70, i70);
                    i59++;
                    i55 = i62;
                    i5 = i68;
                    i8 = i67;
                    i57 = i66;
                }
                int i71 = i5;
                i = i8;
                int i72 = i57 >>> 3;
                if (i72 < winternitzOTSVerify.mdsize) {
                    int i73 = i57 % 8;
                    int i74 = 0;
                    while (true) {
                        i2 = winternitzOTSVerify.mdsize;
                        if (i72 >= i2) {
                            break;
                        }
                        j ^= (bArr3[i72] & 255) << (i74 << 3);
                        i74++;
                        i72++;
                    }
                    long j8 = i56;
                    long j9 = (j >>> i73) & j8;
                    i58 = (int) (i58 + j9);
                    System.arraycopy(bArr2, i59 * i2, bArr5, 0, i2);
                    while (j9 < j8) {
                        winternitzOTSVerify.messDigestOTS.update(bArr5, 0, i7);
                        winternitzOTSVerify.messDigestOTS.doFinal(bArr5, 0);
                        j9++;
                    }
                    int i75 = winternitzOTSVerify.mdsize;
                    System.arraycopy(bArr5, 0, bArr4, i59 * i75, i75);
                    i59++;
                }
                int i76 = (i71 << winternitzOTSVerify.f75490w) - i58;
                int i77 = 0;
                while (i77 < log) {
                    int i78 = winternitzOTSVerify.mdsize;
                    System.arraycopy(bArr2, i59 * i78, bArr5, 0, i78);
                    for (long j10 = i76 & i56; j10 < i56; j10++) {
                        winternitzOTSVerify.messDigestOTS.update(bArr5, 0, i7);
                        winternitzOTSVerify.messDigestOTS.doFinal(bArr5, 0);
                    }
                    int i79 = winternitzOTSVerify.mdsize;
                    System.arraycopy(bArr5, 0, bArr4, i59 * i79, i79);
                    int i80 = winternitzOTSVerify.f75490w;
                    i76 >>>= i80;
                    i59++;
                    i77 += i80;
                }
                winternitzOTSVerify.messDigestOTS.update(bArr4, 0, i);
                byte[] bArr6 = new byte[winternitzOTSVerify.mdsize];
                winternitzOTSVerify.messDigestOTS.doFinal(bArr6, 0);
                return bArr6;
            }
        }
        i = i8;
        winternitzOTSVerify.messDigestOTS.update(bArr4, 0, i);
        byte[] bArr62 = new byte[winternitzOTSVerify.mdsize];
        winternitzOTSVerify.messDigestOTS.doFinal(bArr62, 0);
        return bArr62;
    }

    public int getLog(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    public int getSignatureLength() {
        int digestSize = this.messDigestOTS.getDigestSize();
        int i = this.f75490w;
        int i2 = ((digestSize << 3) + (i - 1)) / i;
        int log = getLog((i2 << i) + 1);
        int i3 = this.f75490w;
        return digestSize * (i2 + (((log + i3) - 1) / i3));
    }
}
