package p000;

import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import es.dmoral.toasty.BuildConfig;

/* renamed from: m */
/* loaded from: classes5.dex */
public final class C12240m implements InterfaceC0028AR {
    /* renamed from: b */
    public static char m26744b(char c, char c2) {
        if (HighLevelEncoder.m34081d(c) && HighLevelEncoder.m34081d(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + BuildConfig.VERSION_CODE);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // p000.InterfaceC0028AR
    /* renamed from: a */
    public void mo26745a(C0179CR c0179cr) {
        if (HighLevelEncoder.determineConsecutiveDigitCount(c0179cr.m68965d(), c0179cr.f749f) >= 2) {
            c0179cr.m68951r(m26744b(c0179cr.m68965d().charAt(c0179cr.f749f), c0179cr.m68965d().charAt(c0179cr.f749f + 1)));
            c0179cr.f749f += 2;
            return;
        }
        char m68966c = c0179cr.m68966c();
        int m34073l = HighLevelEncoder.m34073l(c0179cr.m68965d(), c0179cr.f749f, m26743c());
        if (m34073l != m26743c()) {
            if (m34073l != 1) {
                if (m34073l != 2) {
                    if (m34073l != 3) {
                        if (m34073l != 4) {
                            if (m34073l == 5) {
                                c0179cr.m68951r((char) 231);
                                c0179cr.m68954o(5);
                                return;
                            }
                            throw new IllegalStateException("Illegal mode: " + m34073l);
                        }
                        c0179cr.m68951r((char) 240);
                        c0179cr.m68954o(4);
                        return;
                    }
                    c0179cr.m68951r((char) 238);
                    c0179cr.m68954o(3);
                    return;
                }
                c0179cr.m68951r((char) 239);
                c0179cr.m68954o(2);
                return;
            }
            c0179cr.m68951r((char) 230);
            c0179cr.m68954o(1);
        } else if (HighLevelEncoder.m34080e(m68966c)) {
            c0179cr.m68951r((char) 235);
            c0179cr.m68951r((char) (m68966c - 127));
            c0179cr.f749f++;
        } else {
            c0179cr.m68951r((char) (m68966c + 1));
            c0179cr.f749f++;
        }
    }

    /* renamed from: c */
    public int m26743c() {
        return 0;
    }
}