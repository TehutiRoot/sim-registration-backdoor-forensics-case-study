package p000;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: ha0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC20283ha0 {
    /* renamed from: a */
    public static IOConsumer m31217a(final IOFunction iOFunction, final Consumer consumer) {
        Objects.requireNonNull(consumer, "after");
        return new IOConsumer() { // from class: da0
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                AbstractC20283ha0.m31208j(IOFunction.this, consumer, obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return W90.m65808a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return W90.m65807b(this);
            }
        };
    }

    /* renamed from: b */
    public static IOConsumer m31216b(final IOFunction iOFunction, final IOConsumer iOConsumer) {
        Objects.requireNonNull(iOConsumer, "after");
        return new IOConsumer() { // from class: ba0
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                AbstractC20283ha0.m31206l(IOFunction.this, iOConsumer, obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer2) {
                return W90.m65808a(this, iOConsumer2);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return W90.m65807b(this);
            }
        };
    }

    /* renamed from: c */
    public static IOFunction m31215c(final IOFunction iOFunction, final Function function) {
        Objects.requireNonNull(function, "after");
        return new IOFunction() { // from class: ca0
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return AbstractC20283ha0.m31207k(IOFunction.this, function, obj);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC20283ha0.m31213e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function2) {
                return AbstractC20283ha0.m31212f(this, function2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC20283ha0.m31216b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction2) {
                return AbstractC20283ha0.m31211g(this, iOFunction2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function2) {
                return AbstractC20283ha0.m31215c(this, function2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC20283ha0.m31210h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction2) {
                return AbstractC20283ha0.m31214d(this, iOFunction2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC20283ha0.m31209i(this, iOSupplier);
            }
        };
    }

    /* renamed from: d */
    public static IOFunction m31214d(final IOFunction iOFunction, final IOFunction iOFunction2) {
        Objects.requireNonNull(iOFunction2, "after");
        return new IOFunction() { // from class: Z90
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return AbstractC20283ha0.m31205m(IOFunction.this, iOFunction2, obj);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC20283ha0.m31213e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function) {
                return AbstractC20283ha0.m31212f(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC20283ha0.m31216b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction3) {
                return AbstractC20283ha0.m31211g(this, iOFunction3);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function) {
                return AbstractC20283ha0.m31215c(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC20283ha0.m31210h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction3) {
                return AbstractC20283ha0.m31214d(this, iOFunction3);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC20283ha0.m31209i(this, iOSupplier);
            }
        };
    }

    /* renamed from: e */
    public static Function m31213e(final IOFunction iOFunction) {
        return new Function() { // from class: Y90
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC20283ha0.m31204n(IOFunction.this, obj);
            }
        };
    }

    /* renamed from: f */
    public static IOFunction m31212f(final IOFunction iOFunction, final Function function) {
        Objects.requireNonNull(function, "before");
        return new IOFunction() { // from class: aa0
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return AbstractC20283ha0.m31203o(IOFunction.this, function, obj);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC20283ha0.m31213e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function2) {
                return AbstractC20283ha0.m31212f(this, function2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC20283ha0.m31216b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction2) {
                return AbstractC20283ha0.m31211g(this, iOFunction2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function2) {
                return AbstractC20283ha0.m31215c(this, function2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC20283ha0.m31210h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction2) {
                return AbstractC20283ha0.m31214d(this, iOFunction2);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC20283ha0.m31209i(this, iOSupplier);
            }
        };
    }

    /* renamed from: g */
    public static IOFunction m31211g(final IOFunction iOFunction, final IOFunction iOFunction2) {
        Objects.requireNonNull(iOFunction2, "before");
        return new IOFunction() { // from class: fa0
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return AbstractC20283ha0.m31202p(IOFunction.this, iOFunction2, obj);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC20283ha0.m31213e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function) {
                return AbstractC20283ha0.m31212f(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC20283ha0.m31216b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction3) {
                return AbstractC20283ha0.m31211g(this, iOFunction3);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function) {
                return AbstractC20283ha0.m31215c(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC20283ha0.m31210h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction3) {
                return AbstractC20283ha0.m31214d(this, iOFunction3);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC20283ha0.m31209i(this, iOSupplier);
            }
        };
    }

    /* renamed from: h */
    public static IOSupplier m31210h(final IOFunction iOFunction, final Supplier supplier) {
        Objects.requireNonNull(supplier, "before");
        return new IOSupplier() { // from class: ga0
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC18132Nb0.m67225a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return AbstractC20283ha0.m31200r(IOFunction.this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC18132Nb0.m67224b(this);
            }
        };
    }

    /* renamed from: i */
    public static IOSupplier m31209i(final IOFunction iOFunction, final IOSupplier iOSupplier) {
        Objects.requireNonNull(iOSupplier, "before");
        return new IOSupplier() { // from class: ea0
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC18132Nb0.m67225a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return AbstractC20283ha0.m31201q(IOFunction.this, iOSupplier);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC18132Nb0.m67224b(this);
            }
        };
    }

    /* renamed from: j */
    public static /* synthetic */ void m31208j(IOFunction iOFunction, Consumer consumer, Object obj) {
        consumer.accept(iOFunction.apply(obj));
    }

    /* renamed from: k */
    public static /* synthetic */ Object m31207k(IOFunction iOFunction, Function function, Object obj) {
        Object apply;
        apply = function.apply(iOFunction.apply(obj));
        return apply;
    }

    /* renamed from: l */
    public static /* synthetic */ void m31206l(IOFunction iOFunction, IOConsumer iOConsumer, Object obj) {
        iOConsumer.accept(iOFunction.apply(obj));
    }

    /* renamed from: m */
    public static /* synthetic */ Object m31205m(IOFunction iOFunction, IOFunction iOFunction2, Object obj) {
        return iOFunction2.apply(iOFunction.apply(obj));
    }

    /* renamed from: n */
    public static /* synthetic */ Object m31204n(IOFunction iOFunction, Object obj) {
        return Uncheck.apply(iOFunction, obj);
    }

    /* renamed from: o */
    public static /* synthetic */ Object m31203o(IOFunction iOFunction, Function function, Object obj) {
        Object apply;
        apply = function.apply(obj);
        return iOFunction.apply(apply);
    }

    /* renamed from: p */
    public static /* synthetic */ Object m31202p(IOFunction iOFunction, IOFunction iOFunction2, Object obj) {
        return iOFunction.apply(iOFunction2.apply(obj));
    }

    /* renamed from: q */
    public static /* synthetic */ Object m31201q(IOFunction iOFunction, IOSupplier iOSupplier) {
        return iOFunction.apply(iOSupplier.get());
    }

    /* renamed from: r */
    public static /* synthetic */ Object m31200r(IOFunction iOFunction, Supplier supplier) {
        Object obj;
        obj = supplier.get();
        return iOFunction.apply(obj);
    }

    /* renamed from: s */
    public static IOFunction m31199s() {
        return AbstractC12237lx.f71861d;
    }
}