package p000;

import com.google.common.graph.EndpointPair;
import java.util.AbstractSet;
import java.util.Set;

/* renamed from: Wd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC18678Wd0 extends AbstractSet {

    /* renamed from: a */
    public final Object f7247a;

    /* renamed from: b */
    public final InterfaceC0607Ia f7248b;

    public AbstractC18678Wd0(InterfaceC0607Ia interfaceC0607Ia, Object obj) {
        this.f7248b = interfaceC0607Ia;
        this.f7247a = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof EndpointPair)) {
            return false;
        }
        EndpointPair endpointPair = (EndpointPair) obj;
        if (this.f7248b.isDirected()) {
            if (!endpointPair.isOrdered()) {
                return false;
            }
            Object source = endpointPair.source();
            Object target = endpointPair.target();
            if ((!this.f7247a.equals(source) || !this.f7248b.successors(this.f7247a).contains(target)) && (!this.f7247a.equals(target) || !this.f7248b.predecessors(this.f7247a).contains(source))) {
                return false;
            }
            return true;
        } else if (endpointPair.isOrdered()) {
            return false;
        } else {
            Set adjacentNodes = this.f7248b.adjacentNodes(this.f7247a);
            Object nodeU = endpointPair.nodeU();
            Object nodeV = endpointPair.nodeV();
            if ((!this.f7247a.equals(nodeV) || !adjacentNodes.contains(nodeU)) && (!this.f7247a.equals(nodeU) || !adjacentNodes.contains(nodeV))) {
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
        if (this.f7248b.isDirected()) {
            return (this.f7248b.inDegree(this.f7247a) + this.f7248b.outDegree(this.f7247a)) - (this.f7248b.successors(this.f7247a).contains(this.f7247a) ? 1 : 0);
        }
        return this.f7248b.adjacentNodes(this.f7247a).size();
    }
}
