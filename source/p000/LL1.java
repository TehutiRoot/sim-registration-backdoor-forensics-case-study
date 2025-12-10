package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.C8021a;
import com.google.common.graph.C8037c;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableValueGraph;
import java.util.Collection;
import java.util.Objects;

/* renamed from: LL1 */
/* loaded from: classes4.dex */
public final class LL1 extends NL1 implements MutableValueGraph {

    /* renamed from: f */
    public final ElementOrder f3450f;

    public LL1(AbstractC0638J abstractC0638J) {
        super(abstractC0638J);
        this.f3450f = abstractC0638J.f2667d.m40148a();
    }

    @Override // com.google.common.graph.MutableValueGraph
    public boolean addNode(Object obj) {
        Preconditions.checkNotNull(obj, "node");
        if (m67229m(obj)) {
            return false;
        }
        m67527p(obj);
        return true;
    }

    @Override // com.google.common.graph.AbstractValueGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public ElementOrder incidentEdgeOrder() {
        return this.f3450f;
    }

    /* renamed from: p */
    public final U60 m67527p(Object obj) {
        boolean z;
        U60 m67526q = m67526q();
        if (this.f4079d.m67288h(obj, m67526q) == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return m67526q;
    }

    @Override // com.google.common.graph.MutableValueGraph
    public Object putEdgeValue(Object obj, Object obj2, Object obj3) {
        Preconditions.checkNotNull(obj, "nodeU");
        Preconditions.checkNotNull(obj2, "nodeV");
        Preconditions.checkNotNull(obj3, "value");
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!obj.equals(obj2), "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", obj);
        }
        U60 u60 = (U60) this.f4079d.mo66730e(obj);
        if (u60 == null) {
            u60 = m67527p(obj);
        }
        Object mo40067i = u60.mo40067i(obj2, obj3);
        U60 u602 = (U60) this.f4079d.mo66730e(obj2);
        if (u602 == null) {
            u602 = m67527p(obj2);
        }
        u602.mo40072d(obj, obj3);
        if (mo40067i == null) {
            long j = this.f4080e + 1;
            this.f4080e = j;
            Graphs.m40138e(j);
        }
        return mo40067i;
    }

    /* renamed from: q */
    public final U60 m67526q() {
        if (isDirected()) {
            return C8021a.m40083x(this.f3450f);
        }
        return C8037c.m40064l(this.f3450f);
    }

    @Override // com.google.common.graph.MutableValueGraph
    public Object removeEdge(Object obj, Object obj2) {
        Preconditions.checkNotNull(obj, "nodeU");
        Preconditions.checkNotNull(obj2, "nodeV");
        U60 u60 = (U60) this.f4079d.mo66730e(obj);
        U60 u602 = (U60) this.f4079d.mo66730e(obj2);
        if (u60 == null || u602 == null) {
            return null;
        }
        Object mo40070f = u60.mo40070f(obj2);
        if (mo40070f != null) {
            u602.mo40069g(obj);
            long j = this.f4080e - 1;
            this.f4080e = j;
            Graphs.m40140c(j);
        }
        return mo40070f;
    }

    @Override // com.google.common.graph.MutableValueGraph
    public boolean removeNode(Object obj) {
        boolean z;
        Preconditions.checkNotNull(obj, "node");
        U60 u60 = (U60) this.f4079d.mo66730e(obj);
        if (u60 == null) {
            return false;
        }
        if (allowsSelfLoops() && u60.mo40070f(obj) != null) {
            u60.mo40069g(obj);
            this.f4080e--;
        }
        UnmodifiableIterator it = ImmutableList.copyOf((Collection) u60.mo40074b()).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            U60 u602 = (U60) this.f4079d.m67289g(next);
            Objects.requireNonNull(u602);
            u602.mo40069g(obj);
            Objects.requireNonNull(u60.mo40070f(next));
            this.f4080e--;
        }
        if (isDirected()) {
            UnmodifiableIterator it2 = ImmutableList.copyOf((Collection) u60.mo40073c()).iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                U60 u603 = (U60) this.f4079d.m67289g(next2);
                Objects.requireNonNull(u603);
                if (u603.mo40070f(obj) != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z);
                u60.mo40069g(next2);
                this.f4080e--;
            }
        }
        this.f4079d.m67287i(obj);
        Graphs.m40140c(this.f4080e);
        return true;
    }

    @Override // com.google.common.graph.MutableValueGraph
    public Object removeEdge(EndpointPair endpointPair) {
        validateEndpoints(endpointPair);
        return removeEdge(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.MutableValueGraph
    public Object putEdgeValue(EndpointPair endpointPair, Object obj) {
        validateEndpoints(endpointPair);
        return putEdgeValue(endpointPair.nodeU(), endpointPair.nodeV(), obj);
    }
}
