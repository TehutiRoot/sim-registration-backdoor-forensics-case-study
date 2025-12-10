package p000;

import com.google.zxing.Dimension;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.Charset;

/* renamed from: CR */
/* loaded from: classes5.dex */
public final class C0179CR {

    /* renamed from: a */
    public final String f744a;

    /* renamed from: b */
    public SymbolShapeHint f745b;

    /* renamed from: c */
    public Dimension f746c;

    /* renamed from: d */
    public Dimension f747d;

    /* renamed from: e */
    public final StringBuilder f748e;

    /* renamed from: f */
    public int f749f;

    /* renamed from: g */
    public int f750g;

    /* renamed from: h */
    public SymbolInfo f751h;

    /* renamed from: i */
    public int f752i;

    public C0179CR(String str) {
        byte[] bytes = str.getBytes(Charset.forName("ISO-8859-1"));
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.f744a = sb.toString();
        this.f745b = SymbolShapeHint.FORCE_NONE;
        this.f748e = new StringBuilder(str.length());
        this.f750g = -1;
    }

    /* renamed from: a */
    public int m68968a() {
        return this.f748e.length();
    }

    /* renamed from: b */
    public StringBuilder m68967b() {
        return this.f748e;
    }

    /* renamed from: c */
    public char m68966c() {
        return this.f744a.charAt(this.f749f);
    }

    /* renamed from: d */
    public String m68965d() {
        return this.f744a;
    }

    /* renamed from: e */
    public int m68964e() {
        return this.f750g;
    }

    /* renamed from: f */
    public int m68963f() {
        return m68961h() - this.f749f;
    }

    /* renamed from: g */
    public SymbolInfo m68962g() {
        return this.f751h;
    }

    /* renamed from: h */
    public final int m68961h() {
        return this.f744a.length() - this.f752i;
    }

    /* renamed from: i */
    public boolean m68960i() {
        if (this.f749f < m68961h()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m68959j() {
        this.f750g = -1;
    }

    /* renamed from: k */
    public void m68958k() {
        this.f751h = null;
    }

    /* renamed from: l */
    public void m68957l(Dimension dimension, Dimension dimension2) {
        this.f746c = dimension;
        this.f747d = dimension2;
    }

    /* renamed from: m */
    public void m68956m(int i) {
        this.f752i = i;
    }

    /* renamed from: n */
    public void m68955n(SymbolShapeHint symbolShapeHint) {
        this.f745b = symbolShapeHint;
    }

    /* renamed from: o */
    public void m68954o(int i) {
        this.f750g = i;
    }

    /* renamed from: p */
    public void m68953p() {
        m68952q(m68968a());
    }

    /* renamed from: q */
    public void m68952q(int i) {
        SymbolInfo symbolInfo = this.f751h;
        if (symbolInfo == null || i > symbolInfo.getDataCapacity()) {
            this.f751h = SymbolInfo.lookup(i, this.f745b, this.f746c, this.f747d, true);
        }
    }

    /* renamed from: r */
    public void m68951r(char c) {
        this.f748e.append(c);
    }

    /* renamed from: s */
    public void m68950s(String str) {
        this.f748e.append(str);
    }
}