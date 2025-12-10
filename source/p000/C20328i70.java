package p000;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.analyzer.Dependency;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* renamed from: i70  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C20328i70 extends WidgetRun {
    public C20328i70(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.horizontalRun.mo30667b();
        constraintWidget.verticalRun.mo30667b();
        this.orientation = ((Guideline) constraintWidget).getOrientation();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: a */
    public void mo30668a() {
        Guideline guideline = (Guideline) this.f32601a;
        int relativeBegin = guideline.getRelativeBegin();
        int relativeEnd = guideline.getRelativeEnd();
        guideline.getRelativePercent();
        if (guideline.getOrientation() == 1) {
            if (relativeBegin != -1) {
                this.start.f32578g.add(this.f32601a.mParent.horizontalRun.start);
                this.f32601a.mParent.horizontalRun.start.f32577f.add(this.start);
                this.start.f32574c = relativeBegin;
            } else if (relativeEnd != -1) {
                this.start.f32578g.add(this.f32601a.mParent.horizontalRun.end);
                this.f32601a.mParent.horizontalRun.end.f32577f.add(this.start);
                this.start.f32574c = -relativeEnd;
            } else {
                DependencyNode dependencyNode = this.start;
                dependencyNode.delegateToWidgetRun = true;
                dependencyNode.f32578g.add(this.f32601a.mParent.horizontalRun.end);
                this.f32601a.mParent.horizontalRun.end.f32577f.add(this.start);
            }
            m30665e(this.f32601a.horizontalRun.start);
            m30665e(this.f32601a.horizontalRun.end);
            return;
        }
        if (relativeBegin != -1) {
            this.start.f32578g.add(this.f32601a.mParent.verticalRun.start);
            this.f32601a.mParent.verticalRun.start.f32577f.add(this.start);
            this.start.f32574c = relativeBegin;
        } else if (relativeEnd != -1) {
            this.start.f32578g.add(this.f32601a.mParent.verticalRun.end);
            this.f32601a.mParent.verticalRun.end.f32577f.add(this.start);
            this.start.f32574c = -relativeEnd;
        } else {
            DependencyNode dependencyNode2 = this.start;
            dependencyNode2.delegateToWidgetRun = true;
            dependencyNode2.f32578g.add(this.f32601a.mParent.verticalRun.end);
            this.f32601a.mParent.verticalRun.end.f32577f.add(this.start);
        }
        m30665e(this.f32601a.verticalRun.start);
        m30665e(this.f32601a.verticalRun.end);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        if (((Guideline) this.f32601a).getOrientation() == 1) {
            this.f32601a.setX(this.start.value);
        } else {
            this.f32601a.setY(this.start.value);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: b */
    public void mo30667b() {
        this.start.clear();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: d */
    public boolean mo30666d() {
        return false;
    }

    /* renamed from: e */
    public final void m30665e(DependencyNode dependencyNode) {
        this.start.f32577f.add(dependencyNode);
        dependencyNode.f32578g.add(this.start);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        DependencyNode dependencyNode = this.start;
        if (!dependencyNode.readyToSolve || dependencyNode.resolved) {
            return;
        }
        this.start.resolve((int) ((((DependencyNode) dependencyNode.f32578g.get(0)).value * ((Guideline) this.f32601a).getRelativePercent()) + 0.5f));
    }
}
