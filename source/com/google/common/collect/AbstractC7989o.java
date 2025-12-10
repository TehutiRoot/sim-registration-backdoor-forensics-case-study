package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractC7989o;
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
public abstract class AbstractC7989o {

    /* renamed from: com.google.common.collect.o$b */
    /* loaded from: classes4.dex */
    public static final class C7991b {

        /* renamed from: a */
        public final List f53723a;

        /* renamed from: b */
        public final Table f53724b;

        public C7991b() {
            this.f53723a = new ArrayList();
            this.f53724b = HashBasedTable.create();
        }

        /* renamed from: a */
        public C7991b m40181a(C7991b c7991b, BinaryOperator binaryOperator) {
            for (C7992c c7992c : c7991b.f53723a) {
                m40180b(c7992c.getRowKey(), c7992c.getColumnKey(), c7992c.getValue(), binaryOperator);
            }
            return this;
        }

        /* renamed from: b */
        public void m40180b(Object obj, Object obj2, Object obj3, BinaryOperator binaryOperator) {
            C7992c c7992c = (C7992c) this.f53724b.get(obj, obj2);
            if (c7992c == null) {
                C7992c c7992c2 = new C7992c(obj, obj2, obj3);
                this.f53723a.add(c7992c2);
                this.f53724b.put(obj, obj2, c7992c2);
                return;
            }
            c7992c.m40178a(obj3, binaryOperator);
        }

        /* renamed from: c */
        public ImmutableTable m40179c() {
            return ImmutableTable.copyOf(this.f53723a);
        }
    }

    /* renamed from: com.google.common.collect.o$c */
    /* loaded from: classes4.dex */
    public static final class C7992c extends Tables.AbstractC7901b {

        /* renamed from: a */
        public final Object f53725a;

        /* renamed from: b */
        public final Object f53726b;

        /* renamed from: c */
        public Object f53727c;

        public C7992c(Object obj, Object obj2, Object obj3) {
            this.f53725a = Preconditions.checkNotNull(obj, "row");
            this.f53726b = Preconditions.checkNotNull(obj2, "column");
            this.f53727c = Preconditions.checkNotNull(obj3, "value");
        }

        /* renamed from: a */
        public void m40178a(Object obj, BinaryOperator binaryOperator) {
            Object apply;
            Preconditions.checkNotNull(obj, "value");
            apply = binaryOperator.apply(this.f53727c, obj);
            this.f53727c = Preconditions.checkNotNull(apply, "mergeFunction.apply");
        }

        @Override // com.google.common.collect.Table.Cell
        public Object getColumnKey() {
            return this.f53726b;
        }

        @Override // com.google.common.collect.Table.Cell
        public Object getRowKey() {
            return this.f53725a;
        }

