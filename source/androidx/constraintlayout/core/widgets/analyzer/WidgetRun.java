package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes2.dex */
public abstract class WidgetRun implements Dependency {

    /* renamed from: a */
    public ConstraintWidget f32601a;

    /* renamed from: b */
    public C21370oA1 f32602b;
    protected ConstraintWidget.DimensionBehaviour dimensionBehavior;
    public int matchConstraintsType;

    /* renamed from: c */
    public C3703a f32603c = new C3703a(this);
    public int orientation = 0;

    /* renamed from: d */
    public boolean f32604d = false;
    public DependencyNode start = new DependencyNode(this);
    public DependencyNode end = new DependencyNode(this);
    protected RunType mRunType = RunType.NONE;

    /* loaded from: classes2.dex */
    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C3702a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32605a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f32605a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32605a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32605a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32605a[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32605a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f32601a = constraintWidget;
    }

    /* renamed from: a */
    public abstract void mo30668a();

    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        dependencyNode.f32578g.add(dependencyNode2);
        dependencyNode.f32574c = i;
        dependencyNode2.f32577f.add(dependencyNode);
    }

    public abstract void applyToWidget();

    /* renamed from: b */
    public abstract void mo30667b();

    /* renamed from: c */
    public final void m58567c(int i, int i2) {
        WidgetRun widgetRun;
        float f;
        int i3;
        int i4 = this.matchConstraintsType;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        ConstraintWidget constraintWidget = this.f32601a;
                        WidgetRun widgetRun2 = constraintWidget.horizontalRun;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun2.dimensionBehavior;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviour == dimensionBehaviour2 && widgetRun2.matchConstraintsType == 3) {
                            VerticalWidgetRun verticalWidgetRun = constraintWidget.verticalRun;
                            if (verticalWidgetRun.dimensionBehavior == dimensionBehaviour2 && verticalWidgetRun.matchConstraintsType == 3) {
                                return;
                            }
                        }
                        if (i == 0) {
                            widgetRun2 = constraintWidget.verticalRun;
                        }
                        if (widgetRun2.f32603c.resolved) {
                            float dimensionRatio = constraintWidget.getDimensionRatio();
                            if (i == 1) {
                                i3 = (int) ((widgetRun2.f32603c.value / dimensionRatio) + 0.5f);
                            } else {
                                i3 = (int) ((dimensionRatio * widgetRun2.f32603c.value) + 0.5f);
                            }
                            this.f32603c.resolve(i3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintWidget parent = this.f32601a.getParent();
                if (parent != null) {
                    if (i == 0) {
                        widgetRun = parent.horizontalRun;
                    } else {
                        widgetRun = parent.verticalRun;
                    }
                    C3703a c3703a = widgetRun.f32603c;
                    if (c3703a.resolved) {
                        ConstraintWidget constraintWidget2 = this.f32601a;
                        if (i == 0) {
                            f = constraintWidget2.mMatchConstraintPercentWidth;
                        } else {
                            f = constraintWidget2.mMatchConstraintPercentHeight;
                        }
                        this.f32603c.resolve(getLimitedDimension((int) ((c3703a.value * f) + 0.5f), i));
                        return;
                    }
                    return;
                }
                return;
            }
            this.f32603c.resolve(Math.min(getLimitedDimension(this.f32603c.f32606h, i), i2));
            return;
        }
        this.f32603c.resolve(getLimitedDimension(i2, i));
    }

    /* renamed from: d */
    public abstract boolean mo30666d();

    public final int getLimitedDimension(int i, int i2) {
        int max;
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.f32601a;
            int i3 = constraintWidget.mMatchConstraintMaxWidth;
            max = Math.max(constraintWidget.mMatchConstraintMinWidth, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f32601a;
            int i4 = constraintWidget2.mMatchConstraintMaxHeight;
            max = Math.max(constraintWidget2.mMatchConstraintMinHeight, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        int i = C3702a.f32605a[constraintAnchor2.mType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return constraintWidget.verticalRun.end;
                    }
                    return constraintWidget.verticalRun.baseline;
                }
                return constraintWidget.verticalRun.start;
            }
            return constraintWidget.horizontalRun.end;
        }
        return constraintWidget.horizontalRun.start;
    }

    public long getWrapDimension() {
        C3703a c3703a = this.f32603c;
        if (c3703a.resolved) {
            return c3703a.value;
        }
        return 0L;
    }

    public boolean isCenterConnection() {
        int size = this.start.f32578g.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (((DependencyNode) this.start.f32578g.get(i2)).f32572a != this) {
                i++;
            }
        }
        int size2 = this.end.f32578g.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (((DependencyNode) this.end.f32578g.get(i3)).f32572a != this) {
                i++;
            }
        }
        if (i < 2) {
            return false;
        }
        return true;
    }

    public boolean isDimensionResolved() {
        return this.f32603c.resolved;
    }

    public boolean isResolved() {
        return this.f32604d;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
    }

    public void updateRunCenter(Dependency dependency, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        float verticalBiasPercent;
        DependencyNode target = getTarget(constraintAnchor);
        DependencyNode target2 = getTarget(constraintAnchor2);
        if (target.resolved && target2.resolved) {
            int margin = target.value + constraintAnchor.getMargin();
            int margin2 = target2.value - constraintAnchor2.getMargin();
            int i2 = margin2 - margin;
            if (!this.f32603c.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                m58567c(i, i2);
            }
            C3703a c3703a = this.f32603c;
            if (!c3703a.resolved) {
                return;
            }
            if (c3703a.value == i2) {
                this.start.resolve(margin);
                this.end.resolve(margin2);
                return;
            }
            ConstraintWidget constraintWidget = this.f32601a;
            if (i == 0) {
                verticalBiasPercent = constraintWidget.getHorizontalBiasPercent();
            } else {
                verticalBiasPercent = constraintWidget.getVerticalBiasPercent();
            }
            if (target == target2) {
                margin = target.value;
                margin2 = target2.value;
                verticalBiasPercent = 0.5f;
            }
            this.start.resolve((int) (margin + 0.5f + (((margin2 - margin) - this.f32603c.value) * verticalBiasPercent)));
            this.end.resolve(this.start.value + this.f32603c.value);
        }
    }

    public void updateRunEnd(Dependency dependency) {
    }

    public void updateRunStart(Dependency dependency) {
    }

    public long wrapSize(int i) {
        int i2;
        C3703a c3703a = this.f32603c;
        if (c3703a.resolved) {
            long j = c3703a.value;
            if (isCenterConnection()) {
                i2 = this.start.f32574c - this.end.f32574c;
            } else if (i == 0) {
                i2 = this.start.f32574c;
            } else {
                return j - this.end.f32574c;
            }
            return j + i2;
        }
        return 0L;
    }

    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, C3703a c3703a) {
        dependencyNode.f32578g.add(dependencyNode2);
        dependencyNode.f32578g.add(this.f32603c);
        dependencyNode.f32575d = i;
        dependencyNode.f32576e = c3703a;
        dependencyNode2.f32577f.add(dependencyNode);
        c3703a.f32577f.add(dependencyNode);
    }

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor, int i) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        WidgetRun widgetRun = i == 0 ? constraintWidget.horizontalRun : constraintWidget.verticalRun;
        int i2 = C3702a.f32605a[constraintAnchor2.mType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.end;
        }
        return widgetRun.start;
    }
}
