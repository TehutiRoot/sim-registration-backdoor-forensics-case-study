package p000;

import com.google.zxing.common.BitArray;
import kotlin.text.Typography;

/* renamed from: kb */
/* loaded from: classes5.dex */
public final class C11641kb extends AbstractC22175sU1 {

    /* renamed from: c */
    public final short f67996c;

    /* renamed from: d */
    public final short f67997d;

    public C11641kb(AbstractC22175sU1 abstractC22175sU1, int i, int i2) {
        super(abstractC22175sU1);
        this.f67996c = (short) i;
        this.f67997d = (short) i2;
    }

    @Override // p000.AbstractC22175sU1
    /* renamed from: c */
    public void mo555c(BitArray bitArray, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f67997d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    bitArray.appendBits(31, 5);
                    short s2 = this.f67997d;
                    if (s2 > 62) {
                        bitArray.appendBits(s2 - 31, 16);
                    } else if (i == 0) {
                        bitArray.appendBits(Math.min((int) s2, 31), 5);
                    } else {
                        bitArray.appendBits(s2 - 31, 5);
                    }
                }
                bitArray.appendBits(bArr[this.f67996c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.f67996c);
        sb.append("::");
        sb.append((this.f67996c + this.f67997d) - 1);
        sb.append(Typography.greater);
        return sb.toString();
    }
}