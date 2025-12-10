package p000;

import com.google.zxing.common.BitArray;
import kotlin.text.Typography;

/* renamed from: AJ1 */
/* loaded from: classes5.dex */
public final class AJ1 extends AbstractC22624vT1 {

    /* renamed from: c */
    public final short f74c;

    /* renamed from: d */
    public final short f75d;

    public AJ1(AbstractC22624vT1 abstractC22624vT1, int i, int i2) {
        super(abstractC22624vT1);
        this.f74c = (short) i;
        this.f75d = (short) i2;
    }

    @Override // p000.AbstractC22624vT1
    /* renamed from: c */
    public void mo1027c(BitArray bitArray, byte[] bArr) {
        bitArray.appendBits(this.f74c, this.f75d);
    }

    public String toString() {
        short s = this.f74c;
        short s2 = this.f75d;
        int i = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(i | (1 << this.f75d)).substring(1) + Typography.greater;
    }
}
