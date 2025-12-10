package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* renamed from: c */
/* loaded from: classes5.dex */
public final class C5414c extends AbstractC10347h {
    public C5414c(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() {
        if (getInformation().getSize() >= 48) {
            StringBuilder sb = new StringBuilder();
            m30939b(sb, 8);
            int m67795f = getGeneralDecoder().m67795f(48, 2);
            sb.append("(392");
            sb.append(m67795f);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            sb.append(getGeneralDecoder().m67798c(50, null).m29279b());
            return sb.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
