package p000;

import java.util.List;

/* renamed from: tU1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22348tU1 {

    /* renamed from: d */
    public static C22348tU1 f80188d = new C22348tU1(Integer.MAX_VALUE, "EOF");

    /* renamed from: e */
    public static C22348tU1 f80189e = new C22348tU1(41);

    /* renamed from: f */
    public static C22348tU1 f80190f = new C22348tU1(1005, "BARE");

    /* renamed from: g */
    public static C22348tU1 f80191g = new C22348tU1(37);

    /* renamed from: a */
    public final int f80192a;

    /* renamed from: b */
    public final String f80193b;

    /* renamed from: c */
    public final List f80194c;

    public C22348tU1(int i) {
        this(i, null, null);
    }

    /* renamed from: a */
    public List m22673a() {
        return this.f80194c;
    }

    /* renamed from: b */
    public int m22672b() {
        return this.f80192a;
    }

    /* renamed from: c */
    public String m22671c() {
        return this.f80193b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22348tU1)) {
            return false;
        }
        C22348tU1 c22348tU1 = (C22348tU1) obj;
        if (this.f80192a != c22348tU1.f80192a) {
            return false;
        }
        String str = this.f80193b;
        String str2 = c22348tU1.f80193b;
        if (str == null ? str2 == null : str.equals(str2)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = this.f80192a * 29;
        String str = this.f80193b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public String toString() {
        String str;
        StringBuilder sb;
        String str2;
        int i = this.f80192a;
        if (i != 37) {
            if (i != 41) {
                if (i != 1000) {
                    if (i != 1002) {
                        switch (i) {
                            case 1004:
                                str = "SIMPLE_KEYWORD";
                                break;
                            case 1005:
                                str = "COMPOSITE_KEYWORD";
                                break;
                            case 1006:
                                str = "OPTION";
                                break;
                            default:
                                str = "UNKNOWN";
                                break;
                        }
                    } else {
                        str = "FormatModifier";
                    }
                } else {
                    str = "LITERAL";
                }
            } else {
                str = "RIGHT_PARENTHESIS";
            }
        } else {
            str = "%";
        }
        if (this.f80193b == null) {
            sb = new StringBuilder();
            sb.append("Token(");
            sb.append(str);
            str2 = ")";
        } else {
            sb = new StringBuilder();
            sb.append("Token(");
            sb.append(str);
            sb.append(", \"");
            sb.append(this.f80193b);
            str2 = "\")";
        }
        sb.append(str2);
        return sb.toString();
    }

    public C22348tU1(int i, String str) {
        this(i, str, null);
    }

    public C22348tU1(int i, String str, List list) {
        this.f80192a = i;
        this.f80193b = str;
        this.f80194c = list;
    }

    public C22348tU1(int i, List list) {
        this(i, null, list);
    }
}