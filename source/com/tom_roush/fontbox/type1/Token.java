package com.tom_roush.fontbox.type1;

/* loaded from: classes5.dex */
public class Token {

    /* renamed from: d */
    public static final Kind f59630d = Kind.STRING;

    /* renamed from: e */
    public static final Kind f59631e = Kind.NAME;

    /* renamed from: f */
    public static final Kind f59632f = Kind.LITERAL;

    /* renamed from: g */
    public static final Kind f59633g = Kind.REAL;

    /* renamed from: h */
    public static final Kind f59634h = Kind.INTEGER;

    /* renamed from: i */
    public static final Kind f59635i = Kind.START_ARRAY;

    /* renamed from: j */
    public static final Kind f59636j = Kind.END_ARRAY;

    /* renamed from: k */
    public static final Kind f59637k = Kind.START_PROC;

    /* renamed from: l */
    public static final Kind f59638l = Kind.END_PROC;

    /* renamed from: m */
    public static final Kind f59639m = Kind.CHARSTRING;

    /* renamed from: n */
    public static final Kind f59640n = Kind.START_DICT;

    /* renamed from: o */
    public static final Kind f59641o = Kind.END_DICT;

    /* renamed from: a */
    public String f59642a;

    /* renamed from: b */
    public byte[] f59643b;

    /* renamed from: c */
    public final Kind f59644c;

    /* loaded from: classes5.dex */
    public enum Kind {
        NONE,
        STRING,
        NAME,
        LITERAL,
        REAL,
        INTEGER,
        START_ARRAY,
        END_ARRAY,
        START_PROC,
        END_PROC,
        START_DICT,
        END_DICT,
        CHARSTRING
    }

    public Token(String str, Kind kind) {
        this.f59642a = str;
        this.f59644c = kind;
    }

    /* renamed from: a */
    public boolean m32847a() {
        return this.f59642a.equals("true");
    }

    /* renamed from: b */
    public float m32846b() {
        return Float.parseFloat(this.f59642a);
    }

    /* renamed from: c */
    public byte[] m32845c() {
        return this.f59643b;
    }

    /* renamed from: d */
    public Kind m32844d() {
        return this.f59644c;
    }

    /* renamed from: e */
    public String m32843e() {
        return this.f59642a;
    }

    /* renamed from: f */
    public int m32842f() {
        return (int) Float.parseFloat(this.f59642a);
    }

    public String toString() {
        if (this.f59644c == f59639m) {
            return "Token[kind=CHARSTRING, data=" + this.f59643b.length + " bytes]";
        }
        return "Token[kind=" + this.f59644c + ", text=" + this.f59642a + "]";
    }

    public Token(char c, Kind kind) {
        this.f59642a = Character.toString(c);
        this.f59644c = kind;
    }

    public Token(byte[] bArr, Kind kind) {
        this.f59643b = bArr;
        this.f59644c = kind;
    }
}
