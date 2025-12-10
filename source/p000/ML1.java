package p000;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.graph.AbstractNetwork;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.NetworkBuilder;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: ML1 */
/* loaded from: classes4.dex */
public abstract class ML1 extends AbstractNetwork {

    /* renamed from: a */
    public final boolean f3751a;

    /* renamed from: b */
    public final boolean f3752b;

    /* renamed from: c */
    public final boolean f3753c;

    /* renamed from: d */
    public final ElementOrder f3754d;

    /* renamed from: e */
    public final ElementOrder f3755e;

    /* renamed from: f */
    public final C18067Mn0 f3756f;

    /* renamed from: g */
    public final C18067Mn0 f3757g;

    public ML1(NetworkBuilder networkBuilder) {
        this(networkBuilder, networkBuilder.f2666c.m40147b(((Integer) networkBuilder.f2668e.mo41298or((Optional) 10)).intValue()), networkBuilder.f53786g.m40147b(((Integer) networkBuilder.f53787h.mo41298or((Optional) 20)).intValue()));
    }

    @Override // com.google.common.graph.Network
    public Set adjacentNodes(Object obj) {
        return nodeInvalidatableSet(m67401o(obj).mo26460a(), obj);
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
        return this.f3752b;
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
        return this.f3753c;
    }

    @Override // com.google.common.graph.Network
    public ElementOrder edgeOrder() {
        return this.f3755e;
    }

    @Override // com.google.common.graph.Network
    public Set edges() {
        return this.f3757g.m67286j();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set edgesConnecting(Object obj, Object obj2) {
        InterfaceC19154bH0 m67401o = m67401o(obj);
        if (!this.f3753c && obj == obj2) {
            return ImmutableSet.m40931of();
        }
        Preconditions.checkArgument(m67398r(obj2), "Node %s is not an element of this graph.", obj2);
        return nodePairInvalidatableSet(m67401o.mo26459l(obj2), obj, obj2);
    }

    @Override // com.google.common.graph.Network
    public Set inEdges(Object obj) {
        return nodeInvalidatableSet(m67401o(obj).mo950e(), obj);
    }

    @Override // com.google.common.graph.Network
    public Set incidentEdges(Object obj) {
        return nodeInvalidatableSet(m67401o(obj).mo944k(), obj);
    }

    @Override // com.google.common.graph.Network
    public EndpointPair incidentNodes(Object obj) {
        Object m67400p = m67400p(obj);
        InterfaceC19154bH0 interfaceC19154bH0 = (InterfaceC19154bH0) this.f3756f.mo66730e(m67400p);
        Objects.requireNonNull(interfaceC19154bH0);
        return EndpointPair.m40145b(this, m67400p, interfaceC19154bH0.mo951d(obj));
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
        return this.f3751a;
    }

    @Override // com.google.common.graph.Network
    public ElementOrder nodeOrder() {
        return this.f3754d;
    }

    @Override // com.google.common.graph.Network
    public Set nodes() {
        return this.f3756f.m67286j();
    }

    /* renamed from: o */
    public final InterfaceC19154bH0 m67401o(Object obj) {
        InterfaceC19154bH0 interfaceC19154bH0 = (InterfaceC19154bH0) this.f3756f.mo66730e(obj);
        if (interfaceC19154bH0 != null) {
            return interfaceC19154bH0;
        }
        Preconditions.checkNotNull(obj);
        throw new IllegalArgumentException(String.format("Node %s is not an element of this graph.", obj));
    }

    @Override // com.google.common.graph.Network
    public Set outEdges(Object obj) {
        return nodeInvalidatableSet(m67401o(obj).mo948g(), obj);
    }

    /* renamed from: p */
    public final Object m67400p(Object obj) {
        Object mo66730e = this.f3757g.mo66730e(obj);
        if (mo66730e != null) {
            return mo66730e;
        }
        Preconditions.checkNotNull(obj);
        throw new IllegalArgumentException(String.format("Edge %s is not an element of this graph.", obj));
    }

    /* renamed from: q */
    public final boolean m67399q(Object obj) {
        return this.f3757g.m67290d(obj);
    }

    /* renamed from: r */
    public final boolean m67398r(Object obj) {
        return this.f3756f.m67290d(obj);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
    public Set predecessors(Object obj) {
        return nodeInvalidatableSet(m67401o(obj).mo952c(), obj);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
    public Set successors(Object obj) {
        return nodeInvalidatableSet(m67401o(obj).mo953b(), obj);
    }

    public ML1(NetworkBuilder networkBuilder, Map map, Map map2) {
        C18067Mn0 c18067Mn0;
        this.f3751a = networkBuilder.f2664a;
        this.f3752b = networkBuilder.f53785f;
        this.f3753c = networkBuilder.f2665b;
        this.f3754d = networkBuilder.f2666c.m40148a();
        this.f3755e = networkBuilder.f53786g.m40148a();
        if (map instanceof TreeMap) {
            c18067Mn0 = new C18259Pn0(map);
        } else {
            c18067Mn0 = new C18067Mn0(map);
        }
        this.f3756f = c18067Mn0;
        this.f3757g = new C18067Mn0(map2);
    }
}
