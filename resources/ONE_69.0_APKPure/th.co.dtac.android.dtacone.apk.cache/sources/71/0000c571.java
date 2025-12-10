package p000;

import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import java.util.Set;

/* renamed from: e70  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC19690e70 {
    public static <N> Set<N> reachableNodes(Graph<N> graph, N n) {
        return Graphs.reachableNodes((Graph) graph, (Object) n);
    }

    public static <N> Graph<N> transitiveClosure(Graph<N> graph) {
        return Graphs.transitiveClosure((Graph) graph);
    }
}