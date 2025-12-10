package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractC7978o;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* renamed from: com.google.common.collect.o */
/* loaded from: classes4.dex */
public abstract class AbstractC7978o {

    /* renamed from: com.google.common.collect.o$b */
    /* loaded from: classes4.dex */
    public static final class C7980b {

        /* renamed from: a */
        public final List f53735a;

        /* renamed from: b */
        public final Table f53736b;

        public C7980b() {
            this.f53735a = new ArrayList();
            this.f53736b = HashBasedTable.create();
        }

        /* renamed from: a */
        public C7980b m40172a(C7980b c7980b, BinaryOperator binaryOperator) {
            for (C7981c c7981c : c7980b.f53735a) {
                m40171b(c7981c.getRowKey(), c7981c.getColumnKey(), c7981c.getValue(), binaryOperator);
            }
            return this;
        }

        /* renamed from: b */
        public void m40171b(Object obj, Object obj2, Object obj3, BinaryOperator binaryOperator) {
            C7981c c7981c = (C7981c) this.f53736b.get(obj, obj2);
            if (c7981c == null) {
                C7981c c7981c2 = new C7981c(obj, obj2, obj3);
                this.f53735a.add(c7981c2);
                this.f53736b.put(obj, obj2, c7981c2);
                return;
            }
            c7981c.m40169a(obj3, binaryOperator);
        }

        /* renamed from: c */
        public ImmutableTable m40170c() {
            return ImmutableTable.copyOf(this.f53735a);
        }
    }

    /* renamed from: com.google.common.collect.o$c */
    /* loaded from: classes4.dex */
    public static final class C7981c extends Tables.AbstractC7890b {

        /* renamed from: a */
        public final Object f53737a;

        /* renamed from: b */
        public final Object f53738b;

        /* renamed from: c */
        public Object f53739c;

        public C7981c(Object obj, Object obj2, Object obj3) {
            this.f53737a = Preconditions.checkNotNull(obj, "row");
            this.f53738b = Preconditions.checkNotNull(obj2, "column");
            this.f53739c = Preconditions.checkNotNull(obj3, "value");
        }

        /* renamed from: a */
        public void m40169a(Object obj, BinaryOperator binaryOperator) {
            Object apply;
            Preconditions.checkNotNull(obj, "value");
            apply = binaryOperator.apply(this.f53739c, obj);
            this.f53739c = Preconditions.checkNotNull(apply, "mergeFunction.apply");
        }

        @Override // com.google.common.collect.Table.Cell
        public Object getColumnKey() {
            return this.f53738b;
        }

        @Override // com.google.common.collect.Table.Cell
        public Object getRowKey() {
            return this.f53737a;
        }

