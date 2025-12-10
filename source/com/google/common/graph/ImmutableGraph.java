package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.util.Set;

@Immutable(containerOf = {"N"})
@Beta
/* loaded from: classes4.dex */
public class ImmutableGraph<N> extends D40 {

    /* renamed from: a */
    public final InterfaceC0607Ia f53781a;

    /* loaded from: classes4.dex */
    public static class Builder<N> {

        /* renamed from: a */
        public final MutableGraph f53782a;

        public Builder(GraphBuilder graphBuilder) {
            this.f53782a = graphBuilder.m40143b().incidentEdgeOrder(ElementOrder.stable()).build();
        }

        @CanIgnoreReturnValue
        public Builder<N> addNode(N n) {
            this.f53782a.addNode(n);
            return this;
        }

        public ImmutableGraph<N> build() {
            return ImmutableGraph.copyOf(this.f53782a);
        }

        @CanIgnoreReturnValue
        public Builder<N> putEdge(N n, N n2) {
            this.f53782a.putEdge(n, n2);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<N> putEdge(EndpointPair<N> endpointPair) {
            this.f53782a.putEdge(endpointPair);
            return this;
        }
    }

    public ImmutableGraph(InterfaceC0607Ia interfaceC0607Ia) {
        this.f53781a = interfaceC0607Ia;
    }

    public static <N> ImmutableGraph<N> copyOf(Graph<N> graph) {
        if (graph instanceof ImmutableGraph) {
            return (ImmutableGraph) graph;
        }
        return new ImmutableGraph<>(new NL1(GraphBuilder.from(graph), m40126k(graph), graph.edges().size()));
    }

    /* renamed from: j */
    public static U60 m40127j(Graph graph, Object obj) {
        Function constant = Functions.constant(GraphConstants$Presence.EDGE_EXISTS);
        if (graph.isDirected()) {
            return C8021a.m40082y(obj, graph.incidentEdges(obj), constant);
        }
        return C8037c.m40063m(Maps.asMap(graph.adjacentNodes(obj), constant));
    }

    /* renamed from: k */
    public static ImmutableMap m40126k(Graph graph) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (N n : graph.nodes()) {
            builder.put(n, m40127j(graph, n));
        }
        return builder.buildOrThrow();
    }

    @Override // p000.D40, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set adjacentNodes(Object obj) {
        return super.adjacentNodes(obj);
    }

    @Override // p000.D40, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
        return super.allowsSelfLoops();
    }

    @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ int degree(Object obj) {
        return super.degree(obj);
    }

    @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(EndpointPair endpointPair) {
        return super.hasEdgeConnecting(endpointPair);
    }

    @Override // p000.D40
    /* renamed from: i */
    public InterfaceC0607Ia mo40076i() {
        return this.f53781a;
    }

    @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ int inDegree(Object obj) {
        return super.inDegree(obj);
    }

    @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public ElementOrder<N> incidentEdgeOrder() {
        return ElementOrder.stable();
    }

    @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set incidentEdges(Object obj) {
        return super.incidentEdges(obj);
    }

    @Override // p000.D40, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean isDirected() {
        return super.isDirected();
    }

    @Override // p000.D40, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ ElementOrder nodeOrder() {
        return super.nodeOrder();
    }

    @Override // p000.D40, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set nodes() {
        return super.nodes();
    }

    @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ int outDegree(Object obj) {
        return super.outDegree(obj);
    }

    @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.InterfaceC0607Ia, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set predecessors(Object obj) {
        return super.predecessors(obj);
    }

    @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.InterfaceC0607Ia, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set successors(Object obj) {
        return super.successors(obj);
    }

    @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(Object obj, Object obj2) {
        return super.hasEdgeConnecting(obj, obj2);
    }

    @Deprecated
    public static <N> ImmutableGraph<N> copyOf(ImmutableGraph<N> immutableGraph) {
        return (ImmutableGraph) Preconditions.checkNotNull(immutableGraph);
    }
}
