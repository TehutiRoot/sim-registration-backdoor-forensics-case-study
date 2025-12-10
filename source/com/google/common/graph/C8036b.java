package com.google.common.graph;

/* renamed from: com.google.common.graph.b */
/* loaded from: classes4.dex */
public final class C8036b extends D40 implements MutableGraph {

    /* renamed from: a */
    public final MutableValueGraph f53830a;

    public C8036b(AbstractC0638J abstractC0638J) {
        this.f53830a = new LL1(abstractC0638J);
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean addNode(Object obj) {
        return this.f53830a.addNode(obj);
    }

    @Override // p000.D40
    /* renamed from: i */
    public InterfaceC0607Ia mo40076i() {
        return this.f53830a;
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean putEdge(Object obj, Object obj2) {
        return this.f53830a.putEdgeValue(obj, obj2, GraphConstants$Presence.EDGE_EXISTS) == null;
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeEdge(Object obj, Object obj2) {
        return this.f53830a.removeEdge(obj, obj2) != null;
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeNode(Object obj) {
        return this.f53830a.removeNode(obj);
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean putEdge(EndpointPair endpointPair) {
        validateEndpoints(endpointPair);
        return putEdge(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeEdge(EndpointPair endpointPair) {
        validateEndpoints(endpointPair);
        return removeEdge(endpointPair.nodeU(), endpointPair.nodeV());
    }
}
