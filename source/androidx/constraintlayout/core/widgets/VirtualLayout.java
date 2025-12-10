package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class VirtualLayout extends HelperWidget {

    /* renamed from: b0 */
    public int f32546b0 = 0;

    /* renamed from: c0 */
    public int f32547c0 = 0;

    /* renamed from: d0 */
    public int f32548d0 = 0;

    /* renamed from: e0 */
    public int f32549e0 = 0;

    /* renamed from: f0 */
    public int f32550f0 = 0;

    /* renamed from: g0 */
    public int f32551g0 = 0;

    /* renamed from: h0 */
    public int f32552h0 = 0;

    /* renamed from: i0 */
    public int f32553i0 = 0;

    /* renamed from: j0 */
    public boolean f32554j0 = false;

    /* renamed from: k0 */
    public int f32555k0 = 0;

    /* renamed from: l0 */
    public int f32556l0 = 0;
    protected BasicMeasure.Measure mMeasure = new BasicMeasure.Measure();

    /* renamed from: m0 */
    public BasicMeasure.Measurer f32557m0 = null;

    public void applyRtl(boolean z) {
        int i = this.f32550f0;
        if (i > 0 || this.f32551g0 > 0) {
            if (z) {
                this.f32552h0 = this.f32551g0;
                this.f32553i0 = i;
                return;
            }
            this.f32552h0 = i;
            this.f32553i0 = this.f32551g0;
        }
    }

    public void captureWidgets() {
        for (int i = 0; i < this.mWidgetsCount; i++) {
            ConstraintWidget constraintWidget = this.mWidgets[i];
            if (constraintWidget != null) {
                constraintWidget.setInVirtualLayout(true);
            }
        }
    }

    public boolean contains(HashSet<ConstraintWidget> hashSet) {
        for (int i = 0; i < this.mWidgetsCount; i++) {
            if (hashSet.contains(this.mWidgets[i])) {
                return true;
            }
        }
        return false;
    }

    public int getMeasuredHeight() {
        return this.f32556l0;
    }

    public int getMeasuredWidth() {
        return this.f32555k0;
    }

    public int getPaddingBottom() {
        return this.f32547c0;
    }

    public int getPaddingLeft() {
        return this.f32552h0;
    }

    public int getPaddingRight() {
        return this.f32553i0;
    }

    public int getPaddingTop() {
        return this.f32546b0;
    }

    public void measure(int i, int i2, int i3, int i4) {
    }

    public boolean measureChildren() {
        BasicMeasure.Measurer measurer;
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null) {
            measurer = ((ConstraintWidgetContainer) constraintWidget).getMeasurer();
        } else {
            measurer = null;
        }
        if (measurer == null) {
            return false;
        }
        for (int i = 0; i < this.mWidgetsCount; i++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i];
            if (constraintWidget2 != null && !(constraintWidget2 instanceof Guideline)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.getDimensionBehaviour(0);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.getDimensionBehaviour(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour != dimensionBehaviour3 || constraintWidget2.mMatchConstraintDefaultWidth == 1 || dimensionBehaviour2 != dimensionBehaviour3 || constraintWidget2.mMatchConstraintDefaultHeight == 1) {
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    BasicMeasure.Measure measure = this.mMeasure;
                    measure.horizontalBehavior = dimensionBehaviour;
                    measure.verticalBehavior = dimensionBehaviour2;
                    measure.horizontalDimension = constraintWidget2.getWidth();
                    this.mMeasure.verticalDimension = constraintWidget2.getHeight();
                    measurer.measure(constraintWidget2, this.mMeasure);
                    constraintWidget2.setWidth(this.mMeasure.measuredWidth);
                    constraintWidget2.setHeight(this.mMeasure.measuredHeight);
                    constraintWidget2.setBaselineDistance(this.mMeasure.measuredBaseline);
                }
            }
        }
        return true;
    }

    public boolean needSolverPass() {
        return this.f32554j0;
    }

    public void needsCallbackFromSolver(boolean z) {
        this.f32554j0 = z;
    }

    public void setMeasure(int i, int i2) {
        this.f32555k0 = i;
        this.f32556l0 = i2;
    }

    public void setPadding(int i) {
        this.f32548d0 = i;
        this.f32546b0 = i;
        this.f32549e0 = i;
        this.f32547c0 = i;
        this.f32550f0 = i;
        this.f32551g0 = i;
    }

    public void setPaddingBottom(int i) {
        this.f32547c0 = i;
    }

    public void setPaddingEnd(int i) {
        this.f32551g0 = i;
    }

    public void setPaddingLeft(int i) {
        this.f32548d0 = i;
        this.f32552h0 = i;
    }

    public void setPaddingRight(int i) {
        this.f32549e0 = i;
        this.f32553i0 = i;
    }

    public void setPaddingStart(int i) {
        this.f32550f0 = i;
        this.f32552h0 = i;
        this.f32553i0 = i;
    }

    public void setPaddingTop(int i) {
        this.f32546b0 = i;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(ConstraintWidgetContainer constraintWidgetContainer) {
        captureWidgets();
    }

    public void measure(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        while (this.f32557m0 == null && getParent() != null) {
            this.f32557m0 = ((ConstraintWidgetContainer) getParent()).getMeasurer();
        }
        BasicMeasure.Measure measure = this.mMeasure;
        measure.horizontalBehavior = dimensionBehaviour;
        measure.verticalBehavior = dimensionBehaviour2;
        measure.horizontalDimension = i;
        measure.verticalDimension = i2;
        this.f32557m0.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
    }
}
