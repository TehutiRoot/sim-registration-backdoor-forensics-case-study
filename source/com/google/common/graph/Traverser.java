package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.DoNotMock;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

@DoNotMock("Call forGraph or forTree, passing a lambda or a Graph with the desired edges (built with GraphBuilder)")
@Beta
/* loaded from: classes4.dex */
public abstract class Traverser<N> {

    /* renamed from: a */
    public final SuccessorsFunction f53788a;

    /* loaded from: classes4.dex */
    public enum InsertionOrder {
        FRONT { // from class: com.google.common.graph.Traverser.InsertionOrder.1
            @Override // com.google.common.graph.Traverser.InsertionOrder
            public <T> void insertInto(Deque<T> deque, T t) {
                deque.addFirst(t);
            }
        },
        BACK { // from class: com.google.common.graph.Traverser.InsertionOrder.2
            @Override // com.google.common.graph.Traverser.InsertionOrder
            public <T> void insertInto(Deque<T> deque, T t) {
                deque.addLast(t);
            }
        };

        public abstract <T> void insertInto(Deque<T> deque, T t);

        /* synthetic */ InsertionOrder(C8011a c8011a) {
            this();
        }
    }

    /* renamed from: com.google.common.graph.Traverser$a */
    /* loaded from: classes4.dex */
    public class C8011a extends Traverser {

        /* renamed from: b */
        public final /* synthetic */ SuccessorsFunction f53789b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8011a(SuccessorsFunction successorsFunction, SuccessorsFunction successorsFunction2) {
            super(successorsFunction, null);
            this.f53789b = successorsFunction2;
        }

        @Override // com.google.common.graph.Traverser
        /* renamed from: a */
        public AbstractC8016f mo40107a() {
            return AbstractC8016f.m40105b(this.f53789b);
        }
    }

    /* renamed from: com.google.common.graph.Traverser$b */
    /* loaded from: classes4.dex */
    public class C8012b extends Traverser {

        /* renamed from: b */
        public final /* synthetic */ SuccessorsFunction f53790b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8012b(SuccessorsFunction successorsFunction, SuccessorsFunction successorsFunction2) {
            super(successorsFunction, null);
            this.f53790b = successorsFunction2;
        }

        @Override // com.google.common.graph.Traverser
        /* renamed from: a */
        public AbstractC8016f mo40107a() {
            return AbstractC8016f.m40104c(this.f53790b);
        }
    }

    /* renamed from: com.google.common.graph.Traverser$c */
    /* loaded from: classes4.dex */
    public class C8013c implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ ImmutableSet f53791a;

        /* renamed from: b */
        public final /* synthetic */ Traverser f53792b;

