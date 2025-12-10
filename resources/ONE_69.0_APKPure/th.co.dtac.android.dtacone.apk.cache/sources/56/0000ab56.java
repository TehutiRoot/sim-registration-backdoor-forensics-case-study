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
    public class C7928a extends TreeTraverser {

        /* renamed from: a */
        public final /* synthetic */ Function f53672a;

        public C7928a(Function function) {
            this.f53672a = function;
        }

        @Override // com.google.common.collect.TreeTraverser
        public Iterable children(Object obj) {
            return (Iterable) this.f53672a.apply(obj);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$b */
    /* loaded from: classes4.dex */
    public class C7929b extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Object f53673b;

        /* renamed from: c */
        public final /* synthetic */ TreeTraverser f53674c;

        public C7929b(TreeTraverser treeTraverser, Object obj) {
            this.f53673b = obj;
            this.f53674c = treeTraverser;
        }

        @Override // java.lang.Iterable
        /* renamed from: c */
        public UnmodifiableIterator iterator() {
            return this.f53674c.m40366b(this.f53673b);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$c */
    /* loaded from: classes4.dex */
    public class C7930c extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Object f53675b;

        /* renamed from: c */
        public final /* synthetic */ TreeTraverser f53676c;

        public C7930c(TreeTraverser treeTraverser, Object obj) {
            this.f53675b = obj;
            this.f53676c = treeTraverser;
        }

        @Override // java.lang.Iterable
        /* renamed from: c */
        public UnmodifiableIterator iterator() {
            return this.f53676c.m40367a(this.f53675b);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$d */
    /* loaded from: classes4.dex */
    public class C7931d extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Object f53677b;

        /* renamed from: c */
        public final /* synthetic */ TreeTraverser f53678c;

        public C7931d(TreeTraverser treeTraverser, Object obj) {
            this.f53677b = obj;
            this.f53678c = treeTraverser;
        }

        @Override // java.lang.Iterable
        /* renamed from: c */
        public UnmodifiableIterator iterator() {
            return new C7932e(this.f53677b);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$e */
    /* loaded from: classes4.dex */
    public final class C7932e extends UnmodifiableIterator implements PeekingIterator {

        /* renamed from: a */
        public final Queue f53679a;

        public C7932e(Object obj) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f53679a = arrayDeque;
            arrayDeque.add(obj);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f53679a.isEmpty();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator, com.google.common.collect.PeekingIterator
        public Object next() {
            Object remove = this.f53679a.remove();
            Iterables.addAll(this.f53679a, TreeTraverser.this.children(remove));
            return remove;
        }

        @Override // com.google.common.collect.PeekingIterator
        public Object peek() {
            return this.f53679a.element();
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$f */
    /* loaded from: classes4.dex */
    public final class C7933f extends AbstractIterator {

        /* renamed from: c */
        public final ArrayDeque f53681c;

        public C7933f(Object obj) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f53681c = arrayDeque;
            arrayDeque.addLast(m40362b(obj));
        }

        /* renamed from: b */
        public final C7934g m40362b(Object obj) {
            return new C7934g(obj, TreeTraverser.this.children(obj).iterator());
        }

        @Override // com.google.common.collect.AbstractIterator
        public Object computeNext() {
            while (!this.f53681c.isEmpty()) {
                C7934g c7934g = (C7934g) this.f53681c.getLast();
                if (c7934g.f53684b.hasNext()) {
                    this.f53681c.addLast(m40362b(c7934g.f53684b.next()));
                } else {
                    this.f53681c.removeLast();
                    return c7934g.f53683a;
                }
            }
            return endOfData();
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$g */
    /* loaded from: classes4.dex */
    public static final class C7934g {

        /* renamed from: a */
        public final Object f53683a;

        /* renamed from: b */
        public final Iterator f53684b;

        public C7934g(Object obj, Iterator it) {
            this.f53683a = Preconditions.checkNotNull(obj);
            this.f53684b = (Iterator) Preconditions.checkNotNull(it);
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$h */
    /* loaded from: classes4.dex */
    public final class C7935h extends UnmodifiableIterator {

        /* renamed from: a */
        public final Deque f53685a;

        public C7935h(Object obj) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f53685a = arrayDeque;
            arrayDeque.addLast(Iterators.singletonIterator(Preconditions.checkNotNull(obj)));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f53685a.isEmpty();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator
        public Object next() {
            Iterator it = (Iterator) this.f53685a.getLast();
            Object checkNotNull = Preconditions.checkNotNull(it.next());
            if (!it.hasNext()) {
                this.f53685a.removeLast();
            }
            Iterator<T> it2 = TreeTraverser.this.children(checkNotNull).iterator();
            if (it2.hasNext()) {
                this.f53685a.addLast(it2);
            }
            return checkNotNull;
        }
    }

    @Deprecated
    public static <T> TreeTraverser<T> using(Function<T, ? extends Iterable<T>> function) {
        Preconditions.checkNotNull(function);
        return new C7928a(function);
    }

    /* renamed from: a */
    public UnmodifiableIterator m40367a(Object obj) {
        return new C7933f(obj);
    }

    /* renamed from: b */
    public UnmodifiableIterator m40366b(Object obj) {
        return new C7935h(obj);
    }

    @Deprecated
    public final FluentIterable<T> breadthFirstTraversal(T t) {
        Preconditions.checkNotNull(t);
        return new C7931d(this, t);
    }

    public abstract Iterable<T> children(T t);

    @Deprecated
    public final FluentIterable<T> postOrderTraversal(T t) {
        Preconditions.checkNotNull(t);
        return new C7930c(this, t);
    }

    @Deprecated
    public final FluentIterable<T> preOrderTraversal(T t) {
        Preconditions.checkNotNull(t);
        return new C7929b(this, t);
    }
}