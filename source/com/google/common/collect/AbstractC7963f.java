package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractC7963f;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.Multiset;
import com.google.common.collect.Range;
import com.google.common.collect.SetMultimap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* renamed from: com.google.common.collect.f */
/* loaded from: classes4.dex */
public abstract class AbstractC7963f {

    /* renamed from: a */
    public static final Collector f53685a;

    /* renamed from: b */
    public static final Collector f53686b;

    /* renamed from: c */
    public static final Collector f53687c;

    /* renamed from: com.google.common.collect.f$b */
    /* loaded from: classes4.dex */
    public static class C7965b {

        /* renamed from: a */
        public final BinaryOperator f53688a;

        /* renamed from: b */
        public EnumMap f53689b = null;

        public C7965b(BinaryOperator binaryOperator) {
            this.f53688a = binaryOperator;
        }

        /* renamed from: a */
        public C7965b m40288a(C7965b c7965b) {
            if (this.f53689b == null) {
                return c7965b;
            }
            EnumMap enumMap = c7965b.f53689b;
            if (enumMap == null) {
                return this;
            }
            enumMap.forEach(new BiConsumer() { // from class: as
                {
                    AbstractC7963f.C7965b.this = this;
                }

                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    AbstractC7963f.C7965b.this.m40287b((Enum) obj, obj2);
                }
            });
            return this;
        }

        /* renamed from: b */
        public void m40287b(Enum r3, Object obj) {
            EnumMap enumMap = this.f53689b;
            if (enumMap == null) {
                this.f53689b = new EnumMap(Collections.singletonMap(r3, obj));
            } else {
                enumMap.merge(r3, obj, this.f53688a);
            }
        }

