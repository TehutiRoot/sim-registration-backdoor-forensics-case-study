package p000;

import androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import ch.qos.logback.core.CoreConstants;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* renamed from: e */
/* loaded from: classes5.dex */
public final class C10118e extends AbstractC10433i {

    /* renamed from: c */
    public final String f61380c;

    /* renamed from: d */
    public final String f61381d;

    public C10118e(BitArray bitArray, String str, String str2) {
        super(bitArray);
        this.f61380c = str2;
        this.f61381d = str;
    }

    @Override // p000.AbstractC10433i
    /* renamed from: d */
    public void mo30686d(StringBuilder sb, int i) {
        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb.append(this.f61381d);
        sb.append(i / AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // p000.AbstractC10433i
    /* renamed from: e */
    public int mo30685e(int i) {
        return i % AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
    }

    /* renamed from: g */
    public final void m31605g(StringBuilder sb, int i) {
        int m67795f = getGeneralDecoder().m67795f(i, 16);
        if (m67795f == 38400) {
            return;
        }
        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb.append(this.f61380c);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        int i2 = m67795f % 32;
        int i3 = m67795f / 32;
        int i4 = (i3 % 12) + 1;
        int i5 = i3 / 12;
        if (i5 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i5);
        if (i4 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i4);
        if (i2 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i2);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() {
        if (getInformation().getSize() == 84) {
            StringBuilder sb = new StringBuilder();
            m30939b(sb, 8);
            m30684f(sb, 48, 20);
            m31605g(sb, 68);
            return sb.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
