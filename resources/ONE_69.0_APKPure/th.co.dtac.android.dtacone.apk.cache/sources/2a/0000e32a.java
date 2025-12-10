package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public class DFS {

    /* loaded from: classes6.dex */
    public static abstract class AbstractNodeHandler<N, R> implements NodeHandler<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public void afterChildren(N n) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public boolean beforeChildren(N n) {
            return true;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class CollectingNodeHandler<N, R, C extends Iterable<R>> extends AbstractNodeHandler<N, C> {
        @NotNull
        protected final C result;

        public CollectingNodeHandler(@NotNull C c) {
            if (c == null) {
                m27789a(0);
            }
            this.result = c;
        }

        /* renamed from: a */
        public static /* synthetic */ void m27789a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "result";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
            } else {
                objArr[1] = "result";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        @NotNull
        public C result() {
            C c = this.result;
            if (c == null) {
                m27789a(1);
            }
            return c;
        }
    }

    /* loaded from: classes6.dex */
    public interface Neighbors<N> {
        @NotNull
        Iterable<? extends N> getNeighbors(N n);
    }

    /* loaded from: classes6.dex */
    public interface NodeHandler<N, R> {
        void afterChildren(N n);

        boolean beforeChildren(N n);

        R result();
    }

    /* loaded from: classes6.dex */
    public static abstract class NodeHandlerWithListResult<N, R> extends CollectingNodeHandler<N, R, LinkedList<R>> {
        public NodeHandlerWithListResult() {
            super(new LinkedList());
        }
    }

    /* loaded from: classes6.dex */
    public interface Visited<N> {
        boolean checkAndMarkVisited(N n);
    }

    /* loaded from: classes6.dex */
    public static class VisitedWithSet<N> implements Visited<N> {

        /* renamed from: a */
        public final Set f70419a;

        public VisitedWithSet() {
            this(new HashSet());
        }

        /* renamed from: a */
        public static /* synthetic */ void m27788a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Visited
        public boolean checkAndMarkVisited(N n) {
            return this.f70419a.add(n);
        }

        public VisitedWithSet(@NotNull Set<N> set) {
            if (set == null) {
                m27788a(0);
            }
            this.f70419a = set;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.DFS$a */
    /* loaded from: classes6.dex */
    public static class C11993a extends AbstractNodeHandler {

        /* renamed from: a */
        public final /* synthetic */ Function1 f70420a;

        /* renamed from: b */
        public final /* synthetic */ boolean[] f70421b;

        public C11993a(Function1 function1, boolean[] zArr) {
            this.f70420a = function1;
            this.f70421b = zArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        /* renamed from: a */
        public Boolean result() {
            return Boolean.valueOf(this.f70421b[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public boolean beforeChildren(Object obj) {
            if (((Boolean) this.f70420a.invoke(obj)).booleanValue()) {
                this.f70421b[0] = true;
            }
            return !this.f70421b[0];
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m27790a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <N, R> R dfs(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull Visited<N> visited, @NotNull NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            m27790a(0);
        }
        if (neighbors == null) {
            m27790a(1);
        }
        if (visited == null) {
            m27790a(2);
        }
        if (nodeHandler == null) {
            m27790a(3);
        }
        for (N n : collection) {
            doDfs(n, neighbors, visited, nodeHandler);
        }
        return nodeHandler.result();
    }

    public static <N> void doDfs(@NotNull N n, @NotNull Neighbors<N> neighbors, @NotNull Visited<N> visited, @NotNull NodeHandler<N, ?> nodeHandler) {
        if (n == null) {
            m27790a(22);
        }
        if (neighbors == null) {
            m27790a(23);
        }
        if (visited == null) {
            m27790a(24);
        }
        if (nodeHandler == null) {
            m27790a(25);
        }
        if (!visited.checkAndMarkVisited(n) || !nodeHandler.beforeChildren(n)) {
            return;
        }
        for (N n2 : neighbors.getNeighbors(n)) {
            doDfs(n2, neighbors, visited, nodeHandler);
        }
        nodeHandler.afterChildren(n);
    }

    public static <N> Boolean ifAny(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull Function1<N, Boolean> function1) {
        if (collection == null) {
            m27790a(7);
        }
        if (neighbors == null) {
            m27790a(8);
        }
        if (function1 == null) {
            m27790a(9);
        }
        return (Boolean) dfs(collection, neighbors, new C11993a(function1, new boolean[1]));
    }

    public static <N, R> R dfs(@NotNull Collection<N> collection, @NotNull Neighbors<N> neighbors, @NotNull NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            m27790a(4);
        }
        if (neighbors == null) {
            m27790a(5);
        }
        if (nodeHandler == null) {
            m27790a(6);
        }
        return (R) dfs(collection, neighbors, new VisitedWithSet(), nodeHandler);
    }
}