package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.common.collect.StandardTable;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
/* loaded from: classes4.dex */
public class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements RowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.common.collect.StandardRowSortedTable$b */
    /* loaded from: classes4.dex */
    public class C7861b extends StandardTable.C7879h implements SortedMap {
        public C7861b() {
            super();
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return StandardRowSortedTable.this.sortedBackingMap().comparator();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return StandardRowSortedTable.this.sortedBackingMap().firstKey();
        }

        @Override // com.google.common.collect.Maps.AbstractC7737M
        /* renamed from: g */
        public SortedSet mo40263b() {
            return new Maps.C7726D(this);
        }

        @Override // com.google.common.collect.Maps.AbstractC7737M, java.util.AbstractMap, java.util.Map
        /* renamed from: h */
        public SortedSet keySet() {
            return (SortedSet) super.keySet();
        }

        @Override // java.util.SortedMap
        public SortedMap headMap(Object obj) {
            Preconditions.checkNotNull(obj);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().headMap(obj), StandardRowSortedTable.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return StandardRowSortedTable.this.sortedBackingMap().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap subMap(Object obj, Object obj2) {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj2);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().subMap(obj, obj2), StandardRowSortedTable.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public SortedMap tailMap(Object obj) {
            Preconditions.checkNotNull(obj);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().tailMap(obj), StandardRowSortedTable.this.factory).rowMap();
        }
    }

    public StandardRowSortedTable(SortedMap<R, Map<C, V>> sortedMap, Supplier<? extends Map<C, V>> supplier) {
        super(sortedMap, supplier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SortedMap<R, Map<C, V>> sortedBackingMap() {
        return (SortedMap) this.backingMap;
    }

    @Override // com.google.common.collect.StandardTable
    public SortedMap<R, Map<C, V>> createRowMap() {
        return new C7861b();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public SortedSet<R> rowKeySet() {
        return (SortedSet) rowMap().keySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public SortedMap<R, Map<C, V>> rowMap() {
        return (SortedMap) super.rowMap();
    }
}