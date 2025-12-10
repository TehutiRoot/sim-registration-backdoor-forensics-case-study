package p000;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.graph.AbstractValueGraph;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graphs;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: NL1 */
/* loaded from: classes4.dex */
public class NL1 extends AbstractValueGraph {

    /* renamed from: a */
    public final boolean f4076a;

    /* renamed from: b */
    public final boolean f4077b;

    /* renamed from: c */
    public final ElementOrder f4078c;

    /* renamed from: d */
    public final C18067Mn0 f4079d;

    /* renamed from: e */
    public long f4080e;

    /* renamed from: NL1$a */
    /* loaded from: classes4.dex */
    public class C0938a extends AbstractC18678Wd0 {

        /* renamed from: c */
        public final /* synthetic */ U60 f4081c;

        /* renamed from: d */
        public final /* synthetic */ NL1 f4082d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0938a(NL1 nl1, InterfaceC0607Ia interfaceC0607Ia, Object obj, U60 u60) {
            super(interfaceC0607Ia, obj);
            this.f4081c = u60;
            this.f4082d = nl1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return this.f4081c.mo40068h(this.f7247a);
        }
    }

    public NL1(AbstractC0638J abstractC0638J) {
        this(abstractC0638J, abstractC0638J.f2666c.m40147b(((Integer) abstractC0638J.f2668e.mo41298or((Optional) 10)).intValue()), 0L);
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public Set adjacentNodes(Object obj) {
        return nodeInvalidatableSet(m67230l(obj).mo40075a(), obj);
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public boolean allowsSelfLoops() {
        return this.f4077b;
    }

    @Override // p000.AbstractC16787u
    public long edgeCount() {
        return this.f4080e;
    }

    @Override // com.google.common.graph.ValueGraph
    public Object edgeValueOrDefault(Object obj, Object obj2, Object obj3) {
        return m67228n(Preconditions.checkNotNull(obj), Preconditions.checkNotNull(obj2), obj3);
    }

    @Override // com.google.common.graph.AbstractValueGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public boolean hasEdgeConnecting(Object obj, Object obj2) {
        return m67227o(Preconditions.checkNotNull(obj), Preconditions.checkNotNull(obj2));
    }

    @Override // com.google.common.graph.AbstractValueGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public Set incidentEdges(Object obj) {
        return nodeInvalidatableSet(new C0938a(this, this, obj, m67230l(obj)), obj);
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public boolean isDirected() {
        return this.f4076a;
    }

    /* renamed from: l */
    public final U60 m67230l(Object obj) {
        U60 u60 = (U60) this.f4079d.mo66730e(obj);
        if (u60 != null) {
            return u60;
        }
        Preconditions.checkNotNull(obj);
        throw new IllegalArgumentException("Node " + obj + " is not an element of this graph.");
    }

    /* renamed from: m */
    public final boolean m67229m(Object obj) {
        return this.f4079d.m67290d(obj);
    }

    /* renamed from: n */
    public final Object m67228n(Object obj, Object obj2, Object obj3) {
        Object mo40071e;
        U60 u60 = (U60) this.f4079d.mo66730e(obj);
        if (u60 == null) {
            mo40071e = null;
        } else {
            mo40071e = u60.mo40071e(obj2);
        }
        if (mo40071e == null) {
            return obj3;
        }
        return mo40071e;
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public ElementOrder nodeOrder() {
        return this.f4078c;
    }

    @Override // p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public Set nodes() {
        return this.f4079d.m67286j();
    }

    /* renamed from: o */
    public final boolean m67227o(Object obj, Object obj2) {
        U60 u60 = (U60) this.f4079d.mo66730e(obj);
        if (u60 != null && u60.mo40074b().contains(obj2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.graph.ValueGraph
    public Object edgeValueOrDefault(EndpointPair endpointPair, Object obj) {
        validateEndpoints(endpointPair);
        return m67228n(endpointPair.nodeU(), endpointPair.nodeV(), obj);
    }

    @Override // com.google.common.graph.AbstractValueGraph, p000.AbstractC16787u, p000.InterfaceC0607Ia, com.google.common.graph.Graph
    public boolean hasEdgeConnecting(EndpointPair endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        return isOrderingCompatible(endpointPair) && m67227o(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.AbstractValueGraph, p000.InterfaceC0607Ia, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public Set predecessors(Object obj) {
        return nodeInvalidatableSet(m67230l(obj).mo40073c(), obj);
    }

    @Override // com.google.common.graph.AbstractValueGraph, p000.InterfaceC0607Ia, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public Set successors(Object obj) {
        return nodeInvalidatableSet(m67230l(obj).mo40074b(), obj);
    }

    public NL1(AbstractC0638J abstractC0638J, Map map, long j) {
        C18067Mn0 c18067Mn0;
        this.f4076a = abstractC0638J.f2664a;
        this.f4077b = abstractC0638J.f2665b;
        this.f4078c = abstractC0638J.f2666c.m40148a();
        if (map instanceof TreeMap) {
            c18067Mn0 = new C18259Pn0(map);
        } else {
            c18067Mn0 = new C18067Mn0(map);
        }
        this.f4079d = c18067Mn0;
        this.f4080e = Graphs.m40140c(j);
    }
}
