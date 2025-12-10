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
public final class C9884b {

    /* renamed from: a */
    public C9883a f59696a;

    /* renamed from: b */
    public Type1Font f59697b;

    /* renamed from: a */
    public final List m32824a(List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size() - 1;
        for (int i = 1; i < size; i++) {
            Token token = (Token) list.get(i);
            if (token.m32836d() == Token.f59645g) {
                arrayList.add(Float.valueOf(token.m32838b()));
            } else if (token.m32836d() == Token.f59646h) {
                arrayList.add(Integer.valueOf(token.m32834f()));
            } else {
                throw new IOException("Expected INTEGER or REAL but got " + token + " at array position " + i);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final byte[] m32823b(byte[] bArr, int i, int i2) {
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
    public final byte[] m32822c(byte[] bArr) {
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
    public final boolean m32821d(byte[] bArr) {
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
    public Type1Font m32820e(byte[] bArr, byte[] bArr2) {
        this.f59697b = new Type1Font(bArr, bArr2);
        m32819f(bArr);
        if (bArr2.length > 0) {
            m32818g(bArr2);
        }
        return this.f59697b;
    }

    /* renamed from: f */
    public final void m32819f(byte[] bArr) {
        Token m32831c;
        if (bArr.length != 0) {
            if (bArr.length >= 2) {
                if (bArr[0] == 37 || bArr[1] == 33) {
                    C9883a c9883a = new C9883a(bArr);
                    this.f59696a = c9883a;
                    if (c9883a.m32831c().m32835e().equals("FontDirectory")) {
                        Token.Kind kind = Token.f59643e;
                        m32816i(kind, "FontDirectory");
                        m32817h(Token.f59644f);
                        m32816i(kind, "known");
                        Token.Kind kind2 = Token.f59649k;
                        m32817h(kind2);
                        m32805t();
                        m32817h(kind2);
                        m32805t();
                        m32816i(kind, "ifelse");
                    }
                    int m32834f = m32817h(Token.f59646h).m32834f();
                    Token.Kind kind3 = Token.f59643e;
                    m32816i(kind3, "dict");
                    m32810o(kind3, "dup");
                    m32816i(kind3, "begin");
                    for (int i = 0; i < m32834f && (m32831c = this.f59696a.m32831c()) != null && (m32831c.m32836d() != Token.f59643e || (!m32831c.m32835e().equals("currentdict") && !m32831c.m32835e().equals("end"))); i++) {
                        String m32835e = m32817h(Token.f59644f).m32835e();
                        if (!m32835e.equals("FontInfo") && !m32835e.equals("Fontinfo")) {
                            if (m32835e.equals("Metrics")) {
                                m32803v();
                            } else if (m32835e.equals("Encoding")) {
                                m32812m();
                            } else {
                                m32802w(m32835e);
                            }
                        } else {
                            m32811n(m32803v());
                        }
                    }
                    Token.Kind kind4 = Token.f59643e;
                    m32810o(kind4, "currentdict");
                    m32816i(kind4, "end");
                    m32816i(kind4, "currentfile");
                    m32816i(kind4, "eexec");
                    return;
                }
            }
            throw new IOException("Invalid start of ASCII segment of type 1 font");
        }
        throw new IOException("ASCII segment of type 1 font is empty");
    }

    /* renamed from: g */
    public final void m32818g(byte[] bArr) {
        byte[] m32823b;
        int i = 4;
        if (m32821d(bArr)) {
            m32823b = m32823b(bArr, 55665, 4);
        } else {
            m32823b = m32823b(m32822c(bArr), 55665, 4);
        }
        C9883a c9883a = new C9883a(m32823b);
        this.f59696a = c9883a;
        Token m32831c = c9883a.m32831c();
        while (m32831c != null && !m32831c.m32835e().equals(StandardStructureTypes.PRIVATE)) {
            this.f59696a.m32832b();
            m32831c = this.f59696a.m32831c();
        }
        if (m32831c != null) {
            m32816i(Token.f59644f, StandardStructureTypes.PRIVATE);
            int m32834f = m32817h(Token.f59646h).m32834f();
            Token.Kind kind = Token.f59643e;
            m32816i(kind, "dict");
            m32810o(kind, "dup");
            m32816i(kind, "begin");
            for (int i2 = 0; i2 < m32834f && this.f59696a.m32831c() != null; i2++) {
                Token.Kind m32836d = this.f59696a.m32831c().m32836d();
                Token.Kind kind2 = Token.f59644f;
                if (m32836d != kind2) {
                    break;
                }
                String m32835e = m32817h(kind2).m32835e();
                if ("Subrs".equals(m32835e)) {
                    m32801x(i);
                } else if ("OtherSubrs".equals(m32835e)) {
                    m32809p();
                } else if ("lenIV".equals(m32835e)) {
                    i = ((Token) m32813l().get(0)).m32834f();
                } else if ("ND".equals(m32835e)) {
                    m32817h(Token.f59649k);
                    Token.Kind kind3 = Token.f59643e;
                    m32810o(kind3, "noaccess");
                    m32816i(kind3, BaseParser.DEF);
                    m32817h(Token.f59650l);
                    m32810o(kind3, "executeonly");
                    m32810o(kind3, "readonly");
                    m32816i(kind3, BaseParser.DEF);
                } else if ("NP".equals(m32835e)) {
                    m32817h(Token.f59649k);
                    Token.Kind kind4 = Token.f59643e;
                    m32810o(kind4, "noaccess");
                    m32817h(kind4);
                    m32817h(Token.f59650l);
                    m32810o(kind4, "executeonly");
                    m32810o(kind4, "readonly");
                    m32816i(kind4, BaseParser.DEF);
                } else if ("RD".equals(m32835e)) {
                    m32817h(Token.f59649k);
                    m32805t();
                    Token.Kind kind5 = Token.f59643e;
                    m32810o(kind5, "bind");
                    m32810o(kind5, "executeonly");
                    m32810o(kind5, "readonly");
                    m32816i(kind5, BaseParser.DEF);
                } else {
                    m32807r(m32835e, m32813l());
                }
            }
            while (true) {
                Token.Kind m32836d2 = this.f59696a.m32831c().m32836d();
                Token.Kind kind6 = Token.f59644f;
                if (m32836d2 == kind6 && this.f59696a.m32831c().m32835e().equals("CharStrings")) {
                    m32816i(kind6, "CharStrings");
                    m32815j(i);
                    return;
                }
                this.f59696a.m32832b();
            }
        } else {
            throw new IOException("/Private token not found");
        }
    }

    /* renamed from: h */
    public final Token m32817h(Token.Kind kind) {
        Token m32832b = this.f59696a.m32832b();
        if (m32832b != null && m32832b.m32836d() == kind) {
            return m32832b;
        }
        throw new IOException("Found " + m32832b + " but expected " + kind);
    }

    /* renamed from: i */
    public final void m32816i(Token.Kind kind, String str) {
        Token m32817h = m32817h(kind);
        if (m32817h.m32835e().equals(str)) {
            return;
        }
        throw new IOException("Found " + m32817h + " but expected " + str);
    }

    /* renamed from: j */
    public final void m32815j(int i) {
        int m32834f = m32817h(Token.f59646h).m32834f();
        Token.Kind kind = Token.f59643e;
        m32816i(kind, "dict");
        m32816i(kind, "dup");
        m32816i(kind, "begin");
        for (int i2 = 0; i2 < m32834f && this.f59696a.m32831c() != null && (this.f59696a.m32831c().m32836d() != Token.f59643e || !this.f59696a.m32831c().m32835e().equals("end")); i2++) {
            String m32835e = m32817h(Token.f59644f).m32835e();
            m32817h(Token.f59646h);
            this.f59697b.f59663G.put(m32835e, m32823b(m32817h(Token.f59651m).m32837c(), 4330, i));
            m32814k();
        }
        m32816i(Token.f59643e, "end");
    }

    /* renamed from: k */
    public final void m32814k() {
        Token.Kind kind = Token.f59643e;
        m32810o(kind, "readonly");
        m32810o(kind, "noaccess");
        Token m32817h = m32817h(kind);
        if (!m32817h.m32835e().equals("ND") && !m32817h.m32835e().equals("|-")) {
            if (m32817h.m32835e().equals("noaccess")) {
                m32817h = m32817h(kind);
            }
            if (m32817h.m32835e().equals(BaseParser.DEF)) {
                return;
            }
            throw new IOException("Found " + m32817h + " but expected ND");
        }
    }

    /* renamed from: l */
    public final List m32813l() {
        List m32800y = m32800y();
        m32814k();
        return m32800y;
    }

    /* renamed from: m */
    public final void m32812m() {
        Token.Kind kind;
        Token.Kind m32836d = this.f59696a.m32831c().m32836d();
        Token.Kind kind2 = Token.f59643e;
        if (m32836d == kind2) {
            String m32835e = this.f59696a.m32832b().m32835e();
            if (m32835e.equals("StandardEncoding")) {
                this.f59697b.f59668b = StandardEncoding.INSTANCE;
                m32810o(kind2, "readonly");
                m32816i(kind2, BaseParser.DEF);
                return;
            }
            throw new IOException("Unknown encoding: " + m32835e);
        }
        m32817h(Token.f59646h).m32834f();
        m32810o(kind2, "array");
        while (true) {
            if (this.f59696a.m32831c().m32836d() != Token.f59643e || (!this.f59696a.m32831c().m32835e().equals("dup") && !this.f59696a.m32831c().m32835e().equals("readonly") && !this.f59696a.m32831c().m32835e().equals(BaseParser.DEF))) {
                this.f59696a.m32832b();
            }
        }
        HashMap hashMap = new HashMap();
        while (true) {
            Token.Kind m32836d2 = this.f59696a.m32831c().m32836d();
            kind = Token.f59643e;
            if (m32836d2 != kind || !this.f59696a.m32831c().m32835e().equals("dup")) {
                break;
            }
            m32816i(kind, "dup");
            int m32834f = m32817h(Token.f59646h).m32834f();
            String m32835e2 = m32817h(Token.f59644f).m32835e();
            m32816i(kind, "put");
            hashMap.put(Integer.valueOf(m32834f), m32835e2);
        }
        this.f59697b.f59668b = new BuiltInEncoding(hashMap);
        m32810o(kind, "readonly");
        m32816i(kind, BaseParser.DEF);
    }

    /* renamed from: n */
    public final void m32811n(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (str.equals(ClientCookie.VERSION_ATTR)) {
                this.f59697b.f59676j = ((Token) list.get(0)).m32835e();
            } else if (str.equals(AFMParser.NOTICE)) {
                this.f59697b.f59677k = ((Token) list.get(0)).m32835e();
            } else if (str.equals(AFMParser.FULL_NAME)) {
                this.f59697b.f59678l = ((Token) list.get(0)).m32835e();
            } else if (str.equals(AFMParser.FAMILY_NAME)) {
                this.f59697b.f59679m = ((Token) list.get(0)).m32835e();
            } else if (str.equals(AFMParser.WEIGHT)) {
                this.f59697b.f59680n = ((Token) list.get(0)).m32835e();
            } else if (str.equals(AFMParser.ITALIC_ANGLE)) {
                this.f59697b.f59681o = ((Token) list.get(0)).m32838b();
            } else if (str.equals("isFixedPitch")) {
                this.f59697b.f59682p = ((Token) list.get(0)).m32839a();
            } else if (str.equals(AFMParser.UNDERLINE_POSITION)) {
                this.f59697b.f59683q = ((Token) list.get(0)).m32838b();
            } else if (str.equals(AFMParser.UNDERLINE_THICKNESS)) {
                this.f59697b.f59684r = ((Token) list.get(0)).m32838b();
            }
        }
    }

    /* renamed from: o */
    public final Token m32810o(Token.Kind kind, String str) {
        Token m32831c = this.f59696a.m32831c();
        if (m32831c != null && m32831c.m32836d() == kind && m32831c.m32835e().equals(str)) {
            return this.f59696a.m32832b();
        }
        return null;
    }

    /* renamed from: p */
    public final void m32809p() {
        if (this.f59696a.m32831c().m32836d() == Token.f59647i) {
            m32800y();
            m32814k();
            return;
        }
        int m32834f = m32817h(Token.f59646h).m32834f();
        m32816i(Token.f59643e, "array");
        for (int i = 0; i < m32834f; i++) {
            m32816i(Token.f59643e, "dup");
            m32817h(Token.f59646h);
            m32800y();
            m32804u();
        }
        m32814k();
    }

    /* renamed from: q */
    public final void m32808q(List list) {
        if (this.f59696a.m32831c().m32835e().equals("systemdict")) {
            Token.Kind kind = Token.f59643e;
            m32816i(kind, "systemdict");
            m32816i(Token.f59644f, "internaldict");
            m32816i(kind, "known");
            Token.Kind kind2 = Token.f59649k;
            m32817h(kind2);
            m32805t();
            m32817h(kind2);
            m32805t();
            m32816i(kind, "ifelse");
            m32817h(kind2);
            m32816i(kind, "pop");
            list.clear();
            list.addAll(m32800y());
            m32817h(Token.f59650l);
            m32816i(kind, "if");
        }
    }

    /* renamed from: r */
    public final void m32807r(String str, List list) {
        if (str.equals("BlueValues")) {
            this.f59697b.f59685s = m32824a(list);
        } else if (str.equals("OtherBlues")) {
            this.f59697b.f59686t = m32824a(list);
        } else if (str.equals("FamilyBlues")) {
            this.f59697b.f59687u = m32824a(list);
        } else if (str.equals("FamilyOtherBlues")) {
            this.f59697b.f59688v = m32824a(list);
        } else if (str.equals("BlueScale")) {
            this.f59697b.f59689w = ((Token) list.get(0)).m32838b();
        } else if (str.equals("BlueShift")) {
            this.f59697b.f59690x = ((Token) list.get(0)).m32834f();
        } else if (str.equals("BlueFuzz")) {
            this.f59697b.f59691y = ((Token) list.get(0)).m32834f();
        } else if (str.equals(AFMParser.STD_HW)) {
            this.f59697b.f59692z = m32824a(list);
        } else if (str.equals(AFMParser.STD_VW)) {
            this.f59697b.f59657A = m32824a(list);
        } else if (str.equals("StemSnapH")) {
            this.f59697b.f59658B = m32824a(list);
        } else if (str.equals("StemSnapV")) {
            this.f59697b.f59659C = m32824a(list);
        } else if (str.equals("ForceBold")) {
            this.f59697b.f59660D = ((Token) list.get(0)).m32839a();
        } else if (str.equals("LanguageGroup")) {
            this.f59697b.f59661E = ((Token) list.get(0)).m32834f();
        }
    }

    /* renamed from: s */
    public final List m32806s() {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (true) {
            if (this.f59696a.m32831c().m32836d() == Token.f59649k) {
                i++;
            }
            Token m32832b = this.f59696a.m32832b();
            arrayList.add(m32832b);
            if (m32832b.m32836d() == Token.f59650l && i - 1 == 0) {
                break;
            }
        }
        Token m32810o = m32810o(Token.f59643e, "executeonly");
        if (m32810o != null) {
            arrayList.add(m32810o);
        }
        return arrayList;
    }

    /* renamed from: t */
    public final void m32805t() {
        int i = 1;
        while (true) {
            if (this.f59696a.m32831c().m32836d() == Token.f59649k) {
                i++;
            }
            if (this.f59696a.m32832b().m32836d() == Token.f59650l && i - 1 == 0) {
                m32810o(Token.f59643e, "executeonly");
                return;
            }
        }
    }

    /* renamed from: u */
    public final void m32804u() {
        Token.Kind kind = Token.f59643e;
        m32810o(kind, "readonly");
        Token m32817h = m32817h(kind);
        if (!m32817h.m32835e().equals("NP") && !m32817h.m32835e().equals("|")) {
            if (m32817h.m32835e().equals("noaccess")) {
                m32817h = m32817h(kind);
            }
            if (m32817h.m32835e().equals("put")) {
                return;
            }
            throw new IOException("Found " + m32817h + " but expected NP");
        }
    }

    /* renamed from: v */
    public final Map m32803v() {
        HashMap hashMap = new HashMap();
        int m32834f = m32817h(Token.f59646h).m32834f();
        Token.Kind kind = Token.f59643e;
        m32816i(kind, "dict");
        m32810o(kind, "dup");
        m32816i(kind, "begin");
        for (int i = 0; i < m32834f && this.f59696a.m32831c() != null; i++) {
            Token.Kind m32836d = this.f59696a.m32831c().m32836d();
            Token.Kind kind2 = Token.f59643e;
            if (m32836d == kind2 && !this.f59696a.m32831c().m32835e().equals("end")) {
                m32817h(kind2);
            }
            if (this.f59696a.m32831c() == null || (this.f59696a.m32831c().m32836d() == kind2 && this.f59696a.m32831c().m32835e().equals("end"))) {
                break;
            }
            hashMap.put(m32817h(Token.f59644f).m32835e(), m32813l());
        }
        Token.Kind kind3 = Token.f59643e;
        m32816i(kind3, "end");
        m32810o(kind3, "readonly");
        m32816i(kind3, BaseParser.DEF);
        return hashMap;
    }

    /* renamed from: w */
    public final void m32802w(String str) {
        List m32813l = m32813l();
        if (str.equals(AFMParser.FONT_NAME)) {
            this.f59697b.f59667a = ((Token) m32813l.get(0)).m32835e();
        } else if (str.equals("PaintType")) {
            this.f59697b.f59669c = ((Token) m32813l.get(0)).m32834f();
        } else if (str.equals("FontType")) {
            this.f59697b.f59670d = ((Token) m32813l.get(0)).m32834f();
        } else if (str.equals("FontMatrix")) {
            this.f59697b.f59671e = m32824a(m32813l);
        } else if (str.equals(AFMParser.FONT_BBOX)) {
            this.f59697b.f59672f = m32824a(m32813l);
        } else if (str.equals("UniqueID")) {
            this.f59697b.f59673g = ((Token) m32813l.get(0)).m32834f();
        } else if (str.equals("StrokeWidth")) {
            this.f59697b.f59674h = ((Token) m32813l.get(0)).m32838b();
        } else if (str.equals("FID")) {
            this.f59697b.f59675i = ((Token) m32813l.get(0)).m32835e();
        }
    }

    /* renamed from: x */
    public final void m32801x(int i) {
        int m32834f = m32817h(Token.f59646h).m32834f();
        for (int i2 = 0; i2 < m32834f; i2++) {
            this.f59697b.f59662F.add(null);
        }
        m32816i(Token.f59643e, "array");
        for (int i3 = 0; i3 < m32834f && this.f59696a.m32831c() != null; i3++) {
            Token.Kind m32836d = this.f59696a.m32831c().m32836d();
            Token.Kind kind = Token.f59643e;
            if (m32836d != kind || !this.f59696a.m32831c().m32835e().equals("dup")) {
                break;
            }
            m32816i(kind, "dup");
            Token.Kind kind2 = Token.f59646h;
            Token m32817h = m32817h(kind2);
            m32817h(kind2);
            this.f59697b.f59662F.set(m32817h.m32834f(), m32823b(m32817h(Token.f59651m).m32837c(), 4330, i));
            m32804u();
        }
        m32814k();
    }

    /* renamed from: y */
    public final List m32800y() {
        ArrayList arrayList = new ArrayList();
        Token m32832b = this.f59696a.m32832b();
        if (this.f59696a.m32831c() == null) {
            return arrayList;
        }
        arrayList.add(m32832b);
        if (m32832b.m32836d() == Token.f59647i) {
            int i = 1;
            while (this.f59696a.m32831c() != null) {
                if (this.f59696a.m32831c().m32836d() == Token.f59647i) {
                    i++;
                }
                Token m32832b2 = this.f59696a.m32832b();
                arrayList.add(m32832b2);
                if (m32832b2.m32836d() != Token.f59648j || i - 1 != 0) {
                }
            }
            return arrayList;
        } else if (m32832b.m32836d() == Token.f59649k) {
            arrayList.addAll(m32806s());
        } else if (m32832b.m32836d() == Token.f59652n) {
            m32817h(Token.f59653o);
            return arrayList;
        }
        m32808q(arrayList);
        return arrayList;
    }
}