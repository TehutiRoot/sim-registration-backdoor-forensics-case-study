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

/* renamed from: Ub0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC18587Ub0 {
    /* renamed from: a */
    public static UnaryOperator m66138a(final IOUnaryOperator iOUnaryOperator) {
        return new UnaryOperator() { // from class: Sb0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC18587Ub0.m66137b(IOUnaryOperator.this, obj);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ Object m66137b(IOUnaryOperator iOUnaryOperator, Object obj) {
        return Uncheck.apply(iOUnaryOperator, obj);
    }

    /* renamed from: c */
    public static IOUnaryOperator m66136c() {
        return new IOUnaryOperator() { // from class: Tb0
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return AbstractC18587Ub0.m66135d(obj);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC20283ha0.m31213e(this);
            }

            @Override // org.apache.commons.p028io.function.IOUnaryOperator
            public /* synthetic */ UnaryOperator asUnaryOperator() {
                return AbstractC18587Ub0.m66138a(this);
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
            public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
                return AbstractC20283ha0.m31211g(this, iOFunction);
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
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
                return AbstractC20283ha0.m31214d(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC20283ha0.m31209i(this, iOSupplier);
            }
        };
    }

    /* renamed from: d */
    public static /* synthetic */ Object m66135d(Object obj) {
        return obj;
    }
}