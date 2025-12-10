package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

@GwtCompatible
/* loaded from: classes4.dex */
public final class Multisets {

    /* loaded from: classes4.dex */
    public static class ImmutableEntry<E> extends AbstractC7820f implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        private final E element;

        public ImmutableEntry(E e, int i) {
            this.element = e;
            this.count = i;
            AbstractC5406bs.m51814b(i, "count");
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            return this.count;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final E getElement() {
            return this.element;
        }

        @CheckForNull
        public ImmutableEntry<E> nextInBucket() {
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static class UnmodifiableMultiset<E> extends ForwardingMultiset<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Multiset<? extends E> delegate;
        @CheckForNull
        @LazyInit
        transient Set<E> elementSet;
        @CheckForNull
        @LazyInit
        transient Set<Multiset.Entry<E>> entrySet;

        public UnmodifiableMultiset(Multiset<? extends E> multiset) {
            this.delegate = multiset;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.List
        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        public Set<E> createElementSet() {
            return Collections.unmodifiableSet(this.delegate.elementSet());
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<E> elementSet() {
            Set<E> set = this.elementSet;
            if (set == null) {
                Set<E> createElementSet = createElementSet();
                this.elementSet = createElementSet;
                return createElementSet;
            }
            return set;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<Multiset.Entry<E>> entrySet() {
            Set<Multiset.Entry<E>> set = this.entrySet;
            if (set == null) {
                Set<Multiset.Entry<E>> unmodifiableSet = Collections.unmodifiableSet(this.delegate.entrySet());
                this.entrySet = unmodifiableSet;
                return unmodifiableSet;
            }
            return set;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Iterators.unmodifiableIterator(this.delegate.iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int setCount(E e, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int add(E e, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int remove(@CheckForNull Object obj, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public boolean setCount(E e, int i, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Multiset<E> delegate() {
            return (Multiset<? extends E>) this.delegate;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$a */
    /* loaded from: classes4.dex */
    public class C7810a extends AbstractC7827l {

        /* renamed from: a */
        public final /* synthetic */ Multiset f53464a;

        /* renamed from: b */
        public final /* synthetic */ Multiset f53465b;

        /* renamed from: com.google.common.collect.Multisets$a$a */
        /* loaded from: classes4.dex */
        public class C7811a extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Iterator f53466c;

            /* renamed from: d */
            public final /* synthetic */ Iterator f53467d;

            /* renamed from: e */
            public final /* synthetic */ C7810a f53468e;

            public C7811a(C7810a c7810a, Iterator it, Iterator it2) {
                this.f53466c = it;
                this.f53467d = it2;
                this.f53468e = c7810a;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: b */
            public Multiset.Entry computeNext() {
                if (this.f53466c.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) this.f53466c.next();
                    Object element = entry.getElement();
                    return Multisets.immutableEntry(element, Math.max(entry.getCount(), this.f53468e.f53465b.count(element)));
                }
                while (this.f53467d.hasNext()) {
                    Multiset.Entry entry2 = (Multiset.Entry) this.f53467d.next();
                    Object element2 = entry2.getElement();
                    if (!this.f53468e.f53464a.contains(element2)) {
                        return Multisets.immutableEntry(element2, entry2.getCount());
                    }
                }
                return (Multiset.Entry) endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7810a(Multiset multiset, Multiset multiset2) {
            super(null);
            this.f53464a = multiset;
            this.f53465b = multiset2;
        }

        @Override // com.google.common.collect.AbstractC7951b, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(Object obj) {
            if (!this.f53464a.contains(obj) && !this.f53465b.contains(obj)) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            return Math.max(this.f53464a.count(obj), this.f53465b.count(obj));
        }

        @Override // com.google.common.collect.AbstractC7951b
        public Set createElementSet() {
            return Sets.union(this.f53464a.elementSet(), this.f53465b.elementSet());
        }

        @Override // com.google.common.collect.AbstractC7951b
        public Iterator elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractC7951b
        public Iterator entryIterator() {
            return new C7811a(this, this.f53464a.entrySet().iterator(), this.f53465b.entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractC7951b, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            if (this.f53464a.isEmpty() && this.f53465b.isEmpty()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$b */
    /* loaded from: classes4.dex */
    public class C7812b extends AbstractC7827l {

        /* renamed from: a */
        public final /* synthetic */ Multiset f53469a;

        /* renamed from: b */
        public final /* synthetic */ Multiset f53470b;

        /* renamed from: com.google.common.collect.Multisets$b$a */
        /* loaded from: classes4.dex */
        public class C7813a extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Iterator f53471c;

            /* renamed from: d */
            public final /* synthetic */ C7812b f53472d;

            public C7813a(C7812b c7812b, Iterator it) {
                this.f53471c = it;
                this.f53472d = c7812b;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: b */
            public Multiset.Entry computeNext() {
                while (this.f53471c.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) this.f53471c.next();
                    Object element = entry.getElement();
                    int min = Math.min(entry.getCount(), this.f53472d.f53470b.count(element));
                    if (min > 0) {
                        return Multisets.immutableEntry(element, min);
                    }
                }
                return (Multiset.Entry) endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7812b(Multiset multiset, Multiset multiset2) {
            super(null);
            this.f53469a = multiset;
            this.f53470b = multiset2;
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            int count = this.f53469a.count(obj);
            if (count == 0) {
                return 0;
            }
            return Math.min(count, this.f53470b.count(obj));
        }

        @Override // com.google.common.collect.AbstractC7951b
        public Set createElementSet() {
            return Sets.intersection(this.f53469a.elementSet(), this.f53470b.elementSet());
        }

        @Override // com.google.common.collect.AbstractC7951b
        public Iterator elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractC7951b
        public Iterator entryIterator() {
            return new C7813a(this, this.f53469a.entrySet().iterator());
        }
    }

    /* renamed from: com.google.common.collect.Multisets$c */
    /* loaded from: classes4.dex */
    public class C7814c extends AbstractC7827l {

        /* renamed from: a */
        public final /* synthetic */ Multiset f53473a;

        /* renamed from: b */
        public final /* synthetic */ Multiset f53474b;

        /* renamed from: com.google.common.collect.Multisets$c$a */
        /* loaded from: classes4.dex */
        public class C7815a extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Iterator f53475c;

            /* renamed from: d */
            public final /* synthetic */ Iterator f53476d;

            /* renamed from: e */
            public final /* synthetic */ C7814c f53477e;

            public C7815a(C7814c c7814c, Iterator it, Iterator it2) {
                this.f53475c = it;
                this.f53476d = it2;
                this.f53477e = c7814c;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: b */
            public Multiset.Entry computeNext() {
                if (this.f53475c.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) this.f53475c.next();
                    Object element = entry.getElement();
                    return Multisets.immutableEntry(element, entry.getCount() + this.f53477e.f53474b.count(element));
                }
                while (this.f53476d.hasNext()) {
                    Multiset.Entry entry2 = (Multiset.Entry) this.f53476d.next();
                    Object element2 = entry2.getElement();
                    if (!this.f53477e.f53473a.contains(element2)) {
                        return Multisets.immutableEntry(element2, entry2.getCount());
                    }
                }
                return (Multiset.Entry) endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7814c(Multiset multiset, Multiset multiset2) {
            super(null);
            this.f53473a = multiset;
            this.f53474b = multiset2;
        }

        @Override // com.google.common.collect.AbstractC7951b, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(Object obj) {
            if (!this.f53473a.contains(obj) && !this.f53474b.contains(obj)) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            return this.f53473a.count(obj) + this.f53474b.count(obj);
        }

        @Override // com.google.common.collect.AbstractC7951b
        public Set createElementSet() {
            return Sets.union(this.f53473a.elementSet(), this.f53474b.elementSet());
        }

        @Override // com.google.common.collect.AbstractC7951b
        public Iterator elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractC7951b
        public Iterator entryIterator() {
            return new C7815a(this, this.f53473a.entrySet().iterator(), this.f53474b.entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractC7951b, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            if (this.f53473a.isEmpty() && this.f53474b.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.Multisets.AbstractC7827l, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return IntMath.saturatedAdd(this.f53473a.size(), this.f53474b.size());
        }
    }

    /* renamed from: com.google.common.collect.Multisets$d */
    /* loaded from: classes4.dex */
    public class C7816d extends AbstractC7827l {

        /* renamed from: a */
        public final /* synthetic */ Multiset f53478a;

        /* renamed from: b */
        public final /* synthetic */ Multiset f53479b;

        /* renamed from: com.google.common.collect.Multisets$d$a */
        /* loaded from: classes4.dex */
        public class C7817a extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Iterator f53480c;

            /* renamed from: d */
            public final /* synthetic */ C7816d f53481d;

            public C7817a(C7816d c7816d, Iterator it) {
                this.f53480c = it;
                this.f53481d = c7816d;
            }

            @Override // com.google.common.collect.AbstractIterator
            public Object computeNext() {
                while (this.f53480c.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) this.f53480c.next();
                    Object element = entry.getElement();
                    if (entry.getCount() > this.f53481d.f53479b.count(element)) {
                        return element;
                    }
                }
                return endOfData();
            }
        }

        /* renamed from: com.google.common.collect.Multisets$d$b */
        /* loaded from: classes4.dex */
        public class C7818b extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Iterator f53482c;

            /* renamed from: d */
            public final /* synthetic */ C7816d f53483d;

            public C7818b(C7816d c7816d, Iterator it) {
                this.f53482c = it;
                this.f53483d = c7816d;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: b */
            public Multiset.Entry computeNext() {
                while (this.f53482c.hasNext()) {
                    Multiset.Entry entry = (Multiset.Entry) this.f53482c.next();
                    Object element = entry.getElement();
                    int count = entry.getCount() - this.f53483d.f53479b.count(element);
                    if (count > 0) {
                        return Multisets.immutableEntry(element, count);
                    }
                }
                return (Multiset.Entry) endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7816d(Multiset multiset, Multiset multiset2) {
            super(null);
            this.f53478a = multiset;
            this.f53479b = multiset2;
        }

        @Override // com.google.common.collect.Multisets.AbstractC7827l, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            int count = this.f53478a.count(obj);
            if (count == 0) {
                return 0;
            }
            return Math.max(0, count - this.f53479b.count(obj));
        }

        @Override // com.google.common.collect.Multisets.AbstractC7827l, com.google.common.collect.AbstractC7951b
        public int distinctElements() {
            return Iterators.size(entryIterator());
        }

        @Override // com.google.common.collect.AbstractC7951b
        public Iterator elementIterator() {
            return new C7817a(this, this.f53478a.entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractC7951b
        public Iterator entryIterator() {
            return new C7818b(this, this.f53478a.entrySet().iterator());
        }
    }

    /* renamed from: com.google.common.collect.Multisets$e */
    /* loaded from: classes4.dex */
    public class C7819e extends YU1 {
        public C7819e(Iterator it) {
            super(it);
        }

        @Override // p000.YU1
        /* renamed from: b */
        public Object mo40369a(Multiset.Entry entry) {
            return entry.getElement();
        }
    }

    /* renamed from: com.google.common.collect.Multisets$f */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7820f implements Multiset.Entry {
        @Override // com.google.common.collect.Multiset.Entry
        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            if (getCount() != entry.getCount() || !Objects.equal(getElement(), entry.getElement())) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int hashCode() {
            int hashCode;
            Object element = getElement();
            if (element == null) {
                hashCode = 0;
            } else {
                hashCode = element.hashCode();
            }
            return hashCode ^ getCount();
        }

        @Override // com.google.common.collect.Multiset.Entry
        public String toString() {
            String valueOf = String.valueOf(getElement());
            int count = getCount();
            if (count != 1) {
                return valueOf + " x " + count;
            }
            return valueOf;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$g */
    /* loaded from: classes4.dex */
    public static final class C7821g implements Comparator {

        /* renamed from: a */
        public static final Comparator f53484a = new C7821g();

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Multiset.Entry entry, Multiset.Entry entry2) {
            return entry2.getCount() - entry.getCount();
        }
    }

    /* renamed from: com.google.common.collect.Multisets$h */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7822h extends Sets.AbstractC7857j {
        /* renamed from: a */
        public abstract Multiset mo40204a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo40204a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return mo40204a().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return mo40204a().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo40204a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (mo40204a().remove(obj, Integer.MAX_VALUE) > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo40204a().entrySet().size();
        }
    }

    /* renamed from: com.google.common.collect.Multisets$i */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7823i extends Sets.AbstractC7857j {
        /* renamed from: a */
        public abstract Multiset mo40266a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo40266a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            if (entry.getCount() <= 0 || mo40266a().count(entry.getElement()) != entry.getCount()) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                Object element = entry.getElement();
                int count = entry.getCount();
                if (count != 0) {
                    return mo40266a().setCount(element, count, 0);
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$j */
    /* loaded from: classes4.dex */
    public static final class C7824j extends AbstractC7827l {

        /* renamed from: a */
        public final Multiset f53485a;

        /* renamed from: b */
        public final Predicate f53486b;

        /* renamed from: com.google.common.collect.Multisets$j$a */
        /* loaded from: classes4.dex */
        public class C7825a implements Predicate {
            public C7825a() {
            }

            @Override // com.google.common.base.Predicate
            /* renamed from: a */
            public boolean apply(Multiset.Entry entry) {
                return C7824j.this.f53486b.apply(entry.getElement());
            }
        }

        public C7824j(Multiset multiset, Predicate predicate) {
            super(null);
            this.f53485a = (Multiset) Preconditions.checkNotNull(multiset);
            this.f53486b = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.collect.Multisets.AbstractC7827l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        /* renamed from: a */
        public UnmodifiableIterator iterator() {
            return Iterators.filter(this.f53485a.iterator(), this.f53486b);
        }

        @Override // com.google.common.collect.AbstractC7951b, com.google.common.collect.Multiset
        public int add(Object obj, int i) {
            Preconditions.checkArgument(this.f53486b.apply(obj), "Element %s does not match predicate %s", obj, this.f53486b);
            return this.f53485a.add(obj, i);
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            int count = this.f53485a.count(obj);
            if (count <= 0 || !this.f53486b.apply(obj)) {
                return 0;
            }
            return count;
        }

        @Override // com.google.common.collect.AbstractC7951b
        public Set createElementSet() {
            return Sets.filter(this.f53485a.elementSet(), this.f53486b);
        }

        @Override // com.google.common.collect.AbstractC7951b
        public Set createEntrySet() {
            return Sets.filter(this.f53485a.entrySet(), new C7825a());
        }

        @Override // com.google.common.collect.AbstractC7951b
        public Iterator elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractC7951b
        public Iterator entryIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractC7951b, com.google.common.collect.Multiset
        public int remove(Object obj, int i) {
            AbstractC5406bs.m51814b(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            if (contains(obj)) {
                return this.f53485a.remove(obj, i);
            }
            return 0;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$k */
    /* loaded from: classes4.dex */
    public static final class C7826k implements Iterator {

        /* renamed from: a */
        public final Multiset f53488a;

        /* renamed from: b */
        public final Iterator f53489b;

        /* renamed from: c */
        public Multiset.Entry f53490c;

        /* renamed from: d */
        public int f53491d;

        /* renamed from: e */
        public int f53492e;

        /* renamed from: f */
        public boolean f53493f;

        public C7826k(Multiset multiset, Iterator it) {
            this.f53488a = multiset;
            this.f53489b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53491d <= 0 && !this.f53489b.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                if (this.f53491d == 0) {
                    Multiset.Entry entry = (Multiset.Entry) this.f53489b.next();
                    this.f53490c = entry;
                    int count = entry.getCount();
                    this.f53491d = count;
                    this.f53492e = count;
                }
                this.f53491d--;
                this.f53493f = true;
                Multiset.Entry entry2 = this.f53490c;
                java.util.Objects.requireNonNull(entry2);
                return entry2.getElement();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            AbstractC5406bs.m51811e(this.f53493f);
            if (this.f53492e == 1) {
                this.f53489b.remove();
            } else {
                Multiset multiset = this.f53488a;
                Multiset.Entry entry = this.f53490c;
                java.util.Objects.requireNonNull(entry);
                multiset.remove(entry.getElement());
            }
            this.f53492e--;
            this.f53493f = false;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$l */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7827l extends AbstractC7951b {
        public AbstractC7827l() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            elementSet().clear();
        }

        @Override // com.google.common.collect.AbstractC7951b
        public int distinctElements() {
            return elementSet().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator iterator() {
            return Multisets.m40576h(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return Multisets.m40575i(this);
        }

        public /* synthetic */ AbstractC7827l(C7810a c7810a) {
            this();
        }
    }

    /* renamed from: a */
    public static boolean m40583a(Multiset multiset, AbstractMapBasedMultiset abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.addTo(multiset);
        return true;
    }

    /* renamed from: b */
    public static boolean m40582b(Multiset multiset, Multiset multiset2) {
        if (multiset2 instanceof AbstractMapBasedMultiset) {
            return m40583a(multiset, (AbstractMapBasedMultiset) multiset2);
        }
        if (multiset2.isEmpty()) {
            return false;
        }
        for (Multiset.Entry entry : multiset2.entrySet()) {
            multiset.add(entry.getElement(), entry.getCount());
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m40581c(Multiset multiset, Collection collection) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            return m40582b(multiset, m40580d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.addAll(multiset, collection.iterator());
    }

    @CanIgnoreReturnValue
    public static boolean containsOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        for (Multiset.Entry<?> entry : multiset2.entrySet()) {
            if (multiset.count(entry.getElement()) < entry.getCount()) {
                return false;
            }
        }
        return true;
    }

    public static <E> ImmutableMultiset<E> copyHighestCountFirst(Multiset<E> multiset) {
        Multiset.Entry[] entryArr = (Multiset.Entry[]) multiset.entrySet().toArray(new Multiset.Entry[0]);
        Arrays.sort(entryArr, C7821g.f53484a);
        return ImmutableMultiset.copyFromEntries(Arrays.asList(entryArr));
    }

    /* renamed from: d */
    public static Multiset m40580d(Iterable iterable) {
        return (Multiset) iterable;
    }

    public static <E> Multiset<E> difference(Multiset<E> multiset, Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new C7816d(multiset, multiset2);
    }

    /* renamed from: e */
    public static Iterator m40579e(Iterator it) {
        return new C7819e(it);
    }

    /* renamed from: f */
    public static boolean m40578f(Multiset multiset, Object obj) {
        if (obj == multiset) {
            return true;
        }
        if (obj instanceof Multiset) {
            Multiset multiset2 = (Multiset) obj;
            if (multiset.size() == multiset2.size() && multiset.entrySet().size() == multiset2.entrySet().size()) {
                for (Multiset.Entry entry : multiset2.entrySet()) {
                    if (multiset.count(entry.getElement()) != entry.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static <E> Multiset<E> filter(Multiset<E> multiset, Predicate<? super E> predicate) {
        if (multiset instanceof C7824j) {
            C7824j c7824j = (C7824j) multiset;
            return new C7824j(c7824j.f53485a, Predicates.and(c7824j.f53486b, predicate));
        }
        return new C7824j(multiset, predicate);
    }

    /* renamed from: g */
    public static int m40577g(Iterable iterable) {
        if (iterable instanceof Multiset) {
            return ((Multiset) iterable).elementSet().size();
        }
        return 11;
    }

    /* renamed from: h */
    public static Iterator m40576h(Multiset multiset) {
        return new C7826k(multiset, multiset.entrySet().iterator());
    }

    /* renamed from: i */
    public static int m40575i(Multiset multiset) {
        long j = 0;
        for (Multiset.Entry entry : multiset.entrySet()) {
            j += entry.getCount();
        }
        return Ints.saturatedCast(j);
    }

    public static <E> Multiset.Entry<E> immutableEntry(E e, int i) {
        return new ImmutableEntry(e, i);
    }

    public static <E> Multiset<E> intersection(Multiset<E> multiset, Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new C7812b(multiset, multiset2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public static boolean m40574j(Multiset multiset, Collection collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public static boolean m40573k(Multiset multiset, Collection collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().retainAll(collection);
    }

    /* renamed from: l */
    public static boolean m40572l(Multiset multiset, Multiset multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        Iterator it = multiset.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Multiset.Entry entry = (Multiset.Entry) it.next();
            int count = multiset2.count(entry.getElement());
            if (count == 0) {
                it.remove();
            } else if (count < entry.getCount()) {
                multiset.setCount(entry.getElement(), count);
            }
            z = true;
        }
        return z;
    }

    /* renamed from: m */
    public static int m40571m(Multiset multiset, Object obj, int i) {
        AbstractC5406bs.m51814b(i, "count");
        int count = multiset.count(obj);
        int i2 = i - count;
        if (i2 > 0) {
            multiset.add(obj, i2);
        } else if (i2 < 0) {
            multiset.remove(obj, -i2);
        }
        return count;
    }

    /* renamed from: n */
    public static boolean m40570n(Multiset multiset, Object obj, int i, int i2) {
        AbstractC5406bs.m51814b(i, "oldCount");
        AbstractC5406bs.m51814b(i2, "newCount");
        if (multiset.count(obj) == i) {
            multiset.setCount(obj, i2);
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    public static boolean removeOccurrences(Multiset<?> multiset, Iterable<?> iterable) {
        if (iterable instanceof Multiset) {
            return removeOccurrences(multiset, (Multiset<?>) iterable);
        }
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(iterable);
        Iterator<?> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= multiset.remove(it.next());
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static boolean retainOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
        return m40572l(multiset, multiset2);
    }

    public static <E> Multiset<E> sum(Multiset<? extends E> multiset, Multiset<? extends E> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new C7814c(multiset, multiset2);
    }

    public static <T, E, M extends Multiset<E>> Collector<T, ?, M> toMultiset(Function<? super T, E> function, ToIntFunction<? super T> toIntFunction, Supplier<M> supplier) {
        return AbstractC7963f.m40366A0(function, toIntFunction, supplier);
    }

    public static <E> Multiset<E> union(Multiset<? extends E> multiset, Multiset<? extends E> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new C7810a(multiset, multiset2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Multiset<E> unmodifiableMultiset(Multiset<? extends E> multiset) {
        return ((multiset instanceof UnmodifiableMultiset) || (multiset instanceof ImmutableMultiset)) ? multiset : new UnmodifiableMultiset((Multiset) Preconditions.checkNotNull(multiset));
    }

    public static <E> SortedMultiset<E> unmodifiableSortedMultiset(SortedMultiset<E> sortedMultiset) {
        return new UnmodifiableSortedMultiset((SortedMultiset) Preconditions.checkNotNull(sortedMultiset));
    }

    @Deprecated
    public static <E> Multiset<E> unmodifiableMultiset(ImmutableMultiset<E> immutableMultiset) {
        return (Multiset) Preconditions.checkNotNull(immutableMultiset);
    }

    @CanIgnoreReturnValue
    public static boolean removeOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        Iterator<Multiset.Entry<?>> it = multiset.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Multiset.Entry<?> next = it.next();
            int count = multiset2.count(next.getElement());
            if (count >= next.getCount()) {
                it.remove();
            } else if (count > 0) {
                multiset.remove(next.getElement(), count);
            }
            z = true;
        }
        return z;
    }
}
