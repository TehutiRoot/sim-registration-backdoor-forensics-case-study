package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Arrays;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: com.google.common.collect.j */
/* loaded from: classes4.dex */
public class C7979j {

    /* renamed from: a */
    public transient Object[] f53708a;

    /* renamed from: b */
    public transient int[] f53709b;

    /* renamed from: c */
    public transient int f53710c;

    /* renamed from: d */
    public transient int f53711d;

    /* renamed from: e */
    public transient int[] f53712e;

    /* renamed from: f */
    public transient long[] f53713f;

    /* renamed from: g */
    public transient float f53714g;

    /* renamed from: h */
    public transient int f53715h;

    /* renamed from: com.google.common.collect.j$a */
    /* loaded from: classes4.dex */
    public class C7980a extends Multisets.AbstractC7820f {

        /* renamed from: a */
        public final Object f53716a;

        /* renamed from: b */
        public int f53717b;

        public C7980a(int i) {
            this.f53716a = C7979j.this.f53708a[i];
            this.f53717b = i;
        }

        /* renamed from: a */
        public void m40232a() {
            int i = this.f53717b;
            if (i == -1 || i >= C7979j.this.m40260C() || !Objects.equal(this.f53716a, C7979j.this.f53708a[this.f53717b])) {
                this.f53717b = C7979j.this.m40246m(this.f53716a);
            }
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            m40232a();
            int i = this.f53717b;
            if (i == -1) {
                return 0;
            }
            return C7979j.this.f53709b[i];
        }

        @Override // com.google.common.collect.Multiset.Entry
        public Object getElement() {
            return this.f53716a;
        }
    }

    public C7979j() {
        mo40245n(3, 1.0f);
    }

    /* renamed from: D */
    public static long m40259D(long j, int i) {
        return (j & (-4294967296L)) | (BodyPartID.bodyIdMax & i);
    }

    /* renamed from: b */
    public static C7979j m40257b() {
        return new C7979j();
    }

    /* renamed from: c */
    public static C7979j m40256c(int i) {
        return new C7979j(i);
    }