        @Override // com.google.common.collect.Table.Cell
        public Object getValue() {
            return this.f53739c;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m40193a(Function function, Function function2, Function function3, BinaryOperator binaryOperator, C7980b c7980b, Object obj) {
        m40183k(function, function2, function3, binaryOperator, c7980b, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m40192b(Object obj, Object obj2) {
        return m40180n(obj, obj2);
    }

    /* renamed from: c */
    public static /* synthetic */ void m40191c(Function function, Function function2, Function function3, BinaryOperator binaryOperator, Table table, Object obj) {
        m40179o(function, function2, function3, binaryOperator, table, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ ImmutableTable m40190d(C7980b c7980b) {
        return c7980b.m40170c();
    }

    /* renamed from: e */
    public static /* synthetic */ C7980b m40189e(BinaryOperator binaryOperator, C7980b c7980b, C7980b c7980b2) {
        return c7980b.m40172a(c7980b2, binaryOperator);
    }

    /* renamed from: f */
    public static /* synthetic */ C7980b m40188f() {
        return m40184j();
    }

    /* renamed from: g */
    public static /* synthetic */ Table m40187g(BinaryOperator binaryOperator, Table table, Table table2) {
        return m40178p(binaryOperator, table, table2);
    }

    /* renamed from: h */
    public static /* synthetic */ void m40186h(Function function, Function function2, Function function3, ImmutableTable.Builder builder, Object obj) {
        m40185i(function, function2, function3, builder, obj);
    }

    /* renamed from: i */
    public static /* synthetic */ void m40185i(Function function, Function function2, Function function3, ImmutableTable.Builder builder, Object obj) {
        Object apply;
        Object apply2;
        Object apply3;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        apply3 = function3.apply(obj);
        builder.put(apply, apply2, apply3);
    }

    /* renamed from: j */
    public static /* synthetic */ C7980b m40184j() {
        return new C7980b();
    }

    /* renamed from: k */
    public static /* synthetic */ void m40183k(Function function, Function function2, Function function3, BinaryOperator binaryOperator, C7980b c7980b, Object obj) {
        Object apply;
        Object apply2;
        Object apply3;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        apply3 = function3.apply(obj);
        c7980b.m40171b(apply, apply2, apply3, binaryOperator);
    }

    /* renamed from: n */
    public static /* synthetic */ Object m40180n(Object obj, Object obj2) {
        throw new IllegalStateException("Conflicting values " + obj + " and " + obj2);
    }

    /* renamed from: o */
    public static /* synthetic */ void m40179o(Function function, Function function2, Function function3, BinaryOperator binaryOperator, Table table, Object obj) {
        Object apply;
        Object apply2;
        Object apply3;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        apply3 = function3.apply(obj);
        m40177q(table, apply, apply2, apply3, binaryOperator);
    }

    /* renamed from: p */
    public static /* synthetic */ Table m40178p(BinaryOperator binaryOperator, Table table, Table table2) {
        for (Table.Cell cell : table2.cellSet()) {
            m40177q(table, cell.getRowKey(), cell.getColumnKey(), cell.getValue(), binaryOperator);
        }
        return table;
    }

    /* renamed from: q */
    public static void m40177q(Table table, Object obj, Object obj2, Object obj3, BinaryOperator binaryOperator) {
        Object apply;
        Preconditions.checkNotNull(obj3);
        Object obj4 = table.get(obj, obj2);
        if (obj4 != null) {
            apply = binaryOperator.apply(obj4, obj3);
            if (apply == null) {
                table.remove(obj, obj2);
                return;
            } else {
                table.put(obj, obj2, apply);
                return;
            }
        }
        table.put(obj, obj2, obj3);
    }

    /* renamed from: r */
    public static Collector m40176r(final Function function, final Function function2, final Function function3) {
        Collector of;
        Preconditions.checkNotNull(function, "rowFunction");
        Preconditions.checkNotNull(function2, "columnFunction");
        Preconditions.checkNotNull(function3, "valueFunction");
        of = Collector.of(new Supplier() { // from class: FR1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableTable.Builder();
            }
        }, new BiConsumer() { // from class: GR1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7978o.m40186h(function, function2, function3, (ImmutableTable.Builder) obj, obj2);
            }
        }, new BinaryOperator() { // from class: wR1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableTable.Builder) obj).m40840a((ImmutableTable.Builder) obj2);
            }
        }, new Function() { // from class: xR1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableTable.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: s */
    public static Collector m40175s(final Function function, final Function function2, final Function function3, final BinaryOperator binaryOperator) {
        Collector of;
        Preconditions.checkNotNull(function, "rowFunction");
        Preconditions.checkNotNull(function2, "columnFunction");
        Preconditions.checkNotNull(function3, "valueFunction");
        Preconditions.checkNotNull(binaryOperator, "mergeFunction");
        of = Collector.of(new Supplier() { // from class: BR1
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbstractC7978o.m40188f();
            }
        }, new BiConsumer() { // from class: CR1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7978o.m40193a(function, function2, function3, binaryOperator, (AbstractC7978o.C7980b) obj, obj2);
            }
        }, new BinaryOperator() { // from class: DR1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC7978o.m40189e(binaryOperator, (AbstractC7978o.C7980b) obj, (AbstractC7978o.C7980b) obj2);
            }
        }, new Function() { // from class: ER1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC7978o.m40190d((AbstractC7978o.C7980b) obj);
            }
        }, new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: t */
    public static Collector m40174t(final Function function, final Function function2, final Function function3, final BinaryOperator binaryOperator, Supplier supplier) {
        Collector of;
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(function3);
        Preconditions.checkNotNull(binaryOperator);
        Preconditions.checkNotNull(supplier);
        of = Collector.of(supplier, new BiConsumer() { // from class: zR1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7978o.m40191c(function, function2, function3, binaryOperator, (Table) obj, obj2);
            }
        }, new BinaryOperator() { // from class: AR1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC7978o.m40187g(binaryOperator, (Table) obj, (Table) obj2);
            }
        }, new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: u */
    public static Collector m40173u(Function function, Function function2, Function function3, Supplier supplier) {
        return m40174t(function, function2, function3, new BinaryOperator() { // from class: yR1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC7978o.m40192b(obj, obj2);
            }
        }, supplier);
    }
}