package p000;

import com.google.zxing.FormatException;

/* renamed from: lE */
/* loaded from: classes5.dex */
public final class C12181lE extends AbstractC12257mE {

    /* renamed from: b */
    public final int f71629b;

    /* renamed from: c */
    public final int f71630c;

    public C12181lE(int i, int i2, int i3) {
        super(i);
        if (i2 >= 0 && i2 <= 10 && i3 >= 0 && i3 <= 10) {
            this.f71629b = i2;
            this.f71630c = i3;
            return;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: b */
    public int m26844b() {
        return this.f71629b;
    }

    /* renamed from: c */
    public int m26843c() {
        return this.f71630c;
    }

    /* renamed from: d */
    public boolean m26842d() {
        if (this.f71629b == 10) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m26841e() {
        if (this.f71630c == 10) {
            return true;
        }
        return false;
    }
}