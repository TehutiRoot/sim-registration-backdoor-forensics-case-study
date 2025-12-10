package org.apache.commons.codec.digest;

import java.util.zip.Checksum;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public class XXHash32 implements Checksum {

    /* renamed from: a */
    public final byte[] f73108a;

    /* renamed from: b */
    public final int[] f73109b;

    /* renamed from: c */
    public final byte[] f73110c;

    /* renamed from: d */
    public final int f73111d;

    /* renamed from: e */
    public int f73112e;

    /* renamed from: f */
    public int f73113f;

    /* renamed from: g */
    public boolean f73114g;

    public XXHash32() {
        this(0);
    }

    /* renamed from: a */
    public static int m25583a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: b */
    public final void m25582b() {
        int[] iArr = this.f73109b;
        int i = this.f73111d;
        iArr[0] = 606290984 + i;
        iArr[1] = (-2048144777) + i;
        iArr[2] = i;
        iArr[3] = i - (-1640531535);
    }

    /* renamed from: c */
    public final void m25581c(byte[] bArr, int i) {
        int[] iArr = this.f73109b;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int[] iArr2 = this.f73109b;
        iArr2[0] = Integer.rotateLeft(i2 + (m25583a(bArr, i) * (-2048144777)), 13) * (-1640531535);
        iArr2[1] = Integer.rotateLeft(i3 + (m25583a(bArr, i + 4) * (-2048144777)), 13) * (-1640531535);
        iArr2[2] = Integer.rotateLeft(i4 + (m25583a(bArr, i + 8) * (-2048144777)), 13) * (-1640531535);
        iArr2[3] = Integer.rotateLeft(i5 + (m25583a(bArr, i + 12) * (-2048144777)), 13) * (-1640531535);
        this.f73114g = true;
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        int i;
        int i2 = 0;
        if (this.f73114g) {
            i = Integer.rotateLeft(this.f73109b[0], 1) + Integer.rotateLeft(this.f73109b[1], 7) + Integer.rotateLeft(this.f73109b[2], 12) + Integer.rotateLeft(this.f73109b[3], 18);
        } else {
            i = this.f73109b[2] + 374761393;
        }
        int i3 = i + this.f73112e;
        int i4 = this.f73113f - 4;
        while (i2 <= i4) {
            i3 = Integer.rotateLeft(i3 + (m25583a(this.f73110c, i2) * (-1028477379)), 17) * 668265263;
            i2 += 4;
        }
        while (i2 < this.f73113f) {
            i3 = Integer.rotateLeft(i3 + ((this.f73110c[i2] & 255) * 374761393), 11) * (-1640531535);
            i2++;
        }
        int i5 = (i3 ^ (i3 >>> 15)) * (-2048144777);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477379);
        return (i6 ^ (i6 >>> 16)) & BodyPartID.bodyIdMax;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        m25582b();
        this.f73112e = 0;
        this.f73113f = 0;
        this.f73114g = false;
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        this.f73112e += i2;
        int i3 = i + i2;
        int i4 = this.f73113f;
        if ((i4 + i2) - 16 < 0) {
            System.arraycopy(bArr, i, this.f73110c, i4, i2);
            this.f73113f += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = 16 - i4;
            System.arraycopy(bArr, i, this.f73110c, i4, i5);
            m25581c(this.f73110c, 0);
            i += i5;
        }
        int i6 = i3 - 16;
        while (i <= i6) {
            m25581c(bArr, i);
            i += 16;
        }
        if (i < i3) {
            int i7 = i3 - i;
            this.f73113f = i7;
            System.arraycopy(bArr, i, this.f73110c, 0, i7);
            return;
        }
        this.f73113f = 0;
    }

    public XXHash32(int i) {
        this.f73108a = new byte[1];
        this.f73109b = new int[4];
        this.f73110c = new byte[16];
        this.f73111d = i;
        m25582b();
    }

    @Override // java.util.zip.Checksum
    public void update(int i) {
        byte[] bArr = this.f73108a;
        bArr[0] = (byte) (i & 255);
        update(bArr, 0, 1);
    }
}
