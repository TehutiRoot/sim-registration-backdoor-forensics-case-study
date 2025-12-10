package p000;

import com.feitian.readerdk.Tool.Javacrc;

/* renamed from: vr1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22689vr1 {
    /* renamed from: a */
    public static void m983a(int i, int i2, byte[] bArr, int[] iArr) {
        bArr[0] = (byte) (i & 255);
        bArr[1] = (byte) (((i2 & 1) << 4) | 128);
        bArr[2] = 0;
        bArr[3] = Javacrc.csum_lrc_compute(bArr, 3);
        iArr[0] = 4;
    }
}
