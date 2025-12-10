package p000;

/* renamed from: Hi1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17764Hi1 {

    /* renamed from: a */
    public final String f2457a;

    /* renamed from: b */
    public final int f2458b;

    public C17764Hi1(String str, int i) {
        this.f2457a = str;
        this.f2458b = i;
    }

    /* renamed from: a */
    public static C17764Hi1 m68100a(String str) {
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            int i = 16;
            if (!str.startsWith("0x") && !str.startsWith("0X")) {
                if (charAt == '#') {
                    str = str.substring(1);
                } else if (charAt == '0' && str.length() > 1) {
                    str = str.substring(1);
                    i = 8;
                } else {
                    i = 10;
                }
            } else {
                str = str.substring(2);
            }
            return new C17764Hi1(str, i);
        }
        throw new NumberFormatException("empty string");
    }
}