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
    public static class C7575a extends AbstractCollection {

        /* renamed from: a */
        public final Collection f53050a;

        /* renamed from: b */
        public final Predicate f53051b;

        public C7575a(Collection collection, Predicate predicate) {
            this.f53050a = collection;
            this.f53051b = predicate;
        }

        /* renamed from: a */
        public C7575a m41059a(Predicate predicate) {
            return new C7575a(this.f53050a, Predicates.and(this.f53051b, predicate));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            Preconditions.checkArgument(this.f53051b.apply(obj));
            return this.f53050a.add(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            for (Object obj : collection) {
                Preconditions.checkArgument(this.f53051b.apply(obj));
            }
            return this.f53050a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            Iterables.removeIf(this.f53050a, this.f53051b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (Collections2.m41062f(this.f53050a, obj)) {
                return this.f53051b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            return Collections2.m41066b(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !Iterables.any(this.f53050a, this.f53051b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Iterators.filter(this.f53050a.iterator(), this.f53051b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (contains(obj) && this.f53050a.remove(obj)) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            Iterator it = this.f53050a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f53051b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Iterator it = this.f53050a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f53051b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (Object obj : this.f53050a) {
                if (this.f53051b.apply(obj)) {
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
    public static final class C7576b extends AbstractCollection {

        /* renamed from: a */
        public final ImmutableList f53052a;

        /* renamed from: b */
        public final Comparator f53053b;

        /* renamed from: c */
        public final int f53054c;

        public C7576b(Iterable iterable, Comparator comparator) {
            ImmutableList sortedCopyOf = ImmutableList.sortedCopyOf(comparator, iterable);
            this.f53052a = sortedCopyOf;
            this.f53053b = comparator;
            this.f53054c = m41058a(sortedCopyOf, comparator);
        }

        /* renamed from: a */
        public static int m41058a(List list, Comparator comparator) {
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
                return Collections2.m41064d(this.f53052a, (List) obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C7577c(this.f53052a, this.f53053b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f53054c;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "orderedPermutationCollection(" + this.f53052a + ")";
        }
    }

    /* renamed from: com.google.common.collect.Collections2$c */
    /* loaded from: classes4.dex */
    public static final class C7577c extends AbstractIterator {

        /* renamed from: c */
        public List f53055c;

        /* renamed from: d */
        public final Comparator f53056d;

        public C7577c(List list, Comparator comparator) {
            this.f53055c = Lists.newArrayList(list);
            this.f53056d = comparator;
        }

        /* renamed from: b */
        public void m41057b() {
            int m41055d = m41055d();
            if (m41055d == -1) {
                this.f53055c = null;
                return;
            }
            Objects.requireNonNull(this.f53055c);
            Collections.swap(this.f53055c, m41055d, m41054e(m41055d));
            Collections.reverse(this.f53055c.subList(m41055d + 1, this.f53055c.size()));
        }

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: c */
        public List computeNext() {
            List list = this.f53055c;
            if (list == null) {
                return (List) endOfData();
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
            m41057b();
            return copyOf;
        }

        /* renamed from: d */
        public int m41055d() {
            Objects.requireNonNull(this.f53055c);
            for (int size = this.f53055c.size() - 2; size >= 0; size--) {
                if (this.f53056d.compare(this.f53055c.get(size), this.f53055c.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        /* renamed from: e */
        public int m41054e(int i) {
            Objects.requireNonNull(this.f53055c);
            Object obj = this.f53055c.get(i);
            for (int size = this.f53055c.size() - 1; size > i; size--) {
                if (this.f53056d.compare(obj, this.f53055c.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }
    }

    /* renamed from: com.google.common.collect.Collections2$d */
    /* loaded from: classes4.dex */
    public static final class C7578d extends AbstractCollection {

        /* renamed from: a */
        public final ImmutableList f53057a;

        public C7578d(ImmutableList immutableList) {
            this.f53057a = immutableList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof List) {
                return Collections2.m41064d(this.f53057a, (List) obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C7579e(this.f53057a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return IntMath.factorial(this.f53057a.size());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "permutations(" + this.f53057a + ")";
        }
    }

    /* renamed from: com.google.common.collect.Collections2$e */
    /* loaded from: classes4.dex */
    public static class C7579e extends AbstractIterator {

        /* renamed from: c */
        public final List f53058c;

        /* renamed from: d */
        public final int[] f53059d;

        /* renamed from: e */
        public final int[] f53060e;

        /* renamed from: f */
        public int f53061f;

        public C7579e(List list) {
            this.f53058c = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.f53059d = iArr;
            int[] iArr2 = new int[size];
            this.f53060e = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
            this.f53061f = Integer.MAX_VALUE;
        }

        /* renamed from: b */
        public void m41053b() {
            int size = this.f53058c.size() - 1;
            this.f53061f = size;
            if (size == -1) {
                return;
            }
            int i = 0;
            while (true) {
                int[] iArr = this.f53059d;
                int i2 = this.f53061f;
                int i3 = iArr[i2];
                int i4 = this.f53060e[i2] + i3;
                if (i4 < 0) {
                    m41051d();
                } else if (i4 == i2 + 1) {
                    if (i2 != 0) {
                        i++;
                        m41051d();
                    } else {
                        return;
                    }
                } else {
                    Collections.swap(this.f53058c, (i2 - i3) + i, (i2 - i4) + i);
                    this.f53059d[this.f53061f] = i4;
                    return;
                }
            }
        }

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: c */
        public List computeNext() {
            if (this.f53061f <= 0) {
                return (List) endOfData();
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) this.f53058c);
            m41053b();
            return copyOf;
        }

        /* renamed from: d */
        public void m41051d() {
            int[] iArr = this.f53060e;
            int i = this.f53061f;
            iArr[i] = -iArr[i];
            this.f53061f = i - 1;
        }
    }

    /* renamed from: com.google.common.collect.Collections2$f */
    /* loaded from: classes4.dex */
    public static class C7580f extends AbstractCollection {

        /* renamed from: a */
        public final Collection f53062a;

        /* renamed from: b */
        public final Function f53063b;

        public C7580f(Collection collection, Function function) {
            this.f53062a = (Collection) Preconditions.checkNotNull(collection);
            this.f53063b = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f53062a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f53062a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Iterators.transform(this.f53062a.iterator(), this.f53063b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f53062a.size();
        }
    }

    /* renamed from: b */
    public static boolean m41066b(Collection collection, Collection collection2) {
        for (Object obj : collection2) {
            if (!collection.contains(obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static C7979j m41065c(Collection collection) {
        C7979j c7979j = new C7979j();
        for (Object obj : collection) {
            c7979j.m40238u(obj, c7979j.m40253f(obj) + 1);
        }
        return c7979j;
    }

    /* renamed from: d */
    public static boolean m41064d(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        C7979j m41065c = m41065c(list);
        C7979j m41065c2 = m41065c(list2);
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (m41065c.m40248k(i) != m41065c2.m40253f(m41065c.m40250i(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static StringBuilder m41063e(int i) {
        AbstractC5406bs.m51814b(i, "size");
        return new StringBuilder((int) Math.min(i * 8, 1073741824L));
    }

    /* renamed from: f */
    public static boolean m41062f(Collection collection, Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <E> Collection<E> filter(Collection<E> collection, Predicate<? super E> predicate) {
        if (collection instanceof C7575a) {
            return ((C7575a) collection).m41059a(predicate);
        }
        return new C7575a((Collection) Preconditions.checkNotNull(collection), (Predicate) Preconditions.checkNotNull(predicate));
    }

    /* renamed from: g */
    public static boolean m41061g(Collection collection, Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: h */
    public static String m41060h(Collection collection) {
        StringBuilder m41063e = m41063e(collection.size());
        m41063e.append(AbstractJsonLexerKt.BEGIN_LIST);
        boolean z = true;
        for (Object obj : collection) {
            if (!z) {
                m41063e.append(", ");
            }
            if (obj == collection) {
                m41063e.append("(this Collection)");
            } else {
                m41063e.append(obj);
            }
            z = false;
        }
        m41063e.append(AbstractJsonLexerKt.END_LIST);
        return m41063e.toString();
    }

    public static <E extends Comparable<? super E>> Collection<List<E>> orderedPermutations(Iterable<E> iterable) {
        return orderedPermutations(iterable, Ordering.natural());
    }

    public static <E> Collection<List<E>> permutations(Collection<E> collection) {
        return new C7578d(ImmutableList.copyOf((Collection) collection));
    }

    public static <F, T> Collection<T> transform(Collection<F> collection, Function<? super F, T> function) {
        return new C7580f(collection, function);
    }

    public static <E> Collection<List<E>> orderedPermutations(Iterable<E> iterable, Comparator<? super E> comparator) {
        return new C7576b(iterable, comparator);
    }
}
