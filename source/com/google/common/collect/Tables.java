package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

@GwtCompatible
/* loaded from: classes4.dex */
public final class Tables {

    /* renamed from: a */
    public static final Function f53581a = new C7900a();

    /* loaded from: classes4.dex */
    public static final class ImmutableCell<R, C, V> extends AbstractC7901b implements Serializable {
        private static final long serialVersionUID = 0;
        private final C columnKey;
        private final R rowKey;
        private final V value;

        public ImmutableCell(R r, C c, V v) {
            this.rowKey = r;
            this.columnKey = c;
            this.value = v;
        }

        @Override // com.google.common.collect.Table.Cell
        public C getColumnKey() {
            return this.columnKey;
        }

        @Override // com.google.common.collect.Table.Cell
        public R getRowKey() {
            return this.rowKey;
        }

        @Override // com.google.common.collect.Table.Cell
        public V getValue() {
            return this.value;
        }
    }

    /* loaded from: classes4.dex */
    public static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements RowSortedTable<R, C, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableRowSortedMap(RowSortedTable<R, ? extends C, ? extends V> rowSortedTable) {
            super(rowSortedTable);
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public SortedSet<R> rowKeySet() {
            return Collections.unmodifiableSortedSet(delegate().rowKeySet());
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public SortedMap<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableSortedMap(Maps.transformValues((SortedMap) delegate().rowMap(), Tables.m40481e()));
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public RowSortedTable<R, C, V> delegate() {
            return (RowSortedTable) super.delegate();
        }
    }

    /* loaded from: classes4.dex */
    public static class UnmodifiableTable<R, C, V> extends ForwardingTable<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final Table<? extends R, ? extends C, ? extends V> delegate;

        public UnmodifiableTable(Table<? extends R, ? extends C, ? extends V> table) {
            this.delegate = (Table) Preconditions.checkNotNull(table);
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<Table.Cell<R, C, V>> cellSet() {
            return Collections.unmodifiableSet(super.cellSet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<R, V> column(C c) {
            return Collections.unmodifiableMap(super.column(c));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<C> columnKeySet() {
            return Collections.unmodifiableSet(super.columnKeySet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<C, Map<R, V>> columnMap() {
            return Collections.unmodifiableMap(Maps.transformValues(super.columnMap(), Tables.m40481e()));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        @CheckForNull
        public V put(R r, C c, V v) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        @CheckForNull
        public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<C, V> row(R r) {
            return Collections.unmodifiableMap(super.row(r));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<R> rowKeySet() {
            return Collections.unmodifiableSet(super.rowKeySet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableMap(Maps.transformValues(super.rowMap(), Tables.m40481e()));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Collection<V> values() {
            return Collections.unmodifiableCollection(super.values());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        public Table<R, C, V> delegate() {
            return (Table<? extends R, ? extends C, ? extends V>) this.delegate;
        }
    }

    /* renamed from: com.google.common.collect.Tables$a */
    /* loaded from: classes4.dex */
    public class C7900a implements Function {
        @Override // com.google.common.base.Function
        /* renamed from: a */
        public Map apply(Map map) {
            return Collections.unmodifiableMap(map);
        }
    }

    /* renamed from: com.google.common.collect.Tables$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7901b implements Table.Cell {
        @Override // com.google.common.collect.Table.Cell
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            if (Objects.equal(getRowKey(), cell.getRowKey()) && Objects.equal(getColumnKey(), cell.getColumnKey()) && Objects.equal(getValue(), cell.getValue())) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.Table.Cell
        public int hashCode() {
            return Objects.hashCode(getRowKey(), getColumnKey(), getValue());
        }

        public String toString() {
            return "(" + getRowKey() + "," + getColumnKey() + ")=" + getValue();
        }
    }

    /* renamed from: com.google.common.collect.Tables$c */
    /* loaded from: classes4.dex */
    public static class C7902c extends AbstractC7959e {

        /* renamed from: a */
        public final Table f53582a;

        /* renamed from: b */
        public final Function f53583b;

        /* renamed from: com.google.common.collect.Tables$c$a */
        /* loaded from: classes4.dex */
        public class C7903a implements Function {
            public C7903a() {
                C7902c.this = r1;
            }

            @Override // com.google.common.base.Function
            /* renamed from: a */
            public Table.Cell apply(Table.Cell cell) {
                return Tables.immutableCell(cell.getRowKey(), cell.getColumnKey(), C7902c.this.f53583b.apply(cell.getValue()));
            }
        }

        /* renamed from: com.google.common.collect.Tables$c$b */
        /* loaded from: classes4.dex */
        public class C7904b implements Function {
            public C7904b() {
                C7902c.this = r1;
            }

            @Override // com.google.common.base.Function
            /* renamed from: a */
            public Map apply(Map map) {
                return Maps.transformValues(map, C7902c.this.f53583b);
            }
        }

        /* renamed from: com.google.common.collect.Tables$c$c */
        /* loaded from: classes4.dex */
        public class C7905c implements Function {
            public C7905c() {
                C7902c.this = r1;
            }

            @Override // com.google.common.base.Function
            /* renamed from: a */
            public Map apply(Map map) {
                return Maps.transformValues(map, C7902c.this.f53583b);
            }
        }

        public C7902c(Table table, Function function) {
            this.f53582a = (Table) Preconditions.checkNotNull(table);
            this.f53583b = (Function) Preconditions.checkNotNull(function);
        }

        /* renamed from: a */
        public Function m40479a() {
            return new C7903a();
        }

        @Override // com.google.common.collect.AbstractC7959e
        public Iterator cellIterator() {
            return Iterators.transform(this.f53582a.cellSet().iterator(), m40479a());
        }

        @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
        public void clear() {
            this.f53582a.clear();
        }

        @Override // com.google.common.collect.Table
        public Map column(Object obj) {
            return Maps.transformValues(this.f53582a.column(obj), this.f53583b);
        }

        @Override // com.google.common.collect.Table
        public Set columnKeySet() {
            return this.f53582a.columnKeySet();
        }

        @Override // com.google.common.collect.Table
        public Map columnMap() {
            return Maps.transformValues(this.f53582a.columnMap(), new C7905c());
        }

        @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
        public boolean contains(Object obj, Object obj2) {
            return this.f53582a.contains(obj, obj2);
        }

        @Override // com.google.common.collect.AbstractC7959e
        public Collection createValues() {
            return Collections2.transform(this.f53582a.values(), this.f53583b);
        }

        @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
        public Object get(Object obj, Object obj2) {
            if (contains(obj, obj2)) {
                return this.f53583b.apply(AbstractC21396oJ0.m25936a(this.f53582a.get(obj, obj2)));
            }
            return null;
        }

        @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
        public Object put(Object obj, Object obj2, Object obj3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
        public void putAll(Table table) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Table
        public Object remove(Object obj, Object obj2) {
            if (contains(obj, obj2)) {
                return this.f53583b.apply(AbstractC21396oJ0.m25936a(this.f53582a.remove(obj, obj2)));
            }
            return null;
        }

        @Override // com.google.common.collect.Table
        public Map row(Object obj) {
            return Maps.transformValues(this.f53582a.row(obj), this.f53583b);
        }

        @Override // com.google.common.collect.Table
        public Set rowKeySet() {
            return this.f53582a.rowKeySet();
        }

        @Override // com.google.common.collect.Table
        public Map rowMap() {
            return Maps.transformValues(this.f53582a.rowMap(), new C7904b());
        }

        @Override // com.google.common.collect.Table
        public int size() {
            return this.f53582a.size();
        }
    }

    /* renamed from: com.google.common.collect.Tables$d */
    /* loaded from: classes4.dex */
    public static class C7906d extends AbstractC7959e {

        /* renamed from: a */
        public final Table f53587a;

        public C7906d(Table table) {
            this.f53587a = (Table) Preconditions.checkNotNull(table);
        }

        /* renamed from: a */
        public static /* synthetic */ Table.Cell m40475a(Table.Cell cell) {
            return Tables.m40485a(cell);
        }

        @Override // com.google.common.collect.AbstractC7959e
        public Iterator cellIterator() {
            return Iterators.transform(this.f53587a.cellSet().iterator(), new Function() { // from class: KQ1
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return Tables.C7906d.m40475a((Table.Cell) obj);
                }
            });
        }

        @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
        public void clear() {
            this.f53587a.clear();
        }

        @Override // com.google.common.collect.Table
        public Map column(Object obj) {
            return this.f53587a.row(obj);
        }

        @Override // com.google.common.collect.Table
        public Set columnKeySet() {
            return this.f53587a.rowKeySet();
        }

        @Override // com.google.common.collect.Table
        public Map columnMap() {
            return this.f53587a.rowMap();
        }

        @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
        public boolean contains(Object obj, Object obj2) {
            return this.f53587a.contains(obj2, obj);
        }

        @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
        public boolean containsColumn(Object obj) {
            return this.f53587a.containsRow(obj);
        }

        @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
        public boolean containsRow(Object obj) {
            return this.f53587a.containsColumn(obj);
        }

        @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
        public boolean containsValue(Object obj) {
            return this.f53587a.containsValue(obj);
        }

        @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
        public Object get(Object obj, Object obj2) {
            return this.f53587a.get(obj2, obj);
        }

        @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
        public Object put(Object obj, Object obj2, Object obj3) {
            return this.f53587a.put(obj2, obj, obj3);
        }

        @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
        public void putAll(Table table) {
            this.f53587a.putAll(Tables.transpose(table));
        }

        @Override // com.google.common.collect.Table
        public Object remove(Object obj, Object obj2) {
            return this.f53587a.remove(obj2, obj);
        }

        @Override // com.google.common.collect.Table
        public Map row(Object obj) {
            return this.f53587a.column(obj);
        }

        @Override // com.google.common.collect.Table
        public Set rowKeySet() {
            return this.f53587a.columnKeySet();
        }

        @Override // com.google.common.collect.Table
        public Map rowMap() {
            return this.f53587a.columnMap();
        }

        @Override // com.google.common.collect.Table
        public int size() {
            return this.f53587a.size();
        }

        @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
        public Collection values() {
            return this.f53587a.values();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Table.Cell m40485a(Table.Cell cell) {
        return m40482d(cell);
    }

    /* renamed from: c */
    public static boolean m40483c(Table table, Object obj) {
        if (obj == table) {
            return true;
        }
        if (obj instanceof Table) {
            return table.cellSet().equals(((Table) obj).cellSet());
        }
        return false;
    }

    /* renamed from: d */
    public static Table.Cell m40482d(Table.Cell cell) {
        return immutableCell(cell.getColumnKey(), cell.getRowKey(), cell.getValue());
    }

    /* renamed from: e */
    public static Function m40481e() {
        return f53581a;
    }

    public static <R, C, V> Table.Cell<R, C, V> immutableCell(R r, C c, V v) {
        return new ImmutableCell(r, c, v);
    }

    public static <R, C, V> Table<R, C, V> newCustomTable(Map<R, Map<C, V>> map, Supplier<? extends Map<C, V>> supplier) {
        Preconditions.checkArgument(map.isEmpty());
        Preconditions.checkNotNull(supplier);
        return new StandardTable(map, supplier);
    }

    @J2ktIncompatible
    public static <R, C, V> Table<R, C, V> synchronizedTable(Table<R, C, V> table) {
        return Synchronized.m40491z(table, null);
    }

    public static <T, R, C, V, I extends Table<R, C, V>> Collector<T, ?, I> toTable(java.util.function.Function<? super T, ? extends R> function, java.util.function.Function<? super T, ? extends C> function2, java.util.function.Function<? super T, ? extends V> function3, java.util.function.Supplier<I> supplier) {
        return AbstractC7989o.m40182u(function, function2, function3, supplier);
    }

    public static <R, C, V1, V2> Table<R, C, V2> transformValues(Table<R, C, V1> table, Function<? super V1, V2> function) {
        return new C7902c(table, function);
    }

    public static <R, C, V> Table<C, R, V> transpose(Table<R, C, V> table) {
        if (table instanceof C7906d) {
            return ((C7906d) table).f53587a;
        }
        return new C7906d(table);
    }

    public static <R, C, V> RowSortedTable<R, C, V> unmodifiableRowSortedTable(RowSortedTable<R, ? extends C, ? extends V> rowSortedTable) {
        return new UnmodifiableRowSortedMap(rowSortedTable);
    }

    public static <R, C, V> Table<R, C, V> unmodifiableTable(Table<? extends R, ? extends C, ? extends V> table) {
        return new UnmodifiableTable(table);
    }

    public static <T, R, C, V, I extends Table<R, C, V>> Collector<T, ?, I> toTable(java.util.function.Function<? super T, ? extends R> function, java.util.function.Function<? super T, ? extends C> function2, java.util.function.Function<? super T, ? extends V> function3, BinaryOperator<V> binaryOperator, java.util.function.Supplier<I> supplier) {
        return AbstractC7989o.m40183t(function, function2, function3, binaryOperator, supplier);
    }
}
