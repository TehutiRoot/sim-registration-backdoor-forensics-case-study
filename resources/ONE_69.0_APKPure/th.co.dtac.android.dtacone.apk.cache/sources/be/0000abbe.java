package com.google.common.graph;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.graph.ImmutableNetwork;
import com.google.common.graph.Network;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.util.Map;
import java.util.Set;

@Immutable(containerOf = {"N", ExifInterface.LONGITUDE_EAST})
@Beta
/* loaded from: classes4.dex */
public final class ImmutableNetwork<N, E> extends JM1 {

    /* loaded from: classes4.dex */
    public static class Builder<N, E> {

        /* renamed from: a */
        public final MutableNetwork f53795a;

        public Builder(NetworkBuilder networkBuilder) {
            this.f53795a = networkBuilder.build();
        }

        @CanIgnoreReturnValue
        public Builder<N, E> addEdge(N n, N n2, E e) {
            this.f53795a.addEdge(n, n2, e);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<N, E> addNode(N n) {
            this.f53795a.addNode(n);
            return this;
        }

        public ImmutableNetwork<N, E> build() {
            return ImmutableNetwork.copyOf(this.f53795a);
        }

        @CanIgnoreReturnValue
        public Builder<N, E> addEdge(EndpointPair<N> endpointPair, E e) {
            this.f53795a.addEdge(endpointPair, e);
            return this;
        }
    }

    public ImmutableNetwork(Network network) {
        super(NetworkBuilder.from(network), m40106y(network), m40107x(network));
    }

    /* renamed from: A */
    public static /* synthetic */ Object m40116A(Network network, Object obj) {
        return network.incidentNodes(obj).source();
    }

    /* renamed from: B */
    public static /* synthetic */ Object m40115B(Network network, Object obj) {
        return network.incidentNodes(obj).target();
    }

    /* renamed from: C */
    public static Function m40114C(final Network network) {
        return new Function() { // from class: Gd0
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ImmutableNetwork.m40111t(Network.this, obj);
            }
        };
    }

    /* renamed from: D */
    public static Function m40113D(final Network network) {
        return new Function() { // from class: Id0
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ImmutableNetwork.m40112s(Network.this, obj);
            }
        };
    }

    public static <N, E> ImmutableNetwork<N, E> copyOf(Network<N, E> network) {
        if (network instanceof ImmutableNetwork) {
            return (ImmutableNetwork) network;
        }
        return new ImmutableNetwork<>(network);
    }

    /* renamed from: s */
    public static /* synthetic */ Object m40112s(Network network, Object obj) {
        return m40115B(network, obj);
    }

    /* renamed from: t */
    public static /* synthetic */ Object m40111t(Network network, Object obj) {
        return m40116A(network, obj);
    }

    /* renamed from: u */
    public static /* synthetic */ Object m40110u(Network network, Object obj, Object obj2) {
        return m40105z(network, obj, obj2);
    }

    /* renamed from: v */
    public static Function m40109v(final Network network, final Object obj) {
        return new Function() { // from class: Hd0
            @Override // com.google.common.base.Function
            public final Object apply(Object obj2) {
                return ImmutableNetwork.m40110u(Network.this, obj, obj2);
            }
        };
    }

    /* renamed from: w */
    public static InterfaceC20239hH0 m40108w(Network network, Object obj) {
        if (network.isDirected()) {
            Map asMap = Maps.asMap(network.inEdges(obj), m40114C(network));
            Map asMap2 = Maps.asMap(network.outEdges(obj), m40113D(network));
            int size = network.edgesConnecting(obj, obj).size();
            if (network.allowsParallelEdges()) {
                return C1794ZI.m65244q(asMap, asMap2, size);
            }
            return C1862aJ.m65159o(asMap, asMap2, size);
        }
        Map asMap3 = Maps.asMap(network.incidentEdges(obj), m40109v(network, obj));
        if (network.allowsParallelEdges()) {
            return C20282hZ1.m31223q(asMap3);
        }
        return C20455iZ1.m30959n(asMap3);
    }

    /* renamed from: x */
    public static Map m40107x(Network network) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (E e : network.edges()) {
            builder.put(e, network.incidentNodes(e).nodeU());
        }
        return builder.buildOrThrow();
    }

    /* renamed from: y */
    public static Map m40106y(Network network) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (N n : network.nodes()) {
            builder.put(n, m40108w(network, n));
        }
        return builder.buildOrThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public static /* synthetic */ Object m40105z(Network network, Object obj, Object obj2) {
        return network.incidentNodes(obj2).adjacentNode(obj);
    }

    @Override // p000.JM1, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set adjacentNodes(Object obj) {
        return super.adjacentNodes(obj);
    }

    @Override // p000.JM1, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean allowsParallelEdges() {
        return super.allowsParallelEdges();
    }

    @Override // p000.JM1, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
        return super.allowsSelfLoops();
    }

    @Override // p000.JM1, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ ElementOrder edgeOrder() {
        return super.edgeOrder();
    }

    @Override // p000.JM1, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set edges() {
        return super.edges();
    }

    @Override // p000.JM1, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set edgesConnecting(Object obj, Object obj2) {
        return super.edgesConnecting(obj, obj2);
    }

    @Override // p000.JM1, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set inEdges(Object obj) {
        return super.inEdges(obj);
    }

    @Override // p000.JM1, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set incidentEdges(Object obj) {
        return super.incidentEdges(obj);
    }

    @Override // p000.JM1, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ EndpointPair incidentNodes(Object obj) {
        return super.incidentNodes(obj);
    }

    @Override // p000.JM1, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean isDirected() {
        return super.isDirected();
    }

    @Override // p000.JM1, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ ElementOrder nodeOrder() {
        return super.nodeOrder();
    }

    @Override // p000.JM1, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set nodes() {
        return super.nodes();
    }

    @Override // p000.JM1, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set outEdges(Object obj) {
        return super.outEdges(obj);
    }

    @Override // p000.JM1, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set predecessors(Object obj) {
        return super.predecessors(obj);
    }

    @Override // p000.JM1, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set successors(Object obj) {
        return super.successors(obj);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public ImmutableGraph<N> asGraph() {
        return new ImmutableGraph<>(super.asGraph());
    }

    @Deprecated
    public static <N, E> ImmutableNetwork<N, E> copyOf(ImmutableNetwork<N, E> immutableNetwork) {
        return (ImmutableNetwork) Preconditions.checkNotNull(immutableNetwork);
    }
}