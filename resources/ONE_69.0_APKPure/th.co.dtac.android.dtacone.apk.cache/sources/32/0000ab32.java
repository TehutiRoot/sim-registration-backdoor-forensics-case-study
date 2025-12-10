package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class TreeMultiset<E> extends AbstractC7946d implements Serializable {
    @J2ktIncompatible
    @GwtIncompatible
    private static final long serialVersionUID = 1;
    private final transient C7904e header;
    private final transient GeneralRange<E> range;
    private final transient C7905f rootReference;

    /* loaded from: classes4.dex */
    public enum Aggregate {
        SIZE { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(C7904e c7904e) {
                return c7904e.f53618b;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(@CheckForNull C7904e c7904e) {
                if (c7904e != null) {
                    return c7904e.f53620d;
                }
                return 0L;
            }
        },
        DISTINCT { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(C7904e c7904e) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(@CheckForNull C7904e c7904e) {
                if (c7904e == null) {
                    return 0L;
                }
                return c7904e.f53619c;
            }
        };

        public abstract int nodeAggregate(C7904e c7904e);

        public abstract long treeAggregate(@CheckForNull C7904e c7904e);

        /* synthetic */ Aggregate(C7900a c7900a) {
            this();
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$a */
    /* loaded from: classes4.dex */
    public class C7900a extends Multisets.AbstractC7809f {

        /* renamed from: a */
        public final /* synthetic */ C7904e f53608a;

        /* renamed from: b */
        public final /* synthetic */ TreeMultiset f53609b;

        public C7900a(TreeMultiset treeMultiset, C7904e c7904e) {
            this.f53608a = c7904e;
            this.f53609b = treeMultiset;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            int m40417w = this.f53608a.m40417w();
            if (m40417w == 0) {
                return this.f53609b.count(getElement());
            }
            return m40417w;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public Object getElement() {
            return this.f53608a.m40416x();
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$b */
    /* loaded from: classes4.dex */
    public class C7901b implements Iterator {

        /* renamed from: a */
        public C7904e f53610a;

        /* renamed from: b */
        public Multiset.Entry f53611b;

        public C7901b() {
            this.f53610a = TreeMultiset.this.firstNode();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Multiset.Entry next() {
            if (hasNext()) {
                TreeMultiset treeMultiset = TreeMultiset.this;
                C7904e c7904e = this.f53610a;
                Objects.requireNonNull(c7904e);
                Multiset.Entry wrapEntry = treeMultiset.wrapEntry(c7904e);
                this.f53611b = wrapEntry;
                if (this.f53610a.m40441L() == TreeMultiset.this.header) {
                    this.f53610a = null;
                } else {
                    this.f53610a = this.f53610a.m40441L();
                }
                return wrapEntry;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53610a == null) {
                return false;
            }
            if (TreeMultiset.this.range.tooHigh(this.f53610a.m40416x())) {
                this.f53610a = null;
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.f53611b != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "no calls to next() since the last call to remove()");
            TreeMultiset.this.setCount(this.f53611b.getElement(), 0);
            this.f53611b = null;
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$c */
    /* loaded from: classes4.dex */
    public class C7902c implements Iterator {

        /* renamed from: a */
        public C7904e f53613a;

        /* renamed from: b */
        public Multiset.Entry f53614b = null;

        public C7902c() {
            this.f53613a = TreeMultiset.this.lastNode();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Multiset.Entry next() {
            if (hasNext()) {
                Objects.requireNonNull(this.f53613a);
                Multiset.Entry wrapEntry = TreeMultiset.this.wrapEntry(this.f53613a);
                this.f53614b = wrapEntry;
                if (this.f53613a.m40414z() == TreeMultiset.this.header) {
                    this.f53613a = null;
                } else {
                    this.f53613a = this.f53613a.m40414z();
                }
                return wrapEntry;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53613a == null) {
                return false;
            }
            if (TreeMultiset.this.range.tooLow(this.f53613a.m40416x())) {
                this.f53613a = null;
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.f53614b != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "no calls to next() since the last call to remove()");
            TreeMultiset.this.setCount(this.f53614b.getElement(), 0);
            this.f53614b = null;
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$d */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C7903d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53616a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f53616a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53616a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$f */
    /* loaded from: classes4.dex */
    public static final class C7905f {

        /* renamed from: a */
        public Object f53626a;

        public C7905f() {
        }

        /* renamed from: a */
        public void m40413a(Object obj, Object obj2) {
            if (this.f53626a == obj) {
                this.f53626a = obj2;
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        public void m40412b() {
            this.f53626a = null;
        }

        /* renamed from: c */
        public Object m40411c() {
            return this.f53626a;
        }

        public /* synthetic */ C7905f(C7900a c7900a) {
            this();
        }
    }

    public TreeMultiset(C7905f c7905f, GeneralRange<E> generalRange, C7904e c7904e) {
        super(generalRange.comparator());
        this.rootReference = c7905f;
        this.range = generalRange;
        this.header = c7904e;
    }

    private long aggregateAboveRange(Aggregate aggregate, @CheckForNull C7904e c7904e) {
        long treeAggregate;
        long aggregateAboveRange;
        if (c7904e == null) {
            return 0L;
        }
        int compare = comparator().compare(AbstractC22494uJ0.m1205a(this.range.getUpperEndpoint()), c7904e.m40416x());
        if (compare > 0) {
            return aggregateAboveRange(aggregate, c7904e.f53623g);
        }
        if (compare == 0) {
            int i = C7903d.f53616a[this.range.getUpperBoundType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return aggregate.treeAggregate(c7904e.f53623g);
                }
                throw new AssertionError();
            }
            treeAggregate = aggregate.nodeAggregate(c7904e);
            aggregateAboveRange = aggregate.treeAggregate(c7904e.f53623g);
        } else {
            treeAggregate = aggregate.treeAggregate(c7904e.f53623g) + aggregate.nodeAggregate(c7904e);
            aggregateAboveRange = aggregateAboveRange(aggregate, c7904e.f53622f);
        }
        return treeAggregate + aggregateAboveRange;
    }

    private long aggregateBelowRange(Aggregate aggregate, @CheckForNull C7904e c7904e) {
        long treeAggregate;
        long aggregateBelowRange;
        if (c7904e == null) {
            return 0L;
        }
        int compare = comparator().compare(AbstractC22494uJ0.m1205a(this.range.getLowerEndpoint()), c7904e.m40416x());
        if (compare < 0) {
            return aggregateBelowRange(aggregate, c7904e.f53622f);
        }
        if (compare == 0) {
            int i = C7903d.f53616a[this.range.getLowerBoundType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return aggregate.treeAggregate(c7904e.f53622f);
                }
                throw new AssertionError();
            }
            treeAggregate = aggregate.nodeAggregate(c7904e);
            aggregateBelowRange = aggregate.treeAggregate(c7904e.f53622f);
        } else {
            treeAggregate = aggregate.treeAggregate(c7904e.f53622f) + aggregate.nodeAggregate(c7904e);
            aggregateBelowRange = aggregateBelowRange(aggregate, c7904e.f53623g);
        }
        return treeAggregate + aggregateBelowRange;
    }

    private long aggregateForEntries(Aggregate aggregate) {
        C7904e c7904e = (C7904e) this.rootReference.m40411c();
        long treeAggregate = aggregate.treeAggregate(c7904e);
        if (this.range.hasLowerBound()) {
            treeAggregate -= aggregateBelowRange(aggregate, c7904e);
        }
        if (this.range.hasUpperBound()) {
            return treeAggregate - aggregateAboveRange(aggregate, c7904e);
        }
        return treeAggregate;
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset<>(Ordering.natural());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public C7904e firstNode() {
        C7904e m40441L;
        C7904e c7904e = (C7904e) this.rootReference.m40411c();
        if (c7904e == null) {
            return null;
        }
        if (!this.range.hasLowerBound()) {
            m40441L = this.header.m40441L();
        } else {
            Object m1205a = AbstractC22494uJ0.m1205a(this.range.getLowerEndpoint());
            m40441L = c7904e.m40421s(comparator(), m1205a);
            if (m40441L == null) {
                return null;
            }
            if (this.range.getLowerBoundType() == BoundType.OPEN && comparator().compare(m1205a, m40441L.m40416x()) == 0) {
                m40441L = m40441L.m40441L();
            }
        }
        if (m40441L == this.header || !this.range.contains(m40441L.m40416x())) {
            return null;
        }
        return m40441L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public C7904e lastNode() {
        C7904e m40414z;
        C7904e c7904e = (C7904e) this.rootReference.m40411c();
        if (c7904e == null) {
            return null;
        }
        if (!this.range.hasUpperBound()) {
            m40414z = this.header.m40414z();
        } else {
            Object m1205a = AbstractC22494uJ0.m1205a(this.range.getUpperEndpoint());
            m40414z = c7904e.m40418v(comparator(), m1205a);
            if (m40414z == null) {
                return null;
            }
            if (this.range.getUpperBoundType() == BoundType.OPEN && comparator().compare(m1205a, m40414z.m40416x()) == 0) {
                m40414z = m40414z.m40414z();
            }
        }
        if (m40414z == this.header || !this.range.contains(m40414z.m40416x())) {
            return null;
        }
        return m40414z;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        Objects.requireNonNull(readObject);
        Comparator comparator = (Comparator) readObject;
        AbstractC7972m.m40212a(AbstractC7946d.class, "comparator").m40200b(this, comparator);
        AbstractC7972m.m40212a(TreeMultiset.class, "range").m40200b(this, GeneralRange.all(comparator));
        AbstractC7972m.m40212a(TreeMultiset.class, "rootReference").m40200b(this, new C7905f(null));
        C7904e c7904e = new C7904e();
        AbstractC7972m.m40212a(TreeMultiset.class, "header").m40200b(this, c7904e);
        successor(c7904e, c7904e);
        AbstractC7972m.m40207f(this, objectInputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(C7904e c7904e, C7904e c7904e2) {
        c7904e.f53625i = c7904e2;
        c7904e2.f53624h = c7904e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Multiset.Entry<E> wrapEntry(C7904e c7904e) {
        return new C7900a(this, c7904e);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        AbstractC7972m.m40202k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC7940b, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(E e, int i) {
        AbstractC5383bs.m51877b(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        Preconditions.checkArgument(this.range.contains(e));
        C7904e c7904e = (C7904e) this.rootReference.m40411c();
        if (c7904e == null) {
            comparator().compare(e, e);
            C7904e c7904e2 = new C7904e(e, i);
            C7904e c7904e3 = this.header;
            successor(c7904e3, c7904e2, c7904e3);
            this.rootReference.m40413a(c7904e, c7904e2);
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.m40413a(c7904e, c7904e.m40425o(comparator(), e, i, iArr));
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (!this.range.hasLowerBound() && !this.range.hasUpperBound()) {
            C7904e m40441L = this.header.m40441L();
            while (true) {
                C7904e c7904e = this.header;
                if (m40441L != c7904e) {
                    C7904e m40441L2 = m40441L.m40441L();
                    m40441L.f53618b = 0;
                    m40441L.f53622f = null;
                    m40441L.f53623g = null;
                    m40441L.f53624h = null;
                    m40441L.f53625i = null;
                    m40441L = m40441L2;
                } else {
                    successor(c7904e, c7904e);
                    this.rootReference.m40412b();
                    return;
                }
            }
        } else {
            Iterators.m40831b(entryIterator());
        }
    }

    @Override // com.google.common.collect.AbstractC7946d, com.google.common.collect.SortedMultiset, p000.InterfaceC20944lL1
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.AbstractC7940b, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.Multiset
    public int count(@CheckForNull Object obj) {
        try {
            C7904e c7904e = (C7904e) this.rootReference.m40411c();
            if (this.range.contains(obj) && c7904e != null) {
                return c7904e.m40420t(comparator(), obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractC7946d
    public Iterator<Multiset.Entry<E>> descendingEntryIterator() {
        return new C7902c();
    }

    @Override // com.google.common.collect.AbstractC7946d, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset descendingMultiset() {
        return super.descendingMultiset();
    }

    @Override // com.google.common.collect.AbstractC7940b
    public int distinctElements() {
        return Ints.saturatedCast(aggregateForEntries(Aggregate.DISTINCT));
    }

    @Override // com.google.common.collect.AbstractC7940b
    public Iterator<E> elementIterator() {
        return Multisets.m40568e(entryIterator());
    }

    @Override // com.google.common.collect.AbstractC7946d, com.google.common.collect.AbstractC7940b, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractC7940b
    public Iterator<Multiset.Entry<E>> entryIterator() {
        return new C7901b();
    }

    @Override // com.google.common.collect.AbstractC7940b, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractC7946d, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> headMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.intersect(GeneralRange.upTo(comparator(), e, boundType)), this.header);
    }

    @Override // com.google.common.collect.AbstractC7940b, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.m40565h(this);
    }

    @Override // com.google.common.collect.AbstractC7946d, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.AbstractC7946d, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.AbstractC7946d, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // com.google.common.collect.AbstractC7940b, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(@CheckForNull Object obj, int i) {
        AbstractC5383bs.m51877b(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        C7904e c7904e = (C7904e) this.rootReference.m40411c();
        int[] iArr = new int[1];
        try {
            if (this.range.contains(obj) && c7904e != null) {
                this.rootReference.m40413a(c7904e, c7904e.m40448E(comparator(), obj, i, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractC7940b, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(E e, int i) {
        AbstractC5383bs.m51877b(i, "count");
        if (!this.range.contains(e)) {
            Preconditions.checkArgument(i == 0);
            return 0;
        }
        C7904e c7904e = (C7904e) this.rootReference.m40411c();
        if (c7904e == null) {
            if (i > 0) {
                add(e, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.m40413a(c7904e, c7904e.m40442K(comparator(), e, i, iArr));
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return Ints.saturatedCast(aggregateForEntries(Aggregate.SIZE));
    }

    @Override // com.google.common.collect.AbstractC7946d, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset subMultiset(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return super.subMultiset(obj, boundType, obj2, boundType2);
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.intersect(GeneralRange.downTo(comparator(), e, boundType)), this.header);
    }

    public static <E> TreeMultiset<E> create(@CheckForNull Comparator<? super E> comparator) {
        if (comparator == null) {
            return new TreeMultiset<>(Ordering.natural());
        }
        return new TreeMultiset<>(comparator);
    }

    public static int distinctElements(@CheckForNull C7904e c7904e) {
        if (c7904e == null) {
            return 0;
        }
        return c7904e.f53619c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(C7904e c7904e, C7904e c7904e2, C7904e c7904e3) {
        successor(c7904e, c7904e2);
        successor(c7904e2, c7904e3);
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> iterable) {
        TreeMultiset<E> create = create();
        Iterables.addAll(create, iterable);
        return create;
    }

    public TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.range = GeneralRange.all(comparator);
        C7904e c7904e = new C7904e();
        this.header = c7904e;
        successor(c7904e, c7904e);
        this.rootReference = new C7905f(null);
    }

    /* renamed from: com.google.common.collect.TreeMultiset$e */
    /* loaded from: classes4.dex */
    public static final class C7904e {

        /* renamed from: a */
        public final Object f53617a;

        /* renamed from: b */
        public int f53618b;

        /* renamed from: c */
        public int f53619c;

        /* renamed from: d */
        public long f53620d;

        /* renamed from: e */
        public int f53621e;

        /* renamed from: f */
        public C7904e f53622f;

        /* renamed from: g */
        public C7904e f53623g;

        /* renamed from: h */
        public C7904e f53624h;

        /* renamed from: i */
        public C7904e f53625i;

        public C7904e(Object obj, int i) {
            Preconditions.checkArgument(i > 0);
            this.f53617a = obj;
            this.f53618b = i;
            this.f53620d = i;
            this.f53619c = 1;
            this.f53621e = 1;
            this.f53622f = null;
            this.f53623g = null;
        }

        /* renamed from: M */
        public static long m40440M(C7904e c7904e) {
            if (c7904e == null) {
                return 0L;
            }
            return c7904e.f53620d;
        }

        /* renamed from: y */
        public static int m40415y(C7904e c7904e) {
            if (c7904e == null) {
                return 0;
            }
            return c7904e.f53621e;
        }

        /* renamed from: A */
        public final C7904e m40452A() {
            int m40422r = m40422r();
            if (m40422r != -2) {
                if (m40422r != 2) {
                    m40450C();
                    return this;
                }
                Objects.requireNonNull(this.f53622f);
                if (this.f53622f.m40422r() < 0) {
                    this.f53622f = this.f53622f.m40445H();
                }
                return m40444I();
            }
            Objects.requireNonNull(this.f53623g);
            if (this.f53623g.m40422r() > 0) {
                this.f53623g = this.f53623g.m40444I();
            }
            return m40445H();
        }

        /* renamed from: B */
        public final void m40451B() {
            m40449D();
            m40450C();
        }

        /* renamed from: C */
        public final void m40450C() {
            this.f53621e = Math.max(m40415y(this.f53622f), m40415y(this.f53623g)) + 1;
        }

        /* renamed from: D */
        public final void m40449D() {
            this.f53619c = TreeMultiset.distinctElements(this.f53622f) + 1 + TreeMultiset.distinctElements(this.f53623g);
            this.f53620d = this.f53618b + m40440M(this.f53622f) + m40440M(this.f53623g);
        }

        /* renamed from: E */
        public C7904e m40448E(Comparator comparator, Object obj, int i, int[] iArr) {
            int compare = comparator.compare(obj, m40416x());
            if (compare < 0) {
                C7904e c7904e = this.f53622f;
                if (c7904e == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f53622f = c7904e.m40448E(comparator, obj, i, iArr);
                int i2 = iArr[0];
                if (i2 > 0) {
                    if (i >= i2) {
                        this.f53619c--;
                        this.f53620d -= i2;
                    } else {
                        this.f53620d -= i;
                    }
                }
                if (i2 == 0) {
                    return this;
                }
                return m40452A();
            } else if (compare > 0) {
                C7904e c7904e2 = this.f53623g;
                if (c7904e2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f53623g = c7904e2.m40448E(comparator, obj, i, iArr);
                int i3 = iArr[0];
                if (i3 > 0) {
                    if (i >= i3) {
                        this.f53619c--;
                        this.f53620d -= i3;
                    } else {
                        this.f53620d -= i;
                    }
                }
                return m40452A();
            } else {
                int i4 = this.f53618b;
                iArr[0] = i4;
                if (i >= i4) {
                    return m40419u();
                }
                this.f53618b = i4 - i;
                this.f53620d -= i;
                return this;
            }
        }

        /* renamed from: F */
        public final C7904e m40447F(C7904e c7904e) {
            C7904e c7904e2 = this.f53623g;
            if (c7904e2 == null) {
                return this.f53622f;
            }
            this.f53623g = c7904e2.m40447F(c7904e);
            this.f53619c--;
            this.f53620d -= c7904e.f53618b;
            return m40452A();
        }

        /* renamed from: G */
        public final C7904e m40446G(C7904e c7904e) {
            C7904e c7904e2 = this.f53622f;
            if (c7904e2 == null) {
                return this.f53623g;
            }
            this.f53622f = c7904e2.m40446G(c7904e);
            this.f53619c--;
            this.f53620d -= c7904e.f53618b;
            return m40452A();
        }

        /* renamed from: H */
        public final C7904e m40445H() {
            boolean z;
            if (this.f53623g != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            C7904e c7904e = this.f53623g;
            this.f53623g = c7904e.f53622f;
            c7904e.f53622f = this;
            c7904e.f53620d = this.f53620d;
            c7904e.f53619c = this.f53619c;
            m40451B();
            c7904e.m40450C();
            return c7904e;
        }

        /* renamed from: I */
        public final C7904e m40444I() {
            boolean z;
            if (this.f53622f != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            C7904e c7904e = this.f53622f;
            this.f53622f = c7904e.f53623g;
            c7904e.f53623g = this;
            c7904e.f53620d = this.f53620d;
            c7904e.f53619c = this.f53619c;
            m40451B();
            c7904e.m40450C();
            return c7904e;
        }

        /* renamed from: J */
        public C7904e m40443J(Comparator comparator, Object obj, int i, int i2, int[] iArr) {
            int compare = comparator.compare(obj, m40416x());
            if (compare < 0) {
                C7904e c7904e = this.f53622f;
                if (c7904e == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        return m40424p(obj, i2);
                    }
                    return this;
                }
                this.f53622f = c7904e.m40443J(comparator, obj, i, i2, iArr);
                int i3 = iArr[0];
                if (i3 == i) {
                    if (i2 == 0 && i3 != 0) {
                        this.f53619c--;
                    } else if (i2 > 0 && i3 == 0) {
                        this.f53619c++;
                    }
                    this.f53620d += i2 - i3;
                }
                return m40452A();
            } else if (compare > 0) {
                C7904e c7904e2 = this.f53623g;
                if (c7904e2 == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        return m40423q(obj, i2);
                    }
                    return this;
                }
                this.f53623g = c7904e2.m40443J(comparator, obj, i, i2, iArr);
                int i4 = iArr[0];
                if (i4 == i) {
                    if (i2 == 0 && i4 != 0) {
                        this.f53619c--;
                    } else if (i2 > 0 && i4 == 0) {
                        this.f53619c++;
                    }
                    this.f53620d += i2 - i4;
                }
                return m40452A();
            } else {
                int i5 = this.f53618b;
                iArr[0] = i5;
                if (i == i5) {
                    if (i2 == 0) {
                        return m40419u();
                    }
                    this.f53620d += i2 - i5;
                    this.f53618b = i2;
                }
                return this;
            }
        }

        /* renamed from: K */
        public C7904e m40442K(Comparator comparator, Object obj, int i, int[] iArr) {
            int i2;
            int compare = comparator.compare(obj, m40416x());
            if (compare < 0) {
                C7904e c7904e = this.f53622f;
                if (c7904e == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        return m40424p(obj, i);
                    }
                    return this;
                }
                this.f53622f = c7904e.m40442K(comparator, obj, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f53619c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f53619c++;
                }
                this.f53620d += i - iArr[0];
                return m40452A();
            } else if (compare > 0) {
                C7904e c7904e2 = this.f53623g;
                if (c7904e2 == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        return m40423q(obj, i);
                    }
                    return this;
                }
                this.f53623g = c7904e2.m40442K(comparator, obj, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f53619c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f53619c++;
                }
                this.f53620d += i - iArr[0];
                return m40452A();
            } else {
                iArr[0] = this.f53618b;
                if (i == 0) {
                    return m40419u();
                }
                this.f53620d += i - i2;
                this.f53618b = i;
                return this;
            }
        }

        /* renamed from: L */
        public final C7904e m40441L() {
            C7904e c7904e = this.f53625i;
            Objects.requireNonNull(c7904e);
            return c7904e;
        }

        /* renamed from: o */
        public C7904e m40425o(Comparator comparator, Object obj, int i, int[] iArr) {
            int compare = comparator.compare(obj, m40416x());
            boolean z = true;
            if (compare < 0) {
                C7904e c7904e = this.f53622f;
                if (c7904e == null) {
                    iArr[0] = 0;
                    return m40424p(obj, i);
                }
                int i2 = c7904e.f53621e;
                C7904e m40425o = c7904e.m40425o(comparator, obj, i, iArr);
                this.f53622f = m40425o;
                if (iArr[0] == 0) {
                    this.f53619c++;
                }
                this.f53620d += i;
                if (m40425o.f53621e == i2) {
                    return this;
                }
                return m40452A();
            } else if (compare > 0) {
                C7904e c7904e2 = this.f53623g;
                if (c7904e2 == null) {
                    iArr[0] = 0;
                    return m40423q(obj, i);
                }
                int i3 = c7904e2.f53621e;
                C7904e m40425o2 = c7904e2.m40425o(comparator, obj, i, iArr);
                this.f53623g = m40425o2;
                if (iArr[0] == 0) {
                    this.f53619c++;
                }
                this.f53620d += i;
                if (m40425o2.f53621e == i3) {
                    return this;
                }
                return m40452A();
            } else {
                int i4 = this.f53618b;
                iArr[0] = i4;
                long j = i;
                if (i4 + j > 2147483647L) {
                    z = false;
                }
                Preconditions.checkArgument(z);
                this.f53618b += i;
                this.f53620d += j;
                return this;
            }
        }

        /* renamed from: p */
        public final C7904e m40424p(Object obj, int i) {
            this.f53622f = new C7904e(obj, i);
            TreeMultiset.successor(m40414z(), this.f53622f, this);
            this.f53621e = Math.max(2, this.f53621e);
            this.f53619c++;
            this.f53620d += i;
            return this;
        }

        /* renamed from: q */
        public final C7904e m40423q(Object obj, int i) {
            C7904e c7904e = new C7904e(obj, i);
            this.f53623g = c7904e;
            TreeMultiset.successor(this, c7904e, m40441L());
            this.f53621e = Math.max(2, this.f53621e);
            this.f53619c++;
            this.f53620d += i;
            return this;
        }

        /* renamed from: r */
        public final int m40422r() {
            return m40415y(this.f53622f) - m40415y(this.f53623g);
        }

        /* renamed from: s */
        public final C7904e m40421s(Comparator comparator, Object obj) {
            int compare = comparator.compare(obj, m40416x());
            if (compare < 0) {
                C7904e c7904e = this.f53622f;
                if (c7904e == null) {
                    return this;
                }
                return (C7904e) MoreObjects.firstNonNull(c7904e.m40421s(comparator, obj), this);
            } else if (compare == 0) {
                return this;
            } else {
                C7904e c7904e2 = this.f53623g;
                if (c7904e2 == null) {
                    return null;
                }
                return c7904e2.m40421s(comparator, obj);
            }
        }

        /* renamed from: t */
        public int m40420t(Comparator comparator, Object obj) {
            int compare = comparator.compare(obj, m40416x());
            if (compare < 0) {
                C7904e c7904e = this.f53622f;
                if (c7904e == null) {
                    return 0;
                }
                return c7904e.m40420t(comparator, obj);
            } else if (compare > 0) {
                C7904e c7904e2 = this.f53623g;
                if (c7904e2 == null) {
                    return 0;
                }
                return c7904e2.m40420t(comparator, obj);
            } else {
                return this.f53618b;
            }
        }

        public String toString() {
            return Multisets.immutableEntry(m40416x(), m40417w()).toString();
        }

        /* renamed from: u */
        public final C7904e m40419u() {
            int i = this.f53618b;
            this.f53618b = 0;
            TreeMultiset.successor(m40414z(), m40441L());
            C7904e c7904e = this.f53622f;
            if (c7904e == null) {
                return this.f53623g;
            }
            C7904e c7904e2 = this.f53623g;
            if (c7904e2 == null) {
                return c7904e;
            }
            if (c7904e.f53621e >= c7904e2.f53621e) {
                C7904e m40414z = m40414z();
                m40414z.f53622f = this.f53622f.m40447F(m40414z);
                m40414z.f53623g = this.f53623g;
                m40414z.f53619c = this.f53619c - 1;
                m40414z.f53620d = this.f53620d - i;
                return m40414z.m40452A();
            }
            C7904e m40441L = m40441L();
            m40441L.f53623g = this.f53623g.m40446G(m40441L);
            m40441L.f53622f = this.f53622f;
            m40441L.f53619c = this.f53619c - 1;
            m40441L.f53620d = this.f53620d - i;
            return m40441L.m40452A();
        }

        /* renamed from: v */
        public final C7904e m40418v(Comparator comparator, Object obj) {
            int compare = comparator.compare(obj, m40416x());
            if (compare > 0) {
                C7904e c7904e = this.f53623g;
                if (c7904e == null) {
                    return this;
                }
                return (C7904e) MoreObjects.firstNonNull(c7904e.m40418v(comparator, obj), this);
            } else if (compare == 0) {
                return this;
            } else {
                C7904e c7904e2 = this.f53622f;
                if (c7904e2 == null) {
                    return null;
                }
                return c7904e2.m40418v(comparator, obj);
            }
        }

        /* renamed from: w */
        public int m40417w() {
            return this.f53618b;
        }

        /* renamed from: x */
        public Object m40416x() {
            return AbstractC22494uJ0.m1205a(this.f53617a);
        }

        /* renamed from: z */
        public final C7904e m40414z() {
            C7904e c7904e = this.f53624h;
            Objects.requireNonNull(c7904e);
            return c7904e;
        }

        public C7904e() {
            this.f53617a = null;
            this.f53618b = 1;
        }
    }

    @Override // com.google.common.collect.AbstractC7940b, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(E e, int i, int i2) {
        AbstractC5383bs.m51877b(i2, "newCount");
        AbstractC5383bs.m51877b(i, "oldCount");
        Preconditions.checkArgument(this.range.contains(e));
        C7904e c7904e = (C7904e) this.rootReference.m40411c();
        if (c7904e != null) {
            int[] iArr = new int[1];
            this.rootReference.m40413a(c7904e, c7904e.m40443J(comparator(), e, i, i2, iArr));
            return iArr[0] == i;
        } else if (i == 0) {
            if (i2 > 0) {
                add(e, i2);
            }
            return true;
        } else {
            return false;
        }
    }
}