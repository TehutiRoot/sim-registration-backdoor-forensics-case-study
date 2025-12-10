package p000;

import com.feitian.readerdk.Tool.Javacrc;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;

/* renamed from: bE1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19193bE1 {
    /* renamed from: a */
    public static void m51975a(int i, int i2, int i3, byte[] bArr, int i4, byte[] bArr2, int[] iArr) {
        bArr2[0] = (byte) (i & 255);
        bArr2[1] = (byte) (((i2 & 1) << 5) | CertificateHolderAuthorization.CVCA | (i3 & 31));
        bArr2[2] = (byte) i4;
        if (i4 != 0) {
            System.arraycopy(bArr, 0, bArr2, 3, i4);
        }
        int i5 = i4 + 3;
        bArr2[i5] = Javacrc.csum_lrc_compute(bArr2, i5);
        iArr[0] = i4 + 4;
    }
}