    /* renamed from: h */
    public static int m40251h(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: j */
    public static int m40249j(long j) {
        return (int) j;
    }

    /* renamed from: q */
    public static long[] m40242q(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    /* renamed from: r */
    public static int[] m40241r(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: A */
    public final void m40262A(int i) {
        if (this.f53712e.length >= 1073741824) {
            this.f53715h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.f53714g)) + 1;
        int[] m40241r = m40241r(i);
        long[] jArr = this.f53713f;
        int length = m40241r.length - 1;
        for (int i3 = 0; i3 < this.f53710c; i3++) {
            int m40251h = m40251h(jArr[i3]);
            int i4 = m40251h & length;
            int i5 = m40241r[i4];
            m40241r[i4] = i3;
            jArr[i3] = (m40251h << 32) | (i5 & BodyPartID.bodyIdMax);
        }
        this.f53715h = i2;
        this.f53712e = m40241r;
    }

    /* renamed from: B */
    public void m40261B(int i, int i2) {
        Preconditions.checkElementIndex(i, this.f53710c);
        this.f53709b[i] = i2;
    }

    /* renamed from: C */
    public int m40260C() {
        return this.f53710c;
    }

    /* renamed from: a */
    public void mo40258a() {
        this.f53711d++;
        Arrays.fill(this.f53708a, 0, this.f53710c, (Object) null);
        Arrays.fill(this.f53709b, 0, this.f53710c, 0);
        Arrays.fill(this.f53712e, -1);
        Arrays.fill(this.f53713f, -1L);
        this.f53710c = 0;
    }

    /* renamed from: d */
    public void m40255d(int i) {
        if (i > this.f53713f.length) {
            mo40234y(i);
        }
        if (i >= this.f53715h) {
            m40262A(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    /* renamed from: e */
    public int mo40254e() {
        if (this.f53710c == 0) {
            return -1;
        }
        return 0;
    }

    /* renamed from: f */
    public int m40253f(Object obj) {
        int m40246m = m40246m(obj);
        if (m40246m == -1) {
            return 0;
        }
        return this.f53709b[m40246m];
    }

    /* renamed from: g */
    public Multiset.Entry m40252g(int i) {
        Preconditions.checkElementIndex(i, this.f53710c);
        return new C7980a(i);
    }

    /* renamed from: i */
    public Object m40250i(int i) {
        Preconditions.checkElementIndex(i, this.f53710c);
        return this.f53708a[i];
    }

    /* renamed from: k */
    public int m40248k(int i) {
        Preconditions.checkElementIndex(i, this.f53710c);
        return this.f53709b[i];
    }

    /* renamed from: l */
    public final int m40247l() {
        return this.f53712e.length - 1;
    }

    /* renamed from: m */
    public int m40246m(Object obj) {
        int m902d = AbstractC22736w70.m902d(obj);
        int i = this.f53712e[m40247l() & m902d];
        while (i != -1) {
            long j = this.f53713f[i];
            if (m40251h(j) == m902d && Objects.equal(obj, this.f53708a[i])) {
                return i;
            }
            i = m40249j(j);
        }
        return -1;
    }

    /* renamed from: n */
    public void mo40245n(int i, float f) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "Illegal load factor");
        int m905a = AbstractC22736w70.m905a(i, f);
        this.f53712e = m40241r(m905a);
        this.f53714g = f;
        this.f53708a = new Object[i];
        this.f53709b = new int[i];
        this.f53713f = m40242q(i);
        this.f53715h = Math.max(1, (int) (m905a * f));
    }

    /* renamed from: o */
    public void mo40244o(int i, Object obj, int i2, int i3) {
        this.f53713f[i] = (i3 << 32) | BodyPartID.bodyIdMax;
        this.f53708a[i] = obj;
        this.f53709b[i] = i2;
    }

    /* renamed from: p */
    public void mo40243p(int i) {
        int m40260C = m40260C() - 1;
        if (i < m40260C) {
            Object[] objArr = this.f53708a;
            objArr[i] = objArr[m40260C];
            int[] iArr = this.f53709b;
            iArr[i] = iArr[m40260C];
            objArr[m40260C] = null;
            iArr[m40260C] = 0;
            long[] jArr = this.f53713f;
            long j = jArr[m40260C];
            jArr[i] = j;
            jArr[m40260C] = -1;
            int m40251h = m40251h(j) & m40247l();
            int[] iArr2 = this.f53712e;
            int i2 = iArr2[m40251h];
            if (i2 == m40260C) {
                iArr2[m40251h] = i;
                return;
            }
            while (true) {
                long j2 = this.f53713f[i2];
                int m40249j = m40249j(j2);
                if (m40249j == m40260C) {
                    this.f53713f[i2] = m40259D(j2, i);
                    return;
                }
                i2 = m40249j;
            }
        } else {
            this.f53708a[i] = null;
            this.f53709b[i] = 0;
            this.f53713f[i] = -1;
        }
    }

    /* renamed from: s */
    public int mo40240s(int i) {
        int i2 = i + 1;
        if (i2 >= this.f53710c) {
            return -1;
        }
        return i2;
    }

    /* renamed from: t */
    public int mo40239t(int i, int i2) {
        return i - 1;
    }

    /* renamed from: u */
    public int m40238u(Object obj, int i) {
        AbstractC5406bs.m51812d(i, "count");
        long[] jArr = this.f53713f;
        Object[] objArr = this.f53708a;
        int[] iArr = this.f53709b;
        int m902d = AbstractC22736w70.m902d(obj);
        int m40247l = m40247l() & m902d;
        int i2 = this.f53710c;
        int[] iArr2 = this.f53712e;
        int i3 = iArr2[m40247l];
        if (i3 == -1) {
            iArr2[m40247l] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (m40251h(j) == m902d && Objects.equal(obj, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int m40249j = m40249j(j);
                if (m40249j == -1) {
                    jArr[i3] = m40259D(j, i2);
                    break;
                }
                i3 = m40249j;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            int i5 = i2 + 1;
            m40233z(i5);
            mo40244o(i2, obj, i, m902d);
            this.f53710c = i5;
            if (i2 >= this.f53715h) {
                m40262A(this.f53712e.length * 2);
            }
            this.f53711d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* renamed from: v */
    public int m40237v(Object obj) {
        return m40236w(obj, AbstractC22736w70.m902d(obj));
    }

    /* renamed from: w */
    public final int m40236w(Object obj, int i) {
        int m40247l = m40247l() & i;
        int i2 = this.f53712e[m40247l];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (m40251h(this.f53713f[i2]) == i && Objects.equal(obj, this.f53708a[i2])) {
                int i4 = this.f53709b[i2];
                if (i3 == -1) {
                    this.f53712e[m40247l] = m40249j(this.f53713f[i2]);
                } else {
                    long[] jArr = this.f53713f;
                    jArr[i3] = m40259D(jArr[i3], m40249j(jArr[i2]));
                }
                mo40243p(i2);
                this.f53710c--;
                this.f53711d++;
                return i4;
            }
            int m40249j = m40249j(this.f53713f[i2]);
            if (m40249j == -1) {
                return 0;
            }
            i3 = i2;
            i2 = m40249j;
        }
    }

    /* renamed from: x */
    public int m40235x(int i) {
        return m40236w(this.f53708a[i], m40251h(this.f53713f[i]));
    }

    /* renamed from: y */
    public void mo40234y(int i) {
        this.f53708a = Arrays.copyOf(this.f53708a, i);
        this.f53709b = Arrays.copyOf(this.f53709b, i);
        long[] jArr = this.f53713f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.f53713f = copyOf;
    }

    /* renamed from: z */
    public final void m40233z(int i) {
        int length = this.f53713f.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                mo40234y(max);
            }
        }
    }

    public C7979j(C7979j c7979j) {
        mo40245n(c7979j.m40260C(), 1.0f);
        int mo40254e = c7979j.mo40254e();
        while (mo40254e != -1) {
            m40238u(c7979j.m40250i(mo40254e), c7979j.m40248k(mo40254e));
            mo40254e = c7979j.mo40240s(mo40254e);
        }
    }

    public C7979j(int i) {
        this(i, 1.0f);
    }

    public C7979j(int i, float f) {
        mo40245n(i, f);
    }
}
