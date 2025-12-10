package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class Token {

    /* renamed from: a */
    public Type f40147a;

    /* renamed from: b */
    public String f40148b;
    public static final Token START_TOKEN = new Token(Type.START, null);
    public static final Token CURLY_LEFT_TOKEN = new Token(Type.CURLY_LEFT, null);
    public static final Token CURLY_RIGHT_TOKEN = new Token(Type.CURLY_RIGHT, null);
    public static final Token DEFAULT_SEP_TOKEN = new Token(Type.DEFAULT, null);

    /* loaded from: classes.dex */
    public enum Type {
        LITERAL,
        START,
        CURLY_LEFT,
        CURLY_RIGHT,
        DEFAULT
    }

    public Token(Type type, String str) {
        this.f40147a = type;
        this.f40148b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Token token = (Token) obj;
        if (this.f40147a != token.f40147a) {
            return false;
        }
        String str = this.f40148b;
        String str2 = token.f40148b;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        Type type = this.f40147a;
        int hashCode = (type != null ? type.hashCode() : 0) * 31;
        String str = this.f40148b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = "Token{type=" + this.f40147a;
        if (this.f40148b != null) {
            str = str + ", payload='" + this.f40148b + CoreConstants.SINGLE_QUOTE_CHAR;
        }
        return str + '}';
    }
}
