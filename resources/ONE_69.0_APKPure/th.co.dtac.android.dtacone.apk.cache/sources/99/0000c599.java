package p000;

import com.google.common.graph.Network;

/* renamed from: eH0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC19720eH0 {
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Iterable m31731a(Network network, Object obj) {
        return network.predecessors((Network) obj);
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ Iterable m31730b(Network network, Object obj) {
        return network.successors((Network) obj);
    }
}