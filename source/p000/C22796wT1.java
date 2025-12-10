package p000;

import java.util.List;

/* renamed from: wT1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22796wT1 {

    /* renamed from: d */
    public static C22796wT1 f108008d = new C22796wT1(Integer.MAX_VALUE, "EOF");

    /* renamed from: e */
    public static C22796wT1 f108009e = new C22796wT1(41);

    /* renamed from: f */
    public static C22796wT1 f108010f = new C22796wT1(1005, "BARE");

    /* renamed from: g */
    public static C22796wT1 f108011g = new C22796wT1(37);

    /* renamed from: a */
    public final int f108012a;

    /* renamed from: b */
    public final String f108013b;

    /* renamed from: c */
    public final List f108014c;

    public C22796wT1(int i) {
        this(i, null, null);
    }

    /* renamed from: a */
    public List m836a() {
        return this.f108014c;
    }

    /* renamed from: b */
    public int m835b() {
        return this.f108012a;
    }

    /* renamed from: c */
    public String m834c() {
        return this.f108013b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22796wT1)) {
            return false;
        }
        C22796wT1 c22796wT1 = (C22796wT1) obj;
        if (this.f108012a != c22796wT1.f108012a) {
            return false;
        }
        String str = this.f108013b;
        String str2 = c22796wT1.f108013b;
        if (str == null ? str2 == null : str.equals(str2)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = this.f108012a * 29;
        String str = this.f108013b;
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
        int i = this.f108012a;
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
        if (this.f108013b == null) {
            sb = new StringBuilder();
            sb.append("Token(");
            sb.append(str);
            str2 = ")";
        } else {
            sb = new StringBuilder();
            sb.append("Token(");
            sb.append(str);
            sb.append(", \"");
            sb.append(this.f108013b);
            str2 = "\")";
        }
        sb.append(str2);
        return sb.toString();
    }

    public C22796wT1(int i, String str) {
        this(i, str, null);
    }

    public C22796wT1(int i, String str, List list) {
        this.f108012a = i;
        this.f108013b = str;
        this.f108014c = list;
    }

    public C22796wT1(int i, List list) {
        this(i, null, list);
    }
}
