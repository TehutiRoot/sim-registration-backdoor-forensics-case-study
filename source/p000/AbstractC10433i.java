package p000;

import androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.zxing.common.BitArray;

/* renamed from: i */
/* loaded from: classes5.dex */
public abstract class AbstractC10433i extends AbstractC10347h {
    public AbstractC10433i(BitArray bitArray) {
        super(bitArray);
    }

    /* renamed from: d */
    public abstract void mo30686d(StringBuilder sb, int i);

    /* renamed from: e */
    public abstract int mo30685e(int i);

    /* renamed from: f */
    public final void m30684f(StringBuilder sb, int i, int i2) {
        int m67795f = getGeneralDecoder().m67795f(i, i2);
        mo30686d(sb, m67795f);
        int mo30685e = mo30685e(m67795f);
        int i3 = AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
        for (int i4 = 0; i4 < 5; i4++) {
            if (mo30685e / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(mo30685e);
    }
}
