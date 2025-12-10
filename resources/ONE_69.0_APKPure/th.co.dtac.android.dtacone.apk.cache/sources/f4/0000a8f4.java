package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public abstract class FluentIterable<E> implements Iterable<E> {

    /* renamed from: a */
    public final Optional f53117a;

    /* renamed from: com.google.common.collect.FluentIterable$a */
    /* loaded from: classes4.dex */
    public class C7595a extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Iterable f53118b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7595a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f53118b = iterable2;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f53118b.iterator();
        }
    }

    /* renamed from: com.google.common.collect.FluentIterable$b */
    /* loaded from: classes4.dex */
    public class C7596b extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Iterable f53119b;

        public C7596b(Iterable iterable) {
            this.f53119b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return Iterators.concat(Iterators.transform(this.f53119b.iterator(), new B30()));
        }
    }

    /* renamed from: com.google.common.collect.FluentIterable$c */
    /* loaded from: classes4.dex */
    public class C7597c extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Iterable[] f53120b;

        /* renamed from: com.google.common.collect.FluentIterable$c$a */
        /* loaded from: classes4.dex */
        public class C7598a extends AbstractC1129Q {
            public C7598a(int i) {
                super(i);
            }

            @Override // p000.AbstractC1129Q
            /* renamed from: b */
            public Iterator mo40528a(int i) {
                return C7597c.this.f53120b[i].iterator();
            }
        }

        public C7597c(Iterable[] iterableArr) {
            this.f53120b = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return Iterators.concat(new C7598a(this.f53120b.length));
        }
    }

    public FluentIterable() {
        this.f53117a = Optional.absent();
    }

    /* renamed from: a */
    public static FluentIterable m41017a(Iterable... iterableArr) {
        for (Iterable iterable : iterableArr) {
            Preconditions.checkNotNull(iterable);
        }
        return new C7597c(iterableArr);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return m41017a(iterable, iterable2);
    }

    public static <E> FluentIterable<E> from(Iterable<E> iterable) {
        if (iterable instanceof FluentIterable) {
            return (FluentIterable) iterable;
        }
        return new C7595a(iterable, iterable);
    }

    /* renamed from: of */
    public static <E> FluentIterable<E> m41015of() {
        return from(Collections.emptyList());
    }

    public final boolean allMatch(Predicate<? super E> predicate) {
        return Iterables.all(m41016b(), predicate);
    }

    public final boolean anyMatch(Predicate<? super E> predicate) {
        return Iterables.any(m41016b(), predicate);
    }

    public final FluentIterable<E> append(Iterable<? extends E> iterable) {
        return concat(m41016b(), iterable);
    }

    /* renamed from: b */
    public final Iterable m41016b() {
        return (Iterable) this.f53117a.mo41285or((Optional) this);
    }

    public final boolean contains(@CheckForNull Object obj) {
        return Iterables.contains(m41016b(), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CanIgnoreReturnValue
    public final <C extends Collection<? super E>> C copyInto(C c) {
        Preconditions.checkNotNull(c);
        Iterable<Object> m41016b = m41016b();
        if (m41016b instanceof Collection) {
            c.addAll((Collection) m41016b);
        } else {
            for (Object obj : m41016b) {
                c.add(obj);
            }
        }
        return c;
    }

    public final FluentIterable<E> cycle() {
        return from(Iterables.cycle(m41016b()));
    }

    public final FluentIterable<E> filter(Predicate<? super E> predicate) {
        return from(Iterables.filter(m41016b(), predicate));
    }

    public final Optional<E> first() {
        Iterator it = m41016b().iterator();
        if (it.hasNext()) {
            return Optional.m41300of(it.next());
        }
        return Optional.absent();
    }

    public final Optional<E> firstMatch(Predicate<? super E> predicate) {
        return Iterables.tryFind(m41016b(), predicate);
    }

    public final E get(int i) {
        return (E) Iterables.get(m41016b(), i);
    }

    public final <K> ImmutableListMultimap<K, E> index(Function<? super E, K> function) {
        return Multimaps.index(m41016b(), function);
    }

    public final boolean isEmpty() {
        return !m41016b().iterator().hasNext();
    }

    public final String join(Joiner joiner) {
        return joiner.join(this);
    }

    public final Optional<E> last() {
        Object next;
        Iterable m41016b = m41016b();
        if (m41016b instanceof List) {
            List list = (List) m41016b;
            if (list.isEmpty()) {
                return Optional.absent();
            }
            return Optional.m41300of(list.get(list.size() - 1));
        }
        Iterator it = m41016b.iterator();
        if (!it.hasNext()) {
            return Optional.absent();
        }
        if (m41016b instanceof SortedSet) {
            return Optional.m41300of(((SortedSet) m41016b).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return Optional.m41300of(next);
    }

    public final FluentIterable<E> limit(int i) {
        return from(Iterables.limit(m41016b(), i));
    }

    public final int size() {
        return Iterables.size(m41016b());
    }

    public final FluentIterable<E> skip(int i) {
        return from(Iterables.skip(m41016b(), i));
    }

    @GwtIncompatible
    public final E[] toArray(Class<E> cls) {
        return (E[]) Iterables.toArray(m41016b(), cls);
    }

    public final ImmutableList<E> toList() {
        return ImmutableList.copyOf(m41016b());
    }

    public final <V> ImmutableMap<E, V> toMap(Function<? super E, V> function) {
        return Maps.toMap(m41016b(), function);
    }

    public final ImmutableMultiset<E> toMultiset() {
        return ImmutableMultiset.copyOf(m41016b());
    }

    public final ImmutableSet<E> toSet() {
        return ImmutableSet.copyOf(m41016b());
    }

    public final ImmutableList<E> toSortedList(Comparator<? super E> comparator) {
        return Ordering.from(comparator).immutableSortedCopy(m41016b());
    }

    public final ImmutableSortedSet<E> toSortedSet(Comparator<? super E> comparator) {
        return ImmutableSortedSet.copyOf(comparator, m41016b());
    }

    public String toString() {
        return Iterables.toString(m41016b());
    }

    public final <T> FluentIterable<T> transform(Function<? super E, T> function) {
        return from(Iterables.transform(m41016b(), function));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> FluentIterable<T> transformAndConcat(Function<? super E, ? extends Iterable<? extends T>> function) {
        return concat(transform(function));
    }

    public final <K> ImmutableMap<K, E> uniqueIndex(Function<? super E, K> function) {
        return Maps.uniqueIndex(m41016b(), function);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return m41017a(iterable, iterable2, iterable3);
    }

    /* renamed from: of */
    public static <E> FluentIterable<E> m41014of(E e, E... eArr) {
        return from(Lists.asList(e, eArr));
    }

    public final FluentIterable<E> append(E... eArr) {
        return concat(m41016b(), Arrays.asList(eArr));
    }

    @GwtIncompatible
    public final <T> FluentIterable<T> filter(Class<T> cls) {
        return from(Iterables.filter(m41016b(), cls));
    }

    public FluentIterable(Iterable iterable) {
        this.f53117a = Optional.m41300of(iterable);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return m41017a(iterable, iterable2, iterable3, iterable4);
    }

    @SafeVarargs
    public static <T> FluentIterable<T> concat(Iterable<? extends T>... iterableArr) {
        return m41017a((Iterable[]) Arrays.copyOf(iterableArr, iterableArr.length));
    }

    public static <E> FluentIterable<E> from(E[] eArr) {
        return from(Arrays.asList(eArr));
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends Iterable<? extends T>> iterable) {
        Preconditions.checkNotNull(iterable);
        return new C7596b(iterable);
    }

    @InlineMe(replacement = "checkNotNull(iterable)", staticImports = {"com.google.common.base.Preconditions.checkNotNull"})
    @Deprecated
    public static <E> FluentIterable<E> from(FluentIterable<E> fluentIterable) {
        return (FluentIterable) Preconditions.checkNotNull(fluentIterable);
    }
}