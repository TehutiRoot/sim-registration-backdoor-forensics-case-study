package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class ArcCurveFit extends CurveFit {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;

    /* renamed from: a */
    public final double[] f32122a;

    /* renamed from: b */
    public C3675a[] f32123b;

    /* renamed from: c */
    public boolean f32124c = true;

    /* renamed from: androidx.constraintlayout.core.motion.utils.ArcCurveFit$a */
    /* loaded from: classes2.dex */
    public static class C3675a {

        /* renamed from: s */
        public static double[] f32125s = new double[91];

        /* renamed from: a */
        public double[] f32126a;

        /* renamed from: b */
        public double f32127b;

        /* renamed from: c */
        public double f32128c;

        /* renamed from: d */
        public double f32129d;

        /* renamed from: e */
        public double f32130e;

        /* renamed from: f */
        public double f32131f;

        /* renamed from: g */
        public double f32132g;

        /* renamed from: h */
        public double f32133h;

        /* renamed from: i */
        public double f32134i;

        /* renamed from: j */
        public double f32135j;

        /* renamed from: k */
        public double f32136k;

        /* renamed from: l */
        public double f32137l;

        /* renamed from: m */
        public double f32138m;

        /* renamed from: n */
        public double f32139n;

        /* renamed from: o */
        public double f32140o;

        /* renamed from: p */
        public double f32141p;

        /* renamed from: q */
        public boolean f32142q;

        /* renamed from: r */
        public boolean f32143r;

        public C3675a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2;
            double d7;
            double d8;
            this.f32143r = false;
            this.f32142q = i == 1;
            this.f32128c = d;
            this.f32129d = d2;
            this.f32134i = 1.0d / (d2 - d);
            if (3 == i) {
                this.f32143r = true;
            }
            double d9 = d5 - d3;
            double d10 = d6 - d4;
            if (!this.f32143r && Math.abs(d9) >= 0.001d && Math.abs(d10) >= 0.001d) {
                this.f32126a = new double[101];
                boolean z = this.f32142q;
                if (z) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                this.f32135j = d9 * i2;
                this.f32136k = d10 * (z ? 1 : -1);
                if (z) {
                    d7 = d5;
                } else {
                    d7 = d3;
                }
                this.f32137l = d7;
                if (z) {
                    d8 = d4;
                } else {
                    d8 = d6;
                }
                this.f32138m = d8;
                m58738a(d3, d4, d5, d6);
                this.f32139n = this.f32127b * this.f32134i;
                return;
            }
            this.f32143r = true;
            this.f32130e = d3;
            this.f32131f = d5;
            this.f32132g = d4;
            this.f32133h = d6;
            double hypot = Math.hypot(d10, d9);
            this.f32127b = hypot;
            this.f32139n = hypot * this.f32134i;
            double d11 = this.f32129d;
            double d12 = this.f32128c;
            this.f32137l = d9 / (d11 - d12);
            this.f32138m = d10 / (d11 - d12);
        }

        /* renamed from: a */
        public final void m58738a(double d, double d2, double d3, double d4) {
            double[] dArr;
            double[] dArr2;
            double d5;
            double d6 = d3 - d;
            double d7 = d2 - d4;
            int i = 0;
            double d8 = 0.0d;
            double d9 = 0.0d;
            double d10 = 0.0d;
            while (true) {
                if (i >= f32125s.length) {
                    break;
                }
                double d11 = d8;
                double radians = Math.toRadians((i * 90.0d) / (dArr.length - 1));
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i > 0) {
                    d5 = Math.hypot(sin - d9, cos - d10) + d11;
                    f32125s[i] = d5;
                } else {
                    d5 = d11;
                }
                i++;
                d10 = cos;
                d8 = d5;
                d9 = sin;
            }
            double d12 = d8;
            this.f32127b = d12;
            int i2 = 0;
            while (true) {
                double[] dArr3 = f32125s;
                if (i2 >= dArr3.length) {
                    break;
                }
                dArr3[i2] = dArr3[i2] / d12;
                i2++;
            }
            int i3 = 0;
            while (true) {
                if (i3 < this.f32126a.length) {
                    double length = i3 / (dArr2.length - 1);
                    int binarySearch = Arrays.binarySearch(f32125s, length);
                    if (binarySearch >= 0) {
                        this.f32126a[i3] = binarySearch / (f32125s.length - 1);
                    } else if (binarySearch == -1) {
                        this.f32126a[i3] = 0.0d;
                    } else {
                        int i4 = -binarySearch;
                        int i5 = i4 - 2;
                        double[] dArr4 = f32125s;
                        double d13 = dArr4[i5];
                        this.f32126a[i3] = (i5 + ((length - d13) / (dArr4[i4 - 1] - d13))) / (dArr4.length - 1);
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public double m58737b() {
            double d = this.f32135j * this.f32141p;
            double hypot = this.f32139n / Math.hypot(d, (-this.f32136k) * this.f32140o);
            if (this.f32142q) {
                d = -d;
            }
            return d * hypot;
        }

        /* renamed from: c */
        public double m58736c() {
            double d = this.f32135j * this.f32141p;
            double d2 = (-this.f32136k) * this.f32140o;
            double hypot = this.f32139n / Math.hypot(d, d2);
            if (this.f32142q) {
                return (-d2) * hypot;
            }
            return d2 * hypot;
        }

        /* renamed from: d */
        public double m58735d(double d) {
            return this.f32137l;
        }

        /* renamed from: e */
        public double m58734e(double d) {
            return this.f32138m;
        }

        /* renamed from: f */
        public double m58733f(double d) {
            double d2 = (d - this.f32128c) * this.f32134i;
            double d3 = this.f32130e;
            return d3 + (d2 * (this.f32131f - d3));
        }

        /* renamed from: g */
        public double m58732g(double d) {
            double d2 = (d - this.f32128c) * this.f32134i;
            double d3 = this.f32132g;
            return d3 + (d2 * (this.f32133h - d3));
        }

        /* renamed from: h */
        public double m58731h() {
            return this.f32137l + (this.f32135j * this.f32140o);
        }

        /* renamed from: i */
        public double m58730i() {
            return this.f32138m + (this.f32136k * this.f32141p);
        }

        /* renamed from: j */
        public double m58729j(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f32126a;
            double length = d * (dArr.length - 1);
            int i = (int) length;
            double d2 = length - i;
            double d3 = dArr[i];
            return d3 + (d2 * (dArr[i + 1] - d3));
        }

        /* renamed from: k */
        public void m58728k(double d) {
            double d2;
            if (this.f32142q) {
                d2 = this.f32129d - d;
            } else {
                d2 = d - this.f32128c;
            }
            double m58729j = m58729j(d2 * this.f32134i) * 1.5707963267948966d;
            this.f32140o = Math.sin(m58729j);
            this.f32141p = Math.cos(m58729j);
        }
    }

    public ArcCurveFit(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f32122a = dArr;
        this.f32123b = new C3675a[dArr.length - 1];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            C3675a[] c3675aArr = this.f32123b;
            if (i < c3675aArr.length) {
                int i4 = iArr[i];
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                if (i2 == 1) {
                                    i2 = 2;
                                } else {
                                    i2 = 1;
                                }
                                i3 = i2;
                            }
                        } else {
                            i2 = 2;
                            i3 = 2;
                        }
                    } else {
                        i2 = 1;
                        i3 = 1;
                    }
                } else {
                    i3 = 3;
                }
                double d = dArr[i];
                int i5 = i + 1;
                double d2 = dArr[i5];
                double[] dArr3 = dArr2[i];
                double d3 = dArr3[0];
                double d4 = dArr3[1];
                double[] dArr4 = dArr2[i5];
                c3675aArr[i] = new C3675a(i3, d, d2, d3, d4, dArr4[0], dArr4[1]);
                i = i5;
            } else {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, double[] dArr) {
        if (this.f32124c) {
            C3675a[] c3675aArr = this.f32123b;
            C3675a c3675a = c3675aArr[0];
            double d2 = c3675a.f32128c;
            if (d < d2) {
                double d3 = d - d2;
                if (c3675a.f32143r) {
                    dArr[0] = c3675a.m58733f(d2) + (this.f32123b[0].m58735d(d2) * d3);
                    dArr[1] = this.f32123b[0].m58732g(d2) + (d3 * this.f32123b[0].m58734e(d2));
                    return;
                }
                c3675a.m58728k(d2);
                dArr[0] = this.f32123b[0].m58731h() + (this.f32123b[0].m58737b() * d3);
                dArr[1] = this.f32123b[0].m58730i() + (d3 * this.f32123b[0].m58736c());
                return;
            } else if (d > c3675aArr[c3675aArr.length - 1].f32129d) {
                double d4 = c3675aArr[c3675aArr.length - 1].f32129d;
                double d5 = d - d4;
                int length = c3675aArr.length - 1;
                C3675a c3675a2 = c3675aArr[length];
                if (c3675a2.f32143r) {
                    dArr[0] = c3675a2.m58733f(d4) + (this.f32123b[length].m58735d(d4) * d5);
                    dArr[1] = this.f32123b[length].m58732g(d4) + (d5 * this.f32123b[length].m58734e(d4));
                    return;
                }
                c3675a2.m58728k(d);
                dArr[0] = this.f32123b[length].m58731h() + (this.f32123b[length].m58737b() * d5);
                dArr[1] = this.f32123b[length].m58730i() + (d5 * this.f32123b[length].m58736c());
                return;
            }
        } else {
            C3675a[] c3675aArr2 = this.f32123b;
            double d6 = c3675aArr2[0].f32128c;
            if (d < d6) {
                d = d6;
            }
            if (d > c3675aArr2[c3675aArr2.length - 1].f32129d) {
                d = c3675aArr2[c3675aArr2.length - 1].f32129d;
            }
        }
        int i = 0;
        while (true) {
            C3675a[] c3675aArr3 = this.f32123b;
            if (i >= c3675aArr3.length) {
                return;
            }
            C3675a c3675a3 = c3675aArr3[i];
            if (d <= c3675a3.f32129d) {
                if (c3675a3.f32143r) {
                    dArr[0] = c3675a3.m58733f(d);
                    dArr[1] = this.f32123b[i].m58732g(d);
                    return;
                }
                c3675a3.m58728k(d);
                dArr[0] = this.f32123b[i].m58731h();
                dArr[1] = this.f32123b[i].m58730i();
                return;
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d, double[] dArr) {
        C3675a[] c3675aArr = this.f32123b;
        double d2 = c3675aArr[0].f32128c;
        if (d < d2) {
            d = d2;
        } else if (d > c3675aArr[c3675aArr.length - 1].f32129d) {
            d = c3675aArr[c3675aArr.length - 1].f32129d;
        }
        int i = 0;
        while (true) {
            C3675a[] c3675aArr2 = this.f32123b;
            if (i >= c3675aArr2.length) {
                return;
            }
            C3675a c3675a = c3675aArr2[i];
            if (d <= c3675a.f32129d) {
                if (c3675a.f32143r) {
                    dArr[0] = c3675a.m58735d(d);
                    dArr[1] = this.f32123b[i].m58734e(d);
                    return;
                }
                c3675a.m58728k(d);
                dArr[0] = this.f32123b[i].m58737b();
                dArr[1] = this.f32123b[i].m58736c();
                return;
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.f32122a;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d, int i) {
        C3675a[] c3675aArr = this.f32123b;
        int i2 = 0;
        double d2 = c3675aArr[0].f32128c;
        if (d < d2) {
            d = d2;
        }
        if (d > c3675aArr[c3675aArr.length - 1].f32129d) {
            d = c3675aArr[c3675aArr.length - 1].f32129d;
        }
        while (true) {
            C3675a[] c3675aArr2 = this.f32123b;
            if (i2 >= c3675aArr2.length) {
                return Double.NaN;
            }
            C3675a c3675a = c3675aArr2[i2];
            if (d <= c3675a.f32129d) {
                if (c3675a.f32143r) {
                    if (i == 0) {
                        return c3675a.m58735d(d);
                    }
                    return c3675a.m58734e(d);
                }
                c3675a.m58728k(d);
                if (i == 0) {
                    return this.f32123b[i2].m58737b();
                }
                return this.f32123b[i2].m58736c();
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, float[] fArr) {
        if (this.f32124c) {
            C3675a[] c3675aArr = this.f32123b;
            C3675a c3675a = c3675aArr[0];
            double d2 = c3675a.f32128c;
            if (d < d2) {
                double d3 = d - d2;
                if (c3675a.f32143r) {
                    fArr[0] = (float) (c3675a.m58733f(d2) + (this.f32123b[0].m58735d(d2) * d3));
                    fArr[1] = (float) (this.f32123b[0].m58732g(d2) + (d3 * this.f32123b[0].m58734e(d2)));
                    return;
                }
                c3675a.m58728k(d2);
                fArr[0] = (float) (this.f32123b[0].m58731h() + (this.f32123b[0].m58737b() * d3));
                fArr[1] = (float) (this.f32123b[0].m58730i() + (d3 * this.f32123b[0].m58736c()));
                return;
            } else if (d > c3675aArr[c3675aArr.length - 1].f32129d) {
                double d4 = c3675aArr[c3675aArr.length - 1].f32129d;
                double d5 = d - d4;
                int length = c3675aArr.length - 1;
                C3675a c3675a2 = c3675aArr[length];
                if (c3675a2.f32143r) {
                    fArr[0] = (float) (c3675a2.m58733f(d4) + (this.f32123b[length].m58735d(d4) * d5));
                    fArr[1] = (float) (this.f32123b[length].m58732g(d4) + (d5 * this.f32123b[length].m58734e(d4)));
                    return;
                }
                c3675a2.m58728k(d);
                fArr[0] = (float) this.f32123b[length].m58731h();
                fArr[1] = (float) this.f32123b[length].m58730i();
                return;
            }
        } else {
            C3675a[] c3675aArr2 = this.f32123b;
            double d6 = c3675aArr2[0].f32128c;
            if (d < d6) {
                d = d6;
            } else if (d > c3675aArr2[c3675aArr2.length - 1].f32129d) {
                d = c3675aArr2[c3675aArr2.length - 1].f32129d;
            }
        }
        int i = 0;
        while (true) {
            C3675a[] c3675aArr3 = this.f32123b;
            if (i >= c3675aArr3.length) {
                return;
            }
            C3675a c3675a3 = c3675aArr3[i];
            if (d <= c3675a3.f32129d) {
                if (c3675a3.f32143r) {
                    fArr[0] = (float) c3675a3.m58733f(d);
                    fArr[1] = (float) this.f32123b[i].m58732g(d);
                    return;
                }
                c3675a3.m58728k(d);
                fArr[0] = (float) this.f32123b[i].m58731h();
                fArr[1] = (float) this.f32123b[i].m58730i();
                return;
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d, int i) {
        double m58732g;
        double m58734e;
        double m58730i;
        double m58736c;
        double m58732g2;
        double m58734e2;
        int i2 = 0;
        if (this.f32124c) {
            C3675a[] c3675aArr = this.f32123b;
            C3675a c3675a = c3675aArr[0];
            double d2 = c3675a.f32128c;
            if (d < d2) {
                double d3 = d - d2;
                if (c3675a.f32143r) {
                    if (i == 0) {
                        m58732g2 = c3675a.m58733f(d2);
                        m58734e2 = this.f32123b[0].m58735d(d2);
                    } else {
                        m58732g2 = c3675a.m58732g(d2);
                        m58734e2 = this.f32123b[0].m58734e(d2);
                    }
                    return m58732g2 + (d3 * m58734e2);
                }
                c3675a.m58728k(d2);
                if (i == 0) {
                    m58730i = this.f32123b[0].m58731h();
                    m58736c = this.f32123b[0].m58737b();
                } else {
                    m58730i = this.f32123b[0].m58730i();
                    m58736c = this.f32123b[0].m58736c();
                }
                return m58730i + (d3 * m58736c);
            } else if (d > c3675aArr[c3675aArr.length - 1].f32129d) {
                double d4 = c3675aArr[c3675aArr.length - 1].f32129d;
                double d5 = d - d4;
                int length = c3675aArr.length - 1;
                if (i == 0) {
                    m58732g = c3675aArr[length].m58733f(d4);
                    m58734e = this.f32123b[length].m58735d(d4);
                } else {
                    m58732g = c3675aArr[length].m58732g(d4);
                    m58734e = this.f32123b[length].m58734e(d4);
                }
                return m58732g + (d5 * m58734e);
            }
        } else {
            C3675a[] c3675aArr2 = this.f32123b;
            double d6 = c3675aArr2[0].f32128c;
            if (d < d6) {
                d = d6;
            } else if (d > c3675aArr2[c3675aArr2.length - 1].f32129d) {
                d = c3675aArr2[c3675aArr2.length - 1].f32129d;
            }
        }
        while (true) {
            C3675a[] c3675aArr3 = this.f32123b;
            if (i2 >= c3675aArr3.length) {
                return Double.NaN;
            }
            C3675a c3675a2 = c3675aArr3[i2];
            if (d <= c3675a2.f32129d) {
                if (c3675a2.f32143r) {
                    if (i == 0) {
                        return c3675a2.m58733f(d);
                    }
                    return c3675a2.m58732g(d);
                }
                c3675a2.m58728k(d);
                if (i == 0) {
                    return this.f32123b[i2].m58731h();
                }
                return this.f32123b[i2].m58730i();
            }
            i2++;
        }
    }
}
