package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class ArcCurveFit extends CurveFit {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;

    /* renamed from: a */
    public final double[] f32210a;

    /* renamed from: b */
    public C3657a[] f32211b;

    /* renamed from: c */
    public boolean f32212c = true;

    /* renamed from: androidx.constraintlayout.core.motion.utils.ArcCurveFit$a */
    /* loaded from: classes2.dex */
    public static class C3657a {

        /* renamed from: s */
        public static double[] f32213s = new double[91];

        /* renamed from: a */
        public double[] f32214a;

        /* renamed from: b */
        public double f32215b;

        /* renamed from: c */
        public double f32216c;

        /* renamed from: d */
        public double f32217d;

        /* renamed from: e */
        public double f32218e;

        /* renamed from: f */
        public double f32219f;

        /* renamed from: g */
        public double f32220g;

        /* renamed from: h */
        public double f32221h;

        /* renamed from: i */
        public double f32222i;

        /* renamed from: j */
        public double f32223j;

        /* renamed from: k */
        public double f32224k;

        /* renamed from: l */
        public double f32225l;

        /* renamed from: m */
        public double f32226m;

        /* renamed from: n */
        public double f32227n;

        /* renamed from: o */
        public double f32228o;

        /* renamed from: p */
        public double f32229p;

        /* renamed from: q */
        public boolean f32230q;

        /* renamed from: r */
        public boolean f32231r;

        public C3657a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2;
            double d7;
            double d8;
            this.f32231r = false;
            this.f32230q = i == 1;
            this.f32216c = d;
            this.f32217d = d2;
            this.f32222i = 1.0d / (d2 - d);
            if (3 == i) {
                this.f32231r = true;
            }
            double d9 = d5 - d3;
            double d10 = d6 - d4;
            if (!this.f32231r && Math.abs(d9) >= 0.001d && Math.abs(d10) >= 0.001d) {
                this.f32214a = new double[101];
                boolean z = this.f32230q;
                if (z) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                this.f32223j = d9 * i2;
                this.f32224k = d10 * (z ? 1 : -1);
                if (z) {
                    d7 = d5;
                } else {
                    d7 = d3;
                }
                this.f32225l = d7;
                if (z) {
                    d8 = d4;
                } else {
                    d8 = d6;
                }
                this.f32226m = d8;
                m58688a(d3, d4, d5, d6);
                this.f32227n = this.f32215b * this.f32222i;
                return;
            }
            this.f32231r = true;
            this.f32218e = d3;
            this.f32219f = d5;
            this.f32220g = d4;
            this.f32221h = d6;
            double hypot = Math.hypot(d10, d9);
            this.f32215b = hypot;
            this.f32227n = hypot * this.f32222i;
            double d11 = this.f32217d;
            double d12 = this.f32216c;
            this.f32225l = d9 / (d11 - d12);
            this.f32226m = d10 / (d11 - d12);
        }

        /* renamed from: a */
        public final void m58688a(double d, double d2, double d3, double d4) {
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
                if (i >= f32213s.length) {
                    break;
                }
                double d11 = d8;
                double radians = Math.toRadians((i * 90.0d) / (dArr.length - 1));
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i > 0) {
                    d5 = Math.hypot(sin - d9, cos - d10) + d11;
                    f32213s[i] = d5;
                } else {
                    d5 = d11;
                }
                i++;
                d10 = cos;
                d8 = d5;
                d9 = sin;
            }
            double d12 = d8;
            this.f32215b = d12;
            int i2 = 0;
            while (true) {
                double[] dArr3 = f32213s;
                if (i2 >= dArr3.length) {
                    break;
                }
                dArr3[i2] = dArr3[i2] / d12;
                i2++;
            }
            int i3 = 0;
            while (true) {
                if (i3 < this.f32214a.length) {
                    double length = i3 / (dArr2.length - 1);
                    int binarySearch = Arrays.binarySearch(f32213s, length);
                    if (binarySearch >= 0) {
                        this.f32214a[i3] = binarySearch / (f32213s.length - 1);
                    } else if (binarySearch == -1) {
                        this.f32214a[i3] = 0.0d;
                    } else {
                        int i4 = -binarySearch;
                        int i5 = i4 - 2;
                        double[] dArr4 = f32213s;
                        double d13 = dArr4[i5];
                        this.f32214a[i3] = (i5 + ((length - d13) / (dArr4[i4 - 1] - d13))) / (dArr4.length - 1);
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public double m58687b() {
            double d = this.f32223j * this.f32229p;
            double hypot = this.f32227n / Math.hypot(d, (-this.f32224k) * this.f32228o);
            if (this.f32230q) {
                d = -d;
            }
            return d * hypot;
        }

        /* renamed from: c */
        public double m58686c() {
            double d = this.f32223j * this.f32229p;
            double d2 = (-this.f32224k) * this.f32228o;
            double hypot = this.f32227n / Math.hypot(d, d2);
            if (this.f32230q) {
                return (-d2) * hypot;
            }
            return d2 * hypot;
        }

        /* renamed from: d */
        public double m58685d(double d) {
            return this.f32225l;
        }

        /* renamed from: e */
        public double m58684e(double d) {
            return this.f32226m;
        }

        /* renamed from: f */
        public double m58683f(double d) {
            double d2 = (d - this.f32216c) * this.f32222i;
            double d3 = this.f32218e;
            return d3 + (d2 * (this.f32219f - d3));
        }

        /* renamed from: g */
        public double m58682g(double d) {
            double d2 = (d - this.f32216c) * this.f32222i;
            double d3 = this.f32220g;
            return d3 + (d2 * (this.f32221h - d3));
        }

        /* renamed from: h */
        public double m58681h() {
            return this.f32225l + (this.f32223j * this.f32228o);
        }

        /* renamed from: i */
        public double m58680i() {
            return this.f32226m + (this.f32224k * this.f32229p);
        }

        /* renamed from: j */
        public double m58679j(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f32214a;
            double length = d * (dArr.length - 1);
            int i = (int) length;
            double d2 = length - i;
            double d3 = dArr[i];
            return d3 + (d2 * (dArr[i + 1] - d3));
        }

        /* renamed from: k */
        public void m58678k(double d) {
            double d2;
            if (this.f32230q) {
                d2 = this.f32217d - d;
            } else {
                d2 = d - this.f32216c;
            }
            double m58679j = m58679j(d2 * this.f32222i) * 1.5707963267948966d;
            this.f32228o = Math.sin(m58679j);
            this.f32229p = Math.cos(m58679j);
        }
    }

    public ArcCurveFit(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f32210a = dArr;
        this.f32211b = new C3657a[dArr.length - 1];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            C3657a[] c3657aArr = this.f32211b;
            if (i < c3657aArr.length) {
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
                c3657aArr[i] = new C3657a(i3, d, d2, d3, d4, dArr4[0], dArr4[1]);
                i = i5;
            } else {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, double[] dArr) {
        if (this.f32212c) {
            C3657a[] c3657aArr = this.f32211b;
            C3657a c3657a = c3657aArr[0];
            double d2 = c3657a.f32216c;
            if (d < d2) {
                double d3 = d - d2;
                if (c3657a.f32231r) {
                    dArr[0] = c3657a.m58683f(d2) + (this.f32211b[0].m58685d(d2) * d3);
                    dArr[1] = this.f32211b[0].m58682g(d2) + (d3 * this.f32211b[0].m58684e(d2));
                    return;
                }
                c3657a.m58678k(d2);
                dArr[0] = this.f32211b[0].m58681h() + (this.f32211b[0].m58687b() * d3);
                dArr[1] = this.f32211b[0].m58680i() + (d3 * this.f32211b[0].m58686c());
                return;
            } else if (d > c3657aArr[c3657aArr.length - 1].f32217d) {
                double d4 = c3657aArr[c3657aArr.length - 1].f32217d;
                double d5 = d - d4;
                int length = c3657aArr.length - 1;
                C3657a c3657a2 = c3657aArr[length];
                if (c3657a2.f32231r) {
                    dArr[0] = c3657a2.m58683f(d4) + (this.f32211b[length].m58685d(d4) * d5);
                    dArr[1] = this.f32211b[length].m58682g(d4) + (d5 * this.f32211b[length].m58684e(d4));
                    return;
                }
                c3657a2.m58678k(d);
                dArr[0] = this.f32211b[length].m58681h() + (this.f32211b[length].m58687b() * d5);
                dArr[1] = this.f32211b[length].m58680i() + (d5 * this.f32211b[length].m58686c());
                return;
            }
        } else {
            C3657a[] c3657aArr2 = this.f32211b;
            double d6 = c3657aArr2[0].f32216c;
            if (d < d6) {
                d = d6;
            }
            if (d > c3657aArr2[c3657aArr2.length - 1].f32217d) {
                d = c3657aArr2[c3657aArr2.length - 1].f32217d;
            }
        }
        int i = 0;
        while (true) {
            C3657a[] c3657aArr3 = this.f32211b;
            if (i >= c3657aArr3.length) {
                return;
            }
            C3657a c3657a3 = c3657aArr3[i];
            if (d <= c3657a3.f32217d) {
                if (c3657a3.f32231r) {
                    dArr[0] = c3657a3.m58683f(d);
                    dArr[1] = this.f32211b[i].m58682g(d);
                    return;
                }
                c3657a3.m58678k(d);
                dArr[0] = this.f32211b[i].m58681h();
                dArr[1] = this.f32211b[i].m58680i();
                return;
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d, double[] dArr) {
        C3657a[] c3657aArr = this.f32211b;
        double d2 = c3657aArr[0].f32216c;
        if (d < d2) {
            d = d2;
        } else if (d > c3657aArr[c3657aArr.length - 1].f32217d) {
            d = c3657aArr[c3657aArr.length - 1].f32217d;
        }
        int i = 0;
        while (true) {
            C3657a[] c3657aArr2 = this.f32211b;
            if (i >= c3657aArr2.length) {
                return;
            }
            C3657a c3657a = c3657aArr2[i];
            if (d <= c3657a.f32217d) {
                if (c3657a.f32231r) {
                    dArr[0] = c3657a.m58685d(d);
                    dArr[1] = this.f32211b[i].m58684e(d);
                    return;
                }
                c3657a.m58678k(d);
                dArr[0] = this.f32211b[i].m58687b();
                dArr[1] = this.f32211b[i].m58686c();
                return;
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.f32210a;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d, int i) {
        C3657a[] c3657aArr = this.f32211b;
        int i2 = 0;
        double d2 = c3657aArr[0].f32216c;
        if (d < d2) {
            d = d2;
        }
        if (d > c3657aArr[c3657aArr.length - 1].f32217d) {
            d = c3657aArr[c3657aArr.length - 1].f32217d;
        }
        while (true) {
            C3657a[] c3657aArr2 = this.f32211b;
            if (i2 >= c3657aArr2.length) {
                return Double.NaN;
            }
            C3657a c3657a = c3657aArr2[i2];
            if (d <= c3657a.f32217d) {
                if (c3657a.f32231r) {
                    if (i == 0) {
                        return c3657a.m58685d(d);
                    }
                    return c3657a.m58684e(d);
                }
                c3657a.m58678k(d);
                if (i == 0) {
                    return this.f32211b[i2].m58687b();
                }
                return this.f32211b[i2].m58686c();
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, float[] fArr) {
        if (this.f32212c) {
            C3657a[] c3657aArr = this.f32211b;
            C3657a c3657a = c3657aArr[0];
            double d2 = c3657a.f32216c;
            if (d < d2) {
                double d3 = d - d2;
                if (c3657a.f32231r) {
                    fArr[0] = (float) (c3657a.m58683f(d2) + (this.f32211b[0].m58685d(d2) * d3));
                    fArr[1] = (float) (this.f32211b[0].m58682g(d2) + (d3 * this.f32211b[0].m58684e(d2)));
                    return;
                }
                c3657a.m58678k(d2);
                fArr[0] = (float) (this.f32211b[0].m58681h() + (this.f32211b[0].m58687b() * d3));
                fArr[1] = (float) (this.f32211b[0].m58680i() + (d3 * this.f32211b[0].m58686c()));
                return;
            } else if (d > c3657aArr[c3657aArr.length - 1].f32217d) {
                double d4 = c3657aArr[c3657aArr.length - 1].f32217d;
                double d5 = d - d4;
                int length = c3657aArr.length - 1;
                C3657a c3657a2 = c3657aArr[length];
                if (c3657a2.f32231r) {
                    fArr[0] = (float) (c3657a2.m58683f(d4) + (this.f32211b[length].m58685d(d4) * d5));
                    fArr[1] = (float) (this.f32211b[length].m58682g(d4) + (d5 * this.f32211b[length].m58684e(d4)));
                    return;
                }
                c3657a2.m58678k(d);
                fArr[0] = (float) this.f32211b[length].m58681h();
                fArr[1] = (float) this.f32211b[length].m58680i();
                return;
            }
        } else {
            C3657a[] c3657aArr2 = this.f32211b;
            double d6 = c3657aArr2[0].f32216c;
            if (d < d6) {
                d = d6;
            } else if (d > c3657aArr2[c3657aArr2.length - 1].f32217d) {
                d = c3657aArr2[c3657aArr2.length - 1].f32217d;
            }
        }
        int i = 0;
        while (true) {
            C3657a[] c3657aArr3 = this.f32211b;
            if (i >= c3657aArr3.length) {
                return;
            }
            C3657a c3657a3 = c3657aArr3[i];
            if (d <= c3657a3.f32217d) {
                if (c3657a3.f32231r) {
                    fArr[0] = (float) c3657a3.m58683f(d);
                    fArr[1] = (float) this.f32211b[i].m58682g(d);
                    return;
                }
                c3657a3.m58678k(d);
                fArr[0] = (float) this.f32211b[i].m58681h();
                fArr[1] = (float) this.f32211b[i].m58680i();
                return;
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d, int i) {
        double m58682g;
        double m58684e;
        double m58680i;
        double m58686c;
        double m58682g2;
        double m58684e2;
        int i2 = 0;
        if (this.f32212c) {
            C3657a[] c3657aArr = this.f32211b;
            C3657a c3657a = c3657aArr[0];
            double d2 = c3657a.f32216c;
            if (d < d2) {
                double d3 = d - d2;
                if (c3657a.f32231r) {
                    if (i == 0) {
                        m58682g2 = c3657a.m58683f(d2);
                        m58684e2 = this.f32211b[0].m58685d(d2);
                    } else {
                        m58682g2 = c3657a.m58682g(d2);
                        m58684e2 = this.f32211b[0].m58684e(d2);
                    }
                    return m58682g2 + (d3 * m58684e2);
                }
                c3657a.m58678k(d2);
                if (i == 0) {
                    m58680i = this.f32211b[0].m58681h();
                    m58686c = this.f32211b[0].m58687b();
                } else {
                    m58680i = this.f32211b[0].m58680i();
                    m58686c = this.f32211b[0].m58686c();
                }
                return m58680i + (d3 * m58686c);
            } else if (d > c3657aArr[c3657aArr.length - 1].f32217d) {
                double d4 = c3657aArr[c3657aArr.length - 1].f32217d;
                double d5 = d - d4;
                int length = c3657aArr.length - 1;
                if (i == 0) {
                    m58682g = c3657aArr[length].m58683f(d4);
                    m58684e = this.f32211b[length].m58685d(d4);
                } else {
                    m58682g = c3657aArr[length].m58682g(d4);
                    m58684e = this.f32211b[length].m58684e(d4);
                }
                return m58682g + (d5 * m58684e);
            }
        } else {
            C3657a[] c3657aArr2 = this.f32211b;
            double d6 = c3657aArr2[0].f32216c;
            if (d < d6) {
                d = d6;
            } else if (d > c3657aArr2[c3657aArr2.length - 1].f32217d) {
                d = c3657aArr2[c3657aArr2.length - 1].f32217d;
            }
        }
        while (true) {
            C3657a[] c3657aArr3 = this.f32211b;
            if (i2 >= c3657aArr3.length) {
                return Double.NaN;
            }
            C3657a c3657a2 = c3657aArr3[i2];
            if (d <= c3657a2.f32217d) {
                if (c3657a2.f32231r) {
                    if (i == 0) {
                        return c3657a2.m58683f(d);
                    }
                    return c3657a2.m58682g(d);
                }
                c3657a2.m58678k(d);
                if (i == 0) {
                    return this.f32211b[i2].m58681h();
                }
                return this.f32211b[i2].m58680i();
            }
            i2++;
        }
    }
}