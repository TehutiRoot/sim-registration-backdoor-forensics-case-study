package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.CheckForNull;

@GwtIncompatible
/* loaded from: classes4.dex */
public class TreeRangeSet<C extends Comparable<?>> extends AbstractC12411o0 implements Serializable {
    @CheckForNull
    @LazyInit
    private transient Set<Range<C>> asDescendingSetOfRanges;
    @CheckForNull
    @LazyInit
    private transient Set<Range<C>> asRanges;
    @CheckForNull
    @LazyInit
    private transient RangeSet<C> complement;
    @VisibleForTesting
    final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;

    /* loaded from: classes4.dex */
    public final class Complement extends TreeRangeSet<C> {
        public Complement() {
            super(new C7930c(TreeRangeSet.this.rangesByLowerBound));
        }

        @Override // com.google.common.collect.TreeRangeSet, p000.AbstractC12411o0, com.google.common.collect.RangeSet
        public void add(Range<C> range) {
            TreeRangeSet.this.remove(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public RangeSet<C> complement() {
            return TreeRangeSet.this;
        }

        @Override // com.google.common.collect.TreeRangeSet, p000.AbstractC12411o0, com.google.common.collect.RangeSet
        public boolean contains(C c) {
            return !TreeRangeSet.this.contains(c);
        }

        @Override // com.google.common.collect.TreeRangeSet, p000.AbstractC12411o0, com.google.common.collect.RangeSet
        public void remove(Range<C> range) {
            TreeRangeSet.this.add(range);
        }
    }

    /* loaded from: classes4.dex */
    public final class SubRangeSet extends TreeRangeSet<C> {
        private final Range<C> restriction;

        public SubRangeSet(Range<C> range) {
            super(new C7936e(Range.all(), range, TreeRangeSet.this.rangesByLowerBound));
            this.restriction = range;
        }

        @Override // com.google.common.collect.TreeRangeSet, p000.AbstractC12411o0, com.google.common.collect.RangeSet
        public void add(Range<C> range) {
            Preconditions.checkArgument(this.restriction.encloses(range), "Cannot add range %s to subRangeSet(%s)", range, this.restriction);
            TreeRangeSet.this.add(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, p000.AbstractC12411o0, com.google.common.collect.RangeSet
        public void clear() {
            TreeRangeSet.this.remove(this.restriction);
        }

        @Override // com.google.common.collect.TreeRangeSet, p000.AbstractC12411o0, com.google.common.collect.RangeSet
        public boolean contains(C c) {
            if (this.restriction.contains(c) && TreeRangeSet.this.contains(c)) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.TreeRangeSet, p000.AbstractC12411o0, com.google.common.collect.RangeSet
        public boolean encloses(Range<C> range) {
            Range rangeEnclosing;
            if (this.restriction.isEmpty() || !this.restriction.encloses(range) || (rangeEnclosing = TreeRangeSet.this.rangeEnclosing(range)) == null || rangeEnclosing.intersection(this.restriction).isEmpty()) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.TreeRangeSet, p000.AbstractC12411o0, com.google.common.collect.RangeSet
        @CheckForNull
        public Range<C> rangeContaining(C c) {
            Range<C> rangeContaining;
            if (!this.restriction.contains(c) || (rangeContaining = TreeRangeSet.this.rangeContaining(c)) == null) {
                return null;
            }
            return rangeContaining.intersection(this.restriction);
        }

        @Override // com.google.common.collect.TreeRangeSet, p000.AbstractC12411o0, com.google.common.collect.RangeSet
        public void remove(Range<C> range) {
            if (range.isConnected(this.restriction)) {
                TreeRangeSet.this.remove(range.intersection(this.restriction));
            }
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public RangeSet<C> subRangeSet(Range<C> range) {
            if (range.encloses(this.restriction)) {
                return this;
            }
            if (range.isConnected(this.restriction)) {
                return new SubRangeSet(this.restriction.intersection(range));
            }
            return ImmutableRangeSet.m40936of();
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$b */
    /* loaded from: classes4.dex */
    public final class C7929b extends ForwardingCollection implements Set {

        /* renamed from: a */
        public final Collection f53632a;

        public C7929b(Collection collection) {
            this.f53632a = collection;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.m40548a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m40547b(this);
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection delegate() {
            return this.f53632a;
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$c */
    /* loaded from: classes4.dex */
    public static final class C7930c extends AbstractC7954c {

        /* renamed from: a */
        public final NavigableMap f53634a;

        /* renamed from: b */
        public final NavigableMap f53635b;

        /* renamed from: c */
        public final Range f53636c;

        /* renamed from: com.google.common.collect.TreeRangeSet$c$a */
        /* loaded from: classes4.dex */
        public class C7931a extends AbstractIterator {

            /* renamed from: c */
            public Cut f53637c;

            /* renamed from: d */
            public final /* synthetic */ Cut f53638d;

            /* renamed from: e */
            public final /* synthetic */ PeekingIterator f53639e;

            /* renamed from: f */
            public final /* synthetic */ C7930c f53640f;

            public C7931a(C7930c c7930c, Cut cut, PeekingIterator peekingIterator) {
                this.f53638d = cut;
                this.f53639e = peekingIterator;
                this.f53640f = c7930c;
                this.f53637c = cut;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: b */
            public Map.Entry computeNext() {
                Range create;
                if (!this.f53640f.f53636c.upperBound.isLessThan(this.f53637c) && this.f53637c != Cut.aboveAll()) {
                    if (this.f53639e.hasNext()) {
                        Range range = (Range) this.f53639e.next();
                        create = Range.create(this.f53637c, range.lowerBound);
                        this.f53637c = range.upperBound;
                    } else {
                        create = Range.create(this.f53637c, Cut.aboveAll());
                        this.f53637c = Cut.aboveAll();
                    }
                    return Maps.immutableEntry(create.lowerBound, create);
                }
                return (Map.Entry) endOfData();
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$c$b */
        /* loaded from: classes4.dex */
        public class C7932b extends AbstractIterator {

            /* renamed from: c */
            public Cut f53641c;

            /* renamed from: d */
            public final /* synthetic */ Cut f53642d;

            /* renamed from: e */
            public final /* synthetic */ PeekingIterator f53643e;

            /* renamed from: f */
            public final /* synthetic */ C7930c f53644f;

            public C7932b(C7930c c7930c, Cut cut, PeekingIterator peekingIterator) {
                this.f53642d = cut;
                this.f53643e = peekingIterator;
                this.f53644f = c7930c;
                this.f53641c = cut;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: b */
            public Map.Entry computeNext() {
                if (this.f53641c == Cut.belowAll()) {
                    return (Map.Entry) endOfData();
                }
                if (this.f53643e.hasNext()) {
                    Range range = (Range) this.f53643e.next();
                    Range create = Range.create(range.upperBound, this.f53641c);
                    this.f53641c = range.lowerBound;
                    if (this.f53644f.f53636c.lowerBound.isLessThan(create.lowerBound)) {
                        return Maps.immutableEntry(create.lowerBound, create);
                    }
                } else if (this.f53644f.f53636c.lowerBound.isLessThan(Cut.belowAll())) {
                    Range create2 = Range.create(Cut.belowAll(), this.f53641c);
                    this.f53641c = Cut.belowAll();
                    return Maps.immutableEntry(Cut.belowAll(), create2);
                }
                return (Map.Entry) endOfData();
            }
        }

        public C7930c(NavigableMap navigableMap) {
            this(navigableMap, Range.all());
        }

        @Override // com.google.common.collect.Maps.AbstractC7781x
        /* renamed from: a */
        public Iterator mo40388a() {
            Collection values;
            Cut cut;
            boolean z;
            if (this.f53636c.hasLowerBound()) {
                NavigableMap navigableMap = this.f53635b;
                Cut cut2 = (Cut) this.f53636c.lowerEndpoint();
                if (this.f53636c.lowerBoundType() == BoundType.CLOSED) {
                    z = true;
                } else {
                    z = false;
                }
                values = navigableMap.tailMap(cut2, z).values();
            } else {
                values = this.f53635b.values();
            }
            PeekingIterator peekingIterator = Iterators.peekingIterator(values.iterator());
            if (this.f53636c.contains(Cut.belowAll()) && (!peekingIterator.hasNext() || ((Range) peekingIterator.peek()).lowerBound != Cut.belowAll())) {
                cut = Cut.belowAll();
            } else if (peekingIterator.hasNext()) {
                cut = ((Range) peekingIterator.next()).upperBound;
            } else {
                return Iterators.m40839e();
            }
            return new C7931a(this, cut, peekingIterator);
        }

        @Override // com.google.common.collect.AbstractC7954c
        /* renamed from: b */
        public Iterator mo40371b() {
            Cut aboveAll;
            boolean z;
            Object obj;
            if (this.f53636c.hasUpperBound()) {
                aboveAll = (Cut) this.f53636c.upperEndpoint();
            } else {
                aboveAll = Cut.aboveAll();
            }
            if (this.f53636c.hasUpperBound() && this.f53636c.upperBoundType() == BoundType.CLOSED) {
                z = true;
            } else {
                z = false;
            }
            PeekingIterator peekingIterator = Iterators.peekingIterator(this.f53635b.headMap(aboveAll, z).descendingMap().values().iterator());
            if (peekingIterator.hasNext()) {
                if (((Range) peekingIterator.peek()).upperBound == Cut.aboveAll()) {
                    obj = ((Range) peekingIterator.next()).lowerBound;
                } else {
                    obj = (Cut) this.f53634a.higherKey(((Range) peekingIterator.peek()).upperBound);
                }
            } else if (this.f53636c.contains(Cut.belowAll()) && !this.f53634a.containsKey(Cut.belowAll())) {
                obj = (Cut) this.f53634a.higherKey(Cut.belowAll());
            } else {
                return Iterators.m40839e();
            }
            return new C7932b(this, (Cut) MoreObjects.firstNonNull(obj, Cut.aboveAll()), peekingIterator);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: e */
        public Range get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    Map.Entry firstEntry = tailMap(cut, true).firstEntry();
                    if (firstEntry != null && ((Cut) firstEntry.getKey()).equals(cut)) {
                        return (Range) firstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* renamed from: f */
        public NavigableMap headMap(Cut cut, boolean z) {
            return m40400h(Range.upTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: g */
        public NavigableMap subMap(Cut cut, boolean z, Cut cut2, boolean z2) {
            return m40400h(Range.range(cut, BoundType.forBoolean(z), cut2, BoundType.forBoolean(z2)));
        }

        /* renamed from: h */
        public final NavigableMap m40400h(Range range) {
            if (!this.f53636c.isConnected(range)) {
                return ImmutableSortedMap.m40913of();
            }
            return new C7930c(this.f53634a, range.intersection(this.f53636c));
        }

        @Override // java.util.NavigableMap
        /* renamed from: i */
        public NavigableMap tailMap(Cut cut, boolean z) {
            return m40400h(Range.downTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.size(mo40388a());
        }

        public C7930c(NavigableMap navigableMap, Range range) {
            this.f53634a = navigableMap;
            this.f53635b = new C7933d(navigableMap);
            this.f53636c = range;
        }
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$e */
    /* loaded from: classes4.dex */
    public static final class C7936e extends AbstractC7954c {

        /* renamed from: a */
        public final Range f53651a;

        /* renamed from: b */
        public final Range f53652b;

        /* renamed from: c */
        public final NavigableMap f53653c;

        /* renamed from: d */
        public final NavigableMap f53654d;

        /* renamed from: com.google.common.collect.TreeRangeSet$e$a */
        /* loaded from: classes4.dex */
        public class C7937a extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Iterator f53655c;

            /* renamed from: d */
            public final /* synthetic */ Cut f53656d;

            /* renamed from: e */
            public final /* synthetic */ C7936e f53657e;

            public C7937a(C7936e c7936e, Iterator it, Cut cut) {
                this.f53655c = it;
                this.f53656d = cut;
                this.f53657e = c7936e;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: b */
            public Map.Entry computeNext() {
                if (!this.f53655c.hasNext()) {
                    return (Map.Entry) endOfData();
                }
                Range range = (Range) this.f53655c.next();
                if (this.f53656d.isLessThan(range.lowerBound)) {
                    return (Map.Entry) endOfData();
                }
                Range intersection = range.intersection(this.f53657e.f53652b);
                return Maps.immutableEntry(intersection.lowerBound, intersection);
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$e$b */
        /* loaded from: classes4.dex */
        public class C7938b extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Iterator f53658c;

            /* renamed from: d */
            public final /* synthetic */ C7936e f53659d;

            public C7938b(C7936e c7936e, Iterator it) {
                this.f53658c = it;
                this.f53659d = c7936e;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: b */
            public Map.Entry computeNext() {
                if (!this.f53658c.hasNext()) {
                    return (Map.Entry) endOfData();
                }
                Range range = (Range) this.f53658c.next();
                if (this.f53659d.f53652b.lowerBound.compareTo((Cut) range.upperBound) >= 0) {
                    return (Map.Entry) endOfData();
                }
                Range intersection = range.intersection(this.f53659d.f53652b);
                if (this.f53659d.f53651a.contains(intersection.lowerBound)) {
                    return Maps.immutableEntry(intersection.lowerBound, intersection);
                }
                return (Map.Entry) endOfData();
            }
        }

        /* renamed from: i */
        private NavigableMap m40382i(Range range) {
            if (!range.isConnected(this.f53651a)) {
                return ImmutableSortedMap.m40913of();
            }
            return new C7936e(this.f53651a.intersection(range), this.f53652b, this.f53653c);
        }

        @Override // com.google.common.collect.Maps.AbstractC7781x
        /* renamed from: a */
        public Iterator mo40388a() {
            Iterator it;
            if (this.f53652b.isEmpty()) {
                return Iterators.m40839e();
            }
            if (this.f53651a.upperBound.isLessThan(this.f53652b.lowerBound)) {
                return Iterators.m40839e();
            }
            boolean z = false;
            if (this.f53651a.lowerBound.isLessThan(this.f53652b.lowerBound)) {
                it = this.f53654d.tailMap(this.f53652b.lowerBound, false).values().iterator();
            } else {
                NavigableMap navigableMap = this.f53653c;
                Cut cut = (Cut) this.f53651a.lowerBound.endpoint();
                if (this.f53651a.lowerBoundType() == BoundType.CLOSED) {
                    z = true;
                }
                it = navigableMap.tailMap(cut, z).values().iterator();
            }
            return new C7937a(this, it, (Cut) Ordering.natural().min(this.f53651a.upperBound, Cut.belowValue(this.f53652b.upperBound)));
        }

        @Override // com.google.common.collect.AbstractC7954c
        /* renamed from: b */
        public Iterator mo40371b() {
            boolean z;
            if (this.f53652b.isEmpty()) {
                return Iterators.m40839e();
            }
            Cut cut = (Cut) Ordering.natural().min(this.f53651a.upperBound, Cut.belowValue(this.f53652b.upperBound));
            NavigableMap navigableMap = this.f53653c;
            Cut cut2 = (Cut) cut.endpoint();
            if (cut.typeAsUpperBound() == BoundType.CLOSED) {
                z = true;
            } else {
                z = false;
            }
            return new C7938b(this, navigableMap.headMap(cut2, z).descendingMap().values().iterator());
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: f */
        public Range get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    if (this.f53651a.contains(cut) && cut.compareTo((Cut) this.f53652b.lowerBound) >= 0 && cut.compareTo((Cut) this.f53652b.upperBound) < 0) {
                        if (cut.equals(this.f53652b.lowerBound)) {
                            Range range = (Range) Maps.m40709S(this.f53653c.floorEntry(cut));
                            if (range != null && range.upperBound.compareTo((Cut) this.f53652b.lowerBound) > 0) {
                                return range.intersection(this.f53652b);
                            }
                        } else {
                            Range range2 = (Range) this.f53653c.get(cut);
                            if (range2 != null) {
                                return range2.intersection(this.f53652b);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* renamed from: g */
        public NavigableMap headMap(Cut cut, boolean z) {
            return m40382i(Range.upTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: h */
        public NavigableMap subMap(Cut cut, boolean z, Cut cut2, boolean z2) {
            return m40382i(Range.range(cut, BoundType.forBoolean(z), cut2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: j */
        public NavigableMap tailMap(Cut cut, boolean z) {
            return m40382i(Range.downTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.size(mo40388a());
        }

        public C7936e(Range range, Range range2, NavigableMap navigableMap) {
            this.f53651a = (Range) Preconditions.checkNotNull(range);
            this.f53652b = (Range) Preconditions.checkNotNull(range2);
            this.f53653c = (NavigableMap) Preconditions.checkNotNull(navigableMap);
            this.f53654d = new C7933d(navigableMap);
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
        return new TreeRangeSet<>(new TreeMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public Range<C> rangeEnclosing(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry<Cut<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        if (floorEntry != null && floorEntry.getValue().encloses(range)) {
            return floorEntry.getValue();
        }
        return null;
    }

    private void replaceRangeWithSameLowerBound(Range<C> range) {
        if (range.isEmpty()) {
            this.rangesByLowerBound.remove(range.lowerBound);
        } else {
            this.rangesByLowerBound.put(range.lowerBound, range);
        }
    }

    @Override // p000.AbstractC12411o0, com.google.common.collect.RangeSet
    public void add(Range<C> range) {
        Preconditions.checkNotNull(range);
        if (range.isEmpty()) {
            return;
        }
        Cut<C> cut = range.lowerBound;
        Cut<C> cut2 = range.upperBound;
        Map.Entry<Cut<C>, Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(cut);
        if (lowerEntry != null) {
            Range<C> value = lowerEntry.getValue();
            if (value.upperBound.compareTo(cut) >= 0) {
                if (value.upperBound.compareTo(cut2) >= 0) {
                    cut2 = value.upperBound;
                }
                cut = value.lowerBound;
            }
        }
        Map.Entry<Cut<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(cut2);
        if (floorEntry != null) {
            Range<C> value2 = floorEntry.getValue();
            if (value2.upperBound.compareTo(cut2) >= 0) {
                cut2 = value2.upperBound;
            }
        }
        this.rangesByLowerBound.subMap(cut, cut2).clear();
        replaceRangeWithSameLowerBound(Range.create(cut, cut2));
    }

    @Override // p000.AbstractC12411o0, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(RangeSet rangeSet) {
        super.addAll(rangeSet);
    }

    @Override // com.google.common.collect.RangeSet
    public Set<Range<C>> asDescendingSetOfRanges() {
        Set<Range<C>> set = this.asDescendingSetOfRanges;
        if (set == null) {
            C7929b c7929b = new C7929b(this.rangesByLowerBound.descendingMap().values());
            this.asDescendingSetOfRanges = c7929b;
            return c7929b;
        }
        return set;
    }

    @Override // com.google.common.collect.RangeSet
    public Set<Range<C>> asRanges() {
        Set<Range<C>> set = this.asRanges;
        if (set == null) {
            C7929b c7929b = new C7929b(this.rangesByLowerBound.values());
            this.asRanges = c7929b;
            return c7929b;
        }
        return set;
    }

    @Override // p000.AbstractC12411o0, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.RangeSet
    public RangeSet<C> complement() {
        RangeSet<C> rangeSet = this.complement;
        if (rangeSet == null) {
            Complement complement = new Complement();
            this.complement = complement;
            return complement;
        }
        return rangeSet;
    }

    @Override // p000.AbstractC12411o0, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    @Override // p000.AbstractC12411o0, com.google.common.collect.RangeSet
    public boolean encloses(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry<Cut<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.lowerBound);
        if (floorEntry != null && floorEntry.getValue().encloses(range)) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC12411o0, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(RangeSet rangeSet) {
        return super.enclosesAll(rangeSet);
    }

    @Override // p000.AbstractC12411o0, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.RangeSet
    public boolean intersects(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry<Cut<C>, Range<C>> ceilingEntry = this.rangesByLowerBound.ceilingEntry(range.lowerBound);
        if (ceilingEntry != null && ceilingEntry.getValue().isConnected(range) && !ceilingEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        Map.Entry<Cut<C>, Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        if (lowerEntry != null && lowerEntry.getValue().isConnected(range) && !lowerEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC12411o0, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // p000.AbstractC12411o0, com.google.common.collect.RangeSet
    @CheckForNull
    public Range<C> rangeContaining(C c) {
        Preconditions.checkNotNull(c);
        Map.Entry<Cut<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(Cut.belowValue(c));
        if (floorEntry != null && floorEntry.getValue().contains(c)) {
            return floorEntry.getValue();
        }
        return null;
    }

    @Override // p000.AbstractC12411o0, com.google.common.collect.RangeSet
    public void remove(Range<C> range) {
        Preconditions.checkNotNull(range);
        if (range.isEmpty()) {
            return;
        }
        Map.Entry<Cut<C>, Range<C>> lowerEntry = this.rangesByLowerBound.lowerEntry(range.lowerBound);
        if (lowerEntry != null) {
            Range<C> value = lowerEntry.getValue();
            if (value.upperBound.compareTo(range.lowerBound) >= 0) {
                if (range.hasUpperBound() && value.upperBound.compareTo(range.upperBound) >= 0) {
                    replaceRangeWithSameLowerBound(Range.create(range.upperBound, value.upperBound));
                }
                replaceRangeWithSameLowerBound(Range.create(value.lowerBound, range.lowerBound));
            }
        }
        Map.Entry<Cut<C>, Range<C>> floorEntry = this.rangesByLowerBound.floorEntry(range.upperBound);
        if (floorEntry != null) {
            Range<C> value2 = floorEntry.getValue();
            if (range.hasUpperBound() && value2.upperBound.compareTo(range.upperBound) >= 0) {
                replaceRangeWithSameLowerBound(Range.create(range.upperBound, value2.upperBound));
            }
        }
        this.rangesByLowerBound.subMap(range.lowerBound, range.upperBound).clear();
    }

    @Override // p000.AbstractC12411o0, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(RangeSet rangeSet) {
        super.removeAll(rangeSet);
    }

    @Override // com.google.common.collect.RangeSet
    public Range<C> span() {
        Map.Entry<Cut<C>, Range<C>> firstEntry = this.rangesByLowerBound.firstEntry();
        Map.Entry<Cut<C>, Range<C>> lastEntry = this.rangesByLowerBound.lastEntry();
        if (firstEntry != null && lastEntry != null) {
            return Range.create(firstEntry.getValue().lowerBound, lastEntry.getValue().upperBound);
        }
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.RangeSet
    public RangeSet<C> subRangeSet(Range<C> range) {
        if (range.equals(Range.all())) {
            return this;
        }
        return new SubRangeSet(range);
    }

    private TreeRangeSet(NavigableMap<Cut<C>, Range<C>> navigableMap) {
        this.rangesByLowerBound = navigableMap;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(RangeSet<C> rangeSet) {
        TreeRangeSet<C> create = create();
        create.addAll(rangeSet);
        return create;
    }

    @Override // p000.AbstractC12411o0, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
        super.addAll(iterable);
    }

    @Override // p000.AbstractC12411o0, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // p000.AbstractC12411o0, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
        super.removeAll(iterable);
    }

    /* renamed from: com.google.common.collect.TreeRangeSet$d */
    /* loaded from: classes4.dex */
    public static final class C7933d extends AbstractC7954c {

        /* renamed from: a */
        public final NavigableMap f53645a;

        /* renamed from: b */
        public final Range f53646b;

        /* renamed from: com.google.common.collect.TreeRangeSet$d$a */
        /* loaded from: classes4.dex */
        public class C7934a extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Iterator f53647c;

            /* renamed from: d */
            public final /* synthetic */ C7933d f53648d;

            public C7934a(C7933d c7933d, Iterator it) {
                this.f53647c = it;
                this.f53648d = c7933d;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: b */
            public Map.Entry computeNext() {
                if (!this.f53647c.hasNext()) {
                    return (Map.Entry) endOfData();
                }
                Range range = (Range) this.f53647c.next();
                if (this.f53648d.f53646b.upperBound.isLessThan(range.upperBound)) {
                    return (Map.Entry) endOfData();
                }
                return Maps.immutableEntry(range.upperBound, range);
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$d$b */
        /* loaded from: classes4.dex */
        public class C7935b extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ PeekingIterator f53649c;

            /* renamed from: d */
            public final /* synthetic */ C7933d f53650d;

            public C7935b(C7933d c7933d, PeekingIterator peekingIterator) {
                this.f53649c = peekingIterator;
                this.f53650d = c7933d;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: b */
            public Map.Entry computeNext() {
                if (!this.f53649c.hasNext()) {
                    return (Map.Entry) endOfData();
                }
                Range range = (Range) this.f53649c.next();
                if (this.f53650d.f53646b.lowerBound.isLessThan(range.upperBound)) {
                    return Maps.immutableEntry(range.upperBound, range);
                }
                return (Map.Entry) endOfData();
            }
        }

        public C7933d(NavigableMap navigableMap) {
            this.f53645a = navigableMap;
            this.f53646b = Range.all();
        }

        /* renamed from: h */
        private NavigableMap m40392h(Range range) {
            if (range.isConnected(this.f53646b)) {
                return new C7933d(this.f53645a, range.intersection(this.f53646b));
            }
            return ImmutableSortedMap.m40913of();
        }

        @Override // com.google.common.collect.Maps.AbstractC7781x
        /* renamed from: a */
        public Iterator mo40388a() {
            Iterator it;
            if (!this.f53646b.hasLowerBound()) {
                it = this.f53645a.values().iterator();
            } else {
                Map.Entry lowerEntry = this.f53645a.lowerEntry((Cut) this.f53646b.lowerEndpoint());
                if (lowerEntry == null) {
                    it = this.f53645a.values().iterator();
                } else if (this.f53646b.lowerBound.isLessThan(((Range) lowerEntry.getValue()).upperBound)) {
                    it = this.f53645a.tailMap((Cut) lowerEntry.getKey(), true).values().iterator();
                } else {
                    it = this.f53645a.tailMap((Cut) this.f53646b.lowerEndpoint(), true).values().iterator();
                }
            }
            return new C7934a(this, it);
        }

        @Override // com.google.common.collect.AbstractC7954c
        /* renamed from: b */
        public Iterator mo40371b() {
            Collection values;
            if (this.f53646b.hasUpperBound()) {
                values = this.f53645a.headMap((Cut) this.f53646b.upperEndpoint(), false).descendingMap().values();
            } else {
                values = this.f53645a.descendingMap().values();
            }
            PeekingIterator peekingIterator = Iterators.peekingIterator(values.iterator());
            if (peekingIterator.hasNext() && this.f53646b.upperBound.isLessThan(((Range) peekingIterator.peek()).upperBound)) {
                peekingIterator.next();
            }
            return new C7935b(this, peekingIterator);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: e */
        public Range get(Object obj) {
            Map.Entry lowerEntry;
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    if (this.f53646b.contains(cut) && (lowerEntry = this.f53645a.lowerEntry(cut)) != null && ((Range) lowerEntry.getValue()).upperBound.equals(cut)) {
                        return (Range) lowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* renamed from: f */
        public NavigableMap headMap(Cut cut, boolean z) {
            return m40392h(Range.upTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: g */
        public NavigableMap subMap(Cut cut, boolean z, Cut cut2, boolean z2) {
            return m40392h(Range.range(cut, BoundType.forBoolean(z), cut2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: i */
        public NavigableMap tailMap(Cut cut, boolean z) {
            return m40392h(Range.downTo(cut, BoundType.forBoolean(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            if (this.f53646b.equals(Range.all())) {
                return this.f53645a.isEmpty();
            }
            if (!mo40388a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            if (this.f53646b.equals(Range.all())) {
                return this.f53645a.size();
            }
            return Iterators.size(mo40388a());
        }

        public C7933d(NavigableMap navigableMap, Range range) {
            this.f53645a = navigableMap;
            this.f53646b = range;
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> iterable) {
        TreeRangeSet<C> create = create();
        create.addAll(iterable);
        return create;
    }
}
