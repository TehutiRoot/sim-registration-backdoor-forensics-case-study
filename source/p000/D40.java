package p000;

import com.google.common.graph.AbstractGraph;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.EndpointPair;
import java.util.Set;

/* renamed from: D40 */
/* loaded from: classes4.dex */
public abstract class D40 extends AbstractGraph {
    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public Set adjacentNodes(Object obj) {
        return mo40076i().adjacentNodes(obj);
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return mo40076i().allowsSelfLoops();
    }

    @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public int degree(Object obj) {
        return mo40076i().degree(obj);
    }

    @Override // p000.AbstractC16787u
    public long edgeCount() {
        return mo40076i().edges().size();
    }

    @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public boolean hasEdgeConnecting(Object obj, Object obj2) {
        return mo40076i().hasEdgeConnecting(obj, obj2);
    }

    /* renamed from: i */
    public abstract InterfaceC0607Ia mo40076i();

    @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public int inDegree(Object obj) {
        return mo40076i().inDegree(obj);
    }

    @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public ElementOrder incidentEdgeOrder() {
        return mo40076i().incidentEdgeOrder();
    }

    @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public Set incidentEdges(Object obj) {
        return mo40076i().incidentEdges(obj);
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public boolean isDirected() {
        return mo40076i().isDirected();
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public ElementOrder nodeOrder() {
        return mo40076i().nodeOrder();
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public Set nodes() {
        return mo40076i().nodes();
    }

    @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public int outDegree(Object obj) {
        return mo40076i().outDegree(obj);
    }

    @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public boolean hasEdgeConnecting(EndpointPair endpointPair) {
        return mo40076i().hasEdgeConnecting(endpointPair);
    }

    @Override // com.google.common.graph.AbstractGraph, p000.InterfaceC0607Ia, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public Set predecessors(Object obj) {
        return mo40076i().predecessors(obj);
    }

    @Override // com.google.common.graph.AbstractGraph, p000.InterfaceC0607Ia, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public Set successors(Object obj) {
        return mo40076i().successors(obj);
    }
}
