package p000;

import com.feitian.readerdk.Tool.Javacrc;

/* renamed from: hc0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20289hc0 {
    /* renamed from: a */
    public static void m31193a(int i, int i2, int i3, byte[] bArr, int i4, byte[] bArr2, int[] iArr) {
        byte[] bArr3 = new byte[259];
        bArr3[0] = (byte) (i & 255);
        bArr3[1] = (byte) (((i2 % 2) << 6) | ((i3 & 1) << 5));
        bArr3[2] = (byte) (i4 & 255);
        System.arraycopy(bArr, 0, bArr3, 3, i4);
        int i5 = i4 + 3;
        int i6 = i4 + 4;
        bArr3[i5] = Javacrc.csum_lrc_compute(bArr3, i5);
        System.arraycopy(bArr3, 0, bArr2, 0, i6);
        iArr[0] = i6;
    }
}