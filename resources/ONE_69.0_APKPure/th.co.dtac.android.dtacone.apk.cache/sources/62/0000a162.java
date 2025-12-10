package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.material.carousel.a */
/* loaded from: classes4.dex */
public final class C6858a {

    /* renamed from: a */
    public final float f49416a;

    /* renamed from: b */
    public final List f49417b;

    /* renamed from: c */
    public final int f49418c;

    /* renamed from: d */
    public final int f49419d;

    /* renamed from: com.google.android.material.carousel.a$b */
    /* loaded from: classes4.dex */
    public static final class C6860b {

        /* renamed from: a */
        public final float f49420a;

        /* renamed from: c */
        public C6861c f49422c;

        /* renamed from: d */
        public C6861c f49423d;

        /* renamed from: b */
        public final List f49421b = new ArrayList();

        /* renamed from: e */
        public int f49424e = -1;

        /* renamed from: f */
        public int f49425f = -1;

        /* renamed from: g */
        public float f49426g = 0.0f;

        public C6860b(float f) {
            this.f49420a = f;
        }

        /* renamed from: f */
        public static float m45437f(float f, float f2, int i, int i2) {
            return (f - (i * f2)) + (i2 * f2);
        }

        /* renamed from: a */
        public C6860b m45442a(float f, float f2, float f3) {
            return m45441b(f, f2, f3, false);
        }

        /* renamed from: b */
        public C6860b m45441b(float f, float f2, float f3, boolean z) {
            if (f3 <= 0.0f) {
                return this;
            }
            C6861c c6861c = new C6861c(Float.MIN_VALUE, f, f2, f3);
            if (z) {
                if (this.f49422c == null) {
                    this.f49422c = c6861c;
                    this.f49424e = this.f49421b.size();
                }
                if (this.f49425f != -1 && this.f49421b.size() - this.f49425f > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 == this.f49422c.f49430d) {
                    this.f49423d = c6861c;
                    this.f49425f = this.f49421b.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else if (this.f49422c == null && c6861c.f49430d < this.f49426g) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            } else {
                if (this.f49423d != null && c6861c.f49430d > this.f49426g) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f49426g = c6861c.f49430d;
            this.f49421b.add(c6861c);
            return this;
        }

        /* renamed from: c */
        public C6860b m45440c(float f, float f2, float f3, int i) {
            return m45439d(f, f2, f3, i, false);
        }

        /* renamed from: d */
        public C6860b m45439d(float f, float f2, float f3, int i, boolean z) {
            if (i > 0 && f3 > 0.0f) {
                for (int i2 = 0; i2 < i; i2++) {
                    m45441b((i2 * f3) + f, f2, f3, z);
                }
            }
            return this;
        }

        /* renamed from: e */
        public C6858a m45438e() {
            if (this.f49422c != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.f49421b.size(); i++) {
                    C6861c c6861c = (C6861c) this.f49421b.get(i);
                    arrayList.add(new C6861c(m45437f(this.f49422c.f49428b, this.f49420a, this.f49424e, i), c6861c.f49428b, c6861c.f49429c, c6861c.f49430d));
                }
                return new C6858a(this.f49420a, arrayList, this.f49424e, this.f49425f);
            }
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
    }

    /* renamed from: com.google.android.material.carousel.a$c */
    /* loaded from: classes4.dex */
    public static final class C6861c {

        /* renamed from: a */
        public final float f49427a;

        /* renamed from: b */
        public final float f49428b;

        /* renamed from: c */
        public final float f49429c;

        /* renamed from: d */
        public final float f49430d;

        public C6861c(float f, float f2, float f3, float f4) {
            this.f49427a = f;
            this.f49428b = f2;
            this.f49429c = f3;
            this.f49430d = f4;
        }

        /* renamed from: a */
        public static C6861c m45436a(C6861c c6861c, C6861c c6861c2, float f) {
            return new C6861c(AnimationUtils.lerp(c6861c.f49427a, c6861c2.f49427a, f), AnimationUtils.lerp(c6861c.f49428b, c6861c2.f49428b, f), AnimationUtils.lerp(c6861c.f49429c, c6861c2.f49429c, f), AnimationUtils.lerp(c6861c.f49430d, c6861c2.f49430d, f));
        }
    }

    /* renamed from: i */
    public static C6858a m45444i(C6858a c6858a, C6858a c6858a2, float f) {
        if (c6858a.m45449d() == c6858a2.m45449d()) {
            List m45448e = c6858a.m45448e();
            List m45448e2 = c6858a2.m45448e();
            if (m45448e.size() == m45448e2.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < c6858a.m45448e().size(); i++) {
                    arrayList.add(C6861c.m45436a((C6861c) m45448e.get(i), (C6861c) m45448e2.get(i), f));
                }
                return new C6858a(c6858a.m45449d(), arrayList, AnimationUtils.lerp(c6858a.m45451b(), c6858a2.m45451b(), f), AnimationUtils.lerp(c6858a.m45446g(), c6858a2.m45446g(), f));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }

    /* renamed from: j */
    public static C6858a m45443j(C6858a c6858a) {
        boolean z;
        C6860b c6860b = new C6860b(c6858a.m45449d());
        float f = c6858a.m45450c().f49428b - (c6858a.m45450c().f49430d / 2.0f);
        for (int size = c6858a.m45448e().size() - 1; size >= 0; size--) {
            C6861c c6861c = (C6861c) c6858a.m45448e().get(size);
            float f2 = (c6861c.f49430d / 2.0f) + f;
            if (size >= c6858a.m45451b() && size <= c6858a.m45446g()) {
                z = true;
            } else {
                z = false;
            }
            c6860b.m45441b(f2, c6861c.f49429c, c6861c.f49430d, z);
            f += c6861c.f49430d;
        }
        return c6860b.m45438e();
    }

    /* renamed from: a */
    public C6861c m45452a() {
        return (C6861c) this.f49417b.get(this.f49418c);
    }

    /* renamed from: b */
    public int m45451b() {
        return this.f49418c;
    }

    /* renamed from: c */
    public C6861c m45450c() {
        return (C6861c) this.f49417b.get(0);
    }

    /* renamed from: d */
    public float m45449d() {
        return this.f49416a;
    }

    /* renamed from: e */
    public List m45448e() {
        return this.f49417b;
    }

    /* renamed from: f */
    public C6861c m45447f() {
        return (C6861c) this.f49417b.get(this.f49419d);
    }

    /* renamed from: g */
    public int m45446g() {
        return this.f49419d;
    }

    /* renamed from: h */
    public C6861c m45445h() {
        List list = this.f49417b;
        return (C6861c) list.get(list.size() - 1);
    }

    public C6858a(float f, List list, int i, int i2) {
        this.f49416a = f;
        this.f49417b = Collections.unmodifiableList(list);
        this.f49418c = i;
        this.f49419d = i2;
    }
}