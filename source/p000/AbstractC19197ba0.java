package p000;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: ba0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC19197ba0 {
    /* renamed from: a */
    public static IOConsumer m51989a(final IOFunction iOFunction, final Consumer consumer) {
        Objects.requireNonNull(consumer, "after");
        return new IOConsumer() { // from class: X90
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                AbstractC19197ba0.m51980j(IOFunction.this, consumer, obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        };
    }

    /* renamed from: b */
    public static IOConsumer m51988b(final IOFunction iOFunction, final IOConsumer iOConsumer) {
        Objects.requireNonNull(iOConsumer, "after");
        return new IOConsumer() { // from class: V90
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                AbstractC19197ba0.m51978l(IOFunction.this, iOConsumer, obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer2) {
                return Q90.m66654a(this, iOConsumer2);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        };
    }

    /* renamed from: c */
    public static IOFunction m51987c(final IOFunction iOFunction, final Function function) {
        Objects.requireNonNull(function, "after");
        return new IOFunction() { // from class: W90
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return AbstractC19197ba0.m51979k(IOFunction.this, function, obj);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC19197ba0.m51985e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function2) {
                return AbstractC19197ba0.m51984f(this, function2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC19197ba0.m51988b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction2) {
                return AbstractC19197ba0.m51983g(this, iOFunction2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function2) {
                return AbstractC19197ba0.m51987c(this, function2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC19197ba0.m51982h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction2) {
                return AbstractC19197ba0.m51986d(this, iOFunction2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC19197ba0.m51981i(this, iOSupplier);
            }
        };
    }

    /* renamed from: d */
    public static IOFunction m51986d(final IOFunction iOFunction, final IOFunction iOFunction2) {
        Objects.requireNonNull(iOFunction2, "after");
        return new IOFunction() { // from class: T90
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return AbstractC19197ba0.m51977m(IOFunction.this, iOFunction2, obj);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC19197ba0.m51985e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function) {
                return AbstractC19197ba0.m51984f(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC19197ba0.m51988b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction3) {
                return AbstractC19197ba0.m51983g(this, iOFunction3);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function) {
                return AbstractC19197ba0.m51987c(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC19197ba0.m51982h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction3) {
                return AbstractC19197ba0.m51986d(this, iOFunction3);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC19197ba0.m51981i(this, iOSupplier);
            }
        };
    }

    /* renamed from: e */
    public static Function m51985e(final IOFunction iOFunction) {
        return new Function() { // from class: S90
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC19197ba0.m51976n(iOFunction, obj);
            }
        };
    }

    /* renamed from: f */
    public static IOFunction m51984f(final IOFunction iOFunction, final Function function) {
        Objects.requireNonNull(function, "before");
        return new IOFunction() { // from class: U90
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return AbstractC19197ba0.m51975o(IOFunction.this, function, obj);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC19197ba0.m51985e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function2) {
                return AbstractC19197ba0.m51984f(this, function2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC19197ba0.m51988b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction2) {
                return AbstractC19197ba0.m51983g(this, iOFunction2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function2) {
                return AbstractC19197ba0.m51987c(this, function2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC19197ba0.m51982h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction2) {
                return AbstractC19197ba0.m51986d(this, iOFunction2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC19197ba0.m51981i(this, iOSupplier);
            }
        };
    }

    /* renamed from: g */
    public static IOFunction m51983g(final IOFunction iOFunction, final IOFunction iOFunction2) {
        Objects.requireNonNull(iOFunction2, "before");
        return new IOFunction() { // from class: Z90
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return AbstractC19197ba0.m51974p(IOFunction.this, iOFunction2, obj);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC19197ba0.m51985e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function) {
                return AbstractC19197ba0.m51984f(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC19197ba0.m51988b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction3) {
                return AbstractC19197ba0.m51983g(this, iOFunction3);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function) {
                return AbstractC19197ba0.m51987c(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC19197ba0.m51982h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction3) {
                return AbstractC19197ba0.m51986d(this, iOFunction3);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC19197ba0.m51981i(this, iOSupplier);
            }
        };
    }

    /* renamed from: h */
    public static IOSupplier m51982h(final IOFunction iOFunction, final Supplier supplier) {
        Objects.requireNonNull(supplier, "before");
        return new IOSupplier() { // from class: aa0
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return AbstractC19197ba0.m51972r(IOFunction.this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        };
    }

    /* renamed from: i */
    public static IOSupplier m51981i(final IOFunction iOFunction, final IOSupplier iOSupplier) {
        Objects.requireNonNull(iOSupplier, "before");
        return new IOSupplier() { // from class: Y90
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return AbstractC19197ba0.m51973q(IOFunction.this, iOSupplier);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        };
    }

    /* renamed from: j */
    public static /* synthetic */ void m51980j(IOFunction iOFunction, Consumer consumer, Object obj) {
        consumer.accept(iOFunction.apply(obj));
    }

    /* renamed from: k */
    public static /* synthetic */ Object m51979k(IOFunction iOFunction, Function function, Object obj) {
        Object apply;
        apply = function.apply(iOFunction.apply(obj));
        return apply;
    }

    /* renamed from: l */
    public static /* synthetic */ void m51978l(IOFunction iOFunction, IOConsumer iOConsumer, Object obj) {
        iOConsumer.accept(iOFunction.apply(obj));
    }

    /* renamed from: m */
    public static /* synthetic */ Object m51977m(IOFunction iOFunction, IOFunction iOFunction2, Object obj) {
        return iOFunction2.apply(iOFunction.apply(obj));
    }

    /* renamed from: n */
    public static /* synthetic */ Object m51976n(IOFunction iOFunction, Object obj) {
        return Uncheck.apply(iOFunction, obj);
    }

    /* renamed from: o */
    public static /* synthetic */ Object m51975o(IOFunction iOFunction, Function function, Object obj) {
        Object apply;
        apply = function.apply(obj);
        return iOFunction.apply(apply);
    }

    /* renamed from: p */
    public static /* synthetic */ Object m51974p(IOFunction iOFunction, IOFunction iOFunction2, Object obj) {
        return iOFunction.apply(iOFunction2.apply(obj));
    }

    /* renamed from: q */
    public static /* synthetic */ Object m51973q(IOFunction iOFunction, IOSupplier iOSupplier) {
        return iOFunction.apply(iOSupplier.get());
    }

    /* renamed from: r */
    public static /* synthetic */ Object m51972r(IOFunction iOFunction, Supplier supplier) {
        Object obj;
        obj = supplier.get();
        return iOFunction.apply(obj);
    }

    /* renamed from: s */
    public static IOFunction m51971s() {
        return AbstractC12253lx.f71781d;
    }
}
