package com.google.common.graph;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.graph.ImmutableValueGraph;
import com.google.common.graph.ValueGraph;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

@Immutable(containerOf = {"N", ExifInterface.GPS_MEASUREMENT_INTERRUPTED})
@Beta
/* loaded from: classes4.dex */
public final class ImmutableValueGraph<N, V> extends KM1 {

    /* loaded from: classes4.dex */
    public static class Builder<N, V> {

        /* renamed from: a */
        public final MutableValueGraph f53796a;

        public Builder(ValueGraphBuilder valueGraphBuilder) {
            this.f53796a = valueGraphBuilder.m40089b().incidentEdgeOrder(ElementOrder.stable()).build();
        }

        @CanIgnoreReturnValue
        public Builder<N, V> addNode(N n) {
            this.f53796a.addNode(n);
            return this;
        }

        public ImmutableValueGraph<N, V> build() {
            return ImmutableValueGraph.copyOf(this.f53796a);
        }

        @CanIgnoreReturnValue
        public Builder<N, V> putEdgeValue(N n, N n2, V v) {
            this.f53796a.putEdgeValue(n, n2, v);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<N, V> putEdgeValue(EndpointPair<N> endpointPair, V v) {
            this.f53796a.putEdgeValue(endpointPair, v);
            return this;
        }
    }

    public ImmutableValueGraph(ValueGraph valueGraph) {
        super(ValueGraphBuilder.from(valueGraph), m40102r(valueGraph), valueGraph.edges().size());
    }

    public static <N, V> ImmutableValueGraph<N, V> copyOf(ValueGraph<N, V> valueGraph) {
        if (valueGraph instanceof ImmutableValueGraph) {
            return (ImmutableValueGraph) valueGraph;
        }
        return new ImmutableValueGraph<>(valueGraph);
    }

    /* renamed from: p */
    public static /* synthetic */ Object m40104p(ValueGraph valueGraph, Object obj, Object obj2) {
        return m40101s(valueGraph, obj, obj2);
    }

    /* renamed from: q */
    public static InterfaceC18993a70 m40103q(final ValueGraph valueGraph, final Object obj) {
        Function function = new Function() { // from class: Td0
            @Override // com.google.common.base.Function
            public final Object apply(Object obj2) {
                return ImmutableValueGraph.m40104p(ValueGraph.this, obj, obj2);
            }
        };
        if (valueGraph.isDirected()) {
            return C8010a.m40073y(obj, valueGraph.incidentEdges(obj), function);
        }
        return C8026c.m40054m(Maps.asMap(valueGraph.adjacentNodes(obj), function));
    }

    /* renamed from: r */
    public static ImmutableMap m40102r(ValueGraph valueGraph) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (N n : valueGraph.nodes()) {
            builder.put(n, m40103q(valueGraph, n));
        }
        return builder.buildOrThrow();
    }

    /* renamed from: s */
    public static /* synthetic */ Object m40101s(ValueGraph valueGraph, Object obj, Object obj2) {
        Object edgeValueOrDefault = valueGraph.edgeValueOrDefault(obj, obj2, null);
        Objects.requireNonNull(edgeValueOrDefault);
        return edgeValueOrDefault;
    }

    @Override // p000.KM1, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set adjacentNodes(Object obj) {
        return super.adjacentNodes(obj);
    }

    @Override // p000.KM1, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
        return super.allowsSelfLoops();
    }

    @Override // p000.KM1, com.google.common.graph.ValueGraph
    @CheckForNull
    public /* bridge */ /* synthetic */ Object edgeValueOrDefault(EndpointPair endpointPair, @CheckForNull Object obj) {
        return super.edgeValueOrDefault(endpointPair, obj);
    }

    @Override // p000.KM1, com.google.common.graph.AbstractValueGraph, p000.AbstractC16802u, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(EndpointPair endpointPair) {
        return super.hasEdgeConnecting(endpointPair);
    }

    @Override // com.google.common.graph.AbstractValueGraph, p000.AbstractC16802u, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public ElementOrder<N> incidentEdgeOrder() {
        return ElementOrder.stable();
    }

    @Override // p000.KM1, com.google.common.graph.AbstractValueGraph, p000.AbstractC16802u, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set incidentEdges(Object obj) {
        return super.incidentEdges(obj);
    }

    @Override // p000.KM1, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean isDirected() {
        return super.isDirected();
    }

    @Override // p000.KM1, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ ElementOrder nodeOrder() {
        return super.nodeOrder();
    }

    @Override // p000.KM1, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set nodes() {
        return super.nodes();
    }

    @Override // p000.KM1, com.google.common.graph.AbstractValueGraph, p000.InterfaceC0597Ia, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set predecessors(Object obj) {
        return super.predecessors(obj);
    }

    @Override // p000.KM1, com.google.common.graph.AbstractValueGraph, p000.InterfaceC0597Ia, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set successors(Object obj) {
        return super.successors(obj);
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.ValueGraph
    public ImmutableGraph<N> asGraph() {
        return new ImmutableGraph<>(this);
    }

    @Override // p000.KM1, com.google.common.graph.ValueGraph
    @CheckForNull
    public /* bridge */ /* synthetic */ Object edgeValueOrDefault(Object obj, Object obj2, @CheckForNull Object obj3) {
        return super.edgeValueOrDefault(obj, obj2, obj3);
    }

    @Override // p000.KM1, com.google.common.graph.AbstractValueGraph, p000.AbstractC16802u, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(Object obj, Object obj2) {
        return super.hasEdgeConnecting(obj, obj2);
    }

    @Deprecated
    public static <N, V> ImmutableValueGraph<N, V> copyOf(ImmutableValueGraph<N, V> immutableValueGraph) {
        return (ImmutableValueGraph) Preconditions.checkNotNull(immutableValueGraph);
    }
}