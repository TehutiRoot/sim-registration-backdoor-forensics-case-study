package org.apache.commons.codec.digest;

import java.util.zip.Checksum;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public class XXHash32 implements Checksum {

    /* renamed from: a */
    public final byte[] f73192a;

    /* renamed from: b */
    public final int[] f73193b;

    /* renamed from: c */
    public final byte[] f73194c;

    /* renamed from: d */
    public final int f73195d;

    /* renamed from: e */
    public int f73196e;

    /* renamed from: f */
    public int f73197f;

    /* renamed from: g */
    public boolean f73198g;

    public XXHash32() {
        this(0);
    }

    /* renamed from: a */
    public static int m25773a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: b */
    public final void m25772b() {
        int[] iArr = this.f73193b;
        int i = this.f73195d;
        iArr[0] = 606290984 + i;
        iArr[1] = (-2048144777) + i;
        iArr[2] = i;
        iArr[3] = i - (-1640531535);
    }

    /* renamed from: c */
    public final void m25771c(byte[] bArr, int i) {
        int[] iArr = this.f73193b;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int[] iArr2 = this.f73193b;
        iArr2[0] = Integer.rotateLeft(i2 + (m25773a(bArr, i) * (-2048144777)), 13) * (-1640531535);
        iArr2[1] = Integer.rotateLeft(i3 + (m25773a(bArr, i + 4) * (-2048144777)), 13) * (-1640531535);
        iArr2[2] = Integer.rotateLeft(i4 + (m25773a(bArr, i + 8) * (-2048144777)), 13) * (-1640531535);
        iArr2[3] = Integer.rotateLeft(i5 + (m25773a(bArr, i + 12) * (-2048144777)), 13) * (-1640531535);
        this.f73198g = true;
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        int i;
        int i2 = 0;
        if (this.f73198g) {
            i = Integer.rotateLeft(this.f73193b[0], 1) + Integer.rotateLeft(this.f73193b[1], 7) + Integer.rotateLeft(this.f73193b[2], 12) + Integer.rotateLeft(this.f73193b[3], 18);
        } else {
            i = this.f73193b[2] + 374761393;
        }
        int i3 = i + this.f73196e;
        int i4 = this.f73197f - 4;
        while (i2 <= i4) {
            i3 = Integer.rotateLeft(i3 + (m25773a(this.f73194c, i2) * (-1028477379)), 17) * 668265263;
            i2 += 4;
        }
        while (i2 < this.f73197f) {
            i3 = Integer.rotateLeft(i3 + ((this.f73194c[i2] & 255) * 374761393), 11) * (-1640531535);
            i2++;
        }
        int i5 = (i3 ^ (i3 >>> 15)) * (-2048144777);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477379);
        return (i6 ^ (i6 >>> 16)) & BodyPartID.bodyIdMax;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        m25772b();
        this.f73196e = 0;
        this.f73197f = 0;
        this.f73198g = false;
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        this.f73196e += i2;
        int i3 = i + i2;
        int i4 = this.f73197f;
        if ((i4 + i2) - 16 < 0) {
            System.arraycopy(bArr, i, this.f73194c, i4, i2);
            this.f73197f += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = 16 - i4;
            System.arraycopy(bArr, i, this.f73194c, i4, i5);
            m25771c(this.f73194c, 0);
            i += i5;
        }
        int i6 = i3 - 16;
        while (i <= i6) {
            m25771c(bArr, i);
            i += 16;
        }
        if (i < i3) {
            int i7 = i3 - i;
            this.f73197f = i7;
            System.arraycopy(bArr, i, this.f73194c, 0, i7);
            return;
        }
        this.f73197f = 0;
    }

    public XXHash32(int i) {
        this.f73192a = new byte[1];
        this.f73193b = new int[4];
        this.f73194c = new byte[16];
        this.f73195d = i;
        m25772b();
    }

    @Override // java.util.zip.Checksum
    public void update(int i) {
        byte[] bArr = this.f73192a;
        bArr[0] = (byte) (i & 255);
        update(bArr, 0, 1);
    }
}