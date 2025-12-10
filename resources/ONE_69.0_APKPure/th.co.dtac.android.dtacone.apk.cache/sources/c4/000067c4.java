package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;

    /* renamed from: K0 */
    public ConstraintWidget[] f32593K0;

    /* renamed from: n0 */
    public int f32595n0 = -1;

    /* renamed from: o0 */
    public int f32596o0 = -1;

    /* renamed from: p0 */
    public int f32597p0 = -1;

    /* renamed from: q0 */
    public int f32598q0 = -1;

    /* renamed from: r0 */
    public int f32599r0 = -1;

    /* renamed from: s0 */
    public int f32600s0 = -1;

    /* renamed from: t0 */
    public float f32601t0 = 0.5f;

    /* renamed from: u0 */
    public float f32602u0 = 0.5f;

    /* renamed from: v0 */
    public float f32603v0 = 0.5f;

    /* renamed from: w0 */
    public float f32604w0 = 0.5f;

    /* renamed from: x0 */
    public float f32605x0 = 0.5f;

    /* renamed from: y0 */
    public float f32606y0 = 0.5f;

    /* renamed from: z0 */
    public int f32607z0 = 0;

    /* renamed from: A0 */
    public int f32583A0 = 0;

    /* renamed from: B0 */
    public int f32584B0 = 2;

    /* renamed from: C0 */
    public int f32585C0 = 2;

    /* renamed from: D0 */
    public int f32586D0 = 0;

    /* renamed from: E0 */
    public int f32587E0 = -1;

    /* renamed from: F0 */
    public int f32588F0 = 0;

    /* renamed from: G0 */
    public ArrayList f32589G0 = new ArrayList();

    /* renamed from: H0 */
    public ConstraintWidget[] f32590H0 = null;

    /* renamed from: I0 */
    public ConstraintWidget[] f32591I0 = null;

    /* renamed from: J0 */
    public int[] f32592J0 = null;

    /* renamed from: L0 */
    public int f32594L0 = 0;

    /* renamed from: androidx.constraintlayout.core.widgets.Flow$a */
    /* loaded from: classes2.dex */
    public class C3679a {

        /* renamed from: a */
        public int f32608a;

        /* renamed from: d */
        public ConstraintAnchor f32611d;

        /* renamed from: e */
        public ConstraintAnchor f32612e;

        /* renamed from: f */
        public ConstraintAnchor f32613f;

        /* renamed from: g */
        public ConstraintAnchor f32614g;

        /* renamed from: h */
        public int f32615h;

        /* renamed from: i */
        public int f32616i;

        /* renamed from: j */
        public int f32617j;

        /* renamed from: k */
        public int f32618k;

        /* renamed from: q */
        public int f32624q;

        /* renamed from: b */
        public ConstraintWidget f32609b = null;

        /* renamed from: c */
        public int f32610c = 0;

        /* renamed from: l */
        public int f32619l = 0;

        /* renamed from: m */
        public int f32620m = 0;

        /* renamed from: n */
        public int f32621n = 0;

        /* renamed from: o */
        public int f32622o = 0;

        /* renamed from: p */
        public int f32623p = 0;

        public C3679a(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.f32615h = 0;
            this.f32616i = 0;
            this.f32617j = 0;
            this.f32618k = 0;
            this.f32624q = 0;
            this.f32608a = i;
            this.f32611d = constraintAnchor;
            this.f32612e = constraintAnchor2;
            this.f32613f = constraintAnchor3;
            this.f32614g = constraintAnchor4;
            this.f32615h = Flow.this.getPaddingLeft();
            this.f32616i = Flow.this.getPaddingTop();
            this.f32617j = Flow.this.getPaddingRight();
            this.f32618k = Flow.this.getPaddingBottom();
            this.f32624q = i2;
        }

        /* renamed from: b */
        public void m58558b(ConstraintWidget constraintWidget) {
            int i = 0;
            if (this.f32608a == 0) {
                int m58578I = Flow.this.m58578I(constraintWidget, this.f32624q);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f32623p++;
                    m58578I = 0;
                }
                int i2 = Flow.this.f32607z0;
                if (constraintWidget.getVisibility() != 8) {
                    i = i2;
                }
                this.f32619l += m58578I + i;
                int m58579H = Flow.this.m58579H(constraintWidget, this.f32624q);
                if (this.f32609b == null || this.f32610c < m58579H) {
                    this.f32609b = constraintWidget;
                    this.f32610c = m58579H;
                    this.f32620m = m58579H;
                }
            } else {
                int m58578I2 = Flow.this.m58578I(constraintWidget, this.f32624q);
                int m58579H2 = Flow.this.m58579H(constraintWidget, this.f32624q);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f32623p++;
                    m58579H2 = 0;
                }
                int i3 = Flow.this.f32583A0;
                if (constraintWidget.getVisibility() != 8) {
                    i = i3;
                }
                this.f32620m += m58579H2 + i;
                if (this.f32609b == null || this.f32610c < m58578I2) {
                    this.f32609b = constraintWidget;
                    this.f32610c = m58578I2;
                    this.f32619l = m58578I2;
                }
            }
            this.f32622o++;
        }

        /* renamed from: c */
        public void m58557c() {
            this.f32610c = 0;
            this.f32609b = null;
            this.f32619l = 0;
            this.f32620m = 0;
            this.f32621n = 0;
            this.f32622o = 0;
            this.f32623p = 0;
        }

        /* renamed from: d */
        public void m58556d(boolean z, int i, boolean z2) {
            ConstraintWidget constraintWidget;
            float f;
            float f2;
            int i2 = this.f32622o;
            for (int i3 = 0; i3 < i2 && this.f32621n + i3 < Flow.this.f32594L0; i3++) {
                ConstraintWidget constraintWidget2 = Flow.this.f32593K0[this.f32621n + i3];
                if (constraintWidget2 != null) {
                    constraintWidget2.resetAnchors();
                }
            }
            if (i2 == 0 || this.f32609b == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.f32621n + i7 >= Flow.this.f32594L0) {
                    break;
                }
                ConstraintWidget constraintWidget3 = Flow.this.f32593K0[this.f32621n + i7];
                if (constraintWidget3 != null && constraintWidget3.getVisibility() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            ConstraintWidget constraintWidget4 = null;
            if (this.f32608a == 0) {
                ConstraintWidget constraintWidget5 = this.f32609b;
                constraintWidget5.setVerticalChainStyle(Flow.this.f32596o0);
                int i8 = this.f32616i;
                if (i > 0) {
                    i8 += Flow.this.f32583A0;
                }
                constraintWidget5.mTop.connect(this.f32612e, i8);
                if (z2) {
                    constraintWidget5.mBottom.connect(this.f32614g, this.f32618k);
                }
                if (i > 0) {
                    this.f32612e.mOwner.mBottom.connect(constraintWidget5.mTop, 0);
                }
                if (Flow.this.f32585C0 == 3 && !constraintWidget5.hasBaseline()) {
                    for (int i9 = 0; i9 < i2; i9++) {
                        int i10 = z ? (i2 - 1) - i9 : i9;
                        if (this.f32621n + i10 >= Flow.this.f32594L0) {
                            break;
                        }
                        constraintWidget = Flow.this.f32593K0[this.f32621n + i10];
                        if (constraintWidget.hasBaseline()) {
                            break;
                        }
                    }
                }
                constraintWidget = constraintWidget5;
                int i11 = 0;
                while (i11 < i2) {
                    int i12 = z ? (i2 - 1) - i11 : i11;
                    if (this.f32621n + i12 >= Flow.this.f32594L0) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = Flow.this.f32593K0[this.f32621n + i12];
                    if (constraintWidget6 == null) {
                        constraintWidget6 = constraintWidget4;
                    } else {
                        if (i11 == 0) {
                            constraintWidget6.connect(constraintWidget6.mLeft, this.f32611d, this.f32615h);
                        }
                        if (i12 == 0) {
                            int i13 = Flow.this.f32595n0;
                            float f3 = Flow.this.f32601t0;
                            if (z) {
                                f3 = 1.0f - f3;
                            }
                            if (this.f32621n != 0 || Flow.this.f32597p0 == -1) {
                                if (z2 && Flow.this.f32599r0 != -1) {
                                    i13 = Flow.this.f32599r0;
                                    if (z) {
                                        f2 = Flow.this.f32605x0;
                                        f = 1.0f - f2;
                                        f3 = f;
                                    } else {
                                        f = Flow.this.f32605x0;
                                        f3 = f;
                                    }
                                }
                            } else {
                                i13 = Flow.this.f32597p0;
                                if (z) {
                                    f2 = Flow.this.f32603v0;
                                    f = 1.0f - f2;
                                    f3 = f;
                                } else {
                                    f = Flow.this.f32603v0;
                                    f3 = f;
                                }
                            }
                            constraintWidget6.setHorizontalChainStyle(i13);
                            constraintWidget6.setHorizontalBiasPercent(f3);
                        }
                        if (i11 == i2 - 1) {
                            constraintWidget6.connect(constraintWidget6.mRight, this.f32613f, this.f32617j);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.mLeft.connect(constraintWidget4.mRight, Flow.this.f32607z0);
                            if (i11 == i4) {
                                constraintWidget6.mLeft.setGoneMargin(this.f32615h);
                            }
                            constraintWidget4.mRight.connect(constraintWidget6.mLeft, 0);
                            if (i11 == i5 + 1) {
                                constraintWidget4.mRight.setGoneMargin(this.f32617j);
                            }
                        }
                        if (constraintWidget6 != constraintWidget5) {
                            if (Flow.this.f32585C0 != 3 || !constraintWidget.hasBaseline() || constraintWidget6 == constraintWidget || !constraintWidget6.hasBaseline()) {
                                int i14 = Flow.this.f32585C0;
                                if (i14 == 0) {
                                    constraintWidget6.mTop.connect(constraintWidget5.mTop, 0);
                                } else if (i14 == 1) {
                                    constraintWidget6.mBottom.connect(constraintWidget5.mBottom, 0);
                                } else if (z3) {
                                    constraintWidget6.mTop.connect(this.f32612e, this.f32616i);
                                    constraintWidget6.mBottom.connect(this.f32614g, this.f32618k);
                                } else {
                                    constraintWidget6.mTop.connect(constraintWidget5.mTop, 0);
                                    constraintWidget6.mBottom.connect(constraintWidget5.mBottom, 0);
                                }
                            } else {
                                constraintWidget6.mBaseline.connect(constraintWidget.mBaseline, 0);
                            }
                            i11++;
                            constraintWidget4 = constraintWidget6;
                        }
                    }
                    i11++;
                    constraintWidget4 = constraintWidget6;
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.f32609b;
            constraintWidget7.setHorizontalChainStyle(Flow.this.f32595n0);
            int i15 = this.f32615h;
            if (i > 0) {
                i15 += Flow.this.f32607z0;
            }
            if (z) {
                constraintWidget7.mRight.connect(this.f32613f, i15);
                if (z2) {
                    constraintWidget7.mLeft.connect(this.f32611d, this.f32617j);
                }
                if (i > 0) {
                    this.f32613f.mOwner.mLeft.connect(constraintWidget7.mRight, 0);
                }
            } else {
                constraintWidget7.mLeft.connect(this.f32611d, i15);
                if (z2) {
                    constraintWidget7.mRight.connect(this.f32613f, this.f32617j);
                }
                if (i > 0) {
                    this.f32611d.mOwner.mRight.connect(constraintWidget7.mLeft, 0);
                }
            }
            for (int i16 = 0; i16 < i2 && this.f32621n + i16 < Flow.this.f32594L0; i16++) {
                ConstraintWidget constraintWidget8 = Flow.this.f32593K0[this.f32621n + i16];
                if (constraintWidget8 != null) {
                    if (i16 == 0) {
                        constraintWidget8.connect(constraintWidget8.mTop, this.f32612e, this.f32616i);
                        int i17 = Flow.this.f32596o0;
                        float f4 = Flow.this.f32602u0;
                        if (this.f32621n != 0 || Flow.this.f32598q0 == -1) {
                            if (z2 && Flow.this.f32600s0 != -1) {
                                i17 = Flow.this.f32600s0;
                                f4 = Flow.this.f32606y0;
                            }
                        } else {
                            i17 = Flow.this.f32598q0;
                            f4 = Flow.this.f32604w0;
                        }
                        constraintWidget8.setVerticalChainStyle(i17);
                        constraintWidget8.setVerticalBiasPercent(f4);
                    }
                    if (i16 == i2 - 1) {
                        constraintWidget8.connect(constraintWidget8.mBottom, this.f32614g, this.f32618k);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.mTop.connect(constraintWidget4.mBottom, Flow.this.f32583A0);
                        if (i16 == i4) {
                            constraintWidget8.mTop.setGoneMargin(this.f32616i);
                        }
                        constraintWidget4.mBottom.connect(constraintWidget8.mTop, 0);
                        if (i16 == i5 + 1) {
                            constraintWidget4.mBottom.setGoneMargin(this.f32618k);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        if (z) {
                            int i18 = Flow.this.f32584B0;
                            if (i18 == 0) {
                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                            } else if (i18 == 1) {
                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                            } else if (i18 == 2) {
                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                            }
                        } else {
                            int i19 = Flow.this.f32584B0;
                            if (i19 == 0) {
                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                            } else if (i19 == 1) {
                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                            } else if (i19 == 2) {
                                if (z3) {
                                    constraintWidget8.mLeft.connect(this.f32611d, this.f32615h);
                                    constraintWidget8.mRight.connect(this.f32613f, this.f32617j);
                                } else {
                                    constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                    constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                                }
                            }
                            constraintWidget4 = constraintWidget8;
                        }
                    }
                    constraintWidget4 = constraintWidget8;
                }
            }
        }

        /* renamed from: e */
        public int m58555e() {
            if (this.f32608a == 1) {
                return this.f32620m - Flow.this.f32583A0;
            }
            return this.f32620m;
        }

        /* renamed from: f */
        public int m58554f() {
            if (this.f32608a == 0) {
                return this.f32619l - Flow.this.f32607z0;
            }
            return this.f32619l;
        }

        /* renamed from: g */
        public void m58553g(int i) {
            int i2 = this.f32623p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.f32622o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.f32621n + i5 < Flow.this.f32594L0; i5++) {
                ConstraintWidget constraintWidget = Flow.this.f32593K0[this.f32621n + i5];
                if (this.f32608a == 0) {
                    if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                        Flow.this.measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i4, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                    }
                } else if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    Flow.this.measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i4);
                }
            }
            m58552h();
        }

        /* renamed from: h */
        public final void m58552h() {
            this.f32619l = 0;
            this.f32620m = 0;
            this.f32609b = null;
            this.f32610c = 0;
            int i = this.f32622o;
            for (int i2 = 0; i2 < i && this.f32621n + i2 < Flow.this.f32594L0; i2++) {
                ConstraintWidget constraintWidget = Flow.this.f32593K0[this.f32621n + i2];
                if (this.f32608a != 0) {
                    int m58578I = Flow.this.m58578I(constraintWidget, this.f32624q);
                    int m58579H = Flow.this.m58579H(constraintWidget, this.f32624q);
                    int i3 = Flow.this.f32583A0;
                    if (constraintWidget.getVisibility() == 8) {
                        i3 = 0;
                    }
                    this.f32620m += m58579H + i3;
                    if (this.f32609b == null || this.f32610c < m58578I) {
                        this.f32609b = constraintWidget;
                        this.f32610c = m58578I;
                        this.f32619l = m58578I;
                    }
                } else {
                    int width = constraintWidget.getWidth();
                    int i4 = Flow.this.f32607z0;
                    if (constraintWidget.getVisibility() == 8) {
                        i4 = 0;
                    }
                    this.f32619l += width + i4;
                    int m58579H2 = Flow.this.m58579H(constraintWidget, this.f32624q);
                    if (this.f32609b == null || this.f32610c < m58579H2) {
                        this.f32609b = constraintWidget;
                        this.f32610c = m58579H2;
                        this.f32620m = m58579H2;
                    }
                }
            }
        }

        /* renamed from: i */
        public void m58551i(int i) {
            this.f32621n = i;
        }

        /* renamed from: j */
        public void m58550j(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.f32608a = i;
            this.f32611d = constraintAnchor;
            this.f32612e = constraintAnchor2;
            this.f32613f = constraintAnchor3;
            this.f32614g = constraintAnchor4;
            this.f32615h = i2;
            this.f32616i = i3;
            this.f32617j = i4;
            this.f32618k = i5;
            this.f32624q = i6;
        }
    }

    /* renamed from: G */
    public final void m58580G(boolean z) {
        ConstraintWidget constraintWidget;
        float f;
        int i;
        if (this.f32592J0 != null && this.f32591I0 != null && this.f32590H0 != null) {
            for (int i2 = 0; i2 < this.f32594L0; i2++) {
                this.f32593K0[i2].resetAnchors();
            }
            int[] iArr = this.f32592J0;
            int i3 = iArr[0];
            int i4 = iArr[1];
            float f2 = this.f32601t0;
            ConstraintWidget constraintWidget2 = null;
            int i5 = 0;
            while (i5 < i3) {
                if (z) {
                    i = (i3 - i5) - 1;
                    f = 1.0f - this.f32601t0;
                } else {
                    f = f2;
                    i = i5;
                }
                ConstraintWidget constraintWidget3 = this.f32591I0[i];
                if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                    if (i5 == 0) {
                        constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                        constraintWidget3.setHorizontalChainStyle(this.f32595n0);
                        constraintWidget3.setHorizontalBiasPercent(f);
                    }
                    if (i5 == i3 - 1) {
                        constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                    }
                    if (i5 > 0 && constraintWidget2 != null) {
                        constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.f32607z0);
                        constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                    }
                    constraintWidget2 = constraintWidget3;
                }
                i5++;
                f2 = f;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                ConstraintWidget constraintWidget4 = this.f32590H0[i6];
                if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                    if (i6 == 0) {
                        constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                        constraintWidget4.setVerticalChainStyle(this.f32596o0);
                        constraintWidget4.setVerticalBiasPercent(this.f32602u0);
                    }
                    if (i6 == i4 - 1) {
                        constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                    }
                    if (i6 > 0 && constraintWidget2 != null) {
                        constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.f32583A0);
                        constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                    }
                    constraintWidget2 = constraintWidget4;
                }
            }
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = (i8 * i3) + i7;
                    if (this.f32588F0 == 1) {
                        i9 = (i7 * i4) + i8;
                    }
                    ConstraintWidget[] constraintWidgetArr = this.f32593K0;
                    if (i9 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i9]) != null && constraintWidget.getVisibility() != 8) {
                        ConstraintWidget constraintWidget5 = this.f32591I0[i7];
                        ConstraintWidget constraintWidget6 = this.f32590H0[i8];
                        if (constraintWidget != constraintWidget5) {
                            constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                            constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                        }
                        if (constraintWidget != constraintWidget6) {
                            constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                            constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: H */
    public final int m58579H(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.mMatchConstraintPercentHeight * i);
                if (i3 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.getHeight();
            } else {
                if (i2 == 3) {
                    return (int) ((constraintWidget.getWidth() * constraintWidget.mDimensionRatio) + 0.5f);
                }
            }
        }
        return constraintWidget.getHeight();
    }

    /* renamed from: I */
    public final int m58578I(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.mMatchConstraintPercentWidth * i);
                if (i3 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.getWidth();
            } else {
                if (i2 == 3) {
                    return (int) ((constraintWidget.getHeight() * constraintWidget.mDimensionRatio) + 0.5f);
                }
            }
        }
        return constraintWidget.getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please submit an issue!!! */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m58577J(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.m58577J(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    /* renamed from: K */
    public final void m58576K(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        ConstraintAnchor constraintAnchor;
        int paddingRight;
        ConstraintAnchor constraintAnchor2;
        int paddingBottom;
        boolean z3;
        int i7;
        if (i == 0) {
            return;
        }
        this.f32589G0.clear();
        C3679a c3679a = new C3679a(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
        this.f32589G0.add(c3679a);
        if (i2 == 0) {
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < i) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i9];
                int m58578I = m58578I(constraintWidget, i3);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i10 = i4;
                if ((i8 == i3 || this.f32607z0 + i8 + m58578I > i3) && c3679a.f32609b != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3 && i9 > 0 && (i7 = this.f32587E0) > 0 && i9 % i7 == 0) {
                    z3 = true;
                }
                if (z3) {
                    c3679a = new C3679a(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                    c3679a.m58551i(i9);
                    this.f32589G0.add(c3679a);
                } else if (i9 > 0) {
                    i8 += this.f32607z0 + m58578I;
                    c3679a.m58558b(constraintWidget);
                    i9++;
                    i4 = i10;
                }
                i8 = m58578I;
                c3679a.m58558b(constraintWidget);
                i9++;
                i4 = i10;
            }
        } else {
            i4 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i12];
                int m58579H = m58579H(constraintWidget2, i3);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i13 = i4;
                if ((i11 == i3 || this.f32583A0 + i11 + m58579H > i3) && c3679a.f32609b != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && i12 > 0 && (i5 = this.f32587E0) > 0 && i12 % i5 == 0) {
                    z = true;
                }
                if (z) {
                    c3679a = new C3679a(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                    c3679a.m58551i(i12);
                    this.f32589G0.add(c3679a);
                } else if (i12 > 0) {
                    i11 += this.f32583A0 + m58579H;
                    c3679a.m58558b(constraintWidget2);
                    i12++;
                    i4 = i13;
                }
                i11 = m58579H;
                c3679a.m58558b(constraintWidget2);
                i12++;
                i4 = i13;
            }
        }
        int size = this.f32589G0.size();
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        ConstraintAnchor constraintAnchor5 = this.mRight;
        ConstraintAnchor constraintAnchor6 = this.mBottom;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (horizontalDimensionBehaviour != dimensionBehaviour && getVerticalDimensionBehaviour() != dimensionBehaviour) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 > 0 && z2) {
            for (int i14 = 0; i14 < size; i14++) {
                C3679a c3679a2 = (C3679a) this.f32589G0.get(i14);
                if (i2 == 0) {
                    c3679a2.m58553g(i3 - c3679a2.m58554f());
                } else {
                    c3679a2.m58553g(i3 - c3679a2.m58555e());
                }
            }
        }
        int i15 = paddingTop;
        int i16 = paddingRight2;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i21 = paddingBottom2;
        while (i19 < size) {
            C3679a c3679a3 = (C3679a) this.f32589G0.get(i19);
            if (i2 == 0) {
                if (i19 < size - 1) {
                    constraintAnchor2 = ((C3679a) this.f32589G0.get(i19 + 1)).f32609b.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor9 = c3679a3.f32609b.mBottom;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i22 = i17;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i23 = i18;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i6 = i19;
                c3679a3.m58550j(i2, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i20, i15, i16, paddingBottom, i3);
                int max = Math.max(i23, c3679a3.m58554f());
                i17 = i22 + c3679a3.m58555e();
                if (i6 > 0) {
                    i17 += this.f32583A0;
                }
                constraintAnchor8 = constraintAnchor11;
                i18 = max;
                constraintAnchor7 = constraintAnchor9;
                i15 = 0;
                constraintAnchor = constraintAnchor14;
                int i24 = paddingBottom;
                constraintAnchor6 = constraintAnchor2;
                i21 = i24;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i25 = i17;
                int i26 = i18;
                i6 = i19;
                if (i6 < size - 1) {
                    constraintAnchor = ((C3679a) this.f32589G0.get(i6 + 1)).f32609b.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                ConstraintAnchor constraintAnchor16 = c3679a3.f32609b.mRight;
                c3679a3.m58550j(i2, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i20, i15, paddingRight, i21, i3);
                i18 = i26 + c3679a3.m58554f();
                int max2 = Math.max(i25, c3679a3.m58555e());
                if (i6 > 0) {
                    i18 += this.f32607z0;
                }
                i17 = max2;
                i16 = paddingRight;
                constraintAnchor8 = constraintAnchor16;
                i20 = 0;
            }
            i19 = i6 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i18;
        iArr[1] = i17;
    }

    /* renamed from: L */
    public final void m58575L(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        ConstraintAnchor constraintAnchor;
        int paddingRight;
        ConstraintAnchor constraintAnchor2;
        int paddingBottom;
        boolean z3;
        int i7;
        if (i == 0) {
            return;
        }
        this.f32589G0.clear();
        C3679a c3679a = new C3679a(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
        this.f32589G0.add(c3679a);
        if (i2 == 0) {
            int i8 = 0;
            i4 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i10 < i) {
                int i11 = i8 + 1;
                ConstraintWidget constraintWidget = constraintWidgetArr[i10];
                int m58578I = m58578I(constraintWidget, i3);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i12 = i4;
                if ((i9 == i3 || this.f32607z0 + i9 + m58578I > i3) && c3679a.f32609b != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3 && i10 > 0 && (i7 = this.f32587E0) > 0 && i11 > i7) {
                    z3 = true;
                }
                if (z3) {
                    c3679a = new C3679a(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                    c3679a.m58551i(i10);
                    this.f32589G0.add(c3679a);
                    i8 = i11;
                    i9 = m58578I;
                } else {
                    if (i10 > 0) {
                        i9 += this.f32607z0 + m58578I;
                    } else {
                        i9 = m58578I;
                    }
                    i8 = 0;
                }
                c3679a.m58558b(constraintWidget);
                i10++;
                i4 = i12;
            }
        } else {
            int i13 = 0;
            i4 = 0;
            int i14 = 0;
            while (i14 < i) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i14];
                int m58579H = m58579H(constraintWidget2, i3);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i15 = i4;
                if ((i13 == i3 || this.f32583A0 + i13 + m58579H > i3) && c3679a.f32609b != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && i14 > 0 && (i5 = this.f32587E0) > 0 && i5 < 0) {
                    z = true;
                }
                if (z) {
                    c3679a = new C3679a(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                    c3679a.m58551i(i14);
                    this.f32589G0.add(c3679a);
                } else if (i14 > 0) {
                    i13 += this.f32583A0 + m58579H;
                    c3679a.m58558b(constraintWidget2);
                    i14++;
                    i4 = i15;
                }
                i13 = m58579H;
                c3679a.m58558b(constraintWidget2);
                i14++;
                i4 = i15;
            }
        }
        int size = this.f32589G0.size();
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        ConstraintAnchor constraintAnchor5 = this.mRight;
        ConstraintAnchor constraintAnchor6 = this.mBottom;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (horizontalDimensionBehaviour != dimensionBehaviour && getVerticalDimensionBehaviour() != dimensionBehaviour) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 > 0 && z2) {
            for (int i16 = 0; i16 < size; i16++) {
                C3679a c3679a2 = (C3679a) this.f32589G0.get(i16);
                if (i2 == 0) {
                    c3679a2.m58553g(i3 - c3679a2.m58554f());
                } else {
                    c3679a2.m58553g(i3 - c3679a2.m58555e());
                }
            }
        }
        int i17 = paddingTop;
        int i18 = paddingRight2;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i23 = paddingBottom2;
        while (i21 < size) {
            C3679a c3679a3 = (C3679a) this.f32589G0.get(i21);
            if (i2 == 0) {
                if (i21 < size - 1) {
                    constraintAnchor2 = ((C3679a) this.f32589G0.get(i21 + 1)).f32609b.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor9 = c3679a3.f32609b.mBottom;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i24 = i19;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i25 = i20;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i6 = i21;
                c3679a3.m58550j(i2, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i22, i17, i18, paddingBottom, i3);
                int max = Math.max(i25, c3679a3.m58554f());
                i19 = i24 + c3679a3.m58555e();
                if (i6 > 0) {
                    i19 += this.f32583A0;
                }
                constraintAnchor8 = constraintAnchor11;
                i20 = max;
                constraintAnchor7 = constraintAnchor9;
                i17 = 0;
                constraintAnchor = constraintAnchor14;
                int i26 = paddingBottom;
                constraintAnchor6 = constraintAnchor2;
                i23 = i26;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i27 = i19;
                int i28 = i20;
                i6 = i21;
                if (i6 < size - 1) {
                    constraintAnchor = ((C3679a) this.f32589G0.get(i6 + 1)).f32609b.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                ConstraintAnchor constraintAnchor16 = c3679a3.f32609b.mRight;
                c3679a3.m58550j(i2, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i22, i17, paddingRight, i23, i3);
                i20 = i28 + c3679a3.m58554f();
                int max2 = Math.max(i27, c3679a3.m58555e());
                if (i6 > 0) {
                    i20 += this.f32607z0;
                }
                i19 = max2;
                i18 = paddingRight;
                constraintAnchor8 = constraintAnchor16;
                i22 = 0;
            }
            i21 = i6 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i20;
        iArr[1] = i19;
    }

    /* renamed from: M */
    public final void m58574M(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        C3679a c3679a;
        if (i == 0) {
            return;
        }
        if (this.f32589G0.size() == 0) {
            c3679a = new C3679a(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
            this.f32589G0.add(c3679a);
        } else {
            C3679a c3679a2 = (C3679a) this.f32589G0.get(0);
            c3679a2.m58557c();
            c3679a = c3679a2;
            c3679a.m58550j(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i3);
        }
        for (int i4 = 0; i4 < i; i4++) {
            c3679a.m58558b(constraintWidgetArr[i4]);
        }
        iArr[0] = c3679a.m58554f();
        iArr[1] = c3679a.m58555e();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        super.addToSolver(linearSystem, z);
        if (getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i = this.f32586D0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        int size = this.f32589G0.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            C3679a c3679a = (C3679a) this.f32589G0.get(i2);
                            if (i2 == size - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            c3679a.m58556d(z2, i2, z4);
                        }
                    }
                } else {
                    m58580G(z2);
                }
            } else {
                int size2 = this.f32589G0.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C3679a c3679a2 = (C3679a) this.f32589G0.get(i3);
                    if (i3 == size2 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c3679a2.m58556d(z2, i3, z3);
                }
            }
        } else if (this.f32589G0.size() > 0) {
            ((C3679a) this.f32589G0.get(0)).m58556d(z2, 0, true);
        }
        needsCallbackFromSolver(false);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Flow flow = (Flow) constraintWidget;
        this.f32595n0 = flow.f32595n0;
        this.f32596o0 = flow.f32596o0;
        this.f32597p0 = flow.f32597p0;
        this.f32598q0 = flow.f32598q0;
        this.f32599r0 = flow.f32599r0;
        this.f32600s0 = flow.f32600s0;
        this.f32601t0 = flow.f32601t0;
        this.f32602u0 = flow.f32602u0;
        this.f32603v0 = flow.f32603v0;
        this.f32604w0 = flow.f32604w0;
        this.f32605x0 = flow.f32605x0;
        this.f32606y0 = flow.f32606y0;
        this.f32607z0 = flow.f32607z0;
        this.f32583A0 = flow.f32583A0;
        this.f32584B0 = flow.f32584B0;
        this.f32585C0 = flow.f32585C0;
        this.f32586D0 = flow.f32586D0;
        this.f32587E0 = flow.f32587E0;
        this.f32588F0 = flow.f32588F0;
    }

    public float getMaxElementsWrap() {
        return this.f32587E0;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0115  */
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measure(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.measure(int, int, int, int):void");
    }

    public void setFirstHorizontalBias(float f) {
        this.f32603v0 = f;
    }

    public void setFirstHorizontalStyle(int i) {
        this.f32597p0 = i;
    }

    public void setFirstVerticalBias(float f) {
        this.f32604w0 = f;
    }

    public void setFirstVerticalStyle(int i) {
        this.f32598q0 = i;
    }

    public void setHorizontalAlign(int i) {
        this.f32584B0 = i;
    }

    public void setHorizontalBias(float f) {
        this.f32601t0 = f;
    }

    public void setHorizontalGap(int i) {
        this.f32607z0 = i;
    }

    public void setHorizontalStyle(int i) {
        this.f32595n0 = i;
    }

    public void setLastHorizontalBias(float f) {
        this.f32605x0 = f;
    }

    public void setLastHorizontalStyle(int i) {
        this.f32599r0 = i;
    }

    public void setLastVerticalBias(float f) {
        this.f32606y0 = f;
    }

    public void setLastVerticalStyle(int i) {
        this.f32600s0 = i;
    }

    public void setMaxElementsWrap(int i) {
        this.f32587E0 = i;
    }

    public void setOrientation(int i) {
        this.f32588F0 = i;
    }

    public void setVerticalAlign(int i) {
        this.f32585C0 = i;
    }

    public void setVerticalBias(float f) {
        this.f32602u0 = f;
    }

    public void setVerticalGap(int i) {
        this.f32583A0 = i;
    }

    public void setVerticalStyle(int i) {
        this.f32596o0 = i;
    }

    public void setWrapMode(int i) {
        this.f32586D0 = i;
    }
}