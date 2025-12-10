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
    public static final Collector f53444a;

    /* renamed from: b */
    public static final Object f53445b;

    /* renamed from: c */
    public static final Collector f53446c;

    /* renamed from: com.google.common.collect.MoreCollectors$a */
    /* loaded from: classes4.dex */
    public static final class C7778a {

        /* renamed from: a */
        public Object f53447a = null;

        /* renamed from: b */
        public List f53448b = Collections.emptyList();

        /* renamed from: a */
        public void m40597a(Object obj) {
            Preconditions.checkNotNull(obj);
            if (this.f53447a == null) {
                this.f53447a = obj;
            } else if (this.f53448b.isEmpty()) {
                ArrayList arrayList = new ArrayList(4);
                this.f53448b = arrayList;
                arrayList.add(obj);
            } else if (this.f53448b.size() < 4) {
                this.f53448b.add(obj);
            } else {
                throw m40593e(true);
            }
        }

        /* renamed from: b */
        public C7778a m40596b(C7778a c7778a) {
            if (this.f53447a == null) {
                return c7778a;
            }
            if (c7778a.f53447a == null) {
                return this;
            }
            if (this.f53448b.isEmpty()) {
                this.f53448b = new ArrayList();
            }
            this.f53448b.add(c7778a.f53447a);
            this.f53448b.addAll(c7778a.f53448b);
            if (this.f53448b.size() <= 4) {
                return this;
            }
            List list = this.f53448b;
            list.subList(4, list.size()).clear();
            throw m40593e(true);
        }

        /* renamed from: c */
        public Object m40595c() {
            if (this.f53447a != null) {
                if (this.f53448b.isEmpty()) {
                    return this.f53447a;
                }
                throw m40593e(false);
            }
            throw new NoSuchElementException();
        }

        /* renamed from: d */
        public Optional m40594d() {
            Optional ofNullable;
            if (this.f53448b.isEmpty()) {
                ofNullable = Optional.ofNullable(this.f53447a);
                return ofNullable;
            }
            throw m40593e(false);
        }

        /* renamed from: e */
        public IllegalArgumentException m40593e(boolean z) {
            StringBuilder sb = new StringBuilder();
            sb.append("expected one element but was: <");
            sb.append(this.f53447a);
            for (Object obj : this.f53448b) {
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
        Supplier supplier = new Supplier() { // from class: wt0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new MoreCollectors.C7778a();
            }
        };
        BiConsumer biConsumer = new BiConsumer() { // from class: xt0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((MoreCollectors.C7778a) obj).m40597a(obj2);
            }
        };
        BinaryOperator binaryOperator = new BinaryOperator() { // from class: yt0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((MoreCollectors.C7778a) obj).m40596b((MoreCollectors.C7778a) obj2);
            }
        };
        Function function = new Function() { // from class: zt0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MoreCollectors.C7778a) obj).m40594d();
            }
        };
        characteristics = Collector.Characteristics.UNORDERED;
        of = Collector.of(supplier, biConsumer, binaryOperator, function, characteristics);
        f53444a = of;
        f53445b = new Object();
        Supplier supplier2 = new Supplier() { // from class: wt0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new MoreCollectors.C7778a();
            }
        };
        BiConsumer biConsumer2 = new BiConsumer() { // from class: At0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MoreCollectors.m40601a((MoreCollectors.C7778a) obj, obj2);
            }
        };
        BinaryOperator binaryOperator2 = new BinaryOperator() { // from class: yt0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((MoreCollectors.C7778a) obj).m40596b((MoreCollectors.C7778a) obj2);
            }
        };
        Function function2 = new Function() { // from class: Bt0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MoreCollectors.m40600b((MoreCollectors.C7778a) obj);
            }
        };
        characteristics2 = Collector.Characteristics.UNORDERED;
        of2 = Collector.of(supplier2, biConsumer2, binaryOperator2, function2, characteristics2);
        f53446c = of2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m40601a(C7778a c7778a, Object obj) {
        m40599c(c7778a, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m40600b(C7778a c7778a) {
        return m40598d(c7778a);
    }

    /* renamed from: c */
    public static /* synthetic */ void m40599c(C7778a c7778a, Object obj) {
        if (obj == null) {
            obj = f53445b;
        }
        c7778a.m40597a(obj);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m40598d(C7778a c7778a) {
        Object m40595c = c7778a.m40595c();
        if (m40595c == f53445b) {
            return null;
        }
        return m40595c;
    }

    public static <T> Collector<T, ?, T> onlyElement() {
        return f53446c;
    }

    public static <T> Collector<T, ?, Optional<T>> toOptional() {
        return f53444a;
    }
}