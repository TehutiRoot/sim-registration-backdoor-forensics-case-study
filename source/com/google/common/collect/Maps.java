package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Maps {

    /* renamed from: com.google.common.collect.Maps$A */
    /* loaded from: classes4.dex */
    public static final class C7734A extends AbstractC7954c {

        /* renamed from: a */
        public final NavigableSet f53355a;

        /* renamed from: b */
        public final Function f53356b;

        public C7734A(NavigableSet navigableSet, Function function) {
            this.f53355a = (NavigableSet) Preconditions.checkNotNull(navigableSet);
            this.f53356b = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.Maps.AbstractC7781x
        /* renamed from: a */
        public Iterator mo40388a() {
            return Maps.m40699i(this.f53355a, this.f53356b);
        }

        @Override // com.google.common.collect.AbstractC7954c
        /* renamed from: b */
        public Iterator mo40371b() {
            return descendingMap().entrySet().iterator();
        }

        @Override // com.google.common.collect.Maps.AbstractC7781x, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f53355a.clear();
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return this.f53355a.comparator();
        }

        @Override // com.google.common.collect.AbstractC7954c, java.util.NavigableMap
        public NavigableMap descendingMap() {
            return Maps.asMap(this.f53355a.descendingSet(), this.f53356b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            if (Collections2.m41062f(this.f53355a, obj)) {
                return this.f53356b.apply(obj);
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z) {
            return Maps.asMap(this.f53355a.headSet(obj, z), this.f53356b);
        }

        @Override // com.google.common.collect.AbstractC7954c, java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return Maps.m40725C(this.f53355a);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f53355a.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return Maps.asMap(this.f53355a.subSet(obj, z, obj2, z2), this.f53356b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z) {
            return Maps.asMap(this.f53355a.tailSet(obj, z), this.f53356b);
        }
    }

    /* renamed from: com.google.common.collect.Maps$B */
    /* loaded from: classes4.dex */
    public static class C7735B extends C7737D implements NavigableSet {
        public C7735B(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.Maps.C7737D
        /* renamed from: c */
        public NavigableMap mo40679b() {
            return (NavigableMap) this.f53405a;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public Object ceiling(Object obj) {
            return mo40679b().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator<Object> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> descendingSet() {
            return mo40679b().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public Object floor(Object obj) {
            return mo40679b().floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> headSet(Object obj, boolean z) {
            return mo40679b().headMap(obj, z).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public Object higher(Object obj) {
            return mo40679b().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public Object lower(Object obj) {
            return mo40679b().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public Object pollFirst() {
            return Maps.m40684x(mo40679b().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public Object pollLast() {
            return Maps.m40684x(mo40679b().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return mo40679b().subMap(obj, z, obj2, z2).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> tailSet(Object obj, boolean z) {
            return mo40679b().tailMap(obj, z).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.C7737D, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<Object> headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // com.google.common.collect.Maps.C7737D, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<Object> subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.Maps.C7737D, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<Object> tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }

    /* loaded from: classes4.dex */
    public static final class BiMapConverter<A, B> extends Converter<A, B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final BiMap<A, B> bimap;

        public BiMapConverter(BiMap<A, B> biMap) {
            this.bimap = (BiMap) Preconditions.checkNotNull(biMap);
        }

        private static <X, Y> Y convert(BiMap<X, Y> biMap, X x) {
            boolean z;
            Y y = biMap.get(x);
            if (y != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "No non-null mapping present for input: %s", x);
            return y;
        }

        @Override // com.google.common.base.Converter
        public A doBackward(B b) {
            return (A) convert(this.bimap.inverse(), b);
        }

        @Override // com.google.common.base.Converter
        public B doForward(A a) {
            return (B) convert(this.bimap, a);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof BiMapConverter) {
                return this.bimap.equals(((BiMapConverter) obj).bimap);
            }
            return false;
        }

        public int hashCode() {
            return this.bimap.hashCode();
        }

        public String toString() {
            return "Maps.asConverter(" + this.bimap + ")";
        }
    }

    /* renamed from: com.google.common.collect.Maps$C */
    /* loaded from: classes4.dex */
    public static class C7736C extends C7763o implements SortedMap {
        public C7736C(SortedSet sortedSet, Function function) {
            super(sortedSet, function);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return mo40663e().comparator();
        }

        @Override // com.google.common.collect.Maps.C7763o
        /* renamed from: f */
        public SortedSet mo40663e() {
            return (SortedSet) super.mo40663e();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return mo40663e().first();
        }

        @Override // java.util.SortedMap
        public SortedMap headMap(Object obj) {
            return Maps.asMap(mo40663e().headSet(obj), this.f53382e);
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M, java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return Maps.m40723E(mo40663e());
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return mo40663e().last();
        }

        @Override // java.util.SortedMap
        public SortedMap subMap(Object obj, Object obj2) {
            return Maps.asMap(mo40663e().subSet(obj, obj2), this.f53382e);
        }

        @Override // java.util.SortedMap
        public SortedMap tailMap(Object obj) {
            return Maps.asMap(mo40663e().tailSet(obj), this.f53382e);
        }
    }

    /* renamed from: com.google.common.collect.Maps$D */
    /* loaded from: classes4.dex */
    public static class C7737D extends C7783y implements SortedSet {
        public C7737D(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // com.google.common.collect.Maps.C7783y
        /* renamed from: b */
        public SortedMap mo40649a() {
            return (SortedMap) super.mo40649a();
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<Object> comparator() {
            return mo40649a().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return mo40649a().firstKey();
        }

        public SortedSet<Object> headSet(Object obj) {
            return new C7737D(mo40649a().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return mo40649a().lastKey();
        }

        public SortedSet<Object> subSet(Object obj, Object obj2) {
            return new C7737D(mo40649a().subMap(obj, obj2));
        }

        public SortedSet<Object> tailSet(Object obj) {
            return new C7737D(mo40649a().tailMap(obj));
        }
    }

    /* renamed from: com.google.common.collect.Maps$E */
    /* loaded from: classes4.dex */
    public static class C7738E extends C7784z implements SortedMapDifference {
        public C7738E(SortedMap sortedMap, SortedMap sortedMap2, SortedMap sortedMap3, SortedMap sortedMap4) {
            super(sortedMap, sortedMap2, sortedMap3, sortedMap4);
        }

        @Override // com.google.common.collect.Maps.C7784z, com.google.common.collect.MapDifference, com.google.common.collect.SortedMapDifference
        public SortedMap entriesDiffering() {
            return (SortedMap) super.entriesDiffering();
        }

        @Override // com.google.common.collect.Maps.C7784z, com.google.common.collect.MapDifference, com.google.common.collect.SortedMapDifference
        public SortedMap entriesInCommon() {
            return (SortedMap) super.entriesInCommon();
        }

        @Override // com.google.common.collect.Maps.C7784z, com.google.common.collect.MapDifference, com.google.common.collect.SortedMapDifference
        public SortedMap entriesOnlyOnLeft() {
            return (SortedMap) super.entriesOnlyOnLeft();
        }

        @Override // com.google.common.collect.Maps.C7784z, com.google.common.collect.MapDifference, com.google.common.collect.SortedMapDifference
        public SortedMap entriesOnlyOnRight() {
            return (SortedMap) super.entriesOnlyOnRight();
        }
    }

    /* loaded from: classes4.dex */
    public enum EntryFunction implements Function<Map.Entry<?, ?>, Object> {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.base.Function
            @CheckForNull
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.base.Function
            @CheckForNull
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };

        /* synthetic */ EntryFunction(C7753e c7753e) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface EntryTransformer<K, V1, V2> {
        V2 transformEntry(K k, V1 v1);
    }

    /* renamed from: com.google.common.collect.Maps$F */
    /* loaded from: classes4.dex */
    public static class C7741F extends AbstractC7781x {

        /* renamed from: a */
        public final Map f53357a;

        /* renamed from: b */
        public final EntryTransformer f53358b;

        public C7741F(Map map, EntryTransformer entryTransformer) {
            this.f53357a = (Map) Preconditions.checkNotNull(map);
            this.f53358b = (EntryTransformer) Preconditions.checkNotNull(entryTransformer);
        }

        @Override // com.google.common.collect.Maps.AbstractC7781x
        /* renamed from: a */
        public Iterator mo40388a() {
            return Iterators.transform(this.f53357a.entrySet().iterator(), Maps.m40702f(this.f53358b));
        }

        @Override // com.google.common.collect.Maps.AbstractC7781x, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f53357a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f53357a.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            Object obj2 = this.f53357a.get(obj);
            if (obj2 == null && !this.f53357a.containsKey(obj)) {
                return null;
            }
            return this.f53358b.transformEntry(obj, AbstractC21396oJ0.m25936a(obj2));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return this.f53357a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            if (this.f53357a.containsKey(obj)) {
                return this.f53358b.transformEntry(obj, AbstractC21396oJ0.m25936a(this.f53357a.remove(obj)));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f53357a.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            return new C7747L(this);
        }
    }

    /* renamed from: com.google.common.collect.Maps$G */
    /* loaded from: classes4.dex */
    public static class C7742G extends C7743H implements NavigableMap {
        public C7742G(NavigableMap navigableMap, EntryTransformer entryTransformer) {
            super(navigableMap, entryTransformer);
        }

        @Override // com.google.common.collect.Maps.C7743H
        /* renamed from: c */
        public NavigableMap mo40673b() {
            return (NavigableMap) super.mo40673b();
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            return m40674h(mo40673b().ceilingEntry(obj));
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return mo40673b().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return mo40673b().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return Maps.transformEntries(mo40673b().descendingMap(), this.f53358b);
        }

        @Override // com.google.common.collect.Maps.C7743H, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: e */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // com.google.common.collect.Maps.C7743H, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: f */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            return m40674h(mo40673b().firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            return m40674h(mo40673b().floorEntry(obj));
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return mo40673b().floorKey(obj);
        }

        @Override // com.google.common.collect.Maps.C7743H, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: g */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        /* renamed from: h */
        public final Map.Entry m40674h(Map.Entry entry) {
            if (entry == null) {
                return null;
            }
            return Maps.m40718J(this.f53358b, entry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            return m40674h(mo40673b().higherEntry(obj));
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return mo40673b().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            return m40674h(mo40673b().lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            return m40674h(mo40673b().lowerEntry(obj));
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return mo40673b().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return mo40673b().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return m40674h(mo40673b().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return m40674h(mo40673b().pollLastEntry());
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z) {
            return Maps.transformEntries(mo40673b().headMap(obj, z), this.f53358b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return Maps.transformEntries(mo40673b().subMap(obj, z, obj2, z2), this.f53358b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z) {
            return Maps.transformEntries(mo40673b().tailMap(obj, z), this.f53358b);
        }
    }

    /* renamed from: com.google.common.collect.Maps$H */
    /* loaded from: classes4.dex */
    public static class C7743H extends C7741F implements SortedMap {
        public C7743H(SortedMap sortedMap, EntryTransformer entryTransformer) {
            super(sortedMap, entryTransformer);
        }

        /* renamed from: b */
        public SortedMap mo40673b() {
            return (SortedMap) this.f53357a;
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return mo40673b().comparator();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return mo40673b().firstKey();
        }

        public SortedMap headMap(Object obj) {
            return Maps.transformEntries(mo40673b().headMap(obj), this.f53358b);
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return mo40673b().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return Maps.transformEntries(mo40673b().subMap(obj, obj2), this.f53358b);
        }

        public SortedMap tailMap(Object obj) {
            return Maps.transformEntries(mo40673b().tailMap(obj), this.f53358b);
        }
    }

    /* renamed from: com.google.common.collect.Maps$I */
    /* loaded from: classes4.dex */
    public static class C7744I extends ForwardingCollection {

        /* renamed from: a */
        public final Collection f53359a;

        public C7744I(Collection collection) {
            this.f53359a = collection;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return Maps.m40715M(this.f53359a.iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection delegate() {
            return this.f53359a;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray(Object[] objArr) {
            return standardToArray(objArr);
        }
    }

    /* renamed from: com.google.common.collect.Maps$J */
    /* loaded from: classes4.dex */
    public static class C7745J extends C7744I implements Set {
        public C7745J(Set set) {
            super(set);
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

    /* renamed from: com.google.common.collect.Maps$K */
    /* loaded from: classes4.dex */
    public static class C7746K implements MapDifference.ValueDifference {

        /* renamed from: a */
        public final Object f53360a;

        /* renamed from: b */
        public final Object f53361b;

        public C7746K(Object obj, Object obj2) {
            this.f53360a = obj;
            this.f53361b = obj2;
        }

        /* renamed from: a */
        public static MapDifference.ValueDifference m40672a(Object obj, Object obj2) {
            return new C7746K(obj, obj2);
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public boolean equals(Object obj) {
            if (!(obj instanceof MapDifference.ValueDifference)) {
                return false;
            }
            MapDifference.ValueDifference valueDifference = (MapDifference.ValueDifference) obj;
            if (!Objects.equal(this.f53360a, valueDifference.leftValue()) || !Objects.equal(this.f53361b, valueDifference.rightValue())) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public int hashCode() {
            return Objects.hashCode(this.f53360a, this.f53361b);
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public Object leftValue() {
            return this.f53360a;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public Object rightValue() {
            return this.f53361b;
        }

        public String toString() {
            return "(" + this.f53360a + ", " + this.f53361b + ")";
        }
    }

    /* renamed from: com.google.common.collect.Maps$L */
    /* loaded from: classes4.dex */
    public static class C7747L extends AbstractCollection {

        /* renamed from: a */
        public final Map f53362a;

        public C7747L(Map map) {
            this.f53362a = (Map) Preconditions.checkNotNull(map);
        }

        /* renamed from: a */
        public final Map m40671a() {
            return this.f53362a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            m40671a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            return m40671a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return m40671a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return Maps.m40710R(m40671a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : m40671a().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        m40671a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet newHashSet = Sets.newHashSet();
                for (Map.Entry entry : m40671a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        newHashSet.add(entry.getKey());
                    }
                }
                return m40671a().keySet().removeAll(newHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet newHashSet = Sets.newHashSet();
                for (Map.Entry entry : m40671a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        newHashSet.add(entry.getKey());
                    }
                }
                return m40671a().keySet().retainAll(newHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return m40671a().size();
        }
    }

    /* renamed from: com.google.common.collect.Maps$M */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7748M extends AbstractMap {

        /* renamed from: a */
        public transient Set f53363a;

        /* renamed from: b */
        public transient Set f53364b;

        /* renamed from: c */
        public transient Collection f53365c;

        /* renamed from: a */
        public abstract Set mo40273a();

        /* renamed from: b */
        public Set mo40272b() {
            return new C7783y(this);
        }

        /* renamed from: c */
        public Collection mo40271c() {
            return new C7747L(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f53363a;
            if (set == null) {
                Set mo40273a = mo40273a();
                this.f53363a = mo40273a;
                return mo40273a;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            Set set = this.f53364b;
            if (set == null) {
                Set mo40272b = mo40272b();
                this.f53364b = mo40272b;
                return mo40272b;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.f53365c;
            if (collection == null) {
                Collection mo40271c = mo40271c();
                this.f53365c = mo40271c;
                return mo40271c;
            }
            return collection;
        }
    }

    /* loaded from: classes4.dex */
    public static class UnmodifiableBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final BiMap<? extends K, ? extends V> delegate;
        @RetainedWith
        @CheckForNull
        @LazyInit
        BiMap<V, K> inverse;
        final Map<K, V> unmodifiableMap;
        @CheckForNull
        @LazyInit
        transient Set<V> values;

        public UnmodifiableBiMap(BiMap<? extends K, ? extends V> biMap, @CheckForNull BiMap<V, K> biMap2) {
            this.unmodifiableMap = Collections.unmodifiableMap(biMap);
            this.delegate = biMap;
            this.inverse = biMap2;
        }

        @Override // com.google.common.collect.BiMap
        @CheckForNull
        public V forcePut(K k, V v) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
            BiMap<V, K> biMap = this.inverse;
            if (biMap == null) {
                UnmodifiableBiMap unmodifiableBiMap = new UnmodifiableBiMap(this.delegate.inverse(), this);
                this.inverse = unmodifiableBiMap;
                return unmodifiableBiMap;
            }
            return biMap;
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public Map<K, V> delegate() {
            return this.unmodifiableMap;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public Set<V> values() {
            Set<V> set = this.values;
            if (set == null) {
                Set<V> unmodifiableSet = Collections.unmodifiableSet(this.delegate.values());
                this.values = unmodifiableSet;
                return unmodifiableSet;
            }
            return set;
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    public static class UnmodifiableNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V>, Serializable {
        private final NavigableMap<K, ? extends V> delegate;
        @CheckForNull
        @LazyInit
        private transient UnmodifiableNavigableMap<K, V> descendingMap;

        public UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
            this.delegate = navigableMap;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> ceilingEntry(K k) {
            return Maps.m40712P(this.delegate.ceilingEntry(k));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K ceilingKey(K k) {
            return this.delegate.ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return Sets.unmodifiableNavigableSet(this.delegate.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap = this.descendingMap;
            if (unmodifiableNavigableMap == null) {
                UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap2 = new UnmodifiableNavigableMap<>(this.delegate.descendingMap(), this);
                this.descendingMap = unmodifiableNavigableMap2;
                return unmodifiableNavigableMap2;
            }
            return unmodifiableNavigableMap;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> firstEntry() {
            return Maps.m40712P(this.delegate.firstEntry());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> floorEntry(K k) {
            return Maps.m40712P(this.delegate.floorEntry(k));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K floorKey(K k) {
            return this.delegate.floorKey(k);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> higherEntry(K k) {
            return Maps.m40712P(this.delegate.higherEntry(k));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K higherKey(K k) {
            return this.delegate.higherKey(k);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lastEntry() {
            return Maps.m40712P(this.delegate.lastEntry());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lowerEntry(K k) {
            return Maps.m40712P(this.delegate.lowerEntry(k));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K lowerKey(K k) {
            return this.delegate.lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return Sets.unmodifiableNavigableSet(this.delegate.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            return Maps.unmodifiableNavigableMap(this.delegate.headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return Maps.unmodifiableNavigableMap(this.delegate.subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return Maps.unmodifiableNavigableMap(this.delegate.tailMap(k, z));
        }

        public UnmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap, UnmodifiableNavigableMap<K, V> unmodifiableNavigableMap) {
            this.delegate = navigableMap;
            this.descendingMap = unmodifiableNavigableMap;
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public SortedMap<K, V> delegate() {
            return Collections.unmodifiableSortedMap(this.delegate);
        }
    }

    /* renamed from: com.google.common.collect.Maps$a */
    /* loaded from: classes4.dex */
    public class C7749a implements Function {

        /* renamed from: a */
        public final /* synthetic */ EntryTransformer f53366a;

        /* renamed from: b */
        public final /* synthetic */ Object f53367b;

        public C7749a(EntryTransformer entryTransformer, Object obj) {
            this.f53366a = entryTransformer;
            this.f53367b = obj;
        }

        @Override // com.google.common.base.Function
        public Object apply(Object obj) {
            return this.f53366a.transformEntry(this.f53367b, obj);
        }
    }

    /* renamed from: com.google.common.collect.Maps$b */
    /* loaded from: classes4.dex */
    public class C7750b implements Function {

        /* renamed from: a */
        public final /* synthetic */ EntryTransformer f53368a;

        public C7750b(EntryTransformer entryTransformer) {
            this.f53368a = entryTransformer;
        }

        @Override // com.google.common.base.Function
        /* renamed from: a */
        public Object apply(Map.Entry entry) {
            return this.f53368a.transformEntry(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: com.google.common.collect.Maps$c */
    /* loaded from: classes4.dex */
    public class C7751c extends AbstractC1646X {

        /* renamed from: a */
        public final /* synthetic */ Map.Entry f53369a;

        /* renamed from: b */
        public final /* synthetic */ EntryTransformer f53370b;

        public C7751c(Map.Entry entry, EntryTransformer entryTransformer) {
            this.f53369a = entry;
            this.f53370b = entryTransformer;
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object getKey() {
            return this.f53369a.getKey();
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object getValue() {
            return this.f53370b.transformEntry(this.f53369a.getKey(), this.f53369a.getValue());
        }
    }

    /* renamed from: com.google.common.collect.Maps$d */
    /* loaded from: classes4.dex */
    public class C7752d implements Function {

        /* renamed from: a */
        public final /* synthetic */ EntryTransformer f53371a;

        public C7752d(EntryTransformer entryTransformer) {
            this.f53371a = entryTransformer;
        }

        @Override // com.google.common.base.Function
        /* renamed from: a */
        public Map.Entry apply(Map.Entry entry) {
            return Maps.m40718J(this.f53371a, entry);
        }
    }

    /* renamed from: com.google.common.collect.Maps$e */
    /* loaded from: classes4.dex */
    public class C7753e extends YU1 {
        public C7753e(Iterator it) {
            super(it);
        }

        @Override // p000.YU1
        /* renamed from: b */
        public Object mo40369a(Map.Entry entry) {
            return entry.getKey();
        }
    }

    /* renamed from: com.google.common.collect.Maps$f */
    /* loaded from: classes4.dex */
    public class C7754f extends YU1 {
        public C7754f(Iterator it) {
            super(it);
        }

        @Override // p000.YU1
        /* renamed from: b */
        public Object mo40369a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    /* renamed from: com.google.common.collect.Maps$g */
    /* loaded from: classes4.dex */
    public class C7755g extends YU1 {

        /* renamed from: b */
        public final /* synthetic */ Function f53372b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7755g(Iterator it, Function function) {
            super(it);
            this.f53372b = function;
        }

        @Override // p000.YU1
        /* renamed from: b */
        public Map.Entry mo40369a(Object obj) {
            return Maps.immutableEntry(obj, this.f53372b.apply(obj));
        }
    }

    /* renamed from: com.google.common.collect.Maps$j */
    /* loaded from: classes4.dex */
    public class C7758j extends ForwardingNavigableSet {

        /* renamed from: a */
        public final /* synthetic */ NavigableSet f53375a;

        public C7758j(NavigableSet navigableSet) {
            this.f53375a = navigableSet;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet descendingSet() {
            return Maps.m40725C(super.descendingSet());
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return Maps.m40723E(super.headSet(obj));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return Maps.m40723E(super.subSet(obj, obj2));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return Maps.m40723E(super.tailSet(obj));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z) {
            return Maps.m40725C(super.headSet(obj, z));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return Maps.m40725C(super.subSet(obj, z, obj2, z2));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z) {
            return Maps.m40725C(super.tailSet(obj, z));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public NavigableSet delegate() {
            return this.f53375a;
        }
    }

    /* renamed from: com.google.common.collect.Maps$k */
    /* loaded from: classes4.dex */
    public class C7759k extends AbstractC1646X {

        /* renamed from: a */
        public final /* synthetic */ Map.Entry f53376a;

        public C7759k(Map.Entry entry) {
            this.f53376a = entry;
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object getKey() {
            return this.f53376a.getKey();
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object getValue() {
            return this.f53376a.getValue();
        }
    }

    /* renamed from: com.google.common.collect.Maps$l */
    /* loaded from: classes4.dex */
    public class C7760l extends UnmodifiableIterator {

        /* renamed from: a */
        public final /* synthetic */ Iterator f53377a;

        public C7760l(Iterator it) {
            this.f53377a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry next() {
            return Maps.m40716L((Map.Entry) this.f53377a.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f53377a.hasNext();
        }
    }

    /* renamed from: com.google.common.collect.Maps$m */
    /* loaded from: classes4.dex */
    public class C7761m implements EntryTransformer {

        /* renamed from: a */
        public final /* synthetic */ Function f53378a;

        public C7761m(Function function) {
            this.f53378a = function;
        }

        @Override // com.google.common.collect.Maps.EntryTransformer
        public Object transformEntry(Object obj, Object obj2) {
            return this.f53378a.apply(obj2);
        }
    }

    /* renamed from: com.google.common.collect.Maps$n */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7762n extends AbstractC7748M {

        /* renamed from: d */
        public final Map f53379d;

        /* renamed from: e */
        public final Predicate f53380e;

        public AbstractC7762n(Map map, Predicate predicate) {
            this.f53379d = map;
            this.f53380e = predicate;
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: c */
        public Collection mo40271c() {
            return new C7780w(this, this.f53379d, this.f53380e);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (this.f53379d.containsKey(obj) && m40664e(obj, this.f53379d.get(obj))) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean m40664e(Object obj, Object obj2) {
            return this.f53380e.apply(Maps.immutableEntry(obj, obj2));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            Object obj2 = this.f53379d.get(obj);
            if (obj2 == null || !m40664e(obj, obj2)) {
                return null;
            }
            return obj2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            Preconditions.checkArgument(m40664e(obj, obj2));
            return this.f53379d.put(obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                Preconditions.checkArgument(m40664e(entry.getKey(), entry.getValue()));
            }
            this.f53379d.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            if (containsKey(obj)) {
                return this.f53379d.remove(obj);
            }
            return null;
        }
    }

    /* renamed from: com.google.common.collect.Maps$o */
    /* loaded from: classes4.dex */
    public static class C7763o extends AbstractC7748M {

        /* renamed from: d */
        public final Set f53381d;

        /* renamed from: e */
        public final Function f53382e;

        /* renamed from: com.google.common.collect.Maps$o$a */
        /* loaded from: classes4.dex */
        public class C7764a extends AbstractC7767q {
            public C7764a() {
                C7763o.this = r1;
            }

            @Override // com.google.common.collect.Maps.AbstractC7767q
            /* renamed from: a */
            public Map mo40268a() {
                return C7763o.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return Maps.m40699i(C7763o.this.mo40663e(), C7763o.this.f53382e);
            }
        }

        public C7763o(Set set, Function function) {
            this.f53381d = (Set) Preconditions.checkNotNull(set);
            this.f53382e = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: a */
        public Set mo40273a() {
            return new C7764a();
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: b */
        public Set mo40272b() {
            return Maps.m40724D(mo40663e());
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: c */
        public Collection mo40271c() {
            return Collections2.transform(this.f53381d, this.f53382e);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            mo40663e().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return mo40663e().contains(obj);
        }

        /* renamed from: e */
        public Set mo40663e() {
            return this.f53381d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            if (Collections2.m41062f(mo40663e(), obj)) {
                return this.f53382e.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            if (mo40663e().remove(obj)) {
                return this.f53382e.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return mo40663e().size();
        }
    }

    /* renamed from: com.google.common.collect.Maps$p */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7765p extends ForwardingMap implements NavigableMap {

        /* renamed from: a */
        public transient Comparator f53384a;

        /* renamed from: b */
        public transient Set f53385b;

        /* renamed from: c */
        public transient NavigableSet f53386c;

        /* renamed from: com.google.common.collect.Maps$p$a */
        /* loaded from: classes4.dex */
        public class C7766a extends AbstractC7767q {
            public C7766a() {
                AbstractC7765p.this = r1;
            }

            @Override // com.google.common.collect.Maps.AbstractC7767q
            /* renamed from: a */
            public Map mo40268a() {
                return AbstractC7765p.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return AbstractC7765p.this.entryIterator();
            }
        }

        /* renamed from: h */
        private static Ordering m40661h(Comparator comparator) {
            return Ordering.from(comparator).reverse();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<Object, Object> ceilingEntry(Object obj) {
            return mo40370f().floorEntry(obj);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Object ceilingKey(Object obj) {
            return mo40370f().floorKey(obj);
        }

        @Override // java.util.SortedMap
        public Comparator<Object> comparator() {
            Comparator<Object> comparator = this.f53384a;
            if (comparator == null) {
                Comparator comparator2 = mo40370f().comparator();
                if (comparator2 == null) {
                    comparator2 = Ordering.natural();
                }
                Ordering m40661h = m40661h(comparator2);
                this.f53384a = m40661h;
                return m40661h;
            }
            return comparator;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<Object> descendingKeySet() {
            return mo40370f().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> descendingMap() {
            return mo40370f();
        }

        /* renamed from: e */
        public Set m40662e() {
            return new C7766a();
        }

        public abstract Iterator entryIterator();

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<Map.Entry<Object, Object>> entrySet() {
            Set<Map.Entry<Object, Object>> set = this.f53385b;
            if (set == null) {
                Set<Map.Entry<Object, Object>> m40662e = m40662e();
                this.f53385b = m40662e;
                return m40662e;
            }
            return set;
        }

        /* renamed from: f */
        public abstract NavigableMap mo40370f();

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<Object, Object> firstEntry() {
            return mo40370f().lastEntry();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return mo40370f().lastKey();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<Object, Object> floorEntry(Object obj) {
            return mo40370f().ceilingEntry(obj);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Object floorKey(Object obj) {
            return mo40370f().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> headMap(Object obj, boolean z) {
            return mo40370f().tailMap(obj, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<Object, Object> higherEntry(Object obj) {
            return mo40370f().lowerEntry(obj);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Object higherKey(Object obj) {
            return mo40370f().lowerKey(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<Object> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<Object, Object> lastEntry() {
            return mo40370f().firstEntry();
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return mo40370f().firstKey();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<Object, Object> lowerEntry(Object obj) {
            return mo40370f().higherEntry(obj);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Object lowerKey(Object obj) {
            return mo40370f().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<Object> navigableKeySet() {
            NavigableSet<Object> navigableSet = this.f53386c;
            if (navigableSet == null) {
                C7735B c7735b = new C7735B(this);
                this.f53386c = c7735b;
                return c7735b;
            }
            return navigableSet;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<Object, Object> pollFirstEntry() {
            return mo40370f().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<Object, Object> pollLastEntry() {
            return mo40370f().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return mo40370f().subMap(obj2, z2, obj, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> tailMap(Object obj, boolean z) {
            return mo40370f().headMap(obj, z).descendingMap();
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public Collection<Object> values() {
            return new C7747L(this);
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Map<Object, Object> delegate() {
            return mo40370f();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<Object, Object> headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<Object, Object> tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    /* renamed from: com.google.common.collect.Maps$q */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7767q extends Sets.AbstractC7857j {
        /* renamed from: a */
        public abstract Map mo40268a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo40268a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object m40721G = Maps.m40721G(mo40268a(), key);
            if (!Objects.equal(m40721G, entry.getValue())) {
                return false;
            }
            if (m40721G == null && !mo40268a().containsKey(key)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo40268a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return mo40268a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return Sets.m40544e(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet newHashSetWithExpectedSize = Sets.newHashSetWithExpectedSize(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        newHashSetWithExpectedSize.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo40268a().keySet().retainAll(newHashSetWithExpectedSize);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo40268a().size();
        }
    }

    /* renamed from: com.google.common.collect.Maps$r */
    /* loaded from: classes4.dex */
    public static final class C7768r extends C7770s implements BiMap {

        /* renamed from: g */
        public final BiMap f53388g;

        /* renamed from: com.google.common.collect.Maps$r$a */
        /* loaded from: classes4.dex */
        public class C7769a implements Predicate {

            /* renamed from: a */
            public final /* synthetic */ Predicate f53389a;

            public C7769a(Predicate predicate) {
                this.f53389a = predicate;
            }

            @Override // com.google.common.base.Predicate
            /* renamed from: a */
            public boolean apply(Map.Entry entry) {
                return this.f53389a.apply(Maps.immutableEntry(entry.getValue(), entry.getKey()));
            }
        }

        public C7768r(BiMap biMap, Predicate predicate) {
            super(biMap, predicate);
            this.f53388g = new C7768r(biMap.inverse(), m40660h(predicate), this);
        }

        /* renamed from: h */
        public static Predicate m40660h(Predicate predicate) {
            return new C7769a(predicate);
        }

        @Override // com.google.common.collect.BiMap
        public Object forcePut(Object obj, Object obj2) {
            Preconditions.checkArgument(m40664e(obj, obj2));
            return m40659i().forcePut(obj, obj2);
        }

        /* renamed from: i */
        public BiMap m40659i() {
            return (BiMap) this.f53379d;
        }

        @Override // com.google.common.collect.BiMap
        public BiMap inverse() {
            return this.f53388g;
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M, java.util.AbstractMap, java.util.Map
        public Set values() {
            return this.f53388g.keySet();
        }

        public C7768r(BiMap biMap, Predicate predicate, BiMap biMap2) {
            super(biMap, predicate);
            this.f53388g = biMap2;
        }
    }

    /* renamed from: com.google.common.collect.Maps$s */
    /* loaded from: classes4.dex */
    public static class C7770s extends AbstractC7762n {

        /* renamed from: f */
        public final Set f53390f;

        /* renamed from: com.google.common.collect.Maps$s$a */
        /* loaded from: classes4.dex */
        public class C7771a extends ForwardingSet {

            /* renamed from: com.google.common.collect.Maps$s$a$a */
            /* loaded from: classes4.dex */
            public class C7772a extends YU1 {

                /* renamed from: com.google.common.collect.Maps$s$a$a$a */
                /* loaded from: classes4.dex */
                public class C7773a extends ForwardingMapEntry {

                    /* renamed from: a */
                    public final /* synthetic */ Map.Entry f53393a;

                    /* renamed from: b */
                    public final /* synthetic */ C7772a f53394b;

                    public C7773a(C7772a c7772a, Map.Entry entry) {
                        this.f53393a = entry;
                        this.f53394b = c7772a;
                    }

                    @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                    public Object setValue(Object obj) {
                        Preconditions.checkArgument(C7770s.this.m40664e(getKey(), obj));
                        return super.setValue(obj);
                    }

                    @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                    public Map.Entry delegate() {
                        return this.f53393a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7772a(Iterator it) {
                    super(it);
                    C7771a.this = r1;
                }

                @Override // p000.YU1
                /* renamed from: b */
                public Map.Entry mo40369a(Map.Entry entry) {
                    return new C7773a(this, entry);
                }
            }

            public C7771a() {
                C7770s.this = r1;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new C7772a(C7770s.this.f53390f.iterator());
            }

            public /* synthetic */ C7771a(C7770s c7770s, C7753e c7753e) {
                this();
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public Set delegate() {
                return C7770s.this.f53390f;
            }
        }

        /* renamed from: com.google.common.collect.Maps$s$b */
        /* loaded from: classes4.dex */
        public class C7774b extends C7783y {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7774b() {
                super(r1);
                C7770s.this = r1;
            }

            @Override // com.google.common.collect.Maps.C7783y, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (C7770s.this.containsKey(obj)) {
                    C7770s.this.f53379d.remove(obj);
                    return true;
                }
                return false;
            }

            @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection collection) {
                C7770s c7770s = C7770s.this;
                return C7770s.m40657f(c7770s.f53379d, c7770s.f53380e, collection);
            }

            @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection collection) {
                C7770s c7770s = C7770s.this;
                return C7770s.m40656g(c7770s.f53379d, c7770s.f53380e, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return Lists.newArrayList(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray(Object[] objArr) {
                return Lists.newArrayList(iterator()).toArray(objArr);
            }
        }

        public C7770s(Map map, Predicate predicate) {
            super(map, predicate);
            this.f53390f = Sets.filter(map.entrySet(), this.f53380e);
        }

        /* renamed from: f */
        public static boolean m40657f(Map map, Predicate predicate, Collection collection) {
            Iterator it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (predicate.apply(entry) && collection.contains(entry.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        /* renamed from: g */
        public static boolean m40656g(Map map, Predicate predicate, Collection collection) {
            Iterator it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (predicate.apply(entry) && !collection.contains(entry.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: a */
        public Set mo40273a() {
            return new C7771a(this, null);
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: b */
        public Set mo40272b() {
            return new C7774b();
        }
    }

    /* renamed from: com.google.common.collect.Maps$t */
    /* loaded from: classes4.dex */
    public static class C7775t extends AbstractC7954c {

        /* renamed from: a */
        public final NavigableMap f53396a;

        /* renamed from: b */
        public final Predicate f53397b;

        /* renamed from: c */
        public final Map f53398c;

        /* renamed from: com.google.common.collect.Maps$t$a */
        /* loaded from: classes4.dex */
        public class C7776a extends C7735B {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7776a(NavigableMap navigableMap) {
                super(navigableMap);
                C7775t.this = r1;
            }

            @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection collection) {
                return C7770s.m40657f(C7775t.this.f53396a, C7775t.this.f53397b, collection);
            }

            @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection collection) {
                return C7770s.m40656g(C7775t.this.f53396a, C7775t.this.f53397b, collection);
            }
        }

        public C7775t(NavigableMap navigableMap, Predicate predicate) {
            this.f53396a = (NavigableMap) Preconditions.checkNotNull(navigableMap);
            this.f53397b = predicate;
            this.f53398c = new C7770s(navigableMap, predicate);
        }

        @Override // com.google.common.collect.Maps.AbstractC7781x
        /* renamed from: a */
        public Iterator mo40388a() {
            return Iterators.filter(this.f53396a.entrySet().iterator(), this.f53397b);
        }

        @Override // com.google.common.collect.AbstractC7954c
        /* renamed from: b */
        public Iterator mo40371b() {
            return Iterators.filter(this.f53396a.descendingMap().entrySet().iterator(), this.f53397b);
        }

        @Override // com.google.common.collect.Maps.AbstractC7781x, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f53398c.clear();
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return this.f53396a.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f53398c.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractC7954c, java.util.NavigableMap
        public NavigableMap descendingMap() {
            return Maps.filterEntries(this.f53396a.descendingMap(), this.f53397b);
        }

        @Override // com.google.common.collect.Maps.AbstractC7781x, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set entrySet() {
            return this.f53398c.entrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            return this.f53398c.get(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z) {
            return Maps.filterEntries(this.f53396a.headMap(obj, z), this.f53397b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !Iterables.any(this.f53396a.entrySet(), this.f53397b);
        }

        @Override // com.google.common.collect.AbstractC7954c, java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return new C7776a(this);
        }

        @Override // com.google.common.collect.AbstractC7954c, java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return (Map.Entry) Iterables.m40848c(this.f53396a.entrySet(), this.f53397b);
        }

        @Override // com.google.common.collect.AbstractC7954c, java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return (Map.Entry) Iterables.m40848c(this.f53396a.descendingMap().entrySet(), this.f53397b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            return this.f53398c.put(obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map map) {
            this.f53398c.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            return this.f53398c.remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f53398c.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return Maps.filterEntries(this.f53396a.subMap(obj, z, obj2, z2), this.f53397b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z) {
            return Maps.filterEntries(this.f53396a.tailMap(obj, z), this.f53397b);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection values() {
            return new C7780w(this, this.f53396a, this.f53397b);
        }
    }

    /* renamed from: com.google.common.collect.Maps$u */
    /* loaded from: classes4.dex */
    public static class C7777u extends C7770s implements SortedMap {

        /* renamed from: com.google.common.collect.Maps$u$a */
        /* loaded from: classes4.dex */
        public class C7778a extends C7770s.C7774b implements SortedSet {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7778a() {
                super();
                C7777u.this = r1;
            }

            @Override // java.util.SortedSet
            public Comparator comparator() {
                return C7777u.this.m40650j().comparator();
            }

            @Override // java.util.SortedSet
            public Object first() {
                return C7777u.this.firstKey();
            }

            @Override // java.util.SortedSet
            public SortedSet headSet(Object obj) {
                return (SortedSet) C7777u.this.headMap(obj).keySet();
            }

            @Override // java.util.SortedSet
            public Object last() {
                return C7777u.this.lastKey();
            }

            @Override // java.util.SortedSet
            public SortedSet subSet(Object obj, Object obj2) {
                return (SortedSet) C7777u.this.subMap(obj, obj2).keySet();
            }

            @Override // java.util.SortedSet
            public SortedSet tailSet(Object obj) {
                return (SortedSet) C7777u.this.tailMap(obj).keySet();
            }
        }

        public C7777u(SortedMap sortedMap, Predicate predicate) {
            super(sortedMap, predicate);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return m40650j().comparator();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return keySet().iterator().next();
        }

        @Override // com.google.common.collect.Maps.C7770s, com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: h */
        public SortedSet mo40272b() {
            return new C7778a();
        }

        @Override // java.util.SortedMap
        public SortedMap headMap(Object obj) {
            return new C7777u(m40650j().headMap(obj), this.f53380e);
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M, java.util.AbstractMap, java.util.Map
        /* renamed from: i */
        public SortedSet keySet() {
            return (SortedSet) super.keySet();
        }

        /* renamed from: j */
        public SortedMap m40650j() {
            return (SortedMap) this.f53379d;
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            SortedMap m40650j = m40650j();
            while (true) {
                Object lastKey = m40650j.lastKey();
                if (m40664e(lastKey, AbstractC21396oJ0.m25936a(this.f53379d.get(lastKey)))) {
                    return lastKey;
                }
                m40650j = m40650j().headMap(lastKey);
            }
        }

        @Override // java.util.SortedMap
        public SortedMap subMap(Object obj, Object obj2) {
            return new C7777u(m40650j().subMap(obj, obj2), this.f53380e);
        }

        @Override // java.util.SortedMap
        public SortedMap tailMap(Object obj) {
            return new C7777u(m40650j().tailMap(obj), this.f53380e);
        }
    }

    /* renamed from: com.google.common.collect.Maps$v */
    /* loaded from: classes4.dex */
    public static class C7779v extends AbstractC7762n {

        /* renamed from: f */
        public final Predicate f53401f;

        public C7779v(Map map, Predicate predicate, Predicate predicate2) {
            super(map, predicate2);
            this.f53401f = predicate;
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: a */
        public Set mo40273a() {
            return Sets.filter(this.f53379d.entrySet(), this.f53380e);
        }

        @Override // com.google.common.collect.Maps.AbstractC7748M
        /* renamed from: b */
        public Set mo40272b() {
            return Sets.filter(this.f53379d.keySet(), this.f53401f);
        }

        @Override // com.google.common.collect.Maps.AbstractC7762n, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (this.f53379d.containsKey(obj) && this.f53401f.apply(obj)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.Maps$w */
    /* loaded from: classes4.dex */
    public static final class C7780w extends C7747L {

        /* renamed from: b */
        public final Map f53402b;

        /* renamed from: c */
        public final Predicate f53403c;

        public C7780w(Map map, Map map2, Predicate predicate) {
            super(map);
            this.f53402b = map2;
            this.f53403c = predicate;
        }

        @Override // com.google.common.collect.Maps.C7747L, java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            Iterator it = this.f53402b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (this.f53403c.apply(entry) && Objects.equal(entry.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Maps.C7747L, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            Iterator it = this.f53402b.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (this.f53403c.apply(entry) && collection.contains(entry.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.C7747L, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Iterator it = this.f53402b.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (this.f53403c.apply(entry) && !collection.contains(entry.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
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

    /* renamed from: com.google.common.collect.Maps$x */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7781x extends AbstractMap {

        /* renamed from: com.google.common.collect.Maps$x$a */
        /* loaded from: classes4.dex */
        public class C7782a extends AbstractC7767q {
            public C7782a() {
                AbstractC7781x.this = r1;
            }

            @Override // com.google.common.collect.Maps.AbstractC7767q
            /* renamed from: a */
            public Map mo40268a() {
                return AbstractC7781x.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return AbstractC7781x.this.mo40388a();
            }
        }

        /* renamed from: a */
        public abstract Iterator mo40388a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.m40842b(mo40388a());
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set entrySet() {
            return new C7782a();
        }
    }

    /* renamed from: com.google.common.collect.Maps$y */
    /* loaded from: classes4.dex */
    public static class C7783y extends Sets.AbstractC7857j {

        /* renamed from: a */
        public final Map f53405a;

        public C7783y(Map map) {
            this.f53405a = (Map) Preconditions.checkNotNull(map);
        }

        /* renamed from: a */
        public Map mo40649a() {
            return this.f53405a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo40649a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return mo40649a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo40649a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Object> iterator() {
            return Maps.m40685w(mo40649a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (contains(obj)) {
                mo40649a().remove(obj);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo40649a().size();
        }
    }

    /* renamed from: com.google.common.collect.Maps$z */
    /* loaded from: classes4.dex */
    public static class C7784z implements MapDifference {

        /* renamed from: a */
        public final Map f53406a;

        /* renamed from: b */
        public final Map f53407b;

        /* renamed from: c */
        public final Map f53408c;

        /* renamed from: d */
        public final Map f53409d;

        public C7784z(Map map, Map map2, Map map3, Map map4) {
            this.f53406a = Maps.m40713O(map);
            this.f53407b = Maps.m40713O(map2);
            this.f53408c = Maps.m40713O(map3);
            this.f53409d = Maps.m40713O(map4);
        }

        @Override // com.google.common.collect.MapDifference
        public boolean areEqual() {
            if (this.f53406a.isEmpty() && this.f53407b.isEmpty() && this.f53409d.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.MapDifference, com.google.common.collect.SortedMapDifference
        public Map entriesDiffering() {
            return this.f53409d;
        }

        @Override // com.google.common.collect.MapDifference, com.google.common.collect.SortedMapDifference
        public Map entriesInCommon() {
            return this.f53408c;
        }

        @Override // com.google.common.collect.MapDifference, com.google.common.collect.SortedMapDifference
        public Map entriesOnlyOnLeft() {
            return this.f53406a;
        }

        @Override // com.google.common.collect.MapDifference, com.google.common.collect.SortedMapDifference
        public Map entriesOnlyOnRight() {
            return this.f53407b;
        }

        @Override // com.google.common.collect.MapDifference
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapDifference)) {
                return false;
            }
            MapDifference mapDifference = (MapDifference) obj;
            if (entriesOnlyOnLeft().equals(mapDifference.entriesOnlyOnLeft()) && entriesOnlyOnRight().equals(mapDifference.entriesOnlyOnRight()) && entriesInCommon().equals(mapDifference.entriesInCommon()) && entriesDiffering().equals(mapDifference.entriesDiffering())) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.MapDifference
        public int hashCode() {
            return Objects.hashCode(entriesOnlyOnLeft(), entriesOnlyOnRight(), entriesInCommon(), entriesDiffering());
        }

        public String toString() {
            if (areEqual()) {
                return "equal";
            }
            StringBuilder sb = new StringBuilder("not equal");
            if (!this.f53406a.isEmpty()) {
                sb.append(": only on left=");
                sb.append(this.f53406a);
            }
            if (!this.f53407b.isEmpty()) {
                sb.append(": only on right=");
                sb.append(this.f53407b);
            }
            if (!this.f53409d.isEmpty()) {
                sb.append(": value differences=");
                sb.append(this.f53409d);
            }
            return sb.toString();
        }
    }

    /* renamed from: A */
    public static void m40727A(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: B */
    public static boolean m40726B(Collection collection, Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return collection.remove(m40716L((Map.Entry) obj));
    }

    /* renamed from: C */
    public static NavigableSet m40725C(NavigableSet navigableSet) {
        return new C7758j(navigableSet);
    }

    /* renamed from: D */
    public static Set m40724D(Set set) {
        return new C7756h(set);
    }

    /* renamed from: E */
    public static SortedSet m40723E(SortedSet sortedSet) {
        return new C7757i(sortedSet);
    }

    /* renamed from: F */
    public static boolean m40722F(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: G */
    public static Object m40721G(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: H */
    public static Object m40720H(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: I */
    public static String m40719I(Map map) {
        StringBuilder m41063e = Collections2.m41063e(map.size());
        m41063e.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                m41063e.append(", ");
            }
            m41063e.append(entry.getKey());
            m41063e.append('=');
            m41063e.append(entry.getValue());
            z = false;
        }
        m41063e.append('}');
        return m41063e.toString();
    }

    /* renamed from: J */
    public static Map.Entry m40718J(EntryTransformer entryTransformer, Map.Entry entry) {
        Preconditions.checkNotNull(entryTransformer);
        Preconditions.checkNotNull(entry);
        return new C7751c(entry, entryTransformer);
    }

    /* renamed from: K */
    public static ImmutableMap m40717K(Iterator it, Function function, ImmutableMap.Builder builder) {
        Preconditions.checkNotNull(function);
        while (it.hasNext()) {
            Object next = it.next();
            builder.put(function.apply(next), next);
        }
        try {
            return builder.buildOrThrow();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + ". To index multiple values under a key, use Multimaps.index.");
        }
    }

    /* renamed from: L */
    public static Map.Entry m40716L(Map.Entry entry) {
        Preconditions.checkNotNull(entry);
        return new C7759k(entry);
    }

    /* renamed from: M */
    public static UnmodifiableIterator m40715M(Iterator it) {
        return new C7760l(it);
    }

    /* renamed from: N */
    public static Set m40714N(Set set) {
        return new C7745J(Collections.unmodifiableSet(set));
    }

    /* renamed from: O */
    public static Map m40713O(Map map) {
        if (map instanceof SortedMap) {
            return Collections.unmodifiableSortedMap((SortedMap) map);
        }
        return Collections.unmodifiableMap(map);
    }

    /* renamed from: P */
    public static Map.Entry m40712P(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return m40716L(entry);
    }

    /* renamed from: Q */
    public static Function m40711Q() {
        return EntryFunction.VALUE;
    }

    /* renamed from: R */
    public static Iterator m40710R(Iterator it) {
        return new C7754f(it);
    }

    /* renamed from: S */
    public static Object m40709S(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    /* renamed from: T */
    public static Predicate m40708T(Predicate predicate) {
        return Predicates.compose(predicate, m40711Q());
    }

    public static <A, B> Converter<A, B> asConverter(BiMap<A, B> biMap) {
        return new BiMapConverter(biMap);
    }

    public static <K, V> Map<K, V> asMap(Set<K> set, Function<? super K, V> function) {
        return new C7763o(set, function);
    }

    public static <K, V> MapDifference<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        if (map instanceof SortedMap) {
            return difference((SortedMap) map, (Map) map2);
        }
        return difference(map, map2, Equivalence.equals());
    }

    /* renamed from: f */
    public static Function m40702f(EntryTransformer entryTransformer) {
        Preconditions.checkNotNull(entryTransformer);
        return new C7752d(entryTransformer);
    }

    public static <K, V> Map<K, V> filterEntries(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        if (map instanceof AbstractC7762n) {
            return m40690r((AbstractC7762n) map, predicate);
        }
        return new C7770s((Map) Preconditions.checkNotNull(map), predicate);
    }

    public static <K, V> Map<K, V> filterKeys(Map<K, V> map, Predicate<? super K> predicate) {
        Preconditions.checkNotNull(predicate);
        Predicate m40683y = m40683y(predicate);
        if (map instanceof AbstractC7762n) {
            return m40690r((AbstractC7762n) map, m40683y);
        }
        return new C7779v((Map) Preconditions.checkNotNull(map), predicate, m40683y);
    }

    public static <K, V> Map<K, V> filterValues(Map<K, V> map, Predicate<? super V> predicate) {
        return filterEntries(map, m40708T(predicate));
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ImmutableMap<String, String> fromProperties(Properties properties) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            Object nextElement = propertyNames.nextElement();
            java.util.Objects.requireNonNull(nextElement);
            String str = (String) nextElement;
            String property = properties.getProperty(str);
            java.util.Objects.requireNonNull(property);
            builder.put(str, property);
        }
        return builder.buildOrThrow();
    }

    /* renamed from: g */
    public static Function m40701g(EntryTransformer entryTransformer) {
        Preconditions.checkNotNull(entryTransformer);
        return new C7750b(entryTransformer);
    }

    /* renamed from: h */
    public static EntryTransformer m40700h(Function function) {
        Preconditions.checkNotNull(function);
        return new C7761m(function);
    }

    /* renamed from: i */
    public static Iterator m40699i(Set set, Function function) {
        return new C7755g(set.iterator(), function);
    }

    @GwtCompatible(serializable = true)
    public static <K, V> Map.Entry<K, V> immutableEntry(K k, V v) {
        return new ImmutableEntry(k, v);
    }

    @GwtCompatible(serializable = true)
    public static <K extends Enum<K>, V> ImmutableMap<K, V> immutableEnumMap(Map<K, ? extends V> map) {
        if (map instanceof ImmutableEnumMap) {
            return (ImmutableEnumMap) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return ImmutableMap.m40976of();
        }
        Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        AbstractC5406bs.m51815a(key, value);
        EnumMap enumMap = new EnumMap(Collections.singletonMap(key, value));
        while (it.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            AbstractC5406bs.m51815a(key2, value2);
            enumMap.put((EnumMap) key2, (K) value2);
        }
        return ImmutableEnumMap.asImmutable(enumMap);
    }

    /* renamed from: j */
    public static Function m40698j(EntryTransformer entryTransformer, Object obj) {
        Preconditions.checkNotNull(entryTransformer);
        return new C7749a(entryTransformer, obj);
    }

    /* renamed from: k */
    public static int m40697k(int i) {
        if (i < 3) {
            AbstractC5406bs.m51814b(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: l */
    public static boolean m40696l(Collection collection, Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return collection.contains(m40716L((Map.Entry) obj));
    }

    /* renamed from: m */
    public static boolean m40695m(Map map, Object obj) {
        return Iterators.contains(m40685w(map.entrySet().iterator()), obj);
    }

    /* renamed from: n */
    public static boolean m40694n(Map map, Object obj) {
        return Iterators.contains(m40710R(map.entrySet().iterator()), obj);
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Class<K> cls) {
        return new EnumMap<>((Class) Preconditions.checkNotNull(cls));
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i) {
        return new HashMap<>(m40697k(i));
    }

    public static <K, V> IdentityHashMap<K, V> newIdentityHashMap() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i) {
        return new LinkedHashMap<>(m40697k(i));
    }

    public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
        return new TreeMap<>();
    }

    /* renamed from: o */
    public static void m40693o(Map map, Map map2, Equivalence equivalence, Map map3, Map map4, Map map5, Map map6) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (map2.containsKey(key)) {
                Object m25936a = AbstractC21396oJ0.m25936a(map4.remove(key));
                if (equivalence.equivalent(value, m25936a)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, C7746K.m40672a(value, m25936a));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    /* renamed from: p */
    public static boolean m40692p(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: q */
    public static BiMap m40691q(C7768r c7768r, Predicate predicate) {
        return new C7768r(c7768r.m40659i(), Predicates.and(c7768r.f53380e, predicate));
    }

    /* renamed from: r */
    public static Map m40690r(AbstractC7762n abstractC7762n, Predicate predicate) {
        return new C7770s(abstractC7762n.f53379d, Predicates.and(abstractC7762n.f53380e, predicate));
    }

    /* renamed from: s */
    public static NavigableMap m40689s(C7775t c7775t, Predicate predicate) {
        return new C7775t(c7775t.f53396a, Predicates.and(c7775t.f53397b, predicate));
    }

    @GwtIncompatible
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> subMap(NavigableMap<K, V> navigableMap, Range<K> range) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (navigableMap.comparator() != null && navigableMap.comparator() != Ordering.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            if (navigableMap.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "map is using a custom comparator which is inconsistent with the natural ordering.");
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
            return navigableMap.subMap(lowerEndpoint, z, upperEndpoint, z3);
        } else if (range.hasLowerBound()) {
            K lowerEndpoint2 = range.lowerEndpoint();
            if (range.lowerBoundType() == BoundType.CLOSED) {
                z3 = true;
            }
            return navigableMap.tailMap(lowerEndpoint2, z3);
        } else if (range.hasUpperBound()) {
            K upperEndpoint2 = range.upperEndpoint();
            if (range.upperBoundType() == BoundType.CLOSED) {
                z3 = true;
            }
            return navigableMap.headMap(upperEndpoint2, z3);
        } else {
            return (NavigableMap) Preconditions.checkNotNull(navigableMap);
        }
    }

    @J2ktIncompatible
    public static <K, V> BiMap<K, V> synchronizedBiMap(BiMap<K, V> biMap) {
        return Synchronized.m40510g(biMap, null);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> navigableMap) {
        return Synchronized.m40502o(navigableMap);
    }

    /* renamed from: t */
    public static SortedMap m40688t(C7777u c7777u, Predicate predicate) {
        return new C7777u(c7777u.m40650j(), Predicates.and(c7777u.f53380e, predicate));
    }

    public static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableEnumMap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2) {
        return AbstractC7963f.m40321j0(function, function2);
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterable<K> iterable, Function<? super K, V> function) {
        return toMap(iterable.iterator(), function);
    }

    public static <K, V1, V2> Map<K, V2> transformEntries(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new C7741F(map, entryTransformer);
    }

    public static <K, V1, V2> Map<K, V2> transformValues(Map<K, V1> map, Function<? super V1, V2> function) {
        return transformEntries(map, m40700h(function));
    }

    /* renamed from: u */
    public static ImmutableMap m40687u(Collection collection) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int i = 0;
        for (Object obj : collection) {
            builder.put(obj, Integer.valueOf(i));
            i++;
        }
        return builder.buildOrThrow();
    }

    @CanIgnoreReturnValue
    public static <K, V> ImmutableMap<K, V> uniqueIndex(Iterable<V> iterable, Function<? super V, K> function) {
        if (iterable instanceof Collection) {
            return m40717K(iterable.iterator(), function, ImmutableMap.builderWithExpectedSize(((Collection) iterable).size()));
        }
        return uniqueIndex(iterable.iterator(), function);
    }

    public static <K, V> BiMap<K, V> unmodifiableBiMap(BiMap<? extends K, ? extends V> biMap) {
        return new UnmodifiableBiMap(biMap, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
        Preconditions.checkNotNull(navigableMap);
        if (navigableMap instanceof UnmodifiableNavigableMap) {
            return navigableMap;
        }
        return new UnmodifiableNavigableMap(navigableMap);
    }

    /* renamed from: v */
    public static Function m40686v() {
        return EntryFunction.KEY;
    }

    /* renamed from: w */
    public static Iterator m40685w(Iterator it) {
        return new C7753e(it);
    }

    /* renamed from: x */
    public static Object m40684x(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* renamed from: y */
    public static Predicate m40683y(Predicate predicate) {
        return Predicates.compose(predicate, m40686v());
    }

    /* renamed from: z */
    public static Comparator m40682z(Comparator comparator) {
        if (comparator != null) {
            return comparator;
        }
        return Ordering.natural();
    }

    /* renamed from: com.google.common.collect.Maps$h */
    /* loaded from: classes4.dex */
    public class C7756h extends ForwardingSet {

        /* renamed from: a */
        public final /* synthetic */ Set f53373a;

        public C7756h(Set set) {
            this.f53373a = set;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set delegate() {
            return this.f53373a;
        }
    }

    public static <K, V> SortedMap<K, V> asMap(SortedSet<K> sortedSet, Function<? super K, V> function) {
        return new C7736C(sortedSet, function);
    }

    public static <K, V> SortedMap<K, V> filterValues(SortedMap<K, V> sortedMap, Predicate<? super V> predicate) {
        return filterEntries((SortedMap) sortedMap, m40708T(predicate));
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    public static <K, V> TreeMap<K, V> newTreeMap(SortedMap<K, ? extends V> sortedMap) {
        return new TreeMap<>((SortedMap) sortedMap);
    }

    public static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableEnumMap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        return AbstractC7963f.m40319k0(function, function2, binaryOperator);
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterator<K> it, Function<? super K, V> function) {
        Preconditions.checkNotNull(function);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        while (it.hasNext()) {
            K next = it.next();
            builder.put(next, function.apply(next));
        }
        return builder.buildKeepingLast();
    }

    public static <K, V1, V2> SortedMap<K, V2> transformEntries(SortedMap<K, V1> sortedMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new C7743H(sortedMap, entryTransformer);
    }

    public static <K, V1, V2> SortedMap<K, V2> transformValues(SortedMap<K, V1> sortedMap, Function<? super V1, V2> function) {
        return transformEntries((SortedMap) sortedMap, m40700h(function));
    }

    /* renamed from: com.google.common.collect.Maps$i */
    /* loaded from: classes4.dex */
    public class C7757i extends ForwardingSortedSet {

        /* renamed from: a */
        public final /* synthetic */ SortedSet f53374a;

        public C7757i(SortedSet sortedSet) {
            this.f53374a = sortedSet;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return Maps.m40723E(super.headSet(obj));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return Maps.m40723E(super.subSet(obj, obj2));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return Maps.m40723E(super.tailSet(obj));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public SortedSet delegate() {
            return this.f53374a;
        }
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> asMap(NavigableSet<K> navigableSet, Function<? super K, V> function) {
        return new C7734A(navigableSet, function);
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterValues(NavigableMap<K, V> navigableMap, Predicate<? super V> predicate) {
        return filterEntries((NavigableMap) navigableMap, m40708T(predicate));
    }

    public static <C, K extends C, V> TreeMap<K, V> newTreeMap(@CheckForNull Comparator<C> comparator) {
        return new TreeMap<>((Comparator<? super K>) comparator);
    }

    @GwtIncompatible
    public static <K, V1, V2> NavigableMap<K, V2> transformEntries(NavigableMap<K, V1> navigableMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new C7742G(navigableMap, entryTransformer);
    }

    @GwtIncompatible
    public static <K, V1, V2> NavigableMap<K, V2> transformValues(NavigableMap<K, V1> navigableMap, Function<? super V1, V2> function) {
        return transformEntries((NavigableMap) navigableMap, m40700h(function));
    }

    public static <K, V> BiMap<K, V> filterValues(BiMap<K, V> biMap, Predicate<? super V> predicate) {
        return filterEntries((BiMap) biMap, m40708T(predicate));
    }

    public static <K, V> MapDifference<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, Equivalence<? super V> equivalence) {
        Preconditions.checkNotNull(equivalence);
        LinkedHashMap newLinkedHashMap = newLinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        LinkedHashMap newLinkedHashMap2 = newLinkedHashMap();
        LinkedHashMap newLinkedHashMap3 = newLinkedHashMap();
        m40693o(map, map2, equivalence, newLinkedHashMap, linkedHashMap, newLinkedHashMap2, newLinkedHashMap3);
        return new C7784z(newLinkedHashMap, linkedHashMap, newLinkedHashMap2, newLinkedHashMap3);
    }

    public static <K, V> SortedMap<K, V> filterEntries(SortedMap<K, V> sortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        if (sortedMap instanceof C7777u) {
            return m40688t((C7777u) sortedMap, predicate);
        }
        return new C7777u((SortedMap) Preconditions.checkNotNull(sortedMap), predicate);
    }

    public static <K, V> SortedMap<K, V> filterKeys(SortedMap<K, V> sortedMap, Predicate<? super K> predicate) {
        return filterEntries((SortedMap) sortedMap, m40683y(predicate));
    }

    @CanIgnoreReturnValue
    public static <K, V> ImmutableMap<K, V> uniqueIndex(Iterator<V> it, Function<? super V, K> function) {
        return m40717K(it, function, ImmutableMap.builder());
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterKeys(NavigableMap<K, V> navigableMap, Predicate<? super K> predicate) {
        return filterEntries((NavigableMap) navigableMap, m40683y(predicate));
    }

    public static <K, V> BiMap<K, V> filterKeys(BiMap<K, V> biMap, Predicate<? super K> predicate) {
        Preconditions.checkNotNull(predicate);
        return filterEntries((BiMap) biMap, m40683y(predicate));
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterEntries(NavigableMap<K, V> navigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        if (navigableMap instanceof C7775t) {
            return m40689s((C7775t) navigableMap, predicate);
        }
        return new C7775t((NavigableMap) Preconditions.checkNotNull(navigableMap), predicate);
    }

    public static <K, V> SortedMapDifference<K, V> difference(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
        Preconditions.checkNotNull(sortedMap);
        Preconditions.checkNotNull(map);
        Comparator m40682z = m40682z(sortedMap.comparator());
        TreeMap newTreeMap = newTreeMap(m40682z);
        TreeMap newTreeMap2 = newTreeMap(m40682z);
        newTreeMap2.putAll(map);
        TreeMap newTreeMap3 = newTreeMap(m40682z);
        TreeMap newTreeMap4 = newTreeMap(m40682z);
        m40693o(sortedMap, map, Equivalence.equals(), newTreeMap, newTreeMap2, newTreeMap3, newTreeMap4);
        return new C7738E(newTreeMap, newTreeMap2, newTreeMap3, newTreeMap4);
    }

    public static <K, V> BiMap<K, V> filterEntries(BiMap<K, V> biMap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(biMap);
        Preconditions.checkNotNull(predicate);
        if (biMap instanceof C7768r) {
            return m40691q((C7768r) biMap, predicate);
        }
        return new C7768r(biMap, predicate);
    }
}
