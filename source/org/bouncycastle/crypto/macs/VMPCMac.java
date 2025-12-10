package org.bouncycastle.crypto.macs;

import com.google.common.base.Ascii;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes6.dex */
public class VMPCMac implements Mac {

    /* renamed from: T */
    private byte[] f75111T;

    /* renamed from: g */
    private byte f75112g;
    private byte[] workingIV;
    private byte[] workingKey;

    /* renamed from: x1 */
    private byte f75115x1;

    /* renamed from: x2 */
    private byte f75116x2;

    /* renamed from: x3 */
    private byte f75117x3;

    /* renamed from: x4 */
    private byte f75118x4;

    /* renamed from: n */
    private byte f75113n = 0;

    /* renamed from: P */
    private byte[] f75110P = null;

    /* renamed from: s */
    private byte f75114s = 0;

    private void initKey(byte[] bArr, byte[] bArr2) {
        this.f75114s = (byte) 0;
        this.f75110P = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.f75110P[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.f75110P;
            byte b = this.f75114s;
            int i3 = i2 & 255;
            byte b2 = bArr3[i3];
            byte b3 = bArr3[(b + b2 + bArr[i2 % bArr.length]) & 255];
            this.f75114s = b3;
            bArr3[i3] = bArr3[b3 & 255];
            bArr3[b3 & 255] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            byte[] bArr4 = this.f75110P;
            byte b4 = this.f75114s;
            int i5 = i4 & 255;
            byte b5 = bArr4[i5];
            byte b6 = bArr4[(b4 + b5 + bArr2[i4 % bArr2.length]) & 255];
            this.f75114s = b6;
            bArr4[i5] = bArr4[b6 & 255];
            bArr4[b6 & 255] = b5;
        }
        this.f75113n = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        for (int i2 = 1; i2 < 25; i2++) {
            byte[] bArr2 = this.f75110P;
            byte b = this.f75114s;
            byte b2 = this.f75113n;
            byte b3 = bArr2[(b + bArr2[b2 & 255]) & 255];
            this.f75114s = b3;
            byte b4 = this.f75118x4;
            byte b5 = this.f75117x3;
            byte b6 = bArr2[(b4 + b5 + i2) & 255];
            this.f75118x4 = b6;
            byte b7 = this.f75116x2;
            byte b8 = bArr2[(b5 + b7 + i2) & 255];
            this.f75117x3 = b8;
            byte b9 = this.f75115x1;
            byte b10 = bArr2[(b7 + b9 + i2) & 255];
            this.f75116x2 = b10;
            byte b11 = bArr2[(b9 + b3 + i2) & 255];
            this.f75115x1 = b11;
            byte[] bArr3 = this.f75111T;
            byte b12 = this.f75112g;
            bArr3[b12 & Ascii.f52695US] = (byte) (b11 ^ bArr3[b12 & Ascii.f52695US]);
            bArr3[(b12 + 1) & 31] = (byte) (b10 ^ bArr3[(b12 + 1) & 31]);
            bArr3[(b12 + 2) & 31] = (byte) (b8 ^ bArr3[(b12 + 2) & 31]);
            bArr3[(b12 + 3) & 31] = (byte) (b6 ^ bArr3[(b12 + 3) & 31]);
            this.f75112g = (byte) ((b12 + 4) & 31);
            byte b13 = bArr2[b2 & 255];
            bArr2[b2 & 255] = bArr2[b3 & 255];
            bArr2[b3 & 255] = b13;
            this.f75113n = (byte) ((b2 + 1) & 255);
        }
        for (int i3 = 0; i3 < 768; i3++) {
            byte[] bArr4 = this.f75110P;
            byte b14 = this.f75114s;
            int i4 = i3 & 255;
            byte b15 = bArr4[i4];
            byte b16 = bArr4[(b14 + b15 + this.f75111T[i3 & 31]) & 255];
            this.f75114s = b16;
            bArr4[i4] = bArr4[b16 & 255];
            bArr4[b16 & 255] = b15;
        }
        byte[] bArr5 = new byte[20];
        for (int i5 = 0; i5 < 20; i5++) {
            byte[] bArr6 = this.f75110P;
            int i6 = i5 & 255;
            byte b17 = bArr6[(this.f75114s + bArr6[i6]) & 255];
            this.f75114s = b17;
            bArr5[i5] = bArr6[(bArr6[bArr6[b17 & 255] & 255] + 1) & 255];
            byte b18 = bArr6[i6];
            bArr6[i6] = bArr6[b17 & 255];
            bArr6[b17 & 255] = b18;
        }
        System.arraycopy(bArr5, 0, bArr, i, 20);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        byte[] iv = parametersWithIV.getIV();
        this.workingIV = iv;
        if (iv == null || iv.length < 1 || iv.length > 768) {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.workingKey = keyParameter.getKey();
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        initKey(this.workingKey, this.workingIV);
        this.f75113n = (byte) 0;
        this.f75118x4 = (byte) 0;
        this.f75117x3 = (byte) 0;
        this.f75116x2 = (byte) 0;
        this.f75115x1 = (byte) 0;
        this.f75112g = (byte) 0;
        this.f75111T = new byte[32];
        for (int i = 0; i < 32; i++) {
            this.f75111T[i] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) throws IllegalStateException {
        byte[] bArr = this.f75110P;
        byte b2 = this.f75114s;
        byte b3 = this.f75113n;
        byte b4 = bArr[(b2 + bArr[b3 & 255]) & 255];
        this.f75114s = b4;
        byte b5 = this.f75118x4;
        byte b6 = this.f75117x3;
        byte b7 = bArr[(b5 + b6) & 255];
        this.f75118x4 = b7;
        byte b8 = this.f75116x2;
        byte b9 = bArr[(b6 + b8) & 255];
        this.f75117x3 = b9;
        byte b10 = this.f75115x1;
        byte b11 = bArr[(b8 + b10) & 255];
        this.f75116x2 = b11;
        byte b12 = bArr[(b10 + b4 + ((byte) (b ^ bArr[(bArr[bArr[b4 & 255] & 255] + 1) & 255]))) & 255];
        this.f75115x1 = b12;
        byte[] bArr2 = this.f75111T;
        byte b13 = this.f75112g;
        bArr2[b13 & Ascii.f52695US] = (byte) (b12 ^ bArr2[b13 & Ascii.f52695US]);
        bArr2[(b13 + 1) & 31] = (byte) (b11 ^ bArr2[(b13 + 1) & 31]);
        bArr2[(b13 + 2) & 31] = (byte) (b9 ^ bArr2[(b13 + 2) & 31]);
        bArr2[(b13 + 3) & 31] = (byte) (b7 ^ bArr2[(b13 + 3) & 31]);
        this.f75112g = (byte) ((b13 + 4) & 31);
        byte b14 = bArr[b3 & 255];
        bArr[b3 & 255] = bArr[b4 & 255];
        bArr[b4 & 255] = b14;
        this.f75113n = (byte) ((b3 + 1) & 255);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }
}
