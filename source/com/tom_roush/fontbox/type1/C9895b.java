package com.tom_roush.fontbox.type1;

import com.tom_roush.fontbox.afm.AFMParser;
import com.tom_roush.fontbox.encoding.BuiltInEncoding;
import com.tom_roush.fontbox.encoding.StandardEncoding;
import com.tom_roush.fontbox.type1.Token;
import com.tom_roush.pdfbox.pdfparser.BaseParser;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;

/* renamed from: com.tom_roush.fontbox.type1.b */
/* loaded from: classes5.dex */
public final class C9895b {

    /* renamed from: a */
    public C9894a f59684a;

    /* renamed from: b */
    public Type1Font f59685b;

    /* renamed from: a */
    public final List m32832a(List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size() - 1;
        for (int i = 1; i < size; i++) {
            Token token = (Token) list.get(i);
            if (token.m32844d() == Token.f59633g) {
                arrayList.add(Float.valueOf(token.m32846b()));
            } else if (token.m32844d() == Token.f59634h) {
                arrayList.add(Integer.valueOf(token.m32842f()));
            } else {
                throw new IOException("Expected INTEGER or REAL but got " + token + " at array position " + i);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final byte[] m32831b(byte[] bArr, int i, int i2) {
        if (i2 == -1) {
            return bArr;
        }
        if (bArr.length != 0 && i2 <= bArr.length) {
            byte[] bArr2 = new byte[bArr.length - i2];
            for (int i3 = 0; i3 < bArr.length; i3++) {
                int i4 = bArr[i3] & 255;
                int i5 = (i >> 8) ^ i4;
                if (i3 >= i2) {
                    bArr2[i3 - i2] = (byte) i5;
                }
                i = 65535 & (((i4 + i) * 52845) + 22719);
            }
            return bArr2;
        }
        return new byte[0];
    }

    /* renamed from: c */
    public final byte[] m32830c(byte[] bArr) {
        int i = 0;
        for (byte b : bArr) {
            if (Character.digit((char) b, 16) != -1) {
                i++;
            }
        }
        byte[] bArr2 = new byte[i / 2];
        int i2 = 0;
        int i3 = -1;
        for (byte b2 : bArr) {
            int digit = Character.digit((char) b2, 16);
            if (digit != -1) {
                if (i3 == -1) {
                    i3 = digit;
                } else {
                    bArr2[i2] = (byte) ((i3 * 16) + digit);
                    i2++;
                    i3 = -1;
                }
            }
        }
        return bArr2;
    }

    /* renamed from: d */
    public final boolean m32829d(byte[] bArr) {
        if (bArr.length < 4) {
            return true;
        }
        for (int i = 0; i < 4; i++) {
            byte b = bArr[i];
            if (b != 10 && b != 13 && b != 32 && b != 9 && Character.digit((char) b, 16) == -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public Type1Font m32828e(byte[] bArr, byte[] bArr2) {
        this.f59685b = new Type1Font(bArr, bArr2);
        m32827f(bArr);
        if (bArr2.length > 0) {
            m32826g(bArr2);
        }
        return this.f59685b;
    }

    /* renamed from: f */
    public final void m32827f(byte[] bArr) {
        Token m32839c;
        if (bArr.length != 0) {
            if (bArr.length >= 2) {
                if (bArr[0] == 37 || bArr[1] == 33) {
                    C9894a c9894a = new C9894a(bArr);
                    this.f59684a = c9894a;
                    if (c9894a.m32839c().m32843e().equals("FontDirectory")) {
                        Token.Kind kind = Token.f59631e;
                        m32824i(kind, "FontDirectory");
                        m32825h(Token.f59632f);
                        m32824i(kind, "known");
                        Token.Kind kind2 = Token.f59637k;
                        m32825h(kind2);
                        m32813t();
                        m32825h(kind2);
                        m32813t();
                        m32824i(kind, "ifelse");
                    }
                    int m32842f = m32825h(Token.f59634h).m32842f();
                    Token.Kind kind3 = Token.f59631e;
                    m32824i(kind3, "dict");
                    m32818o(kind3, "dup");
                    m32824i(kind3, "begin");
                    for (int i = 0; i < m32842f && (m32839c = this.f59684a.m32839c()) != null && (m32839c.m32844d() != Token.f59631e || (!m32839c.m32843e().equals("currentdict") && !m32839c.m32843e().equals("end"))); i++) {
                        String m32843e = m32825h(Token.f59632f).m32843e();
                        if (!m32843e.equals("FontInfo") && !m32843e.equals("Fontinfo")) {
                            if (m32843e.equals("Metrics")) {
                                m32811v();
                            } else if (m32843e.equals("Encoding")) {
                                m32820m();
                            } else {
                                m32810w(m32843e);
                            }
                        } else {
                            m32819n(m32811v());
                        }
                    }
                    Token.Kind kind4 = Token.f59631e;
                    m32818o(kind4, "currentdict");
                    m32824i(kind4, "end");
                    m32824i(kind4, "currentfile");
                    m32824i(kind4, "eexec");
                    return;
                }
            }
            throw new IOException("Invalid start of ASCII segment of type 1 font");
        }
        throw new IOException("ASCII segment of type 1 font is empty");
    }

    /* renamed from: g */
    public final void m32826g(byte[] bArr) {
        byte[] m32831b;
        int i = 4;
        if (m32829d(bArr)) {
            m32831b = m32831b(bArr, 55665, 4);
        } else {
            m32831b = m32831b(m32830c(bArr), 55665, 4);
        }
        C9894a c9894a = new C9894a(m32831b);
        this.f59684a = c9894a;
        Token m32839c = c9894a.m32839c();
        while (m32839c != null && !m32839c.m32843e().equals(StandardStructureTypes.PRIVATE)) {
            this.f59684a.m32840b();
            m32839c = this.f59684a.m32839c();
        }
        if (m32839c != null) {
            m32824i(Token.f59632f, StandardStructureTypes.PRIVATE);
            int m32842f = m32825h(Token.f59634h).m32842f();
            Token.Kind kind = Token.f59631e;
            m32824i(kind, "dict");
            m32818o(kind, "dup");
            m32824i(kind, "begin");
            for (int i2 = 0; i2 < m32842f && this.f59684a.m32839c() != null; i2++) {
                Token.Kind m32844d = this.f59684a.m32839c().m32844d();
                Token.Kind kind2 = Token.f59632f;
                if (m32844d != kind2) {
                    break;
                }
                String m32843e = m32825h(kind2).m32843e();
                if ("Subrs".equals(m32843e)) {
                    m32809x(i);
                } else if ("OtherSubrs".equals(m32843e)) {
                    m32817p();
                } else if ("lenIV".equals(m32843e)) {
                    i = ((Token) m32821l().get(0)).m32842f();
                } else if ("ND".equals(m32843e)) {
                    m32825h(Token.f59637k);
                    Token.Kind kind3 = Token.f59631e;
                    m32818o(kind3, "noaccess");
                    m32824i(kind3, BaseParser.DEF);
                    m32825h(Token.f59638l);
                    m32818o(kind3, "executeonly");
                    m32818o(kind3, "readonly");
                    m32824i(kind3, BaseParser.DEF);
                } else if ("NP".equals(m32843e)) {
                    m32825h(Token.f59637k);
                    Token.Kind kind4 = Token.f59631e;
                    m32818o(kind4, "noaccess");
                    m32825h(kind4);
                    m32825h(Token.f59638l);
                    m32818o(kind4, "executeonly");
                    m32818o(kind4, "readonly");
                    m32824i(kind4, BaseParser.DEF);
                } else if ("RD".equals(m32843e)) {
                    m32825h(Token.f59637k);
                    m32813t();
                    Token.Kind kind5 = Token.f59631e;
                    m32818o(kind5, "bind");
                    m32818o(kind5, "executeonly");
                    m32818o(kind5, "readonly");
                    m32824i(kind5, BaseParser.DEF);
                } else {
                    m32815r(m32843e, m32821l());
                }
            }
            while (true) {
                Token.Kind m32844d2 = this.f59684a.m32839c().m32844d();
                Token.Kind kind6 = Token.f59632f;
                if (m32844d2 == kind6 && this.f59684a.m32839c().m32843e().equals("CharStrings")) {
                    m32824i(kind6, "CharStrings");
                    m32823j(i);
                    return;
                }
                this.f59684a.m32840b();
            }
        } else {
            throw new IOException("/Private token not found");
        }
    }

    /* renamed from: h */
    public final Token m32825h(Token.Kind kind) {
        Token m32840b = this.f59684a.m32840b();
        if (m32840b != null && m32840b.m32844d() == kind) {
            return m32840b;
        }
        throw new IOException("Found " + m32840b + " but expected " + kind);
    }

    /* renamed from: i */
    public final void m32824i(Token.Kind kind, String str) {
        Token m32825h = m32825h(kind);
        if (m32825h.m32843e().equals(str)) {
            return;
        }
        throw new IOException("Found " + m32825h + " but expected " + str);
    }

    /* renamed from: j */
    public final void m32823j(int i) {
        int m32842f = m32825h(Token.f59634h).m32842f();
        Token.Kind kind = Token.f59631e;
        m32824i(kind, "dict");
        m32824i(kind, "dup");
        m32824i(kind, "begin");
        for (int i2 = 0; i2 < m32842f && this.f59684a.m32839c() != null && (this.f59684a.m32839c().m32844d() != Token.f59631e || !this.f59684a.m32839c().m32843e().equals("end")); i2++) {
            String m32843e = m32825h(Token.f59632f).m32843e();
            m32825h(Token.f59634h);
            this.f59685b.f59651G.put(m32843e, m32831b(m32825h(Token.f59639m).m32845c(), 4330, i));
            m32822k();
        }
        m32824i(Token.f59631e, "end");
    }

    /* renamed from: k */
    public final void m32822k() {
        Token.Kind kind = Token.f59631e;
        m32818o(kind, "readonly");
        m32818o(kind, "noaccess");
        Token m32825h = m32825h(kind);
        if (!m32825h.m32843e().equals("ND") && !m32825h.m32843e().equals("|-")) {
            if (m32825h.m32843e().equals("noaccess")) {
                m32825h = m32825h(kind);
            }
            if (m32825h.m32843e().equals(BaseParser.DEF)) {
                return;
            }
            throw new IOException("Found " + m32825h + " but expected ND");
        }
    }

    /* renamed from: l */
    public final List m32821l() {
        List m32808y = m32808y();
        m32822k();
        return m32808y;
    }

    /* renamed from: m */
    public final void m32820m() {
        Token.Kind kind;
        Token.Kind m32844d = this.f59684a.m32839c().m32844d();
        Token.Kind kind2 = Token.f59631e;
        if (m32844d == kind2) {
            String m32843e = this.f59684a.m32840b().m32843e();
            if (m32843e.equals("StandardEncoding")) {
                this.f59685b.f59656b = StandardEncoding.INSTANCE;
                m32818o(kind2, "readonly");
                m32824i(kind2, BaseParser.DEF);
                return;
            }
            throw new IOException("Unknown encoding: " + m32843e);
        }
        m32825h(Token.f59634h).m32842f();
        m32818o(kind2, "array");
        while (true) {
            if (this.f59684a.m32839c().m32844d() != Token.f59631e || (!this.f59684a.m32839c().m32843e().equals("dup") && !this.f59684a.m32839c().m32843e().equals("readonly") && !this.f59684a.m32839c().m32843e().equals(BaseParser.DEF))) {
                this.f59684a.m32840b();
            }
        }
        HashMap hashMap = new HashMap();
        while (true) {
            Token.Kind m32844d2 = this.f59684a.m32839c().m32844d();
            kind = Token.f59631e;
            if (m32844d2 != kind || !this.f59684a.m32839c().m32843e().equals("dup")) {
                break;
            }
            m32824i(kind, "dup");
            int m32842f = m32825h(Token.f59634h).m32842f();
            String m32843e2 = m32825h(Token.f59632f).m32843e();
            m32824i(kind, "put");
            hashMap.put(Integer.valueOf(m32842f), m32843e2);
        }
        this.f59685b.f59656b = new BuiltInEncoding(hashMap);
        m32818o(kind, "readonly");
        m32824i(kind, BaseParser.DEF);
    }

    /* renamed from: n */
    public final void m32819n(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (str.equals(ClientCookie.VERSION_ATTR)) {
                this.f59685b.f59664j = ((Token) list.get(0)).m32843e();
            } else if (str.equals(AFMParser.NOTICE)) {
                this.f59685b.f59665k = ((Token) list.get(0)).m32843e();
            } else if (str.equals(AFMParser.FULL_NAME)) {
                this.f59685b.f59666l = ((Token) list.get(0)).m32843e();
            } else if (str.equals(AFMParser.FAMILY_NAME)) {
                this.f59685b.f59667m = ((Token) list.get(0)).m32843e();
            } else if (str.equals(AFMParser.WEIGHT)) {
                this.f59685b.f59668n = ((Token) list.get(0)).m32843e();
            } else if (str.equals(AFMParser.ITALIC_ANGLE)) {
                this.f59685b.f59669o = ((Token) list.get(0)).m32846b();
            } else if (str.equals("isFixedPitch")) {
                this.f59685b.f59670p = ((Token) list.get(0)).m32847a();
            } else if (str.equals(AFMParser.UNDERLINE_POSITION)) {
                this.f59685b.f59671q = ((Token) list.get(0)).m32846b();
            } else if (str.equals(AFMParser.UNDERLINE_THICKNESS)) {
                this.f59685b.f59672r = ((Token) list.get(0)).m32846b();
            }
        }
    }

    /* renamed from: o */
    public final Token m32818o(Token.Kind kind, String str) {
        Token m32839c = this.f59684a.m32839c();
        if (m32839c != null && m32839c.m32844d() == kind && m32839c.m32843e().equals(str)) {
            return this.f59684a.m32840b();
        }
        return null;
    }

    /* renamed from: p */
    public final void m32817p() {
        if (this.f59684a.m32839c().m32844d() == Token.f59635i) {
            m32808y();
            m32822k();
            return;
        }
        int m32842f = m32825h(Token.f59634h).m32842f();
        m32824i(Token.f59631e, "array");
        for (int i = 0; i < m32842f; i++) {
            m32824i(Token.f59631e, "dup");
            m32825h(Token.f59634h);
            m32808y();
            m32812u();
        }
        m32822k();
    }

    /* renamed from: q */
    public final void m32816q(List list) {
        if (this.f59684a.m32839c().m32843e().equals("systemdict")) {
            Token.Kind kind = Token.f59631e;
            m32824i(kind, "systemdict");
            m32824i(Token.f59632f, "internaldict");
            m32824i(kind, "known");
            Token.Kind kind2 = Token.f59637k;
            m32825h(kind2);
            m32813t();
            m32825h(kind2);
            m32813t();
            m32824i(kind, "ifelse");
            m32825h(kind2);
            m32824i(kind, "pop");
            list.clear();
            list.addAll(m32808y());
            m32825h(Token.f59638l);
            m32824i(kind, "if");
        }
    }

    /* renamed from: r */
    public final void m32815r(String str, List list) {
        if (str.equals("BlueValues")) {
            this.f59685b.f59673s = m32832a(list);
        } else if (str.equals("OtherBlues")) {
            this.f59685b.f59674t = m32832a(list);
        } else if (str.equals("FamilyBlues")) {
            this.f59685b.f59675u = m32832a(list);
        } else if (str.equals("FamilyOtherBlues")) {
            this.f59685b.f59676v = m32832a(list);
        } else if (str.equals("BlueScale")) {
            this.f59685b.f59677w = ((Token) list.get(0)).m32846b();
        } else if (str.equals("BlueShift")) {
            this.f59685b.f59678x = ((Token) list.get(0)).m32842f();
        } else if (str.equals("BlueFuzz")) {
            this.f59685b.f59679y = ((Token) list.get(0)).m32842f();
        } else if (str.equals(AFMParser.STD_HW)) {
            this.f59685b.f59680z = m32832a(list);
        } else if (str.equals(AFMParser.STD_VW)) {
            this.f59685b.f59645A = m32832a(list);
        } else if (str.equals("StemSnapH")) {
            this.f59685b.f59646B = m32832a(list);
        } else if (str.equals("StemSnapV")) {
            this.f59685b.f59647C = m32832a(list);
        } else if (str.equals("ForceBold")) {
            this.f59685b.f59648D = ((Token) list.get(0)).m32847a();
        } else if (str.equals("LanguageGroup")) {
            this.f59685b.f59649E = ((Token) list.get(0)).m32842f();
        }
    }

    /* renamed from: s */
    public final List m32814s() {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (true) {
            if (this.f59684a.m32839c().m32844d() == Token.f59637k) {
                i++;
            }
            Token m32840b = this.f59684a.m32840b();
            arrayList.add(m32840b);
            if (m32840b.m32844d() == Token.f59638l && i - 1 == 0) {
                break;
            }
        }
        Token m32818o = m32818o(Token.f59631e, "executeonly");
        if (m32818o != null) {
            arrayList.add(m32818o);
        }
        return arrayList;
    }

    /* renamed from: t */
    public final void m32813t() {
        int i = 1;
        while (true) {
            if (this.f59684a.m32839c().m32844d() == Token.f59637k) {
                i++;
            }
            if (this.f59684a.m32840b().m32844d() == Token.f59638l && i - 1 == 0) {
                m32818o(Token.f59631e, "executeonly");
                return;
            }
        }
    }

    /* renamed from: u */
    public final void m32812u() {
        Token.Kind kind = Token.f59631e;
        m32818o(kind, "readonly");
        Token m32825h = m32825h(kind);
        if (!m32825h.m32843e().equals("NP") && !m32825h.m32843e().equals("|")) {
            if (m32825h.m32843e().equals("noaccess")) {
                m32825h = m32825h(kind);
            }
            if (m32825h.m32843e().equals("put")) {
                return;
            }
            throw new IOException("Found " + m32825h + " but expected NP");
        }
    }

    /* renamed from: v */
    public final Map m32811v() {
        HashMap hashMap = new HashMap();
        int m32842f = m32825h(Token.f59634h).m32842f();
        Token.Kind kind = Token.f59631e;
        m32824i(kind, "dict");
        m32818o(kind, "dup");
        m32824i(kind, "begin");
        for (int i = 0; i < m32842f && this.f59684a.m32839c() != null; i++) {
            Token.Kind m32844d = this.f59684a.m32839c().m32844d();
            Token.Kind kind2 = Token.f59631e;
            if (m32844d == kind2 && !this.f59684a.m32839c().m32843e().equals("end")) {
                m32825h(kind2);
            }
            if (this.f59684a.m32839c() == null || (this.f59684a.m32839c().m32844d() == kind2 && this.f59684a.m32839c().m32843e().equals("end"))) {
                break;
            }
            hashMap.put(m32825h(Token.f59632f).m32843e(), m32821l());
        }
        Token.Kind kind3 = Token.f59631e;
        m32824i(kind3, "end");
        m32818o(kind3, "readonly");
        m32824i(kind3, BaseParser.DEF);
        return hashMap;
    }

    /* renamed from: w */
    public final void m32810w(String str) {
        List m32821l = m32821l();
        if (str.equals(AFMParser.FONT_NAME)) {
            this.f59685b.f59655a = ((Token) m32821l.get(0)).m32843e();
        } else if (str.equals("PaintType")) {
            this.f59685b.f59657c = ((Token) m32821l.get(0)).m32842f();
        } else if (str.equals("FontType")) {
            this.f59685b.f59658d = ((Token) m32821l.get(0)).m32842f();
        } else if (str.equals("FontMatrix")) {
            this.f59685b.f59659e = m32832a(m32821l);
        } else if (str.equals(AFMParser.FONT_BBOX)) {
            this.f59685b.f59660f = m32832a(m32821l);
        } else if (str.equals("UniqueID")) {
            this.f59685b.f59661g = ((Token) m32821l.get(0)).m32842f();
        } else if (str.equals("StrokeWidth")) {
            this.f59685b.f59662h = ((Token) m32821l.get(0)).m32846b();
        } else if (str.equals("FID")) {
            this.f59685b.f59663i = ((Token) m32821l.get(0)).m32843e();
        }
    }

    /* renamed from: x */
    public final void m32809x(int i) {
        int m32842f = m32825h(Token.f59634h).m32842f();
        for (int i2 = 0; i2 < m32842f; i2++) {
            this.f59685b.f59650F.add(null);
        }
        m32824i(Token.f59631e, "array");
        for (int i3 = 0; i3 < m32842f && this.f59684a.m32839c() != null; i3++) {
            Token.Kind m32844d = this.f59684a.m32839c().m32844d();
            Token.Kind kind = Token.f59631e;
            if (m32844d != kind || !this.f59684a.m32839c().m32843e().equals("dup")) {
                break;
            }
            m32824i(kind, "dup");
            Token.Kind kind2 = Token.f59634h;
            Token m32825h = m32825h(kind2);
            m32825h(kind2);
            this.f59685b.f59650F.set(m32825h.m32842f(), m32831b(m32825h(Token.f59639m).m32845c(), 4330, i));
            m32812u();
        }
        m32822k();
    }

    /* renamed from: y */
    public final List m32808y() {
        ArrayList arrayList = new ArrayList();
        Token m32840b = this.f59684a.m32840b();
        if (this.f59684a.m32839c() == null) {
            return arrayList;
        }
        arrayList.add(m32840b);
        if (m32840b.m32844d() == Token.f59635i) {
            int i = 1;
            while (this.f59684a.m32839c() != null) {
                if (this.f59684a.m32839c().m32844d() == Token.f59635i) {
                    i++;
                }
                Token m32840b2 = this.f59684a.m32840b();
                arrayList.add(m32840b2);
                if (m32840b2.m32844d() != Token.f59636j || i - 1 != 0) {
                }
            }
            return arrayList;
        } else if (m32840b.m32844d() == Token.f59637k) {
            arrayList.addAll(m32814s());
        } else if (m32840b.m32844d() == Token.f59640n) {
            m32825h(Token.f59641o);
            return arrayList;
        }
        m32816q(arrayList);
        return arrayList;
    }
}
