package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.material.carousel.a */
/* loaded from: classes4.dex */
public final class C6869a {

    /* renamed from: a */
    public final float f49404a;

    /* renamed from: b */
    public final List f49405b;

    /* renamed from: c */
    public final int f49406c;

    /* renamed from: d */
    public final int f49407d;

    /* renamed from: com.google.android.material.carousel.a$b */
    /* loaded from: classes4.dex */
    public static final class C6871b {

        /* renamed from: a */
        public final float f49408a;

        /* renamed from: c */
        public C6872c f49410c;

        /* renamed from: d */
        public C6872c f49411d;

        /* renamed from: b */
        public final List f49409b = new ArrayList();

        /* renamed from: e */
        public int f49412e = -1;

        /* renamed from: f */
        public int f49413f = -1;

        /* renamed from: g */
        public float f49414g = 0.0f;

        public C6871b(float f) {
            this.f49408a = f;
        }

        /* renamed from: f */
        public static float m45461f(float f, float f2, int i, int i2) {
            return (f - (i * f2)) + (i2 * f2);
        }

        /* renamed from: a */
        public C6871b m45466a(float f, float f2, float f3) {
            return m45465b(f, f2, f3, false);
        }

        /* renamed from: b */
        public C6871b m45465b(float f, float f2, float f3, boolean z) {
            if (f3 <= 0.0f) {
                return this;
            }
            C6872c c6872c = new C6872c(Float.MIN_VALUE, f, f2, f3);
            if (z) {
                if (this.f49410c == null) {
                    this.f49410c = c6872c;
                    this.f49412e = this.f49409b.size();
                }
                if (this.f49413f != -1 && this.f49409b.size() - this.f49413f > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 == this.f49410c.f49418d) {
                    this.f49411d = c6872c;
                    this.f49413f = this.f49409b.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else if (this.f49410c == null && c6872c.f49418d < this.f49414g) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            } else {
                if (this.f49411d != null && c6872c.f49418d > this.f49414g) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f49414g = c6872c.f49418d;
            this.f49409b.add(c6872c);
            return this;
        }

        /* renamed from: c */
        public C6871b m45464c(float f, float f2, float f3, int i) {
            return m45463d(f, f2, f3, i, false);
        }

        /* renamed from: d */
        public C6871b m45463d(float f, float f2, float f3, int i, boolean z) {
            if (i > 0 && f3 > 0.0f) {
                for (int i2 = 0; i2 < i; i2++) {
                    m45465b((i2 * f3) + f, f2, f3, z);
                }
            }
            return this;
        }

        /* renamed from: e */
        public C6869a m45462e() {
            if (this.f49410c != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.f49409b.size(); i++) {
                    C6872c c6872c = (C6872c) this.f49409b.get(i);
                    arrayList.add(new C6872c(m45461f(this.f49410c.f49416b, this.f49408a, this.f49412e, i), c6872c.f49416b, c6872c.f49417c, c6872c.f49418d));
                }
                return new C6869a(this.f49408a, arrayList, this.f49412e, this.f49413f);
            }
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
    }

    /* renamed from: com.google.android.material.carousel.a$c */
    /* loaded from: classes4.dex */
    public static final class C6872c {

        /* renamed from: a */
        public final float f49415a;

        /* renamed from: b */
        public final float f49416b;

        /* renamed from: c */
        public final float f49417c;

        /* renamed from: d */
        public final float f49418d;

        public C6872c(float f, float f2, float f3, float f4) {
            this.f49415a = f;
            this.f49416b = f2;
            this.f49417c = f3;
            this.f49418d = f4;
        }

        /* renamed from: a */
        public static C6872c m45460a(C6872c c6872c, C6872c c6872c2, float f) {
            return new C6872c(AnimationUtils.lerp(c6872c.f49415a, c6872c2.f49415a, f), AnimationUtils.lerp(c6872c.f49416b, c6872c2.f49416b, f), AnimationUtils.lerp(c6872c.f49417c, c6872c2.f49417c, f), AnimationUtils.lerp(c6872c.f49418d, c6872c2.f49418d, f));
        }
    }

    /* renamed from: i */
    public static C6869a m45468i(C6869a c6869a, C6869a c6869a2, float f) {
        if (c6869a.m45473d() == c6869a2.m45473d()) {
            List m45472e = c6869a.m45472e();
            List m45472e2 = c6869a2.m45472e();
            if (m45472e.size() == m45472e2.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < c6869a.m45472e().size(); i++) {
                    arrayList.add(C6872c.m45460a((C6872c) m45472e.get(i), (C6872c) m45472e2.get(i), f));
                }
                return new C6869a(c6869a.m45473d(), arrayList, AnimationUtils.lerp(c6869a.m45475b(), c6869a2.m45475b(), f), AnimationUtils.lerp(c6869a.m45470g(), c6869a2.m45470g(), f));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }

    /* renamed from: j */
    public static C6869a m45467j(C6869a c6869a) {
        boolean z;
        C6871b c6871b = new C6871b(c6869a.m45473d());
        float f = c6869a.m45474c().f49416b - (c6869a.m45474c().f49418d / 2.0f);
        for (int size = c6869a.m45472e().size() - 1; size >= 0; size--) {
            C6872c c6872c = (C6872c) c6869a.m45472e().get(size);
            float f2 = (c6872c.f49418d / 2.0f) + f;
            if (size >= c6869a.m45475b() && size <= c6869a.m45470g()) {
                z = true;
            } else {
                z = false;
            }
            c6871b.m45465b(f2, c6872c.f49417c, c6872c.f49418d, z);
            f += c6872c.f49418d;
        }
        return c6871b.m45462e();
    }

    /* renamed from: a */
    public C6872c m45476a() {
        return (C6872c) this.f49405b.get(this.f49406c);
    }

    /* renamed from: b */
    public int m45475b() {
        return this.f49406c;
    }

    /* renamed from: c */
    public C6872c m45474c() {
        return (C6872c) this.f49405b.get(0);
    }

    /* renamed from: d */
    public float m45473d() {
        return this.f49404a;
    }

    /* renamed from: e */
    public List m45472e() {
        return this.f49405b;
    }

    /* renamed from: f */
    public C6872c m45471f() {
        return (C6872c) this.f49405b.get(this.f49407d);
    }

    /* renamed from: g */
    public int m45470g() {
        return this.f49407d;
    }

    /* renamed from: h */
    public C6872c m45469h() {
        List list = this.f49405b;
        return (C6872c) list.get(list.size() - 1);
    }

    public C6869a(float f, List list, int i, int i2) {
        this.f49404a = f;
        this.f49405b = Collections.unmodifiableList(list);
        this.f49406c = i;
        this.f49407d = i2;
    }
}
