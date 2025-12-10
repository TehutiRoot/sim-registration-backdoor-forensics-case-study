package p000;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import org.apache.commons.p028io.function.IOBaseStream;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IORunnable;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: VY1 */
/* loaded from: classes6.dex */
public final class VY1 implements BaseStream {

    /* renamed from: a */
    public final IOBaseStream f6933a;

    public VY1(IOBaseStream iOBaseStream) {
        this.f6933a = iOBaseStream;
    }

    /* renamed from: b */
    public static /* synthetic */ void m65973b(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public void close() {
        this.f6933a.close();
    }

    @Override // java.util.stream.BaseStream
    public boolean isParallel() {
        return this.f6933a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public Iterator iterator() {
        return this.f6933a.iterator().asIterator();
    }

    @Override // java.util.stream.BaseStream
    public BaseStream onClose(final Runnable runnable) {
        final IOBaseStream iOBaseStream = this.f6933a;
        Objects.requireNonNull(iOBaseStream);
        return ((IOBaseStream) Uncheck.apply(new IOFunction() { // from class: TY1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return IOBaseStream.this.onClose((IORunnable) obj);
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
        }, new IORunnable() { // from class: UY1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC17479Da0.m68815a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                VY1.m65973b(runnable);
            }
        })).unwrap();
    }

    @Override // java.util.stream.BaseStream
    public BaseStream parallel() {
        return this.f6933a.parallel().unwrap();
    }

    @Override // java.util.stream.BaseStream
    public BaseStream sequential() {
        return this.f6933a.sequential().unwrap();
    }

    @Override // java.util.stream.BaseStream
    public Spliterator spliterator() {
        return this.f6933a.spliterator().unwrap();
    }

    @Override // java.util.stream.BaseStream
    public BaseStream unordered() {
        return this.f6933a.unordered().unwrap();
    }
}