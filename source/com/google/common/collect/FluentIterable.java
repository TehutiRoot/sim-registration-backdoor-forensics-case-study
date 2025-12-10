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
    public final Optional f53105a;

    /* renamed from: com.google.common.collect.FluentIterable$a */
    /* loaded from: classes4.dex */
    public class C7606a extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Iterable f53106b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7606a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f53106b = iterable2;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f53106b.iterator();
        }
    }

    /* renamed from: com.google.common.collect.FluentIterable$b */
    /* loaded from: classes4.dex */
    public class C7607b extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Iterable f53107b;

        public C7607b(Iterable iterable) {
            this.f53107b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return Iterators.concat(Iterators.transform(this.f53107b.iterator(), new C22896x30()));
        }
    }

    /* renamed from: com.google.common.collect.FluentIterable$c */
    /* loaded from: classes4.dex */
    public class C7608c extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Iterable[] f53108b;

        /* renamed from: com.google.common.collect.FluentIterable$c$a */
        /* loaded from: classes4.dex */
        public class C7609a extends AbstractC1139Q {
            public C7609a(int i) {
                super(i);
            }

            @Override // p000.AbstractC1139Q
            /* renamed from: b */
            public Iterator mo40539a(int i) {
                return C7608c.this.f53108b[i].iterator();
            }
        }

        public C7608c(Iterable[] iterableArr) {
            this.f53108b = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return Iterators.concat(new C7609a(this.f53108b.length));
        }
    }

    public FluentIterable() {
        this.f53105a = Optional.absent();
    }

    /* renamed from: a */
    public static FluentIterable m41028a(Iterable... iterableArr) {
        for (Iterable iterable : iterableArr) {
            Preconditions.checkNotNull(iterable);
        }
        return new C7608c(iterableArr);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return m41028a(iterable, iterable2);
    }

    public static <E> FluentIterable<E> from(Iterable<E> iterable) {
        if (iterable instanceof FluentIterable) {
            return (FluentIterable) iterable;
        }
        return new C7606a(iterable, iterable);
    }

    /* renamed from: of */
    public static <E> FluentIterable<E> m41026of() {
        return from(Collections.emptyList());
    }

    public final boolean allMatch(Predicate<? super E> predicate) {
        return Iterables.all(m41027b(), predicate);
    }

    public final boolean anyMatch(Predicate<? super E> predicate) {
        return Iterables.any(m41027b(), predicate);
    }

    public final FluentIterable<E> append(Iterable<? extends E> iterable) {
        return concat(m41027b(), iterable);
    }

    /* renamed from: b */
    public final Iterable m41027b() {
        return (Iterable) this.f53105a.mo41298or((Optional) this);
    }

    public final boolean contains(@CheckForNull Object obj) {
        return Iterables.contains(m41027b(), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CanIgnoreReturnValue
    public final <C extends Collection<? super E>> C copyInto(C c) {
        Preconditions.checkNotNull(c);
        Iterable<Object> m41027b = m41027b();
        if (m41027b instanceof Collection) {
            c.addAll((Collection) m41027b);
        } else {
            for (Object obj : m41027b) {
                c.add(obj);
            }
        }
        return c;
    }

    public final FluentIterable<E> cycle() {
        return from(Iterables.cycle(m41027b()));
    }

    public final FluentIterable<E> filter(Predicate<? super E> predicate) {
        return from(Iterables.filter(m41027b(), predicate));
    }

    public final Optional<E> first() {
        Iterator it = m41027b().iterator();
        if (it.hasNext()) {
            return Optional.m41313of(it.next());
        }
        return Optional.absent();
    }

    public final Optional<E> firstMatch(Predicate<? super E> predicate) {
        return Iterables.tryFind(m41027b(), predicate);
    }

    public final E get(int i) {
        return (E) Iterables.get(m41027b(), i);
    }

    public final <K> ImmutableListMultimap<K, E> index(Function<? super E, K> function) {
        return Multimaps.index(m41027b(), function);
    }

    public final boolean isEmpty() {
        return !m41027b().iterator().hasNext();
    }

    public final String join(Joiner joiner) {
        return joiner.join(this);
    }

    public final Optional<E> last() {
        Object next;
        Iterable m41027b = m41027b();
        if (m41027b instanceof List) {
            List list = (List) m41027b;
            if (list.isEmpty()) {
                return Optional.absent();
            }
            return Optional.m41313of(list.get(list.size() - 1));
        }
        Iterator it = m41027b.iterator();
        if (!it.hasNext()) {
            return Optional.absent();
        }
        if (m41027b instanceof SortedSet) {
            return Optional.m41313of(((SortedSet) m41027b).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return Optional.m41313of(next);
    }

    public final FluentIterable<E> limit(int i) {
        return from(Iterables.limit(m41027b(), i));
    }

    public final int size() {
        return Iterables.size(m41027b());
    }

    public final FluentIterable<E> skip(int i) {
        return from(Iterables.skip(m41027b(), i));
    }

    @GwtIncompatible
    public final E[] toArray(Class<E> cls) {
        return (E[]) Iterables.toArray(m41027b(), cls);
    }

    public final ImmutableList<E> toList() {
        return ImmutableList.copyOf(m41027b());
    }

    public final <V> ImmutableMap<E, V> toMap(Function<? super E, V> function) {
        return Maps.toMap(m41027b(), function);
    }

    public final ImmutableMultiset<E> toMultiset() {
        return ImmutableMultiset.copyOf(m41027b());
    }

    public final ImmutableSet<E> toSet() {
        return ImmutableSet.copyOf(m41027b());
    }

    public final ImmutableList<E> toSortedList(Comparator<? super E> comparator) {
        return Ordering.from(comparator).immutableSortedCopy(m41027b());
    }

    public final ImmutableSortedSet<E> toSortedSet(Comparator<? super E> comparator) {
        return ImmutableSortedSet.copyOf(comparator, m41027b());
    }

    public String toString() {
        return Iterables.toString(m41027b());
    }

    public final <T> FluentIterable<T> transform(Function<? super E, T> function) {
        return from(Iterables.transform(m41027b(), function));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> FluentIterable<T> transformAndConcat(Function<? super E, ? extends Iterable<? extends T>> function) {
        return concat(transform(function));
    }

    public final <K> ImmutableMap<K, E> uniqueIndex(Function<? super E, K> function) {
        return Maps.uniqueIndex(m41027b(), function);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return m41028a(iterable, iterable2, iterable3);
    }

    /* renamed from: of */
    public static <E> FluentIterable<E> m41025of(E e, E... eArr) {
        return from(Lists.asList(e, eArr));
    }

    public final FluentIterable<E> append(E... eArr) {
        return concat(m41027b(), Arrays.asList(eArr));
    }

    @GwtIncompatible
    public final <T> FluentIterable<T> filter(Class<T> cls) {
        return from(Iterables.filter(m41027b(), cls));
    }

    public FluentIterable(Iterable iterable) {
        this.f53105a = Optional.m41313of(iterable);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return m41028a(iterable, iterable2, iterable3, iterable4);
    }

    @SafeVarargs
    public static <T> FluentIterable<T> concat(Iterable<? extends T>... iterableArr) {
        return m41028a((Iterable[]) Arrays.copyOf(iterableArr, iterableArr.length));
    }

    public static <E> FluentIterable<E> from(E[] eArr) {
        return from(Arrays.asList(eArr));
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends Iterable<? extends T>> iterable) {
        Preconditions.checkNotNull(iterable);
        return new C7607b(iterable);
    }

    @InlineMe(replacement = "checkNotNull(iterable)", staticImports = {"com.google.common.base.Preconditions.checkNotNull"})
    @Deprecated
    public static <E> FluentIterable<E> from(FluentIterable<E> fluentIterable) {
        return (FluentIterable) Preconditions.checkNotNull(fluentIterable);
    }
}
