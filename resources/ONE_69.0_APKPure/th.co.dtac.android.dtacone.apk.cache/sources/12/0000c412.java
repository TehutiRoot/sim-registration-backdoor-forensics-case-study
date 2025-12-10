package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* renamed from: d */
/* loaded from: classes5.dex */
public final class C10027d extends AbstractC10328h {
    public C10027d(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() {
        if (getInformation().getSize() >= 48) {
            StringBuilder sb = new StringBuilder();
            m31310b(sb, 8);
            int m67286f = getGeneralDecoder().m67286f(48, 2);
            sb.append("(393");
            sb.append(m67286f);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            int m67286f2 = getGeneralDecoder().m67286f(50, 10);
            if (m67286f2 / 100 == 0) {
                sb.append('0');
            }
            if (m67286f2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(m67286f2);
            sb.append(getGeneralDecoder().m67289c(60, null).m29265b());
            return sb.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}