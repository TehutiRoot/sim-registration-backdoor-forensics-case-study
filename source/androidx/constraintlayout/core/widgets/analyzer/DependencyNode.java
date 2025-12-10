package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DependencyNode implements Dependency {

    /* renamed from: a */
    public WidgetRun f32572a;

    /* renamed from: c */
    public int f32574c;
    public int value;
    public Dependency updateDelegate = null;
    public boolean delegateToWidgetRun = false;
    public boolean readyToSolve = false;

    /* renamed from: b */
    public Type f32573b = Type.UNKNOWN;

    /* renamed from: d */
    public int f32575d = 1;

    /* renamed from: e */
    public C3703a f32576e = null;
    public boolean resolved = false;

    /* renamed from: f */
    public List f32577f = new ArrayList();

    /* renamed from: g */
    public List f32578g = new ArrayList();

    /* loaded from: classes2.dex */
    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f32572a = widgetRun;
    }

    public void addDependency(Dependency dependency) {
        this.f32577f.add(dependency);
        if (this.resolved) {
            dependency.update(dependency);
        }
    }

    public void clear() {
        this.f32578g.clear();
        this.f32577f.clear();
        this.resolved = false;
        this.value = 0;
        this.readyToSolve = false;
        this.delegateToWidgetRun = false;
    }

    public String name() {
        String str;
        String debugName = this.f32572a.f32601a.getDebugName();
        Type type = this.f32573b;
        if (type != Type.LEFT && type != Type.RIGHT) {
            str = debugName + "_VERTICAL";
        } else {
            str = debugName + "_HORIZONTAL";
        }
        return str + ":" + this.f32573b.name();
    }

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

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32572a.f32601a.getDebugName());
        sb.append(":");
        sb.append(this.f32573b);
        sb.append("(");
        if (this.resolved) {
            obj = Integer.valueOf(this.value);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f32578g.size());
        sb.append(":d=");
        sb.append(this.f32577f.size());
        sb.append(">");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        for (DependencyNode dependencyNode : this.f32578g) {
            if (!dependencyNode.resolved) {
                return;
            }
        }
        this.readyToSolve = true;
        Dependency dependency2 = this.updateDelegate;
        if (dependency2 != null) {
            dependency2.update(this);
        }
        if (this.delegateToWidgetRun) {
            this.f32572a.update(this);
            return;
        }
        DependencyNode dependencyNode2 = null;
        int i = 0;
        for (DependencyNode dependencyNode3 : this.f32578g) {
            if (!(dependencyNode3 instanceof C3703a)) {
                i++;
                dependencyNode2 = dependencyNode3;
            }
        }
        if (dependencyNode2 != null && i == 1 && dependencyNode2.resolved) {
            C3703a c3703a = this.f32576e;
            if (c3703a != null) {
                if (c3703a.resolved) {
                    this.f32574c = this.f32575d * c3703a.value;
                } else {
                    return;
                }
            }
            resolve(dependencyNode2.value + this.f32574c);
        }
        Dependency dependency3 = this.updateDelegate;
        if (dependency3 != null) {
            dependency3.update(this);
        }
    }
}
