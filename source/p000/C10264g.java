package p000;

import com.google.zxing.common.BitArray;

/* renamed from: g */
/* loaded from: classes5.dex */
public final class C10264g extends AbstractC10347h {
    public C10264g(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() {
        StringBuilder sb = new StringBuilder();
        sb.append("(01)");
        int length = sb.length();
        sb.append(getGeneralDecoder().m67795f(4, 4));
        m30938c(sb, 8, length);
        return getGeneralDecoder().m67800a(sb, 48);
    }
}
