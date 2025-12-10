package p000;

import com.google.zxing.datamatrix.encoder.HighLevelEncoder;

/* renamed from: UQ */
/* loaded from: classes5.dex */
public final class C1443UQ implements InterfaceC0028AR {
    /* renamed from: b */
    public static void m66199b(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c >= '@' && c <= '^') {
            sb.append((char) (c - '@'));
        } else {
            HighLevelEncoder.m34082c(c);
        }
    }

    /* renamed from: c */
    private static String m66198c(CharSequence charSequence, int i) {
        char c;
        char c2;
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            char c3 = 0;
            if (length >= 2) {
                c = charSequence.charAt(i + 1);
            } else {
                c = 0;
            }
            if (length >= 3) {
                c2 = charSequence.charAt(i + 2);
            } else {
                c2 = 0;
            }
            if (length >= 4) {
                c3 = charSequence.charAt(i + 3);
            }
            int i2 = (charAt << 18) + (c << '\f') + (c2 << 6) + c3;
            char c4 = (char) ((i2 >> 8) & 255);
            char c5 = (char) (i2 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((i2 >> 16) & 255));
            if (length >= 2) {
                sb.append(c4);
            }
            if (length >= 3) {
                sb.append(c5);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* renamed from: e */
    public static void m66196e(C0179CR c0179cr, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z = true;
            if (length == 1) {
                c0179cr.m68953p();
                int dataCapacity = c0179cr.m68962g().getDataCapacity() - c0179cr.m68968a();
                if (c0179cr.m68963f() == 0 && dataCapacity <= 2) {
                    return;
                }
            }
            if (length <= 4) {
                int i = length - 1;
                String m66198c = m66198c(charSequence, 0);
                if (!(!c0179cr.m68960i()) || i > 2) {
                    z = false;
                }
                if (i <= 2) {
                    c0179cr.m68952q(c0179cr.m68968a() + i);
                    if (c0179cr.m68962g().getDataCapacity() - c0179cr.m68968a() >= 3) {
                        c0179cr.m68952q(c0179cr.m68968a() + m66198c.length());
                        z = false;
                    }
                }
                if (z) {
                    c0179cr.m68958k();
                    c0179cr.f749f -= i;
                } else {
                    c0179cr.m68950s(m66198c);
                }
                return;
            }
            throw new IllegalStateException("Count must not exceed 4");
        } finally {
            c0179cr.m68954o(0);
        }
    }

    @Override // p000.InterfaceC0028AR
    /* renamed from: a */
    public void mo26745a(C0179CR c0179cr) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c0179cr.m68960i()) {
                break;
            }
            m66199b(c0179cr.m68966c(), sb);
            c0179cr.f749f++;
            if (sb.length() >= 4) {
                c0179cr.m68950s(m66198c(sb, 0));
                sb.delete(0, 4);
                if (HighLevelEncoder.m34073l(c0179cr.m68965d(), c0179cr.f749f, m66197d()) != m66197d()) {
                    c0179cr.m68954o(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        m66196e(c0179cr, sb);
    }

    /* renamed from: d */
    public int m66197d() {
        return 4;
    }
}