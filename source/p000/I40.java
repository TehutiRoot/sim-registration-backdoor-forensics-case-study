package p000;

import com.google.common.graph.AbstractValueGraph;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.ValueGraph;
import java.util.Set;

/* renamed from: I40 */
/* loaded from: classes4.dex */
public abstract class I40 extends AbstractValueGraph {
    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public Set adjacentNodes(Object obj) {
        return mo40129l().adjacentNodes(obj);
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return mo40129l().allowsSelfLoops();
    }

    @Override // com.google.common.graph.AbstractValueGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public int degree(Object obj) {
        return mo40129l().degree(obj);
    }

    @Override // p000.AbstractC16787u
    public long edgeCount() {
        return mo40129l().edges().size();
    }

    @Override // com.google.common.graph.AbstractValueGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public ElementOrder incidentEdgeOrder() {
        return mo40129l().incidentEdgeOrder();
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public boolean isDirected() {
        return mo40129l().isDirected();
    }

    /* renamed from: l */
    public abstract ValueGraph mo40129l();

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public ElementOrder nodeOrder() {
        return mo40129l().nodeOrder();
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public Set nodes() {
        return mo40129l().nodes();
    }
}
