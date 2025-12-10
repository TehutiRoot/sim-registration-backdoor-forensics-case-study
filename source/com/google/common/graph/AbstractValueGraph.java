package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.common.graph.AbstractValueGraph;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.ValueGraph;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

@Beta
/* loaded from: classes4.dex */
public abstract class AbstractValueGraph<N, V> extends AbstractC16787u implements ValueGraph<N, V> {

    /* renamed from: com.google.common.graph.AbstractValueGraph$a */
    /* loaded from: classes4.dex */
    public class C8000a extends AbstractGraph {
        public C8000a() {
            AbstractValueGraph.this = r1;
        }

        @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public Set adjacentNodes(Object obj) {
            return AbstractValueGraph.this.adjacentNodes(obj);
        }

        @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public boolean allowsSelfLoops() {
            return AbstractValueGraph.this.allowsSelfLoops();
        }

        @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public int degree(Object obj) {
            return AbstractValueGraph.this.degree(obj);
        }

        @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public Set edges() {
            return AbstractValueGraph.this.edges();
        }

        @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public int inDegree(Object obj) {
            return AbstractValueGraph.this.inDegree(obj);
        }

        @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public ElementOrder incidentEdgeOrder() {
            return AbstractValueGraph.this.incidentEdgeOrder();
        }

        @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public boolean isDirected() {
            return AbstractValueGraph.this.isDirected();
        }

        @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public ElementOrder nodeOrder() {
            return AbstractValueGraph.this.nodeOrder();
        }

        @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public Set nodes() {
            return AbstractValueGraph.this.nodes();
        }

        @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public int outDegree(Object obj) {
            return AbstractValueGraph.this.outDegree(obj);
        }

        @Override // com.google.common.graph.AbstractGraph, p000.InterfaceC0607Ia, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public Set predecessors(Object obj) {
            return AbstractValueGraph.this.predecessors((AbstractValueGraph) obj);
        }

        @Override // com.google.common.graph.AbstractGraph, p000.InterfaceC0607Ia, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Set successors(Object obj) {
            return AbstractValueGraph.this.successors((AbstractValueGraph) obj);
        }
    }

    /* renamed from: i */
    public static /* synthetic */ Object m40151i(ValueGraph valueGraph, EndpointPair endpointPair) {
        return m40149k(valueGraph, endpointPair);
    }

    /* renamed from: j */
    public static Map m40150j(final ValueGraph valueGraph) {
        return Maps.asMap(valueGraph.edges(), new Function() { // from class: x0
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return AbstractValueGraph.m40151i(ValueGraph.this, (EndpointPair) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public static /* synthetic */ Object m40149k(ValueGraph valueGraph, EndpointPair endpointPair) {
        Object edgeValueOrDefault = valueGraph.edgeValueOrDefault(endpointPair.nodeU(), endpointPair.nodeV(), null);
        Objects.requireNonNull(edgeValueOrDefault);
        return edgeValueOrDefault;
    }

    @Override // com.google.common.graph.ValueGraph
    public Graph<N> asGraph() {
        return new C8000a();
    }

    @Override // p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ int degree(Object obj) {
        return super.degree(obj);
    }

    @Override // p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set edges() {
        return super.edges();
    }

    @Override // com.google.common.graph.ValueGraph
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValueGraph)) {
            return false;
        }
        ValueGraph valueGraph = (ValueGraph) obj;
        if (isDirected() == valueGraph.isDirected() && nodes().equals(valueGraph.nodes()) && m40150j(this).equals(m40150j(valueGraph))) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(EndpointPair endpointPair) {
        return super.hasEdgeConnecting(endpointPair);
    }

    @Override // com.google.common.graph.ValueGraph
    public final int hashCode() {
        return m40150j(this).hashCode();
    }

    @Override // p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ int inDegree(Object obj) {
        return super.inDegree(obj);
    }

    @Override // p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ ElementOrder incidentEdgeOrder() {
        return super.incidentEdgeOrder();
    }

    @Override // p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set incidentEdges(Object obj) {
        return super.incidentEdges(obj);
    }

    @Override // p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ int outDegree(Object obj) {
        return super.outDegree(obj);
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
        Iterable predecessors;
        predecessors = predecessors((AbstractValueGraph<N, V>) ((ValueGraph) obj));
        return predecessors;
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
        Iterable successors;
        successors = successors((AbstractValueGraph<N, V>) ((ValueGraph) obj));
        return successors;
    }

    public String toString() {
        return "isDirected: " + isDirected() + ", allowsSelfLoops: " + allowsSelfLoops() + ", nodes: " + nodes() + ", edges: " + m40150j(this);
    }

    @Override // p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(Object obj, Object obj2) {
        return super.hasEdgeConnecting(obj, obj2);
    }
}
