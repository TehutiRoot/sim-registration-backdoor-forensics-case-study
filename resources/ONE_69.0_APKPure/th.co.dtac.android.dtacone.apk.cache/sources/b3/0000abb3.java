package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.ImmutableGraph;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;

@DoNotMock
@Beta
/* loaded from: classes4.dex */
public final class GraphBuilder<N> extends AbstractC0625J {
    public GraphBuilder(boolean z) {
        super(z);
    }

    public static GraphBuilder<Object> directed() {
        return new GraphBuilder<>(true);
    }

    public static <N> GraphBuilder<N> from(Graph<N> graph) {
        return new GraphBuilder(graph.isDirected()).allowsSelfLoops(graph.allowsSelfLoops()).nodeOrder(graph.nodeOrder()).incidentEdgeOrder(graph.incidentEdgeOrder());
    }

    public static GraphBuilder<Object> undirected() {
        return new GraphBuilder<>(false);
    }

    /* renamed from: a */
    public final GraphBuilder m40135a() {
        return this;
    }

    @CanIgnoreReturnValue
    public GraphBuilder<N> allowsSelfLoops(boolean z) {
        this.f2869b = z;
        return this;
    }

    /* renamed from: b */
    public GraphBuilder m40134b() {
        GraphBuilder graphBuilder = new GraphBuilder(this.f2868a);
        graphBuilder.f2869b = this.f2869b;
        graphBuilder.f2870c = this.f2870c;
        graphBuilder.f2872e = this.f2872e;
        graphBuilder.f2871d = this.f2871d;
        return graphBuilder;
    }

    public <N1 extends N> MutableGraph<N1> build() {
        return new C8025b(this);
    }

    @CanIgnoreReturnValue
    public GraphBuilder<N> expectedNodeCount(int i) {
        this.f2872e = Optional.m41300of(Integer.valueOf(Graphs.m40132b(i)));
        return this;
    }

    public <N1 extends N> ImmutableGraph.Builder<N1> immutable() {
        return new ImmutableGraph.Builder<>(m40135a());
    }

    public <N1 extends N> GraphBuilder<N1> incidentEdgeOrder(ElementOrder<N1> elementOrder) {
        boolean z;
        if (elementOrder.type() != ElementOrder.Type.UNORDERED && elementOrder.type() != ElementOrder.Type.STABLE) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", elementOrder);
        GraphBuilder<N1> m40135a = m40135a();
        m40135a.f2871d = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return m40135a;
    }

    public <N1 extends N> GraphBuilder<N1> nodeOrder(ElementOrder<N1> elementOrder) {
        GraphBuilder<N1> m40135a = m40135a();
        m40135a.f2870c = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return m40135a;
    }
}