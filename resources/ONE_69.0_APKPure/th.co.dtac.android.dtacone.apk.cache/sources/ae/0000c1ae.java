package com.tom_roush.pdfbox.pdmodel.common.function.type4;

/* loaded from: classes5.dex */
public final class Parser {

    /* loaded from: classes5.dex */
    public static abstract class AbstractSyntaxHandler implements SyntaxHandler {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser.SyntaxHandler
        public void comment(CharSequence charSequence) {
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser.SyntaxHandler
        public void newLine(CharSequence charSequence) {
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser.SyntaxHandler
        public void whitespace(CharSequence charSequence) {
        }
    }

    /* loaded from: classes5.dex */
    public enum State {
        NEWLINE,
        WHITESPACE,
        COMMENT,
        TOKEN
    }

    /* loaded from: classes5.dex */
    public interface SyntaxHandler {
        void comment(CharSequence charSequence);

        void newLine(CharSequence charSequence);

        void token(CharSequence charSequence);

        void whitespace(CharSequence charSequence);
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9911a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60273a;

        static {
            int[] iArr = new int[State.values().length];
            f60273a = iArr;
            try {
                iArr[State.NEWLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60273a[State.WHITESPACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60273a[State.COMMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser$b */
    /* loaded from: classes5.dex */
    public static final class C9912b {

        /* renamed from: a */
        public final CharSequence f60274a;

        /* renamed from: b */
        public int f60275b;

        /* renamed from: c */
        public final SyntaxHandler f60276c;

        /* renamed from: d */
        public State f60277d;

        /* renamed from: e */
        public final StringBuilder f60278e;

        public /* synthetic */ C9912b(CharSequence charSequence, SyntaxHandler syntaxHandler, C9911a c9911a) {
            this(charSequence, syntaxHandler);
        }

        /* renamed from: b */
        public final char m32531b() {
            return this.f60274a.charAt(this.f60275b);
        }

        /* renamed from: c */
        public final boolean m32530c() {
            if (this.f60275b < this.f60274a.length()) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final char m32529d() {
            this.f60275b++;
            if (!m32530c()) {
                return (char) 4;
            }
            return m32531b();
        }

        /* renamed from: e */
        public final State m32528e() {
            char m32531b = m32531b();
            if (m32531b != 0 && m32531b != ' ') {
                if (m32531b != '%') {
                    if (m32531b != '\t') {
                        if (m32531b != '\n' && m32531b != '\f' && m32531b != '\r') {
                            this.f60277d = State.TOKEN;
                        } else {
                            this.f60277d = State.NEWLINE;
                        }
                    }
                } else {
                    this.f60277d = State.COMMENT;
                }
                return this.f60277d;
            }
            this.f60277d = State.WHITESPACE;
            return this.f60277d;
        }

        /* renamed from: f */
        public final char m32527f() {
            if (this.f60275b < this.f60274a.length() - 1) {
                return this.f60274a.charAt(this.f60275b + 1);
            }
            return (char) 4;
        }

        /* renamed from: g */
        public final void m32526g() {
            char m32529d;
            this.f60278e.append(m32531b());
            while (m32530c() && (m32529d = m32529d()) != '\n' && m32529d != '\f' && m32529d != '\r') {
                this.f60278e.append(m32529d);
            }
            this.f60276c.comment(this.f60278e);
        }

        /* renamed from: h */
        public final void m32525h() {
            char m32531b = m32531b();
            this.f60278e.append(m32531b);
            if (m32531b == '\r' && m32527f() == '\n') {
                this.f60278e.append(m32529d());
            }
            this.f60276c.newLine(this.f60278e);
            m32529d();
        }

        /* renamed from: i */
        public final void m32524i() {
            char m32529d;
            char m32531b = m32531b();
            this.f60278e.append(m32531b);
            if (m32531b != '{' && m32531b != '}') {
                while (m32530c() && (m32529d = m32529d()) != 0 && m32529d != 4 && m32529d != ' ' && m32529d != '{' && m32529d != '}' && m32529d != '\t' && m32529d != '\n' && m32529d != '\f' && m32529d != '\r') {
                    this.f60278e.append(m32529d);
                }
                this.f60276c.token(this.f60278e);
                return;
            }
            this.f60276c.token(this.f60278e);
            m32529d();
        }

        /* renamed from: j */
        public final void m32523j() {
            char m32529d;
            this.f60278e.append(m32531b());
            while (m32530c() && ((m32529d = m32529d()) == 0 || m32529d == '\t' || m32529d == ' ')) {
                this.f60278e.append(m32529d);
            }
            this.f60276c.whitespace(this.f60278e);
        }

        /* renamed from: k */
        public final void m32522k() {
            while (m32530c()) {
                this.f60278e.setLength(0);
                m32528e();
                int i = C9911a.f60273a[this.f60277d.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            m32524i();
                        } else {
                            m32526g();
                        }
                    } else {
                        m32523j();
                    }
                } else {
                    m32525h();
                }
            }
        }

        public C9912b(CharSequence charSequence, SyntaxHandler syntaxHandler) {
            this.f60277d = State.WHITESPACE;
            this.f60278e = new StringBuilder();
            this.f60274a = charSequence;
            this.f60276c = syntaxHandler;
        }
    }

    public static void parse(CharSequence charSequence, SyntaxHandler syntaxHandler) {
        new C9912b(charSequence, syntaxHandler, null).m32522k();
    }
}