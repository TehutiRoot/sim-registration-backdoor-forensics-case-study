package p000;

import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import java.util.Set;

/* renamed from: Y60 */
/* loaded from: classes4.dex */
public abstract class Y60 {
    public static <N> Set<N> reachableNodes(Graph<N> graph, N n) {
        return Graphs.reachableNodes((Graph) graph, (Object) n);
    }

    public static <N> Graph<N> transitiveClosure(Graph<N> graph) {
        return Graphs.transitiveClosure((Graph) graph);
    }
}
