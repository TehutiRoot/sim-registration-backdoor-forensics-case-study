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
            this.expectedValuesPerKey = AbstractC5406bs.m51814b(i, "expectedValuesPerKey");
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
            this.expectedValuesPerKey = AbstractC5406bs.m51814b(i, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        public Set<V> get() {
            return AbstractC7981k.m40227e(this.expectedValuesPerKey);
        }
    }

    /* loaded from: classes4.dex */
    public static final class LinkedHashSetSupplier<V> implements Supplier<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        public LinkedHashSetSupplier(int i) {
            this.expectedValuesPerKey = AbstractC5406bs.m51814b(i, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        public Set<V> get() {
            return AbstractC7981k.m40225g(this.expectedValuesPerKey);
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
        public class C7790a extends ListMultimapBuilder {

            /* renamed from: a */
            public final /* synthetic */ int f53437a;

            /* renamed from: b */
            public final /* synthetic */ MultimapBuilderWithKeys f53438b;

            public C7790a(MultimapBuilderWithKeys multimapBuilderWithKeys, int i) {
                this.f53437a = i;
                this.f53438b = multimapBuilderWithKeys;
            }

            @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
            public ListMultimap build() {
                return Multimaps.newListMultimap(this.f53438b.mo40603a(), new ArrayListSupplier(this.f53437a));
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$b */
        /* loaded from: classes4.dex */
        public class C7791b extends ListMultimapBuilder {
            public C7791b() {
            }

            @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
            public ListMultimap build() {
                return Multimaps.newListMultimap(MultimapBuilderWithKeys.this.mo40603a(), LinkedListSupplier.instance());
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$c */
        /* loaded from: classes4.dex */
        public class C7792c extends SetMultimapBuilder {

            /* renamed from: a */
            public final /* synthetic */ int f53440a;

            /* renamed from: b */
            public final /* synthetic */ MultimapBuilderWithKeys f53441b;

            public C7792c(MultimapBuilderWithKeys multimapBuilderWithKeys, int i) {
                this.f53440a = i;
                this.f53441b = multimapBuilderWithKeys;
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public SetMultimap build() {
                return Multimaps.newSetMultimap(this.f53441b.mo40603a(), new HashSetSupplier(this.f53440a));
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$d */
        /* loaded from: classes4.dex */
        public class C7793d extends SetMultimapBuilder {

            /* renamed from: a */
            public final /* synthetic */ int f53442a;

            /* renamed from: b */
            public final /* synthetic */ MultimapBuilderWithKeys f53443b;

            public C7793d(MultimapBuilderWithKeys multimapBuilderWithKeys, int i) {
                this.f53442a = i;
                this.f53443b = multimapBuilderWithKeys;
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public SetMultimap build() {
                return Multimaps.newSetMultimap(this.f53443b.mo40603a(), new LinkedHashSetSupplier(this.f53442a));
            }
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$f */
        /* loaded from: classes4.dex */
        public class C7795f extends SetMultimapBuilder {

            /* renamed from: a */
            public final /* synthetic */ Class f53446a;

            /* renamed from: b */
            public final /* synthetic */ MultimapBuilderWithKeys f53447b;

            public C7795f(MultimapBuilderWithKeys multimapBuilderWithKeys, Class cls) {
                this.f53446a = cls;
                this.f53447b = multimapBuilderWithKeys;
            }

            @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public SetMultimap build() {
                return Multimaps.newSetMultimap(this.f53447b.mo40603a(), new EnumSetSupplier(this.f53446a));
            }
        }

        /* renamed from: a */
        public abstract Map mo40603a();

        public ListMultimapBuilder<K0, Object> arrayListValues() {
            return arrayListValues(2);
        }

        public <V0 extends Enum<V0>> SetMultimapBuilder<K0, V0> enumSetValues(Class<V0> cls) {
            Preconditions.checkNotNull(cls, "valueClass");
            return new C7795f(this, cls);
        }

        public SetMultimapBuilder<K0, Object> hashSetValues() {
            return hashSetValues(2);
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues() {
            return linkedHashSetValues(2);
        }

        public ListMultimapBuilder<K0, Object> linkedListValues() {
            return new C7791b();
        }

        public SortedSetMultimapBuilder<K0, Comparable> treeSetValues() {
            return (SortedSetMultimapBuilder<K0, V0>) treeSetValues(Ordering.natural());
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$e */
        /* loaded from: classes4.dex */
        public class C7794e extends SortedSetMultimapBuilder {

            /* renamed from: a */
            public final /* synthetic */ Comparator f53444a;

            /* renamed from: b */
            public final /* synthetic */ MultimapBuilderWithKeys f53445b;

            public C7794e(MultimapBuilderWithKeys multimapBuilderWithKeys, Comparator comparator) {
                this.f53444a = comparator;
                this.f53445b = multimapBuilderWithKeys;
            }

            @Override // com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder, com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
            public SortedSetMultimap build() {
                return Multimaps.newSortedSetMultimap(this.f53445b.mo40603a(), new TreeSetSupplier(this.f53444a));
            }
        }

        public ListMultimapBuilder<K0, Object> arrayListValues(int i) {
            AbstractC5406bs.m51814b(i, "expectedValuesPerKey");
            return new C7790a(this, i);
        }

        public SetMultimapBuilder<K0, Object> hashSetValues(int i) {
            AbstractC5406bs.m51814b(i, "expectedValuesPerKey");
            return new C7792c(this, i);
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues(int i) {
            AbstractC5406bs.m51814b(i, "expectedValuesPerKey");
            return new C7793d(this, i);
        }

        public <V0> SortedSetMultimapBuilder<K0, V0> treeSetValues(Comparator<V0> comparator) {
            Preconditions.checkNotNull(comparator, "comparator");
            return new C7794e(this, comparator);
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
    public class C7796a extends MultimapBuilderWithKeys {

        /* renamed from: a */
        public final /* synthetic */ int f53448a;

        public C7796a(int i) {
            this.f53448a = i;
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        /* renamed from: a */
        public Map mo40603a() {
            return AbstractC7981k.m40228d(this.f53448a);
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$b */
    /* loaded from: classes4.dex */
    public class C7797b extends MultimapBuilderWithKeys {

        /* renamed from: a */
        public final /* synthetic */ int f53449a;

        public C7797b(int i) {
            this.f53449a = i;
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        /* renamed from: a */
        public Map mo40603a() {
            return AbstractC7981k.m40226f(this.f53449a);
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$c */
    /* loaded from: classes4.dex */
    public class C7798c extends MultimapBuilderWithKeys {

        /* renamed from: a */
        public final /* synthetic */ Comparator f53450a;

        public C7798c(Comparator comparator) {
            this.f53450a = comparator;
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        /* renamed from: a */
        public Map mo40603a() {
            return new TreeMap(this.f53450a);
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$d */
    /* loaded from: classes4.dex */
    public class C7799d extends MultimapBuilderWithKeys {

        /* renamed from: a */
        public final /* synthetic */ Class f53451a;

        public C7799d(Class cls) {
            this.f53451a = cls;
        }

        @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
        /* renamed from: a */
        public Map mo40603a() {
            return new EnumMap(this.f53451a);
        }
    }

    public /* synthetic */ MultimapBuilder(C7796a c7796a) {
        this();
    }

    public static <K0 extends Enum<K0>> MultimapBuilderWithKeys<K0> enumKeys(Class<K0> cls) {
        Preconditions.checkNotNull(cls);
        return new C7799d(cls);
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
        AbstractC5406bs.m51814b(i, "expectedKeys");
        return new C7796a(i);
    }

    public static MultimapBuilderWithKeys<Object> linkedHashKeys(int i) {
        AbstractC5406bs.m51814b(i, "expectedKeys");
        return new C7797b(i);
    }

    public static <K0> MultimapBuilderWithKeys<K0> treeKeys(Comparator<K0> comparator) {
        Preconditions.checkNotNull(comparator);
        return new C7798c(comparator);
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
