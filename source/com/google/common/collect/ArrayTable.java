package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import org.apache.commons.cli.HelpFormatter;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class ArrayTable<R, C, V> extends AbstractC7959e implements Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;
    private final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableList<C> columnList;
    @CheckForNull
    @LazyInit
    private transient ArrayTable<R, C, V>.C7571f columnMap;
    private final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableList<R> rowList;
    @CheckForNull
    @LazyInit
    private transient ArrayTable<R, C, V>.C7573h rowMap;

    /* renamed from: com.google.common.collect.ArrayTable$a */
    /* loaded from: classes4.dex */
    public class C7564a extends AbstractC1139Q {
        public C7564a(int i) {
            super(i);
        }

        @Override // p000.AbstractC1139Q
        /* renamed from: b */
        public Table.Cell mo40539a(int i) {
            return ArrayTable.this.getCell(i);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$b */
    /* loaded from: classes4.dex */
    public class C7565b extends Tables.AbstractC7901b {

        /* renamed from: a */
        public final int f53033a;

        /* renamed from: b */
        public final int f53034b;

        /* renamed from: c */
        public final /* synthetic */ int f53035c;

        /* renamed from: d */
        public final /* synthetic */ ArrayTable f53036d;

        public C7565b(ArrayTable arrayTable, int i) {
            this.f53035c = i;
            this.f53036d = arrayTable;
            this.f53033a = i / arrayTable.columnList.size();
            this.f53034b = i % arrayTable.columnList.size();
        }

        @Override // com.google.common.collect.Table.Cell
        public Object getColumnKey() {
            return this.f53036d.columnList.get(this.f53034b);
        }

        @Override // com.google.common.collect.Table.Cell
        public Object getRowKey() {
            return this.f53036d.rowList.get(this.f53033a);
        }

        @Override // com.google.common.collect.Table.Cell
        public Object getValue() {
            return this.f53036d.m41086at(this.f53033a, this.f53034b);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$c */
    /* loaded from: classes4.dex */
    public class C7566c extends AbstractC1139Q {
        public C7566c(int i) {
            super(i);
        }

        @Override // p000.AbstractC1139Q
        /* renamed from: a */
        public Object mo40539a(int i) {
            return ArrayTable.this.getValue(i);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$d */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7567d extends Maps.AbstractC7781x {

        /* renamed from: a */
        public final ImmutableMap f53038a;

        /* renamed from: com.google.common.collect.ArrayTable$d$a */
        /* loaded from: classes4.dex */
        public class C7568a extends AbstractC1646X {

            /* renamed from: a */
            public final /* synthetic */ int f53039a;

            /* renamed from: b */
            public final /* synthetic */ AbstractC7567d f53040b;

            public C7568a(AbstractC7567d abstractC7567d, int i) {
                this.f53039a = i;
                this.f53040b = abstractC7567d;
            }

            @Override // p000.AbstractC1646X, java.util.Map.Entry
            public Object getKey() {
                return this.f53040b.m41083c(this.f53039a);
            }

            @Override // p000.AbstractC1646X, java.util.Map.Entry
            public Object getValue() {
                return this.f53040b.mo41077f(this.f53039a);
            }

            @Override // p000.AbstractC1646X, java.util.Map.Entry
            public Object setValue(Object obj) {
                return this.f53040b.mo41076g(this.f53039a, obj);
            }
        }

        /* renamed from: com.google.common.collect.ArrayTable$d$b */
        /* loaded from: classes4.dex */
        public class C7569b extends AbstractC1139Q {
            public C7569b(int i) {
                super(i);
            }

            @Override // p000.AbstractC1139Q
            /* renamed from: b */
            public Map.Entry mo40539a(int i) {
                return AbstractC7567d.this.m41084b(i);
            }
        }

        public /* synthetic */ AbstractC7567d(ImmutableMap immutableMap, C7564a c7564a) {
            this(immutableMap);
        }

        @Override // com.google.common.collect.Maps.AbstractC7781x
        /* renamed from: a */
        public Iterator mo40388a() {
            return new C7569b(size());
        }

        /* renamed from: b */
        public Map.Entry m41084b(int i) {
            Preconditions.checkElementIndex(i, size());
            return new C7568a(this, i);
        }

        /* renamed from: c */
        public Object m41083c(int i) {
            return this.f53038a.keySet().asList().get(i);
        }

        @Override // com.google.common.collect.Maps.AbstractC7781x, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f53038a.containsKey(obj);
        }

        /* renamed from: e */
        public abstract String mo41078e();

        /* renamed from: f */
        public abstract Object mo41077f(int i);

        /* renamed from: g */
        public abstract Object mo41076g(int i, Object obj);

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            Integer num = (Integer) this.f53038a.get(obj);
            if (num == null) {
                return null;
            }
            return mo41077f(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f53038a.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return this.f53038a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            Integer num = (Integer) this.f53038a.get(obj);
            if (num != null) {
                return mo41076g(num.intValue(), obj2);
            }
            throw new IllegalArgumentException(mo41078e() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + obj + " not in " + this.f53038a.keySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f53038a.size();
        }

        public AbstractC7567d(ImmutableMap immutableMap) {
            this.f53038a = immutableMap;
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$e */
    /* loaded from: classes4.dex */
    public class C7570e extends AbstractC7567d {

        /* renamed from: b */
        public final int f53042b;

        public C7570e(int i) {
            super(ArrayTable.this.rowKeyToIndex, null);
            this.f53042b = i;
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC7567d
        /* renamed from: e */
        public String mo41078e() {
            return PDTableAttributeObject.SCOPE_ROW;
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC7567d
        /* renamed from: f */
        public Object mo41077f(int i) {
            return ArrayTable.this.m41086at(i, this.f53042b);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC7567d
        /* renamed from: g */
        public Object mo41076g(int i, Object obj) {
            return ArrayTable.this.set(i, this.f53042b, obj);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$f */
    /* loaded from: classes4.dex */
    public class C7571f extends AbstractC7567d {
        public /* synthetic */ C7571f(ArrayTable arrayTable, C7564a c7564a) {
            this();
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC7567d
        /* renamed from: e */
        public String mo41078e() {
            return PDTableAttributeObject.SCOPE_COLUMN;
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC7567d
        /* renamed from: h */
        public Map mo41077f(int i) {
            return new C7570e(i);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC7567d, java.util.AbstractMap, java.util.Map
        /* renamed from: i */
        public Map put(Object obj, Map map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC7567d
        /* renamed from: j */
        public Map mo41076g(int i, Map map) {
            throw new UnsupportedOperationException();
        }

        public C7571f() {
            super(ArrayTable.this.columnKeyToIndex, null);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$g */
    /* loaded from: classes4.dex */
    public class C7572g extends AbstractC7567d {

        /* renamed from: b */
        public final int f53045b;

        public C7572g(int i) {
            super(ArrayTable.this.columnKeyToIndex, null);
            this.f53045b = i;
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC7567d
        /* renamed from: e */
        public String mo41078e() {
            return PDTableAttributeObject.SCOPE_COLUMN;
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC7567d
        /* renamed from: f */
        public Object mo41077f(int i) {
            return ArrayTable.this.m41086at(this.f53045b, i);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC7567d
        /* renamed from: g */
        public Object mo41076g(int i, Object obj) {
            return ArrayTable.this.set(this.f53045b, i, obj);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$h */
    /* loaded from: classes4.dex */
    public class C7573h extends AbstractC7567d {
        public /* synthetic */ C7573h(ArrayTable arrayTable, C7564a c7564a) {
            this();
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC7567d
        /* renamed from: e */
        public String mo41078e() {
            return PDTableAttributeObject.SCOPE_ROW;
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC7567d
        /* renamed from: h */
        public Map mo41077f(int i) {
            return new C7572g(i);
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC7567d, java.util.AbstractMap, java.util.Map
        /* renamed from: i */
        public Map put(Object obj, Map map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.AbstractC7567d
        /* renamed from: j */
        public Map mo41076g(int i, Map map) {
            throw new UnsupportedOperationException();
        }

        public C7573h() {
            super(ArrayTable.this.rowKeyToIndex, null);
        }
    }

    private ArrayTable(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        ImmutableList<R> copyOf = ImmutableList.copyOf(iterable);
        this.rowList = copyOf;
        ImmutableList<C> copyOf2 = ImmutableList.copyOf(iterable2);
        this.columnList = copyOf2;
        Preconditions.checkArgument(copyOf.isEmpty() == copyOf2.isEmpty());
        this.rowKeyToIndex = Maps.m40687u(copyOf);
        this.columnKeyToIndex = Maps.m40687u(copyOf2);
        this.array = (V[][]) ((Object[][]) Array.newInstance(Object.class, copyOf.size(), copyOf2.size()));
        eraseAll();
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new ArrayTable<>(iterable, iterable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Table.Cell<R, C, V> getCell(int i) {
        return new C7565b(this, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public V getValue(int i) {
        return m41086at(i / this.columnList.size(), i % this.columnList.size());
    }

    @CheckForNull
    /* renamed from: at */
    public V m41086at(int i, int i2) {
        Preconditions.checkElementIndex(i, this.rowList.size());
        Preconditions.checkElementIndex(i2, this.columnList.size());
        return this.array[i][i2];
    }

    @Override // com.google.common.collect.AbstractC7959e
    public Iterator<Table.Cell<R, C, V>> cellIterator() {
        return new C7564a(size());
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(C c) {
        Preconditions.checkNotNull(c);
        Integer num = this.columnKeyToIndex.get(c);
        if (num == null) {
            return Collections.emptyMap();
        }
        return new C7570e(num.intValue());
    }

    public ImmutableList<C> columnKeyList() {
        return this.columnList;
    }

    @Override // com.google.common.collect.Table
    public Map<C, Map<R, V>> columnMap() {
        ArrayTable<R, C, V>.C7571f c7571f = this.columnMap;
        if (c7571f == null) {
            ArrayTable<R, C, V>.C7571f c7571f2 = new C7571f(this, null);
            this.columnMap = c7571f2;
            return c7571f2;
        }
        return c7571f;
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public boolean contains(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (containsRow(obj) && containsColumn(obj2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public boolean containsColumn(@CheckForNull Object obj) {
        return this.columnKeyToIndex.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public boolean containsRow(@CheckForNull Object obj) {
        return this.rowKeyToIndex.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public boolean containsValue(@CheckForNull Object obj) {
        V[][] vArr;
        for (V[] vArr2 : this.array) {
            for (V v : vArr2) {
                if (Objects.equal(obj, v)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public V erase(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return set(num.intValue(), num2.intValue(), null);
    }

    public void eraseAll() {
        for (V[] vArr : this.array) {
            Arrays.fill(vArr, (Object) null);
        }
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    @CheckForNull
    public V get(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num != null && num2 != null) {
            return m41086at(num.intValue(), num2.intValue());
        }
        return null;
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public boolean isEmpty() {
        if (!this.rowList.isEmpty() && !this.columnList.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    @CanIgnoreReturnValue
    @CheckForNull
    public V put(R r, C c, @CheckForNull V v) {
        boolean z;
        Preconditions.checkNotNull(r);
        Preconditions.checkNotNull(c);
        Integer num = this.rowKeyToIndex.get(r);
        boolean z2 = false;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Row %s not in %s", r, this.rowList);
        Integer num2 = this.columnKeyToIndex.get(c);
        if (num2 != null) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "Column %s not in %s", c, this.columnList);
        return set(num.intValue(), num2.intValue(), v);
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        super.putAll(table);
    }

    @Override // com.google.common.collect.Table
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(R r) {
        Preconditions.checkNotNull(r);
        Integer num = this.rowKeyToIndex.get(r);
        if (num == null) {
            return Collections.emptyMap();
        }
        return new C7572g(num.intValue());
    }

    public ImmutableList<R> rowKeyList() {
        return this.rowList;
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
        ArrayTable<R, C, V>.C7573h c7573h = this.rowMap;
        if (c7573h == null) {
            ArrayTable<R, C, V>.C7573h c7573h2 = new C7573h(this, null);
            this.rowMap = c7573h2;
            return c7573h2;
        }
        return c7573h;
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public V set(int i, int i2, @CheckForNull V v) {
        Preconditions.checkElementIndex(i, this.rowList.size());
        Preconditions.checkElementIndex(i2, this.columnList.size());
        V[] vArr = this.array[i];
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.rowList.size() * this.columnList.size();
    }

    @GwtIncompatible
    public V[][] toArray(Class<V> cls) {
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) cls, this.rowList.size(), this.columnList.size()));
        for (int i = 0; i < this.rowList.size(); i++) {
            V[] vArr2 = this.array[i];
            System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
        return vArr;
    }

    @Override // com.google.common.collect.AbstractC7959e
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractC7959e, com.google.common.collect.Table
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractC7959e
    public Iterator<V> valuesIterator() {
        return new C7566c(size());
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Table<R, C, ? extends V> table) {
        if (table instanceof ArrayTable) {
            return new ArrayTable<>((ArrayTable) table);
        }
        return new ArrayTable<>(table);
    }

    @Override // com.google.common.collect.Table
    public ImmutableSet<C> columnKeySet() {
        return this.columnKeyToIndex.keySet();
    }

    @Override // com.google.common.collect.Table
    public ImmutableSet<R> rowKeySet() {
        return this.rowKeyToIndex.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayTable(Table<R, C, ? extends V> table) {
        this(table.rowKeySet(), table.columnKeySet());
        putAll(table);
    }

    private ArrayTable(ArrayTable<R, C, V> arrayTable) {
        ImmutableList<R> immutableList = arrayTable.rowList;
        this.rowList = immutableList;
        ImmutableList<C> immutableList2 = arrayTable.columnList;
        this.columnList = immutableList2;
        this.rowKeyToIndex = arrayTable.rowKeyToIndex;
        this.columnKeyToIndex = arrayTable.columnKeyToIndex;
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance(Object.class, immutableList.size(), immutableList2.size()));
        this.array = vArr;
        for (int i = 0; i < this.rowList.size(); i++) {
            V[] vArr2 = arrayTable.array[i];
            System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
    }
}
