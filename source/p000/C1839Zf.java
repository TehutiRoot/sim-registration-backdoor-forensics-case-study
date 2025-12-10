package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;

/* renamed from: Zf */
/* loaded from: classes5.dex */
public class C1839Zf implements InterfaceC16967wR {
    /* renamed from: d */
    public static String m65165d(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * CoreConstants.LEFT_PARENTHESIS_CHAR) + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    /* renamed from: g */
    public static void m65162g(C17125yR c17125yR, StringBuilder sb) {
        c17125yR.m258s(m65165d(sb, 0));
        sb.delete(0, 3);
    }

    @Override // p000.InterfaceC16967wR
    /* renamed from: a */
    public void mo842a(C17125yR c17125yR) {
        int m34081l;
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c17125yR.m268i()) {
                break;
            }
            char m274c = c17125yR.m274c();
            c17125yR.f108750f++;
            int mo65166c = mo65166c(m274c, sb);
            int m276a = c17125yR.m276a() + ((sb.length() / 3) << 1);
            c17125yR.m260q(m276a);
            int dataCapacity = c17125yR.m270g().getDataCapacity() - m276a;
            if (!c17125yR.m268i()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (dataCapacity < 2 || dataCapacity > 2)) {
                    mo65166c = m65167b(c17125yR, sb, sb2, mo65166c);
                }
                while (sb.length() % 3 == 1 && ((mo65166c <= 3 && dataCapacity != 1) || mo65166c > 3)) {
                    mo65166c = m65167b(c17125yR, sb, sb2, mo65166c);
                }
            } else if (sb.length() % 3 == 0 && (m34081l = HighLevelEncoder.m34081l(c17125yR.m273d(), c17125yR.f108750f, mo65164e())) != mo65164e()) {
                c17125yR.m262o(m34081l);
                break;
            }
        }
        mo65163f(c17125yR, sb);
    }

    /* renamed from: b */
    public final int m65167b(C17125yR c17125yR, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        c17125yR.f108750f--;
        int mo65166c = mo65166c(c17125yR.m274c(), sb2);
        c17125yR.m266k();
        return mo65166c;
    }

    /* renamed from: c */
    public int mo65166c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
            return 1;
        } else if (c >= 0 && c <= 31) {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        } else if (c >= '`' && c <= 127) {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        } else if (c >= 128) {
            sb.append("\u0001\u001e");
            return mo65166c((char) (c - 128), sb) + 2;
        } else {
            throw new IllegalArgumentException("Illegal character: " + c);
        }
    }

    /* renamed from: e */
    public int mo65164e() {
        return 1;
    }

    /* renamed from: f */
    public void mo65163f(C17125yR c17125yR, StringBuilder sb) {
        int length = sb.length() % 3;
        int m276a = c17125yR.m276a() + ((sb.length() / 3) << 1);
        c17125yR.m260q(m276a);
        int dataCapacity = c17125yR.m270g().getDataCapacity() - m276a;
        if (length == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                m65162g(c17125yR, sb);
            }
            if (c17125yR.m268i()) {
                c17125yR.m259r((char) 254);
            }
        } else if (dataCapacity == 1 && length == 1) {
            while (sb.length() >= 3) {
                m65162g(c17125yR, sb);
            }
            if (c17125yR.m268i()) {
                c17125yR.m259r((char) 254);
            }
            c17125yR.f108750f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                m65162g(c17125yR, sb);
            }
            if (dataCapacity > 0 || c17125yR.m268i()) {
                c17125yR.m259r((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        c17125yR.m262o(0);
    }
}
