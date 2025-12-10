package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;
import java.util.Collection;
import java.util.Objects;

/* renamed from: KL1 */
/* loaded from: classes4.dex */
public final class KL1 extends ML1 implements MutableNetwork {
    public KL1(NetworkBuilder networkBuilder) {
        super(networkBuilder);
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean addEdge(Object obj, Object obj2, Object obj3) {
        Preconditions.checkNotNull(obj, "nodeU");
        Preconditions.checkNotNull(obj2, "nodeV");
        Preconditions.checkNotNull(obj3, "edge");
        boolean z = false;
        if (m67399q(obj3)) {
            EndpointPair incidentNodes = incidentNodes(obj3);
            EndpointPair m40145b = EndpointPair.m40145b(this, obj, obj2);
            Preconditions.checkArgument(incidentNodes.equals(m40145b), "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.", obj3, incidentNodes, m40145b);
            return false;
        }
        InterfaceC19154bH0 interfaceC19154bH0 = (InterfaceC19154bH0) this.f3756f.mo66730e(obj);
        if (!allowsParallelEdges()) {
            Preconditions.checkArgument((interfaceC19154bH0 == null || !interfaceC19154bH0.mo953b().contains(obj2)) ? true : true, "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.", obj, obj2);
        }
        boolean equals = obj.equals(obj2);
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!equals, "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", obj);
        }
        if (interfaceC19154bH0 == null) {
            interfaceC19154bH0 = m67619s(obj);
        }
        interfaceC19154bH0.mo946i(obj3, obj2);
        InterfaceC19154bH0 interfaceC19154bH02 = (InterfaceC19154bH0) this.f3756f.mo66730e(obj2);
        if (interfaceC19154bH02 == null) {
            interfaceC19154bH02 = m67619s(obj2);
        }
        interfaceC19154bH02.mo945j(obj3, obj, equals);
        this.f3757g.m67288h(obj3, obj);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean addNode(Object obj) {
        Preconditions.checkNotNull(obj, "node");
        if (m67398r(obj)) {
            return false;
        }
        m67619s(obj);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean removeEdge(Object obj) {
        Preconditions.checkNotNull(obj, "edge");
        Object mo66730e = this.f3757g.mo66730e(obj);
        boolean z = false;
        if (mo66730e == null) {
            return false;
        }
        InterfaceC19154bH0 interfaceC19154bH0 = (InterfaceC19154bH0) this.f3756f.mo66730e(mo66730e);
        Objects.requireNonNull(interfaceC19154bH0);
        InterfaceC19154bH0 interfaceC19154bH02 = interfaceC19154bH0;
        Object mo951d = interfaceC19154bH02.mo951d(obj);
        InterfaceC19154bH0 interfaceC19154bH03 = (InterfaceC19154bH0) this.f3756f.mo66730e(mo951d);
        Objects.requireNonNull(interfaceC19154bH03);
        InterfaceC19154bH0 interfaceC19154bH04 = interfaceC19154bH03;
        interfaceC19154bH02.mo949f(obj);
        if (allowsSelfLoops() && mo66730e.equals(mo951d)) {
            z = true;
        }
        interfaceC19154bH04.mo947h(obj, z);
        this.f3757g.m67287i(obj);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean removeNode(Object obj) {
        Preconditions.checkNotNull(obj, "node");
        InterfaceC19154bH0 interfaceC19154bH0 = (InterfaceC19154bH0) this.f3756f.mo66730e(obj);
        if (interfaceC19154bH0 == null) {
            return false;
        }
        UnmodifiableIterator it = ImmutableList.copyOf((Collection) interfaceC19154bH0.mo944k()).iterator();
        while (it.hasNext()) {
            removeEdge(it.next());
        }
        this.f3756f.m67287i(obj);
        return true;
    }

    /* renamed from: s */
    public final InterfaceC19154bH0 m67619s(Object obj) {
        boolean z;
        InterfaceC19154bH0 m67618t = m67618t();
        if (this.f3756f.m67288h(obj, m67618t) == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return m67618t;
    }

    /* renamed from: t */
    public final InterfaceC19154bH0 m67618t() {
        if (isDirected()) {
            if (allowsParallelEdges()) {
                return C1744YI.m65373p();
            }
            return C1814ZI.m65249n();
        } else if (allowsParallelEdges()) {
            return C20742kY1.m28918p();
        } else {
            return C20914lY1.m26458m();
        }
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean addEdge(EndpointPair endpointPair, Object obj) {
        validateEndpoints(endpointPair);
        return addEdge(endpointPair.nodeU(), endpointPair.nodeV(), obj);
    }
}
