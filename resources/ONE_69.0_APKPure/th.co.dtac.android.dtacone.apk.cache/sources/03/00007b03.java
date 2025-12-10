package ch.qos.logback.core.subst;

import ch.qos.logback.core.subst.Token;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Tokenizer {

    /* renamed from: a */
    public final String f40147a;

    /* renamed from: b */
    public final int f40148b;

    /* renamed from: c */
    public TokenizerState f40149c = TokenizerState.LITERAL_STATE;

    /* renamed from: d */
    public int f40150d = 0;

    /* loaded from: classes.dex */
    public enum TokenizerState {
        LITERAL_STATE,
        START_STATE,
        DEFAULT_VAL_STATE
    }

    /* renamed from: ch.qos.logback.core.subst.Tokenizer$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5489a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40151a;

        static {
            int[] iArr = new int[TokenizerState.values().length];
            f40151a = iArr;
            try {
                iArr[TokenizerState.LITERAL_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40151a[TokenizerState.START_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40151a[TokenizerState.DEFAULT_VAL_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Tokenizer(String str) {
        this.f40147a = str;
        this.f40148b = str.length();
    }

    /* renamed from: a */
    public final void m51329a(List list, StringBuilder sb) {
        if (sb.length() == 0) {
            return;
        }
        list.add(new Token(Token.Type.LITERAL, sb.toString()));
    }

    /* renamed from: b */
    public final void m51328b(char c, List list, StringBuilder sb) {
        TokenizerState tokenizerState;
        Token token;
        if (c != '$') {
            if (c != '-') {
                sb.append(':');
                if (c != '{') {
                    sb.append(c);
                    tokenizerState = TokenizerState.LITERAL_STATE;
                } else {
                    m51329a(list, sb);
                    sb.setLength(0);
                    token = Token.CURLY_LEFT_TOKEN;
                }
            } else {
                token = Token.DEFAULT_SEP_TOKEN;
            }
            list.add(token);
            tokenizerState = TokenizerState.LITERAL_STATE;
        } else {
            sb.append(':');
            m51329a(list, sb);
            sb.setLength(0);
            tokenizerState = TokenizerState.START_STATE;
        }
        this.f40149c = tokenizerState;
    }

    /* renamed from: c */
    public final void m51327c(char c, List list, StringBuilder sb) {
        TokenizerState tokenizerState;
        Token token;
        if (c == '$') {
            m51329a(list, sb);
            sb.setLength(0);
            tokenizerState = TokenizerState.START_STATE;
        } else if (c != ':') {
            if (c == '{') {
                m51329a(list, sb);
                token = Token.CURLY_LEFT_TOKEN;
            } else if (c != '}') {
                sb.append(c);
                return;
            } else {
                m51329a(list, sb);
                token = Token.CURLY_RIGHT_TOKEN;
            }
            list.add(token);
            sb.setLength(0);
            return;
        } else {
            m51329a(list, sb);
            sb.setLength(0);
            tokenizerState = TokenizerState.DEFAULT_VAL_STATE;
        }
        this.f40149c = tokenizerState;
    }

    /* renamed from: d */
    public final void m51326d(char c, List list, StringBuilder sb) {
        if (c == '{') {
            list.add(Token.START_TOKEN);
        } else {
            sb.append('$');
            sb.append(c);
        }
        this.f40149c = TokenizerState.LITERAL_STATE;
    }

    /* renamed from: e */
    public List m51325e() {
        char c;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = this.f40150d;
            if (i >= this.f40148b) {
                break;
            }
            char charAt = this.f40147a.charAt(i);
            this.f40150d++;
            int i2 = C5489a.f40151a[this.f40149c.ordinal()];
            if (i2 == 1) {
                m51327c(charAt, arrayList, sb);
            } else if (i2 == 2) {
                m51326d(charAt, arrayList, sb);
            } else if (i2 == 3) {
                m51328b(charAt, arrayList, sb);
            }
        }
        int i3 = C5489a.f40151a[this.f40149c.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                c = i3 == 3 ? ':' : '$';
                return arrayList;
            }
            sb.append(c);
        }
        m51329a(arrayList, sb);
        return arrayList;
    }
}