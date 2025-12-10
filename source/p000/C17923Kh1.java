package p000;

/* renamed from: Kh1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17923Kh1 {

    /* renamed from: a */
    public final String f3257a;

    /* renamed from: b */
    public final int f3258b;

    public C17923Kh1(String str, int i) {
        this.f3257a = str;
        this.f3258b = i;
    }

    /* renamed from: a */
    public static C17923Kh1 m67599a(String str) {
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
            return new C17923Kh1(str, i);
        }
        throw new NumberFormatException("empty string");
    }
}
