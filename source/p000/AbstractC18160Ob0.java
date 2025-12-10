package p000;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.IOUnaryOperator;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: Ob0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC18160Ob0 {
    /* renamed from: a */
    public static UnaryOperator m67025a(final IOUnaryOperator iOUnaryOperator) {
        return new UnaryOperator() { // from class: Mb0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC18160Ob0.m67024b(iOUnaryOperator, obj);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ Object m67024b(IOUnaryOperator iOUnaryOperator, Object obj) {
        return Uncheck.apply(iOUnaryOperator, obj);
    }

    /* renamed from: c */
    public static IOUnaryOperator m67023c() {
        return new IOUnaryOperator() { // from class: Nb0
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return AbstractC18160Ob0.m67022d(obj);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC19197ba0.m51985e(this);
            }

            @Override // org.apache.commons.p028io.function.IOUnaryOperator
            public /* synthetic */ UnaryOperator asUnaryOperator() {
                return AbstractC18160Ob0.m67025a(this);
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
            public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
                return AbstractC19197ba0.m51983g(this, iOFunction);
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
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
                return AbstractC19197ba0.m51986d(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC19197ba0.m51981i(this, iOSupplier);
            }
        };
    }

    /* renamed from: d */
    public static /* synthetic */ Object m67022d(Object obj) {
        return obj;
    }
}
