package p000;

/* renamed from: Jy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17898Jy1 {

    /* renamed from: a */
    public int f3071a = 0;

    /* renamed from: b */
    public int f3072b = 0;

    /* renamed from: c */
    public int f3073c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f3074d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f3075e = 0;

    /* renamed from: f */
    public int f3076f = 0;

    /* renamed from: g */
    public boolean f3077g = false;

    /* renamed from: h */
    public boolean f3078h = false;

    /* renamed from: a */
    public int m67662a() {
        if (this.f3077g) {
            return this.f3071a;
        }
        return this.f3072b;
    }

    /* renamed from: b */
    public int m67661b() {
        return this.f3071a;
    }

    /* renamed from: c */
    public int m67660c() {
        return this.f3072b;
    }

    /* renamed from: d */
    public int m67659d() {
        if (this.f3077g) {
            return this.f3072b;
        }
        return this.f3071a;
    }

    /* renamed from: e */
    public void m67658e(int i, int i2) {
        this.f3078h = false;
        if (i != Integer.MIN_VALUE) {
            this.f3075e = i;
            this.f3071a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3076f = i2;
            this.f3072b = i2;
        }
    }

    /* renamed from: f */
    public void m67657f(boolean z) {
        if (z == this.f3077g) {
            return;
        }
        this.f3077g = z;
        if (this.f3078h) {
            if (z) {
                int i = this.f3074d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f3075e;
                }
                this.f3071a = i;
                int i2 = this.f3073c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f3076f;
                }
                this.f3072b = i2;
                return;
            }
            int i3 = this.f3073c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.f3075e;
            }
            this.f3071a = i3;
            int i4 = this.f3074d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f3076f;
            }
            this.f3072b = i4;
            return;
        }
        this.f3071a = this.f3075e;
        this.f3072b = this.f3076f;
    }

    /* renamed from: g */
    public void m67656g(int i, int i2) {
        this.f3073c = i;
        this.f3074d = i2;
        this.f3078h = true;
        if (this.f3077g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f3071a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f3072b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3071a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3072b = i2;
        }
    }
}
