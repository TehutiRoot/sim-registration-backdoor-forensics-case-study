package p000;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.EndpointPair;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import p000.AbstractC16787u;

/* renamed from: u */
/* loaded from: classes4.dex */
public abstract class AbstractC16787u implements InterfaceC0607Ia {

    /* renamed from: u$a */
    /* loaded from: classes4.dex */
    public class C16788a extends AbstractSet {
        public C16788a() {
            AbstractC16787u.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public UnmodifiableIterator iterator() {
            return AbstractC16818uS.m1266c(AbstractC16787u.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair<?> endpointPair = (EndpointPair) obj;
            if (!AbstractC16787u.this.isOrderingCompatible(endpointPair) || !AbstractC16787u.this.nodes().contains(endpointPair.nodeU()) || !AbstractC16787u.this.successors(endpointPair.nodeU()).contains(endpointPair.nodeV())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Ints.saturatedCast(AbstractC16787u.this.edgeCount());
        }
    }

    /* renamed from: u$b */
    /* loaded from: classes4.dex */
    public class C16789b extends AbstractC18678Wd0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16789b(InterfaceC0607Ia interfaceC0607Ia, Object obj) {
            super(interfaceC0607Ia, obj);
            AbstractC16787u.this = r1;
        }

        /* renamed from: a */
        public static /* synthetic */ EndpointPair m1338a(C16789b c16789b, Object obj) {
            return c16789b.m1333f(obj);
        }

        /* renamed from: b */
        public static /* synthetic */ EndpointPair m1337b(C16789b c16789b, Object obj) {
            return c16789b.m1332g(obj);
        }

        /* renamed from: c */
        public static /* synthetic */ EndpointPair m1336c(C16789b c16789b, Object obj) {
            return c16789b.m1334e(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: d */
        public UnmodifiableIterator iterator() {
            if (this.f7248b.isDirected()) {
                return Iterators.unmodifiableIterator(Iterators.concat(Iterators.transform(this.f7248b.predecessors(this.f7247a).iterator(), new Function() { // from class: v
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return AbstractC16787u.C16789b.m1336c(AbstractC16787u.C16789b.this, obj);
                    }
                }), Iterators.transform(Sets.difference(this.f7248b.successors(this.f7247a), ImmutableSet.m40930of(this.f7247a)).iterator(), new Function() { // from class: w
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return AbstractC16787u.C16789b.m1338a(AbstractC16787u.C16789b.this, obj);
                    }
                })));
            }
            return Iterators.unmodifiableIterator(Iterators.transform(this.f7248b.adjacentNodes(this.f7247a).iterator(), new Function() { // from class: x
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return AbstractC16787u.C16789b.m1337b(AbstractC16787u.C16789b.this, obj);
                }
            }));
        }

        /* renamed from: e */
        public final /* synthetic */ EndpointPair m1334e(Object obj) {
            return EndpointPair.ordered(obj, this.f7247a);
        }

        /* renamed from: f */
        public final /* synthetic */ EndpointPair m1333f(Object obj) {
            return EndpointPair.ordered(this.f7247a, obj);
        }

        /* renamed from: g */
        public final /* synthetic */ EndpointPair m1332g(Object obj) {
            return EndpointPair.unordered(this.f7247a, obj);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Boolean m1347a(AbstractC16787u abstractC16787u, Object obj, Object obj2) {
        return abstractC16787u.m1341g(obj, obj2);
    }

    /* renamed from: b */
    public static /* synthetic */ String m1346b(Object obj, Object obj2) {
        return m1340h(obj, obj2);
    }

    /* renamed from: c */
    public static /* synthetic */ Boolean m1345c(AbstractC16787u abstractC16787u, Object obj) {
        return abstractC16787u.m1343e(obj);
    }

    /* renamed from: d */
    public static /* synthetic */ String m1344d(Object obj) {
        return m1342f(obj);
    }

    /* renamed from: f */
    public static /* synthetic */ String m1342f(Object obj) {
        return String.format("Node %s that was used to generate this set is no longer in the graph.", obj);
    }

    /* renamed from: h */
    public static /* synthetic */ String m1340h(Object obj, Object obj2) {
        return String.format("Node %s or node %s that were used to generate this set are no longer in the graph.", obj, obj2);
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public int degree(Object obj) {
        int i;
        if (isDirected()) {
            return IntMath.saturatedAdd(predecessors(obj).size(), successors(obj).size());
        }
        Set adjacentNodes = adjacentNodes(obj);
        if (allowsSelfLoops() && adjacentNodes.contains(obj)) {
            i = 1;
        } else {
            i = 0;
        }
        return IntMath.saturatedAdd(adjacentNodes.size(), i);
    }

    /* renamed from: e */
    public final /* synthetic */ Boolean m1343e(Object obj) {
        return Boolean.valueOf(nodes().contains(obj));
    }

    public long edgeCount() {
        Iterator it;
        boolean z;
        long j = 0;
        while (nodes().iterator().hasNext()) {
            j += degree(it.next());
        }
        if ((1 & j) == 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return j >>> 1;
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public Set edges() {
        return new C16788a();
    }

    /* renamed from: g */
    public final /* synthetic */ Boolean m1341g(Object obj, Object obj2) {
        boolean z;
        if (nodes().contains(obj) && nodes().contains(obj2)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public boolean hasEdgeConnecting(Object obj, Object obj2) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj2);
        return nodes().contains(obj) && successors(obj).contains(obj2);
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public int inDegree(Object obj) {
        if (isDirected()) {
            return predecessors(obj).size();
        }
        return degree(obj);
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public ElementOrder incidentEdgeOrder() {
        return ElementOrder.unordered();
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public Set incidentEdges(Object obj) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkArgument(nodes().contains(obj), "Node %s is not an element of this graph.", obj);
        return nodeInvalidatableSet(new C16789b(this, obj), obj);
    }

    public final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
        if (endpointPair.isOrdered() == isDirected()) {
            return true;
        }
        return false;
    }

    public final <T> Set<T> nodeInvalidatableSet(Set<T> set, final Object obj) {
        return C20419ig0.m30613e(set, new Supplier() { // from class: s
            {
                AbstractC16787u.this = this;
            }

            @Override // com.google.common.base.Supplier
            public final Object get() {
                return AbstractC16787u.m1345c(AbstractC16787u.this, obj);
            }
        }, new Supplier() { // from class: t
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return AbstractC16787u.m1344d(obj);
            }
        });
    }

    public final <T> Set<T> nodePairInvalidatableSet(Set<T> set, final Object obj, final Object obj2) {
        return C20419ig0.m30613e(set, new Supplier() { // from class: q
            {
                AbstractC16787u.this = this;
            }

            @Override // com.google.common.base.Supplier
            public final Object get() {
                return AbstractC16787u.m1347a(AbstractC16787u.this, obj, obj2);
            }
        }, new Supplier() { // from class: r
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return AbstractC16787u.m1346b(obj, obj2);
            }
        });
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public int outDegree(Object obj) {
        if (isDirected()) {
            return successors(obj).size();
        }
        return degree(obj);
    }

    public final void validateEndpoints(EndpointPair<?> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(isOrderingCompatible(endpointPair), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public boolean hasEdgeConnecting(EndpointPair endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (isOrderingCompatible(endpointPair)) {
            Object nodeU = endpointPair.nodeU();
            return nodes().contains(nodeU) && successors(nodeU).contains(endpointPair.nodeV());
        }
        return false;
    }
}
