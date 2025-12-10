package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graphs;
import com.google.common.graph.ImmutableGraph;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

@Beta
/* loaded from: classes4.dex */
public final class Graphs extends Y60 {

    /* loaded from: classes4.dex */
    public enum NodeVisitState {
        PENDING,
        COMPLETE
    }

    /* renamed from: com.google.common.graph.Graphs$a */
    /* loaded from: classes4.dex */
    public static final class C8004a {

        /* renamed from: a */
        public final Object f53775a;

        /* renamed from: b */
        public Queue f53776b;

        public C8004a(Object obj) {
            this.f53775a = obj;
        }
    }

    /* renamed from: com.google.common.graph.Graphs$b */
    /* loaded from: classes4.dex */
    public static class C8005b extends D40 {

        /* renamed from: a */
        public final Graph f53777a;

        /* renamed from: com.google.common.graph.Graphs$b$a */
        /* loaded from: classes4.dex */
        public class C8006a extends AbstractC18678Wd0 {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8006a(InterfaceC0607Ia interfaceC0607Ia, Object obj) {
                super(interfaceC0607Ia, obj);
                C8005b.this = r1;
            }

            /* renamed from: a */
            public static /* synthetic */ EndpointPair m40133a(C8006a c8006a, EndpointPair endpointPair) {
                return c8006a.m40132b(endpointPair);
            }

            /* renamed from: b */
            public final /* synthetic */ EndpointPair m40132b(EndpointPair endpointPair) {
                return EndpointPair.m40146a(C8005b.this.mo40076i(), endpointPair.nodeV(), endpointPair.nodeU());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return Iterators.transform(C8005b.this.mo40076i().incidentEdges(this.f7247a).iterator(), new Function() { // from class: X60
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return Graphs.C8005b.C8006a.m40133a(Graphs.C8005b.C8006a.this, (EndpointPair) obj);
                    }
                });
            }
        }

        public C8005b(Graph graph) {
            this.f53777a = graph;
        }

        @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public boolean hasEdgeConnecting(Object obj, Object obj2) {
            return mo40076i().hasEdgeConnecting(obj2, obj);
        }

        @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public int inDegree(Object obj) {
            return mo40076i().outDegree(obj);
        }

        @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public Set incidentEdges(Object obj) {
            return new C8006a(this, obj);
        }

        @Override // p000.D40
        /* renamed from: k */
        public Graph mo40076i() {
            return this.f53777a;
        }

        @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public int outDegree(Object obj) {
            return mo40076i().inDegree(obj);
        }

        @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public boolean hasEdgeConnecting(EndpointPair endpointPair) {
            return mo40076i().hasEdgeConnecting(Graphs.m40136g(endpointPair));
        }

        @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.InterfaceC0607Ia, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public Set predecessors(Object obj) {
            return mo40076i().successors((Graph) obj);
        }

