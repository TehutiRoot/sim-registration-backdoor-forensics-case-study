package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* loaded from: classes2.dex */
public class HorizontalWidgetRun extends WidgetRun {

    /* renamed from: e */
    public static int[] f32582e = new int[2];

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C3699a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32583a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f32583a = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32583a[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32583a[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HorizontalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.start.f32573b = DependencyNode.Type.LEFT;
        this.end.f32573b = DependencyNode.Type.RIGHT;
        this.orientation = 0;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: a */
    public void mo30668a() {
        ConstraintWidget parent;
        ConstraintWidget parent2;
        ConstraintWidget constraintWidget = this.f32601a;
        if (constraintWidget.measured) {
            this.f32603c.resolve(constraintWidget.getWidth());
        }
        if (!this.f32603c.resolved) {
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = this.f32601a.getHorizontalDimensionBehaviour();
            this.dimensionBehavior = horizontalDimensionBehaviour;
            if (horizontalDimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (horizontalDimensionBehaviour == dimensionBehaviour && (parent2 = this.f32601a.getParent()) != null && (parent2.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED || parent2.getHorizontalDimensionBehaviour() == dimensionBehaviour)) {
                    int width = (parent2.getWidth() - this.f32601a.mLeft.getMargin()) - this.f32601a.mRight.getMargin();
                    addTarget(this.start, parent2.horizontalRun.start, this.f32601a.mLeft.getMargin());
                    addTarget(this.end, parent2.horizontalRun.end, -this.f32601a.mRight.getMargin());
                    this.f32603c.resolve(width);
                    return;
                } else if (this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f32603c.resolve(this.f32601a.getWidth());
                }
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.dimensionBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour2 == dimensionBehaviour3 && (parent = this.f32601a.getParent()) != null && (parent.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED || parent.getHorizontalDimensionBehaviour() == dimensionBehaviour3)) {
                addTarget(this.start, parent.horizontalRun.start, this.f32601a.mLeft.getMargin());
                addTarget(this.end, parent.horizontalRun.end, -this.f32601a.mRight.getMargin());
                return;
            }
        }
        C3703a c3703a = this.f32603c;
        if (c3703a.resolved) {
            ConstraintWidget constraintWidget2 = this.f32601a;
            if (constraintWidget2.measured) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.mListAnchors;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
                if (constraintAnchor2 != null && constraintAnchorArr[1].mTarget != null) {
                    if (constraintWidget2.isInHorizontalChain()) {
                        this.start.f32574c = this.f32601a.mListAnchors[0].getMargin();
                        this.end.f32574c = -this.f32601a.mListAnchors[1].getMargin();
                        return;
                    }
                    DependencyNode target = getTarget(this.f32601a.mListAnchors[0]);
                    if (target != null) {
                        addTarget(this.start, target, this.f32601a.mListAnchors[0].getMargin());
                    }
                    DependencyNode target2 = getTarget(this.f32601a.mListAnchors[1]);
                    if (target2 != null) {
                        addTarget(this.end, target2, -this.f32601a.mListAnchors[1].getMargin());
                    }
                    this.start.delegateToWidgetRun = true;
                    this.end.delegateToWidgetRun = true;
                    return;
                } else if (constraintAnchor2 != null) {
                    DependencyNode target3 = getTarget(constraintAnchor);
                    if (target3 != null) {
                        addTarget(this.start, target3, this.f32601a.mListAnchors[0].getMargin());
                        addTarget(this.end, this.start, this.f32603c.value);
                        return;
                    }
                    return;
                } else {
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                    if (constraintAnchor3.mTarget != null) {
                        DependencyNode target4 = getTarget(constraintAnchor3);
                        if (target4 != null) {
                            addTarget(this.end, target4, -this.f32601a.mListAnchors[1].getMargin());
                            addTarget(this.start, this.end, -this.f32603c.value);
                            return;
                        }
                        return;
                    } else if ((constraintWidget2 instanceof Helper) || constraintWidget2.getParent() == null || this.f32601a.getAnchor(ConstraintAnchor.Type.CENTER).mTarget != null) {
                        return;
                    } else {
                        addTarget(this.start, this.f32601a.getParent().horizontalRun.start, this.f32601a.getX());
                        addTarget(this.end, this.start, this.f32603c.value);
                        return;
                    }
                }
            }
        }
        if (this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f32601a;
            int i = constraintWidget3.mMatchConstraintDefaultWidth;
            if (i == 2) {
                ConstraintWidget parent3 = constraintWidget3.getParent();
                if (parent3 != null) {
                    C3703a c3703a2 = parent3.verticalRun.f32603c;
                    this.f32603c.f32578g.add(c3703a2);
                    c3703a2.f32577f.add(this.f32603c);
                    C3703a c3703a3 = this.f32603c;
                    c3703a3.delegateToWidgetRun = true;
                    c3703a3.f32577f.add(this.start);
                    this.f32603c.f32577f.add(this.end);
                }
            } else if (i == 3) {
                if (constraintWidget3.mMatchConstraintDefaultHeight == 3) {
                    this.start.updateDelegate = this;
                    this.end.updateDelegate = this;
                    VerticalWidgetRun verticalWidgetRun = constraintWidget3.verticalRun;
                    verticalWidgetRun.start.updateDelegate = this;
                    verticalWidgetRun.end.updateDelegate = this;
                    c3703a.updateDelegate = this;
                    if (constraintWidget3.isInVerticalChain()) {
                        this.f32603c.f32578g.add(this.f32601a.verticalRun.f32603c);
                        this.f32601a.verticalRun.f32603c.f32577f.add(this.f32603c);
                        VerticalWidgetRun verticalWidgetRun2 = this.f32601a.verticalRun;
                        verticalWidgetRun2.f32603c.updateDelegate = this;
                        this.f32603c.f32578g.add(verticalWidgetRun2.start);
                        this.f32603c.f32578g.add(this.f32601a.verticalRun.end);
                        this.f32601a.verticalRun.start.f32577f.add(this.f32603c);
                        this.f32601a.verticalRun.end.f32577f.add(this.f32603c);
                    } else if (this.f32601a.isInHorizontalChain()) {
                        this.f32601a.verticalRun.f32603c.f32578g.add(this.f32603c);
                        this.f32603c.f32577f.add(this.f32601a.verticalRun.f32603c);
                    } else {
                        this.f32601a.verticalRun.f32603c.f32578g.add(this.f32603c);
                    }
                } else {
                    C3703a c3703a4 = constraintWidget3.verticalRun.f32603c;
                    c3703a.f32578g.add(c3703a4);
                    c3703a4.f32577f.add(this.f32603c);
                    this.f32601a.verticalRun.start.f32577f.add(this.f32603c);
                    this.f32601a.verticalRun.end.f32577f.add(this.f32603c);
                    C3703a c3703a5 = this.f32603c;
                    c3703a5.delegateToWidgetRun = true;
                    c3703a5.f32577f.add(this.start);
                    this.f32603c.f32577f.add(this.end);
                    this.start.f32578g.add(this.f32603c);
                    this.end.f32578g.add(this.f32603c);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.f32601a;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.mListAnchors;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.mTarget;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].mTarget != null) {
            if (constraintWidget4.isInHorizontalChain()) {
                this.start.f32574c = this.f32601a.mListAnchors[0].getMargin();
                this.end.f32574c = -this.f32601a.mListAnchors[1].getMargin();
                return;
            }
            DependencyNode target5 = getTarget(this.f32601a.mListAnchors[0]);
            DependencyNode target6 = getTarget(this.f32601a.mListAnchors[1]);
            if (target5 != null) {
                target5.addDependency(this);
            }
            if (target6 != null) {
                target6.addDependency(this);
            }
            this.mRunType = WidgetRun.RunType.CENTER;
        } else if (constraintAnchor5 != null) {
            DependencyNode target7 = getTarget(constraintAnchor4);
            if (target7 != null) {
                addTarget(this.start, target7, this.f32601a.mListAnchors[0].getMargin());
                addTarget(this.end, this.start, 1, this.f32603c);
            }
        } else {
            ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
            if (constraintAnchor6.mTarget != null) {
                DependencyNode target8 = getTarget(constraintAnchor6);
                if (target8 != null) {
                    addTarget(this.end, target8, -this.f32601a.mListAnchors[1].getMargin());
                    addTarget(this.start, this.end, -1, this.f32603c);
                }
            } else if ((constraintWidget4 instanceof Helper) || constraintWidget4.getParent() == null) {
            } else {
                addTarget(this.start, this.f32601a.getParent().horizontalRun.start, this.f32601a.getX());
                addTarget(this.end, this.start, 1, this.f32603c);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.resolved) {
            this.f32601a.setX(dependencyNode.value);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: b */
    public void mo30667b() {
        this.f32602b = null;
        this.start.clear();
        this.end.clear();
        this.f32603c.clear();
        this.f32604d = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: d */
    public boolean mo30666d() {
        if (this.dimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f32601a.mMatchConstraintDefaultWidth == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m58574e(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    iArr[0] = i6;
                    iArr[1] = (int) ((i6 * f) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
            return;
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* renamed from: f */
    public void m58573f() {
        this.f32604d = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.f32603c.resolved = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f32601a.getDebugName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02bd, code lost:
        if (r14 != 1) goto L131;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r17) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.update(androidx.constraintlayout.core.widgets.analyzer.Dependency):void");
    }
}
