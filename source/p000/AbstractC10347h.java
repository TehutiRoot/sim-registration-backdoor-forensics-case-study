package p000;

import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;

/* renamed from: h */
/* loaded from: classes5.dex */
public abstract class AbstractC10347h extends AbstractExpandedDecoder {
    public AbstractC10347h(BitArray bitArray) {
        super(bitArray);
    }

    /* renamed from: a */
    public static void m30940a(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb.append(i2);
    }

    /* renamed from: b */
    public final void m30939b(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        m30938c(sb, i, length);
    }

    /* renamed from: c */
    public final void m30938c(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int m67795f = getGeneralDecoder().m67795f((i3 * 10) + i, 10);
            if (m67795f / 100 == 0) {
                sb.append('0');
            }
            if (m67795f / 10 == 0) {
                sb.append('0');
            }
            sb.append(m67795f);
        }
        m30940a(sb, i2);
    }
}
