package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.graph.AbstractNetwork;
import com.google.common.graph.Network;
import com.google.common.math.IntMath;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

@Beta
/* loaded from: classes4.dex */
public abstract class AbstractNetwork<N, E> implements Network<N, E> {

    /* renamed from: com.google.common.graph.AbstractNetwork$a */
    /* loaded from: classes4.dex */
    public class C7997a extends AbstractGraph {

        /* renamed from: com.google.common.graph.AbstractNetwork$a$a */
        /* loaded from: classes4.dex */
        public class C7998a extends AbstractSet {
            public C7998a() {
                C7997a.this = r1;
            }

            /* renamed from: a */
            public static /* synthetic */ EndpointPair m40153a(C7998a c7998a, Object obj) {
                return c7998a.m40152b(obj);
            }

            /* renamed from: b */
            public final /* synthetic */ EndpointPair m40152b(Object obj) {
                return AbstractNetwork.this.incidentNodes(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair<?> endpointPair = (EndpointPair) obj;
                if (!C7997a.this.isOrderingCompatible(endpointPair) || !C7997a.this.nodes().contains(endpointPair.nodeU()) || !C7997a.this.successors(endpointPair.nodeU()).contains(endpointPair.nodeV())) {
                    return false;
                }
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return Iterators.transform(AbstractNetwork.this.edges().iterator(), new Function() { // from class: g0
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return AbstractNetwork.C7997a.C7998a.m40153a(AbstractNetwork.C7997a.C7998a.this, obj);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return AbstractNetwork.this.edges().size();
            }
        }

        public C7997a() {
            AbstractNetwork.this = r1;
        }

        @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public Set adjacentNodes(Object obj) {
            return AbstractNetwork.this.adjacentNodes(obj);
        }

        @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public boolean allowsSelfLoops() {
            return AbstractNetwork.this.allowsSelfLoops();
        }

        @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public Set edges() {
            if (AbstractNetwork.this.allowsParallelEdges()) {
                return super.edges();
            }
            return new C7998a();
        }

        @Override // com.google.common.graph.AbstractGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public ElementOrder incidentEdgeOrder() {
            return ElementOrder.unordered();
        }

        @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public boolean isDirected() {
            return AbstractNetwork.this.isDirected();
        }

        @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public ElementOrder nodeOrder() {
            return AbstractNetwork.this.nodeOrder();
        }

        @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
        public Set nodes() {
            return AbstractNetwork.this.nodes();
        }

        @Override // com.google.common.graph.AbstractGraph, p000.InterfaceC0607Ia, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public Set predecessors(Object obj) {
            return AbstractNetwork.this.predecessors((AbstractNetwork) obj);
        }

        @Override // com.google.common.graph.AbstractGraph, p000.InterfaceC0607Ia, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Set successors(Object obj) {
            return AbstractNetwork.this.successors((AbstractNetwork) obj);
        }
    }

    /* renamed from: com.google.common.graph.AbstractNetwork$b */
    /* loaded from: classes4.dex */
    public class C7999b implements Predicate {

        /* renamed from: a */
        public final /* synthetic */ Object f53767a;

        /* renamed from: b */
        public final /* synthetic */ Object f53768b;

        /* renamed from: c */
        public final /* synthetic */ AbstractNetwork f53769c;

        public C7999b(AbstractNetwork abstractNetwork, Object obj, Object obj2) {
            this.f53767a = obj;
            this.f53768b = obj2;
            this.f53769c = abstractNetwork;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
            return this.f53769c.incidentNodes(obj).adjacentNode((N) this.f53767a).equals(this.f53768b);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Boolean m40167a(AbstractNetwork abstractNetwork, Object obj) {
        return abstractNetwork.m40157k(obj);
    }

    /* renamed from: b */
    public static /* synthetic */ Boolean m40166b(AbstractNetwork abstractNetwork, Object obj) {
        return abstractNetwork.m40159i(obj);
    }

    /* renamed from: c */
    public static /* synthetic */ String m40165c(Object obj, Object obj2) {
        return m40154n(obj, obj2);
    }

    /* renamed from: d */
    public static /* synthetic */ String m40164d(Object obj) {
        return m40156l(obj);
    }

    /* renamed from: e */
    public static /* synthetic */ String m40163e(Object obj) {
        return m40158j(obj);
    }

    /* renamed from: f */
    public static /* synthetic */ Boolean m40162f(AbstractNetwork abstractNetwork, Object obj, Object obj2) {
        return abstractNetwork.m40155m(obj, obj2);
    }

    /* renamed from: h */
    public static Map m40160h(final Network network) {
        return Maps.asMap(network.edges(), new Function() { // from class: f0
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Network.this.incidentNodes(obj);
            }
        });
    }

    /* renamed from: j */
    public static /* synthetic */ String m40158j(Object obj) {
        return String.format("Edge %s that was used to generate this set is no longer in the graph.", obj);
    }

    /* renamed from: l */
    public static /* synthetic */ String m40156l(Object obj) {
        return String.format("Node %s that was used to generate this set is no longer in the graph.", obj);
    }

    /* renamed from: n */
    public static /* synthetic */ String m40154n(Object obj, Object obj2) {
        return String.format("Node %s or node %s that were used to generate this set are no longer in the graph.", obj, obj2);
    }

    @Override // com.google.common.graph.Network
    public Set<E> adjacentEdges(E e) {
        EndpointPair<N> incidentNodes = incidentNodes(e);
        return (Set<E>) edgeInvalidatableSet(Sets.difference(Sets.union(incidentEdges(incidentNodes.nodeU()), incidentEdges(incidentNodes.nodeV())), ImmutableSet.m40930of((Object) e)), e);
    }