        @Override // com.google.common.collect.Table.Cell
        public Object getValue() {
            return this.f53727c;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m40202a(Function function, Function function2, Function function3, BinaryOperator binaryOperator, C7991b c7991b, Object obj) {
        m40192k(function, function2, function3, binaryOperator, c7991b, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m40201b(Object obj, Object obj2) {
        return m40189n(obj, obj2);
    }

    /* renamed from: c */
    public static /* synthetic */ void m40200c(Function function, Function function2, Function function3, BinaryOperator binaryOperator, Table table, Object obj) {
        m40188o(function, function2, function3, binaryOperator, table, obj);
    }

    /* renamed from: e */
    public static /* synthetic */ C7991b m40198e(BinaryOperator binaryOperator, C7991b c7991b, C7991b c7991b2) {
        return c7991b.m40181a(c7991b2, binaryOperator);
    }

    /* renamed from: f */
    public static /* synthetic */ C7991b m40197f() {
        return m40193j();
    }

    /* renamed from: g */
    public static /* synthetic */ Table m40196g(BinaryOperator binaryOperator, Table table, Table table2) {
        return m40187p(binaryOperator, table, table2);
    }

    /* renamed from: i */
    public static /* synthetic */ void m40194i(Function function, Function function2, Function function3, ImmutableTable.Builder builder, Object obj) {
        Object apply;
        Object apply2;
        Object apply3;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        apply3 = function3.apply(obj);
        builder.put(apply, apply2, apply3);
    }

    /* renamed from: j */
    public static /* synthetic */ C7991b m40193j() {
        return new C7991b();
    }

    /* renamed from: k */
    public static /* synthetic */ void m40192k(Function function, Function function2, Function function3, BinaryOperator binaryOperator, C7991b c7991b, Object obj) {
        Object apply;
        Object apply2;
        Object apply3;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        apply3 = function3.apply(obj);
        c7991b.m40180b(apply, apply2, apply3, binaryOperator);
    }

    /* renamed from: n */
    public static /* synthetic */ Object m40189n(Object obj, Object obj2) {
        throw new IllegalStateException("Conflicting values " + obj + " and " + obj2);
    }

    /* renamed from: o */
    public static /* synthetic */ void m40188o(Function function, Function function2, Function function3, BinaryOperator binaryOperator, Table table, Object obj) {
        Object apply;
        Object apply2;
        Object apply3;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        apply3 = function3.apply(obj);
        m40186q(table, apply, apply2, apply3, binaryOperator);
    }

    /* renamed from: p */
    public static /* synthetic */ Table m40187p(BinaryOperator binaryOperator, Table table, Table table2) {
        for (Table.Cell cell : table2.cellSet()) {
            m40186q(table, cell.getRowKey(), cell.getColumnKey(), cell.getValue(), binaryOperator);
        }
        return table;
    }

    /* renamed from: q */
    public static void m40186q(Table table, Object obj, Object obj2, Object obj3, BinaryOperator binaryOperator) {
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
    public static Collector m40185r(final Function function, final Function function2, final Function function3) {
        Collector of;
        Preconditions.checkNotNull(function, "rowFunction");
        Preconditions.checkNotNull(function2, "columnFunction");
        Preconditions.checkNotNull(function3, "valueFunction");
        of = Collector.of(new Supplier() { // from class: IQ1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableTable.Builder();
            }
        }, new BiConsumer() { // from class: JQ1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7989o.m40194i(function, function2, function3, (ImmutableTable.Builder) obj, obj2);
            }
        }, new BinaryOperator() { // from class: zQ1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableTable.Builder) obj).m40851a((ImmutableTable.Builder) obj2);
            }
        }, new Function() { // from class: AQ1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableTable.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: s */
    public static Collector m40184s(final Function function, final Function function2, final Function function3, final BinaryOperator binaryOperator) {
        Collector of;
        Preconditions.checkNotNull(function, "rowFunction");
        Preconditions.checkNotNull(function2, "columnFunction");
        Preconditions.checkNotNull(function3, "valueFunction");
        Preconditions.checkNotNull(binaryOperator, "mergeFunction");
        of = Collector.of(new Supplier() { // from class: EQ1
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbstractC7989o.m40197f();
            }
        }, new BiConsumer() { // from class: FQ1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7989o.m40202a(function, function2, function3, binaryOperator, (AbstractC7989o.C7991b) obj, obj2);
            }
        }, new BinaryOperator() { // from class: GQ1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC7989o.m40198e(binaryOperator, (AbstractC7989o.C7991b) obj, (AbstractC7989o.C7991b) obj2);
            }
        }, new Function() { // from class: HQ1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ImmutableTable m40179c;
                m40179c = ((AbstractC7989o.C7991b) obj).m40179c();
                return m40179c;
            }
        }, new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: t */
    public static Collector m40183t(final Function function, final Function function2, final Function function3, final BinaryOperator binaryOperator, Supplier supplier) {
        Collector of;
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(function3);
        Preconditions.checkNotNull(binaryOperator);
        Preconditions.checkNotNull(supplier);
        of = Collector.of(supplier, new BiConsumer() { // from class: CQ1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7989o.m40200c(function, function2, function3, binaryOperator, (Table) obj, obj2);
            }
        }, new BinaryOperator() { // from class: DQ1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC7989o.m40196g(binaryOperator, (Table) obj, (Table) obj2);
            }
        }, new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: u */
    public static Collector m40182u(Function function, Function function2, Function function3, Supplier supplier) {
        return m40183t(function, function2, function3, new BinaryOperator() { // from class: BQ1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC7989o.m40201b(obj, obj2);
            }
        }, supplier);
    }
}
