package p000;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;

/* renamed from: ka */
/* loaded from: classes5.dex */
public final class C11640ka implements InterfaceC0028AR {
    /* renamed from: c */
    public static char m29186c(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        if (i2 <= 255) {
            return (char) i2;
        }
        return (char) (i2 - 256);
    }

    @Override // p000.InterfaceC0028AR
    /* renamed from: a */
    public void mo26745a(C0179CR c0179cr) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!c0179cr.m68960i()) {
                break;
            }
            sb.append(c0179cr.m68966c());
            c0179cr.f749f++;
            int m34073l = HighLevelEncoder.m34073l(c0179cr.m68965d(), c0179cr.f749f, m29187b());
            if (m34073l != m29187b()) {
                c0179cr.m68954o(m34073l);
                break;
            }
        }
        int length = sb.length() - 1;
        int m68968a = c0179cr.m68968a() + length + 1;
        c0179cr.m68952q(m68968a);
        if (c0179cr.m68962g().getDataCapacity() - m68968a > 0) {
            z = true;
        } else {
            z = false;
        }
        if (c0179cr.m68960i() || z) {
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
            c0179cr.m68951r(m29186c(sb.charAt(i), c0179cr.m68968a() + 1));
        }
    }

    /* renamed from: b */
    public int m29187b() {
        return 5;
    }
}