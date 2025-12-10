package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

@GwtIncompatible
/* loaded from: classes4.dex */
public final class TreeRangeMap<K extends Comparable, V> implements RangeMap<K, V> {

    /* renamed from: b */
    public static final RangeMap f53615b = new C7917a();

    /* renamed from: a */
    public final NavigableMap f53616a = Maps.newTreeMap();

    /* renamed from: com.google.common.collect.TreeRangeMap$a */
    /* loaded from: classes4.dex */
    public class C7917a implements RangeMap {
        @Override // com.google.common.collect.RangeMap
        public Map asDescendingMapOfRanges() {
            return Collections.emptyMap();
        }

        @Override // com.google.common.collect.RangeMap
        public Map asMapOfRanges() {
            return Collections.emptyMap();
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
        }

        @Override // com.google.common.collect.RangeMap
        public Object get(Comparable comparable) {
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public Map.Entry getEntry(Comparable comparable) {
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public void put(Range range, Object obj) {
            Preconditions.checkNotNull(range);
            throw new IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(RangeMap rangeMap) {
            if (rangeMap.asMapOfRanges().isEmpty()) {
                return;
            }
            throw new IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(Range range, Object obj) {
            Preconditions.checkNotNull(range);
            throw new IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }

        @Override // com.google.common.collect.RangeMap
        public void remove(Range range) {
            Preconditions.checkNotNull(range);
        }

        @Override // com.google.common.collect.RangeMap
        public Range span() {
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.RangeMap
        public RangeMap subRangeMap(Range range) {
            Preconditions.checkNotNull(range);
            return this;
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeMap$b */
    /* loaded from: classes4.dex */
    public final class C7918b extends Maps.AbstractC7781x {

        /* renamed from: a */
        public final Iterable f53617a;

        public C7918b(Iterable iterable) {
            this.f53617a = iterable;
        }

        @Override // com.google.common.collect.Maps.AbstractC7781x
        /* renamed from: a */
        public Iterator mo40388a() {
            return this.f53617a.iterator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            if (obj instanceof Range) {
                Range range = (Range) obj;
                C7919c c7919c = (C7919c) TreeRangeMap.this.f53616a.get(range.lowerBound);
                if (c7919c != null && c7919c.getKey().equals(range)) {
                    return c7919c.getValue();
                }
                return null;
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return TreeRangeMap.this.f53616a.size();
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeMap$c */
    /* loaded from: classes4.dex */
    public static final class C7919c extends AbstractC1646X {

        /* renamed from: a */
        public final Range f53619a;

        /* renamed from: b */
        public final Object f53620b;

        public C7919c(Cut cut, Cut cut2, Object obj) {
            this(Range.create(cut, cut2), obj);
        }

        /* renamed from: a */
        public boolean m40414a(Comparable comparable) {
            return this.f53619a.contains(comparable);
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        /* renamed from: b */
        public Range getKey() {
            return this.f53619a;
        }

        /* renamed from: c */
        public Cut m40412c() {
            return this.f53619a.lowerBound;
        }

        /* renamed from: d */
        public Cut m40411d() {
            return this.f53619a.upperBound;
        }

        @Override // p000.AbstractC1646X, java.util.Map.Entry
        public Object getValue() {
            return this.f53620b;
        }

        public C7919c(Range range, Object obj) {
            this.f53619a = range;
            this.f53620b = obj;
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeMap$d */
    /* loaded from: classes4.dex */
    public class C7920d implements RangeMap {

        /* renamed from: a */
        public final Range f53621a;

        /* renamed from: com.google.common.collect.TreeRangeMap$d$a */
        /* loaded from: classes4.dex */
        public class C7921a extends C7923b {

            /* renamed from: com.google.common.collect.TreeRangeMap$d$a$a */
            /* loaded from: classes4.dex */
            public class C7922a extends AbstractIterator {

                /* renamed from: c */
                public final /* synthetic */ Iterator f53624c;

                /* renamed from: d */
                public final /* synthetic */ C7921a f53625d;

                public C7922a(C7921a c7921a, Iterator it) {
                    this.f53624c = it;
                    this.f53625d = c7921a;
                }

                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: b */
                public Map.Entry computeNext() {
                    if (this.f53624c.hasNext()) {
                        C7919c c7919c = (C7919c) this.f53624c.next();
                        if (c7919c.m40411d().compareTo((Cut) C7920d.this.f53621a.lowerBound) <= 0) {
                            return (Map.Entry) endOfData();
                        }
                        return Maps.immutableEntry(c7919c.getKey().intersection(C7920d.this.f53621a), c7919c.getValue());
                    }
                    return (Map.Entry) endOfData();
                }
            }

            public C7921a() {
                super();
            }

            @Override // com.google.common.collect.TreeRangeMap.C7920d.C7923b
            /* renamed from: b */
            public Iterator mo40407b() {
                if (C7920d.this.f53621a.isEmpty()) {
                    return Iterators.m40839e();
                }
                return new C7922a(this, TreeRangeMap.this.f53616a.headMap(C7920d.this.f53621a.upperBound, false).descendingMap().values().iterator());
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeMap$d$b */
        /* loaded from: classes4.dex */
        public class C7923b extends AbstractMap {

            /* renamed from: com.google.common.collect.TreeRangeMap$d$b$a */
            /* loaded from: classes4.dex */
            public class C7924a extends Maps.C7783y {
                public C7924a(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.Maps.C7783y, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(Object obj) {
                    if (C7923b.this.remove(obj) != null) {
                        return true;
                    }
                    return false;
                }

                @Override // com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection collection) {
                    return C7923b.this.m40406c(Predicates.compose(Predicates.not(Predicates.m41304in(collection)), Maps.m40686v()));
                }
            }

            /* renamed from: com.google.common.collect.TreeRangeMap$d$b$b */
            /* loaded from: classes4.dex */
            public class C7925b extends Maps.AbstractC7767q {
                public C7925b() {
                }

                @Override // com.google.common.collect.Maps.AbstractC7767q
                /* renamed from: a */
                public Map mo40268a() {
                    return C7923b.this;
                }

                @Override // com.google.common.collect.Maps.AbstractC7767q, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean isEmpty() {
                    return !iterator().hasNext();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator iterator() {
                    return C7923b.this.mo40407b();
                }

                @Override // com.google.common.collect.Maps.AbstractC7767q, com.google.common.collect.Sets.AbstractC7857j, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection collection) {
                    return C7923b.this.m40406c(Predicates.not(Predicates.m41304in(collection)));
                }

                @Override // com.google.common.collect.Maps.AbstractC7767q, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return Iterators.size(iterator());
                }
            }

            /* renamed from: com.google.common.collect.TreeRangeMap$d$b$c */
            /* loaded from: classes4.dex */
            public class C7926c extends AbstractIterator {

                /* renamed from: c */
                public final /* synthetic */ Iterator f53629c;

                /* renamed from: d */
                public final /* synthetic */ C7923b f53630d;

                public C7926c(C7923b c7923b, Iterator it) {
                    this.f53629c = it;
                    this.f53630d = c7923b;
                }

                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: b */
                public Map.Entry computeNext() {
                    while (this.f53629c.hasNext()) {
                        C7919c c7919c = (C7919c) this.f53629c.next();
                        if (c7919c.m40412c().compareTo((Cut) C7920d.this.f53621a.upperBound) >= 0) {
                            return (Map.Entry) endOfData();
                        }
                        if (c7919c.m40411d().compareTo((Cut) C7920d.this.f53621a.lowerBound) > 0) {
                            return Maps.immutableEntry(c7919c.getKey().intersection(C7920d.this.f53621a), c7919c.getValue());
                        }
                    }
                    return (Map.Entry) endOfData();
                }
            }

            /* renamed from: com.google.common.collect.TreeRangeMap$d$b$d */
            /* loaded from: classes4.dex */
            public class C7927d extends Maps.C7747L {
                public C7927d(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.Maps.C7747L, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection collection) {
                    return C7923b.this.m40406c(Predicates.compose(Predicates.m41304in(collection), Maps.m40711Q()));
                }

                @Override // com.google.common.collect.Maps.C7747L, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(Collection collection) {
                    return C7923b.this.m40406c(Predicates.compose(Predicates.not(Predicates.m41304in(collection)), Maps.m40711Q()));
                }
            }

            public C7923b() {
            }

            /* renamed from: b */
            public Iterator mo40407b() {
                if (!C7920d.this.f53621a.isEmpty()) {
                    return new C7926c(this, TreeRangeMap.this.f53616a.tailMap((Cut) MoreObjects.firstNonNull((Cut) TreeRangeMap.this.f53616a.floorKey(C7920d.this.f53621a.lowerBound), C7920d.this.f53621a.lowerBound), true).values().iterator());
                }
                return Iterators.m40839e();
            }

            /* renamed from: c */
            public final boolean m40406c(Predicate predicate) {
                ArrayList<Range<K>> newArrayList = Lists.newArrayList();
                for (Map.Entry entry : entrySet()) {
                    if (predicate.apply(entry)) {
                        newArrayList.add((Range) entry.getKey());
                    }
                }
                for (Range<K> range : newArrayList) {
                    TreeRangeMap.this.remove(range);
                }
                return !newArrayList.isEmpty();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                C7920d.this.clear();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(Object obj) {
                if (get(obj) != null) {
                    return true;
                }
                return false;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set entrySet() {
                return new C7925b();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Object get(Object obj) {
                C7919c c7919c;
                try {
                    if (obj instanceof Range) {
                        Range range = (Range) obj;
                        if (C7920d.this.f53621a.encloses(range) && !range.isEmpty()) {
                            if (range.lowerBound.compareTo((Cut) C7920d.this.f53621a.lowerBound) == 0) {
                                Map.Entry floorEntry = TreeRangeMap.this.f53616a.floorEntry(range.lowerBound);
                                if (floorEntry != null) {
                                    c7919c = (C7919c) floorEntry.getValue();
                                } else {
                                    c7919c = null;
                                }
                            } else {
                                c7919c = (C7919c) TreeRangeMap.this.f53616a.get(range.lowerBound);
                            }
                            if (c7919c != null && c7919c.getKey().isConnected(C7920d.this.f53621a) && c7919c.getKey().intersection(C7920d.this.f53621a).equals(range)) {
                                return c7919c.getValue();
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set keySet() {
                return new C7924a(this);
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Object remove(Object obj) {
                Object obj2 = get(obj);
                if (obj2 != null) {
                    Objects.requireNonNull(obj);
                    TreeRangeMap.this.remove((Range) obj);
                    return obj2;
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Collection values() {
                return new C7927d(this);
            }
        }

        public C7920d(Range range) {
            this.f53621a = range;
        }

        @Override // com.google.common.collect.RangeMap
        public Map asDescendingMapOfRanges() {
            return new C7921a();
        }

        @Override // com.google.common.collect.RangeMap
        public Map asMapOfRanges() {
            return new C7923b();
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
            TreeRangeMap.this.remove(this.f53621a);
        }

        @Override // com.google.common.collect.RangeMap
        public boolean equals(Object obj) {
            if (obj instanceof RangeMap) {
                return asMapOfRanges().equals(((RangeMap) obj).asMapOfRanges());
            }
            return false;
        }

        @Override // com.google.common.collect.RangeMap
        public Object get(Comparable comparable) {
            if (this.f53621a.contains(comparable)) {
                return TreeRangeMap.this.get(comparable);
            }
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public Map.Entry getEntry(Comparable comparable) {
            Map.Entry<Range<K>, V> entry;
            if (this.f53621a.contains(comparable) && (entry = TreeRangeMap.this.getEntry(comparable)) != null) {
                return Maps.immutableEntry(entry.getKey().intersection(this.f53621a), entry.getValue());
            }
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public int hashCode() {
            return asMapOfRanges().hashCode();
        }

        @Override // com.google.common.collect.RangeMap
        public void put(Range range, Object obj) {
            Preconditions.checkArgument(this.f53621a.encloses(range), "Cannot put range %s into a subRangeMap(%s)", range, this.f53621a);
            TreeRangeMap.this.put(range, obj);
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(RangeMap rangeMap) {
            if (rangeMap.asMapOfRanges().isEmpty()) {
                return;
            }
            Range<K> span = rangeMap.span();
            Preconditions.checkArgument(this.f53621a.encloses(span), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", span, this.f53621a);
            TreeRangeMap.this.putAll(rangeMap);
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(Range range, Object obj) {
            if (!TreeRangeMap.this.f53616a.isEmpty() && this.f53621a.encloses(range)) {
                put(TreeRangeMap.this.m40417e(range, Preconditions.checkNotNull(obj)).intersection(this.f53621a), obj);
            } else {
                put(range, obj);
            }
        }

        @Override // com.google.common.collect.RangeMap
        public void remove(Range range) {
            if (range.isConnected(this.f53621a)) {
                TreeRangeMap.this.remove(range.intersection(this.f53621a));
            }
        }

        @Override // com.google.common.collect.RangeMap
        public Range span() {
            Cut cut;
            Cut m40411d;
            Map.Entry floorEntry = TreeRangeMap.this.f53616a.floorEntry(this.f53621a.lowerBound);
            if (floorEntry != null && ((C7919c) floorEntry.getValue()).m40411d().compareTo((Cut) this.f53621a.lowerBound) > 0) {
                cut = this.f53621a.lowerBound;
            } else {
                cut = (Cut) TreeRangeMap.this.f53616a.ceilingKey(this.f53621a.lowerBound);
                if (cut == null || cut.compareTo((Cut) this.f53621a.upperBound) >= 0) {
                    throw new NoSuchElementException();
                }
            }
            Map.Entry lowerEntry = TreeRangeMap.this.f53616a.lowerEntry(this.f53621a.upperBound);
            if (lowerEntry != null) {
                if (((C7919c) lowerEntry.getValue()).m40411d().compareTo((Cut) this.f53621a.upperBound) >= 0) {
                    m40411d = this.f53621a.upperBound;
                } else {
                    m40411d = ((C7919c) lowerEntry.getValue()).m40411d();
                }
                return Range.create(cut, m40411d);
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.RangeMap
        public RangeMap subRangeMap(Range range) {
            if (!range.isConnected(this.f53621a)) {
                return TreeRangeMap.this.m40416f();
            }
            return TreeRangeMap.this.subRangeMap(range.intersection(this.f53621a));
        }

        @Override // com.google.common.collect.RangeMap
        public String toString() {
            return asMapOfRanges().toString();
        }
    }

    public static <K extends Comparable, V> TreeRangeMap<K, V> create() {
        return new TreeRangeMap<>();
    }

    /* renamed from: d */
    public static Range m40418d(Range range, Object obj, Map.Entry entry) {
        if (entry != null && ((C7919c) entry.getValue()).getKey().isConnected(range) && ((C7919c) entry.getValue()).getValue().equals(obj)) {
            return range.span(((C7919c) entry.getValue()).getKey());
        }
        return range;
    }

    @Override // com.google.common.collect.RangeMap
    public Map<Range<K>, V> asDescendingMapOfRanges() {
        return new C7918b(this.f53616a.descendingMap().values());
    }

    @Override // com.google.common.collect.RangeMap
    public Map<Range<K>, V> asMapOfRanges() {
        return new C7918b(this.f53616a.values());
    }

    @Override // com.google.common.collect.RangeMap
    public void clear() {
        this.f53616a.clear();
    }

    /* renamed from: e */
    public final Range m40417e(Range range, Object obj) {
        return m40418d(m40418d(range, obj, this.f53616a.lowerEntry(range.lowerBound)), obj, this.f53616a.floorEntry(range.upperBound));
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof RangeMap) {
            return asMapOfRanges().equals(((RangeMap) obj).asMapOfRanges());
        }
        return false;
    }

    /* renamed from: f */
    public final RangeMap m40416f() {
        return f53615b;
    }

    /* renamed from: g */
    public final void m40415g(Cut cut, Cut cut2, Object obj) {
        this.f53616a.put(cut, new C7919c(cut, cut2, obj));
    }

    @Override // com.google.common.collect.RangeMap
    @CheckForNull
    public V get(K k) {
        Map.Entry<Range<K>, V> entry = getEntry(k);
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    @Override // com.google.common.collect.RangeMap
    @CheckForNull
    public Map.Entry<Range<K>, V> getEntry(K k) {
        Map.Entry floorEntry = this.f53616a.floorEntry(Cut.belowValue(k));
        if (floorEntry != null && ((C7919c) floorEntry.getValue()).m40414a(k)) {
            return (Map.Entry) floorEntry.getValue();
        }
        return null;
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Override // com.google.common.collect.RangeMap
    public void put(Range<K> range, V v) {
        if (!range.isEmpty()) {
            Preconditions.checkNotNull(v);
            remove(range);
            this.f53616a.put(range.lowerBound, new C7919c(range, v));
        }
    }

    @Override // com.google.common.collect.RangeMap
    public void putAll(RangeMap<K, ? extends V> rangeMap) {
        for (Map.Entry<Range<K>, ? extends V> entry : rangeMap.asMapOfRanges().entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.RangeMap
    public void putCoalescing(Range<K> range, V v) {
        if (this.f53616a.isEmpty()) {
            put(range, v);
        } else {
            put(m40417e(range, Preconditions.checkNotNull(v)), v);
        }
    }

    @Override // com.google.common.collect.RangeMap
    public void remove(Range<K> range) {
        if (range.isEmpty()) {
            return;
        }
        Map.Entry lowerEntry = this.f53616a.lowerEntry(range.lowerBound);
        if (lowerEntry != null) {
            C7919c c7919c = (C7919c) lowerEntry.getValue();
            if (c7919c.m40411d().compareTo((Cut) range.lowerBound) > 0) {
                if (c7919c.m40411d().compareTo((Cut) range.upperBound) > 0) {
                    m40415g(range.upperBound, c7919c.m40411d(), ((C7919c) lowerEntry.getValue()).getValue());
                }
                m40415g(c7919c.m40412c(), range.lowerBound, ((C7919c) lowerEntry.getValue()).getValue());
            }
        }
        Map.Entry lowerEntry2 = this.f53616a.lowerEntry(range.upperBound);
        if (lowerEntry2 != null) {
            C7919c c7919c2 = (C7919c) lowerEntry2.getValue();
            if (c7919c2.m40411d().compareTo((Cut) range.upperBound) > 0) {
                m40415g(range.upperBound, c7919c2.m40411d(), ((C7919c) lowerEntry2.getValue()).getValue());
            }
        }
        this.f53616a.subMap(range.lowerBound, range.upperBound).clear();
    }

    @Override // com.google.common.collect.RangeMap
    public Range<K> span() {
        Map.Entry firstEntry = this.f53616a.firstEntry();
        Map.Entry lastEntry = this.f53616a.lastEntry();
        if (firstEntry != null && lastEntry != null) {
            return Range.create(((C7919c) firstEntry.getValue()).getKey().lowerBound, ((C7919c) lastEntry.getValue()).getKey().upperBound);
        }
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.RangeMap
    public RangeMap<K, V> subRangeMap(Range<K> range) {
        if (range.equals(Range.all())) {
            return this;
        }
        return new C7920d(range);
    }

    @Override // com.google.common.collect.RangeMap
    public String toString() {
        return this.f53616a.values().toString();
    }
}
