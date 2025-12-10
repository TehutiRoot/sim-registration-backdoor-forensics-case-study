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
    public static /* synthetic */ class C9922a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60261a;

        static {
            int[] iArr = new int[State.values().length];
            f60261a = iArr;
            try {
                iArr[State.NEWLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60261a[State.WHITESPACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60261a[State.COMMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.common.function.type4.Parser$b */
    /* loaded from: classes5.dex */
    public static final class C9923b {

        /* renamed from: a */
        public final CharSequence f60262a;

        /* renamed from: b */
        public int f60263b;

        /* renamed from: c */
        public final SyntaxHandler f60264c;

        /* renamed from: d */
        public State f60265d;

        /* renamed from: e */
        public final StringBuilder f60266e;

        public /* synthetic */ C9923b(CharSequence charSequence, SyntaxHandler syntaxHandler, C9922a c9922a) {
            this(charSequence, syntaxHandler);
        }

        /* renamed from: b */
        public final char m32539b() {
            return this.f60262a.charAt(this.f60263b);
        }

        /* renamed from: c */
        public final boolean m32538c() {
            if (this.f60263b < this.f60262a.length()) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final char m32537d() {
            this.f60263b++;
            if (!m32538c()) {
                return (char) 4;
            }
            return m32539b();
        }

        /* renamed from: e */
        public final State m32536e() {
            char m32539b = m32539b();
            if (m32539b != 0 && m32539b != ' ') {
                if (m32539b != '%') {
                    if (m32539b != '\t') {
                        if (m32539b != '\n' && m32539b != '\f' && m32539b != '\r') {
                            this.f60265d = State.TOKEN;
                        } else {
                            this.f60265d = State.NEWLINE;
                        }
                    }
                } else {
                    this.f60265d = State.COMMENT;
                }
                return this.f60265d;
            }
            this.f60265d = State.WHITESPACE;
            return this.f60265d;
        }

        /* renamed from: f */
        public final char m32535f() {
            if (this.f60263b < this.f60262a.length() - 1) {
                return this.f60262a.charAt(this.f60263b + 1);
            }
            return (char) 4;
        }

        /* renamed from: g */
        public final void m32534g() {
            char m32537d;
            this.f60266e.append(m32539b());
            while (m32538c() && (m32537d = m32537d()) != '\n' && m32537d != '\f' && m32537d != '\r') {
                this.f60266e.append(m32537d);
            }
            this.f60264c.comment(this.f60266e);
        }

        /* renamed from: h */
        public final void m32533h() {
            char m32539b = m32539b();
            this.f60266e.append(m32539b);
            if (m32539b == '\r' && m32535f() == '\n') {
                this.f60266e.append(m32537d());
            }
            this.f60264c.newLine(this.f60266e);
            m32537d();
        }

        /* renamed from: i */
        public final void m32532i() {
            char m32537d;
            char m32539b = m32539b();
            this.f60266e.append(m32539b);
            if (m32539b != '{' && m32539b != '}') {
                while (m32538c() && (m32537d = m32537d()) != 0 && m32537d != 4 && m32537d != ' ' && m32537d != '{' && m32537d != '}' && m32537d != '\t' && m32537d != '\n' && m32537d != '\f' && m32537d != '\r') {
                    this.f60266e.append(m32537d);
                }
                this.f60264c.token(this.f60266e);
                return;
            }
            this.f60264c.token(this.f60266e);
            m32537d();
        }

        /* renamed from: j */
        public final void m32531j() {
            char m32537d;
            this.f60266e.append(m32539b());
            while (m32538c() && ((m32537d = m32537d()) == 0 || m32537d == '\t' || m32537d == ' ')) {
                this.f60266e.append(m32537d);
            }
            this.f60264c.whitespace(this.f60266e);
        }

        /* renamed from: k */
        public final void m32530k() {
            while (m32538c()) {
                this.f60266e.setLength(0);
                m32536e();
                int i = C9922a.f60261a[this.f60265d.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            m32532i();
                        } else {
                            m32534g();
                        }
                    } else {
                        m32531j();
                    }
                } else {
                    m32533h();
                }
            }
        }

        public C9923b(CharSequence charSequence, SyntaxHandler syntaxHandler) {
            this.f60265d = State.WHITESPACE;
            this.f60266e = new StringBuilder();
            this.f60262a = charSequence;
            this.f60264c = syntaxHandler;
        }
    }

    public static void parse(CharSequence charSequence, SyntaxHandler syntaxHandler) {
        new C9923b(charSequence, syntaxHandler, null).m32530k();
    }
}
