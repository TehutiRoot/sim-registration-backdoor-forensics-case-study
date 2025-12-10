package com.google.common.collect;

import com.google.common.collect.Table;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.google.common.collect.e */
/* loaded from: classes4.dex */
public abstract class AbstractC7959e implements Table {
    @CheckForNull
    @LazyInit
    private transient Set<Table.Cell<Object, Object, Object>> cellSet;
    @CheckForNull
    @LazyInit
    private transient Collection<Object> values;

    /* renamed from: com.google.common.collect.e$a */
    /* loaded from: classes4.dex */
    public class C7960a extends YU1 {
        public C7960a(Iterator it) {
            super(it);
        }

        @Override // p000.YU1
        /* renamed from: b */
        public Object mo40369a(Table.Cell cell) {
            return cell.getValue();
        }
    }

    /* renamed from: com.google.common.collect.e$b */
    /* loaded from: classes4.dex */
    public class C7961b extends AbstractSet {
        public C7961b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC7959e.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Map map = (Map) Maps.m40721G(AbstractC7959e.this.rowMap(), cell.getRowKey());
            if (map == null || !Collections2.m41062f(map.entrySet(), Maps.immutableEntry(cell.getColumnKey(), cell.getValue()))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return AbstractC7959e.this.cellIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Map map = (Map) Maps.m40721G(AbstractC7959e.this.rowMap(), cell.getRowKey());
            if (map == null || !Collections2.m41061g(map.entrySet(), Maps.immutableEntry(cell.getColumnKey(), cell.getValue()))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC7959e.this.size();
        }
    }

    /* renamed from: com.google.common.collect.e$c */
    /* loaded from: classes4.dex */
    public class C7962c extends AbstractCollection {
        public C7962c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC7959e.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC7959e.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC7959e.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC7959e.this.size();
        }
    }

    public abstract Iterator cellIterator();

    @Override // com.google.common.collect.Table
    public Set cellSet() {
        Set<Table.Cell<Object, Object, Object>> set = this.cellSet;
        if (set == null) {
            Set<Table.Cell<Object, Object, Object>> createCellSet = createCellSet();
            this.cellSet = createCellSet;
            return createCellSet;
        }
        return set;
    }

    @Override // com.google.common.collect.Table
    public abstract void clear();

    @Override // com.google.common.collect.Table
    public boolean contains(Object obj, Object obj2) {
        Map map = (Map) Maps.m40721G(rowMap(), obj);
        if (map != null && Maps.m40722F(map, obj2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.Table
    public boolean containsColumn(Object obj) {
        return Maps.m40722F(columnMap(), obj);
    }

    @Override // com.google.common.collect.Table
    public boolean containsRow(Object obj) {
        return Maps.m40722F(rowMap(), obj);
    }

    @Override // com.google.common.collect.Table
    public boolean containsValue(Object obj) {
        for (Map map : rowMap().values()) {
            if (map.containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public Set<Table.Cell<Object, Object, Object>> createCellSet() {
        return new C7961b();
    }

    public Collection<Object> createValues() {
        return new C7962c();
    }

    @Override // com.google.common.collect.Table
    public boolean equals(@CheckForNull Object obj) {
        return Tables.m40483c(this, obj);
    }

    @Override // com.google.common.collect.Table
    public Object get(Object obj, Object obj2) {
        Map map = (Map) Maps.m40721G(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return Maps.m40721G(map, obj2);
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
        return cellSet().hashCode();
    }

    @Override // com.google.common.collect.Table
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.Table
    public abstract Object put(Object obj, Object obj2, Object obj3);

    @Override // com.google.common.collect.Table
    public void putAll(Table<Object, Object, Object> table) {
        for (Table.Cell<Object, Object, Object> cell : table.cellSet()) {
            put(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
        }
    }

    public String toString() {
        return rowMap().toString();
    }

    @Override // com.google.common.collect.Table
    public Collection values() {
        Collection<Object> collection = this.values;
        if (collection == null) {
            Collection<Object> createValues = createValues();
            this.values = createValues;
            return createValues;
        }
        return collection;
    }

    public Iterator<Object> valuesIterator() {
        return new C7960a(cellSet().iterator());
    }
}
