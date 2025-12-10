package p000;

/* renamed from: Gz1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17738Gz1 {

    /* renamed from: a */
    public int f2248a = 0;

    /* renamed from: b */
    public int f2249b = 0;

    /* renamed from: c */
    public int f2250c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f2251d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f2252e = 0;

    /* renamed from: f */
    public int f2253f = 0;

    /* renamed from: g */
    public boolean f2254g = false;

    /* renamed from: h */
    public boolean f2255h = false;

    /* renamed from: a */
    public int m68182a() {
        if (this.f2254g) {
            return this.f2248a;
        }
        return this.f2249b;
    }

    /* renamed from: b */
    public int m68181b() {
        return this.f2248a;
    }

    /* renamed from: c */
    public int m68180c() {
        return this.f2249b;
    }

    /* renamed from: d */
    public int m68179d() {
        if (this.f2254g) {
            return this.f2249b;
        }
        return this.f2248a;
    }

    /* renamed from: e */
    public void m68178e(int i, int i2) {
        this.f2255h = false;
        if (i != Integer.MIN_VALUE) {
            this.f2252e = i;
            this.f2248a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2253f = i2;
            this.f2249b = i2;
        }
    }

    /* renamed from: f */
    public void m68177f(boolean z) {
        if (z == this.f2254g) {
            return;
        }
        this.f2254g = z;
        if (this.f2255h) {
            if (z) {
                int i = this.f2251d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f2252e;
                }
                this.f2248a = i;
                int i2 = this.f2250c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f2253f;
                }
                this.f2249b = i2;
                return;
            }
            int i3 = this.f2250c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.f2252e;
            }
            this.f2248a = i3;
            int i4 = this.f2251d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f2253f;
            }
            this.f2249b = i4;
            return;
        }
        this.f2248a = this.f2252e;
        this.f2249b = this.f2253f;
    }

    /* renamed from: g */
    public void m68176g(int i, int i2) {
        this.f2250c = i;
        this.f2251d = i2;
        this.f2255h = true;
        if (this.f2254g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2248a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2249b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2248a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2249b = i2;
        }
    }
}