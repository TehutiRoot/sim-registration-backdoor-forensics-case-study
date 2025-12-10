package p000;

import com.google.zxing.common.BitArray;

/* renamed from: b */
/* loaded from: classes5.dex */
public final class C5339b extends AbstractC10193f {
    public C5339b(BitArray bitArray) {
        super(bitArray);
    }

    @Override // p000.AbstractC10433i
    /* renamed from: d */
    public void mo30686d(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }

    @Override // p000.AbstractC10433i
    /* renamed from: e */
    public int mo30685e(int i) {
        if (i < 10000) {
            return i;
        }
        return i - 10000;
    }
}
