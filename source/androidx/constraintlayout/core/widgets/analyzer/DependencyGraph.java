package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class DependencyGraph {

    /* renamed from: a */
    public ConstraintWidgetContainer f32563a;

    /* renamed from: d */
    public ConstraintWidgetContainer f32566d;

    /* renamed from: b */
    public boolean f32564b = true;

    /* renamed from: c */
    public boolean f32565c = true;

    /* renamed from: e */
    public ArrayList f32567e = new ArrayList();

    /* renamed from: f */
    public ArrayList f32568f = new ArrayList();

    /* renamed from: g */
    public BasicMeasure.Measurer f32569g = null;

    /* renamed from: h */
    public BasicMeasure.Measure f32570h = new BasicMeasure.Measure();

    /* renamed from: i */
    public ArrayList f32571i = new ArrayList();

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f32563a = constraintWidgetContainer;
        this.f32566d = constraintWidgetContainer;
    }

    /* renamed from: a */
    public final void m58589a(DependencyNode dependencyNode, int i, int i2, DependencyNode dependencyNode2, ArrayList arrayList, C21370oA1 c21370oA1) {
        WidgetRun widgetRun = dependencyNode.f32572a;
        if (widgetRun.f32602b == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.f32563a;
            if (widgetRun != constraintWidgetContainer.horizontalRun && widgetRun != constraintWidgetContainer.verticalRun) {
                if (c21370oA1 == null) {
                    c21370oA1 = new C21370oA1(widgetRun, i2);
                    arrayList.add(c21370oA1);
                }
                widgetRun.f32602b = c21370oA1;
                c21370oA1.m25953a(widgetRun);
                for (Dependency dependency : widgetRun.start.f32577f) {
                    if (dependency instanceof DependencyNode) {
                        m58589a((DependencyNode) dependency, i, 0, dependencyNode2, arrayList, c21370oA1);
                    }
                }
                for (Dependency dependency2 : widgetRun.end.f32577f) {
                    if (dependency2 instanceof DependencyNode) {
                        m58589a((DependencyNode) dependency2, i, 1, dependencyNode2, arrayList, c21370oA1);
                    }
                }
                if (i == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                    for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).baseline.f32577f) {
                        if (dependency3 instanceof DependencyNode) {
                            m58589a((DependencyNode) dependency3, i, 2, dependencyNode2, arrayList, c21370oA1);
                        }
                    }
                }
                for (DependencyNode dependencyNode3 : widgetRun.start.f32578g) {
                    if (dependencyNode3 == dependencyNode2) {
                        c21370oA1.f72589b = true;
                    }
                    m58589a(dependencyNode3, i, 0, dependencyNode2, arrayList, c21370oA1);
                }
                for (DependencyNode dependencyNode4 : widgetRun.end.f32578g) {
                    if (dependencyNode4 == dependencyNode2) {
                        c21370oA1.f72589b = true;
                    }
                    m58589a(dependencyNode4, i, 1, dependencyNode2, arrayList, c21370oA1);
                }
                if (i == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                    for (DependencyNode dependencyNode5 : ((VerticalWidgetRun) widgetRun).baseline.f32578g) {
                        m58589a(dependencyNode5, i, 2, dependencyNode2, arrayList, c21370oA1);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean m58588b(ConstraintWidgetContainer constraintWidgetContainer) {
        int i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        Iterator<ConstraintWidget> it = constraintWidgetContainer.mChildren.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.mListDimensionBehaviors;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[1];
            if (next.getVisibility() == 8) {
                next.measured = true;
            } else {
                if (next.mMatchConstraintPercentWidth < 1.0f && dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    next.mMatchConstraintDefaultWidth = 2;
                }
                if (next.mMatchConstraintPercentHeight < 1.0f && dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    next.mMatchConstraintDefaultHeight = 2;
                }
                if (next.getDimensionRatio() > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour5 == dimensionBehaviour7 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.mMatchConstraintDefaultWidth = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour7 && (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.mMatchConstraintDefaultHeight = 3;
                    } else if (dimensionBehaviour5 == dimensionBehaviour7 && dimensionBehaviour6 == dimensionBehaviour7) {
                        if (next.mMatchConstraintDefaultWidth == 0) {
                            next.mMatchConstraintDefaultWidth = 3;
                        }
                        if (next.mMatchConstraintDefaultHeight == 0) {
                            next.mMatchConstraintDefaultHeight = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour5 == dimensionBehaviour8 && next.mMatchConstraintDefaultWidth == 1 && (next.mLeft.mTarget == null || next.mRight.mTarget == null)) {
                    dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviour5;
                if (dimensionBehaviour6 == dimensionBehaviour8 && next.mMatchConstraintDefaultHeight == 1 && (next.mTop.mTarget == null || next.mBottom.mTarget == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviour6;
                HorizontalWidgetRun horizontalWidgetRun = next.horizontalRun;
                horizontalWidgetRun.dimensionBehavior = dimensionBehaviour9;
                int i3 = next.mMatchConstraintDefaultWidth;
                horizontalWidgetRun.matchConstraintsType = i3;
                VerticalWidgetRun verticalWidgetRun = next.verticalRun;
                verticalWidgetRun.dimensionBehavior = dimensionBehaviour10;
                int i4 = next.mMatchConstraintDefaultHeight;
                verticalWidgetRun.matchConstraintsType = i4;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour9 != dimensionBehaviour11 && dimensionBehaviour9 != ConstraintWidget.DimensionBehaviour.FIXED && dimensionBehaviour9 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour10 != dimensionBehaviour11 && dimensionBehaviour10 != ConstraintWidget.DimensionBehaviour.FIXED && dimensionBehaviour10 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    if (dimensionBehaviour9 == dimensionBehaviour8 && (dimensionBehaviour10 == (dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i3 == 3) {
                            if (dimensionBehaviour10 == dimensionBehaviour4) {
                                m58585e(next, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            }
                            int height = next.getHeight();
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                            m58585e(next, dimensionBehaviour12, (int) ((height * next.mDimensionRatio) + 0.5f), dimensionBehaviour12, height);
                            next.horizontalRun.f32603c.resolve(next.getWidth());
                            next.verticalRun.f32603c.resolve(next.getHeight());
                            next.measured = true;
                        } else if (i3 == 1) {
                            m58585e(next, dimensionBehaviour4, 0, dimensionBehaviour10, 0);
                            next.horizontalRun.f32603c.f32606h = next.getWidth();
                        } else if (i3 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = constraintWidgetContainer.mListDimensionBehaviors[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour13 == dimensionBehaviour14 || dimensionBehaviour13 == dimensionBehaviour11) {
                                m58585e(next, dimensionBehaviour14, (int) ((next.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + 0.5f), dimensionBehaviour10, next.getHeight());
                                next.horizontalRun.f32603c.resolve(next.getWidth());
                                next.verticalRun.f32603c.resolve(next.getHeight());
                                next.measured = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = next.mListAnchors;
                            if (constraintAnchorArr[0].mTarget == null || constraintAnchorArr[1].mTarget == null) {
                                m58585e(next, dimensionBehaviour4, 0, dimensionBehaviour10, 0);
                                next.horizontalRun.f32603c.resolve(next.getWidth());
                                next.verticalRun.f32603c.resolve(next.getHeight());
                                next.measured = true;
                            }
                        }
                    }
                    if (dimensionBehaviour10 == dimensionBehaviour8 && (dimensionBehaviour9 == (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i4 == 3) {
                            if (dimensionBehaviour9 == dimensionBehaviour3) {
                                m58585e(next, dimensionBehaviour3, 0, dimensionBehaviour3, 0);
                            }
                            int width = next.getWidth();
                            float f = next.mDimensionRatio;
                            if (next.getDimensionRatioSide() == -1) {
                                f = 1.0f / f;
                            }
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.FIXED;
                            m58585e(next, dimensionBehaviour15, width, dimensionBehaviour15, (int) ((width * f) + 0.5f));
                            next.horizontalRun.f32603c.resolve(next.getWidth());
                            next.verticalRun.f32603c.resolve(next.getHeight());
                            next.measured = true;
                        } else if (i4 == 1) {
                            m58585e(next, dimensionBehaviour9, 0, dimensionBehaviour3, 0);
                            next.verticalRun.f32603c.f32606h = next.getHeight();
                        } else if (i4 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = constraintWidgetContainer.mListDimensionBehaviors[1];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour16 == dimensionBehaviour17 || dimensionBehaviour16 == dimensionBehaviour11) {
                                m58585e(next, dimensionBehaviour9, next.getWidth(), dimensionBehaviour17, (int) ((next.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + 0.5f));
                                next.horizontalRun.f32603c.resolve(next.getWidth());
                                next.verticalRun.f32603c.resolve(next.getHeight());
                                next.measured = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr2 = next.mListAnchors;
                            if (constraintAnchorArr2[2].mTarget == null || constraintAnchorArr2[3].mTarget == null) {
                                m58585e(next, dimensionBehaviour3, 0, dimensionBehaviour10, 0);
                                next.horizontalRun.f32603c.resolve(next.getWidth());
                                next.verticalRun.f32603c.resolve(next.getHeight());
                                next.measured = true;
                            }
                        }
                    }
                    if (dimensionBehaviour9 == dimensionBehaviour8 && dimensionBehaviour10 == dimensionBehaviour8) {
                        if (i3 != 1 && i4 != 1) {
                            if (i4 == 2 && i3 == 2) {
                                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidgetContainer.mListDimensionBehaviors;
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = dimensionBehaviourArr2[0];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour18 == dimensionBehaviour19 && dimensionBehaviourArr2[1] == dimensionBehaviour19) {
                                    m58585e(next, dimensionBehaviour19, (int) ((next.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + 0.5f), dimensionBehaviour19, (int) ((next.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + 0.5f));
                                    next.horizontalRun.f32603c.resolve(next.getWidth());
                                    next.verticalRun.f32603c.resolve(next.getHeight());
                                    next.measured = true;
                                }
                            }
                        } else {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            m58585e(next, dimensionBehaviour20, 0, dimensionBehaviour20, 0);
                            next.horizontalRun.f32603c.f32606h = next.getWidth();
                            next.verticalRun.f32603c.f32606h = next.getHeight();
                        }
                    }
                } else {
                    int width2 = next.getWidth();
                    if (dimensionBehaviour9 == dimensionBehaviour11) {
                        i = (constraintWidgetContainer.getWidth() - next.mLeft.mMargin) - next.mRight.mMargin;
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        i = width2;
                        dimensionBehaviour = dimensionBehaviour9;
                    }
                    int height2 = next.getHeight();
                    if (dimensionBehaviour10 == dimensionBehaviour11) {
                        i2 = (constraintWidgetContainer.getHeight() - next.mTop.mMargin) - next.mBottom.mMargin;
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        i2 = height2;
                        dimensionBehaviour2 = dimensionBehaviour10;
                    }
                    m58585e(next, dimensionBehaviour, i, dimensionBehaviour2, i2);
                    next.horizontalRun.f32603c.resolve(next.getWidth());
                    next.verticalRun.f32603c.resolve(next.getHeight());
                    next.measured = true;
                }
            }
        }
        return false;
    }

    public void buildGraph() {
        buildGraph(this.f32567e);
        this.f32571i.clear();
        C21370oA1.f72587h = 0;
        m58586d(this.f32563a.horizontalRun, 0, this.f32571i);
        m58586d(this.f32563a.verticalRun, 1, this.f32571i);
        this.f32564b = false;
    }

    /* renamed from: c */
    public final int m58587c(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        int size = this.f32571i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, ((C21370oA1) this.f32571i.get(i2)).m25952b(constraintWidgetContainer, i));
        }
        return (int) j;
    }

    /* renamed from: d */
    public final void m58586d(WidgetRun widgetRun, int i, ArrayList arrayList) {
        for (Dependency dependency : widgetRun.start.f32577f) {
            if (dependency instanceof DependencyNode) {
                m58589a((DependencyNode) dependency, i, 0, widgetRun.end, arrayList, null);
            } else if (dependency instanceof WidgetRun) {
                m58589a(((WidgetRun) dependency).start, i, 0, widgetRun.end, arrayList, null);
            }
        }
        for (Dependency dependency2 : widgetRun.end.f32577f) {
            if (dependency2 instanceof DependencyNode) {
                m58589a((DependencyNode) dependency2, i, 1, widgetRun.start, arrayList, null);
            } else if (dependency2 instanceof WidgetRun) {
                m58589a(((WidgetRun) dependency2).end, i, 1, widgetRun.start, arrayList, null);
            }
        }
        if (i == 1) {
            for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).baseline.f32577f) {
                if (dependency3 instanceof DependencyNode) {
                    m58589a((DependencyNode) dependency3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    public void defineTerminalWidgets(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2) {
        boolean z;
        boolean z2;
        if (this.f32564b) {
            buildGraph();
            Iterator<ConstraintWidget> it = this.f32563a.mChildren.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                boolean[] zArr = next.isTerminalWidget;
                zArr[0] = true;
                zArr[1] = true;
                if (next instanceof Barrier) {
                    z3 = true;
                }
            }
            if (!z3) {
                Iterator it2 = this.f32571i.iterator();
                while (it2.hasNext()) {
                    C21370oA1 c21370oA1 = (C21370oA1) it2.next();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c21370oA1.m25950d(z, z2);
                }
            }
        }
    }

    public boolean directMeasure(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.f32564b || this.f32565c) {
            Iterator<ConstraintWidget> it = this.f32563a.mChildren.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.ensureWidgetRuns();
                next.measured = false;
                next.horizontalRun.m58573f();
                next.verticalRun.m58572e();
            }
            this.f32563a.ensureWidgetRuns();
            ConstraintWidgetContainer constraintWidgetContainer = this.f32563a;
            constraintWidgetContainer.measured = false;
            constraintWidgetContainer.horizontalRun.m58573f();
            this.f32563a.verticalRun.m58572e();
            this.f32565c = false;
        }
        if (m58588b(this.f32566d)) {
            return false;
        }
        this.f32563a.setX(0);
        this.f32563a.setY(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f32563a.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f32563a.getDimensionBehaviour(1);
        if (this.f32564b) {
            buildGraph();
        }
        int x = this.f32563a.getX();
        int y = this.f32563a.getY();
        this.f32563a.horizontalRun.start.resolve(x);
        this.f32563a.verticalRun.start.resolve(y);
        measureWidgets();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour3 || dimensionBehaviour2 == dimensionBehaviour3) {
            if (z) {
                Iterator it2 = this.f32567e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!((WidgetRun) it2.next()).mo30666d()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f32563a.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer2 = this.f32563a;
                constraintWidgetContainer2.setWidth(m58587c(constraintWidgetContainer2, 0));
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f32563a;
                constraintWidgetContainer3.horizontalRun.f32603c.resolve(constraintWidgetContainer3.getWidth());
            }
            if (z && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f32563a.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer4 = this.f32563a;
                constraintWidgetContainer4.setHeight(m58587c(constraintWidgetContainer4, 1));
                ConstraintWidgetContainer constraintWidgetContainer5 = this.f32563a;
                constraintWidgetContainer5.verticalRun.f32603c.resolve(constraintWidgetContainer5.getHeight());
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer6 = this.f32563a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer6.mListDimensionBehaviors[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour4 != dimensionBehaviour5 && dimensionBehaviour4 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            z2 = false;
        } else {
            int width = constraintWidgetContainer6.getWidth() + x;
            this.f32563a.horizontalRun.end.resolve(width);
            this.f32563a.horizontalRun.f32603c.resolve(width - x);
            measureWidgets();
            ConstraintWidgetContainer constraintWidgetContainer7 = this.f32563a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidgetContainer7.mListDimensionBehaviors[1];
            if (dimensionBehaviour6 == dimensionBehaviour5 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = constraintWidgetContainer7.getHeight() + y;
                this.f32563a.verticalRun.end.resolve(height);
                this.f32563a.verticalRun.f32603c.resolve(height - y);
            }
            measureWidgets();
            z2 = true;
        }
        Iterator it3 = this.f32567e.iterator();
        while (it3.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it3.next();
            if (widgetRun.f32601a != this.f32563a || widgetRun.f32604d) {
                widgetRun.applyToWidget();
            }
        }
        Iterator it4 = this.f32567e.iterator();
        while (true) {
            if (it4.hasNext()) {
                WidgetRun widgetRun2 = (WidgetRun) it4.next();
                if (z2 || widgetRun2.f32601a != this.f32563a) {
                    if (!widgetRun2.start.resolved) {
                        break;
                    }
                    if (!widgetRun2.end.resolved) {
                        if (!(widgetRun2 instanceof C20328i70)) {
                            break;
                        }
                    }
                    if (!widgetRun2.f32603c.resolved && !(widgetRun2 instanceof ChainRun) && !(widgetRun2 instanceof C20328i70)) {
                        break;
                    }
                }
            } else {
                z3 = true;
                break;
            }
        }
        this.f32563a.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.f32563a.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z3;
    }

    public boolean directMeasureSetup(boolean z) {
        if (this.f32564b) {
            Iterator<ConstraintWidget> it = this.f32563a.mChildren.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.ensureWidgetRuns();
                next.measured = false;
                HorizontalWidgetRun horizontalWidgetRun = next.horizontalRun;
                horizontalWidgetRun.f32603c.resolved = false;
                horizontalWidgetRun.f32604d = false;
                horizontalWidgetRun.m58573f();
                VerticalWidgetRun verticalWidgetRun = next.verticalRun;
                verticalWidgetRun.f32603c.resolved = false;
                verticalWidgetRun.f32604d = false;
                verticalWidgetRun.m58572e();
            }
            this.f32563a.ensureWidgetRuns();
            ConstraintWidgetContainer constraintWidgetContainer = this.f32563a;
            constraintWidgetContainer.measured = false;
            HorizontalWidgetRun horizontalWidgetRun2 = constraintWidgetContainer.horizontalRun;
            horizontalWidgetRun2.f32603c.resolved = false;
            horizontalWidgetRun2.f32604d = false;
            horizontalWidgetRun2.m58573f();
            VerticalWidgetRun verticalWidgetRun2 = this.f32563a.verticalRun;
            verticalWidgetRun2.f32603c.resolved = false;
            verticalWidgetRun2.f32604d = false;
            verticalWidgetRun2.m58572e();
            buildGraph();
        }
        if (m58588b(this.f32566d)) {
            return false;
        }
        this.f32563a.setX(0);
        this.f32563a.setY(0);
        this.f32563a.horizontalRun.start.resolve(0);
        this.f32563a.verticalRun.start.resolve(0);
        return true;
    }

    public boolean directMeasureWithOrientation(boolean z, int i) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z3 = false;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f32563a.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = this.f32563a.getDimensionBehaviour(1);
        int x = this.f32563a.getX();
        int y = this.f32563a.getY();
        if (z && (dimensionBehaviour2 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour3 == dimensionBehaviour)) {
            Iterator it = this.f32567e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WidgetRun widgetRun = (WidgetRun) it.next();
                if (widgetRun.orientation == i && !widgetRun.mo30666d()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.f32563a.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                    ConstraintWidgetContainer constraintWidgetContainer = this.f32563a;
                    constraintWidgetContainer.setWidth(m58587c(constraintWidgetContainer, 0));
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.f32563a;
                    constraintWidgetContainer2.horizontalRun.f32603c.resolve(constraintWidgetContainer2.getWidth());
                }
            } else if (z && dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f32563a.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f32563a;
                constraintWidgetContainer3.setHeight(m58587c(constraintWidgetContainer3, 1));
                ConstraintWidgetContainer constraintWidgetContainer4 = this.f32563a;
                constraintWidgetContainer4.verticalRun.f32603c.resolve(constraintWidgetContainer4.getHeight());
            }
        }
        if (i == 0) {
            ConstraintWidgetContainer constraintWidgetContainer5 = this.f32563a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer5.mListDimensionBehaviors[0];
            if (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int width = constraintWidgetContainer5.getWidth() + x;
                this.f32563a.horizontalRun.end.resolve(width);
                this.f32563a.horizontalRun.f32603c.resolve(width - x);
                z2 = true;
            }
            z2 = false;
        } else {
            ConstraintWidgetContainer constraintWidgetContainer6 = this.f32563a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidgetContainer6.mListDimensionBehaviors[1];
            if (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = constraintWidgetContainer6.getHeight() + y;
                this.f32563a.verticalRun.end.resolve(height);
                this.f32563a.verticalRun.f32603c.resolve(height - y);
                z2 = true;
            }
            z2 = false;
        }
        measureWidgets();
        Iterator it2 = this.f32567e.iterator();
        while (it2.hasNext()) {
            WidgetRun widgetRun2 = (WidgetRun) it2.next();
            if (widgetRun2.orientation == i && (widgetRun2.f32601a != this.f32563a || widgetRun2.f32604d)) {
                widgetRun2.applyToWidget();
            }
        }
        Iterator it3 = this.f32567e.iterator();
        while (true) {
            if (it3.hasNext()) {
                WidgetRun widgetRun3 = (WidgetRun) it3.next();
                if (widgetRun3.orientation == i && (z2 || widgetRun3.f32601a != this.f32563a)) {
                    if (!widgetRun3.start.resolved) {
                        break;
                    } else if (!widgetRun3.end.resolved) {
                        break;
                    } else if (!(widgetRun3 instanceof ChainRun) && !widgetRun3.f32603c.resolved) {
                        break;
                    }
                }
            } else {
                z3 = true;
                break;
            }
        }
        this.f32563a.setHorizontalDimensionBehaviour(dimensionBehaviour2);
        this.f32563a.setVerticalDimensionBehaviour(dimensionBehaviour3);
        return z3;
    }

    /* renamed from: e */
    public final void m58585e(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        BasicMeasure.Measure measure = this.f32570h;
        measure.horizontalBehavior = dimensionBehaviour;
        measure.verticalBehavior = dimensionBehaviour2;
        measure.horizontalDimension = i;
        measure.verticalDimension = i2;
        this.f32569g.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.f32570h.measuredWidth);
        constraintWidget.setHeight(this.f32570h.measuredHeight);
        constraintWidget.setHasBaseline(this.f32570h.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.f32570h.measuredBaseline);
    }

    public void invalidateGraph() {
        this.f32564b = true;
    }

    public void invalidateMeasures() {
        this.f32565c = true;
    }

    public void measureWidgets() {
        boolean z;
        C3703a c3703a;
        Iterator<ConstraintWidget> it = this.f32563a.mChildren.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.measured) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.mListDimensionBehaviors;
                boolean z2 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = next.mMatchConstraintDefaultWidth;
                int i2 = next.mMatchConstraintDefaultHeight;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour != dimensionBehaviour3 && (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || i != 1)) {
                    z = false;
                } else {
                    z = true;
                }
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z2 = true;
                }
                C3703a c3703a2 = next.horizontalRun.f32603c;
                boolean z3 = c3703a2.resolved;
                C3703a c3703a3 = next.verticalRun.f32603c;
                boolean z4 = c3703a3.resolved;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    m58585e(next, dimensionBehaviour4, c3703a2.value, dimensionBehaviour4, c3703a3.value);
                    next.measured = true;
                } else if (z3 && z2) {
                    m58585e(next, ConstraintWidget.DimensionBehaviour.FIXED, c3703a2.value, dimensionBehaviour3, c3703a3.value);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.verticalRun.f32603c.f32606h = next.getHeight();
                    } else {
                        next.verticalRun.f32603c.resolve(next.getHeight());
                        next.measured = true;
                    }
                } else if (z4 && z) {
                    m58585e(next, dimensionBehaviour3, c3703a2.value, ConstraintWidget.DimensionBehaviour.FIXED, c3703a3.value);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.horizontalRun.f32603c.f32606h = next.getWidth();
                    } else {
                        next.horizontalRun.f32603c.resolve(next.getWidth());
                        next.measured = true;
                    }
                }
                if (next.measured && (c3703a = next.verticalRun.f32584e) != null) {
                    c3703a.resolve(next.getBaselineDistance());
                }
            }
        }
    }

    public void setMeasurer(BasicMeasure.Measurer measurer) {
        this.f32569g = measurer;
    }

    public void buildGraph(ArrayList<WidgetRun> arrayList) {
        arrayList.clear();
        this.f32566d.horizontalRun.mo30667b();
        this.f32566d.verticalRun.mo30667b();
        arrayList.add(this.f32566d.horizontalRun);
        arrayList.add(this.f32566d.verticalRun);
        Iterator<ConstraintWidget> it = this.f32566d.mChildren.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof Guideline) {
                arrayList.add(new C20328i70(next));
            } else {
                if (next.isInHorizontalChain()) {
                    if (next.horizontalChainRun == null) {
                        next.horizontalChainRun = new ChainRun(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.horizontalChainRun);
                } else {
                    arrayList.add(next.horizontalRun);
                }
                if (next.isInVerticalChain()) {
                    if (next.verticalChainRun == null) {
                        next.verticalChainRun = new ChainRun(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.verticalChainRun);
                } else {
                    arrayList.add(next.verticalRun);
                }
                if (next instanceof HelperWidget) {
                    arrayList.add(new C3704b(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo30667b();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.f32601a != this.f32566d) {
                next2.mo30668a();
            }
        }
    }
}
