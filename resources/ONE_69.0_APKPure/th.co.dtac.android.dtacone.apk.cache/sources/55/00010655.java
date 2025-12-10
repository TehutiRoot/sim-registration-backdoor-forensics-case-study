package p000;

/* renamed from: pq */
/* loaded from: classes5.dex */
public final class C13142pq {

    /* renamed from: a */
    public final int f76996a;

    /* renamed from: b */
    public final int f76997b;

    /* renamed from: c */
    public final int f76998c;

    /* renamed from: d */
    public final int f76999d;

    /* renamed from: e */
    public int f77000e = -1;

    public C13142pq(int i, int i2, int i3, int i4) {
        this.f76996a = i;
        this.f76997b = i2;
        this.f76998c = i3;
        this.f76999d = i4;
    }

    /* renamed from: a */
    public int m23752a() {
        return this.f76998c;
    }

    /* renamed from: b */
    public int m23751b() {
        return this.f76997b;
    }

    /* renamed from: c */
    public int m23750c() {
        return this.f77000e;
    }

    /* renamed from: d */
    public int m23749d() {
        return this.f76996a;
    }

    /* renamed from: e */
    public int m23748e() {
        return this.f76999d;
    }

    /* renamed from: f */
    public int m23747f() {
        return this.f76997b - this.f76996a;
    }

    /* renamed from: g */
    public boolean m23746g() {
        return m23745h(this.f77000e);
    }

    /* renamed from: h */
    public boolean m23745h(int i) {
        if (i != -1 && this.f76998c == (i % 3) * 3) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void m23744i(int i) {
        this.f77000e = i;
    }

    /* renamed from: j */
    public void m23743j() {
        this.f77000e = ((this.f76999d / 30) * 3) + (this.f76998c / 3);
    }

    public String toString() {
        return this.f77000e + "|" + this.f76999d;
    }
}