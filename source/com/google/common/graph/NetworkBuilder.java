package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.graph.ImmutableNetwork;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@Beta
/* loaded from: classes4.dex */
public final class NetworkBuilder<N, E> extends AbstractC0638J {

    /* renamed from: f */
    public boolean f53785f;

    /* renamed from: g */
    public ElementOrder f53786g;

    /* renamed from: h */
    public Optional f53787h;

    public NetworkBuilder(boolean z) {
        super(z);
        this.f53785f = false;
        this.f53786g = ElementOrder.insertion();
        this.f53787h = Optional.absent();
    }

    public static NetworkBuilder<Object, Object> directed() {
        return new NetworkBuilder<>(true);
    }

    public static <N, E> NetworkBuilder<N, E> from(Network<N, E> network) {
        return new NetworkBuilder(network.isDirected()).allowsParallelEdges(network.allowsParallelEdges()).allowsSelfLoops(network.allowsSelfLoops()).nodeOrder(network.nodeOrder()).edgeOrder(network.edgeOrder());
    }

    public static NetworkBuilder<Object, Object> undirected() {
        return new NetworkBuilder<>(false);
    }

    /* renamed from: a */
    public final NetworkBuilder m40109a() {
        return this;
    }

    @CanIgnoreReturnValue
    public NetworkBuilder<N, E> allowsParallelEdges(boolean z) {
        this.f53785f = z;
        return this;
    }

    @CanIgnoreReturnValue
    public NetworkBuilder<N, E> allowsSelfLoops(boolean z) {
        this.f2665b = z;
        return this;
    }

    public <N1 extends N, E1 extends E> MutableNetwork<N1, E1> build() {
        return new KL1(this);
    }

    public <E1 extends E> NetworkBuilder<N, E1> edgeOrder(ElementOrder<E1> elementOrder) {
        NetworkBuilder<N, E1> m40109a = m40109a();
        m40109a.f53786g = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return m40109a;
    }

    @CanIgnoreReturnValue
    public NetworkBuilder<N, E> expectedEdgeCount(int i) {
        this.f53787h = Optional.m41313of(Integer.valueOf(Graphs.m40141b(i)));
        return this;
    }

    @CanIgnoreReturnValue
    public NetworkBuilder<N, E> expectedNodeCount(int i) {
        this.f2668e = Optional.m41313of(Integer.valueOf(Graphs.m40141b(i)));
        return this;
    }

    public <N1 extends N, E1 extends E> ImmutableNetwork.Builder<N1, E1> immutable() {
        return new ImmutableNetwork.Builder<>(m40109a());
    }

    public <N1 extends N> NetworkBuilder<N1, E> nodeOrder(ElementOrder<N1> elementOrder) {
        NetworkBuilder<N1, E> m40109a = m40109a();
        m40109a.f2666c = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return m40109a;
    }
}
