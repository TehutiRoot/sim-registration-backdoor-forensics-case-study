package p000;

/* renamed from: Pk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18253Pk2 {

    /* renamed from: a */
    public final String f4827a;

    /* renamed from: b */
    public int f4828b = 0;

    public C18253Pk2(String str) {
        this.f4827a = str;
    }

    /* renamed from: a */
    public final boolean m66736a() {
        if (this.f4828b < this.f4827a.length()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int m66735b() {
        String str = this.f4827a;
        int i = this.f4828b;
        this.f4828b = i + 1;
        char charAt = str.charAt(i);
        if (charAt < 55296) {
            return charAt;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            String str2 = this.f4827a;
            int i4 = this.f4828b;
            this.f4828b = i4 + 1;
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