        public C8013c(Traverser traverser, ImmutableSet immutableSet) {
            this.f53791a = immutableSet;
            this.f53792b = traverser;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f53792b.mo40107a().m40106a(this.f53791a.iterator());
        }
    }

    /* renamed from: com.google.common.graph.Traverser$d */
    /* loaded from: classes4.dex */
    public class C8014d implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ ImmutableSet f53793a;

        /* renamed from: b */
        public final /* synthetic */ Traverser f53794b;

        public C8014d(Traverser traverser, ImmutableSet immutableSet) {
            this.f53793a = immutableSet;
            this.f53794b = traverser;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f53794b.mo40107a().m40102e(this.f53793a.iterator());
        }
    }

    /* renamed from: com.google.common.graph.Traverser$e */
    /* loaded from: classes4.dex */
    public class C8015e implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ ImmutableSet f53795a;

        /* renamed from: b */
        public final /* synthetic */ Traverser f53796b;

        public C8015e(Traverser traverser, ImmutableSet immutableSet) {
            this.f53795a = immutableSet;
            this.f53796b = traverser;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f53796b.mo40107a().m40103d(this.f53795a.iterator());
        }
    }

    /* renamed from: com.google.common.graph.Traverser$f */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8016f {

        /* renamed from: a */
        public final SuccessorsFunction f53797a;

        /* renamed from: com.google.common.graph.Traverser$f$a */
        /* loaded from: classes4.dex */
        public class C8017a extends AbstractC8016f {

            /* renamed from: b */
            public final /* synthetic */ Set f53798b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8017a(SuccessorsFunction successorsFunction, Set set) {
                super(successorsFunction);
                this.f53798b = set;
            }

            @Override // com.google.common.graph.Traverser.AbstractC8016f
            /* renamed from: g */
            public Object mo40100g(Deque deque) {
                Iterator it = (Iterator) deque.getFirst();
                while (it.hasNext()) {
                    Object next = it.next();
                    Objects.requireNonNull(next);
                    if (this.f53798b.add(next)) {
                        return next;
                    }
                }
                deque.removeFirst();
                return null;
            }
        }

        /* renamed from: com.google.common.graph.Traverser$f$b */
        /* loaded from: classes4.dex */
        public class C8018b extends AbstractC8016f {
            public C8018b(SuccessorsFunction successorsFunction) {
                super(successorsFunction);
            }

            @Override // com.google.common.graph.Traverser.AbstractC8016f
            /* renamed from: g */
            public Object mo40100g(Deque deque) {
                Iterator it = (Iterator) deque.getFirst();
                if (it.hasNext()) {
                    return Preconditions.checkNotNull(it.next());
                }
                deque.removeFirst();
                return null;
            }
        }

        /* renamed from: com.google.common.graph.Traverser$f$c */
        /* loaded from: classes4.dex */
        public class C8019c extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Deque f53799c;

            /* renamed from: d */
            public final /* synthetic */ InsertionOrder f53800d;

            /* renamed from: e */
            public final /* synthetic */ AbstractC8016f f53801e;

            public C8019c(AbstractC8016f abstractC8016f, Deque deque, InsertionOrder insertionOrder) {
                this.f53799c = deque;
                this.f53800d = insertionOrder;
                this.f53801e = abstractC8016f;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractIterator
            public Object computeNext() {
                do {
                    Object mo40100g = this.f53801e.mo40100g(this.f53799c);
                    if (mo40100g != null) {
                        Iterator it = this.f53801e.f53797a.successors(mo40100g).iterator();
                        if (it.hasNext()) {
                            this.f53800d.insertInto(this.f53799c, it);
                        }
                        return mo40100g;
                    }
                } while (!this.f53799c.isEmpty());
                return endOfData();
            }
        }

        /* renamed from: com.google.common.graph.Traverser$f$d */
        /* loaded from: classes4.dex */
        public class C8020d extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Deque f53802c;

            /* renamed from: d */
            public final /* synthetic */ Deque f53803d;

            /* renamed from: e */
            public final /* synthetic */ AbstractC8016f f53804e;

            public C8020d(AbstractC8016f abstractC8016f, Deque deque, Deque deque2) {
                this.f53802c = deque;
                this.f53803d = deque2;
                this.f53804e = abstractC8016f;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractIterator
            public Object computeNext() {
                while (true) {
                    Object mo40100g = this.f53804e.mo40100g(this.f53802c);
                    if (mo40100g != null) {
                        Iterator it = this.f53804e.f53797a.successors(mo40100g).iterator();
                        if (!it.hasNext()) {
                            return mo40100g;
                        }
                        this.f53802c.addFirst(it);
                        this.f53803d.push(mo40100g);
                    } else if (!this.f53803d.isEmpty()) {
                        return this.f53803d.pop();
                    } else {
                        return endOfData();
                    }
                }
            }
        }

        public AbstractC8016f(SuccessorsFunction successorsFunction) {
            this.f53797a = successorsFunction;
        }

        /* renamed from: b */
        public static AbstractC8016f m40105b(SuccessorsFunction successorsFunction) {
            return new C8017a(successorsFunction, new HashSet());
        }

        /* renamed from: c */
        public static AbstractC8016f m40104c(SuccessorsFunction successorsFunction) {
            return new C8018b(successorsFunction);
        }

        /* renamed from: a */
        public final Iterator m40106a(Iterator it) {
            return m40101f(it, InsertionOrder.BACK);
        }

        /* renamed from: d */
        public final Iterator m40103d(Iterator it) {
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(it);
            return new C8020d(this, arrayDeque2, arrayDeque);
        }

        /* renamed from: e */
        public final Iterator m40102e(Iterator it) {
            return m40101f(it, InsertionOrder.FRONT);
        }

        /* renamed from: f */
        public final Iterator m40101f(Iterator it, InsertionOrder insertionOrder) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(it);
            return new C8019c(this, arrayDeque, insertionOrder);
        }

        /* renamed from: g */
        public abstract Object mo40100g(Deque deque);
    }

    public /* synthetic */ Traverser(SuccessorsFunction successorsFunction, C8011a c8011a) {
        this(successorsFunction);
    }

    public static <N> Traverser<N> forGraph(SuccessorsFunction<N> successorsFunction) {
        return new C8011a(successorsFunction, successorsFunction);
    }

    public static <N> Traverser<N> forTree(SuccessorsFunction<N> successorsFunction) {
        if (successorsFunction instanceof InterfaceC0607Ia) {
            Preconditions.checkArgument(((InterfaceC0607Ia) successorsFunction).isDirected(), "Undirected graphs can never be trees.");
        }
        if (successorsFunction instanceof Network) {
            Preconditions.checkArgument(((Network) successorsFunction).isDirected(), "Undirected networks can never be trees.");
        }
        return new C8012b(successorsFunction, successorsFunction);
    }

    /* renamed from: a */
    public abstract AbstractC8016f mo40107a();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final ImmutableSet m40108b(Iterable iterable) {
        ImmutableSet copyOf = ImmutableSet.copyOf(iterable);
        UnmodifiableIterator it = copyOf.iterator();
        while (it.hasNext()) {
            this.f53788a.successors(it.next());
        }
        return copyOf;
    }

    public final Iterable<N> breadthFirst(N n) {
        return breadthFirst((Iterable) ImmutableSet.m40930of(n));
    }

    public final Iterable<N> depthFirstPostOrder(N n) {
        return depthFirstPostOrder((Iterable) ImmutableSet.m40930of(n));
    }

    public final Iterable<N> depthFirstPreOrder(N n) {
        return depthFirstPreOrder((Iterable) ImmutableSet.m40930of(n));
    }

    public Traverser(SuccessorsFunction successorsFunction) {
        this.f53788a = (SuccessorsFunction) Preconditions.checkNotNull(successorsFunction);
    }

    public final Iterable<N> breadthFirst(Iterable<? extends N> iterable) {
        return new C8013c(this, m40108b(iterable));
    }

    public final Iterable<N> depthFirstPostOrder(Iterable<? extends N> iterable) {
        return new C8015e(this, m40108b(iterable));
    }

    public final Iterable<N> depthFirstPreOrder(Iterable<? extends N> iterable) {
        return new C8014d(this, m40108b(iterable));
    }
}
