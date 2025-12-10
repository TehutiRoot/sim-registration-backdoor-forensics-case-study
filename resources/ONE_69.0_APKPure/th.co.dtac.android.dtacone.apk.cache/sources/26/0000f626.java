package org.bouncycastle.crypto.digests;

import androidx.core.view.MotionEventCompat;
import java.lang.reflect.Array;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.engines.GOST28147Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
public class GOST3411Digest implements ExtendedDigest, Memoable {

    /* renamed from: C2 */
    private static final byte[] f74882C2 = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    private static final int DIGEST_LENGTH = 32;

    /* renamed from: C */
    private byte[][] f74883C;

    /* renamed from: H */
    private byte[] f74884H;

    /* renamed from: K */
    private byte[] f74885K;

    /* renamed from: L */
    private byte[] f74886L;

    /* renamed from: M */
    private byte[] f74887M;

    /* renamed from: S */
    byte[] f74888S;
    private byte[] Sum;

    /* renamed from: U */
    byte[] f74889U;

    /* renamed from: V */
    byte[] f74890V;

    /* renamed from: W */
    byte[] f74891W;

    /* renamed from: a */
    byte[] f74892a;
    private long byteCount;
    private BlockCipher cipher;
    private byte[] sBox;

    /* renamed from: wS */
    short[] f74893wS;
    short[] w_S;
    private byte[] xBuf;
    private int xBufOff;

