package com.tom_roush.fontbox.type1;

/* loaded from: classes5.dex */
public class Token {

    /* renamed from: d */
    public static final Kind f59642d = Kind.STRING;

    /* renamed from: e */
    public static final Kind f59643e = Kind.NAME;

    /* renamed from: f */
    public static final Kind f59644f = Kind.LITERAL;

    /* renamed from: g */
    public static final Kind f59645g = Kind.REAL;

    /* renamed from: h */
    public static final Kind f59646h = Kind.INTEGER;

    /* renamed from: i */
    public static final Kind f59647i = Kind.START_ARRAY;

    /* renamed from: j */
    public static final Kind f59648j = Kind.END_ARRAY;

    /* renamed from: k */
    public static final Kind f59649k = Kind.START_PROC;

    /* renamed from: l */
    public static final Kind f59650l = Kind.END_PROC;

    /* renamed from: m */
    public static final Kind f59651m = Kind.CHARSTRING;

    /* renamed from: n */
    public static final Kind f59652n = Kind.START_DICT;

    /* renamed from: o */
    public static final Kind f59653o = Kind.END_DICT;

    /* renamed from: a */
    public String f59654a;

    /* renamed from: b */
    public byte[] f59655b;

    /* renamed from: c */
    public final Kind f59656c;

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
        this.f59654a = str;
        this.f59656c = kind;
    }

    /* renamed from: a */
    public boolean m32839a() {
        return this.f59654a.equals("true");
    }

    /* renamed from: b */
    public float m32838b() {
        return Float.parseFloat(this.f59654a);
    }

    /* renamed from: c */
    public byte[] m32837c() {
        return this.f59655b;
    }

    /* renamed from: d */
    public Kind m32836d() {
        return this.f59656c;
    }

    /* renamed from: e */
    public String m32835e() {
        return this.f59654a;
    }

    /* renamed from: f */
    public int m32834f() {
        return (int) Float.parseFloat(this.f59654a);
    }

    public String toString() {
        if (this.f59656c == f59651m) {
            return "Token[kind=CHARSTRING, data=" + this.f59655b.length + " bytes]";
        }
        return "Token[kind=" + this.f59656c + ", text=" + this.f59654a + "]";
    }

    public Token(char c, Kind kind) {
        this.f59654a = Character.toString(c);
        this.f59656c = kind;
    }

    public Token(byte[] bArr, Kind kind) {
        this.f59655b = bArr;
        this.f59656c = kind;
    }
}