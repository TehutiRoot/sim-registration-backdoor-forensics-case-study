package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Lists {

    /* loaded from: classes4.dex */
    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        @J2ktIncompatible
        private static final long serialVersionUID = 0;
        final E first;
        final E[] rest;

        public OnePlusArrayList(E e, E[] eArr) {
            this.first = e;
            this.rest = (E[]) ((Object[]) Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            Preconditions.checkElementIndex(i, size());
            if (i == 0) {
                return this.first;
            }
            return this.rest[i - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.saturatedAdd(this.rest.length, 1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class StringAsImmutableList extends ImmutableList<Character> {
        private final String string;

        public StringAsImmutableList(String str) {
            this.string = str;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            if (obj instanceof Character) {
                return this.string.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            if (obj instanceof Character) {
                return this.string.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.string.length();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // java.util.List
        public Character get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Character.valueOf(this.string.charAt(i));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<Character> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            return Lists.charactersOf(this.string.substring(i, i2));
        }
    }

    /* loaded from: classes4.dex */
    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        /* renamed from: com.google.common.collect.Lists$TransformingRandomAccessList$a */
        /* loaded from: classes4.dex */
        public class C7685a extends ZU1 {
            public C7685a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // p000.YU1
            /* renamed from: a */
            public Object mo40369a(Object obj) {
                return TransformingRandomAccessList.this.function.apply(obj);
            }
        }

        public TransformingRandomAccessList(List<F> list, Function<? super F, ? extends T> function) {
            this.fromList = (List) Preconditions.checkNotNull(list);
            this.function = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.function.apply((F) this.fromList.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new C7685a(this.fromList.listIterator(i));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.function.apply((F) this.fromList.remove(i));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i, int i2) {
            this.fromList.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    /* loaded from: classes4.dex */
    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        /* renamed from: com.google.common.collect.Lists$TransformingSequentialList$a */
        /* loaded from: classes4.dex */
        public class C7686a extends ZU1 {
            public C7686a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // p000.YU1
            /* renamed from: a */
            public Object mo40369a(Object obj) {
                return TransformingSequentialList.this.function.apply(obj);
            }
        }

        public TransformingSequentialList(List<F> list, Function<? super F, ? extends T> function) {
            this.fromList = (List) Preconditions.checkNotNull(list);
            this.function = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new C7686a(this.fromList.listIterator(i));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i, int i2) {
            this.fromList.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    /* loaded from: classes4.dex */
    public static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        @J2ktIncompatible
        private static final long serialVersionUID = 0;
        final E first;
        final E[] rest;
        final E second;

        public TwoPlusArrayList(E e, E e2, E[] eArr) {
            this.first = e;
            this.second = e2;
            this.rest = (E[]) ((Object[]) Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            if (i != 0) {
                if (i != 1) {
                    Preconditions.checkElementIndex(i, size());
                    return this.rest[i - 2];
                }
                return this.second;
            }
            return this.first;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.saturatedAdd(this.rest.length, 2);
        }
    }

    /* renamed from: com.google.common.collect.Lists$a */
    /* loaded from: classes4.dex */
    public class C7687a extends C7692f {
        public C7687a(List list) {
            super(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i) {
            return this.f53304a.listIterator(i);
        }
    }

    /* renamed from: com.google.common.collect.Lists$b */
    /* loaded from: classes4.dex */
    public class C7688b extends C7689c {
        public C7688b(List list) {
            super(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i) {
            return this.f53304a.listIterator(i);
        }
    }

    /* renamed from: com.google.common.collect.Lists$c */
    /* loaded from: classes4.dex */
    public static class C7689c extends AbstractList {

        /* renamed from: a */
        public final List f53304a;

        public C7689c(List list) {
            this.f53304a = (List) Preconditions.checkNotNull(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, Object obj) {
            this.f53304a.add(i, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection collection) {
            return this.f53304a.addAll(i, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f53304a.contains(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            return this.f53304a.get(i);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i) {
            return this.f53304a.remove(i);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i, Object obj) {
            return this.f53304a.set(i, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f53304a.size();
        }
    }

    /* renamed from: com.google.common.collect.Lists$d */
    /* loaded from: classes4.dex */
    public static final class C7690d extends AbstractList {

        /* renamed from: a */
        public final CharSequence f53305a;

        public C7690d(CharSequence charSequence) {
            this.f53305a = charSequence;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public Character get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Character.valueOf(this.f53305a.charAt(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f53305a.length();
        }
    }

    /* renamed from: com.google.common.collect.Lists$e */
    /* loaded from: classes4.dex */
    public static class C7691e extends AbstractList {

        /* renamed from: a */
        public final List f53306a;

        /* renamed from: b */
        public final int f53307b;

        public C7691e(List list, int i) {
            this.f53306a = list;
            this.f53307b = i;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public List get(int i) {
            Preconditions.checkElementIndex(i, size());
            int i2 = this.f53307b;
            int i3 = i * i2;
            return this.f53306a.subList(i3, Math.min(i2 + i3, this.f53306a.size()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f53306a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.divide(this.f53306a.size(), this.f53307b, RoundingMode.CEILING);
        }
    }

    /* renamed from: com.google.common.collect.Lists$f */
    /* loaded from: classes4.dex */
    public static class C7692f extends C7689c implements RandomAccess {
        public C7692f(List list) {
            super(list);
        }
    }

    /* renamed from: com.google.common.collect.Lists$g */
    /* loaded from: classes4.dex */
    public static class C7693g extends C7691e implements RandomAccess {
        public C7693g(List list, int i) {
            super(list, i);
        }
    }

    /* renamed from: com.google.common.collect.Lists$h */
    /* loaded from: classes4.dex */
    public static class C7694h extends C7695i implements RandomAccess {
        public C7694h(List list) {
            super(list);
        }
    }

    /* renamed from: com.google.common.collect.Lists$i */
    /* loaded from: classes4.dex */
    public static class C7695i extends AbstractList {

        /* renamed from: a */
        public final List f53308a;

        /* renamed from: com.google.common.collect.Lists$i$a */
        /* loaded from: classes4.dex */
        public class C7696a implements ListIterator {

            /* renamed from: a */
            public boolean f53309a;

            /* renamed from: b */
            public final /* synthetic */ ListIterator f53310b;

            /* renamed from: c */
            public final /* synthetic */ C7695i f53311c;

            public C7696a(C7695i c7695i, ListIterator listIterator) {
                this.f53310b = listIterator;
                this.f53311c = c7695i;
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                this.f53310b.add(obj);
                this.f53310b.previous();
                this.f53309a = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f53310b.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f53310b.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                if (hasNext()) {
                    this.f53309a = true;
                    return this.f53310b.previous();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f53311c.m40798d(this.f53310b.nextIndex());
            }

            @Override // java.util.ListIterator
            public Object previous() {
                if (hasPrevious()) {
                    this.f53309a = true;
                    return this.f53310b.next();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                AbstractC5406bs.m51811e(this.f53309a);
                this.f53310b.remove();
                this.f53309a = false;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                Preconditions.checkState(this.f53309a);
                this.f53310b.set(obj);
            }
        }

        public C7695i(List list) {
            this.f53308a = (List) Preconditions.checkNotNull(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, Object obj) {
            this.f53308a.add(m40798d(i), obj);
        }

        /* renamed from: b */
        public List m40800b() {
            return this.f53308a;
        }

        /* renamed from: c */
        public final int m40799c(int i) {
            int size = size();
            Preconditions.checkElementIndex(i, size);
            return (size - 1) - i;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f53308a.clear();
        }

        /* renamed from: d */
        public final int m40798d(int i) {
            int size = size();
            Preconditions.checkPositionIndex(i, size);
            return size - i;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            return this.f53308a.get(m40799c(i));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i) {
            return new C7696a(this, this.f53308a.listIterator(m40798d(i)));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i) {
            return this.f53308a.remove(m40799c(i));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i, Object obj) {
            return this.f53308a.set(m40799c(i), obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f53308a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            return Lists.reverse(this.f53308a.subList(m40798d(i2), m40798d(i)));
        }
    }

    /* renamed from: a */
    public static boolean m40814a(List list, int i, Iterable iterable) {
        ListIterator listIterator = list.listIterator(i);
        boolean z = false;
        for (Object obj : iterable) {
            listIterator.add(obj);
            z = true;
        }
        return z;
    }

    public static <E> List<E> asList(E e, E[] eArr) {
        return new OnePlusArrayList(e, eArr);
    }

    /* renamed from: b */
    public static List m40813b(Iterable iterable) {
        return (List) iterable;
    }

    /* renamed from: c */
    public static int m40812c(int i) {
        AbstractC5406bs.m51814b(i, "arraySize");
        return Ints.saturatedCast(i + 5 + (i / 10));
    }

    public static <B> List<List<B>> cartesianProduct(List<? extends List<? extends B>> list) {
        return CartesianList.m41070c(list);
    }

    public static ImmutableList<Character> charactersOf(String str) {
        return new StringAsImmutableList((String) Preconditions.checkNotNull(str));
    }

    /* renamed from: d */
    public static boolean m40811d(List list, Object obj) {
        if (obj == Preconditions.checkNotNull(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i = 0; i < size; i++) {
                if (!Objects.equal(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return Iterators.elementsEqual(list.iterator(), list2.iterator());
    }

    /* renamed from: e */
    public static int m40810e(List list) {
        int hashCode;
        int i = 1;
        for (Object obj : list) {
            int i2 = i * 31;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i = ~(~(i2 + hashCode));
        }
        return i;
    }

    /* renamed from: f */
    public static int m40809f(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return m40808g(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Objects.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static int m40808g(List list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: h */
    public static int m40807h(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return m40806i(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Objects.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: i */
    public static int m40806i(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public static ListIterator m40805j(List list, int i) {
        return new C7689c(list).listIterator(i);
    }

    /* renamed from: k */
    public static List m40804k(List list, int i, int i2) {
        List c7688b;
        if (list instanceof RandomAccess) {
            c7688b = new C7687a(list);
        } else {
            c7688b = new C7688b(list);
        }
        return c7688b.subList(i, i2);
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithCapacity(int i) {
        AbstractC5406bs.m51814b(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithExpectedSize(int i) {
        return new ArrayList<>(m40812c(i));
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new CopyOnWriteArrayList<>();
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    public static <T> List<List<T>> partition(List<T> list, int i) {
        boolean z;
        Preconditions.checkNotNull(list);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (list instanceof RandomAccess) {
            return new C7693g(list, i);
        }
        return new C7691e(list, i);
    }

    public static <T> List<T> reverse(List<T> list) {
        if (list instanceof ImmutableList) {
            return ((ImmutableList) list).reverse();
        }
        if (list instanceof C7695i) {
            return ((C7695i) list).m40800b();
        }
        if (list instanceof RandomAccess) {
            return new C7694h(list);
        }
        return new C7695i(list);
    }

    public static <F, T> List<T> transform(List<F> list, Function<? super F, ? extends T> function) {
        if (list instanceof RandomAccess) {
            return new TransformingRandomAccessList(list, function);
        }
        return new TransformingSequentialList(list, function);
    }

    public static <E> List<E> asList(E e, E e2, E[] eArr) {
        return new TwoPlusArrayList(e, e2, eArr);
    }

    @SafeVarargs
    public static <B> List<List<B>> cartesianProduct(List<? extends B>... listArr) {
        return cartesianProduct(Arrays.asList(listArr));
    }

    public static List<Character> charactersOf(CharSequence charSequence) {
        return new C7690d((CharSequence) Preconditions.checkNotNull(charSequence));
    }

    @SafeVarargs
    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(E... eArr) {
        Preconditions.checkNotNull(eArr);
        ArrayList<E> arrayList = new ArrayList<>(m40812c(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Iterable<? extends E> iterable) {
        Collection newArrayList;
        if (iterable instanceof Collection) {
            newArrayList = (Collection) iterable;
        } else {
            newArrayList = newArrayList(iterable);
        }
        return new CopyOnWriteArrayList<>(newArrayList);
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList(Iterable<? extends E> iterable) {
        LinkedList<E> newLinkedList = newLinkedList();
        Iterables.addAll(newLinkedList, iterable);
        return newLinkedList;
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return newArrayList(iterable.iterator());
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
        ArrayList<E> newArrayList = newArrayList();
        Iterators.addAll(newArrayList, it);
        return newArrayList;
    }
}
