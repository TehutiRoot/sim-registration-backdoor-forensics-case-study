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
    public ConstraintWidget[] f32505K0;

    /* renamed from: n0 */
    public int f32507n0 = -1;

    /* renamed from: o0 */
    public int f32508o0 = -1;

    /* renamed from: p0 */
    public int f32509p0 = -1;

    /* renamed from: q0 */
    public int f32510q0 = -1;

    /* renamed from: r0 */
    public int f32511r0 = -1;

    /* renamed from: s0 */
    public int f32512s0 = -1;

    /* renamed from: t0 */
    public float f32513t0 = 0.5f;

    /* renamed from: u0 */
    public float f32514u0 = 0.5f;

    /* renamed from: v0 */
    public float f32515v0 = 0.5f;

    /* renamed from: w0 */
    public float f32516w0 = 0.5f;

    /* renamed from: x0 */
    public float f32517x0 = 0.5f;

    /* renamed from: y0 */
    public float f32518y0 = 0.5f;

    /* renamed from: z0 */
    public int f32519z0 = 0;

    /* renamed from: A0 */
    public int f32495A0 = 0;

    /* renamed from: B0 */
    public int f32496B0 = 2;

    /* renamed from: C0 */
    public int f32497C0 = 2;

    /* renamed from: D0 */
    public int f32498D0 = 0;

    /* renamed from: E0 */
    public int f32499E0 = -1;

    /* renamed from: F0 */
    public int f32500F0 = 0;

    /* renamed from: G0 */
    public ArrayList f32501G0 = new ArrayList();

    /* renamed from: H0 */
    public ConstraintWidget[] f32502H0 = null;

    /* renamed from: I0 */
    public ConstraintWidget[] f32503I0 = null;

    /* renamed from: J0 */
    public int[] f32504J0 = null;

    /* renamed from: L0 */
    public int f32506L0 = 0;

    /* renamed from: androidx.constraintlayout.core.widgets.Flow$a */
    /* loaded from: classes2.dex */
    public class C3697a {

        /* renamed from: a */
        public int f32520a;

        /* renamed from: d */
        public ConstraintAnchor f32523d;

        /* renamed from: e */
        public ConstraintAnchor f32524e;

        /* renamed from: f */
        public ConstraintAnchor f32525f;

        /* renamed from: g */
        public ConstraintAnchor f32526g;

        /* renamed from: h */
        public int f32527h;

        /* renamed from: i */
        public int f32528i;

        /* renamed from: j */
        public int f32529j;

        /* renamed from: k */
        public int f32530k;

        /* renamed from: q */
        public int f32536q;

        /* renamed from: b */
        public ConstraintWidget f32521b = null;

        /* renamed from: c */
        public int f32522c = 0;

        /* renamed from: l */
        public int f32531l = 0;

        /* renamed from: m */
        public int f32532m = 0;

        /* renamed from: n */
        public int f32533n = 0;

        /* renamed from: o */
        public int f32534o = 0;

        /* renamed from: p */
        public int f32535p = 0;

        public C3697a(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.f32527h = 0;
            this.f32528i = 0;
            this.f32529j = 0;
            this.f32530k = 0;
            this.f32536q = 0;
            this.f32520a = i;
            this.f32523d = constraintAnchor;
            this.f32524e = constraintAnchor2;
            this.f32525f = constraintAnchor3;
            this.f32526g = constraintAnchor4;
            this.f32527h = Flow.this.getPaddingLeft();
            this.f32528i = Flow.this.getPaddingTop();
            this.f32529j = Flow.this.getPaddingRight();
            this.f32530k = Flow.this.getPaddingBottom();
            this.f32536q = i2;
        }

        /* renamed from: b */
        public void m58608b(ConstraintWidget constraintWidget) {
            int i = 0;
            if (this.f32520a == 0) {
                int m58628I = Flow.this.m58628I(constraintWidget, this.f32536q);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f32535p++;
                    m58628I = 0;
                }
                int i2 = Flow.this.f32519z0;
                if (constraintWidget.getVisibility() != 8) {
                    i = i2;
                }
                this.f32531l += m58628I + i;
                int m58629H = Flow.this.m58629H(constraintWidget, this.f32536q);
                if (this.f32521b == null || this.f32522c < m58629H) {
                    this.f32521b = constraintWidget;
                    this.f32522c = m58629H;
                    this.f32532m = m58629H;
                }
            } else {
                int m58628I2 = Flow.this.m58628I(constraintWidget, this.f32536q);
                int m58629H2 = Flow.this.m58629H(constraintWidget, this.f32536q);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f32535p++;
                    m58629H2 = 0;
                }
                int i3 = Flow.this.f32495A0;
                if (constraintWidget.getVisibility() != 8) {
                    i = i3;
                }
                this.f32532m += m58629H2 + i;
                if (this.f32521b == null || this.f32522c < m58628I2) {
                    this.f32521b = constraintWidget;
                    this.f32522c = m58628I2;
                    this.f32531l = m58628I2;
                }
            }
            this.f32534o++;
        }

        /* renamed from: c */
        public void m58607c() {
            this.f32522c = 0;
            this.f32521b = null;
            this.f32531l = 0;
            this.f32532m = 0;
            this.f32533n = 0;
            this.f32534o = 0;
            this.f32535p = 0;
        }

        /* renamed from: d */
        public void m58606d(boolean z, int i, boolean z2) {
            ConstraintWidget constraintWidget;
            float f;
            float f2;
            int i2 = this.f32534o;
            for (int i3 = 0; i3 < i2 && this.f32533n + i3 < Flow.this.f32506L0; i3++) {
                ConstraintWidget constraintWidget2 = Flow.this.f32505K0[this.f32533n + i3];
                if (constraintWidget2 != null) {
                    constraintWidget2.resetAnchors();
                }
            }
            if (i2 == 0 || this.f32521b == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.f32533n + i7 >= Flow.this.f32506L0) {
                    break;
                }
                ConstraintWidget constraintWidget3 = Flow.this.f32505K0[this.f32533n + i7];
                if (constraintWidget3 != null && constraintWidget3.getVisibility() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            ConstraintWidget constraintWidget4 = null;
            if (this.f32520a == 0) {
                ConstraintWidget constraintWidget5 = this.f32521b;
                constraintWidget5.setVerticalChainStyle(Flow.this.f32508o0);
                int i8 = this.f32528i;
                if (i > 0) {
                    i8 += Flow.this.f32495A0;
                }
                constraintWidget5.mTop.connect(this.f32524e, i8);
                if (z2) {
                    constraintWidget5.mBottom.connect(this.f32526g, this.f32530k);
                }
                if (i > 0) {
                    this.f32524e.mOwner.mBottom.connect(constraintWidget5.mTop, 0);
                }
                if (Flow.this.f32497C0 == 3 && !constraintWidget5.hasBaseline()) {
                    for (int i9 = 0; i9 < i2; i9++) {
                        int i10 = z ? (i2 - 1) - i9 : i9;
                        if (this.f32533n + i10 >= Flow.this.f32506L0) {
                            break;
                        }
                        constraintWidget = Flow.this.f32505K0[this.f32533n + i10];
                        if (constraintWidget.hasBaseline()) {
                            break;
                        }
                    }
                }
                constraintWidget = constraintWidget5;
                int i11 = 0;
                while (i11 < i2) {
                    int i12 = z ? (i2 - 1) - i11 : i11;
                    if (this.f32533n + i12 >= Flow.this.f32506L0) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = Flow.this.f32505K0[this.f32533n + i12];
                    if (constraintWidget6 == null) {
                        constraintWidget6 = constraintWidget4;
                    } else {
                        if (i11 == 0) {
                            constraintWidget6.connect(constraintWidget6.mLeft, this.f32523d, this.f32527h);
                        }
                        if (i12 == 0) {
                            int i13 = Flow.this.f32507n0;
                            float f3 = Flow.this.f32513t0;
                            if (z) {
                                f3 = 1.0f - f3;
                            }
                            if (this.f32533n != 0 || Flow.this.f32509p0 == -1) {
                                if (z2 && Flow.this.f32511r0 != -1) {
                                    i13 = Flow.this.f32511r0;
                                    if (z) {
                                        f2 = Flow.this.f32517x0;
                                        f = 1.0f - f2;
                                        f3 = f;
                                    } else {
                                        f = Flow.this.f32517x0;
                                        f3 = f;
                                    }
                                }
                            } else {
                                i13 = Flow.this.f32509p0;
                                if (z) {
                                    f2 = Flow.this.f32515v0;
                                    f = 1.0f - f2;
                                    f3 = f;
                                } else {
                                    f = Flow.this.f32515v0;
                                    f3 = f;
                                }
                            }
                            constraintWidget6.setHorizontalChainStyle(i13);
                            constraintWidget6.setHorizontalBiasPercent(f3);
                        }
                        if (i11 == i2 - 1) {
                            constraintWidget6.connect(constraintWidget6.mRight, this.f32525f, this.f32529j);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.mLeft.connect(constraintWidget4.mRight, Flow.this.f32519z0);
                            if (i11 == i4) {
                                constraintWidget6.mLeft.setGoneMargin(this.f32527h);
                            }
                            constraintWidget4.mRight.connect(constraintWidget6.mLeft, 0);
                            if (i11 == i5 + 1) {
                                constraintWidget4.mRight.setGoneMargin(this.f32529j);
                            }
                        }
                        if (constraintWidget6 != constraintWidget5) {
                            if (Flow.this.f32497C0 != 3 || !constraintWidget.hasBaseline() || constraintWidget6 == constraintWidget || !constraintWidget6.hasBaseline()) {
                                int i14 = Flow.this.f32497C0;
                                if (i14 == 0) {
                                    constraintWidget6.mTop.connect(constraintWidget5.mTop, 0);
                                } else if (i14 == 1) {
                                    constraintWidget6.mBottom.connect(constraintWidget5.mBottom, 0);
                                } else if (z3) {
                                    constraintWidget6.mTop.connect(this.f32524e, this.f32528i);
                                    constraintWidget6.mBottom.connect(this.f32526g, this.f32530k);
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
            ConstraintWidget constraintWidget7 = this.f32521b;
            constraintWidget7.setHorizontalChainStyle(Flow.this.f32507n0);
            int i15 = this.f32527h;
            if (i > 0) {
                i15 += Flow.this.f32519z0;
            }
            if (z) {
                constraintWidget7.mRight.connect(this.f32525f, i15);
                if (z2) {
                    constraintWidget7.mLeft.connect(this.f32523d, this.f32529j);
                }
                if (i > 0) {
                    this.f32525f.mOwner.mLeft.connect(constraintWidget7.mRight, 0);
                }
            } else {
                constraintWidget7.mLeft.connect(this.f32523d, i15);
                if (z2) {
                    constraintWidget7.mRight.connect(this.f32525f, this.f32529j);
                }
                if (i > 0) {
                    this.f32523d.mOwner.mRight.connect(constraintWidget7.mLeft, 0);
                }
            }
            for (int i16 = 0; i16 < i2 && this.f32533n + i16 < Flow.this.f32506L0; i16++) {
                ConstraintWidget constraintWidget8 = Flow.this.f32505K0[this.f32533n + i16];
                if (constraintWidget8 != null) {
                    if (i16 == 0) {
                        constraintWidget8.connect(constraintWidget8.mTop, this.f32524e, this.f32528i);
                        int i17 = Flow.this.f32508o0;
                        float f4 = Flow.this.f32514u0;
                        if (this.f32533n != 0 || Flow.this.f32510q0 == -1) {
                            if (z2 && Flow.this.f32512s0 != -1) {
                                i17 = Flow.this.f32512s0;
                                f4 = Flow.this.f32518y0;
                            }
                        } else {
                            i17 = Flow.this.f32510q0;
                            f4 = Flow.this.f32516w0;
                        }
                        constraintWidget8.setVerticalChainStyle(i17);
                        constraintWidget8.setVerticalBiasPercent(f4);
                    }
                    if (i16 == i2 - 1) {
                        constraintWidget8.connect(constraintWidget8.mBottom, this.f32526g, this.f32530k);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.mTop.connect(constraintWidget4.mBottom, Flow.this.f32495A0);
                        if (i16 == i4) {
                            constraintWidget8.mTop.setGoneMargin(this.f32528i);
                        }
                        constraintWidget4.mBottom.connect(constraintWidget8.mTop, 0);
                        if (i16 == i5 + 1) {
                            constraintWidget4.mBottom.setGoneMargin(this.f32530k);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        if (z) {
                            int i18 = Flow.this.f32496B0;
                            if (i18 == 0) {
                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                            } else if (i18 == 1) {
                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                            } else if (i18 == 2) {
                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                            }
                        } else {
                            int i19 = Flow.this.f32496B0;
                            if (i19 == 0) {
                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                            } else if (i19 == 1) {
                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                            } else if (i19 == 2) {
                                if (z3) {
                                    constraintWidget8.mLeft.connect(this.f32523d, this.f32527h);
                                    constraintWidget8.mRight.connect(this.f32525f, this.f32529j);
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
        public int m58605e() {
            if (this.f32520a == 1) {
                return this.f32532m - Flow.this.f32495A0;
            }
            return this.f32532m;
        }

        /* renamed from: f */
        public int m58604f() {
            if (this.f32520a == 0) {
                return this.f32531l - Flow.this.f32519z0;
            }
            return this.f32531l;
        }

        /* renamed from: g */
        public void m58603g(int i) {
            int i2 = this.f32535p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.f32534o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.f32533n + i5 < Flow.this.f32506L0; i5++) {
                ConstraintWidget constraintWidget = Flow.this.f32505K0[this.f32533n + i5];
                if (this.f32520a == 0) {
                    if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                        Flow.this.measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i4, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                    }
                } else if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    Flow.this.measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i4);
                }
            }
            m58602h();
        }

        /* renamed from: h */
        public final void m58602h() {
            this.f32531l = 0;
            this.f32532m = 0;
            this.f32521b = null;
            this.f32522c = 0;
            int i = this.f32534o;
            for (int i2 = 0; i2 < i && this.f32533n + i2 < Flow.this.f32506L0; i2++) {
                ConstraintWidget constraintWidget = Flow.this.f32505K0[this.f32533n + i2];
                if (this.f32520a != 0) {
                    int m58628I = Flow.this.m58628I(constraintWidget, this.f32536q);
                    int m58629H = Flow.this.m58629H(constraintWidget, this.f32536q);
                    int i3 = Flow.this.f32495A0;
                    if (constraintWidget.getVisibility() == 8) {
                        i3 = 0;
                    }
                    this.f32532m += m58629H + i3;
                    if (this.f32521b == null || this.f32522c < m58628I) {
                        this.f32521b = constraintWidget;
                        this.f32522c = m58628I;
                        this.f32531l = m58628I;
                    }
                } else {
                    int width = constraintWidget.getWidth();
                    int i4 = Flow.this.f32519z0;
                    if (constraintWidget.getVisibility() == 8) {
                        i4 = 0;
                    }
                    this.f32531l += width + i4;
                    int m58629H2 = Flow.this.m58629H(constraintWidget, this.f32536q);
                    if (this.f32521b == null || this.f32522c < m58629H2) {
                        this.f32521b = constraintWidget;
                        this.f32522c = m58629H2;
                        this.f32532m = m58629H2;
                    }
                }
            }
        }

        /* renamed from: i */
        public void m58601i(int i) {
            this.f32533n = i;
        }

        /* renamed from: j */
        public void m58600j(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.f32520a = i;
            this.f32523d = constraintAnchor;
            this.f32524e = constraintAnchor2;
            this.f32525f = constraintAnchor3;
            this.f32526g = constraintAnchor4;
            this.f32527h = i2;
            this.f32528i = i3;
            this.f32529j = i4;
            this.f32530k = i5;
            this.f32536q = i6;
        }
    }

    /* renamed from: G */
    public final void m58630G(boolean z) {
        ConstraintWidget constraintWidget;
        float f;
        int i;
        if (this.f32504J0 != null && this.f32503I0 != null && this.f32502H0 != null) {
            for (int i2 = 0; i2 < this.f32506L0; i2++) {
                this.f32505K0[i2].resetAnchors();
            }
            int[] iArr = this.f32504J0;
            int i3 = iArr[0];
            int i4 = iArr[1];
            float f2 = this.f32513t0;
            ConstraintWidget constraintWidget2 = null;
            int i5 = 0;
            while (i5 < i3) {
                if (z) {
                    i = (i3 - i5) - 1;
                    f = 1.0f - this.f32513t0;
                } else {
                    f = f2;
                    i = i5;
                }
                ConstraintWidget constraintWidget3 = this.f32503I0[i];
                if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                    if (i5 == 0) {
                        constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                        constraintWidget3.setHorizontalChainStyle(this.f32507n0);
                        constraintWidget3.setHorizontalBiasPercent(f);
                    }
                    if (i5 == i3 - 1) {
                        constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                    }
                    if (i5 > 0 && constraintWidget2 != null) {
                        constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.f32519z0);
                        constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                    }
                    constraintWidget2 = constraintWidget3;
                }
                i5++;
                f2 = f;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                ConstraintWidget constraintWidget4 = this.f32502H0[i6];
                if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                    if (i6 == 0) {
                        constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                        constraintWidget4.setVerticalChainStyle(this.f32508o0);
                        constraintWidget4.setVerticalBiasPercent(this.f32514u0);
                    }
                    if (i6 == i4 - 1) {
                        constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                    }
                    if (i6 > 0 && constraintWidget2 != null) {
                        constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.f32495A0);
                        constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                    }
                    constraintWidget2 = constraintWidget4;
                }
            }
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = (i8 * i3) + i7;
                    if (this.f32500F0 == 1) {
                        i9 = (i7 * i4) + i8;
                    }
                    ConstraintWidget[] constraintWidgetArr = this.f32505K0;
                    if (i9 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i9]) != null && constraintWidget.getVisibility() != 8) {
                        ConstraintWidget constraintWidget5 = this.f32503I0[i7];
                        ConstraintWidget constraintWidget6 = this.f32502H0[i8];
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
    public final int m58629H(ConstraintWidget constraintWidget, int i) {
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
    public final int m58628I(ConstraintWidget constraintWidget, int i) {
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
    public final void m58627J(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.m58627J(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    /* renamed from: K */
    public final void m58626K(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
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
        this.f32501G0.clear();
        C3697a c3697a = new C3697a(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
        this.f32501G0.add(c3697a);
        if (i2 == 0) {
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < i) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i9];
                int m58628I = m58628I(constraintWidget, i3);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i10 = i4;
                if ((i8 == i3 || this.f32519z0 + i8 + m58628I > i3) && c3697a.f32521b != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3 && i9 > 0 && (i7 = this.f32499E0) > 0 && i9 % i7 == 0) {
                    z3 = true;
                }
                if (z3) {
                    c3697a = new C3697a(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                    c3697a.m58601i(i9);
                    this.f32501G0.add(c3697a);
                } else if (i9 > 0) {
                    i8 += this.f32519z0 + m58628I;
                    c3697a.m58608b(constraintWidget);
                    i9++;
                    i4 = i10;
                }
                i8 = m58628I;
                c3697a.m58608b(constraintWidget);
                i9++;
                i4 = i10;
            }
        } else {
            i4 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i12];
                int m58629H = m58629H(constraintWidget2, i3);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i13 = i4;
                if ((i11 == i3 || this.f32495A0 + i11 + m58629H > i3) && c3697a.f32521b != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && i12 > 0 && (i5 = this.f32499E0) > 0 && i12 % i5 == 0) {
                    z = true;
                }
                if (z) {
                    c3697a = new C3697a(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                    c3697a.m58601i(i12);
                    this.f32501G0.add(c3697a);
                } else if (i12 > 0) {
                    i11 += this.f32495A0 + m58629H;
                    c3697a.m58608b(constraintWidget2);
                    i12++;
                    i4 = i13;
                }
                i11 = m58629H;
                c3697a.m58608b(constraintWidget2);
                i12++;
                i4 = i13;
            }
        }
        int size = this.f32501G0.size();
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
                C3697a c3697a2 = (C3697a) this.f32501G0.get(i14);
                if (i2 == 0) {
                    c3697a2.m58603g(i3 - c3697a2.m58604f());
                } else {
                    c3697a2.m58603g(i3 - c3697a2.m58605e());
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
            C3697a c3697a3 = (C3697a) this.f32501G0.get(i19);
            if (i2 == 0) {
                if (i19 < size - 1) {
                    constraintAnchor2 = ((C3697a) this.f32501G0.get(i19 + 1)).f32521b.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor9 = c3697a3.f32521b.mBottom;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i22 = i17;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i23 = i18;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i6 = i19;
                c3697a3.m58600j(i2, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i20, i15, i16, paddingBottom, i3);
                int max = Math.max(i23, c3697a3.m58604f());
                i17 = i22 + c3697a3.m58605e();
                if (i6 > 0) {
                    i17 += this.f32495A0;
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
                    constraintAnchor = ((C3697a) this.f32501G0.get(i6 + 1)).f32521b.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                ConstraintAnchor constraintAnchor16 = c3697a3.f32521b.mRight;
                c3697a3.m58600j(i2, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i20, i15, paddingRight, i21, i3);
                i18 = i26 + c3697a3.m58604f();
                int max2 = Math.max(i25, c3697a3.m58605e());
                if (i6 > 0) {
                    i18 += this.f32519z0;
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
    public final void m58625L(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
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
        this.f32501G0.clear();
        C3697a c3697a = new C3697a(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
        this.f32501G0.add(c3697a);
        if (i2 == 0) {
            int i8 = 0;
            i4 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i10 < i) {
                int i11 = i8 + 1;
                ConstraintWidget constraintWidget = constraintWidgetArr[i10];
                int m58628I = m58628I(constraintWidget, i3);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i12 = i4;
                if ((i9 == i3 || this.f32519z0 + i9 + m58628I > i3) && c3697a.f32521b != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3 && i10 > 0 && (i7 = this.f32499E0) > 0 && i11 > i7) {
                    z3 = true;
                }
                if (z3) {
                    c3697a = new C3697a(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                    c3697a.m58601i(i10);
                    this.f32501G0.add(c3697a);
                    i8 = i11;
                    i9 = m58628I;
                } else {
                    if (i10 > 0) {
                        i9 += this.f32519z0 + m58628I;
                    } else {
                        i9 = m58628I;
                    }
                    i8 = 0;
                }
                c3697a.m58608b(constraintWidget);
                i10++;
                i4 = i12;
            }
        } else {
            int i13 = 0;
            i4 = 0;
            int i14 = 0;
            while (i14 < i) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i14];
                int m58629H = m58629H(constraintWidget2, i3);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i15 = i4;
                if ((i13 == i3 || this.f32495A0 + i13 + m58629H > i3) && c3697a.f32521b != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && i14 > 0 && (i5 = this.f32499E0) > 0 && i5 < 0) {
                    z = true;
                }
                if (z) {
                    c3697a = new C3697a(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                    c3697a.m58601i(i14);
                    this.f32501G0.add(c3697a);
                } else if (i14 > 0) {
                    i13 += this.f32495A0 + m58629H;
                    c3697a.m58608b(constraintWidget2);
                    i14++;
                    i4 = i15;
                }
                i13 = m58629H;
                c3697a.m58608b(constraintWidget2);
                i14++;
                i4 = i15;
            }
        }
        int size = this.f32501G0.size();
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
                C3697a c3697a2 = (C3697a) this.f32501G0.get(i16);
                if (i2 == 0) {
                    c3697a2.m58603g(i3 - c3697a2.m58604f());
                } else {
                    c3697a2.m58603g(i3 - c3697a2.m58605e());
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
            C3697a c3697a3 = (C3697a) this.f32501G0.get(i21);
            if (i2 == 0) {
                if (i21 < size - 1) {
                    constraintAnchor2 = ((C3697a) this.f32501G0.get(i21 + 1)).f32521b.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor9 = c3697a3.f32521b.mBottom;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i24 = i19;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i25 = i20;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i6 = i21;
                c3697a3.m58600j(i2, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i22, i17, i18, paddingBottom, i3);
                int max = Math.max(i25, c3697a3.m58604f());
                i19 = i24 + c3697a3.m58605e();
                if (i6 > 0) {
                    i19 += this.f32495A0;
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
                    constraintAnchor = ((C3697a) this.f32501G0.get(i6 + 1)).f32521b.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                ConstraintAnchor constraintAnchor16 = c3697a3.f32521b.mRight;
                c3697a3.m58600j(i2, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i22, i17, paddingRight, i23, i3);
                i20 = i28 + c3697a3.m58604f();
                int max2 = Math.max(i27, c3697a3.m58605e());
                if (i6 > 0) {
                    i20 += this.f32519z0;
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
    public final void m58624M(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        C3697a c3697a;
        if (i == 0) {
            return;
        }
        if (this.f32501G0.size() == 0) {
            c3697a = new C3697a(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
            this.f32501G0.add(c3697a);
        } else {
            C3697a c3697a2 = (C3697a) this.f32501G0.get(0);
            c3697a2.m58607c();
            c3697a = c3697a2;
            c3697a.m58600j(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i3);
        }
        for (int i4 = 0; i4 < i; i4++) {
            c3697a.m58608b(constraintWidgetArr[i4]);
        }
        iArr[0] = c3697a.m58604f();
        iArr[1] = c3697a.m58605e();
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
        int i = this.f32498D0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        int size = this.f32501G0.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            C3697a c3697a = (C3697a) this.f32501G0.get(i2);
                            if (i2 == size - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            c3697a.m58606d(z2, i2, z4);
                        }
                    }
                } else {
                    m58630G(z2);
                }
            } else {
                int size2 = this.f32501G0.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C3697a c3697a2 = (C3697a) this.f32501G0.get(i3);
                    if (i3 == size2 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c3697a2.m58606d(z2, i3, z3);
                }
            }
        } else if (this.f32501G0.size() > 0) {
            ((C3697a) this.f32501G0.get(0)).m58606d(z2, 0, true);
        }
        needsCallbackFromSolver(false);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Flow flow = (Flow) constraintWidget;
        this.f32507n0 = flow.f32507n0;
        this.f32508o0 = flow.f32508o0;
        this.f32509p0 = flow.f32509p0;
        this.f32510q0 = flow.f32510q0;
        this.f32511r0 = flow.f32511r0;
        this.f32512s0 = flow.f32512s0;
        this.f32513t0 = flow.f32513t0;
        this.f32514u0 = flow.f32514u0;
        this.f32515v0 = flow.f32515v0;
        this.f32516w0 = flow.f32516w0;
        this.f32517x0 = flow.f32517x0;
        this.f32518y0 = flow.f32518y0;
        this.f32519z0 = flow.f32519z0;
        this.f32495A0 = flow.f32495A0;
        this.f32496B0 = flow.f32496B0;
        this.f32497C0 = flow.f32497C0;
        this.f32498D0 = flow.f32498D0;
        this.f32499E0 = flow.f32499E0;
        this.f32500F0 = flow.f32500F0;
    }

    public float getMaxElementsWrap() {
        return this.f32499E0;
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
        this.f32515v0 = f;
    }

    public void setFirstHorizontalStyle(int i) {
        this.f32509p0 = i;
    }

    public void setFirstVerticalBias(float f) {
        this.f32516w0 = f;
    }

    public void setFirstVerticalStyle(int i) {
        this.f32510q0 = i;
    }

    public void setHorizontalAlign(int i) {
        this.f32496B0 = i;
    }

    public void setHorizontalBias(float f) {
        this.f32513t0 = f;
    }

    public void setHorizontalGap(int i) {
        this.f32519z0 = i;
    }

    public void setHorizontalStyle(int i) {
        this.f32507n0 = i;
    }

    public void setLastHorizontalBias(float f) {
        this.f32517x0 = f;
    }

    public void setLastHorizontalStyle(int i) {
        this.f32511r0 = i;
    }

    public void setLastVerticalBias(float f) {
        this.f32518y0 = f;
    }

    public void setLastVerticalStyle(int i) {
        this.f32512s0 = i;
    }

    public void setMaxElementsWrap(int i) {
        this.f32499E0 = i;
    }

    public void setOrientation(int i) {
        this.f32500F0 = i;
    }

    public void setVerticalAlign(int i) {
        this.f32497C0 = i;
    }

    public void setVerticalBias(float f) {
        this.f32514u0 = f;
    }

    public void setVerticalGap(int i) {
        this.f32495A0 = i;
    }

    public void setVerticalStyle(int i) {
        this.f32508o0 = i;
    }

    public void setWrapMode(int i) {
        this.f32498D0 = i;
    }
}
