package p000;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;

/* renamed from: ka */
/* loaded from: classes5.dex */
public final class C11664ka implements InterfaceC16967wR {
    /* renamed from: c */
    public static char m28914c(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        if (i2 <= 255) {
            return (char) i2;
        }
        return (char) (i2 - 256);
    }

    @Override // p000.InterfaceC16967wR
    /* renamed from: a */
    public void mo842a(C17125yR c17125yR) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!c17125yR.m268i()) {
                break;
            }
            sb.append(c17125yR.m274c());
            c17125yR.f108750f++;
            int m34081l = HighLevelEncoder.m34081l(c17125yR.m273d(), c17125yR.f108750f, m28915b());
            if (m34081l != m28915b()) {
                c17125yR.m262o(m34081l);
                break;
            }
        }
        int length = sb.length() - 1;
        int m276a = c17125yR.m276a() + length + 1;
        c17125yR.m260q(m276a);
        if (c17125yR.m270g().getDataCapacity() - m276a > 0) {
            z = true;
        } else {
            z = false;
        }
        if (c17125yR.m268i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) + 249));
                sb.insert(1, (char) (length % ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: " + length);
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            c17125yR.m259r(m28914c(sb.charAt(i), c17125yR.m276a() + 1));
        }
    }

    /* renamed from: b */
    public int m28915b() {
        return 5;
    }
}
