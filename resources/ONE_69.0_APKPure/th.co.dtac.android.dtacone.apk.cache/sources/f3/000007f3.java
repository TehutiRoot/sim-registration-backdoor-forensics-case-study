package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.C8010a;
import com.google.common.graph.C8026c;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableValueGraph;
import java.util.Collection;
import java.util.Objects;

/* renamed from: IM1 */
/* loaded from: classes4.dex */
public final class IM1 extends KM1 implements MutableValueGraph {

    /* renamed from: f */
    public final ElementOrder f2673f;

    public IM1(AbstractC0625J abstractC0625J) {
        super(abstractC0625J);
        this.f2673f = abstractC0625J.f2871d.m40139a();
    }

    @Override // com.google.common.graph.MutableValueGraph
    public boolean addNode(Object obj) {
        Preconditions.checkNotNull(obj, "node");
        if (m67724m(obj)) {
            return false;
        }
        m68019p(obj);
        return true;
    }

    @Override // com.google.common.graph.AbstractValueGraph, p000.AbstractC16802u, p000.InterfaceC0597Ia, com.google.common.graph.Graph
    public ElementOrder incidentEdgeOrder() {
        return this.f2673f;
    }

    /* renamed from: p */
    public final InterfaceC18993a70 m68019p(Object obj) {
        boolean z;
        InterfaceC18993a70 m68018q = m68018q();
        if (this.f3294d.m66446h(obj, m68018q) == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return m68018q;
    }

    @Override // com.google.common.graph.MutableValueGraph
    public Object putEdgeValue(Object obj, Object obj2, Object obj3) {
        Preconditions.checkNotNull(obj, "nodeU");
        Preconditions.checkNotNull(obj2, "nodeV");
        Preconditions.checkNotNull(obj3, "value");
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!obj.equals(obj2), "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", obj);
        }
        InterfaceC18993a70 interfaceC18993a70 = (InterfaceC18993a70) this.f3294d.mo65863e(obj);
        if (interfaceC18993a70 == null) {
            interfaceC18993a70 = m68019p(obj);
        }
        Object mo40058i = interfaceC18993a70.mo40058i(obj2, obj3);
        InterfaceC18993a70 interfaceC18993a702 = (InterfaceC18993a70) this.f3294d.mo65863e(obj2);
        if (interfaceC18993a702 == null) {
            interfaceC18993a702 = m68019p(obj2);
        }
        interfaceC18993a702.mo40063d(obj, obj3);
        if (mo40058i == null) {
            long j = this.f3295e + 1;
            this.f3295e = j;
            Graphs.m40129e(j);
        }
        return mo40058i;
    }

    /* renamed from: q */
    public final InterfaceC18993a70 m68018q() {
        if (isDirected()) {
            return C8010a.m40074x(this.f2673f);
        }
        return C8026c.m40055l(this.f2673f);
    }

    @Override // com.google.common.graph.MutableValueGraph
    public Object removeEdge(Object obj, Object obj2) {
        Preconditions.checkNotNull(obj, "nodeU");
        Preconditions.checkNotNull(obj2, "nodeV");
        InterfaceC18993a70 interfaceC18993a70 = (InterfaceC18993a70) this.f3294d.mo65863e(obj);
        InterfaceC18993a70 interfaceC18993a702 = (InterfaceC18993a70) this.f3294d.mo65863e(obj2);
        if (interfaceC18993a70 == null || interfaceC18993a702 == null) {
            return null;
        }
        Object mo40061f = interfaceC18993a70.mo40061f(obj2);
        if (mo40061f != null) {
            interfaceC18993a702.mo40060g(obj);
            long j = this.f3295e - 1;
            this.f3295e = j;
            Graphs.m40131c(j);
        }
        return mo40061f;
    }

    @Override // com.google.common.graph.MutableValueGraph
    public boolean removeNode(Object obj) {
        boolean z;
        Preconditions.checkNotNull(obj, "node");
        InterfaceC18993a70 interfaceC18993a70 = (InterfaceC18993a70) this.f3294d.mo65863e(obj);
        if (interfaceC18993a70 == null) {
            return false;
        }
        if (allowsSelfLoops() && interfaceC18993a70.mo40061f(obj) != null) {
            interfaceC18993a70.mo40060g(obj);
            this.f3295e--;
        }
        UnmodifiableIterator it = ImmutableList.copyOf((Collection) interfaceC18993a70.mo40065b()).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC18993a70 interfaceC18993a702 = (InterfaceC18993a70) this.f3294d.m66447g(next);
            Objects.requireNonNull(interfaceC18993a702);
            interfaceC18993a702.mo40060g(obj);
            Objects.requireNonNull(interfaceC18993a70.mo40061f(next));
            this.f3295e--;
        }
        if (isDirected()) {
            UnmodifiableIterator it2 = ImmutableList.copyOf((Collection) interfaceC18993a70.mo40064c()).iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                InterfaceC18993a70 interfaceC18993a703 = (InterfaceC18993a70) this.f3294d.m66447g(next2);
                Objects.requireNonNull(interfaceC18993a703);
                if (interfaceC18993a703.mo40061f(obj) != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z);
                interfaceC18993a70.mo40060g(next2);
                this.f3295e--;
            }
        }
        this.f3294d.m66445i(obj);
        Graphs.m40131c(this.f3295e);
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