package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Set;
import javax.annotation.CheckForNull;

@DoNotMock("Use GraphBuilder to create a real instance")
@Beta
/* loaded from: classes4.dex */
public interface Graph<N> extends InterfaceC0607Ia {
    @Override // 
    Set<N> adjacentNodes(N n);

    @Override // 
    boolean allowsSelfLoops();

    @Override // 
    int degree(N n);

    @Override // 
    Set<EndpointPair<N>> edges();

    boolean equals(@CheckForNull Object obj);

    @Override // 
    boolean hasEdgeConnecting(EndpointPair<N> endpointPair);

    @Override // 
    boolean hasEdgeConnecting(N n, N n2);

    int hashCode();

    @Override // 
    int inDegree(N n);

    @Override // 
    ElementOrder<N> incidentEdgeOrder();

    @Override // 
    Set<EndpointPair<N>> incidentEdges(N n);

    @Override // 
    boolean isDirected();

    @Override // 
    ElementOrder<N> nodeOrder();

    @Override // 
    Set<N> nodes();

    @Override // 
    int outDegree(N n);

    @Override // 
    /* bridge */ /* synthetic */ Iterable predecessors(Object obj);

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    Set<N> predecessors(N n);

    @Override // 
    /* bridge */ /* synthetic */ Iterable successors(Object obj);

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    Set<N> successors(N n);
}
