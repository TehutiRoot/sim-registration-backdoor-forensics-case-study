package p000;

import com.google.common.graph.AbstractValueGraph;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.ValueGraph;
import java.util.Set;

/* renamed from: M40 */
/* loaded from: classes4.dex */
public abstract class M40 extends AbstractValueGraph {
    @Override // p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public Set adjacentNodes(Object obj) {
        return mo40120l().adjacentNodes(obj);
    }

    @Override // p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return mo40120l().allowsSelfLoops();
    }

    @Override // com.google.common.graph.AbstractValueGraph, p000.AbstractC16802u, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public int degree(Object obj) {
        return mo40120l().degree(obj);
    }

    @Override // p000.AbstractC16802u
    public long edgeCount() {
        return mo40120l().edges().size();
    }

    @Override // com.google.common.graph.AbstractValueGraph, p000.AbstractC16802u, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public ElementOrder incidentEdgeOrder() {
        return mo40120l().incidentEdgeOrder();
    }

    @Override // p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public boolean isDirected() {
        return mo40120l().isDirected();
    }

    /* renamed from: l */
    public abstract ValueGraph mo40120l();

    @Override // p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public ElementOrder nodeOrder() {
        return mo40120l().nodeOrder();
    }

    @Override // p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public Set nodes() {
        return mo40120l().nodes();
    }
}