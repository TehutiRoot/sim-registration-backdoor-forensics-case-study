package p000;

import com.google.zxing.Dimension;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.Charset;

/* renamed from: yR */
/* loaded from: classes5.dex */
public final class C17125yR {

    /* renamed from: a */
    public final String f108745a;

    /* renamed from: b */
    public SymbolShapeHint f108746b;

    /* renamed from: c */
    public Dimension f108747c;

    /* renamed from: d */
    public Dimension f108748d;

    /* renamed from: e */
    public final StringBuilder f108749e;

    /* renamed from: f */
    public int f108750f;

    /* renamed from: g */
    public int f108751g;

    /* renamed from: h */
    public SymbolInfo f108752h;

    /* renamed from: i */
    public int f108753i;

    public C17125yR(String str) {
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
        this.f108745a = sb.toString();
        this.f108746b = SymbolShapeHint.FORCE_NONE;
        this.f108749e = new StringBuilder(str.length());
        this.f108751g = -1;
    }

    /* renamed from: a */
    public int m276a() {
        return this.f108749e.length();
    }

    /* renamed from: b */
    public StringBuilder m275b() {
        return this.f108749e;
    }

    /* renamed from: c */
    public char m274c() {
        return this.f108745a.charAt(this.f108750f);
    }

    /* renamed from: d */
    public String m273d() {
        return this.f108745a;
    }

    /* renamed from: e */
    public int m272e() {
        return this.f108751g;
    }

    /* renamed from: f */
    public int m271f() {
        return m269h() - this.f108750f;
    }

    /* renamed from: g */
    public SymbolInfo m270g() {
        return this.f108752h;
    }

    /* renamed from: h */
    public final int m269h() {
        return this.f108745a.length() - this.f108753i;
    }

    /* renamed from: i */
    public boolean m268i() {
        if (this.f108750f < m269h()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m267j() {
        this.f108751g = -1;
    }

    /* renamed from: k */
    public void m266k() {
        this.f108752h = null;
    }

    /* renamed from: l */
    public void m265l(Dimension dimension, Dimension dimension2) {
        this.f108747c = dimension;
        this.f108748d = dimension2;
    }

    /* renamed from: m */
    public void m264m(int i) {
        this.f108753i = i;
    }

    /* renamed from: n */
    public void m263n(SymbolShapeHint symbolShapeHint) {
        this.f108746b = symbolShapeHint;
    }

    /* renamed from: o */
    public void m262o(int i) {
        this.f108751g = i;
    }

    /* renamed from: p */
    public void m261p() {
        m260q(m276a());
    }

    /* renamed from: q */
    public void m260q(int i) {
        SymbolInfo symbolInfo = this.f108752h;
        if (symbolInfo == null || i > symbolInfo.getDataCapacity()) {
            this.f108752h = SymbolInfo.lookup(i, this.f108746b, this.f108747c, this.f108748d, true);
        }
    }

    /* renamed from: r */
    public void m259r(char c) {
        this.f108749e.append(c);
    }

    /* renamed from: s */
    public void m258s(String str) {
        this.f108749e.append(str);
    }
}
