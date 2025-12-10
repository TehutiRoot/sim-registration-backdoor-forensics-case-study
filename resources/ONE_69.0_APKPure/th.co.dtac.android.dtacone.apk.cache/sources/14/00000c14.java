package p000;

/* renamed from: Ml2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18099Ml2 {

    /* renamed from: a */
    public final String f3956a;

    /* renamed from: b */
    public int f3957b = 0;

    public C18099Ml2(String str) {
        this.f3956a = str;
    }

    /* renamed from: a */
    public final boolean m67323a() {
        if (this.f3957b < this.f3956a.length()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int m67322b() {
        String str = this.f3956a;
        int i = this.f3957b;
        this.f3957b = i + 1;
        char charAt = str.charAt(i);
        if (charAt < 55296) {
            return charAt;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            String str2 = this.f3956a;
            int i4 = this.f3957b;
            this.f3957b = i4 + 1;
            char charAt2 = str2.charAt(i4);
            if (charAt2 >= 55296) {
                i2 |= (charAt2 & 8191) << i3;
                i3 += 13;
            } else {
                return i2 | (charAt2 << i3);
            }
        }
    }
}