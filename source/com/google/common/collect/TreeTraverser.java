package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

@Beta
@GwtCompatible
@Deprecated
/* loaded from: classes4.dex */
public abstract class TreeTraverser<T> {

    /* renamed from: com.google.common.collect.TreeTraverser$a */
    /* loaded from: classes4.dex */
    public class C7939a extends TreeTraverser {

        /* renamed from: a */
        public final /* synthetic */ Function f53660a;

        public C7939a(Function function) {
            this.f53660a = function;
        }

        @Override // com.google.common.collect.TreeTraverser
        public Iterable children(Object obj) {
            return (Iterable) this.f53660a.apply(obj);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$b */
    /* loaded from: classes4.dex */
    public class C7940b extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Object f53661b;

        /* renamed from: c */
        public final /* synthetic */ TreeTraverser f53662c;

        public C7940b(TreeTraverser treeTraverser, Object obj) {
            this.f53661b = obj;
            this.f53662c = treeTraverser;
        }

        @Override // java.lang.Iterable
        /* renamed from: c */
        public UnmodifiableIterator iterator() {
            return this.f53662c.m40377b(this.f53661b);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$c */
    /* loaded from: classes4.dex */
    public class C7941c extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Object f53663b;

        /* renamed from: c */
        public final /* synthetic */ TreeTraverser f53664c;

        public C7941c(TreeTraverser treeTraverser, Object obj) {
            this.f53663b = obj;
            this.f53664c = treeTraverser;
        }

        @Override // java.lang.Iterable
        /* renamed from: c */
        public UnmodifiableIterator iterator() {
            return this.f53664c.m40378a(this.f53663b);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$d */
    /* loaded from: classes4.dex */
    public class C7942d extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Object f53665b;

        /* renamed from: c */
        public final /* synthetic */ TreeTraverser f53666c;

        public C7942d(TreeTraverser treeTraverser, Object obj) {
            this.f53665b = obj;
            this.f53666c = treeTraverser;
        }

        @Override // java.lang.Iterable
        /* renamed from: c */
        public UnmodifiableIterator iterator() {
            return new C7943e(this.f53665b);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$e */
    /* loaded from: classes4.dex */
    public final class C7943e extends UnmodifiableIterator implements PeekingIterator {

        /* renamed from: a */
        public final Queue f53667a;

        public C7943e(Object obj) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f53667a = arrayDeque;
            arrayDeque.add(obj);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f53667a.isEmpty();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator, com.google.common.collect.PeekingIterator
        public Object next() {
            Object remove = this.f53667a.remove();
            Iterables.addAll(this.f53667a, TreeTraverser.this.children(remove));
            return remove;
        }

        @Override // com.google.common.collect.PeekingIterator
        public Object peek() {
            return this.f53667a.element();
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$f */
    /* loaded from: classes4.dex */
    public final class C7944f extends AbstractIterator {

        /* renamed from: c */
        public final ArrayDeque f53669c;

        public C7944f(Object obj) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f53669c = arrayDeque;
            arrayDeque.addLast(m40373b(obj));
        }

        /* renamed from: b */
        public final C7945g m40373b(Object obj) {
            return new C7945g(obj, TreeTraverser.this.children(obj).iterator());
        }

        @Override // com.google.common.collect.AbstractIterator
        public Object computeNext() {
            while (!this.f53669c.isEmpty()) {
                C7945g c7945g = (C7945g) this.f53669c.getLast();
                if (c7945g.f53672b.hasNext()) {
                    this.f53669c.addLast(m40373b(c7945g.f53672b.next()));
                } else {
                    this.f53669c.removeLast();
                    return c7945g.f53671a;
                }
            }
            return endOfData();
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$g */
    /* loaded from: classes4.dex */
    public static final class C7945g {

        /* renamed from: a */
        public final Object f53671a;

        /* renamed from: b */
        public final Iterator f53672b;

        public C7945g(Object obj, Iterator it) {
            this.f53671a = Preconditions.checkNotNull(obj);
            this.f53672b = (Iterator) Preconditions.checkNotNull(it);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$h */
    /* loaded from: classes4.dex */
    public final class C7946h extends UnmodifiableIterator {

        /* renamed from: a */
        public final Deque f53673a;

        public C7946h(Object obj) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f53673a = arrayDeque;
            arrayDeque.addLast(Iterators.singletonIterator(Preconditions.checkNotNull(obj)));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f53673a.isEmpty();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator
        public Object next() {
            Iterator it = (Iterator) this.f53673a.getLast();
            Object checkNotNull = Preconditions.checkNotNull(it.next());
            if (!it.hasNext()) {
                this.f53673a.removeLast();
            }
            Iterator<T> it2 = TreeTraverser.this.children(checkNotNull).iterator();
            if (it2.hasNext()) {
                this.f53673a.addLast(it2);
            }
            return checkNotNull;
        }
    }

    @Deprecated
    public static <T> TreeTraverser<T> using(Function<T, ? extends Iterable<T>> function) {
        Preconditions.checkNotNull(function);
        return new C7939a(function);
    }

    /* renamed from: a */
    public UnmodifiableIterator m40378a(Object obj) {
        return new C7944f(obj);
    }

    /* renamed from: b */
    public UnmodifiableIterator m40377b(Object obj) {
        return new C7946h(obj);
    }

    @Deprecated
    public final FluentIterable<T> breadthFirstTraversal(T t) {
        Preconditions.checkNotNull(t);
        return new C7942d(this, t);
    }

    public abstract Iterable<T> children(T t);

    @Deprecated
    public final FluentIterable<T> postOrderTraversal(T t) {
        Preconditions.checkNotNull(t);
        return new C7941c(this, t);
    }

    @Deprecated
    public final FluentIterable<T> preOrderTraversal(T t) {
        Preconditions.checkNotNull(t);
        return new C7940b(this, t);
    }
}
