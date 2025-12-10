package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

@GwtCompatible
/* loaded from: classes4.dex */
public abstract class MultimapBuilder<K0, V0> {

    /* loaded from: classes4.dex */
    public static final class ArrayListSupplier<V> implements Supplier<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        public ArrayListSupplier(int i) {
            this.expectedValuesPerKey = AbstractC5383bs.m51877b(i, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        public List<V> get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    /* loaded from: classes4.dex */
    public static final class EnumSetSupplier<V extends Enum<V>> implements Supplier<Set<V>>, Serializable {
        private final Class<V> clazz;

        public EnumSetSupplier(Class<V> cls) {
            this.clazz = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.google.common.base.Supplier
        public Set<V> get() {
            return EnumSet.noneOf(this.clazz);
        }
    }

    /* loaded from: classes4.dex */
    public static final class HashSetSupplier<V> implements Supplier<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        public HashSetSupplier(int i) {
            this.expectedValuesPerKey = AbstractC5383bs.m51877b(i, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        public Set<V> get() {
            return AbstractC7970k.m40218e(this.expectedValuesPerKey);
        }
    }

    /* loaded from: classes4.dex */
    public static final class LinkedHashSetSupplier<V> implements Supplier<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        public LinkedHashSetSupplier(int i) {
            this.expectedValuesPerKey = AbstractC5383bs.m51877b(i, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        public Set<V> get() {
            return AbstractC7970k.m40216g(this.expectedValuesPerKey);
        }
    }

    /* loaded from: classes4.dex */
    public enum LinkedListSupplier implements Supplier<List<?>> {
        INSTANCE;

        public static <V> Supplier<List<V>> instance() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Supplier
        public List<?> get() {
            return new LinkedList();
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class MultimapBuilderWithKeys<K0> {

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$a */
        /* loaded from: classes4.dex */
        public class C7779a extends ListMultimapBuilder {

            /* renamed from: a */
            public final /* synthetic */ int f53449a;

            /* renamed from: b */
            public final /* synthetic */ MultimapBuilderWithKeys f53450b;

            public C7779a(MultimapBuilderWithKeys multimapBuilderWithKeys, int i) {
                this.f53449a = i;
                this.f53450b = multimapBuilderWithKeys;
            }

            @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
            public ListMultimap build() {
                return Multimaps.newListMultimap(this.f53450b.mo40592a(), new ArrayListSupplier(this.f53449a));
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$b */
        /* loaded from: classes4.dex */
        public class C7780b extends ListMultimapBuilder {
            public C7780b() {
            }

            @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
            public ListMultimap build() {
                return Multimaps.newListMultimap(MultimapBuilderWithKeys.this.mo40592a(), LinkedListSupplier.instance());
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$c */
        /* loaded from: classes4.dex */
        public class C7781c extends SetMultimapBuilder {

            /* renamed from: a */
            public final /* synthetic */ int f53452a;

            /* renamed from: b */
            public final /* synthetic */ MultimapBuilderWithKeys f53453b;

            public C7781c(MultimapBuilderWithKeys multimapBuilderWithKeys, int i) {
                this.f53452a = i;
                this.f53453b = multimapBuilderWithKeys;
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public SetMultimap build() {
                return Multimaps.newSetMultimap(this.f53453b.mo40592a(), new HashSetSupplier(this.f53452a));
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$d */
        /* loaded from: classes4.dex */
        public class C7782d extends SetMultimapBuilder {

            /* renamed from: a */
            public final /* synthetic */ int f53454a;

            /* renamed from: b */
            public final /* synthetic */ MultimapBuilderWithKeys f53455b;

            public C7782d(MultimapBuilderWithKeys multimapBuilderWithKeys, int i) {
                this.f53454a = i;
                this.f53455b = multimapBuilderWithKeys;
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public SetMultimap build() {
                return Multimaps.newSetMultimap(this.f53455b.mo40592a(), new LinkedHashSetSupplier(this.f53454a));
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$f */
        /* loaded from: classes4.dex */
        public class C7784f extends SetMultimapBuilder {

            /* renamed from: a */
            public final /* synthetic */ Class f53458a;

            /* renamed from: b */
            public final /* synthetic */ MultimapBuilderWithKeys f53459b;

            public C7784f(MultimapBuilderWithKeys multimapBuilderWithKeys, Class cls) {
                this.f53458a = cls;
                this.f53459b = multimapBuilderWithKeys;
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public SetMultimap build() {
                return Multimaps.newSetMultimap(this.f53459b.mo40592a(), new EnumSetSupplier(this.f53458a));
            }
        }

        /* renamed from: a */
        public abstract Map mo40592a();

        public ListMultimapBuilder<K0, Object> arrayListValues() {
            return arrayListValues(2);
        }

        public <V0 extends Enum<V0>> SetMultimapBuilder<K0, V0> enumSetValues(Class<V0> cls) {
            Preconditions.checkNotNull(cls, "valueClass");
            return new C7784f(this, cls);
        }

        public SetMultimapBuilder<K0, Object> hashSetValues() {
            return hashSetValues(2);
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues() {
            return linkedHashSetValues(2);
        }

        public ListMultimapBuilder<K0, Object> linkedListValues() {
            return new C7780b();
        }

        public SortedSetMultimapBuilder<K0, Comparable> treeSetValues() {
            return (SortedSetMultimapBuilder<K0, V0>) treeSetValues(Ordering.natural());
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$e */
        /* loaded from: classes4.dex */
        public class C7783e extends SortedSetMultimapBuilder {

            /* renamed from: a */
            public final /* synthetic */ Comparator f53456a;

            /* renamed from: b */
            public final /* synthetic */ MultimapBuilderWithKeys f53457b;

            public C7783e(MultimapBuilderWithKeys multimapBuilderWithKeys, Comparator comparator) {
                this.f53456a = comparator;
                this.f53457b = multimapBuilderWithKeys;
            }

            @Override // com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder, com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public SortedSetMultimap build() {
                return Multimaps.newSortedSetMultimap(this.f53457b.mo40592a(), new TreeSetSupplier(this.f53456a));
            }
        }

        public ListMultimapBuilder<K0, Object> arrayListValues(int i) {
            AbstractC5383bs.m51877b(i, "expectedValuesPerKey");
            return new C7779a(this, i);
        }

        public SetMultimapBuilder<K0, Object> hashSetValues(int i) {
            AbstractC5383bs.m51877b(i, "expectedValuesPerKey");
            return new C7781c(this, i);
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues(int i) {
            AbstractC5383bs.m51877b(i, "expectedValuesPerKey");
            return new C7782d(this, i);
        }

        public <V0> SortedSetMultimapBuilder<K0, V0> treeSetValues(Comparator<V0> comparator) {
            Preconditions.checkNotNull(comparator, "comparator");
            return new C7783e(this, comparator);
        }
    }

    /* loaded from: classes4.dex */
    public static final class TreeSetSupplier<V> implements Supplier<SortedSet<V>>, Serializable {
        private final Comparator<? super V> comparator;

        public TreeSetSupplier(Comparator<? super V> comparator) {
            this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
        }

        @Override // com.google.common.base.Supplier
        public SortedSet<V> get() {
            return new TreeSet(this.comparator);
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$a */
    /* loaded from: classes4.dex */
    public class C7785a extends MultimapBuilderWithKeys {

        /* renamed from: a */
        public final /* synthetic */ int f53460a;

        public C7785a(int i) {
            this.f53460a = i;
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        /* renamed from: a */
        public Map mo40592a() {
            return AbstractC7970k.m40219d(this.f53460a);
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$b */
    /* loaded from: classes4.dex */
    public class C7786b extends MultimapBuilderWithKeys {

        /* renamed from: a */
        public final /* synthetic */ int f53461a;

        public C7786b(int i) {
            this.f53461a = i;
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        /* renamed from: a */
        public Map mo40592a() {
            return AbstractC7970k.m40217f(this.f53461a);
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$c */
    /* loaded from: classes4.dex */
    public class C7787c extends MultimapBuilderWithKeys {

        /* renamed from: a */
        public final /* synthetic */ Comparator f53462a;

        public C7787c(Comparator comparator) {
            this.f53462a = comparator;
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        /* renamed from: a */
        public Map mo40592a() {
            return new TreeMap(this.f53462a);
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$d */
    /* loaded from: classes4.dex */
    public class C7788d extends MultimapBuilderWithKeys {

        /* renamed from: a */
        public final /* synthetic */ Class f53463a;

        public C7788d(Class cls) {
            this.f53463a = cls;
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        /* renamed from: a */
        public Map mo40592a() {
            return new EnumMap(this.f53463a);
        }
    }

    public /* synthetic */ MultimapBuilder(C7785a c7785a) {
        this();
    }

    public static <K0 extends Enum<K0>> MultimapBuilderWithKeys<K0> enumKeys(Class<K0> cls) {
        Preconditions.checkNotNull(cls);
        return new C7788d(cls);
    }

    public static MultimapBuilderWithKeys<Object> hashKeys() {
        return hashKeys(8);
    }

    public static MultimapBuilderWithKeys<Object> linkedHashKeys() {
        return linkedHashKeys(8);
    }

    public static MultimapBuilderWithKeys<Comparable> treeKeys() {
        return treeKeys(Ordering.natural());
    }

    public abstract <K extends K0, V extends V0> Multimap<K, V> build();

    public <K extends K0, V extends V0> Multimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
        Multimap<K, V> build = build();
        build.putAll(multimap);
        return build;
    }

    /* loaded from: classes4.dex */
    public static abstract class ListMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        public ListMultimapBuilder() {
            super(null);
        }

        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> ListMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> ListMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
            return (ListMultimap) super.build((Multimap) multimap);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class SetMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        public SetMultimapBuilder() {
            super(null);
        }

        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> SetMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> SetMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
            return (SetMultimap) super.build((Multimap) multimap);
        }
    }

    public MultimapBuilder() {
    }

    public static MultimapBuilderWithKeys<Object> hashKeys(int i) {
        AbstractC5383bs.m51877b(i, "expectedKeys");
        return new C7785a(i);
    }

    public static MultimapBuilderWithKeys<Object> linkedHashKeys(int i) {
        AbstractC5383bs.m51877b(i, "expectedKeys");
        return new C7786b(i);
    }

    public static <K0> MultimapBuilderWithKeys<K0> treeKeys(Comparator<K0> comparator) {
        Preconditions.checkNotNull(comparator);
        return new C7787c(comparator);
    }

    /* loaded from: classes4.dex */
    public static abstract class SortedSetMultimapBuilder<K0, V0> extends SetMultimapBuilder<K0, V0> {
        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> SortedSetMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> SortedSetMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
            return (SortedSetMultimap) super.build((Multimap) multimap);
        }
    }
}