package p000;

import androidx.recyclerview.widget.ItemTouchHelper;
import ch.qos.logback.core.CoreConstants;
import com.feitian.readerdk.Tool.C6150DK;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState;
import kotlin.text.Typography;
import org.apache.http.message.TokenParser;
import org.bouncycastle.asn1.eac.EACTags;

/* renamed from: J50 */
/* loaded from: classes5.dex */
public final class J50 {

    /* renamed from: a */
    public final BitArray f2698a;

    /* renamed from: b */
    public final CurrentParsingState f2699b = new CurrentParsingState();

    /* renamed from: c */
    public final StringBuilder f2700c = new StringBuilder();

    public J50(BitArray bitArray) {
        this.f2698a = bitArray;
    }

    /* renamed from: g */
    public static int m67794g(BitArray bitArray, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (bitArray.get(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: a */
    public String m67800a(StringBuilder sb, int i) {
        String str;
        String str2 = null;
        while (true) {
            C11519jE m67798c = m67798c(i, str2);
            String m30635a = AbstractC10471iW.m30635a(m67798c.m29279b());
            if (m30635a != null) {
                sb.append(m30635a);
            }
            if (m67798c.m29277d()) {
                str = String.valueOf(m67798c.m29278c());
            } else {
                str = null;
            }
            if (i != m67798c.m26537a()) {
                i = m67798c.m26537a();
                str2 = str;
            } else {
                return sb.toString();
            }
        }
    }

    /* renamed from: b */
    public final C10452iE m67799b(int i) {
        char c;
        int m67795f = m67795f(i, 5);
        if (m67795f == 15) {
            return new C10452iE(i + 5, '$');
        }
        if (m67795f >= 5 && m67795f < 15) {
            return new C10452iE(i + 5, (char) (m67795f + 43));
        }
        int m67795f2 = m67795f(i, 6);
        if (m67795f2 >= 32 && m67795f2 < 58) {
            return new C10452iE(i + 6, (char) (m67795f2 + 33));
        }
        switch (m67795f2) {
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                c = '*';
                break;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + m67795f2);
        }
        return new C10452iE(i + 6, c);
    }

    /* renamed from: c */
    public C11519jE m67798c(int i, String str) {
        this.f2700c.setLength(0);
        if (str != null) {
            this.f2700c.append(str);
        }
        this.f2699b.m33993h(i);
        C11519jE m67786o = m67786o();
        if (m67786o != null && m67786o.m29277d()) {
            return new C11519jE(this.f2699b.m34000a(), this.f2700c.toString(), m67786o.m29278c());
        }
        return new C11519jE(this.f2699b.m34000a(), this.f2700c.toString());
    }

    /* renamed from: d */
    public final C10452iE m67797d(int i) {
        int m67795f = m67795f(i, 5);
        if (m67795f == 15) {
            return new C10452iE(i + 5, '$');
        }
        char c = '+';
        if (m67795f >= 5 && m67795f < 15) {
            return new C10452iE(i + 5, (char) (m67795f + 43));
        }
        int m67795f2 = m67795f(i, 7);
        if (m67795f2 >= 64 && m67795f2 < 90) {
            return new C10452iE(i + 7, (char) (m67795f2 + 1));
        }
        if (m67795f2 >= 90 && m67795f2 < 116) {
            return new C10452iE(i + 7, (char) (m67795f2 + 7));
        }
        switch (m67795f(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = CoreConstants.PERCENT_CHAR;
                break;
            case 235:
                c = Typography.amp;
                break;
            case 236:
                c = CoreConstants.SINGLE_QUOTE_CHAR;
                break;
            case 237:
                c = CoreConstants.LEFT_PARENTHESIS_CHAR;
                break;
            case 238:
                c = CoreConstants.RIGHT_PARENTHESIS_CHAR;
                break;
            case 239:
                c = '*';
                break;
            case C6150DK.ERROR_RECEIVE_LRC /* 240 */:
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = Typography.less;
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = Typography.greater;
                break;
            case ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = TokenParser.f74560SP;
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        return new C10452iE(i + 8, c);
    }

    /* renamed from: e */
    public final C11632kE m67796e(int i) {
        int i2 = i + 7;
        if (i2 > this.f2698a.getSize()) {
            int m67795f = m67795f(i, 4);
            if (m67795f == 0) {
                return new C11632kE(this.f2698a.getSize(), 10, 10);
            }
            return new C11632kE(this.f2698a.getSize(), m67795f - 1, 10);
        }
        int m67795f2 = m67795f(i, 7) - 8;
        return new C11632kE(i2, m67795f2 / 11, m67795f2 % 11);
    }

    /* renamed from: f */
    public int m67795f(int i, int i2) {
        return m67794g(this.f2698a, i, i2);
    }

    /* renamed from: h */
    public final boolean m67793h(int i) {
        int i2 = i + 3;
        if (i2 > this.f2698a.getSize()) {
            return false;
        }
        while (i < i2) {
            if (this.f2698a.get(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean m67792i(int i) {
        int i2;
        if (i + 1 > this.f2698a.getSize()) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.f2698a.getSize(); i3++) {
            if (i3 == 2) {
                if (!this.f2698a.get(i + 2)) {
                    return false;
                }
            } else if (this.f2698a.get(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m67791j(int i) {
        int i2;
        if (i + 1 > this.f2698a.getSize()) {
            return false;
        }
        for (int i3 = 0; i3 < 4 && (i2 = i3 + i) < this.f2698a.getSize(); i3++) {
            if (this.f2698a.get(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m67790k(int i) {
        int m67795f;
        if (i + 5 > this.f2698a.getSize()) {
            return false;
        }
        int m67795f2 = m67795f(i, 5);
        if (m67795f2 >= 5 && m67795f2 < 16) {
            return true;
        }
        if (i + 6 > this.f2698a.getSize() || (m67795f = m67795f(i, 6)) < 16 || m67795f >= 63) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean m67789l(int i) {
        int m67795f;
        if (i + 5 > this.f2698a.getSize()) {
            return false;
        }
        int m67795f2 = m67795f(i, 5);
        if (m67795f2 >= 5 && m67795f2 < 16) {
            return true;
        }
        if (i + 7 > this.f2698a.getSize()) {
            return false;
        }
        int m67795f3 = m67795f(i, 7);
        if (m67795f3 >= 64 && m67795f3 < 116) {
            return true;
        }
        if (i + 8 > this.f2698a.getSize() || (m67795f = m67795f(i, 8)) < 232 || m67795f >= 253) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean m67788m(int i) {
        if (i + 7 > this.f2698a.getSize()) {
            if (i + 4 <= this.f2698a.getSize()) {
                return true;
            }
            return false;
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 < i3) {
                if (this.f2698a.get(i2)) {
                    return true;
                }
                i2++;
            } else {
                return this.f2698a.get(i3);
            }
        }
    }

    /* renamed from: n */
    public final C1767Yb m67787n() {
        while (m67790k(this.f2699b.m34000a())) {
            C10452iE m67799b = m67799b(this.f2699b.m34000a());
            this.f2699b.m33993h(m67799b.m26537a());
            if (m67799b.m30660c()) {
                return new C1767Yb(new C11519jE(this.f2699b.m34000a(), this.f2700c.toString()), true);
            }
            this.f2700c.append(m67799b.m30661b());
        }
        if (m67793h(this.f2699b.m34000a())) {
            this.f2699b.m33999b(3);
            this.f2699b.m33994g();
        } else if (m67792i(this.f2699b.m34000a())) {
            if (this.f2699b.m34000a() + 5 < this.f2698a.getSize()) {
                this.f2699b.m33999b(5);
            } else {
                this.f2699b.m33993h(this.f2698a.getSize());
            }
            this.f2699b.m33995f();
        }
        return new C1767Yb(false);
    }

    /* renamed from: o */
    public final C11519jE m67786o() {
        C1767Yb m67784q;
        boolean m65334b;
        do {
            int m34000a = this.f2699b.m34000a();
            if (this.f2699b.m33998c()) {
                m67784q = m67787n();
                m65334b = m67784q.m65334b();
            } else if (this.f2699b.m33997d()) {
                m67784q = m67785p();
                m65334b = m67784q.m65334b();
            } else {
                m67784q = m67784q();
                m65334b = m67784q.m65334b();
            }
            if (m34000a != this.f2699b.m34000a() || m65334b) {
                break;
                break;
            }
            break;
        } while (!m65334b);
        return m67784q.m65335a();
    }

    /* renamed from: p */
    public final C1767Yb m67785p() {
        while (m67789l(this.f2699b.m34000a())) {
            C10452iE m67797d = m67797d(this.f2699b.m34000a());
            this.f2699b.m33993h(m67797d.m26537a());
            if (m67797d.m30660c()) {
                return new C1767Yb(new C11519jE(this.f2699b.m34000a(), this.f2700c.toString()), true);
            }
            this.f2700c.append(m67797d.m30661b());
        }
        if (m67793h(this.f2699b.m34000a())) {
            this.f2699b.m33999b(3);
            this.f2699b.m33994g();
        } else if (m67792i(this.f2699b.m34000a())) {
            if (this.f2699b.m34000a() + 5 < this.f2698a.getSize()) {
                this.f2699b.m33999b(5);
            } else {
                this.f2699b.m33993h(this.f2698a.getSize());
            }
            this.f2699b.m33996e();
        }
        return new C1767Yb(false);
    }

    /* renamed from: q */
    public final C1767Yb m67784q() {
        C11519jE c11519jE;
        while (m67788m(this.f2699b.m34000a())) {
            C11632kE m67796e = m67796e(this.f2699b.m34000a());
            this.f2699b.m33993h(m67796e.m26537a());
            if (m67796e.m28973d()) {
                if (m67796e.m28972e()) {
                    c11519jE = new C11519jE(this.f2699b.m34000a(), this.f2700c.toString());
                } else {
                    c11519jE = new C11519jE(this.f2699b.m34000a(), this.f2700c.toString(), m67796e.m28974c());
                }
                return new C1767Yb(c11519jE, true);
            }
            this.f2700c.append(m67796e.m28975b());
            if (m67796e.m28972e()) {
                return new C1767Yb(new C11519jE(this.f2699b.m34000a(), this.f2700c.toString()), true);
            }
            this.f2700c.append(m67796e.m28974c());
        }
        if (m67791j(this.f2699b.m34000a())) {
            this.f2699b.m33996e();
            this.f2699b.m33999b(4);
        }
        return new C1767Yb(false);
    }
}
