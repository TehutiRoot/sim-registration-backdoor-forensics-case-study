package p000;

import androidx.recyclerview.widget.ItemTouchHelper;
import ch.qos.logback.core.CoreConstants;
import com.feitian.readerdk.Tool.C6139DK;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState;
import kotlin.text.Typography;
import org.apache.http.message.TokenParser;
import org.bouncycastle.asn1.eac.EACTags;

/* renamed from: N50 */
/* loaded from: classes5.dex */
public final class N50 {

    /* renamed from: a */
    public final BitArray f4063a;

    /* renamed from: b */
    public final CurrentParsingState f4064b = new CurrentParsingState();

    /* renamed from: c */
    public final StringBuilder f4065c = new StringBuilder();

    public N50(BitArray bitArray) {
        this.f4063a = bitArray;
    }

    /* renamed from: g */
    public static int m67285g(BitArray bitArray, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (bitArray.get(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: a */
    public String m67291a(StringBuilder sb, int i) {
        String str;
        String str2 = null;
        while (true) {
            C11617kE m67289c = m67289c(i, str2);
            String m26658a = AbstractC12276mW.m26658a(m67289c.m29265b());
            if (m26658a != null) {
                sb.append(m26658a);
            }
            if (m67289c.m29263d()) {
                str = String.valueOf(m67289c.m29264c());
            } else {
                str = null;
            }
            if (i != m67289c.m26725a()) {
                i = m67289c.m26725a();
                str2 = str;
            } else {
                return sb.toString();
            }
        }
    }

    /* renamed from: b */
    public final C11507jE m67290b(int i) {
        char c;
        int m67286f = m67286f(i, 5);
        if (m67286f == 15) {
            return new C11507jE(i + 5, '$');
        }
        if (m67286f >= 5 && m67286f < 15) {
            return new C11507jE(i + 5, (char) (m67286f + 43));
        }
        int m67286f2 = m67286f(i, 6);
        if (m67286f2 >= 32 && m67286f2 < 58) {
            return new C11507jE(i + 6, (char) (m67286f2 + 33));
        }
        switch (m67286f2) {
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
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + m67286f2);
        }
        return new C11507jE(i + 6, c);
    }

    /* renamed from: c */
    public C11617kE m67289c(int i, String str) {
        this.f4065c.setLength(0);
        if (str != null) {
            this.f4065c.append(str);
        }
        this.f4064b.m33985h(i);
        C11617kE m67277o = m67277o();
        if (m67277o != null && m67277o.m29263d()) {
            return new C11617kE(this.f4064b.m33992a(), this.f4065c.toString(), m67277o.m29264c());
        }
        return new C11617kE(this.f4064b.m33992a(), this.f4065c.toString());
    }

    /* renamed from: d */
    public final C11507jE m67288d(int i) {
        int m67286f = m67286f(i, 5);
        if (m67286f == 15) {
            return new C11507jE(i + 5, '$');
        }
        char c = '+';
        if (m67286f >= 5 && m67286f < 15) {
            return new C11507jE(i + 5, (char) (m67286f + 43));
        }
        int m67286f2 = m67286f(i, 7);
        if (m67286f2 >= 64 && m67286f2 < 90) {
            return new C11507jE(i + 7, (char) (m67286f2 + 1));
        }
        if (m67286f2 >= 90 && m67286f2 < 116) {
            return new C11507jE(i + 7, (char) (m67286f2 + 7));
        }
        switch (m67286f(i, 8)) {
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
            case C6139DK.ERROR_RECEIVE_LRC /* 240 */:
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
                c = TokenParser.f74644SP;
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        return new C11507jE(i + 8, c);
    }

    /* renamed from: e */
    public final C12181lE m67287e(int i) {
        int i2 = i + 7;
        if (i2 > this.f4063a.getSize()) {
            int m67286f = m67286f(i, 4);
            if (m67286f == 0) {
                return new C12181lE(this.f4063a.getSize(), 10, 10);
            }
            return new C12181lE(this.f4063a.getSize(), m67286f - 1, 10);
        }
        int m67286f2 = m67286f(i, 7) - 8;
        return new C12181lE(i2, m67286f2 / 11, m67286f2 % 11);
    }

    /* renamed from: f */
    public int m67286f(int i, int i2) {
        return m67285g(this.f4063a, i, i2);
    }

    /* renamed from: h */
    public final boolean m67284h(int i) {
        int i2 = i + 3;
        if (i2 > this.f4063a.getSize()) {
            return false;
        }
        while (i < i2) {
            if (this.f4063a.get(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean m67283i(int i) {
        int i2;
        if (i + 1 > this.f4063a.getSize()) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.f4063a.getSize(); i3++) {
            if (i3 == 2) {
                if (!this.f4063a.get(i + 2)) {
                    return false;
                }
            } else if (this.f4063a.get(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m67282j(int i) {
        int i2;
        if (i + 1 > this.f4063a.getSize()) {
            return false;
        }
        for (int i3 = 0; i3 < 4 && (i2 = i3 + i) < this.f4063a.getSize(); i3++) {
            if (this.f4063a.get(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m67281k(int i) {
        int m67286f;
        if (i + 5 > this.f4063a.getSize()) {
            return false;
        }
        int m67286f2 = m67286f(i, 5);
        if (m67286f2 >= 5 && m67286f2 < 16) {
            return true;
        }
        if (i + 6 > this.f4063a.getSize() || (m67286f = m67286f(i, 6)) < 16 || m67286f >= 63) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean m67280l(int i) {
        int m67286f;
        if (i + 5 > this.f4063a.getSize()) {
            return false;
        }
        int m67286f2 = m67286f(i, 5);
        if (m67286f2 >= 5 && m67286f2 < 16) {
            return true;
        }
        if (i + 7 > this.f4063a.getSize()) {
            return false;
        }
        int m67286f3 = m67286f(i, 7);
        if (m67286f3 >= 64 && m67286f3 < 116) {
            return true;
        }
        if (i + 8 > this.f4063a.getSize() || (m67286f = m67286f(i, 8)) < 232 || m67286f >= 253) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean m67279m(int i) {
        if (i + 7 > this.f4063a.getSize()) {
            if (i + 4 <= this.f4063a.getSize()) {
                return true;
            }
            return false;
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 < i3) {
                if (this.f4063a.get(i2)) {
                    return true;
                }
                i2++;
            } else {
                return this.f4063a.get(i3);
            }
        }
    }

    /* renamed from: n */
    public final C1746Yb m67278n() {
        while (m67281k(this.f4064b.m33992a())) {
            C11507jE m67290b = m67290b(this.f4064b.m33992a());
            this.f4064b.m33985h(m67290b.m26725a());
            if (m67290b.m29602c()) {
                return new C1746Yb(new C11617kE(this.f4064b.m33992a(), this.f4065c.toString()), true);
            }
            this.f4065c.append(m67290b.m29603b());
        }
        if (m67284h(this.f4064b.m33992a())) {
            this.f4064b.m33991b(3);
            this.f4064b.m33986g();
        } else if (m67283i(this.f4064b.m33992a())) {
            if (this.f4064b.m33992a() + 5 < this.f4063a.getSize()) {
                this.f4064b.m33991b(5);
            } else {
                this.f4064b.m33985h(this.f4063a.getSize());
            }
            this.f4064b.m33987f();
        }
        return new C1746Yb(false);
    }

    /* renamed from: o */
    public final C11617kE m67277o() {
        C1746Yb m67275q;
        boolean m65441b;
        do {
            int m33992a = this.f4064b.m33992a();
            if (this.f4064b.m33990c()) {
                m67275q = m67278n();
                m65441b = m67275q.m65441b();
            } else if (this.f4064b.m33989d()) {
                m67275q = m67276p();
                m65441b = m67275q.m65441b();
            } else {
                m67275q = m67275q();
                m65441b = m67275q.m65441b();
            }
            if (m33992a != this.f4064b.m33992a() || m65441b) {
                break;
                break;
            }
            break;
        } while (!m65441b);
        return m67275q.m65442a();
    }

    /* renamed from: p */
    public final C1746Yb m67276p() {
        while (m67280l(this.f4064b.m33992a())) {
            C11507jE m67288d = m67288d(this.f4064b.m33992a());
            this.f4064b.m33985h(m67288d.m26725a());
            if (m67288d.m29602c()) {
                return new C1746Yb(new C11617kE(this.f4064b.m33992a(), this.f4065c.toString()), true);
            }
            this.f4065c.append(m67288d.m29603b());
        }
        if (m67284h(this.f4064b.m33992a())) {
            this.f4064b.m33991b(3);
            this.f4064b.m33986g();
        } else if (m67283i(this.f4064b.m33992a())) {
            if (this.f4064b.m33992a() + 5 < this.f4063a.getSize()) {
                this.f4064b.m33991b(5);
            } else {
                this.f4064b.m33985h(this.f4063a.getSize());
            }
            this.f4064b.m33988e();
        }
        return new C1746Yb(false);
    }

    /* renamed from: q */
    public final C1746Yb m67275q() {
        C11617kE c11617kE;
        while (m67279m(this.f4064b.m33992a())) {
            C12181lE m67287e = m67287e(this.f4064b.m33992a());
            this.f4064b.m33985h(m67287e.m26725a());
            if (m67287e.m26842d()) {
                if (m67287e.m26841e()) {
                    c11617kE = new C11617kE(this.f4064b.m33992a(), this.f4065c.toString());
                } else {
                    c11617kE = new C11617kE(this.f4064b.m33992a(), this.f4065c.toString(), m67287e.m26843c());
                }
                return new C1746Yb(c11617kE, true);
            }
            this.f4065c.append(m67287e.m26844b());
            if (m67287e.m26841e()) {
                return new C1746Yb(new C11617kE(this.f4064b.m33992a(), this.f4065c.toString()), true);
            }
            this.f4065c.append(m67287e.m26843c());
        }
        if (m67282j(this.f4064b.m33992a())) {
            this.f4064b.m33988e();
            this.f4064b.m33991b(4);
        }
        return new C1746Yb(false);
    }
}