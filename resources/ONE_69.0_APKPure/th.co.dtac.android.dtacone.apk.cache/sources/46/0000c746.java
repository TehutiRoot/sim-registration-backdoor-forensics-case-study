package p000;

import com.google.zxing.common.BitArray;

/* renamed from: g */
/* loaded from: classes5.dex */
public final class C10260g extends AbstractC10328h {
    public C10260g(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() {
        StringBuilder sb = new StringBuilder();
        sb.append("(01)");
        int length = sb.length();
        sb.append(getGeneralDecoder().m67286f(4, 4));
        m31309c(sb, 8, length);
        return getGeneralDecoder().m67291a(sb, 48);
    }
}