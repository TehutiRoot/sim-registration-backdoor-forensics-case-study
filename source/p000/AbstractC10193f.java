package p000;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* renamed from: f */
/* loaded from: classes5.dex */
public abstract class AbstractC10193f extends AbstractC10433i {
    public AbstractC10193f(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() {
        if (getInformation().getSize() == 60) {
            StringBuilder sb = new StringBuilder();
            m30939b(sb, 5);
            m30684f(sb, 45, 15);
            return sb.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
