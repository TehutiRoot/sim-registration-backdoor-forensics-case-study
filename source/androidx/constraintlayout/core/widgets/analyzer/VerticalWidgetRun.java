package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* loaded from: classes2.dex */
public class VerticalWidgetRun extends WidgetRun {
    public DependencyNode baseline;

    /* renamed from: e */
    public C3703a f32584e;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C3700a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32585a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f32585a = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32585a[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32585a[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VerticalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.baseline = dependencyNode;
        this.f32584e = null;
        this.start.f32573b = DependencyNode.Type.TOP;
        this.end.f32573b = DependencyNode.Type.BOTTOM;
        dependencyNode.f32573b = DependencyNode.Type.BASELINE;
        this.orientation = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: a */
    public void mo30668a() {
        ConstraintWidget parent;
        ConstraintWidget parent2;
        ConstraintWidget constraintWidget = this.f32601a;
        if (constraintWidget.measured) {
            this.f32603c.resolve(constraintWidget.getHeight());
        }
        if (!this.f32603c.resolved) {
            this.dimensionBehavior = this.f32601a.getVerticalDimensionBehaviour();
            if (this.f32601a.hasBaseline()) {
                this.f32584e = new C1689Xa(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.dimensionBehavior;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent2 = this.f32601a.getParent()) != null && parent2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int height = (parent2.getHeight() - this.f32601a.mTop.getMargin()) - this.f32601a.mBottom.getMargin();
                    addTarget(this.start, parent2.verticalRun.start, this.f32601a.mTop.getMargin());
                    addTarget(this.end, parent2.verticalRun.end, -this.f32601a.mBottom.getMargin());
                    this.f32603c.resolve(height);
                    return;
                } else if (this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f32603c.resolve(this.f32601a.getHeight());
                }
            }
        } else if (this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent = this.f32601a.getParent()) != null && parent.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED) {
            addTarget(this.start, parent.verticalRun.start, this.f32601a.mTop.getMargin());
            addTarget(this.end, parent.verticalRun.end, -this.f32601a.mBottom.getMargin());
            return;
        }
        C3703a c3703a = this.f32603c;
        boolean z = c3703a.resolved;
        if (z) {
            ConstraintWidget constraintWidget2 = this.f32601a;
            if (constraintWidget2.measured) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.mListAnchors;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
                if (constraintAnchor2 != null && constraintAnchorArr[3].mTarget != null) {
                    if (constraintWidget2.isInVerticalChain()) {
                        this.start.f32574c = this.f32601a.mListAnchors[2].getMargin();
                        this.end.f32574c = -this.f32601a.mListAnchors[3].getMargin();
                    } else {
                        DependencyNode target = getTarget(this.f32601a.mListAnchors[2]);
                        if (target != null) {
                            addTarget(this.start, target, this.f32601a.mListAnchors[2].getMargin());
                        }
                        DependencyNode target2 = getTarget(this.f32601a.mListAnchors[3]);
                        if (target2 != null) {
                            addTarget(this.end, target2, -this.f32601a.mListAnchors[3].getMargin());
                        }
                        this.start.delegateToWidgetRun = true;
                        this.end.delegateToWidgetRun = true;
                    }
                    if (this.f32601a.hasBaseline()) {
                        addTarget(this.baseline, this.start, this.f32601a.getBaselineDistance());
                        return;
                    }
                    return;
                } else if (constraintAnchor2 != null) {
                    DependencyNode target3 = getTarget(constraintAnchor);
                    if (target3 != null) {
                        addTarget(this.start, target3, this.f32601a.mListAnchors[2].getMargin());
                        addTarget(this.end, this.start, this.f32603c.value);
                        if (this.f32601a.hasBaseline()) {
                            addTarget(this.baseline, this.start, this.f32601a.getBaselineDistance());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                    if (constraintAnchor3.mTarget != null) {
                        DependencyNode target4 = getTarget(constraintAnchor3);
                        if (target4 != null) {
                            addTarget(this.end, target4, -this.f32601a.mListAnchors[3].getMargin());
                            addTarget(this.start, this.end, -this.f32603c.value);
                        }
                        if (this.f32601a.hasBaseline()) {
                            addTarget(this.baseline, this.start, this.f32601a.getBaselineDistance());
                            return;
                        }
                        return;
                    }
                    ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                    if (constraintAnchor4.mTarget != null) {
                        DependencyNode target5 = getTarget(constraintAnchor4);
                        if (target5 != null) {
                            addTarget(this.baseline, target5, 0);
                            addTarget(this.start, this.baseline, -this.f32601a.getBaselineDistance());
                            addTarget(this.end, this.start, this.f32603c.value);
                            return;
                        }
                        return;
                    } else if ((constraintWidget2 instanceof Helper) || constraintWidget2.getParent() == null || this.f32601a.getAnchor(ConstraintAnchor.Type.CENTER).mTarget != null) {
                        return;
                    } else {
                        addTarget(this.start, this.f32601a.getParent().verticalRun.start, this.f32601a.getY());
                        addTarget(this.end, this.start, this.f32603c.value);
                        if (this.f32601a.hasBaseline()) {
                            addTarget(this.baseline, this.start, this.f32601a.getBaselineDistance());
                            return;
                        }
                        return;
                    }
                }
            }
        }
        if (!z && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f32601a;
            int i = constraintWidget3.mMatchConstraintDefaultHeight;
            if (i != 2) {
                if (i == 3 && !constraintWidget3.isInVerticalChain()) {
                    ConstraintWidget constraintWidget4 = this.f32601a;
                    if (constraintWidget4.mMatchConstraintDefaultWidth != 3) {
                        C3703a c3703a2 = constraintWidget4.horizontalRun.f32603c;
                        this.f32603c.f32578g.add(c3703a2);
                        c3703a2.f32577f.add(this.f32603c);
                        C3703a c3703a3 = this.f32603c;
                        c3703a3.delegateToWidgetRun = true;
                        c3703a3.f32577f.add(this.start);
                        this.f32603c.f32577f.add(this.end);
                    }
                }
            } else {
                ConstraintWidget parent3 = constraintWidget3.getParent();
                if (parent3 != null) {
                    C3703a c3703a4 = parent3.verticalRun.f32603c;
                    this.f32603c.f32578g.add(c3703a4);
                    c3703a4.f32577f.add(this.f32603c);
                    C3703a c3703a5 = this.f32603c;
                    c3703a5.delegateToWidgetRun = true;
                    c3703a5.f32577f.add(this.start);
                    this.f32603c.f32577f.add(this.end);
                }
            }
        } else {
            c3703a.addDependency(this);
        }
        ConstraintWidget constraintWidget5 = this.f32601a;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.mListAnchors;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.mTarget;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].mTarget != null) {
            if (constraintWidget5.isInVerticalChain()) {
                this.start.f32574c = this.f32601a.mListAnchors[2].getMargin();
                this.end.f32574c = -this.f32601a.mListAnchors[3].getMargin();
            } else {
                DependencyNode target6 = getTarget(this.f32601a.mListAnchors[2]);
                DependencyNode target7 = getTarget(this.f32601a.mListAnchors[3]);
                if (target6 != null) {
                    target6.addDependency(this);
                }
                if (target7 != null) {
                    target7.addDependency(this);
                }
                this.mRunType = WidgetRun.RunType.CENTER;
            }
            if (this.f32601a.hasBaseline()) {
                addTarget(this.baseline, this.start, 1, this.f32584e);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode target8 = getTarget(constraintAnchor5);
            if (target8 != null) {
                addTarget(this.start, target8, this.f32601a.mListAnchors[2].getMargin());
                addTarget(this.end, this.start, 1, this.f32603c);
                if (this.f32601a.hasBaseline()) {
                    addTarget(this.baseline, this.start, 1, this.f32584e);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.dimensionBehavior;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3 && this.f32601a.getDimensionRatio() > 0.0f) {
                    HorizontalWidgetRun horizontalWidgetRun = this.f32601a.horizontalRun;
                    if (horizontalWidgetRun.dimensionBehavior == dimensionBehaviour3) {
                        horizontalWidgetRun.f32603c.f32577f.add(this.f32603c);
                        this.f32603c.f32578g.add(this.f32601a.horizontalRun.f32603c);
                        this.f32603c.updateDelegate = this;
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.mTarget != null) {
                DependencyNode target9 = getTarget(constraintAnchor7);
                if (target9 != null) {
                    addTarget(this.end, target9, -this.f32601a.mListAnchors[3].getMargin());
                    addTarget(this.start, this.end, -1, this.f32603c);
                    if (this.f32601a.hasBaseline()) {
                        addTarget(this.baseline, this.start, 1, this.f32584e);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.mTarget != null) {
                    DependencyNode target10 = getTarget(constraintAnchor8);
                    if (target10 != null) {
                        addTarget(this.baseline, target10, 0);
                        addTarget(this.start, this.baseline, -1, this.f32584e);
                        addTarget(this.end, this.start, 1, this.f32603c);
                    }
                } else if (!(constraintWidget5 instanceof Helper) && constraintWidget5.getParent() != null) {
                    addTarget(this.start, this.f32601a.getParent().verticalRun.start, this.f32601a.getY());
                    addTarget(this.end, this.start, 1, this.f32603c);
                    if (this.f32601a.hasBaseline()) {
                        addTarget(this.baseline, this.start, 1, this.f32584e);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.dimensionBehavior;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5 && this.f32601a.getDimensionRatio() > 0.0f) {
                        HorizontalWidgetRun horizontalWidgetRun2 = this.f32601a.horizontalRun;
                        if (horizontalWidgetRun2.dimensionBehavior == dimensionBehaviour5) {
                            horizontalWidgetRun2.f32603c.f32577f.add(this.f32603c);
                            this.f32603c.f32578g.add(this.f32601a.horizontalRun.f32603c);
                            this.f32603c.updateDelegate = this;
                        }
                    }
                }
            }
        }
        if (this.f32603c.f32578g.size() == 0) {
            this.f32603c.readyToSolve = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.resolved) {
            this.f32601a.setY(dependencyNode.value);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: b */
    public void mo30667b() {
        this.f32602b = null;
        this.start.clear();
        this.end.clear();
        this.baseline.clear();
        this.f32603c.clear();
        this.f32604d = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: d */
    public boolean mo30666d() {
        if (this.dimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f32601a.mMatchConstraintDefaultHeight == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m58572e() {
        this.f32604d = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.baseline.clear();
        this.baseline.resolved = false;
        this.f32603c.resolved = false;
    }

    public String toString() {
        return "VerticalRun " + this.f32601a.getDebugName();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        C3703a c3703a;
        float f;
        float dimensionRatio;
        float f2;
        int i;
        ConstraintWidget constraintWidget;
        int i2 = C3700a.f32585a[this.mRunType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    ConstraintWidget constraintWidget2 = this.f32601a;
                    updateRunCenter(dependency, constraintWidget2.mTop, constraintWidget2.mBottom, 1);
                    return;
                }
            } else {
                updateRunEnd(dependency);
            }
        } else {
            updateRunStart(dependency);
        }
        C3703a c3703a2 = this.f32603c;
        if (c3703a2.readyToSolve && !c3703a2.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f32601a;
            int i3 = constraintWidget3.mMatchConstraintDefaultHeight;
            if (i3 != 2) {
                if (i3 == 3 && constraintWidget3.horizontalRun.f32603c.resolved) {
                    int dimensionRatioSide = constraintWidget3.getDimensionRatioSide();
                    if (dimensionRatioSide != -1) {
                        if (dimensionRatioSide != 0) {
                            if (dimensionRatioSide != 1) {
                                i = 0;
                                this.f32603c.resolve(i);
                            } else {
                                ConstraintWidget constraintWidget4 = this.f32601a;
                                f = constraintWidget4.horizontalRun.f32603c.value;
                                dimensionRatio = constraintWidget4.getDimensionRatio();
                            }
                        } else {
                            f2 = constraintWidget.horizontalRun.f32603c.value * this.f32601a.getDimensionRatio();
                            i = (int) (f2 + 0.5f);
                            this.f32603c.resolve(i);
                        }
                    } else {
                        ConstraintWidget constraintWidget5 = this.f32601a;
                        f = constraintWidget5.horizontalRun.f32603c.value;
                        dimensionRatio = constraintWidget5.getDimensionRatio();
                    }
                    f2 = f / dimensionRatio;
                    i = (int) (f2 + 0.5f);
                    this.f32603c.resolve(i);
                }
            } else {
                ConstraintWidget parent = constraintWidget3.getParent();
                if (parent != null) {
                    if (parent.verticalRun.f32603c.resolved) {
                        this.f32603c.resolve((int) ((c3703a.value * this.f32601a.mMatchConstraintPercentHeight) + 0.5f));
                    }
                }
            }
        }
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.readyToSolve) {
            DependencyNode dependencyNode2 = this.end;
            if (dependencyNode2.readyToSolve) {
                if (dependencyNode.resolved && dependencyNode2.resolved && this.f32603c.resolved) {
                    return;
                }
                if (!this.f32603c.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget6 = this.f32601a;
                    if (constraintWidget6.mMatchConstraintDefaultWidth == 0 && !constraintWidget6.isInVerticalChain()) {
                        int i4 = ((DependencyNode) this.start.f32578g.get(0)).value;
                        DependencyNode dependencyNode3 = this.start;
                        int i5 = i4 + dependencyNode3.f32574c;
                        int i6 = ((DependencyNode) this.end.f32578g.get(0)).value + this.end.f32574c;
                        dependencyNode3.resolve(i5);
                        this.end.resolve(i6);
                        this.f32603c.resolve(i6 - i5);
                        return;
                    }
                }
                if (!this.f32603c.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.f32578g.size() > 0 && this.end.f32578g.size() > 0) {
                    int i7 = (((DependencyNode) this.end.f32578g.get(0)).value + this.end.f32574c) - (((DependencyNode) this.start.f32578g.get(0)).value + this.start.f32574c);
                    C3703a c3703a3 = this.f32603c;
                    int i8 = c3703a3.f32606h;
                    if (i7 < i8) {
                        c3703a3.resolve(i7);
                    } else {
                        c3703a3.resolve(i8);
                    }
                }
                if (this.f32603c.resolved && this.start.f32578g.size() > 0 && this.end.f32578g.size() > 0) {
                    DependencyNode dependencyNode4 = (DependencyNode) this.start.f32578g.get(0);
                    DependencyNode dependencyNode5 = (DependencyNode) this.end.f32578g.get(0);
                    int i9 = dependencyNode4.value + this.start.f32574c;
                    int i10 = dependencyNode5.value + this.end.f32574c;
                    float verticalBiasPercent = this.f32601a.getVerticalBiasPercent();
                    if (dependencyNode4 == dependencyNode5) {
                        i9 = dependencyNode4.value;
                        i10 = dependencyNode5.value;
                        verticalBiasPercent = 0.5f;
                    }
                    this.start.resolve((int) (i9 + 0.5f + (((i10 - i9) - this.f32603c.value) * verticalBiasPercent)));
                    this.end.resolve(this.start.value + this.f32603c.value);
                }
            }
        }
    }
}
