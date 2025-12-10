package androidx.constraintlayout.core.parser;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public class CLToken extends CLElement {

    /* renamed from: c */
    public int f32305c;

    /* renamed from: d */
    public Type f32306d;

    /* renamed from: e */
    public char[] f32307e;

    /* renamed from: f */
    public char[] f32308f;

    /* renamed from: g */
    public char[] f32309g;

    /* loaded from: classes2.dex */
    public enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    /* renamed from: androidx.constraintlayout.core.parser.CLToken$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C3687a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32310a;

        static {
            int[] iArr = new int[Type.values().length];
            f32310a = iArr;
            try {
                iArr[Type.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32310a[Type.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32310a[Type.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32310a[Type.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public CLToken(char[] cArr) {
        super(cArr);
        this.f32305c = 0;
        this.f32306d = Type.UNKNOWN;
        this.f32307e = "true".toCharArray();
        this.f32308f = "false".toCharArray();
        this.f32309g = AbstractJsonLexerKt.NULL.toCharArray();
    }

    public static CLElement allocate(char[] cArr) {
        return new CLToken(cArr);
    }

    public boolean getBoolean() throws CLParsingException {
        Type type = this.f32306d;
        if (type == Type.TRUE) {
            return true;
        }
        if (type == Type.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + content() + ">", this);
    }

    public Type getType() {
        return this.f32306d;
    }

    public boolean isNull() throws CLParsingException {
        if (this.f32306d == Type.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + content() + ">", this);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i);
        sb.append(content());
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        if (CLParser.f32300d) {
            return "<" + content() + ">";
        }
        return content();
    }

    public boolean validate(char c, long j) {
        int i = C3687a.f32310a[this.f32306d.ordinal()];
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        char[] cArr = this.f32307e;
                        int i2 = this.f32305c;
                        if (cArr[i2] == c) {
                            this.f32306d = Type.TRUE;
                        } else if (this.f32308f[i2] == c) {
                            this.f32306d = Type.FALSE;
                        } else if (this.f32309g[i2] == c) {
                            this.f32306d = Type.NULL;
                        }
                        z = true;
                    }
                } else {
                    char[] cArr2 = this.f32309g;
                    int i3 = this.f32305c;
                    if (cArr2[i3] == c) {
                        z = true;
                    }
                    if (z && i3 + 1 == cArr2.length) {
                        setEnd(j);
                    }
                }
            } else {
                char[] cArr3 = this.f32308f;
                int i4 = this.f32305c;
                if (cArr3[i4] == c) {
                    z = true;
                }
                if (z && i4 + 1 == cArr3.length) {
                    setEnd(j);
                }
            }
        } else {
            char[] cArr4 = this.f32307e;
            int i5 = this.f32305c;
            if (cArr4[i5] == c) {
                z = true;
            }
            if (z && i5 + 1 == cArr4.length) {
                setEnd(j);
            }
        }
        this.f32305c++;
        return z;
    }
}
