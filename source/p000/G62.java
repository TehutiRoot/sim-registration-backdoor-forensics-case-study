package p000;

import com.google.zxing.datamatrix.encoder.HighLevelEncoder;

/* renamed from: G62 */
/* loaded from: classes5.dex */
public final class G62 extends C1839Zf {
    @Override // p000.C1839Zf, p000.InterfaceC16967wR
    /* renamed from: a */
    public void mo842a(C17125yR c17125yR) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c17125yR.m268i()) {
                break;
            }
            char m274c = c17125yR.m274c();
            c17125yR.f108750f++;
            mo65166c(m274c, sb);
            if (sb.length() % 3 == 0) {
                C1839Zf.m65162g(c17125yR, sb);
                int m34081l = HighLevelEncoder.m34081l(c17125yR.m273d(), c17125yR.f108750f, mo65164e());
                if (m34081l != mo65164e()) {
                    c17125yR.m262o(m34081l);
                    break;
                }
            }
        }
        mo65163f(c17125yR, sb);
    }

    @Override // p000.C1839Zf
    /* renamed from: c */
    public int mo65166c(char c, StringBuilder sb) {
        if (c == '\r') {
            sb.append((char) 0);
        } else if (c == '*') {
            sb.append((char) 1);
        } else if (c == '>') {
            sb.append((char) 2);
        } else if (c == ' ') {
            sb.append((char) 3);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
        } else {
            HighLevelEncoder.m34090c(c);
        }
        return 1;
    }

    @Override // p000.C1839Zf
    /* renamed from: e */
    public int mo65164e() {
        return 3;
    }

    @Override // p000.C1839Zf
    /* renamed from: f */
    public void mo65163f(C17125yR c17125yR, StringBuilder sb) {
        c17125yR.m261p();
        int dataCapacity = c17125yR.m270g().getDataCapacity() - c17125yR.m276a();
        c17125yR.f108750f -= sb.length();
        if (c17125yR.m271f() > 1 || dataCapacity > 1 || c17125yR.m271f() != dataCapacity) {
            c17125yR.m259r((char) 254);
        }
        if (c17125yR.m272e() < 0) {
            c17125yR.m262o(0);
        }
    }
}
