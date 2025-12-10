package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* renamed from: c */
/* loaded from: classes5.dex */
public final class C5390c extends AbstractC10328h {
    public C5390c(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() {
        if (getInformation().getSize() >= 48) {
            StringBuilder sb = new StringBuilder();
            m31310b(sb, 8);
            int m67286f = getGeneralDecoder().m67286f(48, 2);
            sb.append("(392");
            sb.append(m67286f);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            sb.append(getGeneralDecoder().m67289c(50, null).m29265b());
            return sb.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}