        /* renamed from: c */
        public ImmutableMap m40286c() {
            EnumMap enumMap = this.f53689b;
            if (enumMap == null) {
                return ImmutableMap.m40976of();
            }
            return ImmutableEnumMap.asImmutable(enumMap);
        }
    }

    /* renamed from: com.google.common.collect.f$c */
    /* loaded from: classes4.dex */
    public static final class C7966c {

        /* renamed from: b */
        public static final Collector f53690b = AbstractC7963f.m40315m0();

        /* renamed from: a */
        public EnumSet f53691a;

        public C7966c() {
        }

        /* renamed from: a */
        public void m40285a(Enum r2) {
            EnumSet enumSet = this.f53691a;
            if (enumSet == null) {
                this.f53691a = EnumSet.of(r2);
            } else {
                enumSet.add(r2);
            }
        }

        /* renamed from: b */
        public C7966c m40284b(C7966c c7966c) {
            EnumSet enumSet = this.f53691a;
            if (enumSet == null) {
                return c7966c;
            }
            EnumSet enumSet2 = c7966c.f53691a;
            if (enumSet2 == null) {
                return this;
            }
            enumSet.addAll(enumSet2);
            return this;
        }

        /* renamed from: c */
        public ImmutableSet m40283c() {
            EnumSet enumSet = this.f53691a;
            if (enumSet == null) {
                return ImmutableSet.m40931of();
            }
            ImmutableSet asImmutable = ImmutableEnumSet.asImmutable(enumSet);
            this.f53691a = null;
            return asImmutable;
        }
    }

    static {
        Collector of;
        Collector of2;
        Collector of3;
        of = Collector.of(new Supplier() { // from class: Sq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableList.builder();
            }
        }, new BiConsumer() { // from class: Xq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableList.Builder) obj).add((ImmutableList.Builder) obj2);
            }
        }, new BinaryOperator() { // from class: Yq
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableList.Builder) obj).m40984e((ImmutableList.Builder) obj2);
            }
        }, new Function() { // from class: Zq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableList.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
        f53685a = of;
        of2 = Collector.of(new Supplier() { // from class: ar
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableSet.builder();
            }
        }, new BiConsumer() { // from class: br
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSet.Builder) obj).add((ImmutableSet.Builder) obj2);
            }
        }, new BinaryOperator() { // from class: cr
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSet.Builder) obj).mo40855e((ImmutableSet.Builder) obj2);
            }
        }, new Function() { // from class: dr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSet.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
        f53686b = of2;
        of3 = Collector.of(new Supplier() { // from class: Tq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableRangeSet.builder();
            }
        }, new BiConsumer() { // from class: Uq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableRangeSet.Builder) obj).add((Range) obj2);
            }
        }, new BinaryOperator() { // from class: Vq
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableRangeSet.Builder) obj).m40932a((ImmutableRangeSet.Builder) obj2);
            }
        }, new Function() { // from class: Wq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableRangeSet.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
        f53687c = of3;
    }

    /* renamed from: A */
    public static /* synthetic */ C7965b m40367A(BinaryOperator binaryOperator) {
        return m40350Q(binaryOperator);
    }

    /* renamed from: A0 */
    public static Collector m40366A0(final Function function, final ToIntFunction toIntFunction, Supplier supplier) {
        Collector of;
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(toIntFunction);
        Preconditions.checkNotNull(supplier);
        of = Collector.of(supplier, new BiConsumer() { // from class: Qr
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7963f.m40294x(function, toIntFunction, (Multiset) obj, obj2);
            }
        }, new BinaryOperator() { // from class: Rr
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC7963f.m40312o((Multiset) obj, (Multiset) obj2);
            }
        }, new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: B */
    public static /* synthetic */ Multimap m40365B(Multimap multimap, Multimap multimap2) {
        return multimap.putAll(multimap2);
    }

    /* renamed from: D */
    public static Collector m40363D(final Function function, final Function function2) {
        Collector collectingAndThen;
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Function function3 = new Function() { // from class: gr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC7963f.m40322j(function, obj);
            }
        };
        Function function4 = new Function() { // from class: hr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC7963f.m40340a(function2, obj);
            }
        };
        final MultimapBuilder.ListMultimapBuilder<Object, Object> arrayListValues = MultimapBuilder.linkedHashKeys().arrayListValues();
        Objects.requireNonNull(arrayListValues);
        collectingAndThen = Collectors.collectingAndThen(m40361F(function3, function4, new Supplier() { // from class: ir
            @Override // java.util.function.Supplier
            public final Object get() {
                return MultimapBuilder.ListMultimapBuilder.this.build();
            }
        }), new Function() { // from class: jr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableListMultimap.copyOf((Multimap) ((ListMultimap) obj));
            }
        });
        return collectingAndThen;
    }

    /* renamed from: E */
    public static Collector m40362E(final Function function, final Function function2) {
        Collector collectingAndThen;
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Function function3 = new Function() { // from class: or
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC7963f.m40332e(function, obj);
            }
        };
        Function function4 = new Function() { // from class: pr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC7963f.m40318l(function2, obj);
            }
        };
        final MultimapBuilder.SetMultimapBuilder<Object, Object> linkedHashSetValues = MultimapBuilder.linkedHashKeys().linkedHashSetValues();
        Objects.requireNonNull(linkedHashSetValues);
        collectingAndThen = Collectors.collectingAndThen(m40361F(function3, function4, new Supplier() { // from class: qr
            @Override // java.util.function.Supplier
            public final Object get() {
                return MultimapBuilder.SetMultimapBuilder.this.build();
            }
        }), new Function() { // from class: rr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSetMultimap.copyOf((Multimap) ((SetMultimap) obj));
            }
        });
        return collectingAndThen;
    }

    /* renamed from: F */
    public static Collector m40361F(final Function function, final Function function2, Supplier supplier) {
        Collector of;
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(supplier);
        of = Collector.of(supplier, new BiConsumer() { // from class: er
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7963f.m40302t(function, function2, (Multimap) obj, obj2);
            }
        }, new BinaryOperator() { // from class: fr
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC7963f.m40365B((Multimap) obj, (Multimap) obj2);
            }
        }, new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: G */
    public static /* synthetic */ Object m40360G(Function function, Object obj) {
        Object apply;
        apply = function.apply(obj);
        return Preconditions.checkNotNull(apply);
    }

    /* renamed from: H */
    public static /* synthetic */ Stream m40359H(Function function, Object obj) {
        Object apply;
        Stream peek;
        apply = function.apply(obj);
        peek = AbstractC17220zq.m32a(apply).peek(new C1707Xr());
        return peek;
    }

    /* renamed from: I */
    public static /* synthetic */ Object m40358I(Function function, Object obj) {
        Object apply;
        apply = function.apply(obj);
        return Preconditions.checkNotNull(apply);
    }

    /* renamed from: J */
    public static /* synthetic */ Stream m40357J(Function function, Object obj) {
        Object apply;
        Stream peek;
        apply = function.apply(obj);
        peek = AbstractC17220zq.m32a(apply).peek(new C1707Xr());
        return peek;
    }

    /* renamed from: K */
    public static /* synthetic */ void m40356K(Function function, Function function2, Multimap multimap, Object obj) {
        Object apply;
        Object apply2;
        apply = function.apply(obj);
        final Collection collection = multimap.get(apply);
        apply2 = function2.apply(obj);
        Stream m32a = AbstractC17220zq.m32a(apply2);
        Objects.requireNonNull(collection);
        m32a.forEachOrdered(new Consumer() { // from class: Yr
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                collection.add(obj2);
            }
        });
    }

    /* renamed from: M */
    public static /* synthetic */ void m40354M(Function function, Function function2, ImmutableBiMap.Builder builder, Object obj) {
        Object apply;
        Object apply2;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        builder.put((ImmutableBiMap.Builder) apply, apply2);
    }

    /* renamed from: N */
    public static /* synthetic */ Object m40353N(Object obj, Object obj2) {
        throw new IllegalArgumentException("Multiple values for key: " + obj + ", " + obj2);
    }

    /* renamed from: O */
    public static /* synthetic */ C7965b m40352O() {
        return new C7965b(new BinaryOperator() { // from class: Wr
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC7963f.m40292y(obj, obj2);
            }
        });
    }

    /* renamed from: P */
    public static /* synthetic */ void m40351P(Function function, Function function2, C7965b c7965b, Object obj) {
        Object apply;
        Object apply2;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        c7965b.m40287b((Enum) Preconditions.checkNotNull((Enum) apply, "Null key for input %s", obj), Preconditions.checkNotNull(apply2, "Null value for input %s", obj));
    }

    /* renamed from: Q */
    public static /* synthetic */ C7965b m40350Q(BinaryOperator binaryOperator) {
        return new C7965b(binaryOperator);
    }

    /* renamed from: R */
    public static /* synthetic */ void m40349R(Function function, Function function2, C7965b c7965b, Object obj) {
        Object apply;
        Object apply2;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        c7965b.m40287b((Enum) Preconditions.checkNotNull((Enum) apply, "Null key for input %s", obj), Preconditions.checkNotNull(apply2, "Null value for input %s", obj));
    }

    /* renamed from: S */
    public static /* synthetic */ C7966c m40348S() {
        return new C7966c();
    }

    /* renamed from: T */
    public static /* synthetic */ void m40347T(Function function, Function function2, ImmutableListMultimap.Builder builder, Object obj) {
        Object apply;
        Object apply2;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        builder.put((ImmutableListMultimap.Builder) apply, apply2);
    }

    /* renamed from: U */
    public static /* synthetic */ void m40346U(Function function, Function function2, ImmutableMap.Builder builder, Object obj) {
        Object apply;
        Object apply2;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        builder.put(apply, apply2);
    }

    /* renamed from: V */
    public static /* synthetic */ void m40345V(Function function, ToIntFunction toIntFunction, Multiset multiset, Object obj) {
        Object apply;
        int applyAsInt;
        apply = function.apply(obj);
        Object checkNotNull = Preconditions.checkNotNull(apply);
        applyAsInt = toIntFunction.applyAsInt(obj);
        multiset.add(checkNotNull, applyAsInt);
    }

    /* renamed from: X */
    public static /* synthetic */ ImmutableMultiset m40343X(Multiset multiset) {
        return ImmutableMultiset.copyFromEntries(multiset.entrySet());
    }

    /* renamed from: Y */
    public static /* synthetic */ void m40342Y(Function function, Function function2, ImmutableRangeMap.Builder builder, Object obj) {
        Object apply;
        Object apply2;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        builder.put((Range) apply, apply2);
    }

    /* renamed from: Z */
    public static /* synthetic */ void m40341Z(Function function, Function function2, ImmutableSetMultimap.Builder builder, Object obj) {
        Object apply;
        Object apply2;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        builder.put((ImmutableSetMultimap.Builder) apply, apply2);
    }

    /* renamed from: a */
    public static /* synthetic */ Stream m40340a(Function function, Object obj) {
        return m40359H(function, obj);
    }

    /* renamed from: a0 */
    public static /* synthetic */ TreeMap m40339a0(Comparator comparator) {
        return new TreeMap(comparator);
    }

    /* renamed from: b0 */
    public static /* synthetic */ ImmutableSortedMap.Builder m40337b0(Comparator comparator) {
        return new ImmutableSortedMap.Builder(comparator);
    }

    /* renamed from: c */
    public static /* synthetic */ void m40336c(Function function, ToIntFunction toIntFunction, Multiset multiset, Object obj) {
        m40345V(function, toIntFunction, multiset, obj);
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m40335c0(Function function, Function function2, ImmutableSortedMap.Builder builder, Object obj) {
        Object apply;
        Object apply2;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        builder.put((ImmutableSortedMap.Builder) apply, apply2);
    }

    /* renamed from: d */
    public static /* synthetic */ C7965b m40334d() {
        return m40352O();
    }

    /* renamed from: d0 */
    public static /* synthetic */ ImmutableSortedSet.Builder m40333d0(Comparator comparator) {
        return new ImmutableSortedSet.Builder(comparator);
    }

    /* renamed from: e */
    public static /* synthetic */ Object m40332e(Function function, Object obj) {
        return m40358I(function, obj);
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m40331e0(Function function, Function function2, Multimap multimap, Object obj) {
        Object apply;
        Object apply2;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        multimap.put(apply, apply2);
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m40327g0(Function function, ToIntFunction toIntFunction, Multiset multiset, Object obj) {
        Object apply;
        int applyAsInt;
        apply = function.apply(obj);
        applyAsInt = toIntFunction.applyAsInt(obj);
        multiset.add(apply, applyAsInt);
    }

    /* renamed from: h */
    public static /* synthetic */ Multimap m40326h(Multimap multimap, Multimap multimap2) {
        return multimap.putAll(multimap2);
    }

    /* renamed from: i */
    public static /* synthetic */ void m40324i(Function function, Function function2, Multimap multimap, Object obj) {
        m40331e0(function, function2, multimap, obj);
    }

    /* renamed from: i0 */
    public static Collector m40323i0(final Function function, final Function function2) {
        Collector of;
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        of = Collector.of(new Supplier() { // from class: Kq
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableBiMap.Builder();
            }
        }, new BiConsumer() { // from class: Lq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7963f.m40354M(function, function2, (ImmutableBiMap.Builder) obj, obj2);
            }
        }, new BinaryOperator() { // from class: Mq
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableBiMap.Builder) obj).mo40964b((ImmutableBiMap.Builder) obj2);
            }
        }, new Function() { // from class: Nq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableBiMap.Builder) obj).buildOrThrow();
            }
        }, new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: j */
    public static /* synthetic */ Object m40322j(Function function, Object obj) {
        return m40360G(function, obj);
    }

    /* renamed from: j0 */
    public static Collector m40321j0(final Function function, final Function function2) {
        Collector.Characteristics characteristics;
        Collector of;
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Supplier supplier = new Supplier() { // from class: ur
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbstractC7963f.m40334d();
            }
        };
        BiConsumer biConsumer = new BiConsumer() { // from class: vr
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7963f.m40314n(function, function2, (AbstractC7963f.C7965b) obj, obj2);
            }
        };
        C17003wr c17003wr = new C17003wr();
        C17081xr c17081xr = new C17081xr();
        characteristics = Collector.Characteristics.UNORDERED;
        of = Collector.of(supplier, biConsumer, c17003wr, c17081xr, characteristics);
        return of;
    }

    /* renamed from: k0 */
    public static Collector m40319k0(final Function function, final Function function2, final BinaryOperator binaryOperator) {
        Collector of;
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        of = Collector.of(new Supplier() { // from class: Sr
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbstractC7963f.m40367A(binaryOperator);
            }
        }, new BiConsumer() { // from class: Tr
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7963f.m40290z(function, function2, (AbstractC7963f.C7965b) obj, obj2);
            }
        }, new C17003wr(), new C17081xr(), new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: l */
    public static /* synthetic */ Stream m40318l(Function function, Object obj) {
        return m40357J(function, obj);
    }

    /* renamed from: l0 */
    public static Collector m40317l0() {
        return C7966c.f53690b;
    }

    /* renamed from: m */
    public static /* synthetic */ Multiset m40316m(Multiset multiset, Multiset multiset2) {
        return multiset.addAll(multiset2);
    }

    /* renamed from: m0 */
    public static Collector m40315m0() {
        Collector.Characteristics characteristics;
        Collector of;
        Supplier supplier = new Supplier() { // from class: Oq
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbstractC7963f.m40308q();
            }
        };
        BiConsumer biConsumer = new BiConsumer() { // from class: Pq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((AbstractC7963f.C7966c) obj).m40285a((Enum) obj2);
            }
        };
        BinaryOperator binaryOperator = new BinaryOperator() { // from class: Qq
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((AbstractC7963f.C7966c) obj).m40284b((AbstractC7963f.C7966c) obj2);
            }
        };
        Function function = new Function() { // from class: Rq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AbstractC7963f.C7966c) obj).m40283c();
            }
        };
        characteristics = Collector.Characteristics.UNORDERED;
        of = Collector.of(supplier, biConsumer, binaryOperator, function, characteristics);
        return of;
    }

    /* renamed from: n */
    public static /* synthetic */ void m40314n(Function function, Function function2, C7965b c7965b, Object obj) {
        m40351P(function, function2, c7965b, obj);
    }

    /* renamed from: n0 */
    public static Collector m40313n0() {
        return f53685a;
    }

    /* renamed from: o */
    public static /* synthetic */ Multiset m40312o(Multiset multiset, Multiset multiset2) {
        return multiset.addAll(multiset2);
    }

    /* renamed from: o0 */
    public static Collector m40311o0(final Function function, final Function function2) {
        Collector of;
        Preconditions.checkNotNull(function, "keyFunction");
        Preconditions.checkNotNull(function2, "valueFunction");
        of = Collector.of(new Supplier() { // from class: Gr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableListMultimap.builder();
            }
        }, new BiConsumer() { // from class: Hr
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7963f.m40347T(function, function2, (ImmutableListMultimap.Builder) obj, obj2);
            }
        }, new BinaryOperator() { // from class: Ir
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableListMultimap.Builder) obj).m40977e((ImmutableListMultimap.Builder) obj2);
            }
        }, new Function() { // from class: Jr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableListMultimap.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: p */
    public static /* synthetic */ TreeMap m40310p(Comparator comparator) {
        return m40339a0(comparator);
    }

    /* renamed from: p0 */
    public static Collector m40309p0(final Function function, final Function function2) {
        Collector of;
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        of = Collector.of(new Supplier() { // from class: yr
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableMap.Builder();
            }
        }, new BiConsumer() { // from class: zr
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7963f.m40346U(function, function2, (ImmutableMap.Builder) obj, obj2);
            }
        }, new BinaryOperator() { // from class: Ar
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableMap.Builder) obj).mo40964b((ImmutableMap.Builder) obj2);
            }
        }, new Function() { // from class: Br
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableMap.Builder) obj).buildOrThrow();
            }
        }, new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: q */
    public static /* synthetic */ C7966c m40308q() {
        return m40348S();
    }

    /* renamed from: q0 */
    public static Collector m40307q0(Function function, Function function2, BinaryOperator binaryOperator) {
        Collector map;
        Collector collectingAndThen;
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        map = Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: Or
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LinkedHashMap();
            }
        });
        collectingAndThen = Collectors.collectingAndThen(map, new Function() { // from class: Pr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableMap.copyOf((Map) ((LinkedHashMap) obj));
            }
        });
        return collectingAndThen;
    }

    /* renamed from: r0 */
    public static Collector m40305r0(final Function function, final ToIntFunction toIntFunction) {
        Collector of;
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(toIntFunction);
        of = Collector.of(new Supplier() { // from class: kr
            @Override // java.util.function.Supplier
            public final Object get() {
                return LinkedHashMultiset.create();
            }
        }, new BiConsumer() { // from class: lr
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7963f.m40336c(function, toIntFunction, (Multiset) obj, obj2);
            }
        }, new BinaryOperator() { // from class: mr
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC7963f.m40316m((Multiset) obj, (Multiset) obj2);
            }
        }, new Function() { // from class: nr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ImmutableMultiset m40343X;
                m40343X = AbstractC7963f.m40343X((Multiset) obj);
                return m40343X;
            }
        }, new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: s0 */
    public static Collector m40303s0(final Function function, final Function function2) {
        Collector of;
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        of = Collector.of(new Supplier() { // from class: Zr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableRangeMap.builder();
            }
        }, new BiConsumer() { // from class: Dq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7963f.m40342Y(function, function2, (ImmutableRangeMap.Builder) obj, obj2);
            }
        }, new BinaryOperator() { // from class: Eq
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableRangeMap.Builder) obj).m40937a((ImmutableRangeMap.Builder) obj2);
            }
        }, new Function() { // from class: Fq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableRangeMap.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: t */
    public static /* synthetic */ void m40302t(Function function, Function function2, Multimap multimap, Object obj) {
        m40356K(function, function2, multimap, obj);
    }

    /* renamed from: t0 */
    public static Collector m40301t0() {
        return f53687c;
    }

    /* renamed from: u0 */
    public static Collector m40299u0() {
        return f53686b;
    }

    /* renamed from: v0 */
    public static Collector m40297v0(final Function function, final Function function2) {
        Collector of;
        Preconditions.checkNotNull(function, "keyFunction");
        Preconditions.checkNotNull(function2, "valueFunction");
        of = Collector.of(new Supplier() { // from class: Kr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableSetMultimap.builder();
            }
        }, new BiConsumer() { // from class: Lr
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7963f.m40341Z(function, function2, (ImmutableSetMultimap.Builder) obj, obj2);
            }
        }, new BinaryOperator() { // from class: Mr
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSetMultimap.Builder) obj).m40915e((ImmutableSetMultimap.Builder) obj2);
            }
        }, new Function() { // from class: Nr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSetMultimap.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: w0 */
    public static Collector m40295w0(final Comparator comparator, final Function function, final Function function2) {
        Collector.Characteristics characteristics;
        Collector of;
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Supplier supplier = new Supplier() { // from class: Gq
            @Override // java.util.function.Supplier
            public final Object get() {
                ImmutableSortedMap.Builder m40337b0;
                m40337b0 = AbstractC7963f.m40337b0(comparator);
                return m40337b0;
            }
        };
        BiConsumer biConsumer = new BiConsumer() { // from class: Hq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7963f.m40335c0(function, function2, (ImmutableSortedMap.Builder) obj, obj2);
            }
        };
        BinaryOperator binaryOperator = new BinaryOperator() { // from class: Iq
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedMap.Builder) obj).m40890f((ImmutableSortedMap.Builder) obj2);
            }
        };
        Function function3 = new Function() { // from class: Jq
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedMap.Builder) obj).buildOrThrow();
            }
        };
        characteristics = Collector.Characteristics.UNORDERED;
        of = Collector.of(supplier, biConsumer, binaryOperator, function3, characteristics);
        return of;
    }

    /* renamed from: x */
    public static /* synthetic */ void m40294x(Function function, ToIntFunction toIntFunction, Multiset multiset, Object obj) {
        m40327g0(function, toIntFunction, multiset, obj);
    }

    /* renamed from: x0 */
    public static Collector m40293x0(final Comparator comparator, Function function, Function function2, BinaryOperator binaryOperator) {
        Collector map;
        Collector collectingAndThen;
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        map = Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: sr
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbstractC7963f.m40310p(comparator);
            }
        });
        collectingAndThen = Collectors.collectingAndThen(map, new Function() { // from class: tr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSortedMap.copyOfSorted((TreeMap) obj);
            }
        });
        return collectingAndThen;
    }

    /* renamed from: y */
    public static /* synthetic */ Object m40292y(Object obj, Object obj2) {
        return m40353N(obj, obj2);
    }

    /* renamed from: y0 */
    public static Collector m40291y0(final Comparator comparator) {
        Collector of;
        Preconditions.checkNotNull(comparator);
        of = Collector.of(new Supplier() { // from class: Cr
            @Override // java.util.function.Supplier
            public final Object get() {
                ImmutableSortedSet.Builder m40333d0;
                m40333d0 = AbstractC7963f.m40333d0(comparator);
                return m40333d0;
            }
        }, new BiConsumer() { // from class: Dr
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSortedSet.Builder) obj).add((ImmutableSortedSet.Builder) obj2);
            }
        }, new BinaryOperator() { // from class: Er
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedSet.Builder) obj).mo40855e((ImmutableSortedSet.Builder) obj2);
            }
        }, new Function() { // from class: Fr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedSet.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
        return of;
    }

    /* renamed from: z */
    public static /* synthetic */ void m40290z(Function function, Function function2, C7965b c7965b, Object obj) {
        m40349R(function, function2, c7965b, obj);
    }

    /* renamed from: z0 */
    public static Collector m40289z0(final Function function, final Function function2, Supplier supplier) {
        Collector of;
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(supplier);
        of = Collector.of(supplier, new BiConsumer() { // from class: Ur
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC7963f.m40324i(function, function2, (Multimap) obj, obj2);
            }
        }, new BinaryOperator() { // from class: Vr
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC7963f.m40326h((Multimap) obj, (Multimap) obj2);
            }
        }, new Collector.Characteristics[0]);
        return of;
    }
}
