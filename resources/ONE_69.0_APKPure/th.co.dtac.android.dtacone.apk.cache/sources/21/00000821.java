package p000;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import org.apache.commons.p028io.function.AbstractC12520a;
import org.apache.commons.p028io.function.IOBaseStream;
import org.apache.commons.p028io.function.IOBiConsumer;
import org.apache.commons.p028io.function.IOBiFunction;
import org.apache.commons.p028io.function.IOBinaryOperator;
import org.apache.commons.p028io.function.IOComparator;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOPredicate;
import org.apache.commons.p028io.function.IOStream;
import org.apache.commons.p028io.function.IOSupplier;

/* renamed from: Ib0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17807Ib0 extends B90 implements IOStream {
    public C17807Ib0(Stream stream) {
        super(stream);
    }

    /* renamed from: b */
    public static IOStream m68003b(Stream stream) {
        if (stream != null) {
            return new C17807Ib0(stream);
        }
        return AbstractC12520a.m25407J();
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ boolean allMatch(IOPredicate iOPredicate) {
        return AbstractC12520a.m25390a(this, iOPredicate);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ boolean anyMatch(IOPredicate iOPredicate) {
        return AbstractC12520a.m25388b(this, iOPredicate);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ Object collect(Collector collector) {
        return AbstractC12520a.m25386c(this, collector);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ long count() {
        return AbstractC12520a.m25382e(this);
    }

    /* renamed from: d */
    public IOStream m68002d(Stream stream) {
        if (unwrap() == stream) {
            return this;
        }
        return m68003b(stream);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ IOStream distinct() {
        return AbstractC12520a.m25380f(this);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ IOStream filter(IOPredicate iOPredicate) {
        return AbstractC12520a.m25378g(this, iOPredicate);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ Optional findAny() {
        return AbstractC12520a.m25376h(this);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ Optional findFirst() {
        return AbstractC12520a.m25374i(this);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ IOStream flatMap(IOFunction iOFunction) {
        return AbstractC12520a.m25372j(this, iOFunction);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ DoubleStream flatMapToDouble(IOFunction iOFunction) {
        return AbstractC12520a.m25370k(this, iOFunction);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ IntStream flatMapToInt(IOFunction iOFunction) {
        return AbstractC12520a.m25368l(this, iOFunction);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ LongStream flatMapToLong(IOFunction iOFunction) {
        return AbstractC12520a.m25366m(this, iOFunction);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ void forAll(IOConsumer iOConsumer) {
        AbstractC12520a.m25365n(this, iOConsumer);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ void forEach(IOConsumer iOConsumer) {
        AbstractC12520a.m25363p(this, iOConsumer);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ void forEachOrdered(IOConsumer iOConsumer) {
        AbstractC12520a.m25362q(this, iOConsumer);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ IOStream limit(long j) {
        return AbstractC12520a.m25361r(this, j);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ IOStream map(IOFunction iOFunction) {
        return AbstractC12520a.m25360s(this, iOFunction);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        return AbstractC12520a.m25359t(this, toDoubleFunction);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return AbstractC12520a.m25358u(this, toIntFunction);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
        return AbstractC12520a.m25357v(this, toLongFunction);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ Optional max(IOComparator iOComparator) {
        return AbstractC12520a.m25356w(this, iOComparator);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ Optional min(IOComparator iOComparator) {
        return AbstractC12520a.m25355x(this, iOComparator);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ boolean noneMatch(IOPredicate iOPredicate) {
        return AbstractC12520a.m25354y(this, iOPredicate);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ IOStream peek(IOConsumer iOConsumer) {
        return AbstractC12520a.m25353z(this, iOConsumer);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ Object reduce(Object obj, IOBiFunction iOBiFunction, IOBinaryOperator iOBinaryOperator) {
        return AbstractC12520a.m25416A(this, obj, iOBiFunction, iOBinaryOperator);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ IOStream skip(long j) {
        return AbstractC12520a.m25413D(this, j);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ IOStream sorted() {
        return AbstractC12520a.m25412E(this);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ Object[] toArray() {
        return AbstractC12520a.m25410G(this);
    }

    @Override // org.apache.commons.p028io.function.IOBaseStream
    public /* bridge */ /* synthetic */ IOBaseStream wrap(BaseStream baseStream) {
        return m68002d(AbstractC17245zq.m69a(baseStream));
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ Object collect(IOSupplier iOSupplier, IOBiConsumer iOBiConsumer, IOBiConsumer iOBiConsumer2) {
        return AbstractC12520a.m25384d(this, iOSupplier, iOBiConsumer, iOBiConsumer2);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ void forAll(IOConsumer iOConsumer, BiFunction biFunction) {
        AbstractC12520a.m25364o(this, iOConsumer, biFunction);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ Object reduce(Object obj, IOBinaryOperator iOBinaryOperator) {
        return AbstractC12520a.m25415B(this, obj, iOBinaryOperator);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ IOStream sorted(IOComparator iOComparator) {
        return AbstractC12520a.m25411F(this, iOComparator);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return AbstractC12520a.m25409H(this, intFunction);
    }

    @Override // org.apache.commons.p028io.function.IOStream
    public /* synthetic */ Optional reduce(IOBinaryOperator iOBinaryOperator) {
        return AbstractC12520a.m25414C(this, iOBinaryOperator);
    }
}