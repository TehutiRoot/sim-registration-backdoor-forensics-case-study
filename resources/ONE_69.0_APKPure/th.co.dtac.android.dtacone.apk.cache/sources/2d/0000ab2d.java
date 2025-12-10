package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.common.collect.StandardTable;
import com.google.common.collect.TreeBasedTable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import javax.annotation.CheckForNull;

@GwtCompatible(serializable = true)
/* loaded from: classes4.dex */
public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;
    private final Comparator<? super C> columnComparator;

    /* loaded from: classes4.dex */
    public static class Factory<C, V> implements Supplier<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super C> comparator;

        public Factory(Comparator<? super C> comparator) {
            this.comparator = comparator;
        }

        @Override // com.google.common.base.Supplier
        public Map<C, V> get() {
            return new TreeMap(this.comparator);
        }
    }

    /* renamed from: com.google.common.collect.TreeBasedTable$a */
    /* loaded from: classes4.dex */
    public class C7896a extends AbstractIterator {

        /* renamed from: c */
        public Object f53600c;

        /* renamed from: d */
        public final /* synthetic */ Iterator f53601d;

        /* renamed from: e */
        public final /* synthetic */ Comparator f53602e;

        /* renamed from: f */
        public final /* synthetic */ TreeBasedTable f53603f;

        public C7896a(TreeBasedTable treeBasedTable, Iterator it, Comparator comparator) {
            this.f53601d = it;
            this.f53602e = comparator;
            this.f53603f = treeBasedTable;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0008  */
        @Override // com.google.common.collect.AbstractIterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object computeNext() {
            /*
                r3 = this;
            L0:
                java.util.Iterator r0 = r3.f53601d
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L1e
                java.util.Iterator r0 = r3.f53601d
                java.lang.Object r0 = r0.next()
                java.lang.Object r1 = r3.f53600c
                if (r1 == 0) goto L1b
                java.util.Comparator r2 = r3.f53602e
                int r1 = r2.compare(r0, r1)
                if (r1 != 0) goto L1b
                goto L0
            L1b:
                r3.f53600c = r0
                return r0
            L1e:
                r0 = 0
                r3.f53600c = r0
                java.lang.Object r0 = r3.endOfData()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeBasedTable.C7896a.computeNext():java.lang.Object");
        }
    }

    /* renamed from: com.google.common.collect.TreeBasedTable$b */
    /* loaded from: classes4.dex */
    public class C7897b extends StandardTable.C7876g implements SortedMap {

        /* renamed from: d */
        public final Object f53604d;

        /* renamed from: e */
        public final Object f53605e;

        /* renamed from: f */
        public transient SortedMap f53606f;

        public C7897b(TreeBasedTable treeBasedTable, Object obj) {
            this(obj, null, null);
        }

        @Override // com.google.common.collect.StandardTable.C7876g
        /* renamed from: c */
        public void mo40460c() {
            m40455k();
            SortedMap sortedMap = this.f53606f;
            if (sortedMap != null && sortedMap.isEmpty()) {
                TreeBasedTable.this.backingMap.remove(this.f53576a);
                this.f53606f = null;
                this.f53577b = null;
            }
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return TreeBasedTable.this.columnComparator();
        }

        @Override // com.google.common.collect.StandardTable.C7876g, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (m40456j(obj) && super.containsKey(obj)) {
                return true;
            }
            return false;
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            m40513e();
            Map map = this.f53577b;
            if (map != null) {
                return ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        /* renamed from: g */
        public int m40459g(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        @Override // com.google.common.collect.StandardTable.C7876g
        /* renamed from: h */
        public SortedMap mo40461b() {
            m40455k();
            SortedMap sortedMap = this.f53606f;
            if (sortedMap != null) {
                Object obj = this.f53604d;
                if (obj != null) {
                    sortedMap = sortedMap.tailMap(obj);
                }
                Object obj2 = this.f53605e;
                if (obj2 != null) {
                    return sortedMap.headMap(obj2);
                }
                return sortedMap;
            }
            return null;
        }

        @Override // java.util.SortedMap
        public SortedMap headMap(Object obj) {
            Preconditions.checkArgument(m40456j(Preconditions.checkNotNull(obj)));
            return new C7897b(this.f53576a, this.f53604d, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* renamed from: i */
        public SortedSet keySet() {
            return new Maps.C7726D(this);
        }

        /* renamed from: j */
        public boolean m40456j(Object obj) {
            Object obj2;
            Object obj3;
            if (obj != null && (((obj2 = this.f53604d) == null || m40459g(obj2, obj) <= 0) && ((obj3 = this.f53605e) == null || m40459g(obj3, obj) > 0))) {
                return true;
            }
            return false;
        }

        /* renamed from: k */
        public void m40455k() {
            SortedMap sortedMap = this.f53606f;
            if (sortedMap == null || (sortedMap.isEmpty() && TreeBasedTable.this.backingMap.containsKey(this.f53576a))) {
                this.f53606f = (SortedMap) TreeBasedTable.this.backingMap.get(this.f53576a);
            }
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            m40513e();
            Map map = this.f53577b;
            if (map != null) {
                return ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.StandardTable.C7876g, java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            Preconditions.checkArgument(m40456j(Preconditions.checkNotNull(obj)));
            return super.put(obj, obj2);
        }

        @Override // java.util.SortedMap
        public SortedMap subMap(Object obj, Object obj2) {
            boolean z;
            if (m40456j(Preconditions.checkNotNull(obj)) && m40456j(Preconditions.checkNotNull(obj2))) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            return new C7897b(this.f53576a, obj, obj2);
        }

        @Override // java.util.SortedMap
        public SortedMap tailMap(Object obj) {
            Preconditions.checkArgument(m40456j(Preconditions.checkNotNull(obj)));
            return new C7897b(this.f53576a, obj, this.f53605e);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7897b(Object obj, Object obj2, Object obj3) {
            super(obj);
            TreeBasedTable.this = r1;
            this.f53604d = obj2;
            this.f53605e = obj3;
            Preconditions.checkArgument(obj2 == null || obj3 == null || m40459g(obj2, obj3) <= 0);
        }
    }

    public TreeBasedTable(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        super(new TreeMap(comparator), new Factory(comparator2));
        this.columnComparator = comparator2;
    }

    /* renamed from: a */
    public static /* synthetic */ Iterator m40462a(Map map) {
        return lambda$createColumnKeyIterator$0(map);
    }

    public static <R extends Comparable, C extends Comparable, V> TreeBasedTable<R, C, V> create() {
        return new TreeBasedTable<>(Ordering.natural(), Ordering.natural());
    }

    public static /* synthetic */ Iterator lambda$createColumnKeyIterator$0(Map map) {
        return map.keySet().iterator();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC7948e, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC7948e, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    @Deprecated
    public Comparator<? super C> columnComparator() {
        return this.columnComparator;
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC7948e, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.contains(obj, obj2);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC7948e, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsColumn(@CheckForNull Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC7948e, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsRow(@CheckForNull Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC7948e, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsValue(@CheckForNull Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.StandardTable
    public Iterator<C> createColumnKeyIterator() {
        Comparator<? super C> columnComparator = columnComparator();
        return new C7896a(this, Iterators.mergeSorted(Iterables.transform(this.backingMap.values(), new Function() { // from class: BW1
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return TreeBasedTable.m40462a((Map) obj);
            }
        }), columnComparator), columnComparator);
    }

    @Override // com.google.common.collect.AbstractC7948e, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC7948e, com.google.common.collect.Table
    @CheckForNull
    public /* bridge */ /* synthetic */ Object get(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC7948e, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC7948e, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC7948e, com.google.common.collect.Table
    @CanIgnoreReturnValue
    @CheckForNull
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    @Override // com.google.common.collect.AbstractC7948e, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void putAll(Table table) {
        super.putAll(table);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    @CheckForNull
    public /* bridge */ /* synthetic */ Object remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.remove(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map row(Object obj) {
        return row((TreeBasedTable<R, C, V>) obj);
    }

    @Deprecated
    public Comparator<? super R> rowComparator() {
        Comparator<? super R> comparator = rowKeySet().comparator();
        Objects.requireNonNull(comparator);
        return comparator;
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractC7948e
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractC7948e, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(comparator2);
        return new TreeBasedTable<>(comparator, comparator2);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public SortedMap<C, V> row(R r) {
        return new C7897b(this, r);
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.Table
    public SortedSet<R> rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.Table
    public SortedMap<R, Map<C, V>> rowMap() {
        return super.rowMap();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(TreeBasedTable<R, C, ? extends V> treeBasedTable) {
        TreeBasedTable<R, C, V> treeBasedTable2 = new TreeBasedTable<>(treeBasedTable.rowComparator(), treeBasedTable.columnComparator());
        treeBasedTable2.putAll(treeBasedTable);
        return treeBasedTable2;
    }
}