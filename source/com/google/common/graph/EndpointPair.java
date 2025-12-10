package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.Immutable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

@Immutable(containerOf = {"N"})
@Beta
/* loaded from: classes4.dex */
public abstract class EndpointPair<N> implements Iterable<N> {

    /* renamed from: a */
    public final Object f53773a;

    /* renamed from: b */
    public final Object f53774b;

    /* renamed from: com.google.common.graph.EndpointPair$b */
    /* loaded from: classes4.dex */
    public static final class C8002b extends EndpointPair {
        @Override // com.google.common.graph.EndpointPair
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            if (isOrdered() == endpointPair.isOrdered() && source().equals(endpointPair.source()) && target().equals(endpointPair.target())) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
            return Objects.hashCode(source(), target());
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return true;
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.graph.EndpointPair
        public Object source() {
            return nodeU();
        }

        @Override // com.google.common.graph.EndpointPair
        public Object target() {
            return nodeV();
        }

        public String toString() {
            return "<" + source() + " -> " + target() + ">";
        }

        public C8002b(Object obj, Object obj2) {
            super(obj, obj2);
        }
    }

    /* renamed from: com.google.common.graph.EndpointPair$c */
    /* loaded from: classes4.dex */
    public static final class C8003c extends EndpointPair {
        @Override // com.google.common.graph.EndpointPair
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            if (isOrdered() != endpointPair.isOrdered()) {
                return false;
            }
            if (nodeU().equals(endpointPair.nodeU())) {
                return nodeV().equals(endpointPair.nodeV());
            }
            if (nodeU().equals(endpointPair.nodeV()) && nodeV().equals(endpointPair.nodeU())) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
            return nodeU().hashCode() + nodeV().hashCode();
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
            return false;
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.graph.EndpointPair
        public Object source() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.EndpointPair
        public Object target() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public String toString() {
            return "[" + nodeU() + ", " + nodeV() + "]";
        }

        public C8003c(Object obj, Object obj2) {
            super(obj, obj2);
        }
    }

    /* renamed from: a */
    public static EndpointPair m40146a(Graph graph, Object obj, Object obj2) {
        if (graph.isDirected()) {
            return ordered(obj, obj2);
        }
        return unordered(obj, obj2);
    }

    /* renamed from: b */
    public static EndpointPair m40145b(Network network, Object obj, Object obj2) {
        if (network.isDirected()) {
            return ordered(obj, obj2);
        }
        return unordered(obj, obj2);
    }

    public static <N> EndpointPair<N> ordered(N n, N n2) {
        return new C8002b(n, n2);
    }

    public static <N> EndpointPair<N> unordered(N n, N n2) {
        return new C8003c(n2, n);
    }

    public final N adjacentNode(N n) {
        if (n.equals(this.f53773a)) {
            return (N) this.f53774b;
        }
        if (n.equals(this.f53774b)) {
            return (N) this.f53773a;
        }
        throw new IllegalArgumentException("EndpointPair " + this + " does not contain node " + n);
    }

    public abstract boolean equals(@CheckForNull Object obj);

    public abstract int hashCode();

    public abstract boolean isOrdered();

    public final N nodeU() {
        return (N) this.f53773a;
    }

    public final N nodeV() {
        return (N) this.f53774b;
    }

    public abstract N source();

    public abstract N target();

    public EndpointPair(Object obj, Object obj2) {
        this.f53773a = Preconditions.checkNotNull(obj);
        this.f53774b = Preconditions.checkNotNull(obj2);
    }

    @Override // java.lang.Iterable
    public final UnmodifiableIterator<N> iterator() {
        return Iterators.forArray(this.f53773a, this.f53774b);
    }
}
