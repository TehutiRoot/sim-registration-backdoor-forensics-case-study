package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;
import java.util.Collection;
import java.util.Objects;

/* renamed from: HM1 */
/* loaded from: classes4.dex */
public final class HM1 extends JM1 implements MutableNetwork {
    public HM1(NetworkBuilder networkBuilder) {
        super(networkBuilder);
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean addEdge(Object obj, Object obj2, Object obj3) {
        Preconditions.checkNotNull(obj, "nodeU");
        Preconditions.checkNotNull(obj2, "nodeV");
        Preconditions.checkNotNull(obj3, "edge");
        boolean z = false;
        if (m67890q(obj3)) {
            EndpointPair incidentNodes = incidentNodes(obj3);
            EndpointPair m40136b = EndpointPair.m40136b(this, obj, obj2);
            Preconditions.checkArgument(incidentNodes.equals(m40136b), "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.", obj3, incidentNodes, m40136b);
            return false;
        }
        InterfaceC20239hH0 interfaceC20239hH0 = (InterfaceC20239hH0) this.f2989f.mo65863e(obj);
        if (!allowsParallelEdges()) {
            Preconditions.checkArgument((interfaceC20239hH0 == null || !interfaceC20239hH0.mo822b().contains(obj2)) ? true : true, "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.", obj, obj2);
        }
        boolean equals = obj.equals(obj2);
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!equals, "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", obj);
        }
        if (interfaceC20239hH0 == null) {
            interfaceC20239hH0 = m68117s(obj);
        }
        interfaceC20239hH0.mo815i(obj3, obj2);
        InterfaceC20239hH0 interfaceC20239hH02 = (InterfaceC20239hH0) this.f2989f.mo65863e(obj2);
        if (interfaceC20239hH02 == null) {
            interfaceC20239hH02 = m68117s(obj2);
        }
        interfaceC20239hH02.mo814j(obj3, obj, equals);
        this.f2990g.m66446h(obj3, obj);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean addNode(Object obj) {
        Preconditions.checkNotNull(obj, "node");
        if (m67889r(obj)) {
            return false;
        }
        m68117s(obj);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean removeEdge(Object obj) {
        Preconditions.checkNotNull(obj, "edge");
        Object mo65863e = this.f2990g.mo65863e(obj);
        boolean z = false;
        if (mo65863e == null) {
            return false;
        }
        InterfaceC20239hH0 interfaceC20239hH0 = (InterfaceC20239hH0) this.f2989f.mo65863e(mo65863e);
        Objects.requireNonNull(interfaceC20239hH0);
        InterfaceC20239hH0 interfaceC20239hH02 = interfaceC20239hH0;
        Object mo820d = interfaceC20239hH02.mo820d(obj);
        InterfaceC20239hH0 interfaceC20239hH03 = (InterfaceC20239hH0) this.f2989f.mo65863e(mo820d);
        Objects.requireNonNull(interfaceC20239hH03);
        InterfaceC20239hH0 interfaceC20239hH04 = interfaceC20239hH03;
        interfaceC20239hH02.mo818f(obj);
        if (allowsSelfLoops() && mo65863e.equals(mo820d)) {
            z = true;
        }
        interfaceC20239hH04.mo816h(obj, z);
        this.f2990g.m66445i(obj);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean removeNode(Object obj) {
        Preconditions.checkNotNull(obj, "node");
        InterfaceC20239hH0 interfaceC20239hH0 = (InterfaceC20239hH0) this.f2989f.mo65863e(obj);
        if (interfaceC20239hH0 == null) {
            return false;
        }
        UnmodifiableIterator it = ImmutableList.copyOf((Collection) interfaceC20239hH0.mo813k()).iterator();
        while (it.hasNext()) {
            removeEdge(it.next());
        }
        this.f2989f.m66445i(obj);
        return true;
    }

    /* renamed from: s */
    public final InterfaceC20239hH0 m68117s(Object obj) {
        boolean z;
        InterfaceC20239hH0 m68116t = m68116t();
        if (this.f2989f.m66446h(obj, m68116t) == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        return m68116t;
    }

    /* renamed from: t */
    public final InterfaceC20239hH0 m68116t() {
        if (isDirected()) {
            if (allowsParallelEdges()) {
                return C1794ZI.m65245p();
            }
            return C1862aJ.m65160n();
        } else if (allowsParallelEdges()) {
            return C20282hZ1.m31224p();
        } else {
            return C20455iZ1.m30960m();
        }
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean addEdge(EndpointPair endpointPair, Object obj) {
        validateEndpoints(endpointPair);
        return addEdge(endpointPair.nodeU(), endpointPair.nodeV(), obj);
    }
}