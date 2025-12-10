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
    public ConstraintWidgetContainer f32651a;

    /* renamed from: d */
    public ConstraintWidgetContainer f32654d;

    /* renamed from: b */
    public boolean f32652b = true;

    /* renamed from: c */
    public boolean f32653c = true;

    /* renamed from: e */
    public ArrayList f32655e = new ArrayList();

    /* renamed from: f */
    public ArrayList f32656f = new ArrayList();

    /* renamed from: g */
    public BasicMeasure.Measurer f32657g = null;

    /* renamed from: h */
    public BasicMeasure.Measure f32658h = new BasicMeasure.Measure();

    /* renamed from: i */
    public ArrayList f32659i = new ArrayList();

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f32651a = constraintWidgetContainer;
        this.f32654d = constraintWidgetContainer;
    }

    /* renamed from: a */
    public final void m58539a(DependencyNode dependencyNode, int i, int i2, DependencyNode dependencyNode2, ArrayList arrayList, C20914lB1 c20914lB1) {
        WidgetRun widgetRun = dependencyNode.f32660a;
        if (widgetRun.f32690b == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.f32651a;
            if (widgetRun != constraintWidgetContainer.horizontalRun && widgetRun != constraintWidgetContainer.verticalRun) {
                if (c20914lB1 == null) {
                    c20914lB1 = new C20914lB1(widgetRun, i2);
                    arrayList.add(c20914lB1);
                }
                widgetRun.f32690b = c20914lB1;
                c20914lB1.m26852a(widgetRun);
                for (Dependency dependency : widgetRun.start.f32665f) {
                    if (dependency instanceof DependencyNode) {
                        m58539a((DependencyNode) dependency, i, 0, dependencyNode2, arrayList, c20914lB1);
                    }
                }
                for (Dependency dependency2 : widgetRun.end.f32665f) {
                    if (dependency2 instanceof DependencyNode) {
                        m58539a((DependencyNode) dependency2, i, 1, dependencyNode2, arrayList, c20914lB1);
                    }
                }
                if (i == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                    for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).baseline.f32665f) {
                        if (dependency3 instanceof DependencyNode) {
                            m58539a((DependencyNode) dependency3, i, 2, dependencyNode2, arrayList, c20914lB1);
                        }
                    }
                }
                for (DependencyNode dependencyNode3 : widgetRun.start.f32666g) {
                    if (dependencyNode3 == dependencyNode2) {
                        c20914lB1.f71613b = true;
                    }
                    m58539a(dependencyNode3, i, 0, dependencyNode2, arrayList, c20914lB1);
                }
                for (DependencyNode dependencyNode4 : widgetRun.end.f32666g) {
                    if (dependencyNode4 == dependencyNode2) {
                        c20914lB1.f71613b = true;
                    }
                    m58539a(dependencyNode4, i, 1, dependencyNode2, arrayList, c20914lB1);
                }
                if (i == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                    for (DependencyNode dependencyNode5 : ((VerticalWidgetRun) widgetRun).baseline.f32666g) {
                        m58539a(dependencyNode5, i, 2, dependencyNode2, arrayList, c20914lB1);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean m58538b(ConstraintWidgetContainer constraintWidgetContainer) {
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
                                m58535e(next, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            }
                            int height = next.getHeight();
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                            m58535e(next, dimensionBehaviour12, (int) ((height * next.mDimensionRatio) + 0.5f), dimensionBehaviour12, height);
                            next.horizontalRun.f32691c.resolve(next.getWidth());
                            next.verticalRun.f32691c.resolve(next.getHeight());
                            next.measured = true;
                        } else if (i3 == 1) {
                            m58535e(next, dimensionBehaviour4, 0, dimensionBehaviour10, 0);
                            next.horizontalRun.f32691c.f32694h = next.getWidth();
                        } else if (i3 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = constraintWidgetContainer.mListDimensionBehaviors[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour13 == dimensionBehaviour14 || dimensionBehaviour13 == dimensionBehaviour11) {
                                m58535e(next, dimensionBehaviour14, (int) ((next.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + 0.5f), dimensionBehaviour10, next.getHeight());
                                next.horizontalRun.f32691c.resolve(next.getWidth());
                                next.verticalRun.f32691c.resolve(next.getHeight());
                                next.measured = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = next.mListAnchors;
                            if (constraintAnchorArr[0].mTarget == null || constraintAnchorArr[1].mTarget == null) {
                                m58535e(next, dimensionBehaviour4, 0, dimensionBehaviour10, 0);
                                next.horizontalRun.f32691c.resolve(next.getWidth());
                                next.verticalRun.f32691c.resolve(next.getHeight());
                                next.measured = true;
                            }
                        }
                    }
                    if (dimensionBehaviour10 == dimensionBehaviour8 && (dimensionBehaviour9 == (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i4 == 3) {
                            if (dimensionBehaviour9 == dimensionBehaviour3) {
                                m58535e(next, dimensionBehaviour3, 0, dimensionBehaviour3, 0);
                            }
                            int width = next.getWidth();
                            float f = next.mDimensionRatio;
                            if (next.getDimensionRatioSide() == -1) {
                                f = 1.0f / f;
                            }
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.FIXED;
                            m58535e(next, dimensionBehaviour15, width, dimensionBehaviour15, (int) ((width * f) + 0.5f));
                            next.horizontalRun.f32691c.resolve(next.getWidth());
                            next.verticalRun.f32691c.resolve(next.getHeight());
                            next.measured = true;
                        } else if (i4 == 1) {
                            m58535e(next, dimensionBehaviour9, 0, dimensionBehaviour3, 0);
                            next.verticalRun.f32691c.f32694h = next.getHeight();
                        } else if (i4 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = constraintWidgetContainer.mListDimensionBehaviors[1];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour16 == dimensionBehaviour17 || dimensionBehaviour16 == dimensionBehaviour11) {
                                m58535e(next, dimensionBehaviour9, next.getWidth(), dimensionBehaviour17, (int) ((next.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + 0.5f));
                                next.horizontalRun.f32691c.resolve(next.getWidth());
                                next.verticalRun.f32691c.resolve(next.getHeight());
                                next.measured = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr2 = next.mListAnchors;
                            if (constraintAnchorArr2[2].mTarget == null || constraintAnchorArr2[3].mTarget == null) {
                                m58535e(next, dimensionBehaviour3, 0, dimensionBehaviour10, 0);
                                next.horizontalRun.f32691c.resolve(next.getWidth());
                                next.verticalRun.f32691c.resolve(next.getHeight());
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
                                    m58535e(next, dimensionBehaviour19, (int) ((next.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + 0.5f), dimensionBehaviour19, (int) ((next.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + 0.5f));
                                    next.horizontalRun.f32691c.resolve(next.getWidth());
                                    next.verticalRun.f32691c.resolve(next.getHeight());
                                    next.measured = true;
                                }
                            }
                        } else {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            m58535e(next, dimensionBehaviour20, 0, dimensionBehaviour20, 0);
                            next.horizontalRun.f32691c.f32694h = next.getWidth();
                            next.verticalRun.f32691c.f32694h = next.getHeight();
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
                    m58535e(next, dimensionBehaviour, i, dimensionBehaviour2, i2);
                    next.horizontalRun.f32691c.resolve(next.getWidth());
                    next.verticalRun.f32691c.resolve(next.getHeight());
                    next.measured = true;
                }
            }
        }
        return false;
    }

    public void buildGraph() {
        buildGraph(this.f32655e);
        this.f32659i.clear();
        C20914lB1.f71611h = 0;
        m58536d(this.f32651a.horizontalRun, 0, this.f32659i);
        m58536d(this.f32651a.verticalRun, 1, this.f32659i);
        this.f32652b = false;
    }

    /* renamed from: c */
    public final int m58537c(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        int size = this.f32659i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, ((C20914lB1) this.f32659i.get(i2)).m26851b(constraintWidgetContainer, i));
        }
        return (int) j;
    }

    /* renamed from: d */
    public final void m58536d(WidgetRun widgetRun, int i, ArrayList arrayList) {
        for (Dependency dependency : widgetRun.start.f32665f) {
            if (dependency instanceof DependencyNode) {
                m58539a((DependencyNode) dependency, i, 0, widgetRun.end, arrayList, null);
            } else if (dependency instanceof WidgetRun) {
                m58539a(((WidgetRun) dependency).start, i, 0, widgetRun.end, arrayList, null);
            }
        }
        for (Dependency dependency2 : widgetRun.end.f32665f) {
            if (dependency2 instanceof DependencyNode) {
                m58539a((DependencyNode) dependency2, i, 1, widgetRun.start, arrayList, null);
            } else if (dependency2 instanceof WidgetRun) {
                m58539a(((WidgetRun) dependency2).end, i, 1, widgetRun.start, arrayList, null);
            }
        }
        if (i == 1) {
            for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).baseline.f32665f) {
                if (dependency3 instanceof DependencyNode) {
                    m58539a((DependencyNode) dependency3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    public void defineTerminalWidgets(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2) {
        boolean z;
        boolean z2;
        if (this.f32652b) {
            buildGraph();
            Iterator<ConstraintWidget> it = this.f32651a.mChildren.iterator();
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
                Iterator it2 = this.f32659i.iterator();
                while (it2.hasNext()) {
                    C20914lB1 c20914lB1 = (C20914lB1) it2.next();
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
                    c20914lB1.m26849d(z, z2);
                }
            }
        }
    }

    public boolean directMeasure(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.f32652b || this.f32653c) {
            Iterator<ConstraintWidget> it = this.f32651a.mChildren.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.ensureWidgetRuns();
                next.measured = false;
                next.horizontalRun.m58523f();
                next.verticalRun.m58522e();
            }
            this.f32651a.ensureWidgetRuns();
            ConstraintWidgetContainer constraintWidgetContainer = this.f32651a;
            constraintWidgetContainer.measured = false;
            constraintWidgetContainer.horizontalRun.m58523f();
            this.f32651a.verticalRun.m58522e();
            this.f32653c = false;
        }
        if (m58538b(this.f32654d)) {
            return false;
        }
        this.f32651a.setX(0);
        this.f32651a.setY(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f32651a.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f32651a.getDimensionBehaviour(1);
        if (this.f32652b) {
            buildGraph();
        }
        int x = this.f32651a.getX();
        int y = this.f32651a.getY();
        this.f32651a.horizontalRun.start.resolve(x);
        this.f32651a.verticalRun.start.resolve(y);
        measureWidgets();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour3 || dimensionBehaviour2 == dimensionBehaviour3) {
            if (z) {
                Iterator it2 = this.f32655e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!((WidgetRun) it2.next()).mo26153d()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f32651a.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer2 = this.f32651a;
                constraintWidgetContainer2.setWidth(m58537c(constraintWidgetContainer2, 0));
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f32651a;
                constraintWidgetContainer3.horizontalRun.f32691c.resolve(constraintWidgetContainer3.getWidth());
            }
            if (z && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f32651a.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer4 = this.f32651a;
                constraintWidgetContainer4.setHeight(m58537c(constraintWidgetContainer4, 1));
                ConstraintWidgetContainer constraintWidgetContainer5 = this.f32651a;
                constraintWidgetContainer5.verticalRun.f32691c.resolve(constraintWidgetContainer5.getHeight());
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer6 = this.f32651a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer6.mListDimensionBehaviors[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour4 != dimensionBehaviour5 && dimensionBehaviour4 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            z2 = false;
        } else {
            int width = constraintWidgetContainer6.getWidth() + x;
            this.f32651a.horizontalRun.end.resolve(width);
            this.f32651a.horizontalRun.f32691c.resolve(width - x);
            measureWidgets();
            ConstraintWidgetContainer constraintWidgetContainer7 = this.f32651a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidgetContainer7.mListDimensionBehaviors[1];
            if (dimensionBehaviour6 == dimensionBehaviour5 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = constraintWidgetContainer7.getHeight() + y;
                this.f32651a.verticalRun.end.resolve(height);
                this.f32651a.verticalRun.f32691c.resolve(height - y);
            }
            measureWidgets();
            z2 = true;
        }
        Iterator it3 = this.f32655e.iterator();
        while (it3.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it3.next();
            if (widgetRun.f32689a != this.f32651a || widgetRun.f32692d) {
                widgetRun.applyToWidget();
            }
        }
        Iterator it4 = this.f32655e.iterator();
        while (true) {
            if (it4.hasNext()) {
                WidgetRun widgetRun2 = (WidgetRun) it4.next();
                if (z2 || widgetRun2.f32689a != this.f32651a) {
                    if (!widgetRun2.start.resolved) {
                        break;
                    }
                    if (!widgetRun2.end.resolved) {
                        if (!(widgetRun2 instanceof C21420o70)) {
                            break;
                        }
                    }
                    if (!widgetRun2.f32691c.resolved && !(widgetRun2 instanceof ChainRun) && !(widgetRun2 instanceof C21420o70)) {
                        break;
                    }
                }
            } else {
                z3 = true;
                break;
            }
        }
        this.f32651a.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.f32651a.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z3;
    }

    public boolean directMeasureSetup(boolean z) {
        if (this.f32652b) {
            Iterator<ConstraintWidget> it = this.f32651a.mChildren.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.ensureWidgetRuns();
                next.measured = false;
                HorizontalWidgetRun horizontalWidgetRun = next.horizontalRun;
                horizontalWidgetRun.f32691c.resolved = false;
                horizontalWidgetRun.f32692d = false;
                horizontalWidgetRun.m58523f();
                VerticalWidgetRun verticalWidgetRun = next.verticalRun;
                verticalWidgetRun.f32691c.resolved = false;
                verticalWidgetRun.f32692d = false;
                verticalWidgetRun.m58522e();
            }
            this.f32651a.ensureWidgetRuns();
            ConstraintWidgetContainer constraintWidgetContainer = this.f32651a;
            constraintWidgetContainer.measured = false;
            HorizontalWidgetRun horizontalWidgetRun2 = constraintWidgetContainer.horizontalRun;
            horizontalWidgetRun2.f32691c.resolved = false;
            horizontalWidgetRun2.f32692d = false;
            horizontalWidgetRun2.m58523f();
            VerticalWidgetRun verticalWidgetRun2 = this.f32651a.verticalRun;
            verticalWidgetRun2.f32691c.resolved = false;
            verticalWidgetRun2.f32692d = false;
            verticalWidgetRun2.m58522e();
            buildGraph();
        }
        if (m58538b(this.f32654d)) {
            return false;
        }
        this.f32651a.setX(0);
        this.f32651a.setY(0);
        this.f32651a.horizontalRun.start.resolve(0);
        this.f32651a.verticalRun.start.resolve(0);
        return true;
    }

    public boolean directMeasureWithOrientation(boolean z, int i) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z3 = false;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f32651a.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = this.f32651a.getDimensionBehaviour(1);
        int x = this.f32651a.getX();
        int y = this.f32651a.getY();
        if (z && (dimensionBehaviour2 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour3 == dimensionBehaviour)) {
            Iterator it = this.f32655e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WidgetRun widgetRun = (WidgetRun) it.next();
                if (widgetRun.orientation == i && !widgetRun.mo26153d()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.f32651a.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                    ConstraintWidgetContainer constraintWidgetContainer = this.f32651a;
                    constraintWidgetContainer.setWidth(m58537c(constraintWidgetContainer, 0));
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.f32651a;
                    constraintWidgetContainer2.horizontalRun.f32691c.resolve(constraintWidgetContainer2.getWidth());
                }
            } else if (z && dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f32651a.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f32651a;
                constraintWidgetContainer3.setHeight(m58537c(constraintWidgetContainer3, 1));
                ConstraintWidgetContainer constraintWidgetContainer4 = this.f32651a;
                constraintWidgetContainer4.verticalRun.f32691c.resolve(constraintWidgetContainer4.getHeight());
            }
        }
        if (i == 0) {
            ConstraintWidgetContainer constraintWidgetContainer5 = this.f32651a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer5.mListDimensionBehaviors[0];
            if (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int width = constraintWidgetContainer5.getWidth() + x;
                this.f32651a.horizontalRun.end.resolve(width);
                this.f32651a.horizontalRun.f32691c.resolve(width - x);
                z2 = true;
            }
            z2 = false;
        } else {
            ConstraintWidgetContainer constraintWidgetContainer6 = this.f32651a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidgetContainer6.mListDimensionBehaviors[1];
            if (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = constraintWidgetContainer6.getHeight() + y;
                this.f32651a.verticalRun.end.resolve(height);
                this.f32651a.verticalRun.f32691c.resolve(height - y);
                z2 = true;
            }
            z2 = false;
        }
        measureWidgets();
        Iterator it2 = this.f32655e.iterator();
        while (it2.hasNext()) {
            WidgetRun widgetRun2 = (WidgetRun) it2.next();
            if (widgetRun2.orientation == i && (widgetRun2.f32689a != this.f32651a || widgetRun2.f32692d)) {
                widgetRun2.applyToWidget();
            }
        }
        Iterator it3 = this.f32655e.iterator();
        while (true) {
            if (it3.hasNext()) {
                WidgetRun widgetRun3 = (WidgetRun) it3.next();
                if (widgetRun3.orientation == i && (z2 || widgetRun3.f32689a != this.f32651a)) {
                    if (!widgetRun3.start.resolved) {
                        break;
                    } else if (!widgetRun3.end.resolved) {
                        break;
                    } else if (!(widgetRun3 instanceof ChainRun) && !widgetRun3.f32691c.resolved) {
                        break;
                    }
                }
            } else {
                z3 = true;
                break;
            }
        }
        this.f32651a.setHorizontalDimensionBehaviour(dimensionBehaviour2);
        this.f32651a.setVerticalDimensionBehaviour(dimensionBehaviour3);
        return z3;
    }

    /* renamed from: e */
    public final void m58535e(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        BasicMeasure.Measure measure = this.f32658h;
        measure.horizontalBehavior = dimensionBehaviour;
        measure.verticalBehavior = dimensionBehaviour2;
        measure.horizontalDimension = i;
        measure.verticalDimension = i2;
        this.f32657g.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.f32658h.measuredWidth);
        constraintWidget.setHeight(this.f32658h.measuredHeight);
        constraintWidget.setHasBaseline(this.f32658h.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.f32658h.measuredBaseline);
    }

    public void invalidateGraph() {
        this.f32652b = true;
    }

    public void invalidateMeasures() {
        this.f32653c = true;
    }

    public void measureWidgets() {
        boolean z;
        C3685a c3685a;
        Iterator<ConstraintWidget> it = this.f32651a.mChildren.iterator();
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
                C3685a c3685a2 = next.horizontalRun.f32691c;
                boolean z3 = c3685a2.resolved;
                C3685a c3685a3 = next.verticalRun.f32691c;
                boolean z4 = c3685a3.resolved;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    m58535e(next, dimensionBehaviour4, c3685a2.value, dimensionBehaviour4, c3685a3.value);
                    next.measured = true;
                } else if (z3 && z2) {
                    m58535e(next, ConstraintWidget.DimensionBehaviour.FIXED, c3685a2.value, dimensionBehaviour3, c3685a3.value);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.verticalRun.f32691c.f32694h = next.getHeight();
                    } else {
                        next.verticalRun.f32691c.resolve(next.getHeight());
                        next.measured = true;
                    }
                } else if (z4 && z) {
                    m58535e(next, dimensionBehaviour3, c3685a2.value, ConstraintWidget.DimensionBehaviour.FIXED, c3685a3.value);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.horizontalRun.f32691c.f32694h = next.getWidth();
                    } else {
                        next.horizontalRun.f32691c.resolve(next.getWidth());
                        next.measured = true;
                    }
                }
                if (next.measured && (c3685a = next.verticalRun.f32672e) != null) {
                    c3685a.resolve(next.getBaselineDistance());
                }
            }
        }
    }

    public void setMeasurer(BasicMeasure.Measurer measurer) {
        this.f32657g = measurer;
    }

    public void buildGraph(ArrayList<WidgetRun> arrayList) {
        arrayList.clear();
        this.f32654d.horizontalRun.mo26154b();
        this.f32654d.verticalRun.mo26154b();
        arrayList.add(this.f32654d.horizontalRun);
        arrayList.add(this.f32654d.verticalRun);
        Iterator<ConstraintWidget> it = this.f32654d.mChildren.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof Guideline) {
                arrayList.add(new C21420o70(next));
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
                    arrayList.add(new C3686b(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo26154b();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.f32689a != this.f32654d) {
                next2.mo26155a();
            }
        }
    }
}