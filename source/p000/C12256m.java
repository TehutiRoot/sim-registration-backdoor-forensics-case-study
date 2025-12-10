package p000;

import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import es.dmoral.toasty.BuildConfig;

/* renamed from: m */
/* loaded from: classes5.dex */
public final class C12256m implements InterfaceC16967wR {
    /* renamed from: b */
    public static char m26392b(char c, char c2) {
        if (HighLevelEncoder.m34089d(c) && HighLevelEncoder.m34089d(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + BuildConfig.VERSION_CODE);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // p000.InterfaceC16967wR
    /* renamed from: a */
    public void mo842a(C17125yR c17125yR) {
        if (HighLevelEncoder.determineConsecutiveDigitCount(c17125yR.m273d(), c17125yR.f108750f) >= 2) {
            c17125yR.m259r(m26392b(c17125yR.m273d().charAt(c17125yR.f108750f), c17125yR.m273d().charAt(c17125yR.f108750f + 1)));
            c17125yR.f108750f += 2;
            return;
        }
        char m274c = c17125yR.m274c();
        int m34081l = HighLevelEncoder.m34081l(c17125yR.m273d(), c17125yR.f108750f, m26391c());
        if (m34081l != m26391c()) {
            if (m34081l != 1) {
                if (m34081l != 2) {
                    if (m34081l != 3) {
                        if (m34081l != 4) {
                            if (m34081l == 5) {
                                c17125yR.m259r((char) 231);
                                c17125yR.m262o(5);
                                return;
                            }
                            throw new IllegalStateException("Illegal mode: " + m34081l);
                        }
                        c17125yR.m259r((char) 240);
                        c17125yR.m262o(4);
                        return;
                    }
                    c17125yR.m259r((char) 238);
                    c17125yR.m262o(3);
                    return;
                }
                c17125yR.m259r((char) 239);
                c17125yR.m262o(2);
                return;
            }
            c17125yR.m259r((char) 230);
            c17125yR.m262o(1);
        } else if (HighLevelEncoder.m34088e(m274c)) {
            c17125yR.m259r((char) 235);
            c17125yR.m259r((char) (m274c - 127));
            c17125yR.f108750f++;
        } else {
            c17125yR.m259r((char) (m274c + 1));
            c17125yR.f108750f++;
        }
    }

    /* renamed from: c */
    public int m26391c() {
        return 0;
    }
}
