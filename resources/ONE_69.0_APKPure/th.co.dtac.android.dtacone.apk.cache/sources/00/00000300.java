package p000;

import com.google.zxing.datamatrix.encoder.HighLevelEncoder;

/* renamed from: D72 */
/* loaded from: classes5.dex */
public final class D72 extends C1818Zf {
    @Override // p000.C1818Zf, p000.InterfaceC0028AR
    /* renamed from: a */
    public void mo26745a(C0179CR c0179cr) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c0179cr.m68960i()) {
                break;
            }
            char m68966c = c0179cr.m68966c();
            c0179cr.f749f++;
            mo65211c(m68966c, sb);
            if (sb.length() % 3 == 0) {
                C1818Zf.m65207g(c0179cr, sb);
                int m34073l = HighLevelEncoder.m34073l(c0179cr.m68965d(), c0179cr.f749f, mo65209e());
                if (m34073l != mo65209e()) {
                    c0179cr.m68954o(m34073l);
                    break;
                }
            }
        }
        mo65208f(c0179cr, sb);
    }

    @Override // p000.C1818Zf
    /* renamed from: c */
    public int mo65211c(char c, StringBuilder sb) {
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
            HighLevelEncoder.m34082c(c);
        }
        return 1;
    }

    @Override // p000.C1818Zf
    /* renamed from: e */
    public int mo65209e() {
        return 3;
    }

    @Override // p000.C1818Zf
    /* renamed from: f */
    public void mo65208f(C0179CR c0179cr, StringBuilder sb) {
        c0179cr.m68953p();
        int dataCapacity = c0179cr.m68962g().getDataCapacity() - c0179cr.m68968a();
        c0179cr.f749f -= sb.length();
        if (c0179cr.m68963f() > 1 || dataCapacity > 1 || c0179cr.m68963f() != dataCapacity) {
            c0179cr.m68951r((char) 254);
        }
        if (c0179cr.m68964e() < 0) {
            c0179cr.m68954o(0);
        }
    }
}