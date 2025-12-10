package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Sets {

    /* loaded from: classes4.dex */
    public static final class CartesianSet extends ForwardingCollection implements Set {

        /* renamed from: a */
        public final transient ImmutableList f53505a;

        /* renamed from: b */
        public final transient CartesianList f53506b;

        public CartesianSet(ImmutableList immutableList, CartesianList cartesianList) {
            this.f53505a = immutableList;
            this.f53506b = cartesianList;
        }

        /* renamed from: e */
        public static Set m40543e(List list) {
            ImmutableList.Builder builder = new ImmutableList.Builder(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ImmutableSet copyOf = ImmutableSet.copyOf((Collection) ((Set) it.next()));
                if (copyOf.isEmpty()) {
                    return ImmutableSet.m40931of();
                }
                builder.add((ImmutableList.Builder) copyOf);
            }
            final ImmutableList build = builder.build();
            return new CartesianSet(build, new CartesianList(new ImmutableList<List<Object>>() { // from class: com.google.common.collect.Sets.CartesianSet.1
                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return build.size();
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                @J2ktIncompatible
                @GwtIncompatible
                public Object writeReplace() {
                    return super.writeReplace();
                }

                @Override // java.util.List
                public List<Object> get(int i) {
                    return ((ImmutableSet) build.get(i)).asList();
                }
            }));
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            List<Object> list = (List) obj;
            if (list.size() != this.f53505a.size()) {
                return false;
            }
            int i = 0;
            for (Object obj2 : list) {
                if (!((ImmutableSet) this.f53505a.get(i)).contains(obj2)) {
                    return false;
                }
                i++;
            }
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            if (obj instanceof CartesianSet) {
                return this.f53505a.equals(((CartesianSet) obj).f53505a);
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            if (size() != set.size() || !containsAll(set)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int i = 1;
            int size = size() - 1;
            for (int i2 = 0; i2 < this.f53505a.size(); i2++) {
                size = ~(~(size * 31));
            }
            UnmodifiableIterator it = this.f53505a.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                i = ~(~((i * 31) + ((size() / set.size()) * set.hashCode())));
            }
            return ~(~(i + size));
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection delegate() {
            return this.f53506b;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class SetView<E> extends AbstractSet<E> {
        public /* synthetic */ SetView(C7841a c7841a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        public <S extends Set<E>> S copyInto(S s) {
            s.addAll(this);
            return s;
        }

        public ImmutableSet<E> immutableCopy() {
            return ImmutableSet.copyOf((Collection) this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract UnmodifiableIterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public SetView() {
        }
    }

    /* renamed from: com.google.common.collect.Sets$a */
    /* loaded from: classes4.dex */
    public class C7841a extends SetView {

        /* renamed from: a */
        public final /* synthetic */ Set f53507a;

        /* renamed from: b */
        public final /* synthetic */ Set f53508b;

        /* renamed from: com.google.common.collect.Sets$a$a */
        /* loaded from: classes4.dex */
        public class C7842a extends AbstractIterator {

            /* renamed from: c */
            public final Iterator f53509c;

            /* renamed from: d */
            public final Iterator f53510d;

            public C7842a() {
                C7841a.this = r2;
                this.f53509c = r2.f53507a.iterator();
                this.f53510d = r2.f53508b.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            public Object computeNext() {
                if (this.f53509c.hasNext()) {
                    return this.f53509c.next();
                }
                while (this.f53510d.hasNext()) {
                    Object next = this.f53510d.next();
                    if (!C7841a.this.f53507a.contains(next)) {
                        return next;
                    }
                }
                return endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7841a(Set set, Set set2) {
            super(null);
            this.f53507a = set;
            this.f53508b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!this.f53507a.contains(obj) && !this.f53508b.contains(obj)) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.Sets.SetView
        public Set copyInto(Set set) {
            set.addAll(this.f53507a);
            set.addAll(this.f53508b);
            return set;
        }

        @Override // com.google.common.collect.Sets.SetView
        public ImmutableSet immutableCopy() {
            return new ImmutableSet.Builder().addAll((Iterable) this.f53507a).addAll((Iterable) this.f53508b).build();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            if (this.f53507a.isEmpty() && this.f53508b.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f53507a.size();
            for (Object obj : this.f53508b) {
                if (!this.f53507a.contains(obj)) {
                    size++;
                }
            }
            return size;
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator iterator() {
            return new C7842a();
        }
    }

    /* renamed from: com.google.common.collect.Sets$b */
    /* loaded from: classes4.dex */
    public class C7843b extends SetView {

        /* renamed from: a */
        public final /* synthetic */ Set f53512a;

        /* renamed from: b */
        public final /* synthetic */ Set f53513b;

        /* renamed from: com.google.common.collect.Sets$b$a */
        /* loaded from: classes4.dex */
        public class C7844a extends AbstractIterator {

            /* renamed from: c */
            public final Iterator f53514c;

            public C7844a() {
                C7843b.this = r1;
                this.f53514c = r1.f53512a.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            public Object computeNext() {
                while (this.f53514c.hasNext()) {
                    Object next = this.f53514c.next();
                    if (C7843b.this.f53513b.contains(next)) {
                        return next;
                    }
                }
                return endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7843b(Set set, Set set2) {
            super(null);
            this.f53512a = set;
            this.f53513b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (this.f53512a.contains(obj) && this.f53513b.contains(obj)) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            if (this.f53512a.containsAll(collection) && this.f53513b.containsAll(collection)) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f53513b, this.f53512a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i = 0;
            for (Object obj : this.f53512a) {
                if (this.f53513b.contains(obj)) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator iterator() {
            return new C7844a();
        }
    }

    /* renamed from: com.google.common.collect.Sets$c */
    /* loaded from: classes4.dex */
    public class C7845c extends SetView {

        /* renamed from: a */
        public final /* synthetic */ Set f53516a;

        /* renamed from: b */
        public final /* synthetic */ Set f53517b;

        /* renamed from: com.google.common.collect.Sets$c$a */
        /* loaded from: classes4.dex */
        public class C7846a extends AbstractIterator {

            /* renamed from: c */
            public final Iterator f53518c;

            public C7846a() {
                C7845c.this = r1;
                this.f53518c = r1.f53516a.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            public Object computeNext() {
                while (this.f53518c.hasNext()) {
                    Object next = this.f53518c.next();
                    if (!C7845c.this.f53517b.contains(next)) {
                        return next;
                    }
                }
                return endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7845c(Set set, Set set2) {
            super(null);
            this.f53516a = set;
            this.f53517b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (this.f53516a.contains(obj) && !this.f53517b.contains(obj)) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f53517b.containsAll(this.f53516a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i = 0;
            for (Object obj : this.f53516a) {
                if (!this.f53517b.contains(obj)) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator iterator() {
            return new C7846a();
        }
    }

    /* renamed from: com.google.common.collect.Sets$d */
    /* loaded from: classes4.dex */
    public class C7847d extends SetView {

        /* renamed from: a */
        public final /* synthetic */ Set f53520a;

        /* renamed from: b */
        public final /* synthetic */ Set f53521b;

        /* renamed from: com.google.common.collect.Sets$d$a */
        /* loaded from: classes4.dex */
        public class C7848a extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Iterator f53522c;

            /* renamed from: d */
            public final /* synthetic */ Iterator f53523d;

            /* renamed from: e */
            public final /* synthetic */ C7847d f53524e;

            public C7848a(C7847d c7847d, Iterator it, Iterator it2) {
                this.f53522c = it;
                this.f53523d = it2;
                this.f53524e = c7847d;
            }

            @Override // com.google.common.collect.AbstractIterator
            public Object computeNext() {
                while (this.f53522c.hasNext()) {
                    Object next = this.f53522c.next();
                    if (!this.f53524e.f53521b.contains(next)) {
                        return next;
                    }
                }
                while (this.f53523d.hasNext()) {
                    Object next2 = this.f53523d.next();
                    if (!this.f53524e.f53520a.contains(next2)) {
                        return next2;
                    }
                }
                return endOfData();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7847d(Set set, Set set2) {
            super(null);
            this.f53520a = set;
            this.f53521b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f53521b.contains(obj) ^ this.f53520a.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f53520a.equals(this.f53521b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i = 0;
            for (Object obj : this.f53520a) {
                if (!this.f53521b.contains(obj)) {
                    i++;
                }
            }
            for (Object obj2 : this.f53521b) {
                if (!this.f53520a.contains(obj2)) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator iterator() {
            return new C7848a(this, this.f53520a.iterator(), this.f53521b.iterator());
        }
    }

    /* renamed from: com.google.common.collect.Sets$e */
    /* loaded from: classes4.dex */
    public class C7849e extends AbstractSet {

        /* renamed from: a */
        public final /* synthetic */ int f53525a;

        /* renamed from: b */
        public final /* synthetic */ ImmutableMap f53526b;

        /* renamed from: com.google.common.collect.Sets$e$a */
        /* loaded from: classes4.dex */
        public class C7850a extends AbstractIterator {

            /* renamed from: c */
            public final BitSet f53527c;

            /* renamed from: com.google.common.collect.Sets$e$a$a */
            /* loaded from: classes4.dex */
            public class C7851a extends AbstractSet {

                /* renamed from: a */
                public final /* synthetic */ BitSet f53529a;

                /* renamed from: b */
                public final /* synthetic */ C7850a f53530b;

                /* renamed from: com.google.common.collect.Sets$e$a$a$a */
                /* loaded from: classes4.dex */
                public class C7852a extends AbstractIterator {

                    /* renamed from: c */
                    public int f53531c = -1;

                    public C7852a() {
                        C7851a.this = r1;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    public Object computeNext() {
                        int nextSetBit = C7851a.this.f53529a.nextSetBit(this.f53531c + 1);
                        this.f53531c = nextSetBit;
                        if (nextSetBit == -1) {
                            return endOfData();
                        }
                        return C7849e.this.f53526b.keySet().asList().get(this.f53531c);
                    }
                }

                public C7851a(C7850a c7850a, BitSet bitSet) {
                    this.f53529a = bitSet;
                    this.f53530b = c7850a;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(Object obj) {
                    Integer num = (Integer) C7849e.this.f53526b.get(obj);
                    if (num != null && this.f53529a.get(num.intValue())) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator iterator() {
                    return new C7852a();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return C7849e.this.f53525a;
                }
            }

            public C7850a() {
                C7849e.this = r2;
                this.f53527c = new BitSet(r2.f53526b.size());
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: b */
            public Set computeNext() {
                if (this.f53527c.isEmpty()) {
                    this.f53527c.set(0, C7849e.this.f53525a);
                } else {
                    int nextSetBit = this.f53527c.nextSetBit(0);
                    int nextClearBit = this.f53527c.nextClearBit(nextSetBit);
                    if (nextClearBit == C7849e.this.f53526b.size()) {
                        return (Set) endOfData();
                    }
                    int i = (nextClearBit - nextSetBit) - 1;
                    this.f53527c.set(0, i);
                    this.f53527c.clear(i, nextClearBit);
                    this.f53527c.set(nextClearBit);
                }
                return new C7851a(this, (BitSet) this.f53527c.clone());
            }
        }

        public C7849e(int i, ImmutableMap immutableMap) {
            this.f53525a = i;
            this.f53526b = immutableMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            if (set.size() != this.f53525a || !this.f53526b.keySet().containsAll(set)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7850a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return IntMath.binomial(this.f53526b.size(), this.f53525a);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "Sets.combinations(" + this.f53526b.keySet() + ", " + this.f53525a + ")";
        }
    }

    /* renamed from: com.google.common.collect.Sets$f */
    /* loaded from: classes4.dex */
    public static class C7853f extends ForwardingNavigableSet {

        /* renamed from: a */
        public final NavigableSet f53533a;

        public C7853f(NavigableSet navigableSet) {
            this.f53533a = navigableSet;
        }

        /* renamed from: e */
        public static Ordering m40541e(Comparator comparator) {
            return Ordering.from(comparator).reverse();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public Object ceiling(Object obj) {
            return this.f53533a.floor(obj);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public Comparator<Object> comparator() {
            Comparator comparator = this.f53533a.comparator();
            if (comparator == null) {
                return Ordering.natural().reverse();
            }
            return m40541e(comparator);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public Iterator<Object> descendingIterator() {
            return this.f53533a.iterator();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<Object> descendingSet() {
            return this.f53533a;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public Object first() {
            return this.f53533a.last();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public Object floor(Object obj) {
            return this.f53533a.ceiling(obj);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<Object> headSet(Object obj, boolean z) {
            return this.f53533a.tailSet(obj, z).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public Object higher(Object obj) {
            return this.f53533a.lower(obj);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Object> iterator() {
            return this.f53533a.descendingIterator();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public Object last() {
            return this.f53533a.first();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public Object lower(Object obj) {
            return this.f53533a.higher(obj);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public Object pollFirst() {
            return this.f53533a.pollLast();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        @CheckForNull
        public Object pollLast() {
            return this.f53533a.pollFirst();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<Object> subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return this.f53533a.subSet(obj2, z2, obj, z).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<Object> tailSet(Object obj, boolean z) {
            return this.f53533a.headSet(obj, z).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<Object> headSet(Object obj) {
            return standardHeadSet(obj);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<Object> subSet(Object obj, Object obj2) {
            return standardSubSet(obj, obj2);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<Object> tailSet(Object obj) {
            return standardTailSet(obj);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public NavigableSet<Object> delegate() {
            return this.f53533a;
        }
    }

    /* renamed from: com.google.common.collect.Sets$g */
    /* loaded from: classes4.dex */
    public static class C7854g extends C7856i implements NavigableSet {
        public C7854g(NavigableSet navigableSet, Predicate predicate) {
            super(navigableSet, predicate);
        }

        /* renamed from: b */
        public NavigableSet m40540b() {
            return (NavigableSet) this.f53050a;
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return Iterables.find(m40540b().tailSet(obj, true), this.f53051b, null);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return Iterators.filter(m40540b().descendingIterator(), this.f53051b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return Sets.filter(m40540b().descendingSet(), this.f53051b);
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return Iterators.find(m40540b().headSet(obj, true).descendingIterator(), this.f53051b, null);
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z) {
            return Sets.filter(m40540b().headSet(obj, z), this.f53051b);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return Iterables.find(m40540b().tailSet(obj, false), this.f53051b, null);
        }

        @Override // com.google.common.collect.Sets.C7856i, java.util.SortedSet
        public Object last() {
            return Iterators.find(m40540b().descendingIterator(), this.f53051b);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return Iterators.find(m40540b().headSet(obj, false).descendingIterator(), this.f53051b, null);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return Iterables.m40848c(m40540b(), this.f53051b);
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return Iterables.m40848c(m40540b().descendingSet(), this.f53051b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return Sets.filter(m40540b().subSet(obj, z, obj2, z2), this.f53051b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z) {
            return Sets.filter(m40540b().tailSet(obj, z), this.f53051b);
        }
    }

    /* renamed from: com.google.common.collect.Sets$h */
    /* loaded from: classes4.dex */
    public static class C7855h extends Collections2.C7575a implements Set {
        public C7855h(Set set, Predicate predicate) {
            super(set, predicate);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.m40548a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m40547b(this);
        }
    }

    /* renamed from: com.google.common.collect.Sets$i */
    /* loaded from: classes4.dex */
    public static class C7856i extends C7855h implements SortedSet {
        public C7856i(SortedSet sortedSet, Predicate predicate) {
            super(sortedSet, predicate);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return ((SortedSet) this.f53050a).comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return Iterators.find(this.f53050a.iterator(), this.f53051b);
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return new C7856i(((SortedSet) this.f53050a).headSet(obj), this.f53051b);
        }

        public Object last() {
            SortedSet sortedSet = (SortedSet) this.f53050a;
            while (true) {
                Object last = sortedSet.last();
                if (this.f53051b.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return new C7856i(((SortedSet) this.f53050a).subSet(obj, obj2), this.f53051b);
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return new C7856i(((SortedSet) this.f53050a).tailSet(obj), this.f53051b);
        }
    }

    /* renamed from: com.google.common.collect.Sets$j */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7857j extends AbstractSet {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return Sets.m40545d(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) Preconditions.checkNotNull(collection));
        }
    }

    /* renamed from: com.google.common.collect.Sets$k */
    /* loaded from: classes4.dex */
    public static final class C7858k extends AbstractSet {

        /* renamed from: a */
        public final ImmutableMap f53534a;

        /* renamed from: com.google.common.collect.Sets$k$a */
        /* loaded from: classes4.dex */
        public class C7859a extends AbstractC1139Q {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7859a(int i) {
                super(i);
                C7858k.this = r1;
            }

            @Override // p000.AbstractC1139Q
            /* renamed from: b */
            public Set mo40539a(int i) {
                return new C7860l(C7858k.this.f53534a, i);
            }
        }

        public C7858k(Set set) {
            boolean z;
            if (set.size() <= 30) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Too many elements to create power set: %s > 30", set.size());
            this.f53534a = Maps.m40687u(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Set) {
                return this.f53534a.keySet().containsAll((Set) obj);
            }
            return false;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            if (obj instanceof C7858k) {
                return this.f53534a.keySet().equals(((C7858k) obj).f53534a.keySet());
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f53534a.keySet().hashCode() << (this.f53534a.size() - 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7859a(size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.f53534a.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "powerSet(" + this.f53534a + ")";
        }
    }

    /* renamed from: com.google.common.collect.Sets$l */
    /* loaded from: classes4.dex */
    public static final class C7860l extends AbstractSet {

        /* renamed from: a */
        public final ImmutableMap f53536a;

        /* renamed from: b */
        public final int f53537b;

        /* renamed from: com.google.common.collect.Sets$l$a */
        /* loaded from: classes4.dex */
        public class C7861a extends UnmodifiableIterator {

            /* renamed from: a */
            public final ImmutableList f53538a;

            /* renamed from: b */
            public int f53539b;

            public C7861a() {
                C7860l.this = r2;
                this.f53538a = r2.f53536a.keySet().asList();
                this.f53539b = r2.f53537b;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f53539b != 0) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f53539b);
                if (numberOfTrailingZeros != 32) {
                    this.f53539b &= ~(1 << numberOfTrailingZeros);
                    return this.f53538a.get(numberOfTrailingZeros);
                }
                throw new NoSuchElementException();
            }
        }

        public C7860l(ImmutableMap immutableMap, int i) {
            this.f53536a = immutableMap;
            this.f53537b = i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Integer num = (Integer) this.f53536a.get(obj);
            if (num != null) {
                if (((1 << num.intValue()) & this.f53537b) != 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C7861a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.f53537b);
        }
    }

    /* renamed from: a */
    public static boolean m40548a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m40547b(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = ~(~(i2 + i));
        }
        return i2;
    }

    /* renamed from: c */
    public static EnumSet m40546c(Collection collection, Class cls) {
        EnumSet allOf = EnumSet.allOf(cls);
        allOf.removeAll(collection);
        return allOf;
    }

    public static <B> Set<List<B>> cartesianProduct(List<? extends Set<? extends B>> list) {
        return CartesianSet.m40543e(list);
    }

    public static <E> Set<Set<E>> combinations(Set<E> set, int i) {
        boolean z;
        ImmutableMap m40687u = Maps.m40687u(set);
        AbstractC5406bs.m51814b(i, "size");
        if (i <= m40687u.size()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "size (%s) must be <= set.size() (%s)", i, m40687u.size());
        if (i == 0) {
            return ImmutableSet.m40930of(ImmutableSet.m40931of());
        }
        if (i == m40687u.size()) {
            return ImmutableSet.m40930of(m40687u.keySet());
        }
        return new C7849e(i, m40687u);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        Preconditions.checkArgument(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return m40546c(collection, collection.iterator().next().getDeclaringClass());
    }

    /* renamed from: d */
    public static boolean m40545d(Set set, Collection collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return Iterators.removeAll(set.iterator(), collection);
        }
        return m40544e(set, collection.iterator());
    }

    public static <E> SetView<E> difference(Set<E> set, Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new C7845c(set, set2);
    }

    /* renamed from: e */
    public static boolean m40544e(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    public static <E> Set<E> filter(Set<E> set, Predicate<? super E> predicate) {
        if (set instanceof SortedSet) {
            return filter((SortedSet) set, (Predicate) predicate);
        }
        if (set instanceof C7855h) {
            C7855h c7855h = (C7855h) set;
            return new C7855h((Set) c7855h.f53050a, Predicates.and(c7855h.f53051b, predicate));
        }
        return new C7855h((Set) Preconditions.checkNotNull(set), (Predicate) Preconditions.checkNotNull(predicate));
    }

    @GwtCompatible(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(E e, E... eArr) {
        return ImmutableEnumSet.asImmutable(EnumSet.of((Enum) e, (Enum[]) eArr));
    }

    public static <E> SetView<E> intersection(Set<E> set, Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new C7843b(set, set2);
    }

    public static <E> Set<E> newConcurrentHashSet() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
        return new CopyOnWriteArraySet<>();
    }

    public static <E extends Enum<E>> EnumSet<E> newEnumSet(Iterable<E> iterable, Class<E> cls) {
        EnumSet<E> noneOf = EnumSet.noneOf(cls);
        Iterables.addAll(noneOf, iterable);
        return noneOf;
    }

    public static <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> newHashSetWithExpectedSize(int i) {
        return new HashSet<>(Maps.m40697k(i));
    }

    public static <E> Set<E> newIdentityHashSet() {
        return Collections.newSetFromMap(Maps.newIdentityHashMap());
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i) {
        return new LinkedHashSet<>(Maps.m40697k(i));
    }

    @Deprecated
    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet() {
        return new TreeSet<>();
    }

    @GwtCompatible(serializable = false)
    public static <E> Set<Set<E>> powerSet(Set<E> set) {
        return new C7858k(set);
    }

    @GwtIncompatible
    public static <K extends Comparable<? super K>> NavigableSet<K> subSet(NavigableSet<K> navigableSet, Range<K> range) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (navigableSet.comparator() != null && navigableSet.comparator() != Ordering.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            if (navigableSet.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            K lowerEndpoint = range.lowerEndpoint();
            BoundType lowerBoundType = range.lowerBoundType();
            BoundType boundType = BoundType.CLOSED;
            if (lowerBoundType == boundType) {
                z = true;
            } else {
                z = false;
            }
            K upperEndpoint = range.upperEndpoint();
            if (range.upperBoundType() == boundType) {
                z3 = true;
            }
            return navigableSet.subSet(lowerEndpoint, z, upperEndpoint, z3);
        } else if (range.hasLowerBound()) {
            K lowerEndpoint2 = range.lowerEndpoint();
            if (range.lowerBoundType() == BoundType.CLOSED) {
                z3 = true;
            }
            return navigableSet.tailSet(lowerEndpoint2, z3);
        } else if (range.hasUpperBound()) {
            K upperEndpoint2 = range.upperEndpoint();
            if (range.upperBoundType() == BoundType.CLOSED) {
                z3 = true;
            }
            return navigableSet.headSet(upperEndpoint2, z3);
        } else {
            return (NavigableSet) Preconditions.checkNotNull(navigableSet);
        }
    }

    public static <E> SetView<E> symmetricDifference(Set<? extends E> set, Set<? extends E> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new C7847d(set, set2);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> NavigableSet<E> synchronizedNavigableSet(NavigableSet<E> navigableSet) {
        return Synchronized.m40500q(navigableSet);
    }

    public static <E extends Enum<E>> Collector<E, ?, ImmutableSet<E>> toImmutableEnumSet() {
        return AbstractC7963f.m40317l0();
    }

    public static <E> SetView<E> union(Set<? extends E> set, Set<? extends E> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new C7841a(set, set2);
    }

    public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> navigableSet) {
        if (!(navigableSet instanceof ImmutableCollection) && !(navigableSet instanceof UnmodifiableNavigableSet)) {
            return new UnmodifiableNavigableSet(navigableSet);
        }
        return navigableSet;
    }

    @SafeVarargs
    public static <B> Set<List<B>> cartesianProduct(Set<? extends B>... setArr) {
        return cartesianProduct(Arrays.asList(setArr));
    }

    @GwtCompatible(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(Iterable<E> iterable) {
        if (iterable instanceof ImmutableEnumSet) {
            return (ImmutableEnumSet) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return ImmutableSet.m40931of();
            }
            return ImmutableEnumSet.asImmutable(EnumSet.copyOf(collection));
        }
        Iterator<E> it = iterable.iterator();
        if (it.hasNext()) {
            EnumSet of = EnumSet.of((Enum) it.next());
            Iterators.addAll(of, it);
            return ImmutableEnumSet.asImmutable(of);
        }
        return ImmutableSet.m40931of();
    }

    public static <E> Set<E> newConcurrentHashSet(Iterable<? extends E> iterable) {
        Set<E> newConcurrentHashSet = newConcurrentHashSet();
        Iterables.addAll(newConcurrentHashSet, iterable);
        return newConcurrentHashSet;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet(Iterable<? extends E> iterable) {
        Collection newArrayList;
        if (iterable instanceof Collection) {
            newArrayList = (Collection) iterable;
        } else {
            newArrayList = Lists.newArrayList(iterable);
        }
        return new CopyOnWriteArraySet<>(newArrayList);
    }

    public static <E> HashSet<E> newHashSet(E... eArr) {
        HashSet<E> newHashSetWithExpectedSize = newHashSetWithExpectedSize(eArr.length);
        Collections.addAll(newHashSetWithExpectedSize, eArr);
        return newHashSetWithExpectedSize;
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        LinkedHashSet<E> newLinkedHashSet = newLinkedHashSet();
        Iterables.addAll(newLinkedHashSet, iterable);
        return newLinkedHashSet;
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet(Iterable<? extends E> iterable) {
        TreeSet<E> newTreeSet = newTreeSet();
        Iterables.addAll(newTreeSet, iterable);
        return newTreeSet;
    }

    /* loaded from: classes4.dex */
    public static final class UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;
        private final NavigableSet<E> delegate;
        @CheckForNull
        @LazyInit
        private transient UnmodifiableNavigableSet<E> descendingSet;
        private final SortedSet<E> unmodifiableDelegate;

        public UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
            this.delegate = (NavigableSet) Preconditions.checkNotNull(navigableSet);
            this.unmodifiableDelegate = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E ceiling(E e) {
            return this.delegate.ceiling(e);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.unmodifiableIterator(this.delegate.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet = this.descendingSet;
            if (unmodifiableNavigableSet == null) {
                UnmodifiableNavigableSet<E> unmodifiableNavigableSet2 = new UnmodifiableNavigableSet<>(this.delegate.descendingSet());
                this.descendingSet = unmodifiableNavigableSet2;
                unmodifiableNavigableSet2.descendingSet = this;
                return unmodifiableNavigableSet2;
            }
            return unmodifiableNavigableSet;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E floor(E e) {
            return this.delegate.floor(e);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
            return Sets.unmodifiableNavigableSet(this.delegate.headSet(e, z));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E higher(E e) {
            return this.delegate.higher(e);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E lower(E e) {
            return this.delegate.lower(e);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return Sets.unmodifiableNavigableSet(this.delegate.subSet(e, z, e2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            return Sets.unmodifiableNavigableSet(this.delegate.tailSet(e, z));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public SortedSet<E> delegate() {
            return this.unmodifiableDelegate;
        }
    }

    public static <E> HashSet<E> newHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new HashSet<>((Collection) iterable);
        }
        return newHashSet(iterable.iterator());
    }

    public static <E> TreeSet<E> newTreeSet(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) Preconditions.checkNotNull(comparator));
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection, Class<E> cls) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        return m40546c(collection, cls);
    }

    public static <E> HashSet<E> newHashSet(Iterator<? extends E> it) {
        HashSet<E> newHashSet = newHashSet();
        Iterators.addAll(newHashSet, it);
        return newHashSet;
    }

    public static <E> SortedSet<E> filter(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
        if (sortedSet instanceof C7855h) {
            C7855h c7855h = (C7855h) sortedSet;
            return new C7856i((SortedSet) c7855h.f53050a, Predicates.and(c7855h.f53051b, predicate));
        }
        return new C7856i((SortedSet) Preconditions.checkNotNull(sortedSet), (Predicate) Preconditions.checkNotNull(predicate));
    }

    @GwtIncompatible
    public static <E> NavigableSet<E> filter(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
        if (navigableSet instanceof C7855h) {
            C7855h c7855h = (C7855h) navigableSet;
            return new C7854g((NavigableSet) c7855h.f53050a, Predicates.and(c7855h.f53051b, predicate));
        }
        return new C7854g((NavigableSet) Preconditions.checkNotNull(navigableSet), (Predicate) Preconditions.checkNotNull(predicate));
    }
}
