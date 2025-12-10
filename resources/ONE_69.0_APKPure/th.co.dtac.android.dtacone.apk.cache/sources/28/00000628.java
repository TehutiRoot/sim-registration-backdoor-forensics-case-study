package p000;

import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: GU1 */
/* loaded from: classes4.dex */
public final class GU1 {

    /* renamed from: a */
    public final int f1987a;

    /* renamed from: b */
    public final Comparator f1988b;

    /* renamed from: c */
    public final Object[] f1989c;

    /* renamed from: d */
    public int f1990d;

    /* renamed from: e */
    public Object f1991e;

    public GU1(Comparator comparator, int i) {
        boolean z;
        this.f1988b = (Comparator) Preconditions.checkNotNull(comparator, "comparator");
        this.f1987a = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "k (%s) must be >= 0", i);
        Preconditions.checkArgument(i <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        this.f1989c = new Object[IntMath.checkedMultiply(i, 2)];
        this.f1990d = 0;
        this.f1991e = null;
    }

    /* renamed from: b */
    public static GU1 m68280b(int i, Comparator comparator) {
        return new GU1(comparator, i);
    }

    /* renamed from: a */
    public GU1 m68281a(GU1 gu1) {
        for (int i = 0; i < gu1.f1990d; i++) {
            m68279c(AbstractC22494uJ0.m1205a(gu1.f1989c[i]));
        }
        return this;
    }

    /* renamed from: c */
    public void m68279c(Object obj) {
        int i = this.f1987a;
        if (i == 0) {
            return;
        }
        int i2 = this.f1990d;
        if (i2 == 0) {
            this.f1989c[0] = obj;
            this.f1991e = obj;
            this.f1990d = 1;
        } else if (i2 < i) {
            Object[] objArr = this.f1989c;
            this.f1990d = i2 + 1;
            objArr[i2] = obj;
            if (this.f1988b.compare(obj, AbstractC22494uJ0.m1205a(this.f1991e)) > 0) {
                this.f1991e = obj;
            }
        } else if (this.f1988b.compare(obj, AbstractC22494uJ0.m1205a(this.f1991e)) < 0) {
            Object[] objArr2 = this.f1989c;
            int i3 = this.f1990d;
            int i4 = i3 + 1;
            this.f1990d = i4;
            objArr2[i3] = obj;
            if (i4 == this.f1987a * 2) {
                m68274h();
            }
        }
    }

    /* renamed from: d */
    public void m68278d(Iterator it) {
        while (it.hasNext()) {
            m68279c(it.next());
        }
    }

    /* renamed from: e */
    public final int m68277e(int i, int i2, int i3) {
        Object m1205a = AbstractC22494uJ0.m1205a(this.f1989c[i3]);
        Object[] objArr = this.f1989c;
        objArr[i3] = objArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.f1988b.compare(AbstractC22494uJ0.m1205a(this.f1989c[i]), m1205a) < 0) {
                m68276f(i4, i);
                i4++;
            }
            i++;
        }
        Object[] objArr2 = this.f1989c;
        objArr2[i2] = objArr2[i4];
        objArr2[i4] = m1205a;
        return i4;
    }

    /* renamed from: f */
    public final void m68276f(int i, int i2) {
        Object[] objArr = this.f1989c;
        Object obj = objArr[i];
        objArr[i] = objArr[i2];
        objArr[i2] = obj;
    }

    /* renamed from: g */
    public List m68275g() {
        Object[] objArr = this.f1989c;
        Arrays.sort(objArr, 0, this.f1990d, this.f1988b);
        int i = this.f1990d;
        int i2 = this.f1987a;
        if (i > i2) {
            Object[] objArr2 = this.f1989c;
            Arrays.fill(objArr2, i2, objArr2.length, (Object) null);
            int i3 = this.f1987a;
            this.f1990d = i3;
            this.f1991e = this.f1989c[i3 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, this.f1990d)));
    }

    /* renamed from: h */
    public final void m68274h() {
        int i = (this.f1987a * 2) - 1;
        int log2 = IntMath.log2(i, RoundingMode.CEILING) * 3;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < i) {
                int m68277e = m68277e(i2, i, ((i2 + i) + 1) >>> 1);
                int i5 = this.f1987a;
                if (m68277e > i5) {
                    i = m68277e - 1;
                } else if (m68277e >= i5) {
                    break;
                } else {
                    i2 = Math.max(m68277e, i2 + 1);
                    i4 = m68277e;
                }
                i3++;
                if (i3 >= log2) {
                    Arrays.sort(this.f1989c, i2, i + 1, this.f1988b);
                    break;
                }
            } else {
                break;
            }
        }
        this.f1990d = this.f1987a;
        this.f1991e = AbstractC22494uJ0.m1205a(this.f1989c[i4]);
        while (true) {
            i4++;
            if (i4 < this.f1987a) {
                if (this.f1988b.compare(AbstractC22494uJ0.m1205a(this.f1989c[i4]), AbstractC22494uJ0.m1205a(this.f1991e)) > 0) {
                    this.f1991e = this.f1989c[i4];
                }
            } else {
                return;
            }
        }
    }
}