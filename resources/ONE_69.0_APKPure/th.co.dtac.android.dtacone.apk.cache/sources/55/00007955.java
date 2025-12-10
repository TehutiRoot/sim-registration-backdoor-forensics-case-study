package p000;

import com.google.common.graph.EndpointPair;
import java.util.AbstractSet;
import java.util.Set;

/* renamed from: ce0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC19430ce0 extends AbstractSet {

    /* renamed from: a */
    public final Object f39471a;

    /* renamed from: b */
    public final InterfaceC0597Ia f39472b;

    public AbstractC19430ce0(InterfaceC0597Ia interfaceC0597Ia, Object obj) {
        this.f39472b = interfaceC0597Ia;
        this.f39471a = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof EndpointPair)) {
            return false;
        }
        EndpointPair endpointPair = (EndpointPair) obj;
        if (this.f39472b.isDirected()) {
            if (!endpointPair.isOrdered()) {
                return false;
            }
            Object source = endpointPair.source();
            Object target = endpointPair.target();
            if ((!this.f39471a.equals(source) || !this.f39472b.successors(this.f39471a).contains(target)) && (!this.f39471a.equals(target) || !this.f39472b.predecessors(this.f39471a).contains(source))) {
                return false;
            }
            return true;
        } else if (endpointPair.isOrdered()) {
            return false;
        } else {
            Set adjacentNodes = this.f39472b.adjacentNodes(this.f39471a);
            Object nodeU = endpointPair.nodeU();
            Object nodeV = endpointPair.nodeV();
            if ((!this.f39471a.equals(nodeV) || !adjacentNodes.contains(nodeU)) && (!this.f39471a.equals(nodeU) || !adjacentNodes.contains(nodeV))) {
                return false;
            }
            return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        if (this.f39472b.isDirected()) {
            return (this.f39472b.inDegree(this.f39471a) + this.f39472b.outDegree(this.f39471a)) - (this.f39472b.successors(this.f39471a).contains(this.f39471a) ? 1 : 0);
        }
        return this.f39472b.adjacentNodes(this.f39471a).size();
    }
}