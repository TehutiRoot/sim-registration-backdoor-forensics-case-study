package androidx.palette.graphics;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.core.graphics.ColorUtils;
import androidx.palette.graphics.Palette;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: androidx.palette.graphics.a */
/* loaded from: classes2.dex */
public final class C4836a {

    /* renamed from: g */
    public static final Comparator f36453g = new C4837a();

    /* renamed from: a */
    public final int[] f36454a;

    /* renamed from: b */
    public final int[] f36455b;

    /* renamed from: c */
    public final List f36456c;

    /* renamed from: e */
    public final Palette.Filter[] f36458e;

    /* renamed from: f */
    public final float[] f36459f = new float[3];

    /* renamed from: d */
    public final TimingLogger f36457d = null;

    /* renamed from: androidx.palette.graphics.a$a */
    /* loaded from: classes2.dex */
    public static class C4837a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C4838b c4838b, C4838b c4838b2) {
            return c4838b2.m53772g() - c4838b.m53772g();
        }
    }

    /* renamed from: androidx.palette.graphics.a$b */
    /* loaded from: classes2.dex */
    public class C4838b {

        /* renamed from: a */
        public int f36460a;

        /* renamed from: b */
        public int f36461b;

        /* renamed from: c */
        public int f36462c;

        /* renamed from: d */
        public int f36463d;

        /* renamed from: e */
        public int f36464e;

        /* renamed from: f */
        public int f36465f;

        /* renamed from: g */
        public int f36466g;

        /* renamed from: h */
        public int f36467h;

        /* renamed from: i */
        public int f36468i;

        public C4838b(int i, int i2) {
            this.f36460a = i;
            this.f36461b = i2;
            m53776c();
        }

        /* renamed from: a */
        public final boolean m53778a() {
            if (m53774e() > 1) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final int m53777b() {
            int m53773f = m53773f();
            C4836a c4836a = C4836a.this;
            int[] iArr = c4836a.f36454a;
            int[] iArr2 = c4836a.f36455b;
            C4836a.m53790e(iArr, m53773f, this.f36460a, this.f36461b);
            Arrays.sort(iArr, this.f36460a, this.f36461b + 1);
            C4836a.m53790e(iArr, m53773f, this.f36460a, this.f36461b);
            int i = this.f36462c / 2;
            int i2 = this.f36460a;
            int i3 = 0;
            while (true) {
                int i4 = this.f36461b;
                if (i2 <= i4) {
                    i3 += iArr2[iArr[i2]];
                    if (i3 >= i) {
                        return Math.min(i4 - 1, i2);
                    }
                    i2++;
                } else {
                    return this.f36460a;
                }
            }
        }

        /* renamed from: c */
        public final void m53776c() {
            C4836a c4836a = C4836a.this;
            int[] iArr = c4836a.f36454a;
            int[] iArr2 = c4836a.f36455b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = 0;
            for (int i8 = this.f36460a; i8 <= this.f36461b; i8++) {
                int i9 = iArr[i8];
                i7 += iArr2[i9];
                int m53784k = C4836a.m53784k(i9);
                int m53785j = C4836a.m53785j(i9);
                int m53786i = C4836a.m53786i(i9);
                if (m53784k > i4) {
                    i4 = m53784k;
                }
                if (m53784k < i) {
                    i = m53784k;
                }
                if (m53785j > i5) {
                    i5 = m53785j;
                }
                if (m53785j < i2) {
                    i2 = m53785j;
                }
                if (m53786i > i6) {
                    i6 = m53786i;
                }
                if (m53786i < i3) {
                    i3 = m53786i;
                }
            }
            this.f36463d = i;
            this.f36464e = i4;
            this.f36465f = i2;
            this.f36466g = i5;
            this.f36467h = i3;
            this.f36468i = i6;
            this.f36462c = i7;
        }

        /* renamed from: d */
        public final Palette.Swatch m53775d() {
            C4836a c4836a = C4836a.this;
            int[] iArr = c4836a.f36454a;
            int[] iArr2 = c4836a.f36455b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.f36460a; i5 <= this.f36461b; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += C4836a.m53784k(i6) * i7;
                i3 += C4836a.m53785j(i6) * i7;
                i4 += i7 * C4836a.m53786i(i6);
            }
            float f = i2;
            return new Palette.Swatch(C4836a.m53793b(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
        }

        /* renamed from: e */
        public final int m53774e() {
            return (this.f36461b + 1) - this.f36460a;
        }

        /* renamed from: f */
        public final int m53773f() {
            int i = this.f36464e - this.f36463d;
            int i2 = this.f36466g - this.f36465f;
            int i3 = this.f36468i - this.f36467h;
            if (i >= i2 && i >= i3) {
                return -3;
            }
            if (i2 >= i && i2 >= i3) {
                return -2;
            }
            return -1;
        }

        /* renamed from: g */
        public final int m53772g() {
            return ((this.f36464e - this.f36463d) + 1) * ((this.f36466g - this.f36465f) + 1) * ((this.f36468i - this.f36467h) + 1);
        }

        /* renamed from: h */
        public final C4838b m53771h() {
            if (m53778a()) {
                int m53777b = m53777b();
                C4838b c4838b = new C4838b(m53777b + 1, this.f36461b);
                this.f36461b = m53777b;
                m53776c();
                return c4838b;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    public C4836a(int[] iArr, int i, Palette.Filter[] filterArr) {
        this.f36458e = filterArr;
        int[] iArr2 = new int[32768];
        this.f36455b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int m53788g = m53788g(iArr[i2]);
            iArr[i2] = m53788g;
            iArr2[m53788g] = iArr2[m53788g] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && m53783l(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f36454a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 <= i) {
            this.f36456c = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                this.f36456c.add(new Palette.Swatch(m53794a(i8), iArr2[i8]));
            }
            return;
        }
        this.f36456c = m53787h(i);
    }

    /* renamed from: a */
    public static int m53794a(int i) {
        return m53793b(m53784k(i), m53785j(i), m53786i(i));
    }

    /* renamed from: b */
    public static int m53793b(int i, int i2, int i3) {
        return Color.rgb(m53789f(i, 5, 8), m53789f(i2, 5, 8), m53789f(i3, 5, 8));
    }

    /* renamed from: e */
    public static void m53790e(int[] iArr, int i, int i2, int i3) {
        if (i != -2) {
            if (i == -1) {
                while (i2 <= i3) {
                    int i4 = iArr[i2];
                    iArr[i2] = m53784k(i4) | (m53786i(i4) << 10) | (m53785j(i4) << 5);
                    i2++;
                }
                return;
            }
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = m53786i(i5) | (m53785j(i5) << 10) | (m53784k(i5) << 5);
            i2++;
        }
    }

    /* renamed from: f */
    public static int m53789f(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* renamed from: g */
    public static int m53788g(int i) {
        return m53789f(Color.blue(i), 8, 5) | (m53789f(Color.red(i), 8, 5) << 10) | (m53789f(Color.green(i), 8, 5) << 5);
    }

    /* renamed from: i */
    public static int m53786i(int i) {
        return i & 31;
    }

    /* renamed from: j */
    public static int m53785j(int i) {
        return (i >> 5) & 31;
    }

    /* renamed from: k */
    public static int m53784k(int i) {
        return (i >> 10) & 31;
    }

    /* renamed from: c */
    public final List m53792c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Palette.Swatch m53775d = ((C4838b) it.next()).m53775d();
            if (!m53781n(m53775d)) {
                arrayList.add(m53775d);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public List m53791d() {
        return this.f36456c;
    }

    /* renamed from: h */
    public final List m53787h(int i) {
        PriorityQueue priorityQueue = new PriorityQueue(i, f36453g);
        priorityQueue.offer(new C4838b(0, this.f36454a.length - 1));
        m53780o(priorityQueue, i);
        return m53792c(priorityQueue);
    }

    /* renamed from: l */
    public final boolean m53783l(int i) {
        int m53794a = m53794a(i);
        ColorUtils.colorToHSL(m53794a, this.f36459f);
        return m53782m(m53794a, this.f36459f);
    }

    /* renamed from: m */
    public final boolean m53782m(int i, float[] fArr) {
        Palette.Filter[] filterArr = this.f36458e;
        if (filterArr != null && filterArr.length > 0) {
            int length = filterArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f36458e[i2].isAllowed(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m53781n(Palette.Swatch swatch) {
        return m53782m(swatch.getRgb(), swatch.getHsl());
    }

    /* renamed from: o */
    public final void m53780o(PriorityQueue priorityQueue, int i) {
        C4838b c4838b;
        while (priorityQueue.size() < i && (c4838b = (C4838b) priorityQueue.poll()) != null && c4838b.m53778a()) {
            priorityQueue.offer(c4838b.m53771h());
            priorityQueue.offer(c4838b);
        }
    }
}
