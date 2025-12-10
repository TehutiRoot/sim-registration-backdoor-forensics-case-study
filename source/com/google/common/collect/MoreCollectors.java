package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.MoreCollectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import kotlin.text.Typography;

@GwtCompatible
/* loaded from: classes4.dex */
public final class MoreCollectors {

    /* renamed from: a */
    public static final Collector f53432a;

    /* renamed from: b */
    public static final Object f53433b;

    /* renamed from: c */
    public static final Collector f53434c;

    /* renamed from: com.google.common.collect.MoreCollectors$a */
    /* loaded from: classes4.dex */
    public static final class C7789a {

        /* renamed from: a */
        public Object f53435a = null;

        /* renamed from: b */
        public List f53436b = Collections.emptyList();

        /* renamed from: a */
        public void m40608a(Object obj) {
            Preconditions.checkNotNull(obj);
            if (this.f53435a == null) {
                this.f53435a = obj;
            } else if (this.f53436b.isEmpty()) {
                ArrayList arrayList = new ArrayList(4);
                this.f53436b = arrayList;
                arrayList.add(obj);
            } else if (this.f53436b.size() < 4) {
                this.f53436b.add(obj);
            } else {
                throw m40604e(true);
            }
        }

        /* renamed from: b */
        public C7789a m40607b(C7789a c7789a) {
            if (this.f53435a == null) {
                return c7789a;
            }
            if (c7789a.f53435a == null) {
                return this;
            }
            if (this.f53436b.isEmpty()) {
                this.f53436b = new ArrayList();
            }
            this.f53436b.add(c7789a.f53435a);
            this.f53436b.addAll(c7789a.f53436b);
            if (this.f53436b.size() <= 4) {
                return this;
            }
            List list = this.f53436b;
            list.subList(4, list.size()).clear();
            throw m40604e(true);
        }

        /* renamed from: c */
        public Object m40606c() {
            if (this.f53435a != null) {
                if (this.f53436b.isEmpty()) {
                    return this.f53435a;
                }
                throw m40604e(false);
            }
            throw new NoSuchElementException();
        }

        /* renamed from: d */
        public Optional m40605d() {
            Optional ofNullable;
            if (this.f53436b.isEmpty()) {
                ofNullable = Optional.ofNullable(this.f53435a);
                return ofNullable;
            }
            throw m40604e(false);
        }

        /* renamed from: e */
        public IllegalArgumentException m40604e(boolean z) {
            StringBuilder sb = new StringBuilder();
            sb.append("expected one element but was: <");
            sb.append(this.f53435a);
            for (Object obj : this.f53436b) {
                sb.append(", ");
                sb.append(obj);
            }
            if (z) {
                sb.append(", ...");
            }
            sb.append(Typography.greater);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static {
        Collector.Characteristics characteristics;
        Collector of;
        Collector.Characteristics characteristics2;
        Collector of2;
        Supplier supplier = new Supplier() { // from class: qt0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new MoreCollectors.C7789a();
            }
        };
        BiConsumer biConsumer = new BiConsumer() { // from class: rt0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((MoreCollectors.C7789a) obj).m40608a(obj2);
            }
        };
        BinaryOperator binaryOperator = new BinaryOperator() { // from class: st0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((MoreCollectors.C7789a) obj).m40607b((MoreCollectors.C7789a) obj2);
            }
        };
        Function function = new Function() { // from class: tt0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MoreCollectors.C7789a) obj).m40605d();
            }
        };
        characteristics = Collector.Characteristics.UNORDERED;
        of = Collector.of(supplier, biConsumer, binaryOperator, function, characteristics);
        f53432a = of;
        f53433b = new Object();
        Supplier supplier2 = new Supplier() { // from class: qt0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new MoreCollectors.C7789a();
            }
        };
        BiConsumer biConsumer2 = new BiConsumer() { // from class: ut0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MoreCollectors.m40612a((MoreCollectors.C7789a) obj, obj2);
            }
        };
        BinaryOperator binaryOperator2 = new BinaryOperator() { // from class: st0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((MoreCollectors.C7789a) obj).m40607b((MoreCollectors.C7789a) obj2);
            }
        };
        Function function2 = new Function() { // from class: vt0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MoreCollectors.m40611b((MoreCollectors.C7789a) obj);
            }
        };
        characteristics2 = Collector.Characteristics.UNORDERED;
        of2 = Collector.of(supplier2, biConsumer2, binaryOperator2, function2, characteristics2);
        f53434c = of2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m40612a(C7789a c7789a, Object obj) {
        m40610c(c7789a, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m40611b(C7789a c7789a) {
        return m40609d(c7789a);
    }

    /* renamed from: c */
    public static /* synthetic */ void m40610c(C7789a c7789a, Object obj) {
        if (obj == null) {
            obj = f53433b;
        }
        c7789a.m40608a(obj);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m40609d(C7789a c7789a) {
        Object m40606c = c7789a.m40606c();
        if (m40606c == f53433b) {
            return null;
        }
        return m40606c;
    }

    public static <T> Collector<T, ?, T> onlyElement() {
        return f53434c;
    }

    public static <T> Collector<T, ?, Optional<T>> toOptional() {
        return f53432a;
    }
}
