package p000;

import com.google.common.graph.AbstractNetwork;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.Network;
import java.util.Set;

/* renamed from: H40 */
/* loaded from: classes4.dex */
public abstract class H40 extends AbstractNetwork {
    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set adjacentEdges(Object obj) {
        return mo40131o().adjacentEdges(obj);
    }

    @Override // com.google.common.graph.Network
    public Set adjacentNodes(Object obj) {
        return mo40131o().adjacentNodes(obj);
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
        return mo40131o().allowsParallelEdges();
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
        return mo40131o().allowsSelfLoops();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int degree(Object obj) {
        return mo40131o().degree(obj);
    }

    @Override // com.google.common.graph.Network
    public ElementOrder edgeOrder() {
        return mo40131o().edgeOrder();
    }

    @Override // com.google.common.graph.Network
    public Set edges() {
        return mo40131o().edges();
    }

    @Override // com.google.common.graph.Network
    public Set incidentEdges(Object obj) {
        return mo40131o().incidentEdges(obj);
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
        return mo40131o().isDirected();
    }

    @Override // com.google.common.graph.Network
    public ElementOrder nodeOrder() {
        return mo40131o().nodeOrder();
    }

    @Override // com.google.common.graph.Network
    public Set nodes() {
        return mo40131o().nodes();
    }

    /* renamed from: o */
    public abstract Network mo40131o();
}
