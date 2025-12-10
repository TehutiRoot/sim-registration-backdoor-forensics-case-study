package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.b */
/* loaded from: classes2.dex */
public class C3704b extends WidgetRun {
    public C3704b(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    /* renamed from: e */
    private void m58566e(DependencyNode dependencyNode) {
        this.start.f32577f.add(dependencyNode);
        dependencyNode.f32578g.add(this.start);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: a */
    public void mo30668a() {
        ConstraintWidget constraintWidget = this.f32601a;
        if (constraintWidget instanceof Barrier) {
            this.start.delegateToWidgetRun = true;
            Barrier barrier = (Barrier) constraintWidget;
            int barrierType = barrier.getBarrierType();
            boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
            int i = 0;
            if (barrierType != 0) {
                if (barrierType != 1) {
                    if (barrierType != 2) {
                        if (barrierType == 3) {
                            this.start.f32573b = DependencyNode.Type.BOTTOM;
                            while (i < barrier.mWidgetsCount) {
                                ConstraintWidget constraintWidget2 = barrier.mWidgets[i];
                                if (allowsGoneWidget || constraintWidget2.getVisibility() != 8) {
                                    DependencyNode dependencyNode = constraintWidget2.verticalRun.end;
                                    dependencyNode.f32577f.add(this.start);
                                    this.start.f32578g.add(dependencyNode);
                                }
                                i++;
                            }
                            m58566e(this.f32601a.verticalRun.start);
                            m58566e(this.f32601a.verticalRun.end);
                            return;
                        }
                        return;
                    }
                    this.start.f32573b = DependencyNode.Type.TOP;
                    while (i < barrier.mWidgetsCount) {
                        ConstraintWidget constraintWidget3 = barrier.mWidgets[i];
                        if (allowsGoneWidget || constraintWidget3.getVisibility() != 8) {
                            DependencyNode dependencyNode2 = constraintWidget3.verticalRun.start;
                            dependencyNode2.f32577f.add(this.start);
                            this.start.f32578g.add(dependencyNode2);
                        }
                        i++;
                    }
                    m58566e(this.f32601a.verticalRun.start);
                    m58566e(this.f32601a.verticalRun.end);
                    return;
                }
                this.start.f32573b = DependencyNode.Type.RIGHT;
                while (i < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget4 = barrier.mWidgets[i];
                    if (allowsGoneWidget || constraintWidget4.getVisibility() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.horizontalRun.end;
                        dependencyNode3.f32577f.add(this.start);
                        this.start.f32578g.add(dependencyNode3);
                    }
                    i++;
                }
                m58566e(this.f32601a.horizontalRun.start);
                m58566e(this.f32601a.horizontalRun.end);
                return;
            }
            this.start.f32573b = DependencyNode.Type.LEFT;
            while (i < barrier.mWidgetsCount) {
                ConstraintWidget constraintWidget5 = barrier.mWidgets[i];
                if (allowsGoneWidget || constraintWidget5.getVisibility() != 8) {
                    DependencyNode dependencyNode4 = constraintWidget5.horizontalRun.start;
                    dependencyNode4.f32577f.add(this.start);
                    this.start.f32578g.add(dependencyNode4);
                }
                i++;
            }
            m58566e(this.f32601a.horizontalRun.start);
            m58566e(this.f32601a.horizontalRun.end);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        ConstraintWidget constraintWidget = this.f32601a;
        if (constraintWidget instanceof Barrier) {
            int barrierType = ((Barrier) constraintWidget).getBarrierType();
            if (barrierType != 0 && barrierType != 1) {
                this.f32601a.setY(this.start.value);
            } else {
                this.f32601a.setX(this.start.value);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: b */
    public void mo30667b() {
        this.f32602b = null;
        this.start.clear();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: d */
    public boolean mo30666d() {
        return false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        Barrier barrier = (Barrier) this.f32601a;
        int barrierType = barrier.getBarrierType();
        int i = 0;
        int i2 = -1;
        for (DependencyNode dependencyNode : this.start.f32578g) {
            int i3 = dependencyNode.value;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (barrierType != 0 && barrierType != 2) {
            this.start.resolve(i + barrier.getMargin());
        } else {
            this.start.resolve(i2 + barrier.getMargin());
        }
    }
}
