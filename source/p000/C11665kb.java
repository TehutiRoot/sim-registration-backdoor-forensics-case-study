package p000;

import com.google.zxing.common.BitArray;
import kotlin.text.Typography;

/* renamed from: kb */
/* loaded from: classes5.dex */
public final class C11665kb extends AbstractC22624vT1 {

    /* renamed from: c */
    public final short f67944c;

    /* renamed from: d */
    public final short f67945d;

    public C11665kb(AbstractC22624vT1 abstractC22624vT1, int i, int i2) {
        super(abstractC22624vT1);
        this.f67944c = (short) i;
        this.f67945d = (short) i2;
    }

    @Override // p000.AbstractC22624vT1
    /* renamed from: c */
    public void mo1027c(BitArray bitArray, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f67945d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    bitArray.appendBits(31, 5);
                    short s2 = this.f67945d;
                    if (s2 > 62) {
                        bitArray.appendBits(s2 - 31, 16);
                    } else if (i == 0) {
                        bitArray.appendBits(Math.min((int) s2, 31), 5);
                    } else {
                        bitArray.appendBits(s2 - 31, 5);
                    }
                }
                bitArray.appendBits(bArr[this.f67944c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.f67944c);
        sb.append("::");
        sb.append((this.f67944c + this.f67945d) - 1);
        sb.append(Typography.greater);
        return sb.toString();
    }
}
