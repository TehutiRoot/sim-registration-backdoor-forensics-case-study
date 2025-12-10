package p000;

import com.google.zxing.common.BitArray;
import kotlin.text.Typography;

/* renamed from: xK1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C23017xK1 extends AbstractC22175sU1 {

    /* renamed from: c */
    public final short f108720c;

    /* renamed from: d */
    public final short f108721d;

    public C23017xK1(AbstractC22175sU1 abstractC22175sU1, int i, int i2) {
        super(abstractC22175sU1);
        this.f108720c = (short) i;
        this.f108721d = (short) i2;
    }

    @Override // p000.AbstractC22175sU1
    /* renamed from: c */
    public void mo555c(BitArray bitArray, byte[] bArr) {
        bitArray.appendBits(this.f108720c, this.f108721d);
    }

    public String toString() {
        short s = this.f108720c;
        short s2 = this.f108721d;
        int i = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(i | (1 << this.f108721d)).substring(1) + Typography.greater;
    }
}