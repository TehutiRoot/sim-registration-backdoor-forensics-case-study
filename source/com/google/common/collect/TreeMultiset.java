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
public final class TreeMultiset<E> extends AbstractC7957d implements Serializable {
    @J2ktIncompatible
    @GwtIncompatible
    private static final long serialVersionUID = 1;
    private final transient C7915e header;
    private final transient GeneralRange<E> range;
    private final transient C7916f rootReference;

    /* loaded from: classes4.dex */
    public enum Aggregate {
        SIZE { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(C7915e c7915e) {
                return c7915e.f53606b;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(@CheckForNull C7915e c7915e) {
                if (c7915e != null) {
                    return c7915e.f53608d;
                }
                return 0L;
            }
        },
        DISTINCT { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(C7915e c7915e) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(@CheckForNull C7915e c7915e) {
                if (c7915e == null) {
                    return 0L;
                }
                return c7915e.f53607c;
            }
        };

        public abstract int nodeAggregate(C7915e c7915e);

        public abstract long treeAggregate(@CheckForNull C7915e c7915e);

        /* synthetic */ Aggregate(C7911a c7911a) {
            this();
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$a */
    /* loaded from: classes4.dex */
    public class C7911a extends Multisets.AbstractC7820f {

        /* renamed from: a */
        public final /* synthetic */ C7915e f53596a;

        /* renamed from: b */
        public final /* synthetic */ TreeMultiset f53597b;

        public C7911a(TreeMultiset treeMultiset, C7915e c7915e) {
            this.f53596a = c7915e;
            this.f53597b = treeMultiset;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            int m40428w = this.f53596a.m40428w();
            if (m40428w == 0) {
                return this.f53597b.count(getElement());
            }
            return m40428w;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public Object getElement() {
            return this.f53596a.m40427x();
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$b */
    /* loaded from: classes4.dex */
    public class C7912b implements Iterator {

        /* renamed from: a */
        public C7915e f53598a;

        /* renamed from: b */
        public Multiset.Entry f53599b;

        public C7912b() {
            this.f53598a = TreeMultiset.this.firstNode();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Multiset.Entry next() {
            if (hasNext()) {
                TreeMultiset treeMultiset = TreeMultiset.this;
                C7915e c7915e = this.f53598a;
                Objects.requireNonNull(c7915e);
                Multiset.Entry wrapEntry = treeMultiset.wrapEntry(c7915e);
                this.f53599b = wrapEntry;
                if (this.f53598a.m40452L() == TreeMultiset.this.header) {
                    this.f53598a = null;
                } else {
                    this.f53598a = this.f53598a.m40452L();
                }
                return wrapEntry;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53598a == null) {
                return false;
            }
            if (TreeMultiset.this.range.tooHigh(this.f53598a.m40427x())) {
                this.f53598a = null;
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.f53599b != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "no calls to next() since the last call to remove()");
            TreeMultiset.this.setCount(this.f53599b.getElement(), 0);
            this.f53599b = null;
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$c */
    /* loaded from: classes4.dex */
    public class C7913c implements Iterator {

        /* renamed from: a */
        public C7915e f53601a;

        /* renamed from: b */
        public Multiset.Entry f53602b = null;

        public C7913c() {
            this.f53601a = TreeMultiset.this.lastNode();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Multiset.Entry next() {
            if (hasNext()) {
                Objects.requireNonNull(this.f53601a);
                Multiset.Entry wrapEntry = TreeMultiset.this.wrapEntry(this.f53601a);
                this.f53602b = wrapEntry;
                if (this.f53601a.m40425z() == TreeMultiset.this.header) {
                    this.f53601a = null;
                } else {
                    this.f53601a = this.f53601a.m40425z();
                }
                return wrapEntry;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f53601a == null) {
                return false;
            }
            if (TreeMultiset.this.range.tooLow(this.f53601a.m40427x())) {
                this.f53601a = null;
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.f53602b != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "no calls to next() since the last call to remove()");
            TreeMultiset.this.setCount(this.f53602b.getElement(), 0);
            this.f53602b = null;
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$d */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C7914d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53604a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f53604a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53604a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$f */
    /* loaded from: classes4.dex */
    public static final class C7916f {

        /* renamed from: a */
        public Object f53614a;

        public C7916f() {
        }

        /* renamed from: a */
        public void m40424a(Object obj, Object obj2) {
            if (this.f53614a == obj) {
                this.f53614a = obj2;
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        public void m40423b() {
            this.f53614a = null;
        }

        /* renamed from: c */
        public Object m40422c() {
            return this.f53614a;
        }

        public /* synthetic */ C7916f(C7911a c7911a) {
            this();
        }
    }

    public TreeMultiset(C7916f c7916f, GeneralRange<E> generalRange, C7915e c7915e) {
        super(generalRange.comparator());
        this.rootReference = c7916f;
        this.range = generalRange;
        this.header = c7915e;
    }

    private long aggregateAboveRange(Aggregate aggregate, @CheckForNull C7915e c7915e) {
        long treeAggregate;
        long aggregateAboveRange;
        if (c7915e == null) {
            return 0L;
        }
        int compare = comparator().compare(AbstractC21396oJ0.m25936a(this.range.getUpperEndpoint()), c7915e.m40427x());
        if (compare > 0) {
            return aggregateAboveRange(aggregate, c7915e.f53611g);
        }
        if (compare == 0) {
            int i = C7914d.f53604a[this.range.getUpperBoundType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return aggregate.treeAggregate(c7915e.f53611g);
                }
                throw new AssertionError();
            }
            treeAggregate = aggregate.nodeAggregate(c7915e);
            aggregateAboveRange = aggregate.treeAggregate(c7915e.f53611g);
        } else {
            treeAggregate = aggregate.treeAggregate(c7915e.f53611g) + aggregate.nodeAggregate(c7915e);
            aggregateAboveRange = aggregateAboveRange(aggregate, c7915e.f53610f);
        }
        return treeAggregate + aggregateAboveRange;
    }

    private long aggregateBelowRange(Aggregate aggregate, @CheckForNull C7915e c7915e) {
        long treeAggregate;
        long aggregateBelowRange;
        if (c7915e == null) {
            return 0L;
        }
        int compare = comparator().compare(AbstractC21396oJ0.m25936a(this.range.getLowerEndpoint()), c7915e.m40427x());
        if (compare < 0) {
            return aggregateBelowRange(aggregate, c7915e.f53610f);
        }
        if (compare == 0) {
            int i = C7914d.f53604a[this.range.getLowerBoundType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return aggregate.treeAggregate(c7915e.f53610f);
                }
                throw new AssertionError();
            }
            treeAggregate = aggregate.nodeAggregate(c7915e);
            aggregateBelowRange = aggregate.treeAggregate(c7915e.f53610f);
        } else {
            treeAggregate = aggregate.treeAggregate(c7915e.f53610f) + aggregate.nodeAggregate(c7915e);
            aggregateBelowRange = aggregateBelowRange(aggregate, c7915e.f53611g);
        }
        return treeAggregate + aggregateBelowRange;
    }

    private long aggregateForEntries(Aggregate aggregate) {
        C7915e c7915e = (C7915e) this.rootReference.m40422c();
        long treeAggregate = aggregate.treeAggregate(c7915e);
        if (this.range.hasLowerBound()) {
            treeAggregate -= aggregateBelowRange(aggregate, c7915e);
        }
        if (this.range.hasUpperBound()) {
            return treeAggregate - aggregateAboveRange(aggregate, c7915e);
        }
        return treeAggregate;
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset<>(Ordering.natural());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public C7915e firstNode() {
        C7915e m40452L;
        C7915e c7915e = (C7915e) this.rootReference.m40422c();
        if (c7915e == null) {
            return null;
        }
        if (!this.range.hasLowerBound()) {
            m40452L = this.header.m40452L();
        } else {
            Object m25936a = AbstractC21396oJ0.m25936a(this.range.getLowerEndpoint());
            m40452L = c7915e.m40432s(comparator(), m25936a);
            if (m40452L == null) {
                return null;
            }
            if (this.range.getLowerBoundType() == BoundType.OPEN && comparator().compare(m25936a, m40452L.m40427x()) == 0) {
                m40452L = m40452L.m40452L();
            }
        }
        if (m40452L == this.header || !this.range.contains(m40452L.m40427x())) {
            return null;
        }
        return m40452L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public C7915e lastNode() {
        C7915e m40425z;
        C7915e c7915e = (C7915e) this.rootReference.m40422c();
        if (c7915e == null) {
            return null;
        }
        if (!this.range.hasUpperBound()) {
            m40425z = this.header.m40425z();
        } else {
            Object m25936a = AbstractC21396oJ0.m25936a(this.range.getUpperEndpoint());
            m40425z = c7915e.m40429v(comparator(), m25936a);
            if (m40425z == null) {
                return null;
            }
            if (this.range.getUpperBoundType() == BoundType.OPEN && comparator().compare(m25936a, m40425z.m40427x()) == 0) {
                m40425z = m40425z.m40425z();
            }
        }
        if (m40425z == this.header || !this.range.contains(m40425z.m40427x())) {
            return null;
        }
        return m40425z;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Object readObject = objectInputStream.readObject();
        Objects.requireNonNull(readObject);
        Comparator comparator = (Comparator) readObject;
        AbstractC7983m.m40221a(AbstractC7957d.class, "comparator").m40209b(this, comparator);
        AbstractC7983m.m40221a(TreeMultiset.class, "range").m40209b(this, GeneralRange.all(comparator));
        AbstractC7983m.m40221a(TreeMultiset.class, "rootReference").m40209b(this, new C7916f(null));
        C7915e c7915e = new C7915e();
        AbstractC7983m.m40221a(TreeMultiset.class, "header").m40209b(this, c7915e);
        successor(c7915e, c7915e);
        AbstractC7983m.m40216f(this, objectInputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(C7915e c7915e, C7915e c7915e2) {
        c7915e.f53613i = c7915e2;
        c7915e2.f53612h = c7915e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Multiset.Entry<E> wrapEntry(C7915e c7915e) {
        return new C7911a(this, c7915e);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        AbstractC7983m.m40211k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC7951b, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(E e, int i) {
        AbstractC5406bs.m51814b(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        Preconditions.checkArgument(this.range.contains(e));
        C7915e c7915e = (C7915e) this.rootReference.m40422c();
        if (c7915e == null) {
            comparator().compare(e, e);
            C7915e c7915e2 = new C7915e(e, i);
            C7915e c7915e3 = this.header;
            successor(c7915e3, c7915e2, c7915e3);
            this.rootReference.m40424a(c7915e, c7915e2);
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.m40424a(c7915e, c7915e.m40436o(comparator(), e, i, iArr));
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (!this.range.hasLowerBound() && !this.range.hasUpperBound()) {
            C7915e m40452L = this.header.m40452L();
            while (true) {
                C7915e c7915e = this.header;
                if (m40452L != c7915e) {
                    C7915e m40452L2 = m40452L.m40452L();
                    m40452L.f53606b = 0;
                    m40452L.f53610f = null;
                    m40452L.f53611g = null;
                    m40452L.f53612h = null;
                    m40452L.f53613i = null;
                    m40452L = m40452L2;
                } else {
                    successor(c7915e, c7915e);
                    this.rootReference.m40423b();
                    return;
                }
            }
        } else {
            Iterators.m40842b(entryIterator());
        }
    }

    @Override // com.google.common.collect.AbstractC7957d, com.google.common.collect.SortedMultiset, p000.InterfaceC21400oK1
    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.AbstractC7951b, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.Multiset
    public int count(@CheckForNull Object obj) {
        try {
            C7915e c7915e = (C7915e) this.rootReference.m40422c();
            if (this.range.contains(obj) && c7915e != null) {
                return c7915e.m40431t(comparator(), obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractC7957d
    public Iterator<Multiset.Entry<E>> descendingEntryIterator() {
        return new C7913c();
    }

    @Override // com.google.common.collect.AbstractC7957d, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset descendingMultiset() {
        return super.descendingMultiset();
    }

    @Override // com.google.common.collect.AbstractC7951b
    public int distinctElements() {
        return Ints.saturatedCast(aggregateForEntries(Aggregate.DISTINCT));
    }

    @Override // com.google.common.collect.AbstractC7951b
    public Iterator<E> elementIterator() {
        return Multisets.m40579e(entryIterator());
    }

    @Override // com.google.common.collect.AbstractC7957d, com.google.common.collect.AbstractC7951b, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractC7951b
    public Iterator<Multiset.Entry<E>> entryIterator() {
        return new C7912b();
    }

    @Override // com.google.common.collect.AbstractC7951b, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractC7957d, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> headMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.intersect(GeneralRange.upTo(comparator(), e, boundType)), this.header);
    }

    @Override // com.google.common.collect.AbstractC7951b, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.m40576h(this);
    }

    @Override // com.google.common.collect.AbstractC7957d, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.AbstractC7957d, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.AbstractC7957d, com.google.common.collect.SortedMultiset
    @CheckForNull
    public /* bridge */ /* synthetic */ Multiset.Entry pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // com.google.common.collect.AbstractC7951b, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(@CheckForNull Object obj, int i) {
        AbstractC5406bs.m51814b(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        C7915e c7915e = (C7915e) this.rootReference.m40422c();
        int[] iArr = new int[1];
        try {
            if (this.range.contains(obj) && c7915e != null) {
                this.rootReference.m40424a(c7915e, c7915e.m40459E(comparator(), obj, i, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractC7951b, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(E e, int i) {
        AbstractC5406bs.m51814b(i, "count");
        if (!this.range.contains(e)) {
            Preconditions.checkArgument(i == 0);
            return 0;
        }
        C7915e c7915e = (C7915e) this.rootReference.m40422c();
        if (c7915e == null) {
            if (i > 0) {
                add(e, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.m40424a(c7915e, c7915e.m40453K(comparator(), e, i, iArr));
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return Ints.saturatedCast(aggregateForEntries(Aggregate.SIZE));
    }

    @Override // com.google.common.collect.AbstractC7957d, com.google.common.collect.SortedMultiset
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

    public static int distinctElements(@CheckForNull C7915e c7915e) {
        if (c7915e == null) {
            return 0;
        }
        return c7915e.f53607c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(C7915e c7915e, C7915e c7915e2, C7915e c7915e3) {
        successor(c7915e, c7915e2);
        successor(c7915e2, c7915e3);
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> iterable) {
        TreeMultiset<E> create = create();
        Iterables.addAll(create, iterable);
        return create;
    }

    public TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.range = GeneralRange.all(comparator);
        C7915e c7915e = new C7915e();
        this.header = c7915e;
        successor(c7915e, c7915e);
        this.rootReference = new C7916f(null);
    }

    /* renamed from: com.google.common.collect.TreeMultiset$e */
    /* loaded from: classes4.dex */
    public static final class C7915e {

        /* renamed from: a */
        public final Object f53605a;

        /* renamed from: b */
        public int f53606b;

        /* renamed from: c */
        public int f53607c;

        /* renamed from: d */
        public long f53608d;

        /* renamed from: e */
        public int f53609e;

        /* renamed from: f */
        public C7915e f53610f;

        /* renamed from: g */
        public C7915e f53611g;

        /* renamed from: h */
        public C7915e f53612h;

        /* renamed from: i */
        public C7915e f53613i;

        public C7915e(Object obj, int i) {
            Preconditions.checkArgument(i > 0);
            this.f53605a = obj;
            this.f53606b = i;
            this.f53608d = i;
            this.f53607c = 1;
            this.f53609e = 1;
            this.f53610f = null;
            this.f53611g = null;
        }

        /* renamed from: M */
        public static long m40451M(C7915e c7915e) {
            if (c7915e == null) {
                return 0L;
            }
            return c7915e.f53608d;
        }

        /* renamed from: y */
        public static int m40426y(C7915e c7915e) {
            if (c7915e == null) {
                return 0;
            }
            return c7915e.f53609e;
        }

        /* renamed from: A */
        public final C7915e m40463A() {
            int m40433r = m40433r();
            if (m40433r != -2) {
                if (m40433r != 2) {
                    m40461C();
                    return this;
                }
                Objects.requireNonNull(this.f53610f);
                if (this.f53610f.m40433r() < 0) {
                    this.f53610f = this.f53610f.m40456H();
                }
                return m40455I();
            }
            Objects.requireNonNull(this.f53611g);
            if (this.f53611g.m40433r() > 0) {
                this.f53611g = this.f53611g.m40455I();
            }
            return m40456H();
        }

        /* renamed from: B */
        public final void m40462B() {
            m40460D();
            m40461C();
        }

        /* renamed from: C */
        public final void m40461C() {
            this.f53609e = Math.max(m40426y(this.f53610f), m40426y(this.f53611g)) + 1;
        }

        /* renamed from: D */
        public final void m40460D() {
            this.f53607c = TreeMultiset.distinctElements(this.f53610f) + 1 + TreeMultiset.distinctElements(this.f53611g);
            this.f53608d = this.f53606b + m40451M(this.f53610f) + m40451M(this.f53611g);
        }

        /* renamed from: E */
        public C7915e m40459E(Comparator comparator, Object obj, int i, int[] iArr) {
            int compare = comparator.compare(obj, m40427x());
            if (compare < 0) {
                C7915e c7915e = this.f53610f;
                if (c7915e == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f53610f = c7915e.m40459E(comparator, obj, i, iArr);
                int i2 = iArr[0];
                if (i2 > 0) {
                    if (i >= i2) {
                        this.f53607c--;
                        this.f53608d -= i2;
                    } else {
                        this.f53608d -= i;
                    }
                }
                if (i2 == 0) {
                    return this;
                }
                return m40463A();
            } else if (compare > 0) {
                C7915e c7915e2 = this.f53611g;
                if (c7915e2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f53611g = c7915e2.m40459E(comparator, obj, i, iArr);
                int i3 = iArr[0];
                if (i3 > 0) {
                    if (i >= i3) {
                        this.f53607c--;
                        this.f53608d -= i3;
                    } else {
                        this.f53608d -= i;
                    }
                }
                return m40463A();
            } else {
                int i4 = this.f53606b;
                iArr[0] = i4;
                if (i >= i4) {
                    return m40430u();
                }
                this.f53606b = i4 - i;
                this.f53608d -= i;
                return this;
            }
        }

        /* renamed from: F */
        public final C7915e m40458F(C7915e c7915e) {
            C7915e c7915e2 = this.f53611g;
            if (c7915e2 == null) {
                return this.f53610f;
            }
            this.f53611g = c7915e2.m40458F(c7915e);
            this.f53607c--;
            this.f53608d -= c7915e.f53606b;
            return m40463A();
        }

        /* renamed from: G */
        public final C7915e m40457G(C7915e c7915e) {
            C7915e c7915e2 = this.f53610f;
            if (c7915e2 == null) {
                return this.f53611g;
            }
            this.f53610f = c7915e2.m40457G(c7915e);
            this.f53607c--;
            this.f53608d -= c7915e.f53606b;
            return m40463A();
        }

        /* renamed from: H */
        public final C7915e m40456H() {
            boolean z;
            if (this.f53611g != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            C7915e c7915e = this.f53611g;
            this.f53611g = c7915e.f53610f;
            c7915e.f53610f = this;
            c7915e.f53608d = this.f53608d;
            c7915e.f53607c = this.f53607c;
            m40462B();
            c7915e.m40461C();
            return c7915e;
        }

        /* renamed from: I */
        public final C7915e m40455I() {
            boolean z;
            if (this.f53610f != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            C7915e c7915e = this.f53610f;
            this.f53610f = c7915e.f53611g;
            c7915e.f53611g = this;
            c7915e.f53608d = this.f53608d;
            c7915e.f53607c = this.f53607c;
            m40462B();
            c7915e.m40461C();
            return c7915e;
        }

        /* renamed from: J */
        public C7915e m40454J(Comparator comparator, Object obj, int i, int i2, int[] iArr) {
            int compare = comparator.compare(obj, m40427x());
            if (compare < 0) {
                C7915e c7915e = this.f53610f;
                if (c7915e == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        return m40435p(obj, i2);
                    }
                    return this;
                }
                this.f53610f = c7915e.m40454J(comparator, obj, i, i2, iArr);
                int i3 = iArr[0];
                if (i3 == i) {
                    if (i2 == 0 && i3 != 0) {
                        this.f53607c--;
                    } else if (i2 > 0 && i3 == 0) {
                        this.f53607c++;
                    }
                    this.f53608d += i2 - i3;
                }
                return m40463A();
            } else if (compare > 0) {
                C7915e c7915e2 = this.f53611g;
                if (c7915e2 == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        return m40434q(obj, i2);
                    }
                    return this;
                }
                this.f53611g = c7915e2.m40454J(comparator, obj, i, i2, iArr);
                int i4 = iArr[0];
                if (i4 == i) {
                    if (i2 == 0 && i4 != 0) {
                        this.f53607c--;
                    } else if (i2 > 0 && i4 == 0) {
                        this.f53607c++;
                    }
                    this.f53608d += i2 - i4;
                }
                return m40463A();
            } else {
                int i5 = this.f53606b;
                iArr[0] = i5;
                if (i == i5) {
                    if (i2 == 0) {
                        return m40430u();
                    }
                    this.f53608d += i2 - i5;
                    this.f53606b = i2;
                }
                return this;
            }
        }

        /* renamed from: K */
        public C7915e m40453K(Comparator comparator, Object obj, int i, int[] iArr) {
            int i2;
            int compare = comparator.compare(obj, m40427x());
            if (compare < 0) {
                C7915e c7915e = this.f53610f;
                if (c7915e == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        return m40435p(obj, i);
                    }
                    return this;
                }
                this.f53610f = c7915e.m40453K(comparator, obj, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f53607c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f53607c++;
                }
                this.f53608d += i - iArr[0];
                return m40463A();
            } else if (compare > 0) {
                C7915e c7915e2 = this.f53611g;
                if (c7915e2 == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        return m40434q(obj, i);
                    }
                    return this;
                }
                this.f53611g = c7915e2.m40453K(comparator, obj, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f53607c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f53607c++;
                }
                this.f53608d += i - iArr[0];
                return m40463A();
            } else {
                iArr[0] = this.f53606b;
                if (i == 0) {
                    return m40430u();
                }
                this.f53608d += i - i2;
                this.f53606b = i;
                return this;
            }
        }

        /* renamed from: L */
        public final C7915e m40452L() {
            C7915e c7915e = this.f53613i;
            Objects.requireNonNull(c7915e);
            return c7915e;
        }

        /* renamed from: o */
        public C7915e m40436o(Comparator comparator, Object obj, int i, int[] iArr) {
            int compare = comparator.compare(obj, m40427x());
            boolean z = true;
            if (compare < 0) {
                C7915e c7915e = this.f53610f;
                if (c7915e == null) {
                    iArr[0] = 0;
                    return m40435p(obj, i);
                }
                int i2 = c7915e.f53609e;
                C7915e m40436o = c7915e.m40436o(comparator, obj, i, iArr);
                this.f53610f = m40436o;
                if (iArr[0] == 0) {
                    this.f53607c++;
                }
                this.f53608d += i;
                if (m40436o.f53609e == i2) {
                    return this;
                }
                return m40463A();
            } else if (compare > 0) {
                C7915e c7915e2 = this.f53611g;
                if (c7915e2 == null) {
                    iArr[0] = 0;
                    return m40434q(obj, i);
                }
                int i3 = c7915e2.f53609e;
                C7915e m40436o2 = c7915e2.m40436o(comparator, obj, i, iArr);
                this.f53611g = m40436o2;
                if (iArr[0] == 0) {
                    this.f53607c++;
                }
                this.f53608d += i;
                if (m40436o2.f53609e == i3) {
                    return this;
                }
                return m40463A();
            } else {
                int i4 = this.f53606b;
                iArr[0] = i4;
                long j = i;
                if (i4 + j > 2147483647L) {
                    z = false;
                }
                Preconditions.checkArgument(z);
                this.f53606b += i;
                this.f53608d += j;
                return this;
            }
        }

        /* renamed from: p */
        public final C7915e m40435p(Object obj, int i) {
            this.f53610f = new C7915e(obj, i);
            TreeMultiset.successor(m40425z(), this.f53610f, this);
            this.f53609e = Math.max(2, this.f53609e);
            this.f53607c++;
            this.f53608d += i;
            return this;
        }

        /* renamed from: q */
        public final C7915e m40434q(Object obj, int i) {
            C7915e c7915e = new C7915e(obj, i);
            this.f53611g = c7915e;
            TreeMultiset.successor(this, c7915e, m40452L());
            this.f53609e = Math.max(2, this.f53609e);
            this.f53607c++;
            this.f53608d += i;
            return this;
        }

        /* renamed from: r */
        public final int m40433r() {
            return m40426y(this.f53610f) - m40426y(this.f53611g);
        }

        /* renamed from: s */
        public final C7915e m40432s(Comparator comparator, Object obj) {
            int compare = comparator.compare(obj, m40427x());
            if (compare < 0) {
                C7915e c7915e = this.f53610f;
                if (c7915e == null) {
                    return this;
                }
                return (C7915e) MoreObjects.firstNonNull(c7915e.m40432s(comparator, obj), this);
            } else if (compare == 0) {
                return this;
            } else {
                C7915e c7915e2 = this.f53611g;
                if (c7915e2 == null) {
                    return null;
                }
                return c7915e2.m40432s(comparator, obj);
            }
        }

        /* renamed from: t */
        public int m40431t(Comparator comparator, Object obj) {
            int compare = comparator.compare(obj, m40427x());
            if (compare < 0) {
                C7915e c7915e = this.f53610f;
                if (c7915e == null) {
                    return 0;
                }
                return c7915e.m40431t(comparator, obj);
            } else if (compare > 0) {
                C7915e c7915e2 = this.f53611g;
                if (c7915e2 == null) {
                    return 0;
                }
                return c7915e2.m40431t(comparator, obj);
            } else {
                return this.f53606b;
            }
        }

        public String toString() {
            return Multisets.immutableEntry(m40427x(), m40428w()).toString();
        }

        /* renamed from: u */
        public final C7915e m40430u() {
            int i = this.f53606b;
            this.f53606b = 0;
            TreeMultiset.successor(m40425z(), m40452L());
            C7915e c7915e = this.f53610f;
            if (c7915e == null) {
                return this.f53611g;
            }
            C7915e c7915e2 = this.f53611g;
            if (c7915e2 == null) {
                return c7915e;
            }
            if (c7915e.f53609e >= c7915e2.f53609e) {
                C7915e m40425z = m40425z();
                m40425z.f53610f = this.f53610f.m40458F(m40425z);
                m40425z.f53611g = this.f53611g;
                m40425z.f53607c = this.f53607c - 1;
                m40425z.f53608d = this.f53608d - i;
                return m40425z.m40463A();
            }
            C7915e m40452L = m40452L();
            m40452L.f53611g = this.f53611g.m40457G(m40452L);
            m40452L.f53610f = this.f53610f;
            m40452L.f53607c = this.f53607c - 1;
            m40452L.f53608d = this.f53608d - i;
            return m40452L.m40463A();
        }

        /* renamed from: v */
        public final C7915e m40429v(Comparator comparator, Object obj) {
            int compare = comparator.compare(obj, m40427x());
            if (compare > 0) {
                C7915e c7915e = this.f53611g;
                if (c7915e == null) {
                    return this;
                }
                return (C7915e) MoreObjects.firstNonNull(c7915e.m40429v(comparator, obj), this);
            } else if (compare == 0) {
                return this;
            } else {
                C7915e c7915e2 = this.f53610f;
                if (c7915e2 == null) {
                    return null;
                }
                return c7915e2.m40429v(comparator, obj);
            }
        }

        /* renamed from: w */
        public int m40428w() {
            return this.f53606b;
        }

        /* renamed from: x */
        public Object m40427x() {
            return AbstractC21396oJ0.m25936a(this.f53605a);
        }

        /* renamed from: z */
        public final C7915e m40425z() {
            C7915e c7915e = this.f53612h;
            Objects.requireNonNull(c7915e);
            return c7915e;
        }

        public C7915e() {
            this.f53605a = null;
            this.f53606b = 1;
        }
    }

    @Override // com.google.common.collect.AbstractC7951b, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(E e, int i, int i2) {
        AbstractC5406bs.m51814b(i2, "newCount");
        AbstractC5406bs.m51814b(i, "oldCount");
        Preconditions.checkArgument(this.range.contains(e));
        C7915e c7915e = (C7915e) this.rootReference.m40422c();
        if (c7915e != null) {
            int[] iArr = new int[1];
            this.rootReference.m40424a(c7915e, c7915e.m40454J(comparator(), e, i, i2, iArr));
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
