package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ChainRun extends WidgetRun {

    /* renamed from: e */
    public ArrayList f32561e;

    /* renamed from: f */
    public int f32562f;

    public ChainRun(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.f32561e = new ArrayList();
        this.orientation = i;
        m58592e();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: a */
    public void mo30668a() {
        Iterator it = this.f32561e.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).mo30668a();
        }
        int size = this.f32561e.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = ((WidgetRun) this.f32561e.get(0)).f32601a;
        ConstraintWidget constraintWidget2 = ((WidgetRun) this.f32561e.get(size - 1)).f32601a;
        if (this.orientation == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.mRight;
            DependencyNode target = getTarget(constraintAnchor, 0);
            int margin = constraintAnchor.getMargin();
            ConstraintWidget m58591f = m58591f();
            if (m58591f != null) {
                margin = m58591f.mLeft.getMargin();
            }
            if (target != null) {
                addTarget(this.start, target, margin);
            }
            DependencyNode target2 = getTarget(constraintAnchor2, 0);
            int margin2 = constraintAnchor2.getMargin();
            ConstraintWidget m58590g = m58590g();
            if (m58590g != null) {
                margin2 = m58590g.mRight.getMargin();
            }
            if (target2 != null) {
                addTarget(this.end, target2, -margin2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.mBottom;
            DependencyNode target3 = getTarget(constraintAnchor3, 1);
            int margin3 = constraintAnchor3.getMargin();
            ConstraintWidget m58591f2 = m58591f();
            if (m58591f2 != null) {
                margin3 = m58591f2.mTop.getMargin();
            }
            if (target3 != null) {
                addTarget(this.start, target3, margin3);
            }
            DependencyNode target4 = getTarget(constraintAnchor4, 1);
            int margin4 = constraintAnchor4.getMargin();
            ConstraintWidget m58590g2 = m58590g();
            if (m58590g2 != null) {
                margin4 = m58590g2.mBottom.getMargin();
            }
            if (target4 != null) {
                addTarget(this.end, target4, -margin4);
            }
        }
        this.start.updateDelegate = this;
        this.end.updateDelegate = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        for (int i = 0; i < this.f32561e.size(); i++) {
            ((WidgetRun) this.f32561e.get(i)).applyToWidget();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: b */
    public void mo30667b() {
        this.f32602b = null;
        Iterator it = this.f32561e.iterator();
        while (it.hasNext()) {
            ((WidgetRun) it.next()).mo30667b();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /* renamed from: d */
    public boolean mo30666d() {
        int size = this.f32561e.size();
        for (int i = 0; i < size; i++) {
            if (!((WidgetRun) this.f32561e.get(i)).mo30666d()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final void m58592e() {
        ConstraintWidget constraintWidget;
        int verticalChainStyle;
        ConstraintWidget constraintWidget2 = this.f32601a;
        ConstraintWidget previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
        while (true) {
            ConstraintWidget constraintWidget3 = previousChainMember;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            }
            previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
        }
        this.f32601a = constraintWidget;
        this.f32561e.add(constraintWidget.getRun(this.orientation));
        ConstraintWidget nextChainMember = constraintWidget.getNextChainMember(this.orientation);
        while (nextChainMember != null) {
            this.f32561e.add(nextChainMember.getRun(this.orientation));
            nextChainMember = nextChainMember.getNextChainMember(this.orientation);
        }
        Iterator it = this.f32561e.iterator();
        while (it.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it.next();
            int i = this.orientation;
            if (i == 0) {
                widgetRun.f32601a.horizontalChainRun = this;
            } else if (i == 1) {
                widgetRun.f32601a.verticalChainRun = this;
            }
        }
        if (this.orientation == 0 && ((ConstraintWidgetContainer) this.f32601a.getParent()).isRtl() && this.f32561e.size() > 1) {
            ArrayList arrayList = this.f32561e;
            this.f32601a = ((WidgetRun) arrayList.get(arrayList.size() - 1)).f32601a;
        }
        if (this.orientation == 0) {
            verticalChainStyle = this.f32601a.getHorizontalChainStyle();
        } else {
            verticalChainStyle = this.f32601a.getVerticalChainStyle();
        }
        this.f32562f = verticalChainStyle;
    }

    /* renamed from: f */
    public final ConstraintWidget m58591f() {
        for (int i = 0; i < this.f32561e.size(); i++) {
            WidgetRun widgetRun = (WidgetRun) this.f32561e.get(i);
            if (widgetRun.f32601a.getVisibility() != 8) {
                return widgetRun.f32601a;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final ConstraintWidget m58590g() {
        for (int size = this.f32561e.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = (WidgetRun) this.f32561e.get(size);
            if (widgetRun.f32601a.getVisibility() != 8) {
                return widgetRun.f32601a;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long getWrapDimension() {
        int size = this.f32561e.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            WidgetRun widgetRun = (WidgetRun) this.f32561e.get(i);
            j = j + widgetRun.start.f32574c + widgetRun.getWrapDimension() + widgetRun.end.f32574c;
        }
        return j;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.orientation == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator it = this.f32561e.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append((WidgetRun) it.next());
            sb.append("> ");
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x0400, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r27) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.ChainRun.update(androidx.constraintlayout.core.widgets.analyzer.Dependency):void");
    }
}
