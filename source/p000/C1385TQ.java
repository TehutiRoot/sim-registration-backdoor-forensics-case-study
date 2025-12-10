package p000;

import com.google.zxing.datamatrix.encoder.HighLevelEncoder;

/* renamed from: TQ */
/* loaded from: classes5.dex */
public final class C1385TQ implements InterfaceC16967wR {
    /* renamed from: b */
    public static void m66207b(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c >= '@' && c <= '^') {
            sb.append((char) (c - '@'));
        } else {
            HighLevelEncoder.m34090c(c);
        }
    }

    /* renamed from: c */
    private static String m66206c(CharSequence charSequence, int i) {
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
    public static void m66204e(C17125yR c17125yR, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z = true;
            if (length == 1) {
                c17125yR.m261p();
                int dataCapacity = c17125yR.m270g().getDataCapacity() - c17125yR.m276a();
                if (c17125yR.m271f() == 0 && dataCapacity <= 2) {
                    return;
                }
            }
            if (length <= 4) {
                int i = length - 1;
                String m66206c = m66206c(charSequence, 0);
                if (!(!c17125yR.m268i()) || i > 2) {
                    z = false;
                }
                if (i <= 2) {
                    c17125yR.m260q(c17125yR.m276a() + i);
                    if (c17125yR.m270g().getDataCapacity() - c17125yR.m276a() >= 3) {
                        c17125yR.m260q(c17125yR.m276a() + m66206c.length());
                        z = false;
                    }
                }
                if (z) {
                    c17125yR.m266k();
                    c17125yR.f108750f -= i;
                } else {
                    c17125yR.m258s(m66206c);
                }
                return;
            }
            throw new IllegalStateException("Count must not exceed 4");
        } finally {
            c17125yR.m262o(0);
        }
    }

    @Override // p000.InterfaceC16967wR
    /* renamed from: a */
    public void mo842a(C17125yR c17125yR) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c17125yR.m268i()) {
                break;
            }
            m66207b(c17125yR.m274c(), sb);
            c17125yR.f108750f++;
            if (sb.length() >= 4) {
                c17125yR.m258s(m66206c(sb, 0));
                sb.delete(0, 4);
                if (HighLevelEncoder.m34081l(c17125yR.m273d(), c17125yR.f108750f, m66205d()) != m66205d()) {
                    c17125yR.m262o(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        m66204e(c17125yR, sb);
    }

    /* renamed from: d */
    public int m66205d() {
        return 4;
    }
}
