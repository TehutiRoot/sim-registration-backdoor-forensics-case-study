package p000;

import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;

/* renamed from: Q4 */
/* loaded from: classes5.dex */
public final class C1145Q4 extends AbstractExpandedDecoder {
    public C1145Q4(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() {
        return getGeneralDecoder().m67800a(new StringBuilder(), 5);
    }
}
