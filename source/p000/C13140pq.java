package p000;

/* renamed from: pq */
/* loaded from: classes5.dex */
public final class C13140pq {

    /* renamed from: a */
    public final int f76776a;

    /* renamed from: b */
    public final int f76777b;

    /* renamed from: c */
    public final int f76778c;

    /* renamed from: d */
    public final int f76779d;

    /* renamed from: e */
    public int f76780e = -1;

    public C13140pq(int i, int i2, int i3, int i4) {
        this.f76776a = i;
        this.f76777b = i2;
        this.f76778c = i3;
        this.f76779d = i4;
    }

    /* renamed from: a */
    public int m23595a() {
        return this.f76778c;
    }

    /* renamed from: b */
    public int m23594b() {
        return this.f76777b;
    }

    /* renamed from: c */
    public int m23593c() {
        return this.f76780e;
    }

    /* renamed from: d */
    public int m23592d() {
        return this.f76776a;
    }

    /* renamed from: e */
    public int m23591e() {
        return this.f76779d;
    }

    /* renamed from: f */
    public int m23590f() {
        return this.f76777b - this.f76776a;
    }

    /* renamed from: g */
    public boolean m23589g() {
        return m23588h(this.f76780e);
    }

    /* renamed from: h */
    public boolean m23588h(int i) {
        if (i != -1 && this.f76778c == (i % 3) * 3) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void m23587i(int i) {
        this.f76780e = i;
    }

    /* renamed from: j */
    public void m23586j() {
        this.f76780e = ((this.f76779d / 30) * 3) + (this.f76778c / 3);
    }

    public String toString() {
        return this.f76780e + "|" + this.f76779d;
    }
}
