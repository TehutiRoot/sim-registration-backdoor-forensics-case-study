package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Iterables {

    /* renamed from: com.google.common.collect.Iterables$a */
    /* loaded from: classes4.dex */
    public class C7645a extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Iterable f53206b;

        public C7645a(Iterable iterable) {
            this.f53206b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return Iterators.cycle(this.f53206b);
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
            return this.f53206b.toString() + " (cycled)";
        }
    }

    /* renamed from: com.google.common.collect.Iterables$b */
    /* loaded from: classes4.dex */
    public class C7646b extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Iterable f53207b;

        /* renamed from: c */
        public final /* synthetic */ int f53208c;

        public C7646b(Iterable iterable, int i) {
            this.f53207b = iterable;
            this.f53208c = i;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return Iterators.partition(this.f53207b.iterator(), this.f53208c);
        }
    }

    /* renamed from: com.google.common.collect.Iterables$c */
    /* loaded from: classes4.dex */
    public class C7647c extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Iterable f53209b;

        /* renamed from: c */
        public final /* synthetic */ int f53210c;

        public C7647c(Iterable iterable, int i) {
            this.f53209b = iterable;
            this.f53210c = i;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return Iterators.paddedPartition(this.f53209b.iterator(), this.f53210c);
        }
    }

    /* renamed from: com.google.common.collect.Iterables$d */
    /* loaded from: classes4.dex */
    public class C7648d extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Iterable f53211b;

        /* renamed from: c */
        public final /* synthetic */ Predicate f53212c;

        public C7648d(Iterable iterable, Predicate predicate) {
            this.f53211b = iterable;
            this.f53212c = predicate;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return Iterators.filter(this.f53211b.iterator(), this.f53212c);
        }
    }

    /* renamed from: com.google.common.collect.Iterables$e */
    /* loaded from: classes4.dex */
    public class C7649e extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Iterable f53213b;

        /* renamed from: c */
        public final /* synthetic */ Function f53214c;

        public C7649e(Iterable iterable, Function function) {
            this.f53213b = iterable;
            this.f53214c = function;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return Iterators.transform(this.f53213b.iterator(), this.f53214c);
        }
    }

    /* renamed from: com.google.common.collect.Iterables$f */
    /* loaded from: classes4.dex */
    public class C7650f extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Iterable f53215b;

        /* renamed from: c */
        public final /* synthetic */ int f53216c;

        /* renamed from: com.google.common.collect.Iterables$f$a */
        /* loaded from: classes4.dex */
        public class C7651a implements Iterator {

            /* renamed from: a */
            public boolean f53217a = true;

            /* renamed from: b */
            public final /* synthetic */ Iterator f53218b;

            /* renamed from: c */
            public final /* synthetic */ C7650f f53219c;

            public C7651a(C7650f c7650f, Iterator it) {
                this.f53218b = it;
                this.f53219c = c7650f;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f53218b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Object next = this.f53218b.next();
                this.f53217a = false;
                return next;
            }

            @Override // java.util.Iterator
            public void remove() {
                AbstractC5406bs.m51811e(!this.f53217a);
                this.f53218b.remove();
            }
        }

        public C7650f(Iterable iterable, int i) {
            this.f53215b = iterable;
            this.f53216c = i;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            Iterable iterable = this.f53215b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f53216c), list.size()).iterator();
            }
            Iterator it = iterable.iterator();
            Iterators.advance(it, this.f53216c);
            return new C7651a(this, it);
        }
    }

    /* renamed from: com.google.common.collect.Iterables$g */
    /* loaded from: classes4.dex */
    public class C7652g extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Iterable f53220b;

        /* renamed from: c */
        public final /* synthetic */ int f53221c;

        public C7652g(Iterable iterable, int i) {
            this.f53220b = iterable;
            this.f53221c = i;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return Iterators.limit(this.f53220b.iterator(), this.f53221c);
        }
    }

    /* renamed from: com.google.common.collect.Iterables$h */
    /* loaded from: classes4.dex */
    public class C7653h extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Iterable f53222b;

        public C7653h(Iterable iterable) {
            this.f53222b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            Iterable iterable = this.f53222b;
            if (iterable instanceof Queue) {
                return new C16934vx((Queue) iterable);
            }
            return Iterators.consumingIterator(iterable.iterator());
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* renamed from: com.google.common.collect.Iterables$i */
    /* loaded from: classes4.dex */
    public class C7654i extends FluentIterable {

        /* renamed from: b */
        public final /* synthetic */ Iterable f53223b;

        /* renamed from: c */
        public final /* synthetic */ Comparator f53224c;

        public C7654i(Iterable iterable, Comparator comparator) {
            this.f53223b = iterable;
            this.f53224c = comparator;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return Iterators.mergeSorted(Iterables.transform(this.f53223b, new C22896x30()), this.f53224c);
        }
    }

    /* renamed from: com.google.common.collect.Iterables$j */
    /* loaded from: classes4.dex */
    public static final class C7655j extends FluentIterable {

        /* renamed from: b */
        public final Iterable f53225b;

        public /* synthetic */ C7655j(Iterable iterable, C7645a c7645a) {
            this(iterable);
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return Iterators.unmodifiableIterator(this.f53225b.iterator());
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
            return this.f53225b.toString();
        }

        public C7655j(Iterable iterable) {
            this.f53225b = iterable;
        }
    }

    /* renamed from: a */
    public static Collection m40850a(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return Lists.newArrayList(iterable.iterator());
    }

    @CanIgnoreReturnValue
    public static <T> boolean addAll(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        return Iterators.addAll(collection, ((Iterable) Preconditions.checkNotNull(iterable)).iterator());
    }

    public static <T> boolean all(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.all(iterable.iterator(), predicate);
    }

    public static <T> boolean any(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.any(iterable.iterator(), predicate);
    }

    /* renamed from: b */
    public static Object m40849b(List list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: c */
    public static Object m40848c(Iterable iterable, Predicate predicate) {
        Preconditions.checkNotNull(predicate);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (predicate.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return FluentIterable.concat(iterable, iterable2);
    }

    public static <T> Iterable<T> consumingIterable(Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new C7653h(iterable);
    }

    public static boolean contains(Iterable<? extends Object> iterable, @CheckForNull Object obj) {
        if (iterable instanceof Collection) {
            return Collections2.m41062f((Collection) iterable, obj);
        }
        return Iterators.contains(iterable.iterator(), obj);
    }

    public static <T> Iterable<T> cycle(Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new C7645a(iterable);
    }

    /* renamed from: d */
    public static boolean m40847d(List list, Predicate predicate) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!predicate.apply(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        m40846e(list, predicate, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m40846e(list, predicate, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i == i2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static void m40846e(List list, Predicate predicate, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static boolean elementsEqual(Iterable<?> iterable, Iterable<?> iterable2) {
        if ((iterable instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return Iterators.elementsEqual(iterable.iterator(), iterable2.iterator());
    }

    /* renamed from: f */
    public static Object[] m40845f(Iterable iterable) {
        return m40850a(iterable).toArray();
    }

    public static <T> Iterable<T> filter(Iterable<T> iterable, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(predicate);
        return new C7648d(iterable, predicate);
    }

    public static <T> T find(Iterable<T> iterable, Predicate<? super T> predicate) {
        return (T) Iterators.find(iterable.iterator(), predicate);
    }

    public static int frequency(Iterable<?> iterable, @CheckForNull Object obj) {
        if (iterable instanceof Multiset) {
            return ((Multiset) iterable).count(obj);
        }
        if (iterable instanceof Set) {
            return ((Set) iterable).contains(obj) ? 1 : 0;
        }
        return Iterators.frequency(iterable.iterator(), obj);
    }

    /* renamed from: g */
    public static Object[] m40844g(Iterable iterable, Object[] objArr) {
        return m40850a(iterable).toArray(objArr);
    }

    public static <T> T get(Iterable<T> iterable, int i) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i);
        }
        return (T) Iterators.get(iterable.iterator(), i);
    }

    public static <T> T getFirst(Iterable<? extends T> iterable, T t) {
        return (T) Iterators.getNext(iterable.iterator(), t);
    }

    public static <T> T getLast(Iterable<T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return (T) m40849b(list);
            }
            throw new NoSuchElementException();
        }
        return (T) Iterators.getLast(iterable.iterator());
    }

    public static <T> T getOnlyElement(Iterable<T> iterable) {
        return (T) Iterators.getOnlyElement(iterable.iterator());
    }

    public static <T> int indexOf(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.indexOf(iterable.iterator(), predicate);
    }

    public static boolean isEmpty(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> limit(Iterable<T> iterable, int i) {
        boolean z;
        Preconditions.checkNotNull(iterable);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "limit is negative");
        return new C7652g(iterable, i);
    }

    public static <T> Iterable<T> mergeSorted(Iterable<? extends Iterable<? extends T>> iterable, Comparator<? super T> comparator) {
        Preconditions.checkNotNull(iterable, "iterables");
        Preconditions.checkNotNull(comparator, "comparator");
        return new C7655j(new C7654i(iterable, comparator), null);
    }

    public static <T> Iterable<List<T>> paddedPartition(Iterable<T> iterable, int i) {
        boolean z;
        Preconditions.checkNotNull(iterable);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return new C7647c(iterable, i);
    }

    public static <T> Iterable<List<T>> partition(Iterable<T> iterable, int i) {
        boolean z;
        Preconditions.checkNotNull(iterable);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return new C7646b(iterable, i);
    }

    @CanIgnoreReturnValue
    public static boolean removeAll(Iterable<?> iterable, Collection<?> collection) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).removeAll((Collection) Preconditions.checkNotNull(collection));
        }
        return Iterators.removeAll(iterable.iterator(), collection);
    }

    @CanIgnoreReturnValue
    public static <T> boolean removeIf(Iterable<T> iterable, Predicate<? super T> predicate) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            return m40847d((List) iterable, (Predicate) Preconditions.checkNotNull(predicate));
        }
        return Iterators.removeIf(iterable.iterator(), predicate);
    }

    @CanIgnoreReturnValue
    public static boolean retainAll(Iterable<?> iterable, Collection<?> collection) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).retainAll((Collection) Preconditions.checkNotNull(collection));
        }
        return Iterators.retainAll(iterable.iterator(), collection);
    }

    public static int size(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return Iterators.size(iterable.iterator());
    }

    public static <T> Iterable<T> skip(Iterable<T> iterable, int i) {
        boolean z;
        Preconditions.checkNotNull(iterable);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "number to skip cannot be negative");
        return new C7650f(iterable, i);
    }

    @GwtIncompatible
    public static <T> T[] toArray(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) m40844g(iterable, ObjectArrays.newArray(cls, 0));
    }

    public static String toString(Iterable<?> iterable) {
        return Iterators.toString(iterable.iterator());
    }

    public static <F, T> Iterable<T> transform(Iterable<F> iterable, Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(function);
        return new C7649e(iterable, function);
    }

    public static <T> Optional<T> tryFind(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.tryFind(iterable.iterator(), predicate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Iterable<T> unmodifiableIterable(Iterable<? extends T> iterable) {
        Preconditions.checkNotNull(iterable);
        return ((iterable instanceof C7655j) || (iterable instanceof ImmutableCollection)) ? iterable : new C7655j(iterable, null);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return FluentIterable.concat(iterable, iterable2, iterable3);
    }

    @CheckForNull
    public static <T> T find(Iterable<? extends T> iterable, Predicate<? super T> predicate, @CheckForNull T t) {
        return (T) Iterators.find(iterable.iterator(), predicate, t);
    }

    public static <T> T getOnlyElement(Iterable<? extends T> iterable, T t) {
        return (T) Iterators.getOnlyElement(iterable.iterator(), t);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return FluentIterable.concat(iterable, iterable2, iterable3, iterable4);
    }

    @SafeVarargs
    public static <T> Iterable<T> cycle(T... tArr) {
        return cycle(Lists.newArrayList(tArr));
    }

    @SafeVarargs
    public static <T> Iterable<T> concat(Iterable<? extends T>... iterableArr) {
        return FluentIterable.concat(iterableArr);
    }

    @GwtIncompatible
    public static <T> Iterable<T> filter(Iterable<?> iterable, Class<T> cls) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(cls);
        return filter(iterable, Predicates.instanceOf(cls));
    }

    @Deprecated
    public static <E> Iterable<E> unmodifiableIterable(ImmutableCollection<E> immutableCollection) {
        return (Iterable) Preconditions.checkNotNull(immutableCollection);
    }

    public static <T> Iterable<T> concat(Iterable<? extends Iterable<? extends T>> iterable) {
        return FluentIterable.concat(iterable);
    }

    public static <T> T get(Iterable<? extends T> iterable, int i, T t) {
        Preconditions.checkNotNull(iterable);
        Iterators.m40843a(i);
        if (iterable instanceof List) {
            List m40813b = Lists.m40813b(iterable);
            return i < m40813b.size() ? (T) m40813b.get(i) : t;
        }
        Iterator<? extends T> it = iterable.iterator();
        Iterators.advance(it, i);
        return (T) Iterators.getNext(it, t);
    }

    public static <T> T getLast(Iterable<? extends T> iterable, T t) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t;
            }
            if (iterable instanceof List) {
                return (T) m40849b(Lists.m40813b(iterable));
            }
        }
        return (T) Iterators.getLast(iterable.iterator(), t);
    }
}