        @Override // p000.D40, com.google.common.graph.AbstractGraph, p000.InterfaceC0607Ia, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Set successors(Object obj) {
            return mo40076i().predecessors((Graph) obj);
        }
    }

    /* renamed from: com.google.common.graph.Graphs$c */
    /* loaded from: classes4.dex */
    public static class C8007c extends H40 {

        /* renamed from: a */
        public final Network f53779a;

        public C8007c(Network network) {
            this.f53779a = network;
        }

        @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public Object edgeConnectingOrNull(Object obj, Object obj2) {
            return mo40131o().edgeConnectingOrNull(obj2, obj);
        }

        @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public Set edgesConnecting(Object obj, Object obj2) {
            return mo40131o().edgesConnecting(obj2, obj);
        }

        @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public boolean hasEdgeConnecting(Object obj, Object obj2) {
            return mo40131o().hasEdgeConnecting(obj2, obj);
        }

        @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int inDegree(Object obj) {
            return mo40131o().outDegree(obj);
        }

        @Override // com.google.common.graph.Network
        public Set inEdges(Object obj) {
            return mo40131o().outEdges(obj);
        }

        @Override // com.google.common.graph.Network
        public EndpointPair incidentNodes(Object obj) {
            EndpointPair incidentNodes = mo40131o().incidentNodes(obj);
            return EndpointPair.m40145b(this.f53779a, incidentNodes.nodeV(), incidentNodes.nodeU());
        }

        @Override // p000.H40
        /* renamed from: o */
        public Network mo40131o() {
            return this.f53779a;
        }

        @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int outDegree(Object obj) {
            return mo40131o().inDegree(obj);
        }

        @Override // com.google.common.graph.Network
        public Set outEdges(Object obj) {
            return mo40131o().inEdges(obj);
        }

        @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public Object edgeConnectingOrNull(EndpointPair endpointPair) {
            return mo40131o().edgeConnectingOrNull(Graphs.m40136g(endpointPair));
        }

        @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public Set edgesConnecting(EndpointPair endpointPair) {
            return mo40131o().edgesConnecting(Graphs.m40136g(endpointPair));
        }

        @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public boolean hasEdgeConnecting(EndpointPair endpointPair) {
            return mo40131o().hasEdgeConnecting(Graphs.m40136g(endpointPair));
        }

        @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public Set predecessors(Object obj) {
            return mo40131o().successors((Network) obj);
        }

        @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Set successors(Object obj) {
            return mo40131o().predecessors((Network) obj);
        }
    }

    /* renamed from: com.google.common.graph.Graphs$d */
    /* loaded from: classes4.dex */
    public static class C8008d extends I40 {

        /* renamed from: a */
        public final ValueGraph f53780a;

        public C8008d(ValueGraph valueGraph) {
            this.f53780a = valueGraph;
        }

        @Override // com.google.common.graph.ValueGraph
        public Object edgeValueOrDefault(Object obj, Object obj2, Object obj3) {
            return mo40129l().edgeValueOrDefault(obj2, obj, obj3);
        }

        @Override // com.google.common.graph.AbstractValueGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public boolean hasEdgeConnecting(Object obj, Object obj2) {
            return mo40129l().hasEdgeConnecting(obj2, obj);
        }

        @Override // com.google.common.graph.AbstractValueGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public int inDegree(Object obj) {
            return mo40129l().outDegree(obj);
        }

        @Override // p000.I40
        /* renamed from: l */
        public ValueGraph mo40129l() {
            return this.f53780a;
        }

        @Override // com.google.common.graph.AbstractValueGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public int outDegree(Object obj) {
            return mo40129l().inDegree(obj);
        }

        @Override // com.google.common.graph.ValueGraph
        public Object edgeValueOrDefault(EndpointPair endpointPair, Object obj) {
            return mo40129l().edgeValueOrDefault(Graphs.m40136g(endpointPair), obj);
        }

        @Override // com.google.common.graph.AbstractValueGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public boolean hasEdgeConnecting(EndpointPair endpointPair) {
            return mo40129l().hasEdgeConnecting(Graphs.m40136g(endpointPair));
        }

        @Override // com.google.common.graph.AbstractValueGraph, p000.InterfaceC0607Ia, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public Set predecessors(Object obj) {
            return mo40129l().successors((ValueGraph) obj);
        }

        @Override // com.google.common.graph.AbstractValueGraph, p000.InterfaceC0607Ia, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Set successors(Object obj) {
            return mo40129l().predecessors((ValueGraph) obj);
        }
    }

    /* renamed from: a */
    public static boolean m40142a(Graph graph, Object obj, Object obj2) {
        if (!graph.isDirected() && Objects.equal(obj2, obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m40141b(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Not true that %s is non-negative.", i);
        return i;
    }

    /* renamed from: c */
    public static long m40140c(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Not true that %s is non-negative.", j);
        return j;
    }

    public static <N> MutableGraph<N> copyOf(Graph<N> graph) {
        MutableGraph<N> mutableGraph = (MutableGraph<N>) GraphBuilder.from(graph).expectedNodeCount(graph.nodes().size()).build();
        for (N n : graph.nodes()) {
            mutableGraph.addNode(n);
        }
        for (EndpointPair<N> endpointPair : graph.edges()) {
            mutableGraph.putEdge(endpointPair.nodeU(), endpointPair.nodeV());
        }
        return mutableGraph;
    }

    /* renamed from: d */
    public static int m40139d(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Not true that %s is positive.", i);
        return i;
    }

    /* renamed from: e */
    public static long m40138e(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Not true that %s is positive.", j);
        return j;
    }

    /* renamed from: f */
    public static boolean m40137f(Graph graph, Map map, Object obj) {
        Object obj2;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(new C8004a(obj));
        while (!arrayDeque.isEmpty()) {
            C8004a c8004a = (C8004a) arrayDeque.removeLast();
            C8004a c8004a2 = (C8004a) arrayDeque.peekLast();
            arrayDeque.addLast(c8004a);
            Object obj3 = c8004a.f53775a;
            if (c8004a2 == null) {
                obj2 = null;
            } else {
                obj2 = c8004a2.f53775a;
            }
            if (c8004a.f53776b == null) {
                NodeVisitState nodeVisitState = (NodeVisitState) map.get(obj3);
                if (nodeVisitState == NodeVisitState.COMPLETE) {
                    arrayDeque.removeLast();
                } else {
                    NodeVisitState nodeVisitState2 = NodeVisitState.PENDING;
                    if (nodeVisitState == nodeVisitState2) {
                        return true;
                    }
                    map.put(obj3, nodeVisitState2);
                    c8004a.f53776b = new ArrayDeque(graph.successors((Graph) obj3));
                }
            }
            if (!c8004a.f53776b.isEmpty()) {
                Object remove = c8004a.f53776b.remove();
                if (m40142a(graph, remove, obj2)) {
                    arrayDeque.addLast(new C8004a(remove));
                }
            }
            arrayDeque.removeLast();
            map.put(obj3, NodeVisitState.COMPLETE);
        }
        return false;
    }

    /* renamed from: g */
    public static EndpointPair m40136g(EndpointPair endpointPair) {
        if (endpointPair.isOrdered()) {
            return EndpointPair.ordered(endpointPair.target(), endpointPair.source());
        }
        return endpointPair;
    }

    public static <N> boolean hasCycle(Graph<N> graph) {
        int size = graph.edges().size();
        if (size == 0) {
            return false;
        }
        if (graph.isDirected() || size < graph.nodes().size()) {
            HashMap newHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(graph.nodes().size());
            for (N n : graph.nodes()) {
                if (m40137f(graph, newHashMapWithExpectedSize, n)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static <N> MutableGraph<N> inducedSubgraph(Graph<N> graph, Iterable<? extends N> iterable) {
        MutableGraph<N> mutableGraph;
        if (iterable instanceof Collection) {
            mutableGraph = GraphBuilder.from(graph).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            mutableGraph = GraphBuilder.from(graph).build();
        }
        for (N n : iterable) {
            mutableGraph.addNode(n);
        }
        for (N n2 : mutableGraph.nodes()) {
            for (N n3 : graph.successors((Graph<N>) n2)) {
                if (mutableGraph.nodes().contains(n3)) {
                    mutableGraph.putEdge(n2, n3);
                }
            }
        }
        return mutableGraph;
    }

    public static <N> ImmutableSet<N> reachableNodes(Graph<N> graph, N n) {
        Preconditions.checkArgument(graph.nodes().contains(n), "Node %s is not an element of this graph.", n);
        return ImmutableSet.copyOf(Traverser.forGraph(graph).breadthFirst((Traverser) n));
    }

    public static <N> ImmutableGraph<N> transitiveClosure(Graph<N> graph) {
        ImmutableGraph.Builder<N1> immutable = GraphBuilder.from(graph).allowsSelfLoops(true).immutable();
        if (graph.isDirected()) {
            for (N n : graph.nodes()) {
                UnmodifiableIterator it = reachableNodes((Graph) graph, (Object) n).iterator();
                while (it.hasNext()) {
                    immutable.putEdge(n, it.next());
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            for (N n2 : graph.nodes()) {
                if (!hashSet.contains(n2)) {
                    ImmutableSet reachableNodes = reachableNodes((Graph) graph, (Object) n2);
                    hashSet.addAll(reachableNodes);
                    int i = 1;
                    for (Object obj : reachableNodes) {
                        int i2 = i + 1;
                        for (Object obj2 : Iterables.limit(reachableNodes, i)) {
                            immutable.putEdge(obj, obj2);
                        }
                        i = i2;
                    }
                }
            }
        }
        return immutable.build();
    }

    public static <N> Graph<N> transpose(Graph<N> graph) {
        if (graph.isDirected()) {
            if (graph instanceof C8005b) {
                return ((C8005b) graph).f53777a;
            }
            return new C8005b(graph);
        }
        return graph;
    }

    public static <N, V> ValueGraph<N, V> transpose(ValueGraph<N, V> valueGraph) {
        if (valueGraph.isDirected()) {
            if (valueGraph instanceof C8008d) {
                return ((C8008d) valueGraph).f53780a;
            }
            return new C8008d(valueGraph);
        }
        return valueGraph;
    }

    public static <N, V> MutableValueGraph<N, V> copyOf(ValueGraph<N, V> valueGraph) {
        MutableValueGraph<N, V> mutableValueGraph = (MutableValueGraph<N, V>) ValueGraphBuilder.from(valueGraph).expectedNodeCount(valueGraph.nodes().size()).build();
        for (N n : valueGraph.nodes()) {
            mutableValueGraph.addNode(n);
        }
        for (EndpointPair<N> endpointPair : valueGraph.edges()) {
            N nodeU = endpointPair.nodeU();
            N nodeV = endpointPair.nodeV();
            V edgeValueOrDefault = valueGraph.edgeValueOrDefault(endpointPair.nodeU(), endpointPair.nodeV(), null);
            java.util.Objects.requireNonNull(edgeValueOrDefault);
            mutableValueGraph.putEdgeValue(nodeU, nodeV, edgeValueOrDefault);
        }
        return mutableValueGraph;
    }

    public static boolean hasCycle(Network<?, ?> network) {
        if (network.isDirected() || !network.allowsParallelEdges() || network.edges().size() <= network.asGraph().edges().size()) {
            return hasCycle(network.asGraph());
        }
        return true;
    }

    public static <N, E> Network<N, E> transpose(Network<N, E> network) {
        if (network.isDirected()) {
            if (network instanceof C8007c) {
                return ((C8007c) network).f53779a;
            }
            return new C8007c(network);
        }
        return network;
    }

    public static <N, V> MutableValueGraph<N, V> inducedSubgraph(ValueGraph<N, V> valueGraph, Iterable<? extends N> iterable) {
        MutableValueGraph<N, V> mutableValueGraph;
        if (iterable instanceof Collection) {
            mutableValueGraph = ValueGraphBuilder.from(valueGraph).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            mutableValueGraph = ValueGraphBuilder.from(valueGraph).build();
        }
        for (N n : iterable) {
            mutableValueGraph.addNode(n);
        }
        for (N n2 : mutableValueGraph.nodes()) {
            for (N n3 : valueGraph.successors((ValueGraph<N, V>) n2)) {
                if (mutableValueGraph.nodes().contains(n3)) {
                    V edgeValueOrDefault = valueGraph.edgeValueOrDefault(n2, n3, null);
                    java.util.Objects.requireNonNull(edgeValueOrDefault);
                    mutableValueGraph.putEdgeValue(n2, n3, edgeValueOrDefault);
                }
            }
        }
        return mutableValueGraph;
    }

    public static <N, E> MutableNetwork<N, E> copyOf(Network<N, E> network) {
        MutableNetwork<N, E> mutableNetwork = (MutableNetwork<N, E>) NetworkBuilder.from(network).expectedNodeCount(network.nodes().size()).expectedEdgeCount(network.edges().size()).build();
        for (N n : network.nodes()) {
            mutableNetwork.addNode(n);
        }
        for (E e : network.edges()) {
            EndpointPair<N> incidentNodes = network.incidentNodes(e);
            mutableNetwork.addEdge(incidentNodes.nodeU(), incidentNodes.nodeV(), e);
        }
        return mutableNetwork;
    }

    public static <N, E> MutableNetwork<N, E> inducedSubgraph(Network<N, E> network, Iterable<? extends N> iterable) {
        MutableNetwork<N, E> mutableNetwork;
        if (iterable instanceof Collection) {
            mutableNetwork = NetworkBuilder.from(network).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            mutableNetwork = NetworkBuilder.from(network).build();
        }
        for (N n : iterable) {
            mutableNetwork.addNode(n);
        }
        for (N n2 : mutableNetwork.nodes()) {
            for (E e : network.outEdges(n2)) {
                N adjacentNode = network.incidentNodes(e).adjacentNode(n2);
                if (mutableNetwork.nodes().contains(adjacentNode)) {
                    mutableNetwork.addEdge(n2, adjacentNode, e);
                }
            }
        }
        return mutableNetwork;
    }
}
