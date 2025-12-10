package p000;

import com.google.common.graph.AbstractGraph;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.EndpointPair;
import java.util.Set;

/* renamed from: H40 */
/* loaded from: classes4.dex */
public abstract class H40 extends AbstractGraph {
    @Override // p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public Set adjacentNodes(Object obj) {
        return mo40067i().adjacentNodes(obj);
    }

    @Override // p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return mo40067i().allowsSelfLoops();
    }

    @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16802u, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public int degree(Object obj) {
        return mo40067i().degree(obj);
    }

    @Override // p000.AbstractC16802u
    public long edgeCount() {
        return mo40067i().edges().size();
    }

    @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16802u, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public boolean hasEdgeConnecting(Object obj, Object obj2) {
        return mo40067i().hasEdgeConnecting(obj, obj2);
    }

    /* renamed from: i */
    public abstract InterfaceC0597Ia mo40067i();

    @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16802u, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public int inDegree(Object obj) {
        return mo40067i().inDegree(obj);
    }

    @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16802u, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public ElementOrder incidentEdgeOrder() {
        return mo40067i().incidentEdgeOrder();
    }

    @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16802u, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public Set incidentEdges(Object obj) {
        return mo40067i().incidentEdges(obj);
    }

    @Override // p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public boolean isDirected() {
        return mo40067i().isDirected();
    }

    @Override // p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public ElementOrder nodeOrder() {
        return mo40067i().nodeOrder();
    }

    @Override // p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public Set nodes() {
        return mo40067i().nodes();
    }

    @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16802u, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public int outDegree(Object obj) {
        return mo40067i().outDegree(obj);
    }

    @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16802u, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public boolean hasEdgeConnecting(EndpointPair endpointPair) {
        return mo40067i().hasEdgeConnecting(endpointPair);
    }

    @Override // com.google.common.graph.AbstractGraph, p000.InterfaceC0597Ia, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public Set predecessors(Object obj) {
        return mo40067i().predecessors(obj);
    }

    @Override // com.google.common.graph.AbstractGraph, p000.InterfaceC0597Ia, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public Set successors(Object obj) {
        return mo40067i().successors(obj);
    }
}