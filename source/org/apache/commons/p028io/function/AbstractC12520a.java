package org.apache.commons.p028io.function;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.commons.p028io.IOExceptionList;
import org.apache.commons.p028io.function.AbstractC12520a;

/* renamed from: org.apache.commons.io.function.a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC12520a {

    /* renamed from: org.apache.commons.io.function.a$a */
    /* loaded from: classes6.dex */
    public class C12521a implements Iterator {

        /* renamed from: a */
        public Object f73320a = AbstractC17584Fb0.f1644a;

        /* renamed from: b */
        public final /* synthetic */ Object f73321b;

        /* renamed from: c */
        public final /* synthetic */ IOUnaryOperator f73322c;

        public C12521a(Object obj, IOUnaryOperator iOUnaryOperator) {
            this.f73321b = obj;
            this.f73322c = iOUnaryOperator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object apply;
            try {
                Object obj = this.f73320a;
                if (obj == AbstractC17584Fb0.f1644a) {
                    apply = this.f73321b;
                } else {
                    apply = this.f73322c.apply(obj);
                }
                this.f73320a = apply;
                return apply;
            } catch (IOException e) {
                NoSuchElementException noSuchElementException = new NoSuchElementException();
                noSuchElementException.initCause(e);
                throw noSuchElementException;
            }
        }
    }

    /* renamed from: A */
    public static Object m25226A(IOStream iOStream, Object obj, final IOBiFunction iOBiFunction, final IOBinaryOperator iOBinaryOperator) {
        Object reduce;
        reduce = AbstractC17220zq.m32a(iOStream.unwrap()).reduce(obj, new BiFunction() { // from class: ub0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                return AbstractC12520a.m25187g0(iOBiFunction, obj2, obj3);
            }
        }, new BinaryOperator() { // from class: vb0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                return AbstractC12520a.m25185h0(iOBinaryOperator, obj2, obj3);
            }
        });
        return reduce;
    }

    /* renamed from: B */
    public static Object m25225B(IOStream iOStream, Object obj, final IOBinaryOperator iOBinaryOperator) {
        Object reduce;
        reduce = AbstractC17220zq.m32a(iOStream.unwrap()).reduce(obj, new BinaryOperator() { // from class: zb0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                return AbstractC12520a.m25189f0(iOBinaryOperator, obj2, obj3);
            }
        });
        return reduce;
    }

    /* renamed from: C */
    public static Optional m25224C(IOStream iOStream, final IOBinaryOperator iOBinaryOperator) {
        Optional reduce;
        reduce = AbstractC17220zq.m32a(iOStream.unwrap()).reduce(new BinaryOperator() { // from class: eb0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC12520a.m25191e0(iOBinaryOperator, obj, obj2);
            }
        });
        return reduce;
    }

    /* renamed from: D */
    public static IOStream m25223D(IOStream iOStream, long j) {
        Stream skip;
        skip = AbstractC17220zq.m32a(iOStream.unwrap()).skip(j);
        return m25218I(skip);
    }

    /* renamed from: E */
    public static IOStream m25222E(IOStream iOStream) {
        Stream sorted;
        sorted = AbstractC17220zq.m32a(iOStream.unwrap()).sorted();
        return m25218I(sorted);
    }

    /* renamed from: F */
    public static IOStream m25221F(IOStream iOStream, final IOComparator iOComparator) {
        Stream sorted;
        sorted = AbstractC17220zq.m32a(iOStream.unwrap()).sorted(new Comparator() { // from class: Bb0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC12520a.m25183i0(iOComparator, obj, obj2);
            }
        });
        return m25218I(sorted);
    }

    /* renamed from: G */
    public static Object[] m25220G(IOStream iOStream) {
        Object[] array;
        array = AbstractC17220zq.m32a(iOStream.unwrap()).toArray();
        return array;
    }

    /* renamed from: H */
    public static Object[] m25219H(IOStream iOStream, IntFunction intFunction) {
        Object[] array;
        array = AbstractC17220zq.m32a(iOStream.unwrap()).toArray(intFunction);
        return array;
    }

    /* renamed from: I */
    public static IOStream m25218I(Stream stream) {
        return C17392Cb0.m68752b(stream);
    }

    /* renamed from: J */
    public static IOStream m25217J() {
        Stream empty;
        empty = Stream.empty();
        return C17392Cb0.m68752b(empty);
    }

    /* renamed from: K */
    public static IOStream m25216K(Object obj, IOUnaryOperator iOUnaryOperator) {
        Spliterator spliteratorUnknownSize;
        Stream stream;
        Objects.requireNonNull(iOUnaryOperator);
        spliteratorUnknownSize = Spliterators.spliteratorUnknownSize(new C12521a(obj, iOUnaryOperator), 1040);
        stream = StreamSupport.stream(spliteratorUnknownSize, false);
        return m25218I(stream);
    }

    /* renamed from: L */
    public static /* synthetic */ boolean m25215L(IOPredicate iOPredicate, Object obj) {
        return Erase.m25229h(iOPredicate, obj);
    }

    /* renamed from: M */
    public static /* synthetic */ boolean m25214M(IOPredicate iOPredicate, Object obj) {
        return Erase.m25229h(iOPredicate, obj);
    }

    /* renamed from: N */
    public static /* synthetic */ Object m25213N(IOSupplier iOSupplier) {
        return Erase.m25231f(iOSupplier);
    }

    /* renamed from: O */
    public static /* synthetic */ void m25212O(IOBiConsumer iOBiConsumer, Object obj, Object obj2) {
        Erase.m25236a(iOBiConsumer, obj, obj2);
    }

    /* renamed from: P */
    public static /* synthetic */ void m25211P(IOBiConsumer iOBiConsumer, Object obj, Object obj2) {
        Erase.m25236a(iOBiConsumer, obj, obj2);
    }

    /* renamed from: Q */
    public static /* synthetic */ boolean m25210Q(IOPredicate iOPredicate, Object obj) {
        return Erase.m25229h(iOPredicate, obj);
    }

    /* renamed from: R */
    public static /* synthetic */ Stream m25209R(IOFunction iOFunction, Object obj) {
        return AbstractC17220zq.m32a(((IOStream) Erase.m25233d(iOFunction, obj)).unwrap());
    }

    /* renamed from: S */
    public static /* synthetic */ DoubleStream m25208S(IOFunction iOFunction, Object obj) {
        return AbstractC18605Va0.m65760a(Erase.m25233d(iOFunction, obj));
    }

    /* renamed from: T */
    public static /* synthetic */ IntStream m25207T(IOFunction iOFunction, Object obj) {
        return AbstractC18541Ua0.m66018a(Erase.m25233d(iOFunction, obj));
    }

    /* renamed from: U */
    public static /* synthetic */ LongStream m25206U(IOFunction iOFunction, Object obj) {
        return AbstractC18477Ta0.m66192a(Erase.m25233d(iOFunction, obj));
    }

    /* renamed from: W */
    public static /* synthetic */ void m25204W(IOConsumer iOConsumer, AtomicReference atomicReference, BiFunction biFunction, AtomicInteger atomicInteger, Object obj) {
        Object apply;
        try {
            iOConsumer.accept(obj);
        } catch (IOException e) {
            if (atomicReference.get() == null) {
                atomicReference.set(new ArrayList());
            }
            if (biFunction != null) {
                apply = biFunction.apply(Integer.valueOf(atomicInteger.get()), e);
                ((List) atomicReference.get()).add((IOException) apply);
            }
        }
        atomicInteger.incrementAndGet();
    }

    /* renamed from: X */
    public static /* synthetic */ void m25203X(IOConsumer iOConsumer, Object obj) {
        Erase.m25235b(iOConsumer, obj);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m25202Y(IOConsumer iOConsumer, Object obj) {
        Erase.m25235b(iOConsumer, obj);
    }

    /* renamed from: Z */
    public static /* synthetic */ Object m25201Z(IOFunction iOFunction, Object obj) {
        return Erase.m25233d(iOFunction, obj);
    }

    /* renamed from: a */
    public static boolean m25200a(IOStream iOStream, final IOPredicate iOPredicate) {
        boolean allMatch;
        allMatch = AbstractC17220zq.m32a(iOStream.unwrap()).allMatch(new Predicate() { // from class: xb0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AbstractC12520a.m25215L(iOPredicate, obj);
            }
        });
        return allMatch;
    }

    /* renamed from: a0 */
    public static /* synthetic */ int m25199a0(IOComparator iOComparator, Object obj, Object obj2) {
        return Erase.m25232e(iOComparator, obj, obj2);
    }

    /* renamed from: b */
    public static boolean m25198b(IOStream iOStream, final IOPredicate iOPredicate) {
        boolean anyMatch;
        anyMatch = AbstractC17220zq.m32a(iOStream.unwrap()).anyMatch(new Predicate() { // from class: wb0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AbstractC12520a.m25214M(iOPredicate, obj);
            }
        });
        return anyMatch;
    }

    /* renamed from: b0 */
    public static /* synthetic */ int m25197b0(IOComparator iOComparator, Object obj, Object obj2) {
        return Erase.m25232e(iOComparator, obj, obj2);
    }

    /* renamed from: c */
    public static Object m25196c(IOStream iOStream, Collector collector) {
        Object collect;
        collect = AbstractC17220zq.m32a(iOStream.unwrap()).collect(collector);
        return collect;
    }

    /* renamed from: c0 */
    public static /* synthetic */ boolean m25195c0(IOPredicate iOPredicate, Object obj) {
        return Erase.m25229h(iOPredicate, obj);
    }

    /* renamed from: d */
    public static Object m25194d(IOStream iOStream, final IOSupplier iOSupplier, final IOBiConsumer iOBiConsumer, final IOBiConsumer iOBiConsumer2) {
        Object collect;
        collect = AbstractC17220zq.m32a(iOStream.unwrap()).collect(new Supplier() { // from class: mb0
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbstractC12520a.m25213N(iOSupplier);
            }
        }, new BiConsumer() { // from class: nb0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC12520a.m25212O(iOBiConsumer, obj, obj2);
            }
        }, new BiConsumer() { // from class: ob0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC12520a.m25211P(iOBiConsumer2, obj, obj2);
            }
        });
        return collect;
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m25193d0(IOConsumer iOConsumer, Object obj) {
        Erase.m25235b(iOConsumer, obj);
    }

    /* renamed from: e */
    public static long m25192e(IOStream iOStream) {
        long count;
        count = AbstractC17220zq.m32a(iOStream.unwrap()).count();
        return count;
    }

    /* renamed from: e0 */
    public static /* synthetic */ Object m25191e0(IOBinaryOperator iOBinaryOperator, Object obj, Object obj2) {
        return Erase.m25234c(iOBinaryOperator, obj, obj2);
    }

    /* renamed from: f */
    public static IOStream m25190f(IOStream iOStream) {
        Stream distinct;
        distinct = AbstractC17220zq.m32a(iOStream.unwrap()).distinct();
        return m25218I(distinct);
    }

    /* renamed from: f0 */
    public static /* synthetic */ Object m25189f0(IOBinaryOperator iOBinaryOperator, Object obj, Object obj2) {
        return Erase.m25234c(iOBinaryOperator, obj, obj2);
    }

    /* renamed from: g */
    public static IOStream m25188g(IOStream iOStream, final IOPredicate iOPredicate) {
        Stream filter;
        filter = AbstractC17220zq.m32a(iOStream.unwrap()).filter(new Predicate() { // from class: tb0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AbstractC12520a.m25210Q(iOPredicate, obj);
            }
        });
        return m25218I(filter);
    }

    /* renamed from: g0 */
    public static /* synthetic */ Object m25187g0(IOBiFunction iOBiFunction, Object obj, Object obj2) {
        return Erase.m25234c(iOBiFunction, obj, obj2);
    }

    /* renamed from: h */
    public static Optional m25186h(IOStream iOStream) {
        Optional findAny;
        findAny = AbstractC17220zq.m32a(iOStream.unwrap()).findAny();
        return findAny;
    }

    /* renamed from: h0 */
    public static /* synthetic */ Object m25185h0(IOBinaryOperator iOBinaryOperator, Object obj, Object obj2) {
        return Erase.m25234c(iOBinaryOperator, obj, obj2);
    }

    /* renamed from: i */
    public static Optional m25184i(IOStream iOStream) {
        Optional findFirst;
        findFirst = AbstractC17220zq.m32a(iOStream.unwrap()).findFirst();
        return findFirst;
    }

    /* renamed from: i0 */
    public static /* synthetic */ int m25183i0(IOComparator iOComparator, Object obj, Object obj2) {
        return Erase.m25232e(iOComparator, obj, obj2);
    }

    /* renamed from: j */
    public static IOStream m25182j(IOStream iOStream, final IOFunction iOFunction) {
        Stream flatMap;
        flatMap = AbstractC17220zq.m32a(iOStream.unwrap()).flatMap(new Function() { // from class: qb0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC12520a.m25209R(iOFunction, obj);
            }
        });
        return m25218I(flatMap);
    }

    /* renamed from: j0 */
    public static IOStream m25181j0(Iterable iterable) {
        Spliterator spliterator;
        Stream stream;
        if (iterable != null) {
            spliterator = iterable.spliterator();
            stream = StreamSupport.stream(spliterator, false);
            return m25218I(stream);
        }
        return m25217J();
    }

    /* renamed from: k */
    public static DoubleStream m25180k(IOStream iOStream, final IOFunction iOFunction) {
        DoubleStream flatMapToDouble;
        flatMapToDouble = AbstractC17220zq.m32a(iOStream.unwrap()).flatMapToDouble(new Function() { // from class: Ab0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC12520a.m25208S(iOFunction, obj);
            }
        });
        return flatMapToDouble;
    }

    /* renamed from: k0 */
    public static IOStream m25179k0(Object obj) {
        Stream of;
        of = Stream.of(obj);
        return m25218I(of);
    }

    /* renamed from: l */
    public static IntStream m25178l(IOStream iOStream, final IOFunction iOFunction) {
        IntStream flatMapToInt;
        flatMapToInt = AbstractC17220zq.m32a(iOStream.unwrap()).flatMapToInt(new Function() { // from class: fb0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC12520a.m25207T(iOFunction, obj);
            }
        });
        return flatMapToInt;
    }

    /* renamed from: l0 */
    public static IOStream m25177l0(Object... objArr) {
        Stream stream;
        if (objArr != null && objArr.length != 0) {
            stream = Arrays.stream(objArr);
            return m25218I(stream);
        }
        return m25217J();
    }

    /* renamed from: m */
    public static LongStream m25176m(IOStream iOStream, final IOFunction iOFunction) {
        LongStream flatMapToLong;
        flatMapToLong = AbstractC17220zq.m32a(iOStream.unwrap()).flatMapToLong(new Function() { // from class: yb0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC12520a.m25206U(iOFunction, obj);
            }
        });
        return flatMapToLong;
    }

    /* renamed from: n */
    public static void m25175n(IOStream iOStream, IOConsumer iOConsumer) {
        iOStream.forAll(iOConsumer, new BiFunction() { // from class: sb0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC12520a.m25205V((Integer) obj, (IOException) obj2);
            }
        });
    }

    /* renamed from: o */
    public static void m25174o(IOStream iOStream, IOConsumer iOConsumer, final BiFunction biFunction) {
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicInteger atomicInteger = new AtomicInteger();
        final IOConsumer m68382k = AbstractC17584Fb0.m68382k(iOConsumer);
        AbstractC17220zq.m32a(iOStream.unwrap()).forEach(new Consumer() { // from class: ib0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AbstractC12520a.m25204W(m68382k, atomicReference, biFunction, atomicInteger, obj);
            }
        });
        IOExceptionList.checkEmpty((List) atomicReference.get(), null);
    }

    /* renamed from: p */
    public static void m25173p(IOStream iOStream, final IOConsumer iOConsumer) {
        AbstractC17220zq.m32a(iOStream.unwrap()).forEach(new Consumer() { // from class: hb0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AbstractC12520a.m25203X(iOConsumer, obj);
            }
        });
    }

    /* renamed from: q */
    public static void m25172q(IOStream iOStream, final IOConsumer iOConsumer) {
        AbstractC17220zq.m32a(iOStream.unwrap()).forEachOrdered(new Consumer() { // from class: jb0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AbstractC12520a.m25202Y(iOConsumer, obj);
            }
        });
    }

    /* renamed from: r */
    public static IOStream m25171r(IOStream iOStream, long j) {
        Stream limit;
        limit = AbstractC17220zq.m32a(iOStream.unwrap()).limit(j);
        return m25218I(limit);
    }

    /* renamed from: s */
    public static IOStream m25170s(IOStream iOStream, final IOFunction iOFunction) {
        Stream map;
        map = AbstractC17220zq.m32a(iOStream.unwrap()).map(new Function() { // from class: pb0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC12520a.m25201Z(iOFunction, obj);
            }
        });
        return m25218I(map);
    }

    /* renamed from: t */
    public static DoubleStream m25169t(IOStream iOStream, ToDoubleFunction toDoubleFunction) {
        DoubleStream mapToDouble;
        mapToDouble = AbstractC17220zq.m32a(iOStream.unwrap()).mapToDouble(toDoubleFunction);
        return mapToDouble;
    }

    /* renamed from: u */
    public static IntStream m25168u(IOStream iOStream, ToIntFunction toIntFunction) {
        IntStream mapToInt;
        mapToInt = AbstractC17220zq.m32a(iOStream.unwrap()).mapToInt(toIntFunction);
        return mapToInt;
    }

    /* renamed from: v */
    public static LongStream m25167v(IOStream iOStream, ToLongFunction toLongFunction) {
        LongStream mapToLong;
        mapToLong = AbstractC17220zq.m32a(iOStream.unwrap()).mapToLong(toLongFunction);
        return mapToLong;
    }

    /* renamed from: w */
    public static Optional m25166w(IOStream iOStream, final IOComparator iOComparator) {
        Optional max;
        max = AbstractC17220zq.m32a(iOStream.unwrap()).max(new Comparator() { // from class: lb0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC12520a.m25199a0(iOComparator, obj, obj2);
            }
        });
        return max;
    }

    /* renamed from: x */
    public static Optional m25165x(IOStream iOStream, final IOComparator iOComparator) {
        Optional min;
        min = AbstractC17220zq.m32a(iOStream.unwrap()).min(new Comparator() { // from class: kb0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC12520a.m25197b0(iOComparator, obj, obj2);
            }
        });
        return min;
    }

    /* renamed from: y */
    public static boolean m25164y(IOStream iOStream, final IOPredicate iOPredicate) {
        boolean noneMatch;
        noneMatch = AbstractC17220zq.m32a(iOStream.unwrap()).noneMatch(new Predicate() { // from class: gb0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AbstractC12520a.m25195c0(iOPredicate, obj);
            }
        });
        return noneMatch;
    }

    /* renamed from: z */
    public static IOStream m25163z(IOStream iOStream, final IOConsumer iOConsumer) {
        Stream peek;
        peek = AbstractC17220zq.m32a(iOStream.unwrap()).peek(new Consumer() { // from class: rb0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AbstractC12520a.m25193d0(iOConsumer, obj);
            }
        });
        return m25218I(peek);
    }

    /* renamed from: V */
    public static /* synthetic */ IOException m25205V(Integer num, IOException iOException) {
        return iOException;
    }
}
