package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.a */
/* loaded from: classes2.dex */
public class C3703a extends DependencyNode {

    /* renamed from: h */
    public int f32606h;

    public C3703a(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof HorizontalWidgetRun) {
            this.f32573b = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f32573b = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public void resolve(int i) {
        if (this.resolved) {
            return;
        }
        this.resolved = true;
        this.value = i;
        for (Dependency dependency : this.f32577f) {
            dependency.update(dependency);
        }
    }
}