    @Override // com.google.common.graph.Network
    public Graph<N> asGraph() {
        return new C7997a();
    }

    @Override // com.google.common.graph.Network
    public int degree(N n) {
        if (isDirected()) {
            return IntMath.saturatedAdd(inEdges(n).size(), outEdges(n).size());
        }
        return IntMath.saturatedAdd(incidentEdges(n).size(), edgesConnecting(n, n).size());
    }

    @Override // com.google.common.graph.Network
    @CheckForNull
    public E edgeConnectingOrNull(N n, N n2) {
        Set<E> edgesConnecting = edgesConnecting(n, n2);
        int size = edgesConnecting.size();
        if (size != 0) {
            if (size == 1) {
                return edgesConnecting.iterator().next();
            }
            throw new IllegalArgumentException(String.format("Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.", n, n2));
        }
        return null;
    }

    public final <T> Set<T> edgeInvalidatableSet(Set<T> set, final E e) {
        return C20419ig0.m30613e(set, new Supplier() { // from class: d0
            {
                AbstractNetwork.this = this;
            }

            @Override // com.google.common.base.Supplier
            public final Object get() {
                return AbstractNetwork.m40166b(AbstractNetwork.this, e);
            }
        }, new Supplier() { // from class: e0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return AbstractNetwork.m40163e(e);
            }
        });
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(N n, N n2) {
        Set set;
        Set<E> outEdges = outEdges(n);
        Set<E> inEdges = inEdges(n2);
        if (outEdges.size() <= inEdges.size()) {
            set = Collections.unmodifiableSet(Sets.filter(outEdges, m40161g(n, n2)));
        } else {
            set = Collections.unmodifiableSet(Sets.filter(inEdges, m40161g(n2, n)));
        }
        return (Set<E>) nodePairInvalidatableSet(set, n, n2);
    }

    @Override // com.google.common.graph.Network
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        if (isDirected() == network.isDirected() && nodes().equals(network.nodes()) && m40160h(this).equals(m40160h(network))) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final Predicate m40161g(Object obj, Object obj2) {
        return new C7999b(this, obj, obj2);
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(N n, N n2) {
        Preconditions.checkNotNull(n);
        Preconditions.checkNotNull(n2);
        return nodes().contains(n) && successors((AbstractNetwork<N, E>) n).contains(n2);
    }

    @Override // com.google.common.graph.Network
    public final int hashCode() {
        return m40160h(this).hashCode();
    }

    /* renamed from: i */
    public final /* synthetic */ Boolean m40159i(Object obj) {
        return Boolean.valueOf(edges().contains(obj));
    }

    @Override // com.google.common.graph.Network
    public int inDegree(N n) {
        if (isDirected()) {
            return inEdges(n).size();
        }
        return degree(n);
    }

    public final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
        if (endpointPair.isOrdered() == isDirected()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final /* synthetic */ Boolean m40157k(Object obj) {
        return Boolean.valueOf(nodes().contains(obj));
    }

    /* renamed from: m */
    public final /* synthetic */ Boolean m40155m(Object obj, Object obj2) {
        boolean z;
        if (nodes().contains(obj) && nodes().contains(obj2)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final <T> Set<T> nodeInvalidatableSet(Set<T> set, final N n) {
        return C20419ig0.m30613e(set, new Supplier() { // from class: Z
            {
                AbstractNetwork.this = this;
            }

            @Override // com.google.common.base.Supplier
            public final Object get() {
                return AbstractNetwork.m40167a(AbstractNetwork.this, n);
            }
        }, new Supplier() { // from class: a0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return AbstractNetwork.m40164d(n);
            }
        });
    }

    public final <T> Set<T> nodePairInvalidatableSet(Set<T> set, final N n, final N n2) {
        return C20419ig0.m30613e(set, new Supplier() { // from class: b0
            {
                AbstractNetwork.this = this;
            }

            @Override // com.google.common.base.Supplier
            public final Object get() {
                return AbstractNetwork.m40162f(AbstractNetwork.this, n, n2);
            }
        }, new Supplier() { // from class: c0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return AbstractNetwork.m40165c(n, n2);
            }
        });
    }

    @Override // com.google.common.graph.Network
    public int outDegree(N n) {
        if (isDirected()) {
            return outEdges(n).size();
        }
        return degree(n);
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
        Iterable predecessors;
        predecessors = predecessors((AbstractNetwork<N, E>) ((Network) obj));
        return predecessors;
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
        Iterable successors;
        successors = successors((AbstractNetwork<N, E>) ((Network) obj));
        return successors;
    }

    public String toString() {
        return "isDirected: " + isDirected() + ", allowsParallelEdges: " + allowsParallelEdges() + ", allowsSelfLoops: " + allowsSelfLoops() + ", nodes: " + nodes() + ", edges: " + m40160h(this);
    }

    public final void validateEndpoints(EndpointPair<?> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(isOrderingCompatible(endpointPair), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (isOrderingCompatible(endpointPair)) {
            return hasEdgeConnecting(endpointPair.nodeU(), endpointPair.nodeV());
        }
        return false;
    }

    @Override // com.google.common.graph.Network
    @CheckForNull
    public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return edgeConnectingOrNull(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return edgesConnecting(endpointPair.nodeU(), endpointPair.nodeV());
    }
}
