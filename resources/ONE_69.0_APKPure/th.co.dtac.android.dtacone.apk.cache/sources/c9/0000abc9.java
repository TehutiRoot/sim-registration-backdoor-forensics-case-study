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
    public final SuccessorsFunction f53800a;

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

        /* synthetic */ InsertionOrder(C8000a c8000a) {
            this();
        }
    }

    /* renamed from: com.google.common.graph.Traverser$a */
    /* loaded from: classes4.dex */
    public class C8000a extends Traverser {

        /* renamed from: b */
        public final /* synthetic */ SuccessorsFunction f53801b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8000a(SuccessorsFunction successorsFunction, SuccessorsFunction successorsFunction2) {
            super(successorsFunction, null);
            this.f53801b = successorsFunction2;
        }

        @Override // com.google.common.graph.Traverser
        /* renamed from: a */
        public AbstractC8005f mo40098a() {
            return AbstractC8005f.m40096b(this.f53801b);
        }
    }

    /* renamed from: com.google.common.graph.Traverser$b */
    /* loaded from: classes4.dex */
    public class C8001b extends Traverser {

        /* renamed from: b */
        public final /* synthetic */ SuccessorsFunction f53802b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8001b(SuccessorsFunction successorsFunction, SuccessorsFunction successorsFunction2) {
            super(successorsFunction, null);
            this.f53802b = successorsFunction2;
        }

        @Override // com.google.common.graph.Traverser
        /* renamed from: a */
        public AbstractC8005f mo40098a() {
            return AbstractC8005f.m40095c(this.f53802b);
        }
    }

    /* renamed from: com.google.common.graph.Traverser$c */
    /* loaded from: classes4.dex */
    public class C8002c implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ ImmutableSet f53803a;

        /* renamed from: b */
        public final /* synthetic */ Traverser f53804b;

        public C8002c(Traverser traverser, ImmutableSet immutableSet) {
            this.f53803a = immutableSet;
            this.f53804b = traverser;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f53804b.mo40098a().m40097a(this.f53803a.iterator());
        }
    }

    /* renamed from: com.google.common.graph.Traverser$d */
    /* loaded from: classes4.dex */
    public class C8003d implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ ImmutableSet f53805a;

        /* renamed from: b */
        public final /* synthetic */ Traverser f53806b;

        public C8003d(Traverser traverser, ImmutableSet immutableSet) {
            this.f53805a = immutableSet;
            this.f53806b = traverser;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f53806b.mo40098a().m40093e(this.f53805a.iterator());
        }
    }

    /* renamed from: com.google.common.graph.Traverser$e */
    /* loaded from: classes4.dex */
    public class C8004e implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ ImmutableSet f53807a;

        /* renamed from: b */
        public final /* synthetic */ Traverser f53808b;

        public C8004e(Traverser traverser, ImmutableSet immutableSet) {
            this.f53807a = immutableSet;
            this.f53808b = traverser;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f53808b.mo40098a().m40094d(this.f53807a.iterator());
        }
    }

    /* renamed from: com.google.common.graph.Traverser$f */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8005f {

        /* renamed from: a */
        public final SuccessorsFunction f53809a;

        /* renamed from: com.google.common.graph.Traverser$f$a */
        /* loaded from: classes4.dex */
        public class C8006a extends AbstractC8005f {

            /* renamed from: b */
            public final /* synthetic */ Set f53810b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8006a(SuccessorsFunction successorsFunction, Set set) {
                super(successorsFunction);
                this.f53810b = set;
            }

            @Override // com.google.common.graph.Traverser.AbstractC8005f
            /* renamed from: g */
            public Object mo40091g(Deque deque) {
                Iterator it = (Iterator) deque.getFirst();
                while (it.hasNext()) {
                    Object next = it.next();
                    Objects.requireNonNull(next);
                    if (this.f53810b.add(next)) {
                        return next;
                    }
                }
                deque.removeFirst();
                return null;
            }
        }

        /* renamed from: com.google.common.graph.Traverser$f$b */
        /* loaded from: classes4.dex */
        public class C8007b extends AbstractC8005f {
            public C8007b(SuccessorsFunction successorsFunction) {
                super(successorsFunction);
            }

            @Override // com.google.common.graph.Traverser.AbstractC8005f
            /* renamed from: g */
            public Object mo40091g(Deque deque) {
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
        public class C8008c extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Deque f53811c;

            /* renamed from: d */
            public final /* synthetic */ InsertionOrder f53812d;

            /* renamed from: e */
            public final /* synthetic */ AbstractC8005f f53813e;

            public C8008c(AbstractC8005f abstractC8005f, Deque deque, InsertionOrder insertionOrder) {
                this.f53811c = deque;
                this.f53812d = insertionOrder;
                this.f53813e = abstractC8005f;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractIterator
            public Object computeNext() {
                do {
                    Object mo40091g = this.f53813e.mo40091g(this.f53811c);
                    if (mo40091g != null) {
                        Iterator it = this.f53813e.f53809a.successors(mo40091g).iterator();
                        if (it.hasNext()) {
                            this.f53812d.insertInto(this.f53811c, it);
                        }
                        return mo40091g;
                    }
                } while (!this.f53811c.isEmpty());
                return endOfData();
            }
        }

        /* renamed from: com.google.common.graph.Traverser$f$d */
        /* loaded from: classes4.dex */
        public class C8009d extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Deque f53814c;

            /* renamed from: d */
            public final /* synthetic */ Deque f53815d;

            /* renamed from: e */
            public final /* synthetic */ AbstractC8005f f53816e;

            public C8009d(AbstractC8005f abstractC8005f, Deque deque, Deque deque2) {
                this.f53814c = deque;
                this.f53815d = deque2;
                this.f53816e = abstractC8005f;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractIterator
            public Object computeNext() {
                while (true) {
                    Object mo40091g = this.f53816e.mo40091g(this.f53814c);
                    if (mo40091g != null) {
                        Iterator it = this.f53816e.f53809a.successors(mo40091g).iterator();
                        if (!it.hasNext()) {
                            return mo40091g;
                        }
                        this.f53814c.addFirst(it);
                        this.f53815d.push(mo40091g);
                    } else if (!this.f53815d.isEmpty()) {
                        return this.f53815d.pop();
                    } else {
                        return endOfData();
                    }
                }
            }
        }

        public AbstractC8005f(SuccessorsFunction successorsFunction) {
            this.f53809a = successorsFunction;
        }

        /* renamed from: b */
        public static AbstractC8005f m40096b(SuccessorsFunction successorsFunction) {
            return new C8006a(successorsFunction, new HashSet());
        }

        /* renamed from: c */
        public static AbstractC8005f m40095c(SuccessorsFunction successorsFunction) {
            return new C8007b(successorsFunction);
        }

        /* renamed from: a */
        public final Iterator m40097a(Iterator it) {
            return m40092f(it, InsertionOrder.BACK);
        }

        /* renamed from: d */
        public final Iterator m40094d(Iterator it) {
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(it);
            return new C8009d(this, arrayDeque2, arrayDeque);
        }

        /* renamed from: e */
        public final Iterator m40093e(Iterator it) {
            return m40092f(it, InsertionOrder.FRONT);
        }

        /* renamed from: f */
        public final Iterator m40092f(Iterator it, InsertionOrder insertionOrder) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(it);
            return new C8008c(this, arrayDeque, insertionOrder);
        }

        /* renamed from: g */
        public abstract Object mo40091g(Deque deque);
    }

    public /* synthetic */ Traverser(SuccessorsFunction successorsFunction, C8000a c8000a) {
        this(successorsFunction);
    }

    public static <N> Traverser<N> forGraph(SuccessorsFunction<N> successorsFunction) {
        return new C8000a(successorsFunction, successorsFunction);
    }

    public static <N> Traverser<N> forTree(SuccessorsFunction<N> successorsFunction) {
        if (successorsFunction instanceof InterfaceC0597Ia) {
            Preconditions.checkArgument(((InterfaceC0597Ia) successorsFunction).isDirected(), "Undirected graphs can never be trees.");
        }
        if (successorsFunction instanceof Network) {
            Preconditions.checkArgument(((Network) successorsFunction).isDirected(), "Undirected networks can never be trees.");
        }
        return new C8001b(successorsFunction, successorsFunction);
    }

    /* renamed from: a */
    public abstract AbstractC8005f mo40098a();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final ImmutableSet m40099b(Iterable iterable) {
        ImmutableSet copyOf = ImmutableSet.copyOf(iterable);
        UnmodifiableIterator it = copyOf.iterator();
        while (it.hasNext()) {
            this.f53800a.successors(it.next());
        }
        return copyOf;
    }

    public final Iterable<N> breadthFirst(N n) {
        return breadthFirst((Iterable) ImmutableSet.m40919of(n));
    }

    public final Iterable<N> depthFirstPostOrder(N n) {
        return depthFirstPostOrder((Iterable) ImmutableSet.m40919of(n));
    }

    public final Iterable<N> depthFirstPreOrder(N n) {
        return depthFirstPreOrder((Iterable) ImmutableSet.m40919of(n));
    }

    public Traverser(SuccessorsFunction successorsFunction) {
        this.f53800a = (SuccessorsFunction) Preconditions.checkNotNull(successorsFunction);
    }

    public final Iterable<N> breadthFirst(Iterable<? extends N> iterable) {
        return new C8002c(this, m40099b(iterable));
    }

    public final Iterable<N> depthFirstPostOrder(Iterable<? extends N> iterable) {
        return new C8004e(this, m40099b(iterable));
    }

    public final Iterable<N> depthFirstPreOrder(Iterable<? extends N> iterable) {
        return new C8003d(this, m40099b(iterable));
    }
}