    public GOST3411Digest() {
        this.f74884H = new byte[32];
        this.f74886L = new byte[32];
        this.f74887M = new byte[32];
        this.Sum = new byte[32];
        this.f74883C = (byte[][]) Array.newInstance(Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.f74885K = new byte[32];
        this.f74892a = new byte[8];
        this.f74893wS = new short[16];
        this.w_S = new short[16];
        this.f74888S = new byte[32];
        this.f74889U = new byte[32];
        this.f74890V = new byte[32];
        this.f74891W = new byte[32];
        byte[] sBox = GOST28147Engine.getSBox("D-A");
        this.sBox = sBox;
        this.cipher.init(true, new ParametersWithSBox(null, sBox));
        reset();
    }

    /* renamed from: A */
    private byte[] m24725A(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            this.f74892a[i] = (byte) (bArr[i] ^ bArr[i + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.f74892a, 0, bArr, 24, 8);
        return bArr;
    }

    /* renamed from: E */
    private void m24724E(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2) {
        this.cipher.init(true, new KeyParameter(bArr));
        this.cipher.processBlock(bArr3, i2, bArr2, i);
    }

    /* renamed from: P */
    private byte[] m24723P(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            byte[] bArr2 = this.f74885K;
            int i2 = i * 4;
            bArr2[i2] = bArr[i];
            bArr2[i2 + 1] = bArr[i + 8];
            bArr2[i2 + 2] = bArr[i + 16];
            bArr2[i2 + 3] = bArr[i + 24];
        }
        return this.f74885K;
    }

    private void cpyBytesToShort(byte[] bArr, short[] sArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int i2 = i * 2;
            sArr[i] = (short) ((bArr[i2] & 255) | ((bArr[i2 + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK));
        }
    }

    private void cpyShortToBytes(short[] sArr, byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int i2 = i * 2;
            short s = sArr[i];
            bArr[i2 + 1] = (byte) (s >> 8);
            bArr[i2] = (byte) s;
        }
    }

    private void finish() {
        Pack.longToLittleEndian(this.byteCount * 8, this.f74886L, 0);
        while (this.xBufOff != 0) {
            update((byte) 0);
        }
        processBlock(this.f74886L, 0);
        processBlock(this.Sum, 0);
    }

    /* renamed from: fw */
    private void m24722fw(byte[] bArr) {
        cpyBytesToShort(bArr, this.f74893wS);
        short[] sArr = this.w_S;
        short[] sArr2 = this.f74893wS;
        sArr[15] = (short) (((((sArr2[0] ^ sArr2[1]) ^ sArr2[2]) ^ sArr2[3]) ^ sArr2[12]) ^ sArr2[15]);
        System.arraycopy(sArr2, 1, sArr, 0, 15);
        cpyShortToBytes(this.w_S, bArr);
    }

    private void sumByteArray(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.Sum;
            if (i == bArr2.length) {
                return;
            }
            int i3 = (bArr2[i] & 255) + (bArr[i] & 255) + i2;
            bArr2[i] = (byte) i3;
            i2 = i3 >>> 8;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new GOST3411Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        byte[] bArr2 = this.f74884H;
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "GOST3411";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    public void processBlock(byte[] bArr, int i) {
        System.arraycopy(bArr, i, this.f74887M, 0, 32);
        System.arraycopy(this.f74884H, 0, this.f74889U, 0, 32);
        System.arraycopy(this.f74887M, 0, this.f74890V, 0, 32);
        for (int i2 = 0; i2 < 32; i2++) {
            this.f74891W[i2] = (byte) (this.f74889U[i2] ^ this.f74890V[i2]);
        }
        m24724E(m24723P(this.f74891W), this.f74888S, 0, this.f74884H, 0);
        for (int i3 = 1; i3 < 4; i3++) {
            byte[] m24725A = m24725A(this.f74889U);
            for (int i4 = 0; i4 < 32; i4++) {
                this.f74889U[i4] = (byte) (m24725A[i4] ^ this.f74883C[i3][i4]);
            }
            this.f74890V = m24725A(m24725A(this.f74890V));
            for (int i5 = 0; i5 < 32; i5++) {
                this.f74891W[i5] = (byte) (this.f74889U[i5] ^ this.f74890V[i5]);
            }
            int i6 = i3 * 8;
            m24724E(m24723P(this.f74891W), this.f74888S, i6, this.f74884H, i6);
        }
        for (int i7 = 0; i7 < 12; i7++) {
            m24722fw(this.f74888S);
        }
        for (int i8 = 0; i8 < 32; i8++) {
            byte[] bArr2 = this.f74888S;
            bArr2[i8] = (byte) (bArr2[i8] ^ this.f74887M[i8]);
        }
        m24722fw(this.f74888S);
        for (int i9 = 0; i9 < 32; i9++) {
            byte[] bArr3 = this.f74888S;
            bArr3[i9] = (byte) (this.f74884H[i9] ^ bArr3[i9]);
        }
        for (int i10 = 0; i10 < 61; i10++) {
            m24722fw(this.f74888S);
        }
        byte[] bArr4 = this.f74888S;
        byte[] bArr5 = this.f74884H;
        System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount = 0L;
        this.xBufOff = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f74884H;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.f74886L;
            if (i2 >= bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.f74887M;
            if (i3 >= bArr3.length) {
                break;
            }
            bArr3[i3] = 0;
            i3++;
        }
        int i4 = 0;
        while (true) {
            byte[] bArr4 = this.f74883C[1];
            if (i4 >= bArr4.length) {
                break;
            }
            bArr4[i4] = 0;
            i4++;
        }
        int i5 = 0;
        while (true) {
            byte[] bArr5 = this.f74883C[3];
            if (i5 >= bArr5.length) {
                break;
            }
            bArr5[i5] = 0;
            i5++;
        }
        int i6 = 0;
        while (true) {
            byte[] bArr6 = this.Sum;
            if (i6 >= bArr6.length) {
                break;
            }
            bArr6[i6] = 0;
            i6++;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr7 = this.xBuf;
            if (i7 >= bArr7.length) {
                byte[] bArr8 = f74882C2;
                System.arraycopy(bArr8, 0, this.f74883C[2], 0, bArr8.length);
                return;
            }
            bArr7[i7] = 0;
            i7++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this.xBuf;
        int i = this.xBufOff;
        int i2 = i + 1;
        this.xBufOff = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            sumByteArray(bArr);
            processBlock(this.xBuf, 0);
            this.xBufOff = 0;
        }
        this.byteCount++;
    }

    public GOST3411Digest(GOST3411Digest gOST3411Digest) {
        this.f74884H = new byte[32];
        this.f74886L = new byte[32];
        this.f74887M = new byte[32];
        this.Sum = new byte[32];
        this.f74883C = (byte[][]) Array.newInstance(Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.f74885K = new byte[32];
        this.f74892a = new byte[8];
        this.f74893wS = new short[16];
        this.w_S = new short[16];
        this.f74888S = new byte[32];
        this.f74889U = new byte[32];
        this.f74890V = new byte[32];
        this.f74891W = new byte[32];
        reset(gOST3411Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        GOST3411Digest gOST3411Digest = (GOST3411Digest) memoable;
        byte[] bArr = gOST3411Digest.sBox;
        this.sBox = bArr;
        this.cipher.init(true, new ParametersWithSBox(null, bArr));
        reset();
        byte[] bArr2 = gOST3411Digest.f74884H;
        System.arraycopy(bArr2, 0, this.f74884H, 0, bArr2.length);
        byte[] bArr3 = gOST3411Digest.f74886L;
        System.arraycopy(bArr3, 0, this.f74886L, 0, bArr3.length);
        byte[] bArr4 = gOST3411Digest.f74887M;
        System.arraycopy(bArr4, 0, this.f74887M, 0, bArr4.length);
        byte[] bArr5 = gOST3411Digest.Sum;
        System.arraycopy(bArr5, 0, this.Sum, 0, bArr5.length);
        byte[] bArr6 = gOST3411Digest.f74883C[1];
        System.arraycopy(bArr6, 0, this.f74883C[1], 0, bArr6.length);
        byte[] bArr7 = gOST3411Digest.f74883C[2];
        System.arraycopy(bArr7, 0, this.f74883C[2], 0, bArr7.length);
        byte[] bArr8 = gOST3411Digest.f74883C[3];
        System.arraycopy(bArr8, 0, this.f74883C[3], 0, bArr8.length);
        byte[] bArr9 = gOST3411Digest.xBuf;
        System.arraycopy(bArr9, 0, this.xBuf, 0, bArr9.length);
        this.xBufOff = gOST3411Digest.xBufOff;
        this.byteCount = gOST3411Digest.byteCount;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (this.xBufOff != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.xBuf;
            if (i2 <= bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            sumByteArray(this.xBuf);
            processBlock(this.xBuf, 0);
            byte[] bArr3 = this.xBuf;
            i += bArr3.length;
            i2 -= bArr3.length;
            this.byteCount += bArr3.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    public GOST3411Digest(byte[] bArr) {
        this.f74884H = new byte[32];
        this.f74886L = new byte[32];
        this.f74887M = new byte[32];
        this.Sum = new byte[32];
        this.f74883C = (byte[][]) Array.newInstance(Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.f74885K = new byte[32];
        this.f74892a = new byte[8];
        this.f74893wS = new short[16];
        this.w_S = new short[16];
        this.f74888S = new byte[32];
        this.f74889U = new byte[32];
        this.f74890V = new byte[32];
        this.f74891W = new byte[32];
        byte[] clone = Arrays.clone(bArr);
        this.sBox = clone;
        this.cipher.init(true, new ParametersWithSBox(null, clone));
        reset();
    }
}