package p000;

import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: JT1 */
/* loaded from: classes4.dex */
public final class JT1 {

    /* renamed from: a */
    public final int f2808a;

    /* renamed from: b */
    public final Comparator f2809b;

    /* renamed from: c */
    public final Object[] f2810c;

    /* renamed from: d */
    public int f2811d;

    /* renamed from: e */
    public Object f2812e;

    public JT1(Comparator comparator, int i) {
        boolean z;
        this.f2809b = (Comparator) Preconditions.checkNotNull(comparator, "comparator");
        this.f2808a = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "k (%s) must be >= 0", i);
        Preconditions.checkArgument(i <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        this.f2810c = new Object[IntMath.checkedMultiply(i, 2)];
        this.f2811d = 0;
        this.f2812e = null;
    }

    /* renamed from: b */
    public static JT1 m67753b(int i, Comparator comparator) {
        return new JT1(comparator, i);
    }

    /* renamed from: a */
    public JT1 m67754a(JT1 jt1) {
        for (int i = 0; i < jt1.f2811d; i++) {
            m67752c(AbstractC21396oJ0.m25936a(jt1.f2810c[i]));
        }
        return this;
    }

    /* renamed from: c */
    public void m67752c(Object obj) {
        int i = this.f2808a;
        if (i == 0) {
            return;
        }
        int i2 = this.f2811d;
        if (i2 == 0) {
            this.f2810c[0] = obj;
            this.f2812e = obj;
            this.f2811d = 1;
        } else if (i2 < i) {
            Object[] objArr = this.f2810c;
            this.f2811d = i2 + 1;
            objArr[i2] = obj;
            if (this.f2809b.compare(obj, AbstractC21396oJ0.m25936a(this.f2812e)) > 0) {
                this.f2812e = obj;
            }
        } else if (this.f2809b.compare(obj, AbstractC21396oJ0.m25936a(this.f2812e)) < 0) {
            Object[] objArr2 = this.f2810c;
            int i3 = this.f2811d;
            int i4 = i3 + 1;
            this.f2811d = i4;
            objArr2[i3] = obj;
            if (i4 == this.f2808a * 2) {
                m67747h();
            }
        }
    }

    /* renamed from: d */
    public void m67751d(Iterator it) {
        while (it.hasNext()) {
            m67752c(it.next());
        }
    }

    /* renamed from: e */
    public final int m67750e(int i, int i2, int i3) {
        Object m25936a = AbstractC21396oJ0.m25936a(this.f2810c[i3]);
        Object[] objArr = this.f2810c;
        objArr[i3] = objArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.f2809b.compare(AbstractC21396oJ0.m25936a(this.f2810c[i]), m25936a) < 0) {
                m67749f(i4, i);
                i4++;
            }
            i++;
        }
        Object[] objArr2 = this.f2810c;
        objArr2[i2] = objArr2[i4];
        objArr2[i4] = m25936a;
        return i4;
    }

    /* renamed from: f */
    public final void m67749f(int i, int i2) {
        Object[] objArr = this.f2810c;
        Object obj = objArr[i];
        objArr[i] = objArr[i2];
        objArr[i2] = obj;
    }

    /* renamed from: g */
    public List m67748g() {
        Object[] objArr = this.f2810c;
        Arrays.sort(objArr, 0, this.f2811d, this.f2809b);
        int i = this.f2811d;
        int i2 = this.f2808a;
        if (i > i2) {
            Object[] objArr2 = this.f2810c;
            Arrays.fill(objArr2, i2, objArr2.length, (Object) null);
            int i3 = this.f2808a;
            this.f2811d = i3;
            this.f2812e = this.f2810c[i3 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, this.f2811d)));
    }

    /* renamed from: h */
    public final void m67747h() {
        int i = (this.f2808a * 2) - 1;
        int log2 = IntMath.log2(i, RoundingMode.CEILING) * 3;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < i) {
                int m67750e = m67750e(i2, i, ((i2 + i) + 1) >>> 1);
                int i5 = this.f2808a;
                if (m67750e > i5) {
                    i = m67750e - 1;
                } else if (m67750e >= i5) {
                    break;
                } else {
                    i2 = Math.max(m67750e, i2 + 1);
                    i4 = m67750e;
                }
                i3++;
                if (i3 >= log2) {
                    Arrays.sort(this.f2810c, i2, i + 1, this.f2809b);
                    break;
                }
            } else {
                break;
            }
        }
        this.f2811d = this.f2808a;
        this.f2812e = AbstractC21396oJ0.m25936a(this.f2810c[i4]);
        while (true) {
            i4++;
            if (i4 < this.f2808a) {
                if (this.f2809b.compare(AbstractC21396oJ0.m25936a(this.f2810c[i4]), AbstractC21396oJ0.m25936a(this.f2812e)) > 0) {
                    this.f2812e = this.f2810c[i4];
                }
            } else {
                return;
            }
        }
    }
}
