package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Barrier extends HelperWidget {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;

    /* renamed from: b0 */
    public int f32403b0 = 0;

    /* renamed from: c0 */
    public boolean f32404c0 = true;

    /* renamed from: d0 */
    public int f32405d0 = 0;

    /* renamed from: e0 */
    public boolean f32406e0 = false;

    public Barrier() {
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ConstraintAnchor[] constraintAnchorArr2 = this.mListAnchors;
        constraintAnchorArr2[0] = this.mLeft;
        constraintAnchorArr2[2] = this.mTop;
        constraintAnchorArr2[1] = this.mRight;
        constraintAnchorArr2[3] = this.mBottom;
        int i6 = 0;
        while (true) {
            constraintAnchorArr = this.mListAnchors;
            if (i6 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i6];
            constraintAnchor.f32418e = linearSystem.createObjectVariable(constraintAnchor);
            i6++;
        }
        int i7 = this.f32403b0;
        if (i7 >= 0 && i7 < 4) {
            ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i7];
            if (!this.f32406e0) {
                allSolved();
            }
            if (this.f32406e0) {
                this.f32406e0 = false;
                int i8 = this.f32403b0;
                if (i8 != 0 && i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        linearSystem.addEquality(this.mTop.f32418e, this.f32461mY);
                        linearSystem.addEquality(this.mBottom.f32418e, this.f32461mY);
                        return;
                    }
                    return;
                }
                linearSystem.addEquality(this.mLeft.f32418e, this.f32460mX);
                linearSystem.addEquality(this.mRight.f32418e, this.f32460mX);
                return;
            }
            for (int i9 = 0; i9 < this.mWidgetsCount; i9++) {
                ConstraintWidget constraintWidget = this.mWidgets[i9];
                if ((this.f32404c0 || constraintWidget.allowedInBarrier()) && ((((i4 = this.f32403b0) == 0 || i4 == 1) && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mLeft.mTarget != null && constraintWidget.mRight.mTarget != null) || (((i5 = this.f32403b0) == 2 || i5 == 3) && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mTop.mTarget != null && constraintWidget.mBottom.mTarget != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!this.mLeft.hasCenteredDependents() && !this.mRight.hasCenteredDependents()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!this.mTop.hasCenteredDependents() && !this.mBottom.hasCenteredDependents()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z2 && (((i3 = this.f32403b0) == 0 && z3) || ((i3 == 2 && z4) || ((i3 == 1 && z3) || (i3 == 3 && z4))))) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                i = 4;
            } else {
                i = 5;
            }
            for (int i10 = 0; i10 < this.mWidgetsCount; i10++) {
                ConstraintWidget constraintWidget2 = this.mWidgets[i10];
                if (this.f32404c0 || constraintWidget2.allowedInBarrier()) {
                    SolverVariable createObjectVariable = linearSystem.createObjectVariable(constraintWidget2.mListAnchors[this.f32403b0]);
                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.mListAnchors;
                    int i11 = this.f32403b0;
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i11];
                    constraintAnchor3.f32418e = createObjectVariable;
                    ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
                    if (constraintAnchor4 != null && constraintAnchor4.mOwner == this) {
                        i2 = constraintAnchor3.mMargin;
                    } else {
                        i2 = 0;
                    }
                    if (i11 != 0 && i11 != 2) {
                        linearSystem.addGreaterBarrier(constraintAnchor2.f32418e, createObjectVariable, this.f32405d0 + i2, z2);
                    } else {
                        linearSystem.addLowerBarrier(constraintAnchor2.f32418e, createObjectVariable, this.f32405d0 - i2, z2);
                    }
                    linearSystem.addEquality(constraintAnchor2.f32418e, createObjectVariable, this.f32405d0 + i2, i);
                }
            }
            int i12 = this.f32403b0;
            if (i12 == 0) {
                linearSystem.addEquality(this.mRight.f32418e, this.mLeft.f32418e, 0, 8);
                linearSystem.addEquality(this.mLeft.f32418e, this.mParent.mRight.f32418e, 0, 4);
                linearSystem.addEquality(this.mLeft.f32418e, this.mParent.mLeft.f32418e, 0, 0);
            } else if (i12 == 1) {
                linearSystem.addEquality(this.mLeft.f32418e, this.mRight.f32418e, 0, 8);
                linearSystem.addEquality(this.mLeft.f32418e, this.mParent.mLeft.f32418e, 0, 4);
                linearSystem.addEquality(this.mLeft.f32418e, this.mParent.mRight.f32418e, 0, 0);
            } else if (i12 == 2) {
                linearSystem.addEquality(this.mBottom.f32418e, this.mTop.f32418e, 0, 8);
                linearSystem.addEquality(this.mTop.f32418e, this.mParent.mBottom.f32418e, 0, 4);
                linearSystem.addEquality(this.mTop.f32418e, this.mParent.mTop.f32418e, 0, 0);
            } else if (i12 == 3) {
                linearSystem.addEquality(this.mTop.f32418e, this.mBottom.f32418e, 0, 8);
                linearSystem.addEquality(this.mTop.f32418e, this.mParent.mTop.f32418e, 0, 4);
                linearSystem.addEquality(this.mTop.f32418e, this.mParent.mBottom.f32418e, 0, 0);
            }
        }
    }

    public boolean allSolved() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.mWidgetsCount;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i4];
            if ((this.f32404c0 || constraintWidget.allowedInBarrier()) && ((((i2 = this.f32403b0) == 0 || i2 == 1) && !constraintWidget.isResolvedHorizontally()) || (((i3 = this.f32403b0) == 2 || i3 == 3) && !constraintWidget.isResolvedVertically()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.mWidgetsCount; i6++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i6];
            if (this.f32404c0 || constraintWidget2.allowedInBarrier()) {
                if (!z2) {
                    int i7 = this.f32403b0;
                    if (i7 == 0) {
                        i5 = constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue();
                    } else if (i7 == 1) {
                        i5 = constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue();
                    } else if (i7 == 2) {
                        i5 = constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue();
                    } else if (i7 == 3) {
                        i5 = constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue();
                    }
                    z2 = true;
                }
                int i8 = this.f32403b0;
                if (i8 == 0) {
                    i5 = Math.min(i5, constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue());
                }
            }
        }
        int i9 = i5 + this.f32405d0;
        int i10 = this.f32403b0;
        if (i10 != 0 && i10 != 1) {
            setFinalVertical(i9, i9);
        } else {
            setFinalHorizontal(i9, i9);
        }
        this.f32406e0 = true;
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return true;
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.f32404c0;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Barrier barrier = (Barrier) constraintWidget;
        this.f32403b0 = barrier.f32403b0;
        this.f32404c0 = barrier.f32404c0;
        this.f32405d0 = barrier.f32405d0;
    }

    public boolean getAllowsGoneWidget() {
        return this.f32404c0;
    }

    public int getBarrierType() {
        return this.f32403b0;
    }

    public int getMargin() {
        return this.f32405d0;
    }

    public int getOrientation() {
        int i = this.f32403b0;
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
        return this.f32406e0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
        return this.f32406e0;
    }

    public void markWidgets() {
        for (int i = 0; i < this.mWidgetsCount; i++) {
            ConstraintWidget constraintWidget = this.mWidgets[i];
            if (this.f32404c0 || constraintWidget.allowedInBarrier()) {
                int i2 = this.f32403b0;
                if (i2 != 0 && i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        constraintWidget.setInBarrier(1, true);
                    }
                } else {
                    constraintWidget.setInBarrier(0, true);
                }
            }
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f32404c0 = z;
    }

    public void setBarrierType(int i) {
        this.f32403b0 = i;
    }

    public void setMargin(int i) {
        this.f32405d0 = i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String str = "[Barrier] " + getDebugName() + " {";
        for (int i = 0; i < this.mWidgetsCount; i++) {
            ConstraintWidget constraintWidget = this.mWidgets[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.getDebugName();
        }
        return str + "}";
    }

    public Barrier(String str) {
        setDebugName(str);
    }
}
