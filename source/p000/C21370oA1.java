package p000;

import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.analyzer.C3704b;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.Dependency;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: oA1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C21370oA1 {

    /* renamed from: h */
    public static int f72587h;

    /* renamed from: c */
    public WidgetRun f72590c;

    /* renamed from: d */
    public WidgetRun f72591d;

    /* renamed from: f */
    public int f72593f;

    /* renamed from: g */
    public int f72594g;

    /* renamed from: a */
    public int f72588a = 0;

    /* renamed from: b */
    public boolean f72589b = false;

    /* renamed from: e */
    public ArrayList f72592e = new ArrayList();

    public C21370oA1(WidgetRun widgetRun, int i) {
        this.f72590c = null;
        this.f72591d = null;
        int i2 = f72587h;
        this.f72593f = i2;
        f72587h = i2 + 1;
        this.f72590c = widgetRun;
        this.f72591d = widgetRun;
        this.f72594g = i;
    }

    /* renamed from: a */
    public void m25953a(WidgetRun widgetRun) {
        this.f72592e.add(widgetRun);
        this.f72591d = widgetRun;
    }

    /* renamed from: b */
    public long m25952b(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        WidgetRun widgetRun3;
        long wrapDimension;
        int i2;
        DependencyNode dependencyNode;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun4;
        WidgetRun widgetRun5 = this.f72590c;
        long j = 0;
        if (widgetRun5 instanceof ChainRun) {
            if (((ChainRun) widgetRun5).orientation != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(widgetRun5 instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun5 instanceof VerticalWidgetRun)) {
            return 0L;
        }
        if (i == 0) {
            widgetRun = constraintWidgetContainer.horizontalRun;
        } else {
            widgetRun = constraintWidgetContainer.verticalRun;
        }
        DependencyNode dependencyNode3 = widgetRun.start;
        if (i == 0) {
            widgetRun2 = constraintWidgetContainer.horizontalRun;
        } else {
            widgetRun2 = constraintWidgetContainer.verticalRun;
        }
        DependencyNode dependencyNode4 = widgetRun2.end;
        boolean contains = widgetRun5.start.f32578g.contains(dependencyNode3);
        boolean contains2 = this.f72590c.end.f32578g.contains(dependencyNode4);
        long wrapDimension2 = this.f72590c.getWrapDimension();
        if (contains && contains2) {
            long m25948f = m25948f(this.f72590c.start, 0L);
            long m25949e = m25949e(this.f72590c.end, 0L);
            long j2 = m25948f - wrapDimension2;
            WidgetRun widgetRun6 = this.f72590c;
            int i3 = widgetRun6.end.f32574c;
            if (j2 >= (-i3)) {
                j2 += i3;
            }
            int i4 = widgetRun6.start.f32574c;
            long j3 = ((-m25949e) - wrapDimension2) - i4;
            if (j3 >= i4) {
                j3 -= i4;
            }
            float biasPercent = widgetRun6.f32601a.getBiasPercent(i);
            if (biasPercent > 0.0f) {
                j = (((float) j3) / biasPercent) + (((float) j2) / (1.0f - biasPercent));
            }
            float f = (float) j;
            long j4 = (f * biasPercent) + 0.5f + wrapDimension2 + (f * (1.0f - biasPercent)) + 0.5f;
            wrapDimension = widgetRun4.start.f32574c + j4;
            i2 = this.f72590c.end.f32574c;
        } else if (contains) {
            return Math.max(m25948f(this.f72590c.start, dependencyNode2.f32574c), this.f72590c.start.f32574c + wrapDimension2);
        } else if (contains2) {
            return Math.max(-m25949e(this.f72590c.end, dependencyNode.f32574c), (-this.f72590c.end.f32574c) + wrapDimension2);
        } else {
            wrapDimension = widgetRun3.start.f32574c + this.f72590c.getWrapDimension();
            i2 = this.f72590c.end.f32574c;
        }
        return wrapDimension - i2;
    }

    /* renamed from: c */
    public final boolean m25951c(WidgetRun widgetRun, int i) {
        DependencyNode dependencyNode;
        WidgetRun widgetRun2;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun3;
        if (!widgetRun.f32601a.isTerminalWidget[i]) {
            return false;
        }
        for (Dependency dependency : widgetRun.start.f32577f) {
            if ((dependency instanceof DependencyNode) && (widgetRun3 = (dependencyNode2 = (DependencyNode) dependency).f32572a) != widgetRun && dependencyNode2 == widgetRun3.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator it = ((ChainRun) widgetRun).f32561e.iterator();
                    while (it.hasNext()) {
                        m25951c((WidgetRun) it.next(), i);
                    }
                } else if (!(widgetRun instanceof C3704b)) {
                    widgetRun.f32601a.isTerminalWidget[i] = false;
                }
                m25951c(dependencyNode2.f32572a, i);
            }
        }
        for (Dependency dependency2 : widgetRun.end.f32577f) {
            if ((dependency2 instanceof DependencyNode) && (widgetRun2 = (dependencyNode = (DependencyNode) dependency2).f32572a) != widgetRun && dependencyNode == widgetRun2.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator it2 = ((ChainRun) widgetRun).f32561e.iterator();
                    while (it2.hasNext()) {
                        m25951c((WidgetRun) it2.next(), i);
                    }
                } else if (!(widgetRun instanceof C3704b)) {
                    widgetRun.f32601a.isTerminalWidget[i] = false;
                }
                m25951c(dependencyNode.f32572a, i);
            }
        }
        return false;
    }

    /* renamed from: d */
    public void m25950d(boolean z, boolean z2) {
        if (z) {
            WidgetRun widgetRun = this.f72590c;
            if (widgetRun instanceof HorizontalWidgetRun) {
                m25951c(widgetRun, 0);
            }
        }
        if (z2) {
            WidgetRun widgetRun2 = this.f72590c;
            if (widgetRun2 instanceof VerticalWidgetRun) {
                m25951c(widgetRun2, 1);
            }
        }
    }

    /* renamed from: e */
    public final long m25949e(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f32572a;
        if (widgetRun instanceof C3704b) {
            return j;
        }
        int size = dependencyNode.f32577f.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = (Dependency) dependencyNode.f32577f.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.f32572a != widgetRun) {
                    j2 = Math.min(j2, m25949e(dependencyNode2, dependencyNode2.f32574c + j));
                }
            }
        }
        if (dependencyNode == widgetRun.end) {
            long wrapDimension = j - widgetRun.getWrapDimension();
            return Math.min(Math.min(j2, m25949e(widgetRun.start, wrapDimension)), wrapDimension - widgetRun.start.f32574c);
        }
        return j2;
    }

    /* renamed from: f */
    public final long m25948f(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f32572a;
        if (widgetRun instanceof C3704b) {
            return j;
        }
        int size = dependencyNode.f32577f.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = (Dependency) dependencyNode.f32577f.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.f32572a != widgetRun) {
                    j2 = Math.max(j2, m25948f(dependencyNode2, dependencyNode2.f32574c + j));
                }
            }
        }
        if (dependencyNode == widgetRun.start) {
            long wrapDimension = j + widgetRun.getWrapDimension();
            return Math.max(Math.max(j2, m25948f(widgetRun.end, wrapDimension)), wrapDimension - widgetRun.end.f32574c);
        }
        return j2;
    }
}
