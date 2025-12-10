package p000;

import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;

/* renamed from: Q4 */
/* loaded from: classes5.dex */
public final class C1135Q4 extends AbstractExpandedDecoder {
    public C1135Q4(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() {
        return getGeneralDecoder().m67291a(new StringBuilder(), 5);
    }
}