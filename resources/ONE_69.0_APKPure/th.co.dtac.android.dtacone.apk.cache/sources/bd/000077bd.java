package p000;

import com.google.zxing.common.BitArray;

/* renamed from: b */
/* loaded from: classes5.dex */
public final class C5319b extends AbstractC10188f {
    public C5319b(BitArray bitArray) {
        super(bitArray);
    }

    @Override // p000.AbstractC10419i
    /* renamed from: d */
    public void mo31064d(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }

    @Override // p000.AbstractC10419i
    /* renamed from: e */
    public int mo31063e(int i) {
        if (i < 10000) {
            return i;
        }
        return i - 10000;
    }
}