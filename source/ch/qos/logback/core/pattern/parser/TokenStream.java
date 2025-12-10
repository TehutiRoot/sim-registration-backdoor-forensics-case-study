package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.pattern.util.RestrictedEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class TokenStream {

    /* renamed from: a */
    public final String f39999a;

    /* renamed from: b */
    public final int f40000b;

    /* renamed from: c */
    public final IEscapeUtil f40001c;

    /* renamed from: d */
    public final IEscapeUtil f40002d = new RestrictedEscapeUtil();

    /* renamed from: e */
    public TokenizerState f40003e = TokenizerState.LITERAL_STATE;

    /* renamed from: f */
    public int f40004f = 0;

    /* loaded from: classes.dex */
    public enum TokenizerState {
        LITERAL_STATE,
        FORMAT_MODIFIER_STATE,
        KEYWORD_STATE,
        OPTION_STATE,
        RIGHT_PARENTHESIS_STATE
    }

    /* renamed from: ch.qos.logback.core.pattern.parser.TokenStream$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5484a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40005a;

        static {
            int[] iArr = new int[TokenizerState.values().length];
            f40005a = iArr;
            try {
                iArr[TokenizerState.LITERAL_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40005a[TokenizerState.FORMAT_MODIFIER_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40005a[TokenizerState.OPTION_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40005a[TokenizerState.KEYWORD_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40005a[TokenizerState.RIGHT_PARENTHESIS_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public TokenStream(String str, IEscapeUtil iEscapeUtil) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("null or empty pattern string not allowed");
        }
        this.f39999a = str;
        this.f40000b = str.length();
        this.f40001c = iEscapeUtil;
    }

    /* renamed from: a */
    public final void m51418a(int i, StringBuffer stringBuffer, List list) {
        if (stringBuffer.length() > 0) {
            list.add(new C22796wT1(i, stringBuffer.toString()));
            stringBuffer.setLength(0);
        }
    }

    /* renamed from: b */
    public void m51417b(String str, StringBuffer stringBuffer) {
        int i = this.f40004f;
        if (i < this.f40000b) {
            String str2 = this.f39999a;
            this.f40004f = i + 1;
            this.f40001c.escape(str, stringBuffer, str2.charAt(i), this.f40004f);
        }
    }

    /* renamed from: c */
    public final void m51416c(char c, List list, StringBuffer stringBuffer) {
        if (c == '(') {
            m51418a(1002, stringBuffer, list);
            list.add(C22796wT1.f108010f);
            this.f40003e = TokenizerState.LITERAL_STATE;
            return;
        }
        if (Character.isJavaIdentifierStart(c)) {
            m51418a(1002, stringBuffer, list);
            this.f40003e = TokenizerState.KEYWORD_STATE;
        }
        stringBuffer.append(c);
    }

    /* renamed from: d */
    public final void m51415d(char c, List list, StringBuffer stringBuffer) {
        TokenizerState tokenizerState;
        if (Character.isJavaIdentifierPart(c)) {
            stringBuffer.append(c);
            return;
        }
        if (c == '{') {
            m51418a(1004, stringBuffer, list);
            tokenizerState = TokenizerState.OPTION_STATE;
        } else {
            if (c == '(') {
                m51418a(1005, stringBuffer, list);
            } else if (c == '%') {
                m51418a(1004, stringBuffer, list);
                list.add(C22796wT1.f108011g);
                tokenizerState = TokenizerState.FORMAT_MODIFIER_STATE;
            } else {
                m51418a(1004, stringBuffer, list);
                if (c == ')') {
                    tokenizerState = TokenizerState.RIGHT_PARENTHESIS_STATE;
                } else if (c == '\\') {
                    int i = this.f40004f;
                    if (i < this.f40000b) {
                        String str = this.f39999a;
                        this.f40004f = i + 1;
                        this.f40001c.escape("%()", stringBuffer, str.charAt(i), this.f40004f);
                    }
                } else {
                    stringBuffer.append(c);
                }
            }
            tokenizerState = TokenizerState.LITERAL_STATE;
        }
        this.f40003e = tokenizerState;
    }

    /* renamed from: e */
    public final void m51414e(char c, List list, StringBuffer stringBuffer) {
        TokenizerState tokenizerState;
        if (c == '%') {
            m51418a(1000, stringBuffer, list);
            list.add(C22796wT1.f108011g);
            tokenizerState = TokenizerState.FORMAT_MODIFIER_STATE;
        } else if (c != ')') {
            if (c != '\\') {
                stringBuffer.append(c);
                return;
            } else {
                m51417b("%()", stringBuffer);
                return;
            }
        } else {
            m51418a(1000, stringBuffer, list);
            tokenizerState = TokenizerState.RIGHT_PARENTHESIS_STATE;
        }
        this.f40003e = tokenizerState;
    }

    /* renamed from: f */
    public final void m51413f(char c, List list, StringBuffer stringBuffer) {
        TokenizerState tokenizerState;
        list.add(C22796wT1.f108009e);
        if (c != ')') {
            if (c == '\\') {
                m51417b("%{}", stringBuffer);
            } else if (c == '{') {
                tokenizerState = TokenizerState.OPTION_STATE;
                this.f40003e = tokenizerState;
            } else {
                stringBuffer.append(c);
            }
            tokenizerState = TokenizerState.LITERAL_STATE;
            this.f40003e = tokenizerState;
        }
    }

    /* renamed from: g */
    public final void m51412g(char c, List list, StringBuffer stringBuffer) {
        new OptionTokenizer(this).m51429c(c, list);
    }

    /* renamed from: h */
    public List m51411h() {
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int i = this.f40004f;
            if (i >= this.f40000b) {
                break;
            }
            char charAt = this.f39999a.charAt(i);
            this.f40004f++;
            int i2 = C5484a.f40005a[this.f40003e.ordinal()];
            if (i2 == 1) {
                m51414e(charAt, arrayList, stringBuffer);
            } else if (i2 == 2) {
                m51416c(charAt, arrayList, stringBuffer);
            } else if (i2 == 3) {
                m51412g(charAt, arrayList, stringBuffer);
            } else if (i2 == 4) {
                m51415d(charAt, arrayList, stringBuffer);
            } else if (i2 == 5) {
                m51413f(charAt, arrayList, stringBuffer);
            }
        }
        int i3 = C5484a.f40005a[this.f40003e.ordinal()];
        if (i3 == 1) {
            m51418a(1000, stringBuffer, arrayList);
        } else if (i3 == 2 || i3 == 3) {
            throw new ScanException("Unexpected end of pattern string");
        } else {
            if (i3 == 4) {
                arrayList.add(new C22796wT1(1004, stringBuffer.toString()));
            } else if (i3 == 5) {
                arrayList.add(C22796wT1.f108009e);
            }
        }
        return arrayList;
    }
}
