package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.math.IntMath;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@GwtCompatible
/* loaded from: classes4.dex */
public final class Collections2 {

    /* renamed from: com.google.common.collect.Collections2$a */
    /* loaded from: classes4.dex */
    public static class C7564a extends AbstractCollection {

        /* renamed from: a */
        public final Collection f53062a;

        /* renamed from: b */
        public final Predicate f53063b;

        public C7564a(Collection collection, Predicate predicate) {
            this.f53062a = collection;
            this.f53063b = predicate;
        }

        /* renamed from: a */
        public C7564a m41048a(Predicate predicate) {
            return new C7564a(this.f53062a, Predicates.and(this.f53063b, predicate));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            Preconditions.checkArgument(this.f53063b.apply(obj));
            return this.f53062a.add(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            for (Object obj : collection) {
                Preconditions.checkArgument(this.f53063b.apply(obj));
            }
            return this.f53062a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            Iterables.removeIf(this.f53062a, this.f53063b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (Collections2.m41051f(this.f53062a, obj)) {
                return this.f53063b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            return Collections2.m41055b(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !Iterables.any(this.f53062a, this.f53063b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Iterators.filter(this.f53062a.iterator(), this.f53063b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (contains(obj) && this.f53062a.remove(obj)) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            Iterator it = this.f53062a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f53063b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Iterator it = this.f53062a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f53063b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (Object obj : this.f53062a) {
                if (this.f53063b.apply(obj)) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return Lists.newArrayList(iterator()).toArray(objArr);
        }
    }

    /* renamed from: com.google.common.collect.Collections2$b */
    /* loaded from: classes4.dex */
    public static final class C7565b extends AbstractCollection {

        /* renamed from: a */
        public final ImmutableList f53064a;

        /* renamed from: b */
        public final Comparator f53065b;

        /* renamed from: c */
        public final int f53066c;

        public C7565b(Iterable iterable, Comparator comparator) {
            ImmutableList sortedCopyOf = ImmutableList.sortedCopyOf(comparator, iterable);
            this.f53064a = sortedCopyOf;
            this.f53065b = comparator;
            this.f53066c = m41047a(sortedCopyOf, comparator);
        }

        /* renamed from: a */
        public static int m41047a(List list, Comparator comparator) {
            int i = 1;
            int i2 = 1;
            int i3 = 1;
            while (i < list.size()) {
                if (comparator.compare(list.get(i - 1), list.get(i)) < 0) {
                    i2 = IntMath.saturatedMultiply(i2, IntMath.binomial(i, i3));
                    if (i2 == Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    i3 = 0;
                }
                i++;
                i3++;
            }
            return IntMath.saturatedMultiply(i2, IntMath.binomial(i, i3));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof List) {
                return Collections2.m41053d(this.f53064a, (List) obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C7566c(this.f53064a, this.f53065b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f53066c;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "orderedPermutationCollection(" + this.f53064a + ")";
        }
    }

    /* renamed from: com.google.common.collect.Collections2$c */
    /* loaded from: classes4.dex */
    public static final class C7566c extends AbstractIterator {

        /* renamed from: c */
        public List f53067c;

        /* renamed from: d */
        public final Comparator f53068d;

        public C7566c(List list, Comparator comparator) {
            this.f53067c = Lists.newArrayList(list);
            this.f53068d = comparator;
        }

        /* renamed from: b */
        public void m41046b() {
            int m41044d = m41044d();
            if (m41044d == -1) {
                this.f53067c = null;
                return;
            }
            Objects.requireNonNull(this.f53067c);
            Collections.swap(this.f53067c, m41044d, m41043e(m41044d));
            Collections.reverse(this.f53067c.subList(m41044d + 1, this.f53067c.size()));
        }

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: c */
        public List computeNext() {
            List list = this.f53067c;
            if (list == null) {
                return (List) endOfData();
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
            m41046b();
            return copyOf;
        }

        /* renamed from: d */
        public int m41044d() {
            Objects.requireNonNull(this.f53067c);
            for (int size = this.f53067c.size() - 2; size >= 0; size--) {
                if (this.f53068d.compare(this.f53067c.get(size), this.f53067c.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        /* renamed from: e */
        public int m41043e(int i) {
            Objects.requireNonNull(this.f53067c);
            Object obj = this.f53067c.get(i);
            for (int size = this.f53067c.size() - 1; size > i; size--) {
                if (this.f53068d.compare(obj, this.f53067c.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }
    }

    /* renamed from: com.google.common.collect.Collections2$d */
    /* loaded from: classes4.dex */
    public static final class C7567d extends AbstractCollection {

        /* renamed from: a */
        public final ImmutableList f53069a;

        public C7567d(ImmutableList immutableList) {
            this.f53069a = immutableList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof List) {
                return Collections2.m41053d(this.f53069a, (List) obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C7568e(this.f53069a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return IntMath.factorial(this.f53069a.size());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "permutations(" + this.f53069a + ")";
        }
    }

    /* renamed from: com.google.common.collect.Collections2$e */
    /* loaded from: classes4.dex */
    public static class C7568e extends AbstractIterator {

        /* renamed from: c */
        public final List f53070c;

        /* renamed from: d */
        public final int[] f53071d;

        /* renamed from: e */
        public final int[] f53072e;

        /* renamed from: f */
        public int f53073f;

        public C7568e(List list) {
            this.f53070c = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.f53071d = iArr;
            int[] iArr2 = new int[size];
            this.f53072e = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
            this.f53073f = Integer.MAX_VALUE;
        }

        /* renamed from: b */
        public void m41042b() {
            int size = this.f53070c.size() - 1;
            this.f53073f = size;
            if (size == -1) {
                return;
            }
            int i = 0;
            while (true) {
                int[] iArr = this.f53071d;
                int i2 = this.f53073f;
                int i3 = iArr[i2];
                int i4 = this.f53072e[i2] + i3;
                if (i4 < 0) {
                    m41040d();
                } else if (i4 == i2 + 1) {
                    if (i2 != 0) {
                        i++;
                        m41040d();
                    } else {
                        return;
                    }
                } else {
                    Collections.swap(this.f53070c, (i2 - i3) + i, (i2 - i4) + i);
                    this.f53071d[this.f53073f] = i4;
                    return;
                }
            }
        }

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: c */
        public List computeNext() {
            if (this.f53073f <= 0) {
                return (List) endOfData();
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) this.f53070c);
            m41042b();
            return copyOf;
        }

        /* renamed from: d */
        public void m41040d() {
            int[] iArr = this.f53072e;
            int i = this.f53073f;
            iArr[i] = -iArr[i];
            this.f53073f = i - 1;
        }
    }

    /* renamed from: com.google.common.collect.Collections2$f */
    /* loaded from: classes4.dex */
    public static class C7569f extends AbstractCollection {

        /* renamed from: a */
        public final Collection f53074a;

        /* renamed from: b */
        public final Function f53075b;

        public C7569f(Collection collection, Function function) {
            this.f53074a = (Collection) Preconditions.checkNotNull(collection);
            this.f53075b = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f53074a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f53074a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Iterators.transform(this.f53074a.iterator(), this.f53075b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f53074a.size();
        }
    }

    /* renamed from: b */
    public static boolean m41055b(Collection collection, Collection collection2) {
        for (Object obj : collection2) {
            if (!collection.contains(obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static C7968j m41054c(Collection collection) {
        C7968j c7968j = new C7968j();
        for (Object obj : collection) {
            c7968j.m40229u(obj, c7968j.m40244f(obj) + 1);
        }
        return c7968j;
    }

    /* renamed from: d */
    public static boolean m41053d(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        C7968j m41054c = m41054c(list);
        C7968j m41054c2 = m41054c(list2);
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (m41054c.m40239k(i) != m41054c2.m40244f(m41054c.m40241i(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static StringBuilder m41052e(int i) {
        AbstractC5383bs.m51877b(i, "size");
        return new StringBuilder((int) Math.min(i * 8, 1073741824L));
    }

    /* renamed from: f */
    public static boolean m41051f(Collection collection, Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <E> Collection<E> filter(Collection<E> collection, Predicate<? super E> predicate) {
        if (collection instanceof C7564a) {
            return ((C7564a) collection).m41048a(predicate);
        }
        return new C7564a((Collection) Preconditions.checkNotNull(collection), (Predicate) Preconditions.checkNotNull(predicate));
    }

    /* renamed from: g */
    public static boolean m41050g(Collection collection, Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: h */
    public static String m41049h(Collection collection) {
        StringBuilder m41052e = m41052e(collection.size());
        m41052e.append(AbstractJsonLexerKt.BEGIN_LIST);
        boolean z = true;
        for (Object obj : collection) {
            if (!z) {
                m41052e.append(", ");
            }
            if (obj == collection) {
                m41052e.append("(this Collection)");
            } else {
                m41052e.append(obj);
            }
            z = false;
        }
        m41052e.append(AbstractJsonLexerKt.END_LIST);
        return m41052e.toString();
    }

    public static <E extends Comparable<? super E>> Collection<List<E>> orderedPermutations(Iterable<E> iterable) {
        return orderedPermutations(iterable, Ordering.natural());
    }

    public static <E> Collection<List<E>> permutations(Collection<E> collection) {
        return new C7567d(ImmutableList.copyOf((Collection) collection));
    }

    public static <F, T> Collection<T> transform(Collection<F> collection, Function<? super F, T> function) {
        return new C7569f(collection, function);
    }

    public static <E> Collection<List<E>> orderedPermutations(Iterable<E> iterable, Comparator<? super E> comparator) {
        return new C7565b(iterable, comparator);
    }
}