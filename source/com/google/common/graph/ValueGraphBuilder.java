package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.ImmutableValueGraph;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@Beta
/* loaded from: classes4.dex */
public final class ValueGraphBuilder<N, V> extends AbstractC0638J {
    public ValueGraphBuilder(boolean z) {
        super(z);
    }

    public static ValueGraphBuilder<Object, Object> directed() {
        return new ValueGraphBuilder<>(true);
    }

    public static <N, V> ValueGraphBuilder<N, V> from(ValueGraph<N, V> valueGraph) {
        return new ValueGraphBuilder(valueGraph.isDirected()).allowsSelfLoops(valueGraph.allowsSelfLoops()).nodeOrder(valueGraph.nodeOrder()).incidentEdgeOrder(valueGraph.incidentEdgeOrder());
    }

    public static ValueGraphBuilder<Object, Object> undirected() {
        return new ValueGraphBuilder<>(false);
    }

    /* renamed from: a */
    public final ValueGraphBuilder m40099a() {
        return this;
    }

    @CanIgnoreReturnValue
    public ValueGraphBuilder<N, V> allowsSelfLoops(boolean z) {
        this.f2665b = z;
        return this;
    }

    /* renamed from: b */
    public ValueGraphBuilder m40098b() {
        ValueGraphBuilder valueGraphBuilder = new ValueGraphBuilder(this.f2664a);
        valueGraphBuilder.f2665b = this.f2665b;
        valueGraphBuilder.f2666c = this.f2666c;
        valueGraphBuilder.f2668e = this.f2668e;
        valueGraphBuilder.f2667d = this.f2667d;
        return valueGraphBuilder;
    }

    public <N1 extends N, V1 extends V> MutableValueGraph<N1, V1> build() {
        return new LL1(this);
    }

    @CanIgnoreReturnValue
    public ValueGraphBuilder<N, V> expectedNodeCount(int i) {
        this.f2668e = Optional.m41313of(Integer.valueOf(Graphs.m40141b(i)));
        return this;
    }

    public <N1 extends N, V1 extends V> ImmutableValueGraph.Builder<N1, V1> immutable() {
        return new ImmutableValueGraph.Builder<>(m40099a());
    }

    public <N1 extends N> ValueGraphBuilder<N1, V> incidentEdgeOrder(ElementOrder<N1> elementOrder) {
        boolean z;
        if (elementOrder.type() != ElementOrder.Type.UNORDERED && elementOrder.type() != ElementOrder.Type.STABLE) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", elementOrder);
        ValueGraphBuilder<N1, V> m40099a = m40099a();
        m40099a.f2667d = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return m40099a;
    }

    public <N1 extends N> ValueGraphBuilder<N1, V> nodeOrder(ElementOrder<N1> elementOrder) {
        ValueGraphBuilder<N1, V> m40099a = m40099a();
        m40099a.f2666c = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return m40099a;
    }
}
