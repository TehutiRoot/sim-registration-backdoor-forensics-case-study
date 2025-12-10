package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* renamed from: d */
/* loaded from: classes5.dex */
public final class C10039d extends AbstractC10347h {
    public C10039d(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() {
        if (getInformation().getSize() >= 48) {
            StringBuilder sb = new StringBuilder();
            m30939b(sb, 8);
            int m67795f = getGeneralDecoder().m67795f(48, 2);
            sb.append("(393");
            sb.append(m67795f);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            int m67795f2 = getGeneralDecoder().m67795f(50, 10);
            if (m67795f2 / 100 == 0) {
                sb.append('0');
            }
            if (m67795f2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(m67795f2);
            sb.append(getGeneralDecoder().m67798c(60, null).m29279b());
            return sb.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
